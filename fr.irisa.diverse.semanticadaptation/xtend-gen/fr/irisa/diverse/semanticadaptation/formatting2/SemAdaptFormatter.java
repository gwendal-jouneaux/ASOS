/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.diverse.semanticadaptation.formatting2;

import com.google.inject.Inject;
import fr.irisa.diverse.adaptivesemantics.formatting2.AdaptSemFormatter;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.semanticadaptation.services.SemAdaptGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import semanticadaptation.Adaptation;
import semanticadaptation.Pointcut;
import semanticadaptation.SemanticAdaptation;
import semanticadaptation.Semantics;

@SuppressWarnings("all")
public class SemAdaptFormatter extends AdaptSemFormatter {
  @Inject
  @Extension
  private SemAdaptGrammarAccess _semAdaptGrammarAccess;
  
  protected void _format(final SemanticAdaptation semanticAdaptation, @Extension final IFormattableDocument document) {
    document.<Model>format(semanticAdaptation.getModel());
    document.<Semantics>format(semanticAdaptation.getSemantics());
    EList<Import> _imports = semanticAdaptation.getImports();
    for (final Import _import : _imports) {
      document.<Import>format(_import);
    }
    EList<semanticadaptation.Module> _modules = semanticAdaptation.getModules();
    for (final semanticadaptation.Module module : _modules) {
      document.<semanticadaptation.Module>format(module);
    }
  }
  
  protected void _format(final semanticadaptation.Module module, @Extension final IFormattableDocument document) {
    EList<Pointcut> _pointcuts = module.getPointcuts();
    for (final Pointcut pointcut : _pointcuts) {
      document.<Pointcut>format(pointcut);
    }
    EList<Adaptation> _adaptations = module.getAdaptations();
    for (final Adaptation adaptation : _adaptations) {
      document.<Adaptation>format(adaptation);
    }
  }
  
  public void format(final Object module, final IFormattableDocument document) {
    if (module instanceof XtextResource) {
      _format((XtextResource)module, document);
      return;
    } else if (module instanceof AdaptiveSemantics) {
      _format((AdaptiveSemantics)module, document);
      return;
    } else if (module instanceof Rule) {
      _format((Rule)module, document);
      return;
    } else if (module instanceof semanticadaptation.Module) {
      _format((semanticadaptation.Module)module, document);
      return;
    } else if (module instanceof SemanticAdaptation) {
      _format((SemanticAdaptation)module, document);
      return;
    } else if (module instanceof EObject) {
      _format((EObject)module, document);
      return;
    } else if (module == null) {
      _format((Void)null, document);
      return;
    } else if (module != null) {
      _format(module, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(module, document).toString());
    }
  }
}
