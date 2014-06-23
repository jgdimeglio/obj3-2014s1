/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHoraria;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl#getCargaHoraria <em>Carga Horaria</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.MateriaImpl#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends MinimalEObjectImpl.Container implements Materia
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getRecursos() <em>Recursos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecursos()
   * @generated
   * @ordered
   */
  protected EList<Recurso> recursos;

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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.MATERIA__NAME, oldName, name));
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
  public EList<Recurso> getRecursos()
  {
    if (recursos == null)
    {
      recursos = new EObjectContainmentEList<Recurso>(Recurso.class, this, PlanificadorDeMateriasDslPackage.MATERIA__RECURSOS);
    }
    return recursos;
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
      case PlanificadorDeMateriasDslPackage.MATERIA__RECURSOS:
        return ((InternalEList<?>)getRecursos()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NAME:
        return getName();
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        return getCargaHoraria();
      case PlanificadorDeMateriasDslPackage.MATERIA__RECURSOS:
        return getRecursos();
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NAME:
        setName((String)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        setCargaHoraria((CargaHoraria)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MATERIA__RECURSOS:
        getRecursos().clear();
        getRecursos().addAll((Collection<? extends Recurso>)newValue);
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        setCargaHoraria((CargaHoraria)null);
        return;
      case PlanificadorDeMateriasDslPackage.MATERIA__RECURSOS:
        getRecursos().clear();
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
      case PlanificadorDeMateriasDslPackage.MATERIA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanificadorDeMateriasDslPackage.MATERIA__CARGA_HORARIA:
        return cargaHoraria != null;
      case PlanificadorDeMateriasDslPackage.MATERIA__RECURSOS:
        return recursos != null && !recursos.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MateriaImpl
