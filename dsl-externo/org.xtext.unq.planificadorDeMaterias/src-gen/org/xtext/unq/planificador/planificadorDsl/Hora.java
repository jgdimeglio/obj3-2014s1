/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hora</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Hora#getHora <em>Hora</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getHora()
 * @model
 * @generated
 */
public interface Hora extends EObject
{
  /**
   * Returns the value of the '<em><b>Hora</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora</em>' attribute list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getHora_Hora()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getHora();

} // Hora
