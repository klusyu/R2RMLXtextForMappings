/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.r2RML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triples Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.r2RML.TriplesMap#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.TriplesMap#getLogicalTable <em>Logical Table</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.TriplesMap#getSubjectMap <em>Subject Map</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.r2RML.TriplesMap#getPredicateObjectMaps <em>Predicate Object Maps</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getTriplesMap()
 * @model
 * @generated
 */
public interface TriplesMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getTriplesMap_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.r2RML.TriplesMap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Logical Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Table</em>' containment reference.
   * @see #setLogicalTable(LogicalTable)
   * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getTriplesMap_LogicalTable()
   * @model containment="true"
   * @generated
   */
  LogicalTable getLogicalTable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.r2RML.TriplesMap#getLogicalTable <em>Logical Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical Table</em>' containment reference.
   * @see #getLogicalTable()
   * @generated
   */
  void setLogicalTable(LogicalTable value);

  /**
   * Returns the value of the '<em><b>Subject Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject Map</em>' containment reference.
   * @see #setSubjectMap(SubjectMap)
   * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getTriplesMap_SubjectMap()
   * @model containment="true"
   * @generated
   */
  SubjectMap getSubjectMap();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.r2RML.TriplesMap#getSubjectMap <em>Subject Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject Map</em>' containment reference.
   * @see #getSubjectMap()
   * @generated
   */
  void setSubjectMap(SubjectMap value);

  /**
   * Returns the value of the '<em><b>Predicate Object Maps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.r2RML.PredicateObjectMap}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate Object Maps</em>' containment reference list.
   * @see org.xtext.example.mydsl.r2RML.R2RMLPackage#getTriplesMap_PredicateObjectMaps()
   * @model containment="true"
   * @generated
   */
  EList<PredicateObjectMap> getPredicateObjectMaps();

} // TriplesMap
