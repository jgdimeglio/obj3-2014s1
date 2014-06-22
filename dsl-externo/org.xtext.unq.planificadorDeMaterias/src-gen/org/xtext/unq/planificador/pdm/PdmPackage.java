/**
 */
package org.xtext.unq.planificador.pdm;

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
 * @see org.xtext.unq.planificador.pdm.PdmFactory
 * @model kind="package"
 * @generated
 */
public interface PdmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pdm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/unq/planificador/Pdm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pdm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdmPackage eINSTANCE = org.xtext.unq.planificador.pdm.impl.PdmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.ModelImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getModel()
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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.ProfesorImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 1;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__NOMBRE = 0;

  /**
   * The number of structural features of the '<em>Profesor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.HoraImpl <em>Hora</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.HoraImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getHora()
   * @generated
   */
  int HORA = 2;

  /**
   * The feature id for the '<em><b>Hora</b></em>' attribute list.
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.MateriaImpl <em>Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.MateriaImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getMateria()
   * @generated
   */
  int MATERIA = 3;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__NOMBRE = 0;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.AulaImpl <em>Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.AulaImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getAula()
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.CargaHorariaImpl <em>Carga Horaria</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.CargaHorariaImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getCargaHoraria()
   * @generated
   */
  int CARGA_HORARIA = 5;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA__TIPO = 0;

  /**
   * The number of structural features of the '<em>Carga Horaria</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARGA_HORARIA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.CargaHorariaDocenteImpl <em>Carga Horaria Docente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.CargaHorariaDocenteImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getCargaHorariaDocente()
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl <em>Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.HorarioImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getHorario()
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.SemestreImpl <em>Semestre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.SemestreImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getSemestre()
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.DiaImpl <em>Dia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.DiaImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getDia()
   * @generated
   */
  int DIA = 9;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute list.
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.HorariosImpl <em>Horarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.HorariosImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getHorarios()
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
   * The meta object id for the '{@link org.xtext.unq.planificador.pdm.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.unq.planificador.pdm.impl.PlanificacionImpl
   * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getPlanificacion()
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
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.unq.planificador.pdm.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getProfesors <em>Profesors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profesors</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getProfesors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Profesors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getHoras <em>Horas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horas</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getHoras()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Horas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getMaterias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Materias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getAulas <em>Aulas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aulas</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getAulas()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Aulas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getCargasHorarias <em>Cargas Horarias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cargas Horarias</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getCargasHorarias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_CargasHorarias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getCargasHorariasDocentes <em>Cargas Horarias Docentes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cargas Horarias Docentes</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getCargasHorariasDocentes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_CargasHorariasDocentes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getHorarios()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Horarios();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getDias <em>Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dias</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getDias()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Dias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getSemestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Semestre</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getSemestre()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Semestre();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Model#getPlanificaciones <em>Planificaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Planificaciones</em>'.
   * @see org.xtext.unq.planificador.pdm.Model#getPlanificaciones()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Planificaciones();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Profesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Profesor</em>'.
   * @see org.xtext.unq.planificador.pdm.Profesor
   * @generated
   */
  EClass getProfesor();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.pdm.Profesor#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.pdm.Profesor#getNombre()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Nombre();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Hora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hora</em>'.
   * @see org.xtext.unq.planificador.pdm.Hora
   * @generated
   */
  EClass getHora();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.pdm.Hora#getHora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Hora</em>'.
   * @see org.xtext.unq.planificador.pdm.Hora#getHora()
   * @see #getHora()
   * @generated
   */
  EAttribute getHora_Hora();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.pdm.Materia
   * @generated
   */
  EClass getMateria();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.pdm.Materia#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.pdm.Materia#getNombre()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_Nombre();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aula</em>'.
   * @see org.xtext.unq.planificador.pdm.Aula
   * @generated
   */
  EClass getAula();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.pdm.Aula#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.pdm.Aula#getNombre()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Nombre();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.CargaHoraria <em>Carga Horaria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Carga Horaria</em>'.
   * @see org.xtext.unq.planificador.pdm.CargaHoraria
   * @generated
   */
  EClass getCargaHoraria();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.pdm.CargaHoraria#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tipo</em>'.
   * @see org.xtext.unq.planificador.pdm.CargaHoraria#getTipo()
   * @see #getCargaHoraria()
   * @generated
   */
  EAttribute getCargaHoraria_Tipo();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.CargaHorariaDocente <em>Carga Horaria Docente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Carga Horaria Docente</em>'.
   * @see org.xtext.unq.planificador.pdm.CargaHorariaDocente
   * @generated
   */
  EClass getCargaHorariaDocente();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.CargaHorariaDocente#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nombre</em>'.
   * @see org.xtext.unq.planificador.pdm.CargaHorariaDocente#getNombre()
   * @see #getCargaHorariaDocente()
   * @generated
   */
  EReference getCargaHorariaDocente_Nombre();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.CargaHorariaDocente#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tipo</em>'.
   * @see org.xtext.unq.planificador.pdm.CargaHorariaDocente#getTipo()
   * @see #getCargaHorariaDocente()
   * @generated
   */
  EReference getCargaHorariaDocente_Tipo();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horario</em>'.
   * @see org.xtext.unq.planificador.pdm.Horario
   * @generated
   */
  EClass getHorario();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Horario#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.pdm.Horario#getDia()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Dia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Horario#getDesde <em>Desde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Desde</em>'.
   * @see org.xtext.unq.planificador.pdm.Horario#getDesde()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Desde();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Horario#getHasta <em>Hasta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hasta</em>'.
   * @see org.xtext.unq.planificador.pdm.Horario#getHasta()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Hasta();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Horario#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Materia</em>'.
   * @see org.xtext.unq.planificador.pdm.Horario#getMateria()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Materia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Horario#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aula</em>'.
   * @see org.xtext.unq.planificador.pdm.Horario#getAula()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Aula();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Semestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semestre</em>'.
   * @see org.xtext.unq.planificador.pdm.Semestre
   * @generated
   */
  EClass getSemestre();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.pdm.Semestre#getAnho <em>Anho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anho</em>'.
   * @see org.xtext.unq.planificador.pdm.Semestre#getAnho()
   * @see #getSemestre()
   * @generated
   */
  EAttribute getSemestre_Anho();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.unq.planificador.pdm.Semestre#getNumero <em>Numero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numero</em>'.
   * @see org.xtext.unq.planificador.pdm.Semestre#getNumero()
   * @see #getSemestre()
   * @generated
   */
  EAttribute getSemestre_Numero();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Dia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.pdm.Dia
   * @generated
   */
  EClass getDia();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.unq.planificador.pdm.Dia#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dia</em>'.
   * @see org.xtext.unq.planificador.pdm.Dia#getDia()
   * @see #getDia()
   * @generated
   */
  EAttribute getDia_Dia();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Horarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.pdm.Horarios
   * @generated
   */
  EClass getHorarios();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Horarios#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.pdm.Horarios#getHorarios()
   * @see #getHorarios()
   * @generated
   */
  EReference getHorarios_Horarios();

  /**
   * Returns the meta object for class '{@link org.xtext.unq.planificador.pdm.Planificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planificacion</em>'.
   * @see org.xtext.unq.planificador.pdm.Planificacion
   * @generated
   */
  EClass getPlanificacion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Planificacion#getSemestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Semestre</em>'.
   * @see org.xtext.unq.planificador.pdm.Planificacion#getSemestre()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Semestre();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.unq.planificador.pdm.Planificacion#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias</em>'.
   * @see org.xtext.unq.planificador.pdm.Planificacion#getMaterias()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Materias();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.unq.planificador.pdm.Planificacion#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horarios</em>'.
   * @see org.xtext.unq.planificador.pdm.Planificacion#getHorarios()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Horarios();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PdmFactory getPdmFactory();

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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.ModelImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getModel()
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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.ProfesorImpl <em>Profesor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.ProfesorImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getProfesor()
     * @generated
     */
    EClass PROFESOR = eINSTANCE.getProfesor();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__NOMBRE = eINSTANCE.getProfesor_Nombre();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.HoraImpl <em>Hora</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.HoraImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getHora()
     * @generated
     */
    EClass HORA = eINSTANCE.getHora();

    /**
     * The meta object literal for the '<em><b>Hora</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORA__HORA = eINSTANCE.getHora_Hora();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.MateriaImpl <em>Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.MateriaImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getMateria()
     * @generated
     */
    EClass MATERIA = eINSTANCE.getMateria();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__NOMBRE = eINSTANCE.getMateria_Nombre();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.AulaImpl <em>Aula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.AulaImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getAula()
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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.CargaHorariaImpl <em>Carga Horaria</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.CargaHorariaImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getCargaHoraria()
     * @generated
     */
    EClass CARGA_HORARIA = eINSTANCE.getCargaHoraria();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARGA_HORARIA__TIPO = eINSTANCE.getCargaHoraria_Tipo();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.CargaHorariaDocenteImpl <em>Carga Horaria Docente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.CargaHorariaDocenteImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getCargaHorariaDocente()
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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl <em>Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.HorarioImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getHorario()
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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.SemestreImpl <em>Semestre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.SemestreImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getSemestre()
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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.DiaImpl <em>Dia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.DiaImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getDia()
     * @generated
     */
    EClass DIA = eINSTANCE.getDia();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIA__DIA = eINSTANCE.getDia_Dia();

    /**
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.HorariosImpl <em>Horarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.HorariosImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getHorarios()
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
     * The meta object literal for the '{@link org.xtext.unq.planificador.pdm.impl.PlanificacionImpl <em>Planificacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.unq.planificador.pdm.impl.PlanificacionImpl
     * @see org.xtext.unq.planificador.pdm.impl.PdmPackageImpl#getPlanificacion()
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

  }

} //PdmPackage
