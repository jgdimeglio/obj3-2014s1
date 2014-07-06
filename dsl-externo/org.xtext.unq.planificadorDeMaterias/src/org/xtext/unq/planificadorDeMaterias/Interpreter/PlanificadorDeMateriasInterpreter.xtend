package org.xtext.unq.planificadorDeMaterias.Interpreter

import ExtensionMethods.ExtensionMethodsInterpreter
import java.util.HashMap
import java.util.Map
import java.util.Map.Entry
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.unq.planificador.PdmStandaloneSetup
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model

class PlanificadorDeMateriasInterpreter {
	
	extension ExtensionMethodsInterpreter = new ExtensionMethodsInterpreter
	
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
		var aulaConOcurrencias = this.getMax(generarMapDeOcurrenciasDeAulas(m)).entrySet
		System.out.println('''Aula mas utilizada: «aulaConOcurrencias.get(0).key», con «aulaConOcurrencias.get(0).value» ocurrencias''')
	}
	

	
	def horariosLibres(Model m){
		m.planificacion.forEach[planificacion |
			
		]
	}
	
	def porcentajeDeAsignacionesPorTurno(Model m){
		
	}
	
	def profesoresYMaterias(Model m){
		
	}
	
	def private getMax(Map<String,Integer> aulas){
		val aulasSet = aulas.entrySet
		var String aulaIndex = ""
		var int max = 0
		if(aulasSet.size > 1){
			max = aulasSet.get(0).value
			aulaIndex = aulasSet.get(0).key
			for(Entry<String,Integer> entry : aulasSet){
				if(entry.value > max){
					max = entry.value
					aulaIndex = entry.key
				}
			}
		}else{
			if(aulasSet.size == 1){
				aulaIndex = aulasSet.get(0).key
				max = aulasSet.get(0).value
			}
		}
		var ret = new HashMap<String,Integer>()
		ret.put(aulaIndex,max)
		return ret
		//val l = aulas.entrySet.fold(null) [Entry<Aula,Integer> x,y | if(x.value > y.value) return x else return y]
		//return l.key
	}
	
	def private generarMapDeOcurrenciasDeAulas(Model  m){
		val aulas = new HashMap<String,Integer>()
		m.planificacion.forEach[ planificacion |
			planificacion.asignaciones.forEach[ asignacion |
				asignacion.aulaHorarios.forEach[aulaHorario |
					if(! aulas.containsKey(aulaHorario.aula.name)){
						aulas.put(aulaHorario.aula.name,1)
					}
					else{
						aulas.put(aulaHorario.aula.name,(aulas.get(aulaHorario.aula.name) + 1))
					}
			
				]
			]
		]
		return aulas
	}

}