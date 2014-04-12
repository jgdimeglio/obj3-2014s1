package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Gradas extends Cancha {
	
	override 
	def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) = (this.extraPorGradas(pb) + 
	                                                                        super.calcularExtra(dia, inicio, fin, pb))

	
	private def extraPorGradas(pb : Double) = pb
}