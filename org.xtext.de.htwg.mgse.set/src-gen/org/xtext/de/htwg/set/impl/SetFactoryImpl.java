/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.set.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.de.htwg.set.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetFactoryImpl extends EFactoryImpl implements SetFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SetFactory init()
  {
    try
    {
      SetFactory theSetFactory = (SetFactory)EPackage.Registry.INSTANCE.getEFactory(SetPackage.eNS_URI);
      if (theSetFactory != null)
      {
        return theSetFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SetFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SetPackage.PACK: return createPACK();
      case SetPackage.PACKTYPE: return createPACKTYPE();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PACK createPACK()
  {
    PACKImpl pack = new PACKImpl();
    return pack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PACKTYPE createPACKTYPE()
  {
    PACKTYPEImpl packtype = new PACKTYPEImpl();
    return packtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetPackage getSetPackage()
  {
    return (SetPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SetPackage getPackage()
  {
    return SetPackage.eINSTANCE;
  }

} //SetFactoryImpl
