/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslFactory;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;

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
  private EClass profesorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horaEClass = null;

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
  private EClass aulaEClass = null;

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
  private EClass cargaHorariaDocenteEClass = null;

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
  private EClass horariosEClass = null;

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
  private EClass recursoMateriaEClass = null;

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
  public EReference getModel_Profesors()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Horas()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Materias()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Aulas()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_CargasHorarias()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_CargasHorariasDocentes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Horarios()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Dias()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Semestre()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Planificaciones()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Recursos()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_RecursosDeMaterias()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(11);
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
  public EAttribute getProfesor_Nombre()
  {
    return (EAttribute)profesorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProfesor_Dedicacion()
  {
    return (EAttribute)profesorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHora()
  {
    return horaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHora_Hora()
  {
    return (EAttribute)horaEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getMateria_Nombre()
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
  public EClass getAula()
  {
    return aulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAula_Nombre()
  {
    return (EAttribute)aulaEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getCargaHoraria_CantDias()
  {
    return (EAttribute)cargaHorariaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCargaHoraria_Dias()
  {
    return (EAttribute)cargaHorariaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCargaHorariaDocente()
  {
    return cargaHorariaDocenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCargaHorariaDocente_Nombre()
  {
    return (EReference)cargaHorariaDocenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCargaHorariaDocente_Tipo()
  {
    return (EReference)cargaHorariaDocenteEClass.getEStructuralFeatures().get(1);
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
  public EReference getHorario_Dia()
  {
    return (EReference)horarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorario_Desde()
  {
    return (EReference)horarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorario_Hasta()
  {
    return (EReference)horarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorario_Materia()
  {
    return (EReference)horarioEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorario_Aula()
  {
    return (EReference)horarioEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getDia_Dia()
  {
    return (EAttribute)diaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorarios()
  {
    return horariosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorarios_Horarios()
  {
    return (EReference)horariosEClass.getEStructuralFeatures().get(0);
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
  public EReference getPlanificacion_Materias()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlanificacion_Horarios()
  {
    return (EReference)planificacionEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getRecurso_Nombre()
  {
    return (EAttribute)recursoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecursoMateria()
  {
    return recursoMateriaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecursoMateria_Materia()
  {
    return (EReference)recursoMateriaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecursoMateria_Recursos()
  {
    return (EReference)recursoMateriaEClass.getEStructuralFeatures().get(1);
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
    createEReference(modelEClass, MODEL__PROFESORS);
    createEReference(modelEClass, MODEL__HORAS);
    createEReference(modelEClass, MODEL__MATERIAS);
    createEReference(modelEClass, MODEL__AULAS);
    createEReference(modelEClass, MODEL__CARGAS_HORARIAS);
    createEReference(modelEClass, MODEL__CARGAS_HORARIAS_DOCENTES);
    createEReference(modelEClass, MODEL__HORARIOS);
    createEReference(modelEClass, MODEL__DIAS);
    createEReference(modelEClass, MODEL__SEMESTRE);
    createEReference(modelEClass, MODEL__PLANIFICACIONES);
    createEReference(modelEClass, MODEL__RECURSOS);
    createEReference(modelEClass, MODEL__RECURSOS_DE_MATERIAS);

    profesorEClass = createEClass(PROFESOR);
    createEAttribute(profesorEClass, PROFESOR__NOMBRE);
    createEAttribute(profesorEClass, PROFESOR__DEDICACION);

    horaEClass = createEClass(HORA);
    createEAttribute(horaEClass, HORA__HORA);

    materiaEClass = createEClass(MATERIA);
    createEAttribute(materiaEClass, MATERIA__NOMBRE);
    createEReference(materiaEClass, MATERIA__CARGA_HORARIA);

    aulaEClass = createEClass(AULA);
    createEAttribute(aulaEClass, AULA__NOMBRE);

    cargaHorariaEClass = createEClass(CARGA_HORARIA);
    createEAttribute(cargaHorariaEClass, CARGA_HORARIA__CANT_DIAS);
    createEAttribute(cargaHorariaEClass, CARGA_HORARIA__DIAS);

    cargaHorariaDocenteEClass = createEClass(CARGA_HORARIA_DOCENTE);
    createEReference(cargaHorariaDocenteEClass, CARGA_HORARIA_DOCENTE__NOMBRE);
    createEReference(cargaHorariaDocenteEClass, CARGA_HORARIA_DOCENTE__TIPO);

    horarioEClass = createEClass(HORARIO);
    createEReference(horarioEClass, HORARIO__DIA);
    createEReference(horarioEClass, HORARIO__DESDE);
    createEReference(horarioEClass, HORARIO__HASTA);
    createEReference(horarioEClass, HORARIO__MATERIA);
    createEReference(horarioEClass, HORARIO__AULA);

    semestreEClass = createEClass(SEMESTRE);
    createEAttribute(semestreEClass, SEMESTRE__ANHO);
    createEAttribute(semestreEClass, SEMESTRE__NUMERO);

    diaEClass = createEClass(DIA);
    createEAttribute(diaEClass, DIA__DIA);

    horariosEClass = createEClass(HORARIOS);
    createEReference(horariosEClass, HORARIOS__HORARIOS);

    planificacionEClass = createEClass(PLANIFICACION);
    createEReference(planificacionEClass, PLANIFICACION__SEMESTRE);
    createEReference(planificacionEClass, PLANIFICACION__MATERIAS);
    createEReference(planificacionEClass, PLANIFICACION__HORARIOS);

    recursoEClass = createEClass(RECURSO);
    createEAttribute(recursoEClass, RECURSO__NOMBRE);

    recursoMateriaEClass = createEClass(RECURSO_MATERIA);
    createEReference(recursoMateriaEClass, RECURSO_MATERIA__MATERIA);
    createEReference(recursoMateriaEClass, RECURSO_MATERIA__RECURSOS);
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

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Profesors(), this.getProfesor(), null, "profesors", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Horas(), this.getHora(), null, "horas", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Materias(), this.getMateria(), null, "materias", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Aulas(), this.getAula(), null, "aulas", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_CargasHorarias(), this.getCargaHoraria(), null, "cargasHorarias", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_CargasHorariasDocentes(), this.getCargaHorariaDocente(), null, "cargasHorariasDocentes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Horarios(), ecorePackage.getEObject(), null, "horarios", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Dias(), this.getDia(), null, "dias", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Semestre(), this.getSemestre(), null, "semestre", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Planificaciones(), this.getPlanificacion(), null, "planificaciones", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_RecursosDeMaterias(), this.getRecursoMateria(), null, "recursosDeMaterias", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(profesorEClass, Profesor.class, "Profesor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProfesor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProfesor_Dedicacion(), ecorePackage.getEString(), "dedicacion", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horaEClass, Hora.class, "Hora", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHora_Hora(), ecorePackage.getEInt(), "hora", null, 0, 1, Hora.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(materiaEClass, Materia.class, "Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMateria_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMateria_CargaHoraria(), this.getCargaHoraria(), null, "cargaHoraria", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aulaEClass, Aula.class, "Aula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAula_Nombre(), ecorePackage.getEString(), "nombre", null, 0, -1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cargaHorariaEClass, CargaHoraria.class, "CargaHoraria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCargaHoraria_CantDias(), ecorePackage.getEInt(), "cantDias", null, 0, 1, CargaHoraria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCargaHoraria_Dias(), ecorePackage.getEInt(), "dias", null, 0, 1, CargaHoraria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cargaHorariaDocenteEClass, CargaHorariaDocente.class, "CargaHorariaDocente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCargaHorariaDocente_Nombre(), this.getProfesor(), null, "nombre", null, 0, 1, CargaHorariaDocente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCargaHorariaDocente_Tipo(), this.getCargaHoraria(), null, "tipo", null, 0, 1, CargaHorariaDocente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horarioEClass, Horario.class, "Horario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHorario_Dia(), this.getDia(), null, "dia", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHorario_Desde(), this.getHora(), null, "desde", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHorario_Hasta(), this.getHora(), null, "hasta", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHorario_Materia(), this.getMateria(), null, "materia", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHorario_Aula(), this.getAula(), null, "aula", null, 0, 1, Horario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semestreEClass, Semestre.class, "Semestre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSemestre_Anho(), ecorePackage.getEInt(), "anho", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSemestre_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diaEClass, Dia.class, "Dia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDia_Dia(), ecorePackage.getEString(), "dia", null, 0, 1, Dia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horariosEClass, Horarios.class, "Horarios", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHorarios_Horarios(), this.getHorario(), null, "horarios", null, 0, -1, Horarios.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(planificacionEClass, Planificacion.class, "Planificacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlanificacion_Semestre(), this.getSemestre(), null, "semestre", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanificacion_Materias(), this.getMateria(), null, "materias", null, 0, -1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanificacion_Horarios(), this.getHorarios(), null, "horarios", null, 0, 1, Planificacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursoEClass, Recurso.class, "Recurso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecurso_Nombre(), ecorePackage.getEString(), "nombre", null, 0, -1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursoMateriaEClass, RecursoMateria.class, "RecursoMateria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecursoMateria_Materia(), this.getMateria(), null, "materia", null, 0, 1, RecursoMateria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecursoMateria_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, RecursoMateria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PlanificadorDeMateriasDslPackageImpl
