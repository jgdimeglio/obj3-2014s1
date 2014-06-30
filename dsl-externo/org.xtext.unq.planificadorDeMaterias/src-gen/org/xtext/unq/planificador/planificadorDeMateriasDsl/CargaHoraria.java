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
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDiasSemanales <em>Dias Semanales</em>}</li>
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
   * Returns the value of the '<em><b>Dias Semanales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias Semanales</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias Semanales</em>' attribute.
   * @see #setDiasSemanales(int)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getCargaHoraria_DiasSemanales()
   * @model
   * @generated
   */
  int getDiasSemanales();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria#getDiasSemanales <em>Dias Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dias Semanales</em>' attribute.
   * @see #getDiasSemanales()
   * @generated
   */
  void setDiasSemanales(int value);

} // CargaHoraria
