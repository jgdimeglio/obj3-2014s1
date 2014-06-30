/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslFactory
 * @model kind="package"
 * @generated
 */
public interface PlanificadorDeMateriasDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "planificadorDeMateriasDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/unq/planificadorDeMaterias/Pdm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "planificadorDeMateriasDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanificadorDeMateriasDslPackage eINSTANCE = org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Profesors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROFESORS = 1;

  /**
   * The feature id for the '<em><b>Horas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HORAS = 2;

  /**
   * The feature id for the '<em><b>Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MATERIAS = 3;

  /**
   * The feature id for the '<em><b>Aulas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AULAS = 4;

  /**
   * The feature id for the '<em><b>Cargas Horarias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CARGAS_HORARIAS = 5;

  /**
   * The feature id for the '<em><b>Cargas Horarias Docentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CARGAS_HORARIAS_DOCENTES = 6;

  /**
   * The feature id for the '<em><b>Horarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HORARIOS = 7;

  /**
   * The feature id for the '<em><b>Dias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DIAS = 8;

  /**
   * The feature id for the '<em><b>Semestre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SEMESTRE = 9;

  /**
   * The feature id for the '<em><b>Planificaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANIFICACIONES = 10;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RECURSOS = 11;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ImportImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Dedicacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DEDICACION = 1;

  /**
   * The feature id for the '<em><b>Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__MATERIAS = 2;

  /**
   * The feature id for the '<em><b>Disponibilidad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DISPONIBILIDAD = 3;

  /**
   * The number of structural features of the '<em>Profesor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl <em>Disponibilidad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDisponibilidad()
   * @generated
   */
  int DISPONIBILIDAD = 3;

  /**
   * The feature id for the '<em><b>Dias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD__DIAS = 0;

  /**
   * The number of structural features of the '<em>Disponibilidad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl <em>Hora</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHora()
   * @generated
   */
  int HORA = 4;

  /**
   * The feature id for the '<em><b>Hora</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORA__HORA = 0;

  /**
   * The number of structural features of the '<em>Hora</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DedicacionImpl <em>Dedicacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DedicacionImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDedicacion()
   * @generated
   */
  int DEDICACION = 5;

  /**
   * The number of structural features of the '<em>Dedicacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEDICACION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl <em>Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMateria()
   * @generated
   */
  int MATERIA = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__NAME = 0;

  /**
   * The feature id for the '<em><b>Carga Horaria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CARGA_HORARIA = 1;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__RECURSOS = 2;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaImpl <em>Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAula()
   * @generated
   */
  int AULA = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__NAME = 0;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__RECURSOS = 1;

  /**
   * The feature id for the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__CAPACIDAD = 2;

  /**
   * The number of structural features of the '<em>Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl <em>Carga Horaria</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getCargaHoraria()
   * @generated
   */
  int CARGA_HORARIA = 8;

  /**
   * The feature id for the '<em><b>Cant Horas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA__CANT_HORAS = 0;

  /**
   * The feature id for the '<em><b>Dias Semanales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA__DIAS_SEMANALES = 1;

  /**
   * The number of structural features of the '<em>Carga Horaria</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaDocenteImpl <em>Carga Horaria Docente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaDocenteImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getCargaHorariaDocente()
   * @generated
   */
  int CARGA_HORARIA_DOCENTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA_DOCENTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA_DOCENTE__TIPO = 1;

  /**
   * The number of structural features of the '<em>Carga Horaria Docente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA_DOCENTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl <em>Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorario()
   * @generated
   */
  int HORARIO = 10;

  /**
   * The feature id for the '<em><b>Dia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__DIA = 0;

  /**
   * The feature id for the '<em><b>Desde</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__DESDE = 1;

  /**
   * The feature id for the '<em><b>Hasta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__HASTA = 2;

  /**
   * The feature id for the '<em><b>Materia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__MATERIA = 3;

  /**
   * The feature id for the '<em><b>Aula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__AULA = 4;

  /**
   * The number of structural features of the '<em>Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl <em>Semestre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSemestre()
   * @generated
   */
  int SEMESTRE = 11;

  /**
   * The feature id for the '<em><b>Anho</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMESTRE__ANHO = 0;

  /**
   * The feature id for the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMESTRE__NUMERO = 1;

  /**
   * The number of structural features of the '<em>Semestre</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMESTRE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DiaImpl <em>Dia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DiaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDia()
   * @generated
   */
  int DIA = 12;

  /**
   * The number of structural features of the '<em>Dia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl <em>Asignacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAsignacion()
   * @generated
   */
  int ASIGNACION = 13;

  /**
   * The feature id for the '<em><b>Dia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__DIA = 0;

  /**
   * The feature id for the '<em><b>Materia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__MATERIA = 1;

  /**
   * The number of structural features of the '<em>Asignacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorariosImpl <em>Horarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorariosImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorarios()
   * @generated
   */
  int HORARIOS = 14;

  /**
   * The feature id for the '<em><b>Horarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS__HORARIOS = 0;

  /**
   * The number of structural features of the '<em>Horarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getPlanificacion()
   * @generated
   */
  int PLANIFICACION = 15;

  /**
   * The feature id for the '<em><b>Semestre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__SEMESTRE = 0;

  /**
   * The feature id for the '<em><b>Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__MATERIAS = 1;

  /**
   * The feature id for the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__HORARIO = 2;

  /**
   * The number of structural features of the '<em>Planificacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoImpl <em>Recurso</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getRecurso()
   * @generated
   */
  int RECURSO = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO__NAME = 0;

  /**
   * The number of structural features of the '<em>Recurso</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SIMPLEImpl <em>SIMPLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SIMPLEImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSIMPLE()
   * @generated
   */
  int SIMPLE = 17;

  /**
   * The number of structural features of the '<em>SIMPLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FEATURE_COUNT = DEDICACION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SEMIImpl <em>SEMI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SEMIImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSEMI()
   * @generated
   */
  int SEMI = 18;

  /**
   * The number of structural features of the '<em>SEMI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_FEATURE_COUNT = DEDICACION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.EXCLUSIVAImpl <em>EXCLUSIVA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.EXCLUSIVAImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getEXCLUSIVA()
   * @generated
   */
  int EXCLUSIVA = 19;

  /**
   * The number of structural features of the '<em>EXCLUSIVA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVA_FEATURE_COUNT = DEDICACION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.LunesImpl <em>Lunes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.LunesImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getLunes()
   * @generated
   */
  int LUNES = 20;

  /**
   * The number of structural features of the '<em>Lunes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LUNES_FEATURE_COUNT = DIA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MartesImpl <em>Martes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MartesImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMartes()
   * @generated
   */
  int MARTES = 21;

  /**
   * The number of structural features of the '<em>Martes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARTES_FEATURE_COUNT = DIA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MiercolesImpl <em>Miercoles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MiercolesImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMiercoles()
   * @generated
   */
  int MIERCOLES = 22;

  /**
   * The number of structural features of the '<em>Miercoles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIERCOLES_FEATURE_COUNT = DIA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.JuevesImpl <em>Jueves</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.JuevesImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getJueves()
   * @generated
   */
  int JUEVES = 23;

  /**
   * The number of structural features of the '<em>Jueves</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUEVES_FEATURE_COUNT = DIA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ViernesImpl <em>Viernes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ViernesImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getViernes()
   * @generated
   */
  int VIERNES = 24;

  /**
   * The number of structural features of the '<em>Viernes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIERNES_FEATURE_COUNT = DIA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SabadoImpl <em>Sabado</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SabadoImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSabado()
   * @generated
   */
  int SABADO = 25;

  /**
   * The number of structural features of the '<em>Sabado</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SABADO_FEATURE_COUNT = DIA_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getProfesors <em>Profesors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profesors</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getProfesors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Profesors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getHoras <em>Horas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horas</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getHoras()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Horas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getMaterias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Materias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getAulas <em>Aulas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aulas</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getAulas()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Aulas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getCargasHorarias <em>Cargas Horarias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cargas Horarias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getCargasHorarias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_CargasHorarias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getCargasHorariasDocentes <em>Cargas Horarias Docentes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cargas Horarias Docentes</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getCargasHorariasDocentes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_CargasHorariasDocentes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getHorarios()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Horarios();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getDias <em>Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getDias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Dias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getSemestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Semestre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getSemestre()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Semestre();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getPlanificaciones <em>Planificaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Planificaciones</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getPlanificaciones()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Planificaciones();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getRecursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recursos</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getRecursos()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Recursos();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Profesor</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor
   * @generated
   */
  EClass getProfesor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getName()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getDedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dedicacion</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getDedicacion()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_Dedicacion();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getMaterias()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_Materias();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getDisponibilidad <em>Disponibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Disponibilidad</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getDisponibilidad()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_Disponibilidad();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad <em>Disponibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disponibilidad</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad
   * @generated
   */
  EClass getDisponibilidad();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getDias <em>Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getDias()
   * @see #getDisponibilidad()
   * @generated
   */
  EReference getDisponibilidad_Dias();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hora</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora
   * @generated
   */
  EClass getHora();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora#getHora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hora</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora#getHora()
   * @see #getHora()
   * @generated
   */
  EAttribute getHora_Hora();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dedicacion</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Dedicacion
   * @generated
   */
  EClass getDedicacion();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
   * @generated
   */
  EClass getMateria();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getName()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getCargaHoraria <em>Carga Horaria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Carga Horaria</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getCargaHoraria()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_CargaHoraria();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getRecursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recursos</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getRecursos()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_Recursos();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aula</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula
   * @generated
   */
  EClass getAula();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getName()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getRecursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recursos</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getRecursos()
   * @see #getAula()
   * @generated
   */
  EReference getAula_Recursos();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getCapacidad <em>Capacidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capacidad</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getCapacidad()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Capacidad();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria <em>Carga Horaria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Carga Horaria</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria
   * @generated
   */
  EClass getCargaHoraria();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getCantHoras <em>Cant Horas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cant Horas</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getCantHoras()
   * @see #getCargaHoraria()
   * @generated
   */
  EAttribute getCargaHoraria_CantHoras();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDiasSemanales <em>Dias Semanales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dias Semanales</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDiasSemanales()
   * @see #getCargaHoraria()
   * @generated
   */
  EAttribute getCargaHoraria_DiasSemanales();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente <em>Carga Horaria Docente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Carga Horaria Docente</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente
   * @generated
   */
  EClass getCargaHorariaDocente();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente#getName()
   * @see #getCargaHorariaDocente()
   * @generated
   */
  EReference getCargaHorariaDocente_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente#getTipo()
   * @see #getCargaHorariaDocente()
   * @generated
   */
  EReference getCargaHorariaDocente_Tipo();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horario</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario
   * @generated
   */
  EClass getHorario();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDia()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Dia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDesde <em>Desde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Desde</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDesde()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Desde();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getHasta <em>Hasta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hasta</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getHasta()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Hasta();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getMateria()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Materia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aula</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getAula()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Aula();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semestre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre
   * @generated
   */
  EClass getSemestre();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre#getAnho <em>Anho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anho</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre#getAnho()
   * @see #getSemestre()
   * @generated
   */
  EAttribute getSemestre_Anho();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre#getNumero <em>Numero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numero</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre#getNumero()
   * @see #getSemestre()
   * @generated
   */
  EAttribute getSemestre_Numero();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia
   * @generated
   */
  EClass getDia();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion <em>Asignacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asignacion</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion
   * @generated
   */
  EClass getAsignacion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getDia()
   * @see #getAsignacion()
   * @generated
   */
  EReference getAsignacion_Dia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getMateria()
   * @see #getAsignacion()
   * @generated
   */
  EReference getAsignacion_Materia();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios
   * @generated
   */
  EClass getHorarios();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios#getHorarios()
   * @see #getHorarios()
   * @generated
   */
  EReference getHorarios_Horarios();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planificacion</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion
   * @generated
   */
  EClass getPlanificacion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getSemestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Semestre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getSemestre()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Semestre();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getMaterias()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Materias();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getHorario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horario</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getHorario()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Horario();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso <em>Recurso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recurso</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso
   * @generated
   */
  EClass getRecurso();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso#getName()
   * @see #getRecurso()
   * @generated
   */
  EAttribute getRecurso_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.SIMPLE <em>SIMPLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SIMPLE</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.SIMPLE
   * @generated
   */
  EClass getSIMPLE();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.SEMI <em>SEMI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SEMI</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.SEMI
   * @generated
   */
  EClass getSEMI();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.EXCLUSIVA <em>EXCLUSIVA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXCLUSIVA</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.EXCLUSIVA
   * @generated
   */
  EClass getEXCLUSIVA();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Lunes <em>Lunes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lunes</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Lunes
   * @generated
   */
  EClass getLunes();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Martes <em>Martes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Martes</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Martes
   * @generated
   */
  EClass getMartes();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Miercoles <em>Miercoles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Miercoles</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Miercoles
   * @generated
   */
  EClass getMiercoles();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Jueves <em>Jueves</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jueves</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Jueves
   * @generated
   */
  EClass getJueves();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Viernes <em>Viernes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viernes</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Viernes
   * @generated
   */
  EClass getViernes();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Sabado <em>Sabado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sabado</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Sabado
   * @generated
   */
  EClass getSabado();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlanificadorDeMateriasDslFactory getPlanificadorDeMateriasDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Profesors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROFESORS = eINSTANCE.getModel_Profesors();

    /**
     * The meta object literal for the '<em><b>Horas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HORAS = eINSTANCE.getModel_Horas();

    /**
     * The meta object literal for the '<em><b>Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MATERIAS = eINSTANCE.getModel_Materias();

    /**
     * The meta object literal for the '<em><b>Aulas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AULAS = eINSTANCE.getModel_Aulas();

    /**
     * The meta object literal for the '<em><b>Cargas Horarias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CARGAS_HORARIAS = eINSTANCE.getModel_CargasHorarias();

    /**
     * The meta object literal for the '<em><b>Cargas Horarias Docentes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CARGAS_HORARIAS_DOCENTES = eINSTANCE.getModel_CargasHorariasDocentes();

    /**
     * The meta object literal for the '<em><b>Horarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HORARIOS = eINSTANCE.getModel_Horarios();

    /**
     * The meta object literal for the '<em><b>Dias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DIAS = eINSTANCE.getModel_Dias();

    /**
     * The meta object literal for the '<em><b>Semestre</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SEMESTRE = eINSTANCE.getModel_Semestre();

    /**
     * The meta object literal for the '<em><b>Planificaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLANIFICACIONES = eINSTANCE.getModel_Planificaciones();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RECURSOS = eINSTANCE.getModel_Recursos();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ImportImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getProfesor()
     * @generated
     */
    EClass PROFESOR = eINSTANCE.getProfesor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__NAME = eINSTANCE.getProfesor_Name();

    /**
     * The meta object literal for the '<em><b>Dedicacion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__DEDICACION = eINSTANCE.getProfesor_Dedicacion();

    /**
     * The meta object literal for the '<em><b>Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__MATERIAS = eINSTANCE.getProfesor_Materias();

    /**
     * The meta object literal for the '<em><b>Disponibilidad</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__DISPONIBILIDAD = eINSTANCE.getProfesor_Disponibilidad();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl <em>Disponibilidad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDisponibilidad()
     * @generated
     */
    EClass DISPONIBILIDAD = eINSTANCE.getDisponibilidad();

    /**
     * The meta object literal for the '<em><b>Dias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPONIBILIDAD__DIAS = eINSTANCE.getDisponibilidad_Dias();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl <em>Hora</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHora()
     * @generated
     */
    EClass HORA = eINSTANCE.getHora();

    /**
     * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORA__HORA = eINSTANCE.getHora_Hora();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DedicacionImpl <em>Dedicacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DedicacionImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDedicacion()
     * @generated
     */
    EClass DEDICACION = eINSTANCE.getDedicacion();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl <em>Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMateria()
     * @generated
     */
    EClass MATERIA = eINSTANCE.getMateria();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__NAME = eINSTANCE.getMateria_Name();

    /**
     * The meta object literal for the '<em><b>Carga Horaria</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__CARGA_HORARIA = eINSTANCE.getMateria_CargaHoraria();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__RECURSOS = eINSTANCE.getMateria_Recursos();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaImpl <em>Aula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAula()
     * @generated
     */
    EClass AULA = eINSTANCE.getAula();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__NAME = eINSTANCE.getAula_Name();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULA__RECURSOS = eINSTANCE.getAula_Recursos();

    /**
     * The meta object literal for the '<em><b>Capacidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__CAPACIDAD = eINSTANCE.getAula_Capacidad();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl <em>Carga Horaria</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getCargaHoraria()
     * @generated
     */
    EClass CARGA_HORARIA = eINSTANCE.getCargaHoraria();

    /**
     * The meta object literal for the '<em><b>Cant Horas</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARGA_HORARIA__CANT_HORAS = eINSTANCE.getCargaHoraria_CantHoras();

    /**
     * The meta object literal for the '<em><b>Dias Semanales</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARGA_HORARIA__DIAS_SEMANALES = eINSTANCE.getCargaHoraria_DiasSemanales();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaDocenteImpl <em>Carga Horaria Docente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaDocenteImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getCargaHorariaDocente()
     * @generated
     */
    EClass CARGA_HORARIA_DOCENTE = eINSTANCE.getCargaHorariaDocente();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARGA_HORARIA_DOCENTE__NAME = eINSTANCE.getCargaHorariaDocente_Name();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARGA_HORARIA_DOCENTE__TIPO = eINSTANCE.getCargaHorariaDocente_Tipo();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl <em>Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorario()
     * @generated
     */
    EClass HORARIO = eINSTANCE.getHorario();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__DIA = eINSTANCE.getHorario_Dia();

    /**
     * The meta object literal for the '<em><b>Desde</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__DESDE = eINSTANCE.getHorario_Desde();

    /**
     * The meta object literal for the '<em><b>Hasta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__HASTA = eINSTANCE.getHorario_Hasta();

    /**
     * The meta object literal for the '<em><b>Materia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__MATERIA = eINSTANCE.getHorario_Materia();

    /**
     * The meta object literal for the '<em><b>Aula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__AULA = eINSTANCE.getHorario_Aula();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl <em>Semestre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSemestre()
     * @generated
     */
    EClass SEMESTRE = eINSTANCE.getSemestre();

    /**
     * The meta object literal for the '<em><b>Anho</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMESTRE__ANHO = eINSTANCE.getSemestre_Anho();

    /**
     * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEMESTRE__NUMERO = eINSTANCE.getSemestre_Numero();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DiaImpl <em>Dia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DiaImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDia()
     * @generated
     */
    EClass DIA = eINSTANCE.getDia();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl <em>Asignacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAsignacion()
     * @generated
     */
    EClass ASIGNACION = eINSTANCE.getAsignacion();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION__DIA = eINSTANCE.getAsignacion_Dia();

    /**
     * The meta object literal for the '<em><b>Materia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION__MATERIA = eINSTANCE.getAsignacion_Materia();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorariosImpl <em>Horarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorariosImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorarios()
     * @generated
     */
    EClass HORARIOS = eINSTANCE.getHorarios();

    /**
     * The meta object literal for the '<em><b>Horarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIOS__HORARIOS = eINSTANCE.getHorarios_Horarios();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl <em>Planificacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getPlanificacion()
     * @generated
     */
    EClass PLANIFICACION = eINSTANCE.getPlanificacion();

    /**
     * The meta object literal for the '<em><b>Semestre</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__SEMESTRE = eINSTANCE.getPlanificacion_Semestre();

    /**
     * The meta object literal for the '<em><b>Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__MATERIAS = eINSTANCE.getPlanificacion_Materias();

    /**
     * The meta object literal for the '<em><b>Horario</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__HORARIO = eINSTANCE.getPlanificacion_Horario();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoImpl <em>Recurso</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getRecurso()
     * @generated
     */
    EClass RECURSO = eINSTANCE.getRecurso();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECURSO__NAME = eINSTANCE.getRecurso_Name();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SIMPLEImpl <em>SIMPLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SIMPLEImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSIMPLE()
     * @generated
     */
    EClass SIMPLE = eINSTANCE.getSIMPLE();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SEMIImpl <em>SEMI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SEMIImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSEMI()
     * @generated
     */
    EClass SEMI = eINSTANCE.getSEMI();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.EXCLUSIVAImpl <em>EXCLUSIVA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.EXCLUSIVAImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getEXCLUSIVA()
     * @generated
     */
    EClass EXCLUSIVA = eINSTANCE.getEXCLUSIVA();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.LunesImpl <em>Lunes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.LunesImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getLunes()
     * @generated
     */
    EClass LUNES = eINSTANCE.getLunes();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MartesImpl <em>Martes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MartesImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMartes()
     * @generated
     */
    EClass MARTES = eINSTANCE.getMartes();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MiercolesImpl <em>Miercoles</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MiercolesImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMiercoles()
     * @generated
     */
    EClass MIERCOLES = eINSTANCE.getMiercoles();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.JuevesImpl <em>Jueves</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.JuevesImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getJueves()
     * @generated
     */
    EClass JUEVES = eINSTANCE.getJueves();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ViernesImpl <em>Viernes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ViernesImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getViernes()
     * @generated
     */
    EClass VIERNES = eINSTANCE.getViernes();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SabadoImpl <em>Sabado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SabadoImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSabado()
     * @generated
     */
    EClass SABADO = eINSTANCE.getSabado();

  }

} //PlanificadorDeMateriasDslPackage
