/**
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.mgse.set.SetFactory
 * @model kind="package"
 * @generated
 */
public interface SetPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "set";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/mgse/Set";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "set";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SetPackage eINSTANCE = org.xtext.mgse.set.impl.SetPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.mgse.set.impl.PACKImpl <em>PACK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgse.set.impl.PACKImpl
   * @see org.xtext.mgse.set.impl.SetPackageImpl#getPACK()
   * @generated
   */
  int PACK = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__TYPE = 1;

  /**
   * The number of structural features of the '<em>PACK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgse.set.impl.PACKTYPEImpl <em>PACKTYPE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgse.set.impl.PACKTYPEImpl
   * @see org.xtext.mgse.set.impl.SetPackageImpl#getPACKTYPE()
   * @generated
   */
  int PACKTYPE = 1;

  /**
   * The feature id for the '<em><b>Forms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKTYPE__FORMS = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKTYPE__URL = 1;

  /**
   * The number of structural features of the '<em>PACKTYPE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKTYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgse.set.impl.FORMSImpl <em>FORMS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgse.set.impl.FORMSImpl
   * @see org.xtext.mgse.set.impl.SetPackageImpl#getFORMS()
   * @generated
   */
  int FORMS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMS__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMS__TYPE = 1;

  /**
   * The number of structural features of the '<em>FORMS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgse.set.impl.URLImpl <em>URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgse.set.impl.URLImpl
   * @see org.xtext.mgse.set.impl.SetPackageImpl#getURL()
   * @generated
   */
  int URL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__TYPE = 1;

  /**
   * The number of structural features of the '<em>URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mgse.set.TYPE_FORMS <em>TYPE FORMS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgse.set.TYPE_FORMS
   * @see org.xtext.mgse.set.impl.SetPackageImpl#getTYPE_FORMS()
   * @generated
   */
  int TYPE_FORMS = 4;

  /**
   * The meta object id for the '{@link org.xtext.mgse.set.URL_TYPES <em>URL TYPES</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mgse.set.URL_TYPES
   * @see org.xtext.mgse.set.impl.SetPackageImpl#getURL_TYPES()
   * @generated
   */
  int URL_TYPES = 5;


  /**
   * Returns the meta object for class '{@link org.xtext.mgse.set.PACK <em>PACK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PACK</em>'.
   * @see org.xtext.mgse.set.PACK
   * @generated
   */
  EClass getPACK();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgse.set.PACK#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgse.set.PACK#getName()
   * @see #getPACK()
   * @generated
   */
  EAttribute getPACK_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgse.set.PACK#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.mgse.set.PACK#getType()
   * @see #getPACK()
   * @generated
   */
  EReference getPACK_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.mgse.set.PACKTYPE <em>PACKTYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PACKTYPE</em>'.
   * @see org.xtext.mgse.set.PACKTYPE
   * @generated
   */
  EClass getPACKTYPE();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgse.set.PACKTYPE#getForms <em>Forms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forms</em>'.
   * @see org.xtext.mgse.set.PACKTYPE#getForms()
   * @see #getPACKTYPE()
   * @generated
   */
  EReference getPACKTYPE_Forms();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mgse.set.PACKTYPE#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.xtext.mgse.set.PACKTYPE#getUrl()
   * @see #getPACKTYPE()
   * @generated
   */
  EReference getPACKTYPE_Url();

  /**
   * Returns the meta object for class '{@link org.xtext.mgse.set.FORMS <em>FORMS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FORMS</em>'.
   * @see org.xtext.mgse.set.FORMS
   * @generated
   */
  EClass getFORMS();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgse.set.FORMS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgse.set.FORMS#getName()
   * @see #getFORMS()
   * @generated
   */
  EAttribute getFORMS_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgse.set.FORMS#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.mgse.set.FORMS#getType()
   * @see #getFORMS()
   * @generated
   */
  EAttribute getFORMS_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.mgse.set.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL</em>'.
   * @see org.xtext.mgse.set.URL
   * @generated
   */
  EClass getURL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgse.set.URL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mgse.set.URL#getName()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mgse.set.URL#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.mgse.set.URL#getType()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Type();

  /**
   * Returns the meta object for enum '{@link org.xtext.mgse.set.TYPE_FORMS <em>TYPE FORMS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TYPE FORMS</em>'.
   * @see org.xtext.mgse.set.TYPE_FORMS
   * @generated
   */
  EEnum getTYPE_FORMS();

  /**
   * Returns the meta object for enum '{@link org.xtext.mgse.set.URL_TYPES <em>URL TYPES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>URL TYPES</em>'.
   * @see org.xtext.mgse.set.URL_TYPES
   * @generated
   */
  EEnum getURL_TYPES();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SetFactory getSetFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.mgse.set.impl.PACKImpl <em>PACK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgse.set.impl.PACKImpl
     * @see org.xtext.mgse.set.impl.SetPackageImpl#getPACK()
     * @generated
     */
    EClass PACK = eINSTANCE.getPACK();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__NAME = eINSTANCE.getPACK_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACK__TYPE = eINSTANCE.getPACK_Type();

    /**
     * The meta object literal for the '{@link org.xtext.mgse.set.impl.PACKTYPEImpl <em>PACKTYPE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgse.set.impl.PACKTYPEImpl
     * @see org.xtext.mgse.set.impl.SetPackageImpl#getPACKTYPE()
     * @generated
     */
    EClass PACKTYPE = eINSTANCE.getPACKTYPE();

    /**
     * The meta object literal for the '<em><b>Forms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKTYPE__FORMS = eINSTANCE.getPACKTYPE_Forms();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKTYPE__URL = eINSTANCE.getPACKTYPE_Url();

    /**
     * The meta object literal for the '{@link org.xtext.mgse.set.impl.FORMSImpl <em>FORMS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgse.set.impl.FORMSImpl
     * @see org.xtext.mgse.set.impl.SetPackageImpl#getFORMS()
     * @generated
     */
    EClass FORMS = eINSTANCE.getFORMS();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMS__NAME = eINSTANCE.getFORMS_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMS__TYPE = eINSTANCE.getFORMS_Type();

    /**
     * The meta object literal for the '{@link org.xtext.mgse.set.impl.URLImpl <em>URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgse.set.impl.URLImpl
     * @see org.xtext.mgse.set.impl.SetPackageImpl#getURL()
     * @generated
     */
    EClass URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__NAME = eINSTANCE.getURL_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__TYPE = eINSTANCE.getURL_Type();

    /**
     * The meta object literal for the '{@link org.xtext.mgse.set.TYPE_FORMS <em>TYPE FORMS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgse.set.TYPE_FORMS
     * @see org.xtext.mgse.set.impl.SetPackageImpl#getTYPE_FORMS()
     * @generated
     */
    EEnum TYPE_FORMS = eINSTANCE.getTYPE_FORMS();

    /**
     * The meta object literal for the '{@link org.xtext.mgse.set.URL_TYPES <em>URL TYPES</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mgse.set.URL_TYPES
     * @see org.xtext.mgse.set.impl.SetPackageImpl#getURL_TYPES()
     * @generated
     */
    EEnum URL_TYPES = eINSTANCE.getURL_TYPES();

  }

} //SetPackage
