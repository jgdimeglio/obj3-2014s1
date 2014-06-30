/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl#getMateria <em>Materia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionImpl extends MinimalEObjectImpl.Container implements Asignacion
{
  /**
   * The cached value of the '{@link #getDia() <em>Dia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected Dia dia;

  /**
   * The cached value of the '{@link #getMateria() <em>Materia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateria()
   * @generated
   * @ordered
   */
  protected Materia materia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsignacionImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.ASIGNACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia getDia()
  {
    return dia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDia(Dia newDia, NotificationChain msgs)
  {
    Dia oldDia = dia;
    dia = newDia;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.ASIGNACION__DIA, oldDia, newDia);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDia(Dia newDia)
  {
    if (newDia != dia)
    {
      NotificationChain msgs = null;
      if (dia != null)
        msgs = ((InternalEObject)dia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.ASIGNACION__DIA, null, msgs);
      if (newDia != null)
        msgs = ((InternalEObject)newDia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.ASIGNACION__DIA, null, msgs);
      msgs = basicSetDia(newDia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.ASIGNACION__DIA, newDia, newDia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia getMateria()
  {
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMateria(Materia newMateria, NotificationChain msgs)
  {
    Materia oldMateria = materia;
    materia = newMateria;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA, oldMateria, newMateria);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMateria(Materia newMateria)
  {
    if (newMateria != materia)
    {
      NotificationChain msgs = null;
      if (materia != null)
        msgs = ((InternalEObject)materia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA, null, msgs);
      if (newMateria != null)
        msgs = ((InternalEObject)newMateria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA, null, msgs);
      msgs = basicSetMateria(newMateria, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA, newMateria, newMateria));
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__DIA:
        return basicSetDia(null, msgs);
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        return basicSetMateria(null, msgs);
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__DIA:
        return getDia();
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        return getMateria();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanificadorDeMateriasDslPackage.ASIGNACION__DIA:
        setDia((Dia)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        setMateria((Materia)newValue);
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__DIA:
        setDia((Dia)null);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        setMateria((Materia)null);
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__DIA:
        return dia != null;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        return materia != null;
    }
    return super.eIsSet(featureID);
  }

} //AsignacionImpl
