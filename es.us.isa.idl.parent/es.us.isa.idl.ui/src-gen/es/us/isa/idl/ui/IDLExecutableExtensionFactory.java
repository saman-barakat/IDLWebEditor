/*
 * generated by Xtext 2.25.0
 */
package es.us.isa.idl.ui;

import com.google.inject.Injector;
import es.us.isa.idl.ui.internal.IdlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class IDLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(IdlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		IdlActivator activator = IdlActivator.getInstance();
		return activator != null ? activator.getInjector(IdlActivator.ES_US_ISA_IDL_IDL) : null;
	}

}