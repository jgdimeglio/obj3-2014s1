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
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl#getCantHoras <em>Cant Horas</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaImpl#getDiasSemanales <em>Dias Semanales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CargaHorariaImpl extends MinimalEObjectImpl.Container implements CargaHoraria
{
  /**
   * The default value of the '{@link #getCantHoras() <em>Cant Horas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantHoras()
   * @generated
   * @ordered
   */
  protected static final int CANT_HORAS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCantHoras() <em>Cant Horas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantHoras()
   * @generated
   * @ordered
   */
  protected int cantHoras = CANT_HORAS_EDEFAULT;

  /**
   * The default value of the '{@link #getDiasSemanales() <em>Dias Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasSemanales()
   * @generated
   * @ordered
   */
  protected static final int DIAS_SEMANALES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDiasSemanales() <em>Dias Semanales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasSemanales()
   * @generated
   * @ordered
   */
  protected int diasSemanales = DIAS_SEMANALES_EDEFAULT;

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
  public int getCantHoras()
  {
    return cantHoras;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCantHoras(int newCantHoras)
  {
    int oldCantHoras = cantHoras;
    cantHoras = newCantHoras;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_HORAS, oldCantHoras, cantHoras));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDiasSemanales()
  {
    return diasSemanales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiasSemanales(int newDiasSemanales)
  {
    int oldDiasSemanales = diasSemanales;
    diasSemanales = newDiasSemanales;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS_SEMANALES, oldDiasSemanales, diasSemanales));
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_HORAS:
        return getCantHoras();
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS_SEMANALES:
        return getDiasSemanales();
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_HORAS:
        setCantHoras((Integer)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS_SEMANALES:
        setDiasSemanales((Integer)newValue);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_HORAS:
        setCantHoras(CANT_HORAS_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS_SEMANALES:
        setDiasSemanales(DIAS_SEMANALES_EDEFAULT);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__CANT_HORAS:
        return cantHoras != CANT_HORAS_EDEFAULT;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA__DIAS_SEMANALES:
        return diasSemanales != DIAS_SEMANALES_EDEFAULT;
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
    result.append(" (cantHoras: ");
    result.append(cantHoras);
    result.append(", diasSemanales: ");
    result.append(diasSemanales);
    result.append(')');
    return result.toString();
  }

} //CargaHorariaImpl
