/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage
 * @generated
 */
public interface PlanificadorDeMateriasDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanificadorDeMateriasDslFactory eINSTANCE = org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificadorDeMateriasDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Profesor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Profesor</em>'.
   * @generated
   */
  Profesor createProfesor();

  /**
   * Returns a new object of class '<em>Hora</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hora</em>'.
   * @generated
   */
  Hora createHora();

  /**
   * Returns a new object of class '<em>Materia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Materia</em>'.
   * @generated
   */
  Materia createMateria();

  /**
   * Returns a new object of class '<em>Aula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aula</em>'.
   * @generated
   */
  Aula createAula();

  /**
   * Returns a new object of class '<em>Carga Horaria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Carga Horaria</em>'.
   * @generated
   */
  CargaHoraria createCargaHoraria();

  /**
   * Returns a new object of class '<em>Carga Horaria Docente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Carga Horaria Docente</em>'.
   * @generated
   */
  CargaHorariaDocente createCargaHorariaDocente();

  /**
   * Returns a new object of class '<em>Horario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horario</em>'.
   * @generated
   */
  Horario createHorario();

  /**
   * Returns a new object of class '<em>Semestre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semestre</em>'.
   * @generated
   */
  Semestre createSemestre();

  /**
   * Returns a new object of class '<em>Dia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dia</em>'.
   * @generated
   */
  Dia createDia();

  /**
   * Returns a new object of class '<em>Horarios</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horarios</em>'.
   * @generated
   */
  Horarios createHorarios();

  /**
   * Returns a new object of class '<em>Planificacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Planificacion</em>'.
   * @generated
   */
  Planificacion createPlanificacion();

  /**
   * Returns a new object of class '<em>Recurso</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recurso</em>'.
   * @generated
   */
  Recurso createRecurso();

  /**
   * Returns a new object of class '<em>Recurso Materia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recurso Materia</em>'.
   * @generated
   */
  RecursoMateria createRecursoMateria();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PlanificadorDeMateriasDslPackage getPlanificadorDeMateriasDslPackage();

} //PlanificadorDeMateriasDslFactory
