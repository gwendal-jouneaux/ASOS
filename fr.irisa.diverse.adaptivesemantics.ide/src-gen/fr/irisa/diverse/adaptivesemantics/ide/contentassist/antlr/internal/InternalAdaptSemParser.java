package fr.irisa.diverse.adaptivesemantics.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.irisa.diverse.adaptivesemantics.services.AdaptSemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAdaptSemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'with'", "'import'", "'as'", "'rule'", "','", "'where'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'.'", "'self'", "'->'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'match'", "'+'", "'-'", "'*'", "'/'", "'termination'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAdaptSemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdaptSemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdaptSemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAdaptSem.g"; }


    	private AdaptSemGrammarAccess grammarAccess;

    	public void setGrammarAccess(AdaptSemGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAdaptiveSemantics"
    // InternalAdaptSem.g:54:1: entryRuleAdaptiveSemantics : ruleAdaptiveSemantics EOF ;
    public final void entryRuleAdaptiveSemantics() throws RecognitionException {
        try {
            // InternalAdaptSem.g:55:1: ( ruleAdaptiveSemantics EOF )
            // InternalAdaptSem.g:56:1: ruleAdaptiveSemantics EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdaptiveSemantics();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdaptiveSemantics"


    // $ANTLR start "ruleAdaptiveSemantics"
    // InternalAdaptSem.g:63:1: ruleAdaptiveSemantics : ( ( rule__AdaptiveSemantics__Group__0 ) ) ;
    public final void ruleAdaptiveSemantics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:67:2: ( ( ( rule__AdaptiveSemantics__Group__0 ) ) )
            // InternalAdaptSem.g:68:2: ( ( rule__AdaptiveSemantics__Group__0 ) )
            {
            // InternalAdaptSem.g:68:2: ( ( rule__AdaptiveSemantics__Group__0 ) )
            // InternalAdaptSem.g:69:3: ( rule__AdaptiveSemantics__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getGroup()); 
            }
            // InternalAdaptSem.g:70:3: ( rule__AdaptiveSemantics__Group__0 )
            // InternalAdaptSem.g:70:4: rule__AdaptiveSemantics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdaptiveSemantics__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdaptiveSemantics"


    // $ANTLR start "entryRuleModel"
    // InternalAdaptSem.g:79:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAdaptSem.g:80:1: ( ruleModel EOF )
            // InternalAdaptSem.g:81:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAdaptSem.g:88:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:92:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAdaptSem.g:93:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAdaptSem.g:93:2: ( ( rule__Model__Group__0 ) )
            // InternalAdaptSem.g:94:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalAdaptSem.g:95:3: ( rule__Model__Group__0 )
            // InternalAdaptSem.g:95:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalAdaptSem.g:104:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalAdaptSem.g:105:1: ( ruleImport EOF )
            // InternalAdaptSem.g:106:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAdaptSem.g:113:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:117:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalAdaptSem.g:118:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalAdaptSem.g:118:2: ( ( rule__Import__Group__0 ) )
            // InternalAdaptSem.g:119:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalAdaptSem.g:120:3: ( rule__Import__Group__0 )
            // InternalAdaptSem.g:120:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRule"
    // InternalAdaptSem.g:129:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalAdaptSem.g:130:1: ( ruleRule EOF )
            // InternalAdaptSem.g:131:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalAdaptSem.g:138:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:142:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalAdaptSem.g:143:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalAdaptSem.g:143:2: ( ( rule__Rule__Group__0 ) )
            // InternalAdaptSem.g:144:3: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalAdaptSem.g:145:3: ( rule__Rule__Group__0 )
            // InternalAdaptSem.g:145:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalAdaptSem.g:154:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalAdaptSem.g:155:1: ( ruleCondition EOF )
            // InternalAdaptSem.g:156:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAdaptSem.g:163:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:167:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalAdaptSem.g:168:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalAdaptSem.g:168:2: ( ( rule__Condition__Group__0 ) )
            // InternalAdaptSem.g:169:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalAdaptSem.g:170:3: ( rule__Condition__Group__0 )
            // InternalAdaptSem.g:170:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleInput"
    // InternalAdaptSem.g:179:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalAdaptSem.g:180:1: ( ruleInput EOF )
            // InternalAdaptSem.g:181:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalAdaptSem.g:188:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:192:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalAdaptSem.g:193:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalAdaptSem.g:193:2: ( ( rule__Input__Group__0 ) )
            // InternalAdaptSem.g:194:3: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // InternalAdaptSem.g:195:3: ( rule__Input__Group__0 )
            // InternalAdaptSem.g:195:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalAdaptSem.g:204:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalAdaptSem.g:205:1: ( ruleOutput EOF )
            // InternalAdaptSem.g:206:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalAdaptSem.g:213:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:217:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalAdaptSem.g:218:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalAdaptSem.g:218:2: ( ( rule__Output__Group__0 ) )
            // InternalAdaptSem.g:219:3: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // InternalAdaptSem.g:220:3: ( rule__Output__Group__0 )
            // InternalAdaptSem.g:220:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleBinding"
    // InternalAdaptSem.g:229:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalAdaptSem.g:230:1: ( ruleBinding EOF )
            // InternalAdaptSem.g:231:1: ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalAdaptSem.g:238:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:242:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalAdaptSem.g:243:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalAdaptSem.g:243:2: ( ( rule__Binding__Group__0 ) )
            // InternalAdaptSem.g:244:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalAdaptSem.g:245:3: ( rule__Binding__Group__0 )
            // InternalAdaptSem.g:245:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleAssignable"
    // InternalAdaptSem.g:254:1: entryRuleAssignable : ruleAssignable EOF ;
    public final void entryRuleAssignable() throws RecognitionException {
        try {
            // InternalAdaptSem.g:255:1: ( ruleAssignable EOF )
            // InternalAdaptSem.g:256:1: ruleAssignable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignable"


    // $ANTLR start "ruleAssignable"
    // InternalAdaptSem.g:263:1: ruleAssignable : ( ( rule__Assignable__Alternatives ) ) ;
    public final void ruleAssignable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:267:2: ( ( ( rule__Assignable__Alternatives ) ) )
            // InternalAdaptSem.g:268:2: ( ( rule__Assignable__Alternatives ) )
            {
            // InternalAdaptSem.g:268:2: ( ( rule__Assignable__Alternatives ) )
            // InternalAdaptSem.g:269:3: ( rule__Assignable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignableAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:270:3: ( rule__Assignable__Alternatives )
            // InternalAdaptSem.g:270:4: rule__Assignable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assignable__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignableAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignable"


    // $ANTLR start "entryRuleAssignee"
    // InternalAdaptSem.g:279:1: entryRuleAssignee : ruleAssignee EOF ;
    public final void entryRuleAssignee() throws RecognitionException {
        try {
            // InternalAdaptSem.g:280:1: ( ruleAssignee EOF )
            // InternalAdaptSem.g:281:1: ruleAssignee EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssigneeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignee"


    // $ANTLR start "ruleAssignee"
    // InternalAdaptSem.g:288:1: ruleAssignee : ( ( rule__Assignee__Alternatives ) ) ;
    public final void ruleAssignee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:292:2: ( ( ( rule__Assignee__Alternatives ) ) )
            // InternalAdaptSem.g:293:2: ( ( rule__Assignee__Alternatives ) )
            {
            // InternalAdaptSem.g:293:2: ( ( rule__Assignee__Alternatives ) )
            // InternalAdaptSem.g:294:3: ( rule__Assignee__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:295:3: ( rule__Assignee__Alternatives )
            // InternalAdaptSem.g:295:4: rule__Assignee__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assignee__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssigneeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignee"


    // $ANTLR start "entryRuleSemanticDomainAccess"
    // InternalAdaptSem.g:304:1: entryRuleSemanticDomainAccess : ruleSemanticDomainAccess EOF ;
    public final void entryRuleSemanticDomainAccess() throws RecognitionException {
        try {
            // InternalAdaptSem.g:305:1: ( ruleSemanticDomainAccess EOF )
            // InternalAdaptSem.g:306:1: ruleSemanticDomainAccess EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSemanticDomainAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSemanticDomainAccess"


    // $ANTLR start "ruleSemanticDomainAccess"
    // InternalAdaptSem.g:313:1: ruleSemanticDomainAccess : ( ( rule__SemanticDomainAccess__Group__0 ) ) ;
    public final void ruleSemanticDomainAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:317:2: ( ( ( rule__SemanticDomainAccess__Group__0 ) ) )
            // InternalAdaptSem.g:318:2: ( ( rule__SemanticDomainAccess__Group__0 ) )
            {
            // InternalAdaptSem.g:318:2: ( ( rule__SemanticDomainAccess__Group__0 ) )
            // InternalAdaptSem.g:319:3: ( rule__SemanticDomainAccess__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup()); 
            }
            // InternalAdaptSem.g:320:3: ( rule__SemanticDomainAccess__Group__0 )
            // InternalAdaptSem.g:320:4: rule__SemanticDomainAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemanticDomainAccess"


    // $ANTLR start "entryRuleTerminalAccessExpression"
    // InternalAdaptSem.g:329:1: entryRuleTerminalAccessExpression : ruleTerminalAccessExpression EOF ;
    public final void entryRuleTerminalAccessExpression() throws RecognitionException {
        try {
            // InternalAdaptSem.g:330:1: ( ruleTerminalAccessExpression EOF )
            // InternalAdaptSem.g:331:1: ruleTerminalAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalAccessExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccessExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalAccessExpression"


    // $ANTLR start "ruleTerminalAccessExpression"
    // InternalAdaptSem.g:338:1: ruleTerminalAccessExpression : ( ( rule__TerminalAccessExpression__Alternatives ) ) ;
    public final void ruleTerminalAccessExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:342:2: ( ( ( rule__TerminalAccessExpression__Alternatives ) ) )
            // InternalAdaptSem.g:343:2: ( ( rule__TerminalAccessExpression__Alternatives ) )
            {
            // InternalAdaptSem.g:343:2: ( ( rule__TerminalAccessExpression__Alternatives ) )
            // InternalAdaptSem.g:344:3: ( rule__TerminalAccessExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccessExpressionAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:345:3: ( rule__TerminalAccessExpression__Alternatives )
            // InternalAdaptSem.g:345:4: rule__TerminalAccessExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalAccessExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccessExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalAccessExpression"


    // $ANTLR start "entryRuleSelf"
    // InternalAdaptSem.g:354:1: entryRuleSelf : ruleSelf EOF ;
    public final void entryRuleSelf() throws RecognitionException {
        try {
            // InternalAdaptSem.g:355:1: ( ruleSelf EOF )
            // InternalAdaptSem.g:356:1: ruleSelf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelf"


    // $ANTLR start "ruleSelf"
    // InternalAdaptSem.g:363:1: ruleSelf : ( ( rule__Self__Group__0 ) ) ;
    public final void ruleSelf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:367:2: ( ( ( rule__Self__Group__0 ) ) )
            // InternalAdaptSem.g:368:2: ( ( rule__Self__Group__0 ) )
            {
            // InternalAdaptSem.g:368:2: ( ( rule__Self__Group__0 ) )
            // InternalAdaptSem.g:369:3: ( rule__Self__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getGroup()); 
            }
            // InternalAdaptSem.g:370:3: ( rule__Self__Group__0 )
            // InternalAdaptSem.g:370:4: rule__Self__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Self__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelf"


    // $ANTLR start "entryRuleConclusion"
    // InternalAdaptSem.g:379:1: entryRuleConclusion : ruleConclusion EOF ;
    public final void entryRuleConclusion() throws RecognitionException {
        try {
            // InternalAdaptSem.g:380:1: ( ruleConclusion EOF )
            // InternalAdaptSem.g:381:1: ruleConclusion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConclusion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConclusion"


    // $ANTLR start "ruleConclusion"
    // InternalAdaptSem.g:388:1: ruleConclusion : ( ( rule__Conclusion__Group__0 ) ) ;
    public final void ruleConclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:392:2: ( ( ( rule__Conclusion__Group__0 ) ) )
            // InternalAdaptSem.g:393:2: ( ( rule__Conclusion__Group__0 ) )
            {
            // InternalAdaptSem.g:393:2: ( ( rule__Conclusion__Group__0 ) )
            // InternalAdaptSem.g:394:3: ( rule__Conclusion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getGroup()); 
            }
            // InternalAdaptSem.g:395:3: ( rule__Conclusion__Group__0 )
            // InternalAdaptSem.g:395:4: rule__Conclusion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConclusion"


    // $ANTLR start "entryRulePremise"
    // InternalAdaptSem.g:404:1: entryRulePremise : rulePremise EOF ;
    public final void entryRulePremise() throws RecognitionException {
        try {
            // InternalAdaptSem.g:405:1: ( rulePremise EOF )
            // InternalAdaptSem.g:406:1: rulePremise EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePremise();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePremise"


    // $ANTLR start "rulePremise"
    // InternalAdaptSem.g:413:1: rulePremise : ( ( rule__Premise__Group__0 ) ) ;
    public final void rulePremise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:417:2: ( ( ( rule__Premise__Group__0 ) ) )
            // InternalAdaptSem.g:418:2: ( ( rule__Premise__Group__0 ) )
            {
            // InternalAdaptSem.g:418:2: ( ( rule__Premise__Group__0 ) )
            // InternalAdaptSem.g:419:3: ( rule__Premise__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getGroup()); 
            }
            // InternalAdaptSem.g:420:3: ( rule__Premise__Group__0 )
            // InternalAdaptSem.g:420:4: rule__Premise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Premise__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePremise"


    // $ANTLR start "entryRuleTermDef"
    // InternalAdaptSem.g:429:1: entryRuleTermDef : ruleTermDef EOF ;
    public final void entryRuleTermDef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:430:1: ( ruleTermDef EOF )
            // InternalAdaptSem.g:431:1: ruleTermDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTermDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermDef"


    // $ANTLR start "ruleTermDef"
    // InternalAdaptSem.g:438:1: ruleTermDef : ( ( rule__TermDef__Alternatives ) ) ;
    public final void ruleTermDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:442:2: ( ( ( rule__TermDef__Alternatives ) ) )
            // InternalAdaptSem.g:443:2: ( ( rule__TermDef__Alternatives ) )
            {
            // InternalAdaptSem.g:443:2: ( ( rule__TermDef__Alternatives ) )
            // InternalAdaptSem.g:444:3: ( rule__TermDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermDefAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:445:3: ( rule__TermDef__Alternatives )
            // InternalAdaptSem.g:445:4: rule__TermDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TermDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermDef"


    // $ANTLR start "entryRuleTermRef"
    // InternalAdaptSem.g:454:1: entryRuleTermRef : ruleTermRef EOF ;
    public final void entryRuleTermRef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:455:1: ( ruleTermRef EOF )
            // InternalAdaptSem.g:456:1: ruleTermRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermRef"


    // $ANTLR start "ruleTermRef"
    // InternalAdaptSem.g:463:1: ruleTermRef : ( ( rule__TermRef__Alternatives ) ) ;
    public final void ruleTermRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:467:2: ( ( ( rule__TermRef__Alternatives ) ) )
            // InternalAdaptSem.g:468:2: ( ( rule__TermRef__Alternatives ) )
            {
            // InternalAdaptSem.g:468:2: ( ( rule__TermRef__Alternatives ) )
            // InternalAdaptSem.g:469:3: ( rule__TermRef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRefAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:470:3: ( rule__TermRef__Alternatives )
            // InternalAdaptSem.g:470:4: rule__TermRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TermRef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermRef"


    // $ANTLR start "entryRuleSingleTermDef"
    // InternalAdaptSem.g:479:1: entryRuleSingleTermDef : ruleSingleTermDef EOF ;
    public final void entryRuleSingleTermDef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:480:1: ( ruleSingleTermDef EOF )
            // InternalAdaptSem.g:481:1: ruleSingleTermDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTermDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleTermDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTermDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleTermDef"


    // $ANTLR start "ruleSingleTermDef"
    // InternalAdaptSem.g:488:1: ruleSingleTermDef : ( ( rule__SingleTermDef__Alternatives ) ) ;
    public final void ruleSingleTermDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:492:2: ( ( ( rule__SingleTermDef__Alternatives ) ) )
            // InternalAdaptSem.g:493:2: ( ( rule__SingleTermDef__Alternatives ) )
            {
            // InternalAdaptSem.g:493:2: ( ( rule__SingleTermDef__Alternatives ) )
            // InternalAdaptSem.g:494:3: ( rule__SingleTermDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTermDefAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:495:3: ( rule__SingleTermDef__Alternatives )
            // InternalAdaptSem.g:495:4: rule__SingleTermDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleTermDef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTermDefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleTermDef"


    // $ANTLR start "entryRuleSingleTermRef"
    // InternalAdaptSem.g:504:1: entryRuleSingleTermRef : ruleSingleTermRef EOF ;
    public final void entryRuleSingleTermRef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:505:1: ( ruleSingleTermRef EOF )
            // InternalAdaptSem.g:506:1: ruleSingleTermRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTermRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTermRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleTermRef"


    // $ANTLR start "ruleSingleTermRef"
    // InternalAdaptSem.g:513:1: ruleSingleTermRef : ( ( rule__SingleTermRef__Alternatives ) ) ;
    public final void ruleSingleTermRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:517:2: ( ( ( rule__SingleTermRef__Alternatives ) ) )
            // InternalAdaptSem.g:518:2: ( ( rule__SingleTermRef__Alternatives ) )
            {
            // InternalAdaptSem.g:518:2: ( ( rule__SingleTermRef__Alternatives ) )
            // InternalAdaptSem.g:519:3: ( rule__SingleTermRef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTermRefAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:520:3: ( rule__SingleTermRef__Alternatives )
            // InternalAdaptSem.g:520:4: rule__SingleTermRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleTermRef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTermRefAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleTermRef"


    // $ANTLR start "entryRuleDefConfiguration"
    // InternalAdaptSem.g:529:1: entryRuleDefConfiguration : ruleDefConfiguration EOF ;
    public final void entryRuleDefConfiguration() throws RecognitionException {
        try {
            // InternalAdaptSem.g:530:1: ( ruleDefConfiguration EOF )
            // InternalAdaptSem.g:531:1: ruleDefConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefConfiguration"


    // $ANTLR start "ruleDefConfiguration"
    // InternalAdaptSem.g:538:1: ruleDefConfiguration : ( ( rule__DefConfiguration__Group__0 ) ) ;
    public final void ruleDefConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:542:2: ( ( ( rule__DefConfiguration__Group__0 ) ) )
            // InternalAdaptSem.g:543:2: ( ( rule__DefConfiguration__Group__0 ) )
            {
            // InternalAdaptSem.g:543:2: ( ( rule__DefConfiguration__Group__0 ) )
            // InternalAdaptSem.g:544:3: ( rule__DefConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup()); 
            }
            // InternalAdaptSem.g:545:3: ( rule__DefConfiguration__Group__0 )
            // InternalAdaptSem.g:545:4: rule__DefConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefConfiguration"


    // $ANTLR start "entryRuleRefConfiguration"
    // InternalAdaptSem.g:554:1: entryRuleRefConfiguration : ruleRefConfiguration EOF ;
    public final void entryRuleRefConfiguration() throws RecognitionException {
        try {
            // InternalAdaptSem.g:555:1: ( ruleRefConfiguration EOF )
            // InternalAdaptSem.g:556:1: ruleRefConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRefConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefConfiguration"


    // $ANTLR start "ruleRefConfiguration"
    // InternalAdaptSem.g:563:1: ruleRefConfiguration : ( ( rule__RefConfiguration__Group__0 ) ) ;
    public final void ruleRefConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:567:2: ( ( ( rule__RefConfiguration__Group__0 ) ) )
            // InternalAdaptSem.g:568:2: ( ( rule__RefConfiguration__Group__0 ) )
            {
            // InternalAdaptSem.g:568:2: ( ( rule__RefConfiguration__Group__0 ) )
            // InternalAdaptSem.g:569:3: ( rule__RefConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup()); 
            }
            // InternalAdaptSem.g:570:3: ( rule__RefConfiguration__Group__0 )
            // InternalAdaptSem.g:570:4: rule__RefConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefConfiguration"


    // $ANTLR start "entryRuleSymbolDef"
    // InternalAdaptSem.g:579:1: entryRuleSymbolDef : ruleSymbolDef EOF ;
    public final void entryRuleSymbolDef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:580:1: ( ruleSymbolDef EOF )
            // InternalAdaptSem.g:581:1: ruleSymbolDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbolDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbolDef"


    // $ANTLR start "ruleSymbolDef"
    // InternalAdaptSem.g:588:1: ruleSymbolDef : ( ( rule__SymbolDef__Group__0 ) ) ;
    public final void ruleSymbolDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:592:2: ( ( ( rule__SymbolDef__Group__0 ) ) )
            // InternalAdaptSem.g:593:2: ( ( rule__SymbolDef__Group__0 ) )
            {
            // InternalAdaptSem.g:593:2: ( ( rule__SymbolDef__Group__0 ) )
            // InternalAdaptSem.g:594:3: ( rule__SymbolDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getGroup()); 
            }
            // InternalAdaptSem.g:595:3: ( rule__SymbolDef__Group__0 )
            // InternalAdaptSem.g:595:4: rule__SymbolDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SymbolDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolDef"


    // $ANTLR start "entryRuleSymbolRef"
    // InternalAdaptSem.g:604:1: entryRuleSymbolRef : ruleSymbolRef EOF ;
    public final void entryRuleSymbolRef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:605:1: ( ruleSymbolRef EOF )
            // InternalAdaptSem.g:606:1: ruleSymbolRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbolRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbolRef"


    // $ANTLR start "ruleSymbolRef"
    // InternalAdaptSem.g:613:1: ruleSymbolRef : ( ( rule__SymbolRef__Group__0 ) ) ;
    public final void ruleSymbolRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:617:2: ( ( ( rule__SymbolRef__Group__0 ) ) )
            // InternalAdaptSem.g:618:2: ( ( rule__SymbolRef__Group__0 ) )
            {
            // InternalAdaptSem.g:618:2: ( ( rule__SymbolRef__Group__0 ) )
            // InternalAdaptSem.g:619:3: ( rule__SymbolRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getGroup()); 
            }
            // InternalAdaptSem.g:620:3: ( rule__SymbolRef__Group__0 )
            // InternalAdaptSem.g:620:4: rule__SymbolRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SymbolRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolRef"


    // $ANTLR start "entryRuleListDef"
    // InternalAdaptSem.g:629:1: entryRuleListDef : ruleListDef EOF ;
    public final void entryRuleListDef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:630:1: ( ruleListDef EOF )
            // InternalAdaptSem.g:631:1: ruleListDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListDef"


    // $ANTLR start "ruleListDef"
    // InternalAdaptSem.g:638:1: ruleListDef : ( ( rule__ListDef__Group__0 ) ) ;
    public final void ruleListDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:642:2: ( ( ( rule__ListDef__Group__0 ) ) )
            // InternalAdaptSem.g:643:2: ( ( rule__ListDef__Group__0 ) )
            {
            // InternalAdaptSem.g:643:2: ( ( rule__ListDef__Group__0 ) )
            // InternalAdaptSem.g:644:3: ( rule__ListDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getGroup()); 
            }
            // InternalAdaptSem.g:645:3: ( rule__ListDef__Group__0 )
            // InternalAdaptSem.g:645:4: rule__ListDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListDef"


    // $ANTLR start "entryRuleListRef"
    // InternalAdaptSem.g:654:1: entryRuleListRef : ruleListRef EOF ;
    public final void entryRuleListRef() throws RecognitionException {
        try {
            // InternalAdaptSem.g:655:1: ( ruleListRef EOF )
            // InternalAdaptSem.g:656:1: ruleListRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListRef"


    // $ANTLR start "ruleListRef"
    // InternalAdaptSem.g:663:1: ruleListRef : ( ( rule__ListRef__Group__0 ) ) ;
    public final void ruleListRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:667:2: ( ( ( rule__ListRef__Group__0 ) ) )
            // InternalAdaptSem.g:668:2: ( ( rule__ListRef__Group__0 ) )
            {
            // InternalAdaptSem.g:668:2: ( ( rule__ListRef__Group__0 ) )
            // InternalAdaptSem.g:669:3: ( rule__ListRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getGroup()); 
            }
            // InternalAdaptSem.g:670:3: ( rule__ListRef__Group__0 )
            // InternalAdaptSem.g:670:4: rule__ListRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListRef"


    // $ANTLR start "entryRuleVoidList"
    // InternalAdaptSem.g:679:1: entryRuleVoidList : ruleVoidList EOF ;
    public final void entryRuleVoidList() throws RecognitionException {
        try {
            // InternalAdaptSem.g:680:1: ( ruleVoidList EOF )
            // InternalAdaptSem.g:681:1: ruleVoidList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVoidList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoidList"


    // $ANTLR start "ruleVoidList"
    // InternalAdaptSem.g:688:1: ruleVoidList : ( ( rule__VoidList__Group__0 ) ) ;
    public final void ruleVoidList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:692:2: ( ( ( rule__VoidList__Group__0 ) ) )
            // InternalAdaptSem.g:693:2: ( ( rule__VoidList__Group__0 ) )
            {
            // InternalAdaptSem.g:693:2: ( ( rule__VoidList__Group__0 ) )
            // InternalAdaptSem.g:694:3: ( rule__VoidList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getGroup()); 
            }
            // InternalAdaptSem.g:695:3: ( rule__VoidList__Group__0 )
            // InternalAdaptSem.g:695:4: rule__VoidList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoidList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoidList"


    // $ANTLR start "entryRuleCondExpr"
    // InternalAdaptSem.g:704:1: entryRuleCondExpr : ruleCondExpr EOF ;
    public final void entryRuleCondExpr() throws RecognitionException {
        try {
            // InternalAdaptSem.g:705:1: ( ruleCondExpr EOF )
            // InternalAdaptSem.g:706:1: ruleCondExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondExpr"


    // $ANTLR start "ruleCondExpr"
    // InternalAdaptSem.g:713:1: ruleCondExpr : ( ( rule__CondExpr__Alternatives ) ) ;
    public final void ruleCondExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:717:2: ( ( ( rule__CondExpr__Alternatives ) ) )
            // InternalAdaptSem.g:718:2: ( ( rule__CondExpr__Alternatives ) )
            {
            // InternalAdaptSem.g:718:2: ( ( rule__CondExpr__Alternatives ) )
            // InternalAdaptSem.g:719:3: ( rule__CondExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondExprAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:720:3: ( rule__CondExpr__Alternatives )
            // InternalAdaptSem.g:720:4: rule__CondExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CondExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondExpr"


    // $ANTLR start "entryRuleCondNot"
    // InternalAdaptSem.g:729:1: entryRuleCondNot : ruleCondNot EOF ;
    public final void entryRuleCondNot() throws RecognitionException {
        try {
            // InternalAdaptSem.g:730:1: ( ruleCondNot EOF )
            // InternalAdaptSem.g:731:1: ruleCondNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondNotRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondNot"


    // $ANTLR start "ruleCondNot"
    // InternalAdaptSem.g:738:1: ruleCondNot : ( ( rule__CondNot__Group__0 ) ) ;
    public final void ruleCondNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:742:2: ( ( ( rule__CondNot__Group__0 ) ) )
            // InternalAdaptSem.g:743:2: ( ( rule__CondNot__Group__0 ) )
            {
            // InternalAdaptSem.g:743:2: ( ( rule__CondNot__Group__0 ) )
            // InternalAdaptSem.g:744:3: ( rule__CondNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getGroup()); 
            }
            // InternalAdaptSem.g:745:3: ( rule__CondNot__Group__0 )
            // InternalAdaptSem.g:745:4: rule__CondNot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CondNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondNot"


    // $ANTLR start "entryRuleCondOr"
    // InternalAdaptSem.g:754:1: entryRuleCondOr : ruleCondOr EOF ;
    public final void entryRuleCondOr() throws RecognitionException {
        try {
            // InternalAdaptSem.g:755:1: ( ruleCondOr EOF )
            // InternalAdaptSem.g:756:1: ruleCondOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondOr"


    // $ANTLR start "ruleCondOr"
    // InternalAdaptSem.g:763:1: ruleCondOr : ( ( rule__CondOr__Group__0 ) ) ;
    public final void ruleCondOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:767:2: ( ( ( rule__CondOr__Group__0 ) ) )
            // InternalAdaptSem.g:768:2: ( ( rule__CondOr__Group__0 ) )
            {
            // InternalAdaptSem.g:768:2: ( ( rule__CondOr__Group__0 ) )
            // InternalAdaptSem.g:769:3: ( rule__CondOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getGroup()); 
            }
            // InternalAdaptSem.g:770:3: ( rule__CondOr__Group__0 )
            // InternalAdaptSem.g:770:4: rule__CondOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CondOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondOr"


    // $ANTLR start "entryRuleCondAnd"
    // InternalAdaptSem.g:779:1: entryRuleCondAnd : ruleCondAnd EOF ;
    public final void entryRuleCondAnd() throws RecognitionException {
        try {
            // InternalAdaptSem.g:780:1: ( ruleCondAnd EOF )
            // InternalAdaptSem.g:781:1: ruleCondAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondAnd"


    // $ANTLR start "ruleCondAnd"
    // InternalAdaptSem.g:788:1: ruleCondAnd : ( ( rule__CondAnd__Group__0 ) ) ;
    public final void ruleCondAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:792:2: ( ( ( rule__CondAnd__Group__0 ) ) )
            // InternalAdaptSem.g:793:2: ( ( rule__CondAnd__Group__0 ) )
            {
            // InternalAdaptSem.g:793:2: ( ( rule__CondAnd__Group__0 ) )
            // InternalAdaptSem.g:794:3: ( rule__CondAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getGroup()); 
            }
            // InternalAdaptSem.g:795:3: ( rule__CondAnd__Group__0 )
            // InternalAdaptSem.g:795:4: rule__CondAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CondAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondAnd"


    // $ANTLR start "entryRuleCondEquality"
    // InternalAdaptSem.g:804:1: entryRuleCondEquality : ruleCondEquality EOF ;
    public final void entryRuleCondEquality() throws RecognitionException {
        try {
            // InternalAdaptSem.g:805:1: ( ruleCondEquality EOF )
            // InternalAdaptSem.g:806:1: ruleCondEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondEquality"


    // $ANTLR start "ruleCondEquality"
    // InternalAdaptSem.g:813:1: ruleCondEquality : ( ( rule__CondEquality__Alternatives ) ) ;
    public final void ruleCondEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:817:2: ( ( ( rule__CondEquality__Alternatives ) ) )
            // InternalAdaptSem.g:818:2: ( ( rule__CondEquality__Alternatives ) )
            {
            // InternalAdaptSem.g:818:2: ( ( rule__CondEquality__Alternatives ) )
            // InternalAdaptSem.g:819:3: ( rule__CondEquality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:820:3: ( rule__CondEquality__Alternatives )
            // InternalAdaptSem.g:820:4: rule__CondEquality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondEquality"


    // $ANTLR start "entryRuleCondComparison"
    // InternalAdaptSem.g:829:1: entryRuleCondComparison : ruleCondComparison EOF ;
    public final void entryRuleCondComparison() throws RecognitionException {
        try {
            // InternalAdaptSem.g:830:1: ( ruleCondComparison EOF )
            // InternalAdaptSem.g:831:1: ruleCondComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondComparison"


    // $ANTLR start "ruleCondComparison"
    // InternalAdaptSem.g:838:1: ruleCondComparison : ( ( rule__CondComparison__Alternatives ) ) ;
    public final void ruleCondComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:842:2: ( ( ( rule__CondComparison__Alternatives ) ) )
            // InternalAdaptSem.g:843:2: ( ( rule__CondComparison__Alternatives ) )
            {
            // InternalAdaptSem.g:843:2: ( ( rule__CondComparison__Alternatives ) )
            // InternalAdaptSem.g:844:3: ( rule__CondComparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:845:3: ( rule__CondComparison__Alternatives )
            // InternalAdaptSem.g:845:4: rule__CondComparison__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondComparison"


    // $ANTLR start "entryRuleCondIs"
    // InternalAdaptSem.g:854:1: entryRuleCondIs : ruleCondIs EOF ;
    public final void entryRuleCondIs() throws RecognitionException {
        try {
            // InternalAdaptSem.g:855:1: ( ruleCondIs EOF )
            // InternalAdaptSem.g:856:1: ruleCondIs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondIs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondIs"


    // $ANTLR start "ruleCondIs"
    // InternalAdaptSem.g:863:1: ruleCondIs : ( ( rule__CondIs__Group__0 ) ) ;
    public final void ruleCondIs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:867:2: ( ( ( rule__CondIs__Group__0 ) ) )
            // InternalAdaptSem.g:868:2: ( ( rule__CondIs__Group__0 ) )
            {
            // InternalAdaptSem.g:868:2: ( ( rule__CondIs__Group__0 ) )
            // InternalAdaptSem.g:869:3: ( rule__CondIs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getGroup()); 
            }
            // InternalAdaptSem.g:870:3: ( rule__CondIs__Group__0 )
            // InternalAdaptSem.g:870:4: rule__CondIs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CondIs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondIs"


    // $ANTLR start "entryRuleExpr"
    // InternalAdaptSem.g:879:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalAdaptSem.g:880:1: ( ruleExpr EOF )
            // InternalAdaptSem.g:881:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalAdaptSem.g:888:1: ruleExpr : ( ruleOr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:892:2: ( ( ruleOr ) )
            // InternalAdaptSem.g:893:2: ( ruleOr )
            {
            // InternalAdaptSem.g:893:2: ( ruleOr )
            // InternalAdaptSem.g:894:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getOrParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOr"
    // InternalAdaptSem.g:904:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalAdaptSem.g:905:1: ( ruleOr EOF )
            // InternalAdaptSem.g:906:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalAdaptSem.g:913:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:917:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalAdaptSem.g:918:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalAdaptSem.g:918:2: ( ( rule__Or__Group__0 ) )
            // InternalAdaptSem.g:919:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalAdaptSem.g:920:3: ( rule__Or__Group__0 )
            // InternalAdaptSem.g:920:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalAdaptSem.g:929:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalAdaptSem.g:930:1: ( ruleAnd EOF )
            // InternalAdaptSem.g:931:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalAdaptSem.g:938:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:942:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalAdaptSem.g:943:2: ( ( rule__And__Group__0 ) )
            {
            // InternalAdaptSem.g:943:2: ( ( rule__And__Group__0 ) )
            // InternalAdaptSem.g:944:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalAdaptSem.g:945:3: ( rule__And__Group__0 )
            // InternalAdaptSem.g:945:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalAdaptSem.g:954:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalAdaptSem.g:955:1: ( ruleEquality EOF )
            // InternalAdaptSem.g:956:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalAdaptSem.g:963:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:967:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalAdaptSem.g:968:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalAdaptSem.g:968:2: ( ( rule__Equality__Group__0 ) )
            // InternalAdaptSem.g:969:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalAdaptSem.g:970:3: ( rule__Equality__Group__0 )
            // InternalAdaptSem.g:970:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalAdaptSem.g:979:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalAdaptSem.g:980:1: ( ruleComparison EOF )
            // InternalAdaptSem.g:981:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalAdaptSem.g:988:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:992:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalAdaptSem.g:993:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalAdaptSem.g:993:2: ( ( rule__Comparison__Group__0 ) )
            // InternalAdaptSem.g:994:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalAdaptSem.g:995:3: ( rule__Comparison__Group__0 )
            // InternalAdaptSem.g:995:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalAdaptSem.g:1004:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1005:1: ( rulePlusOrMinus EOF )
            // InternalAdaptSem.g:1006:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalAdaptSem.g:1013:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1017:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalAdaptSem.g:1018:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalAdaptSem.g:1018:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalAdaptSem.g:1019:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1020:3: ( rule__PlusOrMinus__Group__0 )
            // InternalAdaptSem.g:1020:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalAdaptSem.g:1029:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1030:1: ( ruleMulOrDiv EOF )
            // InternalAdaptSem.g:1031:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalAdaptSem.g:1038:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1042:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalAdaptSem.g:1043:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalAdaptSem.g:1043:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalAdaptSem.g:1044:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1045:3: ( rule__MulOrDiv__Group__0 )
            // InternalAdaptSem.g:1045:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalAdaptSem.g:1054:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1055:1: ( rulePrimary EOF )
            // InternalAdaptSem.g:1056:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAdaptSem.g:1063:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1067:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAdaptSem.g:1068:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAdaptSem.g:1068:2: ( ( rule__Primary__Alternatives ) )
            // InternalAdaptSem.g:1069:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:1070:3: ( rule__Primary__Alternatives )
            // InternalAdaptSem.g:1070:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalAdaptSem.g:1079:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1080:1: ( ruleAtomic EOF )
            // InternalAdaptSem.g:1081:1: ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalAdaptSem.g:1088:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1092:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalAdaptSem.g:1093:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalAdaptSem.g:1093:2: ( ( rule__Atomic__Alternatives ) )
            // InternalAdaptSem.g:1094:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:1095:3: ( rule__Atomic__Alternatives )
            // InternalAdaptSem.g:1095:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleEString"
    // InternalAdaptSem.g:1104:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1105:1: ( ruleEString EOF )
            // InternalAdaptSem.g:1106:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAdaptSem.g:1113:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1117:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAdaptSem.g:1118:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAdaptSem.g:1118:2: ( ( rule__EString__Alternatives ) )
            // InternalAdaptSem.g:1119:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:1120:3: ( rule__EString__Alternatives )
            // InternalAdaptSem.g:1120:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFQN"
    // InternalAdaptSem.g:1129:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1130:1: ( ruleFQN EOF )
            // InternalAdaptSem.g:1131:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalAdaptSem.g:1138:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1142:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalAdaptSem.g:1143:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalAdaptSem.g:1143:2: ( ( rule__FQN__Group__0 ) )
            // InternalAdaptSem.g:1144:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1145:3: ( rule__FQN__Group__0 )
            // InternalAdaptSem.g:1145:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleOperationFQN"
    // InternalAdaptSem.g:1154:1: entryRuleOperationFQN : ruleOperationFQN EOF ;
    public final void entryRuleOperationFQN() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1155:1: ( ruleOperationFQN EOF )
            // InternalAdaptSem.g:1156:1: ruleOperationFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationFQN"


    // $ANTLR start "ruleOperationFQN"
    // InternalAdaptSem.g:1163:1: ruleOperationFQN : ( ( rule__OperationFQN__Group__0 ) ) ;
    public final void ruleOperationFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1167:2: ( ( ( rule__OperationFQN__Group__0 ) ) )
            // InternalAdaptSem.g:1168:2: ( ( rule__OperationFQN__Group__0 ) )
            {
            // InternalAdaptSem.g:1168:2: ( ( rule__OperationFQN__Group__0 ) )
            // InternalAdaptSem.g:1169:3: ( rule__OperationFQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1170:3: ( rule__OperationFQN__Group__0 )
            // InternalAdaptSem.g:1170:4: rule__OperationFQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationFQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationFQN"


    // $ANTLR start "rule__Rule__Alternatives_7_1"
    // InternalAdaptSem.g:1178:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1182:1: ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptSem.g:1183:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    {
                    // InternalAdaptSem.g:1183:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    // InternalAdaptSem.g:1184:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_1_0()); 
                    }
                    // InternalAdaptSem.g:1185:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    // InternalAdaptSem.g:1185:4: rule__Rule__InputsAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__InputsAssignment_7_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getInputsAssignment_7_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1189:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    {
                    // InternalAdaptSem.g:1189:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    // InternalAdaptSem.g:1190:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_1_1()); 
                    }
                    // InternalAdaptSem.g:1191:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    // InternalAdaptSem.g:1191:4: rule__Rule__OutputsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__OutputsAssignment_7_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getOutputsAssignment_7_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_7_1"


    // $ANTLR start "rule__Rule__Alternatives_7_2_1"
    // InternalAdaptSem.g:1199:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1203:1: ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptSem.g:1204:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    {
                    // InternalAdaptSem.g:1204:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    // InternalAdaptSem.g:1205:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_2_1_0()); 
                    }
                    // InternalAdaptSem.g:1206:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    // InternalAdaptSem.g:1206:4: rule__Rule__InputsAssignment_7_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__InputsAssignment_7_2_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getInputsAssignment_7_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1210:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    {
                    // InternalAdaptSem.g:1210:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    // InternalAdaptSem.g:1211:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_2_1_1()); 
                    }
                    // InternalAdaptSem.g:1212:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    // InternalAdaptSem.g:1212:4: rule__Rule__OutputsAssignment_7_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__OutputsAssignment_7_2_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getOutputsAssignment_7_2_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_7_2_1"


    // $ANTLR start "rule__Assignable__Alternatives"
    // InternalAdaptSem.g:1220:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1224:1: ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAdaptSem.g:1225:2: ( ruleExpr )
                    {
                    // InternalAdaptSem.g:1225:2: ( ruleExpr )
                    // InternalAdaptSem.g:1226:3: ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignableAccess().getExprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignableAccess().getExprParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1231:2: ( ruleRefConfiguration )
                    {
                    // InternalAdaptSem.g:1231:2: ( ruleRefConfiguration )
                    // InternalAdaptSem.g:1232:3: ruleRefConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignableAccess().getRefConfigurationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRefConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignableAccess().getRefConfigurationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptSem.g:1237:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1237:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1238:3: ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignableAccess().getSemanticDomainAccessParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignableAccess().getSemanticDomainAccessParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignable__Alternatives"


    // $ANTLR start "rule__Assignee__Alternatives"
    // InternalAdaptSem.g:1247:1: rule__Assignee__Alternatives : ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1251:1: ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==27) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==24) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAdaptSem.g:1252:2: ( ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1252:2: ( ruleSymbolDef )
                    // InternalAdaptSem.g:1253:3: ruleSymbolDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssigneeAccess().getSymbolDefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbolDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssigneeAccess().getSymbolDefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1258:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1258:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1259:3: ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssigneeAccess().getSemanticDomainAccessParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssigneeAccess().getSemanticDomainAccessParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignee__Alternatives"


    // $ANTLR start "rule__TerminalAccessExpression__Alternatives"
    // InternalAdaptSem.g:1268:1: rule__TerminalAccessExpression__Alternatives : ( ( ruleSymbolRef ) | ( ruleSelf ) );
    public final void rule__TerminalAccessExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1272:1: ( ( ruleSymbolRef ) | ( ruleSelf ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdaptSem.g:1273:2: ( ruleSymbolRef )
                    {
                    // InternalAdaptSem.g:1273:2: ( ruleSymbolRef )
                    // InternalAdaptSem.g:1274:3: ruleSymbolRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccessExpressionAccess().getSymbolRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbolRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccessExpressionAccess().getSymbolRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1279:2: ( ruleSelf )
                    {
                    // InternalAdaptSem.g:1279:2: ( ruleSelf )
                    // InternalAdaptSem.g:1280:3: ruleSelf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccessExpressionAccess().getSelfParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSelf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccessExpressionAccess().getSelfParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAccessExpression__Alternatives"


    // $ANTLR start "rule__TermDef__Alternatives"
    // InternalAdaptSem.g:1289:1: rule__TermDef__Alternatives : ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) );
    public final void rule__TermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1293:1: ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAdaptSem.g:1294:2: ( ruleSingleTermDef )
                    {
                    // InternalAdaptSem.g:1294:2: ( ruleSingleTermDef )
                    // InternalAdaptSem.g:1295:3: ruleSingleTermDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermDefAccess().getSingleTermDefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSingleTermDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermDefAccess().getSingleTermDefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1300:2: ( ruleListDef )
                    {
                    // InternalAdaptSem.g:1300:2: ( ruleListDef )
                    // InternalAdaptSem.g:1301:3: ruleListDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermDefAccess().getListDefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleListDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermDefAccess().getListDefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptSem.g:1306:2: ( ruleVoidList )
                    {
                    // InternalAdaptSem.g:1306:2: ( ruleVoidList )
                    // InternalAdaptSem.g:1307:3: ruleVoidList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermDefAccess().getVoidListParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVoidList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermDefAccess().getVoidListParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDef__Alternatives"


    // $ANTLR start "rule__TermRef__Alternatives"
    // InternalAdaptSem.g:1316:1: rule__TermRef__Alternatives : ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) );
    public final void rule__TermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1320:1: ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAdaptSem.g:1321:2: ( ruleSingleTermRef )
                    {
                    // InternalAdaptSem.g:1321:2: ( ruleSingleTermRef )
                    // InternalAdaptSem.g:1322:3: ruleSingleTermRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermRefAccess().getSingleTermRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSingleTermRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermRefAccess().getSingleTermRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1327:2: ( ruleListRef )
                    {
                    // InternalAdaptSem.g:1327:2: ( ruleListRef )
                    // InternalAdaptSem.g:1328:3: ruleListRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermRefAccess().getListRefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleListRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermRefAccess().getListRefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptSem.g:1333:2: ( ruleVoidList )
                    {
                    // InternalAdaptSem.g:1333:2: ( ruleVoidList )
                    // InternalAdaptSem.g:1334:3: ruleVoidList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermRefAccess().getVoidListParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVoidList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermRefAccess().getVoidListParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermRef__Alternatives"


    // $ANTLR start "rule__SingleTermDef__Alternatives"
    // InternalAdaptSem.g:1343:1: rule__SingleTermDef__Alternatives : ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) );
    public final void rule__SingleTermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1347:1: ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=17 && LA8_1<=18)||LA8_1==20||(LA8_1>=22 && LA8_1<=23)||LA8_1==26||LA8_1==31) ) {
                    alt8=2;
                }
                else if ( (LA8_1==25||LA8_1==27) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdaptSem.g:1348:2: ( ruleDefConfiguration )
                    {
                    // InternalAdaptSem.g:1348:2: ( ruleDefConfiguration )
                    // InternalAdaptSem.g:1349:3: ruleDefConfiguration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermDefAccess().getDefConfigurationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDefConfiguration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTermDefAccess().getDefConfigurationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1354:2: ( ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1354:2: ( ruleSymbolDef )
                    // InternalAdaptSem.g:1355:3: ruleSymbolDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermDefAccess().getSymbolDefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbolDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTermDefAccess().getSymbolDefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTermDef__Alternatives"


    // $ANTLR start "rule__SingleTermRef__Alternatives"
    // InternalAdaptSem.g:1364:1: rule__SingleTermRef__Alternatives : ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) );
    public final void rule__SingleTermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1368:1: ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=17 && LA9_1<=19)||(LA9_1>=21 && LA9_1<=23)||LA9_1==26) ) {
                    alt9=2;
                }
                else if ( (LA9_1==25||LA9_1==27) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAdaptSem.g:1369:2: ( ( ruleRefConfiguration ) )
                    {
                    // InternalAdaptSem.g:1369:2: ( ( ruleRefConfiguration ) )
                    // InternalAdaptSem.g:1370:3: ( ruleRefConfiguration )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0()); 
                    }
                    // InternalAdaptSem.g:1371:3: ( ruleRefConfiguration )
                    // InternalAdaptSem.g:1371:4: ruleRefConfiguration
                    {
                    pushFollow(FOLLOW_2);
                    ruleRefConfiguration();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1375:2: ( ruleSymbolRef )
                    {
                    // InternalAdaptSem.g:1375:2: ( ruleSymbolRef )
                    // InternalAdaptSem.g:1376:3: ruleSymbolRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermRefAccess().getSymbolRefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbolRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTermRefAccess().getSymbolRefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTermRef__Alternatives"


    // $ANTLR start "rule__CondExpr__Alternatives"
    // InternalAdaptSem.g:1385:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) );
    public final void rule__CondExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1389:1: ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) )
            int alt10=6;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAdaptSem.g:1390:2: ( ruleCondOr )
                    {
                    // InternalAdaptSem.g:1390:2: ( ruleCondOr )
                    // InternalAdaptSem.g:1391:3: ruleCondOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondExprAccess().getCondOrParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondExprAccess().getCondOrParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1396:2: ( ruleCondAnd )
                    {
                    // InternalAdaptSem.g:1396:2: ( ruleCondAnd )
                    // InternalAdaptSem.g:1397:3: ruleCondAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondExprAccess().getCondAndParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondExprAccess().getCondAndParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptSem.g:1402:2: ( ruleCondEquality )
                    {
                    // InternalAdaptSem.g:1402:2: ( ruleCondEquality )
                    // InternalAdaptSem.g:1403:3: ruleCondEquality
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondExprAccess().getCondEqualityParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondEquality();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondExprAccess().getCondEqualityParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptSem.g:1408:2: ( ruleCondComparison )
                    {
                    // InternalAdaptSem.g:1408:2: ( ruleCondComparison )
                    // InternalAdaptSem.g:1409:3: ruleCondComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondExprAccess().getCondComparisonParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondComparison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondExprAccess().getCondComparisonParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptSem.g:1414:2: ( ruleCondNot )
                    {
                    // InternalAdaptSem.g:1414:2: ( ruleCondNot )
                    // InternalAdaptSem.g:1415:3: ruleCondNot
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondExprAccess().getCondNotParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondNot();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondExprAccess().getCondNotParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptSem.g:1420:2: ( ruleCondIs )
                    {
                    // InternalAdaptSem.g:1420:2: ( ruleCondIs )
                    // InternalAdaptSem.g:1421:3: ruleCondIs
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondExprAccess().getCondIsParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondIs();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondExprAccess().getCondIsParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondExpr__Alternatives"


    // $ANTLR start "rule__CondEquality__Alternatives"
    // InternalAdaptSem.g:1430:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );
    public final void rule__CondEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1434:1: ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalAdaptSem.g:1435:2: ( ( rule__CondEquality__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1435:2: ( ( rule__CondEquality__Group_0__0 ) )
                    // InternalAdaptSem.g:1436:3: ( rule__CondEquality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1437:3: ( rule__CondEquality__Group_0__0 )
                    // InternalAdaptSem.g:1437:4: rule__CondEquality__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CondEquality__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondEqualityAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1441:2: ( ( rule__CondEquality__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1441:2: ( ( rule__CondEquality__Group_1__0 ) )
                    // InternalAdaptSem.g:1442:3: ( rule__CondEquality__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1443:3: ( rule__CondEquality__Group_1__0 )
                    // InternalAdaptSem.g:1443:4: rule__CondEquality__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CondEquality__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondEqualityAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Alternatives"


    // $ANTLR start "rule__CondComparison__Alternatives"
    // InternalAdaptSem.g:1451:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );
    public final void rule__CondComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1455:1: ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAdaptSem.g:1456:2: ( ( rule__CondComparison__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1456:2: ( ( rule__CondComparison__Group_0__0 ) )
                    // InternalAdaptSem.g:1457:3: ( rule__CondComparison__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1458:3: ( rule__CondComparison__Group_0__0 )
                    // InternalAdaptSem.g:1458:4: rule__CondComparison__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CondComparison__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondComparisonAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1462:2: ( ( rule__CondComparison__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1462:2: ( ( rule__CondComparison__Group_1__0 ) )
                    // InternalAdaptSem.g:1463:3: ( rule__CondComparison__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1464:3: ( rule__CondComparison__Group_1__0 )
                    // InternalAdaptSem.g:1464:4: rule__CondComparison__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CondComparison__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCondComparisonAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives_1_0"
    // InternalAdaptSem.g:1472:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1476:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdaptSem.g:1477:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1477:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1478:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1479:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1479:4: rule__Equality__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1483:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1483:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1484:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1485:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1485:4: rule__Equality__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Alternatives_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalAdaptSem.g:1493:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1497:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==40) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdaptSem.g:1498:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1498:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1499:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1500:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1500:4: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1504:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1504:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1505:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1506:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1506:4: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalAdaptSem.g:1514:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1518:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            else if ( (LA15_0==43) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdaptSem.g:1519:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1519:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1520:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1521:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1521:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1525:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1525:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1526:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1527:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1527:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__Alternatives_1_0"
    // InternalAdaptSem.g:1535:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1539:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            else if ( (LA16_0==45) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptSem.g:1540:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1540:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1541:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1542:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1542:4: rule__MulOrDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1546:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1546:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1547:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1548:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1548:4: rule__MulOrDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAdaptSem.g:1556:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1560:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) )
            int alt17=5;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalAdaptSem.g:1561:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1561:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalAdaptSem.g:1562:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1563:3: ( rule__Primary__Group_0__0 )
                    // InternalAdaptSem.g:1563:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1567:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1567:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalAdaptSem.g:1568:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1569:3: ( rule__Primary__Group_1__0 )
                    // InternalAdaptSem.g:1569:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptSem.g:1573:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAdaptSem.g:1573:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAdaptSem.g:1574:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalAdaptSem.g:1575:3: ( rule__Primary__Group_2__0 )
                    // InternalAdaptSem.g:1575:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptSem.g:1579:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalAdaptSem.g:1579:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalAdaptSem.g:1580:3: ( rule__Primary__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    }
                    // InternalAdaptSem.g:1581:3: ( rule__Primary__Group_3__0 )
                    // InternalAdaptSem.g:1581:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptSem.g:1585:2: ( ruleAtomic )
                    {
                    // InternalAdaptSem.g:1585:2: ( ruleAtomic )
                    // InternalAdaptSem.g:1586:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalAdaptSem.g:1595:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1599:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            case RULE_BOOL:
                {
                alt18=4;
                }
                break;
            case RULE_ID:
                {
                int LA18_5 = input.LA(2);

                if ( (LA18_5==27) ) {
                    alt18=5;
                }
                else if ( (LA18_5==EOF||LA18_5==17||(LA18_5>=20 && LA18_5<=23)||LA18_5==26||(LA18_5>=35 && LA18_5<=40)||(LA18_5>=42 && LA18_5<=45)) ) {
                    alt18=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 5, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA18_6 = input.LA(2);

                if ( (LA18_6==EOF||LA18_6==17||(LA18_6>=20 && LA18_6<=23)||LA18_6==26||(LA18_6>=35 && LA18_6<=40)||(LA18_6>=42 && LA18_6<=45)) ) {
                    alt18=6;
                }
                else if ( (LA18_6==27) ) {
                    alt18=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAdaptSem.g:1600:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1600:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalAdaptSem.g:1601:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1602:3: ( rule__Atomic__Group_0__0 )
                    // InternalAdaptSem.g:1602:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1606:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1606:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalAdaptSem.g:1607:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1608:3: ( rule__Atomic__Group_1__0 )
                    // InternalAdaptSem.g:1608:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptSem.g:1612:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalAdaptSem.g:1612:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalAdaptSem.g:1613:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalAdaptSem.g:1614:3: ( rule__Atomic__Group_2__0 )
                    // InternalAdaptSem.g:1614:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptSem.g:1618:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalAdaptSem.g:1618:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalAdaptSem.g:1619:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalAdaptSem.g:1620:3: ( rule__Atomic__Group_3__0 )
                    // InternalAdaptSem.g:1620:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptSem.g:1624:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1624:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1625:3: ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getSemanticDomainAccessParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getSemanticDomainAccessParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptSem.g:1630:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalAdaptSem.g:1630:2: ( ruleTerminalAccessExpression )
                    // InternalAdaptSem.g:1631:3: ruleTerminalAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getTerminalAccessExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTerminalAccessExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getTerminalAccessExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAdaptSem.g:1640:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1644:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptSem.g:1645:2: ( RULE_STRING )
                    {
                    // InternalAdaptSem.g:1645:2: ( RULE_STRING )
                    // InternalAdaptSem.g:1646:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1651:2: ( RULE_ID )
                    {
                    // InternalAdaptSem.g:1651:2: ( RULE_ID )
                    // InternalAdaptSem.g:1652:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__AdaptiveSemantics__Group__0"
    // InternalAdaptSem.g:1661:1: rule__AdaptiveSemantics__Group__0 : rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1 ;
    public final void rule__AdaptiveSemantics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1665:1: ( rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1 )
            // InternalAdaptSem.g:1666:2: rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AdaptiveSemantics__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdaptiveSemantics__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__Group__0"


    // $ANTLR start "rule__AdaptiveSemantics__Group__0__Impl"
    // InternalAdaptSem.g:1673:1: rule__AdaptiveSemantics__Group__0__Impl : ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) ) ;
    public final void rule__AdaptiveSemantics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1677:1: ( ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) ) )
            // InternalAdaptSem.g:1678:1: ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) )
            {
            // InternalAdaptSem.g:1678:1: ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) )
            // InternalAdaptSem.g:1679:2: ( rule__AdaptiveSemantics__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getModelAssignment_0()); 
            }
            // InternalAdaptSem.g:1680:2: ( rule__AdaptiveSemantics__ModelAssignment_0 )
            // InternalAdaptSem.g:1680:3: rule__AdaptiveSemantics__ModelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdaptiveSemantics__ModelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getModelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__Group__0__Impl"


    // $ANTLR start "rule__AdaptiveSemantics__Group__1"
    // InternalAdaptSem.g:1688:1: rule__AdaptiveSemantics__Group__1 : rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2 ;
    public final void rule__AdaptiveSemantics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1692:1: ( rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2 )
            // InternalAdaptSem.g:1693:2: rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AdaptiveSemantics__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdaptiveSemantics__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__Group__1"


    // $ANTLR start "rule__AdaptiveSemantics__Group__1__Impl"
    // InternalAdaptSem.g:1700:1: rule__AdaptiveSemantics__Group__1__Impl : ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* ) ;
    public final void rule__AdaptiveSemantics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1704:1: ( ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* ) )
            // InternalAdaptSem.g:1705:1: ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* )
            {
            // InternalAdaptSem.g:1705:1: ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* )
            // InternalAdaptSem.g:1706:2: ( rule__AdaptiveSemantics__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getImportsAssignment_1()); 
            }
            // InternalAdaptSem.g:1707:2: ( rule__AdaptiveSemantics__ImportsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAdaptSem.g:1707:3: rule__AdaptiveSemantics__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__AdaptiveSemantics__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__Group__1__Impl"


    // $ANTLR start "rule__AdaptiveSemantics__Group__2"
    // InternalAdaptSem.g:1715:1: rule__AdaptiveSemantics__Group__2 : rule__AdaptiveSemantics__Group__2__Impl ;
    public final void rule__AdaptiveSemantics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1719:1: ( rule__AdaptiveSemantics__Group__2__Impl )
            // InternalAdaptSem.g:1720:2: rule__AdaptiveSemantics__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdaptiveSemantics__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__Group__2"


    // $ANTLR start "rule__AdaptiveSemantics__Group__2__Impl"
    // InternalAdaptSem.g:1726:1: rule__AdaptiveSemantics__Group__2__Impl : ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* ) ;
    public final void rule__AdaptiveSemantics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1730:1: ( ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* ) )
            // InternalAdaptSem.g:1731:1: ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* )
            {
            // InternalAdaptSem.g:1731:1: ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* )
            // InternalAdaptSem.g:1732:2: ( rule__AdaptiveSemantics__RulesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getRulesAssignment_2()); 
            }
            // InternalAdaptSem.g:1733:2: ( rule__AdaptiveSemantics__RulesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAdaptSem.g:1733:3: rule__AdaptiveSemantics__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AdaptiveSemantics__RulesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getRulesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAdaptSem.g:1742:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1746:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptSem.g:1747:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAdaptSem.g:1754:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1758:1: ( ( 'model' ) )
            // InternalAdaptSem.g:1759:1: ( 'model' )
            {
            // InternalAdaptSem.g:1759:1: ( 'model' )
            // InternalAdaptSem.g:1760:2: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAdaptSem.g:1769:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1773:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAdaptSem.g:1774:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAdaptSem.g:1781:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportURIAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1785:1: ( ( ( rule__Model__ImportURIAssignment_1 ) ) )
            // InternalAdaptSem.g:1786:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            {
            // InternalAdaptSem.g:1786:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            // InternalAdaptSem.g:1787:2: ( rule__Model__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            }
            // InternalAdaptSem.g:1788:2: ( rule__Model__ImportURIAssignment_1 )
            // InternalAdaptSem.g:1788:3: rule__Model__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAdaptSem.g:1796:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1800:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAdaptSem.g:1801:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAdaptSem.g:1808:1: rule__Model__Group__2__Impl : ( 'with' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1812:1: ( ( 'with' ) )
            // InternalAdaptSem.g:1813:1: ( 'with' )
            {
            // InternalAdaptSem.g:1813:1: ( 'with' )
            // InternalAdaptSem.g:1814:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWithKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getWithKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalAdaptSem.g:1823:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1827:1: ( rule__Model__Group__3__Impl )
            // InternalAdaptSem.g:1828:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAdaptSem.g:1834:1: rule__Model__Group__3__Impl : ( ( rule__Model__SemanticdomainAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1838:1: ( ( ( rule__Model__SemanticdomainAssignment_3 ) ) )
            // InternalAdaptSem.g:1839:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            {
            // InternalAdaptSem.g:1839:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            // InternalAdaptSem.g:1840:2: ( rule__Model__SemanticdomainAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainAssignment_3()); 
            }
            // InternalAdaptSem.g:1841:2: ( rule__Model__SemanticdomainAssignment_3 )
            // InternalAdaptSem.g:1841:3: rule__Model__SemanticdomainAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__SemanticdomainAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSemanticdomainAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAdaptSem.g:1850:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1854:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAdaptSem.g:1855:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalAdaptSem.g:1862:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1866:1: ( ( 'import' ) )
            // InternalAdaptSem.g:1867:1: ( 'import' )
            {
            // InternalAdaptSem.g:1867:1: ( 'import' )
            // InternalAdaptSem.g:1868:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalAdaptSem.g:1877:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1881:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalAdaptSem.g:1882:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalAdaptSem.g:1889:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1893:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalAdaptSem.g:1894:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalAdaptSem.g:1894:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalAdaptSem.g:1895:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalAdaptSem.g:1896:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalAdaptSem.g:1896:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalAdaptSem.g:1904:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1908:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalAdaptSem.g:1909:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalAdaptSem.g:1916:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1920:1: ( ( 'as' ) )
            // InternalAdaptSem.g:1921:1: ( 'as' )
            {
            // InternalAdaptSem.g:1921:1: ( 'as' )
            // InternalAdaptSem.g:1922:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalAdaptSem.g:1931:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1935:1: ( rule__Import__Group__3__Impl )
            // InternalAdaptSem.g:1936:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalAdaptSem.g:1942:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1946:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalAdaptSem.g:1947:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalAdaptSem.g:1947:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalAdaptSem.g:1948:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalAdaptSem.g:1949:2: ( rule__Import__NameAssignment_3 )
            // InternalAdaptSem.g:1949:3: rule__Import__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalAdaptSem.g:1958:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1962:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalAdaptSem.g:1963:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalAdaptSem.g:1970:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1974:1: ( ( 'rule' ) )
            // InternalAdaptSem.g:1975:1: ( 'rule' )
            {
            // InternalAdaptSem.g:1975:1: ( 'rule' )
            // InternalAdaptSem.g:1976:2: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalAdaptSem.g:1985:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1989:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalAdaptSem.g:1990:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalAdaptSem.g:1997:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2001:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalAdaptSem.g:2002:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalAdaptSem.g:2002:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalAdaptSem.g:2003:2: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // InternalAdaptSem.g:2004:2: ( rule__Rule__NameAssignment_1 )
            // InternalAdaptSem.g:2004:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalAdaptSem.g:2012:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2016:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalAdaptSem.g:2017:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalAdaptSem.g:2024:1: rule__Rule__Group__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2028:1: ( ( ',' ) )
            // InternalAdaptSem.g:2029:1: ( ',' )
            {
            // InternalAdaptSem.g:2029:1: ( ',' )
            // InternalAdaptSem.g:2030:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalAdaptSem.g:2039:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2043:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalAdaptSem.g:2044:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalAdaptSem.g:2051:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConclusionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2055:1: ( ( ( rule__Rule__ConclusionAssignment_3 ) ) )
            // InternalAdaptSem.g:2056:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            {
            // InternalAdaptSem.g:2056:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            // InternalAdaptSem.g:2057:2: ( rule__Rule__ConclusionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConclusionAssignment_3()); 
            }
            // InternalAdaptSem.g:2058:2: ( rule__Rule__ConclusionAssignment_3 )
            // InternalAdaptSem.g:2058:3: rule__Rule__ConclusionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConclusionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConclusionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalAdaptSem.g:2066:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2070:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalAdaptSem.g:2071:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalAdaptSem.g:2078:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2082:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalAdaptSem.g:2083:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalAdaptSem.g:2083:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalAdaptSem.g:2084:2: ( rule__Rule__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4()); 
            }
            // InternalAdaptSem.g:2085:2: ( rule__Rule__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptSem.g:2085:3: rule__Rule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalAdaptSem.g:2093:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2097:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalAdaptSem.g:2098:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalAdaptSem.g:2105:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2109:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalAdaptSem.g:2110:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalAdaptSem.g:2110:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalAdaptSem.g:2111:2: ( rule__Rule__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5()); 
            }
            // InternalAdaptSem.g:2112:2: ( rule__Rule__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptSem.g:2112:3: rule__Rule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalAdaptSem.g:2120:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2124:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalAdaptSem.g:2125:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalAdaptSem.g:2132:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2136:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalAdaptSem.g:2137:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalAdaptSem.g:2137:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalAdaptSem.g:2138:2: ( rule__Rule__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6()); 
            }
            // InternalAdaptSem.g:2139:2: ( rule__Rule__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptSem.g:2139:3: rule__Rule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalAdaptSem.g:2147:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2151:1: ( rule__Rule__Group__7__Impl )
            // InternalAdaptSem.g:2152:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalAdaptSem.g:2158:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )? ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2162:1: ( ( ( rule__Rule__Group_7__0 )? ) )
            // InternalAdaptSem.g:2163:1: ( ( rule__Rule__Group_7__0 )? )
            {
            // InternalAdaptSem.g:2163:1: ( ( rule__Rule__Group_7__0 )? )
            // InternalAdaptSem.g:2164:2: ( rule__Rule__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7()); 
            }
            // InternalAdaptSem.g:2165:2: ( rule__Rule__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptSem.g:2165:3: rule__Rule__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_4__0"
    // InternalAdaptSem.g:2174:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2178:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalAdaptSem.g:2179:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // InternalAdaptSem.g:2186:1: rule__Rule__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2190:1: ( ( 'where' ) )
            // InternalAdaptSem.g:2191:1: ( 'where' )
            {
            // InternalAdaptSem.g:2191:1: ( 'where' )
            // InternalAdaptSem.g:2192:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getWhereKeyword_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getWhereKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // InternalAdaptSem.g:2201:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2205:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalAdaptSem.g:2206:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // InternalAdaptSem.g:2213:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2217:1: ( ( ( rule__Rule__ConditionsAssignment_4_1 ) ) )
            // InternalAdaptSem.g:2218:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            {
            // InternalAdaptSem.g:2218:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            // InternalAdaptSem.g:2219:2: ( rule__Rule__ConditionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_1()); 
            }
            // InternalAdaptSem.g:2220:2: ( rule__Rule__ConditionsAssignment_4_1 )
            // InternalAdaptSem.g:2220:3: rule__Rule__ConditionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group_4__2"
    // InternalAdaptSem.g:2228:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2232:1: ( rule__Rule__Group_4__2__Impl )
            // InternalAdaptSem.g:2233:2: rule__Rule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__2"


    // $ANTLR start "rule__Rule__Group_4__2__Impl"
    // InternalAdaptSem.g:2239:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2243:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalAdaptSem.g:2244:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalAdaptSem.g:2244:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalAdaptSem.g:2245:2: ( rule__Rule__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            }
            // InternalAdaptSem.g:2246:2: ( rule__Rule__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAdaptSem.g:2246:3: rule__Rule__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__2__Impl"


    // $ANTLR start "rule__Rule__Group_4_2__0"
    // InternalAdaptSem.g:2255:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2259:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalAdaptSem.g:2260:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_2__0"


    // $ANTLR start "rule__Rule__Group_4_2__0__Impl"
    // InternalAdaptSem.g:2267:1: rule__Rule__Group_4_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2271:1: ( ( ';' ) )
            // InternalAdaptSem.g:2272:1: ( ';' )
            {
            // InternalAdaptSem.g:2272:1: ( ';' )
            // InternalAdaptSem.g:2273:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_4_2_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getSemicolonKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_4_2__1"
    // InternalAdaptSem.g:2282:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2286:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalAdaptSem.g:2287:2: rule__Rule__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_2__1"


    // $ANTLR start "rule__Rule__Group_4_2__1__Impl"
    // InternalAdaptSem.g:2293:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2297:1: ( ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) )
            // InternalAdaptSem.g:2298:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            {
            // InternalAdaptSem.g:2298:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            // InternalAdaptSem.g:2299:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_2_1()); 
            }
            // InternalAdaptSem.g:2300:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            // InternalAdaptSem.g:2300:3: rule__Rule__ConditionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalAdaptSem.g:2309:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2313:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalAdaptSem.g:2314:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // InternalAdaptSem.g:2321:1: rule__Rule__Group_5__0__Impl : ( 'resolve' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2325:1: ( ( 'resolve' ) )
            // InternalAdaptSem.g:2326:1: ( 'resolve' )
            {
            // InternalAdaptSem.g:2326:1: ( 'resolve' )
            // InternalAdaptSem.g:2327:2: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getResolveKeyword_5_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getResolveKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // InternalAdaptSem.g:2336:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2340:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalAdaptSem.g:2341:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // InternalAdaptSem.g:2348:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__PremisesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2352:1: ( ( ( rule__Rule__PremisesAssignment_5_1 ) ) )
            // InternalAdaptSem.g:2353:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            {
            // InternalAdaptSem.g:2353:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            // InternalAdaptSem.g:2354:2: ( rule__Rule__PremisesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_1()); 
            }
            // InternalAdaptSem.g:2355:2: ( rule__Rule__PremisesAssignment_5_1 )
            // InternalAdaptSem.g:2355:3: rule__Rule__PremisesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PremisesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getPremisesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__2"
    // InternalAdaptSem.g:2363:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2367:1: ( rule__Rule__Group_5__2__Impl )
            // InternalAdaptSem.g:2368:2: rule__Rule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2"


    // $ANTLR start "rule__Rule__Group_5__2__Impl"
    // InternalAdaptSem.g:2374:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Group_5_2__0 )* ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2378:1: ( ( ( rule__Rule__Group_5_2__0 )* ) )
            // InternalAdaptSem.g:2379:1: ( ( rule__Rule__Group_5_2__0 )* )
            {
            // InternalAdaptSem.g:2379:1: ( ( rule__Rule__Group_5_2__0 )* )
            // InternalAdaptSem.g:2380:2: ( rule__Rule__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5_2()); 
            }
            // InternalAdaptSem.g:2381:2: ( rule__Rule__Group_5_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAdaptSem.g:2381:3: rule__Rule__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__2__Impl"


    // $ANTLR start "rule__Rule__Group_5_2__0"
    // InternalAdaptSem.g:2390:1: rule__Rule__Group_5_2__0 : rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 ;
    public final void rule__Rule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2394:1: ( rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 )
            // InternalAdaptSem.g:2395:2: rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_2__0"


    // $ANTLR start "rule__Rule__Group_5_2__0__Impl"
    // InternalAdaptSem.g:2402:1: rule__Rule__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2406:1: ( ( ';' ) )
            // InternalAdaptSem.g:2407:1: ( ';' )
            {
            // InternalAdaptSem.g:2407:1: ( ';' )
            // InternalAdaptSem.g:2408:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_5_2_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getSemicolonKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_5_2__1"
    // InternalAdaptSem.g:2417:1: rule__Rule__Group_5_2__1 : rule__Rule__Group_5_2__1__Impl ;
    public final void rule__Rule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2421:1: ( rule__Rule__Group_5_2__1__Impl )
            // InternalAdaptSem.g:2422:2: rule__Rule__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_2__1"


    // $ANTLR start "rule__Rule__Group_5_2__1__Impl"
    // InternalAdaptSem.g:2428:1: rule__Rule__Group_5_2__1__Impl : ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) ;
    public final void rule__Rule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2432:1: ( ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) )
            // InternalAdaptSem.g:2433:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            {
            // InternalAdaptSem.g:2433:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            // InternalAdaptSem.g:2434:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_2_1()); 
            }
            // InternalAdaptSem.g:2435:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            // InternalAdaptSem.g:2435:3: rule__Rule__PremisesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PremisesAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getPremisesAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalAdaptSem.g:2444:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2448:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalAdaptSem.g:2449:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalAdaptSem.g:2456:1: rule__Rule__Group_6__0__Impl : ( 'bind' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2460:1: ( ( 'bind' ) )
            // InternalAdaptSem.g:2461:1: ( 'bind' )
            {
            // InternalAdaptSem.g:2461:1: ( 'bind' )
            // InternalAdaptSem.g:2462:2: 'bind'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindKeyword_6_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBindKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalAdaptSem.g:2471:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2475:1: ( rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 )
            // InternalAdaptSem.g:2476:2: rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalAdaptSem.g:2483:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__BindingsAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2487:1: ( ( ( rule__Rule__BindingsAssignment_6_1 ) ) )
            // InternalAdaptSem.g:2488:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            {
            // InternalAdaptSem.g:2488:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            // InternalAdaptSem.g:2489:2: ( rule__Rule__BindingsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_1()); 
            }
            // InternalAdaptSem.g:2490:2: ( rule__Rule__BindingsAssignment_6_1 )
            // InternalAdaptSem.g:2490:3: rule__Rule__BindingsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__BindingsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBindingsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Rule__Group_6__2"
    // InternalAdaptSem.g:2498:1: rule__Rule__Group_6__2 : rule__Rule__Group_6__2__Impl ;
    public final void rule__Rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2502:1: ( rule__Rule__Group_6__2__Impl )
            // InternalAdaptSem.g:2503:2: rule__Rule__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__2"


    // $ANTLR start "rule__Rule__Group_6__2__Impl"
    // InternalAdaptSem.g:2509:1: rule__Rule__Group_6__2__Impl : ( ( rule__Rule__Group_6_2__0 )* ) ;
    public final void rule__Rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2513:1: ( ( ( rule__Rule__Group_6_2__0 )* ) )
            // InternalAdaptSem.g:2514:1: ( ( rule__Rule__Group_6_2__0 )* )
            {
            // InternalAdaptSem.g:2514:1: ( ( rule__Rule__Group_6_2__0 )* )
            // InternalAdaptSem.g:2515:2: ( rule__Rule__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6_2()); 
            }
            // InternalAdaptSem.g:2516:2: ( rule__Rule__Group_6_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAdaptSem.g:2516:3: rule__Rule__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__2__Impl"


    // $ANTLR start "rule__Rule__Group_6_2__0"
    // InternalAdaptSem.g:2525:1: rule__Rule__Group_6_2__0 : rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 ;
    public final void rule__Rule__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2529:1: ( rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 )
            // InternalAdaptSem.g:2530:2: rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_2__0"


    // $ANTLR start "rule__Rule__Group_6_2__0__Impl"
    // InternalAdaptSem.g:2537:1: rule__Rule__Group_6_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2541:1: ( ( ';' ) )
            // InternalAdaptSem.g:2542:1: ( ';' )
            {
            // InternalAdaptSem.g:2542:1: ( ';' )
            // InternalAdaptSem.g:2543:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_6_2_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getSemicolonKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_6_2__1"
    // InternalAdaptSem.g:2552:1: rule__Rule__Group_6_2__1 : rule__Rule__Group_6_2__1__Impl ;
    public final void rule__Rule__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2556:1: ( rule__Rule__Group_6_2__1__Impl )
            // InternalAdaptSem.g:2557:2: rule__Rule__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_2__1"


    // $ANTLR start "rule__Rule__Group_6_2__1__Impl"
    // InternalAdaptSem.g:2563:1: rule__Rule__Group_6_2__1__Impl : ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) ;
    public final void rule__Rule__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2567:1: ( ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) )
            // InternalAdaptSem.g:2568:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            {
            // InternalAdaptSem.g:2568:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            // InternalAdaptSem.g:2569:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_2_1()); 
            }
            // InternalAdaptSem.g:2570:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            // InternalAdaptSem.g:2570:3: rule__Rule__BindingsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__BindingsAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBindingsAssignment_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_7__0"
    // InternalAdaptSem.g:2579:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2583:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalAdaptSem.g:2584:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0"


    // $ANTLR start "rule__Rule__Group_7__0__Impl"
    // InternalAdaptSem.g:2591:1: rule__Rule__Group_7__0__Impl : ( 'IO' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2595:1: ( ( 'IO' ) )
            // InternalAdaptSem.g:2596:1: ( 'IO' )
            {
            // InternalAdaptSem.g:2596:1: ( 'IO' )
            // InternalAdaptSem.g:2597:2: 'IO'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getIOKeyword_7_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getIOKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__0__Impl"


    // $ANTLR start "rule__Rule__Group_7__1"
    // InternalAdaptSem.g:2606:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2610:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // InternalAdaptSem.g:2611:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1"


    // $ANTLR start "rule__Rule__Group_7__1__Impl"
    // InternalAdaptSem.g:2618:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Alternatives_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2622:1: ( ( ( rule__Rule__Alternatives_7_1 ) ) )
            // InternalAdaptSem.g:2623:1: ( ( rule__Rule__Alternatives_7_1 ) )
            {
            // InternalAdaptSem.g:2623:1: ( ( rule__Rule__Alternatives_7_1 ) )
            // InternalAdaptSem.g:2624:2: ( rule__Rule__Alternatives_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_1()); 
            }
            // InternalAdaptSem.g:2625:2: ( rule__Rule__Alternatives_7_1 )
            // InternalAdaptSem.g:2625:3: rule__Rule__Alternatives_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAlternatives_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__1__Impl"


    // $ANTLR start "rule__Rule__Group_7__2"
    // InternalAdaptSem.g:2633:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2637:1: ( rule__Rule__Group_7__2__Impl )
            // InternalAdaptSem.g:2638:2: rule__Rule__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__2"


    // $ANTLR start "rule__Rule__Group_7__2__Impl"
    // InternalAdaptSem.g:2644:1: rule__Rule__Group_7__2__Impl : ( ( rule__Rule__Group_7_2__0 )* ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2648:1: ( ( ( rule__Rule__Group_7_2__0 )* ) )
            // InternalAdaptSem.g:2649:1: ( ( rule__Rule__Group_7_2__0 )* )
            {
            // InternalAdaptSem.g:2649:1: ( ( rule__Rule__Group_7_2__0 )* )
            // InternalAdaptSem.g:2650:2: ( rule__Rule__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7_2()); 
            }
            // InternalAdaptSem.g:2651:2: ( rule__Rule__Group_7_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdaptSem.g:2651:3: rule__Rule__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7__2__Impl"


    // $ANTLR start "rule__Rule__Group_7_2__0"
    // InternalAdaptSem.g:2660:1: rule__Rule__Group_7_2__0 : rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 ;
    public final void rule__Rule__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2664:1: ( rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 )
            // InternalAdaptSem.g:2665:2: rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_2__0"


    // $ANTLR start "rule__Rule__Group_7_2__0__Impl"
    // InternalAdaptSem.g:2672:1: rule__Rule__Group_7_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2676:1: ( ( ';' ) )
            // InternalAdaptSem.g:2677:1: ( ';' )
            {
            // InternalAdaptSem.g:2677:1: ( ';' )
            // InternalAdaptSem.g:2678:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_7_2_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getSemicolonKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_7_2__1"
    // InternalAdaptSem.g:2687:1: rule__Rule__Group_7_2__1 : rule__Rule__Group_7_2__1__Impl ;
    public final void rule__Rule__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2691:1: ( rule__Rule__Group_7_2__1__Impl )
            // InternalAdaptSem.g:2692:2: rule__Rule__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_7_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_2__1"


    // $ANTLR start "rule__Rule__Group_7_2__1__Impl"
    // InternalAdaptSem.g:2698:1: rule__Rule__Group_7_2__1__Impl : ( ( rule__Rule__Alternatives_7_2_1 ) ) ;
    public final void rule__Rule__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2702:1: ( ( ( rule__Rule__Alternatives_7_2_1 ) ) )
            // InternalAdaptSem.g:2703:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            {
            // InternalAdaptSem.g:2703:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            // InternalAdaptSem.g:2704:2: ( rule__Rule__Alternatives_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_2_1()); 
            }
            // InternalAdaptSem.g:2705:2: ( rule__Rule__Alternatives_7_2_1 )
            // InternalAdaptSem.g:2705:3: rule__Rule__Alternatives_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_7_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAlternatives_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_7_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalAdaptSem.g:2714:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2718:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalAdaptSem.g:2719:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalAdaptSem.g:2726:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2730:1: ( ( () ) )
            // InternalAdaptSem.g:2731:1: ( () )
            {
            // InternalAdaptSem.g:2731:1: ( () )
            // InternalAdaptSem.g:2732:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalAdaptSem.g:2733:2: ()
            // InternalAdaptSem.g:2733:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalAdaptSem.g:2741:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2745:1: ( rule__Condition__Group__1__Impl )
            // InternalAdaptSem.g:2746:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalAdaptSem.g:2752:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CondAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2756:1: ( ( ( rule__Condition__CondAssignment_1 ) ) )
            // InternalAdaptSem.g:2757:1: ( ( rule__Condition__CondAssignment_1 ) )
            {
            // InternalAdaptSem.g:2757:1: ( ( rule__Condition__CondAssignment_1 ) )
            // InternalAdaptSem.g:2758:2: ( rule__Condition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCondAssignment_1()); 
            }
            // InternalAdaptSem.g:2759:2: ( rule__Condition__CondAssignment_1 )
            // InternalAdaptSem.g:2759:3: rule__Condition__CondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__CondAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getCondAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalAdaptSem.g:2768:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2772:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAdaptSem.g:2773:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalAdaptSem.g:2780:1: rule__Input__Group__0__Impl : ( ( rule__Input__AssigneeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2784:1: ( ( ( rule__Input__AssigneeAssignment_0 ) ) )
            // InternalAdaptSem.g:2785:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            {
            // InternalAdaptSem.g:2785:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            // InternalAdaptSem.g:2786:2: ( rule__Input__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAssigneeAssignment_0()); 
            }
            // InternalAdaptSem.g:2787:2: ( rule__Input__AssigneeAssignment_0 )
            // InternalAdaptSem.g:2787:3: rule__Input__AssigneeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__AssigneeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getAssigneeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalAdaptSem.g:2795:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2799:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAdaptSem.g:2800:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Input__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalAdaptSem.g:2807:1: rule__Input__Group__1__Impl : ( '=' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2811:1: ( ( '=' ) )
            // InternalAdaptSem.g:2812:1: ( '=' )
            {
            // InternalAdaptSem.g:2812:1: ( '=' )
            // InternalAdaptSem.g:2813:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getEqualsSignKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalAdaptSem.g:2822:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2826:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAdaptSem.g:2827:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Input__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalAdaptSem.g:2834:1: rule__Input__Group__2__Impl : ( ( rule__Input__OperationAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2838:1: ( ( ( rule__Input__OperationAssignment_2 ) ) )
            // InternalAdaptSem.g:2839:1: ( ( rule__Input__OperationAssignment_2 ) )
            {
            // InternalAdaptSem.g:2839:1: ( ( rule__Input__OperationAssignment_2 ) )
            // InternalAdaptSem.g:2840:2: ( rule__Input__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationAssignment_2()); 
            }
            // InternalAdaptSem.g:2841:2: ( rule__Input__OperationAssignment_2 )
            // InternalAdaptSem.g:2841:3: rule__Input__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Input__OperationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getOperationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalAdaptSem.g:2849:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2853:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAdaptSem.g:2854:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Input__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalAdaptSem.g:2861:1: rule__Input__Group__3__Impl : ( '(' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2865:1: ( ( '(' ) )
            // InternalAdaptSem.g:2866:1: ( '(' )
            {
            // InternalAdaptSem.g:2866:1: ( '(' )
            // InternalAdaptSem.g:2867:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalAdaptSem.g:2876:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2880:1: ( rule__Input__Group__4__Impl )
            // InternalAdaptSem.g:2881:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalAdaptSem.g:2887:1: rule__Input__Group__4__Impl : ( ')' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2891:1: ( ( ')' ) )
            // InternalAdaptSem.g:2892:1: ( ')' )
            {
            // InternalAdaptSem.g:2892:1: ( ')' )
            // InternalAdaptSem.g:2893:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalAdaptSem.g:2903:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2907:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAdaptSem.g:2908:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalAdaptSem.g:2915:1: rule__Output__Group__0__Impl : ( ( rule__Output__OperationAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2919:1: ( ( ( rule__Output__OperationAssignment_0 ) ) )
            // InternalAdaptSem.g:2920:1: ( ( rule__Output__OperationAssignment_0 ) )
            {
            // InternalAdaptSem.g:2920:1: ( ( rule__Output__OperationAssignment_0 ) )
            // InternalAdaptSem.g:2921:2: ( rule__Output__OperationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationAssignment_0()); 
            }
            // InternalAdaptSem.g:2922:2: ( rule__Output__OperationAssignment_0 )
            // InternalAdaptSem.g:2922:3: rule__Output__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__OperationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getOperationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalAdaptSem.g:2930:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2934:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAdaptSem.g:2935:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Output__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalAdaptSem.g:2942:1: rule__Output__Group__1__Impl : ( '(' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2946:1: ( ( '(' ) )
            // InternalAdaptSem.g:2947:1: ( '(' )
            {
            // InternalAdaptSem.g:2947:1: ( '(' )
            // InternalAdaptSem.g:2948:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalAdaptSem.g:2957:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2961:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAdaptSem.g:2962:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Output__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalAdaptSem.g:2969:1: rule__Output__Group__2__Impl : ( ( rule__Output__Group_2__0 )? ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2973:1: ( ( ( rule__Output__Group_2__0 )? ) )
            // InternalAdaptSem.g:2974:1: ( ( rule__Output__Group_2__0 )? )
            {
            // InternalAdaptSem.g:2974:1: ( ( rule__Output__Group_2__0 )? )
            // InternalAdaptSem.g:2975:2: ( rule__Output__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:2976:2: ( rule__Output__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==30||LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdaptSem.g:2976:3: rule__Output__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalAdaptSem.g:2984:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2988:1: ( rule__Output__Group__3__Impl )
            // InternalAdaptSem.g:2989:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalAdaptSem.g:2995:1: rule__Output__Group__3__Impl : ( ')' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2999:1: ( ( ')' ) )
            // InternalAdaptSem.g:3000:1: ( ')' )
            {
            // InternalAdaptSem.g:3000:1: ( ')' )
            // InternalAdaptSem.g:3001:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group_2__0"
    // InternalAdaptSem.g:3011:1: rule__Output__Group_2__0 : rule__Output__Group_2__0__Impl rule__Output__Group_2__1 ;
    public final void rule__Output__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3015:1: ( rule__Output__Group_2__0__Impl rule__Output__Group_2__1 )
            // InternalAdaptSem.g:3016:2: rule__Output__Group_2__0__Impl rule__Output__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Output__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2__0"


    // $ANTLR start "rule__Output__Group_2__0__Impl"
    // InternalAdaptSem.g:3023:1: rule__Output__Group_2__0__Impl : ( ( rule__Output__ArgsAssignment_2_0 ) ) ;
    public final void rule__Output__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3027:1: ( ( ( rule__Output__ArgsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:3028:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:3028:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            // InternalAdaptSem.g:3029:2: ( rule__Output__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:3030:2: ( rule__Output__ArgsAssignment_2_0 )
            // InternalAdaptSem.g:3030:3: rule__Output__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__ArgsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getArgsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2__0__Impl"


    // $ANTLR start "rule__Output__Group_2__1"
    // InternalAdaptSem.g:3038:1: rule__Output__Group_2__1 : rule__Output__Group_2__1__Impl ;
    public final void rule__Output__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3042:1: ( rule__Output__Group_2__1__Impl )
            // InternalAdaptSem.g:3043:2: rule__Output__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2__1"


    // $ANTLR start "rule__Output__Group_2__1__Impl"
    // InternalAdaptSem.g:3049:1: rule__Output__Group_2__1__Impl : ( ( rule__Output__Group_2_1__0 )* ) ;
    public final void rule__Output__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3053:1: ( ( ( rule__Output__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:3054:1: ( ( rule__Output__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:3054:1: ( ( rule__Output__Group_2_1__0 )* )
            // InternalAdaptSem.g:3055:2: ( rule__Output__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:3056:2: ( rule__Output__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAdaptSem.g:3056:3: rule__Output__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Output__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2__1__Impl"


    // $ANTLR start "rule__Output__Group_2_1__0"
    // InternalAdaptSem.g:3065:1: rule__Output__Group_2_1__0 : rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 ;
    public final void rule__Output__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3069:1: ( rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 )
            // InternalAdaptSem.g:3070:2: rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Output__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2_1__0"


    // $ANTLR start "rule__Output__Group_2_1__0__Impl"
    // InternalAdaptSem.g:3077:1: rule__Output__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3081:1: ( ( ',' ) )
            // InternalAdaptSem.g:3082:1: ( ',' )
            {
            // InternalAdaptSem.g:3082:1: ( ',' )
            // InternalAdaptSem.g:3083:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2_1__0__Impl"


    // $ANTLR start "rule__Output__Group_2_1__1"
    // InternalAdaptSem.g:3092:1: rule__Output__Group_2_1__1 : rule__Output__Group_2_1__1__Impl ;
    public final void rule__Output__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3096:1: ( rule__Output__Group_2_1__1__Impl )
            // InternalAdaptSem.g:3097:2: rule__Output__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2_1__1"


    // $ANTLR start "rule__Output__Group_2_1__1__Impl"
    // InternalAdaptSem.g:3103:1: rule__Output__Group_2_1__1__Impl : ( ( rule__Output__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Output__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3107:1: ( ( ( rule__Output__ArgsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:3108:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:3108:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:3109:2: ( rule__Output__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:3110:2: ( rule__Output__ArgsAssignment_2_1_1 )
            // InternalAdaptSem.g:3110:3: rule__Output__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__ArgsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getArgsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_2_1__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalAdaptSem.g:3119:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3123:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalAdaptSem.g:3124:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Binding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalAdaptSem.g:3131:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__AssigneeAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3135:1: ( ( ( rule__Binding__AssigneeAssignment_0 ) ) )
            // InternalAdaptSem.g:3136:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            {
            // InternalAdaptSem.g:3136:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            // InternalAdaptSem.g:3137:2: ( rule__Binding__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getAssigneeAssignment_0()); 
            }
            // InternalAdaptSem.g:3138:2: ( rule__Binding__AssigneeAssignment_0 )
            // InternalAdaptSem.g:3138:3: rule__Binding__AssigneeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__AssigneeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getAssigneeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalAdaptSem.g:3146:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3150:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalAdaptSem.g:3151:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Binding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalAdaptSem.g:3158:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3162:1: ( ( '=' ) )
            // InternalAdaptSem.g:3163:1: ( '=' )
            {
            // InternalAdaptSem.g:3163:1: ( '=' )
            // InternalAdaptSem.g:3164:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalAdaptSem.g:3173:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3177:1: ( rule__Binding__Group__2__Impl )
            // InternalAdaptSem.g:3178:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalAdaptSem.g:3184:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ExprAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3188:1: ( ( ( rule__Binding__ExprAssignment_2 ) ) )
            // InternalAdaptSem.g:3189:1: ( ( rule__Binding__ExprAssignment_2 ) )
            {
            // InternalAdaptSem.g:3189:1: ( ( rule__Binding__ExprAssignment_2 ) )
            // InternalAdaptSem.g:3190:2: ( rule__Binding__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            }
            // InternalAdaptSem.g:3191:2: ( rule__Binding__ExprAssignment_2 )
            // InternalAdaptSem.g:3191:3: rule__Binding__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group__0"
    // InternalAdaptSem.g:3200:1: rule__SemanticDomainAccess__Group__0 : rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 ;
    public final void rule__SemanticDomainAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3204:1: ( rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 )
            // InternalAdaptSem.g:3205:2: rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SemanticDomainAccess__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__0"


    // $ANTLR start "rule__SemanticDomainAccess__Group__0__Impl"
    // InternalAdaptSem.g:3212:1: rule__SemanticDomainAccess__Group__0__Impl : ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) ;
    public final void rule__SemanticDomainAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3216:1: ( ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) )
            // InternalAdaptSem.g:3217:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            {
            // InternalAdaptSem.g:3217:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            // InternalAdaptSem.g:3218:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getRecieverAssignment_0()); 
            }
            // InternalAdaptSem.g:3219:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            // InternalAdaptSem.g:3219:3: rule__SemanticDomainAccess__RecieverAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__RecieverAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getRecieverAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__0__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group__1"
    // InternalAdaptSem.g:3227:1: rule__SemanticDomainAccess__Group__1 : rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 ;
    public final void rule__SemanticDomainAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3231:1: ( rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 )
            // InternalAdaptSem.g:3232:2: rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SemanticDomainAccess__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__1"


    // $ANTLR start "rule__SemanticDomainAccess__Group__1__Impl"
    // InternalAdaptSem.g:3239:1: rule__SemanticDomainAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3243:1: ( ( '.' ) )
            // InternalAdaptSem.g:3244:1: ( '.' )
            {
            // InternalAdaptSem.g:3244:1: ( '.' )
            // InternalAdaptSem.g:3245:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__1__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group__2"
    // InternalAdaptSem.g:3254:1: rule__SemanticDomainAccess__Group__2 : rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 ;
    public final void rule__SemanticDomainAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3258:1: ( rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 )
            // InternalAdaptSem.g:3259:2: rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SemanticDomainAccess__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__2"


    // $ANTLR start "rule__SemanticDomainAccess__Group__2__Impl"
    // InternalAdaptSem.g:3266:1: rule__SemanticDomainAccess__Group__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3270:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) )
            // InternalAdaptSem.g:3271:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            {
            // InternalAdaptSem.g:3271:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            // InternalAdaptSem.g:3272:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_2()); 
            }
            // InternalAdaptSem.g:3273:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            // InternalAdaptSem.g:3273:3: rule__SemanticDomainAccess__FieldAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__FieldAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__2__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group__3"
    // InternalAdaptSem.g:3281:1: rule__SemanticDomainAccess__Group__3 : rule__SemanticDomainAccess__Group__3__Impl ;
    public final void rule__SemanticDomainAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3285:1: ( rule__SemanticDomainAccess__Group__3__Impl )
            // InternalAdaptSem.g:3286:2: rule__SemanticDomainAccess__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__3"


    // $ANTLR start "rule__SemanticDomainAccess__Group__3__Impl"
    // InternalAdaptSem.g:3292:1: rule__SemanticDomainAccess__Group__3__Impl : ( ( rule__SemanticDomainAccess__Group_3__0 )* ) ;
    public final void rule__SemanticDomainAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3296:1: ( ( ( rule__SemanticDomainAccess__Group_3__0 )* ) )
            // InternalAdaptSem.g:3297:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            {
            // InternalAdaptSem.g:3297:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            // InternalAdaptSem.g:3298:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup_3()); 
            }
            // InternalAdaptSem.g:3299:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAdaptSem.g:3299:3: rule__SemanticDomainAccess__Group_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SemanticDomainAccess__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group__3__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group_3__0"
    // InternalAdaptSem.g:3308:1: rule__SemanticDomainAccess__Group_3__0 : rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 ;
    public final void rule__SemanticDomainAccess__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3312:1: ( rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 )
            // InternalAdaptSem.g:3313:2: rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__SemanticDomainAccess__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group_3__0"


    // $ANTLR start "rule__SemanticDomainAccess__Group_3__0__Impl"
    // InternalAdaptSem.g:3320:1: rule__SemanticDomainAccess__Group_3__0__Impl : ( () ) ;
    public final void rule__SemanticDomainAccess__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3324:1: ( ( () ) )
            // InternalAdaptSem.g:3325:1: ( () )
            {
            // InternalAdaptSem.g:3325:1: ( () )
            // InternalAdaptSem.g:3326:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0()); 
            }
            // InternalAdaptSem.g:3327:2: ()
            // InternalAdaptSem.g:3327:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group_3__0__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group_3__1"
    // InternalAdaptSem.g:3335:1: rule__SemanticDomainAccess__Group_3__1 : rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 ;
    public final void rule__SemanticDomainAccess__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3339:1: ( rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 )
            // InternalAdaptSem.g:3340:2: rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__SemanticDomainAccess__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group_3__1"


    // $ANTLR start "rule__SemanticDomainAccess__Group_3__1__Impl"
    // InternalAdaptSem.g:3347:1: rule__SemanticDomainAccess__Group_3__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3351:1: ( ( '.' ) )
            // InternalAdaptSem.g:3352:1: ( '.' )
            {
            // InternalAdaptSem.g:3352:1: ( '.' )
            // InternalAdaptSem.g:3353:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group_3__1__Impl"


    // $ANTLR start "rule__SemanticDomainAccess__Group_3__2"
    // InternalAdaptSem.g:3362:1: rule__SemanticDomainAccess__Group_3__2 : rule__SemanticDomainAccess__Group_3__2__Impl ;
    public final void rule__SemanticDomainAccess__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3366:1: ( rule__SemanticDomainAccess__Group_3__2__Impl )
            // InternalAdaptSem.g:3367:2: rule__SemanticDomainAccess__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group_3__2"


    // $ANTLR start "rule__SemanticDomainAccess__Group_3__2__Impl"
    // InternalAdaptSem.g:3373:1: rule__SemanticDomainAccess__Group_3__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3377:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) )
            // InternalAdaptSem.g:3378:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            {
            // InternalAdaptSem.g:3378:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            // InternalAdaptSem.g:3379:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_3_2()); 
            }
            // InternalAdaptSem.g:3380:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            // InternalAdaptSem.g:3380:3: rule__SemanticDomainAccess__FieldAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SemanticDomainAccess__FieldAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__Group_3__2__Impl"


    // $ANTLR start "rule__Self__Group__0"
    // InternalAdaptSem.g:3389:1: rule__Self__Group__0 : rule__Self__Group__0__Impl rule__Self__Group__1 ;
    public final void rule__Self__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3393:1: ( rule__Self__Group__0__Impl rule__Self__Group__1 )
            // InternalAdaptSem.g:3394:2: rule__Self__Group__0__Impl rule__Self__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Self__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Self__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__0"


    // $ANTLR start "rule__Self__Group__0__Impl"
    // InternalAdaptSem.g:3401:1: rule__Self__Group__0__Impl : ( () ) ;
    public final void rule__Self__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3405:1: ( ( () ) )
            // InternalAdaptSem.g:3406:1: ( () )
            {
            // InternalAdaptSem.g:3406:1: ( () )
            // InternalAdaptSem.g:3407:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfAction_0()); 
            }
            // InternalAdaptSem.g:3408:2: ()
            // InternalAdaptSem.g:3408:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getSelfAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__0__Impl"


    // $ANTLR start "rule__Self__Group__1"
    // InternalAdaptSem.g:3416:1: rule__Self__Group__1 : rule__Self__Group__1__Impl ;
    public final void rule__Self__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3420:1: ( rule__Self__Group__1__Impl )
            // InternalAdaptSem.g:3421:2: rule__Self__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Self__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__1"


    // $ANTLR start "rule__Self__Group__1__Impl"
    // InternalAdaptSem.g:3427:1: rule__Self__Group__1__Impl : ( 'self' ) ;
    public final void rule__Self__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3431:1: ( ( 'self' ) )
            // InternalAdaptSem.g:3432:1: ( 'self' )
            {
            // InternalAdaptSem.g:3432:1: ( 'self' )
            // InternalAdaptSem.g:3433:2: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getSelfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__1__Impl"


    // $ANTLR start "rule__Conclusion__Group__0"
    // InternalAdaptSem.g:3443:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3447:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalAdaptSem.g:3448:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Conclusion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__0"


    // $ANTLR start "rule__Conclusion__Group__0__Impl"
    // InternalAdaptSem.g:3455:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__FromAssignment_0 ) ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3459:1: ( ( ( rule__Conclusion__FromAssignment_0 ) ) )
            // InternalAdaptSem.g:3460:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            {
            // InternalAdaptSem.g:3460:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            // InternalAdaptSem.g:3461:2: ( rule__Conclusion__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getFromAssignment_0()); 
            }
            // InternalAdaptSem.g:3462:2: ( rule__Conclusion__FromAssignment_0 )
            // InternalAdaptSem.g:3462:3: rule__Conclusion__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__FromAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getFromAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__0__Impl"


    // $ANTLR start "rule__Conclusion__Group__1"
    // InternalAdaptSem.g:3470:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3474:1: ( rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 )
            // InternalAdaptSem.g:3475:2: rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Conclusion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__1"


    // $ANTLR start "rule__Conclusion__Group__1__Impl"
    // InternalAdaptSem.g:3482:1: rule__Conclusion__Group__1__Impl : ( '->' ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3486:1: ( ( '->' ) )
            // InternalAdaptSem.g:3487:1: ( '->' )
            {
            // InternalAdaptSem.g:3487:1: ( '->' )
            // InternalAdaptSem.g:3488:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__1__Impl"


    // $ANTLR start "rule__Conclusion__Group__2"
    // InternalAdaptSem.g:3497:1: rule__Conclusion__Group__2 : rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 ;
    public final void rule__Conclusion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3501:1: ( rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 )
            // InternalAdaptSem.g:3502:2: rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Conclusion__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__2"


    // $ANTLR start "rule__Conclusion__Group__2__Impl"
    // InternalAdaptSem.g:3509:1: rule__Conclusion__Group__2__Impl : ( ( rule__Conclusion__TerminationAssignment_2 )? ) ;
    public final void rule__Conclusion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3513:1: ( ( ( rule__Conclusion__TerminationAssignment_2 )? ) )
            // InternalAdaptSem.g:3514:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            {
            // InternalAdaptSem.g:3514:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            // InternalAdaptSem.g:3515:2: ( rule__Conclusion__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationAssignment_2()); 
            }
            // InternalAdaptSem.g:3516:2: ( rule__Conclusion__TerminationAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdaptSem.g:3516:3: rule__Conclusion__TerminationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conclusion__TerminationAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getTerminationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__2__Impl"


    // $ANTLR start "rule__Conclusion__Group__3"
    // InternalAdaptSem.g:3524:1: rule__Conclusion__Group__3 : rule__Conclusion__Group__3__Impl ;
    public final void rule__Conclusion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3528:1: ( rule__Conclusion__Group__3__Impl )
            // InternalAdaptSem.g:3529:2: rule__Conclusion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__3"


    // $ANTLR start "rule__Conclusion__Group__3__Impl"
    // InternalAdaptSem.g:3535:1: rule__Conclusion__Group__3__Impl : ( ( rule__Conclusion__ToAssignment_3 ) ) ;
    public final void rule__Conclusion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3539:1: ( ( ( rule__Conclusion__ToAssignment_3 ) ) )
            // InternalAdaptSem.g:3540:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            {
            // InternalAdaptSem.g:3540:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            // InternalAdaptSem.g:3541:2: ( rule__Conclusion__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getToAssignment_3()); 
            }
            // InternalAdaptSem.g:3542:2: ( rule__Conclusion__ToAssignment_3 )
            // InternalAdaptSem.g:3542:3: rule__Conclusion__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__ToAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getToAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__3__Impl"


    // $ANTLR start "rule__Premise__Group__0"
    // InternalAdaptSem.g:3551:1: rule__Premise__Group__0 : rule__Premise__Group__0__Impl rule__Premise__Group__1 ;
    public final void rule__Premise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3555:1: ( rule__Premise__Group__0__Impl rule__Premise__Group__1 )
            // InternalAdaptSem.g:3556:2: rule__Premise__Group__0__Impl rule__Premise__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Premise__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Premise__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__0"


    // $ANTLR start "rule__Premise__Group__0__Impl"
    // InternalAdaptSem.g:3563:1: rule__Premise__Group__0__Impl : ( ( rule__Premise__FromAssignment_0 ) ) ;
    public final void rule__Premise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3567:1: ( ( ( rule__Premise__FromAssignment_0 ) ) )
            // InternalAdaptSem.g:3568:1: ( ( rule__Premise__FromAssignment_0 ) )
            {
            // InternalAdaptSem.g:3568:1: ( ( rule__Premise__FromAssignment_0 ) )
            // InternalAdaptSem.g:3569:2: ( rule__Premise__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getFromAssignment_0()); 
            }
            // InternalAdaptSem.g:3570:2: ( rule__Premise__FromAssignment_0 )
            // InternalAdaptSem.g:3570:3: rule__Premise__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Premise__FromAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getFromAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__0__Impl"


    // $ANTLR start "rule__Premise__Group__1"
    // InternalAdaptSem.g:3578:1: rule__Premise__Group__1 : rule__Premise__Group__1__Impl rule__Premise__Group__2 ;
    public final void rule__Premise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3582:1: ( rule__Premise__Group__1__Impl rule__Premise__Group__2 )
            // InternalAdaptSem.g:3583:2: rule__Premise__Group__1__Impl rule__Premise__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Premise__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Premise__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__1"


    // $ANTLR start "rule__Premise__Group__1__Impl"
    // InternalAdaptSem.g:3590:1: rule__Premise__Group__1__Impl : ( '->' ) ;
    public final void rule__Premise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3594:1: ( ( '->' ) )
            // InternalAdaptSem.g:3595:1: ( '->' )
            {
            // InternalAdaptSem.g:3595:1: ( '->' )
            // InternalAdaptSem.g:3596:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__1__Impl"


    // $ANTLR start "rule__Premise__Group__2"
    // InternalAdaptSem.g:3605:1: rule__Premise__Group__2 : rule__Premise__Group__2__Impl rule__Premise__Group__3 ;
    public final void rule__Premise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3609:1: ( rule__Premise__Group__2__Impl rule__Premise__Group__3 )
            // InternalAdaptSem.g:3610:2: rule__Premise__Group__2__Impl rule__Premise__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Premise__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Premise__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__2"


    // $ANTLR start "rule__Premise__Group__2__Impl"
    // InternalAdaptSem.g:3617:1: rule__Premise__Group__2__Impl : ( ( rule__Premise__TerminationAssignment_2 )? ) ;
    public final void rule__Premise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3621:1: ( ( ( rule__Premise__TerminationAssignment_2 )? ) )
            // InternalAdaptSem.g:3622:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            {
            // InternalAdaptSem.g:3622:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            // InternalAdaptSem.g:3623:2: ( rule__Premise__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationAssignment_2()); 
            }
            // InternalAdaptSem.g:3624:2: ( rule__Premise__TerminationAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdaptSem.g:3624:3: rule__Premise__TerminationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Premise__TerminationAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getTerminationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__2__Impl"


    // $ANTLR start "rule__Premise__Group__3"
    // InternalAdaptSem.g:3632:1: rule__Premise__Group__3 : rule__Premise__Group__3__Impl ;
    public final void rule__Premise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3636:1: ( rule__Premise__Group__3__Impl )
            // InternalAdaptSem.g:3637:2: rule__Premise__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Premise__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__3"


    // $ANTLR start "rule__Premise__Group__3__Impl"
    // InternalAdaptSem.g:3643:1: rule__Premise__Group__3__Impl : ( ( rule__Premise__ToAssignment_3 ) ) ;
    public final void rule__Premise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3647:1: ( ( ( rule__Premise__ToAssignment_3 ) ) )
            // InternalAdaptSem.g:3648:1: ( ( rule__Premise__ToAssignment_3 ) )
            {
            // InternalAdaptSem.g:3648:1: ( ( rule__Premise__ToAssignment_3 ) )
            // InternalAdaptSem.g:3649:2: ( rule__Premise__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getToAssignment_3()); 
            }
            // InternalAdaptSem.g:3650:2: ( rule__Premise__ToAssignment_3 )
            // InternalAdaptSem.g:3650:3: rule__Premise__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Premise__ToAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getToAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__Group__3__Impl"


    // $ANTLR start "rule__DefConfiguration__Group__0"
    // InternalAdaptSem.g:3659:1: rule__DefConfiguration__Group__0 : rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 ;
    public final void rule__DefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3663:1: ( rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 )
            // InternalAdaptSem.g:3664:2: rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DefConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__0"


    // $ANTLR start "rule__DefConfiguration__Group__0__Impl"
    // InternalAdaptSem.g:3671:1: rule__DefConfiguration__Group__0__Impl : ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__DefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3675:1: ( ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) )
            // InternalAdaptSem.g:3676:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalAdaptSem.g:3676:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            // InternalAdaptSem.g:3677:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalAdaptSem.g:3678:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            // InternalAdaptSem.g:3678:3: rule__DefConfiguration__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__ConceptAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getConceptAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__0__Impl"


    // $ANTLR start "rule__DefConfiguration__Group__1"
    // InternalAdaptSem.g:3686:1: rule__DefConfiguration__Group__1 : rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 ;
    public final void rule__DefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3690:1: ( rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 )
            // InternalAdaptSem.g:3691:2: rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__DefConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__1"


    // $ANTLR start "rule__DefConfiguration__Group__1__Impl"
    // InternalAdaptSem.g:3698:1: rule__DefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__DefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3702:1: ( ( '(' ) )
            // InternalAdaptSem.g:3703:1: ( '(' )
            {
            // InternalAdaptSem.g:3703:1: ( '(' )
            // InternalAdaptSem.g:3704:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__1__Impl"


    // $ANTLR start "rule__DefConfiguration__Group__2"
    // InternalAdaptSem.g:3713:1: rule__DefConfiguration__Group__2 : rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 ;
    public final void rule__DefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3717:1: ( rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 )
            // InternalAdaptSem.g:3718:2: rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__DefConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__2"


    // $ANTLR start "rule__DefConfiguration__Group__2__Impl"
    // InternalAdaptSem.g:3725:1: rule__DefConfiguration__Group__2__Impl : ( ( rule__DefConfiguration__Group_2__0 )? ) ;
    public final void rule__DefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3729:1: ( ( ( rule__DefConfiguration__Group_2__0 )? ) )
            // InternalAdaptSem.g:3730:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            {
            // InternalAdaptSem.g:3730:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            // InternalAdaptSem.g:3731:2: ( rule__DefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:3732:2: ( rule__DefConfiguration__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==30||LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAdaptSem.g:3732:3: rule__DefConfiguration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefConfiguration__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__2__Impl"


    // $ANTLR start "rule__DefConfiguration__Group__3"
    // InternalAdaptSem.g:3740:1: rule__DefConfiguration__Group__3 : rule__DefConfiguration__Group__3__Impl ;
    public final void rule__DefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3744:1: ( rule__DefConfiguration__Group__3__Impl )
            // InternalAdaptSem.g:3745:2: rule__DefConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__3"


    // $ANTLR start "rule__DefConfiguration__Group__3__Impl"
    // InternalAdaptSem.g:3751:1: rule__DefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__DefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3755:1: ( ( ')' ) )
            // InternalAdaptSem.g:3756:1: ( ')' )
            {
            // InternalAdaptSem.g:3756:1: ( ')' )
            // InternalAdaptSem.g:3757:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__3__Impl"


    // $ANTLR start "rule__DefConfiguration__Group_2__0"
    // InternalAdaptSem.g:3767:1: rule__DefConfiguration__Group_2__0 : rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 ;
    public final void rule__DefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3771:1: ( rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 )
            // InternalAdaptSem.g:3772:2: rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__DefConfiguration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2__0"


    // $ANTLR start "rule__DefConfiguration__Group_2__0__Impl"
    // InternalAdaptSem.g:3779:1: rule__DefConfiguration__Group_2__0__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__DefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3783:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:3784:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:3784:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            // InternalAdaptSem.g:3785:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:3786:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            // InternalAdaptSem.g:3786:3: rule__DefConfiguration__ChildsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__ChildsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2__0__Impl"


    // $ANTLR start "rule__DefConfiguration__Group_2__1"
    // InternalAdaptSem.g:3794:1: rule__DefConfiguration__Group_2__1 : rule__DefConfiguration__Group_2__1__Impl ;
    public final void rule__DefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3798:1: ( rule__DefConfiguration__Group_2__1__Impl )
            // InternalAdaptSem.g:3799:2: rule__DefConfiguration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2__1"


    // $ANTLR start "rule__DefConfiguration__Group_2__1__Impl"
    // InternalAdaptSem.g:3805:1: rule__DefConfiguration__Group_2__1__Impl : ( ( rule__DefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__DefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3809:1: ( ( ( rule__DefConfiguration__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:3810:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:3810:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            // InternalAdaptSem.g:3811:2: ( rule__DefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:3812:2: ( rule__DefConfiguration__Group_2_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==18) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAdaptSem.g:3812:3: rule__DefConfiguration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DefConfiguration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2__1__Impl"


    // $ANTLR start "rule__DefConfiguration__Group_2_1__0"
    // InternalAdaptSem.g:3821:1: rule__DefConfiguration__Group_2_1__0 : rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 ;
    public final void rule__DefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3825:1: ( rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 )
            // InternalAdaptSem.g:3826:2: rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1
            {
            pushFollow(FOLLOW_27);
            rule__DefConfiguration__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2_1__0"


    // $ANTLR start "rule__DefConfiguration__Group_2_1__0__Impl"
    // InternalAdaptSem.g:3833:1: rule__DefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3837:1: ( ( ',' ) )
            // InternalAdaptSem.g:3838:1: ( ',' )
            {
            // InternalAdaptSem.g:3838:1: ( ',' )
            // InternalAdaptSem.g:3839:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2_1__0__Impl"


    // $ANTLR start "rule__DefConfiguration__Group_2_1__1"
    // InternalAdaptSem.g:3848:1: rule__DefConfiguration__Group_2_1__1 : rule__DefConfiguration__Group_2_1__1__Impl ;
    public final void rule__DefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3852:1: ( rule__DefConfiguration__Group_2_1__1__Impl )
            // InternalAdaptSem.g:3853:2: rule__DefConfiguration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2_1__1"


    // $ANTLR start "rule__DefConfiguration__Group_2_1__1__Impl"
    // InternalAdaptSem.g:3859:1: rule__DefConfiguration__Group_2_1__1__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__DefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3863:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:3864:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:3864:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:3865:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:3866:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            // InternalAdaptSem.g:3866:3: rule__DefConfiguration__ChildsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__ChildsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_2_1__1__Impl"


    // $ANTLR start "rule__RefConfiguration__Group__0"
    // InternalAdaptSem.g:3875:1: rule__RefConfiguration__Group__0 : rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 ;
    public final void rule__RefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3879:1: ( rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 )
            // InternalAdaptSem.g:3880:2: rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RefConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__0"


    // $ANTLR start "rule__RefConfiguration__Group__0__Impl"
    // InternalAdaptSem.g:3887:1: rule__RefConfiguration__Group__0__Impl : ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__RefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3891:1: ( ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) )
            // InternalAdaptSem.g:3892:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalAdaptSem.g:3892:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            // InternalAdaptSem.g:3893:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalAdaptSem.g:3894:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            // InternalAdaptSem.g:3894:3: rule__RefConfiguration__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__ConceptAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getConceptAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__0__Impl"


    // $ANTLR start "rule__RefConfiguration__Group__1"
    // InternalAdaptSem.g:3902:1: rule__RefConfiguration__Group__1 : rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 ;
    public final void rule__RefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3906:1: ( rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 )
            // InternalAdaptSem.g:3907:2: rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__RefConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__1"


    // $ANTLR start "rule__RefConfiguration__Group__1__Impl"
    // InternalAdaptSem.g:3914:1: rule__RefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__RefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3918:1: ( ( '(' ) )
            // InternalAdaptSem.g:3919:1: ( '(' )
            {
            // InternalAdaptSem.g:3919:1: ( '(' )
            // InternalAdaptSem.g:3920:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__1__Impl"


    // $ANTLR start "rule__RefConfiguration__Group__2"
    // InternalAdaptSem.g:3929:1: rule__RefConfiguration__Group__2 : rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 ;
    public final void rule__RefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3933:1: ( rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 )
            // InternalAdaptSem.g:3934:2: rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__RefConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__2"


    // $ANTLR start "rule__RefConfiguration__Group__2__Impl"
    // InternalAdaptSem.g:3941:1: rule__RefConfiguration__Group__2__Impl : ( ( rule__RefConfiguration__Group_2__0 )? ) ;
    public final void rule__RefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3945:1: ( ( ( rule__RefConfiguration__Group_2__0 )? ) )
            // InternalAdaptSem.g:3946:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            {
            // InternalAdaptSem.g:3946:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            // InternalAdaptSem.g:3947:2: ( rule__RefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:3948:2: ( rule__RefConfiguration__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==30||LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAdaptSem.g:3948:3: rule__RefConfiguration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefConfiguration__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__2__Impl"


    // $ANTLR start "rule__RefConfiguration__Group__3"
    // InternalAdaptSem.g:3956:1: rule__RefConfiguration__Group__3 : rule__RefConfiguration__Group__3__Impl ;
    public final void rule__RefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3960:1: ( rule__RefConfiguration__Group__3__Impl )
            // InternalAdaptSem.g:3961:2: rule__RefConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__3"


    // $ANTLR start "rule__RefConfiguration__Group__3__Impl"
    // InternalAdaptSem.g:3967:1: rule__RefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__RefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3971:1: ( ( ')' ) )
            // InternalAdaptSem.g:3972:1: ( ')' )
            {
            // InternalAdaptSem.g:3972:1: ( ')' )
            // InternalAdaptSem.g:3973:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group__3__Impl"


    // $ANTLR start "rule__RefConfiguration__Group_2__0"
    // InternalAdaptSem.g:3983:1: rule__RefConfiguration__Group_2__0 : rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 ;
    public final void rule__RefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3987:1: ( rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 )
            // InternalAdaptSem.g:3988:2: rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__RefConfiguration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2__0"


    // $ANTLR start "rule__RefConfiguration__Group_2__0__Impl"
    // InternalAdaptSem.g:3995:1: rule__RefConfiguration__Group_2__0__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__RefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3999:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:4000:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:4000:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            // InternalAdaptSem.g:4001:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:4002:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            // InternalAdaptSem.g:4002:3: rule__RefConfiguration__ChildsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__ChildsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2__0__Impl"


    // $ANTLR start "rule__RefConfiguration__Group_2__1"
    // InternalAdaptSem.g:4010:1: rule__RefConfiguration__Group_2__1 : rule__RefConfiguration__Group_2__1__Impl ;
    public final void rule__RefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4014:1: ( rule__RefConfiguration__Group_2__1__Impl )
            // InternalAdaptSem.g:4015:2: rule__RefConfiguration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2__1"


    // $ANTLR start "rule__RefConfiguration__Group_2__1__Impl"
    // InternalAdaptSem.g:4021:1: rule__RefConfiguration__Group_2__1__Impl : ( ( rule__RefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__RefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4025:1: ( ( ( rule__RefConfiguration__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:4026:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:4026:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            // InternalAdaptSem.g:4027:2: ( rule__RefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:4028:2: ( rule__RefConfiguration__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==18) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAdaptSem.g:4028:3: rule__RefConfiguration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RefConfiguration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2__1__Impl"


    // $ANTLR start "rule__RefConfiguration__Group_2_1__0"
    // InternalAdaptSem.g:4037:1: rule__RefConfiguration__Group_2_1__0 : rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 ;
    public final void rule__RefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4041:1: ( rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 )
            // InternalAdaptSem.g:4042:2: rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__RefConfiguration__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2_1__0"


    // $ANTLR start "rule__RefConfiguration__Group_2_1__0__Impl"
    // InternalAdaptSem.g:4049:1: rule__RefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__RefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4053:1: ( ( ',' ) )
            // InternalAdaptSem.g:4054:1: ( ',' )
            {
            // InternalAdaptSem.g:4054:1: ( ',' )
            // InternalAdaptSem.g:4055:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2_1__0__Impl"


    // $ANTLR start "rule__RefConfiguration__Group_2_1__1"
    // InternalAdaptSem.g:4064:1: rule__RefConfiguration__Group_2_1__1 : rule__RefConfiguration__Group_2_1__1__Impl ;
    public final void rule__RefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4068:1: ( rule__RefConfiguration__Group_2_1__1__Impl )
            // InternalAdaptSem.g:4069:2: rule__RefConfiguration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2_1__1"


    // $ANTLR start "rule__RefConfiguration__Group_2_1__1__Impl"
    // InternalAdaptSem.g:4075:1: rule__RefConfiguration__Group_2_1__1__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__RefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4079:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:4080:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:4080:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:4081:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:4082:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            // InternalAdaptSem.g:4082:3: rule__RefConfiguration__ChildsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RefConfiguration__ChildsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__Group_2_1__1__Impl"


    // $ANTLR start "rule__SymbolDef__Group__0"
    // InternalAdaptSem.g:4091:1: rule__SymbolDef__Group__0 : rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 ;
    public final void rule__SymbolDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4095:1: ( rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 )
            // InternalAdaptSem.g:4096:2: rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SymbolDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SymbolDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolDef__Group__0"


    // $ANTLR start "rule__SymbolDef__Group__0__Impl"
    // InternalAdaptSem.g:4103:1: rule__SymbolDef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4107:1: ( ( () ) )
            // InternalAdaptSem.g:4108:1: ( () )
            {
            // InternalAdaptSem.g:4108:1: ( () )
            // InternalAdaptSem.g:4109:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getSymbolDefAction_0()); 
            }
            // InternalAdaptSem.g:4110:2: ()
            // InternalAdaptSem.g:4110:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolDefAccess().getSymbolDefAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolDef__Group__0__Impl"


    // $ANTLR start "rule__SymbolDef__Group__1"
    // InternalAdaptSem.g:4118:1: rule__SymbolDef__Group__1 : rule__SymbolDef__Group__1__Impl ;
    public final void rule__SymbolDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4122:1: ( rule__SymbolDef__Group__1__Impl )
            // InternalAdaptSem.g:4123:2: rule__SymbolDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SymbolDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolDef__Group__1"


    // $ANTLR start "rule__SymbolDef__Group__1__Impl"
    // InternalAdaptSem.g:4129:1: rule__SymbolDef__Group__1__Impl : ( ( rule__SymbolDef__NameAssignment_1 ) ) ;
    public final void rule__SymbolDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4133:1: ( ( ( rule__SymbolDef__NameAssignment_1 ) ) )
            // InternalAdaptSem.g:4134:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            {
            // InternalAdaptSem.g:4134:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            // InternalAdaptSem.g:4135:2: ( rule__SymbolDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getNameAssignment_1()); 
            }
            // InternalAdaptSem.g:4136:2: ( rule__SymbolDef__NameAssignment_1 )
            // InternalAdaptSem.g:4136:3: rule__SymbolDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SymbolDef__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolDefAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolDef__Group__1__Impl"


    // $ANTLR start "rule__SymbolRef__Group__0"
    // InternalAdaptSem.g:4145:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4149:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // InternalAdaptSem.g:4150:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SymbolRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SymbolRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolRef__Group__0"


    // $ANTLR start "rule__SymbolRef__Group__0__Impl"
    // InternalAdaptSem.g:4157:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4161:1: ( ( () ) )
            // InternalAdaptSem.g:4162:1: ( () )
            {
            // InternalAdaptSem.g:4162:1: ( () )
            // InternalAdaptSem.g:4163:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            }
            // InternalAdaptSem.g:4164:2: ()
            // InternalAdaptSem.g:4164:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolRef__Group__0__Impl"


    // $ANTLR start "rule__SymbolRef__Group__1"
    // InternalAdaptSem.g:4172:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4176:1: ( rule__SymbolRef__Group__1__Impl )
            // InternalAdaptSem.g:4177:2: rule__SymbolRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SymbolRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolRef__Group__1"


    // $ANTLR start "rule__SymbolRef__Group__1__Impl"
    // InternalAdaptSem.g:4183:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__DefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4187:1: ( ( ( rule__SymbolRef__DefAssignment_1 ) ) )
            // InternalAdaptSem.g:4188:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            {
            // InternalAdaptSem.g:4188:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            // InternalAdaptSem.g:4189:2: ( rule__SymbolRef__DefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefAssignment_1()); 
            }
            // InternalAdaptSem.g:4190:2: ( rule__SymbolRef__DefAssignment_1 )
            // InternalAdaptSem.g:4190:3: rule__SymbolRef__DefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SymbolRef__DefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRefAccess().getDefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolRef__Group__1__Impl"


    // $ANTLR start "rule__ListDef__Group__0"
    // InternalAdaptSem.g:4199:1: rule__ListDef__Group__0 : rule__ListDef__Group__0__Impl rule__ListDef__Group__1 ;
    public final void rule__ListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4203:1: ( rule__ListDef__Group__0__Impl rule__ListDef__Group__1 )
            // InternalAdaptSem.g:4204:2: rule__ListDef__Group__0__Impl rule__ListDef__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ListDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__0"


    // $ANTLR start "rule__ListDef__Group__0__Impl"
    // InternalAdaptSem.g:4211:1: rule__ListDef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4215:1: ( ( '[' ) )
            // InternalAdaptSem.g:4216:1: ( '[' )
            {
            // InternalAdaptSem.g:4216:1: ( '[' )
            // InternalAdaptSem.g:4217:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__0__Impl"


    // $ANTLR start "rule__ListDef__Group__1"
    // InternalAdaptSem.g:4226:1: rule__ListDef__Group__1 : rule__ListDef__Group__1__Impl rule__ListDef__Group__2 ;
    public final void rule__ListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4230:1: ( rule__ListDef__Group__1__Impl rule__ListDef__Group__2 )
            // InternalAdaptSem.g:4231:2: rule__ListDef__Group__1__Impl rule__ListDef__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ListDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__1"


    // $ANTLR start "rule__ListDef__Group__1__Impl"
    // InternalAdaptSem.g:4238:1: rule__ListDef__Group__1__Impl : ( ( rule__ListDef__HeadAssignment_1 ) ) ;
    public final void rule__ListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4242:1: ( ( ( rule__ListDef__HeadAssignment_1 ) ) )
            // InternalAdaptSem.g:4243:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            {
            // InternalAdaptSem.g:4243:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            // InternalAdaptSem.g:4244:2: ( rule__ListDef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getHeadAssignment_1()); 
            }
            // InternalAdaptSem.g:4245:2: ( rule__ListDef__HeadAssignment_1 )
            // InternalAdaptSem.g:4245:3: rule__ListDef__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__HeadAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getHeadAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__1__Impl"


    // $ANTLR start "rule__ListDef__Group__2"
    // InternalAdaptSem.g:4253:1: rule__ListDef__Group__2 : rule__ListDef__Group__2__Impl rule__ListDef__Group__3 ;
    public final void rule__ListDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4257:1: ( rule__ListDef__Group__2__Impl rule__ListDef__Group__3 )
            // InternalAdaptSem.g:4258:2: rule__ListDef__Group__2__Impl rule__ListDef__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ListDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__2"


    // $ANTLR start "rule__ListDef__Group__2__Impl"
    // InternalAdaptSem.g:4265:1: rule__ListDef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4269:1: ( ( '|' ) )
            // InternalAdaptSem.g:4270:1: ( '|' )
            {
            // InternalAdaptSem.g:4270:1: ( '|' )
            // InternalAdaptSem.g:4271:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getVerticalLineKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__2__Impl"


    // $ANTLR start "rule__ListDef__Group__3"
    // InternalAdaptSem.g:4280:1: rule__ListDef__Group__3 : rule__ListDef__Group__3__Impl rule__ListDef__Group__4 ;
    public final void rule__ListDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4284:1: ( rule__ListDef__Group__3__Impl rule__ListDef__Group__4 )
            // InternalAdaptSem.g:4285:2: rule__ListDef__Group__3__Impl rule__ListDef__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ListDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__3"


    // $ANTLR start "rule__ListDef__Group__3__Impl"
    // InternalAdaptSem.g:4292:1: rule__ListDef__Group__3__Impl : ( ( rule__ListDef__TailAssignment_3 ) ) ;
    public final void rule__ListDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4296:1: ( ( ( rule__ListDef__TailAssignment_3 ) ) )
            // InternalAdaptSem.g:4297:1: ( ( rule__ListDef__TailAssignment_3 ) )
            {
            // InternalAdaptSem.g:4297:1: ( ( rule__ListDef__TailAssignment_3 ) )
            // InternalAdaptSem.g:4298:2: ( rule__ListDef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTailAssignment_3()); 
            }
            // InternalAdaptSem.g:4299:2: ( rule__ListDef__TailAssignment_3 )
            // InternalAdaptSem.g:4299:3: rule__ListDef__TailAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__TailAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getTailAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__3__Impl"


    // $ANTLR start "rule__ListDef__Group__4"
    // InternalAdaptSem.g:4307:1: rule__ListDef__Group__4 : rule__ListDef__Group__4__Impl ;
    public final void rule__ListDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4311:1: ( rule__ListDef__Group__4__Impl )
            // InternalAdaptSem.g:4312:2: rule__ListDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__4"


    // $ANTLR start "rule__ListDef__Group__4__Impl"
    // InternalAdaptSem.g:4318:1: rule__ListDef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4322:1: ( ( ']' ) )
            // InternalAdaptSem.g:4323:1: ( ']' )
            {
            // InternalAdaptSem.g:4323:1: ( ']' )
            // InternalAdaptSem.g:4324:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__4__Impl"


    // $ANTLR start "rule__ListRef__Group__0"
    // InternalAdaptSem.g:4334:1: rule__ListRef__Group__0 : rule__ListRef__Group__0__Impl rule__ListRef__Group__1 ;
    public final void rule__ListRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4338:1: ( rule__ListRef__Group__0__Impl rule__ListRef__Group__1 )
            // InternalAdaptSem.g:4339:2: rule__ListRef__Group__0__Impl rule__ListRef__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ListRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__0"


    // $ANTLR start "rule__ListRef__Group__0__Impl"
    // InternalAdaptSem.g:4346:1: rule__ListRef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4350:1: ( ( '[' ) )
            // InternalAdaptSem.g:4351:1: ( '[' )
            {
            // InternalAdaptSem.g:4351:1: ( '[' )
            // InternalAdaptSem.g:4352:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__0__Impl"


    // $ANTLR start "rule__ListRef__Group__1"
    // InternalAdaptSem.g:4361:1: rule__ListRef__Group__1 : rule__ListRef__Group__1__Impl rule__ListRef__Group__2 ;
    public final void rule__ListRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4365:1: ( rule__ListRef__Group__1__Impl rule__ListRef__Group__2 )
            // InternalAdaptSem.g:4366:2: rule__ListRef__Group__1__Impl rule__ListRef__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ListRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__1"


    // $ANTLR start "rule__ListRef__Group__1__Impl"
    // InternalAdaptSem.g:4373:1: rule__ListRef__Group__1__Impl : ( ( rule__ListRef__HeadAssignment_1 ) ) ;
    public final void rule__ListRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4377:1: ( ( ( rule__ListRef__HeadAssignment_1 ) ) )
            // InternalAdaptSem.g:4378:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            {
            // InternalAdaptSem.g:4378:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            // InternalAdaptSem.g:4379:2: ( rule__ListRef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getHeadAssignment_1()); 
            }
            // InternalAdaptSem.g:4380:2: ( rule__ListRef__HeadAssignment_1 )
            // InternalAdaptSem.g:4380:3: rule__ListRef__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListRef__HeadAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getHeadAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__1__Impl"


    // $ANTLR start "rule__ListRef__Group__2"
    // InternalAdaptSem.g:4388:1: rule__ListRef__Group__2 : rule__ListRef__Group__2__Impl rule__ListRef__Group__3 ;
    public final void rule__ListRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4392:1: ( rule__ListRef__Group__2__Impl rule__ListRef__Group__3 )
            // InternalAdaptSem.g:4393:2: rule__ListRef__Group__2__Impl rule__ListRef__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ListRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListRef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__2"


    // $ANTLR start "rule__ListRef__Group__2__Impl"
    // InternalAdaptSem.g:4400:1: rule__ListRef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4404:1: ( ( '|' ) )
            // InternalAdaptSem.g:4405:1: ( '|' )
            {
            // InternalAdaptSem.g:4405:1: ( '|' )
            // InternalAdaptSem.g:4406:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getVerticalLineKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__2__Impl"


    // $ANTLR start "rule__ListRef__Group__3"
    // InternalAdaptSem.g:4415:1: rule__ListRef__Group__3 : rule__ListRef__Group__3__Impl rule__ListRef__Group__4 ;
    public final void rule__ListRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4419:1: ( rule__ListRef__Group__3__Impl rule__ListRef__Group__4 )
            // InternalAdaptSem.g:4420:2: rule__ListRef__Group__3__Impl rule__ListRef__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ListRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListRef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__3"


    // $ANTLR start "rule__ListRef__Group__3__Impl"
    // InternalAdaptSem.g:4427:1: rule__ListRef__Group__3__Impl : ( ( rule__ListRef__TailAssignment_3 ) ) ;
    public final void rule__ListRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4431:1: ( ( ( rule__ListRef__TailAssignment_3 ) ) )
            // InternalAdaptSem.g:4432:1: ( ( rule__ListRef__TailAssignment_3 ) )
            {
            // InternalAdaptSem.g:4432:1: ( ( rule__ListRef__TailAssignment_3 ) )
            // InternalAdaptSem.g:4433:2: ( rule__ListRef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getTailAssignment_3()); 
            }
            // InternalAdaptSem.g:4434:2: ( rule__ListRef__TailAssignment_3 )
            // InternalAdaptSem.g:4434:3: rule__ListRef__TailAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListRef__TailAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getTailAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__3__Impl"


    // $ANTLR start "rule__ListRef__Group__4"
    // InternalAdaptSem.g:4442:1: rule__ListRef__Group__4 : rule__ListRef__Group__4__Impl ;
    public final void rule__ListRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4446:1: ( rule__ListRef__Group__4__Impl )
            // InternalAdaptSem.g:4447:2: rule__ListRef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__4"


    // $ANTLR start "rule__ListRef__Group__4__Impl"
    // InternalAdaptSem.g:4453:1: rule__ListRef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4457:1: ( ( ']' ) )
            // InternalAdaptSem.g:4458:1: ( ']' )
            {
            // InternalAdaptSem.g:4458:1: ( ']' )
            // InternalAdaptSem.g:4459:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__Group__4__Impl"


    // $ANTLR start "rule__VoidList__Group__0"
    // InternalAdaptSem.g:4469:1: rule__VoidList__Group__0 : rule__VoidList__Group__0__Impl rule__VoidList__Group__1 ;
    public final void rule__VoidList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4473:1: ( rule__VoidList__Group__0__Impl rule__VoidList__Group__1 )
            // InternalAdaptSem.g:4474:2: rule__VoidList__Group__0__Impl rule__VoidList__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__VoidList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VoidList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidList__Group__0"


    // $ANTLR start "rule__VoidList__Group__0__Impl"
    // InternalAdaptSem.g:4481:1: rule__VoidList__Group__0__Impl : ( () ) ;
    public final void rule__VoidList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4485:1: ( ( () ) )
            // InternalAdaptSem.g:4486:1: ( () )
            {
            // InternalAdaptSem.g:4486:1: ( () )
            // InternalAdaptSem.g:4487:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getVoidListAction_0()); 
            }
            // InternalAdaptSem.g:4488:2: ()
            // InternalAdaptSem.g:4488:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidListAccess().getVoidListAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidList__Group__0__Impl"


    // $ANTLR start "rule__VoidList__Group__1"
    // InternalAdaptSem.g:4496:1: rule__VoidList__Group__1 : rule__VoidList__Group__1__Impl ;
    public final void rule__VoidList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4500:1: ( rule__VoidList__Group__1__Impl )
            // InternalAdaptSem.g:4501:2: rule__VoidList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidList__Group__1"


    // $ANTLR start "rule__VoidList__Group__1__Impl"
    // InternalAdaptSem.g:4507:1: rule__VoidList__Group__1__Impl : ( '[]' ) ;
    public final void rule__VoidList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4511:1: ( ( '[]' ) )
            // InternalAdaptSem.g:4512:1: ( '[]' )
            {
            // InternalAdaptSem.g:4512:1: ( '[]' )
            // InternalAdaptSem.g:4513:2: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoidListAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidList__Group__1__Impl"


    // $ANTLR start "rule__CondNot__Group__0"
    // InternalAdaptSem.g:4523:1: rule__CondNot__Group__0 : rule__CondNot__Group__0__Impl rule__CondNot__Group__1 ;
    public final void rule__CondNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4527:1: ( rule__CondNot__Group__0__Impl rule__CondNot__Group__1 )
            // InternalAdaptSem.g:4528:2: rule__CondNot__Group__0__Impl rule__CondNot__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CondNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondNot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__Group__0"


    // $ANTLR start "rule__CondNot__Group__0__Impl"
    // InternalAdaptSem.g:4535:1: rule__CondNot__Group__0__Impl : ( () ) ;
    public final void rule__CondNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4539:1: ( ( () ) )
            // InternalAdaptSem.g:4540:1: ( () )
            {
            // InternalAdaptSem.g:4540:1: ( () )
            // InternalAdaptSem.g:4541:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getNotAction_0()); 
            }
            // InternalAdaptSem.g:4542:2: ()
            // InternalAdaptSem.g:4542:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondNotAccess().getNotAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__Group__0__Impl"


    // $ANTLR start "rule__CondNot__Group__1"
    // InternalAdaptSem.g:4550:1: rule__CondNot__Group__1 : rule__CondNot__Group__1__Impl rule__CondNot__Group__2 ;
    public final void rule__CondNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4554:1: ( rule__CondNot__Group__1__Impl rule__CondNot__Group__2 )
            // InternalAdaptSem.g:4555:2: rule__CondNot__Group__1__Impl rule__CondNot__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CondNot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondNot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__Group__1"


    // $ANTLR start "rule__CondNot__Group__1__Impl"
    // InternalAdaptSem.g:4562:1: rule__CondNot__Group__1__Impl : ( '!' ) ;
    public final void rule__CondNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4566:1: ( ( '!' ) )
            // InternalAdaptSem.g:4567:1: ( '!' )
            {
            // InternalAdaptSem.g:4567:1: ( '!' )
            // InternalAdaptSem.g:4568:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__Group__1__Impl"


    // $ANTLR start "rule__CondNot__Group__2"
    // InternalAdaptSem.g:4577:1: rule__CondNot__Group__2 : rule__CondNot__Group__2__Impl ;
    public final void rule__CondNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4581:1: ( rule__CondNot__Group__2__Impl )
            // InternalAdaptSem.g:4582:2: rule__CondNot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondNot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__Group__2"


    // $ANTLR start "rule__CondNot__Group__2__Impl"
    // InternalAdaptSem.g:4588:1: rule__CondNot__Group__2__Impl : ( ( rule__CondNot__ExprAssignment_2 ) ) ;
    public final void rule__CondNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4592:1: ( ( ( rule__CondNot__ExprAssignment_2 ) ) )
            // InternalAdaptSem.g:4593:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            {
            // InternalAdaptSem.g:4593:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            // InternalAdaptSem.g:4594:2: ( rule__CondNot__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExprAssignment_2()); 
            }
            // InternalAdaptSem.g:4595:2: ( rule__CondNot__ExprAssignment_2 )
            // InternalAdaptSem.g:4595:3: rule__CondNot__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CondNot__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondNotAccess().getExprAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__Group__2__Impl"


    // $ANTLR start "rule__CondOr__Group__0"
    // InternalAdaptSem.g:4604:1: rule__CondOr__Group__0 : rule__CondOr__Group__0__Impl rule__CondOr__Group__1 ;
    public final void rule__CondOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4608:1: ( rule__CondOr__Group__0__Impl rule__CondOr__Group__1 )
            // InternalAdaptSem.g:4609:2: rule__CondOr__Group__0__Impl rule__CondOr__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CondOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__0"


    // $ANTLR start "rule__CondOr__Group__0__Impl"
    // InternalAdaptSem.g:4616:1: rule__CondOr__Group__0__Impl : ( () ) ;
    public final void rule__CondOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4620:1: ( ( () ) )
            // InternalAdaptSem.g:4621:1: ( () )
            {
            // InternalAdaptSem.g:4621:1: ( () )
            // InternalAdaptSem.g:4622:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getOrAction_0()); 
            }
            // InternalAdaptSem.g:4623:2: ()
            // InternalAdaptSem.g:4623:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getOrAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__0__Impl"


    // $ANTLR start "rule__CondOr__Group__1"
    // InternalAdaptSem.g:4631:1: rule__CondOr__Group__1 : rule__CondOr__Group__1__Impl rule__CondOr__Group__2 ;
    public final void rule__CondOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4635:1: ( rule__CondOr__Group__1__Impl rule__CondOr__Group__2 )
            // InternalAdaptSem.g:4636:2: rule__CondOr__Group__1__Impl rule__CondOr__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__CondOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondOr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__1"


    // $ANTLR start "rule__CondOr__Group__1__Impl"
    // InternalAdaptSem.g:4643:1: rule__CondOr__Group__1__Impl : ( ( rule__CondOr__LhsAssignment_1 ) ) ;
    public final void rule__CondOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4647:1: ( ( ( rule__CondOr__LhsAssignment_1 ) ) )
            // InternalAdaptSem.g:4648:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            {
            // InternalAdaptSem.g:4648:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            // InternalAdaptSem.g:4649:2: ( rule__CondOr__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getLhsAssignment_1()); 
            }
            // InternalAdaptSem.g:4650:2: ( rule__CondOr__LhsAssignment_1 )
            // InternalAdaptSem.g:4650:3: rule__CondOr__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CondOr__LhsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getLhsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__1__Impl"


    // $ANTLR start "rule__CondOr__Group__2"
    // InternalAdaptSem.g:4658:1: rule__CondOr__Group__2 : rule__CondOr__Group__2__Impl rule__CondOr__Group__3 ;
    public final void rule__CondOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4662:1: ( rule__CondOr__Group__2__Impl rule__CondOr__Group__3 )
            // InternalAdaptSem.g:4663:2: rule__CondOr__Group__2__Impl rule__CondOr__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CondOr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondOr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__2"


    // $ANTLR start "rule__CondOr__Group__2__Impl"
    // InternalAdaptSem.g:4670:1: rule__CondOr__Group__2__Impl : ( '||' ) ;
    public final void rule__CondOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4674:1: ( ( '||' ) )
            // InternalAdaptSem.g:4675:1: ( '||' )
            {
            // InternalAdaptSem.g:4675:1: ( '||' )
            // InternalAdaptSem.g:4676:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__2__Impl"


    // $ANTLR start "rule__CondOr__Group__3"
    // InternalAdaptSem.g:4685:1: rule__CondOr__Group__3 : rule__CondOr__Group__3__Impl ;
    public final void rule__CondOr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4689:1: ( rule__CondOr__Group__3__Impl )
            // InternalAdaptSem.g:4690:2: rule__CondOr__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondOr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__3"


    // $ANTLR start "rule__CondOr__Group__3__Impl"
    // InternalAdaptSem.g:4696:1: rule__CondOr__Group__3__Impl : ( ( rule__CondOr__RhsAssignment_3 ) ) ;
    public final void rule__CondOr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4700:1: ( ( ( rule__CondOr__RhsAssignment_3 ) ) )
            // InternalAdaptSem.g:4701:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            {
            // InternalAdaptSem.g:4701:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            // InternalAdaptSem.g:4702:2: ( rule__CondOr__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getRhsAssignment_3()); 
            }
            // InternalAdaptSem.g:4703:2: ( rule__CondOr__RhsAssignment_3 )
            // InternalAdaptSem.g:4703:3: rule__CondOr__RhsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CondOr__RhsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getRhsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__Group__3__Impl"


    // $ANTLR start "rule__CondAnd__Group__0"
    // InternalAdaptSem.g:4712:1: rule__CondAnd__Group__0 : rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 ;
    public final void rule__CondAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4716:1: ( rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 )
            // InternalAdaptSem.g:4717:2: rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CondAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__0"


    // $ANTLR start "rule__CondAnd__Group__0__Impl"
    // InternalAdaptSem.g:4724:1: rule__CondAnd__Group__0__Impl : ( () ) ;
    public final void rule__CondAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4728:1: ( ( () ) )
            // InternalAdaptSem.g:4729:1: ( () )
            {
            // InternalAdaptSem.g:4729:1: ( () )
            // InternalAdaptSem.g:4730:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAndAction_0()); 
            }
            // InternalAdaptSem.g:4731:2: ()
            // InternalAdaptSem.g:4731:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getAndAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__0__Impl"


    // $ANTLR start "rule__CondAnd__Group__1"
    // InternalAdaptSem.g:4739:1: rule__CondAnd__Group__1 : rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 ;
    public final void rule__CondAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4743:1: ( rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 )
            // InternalAdaptSem.g:4744:2: rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__CondAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondAnd__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__1"


    // $ANTLR start "rule__CondAnd__Group__1__Impl"
    // InternalAdaptSem.g:4751:1: rule__CondAnd__Group__1__Impl : ( ( rule__CondAnd__LhsAssignment_1 ) ) ;
    public final void rule__CondAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4755:1: ( ( ( rule__CondAnd__LhsAssignment_1 ) ) )
            // InternalAdaptSem.g:4756:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            {
            // InternalAdaptSem.g:4756:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            // InternalAdaptSem.g:4757:2: ( rule__CondAnd__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getLhsAssignment_1()); 
            }
            // InternalAdaptSem.g:4758:2: ( rule__CondAnd__LhsAssignment_1 )
            // InternalAdaptSem.g:4758:3: rule__CondAnd__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CondAnd__LhsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getLhsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__1__Impl"


    // $ANTLR start "rule__CondAnd__Group__2"
    // InternalAdaptSem.g:4766:1: rule__CondAnd__Group__2 : rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 ;
    public final void rule__CondAnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4770:1: ( rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 )
            // InternalAdaptSem.g:4771:2: rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CondAnd__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondAnd__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__2"


    // $ANTLR start "rule__CondAnd__Group__2__Impl"
    // InternalAdaptSem.g:4778:1: rule__CondAnd__Group__2__Impl : ( '&&' ) ;
    public final void rule__CondAnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4782:1: ( ( '&&' ) )
            // InternalAdaptSem.g:4783:1: ( '&&' )
            {
            // InternalAdaptSem.g:4783:1: ( '&&' )
            // InternalAdaptSem.g:4784:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__2__Impl"


    // $ANTLR start "rule__CondAnd__Group__3"
    // InternalAdaptSem.g:4793:1: rule__CondAnd__Group__3 : rule__CondAnd__Group__3__Impl ;
    public final void rule__CondAnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4797:1: ( rule__CondAnd__Group__3__Impl )
            // InternalAdaptSem.g:4798:2: rule__CondAnd__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondAnd__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__3"


    // $ANTLR start "rule__CondAnd__Group__3__Impl"
    // InternalAdaptSem.g:4804:1: rule__CondAnd__Group__3__Impl : ( ( rule__CondAnd__RhsAssignment_3 ) ) ;
    public final void rule__CondAnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4808:1: ( ( ( rule__CondAnd__RhsAssignment_3 ) ) )
            // InternalAdaptSem.g:4809:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            {
            // InternalAdaptSem.g:4809:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            // InternalAdaptSem.g:4810:2: ( rule__CondAnd__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getRhsAssignment_3()); 
            }
            // InternalAdaptSem.g:4811:2: ( rule__CondAnd__RhsAssignment_3 )
            // InternalAdaptSem.g:4811:3: rule__CondAnd__RhsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CondAnd__RhsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getRhsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__Group__3__Impl"


    // $ANTLR start "rule__CondEquality__Group_0__0"
    // InternalAdaptSem.g:4820:1: rule__CondEquality__Group_0__0 : rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 ;
    public final void rule__CondEquality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4824:1: ( rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 )
            // InternalAdaptSem.g:4825:2: rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CondEquality__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__0"


    // $ANTLR start "rule__CondEquality__Group_0__0__Impl"
    // InternalAdaptSem.g:4832:1: rule__CondEquality__Group_0__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4836:1: ( ( () ) )
            // InternalAdaptSem.g:4837:1: ( () )
            {
            // InternalAdaptSem.g:4837:1: ( () )
            // InternalAdaptSem.g:4838:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualAction_0_0()); 
            }
            // InternalAdaptSem.g:4839:2: ()
            // InternalAdaptSem.g:4839:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getEqualAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__0__Impl"


    // $ANTLR start "rule__CondEquality__Group_0__1"
    // InternalAdaptSem.g:4847:1: rule__CondEquality__Group_0__1 : rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 ;
    public final void rule__CondEquality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4851:1: ( rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 )
            // InternalAdaptSem.g:4852:2: rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2
            {
            pushFollow(FOLLOW_33);
            rule__CondEquality__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__1"


    // $ANTLR start "rule__CondEquality__Group_0__1__Impl"
    // InternalAdaptSem.g:4859:1: rule__CondEquality__Group_0__1__Impl : ( ( rule__CondEquality__LhsAssignment_0_1 ) ) ;
    public final void rule__CondEquality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4863:1: ( ( ( rule__CondEquality__LhsAssignment_0_1 ) ) )
            // InternalAdaptSem.g:4864:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:4864:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            // InternalAdaptSem.g:4865:2: ( rule__CondEquality__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_0_1()); 
            }
            // InternalAdaptSem.g:4866:2: ( rule__CondEquality__LhsAssignment_0_1 )
            // InternalAdaptSem.g:4866:3: rule__CondEquality__LhsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__LhsAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getLhsAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__1__Impl"


    // $ANTLR start "rule__CondEquality__Group_0__2"
    // InternalAdaptSem.g:4874:1: rule__CondEquality__Group_0__2 : rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 ;
    public final void rule__CondEquality__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4878:1: ( rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 )
            // InternalAdaptSem.g:4879:2: rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__CondEquality__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__2"


    // $ANTLR start "rule__CondEquality__Group_0__2__Impl"
    // InternalAdaptSem.g:4886:1: rule__CondEquality__Group_0__2__Impl : ( '==' ) ;
    public final void rule__CondEquality__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4890:1: ( ( '==' ) )
            // InternalAdaptSem.g:4891:1: ( '==' )
            {
            // InternalAdaptSem.g:4891:1: ( '==' )
            // InternalAdaptSem.g:4892:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__2__Impl"


    // $ANTLR start "rule__CondEquality__Group_0__3"
    // InternalAdaptSem.g:4901:1: rule__CondEquality__Group_0__3 : rule__CondEquality__Group_0__3__Impl ;
    public final void rule__CondEquality__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4905:1: ( rule__CondEquality__Group_0__3__Impl )
            // InternalAdaptSem.g:4906:2: rule__CondEquality__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__3"


    // $ANTLR start "rule__CondEquality__Group_0__3__Impl"
    // InternalAdaptSem.g:4912:1: rule__CondEquality__Group_0__3__Impl : ( ( rule__CondEquality__RhsAssignment_0_3 ) ) ;
    public final void rule__CondEquality__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4916:1: ( ( ( rule__CondEquality__RhsAssignment_0_3 ) ) )
            // InternalAdaptSem.g:4917:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            {
            // InternalAdaptSem.g:4917:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            // InternalAdaptSem.g:4918:2: ( rule__CondEquality__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_0_3()); 
            }
            // InternalAdaptSem.g:4919:2: ( rule__CondEquality__RhsAssignment_0_3 )
            // InternalAdaptSem.g:4919:3: rule__CondEquality__RhsAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__RhsAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getRhsAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_0__3__Impl"


    // $ANTLR start "rule__CondEquality__Group_1__0"
    // InternalAdaptSem.g:4928:1: rule__CondEquality__Group_1__0 : rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 ;
    public final void rule__CondEquality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4932:1: ( rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 )
            // InternalAdaptSem.g:4933:2: rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CondEquality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__0"


    // $ANTLR start "rule__CondEquality__Group_1__0__Impl"
    // InternalAdaptSem.g:4940:1: rule__CondEquality__Group_1__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4944:1: ( ( () ) )
            // InternalAdaptSem.g:4945:1: ( () )
            {
            // InternalAdaptSem.g:4945:1: ( () )
            // InternalAdaptSem.g:4946:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0()); 
            }
            // InternalAdaptSem.g:4947:2: ()
            // InternalAdaptSem.g:4947:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__0__Impl"


    // $ANTLR start "rule__CondEquality__Group_1__1"
    // InternalAdaptSem.g:4955:1: rule__CondEquality__Group_1__1 : rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 ;
    public final void rule__CondEquality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4959:1: ( rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 )
            // InternalAdaptSem.g:4960:2: rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__CondEquality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__1"


    // $ANTLR start "rule__CondEquality__Group_1__1__Impl"
    // InternalAdaptSem.g:4967:1: rule__CondEquality__Group_1__1__Impl : ( ( rule__CondEquality__LhsAssignment_1_1 ) ) ;
    public final void rule__CondEquality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4971:1: ( ( ( rule__CondEquality__LhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:4972:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:4972:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            // InternalAdaptSem.g:4973:2: ( rule__CondEquality__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:4974:2: ( rule__CondEquality__LhsAssignment_1_1 )
            // InternalAdaptSem.g:4974:3: rule__CondEquality__LhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__LhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getLhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__1__Impl"


    // $ANTLR start "rule__CondEquality__Group_1__2"
    // InternalAdaptSem.g:4982:1: rule__CondEquality__Group_1__2 : rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 ;
    public final void rule__CondEquality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4986:1: ( rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 )
            // InternalAdaptSem.g:4987:2: rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__CondEquality__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__2"


    // $ANTLR start "rule__CondEquality__Group_1__2__Impl"
    // InternalAdaptSem.g:4994:1: rule__CondEquality__Group_1__2__Impl : ( '!=' ) ;
    public final void rule__CondEquality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4998:1: ( ( '!=' ) )
            // InternalAdaptSem.g:4999:1: ( '!=' )
            {
            // InternalAdaptSem.g:4999:1: ( '!=' )
            // InternalAdaptSem.g:5000:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__2__Impl"


    // $ANTLR start "rule__CondEquality__Group_1__3"
    // InternalAdaptSem.g:5009:1: rule__CondEquality__Group_1__3 : rule__CondEquality__Group_1__3__Impl ;
    public final void rule__CondEquality__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5013:1: ( rule__CondEquality__Group_1__3__Impl )
            // InternalAdaptSem.g:5014:2: rule__CondEquality__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__3"


    // $ANTLR start "rule__CondEquality__Group_1__3__Impl"
    // InternalAdaptSem.g:5020:1: rule__CondEquality__Group_1__3__Impl : ( ( rule__CondEquality__RhsAssignment_1_3 ) ) ;
    public final void rule__CondEquality__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5024:1: ( ( ( rule__CondEquality__RhsAssignment_1_3 ) ) )
            // InternalAdaptSem.g:5025:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            {
            // InternalAdaptSem.g:5025:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            // InternalAdaptSem.g:5026:2: ( rule__CondEquality__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_1_3()); 
            }
            // InternalAdaptSem.g:5027:2: ( rule__CondEquality__RhsAssignment_1_3 )
            // InternalAdaptSem.g:5027:3: rule__CondEquality__RhsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__CondEquality__RhsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getRhsAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__Group_1__3__Impl"


    // $ANTLR start "rule__CondComparison__Group_0__0"
    // InternalAdaptSem.g:5036:1: rule__CondComparison__Group_0__0 : rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 ;
    public final void rule__CondComparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5040:1: ( rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 )
            // InternalAdaptSem.g:5041:2: rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CondComparison__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__0"


    // $ANTLR start "rule__CondComparison__Group_0__0__Impl"
    // InternalAdaptSem.g:5048:1: rule__CondComparison__Group_0__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5052:1: ( ( () ) )
            // InternalAdaptSem.g:5053:1: ( () )
            {
            // InternalAdaptSem.g:5053:1: ( () )
            // InternalAdaptSem.g:5054:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessAction_0_0()); 
            }
            // InternalAdaptSem.g:5055:2: ()
            // InternalAdaptSem.g:5055:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLessAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__0__Impl"


    // $ANTLR start "rule__CondComparison__Group_0__1"
    // InternalAdaptSem.g:5063:1: rule__CondComparison__Group_0__1 : rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 ;
    public final void rule__CondComparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5067:1: ( rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 )
            // InternalAdaptSem.g:5068:2: rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2
            {
            pushFollow(FOLLOW_35);
            rule__CondComparison__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__1"


    // $ANTLR start "rule__CondComparison__Group_0__1__Impl"
    // InternalAdaptSem.g:5075:1: rule__CondComparison__Group_0__1__Impl : ( ( rule__CondComparison__LhsAssignment_0_1 ) ) ;
    public final void rule__CondComparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5079:1: ( ( ( rule__CondComparison__LhsAssignment_0_1 ) ) )
            // InternalAdaptSem.g:5080:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:5080:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            // InternalAdaptSem.g:5081:2: ( rule__CondComparison__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_0_1()); 
            }
            // InternalAdaptSem.g:5082:2: ( rule__CondComparison__LhsAssignment_0_1 )
            // InternalAdaptSem.g:5082:3: rule__CondComparison__LhsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__LhsAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLhsAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__1__Impl"


    // $ANTLR start "rule__CondComparison__Group_0__2"
    // InternalAdaptSem.g:5090:1: rule__CondComparison__Group_0__2 : rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 ;
    public final void rule__CondComparison__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5094:1: ( rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 )
            // InternalAdaptSem.g:5095:2: rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__CondComparison__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__2"


    // $ANTLR start "rule__CondComparison__Group_0__2__Impl"
    // InternalAdaptSem.g:5102:1: rule__CondComparison__Group_0__2__Impl : ( '<' ) ;
    public final void rule__CondComparison__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5106:1: ( ( '<' ) )
            // InternalAdaptSem.g:5107:1: ( '<' )
            {
            // InternalAdaptSem.g:5107:1: ( '<' )
            // InternalAdaptSem.g:5108:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__2__Impl"


    // $ANTLR start "rule__CondComparison__Group_0__3"
    // InternalAdaptSem.g:5117:1: rule__CondComparison__Group_0__3 : rule__CondComparison__Group_0__3__Impl ;
    public final void rule__CondComparison__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5121:1: ( rule__CondComparison__Group_0__3__Impl )
            // InternalAdaptSem.g:5122:2: rule__CondComparison__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__3"


    // $ANTLR start "rule__CondComparison__Group_0__3__Impl"
    // InternalAdaptSem.g:5128:1: rule__CondComparison__Group_0__3__Impl : ( ( rule__CondComparison__RhsAssignment_0_3 ) ) ;
    public final void rule__CondComparison__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5132:1: ( ( ( rule__CondComparison__RhsAssignment_0_3 ) ) )
            // InternalAdaptSem.g:5133:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            {
            // InternalAdaptSem.g:5133:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            // InternalAdaptSem.g:5134:2: ( rule__CondComparison__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_0_3()); 
            }
            // InternalAdaptSem.g:5135:2: ( rule__CondComparison__RhsAssignment_0_3 )
            // InternalAdaptSem.g:5135:3: rule__CondComparison__RhsAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__RhsAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getRhsAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_0__3__Impl"


    // $ANTLR start "rule__CondComparison__Group_1__0"
    // InternalAdaptSem.g:5144:1: rule__CondComparison__Group_1__0 : rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 ;
    public final void rule__CondComparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5148:1: ( rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 )
            // InternalAdaptSem.g:5149:2: rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CondComparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__0"


    // $ANTLR start "rule__CondComparison__Group_1__0__Impl"
    // InternalAdaptSem.g:5156:1: rule__CondComparison__Group_1__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5160:1: ( ( () ) )
            // InternalAdaptSem.g:5161:1: ( () )
            {
            // InternalAdaptSem.g:5161:1: ( () )
            // InternalAdaptSem.g:5162:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessEqAction_1_0()); 
            }
            // InternalAdaptSem.g:5163:2: ()
            // InternalAdaptSem.g:5163:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLessEqAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__0__Impl"


    // $ANTLR start "rule__CondComparison__Group_1__1"
    // InternalAdaptSem.g:5171:1: rule__CondComparison__Group_1__1 : rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 ;
    public final void rule__CondComparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5175:1: ( rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 )
            // InternalAdaptSem.g:5176:2: rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2
            {
            pushFollow(FOLLOW_36);
            rule__CondComparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__1"


    // $ANTLR start "rule__CondComparison__Group_1__1__Impl"
    // InternalAdaptSem.g:5183:1: rule__CondComparison__Group_1__1__Impl : ( ( rule__CondComparison__LhsAssignment_1_1 ) ) ;
    public final void rule__CondComparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5187:1: ( ( ( rule__CondComparison__LhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5188:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5188:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5189:2: ( rule__CondComparison__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5190:2: ( rule__CondComparison__LhsAssignment_1_1 )
            // InternalAdaptSem.g:5190:3: rule__CondComparison__LhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__LhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__1__Impl"


    // $ANTLR start "rule__CondComparison__Group_1__2"
    // InternalAdaptSem.g:5198:1: rule__CondComparison__Group_1__2 : rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 ;
    public final void rule__CondComparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5202:1: ( rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 )
            // InternalAdaptSem.g:5203:2: rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__CondComparison__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__2"


    // $ANTLR start "rule__CondComparison__Group_1__2__Impl"
    // InternalAdaptSem.g:5210:1: rule__CondComparison__Group_1__2__Impl : ( '<=' ) ;
    public final void rule__CondComparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5214:1: ( ( '<=' ) )
            // InternalAdaptSem.g:5215:1: ( '<=' )
            {
            // InternalAdaptSem.g:5215:1: ( '<=' )
            // InternalAdaptSem.g:5216:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__2__Impl"


    // $ANTLR start "rule__CondComparison__Group_1__3"
    // InternalAdaptSem.g:5225:1: rule__CondComparison__Group_1__3 : rule__CondComparison__Group_1__3__Impl ;
    public final void rule__CondComparison__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5229:1: ( rule__CondComparison__Group_1__3__Impl )
            // InternalAdaptSem.g:5230:2: rule__CondComparison__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__3"


    // $ANTLR start "rule__CondComparison__Group_1__3__Impl"
    // InternalAdaptSem.g:5236:1: rule__CondComparison__Group_1__3__Impl : ( ( rule__CondComparison__RhsAssignment_1_3 ) ) ;
    public final void rule__CondComparison__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5240:1: ( ( ( rule__CondComparison__RhsAssignment_1_3 ) ) )
            // InternalAdaptSem.g:5241:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            {
            // InternalAdaptSem.g:5241:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            // InternalAdaptSem.g:5242:2: ( rule__CondComparison__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_1_3()); 
            }
            // InternalAdaptSem.g:5243:2: ( rule__CondComparison__RhsAssignment_1_3 )
            // InternalAdaptSem.g:5243:3: rule__CondComparison__RhsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__CondComparison__RhsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getRhsAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__Group_1__3__Impl"


    // $ANTLR start "rule__CondIs__Group__0"
    // InternalAdaptSem.g:5252:1: rule__CondIs__Group__0 : rule__CondIs__Group__0__Impl rule__CondIs__Group__1 ;
    public final void rule__CondIs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5256:1: ( rule__CondIs__Group__0__Impl rule__CondIs__Group__1 )
            // InternalAdaptSem.g:5257:2: rule__CondIs__Group__0__Impl rule__CondIs__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CondIs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondIs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__0"


    // $ANTLR start "rule__CondIs__Group__0__Impl"
    // InternalAdaptSem.g:5264:1: rule__CondIs__Group__0__Impl : ( () ) ;
    public final void rule__CondIs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5268:1: ( ( () ) )
            // InternalAdaptSem.g:5269:1: ( () )
            {
            // InternalAdaptSem.g:5269:1: ( () )
            // InternalAdaptSem.g:5270:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getIsAction_0()); 
            }
            // InternalAdaptSem.g:5271:2: ()
            // InternalAdaptSem.g:5271:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getIsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__0__Impl"


    // $ANTLR start "rule__CondIs__Group__1"
    // InternalAdaptSem.g:5279:1: rule__CondIs__Group__1 : rule__CondIs__Group__1__Impl rule__CondIs__Group__2 ;
    public final void rule__CondIs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5283:1: ( rule__CondIs__Group__1__Impl rule__CondIs__Group__2 )
            // InternalAdaptSem.g:5284:2: rule__CondIs__Group__1__Impl rule__CondIs__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__CondIs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondIs__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__1"


    // $ANTLR start "rule__CondIs__Group__1__Impl"
    // InternalAdaptSem.g:5291:1: rule__CondIs__Group__1__Impl : ( ( rule__CondIs__PatternAssignment_1 ) ) ;
    public final void rule__CondIs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5295:1: ( ( ( rule__CondIs__PatternAssignment_1 ) ) )
            // InternalAdaptSem.g:5296:1: ( ( rule__CondIs__PatternAssignment_1 ) )
            {
            // InternalAdaptSem.g:5296:1: ( ( rule__CondIs__PatternAssignment_1 ) )
            // InternalAdaptSem.g:5297:2: ( rule__CondIs__PatternAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getPatternAssignment_1()); 
            }
            // InternalAdaptSem.g:5298:2: ( rule__CondIs__PatternAssignment_1 )
            // InternalAdaptSem.g:5298:3: rule__CondIs__PatternAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CondIs__PatternAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getPatternAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__1__Impl"


    // $ANTLR start "rule__CondIs__Group__2"
    // InternalAdaptSem.g:5306:1: rule__CondIs__Group__2 : rule__CondIs__Group__2__Impl rule__CondIs__Group__3 ;
    public final void rule__CondIs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5310:1: ( rule__CondIs__Group__2__Impl rule__CondIs__Group__3 )
            // InternalAdaptSem.g:5311:2: rule__CondIs__Group__2__Impl rule__CondIs__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CondIs__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CondIs__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__2"


    // $ANTLR start "rule__CondIs__Group__2__Impl"
    // InternalAdaptSem.g:5318:1: rule__CondIs__Group__2__Impl : ( 'match' ) ;
    public final void rule__CondIs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5322:1: ( ( 'match' ) )
            // InternalAdaptSem.g:5323:1: ( 'match' )
            {
            // InternalAdaptSem.g:5323:1: ( 'match' )
            // InternalAdaptSem.g:5324:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getMatchKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getMatchKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__2__Impl"


    // $ANTLR start "rule__CondIs__Group__3"
    // InternalAdaptSem.g:5333:1: rule__CondIs__Group__3 : rule__CondIs__Group__3__Impl ;
    public final void rule__CondIs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5337:1: ( rule__CondIs__Group__3__Impl )
            // InternalAdaptSem.g:5338:2: rule__CondIs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CondIs__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__3"


    // $ANTLR start "rule__CondIs__Group__3__Impl"
    // InternalAdaptSem.g:5344:1: rule__CondIs__Group__3__Impl : ( ( rule__CondIs__ExprAssignment_3 ) ) ;
    public final void rule__CondIs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5348:1: ( ( ( rule__CondIs__ExprAssignment_3 ) ) )
            // InternalAdaptSem.g:5349:1: ( ( rule__CondIs__ExprAssignment_3 ) )
            {
            // InternalAdaptSem.g:5349:1: ( ( rule__CondIs__ExprAssignment_3 ) )
            // InternalAdaptSem.g:5350:2: ( rule__CondIs__ExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getExprAssignment_3()); 
            }
            // InternalAdaptSem.g:5351:2: ( rule__CondIs__ExprAssignment_3 )
            // InternalAdaptSem.g:5351:3: rule__CondIs__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CondIs__ExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getExprAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__Group__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalAdaptSem.g:5360:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5364:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalAdaptSem.g:5365:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalAdaptSem.g:5372:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5376:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:5377:1: ( ruleAnd )
            {
            // InternalAdaptSem.g:5377:1: ( ruleAnd )
            // InternalAdaptSem.g:5378:2: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalAdaptSem.g:5387:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5391:1: ( rule__Or__Group__1__Impl )
            // InternalAdaptSem.g:5392:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalAdaptSem.g:5398:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5402:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalAdaptSem.g:5403:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5403:1: ( ( rule__Or__Group_1__0 )* )
            // InternalAdaptSem.g:5404:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5405:2: ( rule__Or__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdaptSem.g:5405:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalAdaptSem.g:5414:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5418:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalAdaptSem.g:5419:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalAdaptSem.g:5426:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5430:1: ( ( () ) )
            // InternalAdaptSem.g:5431:1: ( () )
            {
            // InternalAdaptSem.g:5431:1: ( () )
            // InternalAdaptSem.g:5432:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLhsAction_1_0()); 
            }
            // InternalAdaptSem.g:5433:2: ()
            // InternalAdaptSem.g:5433:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalAdaptSem.g:5441:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5445:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalAdaptSem.g:5446:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalAdaptSem.g:5453:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5457:1: ( ( '||' ) )
            // InternalAdaptSem.g:5458:1: ( '||' )
            {
            // InternalAdaptSem.g:5458:1: ( '||' )
            // InternalAdaptSem.g:5459:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalAdaptSem.g:5468:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5472:1: ( rule__Or__Group_1__2__Impl )
            // InternalAdaptSem.g:5473:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalAdaptSem.g:5479:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RhsAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5483:1: ( ( ( rule__Or__RhsAssignment_1_2 ) ) )
            // InternalAdaptSem.g:5484:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:5484:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            // InternalAdaptSem.g:5485:2: ( rule__Or__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRhsAssignment_1_2()); 
            }
            // InternalAdaptSem.g:5486:2: ( rule__Or__RhsAssignment_1_2 )
            // InternalAdaptSem.g:5486:3: rule__Or__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalAdaptSem.g:5495:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5499:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalAdaptSem.g:5500:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalAdaptSem.g:5507:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5511:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:5512:1: ( ruleEquality )
            {
            // InternalAdaptSem.g:5512:1: ( ruleEquality )
            // InternalAdaptSem.g:5513:2: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalAdaptSem.g:5522:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5526:1: ( rule__And__Group__1__Impl )
            // InternalAdaptSem.g:5527:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalAdaptSem.g:5533:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5537:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalAdaptSem.g:5538:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5538:1: ( ( rule__And__Group_1__0 )* )
            // InternalAdaptSem.g:5539:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5540:2: ( rule__And__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==36) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdaptSem.g:5540:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalAdaptSem.g:5549:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5553:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalAdaptSem.g:5554:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalAdaptSem.g:5561:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5565:1: ( ( () ) )
            // InternalAdaptSem.g:5566:1: ( () )
            {
            // InternalAdaptSem.g:5566:1: ( () )
            // InternalAdaptSem.g:5567:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLhsAction_1_0()); 
            }
            // InternalAdaptSem.g:5568:2: ()
            // InternalAdaptSem.g:5568:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalAdaptSem.g:5576:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5580:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalAdaptSem.g:5581:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalAdaptSem.g:5588:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5592:1: ( ( '&&' ) )
            // InternalAdaptSem.g:5593:1: ( '&&' )
            {
            // InternalAdaptSem.g:5593:1: ( '&&' )
            // InternalAdaptSem.g:5594:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalAdaptSem.g:5603:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5607:1: ( rule__And__Group_1__2__Impl )
            // InternalAdaptSem.g:5608:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalAdaptSem.g:5614:1: rule__And__Group_1__2__Impl : ( ( rule__And__RhsAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5618:1: ( ( ( rule__And__RhsAssignment_1_2 ) ) )
            // InternalAdaptSem.g:5619:1: ( ( rule__And__RhsAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:5619:1: ( ( rule__And__RhsAssignment_1_2 ) )
            // InternalAdaptSem.g:5620:2: ( rule__And__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRhsAssignment_1_2()); 
            }
            // InternalAdaptSem.g:5621:2: ( rule__And__RhsAssignment_1_2 )
            // InternalAdaptSem.g:5621:3: rule__And__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalAdaptSem.g:5630:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5634:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalAdaptSem.g:5635:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Equality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalAdaptSem.g:5642:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5646:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:5647:1: ( ruleComparison )
            {
            // InternalAdaptSem.g:5647:1: ( ruleComparison )
            // InternalAdaptSem.g:5648:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalAdaptSem.g:5657:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5661:1: ( rule__Equality__Group__1__Impl )
            // InternalAdaptSem.g:5662:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalAdaptSem.g:5668:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5672:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalAdaptSem.g:5673:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5673:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalAdaptSem.g:5674:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5675:2: ( rule__Equality__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=37 && LA41_0<=38)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAdaptSem.g:5675:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalAdaptSem.g:5684:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5688:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalAdaptSem.g:5689:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalAdaptSem.g:5696:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5700:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:5701:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:5701:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalAdaptSem.g:5702:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:5703:2: ( rule__Equality__Alternatives_1_0 )
            // InternalAdaptSem.g:5703:3: rule__Equality__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalAdaptSem.g:5711:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5715:1: ( rule__Equality__Group_1__1__Impl )
            // InternalAdaptSem.g:5716:2: rule__Equality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalAdaptSem.g:5722:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RhsAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5726:1: ( ( ( rule__Equality__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5727:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5727:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5728:2: ( rule__Equality__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5729:2: ( rule__Equality__RhsAssignment_1_1 )
            // InternalAdaptSem.g:5729:3: rule__Equality__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__0"
    // InternalAdaptSem.g:5738:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5742:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalAdaptSem.g:5743:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Equality__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0"


    // $ANTLR start "rule__Equality__Group_1_0_0__0__Impl"
    // InternalAdaptSem.g:5750:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5754:1: ( ( () ) )
            // InternalAdaptSem.g:5755:1: ( () )
            {
            // InternalAdaptSem.g:5755:1: ( () )
            // InternalAdaptSem.g:5756:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:5757:2: ()
            // InternalAdaptSem.g:5757:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__1"
    // InternalAdaptSem.g:5765:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5769:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:5770:2: rule__Equality__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__1"


    // $ANTLR start "rule__Equality__Group_1_0_0__1__Impl"
    // InternalAdaptSem.g:5776:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5780:1: ( ( '==' ) )
            // InternalAdaptSem.g:5781:1: ( '==' )
            {
            // InternalAdaptSem.g:5781:1: ( '==' )
            // InternalAdaptSem.g:5782:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__0"
    // InternalAdaptSem.g:5792:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5796:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalAdaptSem.g:5797:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Equality__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0"


    // $ANTLR start "rule__Equality__Group_1_0_1__0__Impl"
    // InternalAdaptSem.g:5804:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5808:1: ( ( () ) )
            // InternalAdaptSem.g:5809:1: ( () )
            {
            // InternalAdaptSem.g:5809:1: ( () )
            // InternalAdaptSem.g:5810:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:5811:2: ()
            // InternalAdaptSem.g:5811:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__1"
    // InternalAdaptSem.g:5819:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5823:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:5824:2: rule__Equality__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__1"


    // $ANTLR start "rule__Equality__Group_1_0_1__1__Impl"
    // InternalAdaptSem.g:5830:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5834:1: ( ( '!=' ) )
            // InternalAdaptSem.g:5835:1: ( '!=' )
            {
            // InternalAdaptSem.g:5835:1: ( '!=' )
            // InternalAdaptSem.g:5836:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalAdaptSem.g:5846:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5850:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalAdaptSem.g:5851:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalAdaptSem.g:5858:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5862:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:5863:1: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:5863:1: ( rulePlusOrMinus )
            // InternalAdaptSem.g:5864:2: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalAdaptSem.g:5873:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5877:1: ( rule__Comparison__Group__1__Impl )
            // InternalAdaptSem.g:5878:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalAdaptSem.g:5884:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5888:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalAdaptSem.g:5889:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5889:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalAdaptSem.g:5890:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5891:2: ( rule__Comparison__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=39 && LA42_0<=40)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAdaptSem.g:5891:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalAdaptSem.g:5900:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5904:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalAdaptSem.g:5905:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalAdaptSem.g:5912:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5916:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:5917:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:5917:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalAdaptSem.g:5918:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:5919:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalAdaptSem.g:5919:3: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalAdaptSem.g:5927:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5931:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalAdaptSem.g:5932:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalAdaptSem.g:5938:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RhsAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5942:1: ( ( ( rule__Comparison__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5943:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5943:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5944:2: ( rule__Comparison__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5945:2: ( rule__Comparison__RhsAssignment_1_1 )
            // InternalAdaptSem.g:5945:3: rule__Comparison__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalAdaptSem.g:5954:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5958:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalAdaptSem.g:5959:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalAdaptSem.g:5966:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5970:1: ( ( () ) )
            // InternalAdaptSem.g:5971:1: ( () )
            {
            // InternalAdaptSem.g:5971:1: ( () )
            // InternalAdaptSem.g:5972:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:5973:2: ()
            // InternalAdaptSem.g:5973:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalAdaptSem.g:5981:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5985:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:5986:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalAdaptSem.g:5992:1: rule__Comparison__Group_1_0_0__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5996:1: ( ( '<' ) )
            // InternalAdaptSem.g:5997:1: ( '<' )
            {
            // InternalAdaptSem.g:5997:1: ( '<' )
            // InternalAdaptSem.g:5998:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // InternalAdaptSem.g:6008:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6012:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalAdaptSem.g:6013:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // InternalAdaptSem.g:6020:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6024:1: ( ( () ) )
            // InternalAdaptSem.g:6025:1: ( () )
            {
            // InternalAdaptSem.g:6025:1: ( () )
            // InternalAdaptSem.g:6026:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6027:2: ()
            // InternalAdaptSem.g:6027:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // InternalAdaptSem.g:6035:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6039:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6040:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // InternalAdaptSem.g:6046:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6050:1: ( ( '<=' ) )
            // InternalAdaptSem.g:6051:1: ( '<=' )
            {
            // InternalAdaptSem.g:6051:1: ( '<=' )
            // InternalAdaptSem.g:6052:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalAdaptSem.g:6062:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6066:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalAdaptSem.g:6067:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalAdaptSem.g:6074:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6078:1: ( ( ruleMulOrDiv ) )
            // InternalAdaptSem.g:6079:1: ( ruleMulOrDiv )
            {
            // InternalAdaptSem.g:6079:1: ( ruleMulOrDiv )
            // InternalAdaptSem.g:6080:2: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalAdaptSem.g:6089:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6093:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalAdaptSem.g:6094:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalAdaptSem.g:6100:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6104:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalAdaptSem.g:6105:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6105:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalAdaptSem.g:6106:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6107:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=42 && LA43_0<=43)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdaptSem.g:6107:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalAdaptSem.g:6116:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6120:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalAdaptSem.g:6121:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalAdaptSem.g:6128:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6132:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6133:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6133:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6134:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6135:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalAdaptSem.g:6135:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalAdaptSem.g:6143:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6147:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalAdaptSem.g:6148:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalAdaptSem.g:6154:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6158:1: ( ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6159:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6159:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6160:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6161:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6161:3: rule__PlusOrMinus__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalAdaptSem.g:6170:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6174:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalAdaptSem.g:6175:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_46);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalAdaptSem.g:6182:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6186:1: ( ( () ) )
            // InternalAdaptSem.g:6187:1: ( () )
            {
            // InternalAdaptSem.g:6187:1: ( () )
            // InternalAdaptSem.g:6188:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6189:2: ()
            // InternalAdaptSem.g:6189:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalAdaptSem.g:6197:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6201:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6202:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalAdaptSem.g:6208:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6212:1: ( ( '+' ) )
            // InternalAdaptSem.g:6213:1: ( '+' )
            {
            // InternalAdaptSem.g:6213:1: ( '+' )
            // InternalAdaptSem.g:6214:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalAdaptSem.g:6224:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6228:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalAdaptSem.g:6229:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_44);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalAdaptSem.g:6236:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6240:1: ( ( () ) )
            // InternalAdaptSem.g:6241:1: ( () )
            {
            // InternalAdaptSem.g:6241:1: ( () )
            // InternalAdaptSem.g:6242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6243:2: ()
            // InternalAdaptSem.g:6243:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalAdaptSem.g:6251:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6255:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6256:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalAdaptSem.g:6262:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6266:1: ( ( '-' ) )
            // InternalAdaptSem.g:6267:1: ( '-' )
            {
            // InternalAdaptSem.g:6267:1: ( '-' )
            // InternalAdaptSem.g:6268:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalAdaptSem.g:6278:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6282:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalAdaptSem.g:6283:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalAdaptSem.g:6290:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6294:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:6295:1: ( rulePrimary )
            {
            // InternalAdaptSem.g:6295:1: ( rulePrimary )
            // InternalAdaptSem.g:6296:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalAdaptSem.g:6305:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6309:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalAdaptSem.g:6310:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalAdaptSem.g:6316:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6320:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalAdaptSem.g:6321:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6321:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalAdaptSem.g:6322:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6323:2: ( rule__MulOrDiv__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=44 && LA44_0<=45)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAdaptSem.g:6323:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalAdaptSem.g:6332:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6336:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalAdaptSem.g:6337:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalAdaptSem.g:6344:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6348:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6349:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6349:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6350:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6351:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalAdaptSem.g:6351:3: rule__MulOrDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalAdaptSem.g:6359:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6363:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalAdaptSem.g:6364:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalAdaptSem.g:6370:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6374:1: ( ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6375:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6375:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6376:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6377:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6377:3: rule__MulOrDiv__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRhsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0"
    // InternalAdaptSem.g:6386:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6390:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalAdaptSem.g:6391:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_49);
            rule__MulOrDiv__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0__Impl"
    // InternalAdaptSem.g:6398:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6402:1: ( ( () ) )
            // InternalAdaptSem.g:6403:1: ( () )
            {
            // InternalAdaptSem.g:6403:1: ( () )
            // InternalAdaptSem.g:6404:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6405:2: ()
            // InternalAdaptSem.g:6405:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1"
    // InternalAdaptSem.g:6413:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6417:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6418:2: rule__MulOrDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1__Impl"
    // InternalAdaptSem.g:6424:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6428:1: ( ( '*' ) )
            // InternalAdaptSem.g:6429:1: ( '*' )
            {
            // InternalAdaptSem.g:6429:1: ( '*' )
            // InternalAdaptSem.g:6430:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0"
    // InternalAdaptSem.g:6440:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6444:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalAdaptSem.g:6445:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_47);
            rule__MulOrDiv__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0__Impl"
    // InternalAdaptSem.g:6452:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6456:1: ( ( () ) )
            // InternalAdaptSem.g:6457:1: ( () )
            {
            // InternalAdaptSem.g:6457:1: ( () )
            // InternalAdaptSem.g:6458:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6459:2: ()
            // InternalAdaptSem.g:6459:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1"
    // InternalAdaptSem.g:6467:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6471:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6472:2: rule__MulOrDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1__Impl"
    // InternalAdaptSem.g:6478:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6482:1: ( ( '/' ) )
            // InternalAdaptSem.g:6483:1: ( '/' )
            {
            // InternalAdaptSem.g:6483:1: ( '/' )
            // InternalAdaptSem.g:6484:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalAdaptSem.g:6494:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6498:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalAdaptSem.g:6499:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalAdaptSem.g:6506:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6510:1: ( ( '(' ) )
            // InternalAdaptSem.g:6511:1: ( '(' )
            {
            // InternalAdaptSem.g:6511:1: ( '(' )
            // InternalAdaptSem.g:6512:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalAdaptSem.g:6521:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6525:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalAdaptSem.g:6526:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalAdaptSem.g:6533:1: rule__Primary__Group_0__1__Impl : ( ruleExpr ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6537:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:6538:1: ( ruleExpr )
            {
            // InternalAdaptSem.g:6538:1: ( ruleExpr )
            // InternalAdaptSem.g:6539:2: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalAdaptSem.g:6548:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6552:1: ( rule__Primary__Group_0__2__Impl )
            // InternalAdaptSem.g:6553:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalAdaptSem.g:6559:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6563:1: ( ( ')' ) )
            // InternalAdaptSem.g:6564:1: ( ')' )
            {
            // InternalAdaptSem.g:6564:1: ( ')' )
            // InternalAdaptSem.g:6565:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalAdaptSem.g:6575:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6579:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalAdaptSem.g:6580:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalAdaptSem.g:6587:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6591:1: ( ( () ) )
            // InternalAdaptSem.g:6592:1: ( () )
            {
            // InternalAdaptSem.g:6592:1: ( () )
            // InternalAdaptSem.g:6593:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalAdaptSem.g:6594:2: ()
            // InternalAdaptSem.g:6594:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalAdaptSem.g:6602:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6606:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalAdaptSem.g:6607:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalAdaptSem.g:6614:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6618:1: ( ( '!' ) )
            // InternalAdaptSem.g:6619:1: ( '!' )
            {
            // InternalAdaptSem.g:6619:1: ( '!' )
            // InternalAdaptSem.g:6620:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalAdaptSem.g:6629:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6633:1: ( rule__Primary__Group_1__2__Impl )
            // InternalAdaptSem.g:6634:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalAdaptSem.g:6640:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExprAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6644:1: ( ( ( rule__Primary__ExprAssignment_1_2 ) ) )
            // InternalAdaptSem.g:6645:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:6645:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            // InternalAdaptSem.g:6646:2: ( rule__Primary__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_1_2()); 
            }
            // InternalAdaptSem.g:6647:2: ( rule__Primary__ExprAssignment_1_2 )
            // InternalAdaptSem.g:6647:3: rule__Primary__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExprAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalAdaptSem.g:6656:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6660:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAdaptSem.g:6661:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_50);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalAdaptSem.g:6668:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6672:1: ( ( () ) )
            // InternalAdaptSem.g:6673:1: ( () )
            {
            // InternalAdaptSem.g:6673:1: ( () )
            // InternalAdaptSem.g:6674:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getOppositeAction_2_0()); 
            }
            // InternalAdaptSem.g:6675:2: ()
            // InternalAdaptSem.g:6675:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getOppositeAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalAdaptSem.g:6683:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6687:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAdaptSem.g:6688:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalAdaptSem.g:6695:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6699:1: ( ( '-' ) )
            // InternalAdaptSem.g:6700:1: ( '-' )
            {
            // InternalAdaptSem.g:6700:1: ( '-' )
            // InternalAdaptSem.g:6701:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalAdaptSem.g:6710:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6714:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAdaptSem.g:6715:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalAdaptSem.g:6721:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExprAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6725:1: ( ( ( rule__Primary__ExprAssignment_2_2 ) ) )
            // InternalAdaptSem.g:6726:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            {
            // InternalAdaptSem.g:6726:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            // InternalAdaptSem.g:6727:2: ( rule__Primary__ExprAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_2_2()); 
            }
            // InternalAdaptSem.g:6728:2: ( rule__Primary__ExprAssignment_2_2 )
            // InternalAdaptSem.g:6728:3: rule__Primary__ExprAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExprAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalAdaptSem.g:6737:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6741:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalAdaptSem.g:6742:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalAdaptSem.g:6749:1: rule__Primary__Group_3__0__Impl : ( () ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6753:1: ( ( () ) )
            // InternalAdaptSem.g:6754:1: ( () )
            {
            // InternalAdaptSem.g:6754:1: ( () )
            // InternalAdaptSem.g:6755:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getIsAction_3_0()); 
            }
            // InternalAdaptSem.g:6756:2: ()
            // InternalAdaptSem.g:6756:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getIsAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalAdaptSem.g:6764:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6768:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalAdaptSem.g:6769:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_37);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalAdaptSem.g:6776:1: rule__Primary__Group_3__1__Impl : ( ( rule__Primary__PatternAssignment_3_1 ) ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6780:1: ( ( ( rule__Primary__PatternAssignment_3_1 ) ) )
            // InternalAdaptSem.g:6781:1: ( ( rule__Primary__PatternAssignment_3_1 ) )
            {
            // InternalAdaptSem.g:6781:1: ( ( rule__Primary__PatternAssignment_3_1 ) )
            // InternalAdaptSem.g:6782:2: ( rule__Primary__PatternAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getPatternAssignment_3_1()); 
            }
            // InternalAdaptSem.g:6783:2: ( rule__Primary__PatternAssignment_3_1 )
            // InternalAdaptSem.g:6783:3: rule__Primary__PatternAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__PatternAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getPatternAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalAdaptSem.g:6791:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6795:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalAdaptSem.g:6796:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalAdaptSem.g:6803:1: rule__Primary__Group_3__2__Impl : ( 'match' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6807:1: ( ( 'match' ) )
            // InternalAdaptSem.g:6808:1: ( 'match' )
            {
            // InternalAdaptSem.g:6808:1: ( 'match' )
            // InternalAdaptSem.g:6809:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMatchKeyword_3_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getMatchKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__3"
    // InternalAdaptSem.g:6818:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6822:1: ( rule__Primary__Group_3__3__Impl )
            // InternalAdaptSem.g:6823:2: rule__Primary__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3"


    // $ANTLR start "rule__Primary__Group_3__3__Impl"
    // InternalAdaptSem.g:6829:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExprAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6833:1: ( ( ( rule__Primary__ExprAssignment_3_3 ) ) )
            // InternalAdaptSem.g:6834:1: ( ( rule__Primary__ExprAssignment_3_3 ) )
            {
            // InternalAdaptSem.g:6834:1: ( ( rule__Primary__ExprAssignment_3_3 ) )
            // InternalAdaptSem.g:6835:2: ( rule__Primary__ExprAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_3_3()); 
            }
            // InternalAdaptSem.g:6836:2: ( rule__Primary__ExprAssignment_3_3 )
            // InternalAdaptSem.g:6836:3: rule__Primary__ExprAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExprAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprAssignment_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalAdaptSem.g:6845:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6849:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalAdaptSem.g:6850:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_51);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalAdaptSem.g:6857:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6861:1: ( ( () ) )
            // InternalAdaptSem.g:6862:1: ( () )
            {
            // InternalAdaptSem.g:6862:1: ( () )
            // InternalAdaptSem.g:6863:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }
            // InternalAdaptSem.g:6864:2: ()
            // InternalAdaptSem.g:6864:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalAdaptSem.g:6872:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6876:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalAdaptSem.g:6877:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalAdaptSem.g:6883:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6887:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalAdaptSem.g:6888:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:6888:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalAdaptSem.g:6889:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalAdaptSem.g:6890:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalAdaptSem.g:6890:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalAdaptSem.g:6899:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6903:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalAdaptSem.g:6904:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_52);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalAdaptSem.g:6911:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6915:1: ( ( () ) )
            // InternalAdaptSem.g:6916:1: ( () )
            {
            // InternalAdaptSem.g:6916:1: ( () )
            // InternalAdaptSem.g:6917:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0()); 
            }
            // InternalAdaptSem.g:6918:2: ()
            // InternalAdaptSem.g:6918:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalAdaptSem.g:6926:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6930:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalAdaptSem.g:6931:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalAdaptSem.g:6937:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6941:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6942:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6942:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalAdaptSem.g:6943:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6944:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalAdaptSem.g:6944:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalAdaptSem.g:6953:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6957:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalAdaptSem.g:6958:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_53);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalAdaptSem.g:6965:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6969:1: ( ( () ) )
            // InternalAdaptSem.g:6970:1: ( () )
            {
            // InternalAdaptSem.g:6970:1: ( () )
            // InternalAdaptSem.g:6971:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            }
            // InternalAdaptSem.g:6972:2: ()
            // InternalAdaptSem.g:6972:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalAdaptSem.g:6980:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6984:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalAdaptSem.g:6985:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalAdaptSem.g:6991:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6995:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalAdaptSem.g:6996:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalAdaptSem.g:6996:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalAdaptSem.g:6997:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalAdaptSem.g:6998:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalAdaptSem.g:6998:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalAdaptSem.g:7007:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7011:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalAdaptSem.g:7012:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_54);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalAdaptSem.g:7019:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7023:1: ( ( () ) )
            // InternalAdaptSem.g:7024:1: ( () )
            {
            // InternalAdaptSem.g:7024:1: ( () )
            // InternalAdaptSem.g:7025:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }
            // InternalAdaptSem.g:7026:2: ()
            // InternalAdaptSem.g:7026:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalAdaptSem.g:7034:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7038:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalAdaptSem.g:7039:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalAdaptSem.g:7045:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7049:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalAdaptSem.g:7050:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalAdaptSem.g:7050:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalAdaptSem.g:7051:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalAdaptSem.g:7052:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalAdaptSem.g:7052:3: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalAdaptSem.g:7061:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7065:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAdaptSem.g:7066:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalAdaptSem.g:7073:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7077:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7078:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7078:1: ( RULE_ID )
            // InternalAdaptSem.g:7079:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalAdaptSem.g:7088:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7092:1: ( rule__FQN__Group__1__Impl )
            // InternalAdaptSem.g:7093:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalAdaptSem.g:7099:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7103:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAdaptSem.g:7104:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAdaptSem.g:7104:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAdaptSem.g:7105:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:7106:2: ( rule__FQN__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAdaptSem.g:7106:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalAdaptSem.g:7115:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7119:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAdaptSem.g:7120:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalAdaptSem.g:7127:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7131:1: ( ( '.' ) )
            // InternalAdaptSem.g:7132:1: ( '.' )
            {
            // InternalAdaptSem.g:7132:1: ( '.' )
            // InternalAdaptSem.g:7133:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalAdaptSem.g:7142:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7146:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAdaptSem.g:7147:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalAdaptSem.g:7153:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7157:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7158:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7158:1: ( RULE_ID )
            // InternalAdaptSem.g:7159:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__OperationFQN__Group__0"
    // InternalAdaptSem.g:7169:1: rule__OperationFQN__Group__0 : rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 ;
    public final void rule__OperationFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7173:1: ( rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 )
            // InternalAdaptSem.g:7174:2: rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OperationFQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationFQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group__0"


    // $ANTLR start "rule__OperationFQN__Group__0__Impl"
    // InternalAdaptSem.g:7181:1: rule__OperationFQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7185:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7186:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7186:1: ( RULE_ID )
            // InternalAdaptSem.g:7187:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group__0__Impl"


    // $ANTLR start "rule__OperationFQN__Group__1"
    // InternalAdaptSem.g:7196:1: rule__OperationFQN__Group__1 : rule__OperationFQN__Group__1__Impl ;
    public final void rule__OperationFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7200:1: ( rule__OperationFQN__Group__1__Impl )
            // InternalAdaptSem.g:7201:2: rule__OperationFQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationFQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group__1"


    // $ANTLR start "rule__OperationFQN__Group__1__Impl"
    // InternalAdaptSem.g:7207:1: rule__OperationFQN__Group__1__Impl : ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) ;
    public final void rule__OperationFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7211:1: ( ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) )
            // InternalAdaptSem.g:7212:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            {
            // InternalAdaptSem.g:7212:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            // InternalAdaptSem.g:7213:2: ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* )
            {
            // InternalAdaptSem.g:7213:2: ( ( rule__OperationFQN__Group_1__0 ) )
            // InternalAdaptSem.g:7214:3: ( rule__OperationFQN__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:7215:3: ( rule__OperationFQN__Group_1__0 )
            // InternalAdaptSem.g:7215:4: rule__OperationFQN__Group_1__0
            {
            pushFollow(FOLLOW_23);
            rule__OperationFQN__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }

            }

            // InternalAdaptSem.g:7218:2: ( ( rule__OperationFQN__Group_1__0 )* )
            // InternalAdaptSem.g:7219:3: ( rule__OperationFQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:7220:3: ( rule__OperationFQN__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAdaptSem.g:7220:4: rule__OperationFQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__OperationFQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group__1__Impl"


    // $ANTLR start "rule__OperationFQN__Group_1__0"
    // InternalAdaptSem.g:7230:1: rule__OperationFQN__Group_1__0 : rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 ;
    public final void rule__OperationFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7234:1: ( rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 )
            // InternalAdaptSem.g:7235:2: rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__OperationFQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationFQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group_1__0"


    // $ANTLR start "rule__OperationFQN__Group_1__0__Impl"
    // InternalAdaptSem.g:7242:1: rule__OperationFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__OperationFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7246:1: ( ( '.' ) )
            // InternalAdaptSem.g:7247:1: ( '.' )
            {
            // InternalAdaptSem.g:7247:1: ( '.' )
            // InternalAdaptSem.g:7248:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group_1__0__Impl"


    // $ANTLR start "rule__OperationFQN__Group_1__1"
    // InternalAdaptSem.g:7257:1: rule__OperationFQN__Group_1__1 : rule__OperationFQN__Group_1__1__Impl ;
    public final void rule__OperationFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7261:1: ( rule__OperationFQN__Group_1__1__Impl )
            // InternalAdaptSem.g:7262:2: rule__OperationFQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationFQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group_1__1"


    // $ANTLR start "rule__OperationFQN__Group_1__1__Impl"
    // InternalAdaptSem.g:7268:1: rule__OperationFQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7272:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7273:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7273:1: ( RULE_ID )
            // InternalAdaptSem.g:7274:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationFQN__Group_1__1__Impl"


    // $ANTLR start "rule__AdaptiveSemantics__ModelAssignment_0"
    // InternalAdaptSem.g:7284:1: rule__AdaptiveSemantics__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__AdaptiveSemantics__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7288:1: ( ( ruleModel ) )
            // InternalAdaptSem.g:7289:2: ( ruleModel )
            {
            // InternalAdaptSem.g:7289:2: ( ruleModel )
            // InternalAdaptSem.g:7290:3: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getModelModelParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getModelModelParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__ModelAssignment_0"


    // $ANTLR start "rule__AdaptiveSemantics__ImportsAssignment_1"
    // InternalAdaptSem.g:7299:1: rule__AdaptiveSemantics__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__AdaptiveSemantics__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7303:1: ( ( ruleImport ) )
            // InternalAdaptSem.g:7304:2: ( ruleImport )
            {
            // InternalAdaptSem.g:7304:2: ( ruleImport )
            // InternalAdaptSem.g:7305:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getImportsImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__ImportsAssignment_1"


    // $ANTLR start "rule__AdaptiveSemantics__RulesAssignment_2"
    // InternalAdaptSem.g:7314:1: rule__AdaptiveSemantics__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__AdaptiveSemantics__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7318:1: ( ( ruleRule ) )
            // InternalAdaptSem.g:7319:2: ( ruleRule )
            {
            // InternalAdaptSem.g:7319:2: ( ruleRule )
            // InternalAdaptSem.g:7320:3: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getRulesRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptiveSemanticsAccess().getRulesRuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptiveSemantics__RulesAssignment_2"


    // $ANTLR start "rule__Model__ImportURIAssignment_1"
    // InternalAdaptSem.g:7329:1: rule__Model__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7333:1: ( ( ruleEString ) )
            // InternalAdaptSem.g:7334:2: ( ruleEString )
            {
            // InternalAdaptSem.g:7334:2: ( ruleEString )
            // InternalAdaptSem.g:7335:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportURIEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportURIEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportURIAssignment_1"


    // $ANTLR start "rule__Model__SemanticdomainAssignment_3"
    // InternalAdaptSem.g:7344:1: rule__Model__SemanticdomainAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Model__SemanticdomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7348:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7349:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7349:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7350:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0()); 
            }
            // InternalAdaptSem.g:7351:3: ( ruleFQN )
            // InternalAdaptSem.g:7352:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainEPackageFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSemanticdomainEPackageFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SemanticdomainAssignment_3"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalAdaptSem.g:7363:1: rule__Import__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7367:1: ( ( ruleEString ) )
            // InternalAdaptSem.g:7368:2: ( ruleEString )
            {
            // InternalAdaptSem.g:7368:2: ( ruleEString )
            // InternalAdaptSem.g:7369:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Import__NameAssignment_3"
    // InternalAdaptSem.g:7378:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7382:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7383:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7383:2: ( RULE_ID )
            // InternalAdaptSem.g:7384:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_3"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalAdaptSem.g:7393:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7397:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7398:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7398:2: ( RULE_ID )
            // InternalAdaptSem.g:7399:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__ConclusionAssignment_3"
    // InternalAdaptSem.g:7408:1: rule__Rule__ConclusionAssignment_3 : ( ruleConclusion ) ;
    public final void rule__Rule__ConclusionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7412:1: ( ( ruleConclusion ) )
            // InternalAdaptSem.g:7413:2: ( ruleConclusion )
            {
            // InternalAdaptSem.g:7413:2: ( ruleConclusion )
            // InternalAdaptSem.g:7414:3: ruleConclusion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConclusionConclusionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConclusion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConclusionConclusionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConclusionAssignment_3"


    // $ANTLR start "rule__Rule__ConditionsAssignment_4_1"
    // InternalAdaptSem.g:7423:1: rule__Rule__ConditionsAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7427:1: ( ( ruleCondition ) )
            // InternalAdaptSem.g:7428:2: ( ruleCondition )
            {
            // InternalAdaptSem.g:7428:2: ( ruleCondition )
            // InternalAdaptSem.g:7429:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionsAssignment_4_1"


    // $ANTLR start "rule__Rule__ConditionsAssignment_4_2_1"
    // InternalAdaptSem.g:7438:1: rule__Rule__ConditionsAssignment_4_2_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7442:1: ( ( ruleCondition ) )
            // InternalAdaptSem.g:7443:2: ( ruleCondition )
            {
            // InternalAdaptSem.g:7443:2: ( ruleCondition )
            // InternalAdaptSem.g:7444:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionsAssignment_4_2_1"


    // $ANTLR start "rule__Rule__PremisesAssignment_5_1"
    // InternalAdaptSem.g:7453:1: rule__Rule__PremisesAssignment_5_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7457:1: ( ( rulePremise ) )
            // InternalAdaptSem.g:7458:2: ( rulePremise )
            {
            // InternalAdaptSem.g:7458:2: ( rulePremise )
            // InternalAdaptSem.g:7459:3: rulePremise
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePremise();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PremisesAssignment_5_1"


    // $ANTLR start "rule__Rule__PremisesAssignment_5_2_1"
    // InternalAdaptSem.g:7468:1: rule__Rule__PremisesAssignment_5_2_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7472:1: ( ( rulePremise ) )
            // InternalAdaptSem.g:7473:2: ( rulePremise )
            {
            // InternalAdaptSem.g:7473:2: ( rulePremise )
            // InternalAdaptSem.g:7474:3: rulePremise
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePremise();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PremisesAssignment_5_2_1"


    // $ANTLR start "rule__Rule__BindingsAssignment_6_1"
    // InternalAdaptSem.g:7483:1: rule__Rule__BindingsAssignment_6_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7487:1: ( ( ruleBinding ) )
            // InternalAdaptSem.g:7488:2: ( ruleBinding )
            {
            // InternalAdaptSem.g:7488:2: ( ruleBinding )
            // InternalAdaptSem.g:7489:3: ruleBinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BindingsAssignment_6_1"


    // $ANTLR start "rule__Rule__BindingsAssignment_6_2_1"
    // InternalAdaptSem.g:7498:1: rule__Rule__BindingsAssignment_6_2_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7502:1: ( ( ruleBinding ) )
            // InternalAdaptSem.g:7503:2: ( ruleBinding )
            {
            // InternalAdaptSem.g:7503:2: ( ruleBinding )
            // InternalAdaptSem.g:7504:3: ruleBinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BindingsAssignment_6_2_1"


    // $ANTLR start "rule__Rule__InputsAssignment_7_1_0"
    // InternalAdaptSem.g:7513:1: rule__Rule__InputsAssignment_7_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7517:1: ( ( ruleInput ) )
            // InternalAdaptSem.g:7518:2: ( ruleInput )
            {
            // InternalAdaptSem.g:7518:2: ( ruleInput )
            // InternalAdaptSem.g:7519:3: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__InputsAssignment_7_1_0"


    // $ANTLR start "rule__Rule__OutputsAssignment_7_1_1"
    // InternalAdaptSem.g:7528:1: rule__Rule__OutputsAssignment_7_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7532:1: ( ( ruleOutput ) )
            // InternalAdaptSem.g:7533:2: ( ruleOutput )
            {
            // InternalAdaptSem.g:7533:2: ( ruleOutput )
            // InternalAdaptSem.g:7534:3: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OutputsAssignment_7_1_1"


    // $ANTLR start "rule__Rule__InputsAssignment_7_2_1_0"
    // InternalAdaptSem.g:7543:1: rule__Rule__InputsAssignment_7_2_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7547:1: ( ( ruleInput ) )
            // InternalAdaptSem.g:7548:2: ( ruleInput )
            {
            // InternalAdaptSem.g:7548:2: ( ruleInput )
            // InternalAdaptSem.g:7549:3: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__InputsAssignment_7_2_1_0"


    // $ANTLR start "rule__Rule__OutputsAssignment_7_2_1_1"
    // InternalAdaptSem.g:7558:1: rule__Rule__OutputsAssignment_7_2_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7562:1: ( ( ruleOutput ) )
            // InternalAdaptSem.g:7563:2: ( ruleOutput )
            {
            // InternalAdaptSem.g:7563:2: ( ruleOutput )
            // InternalAdaptSem.g:7564:3: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OutputsAssignment_7_2_1_1"


    // $ANTLR start "rule__Condition__CondAssignment_1"
    // InternalAdaptSem.g:7573:1: rule__Condition__CondAssignment_1 : ( ruleCondExpr ) ;
    public final void rule__Condition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7577:1: ( ( ruleCondExpr ) )
            // InternalAdaptSem.g:7578:2: ( ruleCondExpr )
            {
            // InternalAdaptSem.g:7578:2: ( ruleCondExpr )
            // InternalAdaptSem.g:7579:3: ruleCondExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCondCondExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getCondCondExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__CondAssignment_1"


    // $ANTLR start "rule__Input__AssigneeAssignment_0"
    // InternalAdaptSem.g:7588:1: rule__Input__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Input__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7592:1: ( ( ruleAssignee ) )
            // InternalAdaptSem.g:7593:2: ( ruleAssignee )
            {
            // InternalAdaptSem.g:7593:2: ( ruleAssignee )
            // InternalAdaptSem.g:7594:3: ruleAssignee
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__AssigneeAssignment_0"


    // $ANTLR start "rule__Input__OperationAssignment_2"
    // InternalAdaptSem.g:7603:1: rule__Input__OperationAssignment_2 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Input__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7607:1: ( ( ( ruleOperationFQN ) ) )
            // InternalAdaptSem.g:7608:2: ( ( ruleOperationFQN ) )
            {
            // InternalAdaptSem.g:7608:2: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:7609:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0()); 
            }
            // InternalAdaptSem.g:7610:3: ( ruleOperationFQN )
            // InternalAdaptSem.g:7611:4: ruleOperationFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationEOperationOperationFQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getOperationEOperationOperationFQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__OperationAssignment_2"


    // $ANTLR start "rule__Output__OperationAssignment_0"
    // InternalAdaptSem.g:7622:1: rule__Output__OperationAssignment_0 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Output__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7626:1: ( ( ( ruleOperationFQN ) ) )
            // InternalAdaptSem.g:7627:2: ( ( ruleOperationFQN ) )
            {
            // InternalAdaptSem.g:7627:2: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:7628:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:7629:3: ( ruleOperationFQN )
            // InternalAdaptSem.g:7630:4: ruleOperationFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationEOperationOperationFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getOperationEOperationOperationFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OperationAssignment_0"


    // $ANTLR start "rule__Output__ArgsAssignment_2_0"
    // InternalAdaptSem.g:7641:1: rule__Output__ArgsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7645:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7646:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7646:2: ( ruleTermRef )
            // InternalAdaptSem.g:7647:3: ruleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ArgsAssignment_2_0"


    // $ANTLR start "rule__Output__ArgsAssignment_2_1_1"
    // InternalAdaptSem.g:7656:1: rule__Output__ArgsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7660:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7661:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7661:2: ( ruleTermRef )
            // InternalAdaptSem.g:7662:3: ruleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__Binding__AssigneeAssignment_0"
    // InternalAdaptSem.g:7671:1: rule__Binding__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Binding__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7675:1: ( ( ruleAssignee ) )
            // InternalAdaptSem.g:7676:2: ( ruleAssignee )
            {
            // InternalAdaptSem.g:7676:2: ( ruleAssignee )
            // InternalAdaptSem.g:7677:3: ruleAssignee
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__AssigneeAssignment_0"


    // $ANTLR start "rule__Binding__ExprAssignment_2"
    // InternalAdaptSem.g:7686:1: rule__Binding__ExprAssignment_2 : ( ruleAssignable ) ;
    public final void rule__Binding__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7690:1: ( ( ruleAssignable ) )
            // InternalAdaptSem.g:7691:2: ( ruleAssignable )
            {
            // InternalAdaptSem.g:7691:2: ( ruleAssignable )
            // InternalAdaptSem.g:7692:3: ruleAssignable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExprAssignableParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getExprAssignableParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ExprAssignment_2"


    // $ANTLR start "rule__SemanticDomainAccess__RecieverAssignment_0"
    // InternalAdaptSem.g:7701:1: rule__SemanticDomainAccess__RecieverAssignment_0 : ( ruleTerminalAccessExpression ) ;
    public final void rule__SemanticDomainAccess__RecieverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7705:1: ( ( ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:7706:2: ( ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:7706:2: ( ruleTerminalAccessExpression )
            // InternalAdaptSem.g:7707:3: ruleTerminalAccessExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getRecieverTerminalAccessExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalAccessExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getRecieverTerminalAccessExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__RecieverAssignment_0"


    // $ANTLR start "rule__SemanticDomainAccess__FieldAssignment_2"
    // InternalAdaptSem.g:7716:1: rule__SemanticDomainAccess__FieldAssignment_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7720:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7721:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7721:2: ( RULE_ID )
            // InternalAdaptSem.g:7722:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getFieldIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__FieldAssignment_2"


    // $ANTLR start "rule__SemanticDomainAccess__FieldAssignment_3_2"
    // InternalAdaptSem.g:7731:1: rule__SemanticDomainAccess__FieldAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7735:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7736:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7736:2: ( RULE_ID )
            // InternalAdaptSem.g:7737:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldIDTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticDomainAccessAccess().getFieldIDTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticDomainAccess__FieldAssignment_3_2"


    // $ANTLR start "rule__Conclusion__FromAssignment_0"
    // InternalAdaptSem.g:7746:1: rule__Conclusion__FromAssignment_0 : ( ruleDefConfiguration ) ;
    public final void rule__Conclusion__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7750:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:7751:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:7751:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:7752:3: ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getFromDefConfigurationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getFromDefConfigurationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__FromAssignment_0"


    // $ANTLR start "rule__Conclusion__TerminationAssignment_2"
    // InternalAdaptSem.g:7761:1: rule__Conclusion__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Conclusion__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7765:1: ( ( ( 'termination' ) ) )
            // InternalAdaptSem.g:7766:2: ( ( 'termination' ) )
            {
            // InternalAdaptSem.g:7766:2: ( ( 'termination' ) )
            // InternalAdaptSem.g:7767:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalAdaptSem.g:7768:3: ( 'termination' )
            // InternalAdaptSem.g:7769:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__TerminationAssignment_2"


    // $ANTLR start "rule__Conclusion__ToAssignment_3"
    // InternalAdaptSem.g:7780:1: rule__Conclusion__ToAssignment_3 : ( ruleSingleTermRef ) ;
    public final void rule__Conclusion__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7784:1: ( ( ruleSingleTermRef ) )
            // InternalAdaptSem.g:7785:2: ( ruleSingleTermRef )
            {
            // InternalAdaptSem.g:7785:2: ( ruleSingleTermRef )
            // InternalAdaptSem.g:7786:3: ruleSingleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getToSingleTermRefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConclusionAccess().getToSingleTermRefParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__ToAssignment_3"


    // $ANTLR start "rule__Premise__FromAssignment_0"
    // InternalAdaptSem.g:7795:1: rule__Premise__FromAssignment_0 : ( ruleSymbolRef ) ;
    public final void rule__Premise__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7799:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:7800:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:7800:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:7801:3: ruleSymbolRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getFromSymbolRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSymbolRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getFromSymbolRefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__FromAssignment_0"


    // $ANTLR start "rule__Premise__TerminationAssignment_2"
    // InternalAdaptSem.g:7810:1: rule__Premise__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Premise__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7814:1: ( ( ( 'termination' ) ) )
            // InternalAdaptSem.g:7815:2: ( ( 'termination' ) )
            {
            // InternalAdaptSem.g:7815:2: ( ( 'termination' ) )
            // InternalAdaptSem.g:7816:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalAdaptSem.g:7817:3: ( 'termination' )
            // InternalAdaptSem.g:7818:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__TerminationAssignment_2"


    // $ANTLR start "rule__Premise__ToAssignment_3"
    // InternalAdaptSem.g:7829:1: rule__Premise__ToAssignment_3 : ( ruleSingleTermDef ) ;
    public final void rule__Premise__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7833:1: ( ( ruleSingleTermDef ) )
            // InternalAdaptSem.g:7834:2: ( ruleSingleTermDef )
            {
            // InternalAdaptSem.g:7834:2: ( ruleSingleTermDef )
            // InternalAdaptSem.g:7835:3: ruleSingleTermDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getToSingleTermDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleTermDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPremiseAccess().getToSingleTermDefParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Premise__ToAssignment_3"


    // $ANTLR start "rule__DefConfiguration__ConceptAssignment_0"
    // InternalAdaptSem.g:7844:1: rule__DefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__DefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7848:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7849:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7849:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7850:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:7851:3: ( ruleFQN )
            // InternalAdaptSem.g:7852:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptEClassFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getConceptEClassFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__ConceptAssignment_0"


    // $ANTLR start "rule__DefConfiguration__ChildsAssignment_2_0"
    // InternalAdaptSem.g:7863:1: rule__DefConfiguration__ChildsAssignment_2_0 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7867:1: ( ( ruleTermDef ) )
            // InternalAdaptSem.g:7868:2: ( ruleTermDef )
            {
            // InternalAdaptSem.g:7868:2: ( ruleTermDef )
            // InternalAdaptSem.g:7869:3: ruleTermDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__ChildsAssignment_2_0"


    // $ANTLR start "rule__DefConfiguration__ChildsAssignment_2_1_1"
    // InternalAdaptSem.g:7878:1: rule__DefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7882:1: ( ( ruleTermDef ) )
            // InternalAdaptSem.g:7883:2: ( ruleTermDef )
            {
            // InternalAdaptSem.g:7883:2: ( ruleTermDef )
            // InternalAdaptSem.g:7884:3: ruleTermDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__ChildsAssignment_2_1_1"


    // $ANTLR start "rule__RefConfiguration__ConceptAssignment_0"
    // InternalAdaptSem.g:7893:1: rule__RefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__RefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7897:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7898:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7898:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7899:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:7900:3: ( ruleFQN )
            // InternalAdaptSem.g:7901:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptEClassFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getConceptEClassFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__ConceptAssignment_0"


    // $ANTLR start "rule__RefConfiguration__ChildsAssignment_2_0"
    // InternalAdaptSem.g:7912:1: rule__RefConfiguration__ChildsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7916:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7917:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7917:2: ( ruleTermRef )
            // InternalAdaptSem.g:7918:3: ruleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__ChildsAssignment_2_0"


    // $ANTLR start "rule__RefConfiguration__ChildsAssignment_2_1_1"
    // InternalAdaptSem.g:7927:1: rule__RefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7931:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7932:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7932:2: ( ruleTermRef )
            // InternalAdaptSem.g:7933:3: ruleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefConfiguration__ChildsAssignment_2_1_1"


    // $ANTLR start "rule__SymbolDef__NameAssignment_1"
    // InternalAdaptSem.g:7942:1: rule__SymbolDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7946:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7947:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7947:2: ( RULE_ID )
            // InternalAdaptSem.g:7948:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolDefAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolDef__NameAssignment_1"


    // $ANTLR start "rule__SymbolRef__DefAssignment_1"
    // InternalAdaptSem.g:7957:1: rule__SymbolRef__DefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7961:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptSem.g:7962:2: ( ( RULE_ID ) )
            {
            // InternalAdaptSem.g:7962:2: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7963:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0()); 
            }
            // InternalAdaptSem.g:7964:3: ( RULE_ID )
            // InternalAdaptSem.g:7965:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefSymbolDefIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRefAccess().getDefSymbolDefIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolRef__DefAssignment_1"


    // $ANTLR start "rule__ListDef__HeadAssignment_1"
    // InternalAdaptSem.g:7976:1: rule__ListDef__HeadAssignment_1 : ( ruleSingleTermDef ) ;
    public final void rule__ListDef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7980:1: ( ( ruleSingleTermDef ) )
            // InternalAdaptSem.g:7981:2: ( ruleSingleTermDef )
            {
            // InternalAdaptSem.g:7981:2: ( ruleSingleTermDef )
            // InternalAdaptSem.g:7982:3: ruleSingleTermDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getHeadSingleTermDefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleTermDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getHeadSingleTermDefParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__HeadAssignment_1"


    // $ANTLR start "rule__ListDef__TailAssignment_3"
    // InternalAdaptSem.g:7991:1: rule__ListDef__TailAssignment_3 : ( ruleSymbolDef ) ;
    public final void rule__ListDef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7995:1: ( ( ruleSymbolDef ) )
            // InternalAdaptSem.g:7996:2: ( ruleSymbolDef )
            {
            // InternalAdaptSem.g:7996:2: ( ruleSymbolDef )
            // InternalAdaptSem.g:7997:3: ruleSymbolDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTailSymbolDefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSymbolDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getTailSymbolDefParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__TailAssignment_3"


    // $ANTLR start "rule__ListRef__HeadAssignment_1"
    // InternalAdaptSem.g:8006:1: rule__ListRef__HeadAssignment_1 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8010:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:8011:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:8011:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:8012:3: ruleSymbolRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getHeadSymbolRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSymbolRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getHeadSymbolRefParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__HeadAssignment_1"


    // $ANTLR start "rule__ListRef__TailAssignment_3"
    // InternalAdaptSem.g:8021:1: rule__ListRef__TailAssignment_3 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8025:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:8026:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:8026:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:8027:3: ruleSymbolRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getTailSymbolRefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSymbolRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRefAccess().getTailSymbolRefParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListRef__TailAssignment_3"


    // $ANTLR start "rule__CondNot__ExprAssignment_2"
    // InternalAdaptSem.g:8036:1: rule__CondNot__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__CondNot__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8040:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:8041:2: ( ruleExpr )
            {
            // InternalAdaptSem.g:8041:2: ( ruleExpr )
            // InternalAdaptSem.g:8042:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExprExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondNotAccess().getExprExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondNot__ExprAssignment_2"


    // $ANTLR start "rule__CondOr__LhsAssignment_1"
    // InternalAdaptSem.g:8051:1: rule__CondOr__LhsAssignment_1 : ( ruleAnd ) ;
    public final void rule__CondOr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8055:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:8056:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:8056:2: ( ruleAnd )
            // InternalAdaptSem.g:8057:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getLhsAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getLhsAndParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__LhsAssignment_1"


    // $ANTLR start "rule__CondOr__RhsAssignment_3"
    // InternalAdaptSem.g:8066:1: rule__CondOr__RhsAssignment_3 : ( ruleAnd ) ;
    public final void rule__CondOr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8070:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:8071:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:8071:2: ( ruleAnd )
            // InternalAdaptSem.g:8072:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getRhsAndParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondOrAccess().getRhsAndParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondOr__RhsAssignment_3"


    // $ANTLR start "rule__CondAnd__LhsAssignment_1"
    // InternalAdaptSem.g:8081:1: rule__CondAnd__LhsAssignment_1 : ( ruleEquality ) ;
    public final void rule__CondAnd__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8085:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:8086:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:8086:2: ( ruleEquality )
            // InternalAdaptSem.g:8087:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getLhsEqualityParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getLhsEqualityParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__LhsAssignment_1"


    // $ANTLR start "rule__CondAnd__RhsAssignment_3"
    // InternalAdaptSem.g:8096:1: rule__CondAnd__RhsAssignment_3 : ( ruleEquality ) ;
    public final void rule__CondAnd__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8100:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:8101:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:8101:2: ( ruleEquality )
            // InternalAdaptSem.g:8102:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getRhsEqualityParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondAndAccess().getRhsEqualityParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondAnd__RhsAssignment_3"


    // $ANTLR start "rule__CondEquality__LhsAssignment_0_1"
    // InternalAdaptSem.g:8111:1: rule__CondEquality__LhsAssignment_0_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8115:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8116:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8116:2: ( ruleComparison )
            // InternalAdaptSem.g:8117:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__LhsAssignment_0_1"


    // $ANTLR start "rule__CondEquality__RhsAssignment_0_3"
    // InternalAdaptSem.g:8126:1: rule__CondEquality__RhsAssignment_0_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8130:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8131:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8131:2: ( ruleComparison )
            // InternalAdaptSem.g:8132:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__RhsAssignment_0_3"


    // $ANTLR start "rule__CondEquality__LhsAssignment_1_1"
    // InternalAdaptSem.g:8141:1: rule__CondEquality__LhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8145:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8146:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8146:2: ( ruleComparison )
            // InternalAdaptSem.g:8147:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__LhsAssignment_1_1"


    // $ANTLR start "rule__CondEquality__RhsAssignment_1_3"
    // InternalAdaptSem.g:8156:1: rule__CondEquality__RhsAssignment_1_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8160:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8161:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8161:2: ( ruleComparison )
            // InternalAdaptSem.g:8162:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondEquality__RhsAssignment_1_3"


    // $ANTLR start "rule__CondComparison__LhsAssignment_0_1"
    // InternalAdaptSem.g:8171:1: rule__CondComparison__LhsAssignment_0_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8175:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8176:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8176:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8177:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__LhsAssignment_0_1"


    // $ANTLR start "rule__CondComparison__RhsAssignment_0_3"
    // InternalAdaptSem.g:8186:1: rule__CondComparison__RhsAssignment_0_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8190:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8191:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8191:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8192:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__RhsAssignment_0_3"


    // $ANTLR start "rule__CondComparison__LhsAssignment_1_1"
    // InternalAdaptSem.g:8201:1: rule__CondComparison__LhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8205:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8206:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8206:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8207:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__LhsAssignment_1_1"


    // $ANTLR start "rule__CondComparison__RhsAssignment_1_3"
    // InternalAdaptSem.g:8216:1: rule__CondComparison__RhsAssignment_1_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8220:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8221:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8221:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8222:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondComparison__RhsAssignment_1_3"


    // $ANTLR start "rule__CondIs__PatternAssignment_1"
    // InternalAdaptSem.g:8231:1: rule__CondIs__PatternAssignment_1 : ( ruleDefConfiguration ) ;
    public final void rule__CondIs__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8235:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:8236:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:8236:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:8237:3: ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getPatternDefConfigurationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getPatternDefConfigurationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__PatternAssignment_1"


    // $ANTLR start "rule__CondIs__ExprAssignment_3"
    // InternalAdaptSem.g:8246:1: rule__CondIs__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__CondIs__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8250:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:8251:2: ( ruleExpr )
            {
            // InternalAdaptSem.g:8251:2: ( ruleExpr )
            // InternalAdaptSem.g:8252:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getExprExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCondIsAccess().getExprExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondIs__ExprAssignment_3"


    // $ANTLR start "rule__Or__RhsAssignment_1_2"
    // InternalAdaptSem.g:8261:1: rule__Or__RhsAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8265:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:8266:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:8266:2: ( ruleAnd )
            // InternalAdaptSem.g:8267:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RhsAssignment_1_2"


    // $ANTLR start "rule__And__RhsAssignment_1_2"
    // InternalAdaptSem.g:8276:1: rule__And__RhsAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8280:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:8281:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:8281:2: ( ruleEquality )
            // InternalAdaptSem.g:8282:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RhsAssignment_1_2"


    // $ANTLR start "rule__Equality__RhsAssignment_1_1"
    // InternalAdaptSem.g:8291:1: rule__Equality__RhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8295:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8296:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8296:2: ( ruleComparison )
            // InternalAdaptSem.g:8297:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RhsAssignment_1_1"


    // $ANTLR start "rule__Comparison__RhsAssignment_1_1"
    // InternalAdaptSem.g:8306:1: rule__Comparison__RhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8310:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8311:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8311:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8312:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RhsAssignment_1_1"


    // $ANTLR start "rule__PlusOrMinus__RhsAssignment_1_1"
    // InternalAdaptSem.g:8321:1: rule__PlusOrMinus__RhsAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8325:1: ( ( ruleMulOrDiv ) )
            // InternalAdaptSem.g:8326:2: ( ruleMulOrDiv )
            {
            // InternalAdaptSem.g:8326:2: ( ruleMulOrDiv )
            // InternalAdaptSem.g:8327:3: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRhsMulOrDivParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRhsMulOrDivParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RhsAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RhsAssignment_1_1"
    // InternalAdaptSem.g:8336:1: rule__MulOrDiv__RhsAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8340:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8341:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8341:2: ( rulePrimary )
            // InternalAdaptSem.g:8342:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRhsPrimaryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRhsPrimaryParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RhsAssignment_1_1"


    // $ANTLR start "rule__Primary__ExprAssignment_1_2"
    // InternalAdaptSem.g:8351:1: rule__Primary__ExprAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8355:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8356:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8356:2: ( rulePrimary )
            // InternalAdaptSem.g:8357:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExprAssignment_1_2"


    // $ANTLR start "rule__Primary__ExprAssignment_2_2"
    // InternalAdaptSem.g:8366:1: rule__Primary__ExprAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8370:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8371:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8371:2: ( rulePrimary )
            // InternalAdaptSem.g:8372:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExprAssignment_2_2"


    // $ANTLR start "rule__Primary__PatternAssignment_3_1"
    // InternalAdaptSem.g:8381:1: rule__Primary__PatternAssignment_3_1 : ( ruleDefConfiguration ) ;
    public final void rule__Primary__PatternAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8385:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:8386:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:8386:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:8387:3: ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getPatternDefConfigurationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getPatternDefConfigurationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__PatternAssignment_3_1"


    // $ANTLR start "rule__Primary__ExprAssignment_3_3"
    // InternalAdaptSem.g:8396:1: rule__Primary__ExprAssignment_3_3 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8400:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8401:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8401:2: ( rulePrimary )
            // InternalAdaptSem.g:8402:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExprAssignment_3_3"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalAdaptSem.g:8411:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8415:1: ( ( RULE_INT ) )
            // InternalAdaptSem.g:8416:2: ( RULE_INT )
            {
            // InternalAdaptSem.g:8416:2: ( RULE_INT )
            // InternalAdaptSem.g:8417:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalAdaptSem.g:8426:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8430:1: ( ( RULE_DOUBLE ) )
            // InternalAdaptSem.g:8431:2: ( RULE_DOUBLE )
            {
            // InternalAdaptSem.g:8431:2: ( RULE_DOUBLE )
            // InternalAdaptSem.g:8432:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalAdaptSem.g:8441:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8445:1: ( ( RULE_STRING ) )
            // InternalAdaptSem.g:8446:2: ( RULE_STRING )
            {
            // InternalAdaptSem.g:8446:2: ( RULE_STRING )
            // InternalAdaptSem.g:8447:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // InternalAdaptSem.g:8456:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8460:1: ( ( RULE_BOOL ) )
            // InternalAdaptSem.g:8461:2: ( RULE_BOOL )
            {
            // InternalAdaptSem.g:8461:2: ( RULE_BOOL )
            // InternalAdaptSem.g:8462:3: RULE_BOOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueBOOLTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_BOOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueBOOLTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"

    // $ANTLR start synpred3_InternalAdaptSem
    public final void synpred3_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1225:2: ( ( ruleExpr ) )
        // InternalAdaptSem.g:1225:2: ( ruleExpr )
        {
        // InternalAdaptSem.g:1225:2: ( ruleExpr )
        // InternalAdaptSem.g:1226:3: ruleExpr
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAssignableAccess().getExprParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalAdaptSem

    // $ANTLR start synpred4_InternalAdaptSem
    public final void synpred4_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1231:2: ( ( ruleRefConfiguration ) )
        // InternalAdaptSem.g:1231:2: ( ruleRefConfiguration )
        {
        // InternalAdaptSem.g:1231:2: ( ruleRefConfiguration )
        // InternalAdaptSem.g:1232:3: ruleRefConfiguration
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAssignableAccess().getRefConfigurationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleRefConfiguration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalAdaptSem

    // $ANTLR start synpred13_InternalAdaptSem
    public final void synpred13_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1390:2: ( ( ruleCondOr ) )
        // InternalAdaptSem.g:1390:2: ( ruleCondOr )
        {
        // InternalAdaptSem.g:1390:2: ( ruleCondOr )
        // InternalAdaptSem.g:1391:3: ruleCondOr
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondExprAccess().getCondOrParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleCondOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalAdaptSem

    // $ANTLR start synpred14_InternalAdaptSem
    public final void synpred14_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1396:2: ( ( ruleCondAnd ) )
        // InternalAdaptSem.g:1396:2: ( ruleCondAnd )
        {
        // InternalAdaptSem.g:1396:2: ( ruleCondAnd )
        // InternalAdaptSem.g:1397:3: ruleCondAnd
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondExprAccess().getCondAndParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleCondAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalAdaptSem

    // $ANTLR start synpred15_InternalAdaptSem
    public final void synpred15_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1402:2: ( ( ruleCondEquality ) )
        // InternalAdaptSem.g:1402:2: ( ruleCondEquality )
        {
        // InternalAdaptSem.g:1402:2: ( ruleCondEquality )
        // InternalAdaptSem.g:1403:3: ruleCondEquality
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondExprAccess().getCondEqualityParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleCondEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalAdaptSem

    // $ANTLR start synpred16_InternalAdaptSem
    public final void synpred16_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1408:2: ( ( ruleCondComparison ) )
        // InternalAdaptSem.g:1408:2: ( ruleCondComparison )
        {
        // InternalAdaptSem.g:1408:2: ( ruleCondComparison )
        // InternalAdaptSem.g:1409:3: ruleCondComparison
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondExprAccess().getCondComparisonParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_2);
        ruleCondComparison();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalAdaptSem

    // $ANTLR start synpred17_InternalAdaptSem
    public final void synpred17_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1414:2: ( ( ruleCondNot ) )
        // InternalAdaptSem.g:1414:2: ( ruleCondNot )
        {
        // InternalAdaptSem.g:1414:2: ( ruleCondNot )
        // InternalAdaptSem.g:1415:3: ruleCondNot
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondExprAccess().getCondNotParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_2);
        ruleCondNot();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalAdaptSem

    // $ANTLR start synpred18_InternalAdaptSem
    public final void synpred18_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1435:2: ( ( ( rule__CondEquality__Group_0__0 ) ) )
        // InternalAdaptSem.g:1435:2: ( ( rule__CondEquality__Group_0__0 ) )
        {
        // InternalAdaptSem.g:1435:2: ( ( rule__CondEquality__Group_0__0 ) )
        // InternalAdaptSem.g:1436:3: ( rule__CondEquality__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
        }
        // InternalAdaptSem.g:1437:3: ( rule__CondEquality__Group_0__0 )
        // InternalAdaptSem.g:1437:4: rule__CondEquality__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondEquality__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalAdaptSem

    // $ANTLR start synpred19_InternalAdaptSem
    public final void synpred19_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1456:2: ( ( ( rule__CondComparison__Group_0__0 ) ) )
        // InternalAdaptSem.g:1456:2: ( ( rule__CondComparison__Group_0__0 ) )
        {
        // InternalAdaptSem.g:1456:2: ( ( rule__CondComparison__Group_0__0 ) )
        // InternalAdaptSem.g:1457:3: ( rule__CondComparison__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
        }
        // InternalAdaptSem.g:1458:3: ( rule__CondComparison__Group_0__0 )
        // InternalAdaptSem.g:1458:4: rule__CondComparison__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondComparison__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalAdaptSem

    // Delegated rules

    public final boolean synpred17_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\30\1\uffff\1\5\1\30\1\5\1\uffff\1\30";
    static final String dfa_3s = "\1\34\1\33\1\uffff\1\5\1\33\1\5\1\uffff\1\33";
    static final String dfa_4s = "\2\uffff\1\1\3\uffff\1\2\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\26\uffff\1\2",
            "\1\2\2\uffff\1\3",
            "",
            "\1\4",
            "\1\2\1\6\1\uffff\1\5",
            "\1\7",
            "",
            "\1\2\1\6\1\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1178:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );";
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1199:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_9s = "\1\53\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String dfa_11s = "\4\uffff\1\0\4\uffff\1\1\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\4\3\1\20\uffff\1\1\2\uffff\1\11\5\uffff\1\1\10\uffff\1\1",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1220:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAdaptSem()) ) {s = 1;}

                        else if ( (synpred4_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAdaptSem()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\4\11\0\6\uffff";
    static final String dfa_15s = "\1\53\11\0\6\uffff";
    static final String dfa_16s = "\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] dfa_18s = {
            "\1\7\1\4\1\5\1\6\1\10\20\uffff\1\1\2\uffff\1\11\5\uffff\1\2\10\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1385:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 14;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred14_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\1\4\11\0\2\uffff";
    static final String dfa_20s = "\1\53\11\0\2\uffff";
    static final String dfa_21s = "\12\uffff\1\1\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_23s = {
            "\1\7\1\4\1\5\1\6\1\10\20\uffff\1\1\2\uffff\1\11\5\uffff\1\2\10\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1430:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1451:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_24s = "\13\uffff";
    static final String dfa_25s = "\4\uffff\1\5\3\uffff\1\5\1\uffff\1\5";
    static final String dfa_26s = "\1\4\3\uffff\1\21\1\uffff\1\5\1\uffff\1\21\1\5\1\21";
    static final String dfa_27s = "\1\53\3\uffff\1\55\1\uffff\1\5\1\uffff\1\55\1\5\1\55";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\4\3\uffff";
    static final String dfa_29s = "\13\uffff}>";
    static final String[] dfa_30s = {
            "\1\5\1\4\3\5\20\uffff\1\1\2\uffff\1\5\5\uffff\1\2\10\uffff\1\3",
            "",
            "",
            "",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\6\7\uffff\6\5\1\uffff\4\5",
            "",
            "\1\10",
            "",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\11\7\uffff\6\5\1\uffff\4\5",
            "\1\12",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\11\7\uffff\6\5\1\uffff\4\5"
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1556:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000804120001F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000244000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000240000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400244000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400240000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000100L});

}