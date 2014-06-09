package testDominio

import dominio.Agenda
import dominio.Evento
import dominio.MockAgendaListener
import dominio.Recordatorio
import dominio.RecordatorioSMS
import java.util.Calendar
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class testAgenda {
	
	var Agenda agenda 
	var Evento evento 
	var Calendar fecha
	var Recordatorio recordatorio
	var MockAgendaListener mock
	var String mensaje
	
	@Before
	def void setUp(){
		
		this.mensaje="Inicia OBJ3"
		this.agenda = new Agenda
		this.fecha = Calendar.getInstance
		this.evento = new Evento(this.fecha, this.mensaje)
		this.recordatorio = new RecordatorioSMS
		this.evento.agregarRecordatorio(this.recordatorio)
		this.agenda.agregarEvento(this.evento)
		this.mock = new MockAgendaListener
	}
	
	@Test
	def void testNotificarEvento(){
		this.agenda.tick(this.fecha, this.mock)
		assertEquals(this.evento, this.mock.evento)
	}
	
	@Test
	def void testNotificarRecordatorioSMS(){
		//Nueva fecha con una hora antes
		var nuevaFecha = Calendar.instance
		nuevaFecha.setTimeInMillis(this.fecha.timeInMillis)
		nuevaFecha.add(Calendar.HOUR,-1)
		
		this.agenda.tick(nuevaFecha, this.mock)
		assertEquals(this.mensaje, this.mock.recordatorioSMS)
	}
}