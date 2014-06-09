package dominio

import java.util.ArrayList

class Agenda {
	
	@Property ArrayList<Evento> eventos
	
	new(){
		this.eventos = new ArrayList<Evento>
	}
	
	def agregarEvento(Evento evento){
		this.eventos.add(evento)
	}
	
	def tick(int hora, AgendaListener listener){
		eventos.forEach[e | e.notificarTick(hora,listener)]
	}
}