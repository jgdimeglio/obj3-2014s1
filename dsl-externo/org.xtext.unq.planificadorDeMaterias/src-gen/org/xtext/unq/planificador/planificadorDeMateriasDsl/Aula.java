/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getAula()
 * @model
 * @generated
 */
public interface Aula extends EObject
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
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getAula_Nombre()
   * @model unique="false"
   * @generated
   */
  EList<String> getNombre();

} // Aula
