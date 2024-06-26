/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.diverse.semanticadaptation.parser.antlr;

import com.google.inject.Inject;
import fr.irisa.diverse.semanticadaptation.parser.antlr.internal.InternalSemAdaptParser;
import fr.irisa.diverse.semanticadaptation.services.SemAdaptGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SemAdaptParser extends AbstractAntlrParser {

	@Inject
	private SemAdaptGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSemAdaptParser createParser(XtextTokenStream stream) {
		return new InternalSemAdaptParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SemanticAdaptation";
	}

	public SemAdaptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SemAdaptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
