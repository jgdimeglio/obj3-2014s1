/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dia Horario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario#getDiaPuede <em>Dia Puede</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario#getHorario <em>Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDiaHorario()
 * @model
 * @generated
 */
public interface DiaHorario extends EObject
{
  /**
   * Returns the value of the '<em><b>Dia Puede</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia Puede</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia Puede</em>' containment reference.
   * @see #setDiaPuede(Dia)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDiaHorario_DiaPuede()
   * @model containment="true"
   * @generated
   */
  Dia getDiaPuede();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario#getDiaPuede <em>Dia Puede</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia Puede</em>' containment reference.
   * @see #getDiaPuede()
   * @generated
   */
  void setDiaPuede(Dia value);

  /**
   * Returns the value of the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario</em>' containment reference.
   * @see #setHorario(Horario)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getDiaHorario_Horario()
   * @model containment="true"
   * @generated
   */
  Horario getHorario();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario#getHorario <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario</em>' containment reference.
   * @see #getHorario()
   * @generated
   */
  void setHorario(Horario value);

} // DiaHorario
