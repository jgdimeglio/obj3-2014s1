package ExtensionMethods

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion
import java.util.HashSet

class ExtensionMethodsInterpreter {
	/*
	 * Extension methods ElementosPrimarios
	 */
	def materias(Model m){
		m.elementosPrimarios.filter(Materia)
	}
	
	def asignaciones(Model m){
		m.elementosPrimarios.filter(Asignacion)
	}
	
	def profesores(Model m){
		m.elementosPrimarios.filter(Profesor)
	}
	
	def profesores(Planificacion p){
		val profesores = new HashSet<Profesor>
		p.asignaciones.forEach[a |
			profesores.addAll(a.profesores)
		]
		return profesores.toList
	}
	
	def planificaciones(Model m){
		m.planificacion
	}
	
	/*
	 * Extension methods ElementosSecundarios
	 */
	
	def aulas(Model m){
		m.elementosSecundarios.filter(Aula)
	}
	
	def recursos(Model m){
		m.elementosSecundarios.filter(Recurso)
	}
}