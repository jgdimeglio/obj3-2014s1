package dominio

class RecordatorioEMAIL extends Recordatorio{
	
	new(String mensaje) {
		super(mensaje)
	}
	
	override def notificar(AgendaListener listener){
		System.out.println('''Mensaje enviado: «this.mensaje»''')
		listener.notificarPorMail(this.mensaje)
	}
}