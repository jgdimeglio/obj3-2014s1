package dominio

import java.util.ArrayList
import java.util.Calendar

class Agenda {
	
	@Property ArrayList<Evento> eventos
	
	new(){
		this.eventos = new ArrayList<Evento>
	}
	
	def agregarEvento(Evento evento){
		this.eventos.add(evento)
	}
	
	def tick(Calendar fecha, AgendaListener listener){
		eventos.forEach[e | e.notificarTick(fecha,listener)]
	}
}