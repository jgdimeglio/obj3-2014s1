package ExtensionMethods

import dominio.Agenda
import dominio.Evento
import dominio.Hora
import dominio.MockAgendaListener
import dominio.Recordatorio
import dominio.RecordatorioEMAIL
import dominio.RecordatorioLLAMADA
import dominio.RecordatorioSMS
import java.util.ArrayList
import org.eclipse.xtext.xbase.lib.Functions.Function1

class ExtensionMethods {
	
	//Sobrecarga de operadores
	def  operator_mappedTo(Hora a, String b) {
		new Evento(a,b)
	}
	
	def operator_doubleArrow(Evento evento, Function1 block) {
		block.apply(evento)
	}
	
	def operator_greaterThan(Evento a, Recordatorio b) {
		a.agregarRecordatorio(b)
		a
	}
	
	def ArrayList<Hora> operator_doubleGreaterThan(Hora a, Hora b) {
		var inicio = a
		var fin = b
		var ret = new ArrayList<Hora>
		while(inicio.hora != fin.hora){
			ret.add(inicio)
			inicio.aumentarUnaHora
		}
		ret
	}
	
	def Hora operator_divide(int a, int b) {
		new Hora(a,b)
	}
	
	//**************************************** EXTENSION METHODS *****************************************************
	
	def Agenda agenda(Evento... eventos) {
		val a = new Agenda
		eventos.forEach[ evento | a.agregarEvento(evento) ]
		a
	}
	
	def via(String s){
		s
	}
	
	def SMS(String s){
		new RecordatorioSMS(s)
	}
	
	def EMAIL(String s){
		new RecordatorioEMAIL(s)
	}
	
	def LLAMADA(String s){
		new RecordatorioLLAMADA(s)
	}
	
	def apply(){
		
	}
	
	def hs(int n){
		new Hora(n)
	}
	
	def hs(Hora n){
		n
	}
	
	def crearListener(){
		new MockAgendaListener
	}
}