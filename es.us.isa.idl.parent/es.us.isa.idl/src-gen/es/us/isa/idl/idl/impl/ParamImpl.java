/**
 * generated by Xtext 2.30.0
 */
package es.us.isa.idl.idl.impl;

import es.us.isa.idl.idl.IdlPackage;
import es.us.isa.idl.idl.Param;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.idl.idl.impl.ParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.ParamImpl#getStringValues <em>String Values</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.ParamImpl#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.ParamImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.ParamImpl#getRelationalOp <em>Relational Op</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.ParamImpl#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamImpl extends ParamValueRelationImpl implements Param
{
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
   * The cached value of the '{@link #getStringValues() <em>String Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValues()
   * @generated
   * @ordered
   */
  protected EList<String> stringValues;

  /**
   * The default value of the '{@link #getPatternString() <em>Pattern String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternString()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPatternString() <em>Pattern String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternString()
   * @generated
   * @ordered
   */
  protected String patternString = PATTERN_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected String booleanValue = BOOLEAN_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getRelationalOp() <em>Relational Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalOp()
   * @generated
   * @ordered
   */
  protected static final String RELATIONAL_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationalOp() <em>Relational Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalOp()
   * @generated
   * @ordered
   */
  protected String relationalOp = RELATIONAL_OP_EDEFAULT;

  /**
   * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected static final String DOUBLE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected String doubleValue = DOUBLE_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamImpl()
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
    return IdlPackage.Literals.PARAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.PARAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getStringValues()
  {
    if (stringValues == null)
    {
      stringValues = new EDataTypeEList<String>(String.class, this, IdlPackage.PARAM__STRING_VALUES);
    }
    return stringValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPatternString()
  {
    return patternString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPatternString(String newPatternString)
  {
    String oldPatternString = patternString;
    patternString = newPatternString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.PARAM__PATTERN_STRING, oldPatternString, patternString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBooleanValue()
  {
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBooleanValue(String newBooleanValue)
  {
    String oldBooleanValue = booleanValue;
    booleanValue = newBooleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.PARAM__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRelationalOp()
  {
    return relationalOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelationalOp(String newRelationalOp)
  {
    String oldRelationalOp = relationalOp;
    relationalOp = newRelationalOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.PARAM__RELATIONAL_OP, oldRelationalOp, relationalOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDoubleValue()
  {
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDoubleValue(String newDoubleValue)
  {
    String oldDoubleValue = doubleValue;
    doubleValue = newDoubleValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.PARAM__DOUBLE_VALUE, oldDoubleValue, doubleValue));
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
      case IdlPackage.PARAM__NAME:
        return getName();
      case IdlPackage.PARAM__STRING_VALUES:
        return getStringValues();
      case IdlPackage.PARAM__PATTERN_STRING:
        return getPatternString();
      case IdlPackage.PARAM__BOOLEAN_VALUE:
        return getBooleanValue();
      case IdlPackage.PARAM__RELATIONAL_OP:
        return getRelationalOp();
      case IdlPackage.PARAM__DOUBLE_VALUE:
        return getDoubleValue();
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
      case IdlPackage.PARAM__NAME:
        setName((String)newValue);
        return;
      case IdlPackage.PARAM__STRING_VALUES:
        getStringValues().clear();
        getStringValues().addAll((Collection<? extends String>)newValue);
        return;
      case IdlPackage.PARAM__PATTERN_STRING:
        setPatternString((String)newValue);
        return;
      case IdlPackage.PARAM__BOOLEAN_VALUE:
        setBooleanValue((String)newValue);
        return;
      case IdlPackage.PARAM__RELATIONAL_OP:
        setRelationalOp((String)newValue);
        return;
      case IdlPackage.PARAM__DOUBLE_VALUE:
        setDoubleValue((String)newValue);
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
      case IdlPackage.PARAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdlPackage.PARAM__STRING_VALUES:
        getStringValues().clear();
        return;
      case IdlPackage.PARAM__PATTERN_STRING:
        setPatternString(PATTERN_STRING_EDEFAULT);
        return;
      case IdlPackage.PARAM__BOOLEAN_VALUE:
        setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
        return;
      case IdlPackage.PARAM__RELATIONAL_OP:
        setRelationalOp(RELATIONAL_OP_EDEFAULT);
        return;
      case IdlPackage.PARAM__DOUBLE_VALUE:
        setDoubleValue(DOUBLE_VALUE_EDEFAULT);
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
      case IdlPackage.PARAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdlPackage.PARAM__STRING_VALUES:
        return stringValues != null && !stringValues.isEmpty();
      case IdlPackage.PARAM__PATTERN_STRING:
        return PATTERN_STRING_EDEFAULT == null ? patternString != null : !PATTERN_STRING_EDEFAULT.equals(patternString);
      case IdlPackage.PARAM__BOOLEAN_VALUE:
        return BOOLEAN_VALUE_EDEFAULT == null ? booleanValue != null : !BOOLEAN_VALUE_EDEFAULT.equals(booleanValue);
      case IdlPackage.PARAM__RELATIONAL_OP:
        return RELATIONAL_OP_EDEFAULT == null ? relationalOp != null : !RELATIONAL_OP_EDEFAULT.equals(relationalOp);
      case IdlPackage.PARAM__DOUBLE_VALUE:
        return DOUBLE_VALUE_EDEFAULT == null ? doubleValue != null : !DOUBLE_VALUE_EDEFAULT.equals(doubleValue);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", stringValues: ");
    result.append(stringValues);
    result.append(", patternString: ");
    result.append(patternString);
    result.append(", booleanValue: ");
    result.append(booleanValue);
    result.append(", relationalOp: ");
    result.append(relationalOp);
    result.append(", doubleValue: ");
    result.append(doubleValue);
    result.append(')');
    return result.toString();
  }

} //ParamImpl
