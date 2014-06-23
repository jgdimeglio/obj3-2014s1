/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Hora;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hora</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HoraImpl#getHora <em>Hora</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HoraImpl extends MinimalEObjectImpl.Container implements Hora
{
  /**
   * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected static final int HORA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected int hora = HORA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HoraImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.HORA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHora()
  {
    return hora;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHora(int newHora)
  {
    int oldHora = hora;
    hora = newHora;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.HORA__HORA, oldHora, hora));
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
      case PlanificadorDeMateriasDslPackage.HORA__HORA:
        return getHora();
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
      case PlanificadorDeMateriasDslPackage.HORA__HORA:
        setHora((Integer)newValue);
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
      case PlanificadorDeMateriasDslPackage.HORA__HORA:
        setHora(HORA_EDEFAULT);
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
      case PlanificadorDeMateriasDslPackage.HORA__HORA:
        return hora != HORA_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hora: ");
    result.append(hora);
    result.append(')');
    return result.toString();
  }

} //HoraImpl
