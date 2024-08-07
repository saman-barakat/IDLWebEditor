/**
 * generated by Xtext 2.30.0
 */
package es.us.isa.idl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
@SuppressWarnings("all")
public class IDLLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public IDLLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
