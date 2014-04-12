package Clases

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object CentroMetereologico {
	val estaLloviendo = new Random
	def ahoraLlueve() = estaLloviendo.nextBoolean
}