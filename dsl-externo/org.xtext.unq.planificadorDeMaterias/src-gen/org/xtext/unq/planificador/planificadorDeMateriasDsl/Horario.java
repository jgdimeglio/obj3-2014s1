/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDesde <em>Desde</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getHasta <em>Hasta</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getHorario()
 * @model
 * @generated
 */
public interface Horario extends EObject
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
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getHorario_Dia()
   * @model containment="true"
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDia <em>Dia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' containment reference.
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Desde</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desde</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desde</em>' containment reference.
   * @see #setDesde(Hora)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getHorario_Desde()
   * @model containment="true"
   * @generated
   */
  Hora getDesde();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getDesde <em>Desde</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desde</em>' containment reference.
   * @see #getDesde()
   * @generated
   */
  void setDesde(Hora value);

  /**
   * Returns the value of the '<em><b>Hasta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hasta</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hasta</em>' containment reference.
   * @see #setHasta(Hora)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getHorario_Hasta()
   * @model containment="true"
   * @generated
   */
  Hora getHasta();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getHasta <em>Hasta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hasta</em>' containment reference.
   * @see #getHasta()
   * @generated
   */
  void setHasta(Hora value);

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
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getHorario_Materia()
   * @model containment="true"
   * @generated
   */
  Materia getMateria();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getMateria <em>Materia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' containment reference.
   * @see #getMateria()
   * @generated
   */
  void setMateria(Materia value);

  /**
   * Returns the value of the '<em><b>Aula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aula</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aula</em>' containment reference.
   * @see #setAula(Aula)
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#getHorario_Aula()
   * @model containment="true"
   * @generated
   */
  Aula getAula();

  /**
   * Sets the value of the '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario#getAula <em>Aula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aula</em>' containment reference.
   * @see #getAula()
   * @generated
   */
  void setAula(Aula value);

} // Horario
