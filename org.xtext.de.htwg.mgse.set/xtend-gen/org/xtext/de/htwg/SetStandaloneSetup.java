/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg;

import org.xtext.de.htwg.SetStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SetStandaloneSetup extends SetStandaloneSetupGenerated {
  public static void doSetup() {
    new SetStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
