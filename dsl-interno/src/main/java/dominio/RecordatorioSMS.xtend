package dominio

class RecordatorioSMS extends Recordatorio{
	
	@Property String numero
	
	new(String mensaje) {
		super(mensaje)
		numero = null
	}
	
	override def notificar(AgendaListener listener){
		System.out.println('''Mensaje enviado: «this.mensaje»''')
		listener.notificarPorSMS(this.mensaje, numero)
	}
}