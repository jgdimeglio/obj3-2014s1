/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosPrimarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.ElementosSecundarios;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Model;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Planificacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getElementosPrimarios <em>Elementos Primarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getElementosSecundarios <em>Elementos Secundarios</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ModelImpl#getPlanificacion <em>Planificacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getElementosPrimarios() <em>Elementos Primarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementosPrimarios()
   * @generated
   * @ordered
   */
  protected EList<ElementosPrimarios> elementosPrimarios;

  /**
   * The cached value of the '{@link #getElementosSecundarios() <em>Elementos Secundarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementosSecundarios()
   * @generated
   * @ordered
   */
  protected EList<ElementosSecundarios> elementosSecundarios;

  /**
   * The cached value of the '{@link #getPlanificacion() <em>Planificacion</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanificacion()
   * @generated
   * @ordered
   */
  protected EList<Planificacion> planificacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementosPrimarios> getElementosPrimarios()
  {
    if (elementosPrimarios == null)
    {
      elementosPrimarios = new EObjectContainmentEList<ElementosPrimarios>(ElementosPrimarios.class, this, PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_PRIMARIOS);
    }
    return elementosPrimarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementosSecundarios> getElementosSecundarios()
  {
    if (elementosSecundarios == null)
    {
      elementosSecundarios = new EObjectContainmentEList<ElementosSecundarios>(ElementosSecundarios.class, this, PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_SECUNDARIOS);
    }
    return elementosSecundarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Planificacion> getPlanificacion()
  {
    if (planificacion == null)
    {
      planificacion = new EObjectContainmentEList<Planificacion>(Planificacion.class, this, PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACION);
    }
    return planificacion;
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
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_PRIMARIOS:
        return ((InternalEList<?>)getElementosPrimarios()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_SECUNDARIOS:
        return ((InternalEList<?>)getElementosSecundarios()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACION:
        return ((InternalEList<?>)getPlanificacion()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_PRIMARIOS:
        return getElementosPrimarios();
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_SECUNDARIOS:
        return getElementosSecundarios();
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACION:
        return getPlanificacion();
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
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_PRIMARIOS:
        getElementosPrimarios().clear();
        getElementosPrimarios().addAll((Collection<? extends ElementosPrimarios>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_SECUNDARIOS:
        getElementosSecundarios().clear();
        getElementosSecundarios().addAll((Collection<? extends ElementosSecundarios>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACION:
        getPlanificacion().clear();
        getPlanificacion().addAll((Collection<? extends Planificacion>)newValue);
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
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_PRIMARIOS:
        getElementosPrimarios().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_SECUNDARIOS:
        getElementosSecundarios().clear();
        return;
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACION:
        getPlanificacion().clear();
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
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_PRIMARIOS:
        return elementosPrimarios != null && !elementosPrimarios.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__ELEMENTOS_SECUNDARIOS:
        return elementosSecundarios != null && !elementosSecundarios.isEmpty();
      case PlanificadorDeMateriasDslPackage.MODEL__PLANIFICACION:
        return planificacion != null && !planificacion.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
