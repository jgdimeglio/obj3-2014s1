/**
 */
package org.xtext.unq.planificador.pdm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.Materia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.Materia#getCargaHoraria <em>Carga Horaria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.pdm.PdmPackage#getMateria()
 * @model
 * @generated
 */
public interface Materia extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute list.
   * @see org.xtext.unq.planificador.pdm.PdmPackage#getMateria_Nombre()
   * @model unique="false"
   * @generated
   */
  EList<String> getNombre();

  /**
   * Returns the value of the '<em><b>Carga Horaria</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unq.planificador.pdm.CargaHoraria}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Carga Horaria</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Carga Horaria</em>' containment reference list.
   * @see org.xtext.unq.planificador.pdm.PdmPackage#getMateria_CargaHoraria()
   * @model containment="true"
   * @generated
   */
  EList<CargaHoraria> getCargaHoraria();

} // Materia
