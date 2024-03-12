/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.r2RML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.Datatype#getDtName <em>Dt Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getDatatype()
 * @model
 * @generated
 */
public interface Datatype extends EObject
{
  /**
   * Returns the value of the '<em><b>Dt Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dt Name</em>' containment reference.
   * @see #setDtName(Qname)
   * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getDatatype_DtName()
   * @model containment="true"
   * @generated
   */
  Qname getDtName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.r2RML.Datatype#getDtName <em>Dt Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dt Name</em>' containment reference.
   * @see #getDtName()
   * @generated
   */
  void setDtName(Qname value);

} // Datatype