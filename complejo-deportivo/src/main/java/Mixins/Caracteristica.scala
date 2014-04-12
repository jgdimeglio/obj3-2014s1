package Mixins

import Clases.Cancha
import org.joda.time.DateTime

abstract class Caracteristica extends Cancha{

  override 
	def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) = (this.extraPorCaracteristica(pb) + 
	                                                                        super.calcularExtra(dia, inicio, fin, pb))

	
	def extraPorCaracteristica(pb : Double):Double
}