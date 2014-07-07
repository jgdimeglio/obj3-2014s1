package org.xtext.unq.planificadorDeMaterias.Interpreter

import ExtensionMethods.ExtensionMethodsInterpreter
import java.util.HashMap
import java.util.Map
import java.util.Map.Entry
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.unq.planificador.PdmStandaloneSetup
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario
import java.util.List
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
import java.util.ArrayList

class PlanificadorDeMateriasInterpreter {
	
	extension ExtensionMethodsInterpreter = new ExtensionMethodsInterpreter
	
	def static void main(String[] args) {
		
		if(args.isEmpty) throw new RuntimeException("La ruta no es valida")
		val fileName = args.get(0)
		val model = parse(fileName)
		new PlanificadorDeMateriasInterpreter().interpret(model)
	}
	
	/*
	 * Metodos del Interprete
	 */
	 
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
	
	/*
	 * Metodos de comportamiento del Interprete
	 */
	 
	// Busca el aula mas utilizada
	def aulaMasUtilizada(Model m){
		var aulaConOcurrencias = this.getMax(generarMapDeOcurrenciasDeAulas(m)).entrySet
		println('''Aula mas utilizada: «aulaConOcurrencias.get(0).key», con «aulaConOcurrencias.get(0).value» ocurrencias''')
		println()
	}
	
	// Genera una lista con los horarios libres
	def horariosLibres(Model m){
		
		
	}
	
	// Genera una tabla de Turno -> Porcentaje de materias que se dictan
	def porcentajeDeAsignacionesPorTurno(Model m){
		m.planificacion.forEach[p |
		println('''Porcentajes de turnos sobre la planificacion del «p.semestre.anho» semestre «p.semestre.numero»:''') 
		val mañana = porcentajeDeMateriasEn(p,8,13)
		val tarde = porcentajeDeMateriasEn(p,13,18)
		val noche = porcentajeDeMateriasEn(p,18,22)
		println('''Turno Mañana: «mañana» %''')
		println('''Turno Tarde : «tarde» %''')
		println('''Turno Noche : «noche» %''')
		println()
		]
	}
	
	// Genera una tabla de Profesores -> Materias que dicta
	def profesoresYMaterias(Model m){
		m.planificacion.forEach[p |
			mostrarTablaDeProfesoresYMaterias(p)
		]
	}
	
	/*
	 * Metodos Privados
	 */
	 
	def private materiasQueDicta(Profesor profesor, List<Asignacion> asignaciones){
		val materias = new ArrayList<String>
		
		asignacionesDelProfesor(profesor,asignaciones).forEach[a | 
			materias.add(a.materia.name)
		]
		
		return materias
	}
	
	def mostrarTablaDeProfesoresYMaterias(Planificacion planificacion){
		planificacion.profesores.forEach[p |
			println('''El Profesor: «p.name», dicta: «materiasQueDicta(p,planificacion.asignaciones)»''')
		]
	}
	
	def private boolean laDicta(Asignacion asignacion,Profesor profesor){	
		return asignacion.profesores.contains(profesor)
	}
	
	def private asignacionesDelProfesor(Profesor profesor, List<Asignacion> asignaciones){
		return asignaciones.filter[a | laDicta(a,profesor) ]
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

	def private int cantidadDeMateriasAsignadasEn(Planificacion p, int inicio, int fin){
		val materiasAsignadas = p.asignaciones.filter[a | hayAlMenosUnaMateriaAsignadaEn(a.aulaHorarios,inicio,fin) ]
		return materiasAsignadas.size
	}
	
	def private boolean hayAlMenosUnaMateriaAsignadaEn(List<AulaHorario> ah, int inicio, int fin){
		val x = ah.filter[x | (x.horario.desde >= inicio) && (x.horario.hasta <= fin)]
		return x.size > 0
	}
	
	def private int cantidadDeHorariosPorAsignaciones(Planificacion p){
		var todosLosHorarios = new ArrayList<AulaHorario>
		for(Asignacion a : p.asignaciones){
			todosLosHorarios.addAll(a.aulaHorarios)
		}
		return todosLosHorarios.size
	}
	
	def private int porcentajeDeMateriasEn(Planificacion p,int inicio,int fin){
		return (cantidadDeMateriasAsignadasEn(p,inicio,fin) * 100) / cantidadDeHorariosPorAsignaciones(p)
	}
}