package Clases

import scala.collection.mutable.ArrayBuffer

object Proronga {
	def main(args: Array[String]) {
		val lista : ArrayBuffer[Int] = ArrayBuffer(1,2,3,4,5)
		
		println(lista.exists{n => n == 1})
	}
}