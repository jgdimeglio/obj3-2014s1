/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carga Horaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getCantHoras <em>Cant Horas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDias <em>Dias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getCargaHoraria()
 * @model
 * @generated
 */
public interface CargaHoraria extends EObject
{
  /**
   * Returns the value of the '<em><b>Cant Horas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cant Horas</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cant Horas</em>' attribute.
   * @see #setCantHoras(int)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getCargaHoraria_CantHoras()
   * @model
   * @generated
   */
  int getCantHoras();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getCantHoras <em>Cant Horas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cant Horas</em>' attribute.
   * @see #getCantHoras()
   * @generated
   */
  void setCantHoras(int value);

  /**
   * Returns the value of the '<em><b>Dias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias</em>' attribute.
   * @see #setDias(int)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getCargaHoraria_Dias()
   * @model
   * @generated
   */
  int getDias();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDias <em>Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dias</em>' attribute.
   * @see #getDias()
   * @generated
   */
  void setDias(int value);

} // CargaHoraria
