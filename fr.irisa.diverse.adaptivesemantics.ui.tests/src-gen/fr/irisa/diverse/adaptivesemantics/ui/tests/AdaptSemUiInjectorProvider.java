/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.diverse.adaptivesemantics.ui.tests;

import com.google.inject.Injector;
import fr.irisa.diverse.adaptivesemantics.ui.internal.AdaptivesemanticsActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AdaptSemUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AdaptivesemanticsActivator.getInstance().getInjector("fr.irisa.diverse.adaptivesemantics.AdaptSem");
	}

}
