/**
 */
package org.xtext.unq.planificador.planificadorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carga Horaria Docente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.CargaHorariaDocente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.CargaHorariaDocente#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getCargaHorariaDocente()
 * @model
 * @generated
 */
public interface CargaHorariaDocente extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' containment reference.
   * @see #setNombre(Profesor)
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getCargaHorariaDocente_Nombre()
   * @model containment="true"
   * @generated
   */
  Profesor getNombre();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDsl.CargaHorariaDocente#getNombre <em>Nombre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' containment reference.
   * @see #getNombre()
   * @generated
   */
  void setNombre(Profesor value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(CargaHoraria)
   * @see org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage#getCargaHorariaDocente_Tipo()
   * @model containment="true"
   * @generated
   */
  CargaHoraria getTipo();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDsl.CargaHorariaDocente#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(CargaHoraria value);

} // CargaHorariaDocente
