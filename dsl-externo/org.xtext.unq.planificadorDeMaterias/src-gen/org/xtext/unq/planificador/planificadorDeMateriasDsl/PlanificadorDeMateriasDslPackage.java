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
   * The feature id for the '<em><b>Profesors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROFESORS = 0;

  /**
   * The feature id for the '<em><b>Horas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HORAS = 1;

  /**
   * The feature id for the '<em><b>Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MATERIAS = 2;

  /**
   * The feature id for the '<em><b>Aulas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AULAS = 3;

  /**
   * The feature id for the '<em><b>Cargas Horarias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CARGAS_HORARIAS = 4;

  /**
   * The feature id for the '<em><b>Cargas Horarias Docentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CARGAS_HORARIAS_DOCENTES = 5;

  /**
   * The feature id for the '<em><b>Horarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HORARIOS = 6;

  /**
   * The feature id for the '<em><b>Dias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DIAS = 7;

  /**
   * The feature id for the '<em><b>Semestre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SEMESTRE = 8;

  /**
   * The feature id for the '<em><b>Planificaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANIFICACIONES = 9;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RECURSOS = 10;

  /**
   * The feature id for the '<em><b>Recursos De Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RECURSOS_DE_MATERIAS = 11;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 1;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Dedicacion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DEDICACION = 1;

  /**
   * The number of structural features of the '<em>Profesor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl <em>Hora</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHora()
   * @generated
   */
  int HORA = 2;

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
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl <em>Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMateria()
   * @generated
   */
  int MATERIA = 3;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Carga Horaria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CARGA_HORARIA = 1;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaImpl <em>Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getAula()
   * @generated
   */
  int AULA = 4;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__NOMBRE = 0;

  /**
   * The number of structural features of the '<em>Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl <em>Carga Horaria</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getCargaHoraria()
   * @generated
   */
  int CARGA_HORARIA = 5;

  /**
   * The feature id for the '<em><b>Cant Dias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA__CANT_DIAS = 0;

  /**
   * The feature id for the '<em><b>Dias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA__DIAS = 1;

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
  int CARGA_HORARIA_DOCENTE = 6;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA_DOCENTE__NOMBRE = 0;

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
  int HORARIO = 7;

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
  int SEMESTRE = 8;

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
  int DIA = 9;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIA__DIA = 0;

  /**
   * The number of structural features of the '<em>Dia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorariosImpl <em>Horarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorariosImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getHorarios()
   * @generated
   */
  int HORARIOS = 10;

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
  int PLANIFICACION = 11;

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
   * The feature id for the '<em><b>Horarios</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__HORARIOS = 2;

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
  int RECURSO = 12;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO__NOMBRE = 0;

  /**
   * The number of structural features of the '<em>Recurso</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoMateriaImpl <em>Recurso Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoMateriaImpl
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getRecursoMateria()
   * @generated
   */
  int RECURSO_MATERIA = 13;

  /**
   * The feature id for the '<em><b>Materia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_MATERIA__MATERIA = 0;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_MATERIA__RECURSOS = 1;

  /**
   * The number of structural features of the '<em>Recurso Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSO_MATERIA_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getRecursosDeMaterias <em>Recursos De Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recursos De Materias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getRecursosDeMaterias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_RecursosDeMaterias();

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
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getNombre()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Nombre();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getDedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dedicacion</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor#getDedicacion()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Dedicacion();

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
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
   * @generated
   */
  EClass getMateria();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getNombre()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_Nombre();

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
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aula</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula
   * @generated
   */
  EClass getAula();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getNombre()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Nombre();

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
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getCantDias <em>Cant Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cant Dias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getCantDias()
   * @see #getCargaHoraria()
   * @generated
   */
  EAttribute getCargaHoraria_CantDias();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDias <em>Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dias</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDias()
   * @see #getCargaHoraria()
   * @generated
   */
  EAttribute getCargaHoraria_Dias();

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
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente#getNombre()
   * @see #getCargaHorariaDocente()
   * @generated
   */
  EReference getCargaHorariaDocente_Nombre();

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
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia#getDia()
   * @see #getDia()
   * @generated
   */
  EAttribute getDia_Dia();

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
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion#getHorarios()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Horarios();

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
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso#getNombre()
   * @see #getRecurso()
   * @generated
   */
  EAttribute getRecurso_Nombre();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria <em>Recurso Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recurso Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria
   * @generated
   */
  EClass getRecursoMateria();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getMateria()
   * @see #getRecursoMateria()
   * @generated
   */
  EReference getRecursoMateria_Materia();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getRecursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recursos</em>'.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getRecursos()
   * @see #getRecursoMateria()
   * @generated
   */
  EReference getRecursoMateria_Recursos();

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
     * The meta object literal for the '<em><b>Recursos De Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RECURSOS_DE_MATERIAS = eINSTANCE.getModel_RecursosDeMaterias();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__NOMBRE = eINSTANCE.getProfesor_Nombre();

    /**
     * The meta object literal for the '<em><b>Dedicacion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__DEDICACION = eINSTANCE.getProfesor_Dedicacion();

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
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl <em>Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getMateria()
     * @generated
     */
    EClass MATERIA = eINSTANCE.getMateria();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__NOMBRE = eINSTANCE.getMateria_Nombre();

    /**
     * The meta object literal for the '<em><b>Carga Horaria</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__CARGA_HORARIA = eINSTANCE.getMateria_CargaHoraria();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__NOMBRE = eINSTANCE.getAula_Nombre();

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
     * The meta object literal for the '<em><b>Cant Dias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARGA_HORARIA__CANT_DIAS = eINSTANCE.getCargaHoraria_CantDias();

    /**
     * The meta object literal for the '<em><b>Dias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARGA_HORARIA__DIAS = eINSTANCE.getCargaHoraria_Dias();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARGA_HORARIA_DOCENTE__NOMBRE = eINSTANCE.getCargaHorariaDocente_Nombre();

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
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIA__DIA = eINSTANCE.getDia_Dia();

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
     * The meta object literal for the '<em><b>Horarios</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__HORARIOS = eINSTANCE.getPlanificacion_Horarios();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECURSO__NOMBRE = eINSTANCE.getRecurso_Nombre();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoMateriaImpl <em>Recurso Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoMateriaImpl
     * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslPackageImpl#getRecursoMateria()
     * @generated
     */
    EClass RECURSO_MATERIA = eINSTANCE.getRecursoMateria();

    /**
     * The meta object literal for the '<em><b>Materia</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECURSO_MATERIA__MATERIA = eINSTANCE.getRecursoMateria_Materia();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECURSO_MATERIA__RECURSOS = eINSTANCE.getRecursoMateria_Recursos();

  }

} //PlanificadorDeMateriasDslPackage
