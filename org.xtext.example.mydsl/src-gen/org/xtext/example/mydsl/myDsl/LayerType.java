/**
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Layer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLayerType()
 * @model
 * @generated
 */
public enum LayerType implements Enumerator
{
  /**
   * The '<em><b>CONVOLUTIONAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONVOLUTIONAL_VALUE
   * @generated
   * @ordered
   */
  CONVOLUTIONAL(0, "CONVOLUTIONAL", "conv"),

  /**
   * The '<em><b>MAXPOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAXPOOL_VALUE
   * @generated
   * @ordered
   */
  MAXPOOL(1, "MAXPOOL", "max-pool"),

  /**
   * The '<em><b>AVGPOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVGPOOL_VALUE
   * @generated
   * @ordered
   */
  AVGPOOL(2, "AVGPOOL", "avg-pool"),

  /**
   * The '<em><b>DENSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DENSE_VALUE
   * @generated
   * @ordered
   */
  DENSE(3, "DENSE", "dense"),

  /**
   * The '<em><b>SOFTMAX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOFTMAX_VALUE
   * @generated
   * @ordered
   */
  SOFTMAX(4, "SOFTMAX", "softmax");

  /**
   * The '<em><b>CONVOLUTIONAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONVOLUTIONAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONVOLUTIONAL
   * @model literal="conv"
   * @generated
   * @ordered
   */
  public static final int CONVOLUTIONAL_VALUE = 0;

  /**
   * The '<em><b>MAXPOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAXPOOL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAXPOOL
   * @model literal="max-pool"
   * @generated
   * @ordered
   */
  public static final int MAXPOOL_VALUE = 1;

  /**
   * The '<em><b>AVGPOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AVGPOOL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVGPOOL
   * @model literal="avg-pool"
   * @generated
   * @ordered
   */
  public static final int AVGPOOL_VALUE = 2;

  /**
   * The '<em><b>DENSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DENSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DENSE
   * @model literal="dense"
   * @generated
   * @ordered
   */
  public static final int DENSE_VALUE = 3;

  /**
   * The '<em><b>SOFTMAX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOFTMAX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOFTMAX
   * @model literal="softmax"
   * @generated
   * @ordered
   */
  public static final int SOFTMAX_VALUE = 4;

  /**
   * An array of all the '<em><b>Layer Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LayerType[] VALUES_ARRAY =
    new LayerType[]
    {
      CONVOLUTIONAL,
      MAXPOOL,
      AVGPOOL,
      DENSE,
      SOFTMAX,
    };

  /**
   * A public read-only list of all the '<em><b>Layer Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LayerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Layer Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LayerType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LayerType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Layer Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LayerType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LayerType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Layer Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LayerType get(int value)
  {
    switch (value)
    {
      case CONVOLUTIONAL_VALUE: return CONVOLUTIONAL;
      case MAXPOOL_VALUE: return MAXPOOL;
      case AVGPOOL_VALUE: return AVGPOOL;
      case DENSE_VALUE: return DENSE;
      case SOFTMAX_VALUE: return SOFTMAX;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private LayerType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LayerType