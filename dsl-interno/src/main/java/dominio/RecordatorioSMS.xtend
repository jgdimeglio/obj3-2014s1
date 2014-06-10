package dominio

class RecordatorioSMS extends Recordatorio{
	
	
	new(String mensaje) {
		super(mensaje)
	}
	
	override def notificar(AgendaListener listener){
		System.out.println('''Mensaje enviado: «this.mensaje»''')
		listener.notificarPorSMS(this.mensaje)
	}
}