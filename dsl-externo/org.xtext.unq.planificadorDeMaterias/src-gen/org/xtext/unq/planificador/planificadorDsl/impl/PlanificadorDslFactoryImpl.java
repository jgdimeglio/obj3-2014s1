/**
 */
package org.xtext.unq.planificador.planificadorDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.unq.planificador.planificadorDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanificadorDslFactoryImpl extends EFactoryImpl implements PlanificadorDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlanificadorDslFactory init()
  {
    try
    {
      PlanificadorDslFactory thePlanificadorDslFactory = (PlanificadorDslFactory)EPackage.Registry.INSTANCE.getEFactory(PlanificadorDslPackage.eNS_URI);
      if (thePlanificadorDslFactory != null)
      {
        return thePlanificadorDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlanificadorDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificadorDslFactoryImpl()
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
      case PlanificadorDslPackage.MODEL: return createModel();
      case PlanificadorDslPackage.PROFESOR: return createProfesor();
      case PlanificadorDslPackage.HORA: return createHora();
      case PlanificadorDslPackage.MATERIA: return createMateria();
      case PlanificadorDslPackage.AULA: return createAula();
      case PlanificadorDslPackage.CARGA_HORARIA: return createCargaHoraria();
      case PlanificadorDslPackage.CARGA_HORARIA_DOCENTE: return createCargaHorariaDocente();
      case PlanificadorDslPackage.HORARIO: return createHorario();
      case PlanificadorDslPackage.SEMESTRE: return createSemestre();
      case PlanificadorDslPackage.DIA: return createDia();
      case PlanificadorDslPackage.HORARIOS: return createHorarios();
      case PlanificadorDslPackage.PLANIFICACION: return createPlanificacion();
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
  public PlanificadorDslPackage getPlanificadorDslPackage()
  {
    return (PlanificadorDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlanificadorDslPackage getPackage()
  {
    return PlanificadorDslPackage.eINSTANCE;
  }

} //PlanificadorDslFactoryImpl
