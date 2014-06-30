/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disponibilidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getDias <em>Dias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDisponibilidad()
 * @model
 * @generated
 */
public interface Disponibilidad extends EObject
{
  /**
   * Returns the value of the '<em><b>Dias</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDisponibilidad_Dias()
   * @model containment="true"
   * @generated
   */
  EList<Dia> getDias();

} // Disponibilidad
