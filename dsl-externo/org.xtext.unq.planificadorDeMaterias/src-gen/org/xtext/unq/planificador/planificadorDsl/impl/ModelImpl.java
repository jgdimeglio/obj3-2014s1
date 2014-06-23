/**
 */
package org.xtext.unq.planificador.planificadorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDsl.Aula;
import org.xtext.unq.planificador.planificadorDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDsl.CargaHorariaDocente;
import org.xtext.unq.planificador.planificadorDsl.Dia;
import org.xtext.unq.planificador.planificadorDsl.Hora;
import org.xtext.unq.planificador.planificadorDsl.Materia;
import org.xtext.unq.planificador.planificadorDsl.Model;
import org.xtext.unq.planificador.planificadorDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage;
import org.xtext.unq.planificador.planificadorDsl.Profesor;
import org.xtext.unq.planificador.planificadorDsl.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getProfesors <em>Profesors</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getHoras <em>Horas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getAulas <em>Aulas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getCargasHorarias <em>Cargas Horarias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getCargasHorariasDocentes <em>Cargas Horarias Docentes</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getHorarios <em>Horarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getDias <em>Dias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.ModelImpl#getPlanificaciones <em>Planificaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getProfesors() <em>Profesors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfesors()
   * @generated
   * @ordered
   */
  protected EList<Profesor> profesors;

  /**
   * The cached value of the '{@link #getHoras() <em>Horas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoras()
   * @generated
   * @ordered
   */
  protected EList<Hora> horas;

  /**
   * The cached value of the '{@link #getMaterias() <em>Materias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaterias()
   * @generated
   * @ordered
   */
  protected EList<Materia> materias;

  /**
   * The cached value of the '{@link #getAulas() <em>Aulas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAulas()
   * @generated
   * @ordered
   */
  protected EList<Aula> aulas;

  /**
   * The cached value of the '{@link #getCargasHorarias() <em>Cargas Horarias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargasHorarias()
   * @generated
   * @ordered
   */
  protected EList<CargaHoraria> cargasHorarias;

  /**
   * The cached value of the '{@link #getCargasHorariasDocentes() <em>Cargas Horarias Docentes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargasHorariasDocentes()
   * @generated
   * @ordered
   */
  protected EList<CargaHorariaDocente> cargasHorariasDocentes;

  /**
   * The cached value of the '{@link #getHorarios() <em>Horarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarios()
   * @generated
   * @ordered
   */
  protected EList<EObject> horarios;

  /**
   * The cached value of the '{@link #getDias() <em>Dias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDias()
   * @generated
   * @ordered
   */
  protected EList<Dia> dias;

  /**
   * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemestre()
   * @generated
   * @ordered
   */
  protected EList<Semestre> semestre;

  /**
   * The cached value of the '{@link #getPlanificaciones() <em>Planificaciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanificaciones()
   * @generated
   * @ordered
   */
  protected EList<Planificacion> planificaciones;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlanificadorDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Profesor> getProfesors()
  {
    if (profesors == null)
    {
      profesors = new EObjectContainmentEList<Profesor>(Profesor.class, this, PlanificadorDslPackage.MODEL__PROFESORS);
    }
    return profesors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Hora> getHoras()
  {
    if (horas == null)
    {
      horas = new EObjectContainmentEList<Hora>(Hora.class, this, PlanificadorDslPackage.MODEL__HORAS);
    }
    return horas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Materia> getMaterias()
  {
    if (materias == null)
    {
      materias = new EObjectContainmentEList<Materia>(Materia.class, this, PlanificadorDslPackage.MODEL__MATERIAS);
    }
    return materias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Aula> getAulas()
  {
    if (aulas == null)
    {
      aulas = new EObjectContainmentEList<Aula>(Aula.class, this, PlanificadorDslPackage.MODEL__AULAS);
    }
    return aulas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CargaHoraria> getCargasHorarias()
  {
    if (cargasHorarias == null)
    {
      cargasHorarias = new EObjectContainmentEList<CargaHoraria>(CargaHoraria.class, this, PlanificadorDslPackage.MODEL__CARGAS_HORARIAS);
    }
    return cargasHorarias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CargaHorariaDocente> getCargasHorariasDocentes()
  {
    if (cargasHorariasDocentes == null)
    {
      cargasHorariasDocentes = new EObjectContainmentEList<CargaHorariaDocente>(CargaHorariaDocente.class, this, PlanificadorDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES);
    }
    return cargasHorariasDocentes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getHorarios()
  {
    if (horarios == null)
    {
      horarios = new EObjectContainmentEList<EObject>(EObject.class, this, PlanificadorDslPackage.MODEL__HORARIOS);
    }
    return horarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dia> getDias()
  {
    if (dias == null)
    {
      dias = new EObjectContainmentEList<Dia>(Dia.class, this, PlanificadorDslPackage.MODEL__DIAS);
    }
    return dias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Semestre> getSemestre()
  {
    if (semestre == null)
    {
      semestre = new EObjectContainmentEList<Semestre>(Semestre.class, this, PlanificadorDslPackage.MODEL__SEMESTRE);
    }
    return semestre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Planificacion> getPlanificaciones()
  {
    if (planificaciones == null)
    {
      planificaciones = new EObjectContainmentEList<Planificacion>(Planificacion.class, this, PlanificadorDslPackage.MODEL__PLANIFICACIONES);
    }
    return planificaciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlanificadorDslPackage.MODEL__PROFESORS:
        return ((InternalEList<?>)getProfesors()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__HORAS:
        return ((InternalEList<?>)getHoras()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__MATERIAS:
        return ((InternalEList<?>)getMaterias()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__AULAS:
        return ((InternalEList<?>)getAulas()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS:
        return ((InternalEList<?>)getCargasHorarias()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        return ((InternalEList<?>)getCargasHorariasDocentes()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__HORARIOS:
        return ((InternalEList<?>)getHorarios()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__DIAS:
        return ((InternalEList<?>)getDias()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__SEMESTRE:
        return ((InternalEList<?>)getSemestre()).basicRemove(otherEnd, msgs);
      case PlanificadorDslPackage.MODEL__PLANIFICACIONES:
        return ((InternalEList<?>)getPlanificaciones()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlanificadorDslPackage.MODEL__PROFESORS:
        return getProfesors();
      case PlanificadorDslPackage.MODEL__HORAS:
        return getHoras();
      case PlanificadorDslPackage.MODEL__MATERIAS:
        return getMaterias();
      case PlanificadorDslPackage.MODEL__AULAS:
        return getAulas();
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS:
        return getCargasHorarias();
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        return getCargasHorariasDocentes();
      case PlanificadorDslPackage.MODEL__HORARIOS:
        return getHorarios();
      case PlanificadorDslPackage.MODEL__DIAS:
        return getDias();
      case PlanificadorDslPackage.MODEL__SEMESTRE:
        return getSemestre();
      case PlanificadorDslPackage.MODEL__PLANIFICACIONES:
        return getPlanificaciones();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanificadorDslPackage.MODEL__PROFESORS:
        getProfesors().clear();
        getProfesors().addAll((Collection<? extends Profesor>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__HORAS:
        getHoras().clear();
        getHoras().addAll((Collection<? extends Hora>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__MATERIAS:
        getMaterias().clear();
        getMaterias().addAll((Collection<? extends Materia>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__AULAS:
        getAulas().clear();
        getAulas().addAll((Collection<? extends Aula>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS:
        getCargasHorarias().clear();
        getCargasHorarias().addAll((Collection<? extends CargaHoraria>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        getCargasHorariasDocentes().clear();
        getCargasHorariasDocentes().addAll((Collection<? extends CargaHorariaDocente>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__HORARIOS:
        getHorarios().clear();
        getHorarios().addAll((Collection<? extends EObject>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__DIAS:
        getDias().clear();
        getDias().addAll((Collection<? extends Dia>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__SEMESTRE:
        getSemestre().clear();
        getSemestre().addAll((Collection<? extends Semestre>)newValue);
        return;
      case PlanificadorDslPackage.MODEL__PLANIFICACIONES:
        getPlanificaciones().clear();
        getPlanificaciones().addAll((Collection<? extends Planificacion>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlanificadorDslPackage.MODEL__PROFESORS:
        getProfesors().clear();
        return;
      case PlanificadorDslPackage.MODEL__HORAS:
        getHoras().clear();
        return;
      case PlanificadorDslPackage.MODEL__MATERIAS:
        getMaterias().clear();
        return;
      case PlanificadorDslPackage.MODEL__AULAS:
        getAulas().clear();
        return;
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS:
        getCargasHorarias().clear();
        return;
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        getCargasHorariasDocentes().clear();
        return;
      case PlanificadorDslPackage.MODEL__HORARIOS:
        getHorarios().clear();
        return;
      case PlanificadorDslPackage.MODEL__DIAS:
        getDias().clear();
        return;
      case PlanificadorDslPackage.MODEL__SEMESTRE:
        getSemestre().clear();
        return;
      case PlanificadorDslPackage.MODEL__PLANIFICACIONES:
        getPlanificaciones().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlanificadorDslPackage.MODEL__PROFESORS:
        return profesors != null && !profesors.isEmpty();
      case PlanificadorDslPackage.MODEL__HORAS:
        return horas != null && !horas.isEmpty();
      case PlanificadorDslPackage.MODEL__MATERIAS:
        return materias != null && !materias.isEmpty();
      case PlanificadorDslPackage.MODEL__AULAS:
        return aulas != null && !aulas.isEmpty();
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS:
        return cargasHorarias != null && !cargasHorarias.isEmpty();
      case PlanificadorDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        return cargasHorariasDocentes != null && !cargasHorariasDocentes.isEmpty();
      case PlanificadorDslPackage.MODEL__HORARIOS:
        return horarios != null && !horarios.isEmpty();
      case PlanificadorDslPackage.MODEL__DIAS:
        return dias != null && !dias.isEmpty();
      case PlanificadorDslPackage.MODEL__SEMESTRE:
        return semestre != null && !semestre.isEmpty();
      case PlanificadorDslPackage.MODEL__PLANIFICACIONES:
        return planificaciones != null && !planificaciones.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
