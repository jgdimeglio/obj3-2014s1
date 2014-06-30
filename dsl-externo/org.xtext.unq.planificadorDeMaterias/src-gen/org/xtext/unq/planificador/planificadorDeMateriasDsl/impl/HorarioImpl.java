/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Horario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl#getDesde <em>Desde</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.HorarioImpl#getHasta <em>Hasta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorarioImpl extends MinimalEObjectImpl.Container implements Horario
{
  /**
   * The default value of the '{@link #getDesde() <em>Desde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesde()
   * @generated
   * @ordered
   */
  protected static final int DESDE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDesde() <em>Desde</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesde()
   * @generated
   * @ordered
   */
  protected int desde = DESDE_EDEFAULT;

  /**
   * The default value of the '{@link #getHasta() <em>Hasta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasta()
   * @generated
   * @ordered
   */
  protected static final int HASTA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHasta() <em>Hasta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasta()
   * @generated
   * @ordered
   */
  protected int hasta = HASTA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorarioImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.HORARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDesde()
  {
    return desde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesde(int newDesde)
  {
    int oldDesde = desde;
    desde = newDesde;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.HORARIO__DESDE, oldDesde, desde));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHasta()
  {
    return hasta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasta(int newHasta)
  {
    int oldHasta = hasta;
    hasta = newHasta;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.HORARIO__HASTA, oldHasta, hasta));
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
      case PlanificadorDeMateriasDslPackage.HORARIO__DESDE:
        return getDesde();
      case PlanificadorDeMateriasDslPackage.HORARIO__HASTA:
        return getHasta();
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
      case PlanificadorDeMateriasDslPackage.HORARIO__DESDE:
        setDesde((Integer)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.HORARIO__HASTA:
        setHasta((Integer)newValue);
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
      case PlanificadorDeMateriasDslPackage.HORARIO__DESDE:
        setDesde(DESDE_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.HORARIO__HASTA:
        setHasta(HASTA_EDEFAULT);
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
      case PlanificadorDeMateriasDslPackage.HORARIO__DESDE:
        return desde != DESDE_EDEFAULT;
      case PlanificadorDeMateriasDslPackage.HORARIO__HASTA:
        return hasta != HASTA_EDEFAULT;
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
    result.append(" (desde: ");
    result.append(desde);
    result.append(", hasta: ");
    result.append(hasta);
    result.append(')');
    return result.toString();
  }

} //HorarioImpl
