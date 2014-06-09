package dominio

interface AgendaListener {
		
	def void sucedio(Evento evento)
	
	def void notificarPorMail(String mensaje)
	
	def void notificarPorSMS(String mensaje)
	
	def void notificarPorLlamada(String mensaje)

}