/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Profesor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Profesor#getDedicacion <em>Dedicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getProfesor()
 * @model
 * @generated
 */
public interface Profesor extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getProfesor_Nombre()
   * @model unique="false"
   * @generated
   */
  EList<String> getNombre();

  /**
   * Returns the value of the '<em><b>Dedicacion</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dedicacion</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dedicacion</em>' attribute list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getProfesor_Dedicacion()
   * @model unique="false"
   * @generated
   */
  EList<String> getDedicacion();

} // Profesor
