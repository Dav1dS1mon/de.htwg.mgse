/**
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.mgse.set.PACK;
import org.xtext.mgse.set.SetPackage;
import org.xtext.mgse.validation.AbstractSetValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SetValidator extends AbstractSetValidator {
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkGreetingStartsWithCapital(final PACK greeting) {
    boolean _isUpperCase = Character.isUpperCase(greeting.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital", 
        SetPackage.Literals.PACK__NAME, 
        SetValidator.INVALID_NAME);
    }
  }
}
