/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.r2RML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.r2RML.Datatype;
import org.xtext.example.mydsl.r2RML.Qname;
import org.xtext.example.mydsl.r2RML.R2RMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.DatatypeImpl#getDtName <em>Dt Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatatypeImpl extends MinimalEObjectImpl.Container implements Datatype
{
  /**
   * The cached value of the '{@link #getDtName() <em>Dt Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtName()
   * @generated
   * @ordered
   */
  protected Qname dtName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatatypeImpl()
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
    return R2RMLPackage.Literals.DATATYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Qname getDtName()
  {
    return dtName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDtName(Qname newDtName, NotificationChain msgs)
  {
    Qname oldDtName = dtName;
    dtName = newDtName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2RMLPackage.DATATYPE__DT_NAME, oldDtName, newDtName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDtName(Qname newDtName)
  {
    if (newDtName != dtName)
    {
      NotificationChain msgs = null;
      if (dtName != null)
        msgs = ((InternalEObject)dtName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.DATATYPE__DT_NAME, null, msgs);
      if (newDtName != null)
        msgs = ((InternalEObject)newDtName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.DATATYPE__DT_NAME, null, msgs);
      msgs = basicSetDtName(newDtName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.DATATYPE__DT_NAME, newDtName, newDtName));
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
      case R2RMLPackage.DATATYPE__DT_NAME:
        return basicSetDtName(null, msgs);
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
      case R2RMLPackage.DATATYPE__DT_NAME:
        return getDtName();
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
      case R2RMLPackage.DATATYPE__DT_NAME:
        setDtName((Qname)newValue);
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
      case R2RMLPackage.DATATYPE__DT_NAME:
        setDtName((Qname)null);
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
      case R2RMLPackage.DATATYPE__DT_NAME:
        return dtName != null;
    }
    return super.eIsSet(featureID);
  }

} //DatatypeImpl