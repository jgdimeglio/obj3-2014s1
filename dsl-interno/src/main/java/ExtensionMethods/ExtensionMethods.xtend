package ExtensionMethods

import dominio.Agenda
import dominio.Evento
import dominio.MockAgendaListener
import dominio.Recordatorio
import dominio.RecordatorioEMAIL
import dominio.RecordatorioLLAMADA
import dominio.RecordatorioSMS
import java.util.ArrayList
import org.eclipse.xtext.xbase.lib.Functions.Function1

class ExtensionMethods {
	
	def Agenda agenda(Evento... eventos) {
		//val l = new ArrayList<Evento>
		val a = new Agenda
		eventos.forEach[ evento | a.agregarEvento(evento) ]
		a
	}
	
	//Sobrecarga de operadores
	def  operator_mappedTo(int a, String b) {
		new Evento(a,b)
	}
	
	def operator_doubleArrow(Evento evento, Function1 block) {
		block.apply(evento)
	}
	
	def operator_greaterThan(Evento a, Recordatorio b) {
		a.agregarRecordatorio(b)
		a
	}
	
	def ArrayList<Integer> operator_doubleGreaterThan(int a, int b) {
		var inicio = a
		var fin = b
		var ret = new ArrayList<Integer>
		while(inicio != fin){
			ret.add(inicio)
			inicio = inicio + 1
		}
		ret
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
		new Integer(n)
	}
	
	def crearListener(){
		new MockAgendaListener
	}
}