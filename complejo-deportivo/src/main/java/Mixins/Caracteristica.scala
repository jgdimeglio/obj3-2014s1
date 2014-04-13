package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Caracteristica extends Cancha{

  override 
  def calcularExtra(dia : DateTime, inicio : Double, fin : Double, pb : Double) : Double = {
		  (this.extraPorCaracteristica(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }

	
  def extraPorCaracteristica(pb : Double):Double

}
