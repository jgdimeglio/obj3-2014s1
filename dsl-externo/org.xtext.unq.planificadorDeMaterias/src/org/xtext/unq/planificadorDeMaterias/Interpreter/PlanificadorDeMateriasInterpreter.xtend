package org.xtext.unq.planificadorDeMaterias.Interpreter

import java.util.HashMap
import java.util.Map
import java.util.Map.Entry
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.unq.planificador.PdmStandaloneSetup
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso

class PlanificadorDeMateriasInterpreter {
	
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
	
	/*
	 * Extension methods ElementosSecundarios
	 */
	
	def aulas(Model m){
		m.elementosSecundarios.filter(Aula)
	}
	
	def recursos(Model m){
		m.elementosSecundarios.filter(Recurso)
	}
	
	def static void main(String[] args) {
		
		if(args.isEmpty) throw new RuntimeException("La ruta no es valida")
		val fileName = args.get(0)
		val model = parse(fileName)
		new PlanificadorDeMateriasInterpreter().interpret(model)
	}
	
	def static parse(String fileName){
		val injector = new PdmStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(XtextResourceSet)
		val resource = resourceSet.createResource(URI.createURI(fileName))
		resource.load(#{})
		return resource.contents.get(0) as Model
	}
	
	def interpret(Model m){
		this.aulaMasUtilizada(m)
		this.horariosLibres(m)
		this.porcentajeDeAsignacionesPorTurno(m)
		this.profesoresYMaterias(m)
	}
	
	def aulaMasUtilizada(Model m){
		return this.getMax(generarMapDeOcurrenciasDeAulas(m))
	}
	

	
	def horariosLibres(Model m){
		
	}
	
	def porcentajeDeAsignacionesPorTurno(Model m){
		
	}
	
	def profesoresYMaterias(Model m){
		
	}
	
	def private getMax(Map<Aula,Integer> aulas){
		val l = aulas.entrySet.fold(null) [Entry<Aula,Integer> x,y | if(x.value > y.value) return x else return y]
		return l.key
	}
	
	def private generarMapDeOcurrenciasDeAulas(Model  m){
		val aulas = new HashMap<Aula,Integer>()
		m.aulas.forEach[ e |
			if(! aulas.containsKey(e)){
				aulas.put(e,1)
			}
			else{
				aulas.put(e,(aulas.get(e) + 1))
			}
		]
		return aulas
	}

}