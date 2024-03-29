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

import org.xtext.example.mydsl.r2RML.ObjectMap;
import org.xtext.example.mydsl.r2RML.Predicate;
import org.xtext.example.mydsl.r2RML.PredicateObjectMap;
import org.xtext.example.mydsl.r2RML.R2RMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Object Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.PredicateObjectMapImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.PredicateObjectMapImpl#getObjectMap <em>Object Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateObjectMapImpl extends MinimalEObjectImpl.Container implements PredicateObjectMap
{
  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected Predicate predicate;

  /**
   * The cached value of the '{@link #getObjectMap() <em>Object Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectMap()
   * @generated
   * @ordered
   */
  protected ObjectMap objectMap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateObjectMapImpl()
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
    return R2RMLPackage.Literals.PREDICATE_OBJECT_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predicate getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(Predicate newPredicate, NotificationChain msgs)
  {
    Predicate oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE, oldPredicate, newPredicate);
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
  public void setPredicate(Predicate newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE, newPredicate, newPredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectMap getObjectMap()
  {
    return objectMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectMap(ObjectMap newObjectMap, NotificationChain msgs)
  {
    ObjectMap oldObjectMap = objectMap;
    objectMap = newObjectMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP, oldObjectMap, newObjectMap);
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
  public void setObjectMap(ObjectMap newObjectMap)
  {
    if (newObjectMap != objectMap)
    {
      NotificationChain msgs = null;
      if (objectMap != null)
        msgs = ((InternalEObject)objectMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP, null, msgs);
      if (newObjectMap != null)
        msgs = ((InternalEObject)newObjectMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP, null, msgs);
      msgs = basicSetObjectMap(newObjectMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP, newObjectMap, newObjectMap));
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
      case R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE:
        return basicSetPredicate(null, msgs);
      case R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP:
        return basicSetObjectMap(null, msgs);
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
      case R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE:
        return getPredicate();
      case R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP:
        return getObjectMap();
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
      case R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE:
        setPredicate((Predicate)newValue);
        return;
      case R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP:
        setObjectMap((ObjectMap)newValue);
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
      case R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE:
        setPredicate((Predicate)null);
        return;
      case R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP:
        setObjectMap((ObjectMap)null);
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
      case R2RMLPackage.PREDICATE_OBJECT_MAP__PREDICATE:
        return predicate != null;
      case R2RMLPackage.PREDICATE_OBJECT_MAP__OBJECT_MAP:
        return objectMap != null;
    }
    return super.eIsSet(featureID);
  }

} //PredicateObjectMapImpl
