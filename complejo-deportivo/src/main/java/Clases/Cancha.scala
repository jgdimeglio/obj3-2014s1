package Clases

import org.joda.time.DateTime

import scala.collection.mutable.ArrayBuffer

import Excepciones.NoTieneIluminacion
import Excepciones.YaEstaReservada

abstract class Cancha() {
	val reservas = new ArrayBuffer[Reserva]


	/*
	 * Operaciones de Negocio
	 */
	def reservar(dia : DateTime , inicio : Int , fin : Int){
	  this.chequearSiPuedeReservar(dia, inicio, fin)
	  this.reservas+= new Reserva(this,dia,inicio,fin)
	  println(this.precioFinal(dia, inicio, fin))
	}
	
	/*
	 * Operaciones Internas 
	 */
	private def chequearSiPuedeReservar(dia : DateTime, inicio : Int, fin : Int){
	  if(this.hayReserva(dia,inicio,fin)){
	      throw new YaEstaReservada()
	  }
	  if(this.esDeNoche(inicio) & ! this.tieneIluminacion){
	      throw new NoTieneIluminacion
	  }
	}

	private def hayReserva(dia : DateTime, inicio : Int, fin : Int) : Boolean ={
		val existeReserva = reservas.exists{ r => this.sonElMismoDia(r.dia, dia) & this.seSuperponenHorarios(r.inicio, r.fin, inicio, fin) }
		return(existeReserva)
    }
	
	private def seSuperponenHorarios(inicio1 : Int, fin1 : Int, inicio2 : Int, fin2 : Int) : Boolean = {
	  val seSuperpone = ((inicio1 <= inicio2 & inicio2 >= fin1) | (inicio1 <= fin2 & fin2 >= fin1))
	  return(seSuperpone)
	}
	
	private def esDeNoche(horaInicio : Int) = (horaInicio >= 18)
	
	private def tienenElMismoAño(d1 : DateTime, d2 : DateTime) : Boolean = d1.year().equals(d2.year())
	
	private def tienenElMismoMes(d1 : DateTime, d2 : DateTime) : Boolean = d1.monthOfYear().equals(d2.monthOfYear())
	
	private def tienenElMismoDia(d1 : DateTime, d2 : DateTime) : Boolean = d1.dayOfMonth().equals(d2.dayOfMonth())
	
	private def sonElMismoDia(d1 : DateTime , d2 : DateTime) : Boolean ={
	  (this.tienenElMismoAño(d1, d2) & this.tienenElMismoMes(d1, d2) & this.tienenElMismoDia(d1, d2))
	}
	
	/*
	 * Operaciones de Dominio
	 */
  
	def tieneIluminacion() = false


	def precioBase() : Double 


	def precioFinal(dia : DateTime, inicio : Int, fin : Int) : Double ={
	  this.precioBase() + this.calcularExtra(dia, inicio, fin, this.precioBase)
	}

	def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = 0
}
