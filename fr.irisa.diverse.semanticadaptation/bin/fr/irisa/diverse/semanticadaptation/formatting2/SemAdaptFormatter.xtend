/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.diverse.semanticadaptation.formatting2

import com.google.inject.Inject
import fr.irisa.diverse.adaptivesemantics.formatting2.AdaptSemFormatter
import fr.irisa.diverse.semanticadaptation.services.SemAdaptGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument
import semanticadaptation.SemanticAdaptation

class SemAdaptFormatter extends AdaptSemFormatter {
	
	@Inject extension SemAdaptGrammarAccess

	def dispatch void format(SemanticAdaptation semanticAdaptation, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		semanticAdaptation.model.format
		semanticAdaptation.semantics.format
		for (_import : semanticAdaptation.imports) {
			_import.format
		}
		for (module : semanticAdaptation.modules) {
			module.format
		}
	}

	def dispatch void format(semanticadaptation.Module module, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (pointcut : module.pointcuts) {
			pointcut.format
		}
		for (adaptation : module.adaptations) {
			adaptation.format
		}
	}
	
	// TODO: implement for Pointcut, Adaptation
}
