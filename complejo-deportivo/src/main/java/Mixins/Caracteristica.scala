package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Caracteristica extends Cancha{

  override 
  def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = {
		  (this.extraPorCaracteristica(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }

	
  def extraPorCaracteristica(pb : Double):Double

}
