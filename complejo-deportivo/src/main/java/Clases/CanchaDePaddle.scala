package Clases

import org.joda.time.DateTime

class CanchaDePaddle extends Cancha {
	
	override def precioBase() : Double = 100.0
	
	
	override def precioFinal(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = {
	  (this.precioBase() + super.calcularExtra(dia, inicio, fin, pb))
	}
  
}