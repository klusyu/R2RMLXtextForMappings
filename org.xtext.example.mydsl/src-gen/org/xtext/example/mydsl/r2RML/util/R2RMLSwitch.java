/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.r2RML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.r2RML.BooleanValue;
import org.xtext.example.mydsl.r2RML.Column;
import org.xtext.example.mydsl.r2RML.Condition;
import org.xtext.example.mydsl.r2RML.Constant;
import org.xtext.example.mydsl.r2RML.Datatype;
import org.xtext.example.mydsl.r2RML.LogicalTable;
import org.xtext.example.mydsl.r2RML.Mapping;
import org.xtext.example.mydsl.r2RML.NodeID;
import org.xtext.example.mydsl.r2RML.NumberValue;
import org.xtext.example.mydsl.r2RML.ObjectMap;
import org.xtext.example.mydsl.r2RML.Predicate;
import org.xtext.example.mydsl.r2RML.PredicateObjectMap;
import org.xtext.example.mydsl.r2RML.Prefix;
import org.xtext.example.mydsl.r2RML.Qname;
import org.xtext.example.mydsl.r2RML.R2RMLPackage;
import org.xtext.example.mydsl.r2RML.SelectedColumns;
import org.xtext.example.mydsl.r2RML.SimpleSelectStatement;
import org.xtext.example.mydsl.r2RML.Statement;
import org.xtext.example.mydsl.r2RML.StringValue;
import org.xtext.example.mydsl.r2RML.SubjectMap;
import org.xtext.example.mydsl.r2RML.Template;
import org.xtext.example.mydsl.r2RML.TriplesMap;
import org.xtext.example.mydsl.r2RML.Value;
import org.xtext.example.mydsl.r2RML.WhereClause;
import org.xtext.example.mydsl.r2RML.iResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.r2RML.R2RMLPackage
 * @generated
 */
public class R2RMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static R2RMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public R2RMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = R2RMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case R2RMLPackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.TRIPLES_MAP:
      {
        TriplesMap triplesMap = (TriplesMap)theEObject;
        T result = caseTriplesMap(triplesMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.LOGICAL_TABLE:
      {
        LogicalTable logicalTable = (LogicalTable)theEObject;
        T result = caseLogicalTable(logicalTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.SUBJECT_MAP:
      {
        SubjectMap subjectMap = (SubjectMap)theEObject;
        T result = caseSubjectMap(subjectMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.PREDICATE_OBJECT_MAP:
      {
        PredicateObjectMap predicateObjectMap = (PredicateObjectMap)theEObject;
        T result = casePredicateObjectMap(predicateObjectMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.OBJECT_MAP:
      {
        ObjectMap objectMap = (ObjectMap)theEObject;
        T result = caseObjectMap(objectMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.CLASS:
      {
        org.xtext.example.mydsl.r2RML.Class class_ = (org.xtext.example.mydsl.r2RML.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.COLUMN:
      {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.IRESOURCE:
      {
        iResource iResource = (iResource)theEObject;
        T result = caseiResource(iResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.NODE_ID:
      {
        NodeID nodeID = (NodeID)theEObject;
        T result = caseNodeID(nodeID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.QNAME:
      {
        Qname qname = (Qname)theEObject;
        T result = caseQname(qname);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.SIMPLE_SELECT_STATEMENT:
      {
        SimpleSelectStatement simpleSelectStatement = (SimpleSelectStatement)theEObject;
        T result = caseSimpleSelectStatement(simpleSelectStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.SELECTED_COLUMNS:
      {
        SelectedColumns selectedColumns = (SelectedColumns)theEObject;
        T result = caseSelectedColumns(selectedColumns);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.WHERE_CLAUSE:
      {
        WhereClause whereClause = (WhereClause)theEObject;
        T result = caseWhereClause(whereClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.BOOLEAN_VALUE:
      {
        BooleanValue booleanValue = (BooleanValue)theEObject;
        T result = caseBooleanValue(booleanValue);
        if (result == null) result = caseValue(booleanValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.NUMBER_VALUE:
      {
        NumberValue numberValue = (NumberValue)theEObject;
        T result = caseNumberValue(numberValue);
        if (result == null) result = caseValue(numberValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case R2RMLPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triples Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triples Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriplesMap(TriplesMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalTable(LogicalTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectMap(SubjectMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Object Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Object Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateObjectMap(PredicateObjectMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectMap(ObjectMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(org.xtext.example.mydsl.r2RML.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplate(Template object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatype(Datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>iResource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>iResource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseiResource(iResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeID(NodeID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qname</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qname</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQname(Qname object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Select Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Select Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSelectStatement(SimpleSelectStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selected Columns</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selected Columns</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectedColumns(SelectedColumns object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhereClause(WhereClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValue(BooleanValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberValue(NumberValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //R2RMLSwitch