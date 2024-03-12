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

import org.xtext.example.mydsl.r2RML.R2RMLPackage;
import org.xtext.example.mydsl.r2RML.SubjectMap;
import org.xtext.example.mydsl.r2RML.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.SubjectMapImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.SubjectMapImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectMapImpl extends MinimalEObjectImpl.Container implements SubjectMap
{
  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected Template template;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.r2RML.Class class_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectMapImpl()
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
    return R2RMLPackage.Literals.SUBJECT_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Template getTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplate(Template newTemplate, NotificationChain msgs)
  {
    Template oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2RMLPackage.SUBJECT_MAP__TEMPLATE, oldTemplate, newTemplate);
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
  public void setTemplate(Template newTemplate)
  {
    if (newTemplate != template)
    {
      NotificationChain msgs = null;
      if (template != null)
        msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.SUBJECT_MAP__TEMPLATE, null, msgs);
      if (newTemplate != null)
        msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.SUBJECT_MAP__TEMPLATE, null, msgs);
      msgs = basicSetTemplate(newTemplate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.SUBJECT_MAP__TEMPLATE, newTemplate, newTemplate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.example.mydsl.r2RML.Class getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(org.xtext.example.mydsl.r2RML.Class newClass, NotificationChain msgs)
  {
    org.xtext.example.mydsl.r2RML.Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2RMLPackage.SUBJECT_MAP__CLASS, oldClass, newClass);
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
  public void setClass(org.xtext.example.mydsl.r2RML.Class newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.SUBJECT_MAP__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2RMLPackage.SUBJECT_MAP__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.SUBJECT_MAP__CLASS, newClass, newClass));
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
      case R2RMLPackage.SUBJECT_MAP__TEMPLATE:
        return basicSetTemplate(null, msgs);
      case R2RMLPackage.SUBJECT_MAP__CLASS:
        return basicSetClass(null, msgs);
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
      case R2RMLPackage.SUBJECT_MAP__TEMPLATE:
        return getTemplate();
      case R2RMLPackage.SUBJECT_MAP__CLASS:
        return getClass_();
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
      case R2RMLPackage.SUBJECT_MAP__TEMPLATE:
        setTemplate((Template)newValue);
        return;
      case R2RMLPackage.SUBJECT_MAP__CLASS:
        setClass((org.xtext.example.mydsl.r2RML.Class)newValue);
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
      case R2RMLPackage.SUBJECT_MAP__TEMPLATE:
        setTemplate((Template)null);
        return;
      case R2RMLPackage.SUBJECT_MAP__CLASS:
        setClass((org.xtext.example.mydsl.r2RML.Class)null);
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
      case R2RMLPackage.SUBJECT_MAP__TEMPLATE:
        return template != null;
      case R2RMLPackage.SUBJECT_MAP__CLASS:
        return class_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SubjectMapImpl