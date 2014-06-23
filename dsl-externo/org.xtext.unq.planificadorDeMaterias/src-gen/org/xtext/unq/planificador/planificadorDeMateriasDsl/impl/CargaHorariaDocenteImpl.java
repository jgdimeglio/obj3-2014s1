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
import org.xtext.unq.planificador.planificadorDeMateriasDsl.CargaHorariaDocente;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carga Horaria Docente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaDocenteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.CargaHorariaDocenteImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CargaHorariaDocenteImpl extends MinimalEObjectImpl.Container implements CargaHorariaDocente
{
  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected Profesor nombre;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected CargaHoraria tipo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CargaHorariaDocenteImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.CARGA_HORARIA_DOCENTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profesor getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNombre(Profesor newNombre, NotificationChain msgs)
  {
    Profesor oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE, oldNombre, newNombre);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(Profesor newNombre)
  {
    if (newNombre != nombre)
    {
      NotificationChain msgs = null;
      if (nombre != null)
        msgs = ((InternalEObject)nombre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE, null, msgs);
      if (newNombre != null)
        msgs = ((InternalEObject)newNombre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE, null, msgs);
      msgs = basicSetNombre(newNombre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE, newNombre, newNombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CargaHoraria getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(CargaHoraria newTipo, NotificationChain msgs)
  {
    CargaHoraria oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(CargaHoraria newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO, newTipo, newTipo));
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE:
        return basicSetNombre(null, msgs);
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO:
        return basicSetTipo(null, msgs);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE:
        return getNombre();
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO:
        return getTipo();
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE:
        setNombre((Profesor)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO:
        setTipo((CargaHoraria)newValue);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE:
        setNombre((Profesor)null);
        return;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO:
        setTipo((CargaHoraria)null);
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
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__NOMBRE:
        return nombre != null;
      case PlanificadorDeMateriasDslPackage.CARGA_HORARIA_DOCENTE__TIPO:
        return tipo != null;
    }
    return super.eIsSet(featureID);
  }

} //CargaHorariaDocenteImpl
