/**
 */
package org.xtext.unq.planificador.pdm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.unq.planificador.pdm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdmFactoryImpl extends EFactoryImpl implements PdmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PdmFactory init()
  {
    try
    {
      PdmFactory thePdmFactory = (PdmFactory)EPackage.Registry.INSTANCE.getEFactory(PdmPackage.eNS_URI);
      if (thePdmFactory != null)
      {
        return thePdmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PdmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdmFactoryImpl()
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
      case PdmPackage.MODEL: return createModel();
      case PdmPackage.PROFESOR: return createProfesor();
      case PdmPackage.HORA: return createHora();
      case PdmPackage.MATERIA: return createMateria();
      case PdmPackage.AULA: return createAula();
      case PdmPackage.CARGA_HORARIA: return createCargaHoraria();
      case PdmPackage.CARGA_HORARIA_DOCENTE: return createCargaHorariaDocente();
      case PdmPackage.HORARIO: return createHorario();
      case PdmPackage.SEMESTRE: return createSemestre();
      case PdmPackage.DIA: return createDia();
      case PdmPackage.HORARIOS: return createHorarios();
      case PdmPackage.PLANIFICACION: return createPlanificacion();
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
  public PdmPackage getPdmPackage()
  {
    return (PdmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PdmPackage getPackage()
  {
    return PdmPackage.eINSTANCE;
  }

} //PdmFactoryImpl
