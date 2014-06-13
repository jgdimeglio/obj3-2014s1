package dominio

interface AgendaListener {
		
	def void sucedio(Evento evento)
	
	def void notificarPorMail(String mensaje, String target, String subject)
	
	def void notificarPorSMS(String mensaje, String numero)
	
	def void notificarPorLlamada(String mensaje, String numero)

}