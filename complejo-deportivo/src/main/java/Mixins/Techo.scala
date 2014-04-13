package Mixins

import Clases.Cancha
import Clases.CentroMetereologico
import org.joda.time.DateTime

trait Techo extends Cancha {

  def extraPorTecho(pb: Double): Double = {
    if (CentroMetereologico.ahoraLlueve) {
      return (0.1 * pb)
    }
    0
  }
  
  override 
  def calcularExtra(dia : DateTime, inicio : Int, fin : Int, pb : Double) : Double = {
		  (this.extraPorTecho(pb) + super.calcularExtra(dia, inicio, fin, pb))
  }
}
