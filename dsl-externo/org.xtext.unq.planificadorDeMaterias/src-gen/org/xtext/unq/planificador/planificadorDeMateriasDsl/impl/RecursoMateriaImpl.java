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

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Recurso;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.RecursoMateria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurso Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoMateriaImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.RecursoMateriaImpl#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecursoMateriaImpl extends MinimalEObjectImpl.Container implements RecursoMateria
{
  /**
   * The cached value of the '{@link #getMateria() <em>Materia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateria()
   * @generated
   * @ordered
   */
  protected Materia materia;

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
  protected RecursoMateriaImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.RECURSO_MATERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia getMateria()
  {
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMateria(Materia newMateria, NotificationChain msgs)
  {
    Materia oldMateria = materia;
    materia = newMateria;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA, oldMateria, newMateria);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMateria(Materia newMateria)
  {
    if (newMateria != materia)
    {
      NotificationChain msgs = null;
      if (materia != null)
        msgs = ((InternalEObject)materia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA, null, msgs);
      if (newMateria != null)
        msgs = ((InternalEObject)newMateria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA, null, msgs);
      msgs = basicSetMateria(newMateria, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA, newMateria, newMateria));
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
      recursos = new EObjectContainmentEList<Recurso>(Recurso.class, this, PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__RECURSOS);
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
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA:
        return basicSetMateria(null, msgs);
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__RECURSOS:
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
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA:
        return getMateria();
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__RECURSOS:
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
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA:
        setMateria((Materia)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__RECURSOS:
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
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA:
        setMateria((Materia)null);
        return;
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__RECURSOS:
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
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__MATERIA:
        return materia != null;
      case PlanificadorDeMateriasDslPackage.RECURSO_MATERIA__RECURSOS:
        return recursos != null && !recursos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecursoMateriaImpl
