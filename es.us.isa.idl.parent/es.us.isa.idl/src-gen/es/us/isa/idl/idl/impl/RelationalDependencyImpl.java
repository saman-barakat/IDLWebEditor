/**
 * generated by Xtext 2.25.0
 */
package es.us.isa.idl.idl.impl;

import es.us.isa.idl.idl.IdlPackage;
import es.us.isa.idl.idl.Param;
import es.us.isa.idl.idl.RelationalDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.us.isa.idl.idl.impl.RelationalDependencyImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.RelationalDependencyImpl#getRelationalOp <em>Relational Op</em>}</li>
 *   <li>{@link es.us.isa.idl.idl.impl.RelationalDependencyImpl#getParam2 <em>Param2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationalDependencyImpl extends GeneralTermImpl implements RelationalDependency
{
  /**
   * The cached value of the '{@link #getParam1() <em>Param1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam1()
   * @generated
   * @ordered
   */
  protected Param param1;

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
   * The cached value of the '{@link #getParam2() <em>Param2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam2()
   * @generated
   * @ordered
   */
  protected Param param2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationalDependencyImpl()
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
    return IdlPackage.Literals.RELATIONAL_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Param getParam1()
  {
    return param1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam1(Param newParam1, NotificationChain msgs)
  {
    Param oldParam1 = param1;
    param1 = newParam1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlPackage.RELATIONAL_DEPENDENCY__PARAM1, oldParam1, newParam1);
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
  public void setParam1(Param newParam1)
  {
    if (newParam1 != param1)
    {
      NotificationChain msgs = null;
      if (param1 != null)
        msgs = ((InternalEObject)param1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlPackage.RELATIONAL_DEPENDENCY__PARAM1, null, msgs);
      if (newParam1 != null)
        msgs = ((InternalEObject)newParam1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlPackage.RELATIONAL_DEPENDENCY__PARAM1, null, msgs);
      msgs = basicSetParam1(newParam1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.RELATIONAL_DEPENDENCY__PARAM1, newParam1, newParam1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.RELATIONAL_DEPENDENCY__RELATIONAL_OP, oldRelationalOp, relationalOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Param getParam2()
  {
    return param2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam2(Param newParam2, NotificationChain msgs)
  {
    Param oldParam2 = param2;
    param2 = newParam2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlPackage.RELATIONAL_DEPENDENCY__PARAM2, oldParam2, newParam2);
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
  public void setParam2(Param newParam2)
  {
    if (newParam2 != param2)
    {
      NotificationChain msgs = null;
      if (param2 != null)
        msgs = ((InternalEObject)param2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlPackage.RELATIONAL_DEPENDENCY__PARAM2, null, msgs);
      if (newParam2 != null)
        msgs = ((InternalEObject)newParam2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlPackage.RELATIONAL_DEPENDENCY__PARAM2, null, msgs);
      msgs = basicSetParam2(newParam2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.RELATIONAL_DEPENDENCY__PARAM2, newParam2, newParam2));
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
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM1:
        return basicSetParam1(null, msgs);
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM2:
        return basicSetParam2(null, msgs);
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
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM1:
        return getParam1();
      case IdlPackage.RELATIONAL_DEPENDENCY__RELATIONAL_OP:
        return getRelationalOp();
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM2:
        return getParam2();
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
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM1:
        setParam1((Param)newValue);
        return;
      case IdlPackage.RELATIONAL_DEPENDENCY__RELATIONAL_OP:
        setRelationalOp((String)newValue);
        return;
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM2:
        setParam2((Param)newValue);
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
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM1:
        setParam1((Param)null);
        return;
      case IdlPackage.RELATIONAL_DEPENDENCY__RELATIONAL_OP:
        setRelationalOp(RELATIONAL_OP_EDEFAULT);
        return;
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM2:
        setParam2((Param)null);
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
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM1:
        return param1 != null;
      case IdlPackage.RELATIONAL_DEPENDENCY__RELATIONAL_OP:
        return RELATIONAL_OP_EDEFAULT == null ? relationalOp != null : !RELATIONAL_OP_EDEFAULT.equals(relationalOp);
      case IdlPackage.RELATIONAL_DEPENDENCY__PARAM2:
        return param2 != null;
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
    result.append(" (relationalOp: ");
    result.append(relationalOp);
    result.append(')');
    return result.toString();
  }

} //RelationalDependencyImpl
