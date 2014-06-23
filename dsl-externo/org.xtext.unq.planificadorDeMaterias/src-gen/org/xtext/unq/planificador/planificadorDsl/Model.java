/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getProfesors <em>Profesors</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getHoras <em>Horas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getAulas <em>Aulas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getCargasHorarias <em>Cargas Horarias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getCargasHorariasDocentes <em>Cargas Horarias Docentes</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getHorarios <em>Horarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getDias <em>Dias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Model#getPlanificaciones <em>Planificaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Profesors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Profesor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profesors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profesors</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Profesors()
   * @model containment="true"
   * @generated
   */
  EList<Profesor> getProfesors();

  /**
   * Returns the value of the '<em><b>Horas</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Hora}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horas</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Horas()
   * @model containment="true"
   * @generated
   */
  EList<Hora> getHoras();

  /**
   * Returns the value of the '<em><b>Materias</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Materia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materias</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Materias()
   * @model containment="true"
   * @generated
   */
  EList<Materia> getMaterias();

  /**
   * Returns the value of the '<em><b>Aulas</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Aula}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aulas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aulas</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Aulas()
   * @model containment="true"
   * @generated
   */
  EList<Aula> getAulas();

  /**
   * Returns the value of the '<em><b>Cargas Horarias</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.CargaHoraria}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cargas Horarias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cargas Horarias</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_CargasHorarias()
   * @model containment="true"
   * @generated
   */
  EList<CargaHoraria> getCargasHorarias();

  /**
   * Returns the value of the '<em><b>Cargas Horarias Docentes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.CargaHorariaDocente}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cargas Horarias Docentes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cargas Horarias Docentes</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_CargasHorariasDocentes()
   * @model containment="true"
   * @generated
   */
  EList<CargaHorariaDocente> getCargasHorariasDocentes();

  /**
   * Returns the value of the '<em><b>Horarios</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horarios</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Horarios()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getHorarios();

  /**
   * Returns the value of the '<em><b>Dias</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Dias()
   * @model containment="true"
   * @generated
   */
  EList<Dia> getDias();

  /**
   * Returns the value of the '<em><b>Semestre</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Semestre}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semestre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semestre</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Semestre()
   * @model containment="true"
   * @generated
   */
  EList<Semestre> getSemestre();

  /**
   * Returns the value of the '<em><b>Planificaciones</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDsl.Planificacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Planificaciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planificaciones</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getModel_Planificaciones()
   * @model containment="true"
   * @generated
   */
  EList<Planificacion> getPlanificaciones();

} // Model
