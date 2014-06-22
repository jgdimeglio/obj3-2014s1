/**
 */
package org.xtext.unq.planificador.pdm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.Semestre#getAnho <em>Anho</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.Semestre#getNumero <em>Numero</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.pdm.PdmPackage#getSemestre()
 * @model
 * @generated
 */
public interface Semestre extends EObject
{
  /**
   * Returns the value of the '<em><b>Anho</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anho</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anho</em>' attribute.
   * @see #setAnho(int)
   * @see org.xtext.unq.planificador.pdm.PdmPackage#getSemestre_Anho()
   * @model
   * @generated
   */
  int getAnho();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.pdm.Semestre#getAnho <em>Anho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anho</em>' attribute.
   * @see #getAnho()
   * @generated
   */
  void setAnho(int value);

  /**
   * Returns the value of the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numero</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numero</em>' attribute.
   * @see #setNumero(int)
   * @see org.xtext.unq.planificador.pdm.PdmPackage#getSemestre_Numero()
   * @model
   * @generated
   */
  int getNumero();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.pdm.Semestre#getNumero <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numero</em>' attribute.
   * @see #getNumero()
   * @generated
   */
  void setNumero(int value);

} // Semestre
