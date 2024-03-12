/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.r2RML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.r2RML.Qname;
import org.xtext.example.mydsl.r2RML.R2RMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qname</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.QnameImpl#getPrefixName <em>Prefix Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.QnameImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QnameImpl extends MinimalEObjectImpl.Container implements Qname
{
  /**
   * The default value of the '{@link #getPrefixName() <em>Prefix Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixName()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefixName() <em>Prefix Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixName()
   * @generated
   * @ordered
   */
  protected String prefixName = PREFIX_NAME_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QnameImpl()
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
    return R2RMLPackage.Literals.QNAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPrefixName()
  {
    return prefixName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrefixName(String newPrefixName)
  {
    String oldPrefixName = prefixName;
    prefixName = newPrefixName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.QNAME__PREFIX_NAME, oldPrefixName, prefixName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.QNAME__NAME, oldName, name));
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
      case R2RMLPackage.QNAME__PREFIX_NAME:
        return getPrefixName();
      case R2RMLPackage.QNAME__NAME:
        return getName();
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
      case R2RMLPackage.QNAME__PREFIX_NAME:
        setPrefixName((String)newValue);
        return;
      case R2RMLPackage.QNAME__NAME:
        setName((String)newValue);
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
      case R2RMLPackage.QNAME__PREFIX_NAME:
        setPrefixName(PREFIX_NAME_EDEFAULT);
        return;
      case R2RMLPackage.QNAME__NAME:
        setName(NAME_EDEFAULT);
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
      case R2RMLPackage.QNAME__PREFIX_NAME:
        return PREFIX_NAME_EDEFAULT == null ? prefixName != null : !PREFIX_NAME_EDEFAULT.equals(prefixName);
      case R2RMLPackage.QNAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (prefixName: ");
    result.append(prefixName);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //QnameImpl