/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getCargaHoraria <em>Carga Horaria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getMateria()
 * @model
 * @generated
 */
public interface Materia extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getMateria_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Carga Horaria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Carga Horaria</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Carga Horaria</em>' containment reference.
   * @see #setCargaHoraria(CargaHoraria)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getMateria_CargaHoraria()
   * @model containment="true"
   * @generated
   */
  CargaHoraria getCargaHoraria();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia#getCargaHoraria <em>Carga Horaria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Carga Horaria</em>' containment reference.
   * @see #getCargaHoraria()
   * @generated
   */
  void setCargaHoraria(CargaHoraria value);

} // Materia
