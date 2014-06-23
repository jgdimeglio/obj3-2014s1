/**
 */
package org.xtext.unq.planificador.planificadorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDsl.Horario;
import org.xtext.unq.planificador.planificadorDsl.Horarios;
import org.xtext.unq.planificador.planificadorDsl.PlanificadorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horarios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDsl.impl.HorariosImpl#getHorarios <em>Horarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorariosImpl extends MinimalEObjectImpl.Container implements Horarios
{
  /**
   * The cached value of the '{@link #getHorarios() <em>Horarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarios()
   * @generated
   * @ordered
   */
  protected EList<Horario> horarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorariosImpl()
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
    return PlanificadorDslPackage.Literals.HORARIOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Horario> getHorarios()
  {
    if (horarios == null)
    {
      horarios = new EObjectContainmentEList<Horario>(Horario.class, this, PlanificadorDslPackage.HORARIOS__HORARIOS);
    }
    return horarios;
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
      case PlanificadorDslPackage.HORARIOS__HORARIOS:
        return ((InternalEList<?>)getHorarios()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDslPackage.HORARIOS__HORARIOS:
        return getHorarios();
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
      case PlanificadorDslPackage.HORARIOS__HORARIOS:
        getHorarios().clear();
        getHorarios().addAll((Collection<? extends Horario>)newValue);
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
      case PlanificadorDslPackage.HORARIOS__HORARIOS:
        getHorarios().clear();
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
      case PlanificadorDslPackage.HORARIOS__HORARIOS:
        return horarios != null && !horarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HorariosImpl
