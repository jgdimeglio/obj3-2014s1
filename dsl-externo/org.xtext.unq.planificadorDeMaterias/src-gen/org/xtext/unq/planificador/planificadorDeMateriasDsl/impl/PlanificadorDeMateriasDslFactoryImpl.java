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
      case PlanificadorDeMateriasDslPackage.ELEMENTOS_PRIMARIOS: return createElementosPrimarios();
      case PlanificadorDeMateriasDslPackage.ELEMENTOS_SECUNDARIOS: return createElementosSecundarios();
      case PlanificadorDeMateriasDslPackage.PROFESOR: return createProfesor();
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD: return createDisponibilidad();
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO: return createDiaHorario();
      case PlanificadorDeMateriasDslPackage.DEDICACION: return createDedicacion();
      case PlanificadorDeMateriasDslPackage.AULA: return createAula();
      case PlanificadorDeMateriasDslPackage.MATERIA: return createMateria();
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA: return createCargaHoraria();
      case PlanificadorDeMateriasDslPackage.HORARIO: return createHorario();
      case PlanificadorDeMateriasDslPackage.SEMESTRE: return createSemestre();
      case PlanificadorDeMateriasDslPackage.DIA: return createDia();
      case PlanificadorDeMateriasDslPackage.ASIGNACION: return createAsignacion();
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO: return createAulaHorario();
      case PlanificadorDeMateriasDslPackage.PLANIFICACION: return createPlanificacion();
      case PlanificadorDeMateriasDslPackage.RECURSO: return createRecurso();
      case PlanificadorDeMateriasDslPackage.SIMPLE: return createSIMPLE();
      case PlanificadorDeMateriasDslPackage.SEMI: return createSEMI();
      case PlanificadorDeMateriasDslPackage.EXCLUSIVA: return createEXCLUSIVA();
      case PlanificadorDeMateriasDslPackage.LUNES: return createLunes();
      case PlanificadorDeMateriasDslPackage.MARTES: return createMartes();
      case PlanificadorDeMateriasDslPackage.MIERCOLES: return createMiercoles();
      case PlanificadorDeMateriasDslPackage.JUEVES: return createJueves();
      case PlanificadorDeMateriasDslPackage.VIERNES: return createViernes();
      case PlanificadorDeMateriasDslPackage.SABADO: return createSabado();
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
  public ElementosPrimarios createElementosPrimarios()
  {
    ElementosPrimariosImpl elementosPrimarios = new ElementosPrimariosImpl();
    return elementosPrimarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementosSecundarios createElementosSecundarios()
  {
    ElementosSecundariosImpl elementosSecundarios = new ElementosSecundariosImpl();
    return elementosSecundarios;
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
  public Disponibilidad createDisponibilidad()
  {
    DisponibilidadImpl disponibilidad = new DisponibilidadImpl();
    return disponibilidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiaHorario createDiaHorario()
  {
    DiaHorarioImpl diaHorario = new DiaHorarioImpl();
    return diaHorario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dedicacion createDedicacion()
  {
    DedicacionImpl dedicacion = new DedicacionImpl();
    return dedicacion;
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
  public Asignacion createAsignacion()
  {
    AsignacionImpl asignacion = new AsignacionImpl();
    return asignacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AulaHorario createAulaHorario()
  {
    AulaHorarioImpl aulaHorario = new AulaHorarioImpl();
    return aulaHorario;
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
  public SIMPLE createSIMPLE()
  {
    SIMPLEImpl simple = new SIMPLEImpl();
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SEMI createSEMI()
  {
    SEMIImpl semi = new SEMIImpl();
    return semi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXCLUSIVA createEXCLUSIVA()
  {
    EXCLUSIVAImpl exclusiva = new EXCLUSIVAImpl();
    return exclusiva;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lunes createLunes()
  {
    LunesImpl lunes = new LunesImpl();
    return lunes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Martes createMartes()
  {
    MartesImpl martes = new MartesImpl();
    return martes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Miercoles createMiercoles()
  {
    MiercolesImpl miercoles = new MiercolesImpl();
    return miercoles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jueves createJueves()
  {
    JuevesImpl jueves = new JuevesImpl();
    return jueves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Viernes createViernes()
  {
    ViernesImpl viernes = new ViernesImpl();
    return viernes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sabado createSabado()
  {
    SabadoImpl sabado = new SabadoImpl();
    return sabado;
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
