/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl#getCargaHoraria <em>Carga Horaria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends MinimalEObjectImpl.Container implements Materia
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCargaHoraria() <em>Carga Horaria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargaHoraria()
   * @generated
   * @ordered
   */
  protected CargaHoraria cargaHoraria;

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
    return PlanificadorDeMateriasDslPackage.Literals.MATERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.MATERIA__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CargaHoraria getCargaHoraria()
  {
    return cargaHoraria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCargaHoraria(CargaHoraria newCargaHoraria, NotificationChain msgs)
  {
    CargaHoraria oldCargaHoraria = cargaHoraria;
    cargaHoraria = newCargaHoraria;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA, oldCargaHoraria, newCargaHoraria);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCargaHoraria(CargaHoraria newCargaHoraria)
  {
    if (newCargaHoraria != cargaHoraria)
    {
      NotificationChain msgs = null;
      if (cargaHoraria != null)
        msgs = ((InternalEObject)cargaHoraria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA, null, msgs);
      if (newCargaHoraria != null)
        msgs = ((InternalEObject)newCargaHoraria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA, null, msgs);
      msgs = basicSetCargaHoraria(newCargaHoraria, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA, newCargaHoraria, newCargaHoraria));
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
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        return basicSetCargaHoraria(null, msgs);
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NOMBRE:
        return getNombre();
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        return getCargaHoraria();
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NOMBRE:
        setNombre((String)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        setCargaHoraria((CargaHoraria)newValue);
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        setCargaHoraria((CargaHoraria)null);
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        return cargaHoraria != null;
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
