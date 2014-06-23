/**
 */
package org.xtext.unq.planificador.pdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.unq.planificador.pdm.PdmPackage;
import org.xtext.unq.planificador.pdm.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.ProfesorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.ProfesorImpl#getDedicacion <em>Dedicacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfesorImpl extends MinimalEObjectImpl.Container implements Profesor
{
  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected EList<String> nombre;

  /**
   * The cached value of the '{@link #getDedicacion() <em>Dedicacion</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected EList<String> dedicacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProfesorImpl()
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
    return PdmPackage.Literals.PROFESOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNombre()
  {
    if (nombre == null)
    {
      nombre = new EDataTypeEList<String>(String.class, this, PdmPackage.PROFESOR__NOMBRE);
    }
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDedicacion()
  {
    if (dedicacion == null)
    {
      dedicacion = new EDataTypeEList<String>(String.class, this, PdmPackage.PROFESOR__DEDICACION);
    }
    return dedicacion;
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
      case PdmPackage.PROFESOR__NOMBRE:
        return getNombre();
      case PdmPackage.PROFESOR__DEDICACION:
        return getDedicacion();
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
      case PdmPackage.PROFESOR__NOMBRE:
        getNombre().clear();
        getNombre().addAll((Collection<? extends String>)newValue);
        return;
      case PdmPackage.PROFESOR__DEDICACION:
        getDedicacion().clear();
        getDedicacion().addAll((Collection<? extends String>)newValue);
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
      case PdmPackage.PROFESOR__NOMBRE:
        getNombre().clear();
        return;
      case PdmPackage.PROFESOR__DEDICACION:
        getDedicacion().clear();
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
      case PdmPackage.PROFESOR__NOMBRE:
        return nombre != null && !nombre.isEmpty();
      case PdmPackage.PROFESOR__DEDICACION:
        return dedicacion != null && !dedicacion.isEmpty();
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
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(", dedicacion: ");
    result.append(dedicacion);
    result.append(')');
    return result.toString();
  }

} //ProfesorImpl
