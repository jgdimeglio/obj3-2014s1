package Mixins

import Clases.Cancha
import Clases.CentroMetereologico
import org.joda.time.DateTime

trait Techo extends Caracteristica {

  def extraPorCaracteristica(pb: Double): Double = {
    if (CentroMetereologico.ahoraLlueve) {
      return (0.1 * pb)
    }
    0
  }
}