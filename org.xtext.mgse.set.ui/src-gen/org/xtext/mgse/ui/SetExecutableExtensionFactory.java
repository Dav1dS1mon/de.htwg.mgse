/*
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.mgse.set.ui.internal.SetActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SetExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SetActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SetActivator.getInstance().getInjector(SetActivator.ORG_XTEXT_MGSE_SET);
	}
	
}
