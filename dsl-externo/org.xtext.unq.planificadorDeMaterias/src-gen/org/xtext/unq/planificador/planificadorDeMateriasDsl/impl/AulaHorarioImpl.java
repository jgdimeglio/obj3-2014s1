/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Aula;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aula Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl#getHorario <em>Horario</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AulaHorarioImpl#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AulaHorarioImpl extends MinimalEObjectImpl.Container implements AulaHorario
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
   * The cached value of the '{@link #getHorario() <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorario()
   * @generated
   * @ordered
   */
  protected Horario horario;

  /**
   * The cached value of the '{@link #getAula() <em>Aula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected Aula aula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AulaHorarioImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.AULA_HORARIO;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA, oldDia, newDia);
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
        msgs = ((InternalEObject)dia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA, null, msgs);
      if (newDia != null)
        msgs = ((InternalEObject)newDia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA, null, msgs);
      msgs = basicSetDia(newDia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA, newDia, newDia));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO, oldHorario, newHorario);
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
        msgs = ((InternalEObject)horario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO, null, msgs);
      if (newHorario != null)
        msgs = ((InternalEObject)newHorario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO, null, msgs);
      msgs = basicSetHorario(newHorario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO, newHorario, newHorario));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula getAula()
  {
    if (aula != null && aula.eIsProxy())
    {
      InternalEObject oldAula = (InternalEObject)aula;
      aula = (Aula)eResolveProxy(oldAula);
      if (aula != oldAula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificadorDeMateriasDslPackage.AULA_HORARIO__AULA, oldAula, aula));
      }
    }
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula basicGetAula()
  {
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAula(Aula newAula)
  {
    Aula oldAula = aula;
    aula = newAula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.AULA_HORARIO__AULA, oldAula, aula));
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
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA:
        return basicSetDia(null, msgs);
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO:
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
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA:
        return getDia();
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO:
        return getHorario();
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__AULA:
        if (resolve) return getAula();
        return basicGetAula();
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
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA:
        setDia((Dia)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO:
        setHorario((Horario)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__AULA:
        setAula((Aula)newValue);
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
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA:
        setDia((Dia)null);
        return;
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO:
        setHorario((Horario)null);
        return;
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__AULA:
        setAula((Aula)null);
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
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__DIA:
        return dia != null;
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__HORARIO:
        return horario != null;
      case PlanificadorDeMateriasDslPackage.AULA_HORARIO__AULA:
        return aula != null;
    }
    return super.eIsSet(featureID);
  }

} //AulaHorarioImpl
