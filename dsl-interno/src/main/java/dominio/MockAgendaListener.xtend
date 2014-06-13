package dominio

class MockAgendaListener implements AgendaListener{
	
	@Property Evento evento
	@Property String recordatorioSMS
	@Property String recordatorioEMAIL
	@Property String recordatorioLLAMADA
	@Property String targetOfEMAIL
	@Property String subjectOfEMAIL
	@Property String numeroSMS
	@Property String numeroLLAMADA
	
	override sucedio(Evento evento) {
		this.evento = evento
	}
	
	override notificarPorMail(String mensaje,String target, String subject) {
		this.recordatorioEMAIL = mensaje
		this.targetOfEMAIL = target
		this.subjectOfEMAIL = subject
	}
	
	override notificarPorSMS(String mensaje,String numero) {
		this.recordatorioSMS = mensaje
		this.numeroSMS = numero
	}
	
	override notificarPorLlamada(String mensaje, String numero) {
		this.recordatorioLLAMADA = mensaje
		this.numeroLLAMADA = numero
	}
	
}