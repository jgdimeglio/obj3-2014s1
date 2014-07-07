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
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getDiasNoPuede <em>Dias No Puede</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad#getDiasHorario <em>Dias Horario</em>}</li>
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
   * Returns the value of the '<em><b>Dias No Puede</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias No Puede</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias No Puede</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDisponibilidad_DiasNoPuede()
   * @model containment="true"
   * @generated
   */
  EList<Dia> getDiasNoPuede();

  /**
   * Returns the value of the '<em><b>Dias Horario</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias Horario</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias Horario</em>' containment reference list.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDisponibilidad_DiasHorario()
   * @model containment="true"
   * @generated
   */
  EList<DiaHorario> getDiasHorario();

} // Disponibilidad
