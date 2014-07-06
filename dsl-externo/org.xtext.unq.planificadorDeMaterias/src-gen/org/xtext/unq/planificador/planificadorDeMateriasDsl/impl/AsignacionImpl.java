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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.unq.planificador.planificadorDeMateriasDsl.Asignacion;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.AulaHorario;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Materia;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.PlanificadorDeMateriasDslPackage;
import org.xtext.unq.planificador.planificadorDeMateriasDsl.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl#getInscriptos <em>Inscriptos</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl#getProfesores <em>Profesores</em>}</li>
 *   <li>{@link org.xtext.unq.planificador.planificadorDeMateriasDsl.impl.AsignacionImpl#getAulaHorarios <em>Aula Horarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionImpl extends ElementosPrimariosImpl implements Asignacion
{
  /**
   * The cached value of the '{@link #getMateria() <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateria()
   * @generated
   * @ordered
   */
  protected Materia materia;

  /**
   * The default value of the '{@link #getInscriptos() <em>Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInscriptos()
   * @generated
   * @ordered
   */
  protected static final int INSCRIPTOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInscriptos() <em>Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInscriptos()
   * @generated
   * @ordered
   */
  protected int inscriptos = INSCRIPTOS_EDEFAULT;

  /**
   * The cached value of the '{@link #getProfesores() <em>Profesores</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfesores()
   * @generated
   * @ordered
   */
  protected EList<Profesor> profesores;

  /**
   * The cached value of the '{@link #getAulaHorarios() <em>Aula Horarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAulaHorarios()
   * @generated
   * @ordered
   */
  protected EList<AulaHorario> aulaHorarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsignacionImpl()
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
    return PlanificadorDeMateriasDslPackage.Literals.ASIGNACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia getMateria()
  {
    if (materia != null && materia.eIsProxy())
    {
      InternalEObject oldMateria = (InternalEObject)materia;
      materia = (Materia)eResolveProxy(oldMateria);
      if (materia != oldMateria)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA, oldMateria, materia));
      }
    }
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia basicGetMateria()
  {
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMateria(Materia newMateria)
  {
    Materia oldMateria = materia;
    materia = newMateria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA, oldMateria, materia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInscriptos()
  {
    return inscriptos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInscriptos(int newInscriptos)
  {
    int oldInscriptos = inscriptos;
    inscriptos = newInscriptos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanificadorDeMateriasDslPackage.ASIGNACION__INSCRIPTOS, oldInscriptos, inscriptos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Profesor> getProfesores()
  {
    if (profesores == null)
    {
      profesores = new EObjectResolvingEList<Profesor>(Profesor.class, this, PlanificadorDeMateriasDslPackage.ASIGNACION__PROFESORES);
    }
    return profesores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AulaHorario> getAulaHorarios()
  {
    if (aulaHorarios == null)
    {
      aulaHorarios = new EObjectContainmentEList<AulaHorario>(AulaHorario.class, this, PlanificadorDeMateriasDslPackage.ASIGNACION__AULA_HORARIOS);
    }
    return aulaHorarios;
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__AULA_HORARIOS:
        return ((InternalEList<?>)getAulaHorarios()).basicRemove(otherEnd, msgs);
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        if (resolve) return getMateria();
        return basicGetMateria();
      case PlanificadorDeMateriasDslPackage.ASIGNACION__INSCRIPTOS:
        return getInscriptos();
      case PlanificadorDeMateriasDslPackage.ASIGNACION__PROFESORES:
        return getProfesores();
      case PlanificadorDeMateriasDslPackage.ASIGNACION__AULA_HORARIOS:
        return getAulaHorarios();
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        setMateria((Materia)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__INSCRIPTOS:
        setInscriptos((Integer)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__PROFESORES:
        getProfesores().clear();
        getProfesores().addAll((Collection<? extends Profesor>)newValue);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__AULA_HORARIOS:
        getAulaHorarios().clear();
        getAulaHorarios().addAll((Collection<? extends AulaHorario>)newValue);
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        setMateria((Materia)null);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__INSCRIPTOS:
        setInscriptos(INSCRIPTOS_EDEFAULT);
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__PROFESORES:
        getProfesores().clear();
        return;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__AULA_HORARIOS:
        getAulaHorarios().clear();
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
      case PlanificadorDeMateriasDslPackage.ASIGNACION__MATERIA:
        return materia != null;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__INSCRIPTOS:
        return inscriptos != INSCRIPTOS_EDEFAULT;
      case PlanificadorDeMateriasDslPackage.ASIGNACION__PROFESORES:
        return profesores != null && !profesores.isEmpty();
      case PlanificadorDeMateriasDslPackage.ASIGNACION__AULA_HORARIOS:
        return aulaHorarios != null && !aulaHorarios.isEmpty();
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
    result.append(" (inscriptos: ");
    result.append(inscriptos);
    result.append(')');
    return result.toString();
  }

} //AsignacionImpl
