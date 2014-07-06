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
   * The feature id for the '<em><b>Elementos Primarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTOS_PRIMARIOS = 0;

  /**
   * The feature id for the '<em><b>Elementos Secundarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTOS_SECUNDARIOS = 1;

  /**
   * The feature id for the '<em><b>Planificacion</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANIFICACION = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosPrimariosImpl <em>Elementos Primarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosPrimariosImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getElementosPrimarios()
   * @generated
   */
  int ELEMENTOS_PRIMARIOS = 1;

  /**
   * The number of structural features of the '<em>Elementos Primarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTOS_PRIMARIOS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosSecundariosImpl <em>Elementos Secundarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosSecundariosImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getElementosSecundarios()
   * @generated
   */
  int ELEMENTOS_SECUNDARIOS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTOS_SECUNDARIOS__NAME = 0;

  /**
   * The number of structural features of the '<em>Elementos Secundarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTOS_SECUNDARIOS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__NAME = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dedicacion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DEDICACION = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Disponibilidad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DISPONIBILIDAD = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Profesor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR_FEATURE_COUNT = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl <em>Disponibilidad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getDisponibilidad()
   * @generated
   */
  int DISPONIBILIDAD = 4;

  /**
   * The feature id for the '<em><b>Dias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD__DIAS = 0;

  /**
   * The feature id for the '<em><b>Inicio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD__INICIO = 1;

  /**
   * The feature id for the '<em><b>Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD__FIN = 2;

  /**
   * The number of structural features of the '<em>Disponibilidad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPONIBILIDAD_FEATURE_COUNT = 3;

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
  int MATERIA__NAME = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Carga Horaria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CARGA_HORARIA = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__RECURSOS = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 3;

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
  int AULA__NAME = ELEMENTOS_SECUNDARIOS__NAME;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__RECURSOS = ELEMENTOS_SECUNDARIOS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__CAPACIDAD = ELEMENTOS_SECUNDARIOS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_FEATURE_COUNT = ELEMENTOS_SECUNDARIOS_FEATURE_COUNT + 2;

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
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl <em>Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorario()
   * @generated
   */
  int HORARIO = 9;

  /**
   * The feature id for the '<em><b>Desde</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__DESDE = 0;

  /**
   * The feature id for the '<em><b>Hasta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__HASTA = 1;

  /**
   * The number of structural features of the '<em>Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl <em>Semestre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSemestre()
   * @generated
   */
  int SEMESTRE = 10;

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
  int DIA = 11;

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
  int ASIGNACION = 12;

  /**
   * The feature id for the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__MATERIA = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inscriptos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__INSCRIPTOS = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Profesores</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__PROFESORES = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Aula Horarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__AULA_HORARIOS = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Asignacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_FEATURE_COUNT = ELEMENTOS_PRIMARIOS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl <em>Aula Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAulaHorario()
   * @generated
   */
  int AULA_HORARIO = 13;

  /**
   * The feature id for the '<em><b>Dia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_HORARIO__DIA = 0;

  /**
   * The feature id for the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_HORARIO__HORARIO = 1;

  /**
   * The feature id for the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_HORARIO__AULA = 2;

  /**
   * The number of structural features of the '<em>Aula Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_HORARIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getPlanificacion()
   * @generated
   */
  int PLANIFICACION = 14;

  /**
   * The feature id for the '<em><b>Semestre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__SEMESTRE = 0;

  /**
   * The feature id for the '<em><b>Asignaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__ASIGNACIONES = 1;

  /**
   * The number of structural features of the '<em>Planificacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoImpl <em>Recurso</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getRecurso()
   * @generated
   */
  int RECURSO = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO__NAME = ELEMENTOS_SECUNDARIOS__NAME;

  /**
   * The number of structural features of the '<em>Recurso</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_FEATURE_COUNT = ELEMENTOS_SECUNDARIOS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SIMPLEImpl <em>SIMPLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SIMPLEImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getSIMPLE()
   * @generated
   */
  int SIMPLE = 16;

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
  int SEMI = 17;

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
  int EXCLUSIVA = 18;

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
  int LUNES = 19;

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
  int MARTES = 20;

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
  int MIERCOLES = 21;

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
  int JUEVES = 22;

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
  int VIERNES = 23;

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
  int SABADO = 24;

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
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getElementosPrimarios <em>Elementos Primarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elementos Primarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getElementosPrimarios()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ElementosPrimarios();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getElementosSecundarios <em>Elementos Secundarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elementos Secundarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getElementosSecundarios()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ElementosSecundarios();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getPlanificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Planificacion</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getPlanificacion()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Planificacion();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios <em>Elementos Primarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elementos Primarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios
   * @generated
   */
  EClass getElementosPrimarios();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios <em>Elementos Secundarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elementos Secundarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios
   * @generated
   */
  EClass getElementosSecundarios();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios#getName()
   * @see #getElementosSecundarios()
   * @generated
   */
  EAttribute getElementosSecundarios_Name();

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
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getInicio <em>Inicio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inicio</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getInicio()
   * @see #getDisponibilidad()
   * @generated
   */
  EAttribute getDisponibilidad_Inicio();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getFin <em>Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fin</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getFin()
   * @see #getDisponibilidad()
   * @generated
   */
  EAttribute getDisponibilidad_Fin();

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
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horario</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario
   * @generated
   */
  EClass getHorario();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDesde <em>Desde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desde</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDesde()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_Desde();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getHasta <em>Hasta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hasta</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getHasta()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_Hasta();

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
   * Returns the meta object for the reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getMateria()
   * @see #getAsignacion()
   * @generated
   */
  EReference getAsignacion_Materia();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getInscriptos <em>Inscriptos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inscriptos</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getInscriptos()
   * @see #getAsignacion()
   * @generated
   */
  EAttribute getAsignacion_Inscriptos();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getProfesores <em>Profesores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Profesores</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getProfesores()
   * @see #getAsignacion()
   * @generated
   */
  EReference getAsignacion_Profesores();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getAulaHorarios <em>Aula Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aula Horarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getAulaHorarios()
   * @see #getAsignacion()
   * @generated
   */
  EReference getAsignacion_AulaHorarios();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario <em>Aula Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aula Horario</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario
   * @generated
   */
  EClass getAulaHorario();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario#getDia()
   * @see #getAulaHorario()
   * @generated
   */
  EReference getAulaHorario_Dia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario#getHorario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horario</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario#getHorario()
   * @see #getAulaHorario()
   * @generated
   */
  EReference getAulaHorario_Horario();

  /**
   * Returns the meta object for the reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aula</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario#getAula()
   * @see #getAulaHorario()
   * @generated
   */
  EReference getAulaHorario_Aula();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getAsignaciones <em>Asignaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asignaciones</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getAsignaciones()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Asignaciones();

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
     * The meta object literal for the '<em><b>Elementos Primarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTOS_PRIMARIOS = eINSTANCE.getModel_ElementosPrimarios();

    /**
     * The meta object literal for the '<em><b>Elementos Secundarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTOS_SECUNDARIOS = eINSTANCE.getModel_ElementosSecundarios();

    /**
     * The meta object literal for the '<em><b>Planificacion</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLANIFICACION = eINSTANCE.getModel_Planificacion();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosPrimariosImpl <em>Elementos Primarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosPrimariosImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getElementosPrimarios()
     * @generated
     */
    EClass ELEMENTOS_PRIMARIOS = eINSTANCE.getElementosPrimarios();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosSecundariosImpl <em>Elementos Secundarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ElementosSecundariosImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getElementosSecundarios()
     * @generated
     */
    EClass ELEMENTOS_SECUNDARIOS = eINSTANCE.getElementosSecundarios();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENTOS_SECUNDARIOS__NAME = eINSTANCE.getElementosSecundarios_Name();

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
     * The meta object literal for the '<em><b>Inicio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPONIBILIDAD__INICIO = eINSTANCE.getDisponibilidad_Inicio();

    /**
     * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPONIBILIDAD__FIN = eINSTANCE.getDisponibilidad_Fin();

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
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl <em>Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorario()
     * @generated
     */
    EClass HORARIO = eINSTANCE.getHorario();

    /**
     * The meta object literal for the '<em><b>Desde</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__DESDE = eINSTANCE.getHorario_Desde();

    /**
     * The meta object literal for the '<em><b>Hasta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__HASTA = eINSTANCE.getHorario_Hasta();

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
     * The meta object literal for the '<em><b>Materia</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION__MATERIA = eINSTANCE.getAsignacion_Materia();

    /**
     * The meta object literal for the '<em><b>Inscriptos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACION__INSCRIPTOS = eINSTANCE.getAsignacion_Inscriptos();

    /**
     * The meta object literal for the '<em><b>Profesores</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION__PROFESORES = eINSTANCE.getAsignacion_Profesores();

    /**
     * The meta object literal for the '<em><b>Aula Horarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION__AULA_HORARIOS = eINSTANCE.getAsignacion_AulaHorarios();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl <em>Aula Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAulaHorario()
     * @generated
     */
    EClass AULA_HORARIO = eINSTANCE.getAulaHorario();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULA_HORARIO__DIA = eINSTANCE.getAulaHorario_Dia();

    /**
     * The meta object literal for the '<em><b>Horario</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULA_HORARIO__HORARIO = eINSTANCE.getAulaHorario_Horario();

    /**
     * The meta object literal for the '<em><b>Aula</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULA_HORARIO__AULA = eINSTANCE.getAulaHorario_Aula();

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
     * The meta object literal for the '<em><b>Asignaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__ASIGNACIONES = eINSTANCE.getPlanificacion_Asignaciones();

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
