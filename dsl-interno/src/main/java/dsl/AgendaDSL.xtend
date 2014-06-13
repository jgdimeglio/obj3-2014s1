package dsl

import ExtensionMethods.ExtensionMethods

class AgendaDSL {
	
	extension ExtensionMethods = new ExtensionMethods
	
	def static void main(String[] args) {
		new AgendaDSL().run
	}
	
	def run(){
		val agenda = agenda(
			14.hs -> "Inicia objectos 3",
			
			(18/25).hs -> "Termina objectos 3" => [
			  		remainMe > "Escribir bitacora".via.EMAIL => [
			  			target = "skalic.julian@gmail.com"
			  			subject = "Tarea"
			  		]
					remainMe > "Escribir ejemplos de la clase".via.EMAIL
			]
		)
		
		val listener = crearListener()
		(13.hs>>20.hs).forEach[hora | agenda.tick(hora,listener)]
	}
}