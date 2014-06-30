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

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disponibilidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl#getDias <em>Dias</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl#getInicio <em>Inicio</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.DisponibilidadImpl#getFin <em>Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisponibilidadImpl extends MinimalEObjectImpl.Container implements Disponibilidad
{
  /**
   * The cached value of the '{@link #getDias() <em>Dias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDias()
   * @generated
   * @ordered
   */
  protected EList<Dia> dias;

  /**
   * The default value of the '{@link #getInicio() <em>Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInicio()
   * @generated
   * @ordered
   */
  protected static final int INICIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInicio() <em>Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInicio()
   * @generated
   * @ordered
   */
  protected int inicio = INICIO_EDEFAULT;

  /**
   * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFin()
   * @generated
   * @ordered
   */
  protected static final int FIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFin()
   * @generated
   * @ordered
   */
  protected int fin = FIN_EDEFAULT;

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
  public EList<Dia> getDias()
  {
    if (dias == null)
    {
      dias = new EObjectContainmentEList<Dia>(Dia.class, this, PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS);
    }
    return dias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInicio()
  {
    return inicio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInicio(int newInicio)
  {
    int oldInicio = inicio;
    inicio = newInicio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__INICIO, oldInicio, inicio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFin()
  {
    return fin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFin(int newFin)
  {
    int oldFin = fin;
    fin = newFin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__FIN, oldFin, fin));
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS:
        return ((InternalEList<?>)getDias()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS:
        return getDias();
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__INICIO:
        return getInicio();
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__FIN:
        return getFin();
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS:
        getDias().clear();
        getDias().addAll((Collection<? extends Dia>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__INICIO:
        setInicio((Integer)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__FIN:
        setFin((Integer)newValue);
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS:
        getDias().clear();
        return;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__INICIO:
        setInicio(INICIO_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__FIN:
        setFin(FIN_EDEFAULT);
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
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__DIAS:
        return dias != null && !dias.isEmpty();
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__INICIO:
        return inicio != INICIO_EDEFAULT;
      case PlanificadorDeMateriasDslPackage.DISPONIBILIDAD__FIN:
        return fin != FIN_EDEFAULT;
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
    result.append(" (inicio: ");
    result.append(inicio);
    result.append(", fin: ");
    result.append(fin);
    result.append(')');
    return result.toString();
  }

} //DisponibilidadImpl
