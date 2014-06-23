/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage
 * @generated
 */
public class PlanificadorDeMateriasDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlanificadorDeMateriasDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificadorDeMateriasDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PlanificadorDeMateriasDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanificadorDeMateriasDslSwitch<Adapter> modelSwitch =
    new PlanificadorDeMateriasDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseProfesor(Profesor object)
      {
        return createProfesorAdapter();
      }
      @Override
      public Adapter caseHora(Hora object)
      {
        return createHoraAdapter();
      }
      @Override
      public Adapter caseDedicacion(Dedicacion object)
      {
        return createDedicacionAdapter();
      }
      @Override
      public Adapter caseSIMPLE(SIMPLE object)
      {
        return createSIMPLEAdapter();
      }
      @Override
      public Adapter caseSEMI(SEMI object)
      {
        return createSEMIAdapter();
      }
      @Override
      public Adapter caseEXCLUSIVA(EXCLUSIVA object)
      {
        return createEXCLUSIVAAdapter();
      }
      @Override
      public Adapter caseMateria(Materia object)
      {
        return createMateriaAdapter();
      }
      @Override
      public Adapter caseAula(Aula object)
      {
        return createAulaAdapter();
      }
      @Override
      public Adapter caseCargaHoraria(CargaHoraria object)
      {
        return createCargaHorariaAdapter();
      }
      @Override
      public Adapter caseCargaHorariaDocente(CargaHorariaDocente object)
      {
        return createCargaHorariaDocenteAdapter();
      }
      @Override
      public Adapter caseHorario(Horario object)
      {
        return createHorarioAdapter();
      }
      @Override
      public Adapter caseSemestre(Semestre object)
      {
        return createSemestreAdapter();
      }
      @Override
      public Adapter caseDia(Dia object)
      {
        return createDiaAdapter();
      }
      @Override
      public Adapter caseLunes(Lunes object)
      {
        return createLunesAdapter();
      }
      @Override
      public Adapter caseMartes(Martes object)
      {
        return createMartesAdapter();
      }
      @Override
      public Adapter caseMiercoles(Miercoles object)
      {
        return createMiercolesAdapter();
      }
      @Override
      public Adapter caseJueves(Jueves object)
      {
        return createJuevesAdapter();
      }
      @Override
      public Adapter caseViernes(Viernes object)
      {
        return createViernesAdapter();
      }
      @Override
      public Adapter caseSabado(Sabado object)
      {
        return createSabadoAdapter();
      }
      @Override
      public Adapter caseDias(Dias object)
      {
        return createDiasAdapter();
      }
      @Override
      public Adapter caseHorarios(Horarios object)
      {
        return createHorariosAdapter();
      }
      @Override
      public Adapter casePlanificacion(Planificacion object)
      {
        return createPlanificacionAdapter();
      }
      @Override
      public Adapter caseRecurso(Recurso object)
      {
        return createRecursoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor
   * @generated
   */
  public Adapter createProfesorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora <em>Hora</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora
   * @generated
   */
  public Adapter createHoraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Dedicacion
   * @generated
   */
  public Adapter createDedicacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.SIMPLE <em>SIMPLE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.SIMPLE
   * @generated
   */
  public Adapter createSIMPLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.SEMI <em>SEMI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.SEMI
   * @generated
   */
  public Adapter createSEMIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.EXCLUSIVA <em>EXCLUSIVA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.EXCLUSIVA
   * @generated
   */
  public Adapter createEXCLUSIVAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia
   * @generated
   */
  public Adapter createMateriaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula
   * @generated
   */
  public Adapter createAulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria <em>Carga Horaria</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria
   * @generated
   */
  public Adapter createCargaHorariaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente <em>Carga Horaria Docente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente
   * @generated
   */
  public Adapter createCargaHorariaDocenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario
   * @generated
   */
  public Adapter createHorarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre
   * @generated
   */
  public Adapter createSemestreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia
   * @generated
   */
  public Adapter createDiaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Lunes <em>Lunes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Lunes
   * @generated
   */
  public Adapter createLunesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Martes <em>Martes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Martes
   * @generated
   */
  public Adapter createMartesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Miercoles <em>Miercoles</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Miercoles
   * @generated
   */
  public Adapter createMiercolesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Jueves <em>Jueves</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Jueves
   * @generated
   */
  public Adapter createJuevesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Viernes <em>Viernes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Viernes
   * @generated
   */
  public Adapter createViernesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Sabado <em>Sabado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Sabado
   * @generated
   */
  public Adapter createSabadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Dias <em>Dias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Dias
   * @generated
   */
  public Adapter createDiasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios
   * @generated
   */
  public Adapter createHorariosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion
   * @generated
   */
  public Adapter createPlanificacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso <em>Recurso</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso
   * @generated
   */
  public Adapter createRecursoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PlanificadorDeMateriasDslAdapterFactory
