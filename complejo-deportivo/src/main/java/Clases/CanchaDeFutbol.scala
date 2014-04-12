package Clases

import org.joda.time.DateTime

class CanchaDeFutbol(jugadores : Int) extends Cancha {
	val numeroDeJugadores = jugadores
	
	override def precioBase() : Double = (40.0 * numeroDeJugadores)
	
	
}