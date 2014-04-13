package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Gradas extends Cancha {
	
  def extraPorGradas(pb: Double) = pb
   
  override 
  def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = {
		  (this.extraPorGradas(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }
}
