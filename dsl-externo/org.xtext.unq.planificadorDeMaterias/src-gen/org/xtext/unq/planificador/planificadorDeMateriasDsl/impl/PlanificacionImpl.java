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

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
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
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.PlanificacionImpl#getAsignaciones <em>Asignaciones</em>}</li>
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
   * The cached value of the '{@link #getAsignaciones() <em>Asignaciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsignaciones()
   * @generated
   * @ordered
   */
  protected EList<Asignacion> asignaciones;

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
  public EList<Asignacion> getAsignaciones()
  {
    if (asignaciones == null)
    {
      asignaciones = new EObjectContainmentEList<Asignacion>(Asignacion.class, this, PlanificadorDeMateriasDslPackage.PLANIFICACION__ASIGNACIONES);
    }
    return asignaciones;
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__ASIGNACIONES:
        return ((InternalEList<?>)getAsignaciones()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__ASIGNACIONES:
        return getAsignaciones();
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__ASIGNACIONES:
        getAsignaciones().clear();
        getAsignaciones().addAll((Collection<? extends Asignacion>)newValue);
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__ASIGNACIONES:
        getAsignaciones().clear();
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
      case PlanificadorDeMateriasDslPackage.PLANIFICACION__ASIGNACIONES:
        return asignaciones != null && !asignaciones.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlanificacionImpl
