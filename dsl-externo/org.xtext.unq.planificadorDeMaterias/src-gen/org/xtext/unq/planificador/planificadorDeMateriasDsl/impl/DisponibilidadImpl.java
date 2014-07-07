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

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.DiaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disponibilidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl#getDiasNoPuede <em>Dias No Puede</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl#getDiasHorario <em>Dias Horario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisponibilidadImpl extends MinimalEObjectImpl.Container implements Disponibilidad
{
  /**
   * The cached value of the '{@link #getDiasNoPuede() <em>Dias No Puede</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasNoPuede()
   * @generated
   * @ordered
   */
  protected EList<Dia> diasNoPuede;

  /**
   * The cached value of the '{@link #getDiasHorario() <em>Dias Horario</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasHorario()
   * @generated
   * @ordered
   */
  protected EList<DiaHorario> diasHorario;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisponibilidadImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.DISPONIBILIDAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dia> getDiasNoPuede()
  {
    if (diasNoPuede == null)
    {
      diasNoPuede = new EObjectContainmentEList<Dia>(Dia.class, this, PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_NO_PUEDE);
    }
    return diasNoPuede;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiaHorario> getDiasHorario()
  {
    if (diasHorario == null)
    {
      diasHorario = new EObjectContainmentEList<DiaHorario>(DiaHorario.class, this, PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_HORARIO);
    }
    return diasHorario;
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_NO_PUEDE:
        return ((InternalEList<?>)getDiasNoPuede()).basicRemove(otherEnd, msgs);
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_HORARIO:
        return ((InternalEList<?>)getDiasHorario()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_NO_PUEDE:
        return getDiasNoPuede();
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_HORARIO:
        return getDiasHorario();
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_NO_PUEDE:
        getDiasNoPuede().clear();
        getDiasNoPuede().addAll((Collection<? extends Dia>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_HORARIO:
        getDiasHorario().clear();
        getDiasHorario().addAll((Collection<? extends DiaHorario>)newValue);
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_NO_PUEDE:
        getDiasNoPuede().clear();
        return;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_HORARIO:
        getDiasHorario().clear();
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_NO_PUEDE:
        return diasNoPuede != null && !diasNoPuede.isEmpty();
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS_HORARIO:
        return diasHorario != null && !diasHorario.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DisponibilidadImpl
