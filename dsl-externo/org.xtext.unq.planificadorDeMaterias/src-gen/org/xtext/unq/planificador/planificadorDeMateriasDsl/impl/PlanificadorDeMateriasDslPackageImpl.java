/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dedicacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Jueves;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Lunes;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Martes;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Miercoles;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslFactory;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Sabado;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Viernes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanificadorDeMateriasDslPackageImpl extends EPackageImpl implements PlanificadorDeMateriasDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementosPrimariosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementosSecundariosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass profesorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disponibilidadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diaHorarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dedicacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass materiaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cargaHorariaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semestreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aulaHorarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass planificacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recursoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exclusivaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lunesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass martesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass miercolesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass juevesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viernesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sabadoEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PlanificadorDeMateriasDslPackageImpl()
  {
    super(eNS_URI, PlanificadorDeMateriasDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PlanificadorDeMateriasDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PlanificadorDeMateriasDslPackage init()
  {
    if (isInited) return (PlanificadorDeMateriasDslPackage)EPackage.Registry.INSTANCE.getEPackage(PlanificadorDeMateriasDslPackage.eNS_URI);

    // Obtain or create and register package
    PlanificadorDeMateriasDslPackageImpl thePlanificadorDeMateriasDslPackage = (PlanificadorDeMateriasDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlanificadorDeMateriasDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlanificadorDeMateriasDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePlanificadorDeMateriasDslPackage.createPackageContents();

    // Initialize created meta-data
    thePlanificadorDeMateriasDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePlanificadorDeMateriasDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PlanificadorDeMateriasDslPackage.eNS_URI, thePlanificadorDeMateriasDslPackage);
    return thePlanificadorDeMateriasDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_ElementosPrimarios()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_ElementosSecundarios()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Planificacion()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementosPrimarios()
  {
    return elementosPrimariosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementosSecundarios()
  {
    return elementosSecundariosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementosSecundarios_Name()
  {
    return (EAttribute)elementosSecundariosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProfesor()
  {
    return profesorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProfesor_Name()
  {
    return (EAttribute)profesorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProfesor_Dedicacion()
  {
    return (EReference)profesorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProfesor_Disponibilidad()
  {
    return (EReference)profesorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisponibilidad()
  {
    return disponibilidadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisponibilidad_DiasNoPuede()
  {
    return (EReference)disponibilidadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisponibilidad_DiasHorario()
  {
    return (EReference)disponibilidadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiaHorario()
  {
    return diaHorarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiaHorario_DiaPuede()
  {
    return (EReference)diaHorarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiaHorario_Horario()
  {
    return (EReference)diaHorarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDedicacion()
  {
    return dedicacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAula()
  {
    return aulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAula_Capacidad()
  {
    return (EAttribute)aulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAula_Recursos()
  {
    return (EReference)aulaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMateria()
  {
    return materiaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMateria_Name()
  {
    return (EAttribute)materiaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMateria_CargaHoraria()
  {
    return (EReference)materiaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMateria_Recursos()
  {
    return (EReference)materiaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCargaHoraria()
  {
    return cargaHorariaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCargaHoraria_CantHoras()
  {
    return (EAttribute)cargaHorariaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCargaHoraria_DiasSemanales()
  {
    return (EAttribute)cargaHorariaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorario()
  {
    return horarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHorario_Desde()
  {
    return (EAttribute)horarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHorario_Hasta()
  {
    return (EAttribute)horarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSemestre()
  {
    return semestreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSemestre_Anho()
  {
    return (EAttribute)semestreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSemestre_Numero()
  {
    return (EAttribute)semestreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDia()
  {
    return diaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsignacion()
  {
    return asignacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Materia()
  {
    return (EReference)asignacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsignacion_Inscriptos()
  {
    return (EAttribute)asignacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_Profesores()
  {
    return (EReference)asignacionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsignacion_AulaHorarios()
  {
    return (EReference)asignacionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAulaHorario()
  {
    return aulaHorarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAulaHorario_Dia()
  {
    return (EReference)aulaHorarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAulaHorario_Horario()
  {
    return (EReference)aulaHorarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAulaHorario_Aula()
  {
    return (EReference)aulaHorarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlanificacion()
  {
    return planificacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlanificacion_Semestre()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlanificacion_Asignaciones()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecurso()
  {
    return recursoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSIMPLE()
  {
    return simpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSEMI()
  {
    return semiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEXCLUSIVA()
  {
    return exclusivaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLunes()
  {
    return lunesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMartes()
  {
    return martesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMiercoles()
  {
    return miercolesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJueves()
  {
    return juevesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViernes()
  {
    return viernesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSabado()
  {
    return sabadoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanificadorDeMateriasDslFactory getPlanificadorDeMateriasDslFactory()
  {
    return (PlanificadorDeMateriasDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTOS_PRIMARIOS);
    createEReference(modelEClass, MODEL__ELEMENTOS_SECUNDARIOS);
    createEReference(modelEClass, MODEL__PLANIFICACION);

    elementosPrimariosEClass = createEClass(ELEMENTOS_PRIMARIOS);

    elementosSecundariosEClass = createEClass(ELEMENTOS_SECUNDARIOS);
    createEAttribute(elementosSecundariosEClass, ELEMENTOS_SECUNDARIOS__NAME);

    profesorEClass = createEClass(PROFESOR);
    createEAttribute(profesorEClass, PROFESOR__NAME);
    createEReference(profesorEClass, PROFESOR__DEDICACION);
    createEReference(profesorEClass, PROFESOR__DISPONIBILIDAD);

    disponibilidadEClass = createEClass(DISPONIBILIDAD);
    createEReference(disponibilidadEClass, DISPONIBILIDAD__DIAS_NO_PUEDE);
    createEReference(disponibilidadEClass, DISPONIBILIDAD__DIAS_HORARIO);

    diaHorarioEClass = createEClass(DIA_HORARIO);
    createEReference(diaHorarioEClass, DIA_HORARIO__DIA_PUEDE);
    createEReference(diaHorarioEClass, DIA_HORARIO__HORARIO);

    dedicacionEClass = createEClass(DEDICACION);

    aulaEClass = createEClass(AULA);
    createEAttribute(aulaEClass, AULA__CAPACIDAD);
    createEReference(aulaEClass, AULA__RECURSOS);

    materiaEClass = createEClass(MATERIA);
    createEAttribute(materiaEClass, MATERIA__NAME);
    createEReference(materiaEClass, MATERIA__CARGA_HORARIA);
    createEReference(materiaEClass, MATERIA__RECURSOS);

    cargaHorariaEClass = createEClass(CARGA_HORARIA);
    createEAttribute(cargaHorariaEClass, CARGA_HORARIA__CANT_HORAS);
    createEAttribute(cargaHorariaEClass, CARGA_HORARIA__DIAS_SEMANALES);

    horarioEClass = createEClass(HORARIO);
    createEAttribute(horarioEClass, HORARIO__DESDE);
    createEAttribute(horarioEClass, HORARIO__HASTA);

    semestreEClass = createEClass(SEMESTRE);
    createEAttribute(semestreEClass, SEMESTRE__ANHO);
    createEAttribute(semestreEClass, SEMESTRE__NUMERO);

    diaEClass = createEClass(DIA);

    asignacionEClass = createEClass(ASIGNACION);
    createEReference(asignacionEClass, ASIGNACION__MATERIA);
    createEAttribute(asignacionEClass, ASIGNACION__INSCRIPTOS);
    createEReference(asignacionEClass, ASIGNACION__PROFESORES);
    createEReference(asignacionEClass, ASIGNACION__AULA_HORARIOS);

    aulaHorarioEClass = createEClass(AULA_HORARIO);
    createEReference(aulaHorarioEClass, AULA_HORARIO__DIA);
    createEReference(aulaHorarioEClass, AULA_HORARIO__HORARIO);
    createEReference(aulaHorarioEClass, AULA_HORARIO__AULA);

    planificacionEClass = createEClass(PLANIFICACION);
    createEReference(planificacionEClass, PLANIFICACION__SEMESTRE);
    createEReference(planificacionEClass, PLANIFICACION__ASIGNACIONES);

    recursoEClass = createEClass(RECURSO);

    simpleEClass = createEClass(SIMPLE);

    semiEClass = createEClass(SEMI);

    exclusivaEClass = createEClass(EXCLUSIVA);

    lunesEClass = createEClass(LUNES);

    martesEClass = createEClass(MARTES);

    miercolesEClass = createEClass(MIERCOLES);

    juevesEClass = createEClass(JUEVES);

    viernesEClass = createEClass(VIERNES);

    sabadoEClass = createEClass(SABADO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    profesorEClass.getESuperTypes().add(this.getElementosPrimarios());
    aulaEClass.getESuperTypes().add(this.getElementosSecundarios());
    materiaEClass.getESuperTypes().add(this.getElementosPrimarios());
    asignacionEClass.getESuperTypes().add(this.getElementosPrimarios());
    recursoEClass.getESuperTypes().add(this.getElementosSecundarios());
    simpleEClass.getESuperTypes().add(this.getDedicacion());
    semiEClass.getESuperTypes().add(this.getDedicacion());
    exclusivaEClass.getESuperTypes().add(this.getDedicacion());
    lunesEClass.getESuperTypes().add(this.getDia());
    martesEClass.getESuperTypes().add(this.getDia());
    miercolesEClass.getESuperTypes().add(this.getDia());
    juevesEClass.getESuperTypes().add(this.getDia());
    viernesEClass.getESuperTypes().add(this.getDia());
    sabadoEClass.getESuperTypes().add(this.getDia());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_ElementosPrimarios(), this.getElementosPrimarios(), null, "elementosPrimarios", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_ElementosSecundarios(), this.getElementosSecundarios(), null, "elementosSecundarios", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Planificacion(), this.getPlanificacion(), null, "planificacion", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementosPrimariosEClass, ElementosPrimarios.class, "ElementosPrimarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementosSecundariosEClass, ElementosSecundarios.class, "ElementosSecundarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementosSecundarios_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementosSecundarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(profesorEClass, Profesor.class, "Profesor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProfesor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfesor_Dedicacion(), this.getDedicacion(), null, "dedicacion", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfesor_Disponibilidad(), this.getDisponibilidad(), null, "disponibilidad", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disponibilidadEClass, Disponibilidad.class, "Disponibilidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisponibilidad_DiasNoPuede(), this.getDia(), null, "diasNoPuede", null, 0, -1, Disponibilidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisponibilidad_DiasHorario(), this.getDiaHorario(), null, "diasHorario", null, 0, -1, Disponibilidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diaHorarioEClass, DiaHorario.class, "DiaHorario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiaHorario_DiaPuede(), this.getDia(), null, "diaPuede", null, 0, 1, DiaHorario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiaHorario_Horario(), this.getHorario(), null, "horario", null, 0, 1, DiaHorario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dedicacionEClass, Dedicacion.class, "Dedicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aulaEClass, Aula.class, "Aula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAula_Capacidad(), ecorePackage.getEInt(), "capacidad", null, 0, 1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAula_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(materiaEClass, Materia.class, "Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMateria_Name(), ecorePackage.getEString(), "name", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_CargaHoraria(), this.getCargaHoraria(), null, "cargaHoraria", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cargaHorariaEClass, CargaHoraria.class, "CargaHoraria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCargaHoraria_CantHoras(), ecorePackage.getEInt(), "cantHoras", null, 0, 1, CargaHoraria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCargaHoraria_DiasSemanales(), ecorePackage.getEInt(), "diasSemanales", null, 0, 1, CargaHoraria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horarioEClass, Horario.class, "Horario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHorario_Desde(), ecorePackage.getEInt(), "desde", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHorario_Hasta(), ecorePackage.getEInt(), "hasta", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semestreEClass, Semestre.class, "Semestre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSemestre_Anho(), ecorePackage.getEInt(), "anho", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSemestre_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diaEClass, Dia.class, "Dia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asignacionEClass, Asignacion.class, "Asignacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAsignacion_Materia(), this.getMateria(), null, "materia", null, 0, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsignacion_Inscriptos(), ecorePackage.getEInt(), "inscriptos", null, 0, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Profesores(), this.getProfesor(), null, "profesores", null, 0, -1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_AulaHorarios(), this.getAulaHorario(), null, "aulaHorarios", null, 0, -1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aulaHorarioEClass, AulaHorario.class, "AulaHorario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAulaHorario_Dia(), this.getDia(), null, "dia", null, 0, 1, AulaHorario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAulaHorario_Horario(), this.getHorario(), null, "horario", null, 0, 1, AulaHorario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAulaHorario_Aula(), this.getAula(), null, "aula", null, 0, 1, AulaHorario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(planificacionEClass, Planificacion.class, "Planificacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlanificacion_Semestre(), this.getSemestre(), null, "semestre", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanificacion_Asignaciones(), this.getAsignacion(), null, "asignaciones", null, 0, -1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursoEClass, Recurso.class, "Recurso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleEClass, org.xtext.unq.planificador.planificadorDeMateriasDsl.SIMPLE.class, "SIMPLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(semiEClass, org.xtext.unq.planificador.planificadorDeMateriasDsl.SEMI.class, "SEMI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exclusivaEClass, org.xtext.unq.planificador.planificadorDeMateriasDsl.EXCLUSIVA.class, "EXCLUSIVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lunesEClass, Lunes.class, "Lunes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(martesEClass, Martes.class, "Martes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(miercolesEClass, Miercoles.class, "Miercoles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(juevesEClass, Jueves.class, "Jueves", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(viernesEClass, Viernes.class, "Viernes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sabadoEClass, Sabado.class, "Sabado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //PlanificadorDeMateriasDslPackageImpl
