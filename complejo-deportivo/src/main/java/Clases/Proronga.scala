package Clases

import scala.collection.mutable.ArrayBuffer
import org.joda.time.DateTime
import Mixins.Iluminacion
import Mixins.Techo

object Proronga {
	def main(args: Array[String]) {
	  
		val c=new CanchaDePaddle with Iluminacion with Techo
        val d=new DateTime()
        println(c.precioFinal(d, 1, 3))
	}
}