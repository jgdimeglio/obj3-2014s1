/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Planificacion#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Planificacion#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Planificacion#getHorarios <em>Horarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getPlanificacion()
 * @model
 * @generated
 */
public interface Planificacion extends EObject
{
  /**
   * Returns the value of the '<em><b>Semestre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semestre</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semestre</em>' containment reference.
   * @see #setSemestre(Semestre)
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getPlanificacion_Semestre()
   * @model containment="true"
   * @generated
   */
  Semestre getSemestre();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDsl.Planificacion#getSemestre <em>Semestre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semestre</em>' containment reference.
   * @see #getSemestre()
   * @generated
   */
  void setSemestre(Semestre value);

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
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getPlanificacion_Materias()
   * @model containment="true"
   * @generated
   */
  EList<Materia> getMaterias();

  /**
   * Returns the value of the '<em><b>Horarios</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horarios</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horarios</em>' containment reference.
   * @see #setHorarios(Horarios)
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getPlanificacion_Horarios()
   * @model containment="true"
   * @generated
   */
  Horarios getHorarios();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDsl.Planificacion#getHorarios <em>Horarios</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horarios</em>' containment reference.
   * @see #getHorarios()
   * @generated
   */
  void setHorarios(Horarios value);

} // Planificacion
