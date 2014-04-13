package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Iluminacion extends Cancha{

   def extraPorIluminacion(pb: Double) = (0.2 * pb)
   
   override def tieneIluminacion() = true
   
  override 
  def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = {
		  (this.extraPorIluminacion(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }
}
