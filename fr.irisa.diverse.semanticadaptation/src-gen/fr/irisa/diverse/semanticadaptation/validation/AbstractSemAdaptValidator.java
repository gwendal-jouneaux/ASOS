/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.diverse.semanticadaptation.validation;

import fr.irisa.diverse.adaptivesemantics.validation.AdaptSemValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractSemAdaptValidator extends AdaptSemValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.diverse-team.fr/semanticadaptation"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.diverse-team.fr/adaptivesemantics"));
		return result;
	}
}