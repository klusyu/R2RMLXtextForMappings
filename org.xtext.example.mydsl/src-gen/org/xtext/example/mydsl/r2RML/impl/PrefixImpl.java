/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.r2RML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.r2RML.Prefix;
import org.xtext.example.mydsl.r2RML.R2RMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.PrefixImpl#getPrefixName <em>Prefix Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.impl.PrefixImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrefixImpl extends MinimalEObjectImpl.Container implements Prefix
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
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected static final String URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected String uri = URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixImpl()
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
    return R2RMLPackage.Literals.PREFIX;
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
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.PREFIX__PREFIX_NAME, oldPrefixName, prefixName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUri(String newUri)
  {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, R2RMLPackage.PREFIX__URI, oldUri, uri));
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
      case R2RMLPackage.PREFIX__PREFIX_NAME:
        return getPrefixName();
      case R2RMLPackage.PREFIX__URI:
        return getUri();
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
      case R2RMLPackage.PREFIX__PREFIX_NAME:
        setPrefixName((String)newValue);
        return;
      case R2RMLPackage.PREFIX__URI:
        setUri((String)newValue);
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
      case R2RMLPackage.PREFIX__PREFIX_NAME:
        setPrefixName(PREFIX_NAME_EDEFAULT);
        return;
      case R2RMLPackage.PREFIX__URI:
        setUri(URI_EDEFAULT);
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
      case R2RMLPackage.PREFIX__PREFIX_NAME:
        return PREFIX_NAME_EDEFAULT == null ? prefixName != null : !PREFIX_NAME_EDEFAULT.equals(prefixName);
      case R2RMLPackage.PREFIX__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
    result.append(", uri: ");
    result.append(uri);
    result.append(')');
    return result.toString();
  }

} //PrefixImpl
