package Clases

import org.joda.time.DateTime

import scala.collection.mutable.ArrayBuffer

import Excepciones.NoTieneIluminacion
import Excepciones.YaEstaReservada

abstract class Cancha() {
	val reservas = new ArrayBuffer[Reserva]


	def reservar(dia : DateTime , inicio : Int , fin : Int){
	  this.chequearSiPuedeReservar(dia, inicio, fin)
	  this.reservas+= new Reserva(this,dia,inicio,fin)
	  println(this.precioFinal(dia, inicio, fin))
	}

	private def chequearSiPuedeReservar(dia : DateTime, inicio : Int, fin : Int) ={
	  if(hayReserva(dia,inicio,fin)){
	    new YaEstaReservada()
	  }
	  if(this.esDeNoche(inicio) & ! this.tieneIluminacion){
	      new NoTieneIluminacion
	  }
	}

	private def hayReserva(dia : DateTime, inicio : Int, fin : Int): Boolean = {
		reservas.exists{r => r.dia.equals(dia) & r.inicio == inicio & r.fin == fin }
	}

	def tieneIluminacion() = false

	private def esDeNoche(horaInicio : Int) = (horaInicio >= 18)

	def precioBase() : Double 


	def precioFinal(dia : DateTime, inicio : Int, fin : Int) : Double ={
	  this.precioBase() + this.calcularExtra(dia, inicio, fin, this.precioBase)
	}

	def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = 0
}