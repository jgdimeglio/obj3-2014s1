/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl#getHorario <em>Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanificacionImpl extends MinimalEObjectImpl.Container implements Planificacion
{
  /**
   * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemestre()
   * @generated
   * @ordered
   */
  protected Semestre semestre;

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
   * The cached value of the '{@link #getHorario() <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorario()
   * @generated
   * @ordered
   */
  protected Horarios horario;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanificacionImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.PLANIFICACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Semestre getSemestre()
  {
    return semestre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSemestre(Semestre newSemestre, NotificationChain msgs)
  {
    Semestre oldSemestre = semestre;
    semestre = newSemestre;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE, oldSemestre, newSemestre);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemestre(Semestre newSemestre)
  {
    if (newSemestre != semestre)
    {
      NotificationChain msgs = null;
      if (semestre != null)
        msgs = ((InternalEObject)semestre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE, null, msgs);
      if (newSemestre != null)
        msgs = ((InternalEObject)newSemestre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE, null, msgs);
      msgs = basicSetSemestre(newSemestre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE, newSemestre, newSemestre));
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
      materias = new EObjectContainmentEList<Materia>(Materia.class, this, PlanificadorDeMateriasDslPackage.PLANIFICACION__MATERIAS);
    }
    return materias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horarios getHorario()
  {
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorario(Horarios newHorario, NotificationChain msgs)
  {
    Horarios oldHorario = horario;
    horario = newHorario;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO, oldHorario, newHorario);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorario(Horarios newHorario)
  {
    if (newHorario != horario)
    {
      NotificationChain msgs = null;
      if (horario != null)
        msgs = ((InternalEObject)horario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO, null, msgs);
      if (newHorario != null)
        msgs = ((InternalEObject)newHorario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO, null, msgs);
      msgs = basicSetHorario(newHorario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO, newHorario, newHorario));
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE:
        return basicSetSemestre(null, msgs);
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__MATERIAS:
        return ((InternalEList<?>)getMaterias()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO:
        return basicSetHorario(null, msgs);
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE:
        return getSemestre();
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__MATERIAS:
        return getMaterias();
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO:
        return getHorario();
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE:
        setSemestre((Semestre)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__MATERIAS:
        getMaterias().clear();
        getMaterias().addAll((Collection<? extends Materia>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO:
        setHorario((Horarios)newValue);
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE:
        setSemestre((Semestre)null);
        return;
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__MATERIAS:
        getMaterias().clear();
        return;
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO:
        setHorario((Horarios)null);
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__SEMESTRE:
        return semestre != null;
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__MATERIAS:
        return materias != null && !materias.isEmpty();
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__HORARIO:
        return horario != null;
    }
    return super.eIsSet(featureID);
  }

} //PlanificacionImpl
