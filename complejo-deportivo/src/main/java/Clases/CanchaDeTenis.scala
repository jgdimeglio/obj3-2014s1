package Clases

import org.joda.time.DateTime

class CanchaDeTenis extends Cancha {
  
	override def precioBase = 150.0
	
	override def precioFinal(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = {
	  (this.precioBase() + super.calcularExtra(dia, inicio, fin, pb))
	}
}