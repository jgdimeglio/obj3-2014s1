package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Iluminacion extends Cancha {

	override 
	def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) = (this.extraPorIluminacion(pb) 
																		    + super.calcularExtra(dia, inicio, fin, pb))
	
	
	
	private def extraPorIluminacion(pb : Double) = (0.2 * pb)
}