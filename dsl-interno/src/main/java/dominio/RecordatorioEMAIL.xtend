package dominio

class RecordatorioEMAIL extends Recordatorio{
	
	@Property String target
	@Property String subject
	
	new(String mensaje) {
		super(mensaje)
		target = null
		subject = null
	}
	
	override def notificar(AgendaListener listener){
		System.out.println('''Mensaje enviado: «this.mensaje»''')
		listener.notificarPorMail(this.mensaje, target, subject)
	}
}