package dominio

class RecordatorioLLAMADA extends Recordatorio{
	
	@Property String numero
	
	new(String mensaje) {
		super(mensaje)
		numero = null
	}
	
	override def notificar(AgendaListener listener){
		System.out.println('''Mensaje enviado: «this.mensaje»''')
		listener.notificarPorLlamada(this.mensaje,numero)
	}
}