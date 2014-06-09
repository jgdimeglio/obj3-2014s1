package dominio

import java.util.ArrayList
import java.util.Calendar
import java.util.List

class Evento {
	
	@Property Calendar fecha
	@Property String mensaje
	@Property List<Recordatorio> recordatorios
	
	new(Calendar fecha, String mensaje){
		this.fecha = fecha
		this.mensaje = mensaje
		this.recordatorios = new ArrayList<Recordatorio>
	}
	
	def agregarRecordatorio(Recordatorio r){
		this.recordatorios.add(r)
	}
	
	def notificarTick(Calendar fecha, AgendaListener listener){
		if(!this.notificarEvento(fecha,listener)){
			this.notificarRecordatorio(fecha,listener)
		}
	}
	
	def notificarRecordatorio(Calendar fecha, AgendaListener listener){
		if(fecha.get(Calendar.HOUR).equals(this.fecha.get(Calendar.HOUR) - 1)){
			this.recordatorios.forEach[ r | r.notificar(mensaje, listener)]
		}
	}
	
	def notificarEvento(Calendar fecha, AgendaListener listener){
		var ret = false
		if(fecha.get(Calendar.HOUR).equals(this.fecha.get(Calendar.HOUR))){
			listener.sucedio(this)
			ret = true
		}
		ret
	}
}