package Mixins

import Clases.Cancha
import org.joda.time.DateTime

trait Gradas extends Caracteristica {
	
   override def extraPorCaracteristica(pb: Double) = pb
}
