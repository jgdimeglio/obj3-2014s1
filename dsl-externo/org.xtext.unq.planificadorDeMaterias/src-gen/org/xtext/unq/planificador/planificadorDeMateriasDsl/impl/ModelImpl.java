/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getProfesors <em>Profesors</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getHoras <em>Horas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getAulas <em>Aulas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getCargasHorarias <em>Cargas Horarias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getCargasHorariasDocentes <em>Cargas Horarias Docentes</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getHorarios <em>Horarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getDias <em>Dias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getPlanificaciones <em>Planificaciones</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getRecursosDeMaterias <em>Recursos De Materias</em>}</li>
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
   * The cached value of the '{@link #getRecursos() <em>Recursos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecursos()
   * @generated
   * @ordered
   */
  protected EList<Recurso> recursos;

  /**
   * The cached value of the '{@link #getRecursosDeMaterias() <em>Recursos De Materias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecursosDeMaterias()
   * @generated
   * @ordered
   */
  protected EList<RecursoMateria> recursosDeMaterias;

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
    return PlanificadorDeMateriasDslPackage.Literals.MODEL;
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
      profesors = new EObjectContainmentEList<Profesor>(Profesor.class, this, PlanificadorDeMateriasDslPackage.MODEL__PROFESORS);
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
      horas = new EObjectContainmentEList<Hora>(Hora.class, this, PlanificadorDeMateriasDslPackage.MODEL__HORAS);
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
      materias = new EObjectContainmentEList<Materia>(Materia.class, this, PlanificadorDeMateriasDslPackage.MODEL__MATERIAS);
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
      aulas = new EObjectContainmentEList<Aula>(Aula.class, this, PlanificadorDeMateriasDslPackage.MODEL__AULAS);
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
      cargasHorarias = new EObjectContainmentEList<CargaHoraria>(CargaHoraria.class, this, PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS);
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
      cargasHorariasDocentes = new EObjectContainmentEList<CargaHorariaDocente>(CargaHorariaDocente.class, this, PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES);
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
      horarios = new EObjectContainmentEList<EObject>(EObject.class, this, PlanificadorDeMateriasDslPackage.MODEL__HORARIOS);
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
      dias = new EObjectContainmentEList<Dia>(Dia.class, this, PlanificadorDeMateriasDslPackage.MODEL__DIAS);
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
      semestre = new EObjectContainmentEList<Semestre>(Semestre.class, this, PlanificadorDeMateriasDslPackage.MODEL__SEMESTRE);
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
      planificaciones = new EObjectContainmentEList<Planificacion>(Planificacion.class, this, PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACIONES);
    }
    return planificaciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recurso> getRecursos()
  {
    if (recursos == null)
    {
      recursos = new EObjectContainmentEList<Recurso>(Recurso.class, this, PlanificadorDeMateriasDslPackage.MODEL__RECURSOS);
    }
    return recursos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RecursoMateria> getRecursosDeMaterias()
  {
    if (recursosDeMaterias == null)
    {
      recursosDeMaterias = new EObjectContainmentEList<RecursoMateria>(RecursoMateria.class, this, PlanificadorDeMateriasDslPackage.MODEL__RECURSOS_DE_MATERIAS);
    }
    return recursosDeMaterias;
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
      case PlanificadorDeMateriasDslPackage.MODEL__PROFESORS:
        return ((InternalEList<?>)getProfesors()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__HORAS:
        return ((InternalEList<?>)getHoras()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__MATERIAS:
        return ((InternalEList<?>)getMaterias()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__AULAS:
        return ((InternalEList<?>)getAulas()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS:
        return ((InternalEList<?>)getCargasHorarias()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        return ((InternalEList<?>)getCargasHorariasDocentes()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__HORARIOS:
        return ((InternalEList<?>)getHorarios()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__DIAS:
        return ((InternalEList<?>)getDias()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__SEMESTRE:
        return ((InternalEList<?>)getSemestre()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACIONES:
        return ((InternalEList<?>)getPlanificaciones()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS:
        return ((InternalEList<?>)getRecursos()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS_DE_MATERIAS:
        return ((InternalEList<?>)getRecursosDeMaterias()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.MODEL__PROFESORS:
        return getProfesors();
      case PlanificadorDeMateriasDslPackage.MODEL__HORAS:
        return getHoras();
      case PlanificadorDeMateriasDslPackage.MODEL__MATERIAS:
        return getMaterias();
      case PlanificadorDeMateriasDslPackage.MODEL__AULAS:
        return getAulas();
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS:
        return getCargasHorarias();
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        return getCargasHorariasDocentes();
      case PlanificadorDeMateriasDslPackage.MODEL__HORARIOS:
        return getHorarios();
      case PlanificadorDeMateriasDslPackage.MODEL__DIAS:
        return getDias();
      case PlanificadorDeMateriasDslPackage.MODEL__SEMESTRE:
        return getSemestre();
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACIONES:
        return getPlanificaciones();
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS:
        return getRecursos();
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS_DE_MATERIAS:
        return getRecursosDeMaterias();
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
      case PlanificadorDeMateriasDslPackage.MODEL__PROFESORS:
        getProfesors().clear();
        getProfesors().addAll((Collection<? extends Profesor>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__HORAS:
        getHoras().clear();
        getHoras().addAll((Collection<? extends Hora>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__MATERIAS:
        getMaterias().clear();
        getMaterias().addAll((Collection<? extends Materia>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__AULAS:
        getAulas().clear();
        getAulas().addAll((Collection<? extends Aula>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS:
        getCargasHorarias().clear();
        getCargasHorarias().addAll((Collection<? extends CargaHoraria>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        getCargasHorariasDocentes().clear();
        getCargasHorariasDocentes().addAll((Collection<? extends CargaHorariaDocente>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__HORARIOS:
        getHorarios().clear();
        getHorarios().addAll((Collection<? extends EObject>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__DIAS:
        getDias().clear();
        getDias().addAll((Collection<? extends Dia>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__SEMESTRE:
        getSemestre().clear();
        getSemestre().addAll((Collection<? extends Semestre>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACIONES:
        getPlanificaciones().clear();
        getPlanificaciones().addAll((Collection<? extends Planificacion>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS:
        getRecursos().clear();
        getRecursos().addAll((Collection<? extends Recurso>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS_DE_MATERIAS:
        getRecursosDeMaterias().clear();
        getRecursosDeMaterias().addAll((Collection<? extends RecursoMateria>)newValue);
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
      case PlanificadorDeMateriasDslPackage.MODEL__PROFESORS:
        getProfesors().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__HORAS:
        getHoras().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__MATERIAS:
        getMaterias().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__AULAS:
        getAulas().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS:
        getCargasHorarias().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        getCargasHorariasDocentes().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__HORARIOS:
        getHorarios().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__DIAS:
        getDias().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__SEMESTRE:
        getSemestre().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACIONES:
        getPlanificaciones().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS:
        getRecursos().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS_DE_MATERIAS:
        getRecursosDeMaterias().clear();
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
      case PlanificadorDeMateriasDslPackage.MODEL__PROFESORS:
        return profesors != null && !profesors.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__HORAS:
        return horas != null && !horas.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__MATERIAS:
        return materias != null && !materias.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__AULAS:
        return aulas != null && !aulas.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS:
        return cargasHorarias != null && !cargasHorarias.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__CARGAS_HORARIAS_DOCENTES:
        return cargasHorariasDocentes != null && !cargasHorariasDocentes.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__HORARIOS:
        return horarios != null && !horarios.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__DIAS:
        return dias != null && !dias.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__SEMESTRE:
        return semestre != null && !semestre.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACIONES:
        return planificaciones != null && !planificaciones.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS:
        return recursos != null && !recursos.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__RECURSOS_DE_MATERIAS:
        return recursosDeMaterias != null && !recursosDeMaterias.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
