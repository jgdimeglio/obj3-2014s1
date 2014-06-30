/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getMateria <em>Materia</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getAsignacion()
 * @model
 * @generated
 */
public interface Asignacion extends EObject
{
  /**
   * Returns the value of the '<em><b>Dia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia</em>' containment reference.
   * @see #setDia(Dia)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getAsignacion_Dia()
   * @model containment="true"
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getDia <em>Dia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' containment reference.
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Materia</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materia</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materia</em>' containment reference.
   * @see #setMateria(Materia)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getAsignacion_Materia()
   * @model containment="true"
   * @generated
   */
  Materia getMateria();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion#getMateria <em>Materia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' containment reference.
   * @see #getMateria()
   * @generated
   */
  void setMateria(Materia value);

} // Asignacion
