/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dia Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DiaHorarioImpl#getDiaPuede <em>Dia Puede</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DiaHorarioImpl#getHorario <em>Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiaHorarioImpl extends MinimalEObjectImpl.Container implements DiaHorario
{
  /**
   * The cached value of the '{@link #getDiaPuede() <em>Dia Puede</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiaPuede()
   * @generated
   * @ordered
   */
  protected Dia diaPuede;

  /**
   * The cached value of the '{@link #getHorario() <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorario()
   * @generated
   * @ordered
   */
  protected Horario horario;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiaHorarioImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.DIA_HORARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia getDiaPuede()
  {
    return diaPuede;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiaPuede(Dia newDiaPuede, NotificationChain msgs)
  {
    Dia oldDiaPuede = diaPuede;
    diaPuede = newDiaPuede;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE, oldDiaPuede, newDiaPuede);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiaPuede(Dia newDiaPuede)
  {
    if (newDiaPuede != diaPuede)
    {
      NotificationChain msgs = null;
      if (diaPuede != null)
        msgs = ((InternalEObject)diaPuede).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE, null, msgs);
      if (newDiaPuede != null)
        msgs = ((InternalEObject)newDiaPuede).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE, null, msgs);
      msgs = basicSetDiaPuede(newDiaPuede, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE, newDiaPuede, newDiaPuede));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Horario getHorario()
  {
    return horario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorario(Horario newHorario, NotificationChain msgs)
  {
    Horario oldHorario = horario;
    horario = newHorario;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO, oldHorario, newHorario);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorario(Horario newHorario)
  {
    if (newHorario != horario)
    {
      NotificationChain msgs = null;
      if (horario != null)
        msgs = ((InternalEObject)horario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO, null, msgs);
      if (newHorario != null)
        msgs = ((InternalEObject)newHorario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO, null, msgs);
      msgs = basicSetHorario(newHorario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO, newHorario, newHorario));
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
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE:
        return basicSetDiaPuede(null, msgs);
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO:
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
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE:
        return getDiaPuede();
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO:
        return getHorario();
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
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE:
        setDiaPuede((Dia)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO:
        setHorario((Horario)newValue);
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
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE:
        setDiaPuede((Dia)null);
        return;
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO:
        setHorario((Horario)null);
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
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__DIA_PUEDE:
        return diaPuede != null;
      case PlanificadorDeMateriasDslPackage.DIA_HORARIO__HORARIO:
        return horario != null;
    }
    return super.eIsSet(featureID);
  }

} //DiaHorarioImpl
