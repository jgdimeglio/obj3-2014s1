/**
 */
package org.xtext.unq.planificador.pdm.impl;

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

import org.xtext.unq.planificador.pdm.Horarios;
import org.xtext.unq.planificador.pdm.Materia;
import org.xtext.unq.planificador.pdm.PdmPackage;
import org.xtext.unq.planificador.pdm.Planificacion;
import org.xtext.unq.planificador.pdm.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.PlanificacionImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.PlanificacionImpl#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.PlanificacionImpl#getHorarios <em>Horarios</em>}</li>
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
   * The cached value of the '{@link #getHorarios() <em>Horarios</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarios()
   * @generated
   * @ordered
   */
  protected Horarios horarios;

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
    return PdmPackage.Literals.PLANIFICACION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.PLANIFICACION__SEMESTRE, oldSemestre, newSemestre);
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
        msgs = ((InternalEObject)semestre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.PLANIFICACION__SEMESTRE, null, msgs);
      if (newSemestre != null)
        msgs = ((InternalEObject)newSemestre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.PLANIFICACION__SEMESTRE, null, msgs);
      msgs = basicSetSemestre(newSemestre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.PLANIFICACION__SEMESTRE, newSemestre, newSemestre));
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
      materias = new EObjectContainmentEList<Materia>(Materia.class, this, PdmPackage.PLANIFICACION__MATERIAS);
    }
    return materias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horarios getHorarios()
  {
    return horarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorarios(Horarios newHorarios, NotificationChain msgs)
  {
    Horarios oldHorarios = horarios;
    horarios = newHorarios;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.PLANIFICACION__HORARIOS, oldHorarios, newHorarios);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorarios(Horarios newHorarios)
  {
    if (newHorarios != horarios)
    {
      NotificationChain msgs = null;
      if (horarios != null)
        msgs = ((InternalEObject)horarios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.PLANIFICACION__HORARIOS, null, msgs);
      if (newHorarios != null)
        msgs = ((InternalEObject)newHorarios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.PLANIFICACION__HORARIOS, null, msgs);
      msgs = basicSetHorarios(newHorarios, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.PLANIFICACION__HORARIOS, newHorarios, newHorarios));
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
      case PdmPackage.PLANIFICACION__SEMESTRE:
        return basicSetSemestre(null, msgs);
      case PdmPackage.PLANIFICACION__MATERIAS:
        return ((InternalEList<?>)getMaterias()).basicRemove(otherEnd, msgs);
      case PdmPackage.PLANIFICACION__HORARIOS:
        return basicSetHorarios(null, msgs);
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
      case PdmPackage.PLANIFICACION__SEMESTRE:
        return getSemestre();
      case PdmPackage.PLANIFICACION__MATERIAS:
        return getMaterias();
      case PdmPackage.PLANIFICACION__HORARIOS:
        return getHorarios();
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
      case PdmPackage.PLANIFICACION__SEMESTRE:
        setSemestre((Semestre)newValue);
        return;
      case PdmPackage.PLANIFICACION__MATERIAS:
        getMaterias().clear();
        getMaterias().addAll((Collection<? extends Materia>)newValue);
        return;
      case PdmPackage.PLANIFICACION__HORARIOS:
        setHorarios((Horarios)newValue);
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
      case PdmPackage.PLANIFICACION__SEMESTRE:
        setSemestre((Semestre)null);
        return;
      case PdmPackage.PLANIFICACION__MATERIAS:
        getMaterias().clear();
        return;
      case PdmPackage.PLANIFICACION__HORARIOS:
        setHorarios((Horarios)null);
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
      case PdmPackage.PLANIFICACION__SEMESTRE:
        return semestre != null;
      case PdmPackage.PLANIFICACION__MATERIAS:
        return materias != null && !materias.isEmpty();
      case PdmPackage.PLANIFICACION__HORARIOS:
        return horarios != null;
    }
    return super.eIsSet(featureID);
  }

} //PlanificacionImpl
