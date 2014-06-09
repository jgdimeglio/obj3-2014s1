package dominio

class RecordatorioSMS extends Recordatorio{
	
	
	override def notificar(String mensaje, AgendaListener listener){
		//enviar sms
		listener.notificarPorSMS(mensaje)
	}
}