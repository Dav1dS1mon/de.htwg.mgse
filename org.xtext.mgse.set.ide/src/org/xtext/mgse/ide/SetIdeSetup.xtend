/*
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.mgse.SetRuntimeModule
import org.xtext.mgse.SetStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SetIdeSetup extends SetStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SetRuntimeModule, new SetIdeModule))
	}
	
}
