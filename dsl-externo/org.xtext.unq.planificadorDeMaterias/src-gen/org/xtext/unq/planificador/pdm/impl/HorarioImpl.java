/**
 */
package org.xtext.unq.planificador.pdm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unq.planificador.pdm.Aula;
import org.xtext.unq.planificador.pdm.Dia;
import org.xtext.unq.planificador.pdm.Hora;
import org.xtext.unq.planificador.pdm.Horario;
import org.xtext.unq.planificador.pdm.Materia;
import org.xtext.unq.planificador.pdm.PdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl#getDesde <em>Desde</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl#getHasta <em>Hasta</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.pdm.impl.HorarioImpl#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorarioImpl extends MinimalEObjectImpl.Container implements Horario
{
  /**
   * The cached value of the '{@link #getDia() <em>Dia</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected Dia dia;

  /**
   * The cached value of the '{@link #getDesde() <em>Desde</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesde()
   * @generated
   * @ordered
   */
  protected Hora desde;

  /**
   * The cached value of the '{@link #getHasta() <em>Hasta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasta()
   * @generated
   * @ordered
   */
  protected Hora hasta;

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
   * The cached value of the '{@link #getAula() <em>Aula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected Aula aula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorarioImpl()
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
    return PdmPackage.Literals.HORARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia getDia()
  {
    return dia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDia(Dia newDia, NotificationChain msgs)
  {
    Dia oldDia = dia;
    dia = newDia;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__DIA, oldDia, newDia);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDia(Dia newDia)
  {
    if (newDia != dia)
    {
      NotificationChain msgs = null;
      if (dia != null)
        msgs = ((InternalEObject)dia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__DIA, null, msgs);
      if (newDia != null)
        msgs = ((InternalEObject)newDia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__DIA, null, msgs);
      msgs = basicSetDia(newDia, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__DIA, newDia, newDia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hora getDesde()
  {
    return desde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesde(Hora newDesde, NotificationChain msgs)
  {
    Hora oldDesde = desde;
    desde = newDesde;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__DESDE, oldDesde, newDesde);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesde(Hora newDesde)
  {
    if (newDesde != desde)
    {
      NotificationChain msgs = null;
      if (desde != null)
        msgs = ((InternalEObject)desde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__DESDE, null, msgs);
      if (newDesde != null)
        msgs = ((InternalEObject)newDesde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__DESDE, null, msgs);
      msgs = basicSetDesde(newDesde, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__DESDE, newDesde, newDesde));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hora getHasta()
  {
    return hasta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasta(Hora newHasta, NotificationChain msgs)
  {
    Hora oldHasta = hasta;
    hasta = newHasta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__HASTA, oldHasta, newHasta);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasta(Hora newHasta)
  {
    if (newHasta != hasta)
    {
      NotificationChain msgs = null;
      if (hasta != null)
        msgs = ((InternalEObject)hasta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__HASTA, null, msgs);
      if (newHasta != null)
        msgs = ((InternalEObject)newHasta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__HASTA, null, msgs);
      msgs = basicSetHasta(newHasta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__HASTA, newHasta, newHasta));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__MATERIA, oldMateria, newMateria);
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
        msgs = ((InternalEObject)materia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__MATERIA, null, msgs);
      if (newMateria != null)
        msgs = ((InternalEObject)newMateria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__MATERIA, null, msgs);
      msgs = basicSetMateria(newMateria, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__MATERIA, newMateria, newMateria));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula getAula()
  {
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAula(Aula newAula, NotificationChain msgs)
  {
    Aula oldAula = aula;
    aula = newAula;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__AULA, oldAula, newAula);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAula(Aula newAula)
  {
    if (newAula != aula)
    {
      NotificationChain msgs = null;
      if (aula != null)
        msgs = ((InternalEObject)aula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__AULA, null, msgs);
      if (newAula != null)
        msgs = ((InternalEObject)newAula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdmPackage.HORARIO__AULA, null, msgs);
      msgs = basicSetAula(newAula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdmPackage.HORARIO__AULA, newAula, newAula));
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
      case PdmPackage.HORARIO__DIA:
        return basicSetDia(null, msgs);
      case PdmPackage.HORARIO__DESDE:
        return basicSetDesde(null, msgs);
      case PdmPackage.HORARIO__HASTA:
        return basicSetHasta(null, msgs);
      case PdmPackage.HORARIO__MATERIA:
        return basicSetMateria(null, msgs);
      case PdmPackage.HORARIO__AULA:
        return basicSetAula(null, msgs);
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
      case PdmPackage.HORARIO__DIA:
        return getDia();
      case PdmPackage.HORARIO__DESDE:
        return getDesde();
      case PdmPackage.HORARIO__HASTA:
        return getHasta();
      case PdmPackage.HORARIO__MATERIA:
        return getMateria();
      case PdmPackage.HORARIO__AULA:
        return getAula();
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
      case PdmPackage.HORARIO__DIA:
        setDia((Dia)newValue);
        return;
      case PdmPackage.HORARIO__DESDE:
        setDesde((Hora)newValue);
        return;
      case PdmPackage.HORARIO__HASTA:
        setHasta((Hora)newValue);
        return;
      case PdmPackage.HORARIO__MATERIA:
        setMateria((Materia)newValue);
        return;
      case PdmPackage.HORARIO__AULA:
        setAula((Aula)newValue);
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
      case PdmPackage.HORARIO__DIA:
        setDia((Dia)null);
        return;
      case PdmPackage.HORARIO__DESDE:
        setDesde((Hora)null);
        return;
      case PdmPackage.HORARIO__HASTA:
        setHasta((Hora)null);
        return;
      case PdmPackage.HORARIO__MATERIA:
        setMateria((Materia)null);
        return;
      case PdmPackage.HORARIO__AULA:
        setAula((Aula)null);
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
      case PdmPackage.HORARIO__DIA:
        return dia != null;
      case PdmPackage.HORARIO__DESDE:
        return desde != null;
      case PdmPackage.HORARIO__HASTA:
        return hasta != null;
      case PdmPackage.HORARIO__MATERIA:
        return materia != null;
      case PdmPackage.HORARIO__AULA:
        return aula != null;
    }
    return super.eIsSet(featureID);
  }

} //HorarioImpl
