/**
 */
package org.xtext.unq.planificador.pdm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horarios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.Horarios#getHorarios <em>Horarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.pdm.PdmPackage#getHorarios()
 * @model
 * @generated
 */
public interface Horarios extends EObject
{
  /**
   * Returns the value of the '<em><b>Horarios</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.pdm.Horario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horarios</em>' containment reference list.
   * @see org.xtext.unq.planificador.pdm.PdmPackage#getHorarios_Horarios()
   * @model containment="true"
   * @generated
   */
  EList<Horario> getHorarios();

} // Horarios
