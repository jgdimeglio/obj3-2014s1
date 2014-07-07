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
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario
import ExtensionMethods.HorarioPlanificacion

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
	
	//*************************************************************************************************
	/*
	 * Metodos de comportamiento del Interprete
	 */
	 
	// Busca el aula mas utilizada
	def aulaMasUtilizada(Model m){
		var aulaConOcurrencias = this.getMax(generarMapDeOcurrenciasDeAulas(m)).entrySet
		println('''Aula mas utilizada: «aulaConOcurrencias.get(0).key», con «aulaConOcurrencias.get(0).value» ocurrencias''')
		println()
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
	
	// Genera una lista con los horarios libres
	def horariosLibres(Model m){
		var planificaciones = m.planificacion
		planificaciones.forEach[planificacion |
			println('''Horarios disponibles para la planificacion del «planificacion.semestre.anho» semestre «planificacion.semestre.numero»:''')
			printMap(horariosDisponible(planificacion))
		]
	}
	
	
	// Genera una tabla de Profesores -> Materias que dicta
	def profesoresYMaterias(Model m){
		m.planificacion.forEach[p |
			mostrarTablaDeProfesoresYMaterias(p)
		]
	}
	//************************************************************************************************
	
	//************************************************************************************************
	//                          Metodos de horarios libres
	//************************************************************************************************
	def printMap(Map<String,ArrayList<HorarioPlanificacion>> map){
		for(String dia : dias){
			println('''«dia» : «stringHorarios(map,dia)»''')
		}
		println()
	}
	
	def stringHorarios(Map<String,ArrayList<HorarioPlanificacion>> map, String dia){
		var string = "[ ]"
		var list = map.get(dia)
		if(!list.empty){
			string = "["
			for(HorarioPlanificacion h : list){
				string = string + ''' («h.inicio»,«h.fin») '''
			}
			string = string + ''']'''
		}
		string
	}
	
	def dias(){
		var dias = new ArrayList<String>
		dias.add("Lunes")
		dias.add("Martes")
		dias.add("Miercoles")
		dias.add("Jueves")
		dias.add("Viernes")
		dias.add("Sabado")
		dias
	}
	
	def horarios(Planificacion p){
		var list = new ArrayList<HorarioPlanificacion>
		var map = init
		var dias = dias()
		for(String dia : dias){
			for(Asignacion a : p.asignaciones){
				for(AulaHorario ah : a.aulaHorarios){
					if(ah.dia.eClass.name.equals(dia)){
						var listMap = map.get(dia)
						listMap.add(new HorarioPlanificacion(ah.horario.desde,ah.horario.hasta))//.add(new HorarioPlanificacion(ah.horario.desde,ah.horario.hasta))
						map.put(dia,(listMap))
					}
				}
			}
			list = new ArrayList<HorarioPlanificacion>
		}
		map
	}
//	
//	def order(ArrayList<HorarioPlanificacion> hs, HorarioPlanificacion h){
//		var ret = new ArrayList<HorarioPlanificacion>
//		if(hs.empty){
//			ret.add(h)
//		}else{
//		for(HorarioPlanificacion hora : hs){
//			if(h.inicio < hora.inicio){
//				if(hs.indexOf(hora) == 0){
//					ret.add(0,h)
//				}else{
//				ret.add(hs.indexOf(hora)-1,h)
//				ret.addAll(hs)
//				}
//			}else{
//				ret.add(hora)
//				ret.add(h)
//			}
//		}
//		
//		}
//		ret
//	}
//	
	def init(){
		var map = new HashMap<String,ArrayList<HorarioPlanificacion>>
		for(String dia : dias){
			map.put(dia,new ArrayList<HorarioPlanificacion>)
		}
		map
	}
	
	def horariosDisponible(Planificacion p){
		var horariosNoDisponiblesMap = new HashMap<String,ArrayList<HorarioPlanificacion>> 
		horariosNoDisponiblesMap = horarios(p)
		for(String dia : dias){
			var buffer = new ArrayList<HorarioPlanificacion>
			var listaHorariosNoDisponibles = new ArrayList<HorarioPlanificacion>
			var listaRet = new ArrayList<HorarioPlanificacion>
			listaHorariosNoDisponibles = horariosNoDisponiblesMap.get(dia)
			var hora = new HorarioPlanificacion(8,22)
			listaRet.add(hora)
			//hacer otro metodo
			for(HorarioPlanificacion h : listaHorariosNoDisponibles){
				for(HorarioPlanificacion hp : listaRet){
					if(h.inicio == hp.inicio){
						var x = new HorarioPlanificacion(h.fin, hp.fin)
						hp.setInicio(x.inicio)
						hp.setFin(x.fin)
					}else{
						if(h.fin == hp.fin){
							var x = new HorarioPlanificacion(hp.inicio, h.inicio)
							hp.setInicio(x.inicio)
							hp.setFin(x.fin)
						}else{
							if(h.estaEnElRango(hp)){
								buffer.addAll(addInBuffer(hp,h))
							}else{
								var aux = superponer(h,hp)
								hp.setInicio(aux.inicio)
								hp.setFin(aux.fin)
							}
						}
					}
				}
				listaRet = changeBuffer(listaRet, buffer)
				buffer = new ArrayList<HorarioPlanificacion>
			}
			horariosNoDisponiblesMap.put(dia,listaRet)
		}
		horariosNoDisponiblesMap
	}
	
	def changeBuffer(ArrayList<HorarioPlanificacion> lista, ArrayList<HorarioPlanificacion> buffer){
		var count = 0
		while(count < buffer.size - 1){
			lista.remove(buffer.get(count))
			lista.add(buffer.get(count = count +1))
			lista.add(buffer.get(count = count + 1))
		}
		lista
	}
	
	def addInBuffer(HorarioPlanificacion hp, HorarioPlanificacion h){
		var ret = new ArrayList<HorarioPlanificacion>
		ret.add(hp)
		ret.add(new HorarioPlanificacion(hp.inicio,h.inicio))
		ret.add(new HorarioPlanificacion(h.fin,hp.fin))
		ret
	}
	
	def estaEnElRango(HorarioPlanificacion h,HorarioPlanificacion hp){
		(hp.inicio < h.inicio && hp.fin > h.fin)
	}
	
	def superponer(HorarioPlanificacion h, HorarioPlanificacion hp){
		var ret = new HorarioPlanificacion
		if(h.inicio < hp.inicio && (h.fin > hp.inicio && h.fin < hp.fin)){
			ret.setInicio(h.inicio)
			ret.setFin(hp.fin)
		}else{
			if(hp.inicio < h.inicio &&(hp.fin > h.inicio && hp.fin < h.fin)){
				ret.setInicio(hp.inicio)
				ret.setFin(h.fin)
			}else{
				ret = hp
			}
		}
		ret
	}
	//************************************************************************************************
	
	//************************************************************************************************
	//							Metodos de profesoresYMaterias 
	//************************************************************************************************
	
	def mostrarTablaDeProfesoresYMaterias(Planificacion planificacion){
		planificacion.profesores.forEach[p |
			println('''El Profesor: «p.name», dicta: «materiasQueDicta(p,planificacion.asignaciones)»''')
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
	
	def private boolean laDicta(Asignacion asignacion,Profesor profesor){	
		return asignacion.profesores.contains(profesor)
	}
	
	def private asignacionesDelProfesor(Profesor profesor, List<Asignacion> asignaciones){
		return asignaciones.filter[a | laDicta(a,profesor) ]
	}
	//************************************************************************************************
	
	
	//************************************************************************************************
	//							Metodos de aulaMasUtilizada
	//************************************************************************************************
	def private getMax(Map<String,Integer> aulas){
		val aulasSet = aulas.entrySet
		var String aulaIndex = ""
		var int max = 0
		if(aulasSet.size == 1){
			aulaIndex = aulasSet.get(0).key
			max = aulasSet.get(0).value
		}else{
			max = aulasSet.get(0).value
			aulaIndex = aulasSet.get(0).key
			for(Entry<String,Integer> entry : aulasSet){
				if(entry.value > max){
					max = entry.value
					aulaIndex = entry.key
				}
			}
		}
		var ret = new HashMap<String,Integer>()
		ret.put(aulaIndex,max)
		return ret
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
	//************************************************************************************************
	
	//************************************************************************************************
	//							Metodos de porcentaje de materias por turnos
	//************************************************************************************************
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
	//************************************************************************************************
}