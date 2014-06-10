package dominio

abstract class Recordatorio {
	
	@Property String mensaje
	
	new(String mensaje){
		this.mensaje = mensaje
	}
	
	abstract def void notificar(AgendaListener listener)
}