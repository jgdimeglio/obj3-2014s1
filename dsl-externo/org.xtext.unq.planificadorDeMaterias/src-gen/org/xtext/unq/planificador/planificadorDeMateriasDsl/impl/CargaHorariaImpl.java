/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carga Horaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl#getCantDias <em>Cant Dias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl#getDias <em>Dias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CargaHorariaImpl extends MinimalEObjectImpl.Container implements CargaHoraria
{
  /**
   * The default value of the '{@link #getCantDias() <em>Cant Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantDias()
   * @generated
   * @ordered
   */
  protected static final int CANT_DIAS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCantDias() <em>Cant Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantDias()
   * @generated
   * @ordered
   */
  protected int cantDias = CANT_DIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getDias() <em>Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDias()
   * @generated
   * @ordered
   */
  protected static final int DIAS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDias() <em>Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDias()
   * @generated
   * @ordered
   */
  protected int dias = DIAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CargaHorariaImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.CARGA_HORARIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCantDias()
  {
    return cantDias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCantDias(int newCantDias)
  {
    int oldCantDias = cantDias;
    cantDias = newCantDias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_DIAS, oldCantDias, cantDias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDias()
  {
    return dias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDias(int newDias)
  {
    int oldDias = dias;
    dias = newDias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS, oldDias, dias));
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_DIAS:
        return getCantDias();
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS:
        return getDias();
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_DIAS:
        setCantDias((Integer)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS:
        setDias((Integer)newValue);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_DIAS:
        setCantDias(CANT_DIAS_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS:
        setDias(DIAS_EDEFAULT);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_DIAS:
        return cantDias != CANT_DIAS_EDEFAULT;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS:
        return dias != DIAS_EDEFAULT;
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
    result.append(" (cantDias: ");
    result.append(cantDias);
    result.append(", dias: ");
    result.append(dias);
    result.append(')');
    return result.toString();
  }

} //CargaHorariaImpl
