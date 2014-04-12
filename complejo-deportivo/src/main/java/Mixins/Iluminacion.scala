package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Iluminacion extends Caracteristica {

   def extraPorCaracteristica(pb: Double) = (0.2 * pb)
   
   override def tieneIluminacion() = true
}