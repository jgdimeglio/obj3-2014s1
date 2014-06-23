/**
 */
package org.xtext.unq.planificador.planificadorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.unq.planificador.planificadorDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carga Horaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.CargaHorariaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.CargaHorariaImpl#getDias <em>Dias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CargaHorariaImpl extends MinimalEObjectImpl.Container implements CargaHoraria
{
  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected EList<String> tipo;

  /**
   * The cached value of the '{@link #getDias() <em>Dias</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDias()
   * @generated
   * @ordered
   */
  protected EList<Integer> dias;

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
    return PlanificadorDslPackage.Literals.CARGA_HORARIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTipo()
  {
    if (tipo == null)
    {
      tipo = new EDataTypeEList<String>(String.class, this, PlanificadorDslPackage.CARGA_HORARIA__TIPO);
    }
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getDias()
  {
    if (dias == null)
    {
      dias = new EDataTypeEList<Integer>(Integer.class, this, PlanificadorDslPackage.CARGA_HORARIA__DIAS);
    }
    return dias;
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
      case PlanificadorDslPackage.CARGA_HORARIA__TIPO:
        return getTipo();
      case PlanificadorDslPackage.CARGA_HORARIA__DIAS:
        return getDias();
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
      case PlanificadorDslPackage.CARGA_HORARIA__TIPO:
        getTipo().clear();
        getTipo().addAll((Collection<? extends String>)newValue);
        return;
      case PlanificadorDslPackage.CARGA_HORARIA__DIAS:
        getDias().clear();
        getDias().addAll((Collection<? extends Integer>)newValue);
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
      case PlanificadorDslPackage.CARGA_HORARIA__TIPO:
        getTipo().clear();
        return;
      case PlanificadorDslPackage.CARGA_HORARIA__DIAS:
        getDias().clear();
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
      case PlanificadorDslPackage.CARGA_HORARIA__TIPO:
        return tipo != null && !tipo.isEmpty();
      case PlanificadorDslPackage.CARGA_HORARIA__DIAS:
        return dias != null && !dias.isEmpty();
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
    result.append(" (tipo: ");
    result.append(tipo);
    result.append(", dias: ");
    result.append(dias);
    result.append(')');
    return result.toString();
  }

} //CargaHorariaImpl
