package dominio

abstract class Recordatorio {
	
	abstract def void notificar(String mensaje, AgendaListener listener)
}