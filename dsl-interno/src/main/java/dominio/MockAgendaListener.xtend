package dominio

class MockAgendaListener implements AgendaListener{
	
	@Property Evento evento
	@Property String recordatorioSMS
	@Property String recordatorioEMAIL
	@Property String recordatorioLLAMADA
	
	override sucedio(Evento evento) {
		this.evento = evento
	}
	
	override notificarPorMail(String mensaje) {
		this.recordatorioEMAIL = mensaje
	}
	
	override notificarPorSMS(String mensaje) {
		this.recordatorioSMS = mensaje
	}
	
	override notificarPorLlamada(String mensaje) {
		this.recordatorioLLAMADA = mensaje
	}
	
}