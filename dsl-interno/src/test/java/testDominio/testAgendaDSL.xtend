package testDominio

import ExtensionMethods.ExtensionMethods
import dominio.Agenda
import dominio.MockAgendaListener
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*

class testAgendaDSL {
	
	extension ExtensionMethods = new ExtensionMethods
	
	@Property Agenda agenda
	@Property MockAgendaListener listener
	
	@Before
	def void setUp(){
		this.agenda = agenda(
			14.hs -> "Inicio obj3",
			
			18.hs -> "Fin obj3" => [
						remainMe > "Hacer la tarea".via.EMAIL => [
							target = "skalic.julian@gmail.com"
							subject = "Tarea"
						]
					    remainMe > "Hacer los ejercicios".via.LLAMADA => [
					    	numero = "20567748"
					    ]
				        remainMe > "Pasar todo a los compañeros".via.SMS
			]
		)
		
		listener = crearListener()
	}
	
	@Test
	def void testNotificarEvento(){
		agenda.tick(14.hs,listener)
		assertEquals("Inicio obj3", listener.evento.mensaje)
	}
	
	@Test
	def void testNotificarRecordatorioEMAIL(){
		agenda.tick(17.hs,listener)
		assertEquals("Hacer la tarea", listener.recordatorioEMAIL)
		assertEquals("skalic.julian@gmail.com", listener.targetOfEMAIL)
		assertEquals("Tarea", listener.subjectOfEMAIL)
	}
	
	@Test
	def void testNotificarRecordatorioLLAMADA(){
		agenda.tick(17.hs,listener)
		assertEquals("Hacer los ejercicios", listener.recordatorioLLAMADA)
		assertEquals("20567748", listener.numeroLLAMADA)
	}
	
	@Test
	def void testNotificarRecordatorioSMS(){
		agenda.tick(17.hs,listener)
		assertEquals("Pasar todo a los compañeros", listener.recordatorioSMS)
	}
	
}