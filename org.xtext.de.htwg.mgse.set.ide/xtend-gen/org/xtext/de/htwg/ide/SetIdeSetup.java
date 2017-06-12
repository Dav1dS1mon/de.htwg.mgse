/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.de.htwg.SetRuntimeModule;
import org.xtext.de.htwg.SetStandaloneSetup;
import org.xtext.de.htwg.ide.SetIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SetIdeSetup extends SetStandaloneSetup {
  @Override
  public Injector createInjector() {
    SetRuntimeModule _setRuntimeModule = new SetRuntimeModule();
    SetIdeModule _setIdeModule = new SetIdeModule();
    return Guice.createInjector(Modules2.mixin(_setRuntimeModule, _setIdeModule));
  }
}