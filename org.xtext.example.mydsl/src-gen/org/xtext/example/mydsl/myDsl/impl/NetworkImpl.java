/**
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Layer;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Network;
import org.xtext.example.mydsl.myDsl.UpdaterType;
import org.xtext.example.mydsl.myDsl.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetworkImpl#getEpochs <em>Epochs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetworkImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetworkImpl#getUpdaterType <em>Updater Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetworkImpl#getLearningRate <em>Learning Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NetworkImpl#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network
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
   * The default value of the '{@link #getEpochs() <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected static final String EPOCHS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEpochs() <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected String epochs = EPOCHS_EDEFAULT;

  /**
   * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected static final String SEED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected String seed = SEED_EDEFAULT;

  /**
   * The default value of the '{@link #getUpdaterType() <em>Updater Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdaterType()
   * @generated
   * @ordered
   */
  protected static final UpdaterType UPDATER_TYPE_EDEFAULT = UpdaterType.SGD;

  /**
   * The cached value of the '{@link #getUpdaterType() <em>Updater Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdaterType()
   * @generated
   * @ordered
   */
  protected UpdaterType updaterType = UPDATER_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLearningRate() <em>Learning Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLearningRate()
   * @generated
   * @ordered
   */
  protected VariableAssignment learningRate;

  /**
   * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayers()
   * @generated
   * @ordered
   */
  protected EList<Layer> layers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetworkImpl()
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
    return MyDslPackage.Literals.NETWORK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETWORK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEpochs()
  {
    return epochs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpochs(String newEpochs)
  {
    String oldEpochs = epochs;
    epochs = newEpochs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETWORK__EPOCHS, oldEpochs, epochs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeed()
  {
    return seed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeed(String newSeed)
  {
    String oldSeed = seed;
    seed = newSeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETWORK__SEED, oldSeed, seed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdaterType getUpdaterType()
  {
    return updaterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdaterType(UpdaterType newUpdaterType)
  {
    UpdaterType oldUpdaterType = updaterType;
    updaterType = newUpdaterType == null ? UPDATER_TYPE_EDEFAULT : newUpdaterType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETWORK__UPDATER_TYPE, oldUpdaterType, updaterType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignment getLearningRate()
  {
    return learningRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLearningRate(VariableAssignment newLearningRate, NotificationChain msgs)
  {
    VariableAssignment oldLearningRate = learningRate;
    learningRate = newLearningRate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NETWORK__LEARNING_RATE, oldLearningRate, newLearningRate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLearningRate(VariableAssignment newLearningRate)
  {
    if (newLearningRate != learningRate)
    {
      NotificationChain msgs = null;
      if (learningRate != null)
        msgs = ((InternalEObject)learningRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NETWORK__LEARNING_RATE, null, msgs);
      if (newLearningRate != null)
        msgs = ((InternalEObject)newLearningRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NETWORK__LEARNING_RATE, null, msgs);
      msgs = basicSetLearningRate(newLearningRate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NETWORK__LEARNING_RATE, newLearningRate, newLearningRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layer> getLayers()
  {
    if (layers == null)
    {
      layers = new EObjectContainmentEList<Layer>(Layer.class, this, MyDslPackage.NETWORK__LAYERS);
    }
    return layers;
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
      case MyDslPackage.NETWORK__LEARNING_RATE:
        return basicSetLearningRate(null, msgs);
      case MyDslPackage.NETWORK__LAYERS:
        return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.NETWORK__NAME:
        return getName();
      case MyDslPackage.NETWORK__EPOCHS:
        return getEpochs();
      case MyDslPackage.NETWORK__SEED:
        return getSeed();
      case MyDslPackage.NETWORK__UPDATER_TYPE:
        return getUpdaterType();
      case MyDslPackage.NETWORK__LEARNING_RATE:
        return getLearningRate();
      case MyDslPackage.NETWORK__LAYERS:
        return getLayers();
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
      case MyDslPackage.NETWORK__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.NETWORK__EPOCHS:
        setEpochs((String)newValue);
        return;
      case MyDslPackage.NETWORK__SEED:
        setSeed((String)newValue);
        return;
      case MyDslPackage.NETWORK__UPDATER_TYPE:
        setUpdaterType((UpdaterType)newValue);
        return;
      case MyDslPackage.NETWORK__LEARNING_RATE:
        setLearningRate((VariableAssignment)newValue);
        return;
      case MyDslPackage.NETWORK__LAYERS:
        getLayers().clear();
        getLayers().addAll((Collection<? extends Layer>)newValue);
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
      case MyDslPackage.NETWORK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.NETWORK__EPOCHS:
        setEpochs(EPOCHS_EDEFAULT);
        return;
      case MyDslPackage.NETWORK__SEED:
        setSeed(SEED_EDEFAULT);
        return;
      case MyDslPackage.NETWORK__UPDATER_TYPE:
        setUpdaterType(UPDATER_TYPE_EDEFAULT);
        return;
      case MyDslPackage.NETWORK__LEARNING_RATE:
        setLearningRate((VariableAssignment)null);
        return;
      case MyDslPackage.NETWORK__LAYERS:
        getLayers().clear();
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
      case MyDslPackage.NETWORK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.NETWORK__EPOCHS:
        return EPOCHS_EDEFAULT == null ? epochs != null : !EPOCHS_EDEFAULT.equals(epochs);
      case MyDslPackage.NETWORK__SEED:
        return SEED_EDEFAULT == null ? seed != null : !SEED_EDEFAULT.equals(seed);
      case MyDslPackage.NETWORK__UPDATER_TYPE:
        return updaterType != UPDATER_TYPE_EDEFAULT;
      case MyDslPackage.NETWORK__LEARNING_RATE:
        return learningRate != null;
      case MyDslPackage.NETWORK__LAYERS:
        return layers != null && !layers.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", epochs: ");
    result.append(epochs);
    result.append(", seed: ");
    result.append(seed);
    result.append(", updaterType: ");
    result.append(updaterType);
    result.append(')');
    return result.toString();
  }

} //NetworkImpl