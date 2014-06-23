/**
 */
package org.xtext.unq.planificador.pdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.pdm.CargaHoraria;
import org.xtext.unq.planificador.pdm.Materia;
import org.xtext.unq.planificador.pdm.PdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.MateriaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.MateriaImpl#getCargaHoraria <em>Carga Horaria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends MinimalEObjectImpl.Container implements Materia
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
   * The cached value of the '{@link #getCargaHoraria() <em>Carga Horaria</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargaHoraria()
   * @generated
   * @ordered
   */
  protected EList<CargaHoraria> cargaHoraria;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MateriaImpl()
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
    return PdmPackage.Literals.MATERIA;
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
      nombre = new EDataTypeEList<String>(String.class, this, PdmPackage.MATERIA__NOMBRE);
    }
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CargaHoraria> getCargaHoraria()
  {
    if (cargaHoraria == null)
    {
      cargaHoraria = new EObjectContainmentEList<CargaHoraria>(CargaHoraria.class, this, PdmPackage.MATERIA__CARGA_HORARIA);
    }
    return cargaHoraria;
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
      case PdmPackage.MATERIA__CARGA_HORARIA:
        return ((InternalEList<?>)getCargaHoraria()).basicRemove(otherEnd, msgs);
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
      case PdmPackage.MATERIA__NOMBRE:
        return getNombre();
      case PdmPackage.MATERIA__CARGA_HORARIA:
        return getCargaHoraria();
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
      case PdmPackage.MATERIA__NOMBRE:
        getNombre().clear();
        getNombre().addAll((Collection<? extends String>)newValue);
        return;
      case PdmPackage.MATERIA__CARGA_HORARIA:
        getCargaHoraria().clear();
        getCargaHoraria().addAll((Collection<? extends CargaHoraria>)newValue);
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
      case PdmPackage.MATERIA__NOMBRE:
        getNombre().clear();
        return;
      case PdmPackage.MATERIA__CARGA_HORARIA:
        getCargaHoraria().clear();
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
      case PdmPackage.MATERIA__NOMBRE:
        return nombre != null && !nombre.isEmpty();
      case PdmPackage.MATERIA__CARGA_HORARIA:
        return cargaHoraria != null && !cargaHoraria.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //MateriaImpl
