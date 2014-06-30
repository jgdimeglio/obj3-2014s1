package org.xtext.unq.planificadorDeMaterias.Interpreter

import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.unq.planificador.PdmStandaloneSetup
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso

class PlanificadorDeMateriasInterpreter {
	
	/*
	 * Extension methods ElementosPrimarios
	 */
	def materias(List<ElementosPrimarios> elementos){
		elementos.filter(Materia)
	}
	
	def asignaciones(List<ElementosPrimarios> elementos){
		elementos.filter(Asignacion)
	}
	
	def profesores(List<ElementosPrimarios> elementos){
		elementos.filter(Profesor)
	}
	
	/*
	 * Extension methods ElementosSecundarios
	 */
	
	def aulas(List<ElementosSecundarios> elementos){
		elementos.filter(Aula)
	}
	
	def recursos(List<ElementosSecundarios>elementos){
		elementos.filter(Recurso)
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
		val aulas = new HashMap<Aula,Integer>()
		m.elementosSecundarios.aulas.forEach[ e |
			if(! aulas.containsKey(e)){
				aulas.put(e,1)
			}
			else{
				aulas.put(e,(aulas.get(e) + 1))
			}
		]
		val max = aulas
		val aula = null
		// get max
	}
	
	def getMax(Map<Aula,Integer> aulas){
		var aulasSet = aulas.entrySet
		var Integer repeticiones
		var tupla = aulasSet.get(0)
		for(Entry<> e : aulasSet){
			
		}
			if(tupla.value < t.value)
		]
	}
	
	def horariosLibres(Model m){
		
	}
	
	def porcentajeDeAsignacionesPorTurno(Model m){
		
	}
	
	def profesoresYMaterias(Model m){
		
	}
   
}