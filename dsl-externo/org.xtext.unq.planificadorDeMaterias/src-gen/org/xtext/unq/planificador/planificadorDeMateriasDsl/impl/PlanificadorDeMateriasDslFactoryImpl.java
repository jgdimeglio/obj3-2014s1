/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanificadorDeMateriasDslFactoryImpl extends EFactoryImpl implements PlanificadorDeMateriasDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlanificadorDeMateriasDslFactory init()
  {
    try
    {
      PlanificadorDeMateriasDslFactory thePlanificadorDeMateriasDslFactory = (PlanificadorDeMateriasDslFactory)EPackage.Registry.INSTANCE.getEFactory(PlanificadorDeMateriasDslPackage.eNS_URI);
      if (thePlanificadorDeMateriasDslFactory != null)
      {
        return thePlanificadorDeMateriasDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlanificadorDeMateriasDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificadorDeMateriasDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PlanificadorDeMateriasDslPackage.MODEL: return createModel();
      case PlanificadorDeMateriasDslPackage.PROFESOR: return createProfesor();
      case PlanificadorDeMateriasDslPackage.HORA: return createHora();
      case PlanificadorDeMateriasDslPackage.MATERIA: return createMateria();
      case PlanificadorDeMateriasDslPackage.AULA: return createAula();
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA: return createCargaHoraria();
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE: return createCargaHorariaDocente();
      case PlanificadorDeMateriasDslPackage.HORARIO: return createHorario();
      case PlanificadorDeMateriasDslPackage.SEMESTRE: return createSemestre();
      case PlanificadorDeMateriasDslPackage.DIA: return createDia();
      case PlanificadorDeMateriasDslPackage.HORARIOS: return createHorarios();
      case PlanificadorDeMateriasDslPackage.PLANIFICACION: return createPlanificacion();
      case PlanificadorDeMateriasDslPackage.RECURSO: return createRecurso();
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA: return createRecursoMateria();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profesor createProfesor()
  {
    ProfesorImpl profesor = new ProfesorImpl();
    return profesor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hora createHora()
  {
    HoraImpl hora = new HoraImpl();
    return hora;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia createMateria()
  {
    MateriaImpl materia = new MateriaImpl();
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula createAula()
  {
    AulaImpl aula = new AulaImpl();
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CargaHoraria createCargaHoraria()
  {
    CargaHorariaImpl cargaHoraria = new CargaHorariaImpl();
    return cargaHoraria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CargaHorariaDocente createCargaHorariaDocente()
  {
    CargaHorariaDocenteImpl cargaHorariaDocente = new CargaHorariaDocenteImpl();
    return cargaHorariaDocente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario createHorario()
  {
    HorarioImpl horario = new HorarioImpl();
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Semestre createSemestre()
  {
    SemestreImpl semestre = new SemestreImpl();
    return semestre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia createDia()
  {
    DiaImpl dia = new DiaImpl();
    return dia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horarios createHorarios()
  {
    HorariosImpl horarios = new HorariosImpl();
    return horarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Planificacion createPlanificacion()
  {
    PlanificacionImpl planificacion = new PlanificacionImpl();
    return planificacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recurso createRecurso()
  {
    RecursoImpl recurso = new RecursoImpl();
    return recurso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecursoMateria createRecursoMateria()
  {
    RecursoMateriaImpl recursoMateria = new RecursoMateriaImpl();
    return recursoMateria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificadorDeMateriasDslPackage getPlanificadorDeMateriasDslPackage()
  {
    return (PlanificadorDeMateriasDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlanificadorDeMateriasDslPackage getPackage()
  {
    return PlanificadorDeMateriasDslPackage.eINSTANCE;
  }

} //PlanificadorDeMateriasDslFactoryImpl
