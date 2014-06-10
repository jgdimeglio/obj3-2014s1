package dominio

import java.util.ArrayList
import java.util.List

class Evento {
	
	@Property Hora hora
	@Property String mensaje
	@Property List<Recordatorio> recordatorios
	
	new(Hora hora, String mensaje){
		this.hora = hora
		this.mensaje = mensaje
		this.recordatorios = new ArrayList<Recordatorio>
	}
	
	def agregarRecordatorio(Recordatorio r){
		this.recordatorios.add(r)
	}
	
	def notificarTick(Hora hora, AgendaListener listener){
		if(!this.notificarEvento(hora,listener)){
			this.notificarRecordatorio(hora,listener)
		}
	}
	
	def notificarRecordatorio(Hora hora, AgendaListener listener){
		if(hora.hora.equals(this.hora.hora - 1) && (hora.minutos.equals(this.hora.minutos))){
			this.recordatorios.forEach[ r | r.notificar(listener)]
		}
	}
	
	def notificarEvento(Hora hora, AgendaListener listener){
		var ret = false
		if(hora.hora.equals(this.hora.hora) && (hora.minutos.equals(this.hora.minutos))){
			listener.sucedio(this)
			ret = true
		}
		ret
	}
}