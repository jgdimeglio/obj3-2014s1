/**
 */
package org.xtext.unq.planificador.planificadorDeMateriasDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Dedicacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Disponibilidad;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl#getDedicacion <em>Dedicacion</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.ProfesorImpl#getDisponibilidad <em>Disponibilidad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfesorImpl extends ElementosPrimariosImpl implements Profesor
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
   * The cached value of the '{@link #getDedicacion() <em>Dedicacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected Dedicacion dedicacion;

  /**
   * The cached value of the '{@link #getDisponibilidad() <em>Disponibilidad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisponibilidad()
   * @generated
   * @ordered
   */
  protected Disponibilidad disponibilidad;

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
    return PlanificadorDeMateriasDslPackage.Literals.PROFESOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PROFESOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dedicacion getDedicacion()
  {
    return dedicacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDedicacion(Dedicacion newDedicacion, NotificationChain msgs)
  {
    Dedicacion oldDedicacion = dedicacion;
    dedicacion = newDedicacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION, oldDedicacion, newDedicacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDedicacion(Dedicacion newDedicacion)
  {
    if (newDedicacion != dedicacion)
    {
      NotificationChain msgs = null;
      if (dedicacion != null)
        msgs = ((InternalEObject)dedicacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION, null, msgs);
      if (newDedicacion != null)
        msgs = ((InternalEObject)newDedicacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION, null, msgs);
      msgs = basicSetDedicacion(newDedicacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION, newDedicacion, newDedicacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disponibilidad getDisponibilidad()
  {
    return disponibilidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisponibilidad(Disponibilidad newDisponibilidad, NotificationChain msgs)
  {
    Disponibilidad oldDisponibilidad = disponibilidad;
    disponibilidad = newDisponibilidad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD, oldDisponibilidad, newDisponibilidad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisponibilidad(Disponibilidad newDisponibilidad)
  {
    if (newDisponibilidad != disponibilidad)
    {
      NotificationChain msgs = null;
      if (disponibilidad != null)
        msgs = ((InternalEObject)disponibilidad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD, null, msgs);
      if (newDisponibilidad != null)
        msgs = ((InternalEObject)newDisponibilidad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD, null, msgs);
      msgs = basicSetDisponibilidad(newDisponibilidad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD, newDisponibilidad, newDisponibilidad));
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
      case PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION:
        return basicSetDedicacion(null, msgs);
      case PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD:
        return basicSetDisponibilidad(null, msgs);
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
      case PlanificadorDeMateriasDslPackage.PROFESOR__NAME:
        return getName();
      case PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION:
        return getDedicacion();
      case PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD:
        return getDisponibilidad();
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
      case PlanificadorDeMateriasDslPackage.PROFESOR__NAME:
        setName((String)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION:
        setDedicacion((Dedicacion)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD:
        setDisponibilidad((Disponibilidad)newValue);
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
      case PlanificadorDeMateriasDslPackage.PROFESOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION:
        setDedicacion((Dedicacion)null);
        return;
      case PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD:
        setDisponibilidad((Disponibilidad)null);
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
      case PlanificadorDeMateriasDslPackage.PROFESOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanificadorDeMateriasDslPackage.PROFESOR__DEDICACION:
        return dedicacion != null;
      case PlanificadorDeMateriasDslPackage.PROFESOR__DISPONIBILIDAD:
        return disponibilidad != null;
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

} //ProfesorImpl
