/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.Dia#getDia <em>Dia</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getDia()
 * @model
 * @generated
 */
public interface Dia extends EObject
{
  /**
   * Returns the value of the '<em><b>Dia</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia</em>' attribute list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getDia_Dia()
   * @model unique="false"
   * @generated
   */
  EList<String> getDia();

} // Dia
