/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

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
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getElementosPrimarios <em>Elementos Primarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getElementosSecundarios <em>Elementos Secundarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model#getPlanificacion <em>Planificacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elementos Primarios</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos Primarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementos Primarios</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getModel_ElementosPrimarios()
   * @model containment="true"
   * @generated
   */
  EList<ElementosPrimarios> getElementosPrimarios();

  /**
   * Returns the value of the '<em><b>Elementos Secundarios</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos Secundarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementos Secundarios</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getModel_ElementosSecundarios()
   * @model containment="true"
   * @generated
   */
  EList<ElementosSecundarios> getElementosSecundarios();

  /**
   * Returns the value of the '<em><b>Planificacion</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Planificacion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Planificacion</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getModel_Planificacion()
   * @model containment="true"
   * @generated
   */
  EList<Planificacion> getPlanificacion();

} // Model
