/**
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.set;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mgse.set.URL#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgse.set.URL#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.mgse.set.SetPackage#getURL()
 * @model
 * @generated
 */
public interface URL extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mgse.set.SetPackage#getURL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mgse.set.URL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.mgse.set.URL_TYPES}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.mgse.set.URL_TYPES
   * @see #setType(URL_TYPES)
   * @see org.xtext.mgse.set.SetPackage#getURL_Type()
   * @model
   * @generated
   */
  URL_TYPES getType();

  /**
   * Sets the value of the '{@link org.xtext.mgse.set.URL#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.mgse.set.URL_TYPES
   * @see #getType()
   * @generated
   */
  void setType(URL_TYPES value);

} // URL