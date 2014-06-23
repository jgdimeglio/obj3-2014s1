/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurso Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getRecursoMateria()
 * @model
 * @generated
 */
public interface RecursoMateria extends EObject
{
  /**
   * Returns the value of the '<em><b>Materia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materia</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materia</em>' containment reference.
   * @see #setMateria(Materia)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getRecursoMateria_Materia()
   * @model containment="true"
   * @generated
   */
  Materia getMateria();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria#getMateria <em>Materia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' containment reference.
   * @see #getMateria()
   * @generated
   */
  void setMateria(Materia value);

  /**
   * Returns the value of the '<em><b>Recursos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recursos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursos</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getRecursoMateria_Recursos()
   * @model containment="true"
   * @generated
   */
  EList<Recurso> getRecursos();

} // RecursoMateria
