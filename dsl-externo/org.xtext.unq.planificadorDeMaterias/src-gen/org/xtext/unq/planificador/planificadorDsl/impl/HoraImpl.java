/**
 */
package org.xtext.unq.planificador.planificadorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.unq.planificador.planificadorDsl.Hora;
import org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hora</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.HoraImpl#getHora <em>Hora</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HoraImpl extends MinimalEObjectImpl.Container implements Hora
{
  /**
   * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHora()
   * @generated
   * @ordered
   */
  protected EList<Integer> hora;

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
    return PlanificadorDslPackage.Literals.HORA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getHora()
  {
    if (hora == null)
    {
      hora = new EDataTypeEList<Integer>(Integer.class, this, PlanificadorDslPackage.HORA__HORA);
    }
    return hora;
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
      case PlanificadorDslPackage.HORA__HORA:
        return getHora();
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
      case PlanificadorDslPackage.HORA__HORA:
        getHora().clear();
        getHora().addAll((Collection<? extends Integer>)newValue);
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
      case PlanificadorDslPackage.HORA__HORA:
        getHora().clear();
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
      case PlanificadorDslPackage.HORA__HORA:
        return hora != null && !hora.isEmpty();
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
