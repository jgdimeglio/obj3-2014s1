/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage
 * @generated
 */
public class PlanificadorDeMateriasDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlanificadorDeMateriasDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificadorDeMateriasDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PlanificadorDeMateriasDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PlanificadorDeMateriasDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.PROFESOR:
      {
        Profesor profesor = (Profesor)theEObject;
        T result = caseProfesor(profesor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.HORA:
      {
        Hora hora = (Hora)theEObject;
        T result = caseHora(hora);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.MATERIA:
      {
        Materia materia = (Materia)theEObject;
        T result = caseMateria(materia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.AULA:
      {
        Aula aula = (Aula)theEObject;
        T result = caseAula(aula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA:
      {
        CargaHoraria cargaHoraria = (CargaHoraria)theEObject;
        T result = caseCargaHoraria(cargaHoraria);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE:
      {
        CargaHorariaDocente cargaHorariaDocente = (CargaHorariaDocente)theEObject;
        T result = caseCargaHorariaDocente(cargaHorariaDocente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.HORARIO:
      {
        Horario horario = (Horario)theEObject;
        T result = caseHorario(horario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.SEMESTRE:
      {
        Semestre semestre = (Semestre)theEObject;
        T result = caseSemestre(semestre);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.DIA:
      {
        Dia dia = (Dia)theEObject;
        T result = caseDia(dia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.HORARIOS:
      {
        Horarios horarios = (Horarios)theEObject;
        T result = caseHorarios(horarios);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.PLANIFICACION:
      {
        Planificacion planificacion = (Planificacion)theEObject;
        T result = casePlanificacion(planificacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.RECURSO:
      {
        Recurso recurso = (Recurso)theEObject;
        T result = caseRecurso(recurso);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA:
      {
        RecursoMateria recursoMateria = (RecursoMateria)theEObject;
        T result = caseRecursoMateria(recursoMateria);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Profesor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Profesor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProfesor(Profesor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hora</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hora</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHora(Hora object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Materia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Materia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMateria(Materia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAula(Aula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Carga Horaria</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Carga Horaria</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCargaHoraria(CargaHoraria object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Carga Horaria Docente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Carga Horaria Docente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCargaHorariaDocente(CargaHorariaDocente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorario(Horario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semestre</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semestre</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemestre(Semestre object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDia(Dia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horarios</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horarios</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorarios(Horarios object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planificacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planificacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlanificacion(Planificacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recurso</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recurso</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecurso(Recurso object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recurso Materia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recurso Materia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecursoMateria(RecursoMateria object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PlanificadorDeMateriasDslSwitch
