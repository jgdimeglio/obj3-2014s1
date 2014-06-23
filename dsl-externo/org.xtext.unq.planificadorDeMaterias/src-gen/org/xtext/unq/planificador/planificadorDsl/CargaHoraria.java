/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carga Horaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.CargaHoraria#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.CargaHoraria#getDias <em>Dias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getCargaHoraria()
 * @model
 * @generated
 */
public interface CargaHoraria extends EObject
{
  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getCargaHoraria_Tipo()
   * @model unique="false"
   * @generated
   */
  EList<String> getTipo();

  /**
   * Returns the value of the '<em><b>Dias</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias</em>' attribute list.
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getCargaHoraria_Dias()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getDias();

} // CargaHoraria
