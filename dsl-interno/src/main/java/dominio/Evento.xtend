package dominio

import java.util.ArrayList
import java.util.List

class Evento {
	
	@Property int hora
	@Property String mensaje
	@Property List<Recordatorio> recordatorios
	
	new(int hora, String mensaje){
		this.hora = hora
		this.mensaje = mensaje
		this.recordatorios = new ArrayList<Recordatorio>
	}
	
	def agregarRecordatorio(Recordatorio r){
		this.recordatorios.add(r)
	}
	
	def notificarTick(int hora, AgendaListener listener){
		if(!this.notificarEvento(hora,listener)){
			this.notificarRecordatorio(hora,listener)
		}
	}
	
	def notificarRecordatorio(int hora, AgendaListener listener){
		if(hora.equals(this.hora - 1)){
			this.recordatorios.forEach[ r | r.notificar(mensaje, listener)]
		}
	}
	
	def notificarEvento(int hora, AgendaListener listener){
		var ret = false
		if(hora.equals(this.hora)){
			listener.sucedio(this)
			ret = true
		}
		ret
	}
}