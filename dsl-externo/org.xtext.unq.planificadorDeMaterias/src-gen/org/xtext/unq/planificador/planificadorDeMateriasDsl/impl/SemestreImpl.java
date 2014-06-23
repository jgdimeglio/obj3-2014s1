/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl#getAnho <em>Anho</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.SemestreImpl#getNumero <em>Numero</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemestreImpl extends MinimalEObjectImpl.Container implements Semestre
{
  /**
   * The default value of the '{@link #getAnho() <em>Anho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnho()
   * @generated
   * @ordered
   */
  protected static final int ANHO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAnho() <em>Anho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnho()
   * @generated
   * @ordered
   */
  protected int anho = ANHO_EDEFAULT;

  /**
   * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected static final int NUMERO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected int numero = NUMERO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SemestreImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.SEMESTRE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAnho()
  {
    return anho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnho(int newAnho)
  {
    int oldAnho = anho;
    anho = newAnho;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.SEMESTRE__ANHO, oldAnho, anho));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumero()
  {
    return numero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumero(int newNumero)
  {
    int oldNumero = numero;
    numero = newNumero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.SEMESTRE__NUMERO, oldNumero, numero));
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
      case PlanificadorDeMateriasDslPackage.SEMESTRE__ANHO:
        return getAnho();
      case PlanificadorDeMateriasDslPackage.SEMESTRE__NUMERO:
        return getNumero();
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
      case PlanificadorDeMateriasDslPackage.SEMESTRE__ANHO:
        setAnho((Integer)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.SEMESTRE__NUMERO:
        setNumero((Integer)newValue);
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
      case PlanificadorDeMateriasDslPackage.SEMESTRE__ANHO:
        setAnho(ANHO_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.SEMESTRE__NUMERO:
        setNumero(NUMERO_EDEFAULT);
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
      case PlanificadorDeMateriasDslPackage.SEMESTRE__ANHO:
        return anho != ANHO_EDEFAULT;
      case PlanificadorDeMateriasDslPackage.SEMESTRE__NUMERO:
        return numero != NUMERO_EDEFAULT;
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
    result.append(" (anho: ");
    result.append(anho);
    result.append(", numero: ");
    result.append(numero);
    result.append(')');
    return result.toString();
  }

} //SemestreImpl
