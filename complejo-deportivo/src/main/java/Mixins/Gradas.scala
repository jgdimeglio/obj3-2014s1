package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Gradas extends Cancha {
	
  def extraPorGradas(pb: Double) = pb
   
  override def tieneGradas = true
  
  override def calcularExtra(dia : DateTime, inicio : Double, fin : Double, pb : Double) : Double = {
		  (this.extraPorGradas(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }
}
