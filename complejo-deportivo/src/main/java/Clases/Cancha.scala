package Clases

import scala.collection.mutable.ArrayBuffer
import Excepciones.YaEstaReservada
import org.joda.time.DateTime
import Excepciones.NoTieneIluminacion

class Cancha() {
	val reservas = new ArrayBuffer[Reserva]
	
	
	def reservar(dia : DateTime , inicio : Int , fin : Int){
	  if(this.sePuedeReservar(dia, inicio, fin)){
	    this.reservas+= new Reserva(this,dia,inicio,fin)
	  }
	  println(this.precioFinal(dia, inicio, fin, this.precioBase))
	}
	
	private def sePuedeReservar(dia : DateTime, inicio : Int, fin : Int) : Boolean ={
	  if(hayReserva(dia,inicio,fin)){
	    new YaEstaReservada()
	  }
	  if(this.esDeNoche(inicio) & ! this.tieneIluminacion){
	      new NoTieneIluminacion
	  }
	  true
	}
	
	private def hayReserva(dia : DateTime, inicio : Int, fin : Int): Boolean = {
		reservas.exists{r => r.dia.equals(dia) & r.inicio == inicio & r.fin == fin }
	}
	
	private def tieneIluminacion() = false
	
	private def esDeNoche(horaInicio : Int) = (horaInicio >= 18)
	
	def precioBase() : Double = 0.0
	
	
	def precioFinal(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = 0
	
	def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = 0
}