package dominio

class Hora {
	
	@Property int hora
	@Property int minutos
	
	new(int hora){
		this.hora = hora
	}
	
	new(int hora, int minutos){
		this.hora = hora
		this.minutos = minutos
	}
	
	def aumentarUnaHora() {
		this.hora = this.hora + 1
	}
	
}