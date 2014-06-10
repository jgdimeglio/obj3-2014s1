package dsl

import ExtensionMethods.ExtensionMethods
import dominio.Agenda
import dominio.MockAgendaListener

class AgendaDSL {
	
	extension ExtensionMethods = new ExtensionMethods
	
	def static void main(String[] args) {
		new AgendaDSL().run
	}
	
	def run(){
		val agenda = agenda(
			14.hs -> "Inicia objectos 3",
			
			18.hs -> "Termina objectos 3" => [
				remainMe | remainMe > "Escribir bitacora".via.SMS
						   remainMe > "Escribir ejemplos de la clase".via.EMAIL
			]
		)
		
		val listener = crearListener()
		(13.hs>>20.hs).forEach[hora | agenda.tick(hora,listener)]
	}
}