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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'with'", "'import'", "'as'", "'rule'", "','", "'where'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'.'", "'self'", "'->'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'termination'"
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


    // $ANTLR start "entryRuleExpr"
    // InternalAdaptSem.g:854:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalAdaptSem.g:855:1: ( ruleExpr EOF )
            // InternalAdaptSem.g:856:1: ruleExpr EOF
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
    // InternalAdaptSem.g:863:1: ruleExpr : ( ruleOr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:867:2: ( ( ruleOr ) )
            // InternalAdaptSem.g:868:2: ( ruleOr )
            {
            // InternalAdaptSem.g:868:2: ( ruleOr )
            // InternalAdaptSem.g:869:3: ruleOr
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
    // InternalAdaptSem.g:879:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalAdaptSem.g:880:1: ( ruleOr EOF )
            // InternalAdaptSem.g:881:1: ruleOr EOF
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
    // InternalAdaptSem.g:888:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:892:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalAdaptSem.g:893:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalAdaptSem.g:893:2: ( ( rule__Or__Group__0 ) )
            // InternalAdaptSem.g:894:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalAdaptSem.g:895:3: ( rule__Or__Group__0 )
            // InternalAdaptSem.g:895:4: rule__Or__Group__0
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
    // InternalAdaptSem.g:904:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalAdaptSem.g:905:1: ( ruleAnd EOF )
            // InternalAdaptSem.g:906:1: ruleAnd EOF
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
    // InternalAdaptSem.g:913:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:917:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalAdaptSem.g:918:2: ( ( rule__And__Group__0 ) )
            {
            // InternalAdaptSem.g:918:2: ( ( rule__And__Group__0 ) )
            // InternalAdaptSem.g:919:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalAdaptSem.g:920:3: ( rule__And__Group__0 )
            // InternalAdaptSem.g:920:4: rule__And__Group__0
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
    // InternalAdaptSem.g:929:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalAdaptSem.g:930:1: ( ruleEquality EOF )
            // InternalAdaptSem.g:931:1: ruleEquality EOF
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
    // InternalAdaptSem.g:938:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:942:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalAdaptSem.g:943:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalAdaptSem.g:943:2: ( ( rule__Equality__Group__0 ) )
            // InternalAdaptSem.g:944:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalAdaptSem.g:945:3: ( rule__Equality__Group__0 )
            // InternalAdaptSem.g:945:4: rule__Equality__Group__0
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
    // InternalAdaptSem.g:954:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalAdaptSem.g:955:1: ( ruleComparison EOF )
            // InternalAdaptSem.g:956:1: ruleComparison EOF
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
    // InternalAdaptSem.g:963:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:967:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalAdaptSem.g:968:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalAdaptSem.g:968:2: ( ( rule__Comparison__Group__0 ) )
            // InternalAdaptSem.g:969:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalAdaptSem.g:970:3: ( rule__Comparison__Group__0 )
            // InternalAdaptSem.g:970:4: rule__Comparison__Group__0
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
    // InternalAdaptSem.g:979:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalAdaptSem.g:980:1: ( rulePlusOrMinus EOF )
            // InternalAdaptSem.g:981:1: rulePlusOrMinus EOF
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
    // InternalAdaptSem.g:988:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:992:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalAdaptSem.g:993:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalAdaptSem.g:993:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalAdaptSem.g:994:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalAdaptSem.g:995:3: ( rule__PlusOrMinus__Group__0 )
            // InternalAdaptSem.g:995:4: rule__PlusOrMinus__Group__0
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
    // InternalAdaptSem.g:1004:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1005:1: ( ruleMulOrDiv EOF )
            // InternalAdaptSem.g:1006:1: ruleMulOrDiv EOF
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
    // InternalAdaptSem.g:1013:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1017:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalAdaptSem.g:1018:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalAdaptSem.g:1018:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalAdaptSem.g:1019:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1020:3: ( rule__MulOrDiv__Group__0 )
            // InternalAdaptSem.g:1020:4: rule__MulOrDiv__Group__0
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
    // InternalAdaptSem.g:1029:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1030:1: ( rulePrimary EOF )
            // InternalAdaptSem.g:1031:1: rulePrimary EOF
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
    // InternalAdaptSem.g:1038:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1042:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAdaptSem.g:1043:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAdaptSem.g:1043:2: ( ( rule__Primary__Alternatives ) )
            // InternalAdaptSem.g:1044:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:1045:3: ( rule__Primary__Alternatives )
            // InternalAdaptSem.g:1045:4: rule__Primary__Alternatives
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
    // InternalAdaptSem.g:1054:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1055:1: ( ruleAtomic EOF )
            // InternalAdaptSem.g:1056:1: ruleAtomic EOF
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
    // InternalAdaptSem.g:1063:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1067:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalAdaptSem.g:1068:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalAdaptSem.g:1068:2: ( ( rule__Atomic__Alternatives ) )
            // InternalAdaptSem.g:1069:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:1070:3: ( rule__Atomic__Alternatives )
            // InternalAdaptSem.g:1070:4: rule__Atomic__Alternatives
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
    // InternalAdaptSem.g:1079:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1080:1: ( ruleEString EOF )
            // InternalAdaptSem.g:1081:1: ruleEString EOF
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
    // InternalAdaptSem.g:1088:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1092:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAdaptSem.g:1093:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAdaptSem.g:1093:2: ( ( rule__EString__Alternatives ) )
            // InternalAdaptSem.g:1094:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalAdaptSem.g:1095:3: ( rule__EString__Alternatives )
            // InternalAdaptSem.g:1095:4: rule__EString__Alternatives
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
    // InternalAdaptSem.g:1104:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1105:1: ( ruleFQN EOF )
            // InternalAdaptSem.g:1106:1: ruleFQN EOF
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
    // InternalAdaptSem.g:1113:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1117:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalAdaptSem.g:1118:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalAdaptSem.g:1118:2: ( ( rule__FQN__Group__0 ) )
            // InternalAdaptSem.g:1119:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1120:3: ( rule__FQN__Group__0 )
            // InternalAdaptSem.g:1120:4: rule__FQN__Group__0
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
    // InternalAdaptSem.g:1129:1: entryRuleOperationFQN : ruleOperationFQN EOF ;
    public final void entryRuleOperationFQN() throws RecognitionException {
        try {
            // InternalAdaptSem.g:1130:1: ( ruleOperationFQN EOF )
            // InternalAdaptSem.g:1131:1: ruleOperationFQN EOF
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
    // InternalAdaptSem.g:1138:1: ruleOperationFQN : ( ( rule__OperationFQN__Group__0 ) ) ;
    public final void ruleOperationFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1142:2: ( ( ( rule__OperationFQN__Group__0 ) ) )
            // InternalAdaptSem.g:1143:2: ( ( rule__OperationFQN__Group__0 ) )
            {
            // InternalAdaptSem.g:1143:2: ( ( rule__OperationFQN__Group__0 ) )
            // InternalAdaptSem.g:1144:3: ( rule__OperationFQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup()); 
            }
            // InternalAdaptSem.g:1145:3: ( rule__OperationFQN__Group__0 )
            // InternalAdaptSem.g:1145:4: rule__OperationFQN__Group__0
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
    // InternalAdaptSem.g:1153:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1157:1: ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptSem.g:1158:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    {
                    // InternalAdaptSem.g:1158:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    // InternalAdaptSem.g:1159:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_1_0()); 
                    }
                    // InternalAdaptSem.g:1160:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    // InternalAdaptSem.g:1160:4: rule__Rule__InputsAssignment_7_1_0
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
                    // InternalAdaptSem.g:1164:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    {
                    // InternalAdaptSem.g:1164:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    // InternalAdaptSem.g:1165:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_1_1()); 
                    }
                    // InternalAdaptSem.g:1166:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    // InternalAdaptSem.g:1166:4: rule__Rule__OutputsAssignment_7_1_1
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
    // InternalAdaptSem.g:1174:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1178:1: ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptSem.g:1179:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    {
                    // InternalAdaptSem.g:1179:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    // InternalAdaptSem.g:1180:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_2_1_0()); 
                    }
                    // InternalAdaptSem.g:1181:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    // InternalAdaptSem.g:1181:4: rule__Rule__InputsAssignment_7_2_1_0
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
                    // InternalAdaptSem.g:1185:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    {
                    // InternalAdaptSem.g:1185:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    // InternalAdaptSem.g:1186:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_2_1_1()); 
                    }
                    // InternalAdaptSem.g:1187:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    // InternalAdaptSem.g:1187:4: rule__Rule__OutputsAssignment_7_2_1_1
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
    // InternalAdaptSem.g:1195:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1199:1: ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAdaptSem.g:1200:2: ( ruleExpr )
                    {
                    // InternalAdaptSem.g:1200:2: ( ruleExpr )
                    // InternalAdaptSem.g:1201:3: ruleExpr
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
                    // InternalAdaptSem.g:1206:2: ( ruleRefConfiguration )
                    {
                    // InternalAdaptSem.g:1206:2: ( ruleRefConfiguration )
                    // InternalAdaptSem.g:1207:3: ruleRefConfiguration
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
                    // InternalAdaptSem.g:1212:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1212:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1213:3: ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:1222:1: rule__Assignee__Alternatives : ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1226:1: ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==24) ) {
                    alt4=1;
                }
                else if ( (LA4_1==27) ) {
                    alt4=2;
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
                    // InternalAdaptSem.g:1227:2: ( ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1227:2: ( ruleSymbolDef )
                    // InternalAdaptSem.g:1228:3: ruleSymbolDef
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
                    // InternalAdaptSem.g:1233:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1233:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1234:3: ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:1243:1: rule__TerminalAccessExpression__Alternatives : ( ( ruleSymbolRef ) | ( ruleSelf ) );
    public final void rule__TerminalAccessExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1247:1: ( ( ruleSymbolRef ) | ( ruleSelf ) )
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
                    // InternalAdaptSem.g:1248:2: ( ruleSymbolRef )
                    {
                    // InternalAdaptSem.g:1248:2: ( ruleSymbolRef )
                    // InternalAdaptSem.g:1249:3: ruleSymbolRef
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
                    // InternalAdaptSem.g:1254:2: ( ruleSelf )
                    {
                    // InternalAdaptSem.g:1254:2: ( ruleSelf )
                    // InternalAdaptSem.g:1255:3: ruleSelf
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
    // InternalAdaptSem.g:1264:1: rule__TermDef__Alternatives : ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) );
    public final void rule__TermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1268:1: ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) )
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
                    // InternalAdaptSem.g:1269:2: ( ruleSingleTermDef )
                    {
                    // InternalAdaptSem.g:1269:2: ( ruleSingleTermDef )
                    // InternalAdaptSem.g:1270:3: ruleSingleTermDef
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
                    // InternalAdaptSem.g:1275:2: ( ruleListDef )
                    {
                    // InternalAdaptSem.g:1275:2: ( ruleListDef )
                    // InternalAdaptSem.g:1276:3: ruleListDef
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
                    // InternalAdaptSem.g:1281:2: ( ruleVoidList )
                    {
                    // InternalAdaptSem.g:1281:2: ( ruleVoidList )
                    // InternalAdaptSem.g:1282:3: ruleVoidList
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
    // InternalAdaptSem.g:1291:1: rule__TermRef__Alternatives : ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) );
    public final void rule__TermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1295:1: ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) )
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
                    // InternalAdaptSem.g:1296:2: ( ruleSingleTermRef )
                    {
                    // InternalAdaptSem.g:1296:2: ( ruleSingleTermRef )
                    // InternalAdaptSem.g:1297:3: ruleSingleTermRef
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
                    // InternalAdaptSem.g:1302:2: ( ruleListRef )
                    {
                    // InternalAdaptSem.g:1302:2: ( ruleListRef )
                    // InternalAdaptSem.g:1303:3: ruleListRef
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
                    // InternalAdaptSem.g:1308:2: ( ruleVoidList )
                    {
                    // InternalAdaptSem.g:1308:2: ( ruleVoidList )
                    // InternalAdaptSem.g:1309:3: ruleVoidList
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
    // InternalAdaptSem.g:1318:1: rule__SingleTermDef__Alternatives : ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) );
    public final void rule__SingleTermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1322:1: ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) )
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
                    // InternalAdaptSem.g:1323:2: ( ruleDefConfiguration )
                    {
                    // InternalAdaptSem.g:1323:2: ( ruleDefConfiguration )
                    // InternalAdaptSem.g:1324:3: ruleDefConfiguration
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
                    // InternalAdaptSem.g:1329:2: ( ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1329:2: ( ruleSymbolDef )
                    // InternalAdaptSem.g:1330:3: ruleSymbolDef
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
    // InternalAdaptSem.g:1339:1: rule__SingleTermRef__Alternatives : ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) );
    public final void rule__SingleTermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1343:1: ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==25||LA9_1==27) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=17 && LA9_1<=19)||(LA9_1>=21 && LA9_1<=23)||LA9_1==26) ) {
                    alt9=2;
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
                    // InternalAdaptSem.g:1344:2: ( ( ruleRefConfiguration ) )
                    {
                    // InternalAdaptSem.g:1344:2: ( ( ruleRefConfiguration ) )
                    // InternalAdaptSem.g:1345:3: ( ruleRefConfiguration )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0()); 
                    }
                    // InternalAdaptSem.g:1346:3: ( ruleRefConfiguration )
                    // InternalAdaptSem.g:1346:4: ruleRefConfiguration
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
                    // InternalAdaptSem.g:1350:2: ( ruleSymbolRef )
                    {
                    // InternalAdaptSem.g:1350:2: ( ruleSymbolRef )
                    // InternalAdaptSem.g:1351:3: ruleSymbolRef
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
    // InternalAdaptSem.g:1360:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) );
    public final void rule__CondExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1364:1: ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) )
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAdaptSem.g:1365:2: ( ruleCondOr )
                    {
                    // InternalAdaptSem.g:1365:2: ( ruleCondOr )
                    // InternalAdaptSem.g:1366:3: ruleCondOr
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
                    // InternalAdaptSem.g:1371:2: ( ruleCondAnd )
                    {
                    // InternalAdaptSem.g:1371:2: ( ruleCondAnd )
                    // InternalAdaptSem.g:1372:3: ruleCondAnd
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
                    // InternalAdaptSem.g:1377:2: ( ruleCondEquality )
                    {
                    // InternalAdaptSem.g:1377:2: ( ruleCondEquality )
                    // InternalAdaptSem.g:1378:3: ruleCondEquality
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
                    // InternalAdaptSem.g:1383:2: ( ruleCondComparison )
                    {
                    // InternalAdaptSem.g:1383:2: ( ruleCondComparison )
                    // InternalAdaptSem.g:1384:3: ruleCondComparison
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
                    // InternalAdaptSem.g:1389:2: ( ruleCondNot )
                    {
                    // InternalAdaptSem.g:1389:2: ( ruleCondNot )
                    // InternalAdaptSem.g:1390:3: ruleCondNot
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

            }
        }
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
    // InternalAdaptSem.g:1399:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );
    public final void rule__CondEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1403:1: ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalAdaptSem.g:1404:2: ( ( rule__CondEquality__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1404:2: ( ( rule__CondEquality__Group_0__0 ) )
                    // InternalAdaptSem.g:1405:3: ( rule__CondEquality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1406:3: ( rule__CondEquality__Group_0__0 )
                    // InternalAdaptSem.g:1406:4: rule__CondEquality__Group_0__0
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
                    // InternalAdaptSem.g:1410:2: ( ( rule__CondEquality__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1410:2: ( ( rule__CondEquality__Group_1__0 ) )
                    // InternalAdaptSem.g:1411:3: ( rule__CondEquality__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1412:3: ( rule__CondEquality__Group_1__0 )
                    // InternalAdaptSem.g:1412:4: rule__CondEquality__Group_1__0
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
    // InternalAdaptSem.g:1420:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );
    public final void rule__CondComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1424:1: ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAdaptSem.g:1425:2: ( ( rule__CondComparison__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1425:2: ( ( rule__CondComparison__Group_0__0 ) )
                    // InternalAdaptSem.g:1426:3: ( rule__CondComparison__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1427:3: ( rule__CondComparison__Group_0__0 )
                    // InternalAdaptSem.g:1427:4: rule__CondComparison__Group_0__0
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
                    // InternalAdaptSem.g:1431:2: ( ( rule__CondComparison__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1431:2: ( ( rule__CondComparison__Group_1__0 ) )
                    // InternalAdaptSem.g:1432:3: ( rule__CondComparison__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1433:3: ( rule__CondComparison__Group_1__0 )
                    // InternalAdaptSem.g:1433:4: rule__CondComparison__Group_1__0
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
    // InternalAdaptSem.g:1441:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1445:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
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
                    // InternalAdaptSem.g:1446:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1446:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1447:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1448:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1448:4: rule__Equality__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1452:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1452:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1453:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1454:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1454:4: rule__Equality__Group_1_0_1__0
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
    // InternalAdaptSem.g:1462:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1466:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) )
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
                    // InternalAdaptSem.g:1467:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1467:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1468:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1469:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1469:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1473:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1473:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1474:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1475:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1475:4: rule__Comparison__Group_1_0_1__0
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
    // InternalAdaptSem.g:1483:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1487:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            else if ( (LA15_0==42) ) {
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
                    // InternalAdaptSem.g:1488:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1488:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1489:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1490:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1490:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1494:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1494:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1495:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1496:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1496:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalAdaptSem.g:1504:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1508:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            else if ( (LA16_0==44) ) {
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
                    // InternalAdaptSem.g:1509:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1509:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1510:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1511:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1511:4: rule__MulOrDiv__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1515:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1515:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1516:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1517:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1517:4: rule__MulOrDiv__Group_1_0_1__0
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
    // InternalAdaptSem.g:1525:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1529:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 42:
                {
                alt17=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case 28:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdaptSem.g:1530:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1530:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalAdaptSem.g:1531:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1532:3: ( rule__Primary__Group_0__0 )
                    // InternalAdaptSem.g:1532:4: rule__Primary__Group_0__0
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
                    // InternalAdaptSem.g:1536:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1536:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalAdaptSem.g:1537:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1538:3: ( rule__Primary__Group_1__0 )
                    // InternalAdaptSem.g:1538:4: rule__Primary__Group_1__0
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
                    // InternalAdaptSem.g:1542:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAdaptSem.g:1542:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAdaptSem.g:1543:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalAdaptSem.g:1544:3: ( rule__Primary__Group_2__0 )
                    // InternalAdaptSem.g:1544:4: rule__Primary__Group_2__0
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
                    // InternalAdaptSem.g:1548:2: ( ruleAtomic )
                    {
                    // InternalAdaptSem.g:1548:2: ( ruleAtomic )
                    // InternalAdaptSem.g:1549:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); 
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
    // InternalAdaptSem.g:1558:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1562:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) )
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
                else if ( (LA18_5==EOF||LA18_5==17||(LA18_5>=20 && LA18_5<=23)||LA18_5==26||(LA18_5>=35 && LA18_5<=44)) ) {
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

                if ( (LA18_6==27) ) {
                    alt18=5;
                }
                else if ( (LA18_6==EOF||LA18_6==17||(LA18_6>=20 && LA18_6<=23)||LA18_6==26||(LA18_6>=35 && LA18_6<=44)) ) {
                    alt18=6;
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
                    // InternalAdaptSem.g:1563:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1563:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalAdaptSem.g:1564:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1565:3: ( rule__Atomic__Group_0__0 )
                    // InternalAdaptSem.g:1565:4: rule__Atomic__Group_0__0
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
                    // InternalAdaptSem.g:1569:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1569:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalAdaptSem.g:1570:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1571:3: ( rule__Atomic__Group_1__0 )
                    // InternalAdaptSem.g:1571:4: rule__Atomic__Group_1__0
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
                    // InternalAdaptSem.g:1575:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalAdaptSem.g:1575:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalAdaptSem.g:1576:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalAdaptSem.g:1577:3: ( rule__Atomic__Group_2__0 )
                    // InternalAdaptSem.g:1577:4: rule__Atomic__Group_2__0
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
                    // InternalAdaptSem.g:1581:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalAdaptSem.g:1581:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalAdaptSem.g:1582:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalAdaptSem.g:1583:3: ( rule__Atomic__Group_3__0 )
                    // InternalAdaptSem.g:1583:4: rule__Atomic__Group_3__0
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
                    // InternalAdaptSem.g:1587:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1587:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1588:3: ruleSemanticDomainAccess
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
                    // InternalAdaptSem.g:1593:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalAdaptSem.g:1593:2: ( ruleTerminalAccessExpression )
                    // InternalAdaptSem.g:1594:3: ruleTerminalAccessExpression
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
    // InternalAdaptSem.g:1603:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1607:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAdaptSem.g:1608:2: ( RULE_STRING )
                    {
                    // InternalAdaptSem.g:1608:2: ( RULE_STRING )
                    // InternalAdaptSem.g:1609:3: RULE_STRING
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
                    // InternalAdaptSem.g:1614:2: ( RULE_ID )
                    {
                    // InternalAdaptSem.g:1614:2: ( RULE_ID )
                    // InternalAdaptSem.g:1615:3: RULE_ID
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
    // InternalAdaptSem.g:1624:1: rule__AdaptiveSemantics__Group__0 : rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1 ;
    public final void rule__AdaptiveSemantics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1628:1: ( rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1 )
            // InternalAdaptSem.g:1629:2: rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1
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
    // InternalAdaptSem.g:1636:1: rule__AdaptiveSemantics__Group__0__Impl : ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) ) ;
    public final void rule__AdaptiveSemantics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1640:1: ( ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) ) )
            // InternalAdaptSem.g:1641:1: ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) )
            {
            // InternalAdaptSem.g:1641:1: ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) )
            // InternalAdaptSem.g:1642:2: ( rule__AdaptiveSemantics__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getModelAssignment_0()); 
            }
            // InternalAdaptSem.g:1643:2: ( rule__AdaptiveSemantics__ModelAssignment_0 )
            // InternalAdaptSem.g:1643:3: rule__AdaptiveSemantics__ModelAssignment_0
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
    // InternalAdaptSem.g:1651:1: rule__AdaptiveSemantics__Group__1 : rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2 ;
    public final void rule__AdaptiveSemantics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1655:1: ( rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2 )
            // InternalAdaptSem.g:1656:2: rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2
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
    // InternalAdaptSem.g:1663:1: rule__AdaptiveSemantics__Group__1__Impl : ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* ) ;
    public final void rule__AdaptiveSemantics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1667:1: ( ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* ) )
            // InternalAdaptSem.g:1668:1: ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* )
            {
            // InternalAdaptSem.g:1668:1: ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* )
            // InternalAdaptSem.g:1669:2: ( rule__AdaptiveSemantics__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getImportsAssignment_1()); 
            }
            // InternalAdaptSem.g:1670:2: ( rule__AdaptiveSemantics__ImportsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAdaptSem.g:1670:3: rule__AdaptiveSemantics__ImportsAssignment_1
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
    // InternalAdaptSem.g:1678:1: rule__AdaptiveSemantics__Group__2 : rule__AdaptiveSemantics__Group__2__Impl ;
    public final void rule__AdaptiveSemantics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1682:1: ( rule__AdaptiveSemantics__Group__2__Impl )
            // InternalAdaptSem.g:1683:2: rule__AdaptiveSemantics__Group__2__Impl
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
    // InternalAdaptSem.g:1689:1: rule__AdaptiveSemantics__Group__2__Impl : ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* ) ;
    public final void rule__AdaptiveSemantics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1693:1: ( ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* ) )
            // InternalAdaptSem.g:1694:1: ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* )
            {
            // InternalAdaptSem.g:1694:1: ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* )
            // InternalAdaptSem.g:1695:2: ( rule__AdaptiveSemantics__RulesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getRulesAssignment_2()); 
            }
            // InternalAdaptSem.g:1696:2: ( rule__AdaptiveSemantics__RulesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAdaptSem.g:1696:3: rule__AdaptiveSemantics__RulesAssignment_2
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
    // InternalAdaptSem.g:1705:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1709:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptSem.g:1710:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAdaptSem.g:1717:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1721:1: ( ( 'model' ) )
            // InternalAdaptSem.g:1722:1: ( 'model' )
            {
            // InternalAdaptSem.g:1722:1: ( 'model' )
            // InternalAdaptSem.g:1723:2: 'model'
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
    // InternalAdaptSem.g:1732:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1736:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAdaptSem.g:1737:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAdaptSem.g:1744:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportURIAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1748:1: ( ( ( rule__Model__ImportURIAssignment_1 ) ) )
            // InternalAdaptSem.g:1749:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            {
            // InternalAdaptSem.g:1749:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            // InternalAdaptSem.g:1750:2: ( rule__Model__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            }
            // InternalAdaptSem.g:1751:2: ( rule__Model__ImportURIAssignment_1 )
            // InternalAdaptSem.g:1751:3: rule__Model__ImportURIAssignment_1
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
    // InternalAdaptSem.g:1759:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1763:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAdaptSem.g:1764:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAdaptSem.g:1771:1: rule__Model__Group__2__Impl : ( 'with' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1775:1: ( ( 'with' ) )
            // InternalAdaptSem.g:1776:1: ( 'with' )
            {
            // InternalAdaptSem.g:1776:1: ( 'with' )
            // InternalAdaptSem.g:1777:2: 'with'
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
    // InternalAdaptSem.g:1786:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1790:1: ( rule__Model__Group__3__Impl )
            // InternalAdaptSem.g:1791:2: rule__Model__Group__3__Impl
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
    // InternalAdaptSem.g:1797:1: rule__Model__Group__3__Impl : ( ( rule__Model__SemanticdomainAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1801:1: ( ( ( rule__Model__SemanticdomainAssignment_3 ) ) )
            // InternalAdaptSem.g:1802:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            {
            // InternalAdaptSem.g:1802:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            // InternalAdaptSem.g:1803:2: ( rule__Model__SemanticdomainAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainAssignment_3()); 
            }
            // InternalAdaptSem.g:1804:2: ( rule__Model__SemanticdomainAssignment_3 )
            // InternalAdaptSem.g:1804:3: rule__Model__SemanticdomainAssignment_3
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
    // InternalAdaptSem.g:1813:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1817:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAdaptSem.g:1818:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAdaptSem.g:1825:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1829:1: ( ( 'import' ) )
            // InternalAdaptSem.g:1830:1: ( 'import' )
            {
            // InternalAdaptSem.g:1830:1: ( 'import' )
            // InternalAdaptSem.g:1831:2: 'import'
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
    // InternalAdaptSem.g:1840:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1844:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalAdaptSem.g:1845:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalAdaptSem.g:1852:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1856:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalAdaptSem.g:1857:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalAdaptSem.g:1857:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalAdaptSem.g:1858:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalAdaptSem.g:1859:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalAdaptSem.g:1859:3: rule__Import__ImportURIAssignment_1
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
    // InternalAdaptSem.g:1867:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1871:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalAdaptSem.g:1872:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalAdaptSem.g:1879:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1883:1: ( ( 'as' ) )
            // InternalAdaptSem.g:1884:1: ( 'as' )
            {
            // InternalAdaptSem.g:1884:1: ( 'as' )
            // InternalAdaptSem.g:1885:2: 'as'
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
    // InternalAdaptSem.g:1894:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1898:1: ( rule__Import__Group__3__Impl )
            // InternalAdaptSem.g:1899:2: rule__Import__Group__3__Impl
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
    // InternalAdaptSem.g:1905:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1909:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalAdaptSem.g:1910:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalAdaptSem.g:1910:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalAdaptSem.g:1911:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalAdaptSem.g:1912:2: ( rule__Import__NameAssignment_3 )
            // InternalAdaptSem.g:1912:3: rule__Import__NameAssignment_3
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
    // InternalAdaptSem.g:1921:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1925:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalAdaptSem.g:1926:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalAdaptSem.g:1933:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1937:1: ( ( 'rule' ) )
            // InternalAdaptSem.g:1938:1: ( 'rule' )
            {
            // InternalAdaptSem.g:1938:1: ( 'rule' )
            // InternalAdaptSem.g:1939:2: 'rule'
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
    // InternalAdaptSem.g:1948:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1952:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalAdaptSem.g:1953:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalAdaptSem.g:1960:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1964:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalAdaptSem.g:1965:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalAdaptSem.g:1965:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalAdaptSem.g:1966:2: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // InternalAdaptSem.g:1967:2: ( rule__Rule__NameAssignment_1 )
            // InternalAdaptSem.g:1967:3: rule__Rule__NameAssignment_1
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
    // InternalAdaptSem.g:1975:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1979:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalAdaptSem.g:1980:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalAdaptSem.g:1987:1: rule__Rule__Group__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1991:1: ( ( ',' ) )
            // InternalAdaptSem.g:1992:1: ( ',' )
            {
            // InternalAdaptSem.g:1992:1: ( ',' )
            // InternalAdaptSem.g:1993:2: ','
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
    // InternalAdaptSem.g:2002:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2006:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalAdaptSem.g:2007:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalAdaptSem.g:2014:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConclusionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2018:1: ( ( ( rule__Rule__ConclusionAssignment_3 ) ) )
            // InternalAdaptSem.g:2019:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            {
            // InternalAdaptSem.g:2019:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            // InternalAdaptSem.g:2020:2: ( rule__Rule__ConclusionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConclusionAssignment_3()); 
            }
            // InternalAdaptSem.g:2021:2: ( rule__Rule__ConclusionAssignment_3 )
            // InternalAdaptSem.g:2021:3: rule__Rule__ConclusionAssignment_3
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
    // InternalAdaptSem.g:2029:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2033:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalAdaptSem.g:2034:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalAdaptSem.g:2041:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2045:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalAdaptSem.g:2046:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalAdaptSem.g:2046:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalAdaptSem.g:2047:2: ( rule__Rule__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4()); 
            }
            // InternalAdaptSem.g:2048:2: ( rule__Rule__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptSem.g:2048:3: rule__Rule__Group_4__0
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
    // InternalAdaptSem.g:2056:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2060:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalAdaptSem.g:2061:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalAdaptSem.g:2068:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2072:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalAdaptSem.g:2073:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalAdaptSem.g:2073:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalAdaptSem.g:2074:2: ( rule__Rule__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5()); 
            }
            // InternalAdaptSem.g:2075:2: ( rule__Rule__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptSem.g:2075:3: rule__Rule__Group_5__0
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
    // InternalAdaptSem.g:2083:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2087:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalAdaptSem.g:2088:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
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
    // InternalAdaptSem.g:2095:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2099:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalAdaptSem.g:2100:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalAdaptSem.g:2100:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalAdaptSem.g:2101:2: ( rule__Rule__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6()); 
            }
            // InternalAdaptSem.g:2102:2: ( rule__Rule__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptSem.g:2102:3: rule__Rule__Group_6__0
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
    // InternalAdaptSem.g:2110:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2114:1: ( rule__Rule__Group__7__Impl )
            // InternalAdaptSem.g:2115:2: rule__Rule__Group__7__Impl
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
    // InternalAdaptSem.g:2121:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )? ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2125:1: ( ( ( rule__Rule__Group_7__0 )? ) )
            // InternalAdaptSem.g:2126:1: ( ( rule__Rule__Group_7__0 )? )
            {
            // InternalAdaptSem.g:2126:1: ( ( rule__Rule__Group_7__0 )? )
            // InternalAdaptSem.g:2127:2: ( rule__Rule__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7()); 
            }
            // InternalAdaptSem.g:2128:2: ( rule__Rule__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptSem.g:2128:3: rule__Rule__Group_7__0
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
    // InternalAdaptSem.g:2137:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2141:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalAdaptSem.g:2142:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
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
    // InternalAdaptSem.g:2149:1: rule__Rule__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2153:1: ( ( 'where' ) )
            // InternalAdaptSem.g:2154:1: ( 'where' )
            {
            // InternalAdaptSem.g:2154:1: ( 'where' )
            // InternalAdaptSem.g:2155:2: 'where'
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
    // InternalAdaptSem.g:2164:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2168:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalAdaptSem.g:2169:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
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
    // InternalAdaptSem.g:2176:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2180:1: ( ( ( rule__Rule__ConditionsAssignment_4_1 ) ) )
            // InternalAdaptSem.g:2181:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            {
            // InternalAdaptSem.g:2181:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            // InternalAdaptSem.g:2182:2: ( rule__Rule__ConditionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_1()); 
            }
            // InternalAdaptSem.g:2183:2: ( rule__Rule__ConditionsAssignment_4_1 )
            // InternalAdaptSem.g:2183:3: rule__Rule__ConditionsAssignment_4_1
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
    // InternalAdaptSem.g:2191:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2195:1: ( rule__Rule__Group_4__2__Impl )
            // InternalAdaptSem.g:2196:2: rule__Rule__Group_4__2__Impl
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
    // InternalAdaptSem.g:2202:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2206:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalAdaptSem.g:2207:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalAdaptSem.g:2207:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalAdaptSem.g:2208:2: ( rule__Rule__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            }
            // InternalAdaptSem.g:2209:2: ( rule__Rule__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAdaptSem.g:2209:3: rule__Rule__Group_4_2__0
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
    // InternalAdaptSem.g:2218:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2222:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalAdaptSem.g:2223:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
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
    // InternalAdaptSem.g:2230:1: rule__Rule__Group_4_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2234:1: ( ( ';' ) )
            // InternalAdaptSem.g:2235:1: ( ';' )
            {
            // InternalAdaptSem.g:2235:1: ( ';' )
            // InternalAdaptSem.g:2236:2: ';'
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
    // InternalAdaptSem.g:2245:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2249:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalAdaptSem.g:2250:2: rule__Rule__Group_4_2__1__Impl
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
    // InternalAdaptSem.g:2256:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2260:1: ( ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) )
            // InternalAdaptSem.g:2261:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            {
            // InternalAdaptSem.g:2261:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            // InternalAdaptSem.g:2262:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_2_1()); 
            }
            // InternalAdaptSem.g:2263:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            // InternalAdaptSem.g:2263:3: rule__Rule__ConditionsAssignment_4_2_1
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
    // InternalAdaptSem.g:2272:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2276:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalAdaptSem.g:2277:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
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
    // InternalAdaptSem.g:2284:1: rule__Rule__Group_5__0__Impl : ( 'resolve' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2288:1: ( ( 'resolve' ) )
            // InternalAdaptSem.g:2289:1: ( 'resolve' )
            {
            // InternalAdaptSem.g:2289:1: ( 'resolve' )
            // InternalAdaptSem.g:2290:2: 'resolve'
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
    // InternalAdaptSem.g:2299:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2303:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalAdaptSem.g:2304:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
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
    // InternalAdaptSem.g:2311:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__PremisesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2315:1: ( ( ( rule__Rule__PremisesAssignment_5_1 ) ) )
            // InternalAdaptSem.g:2316:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            {
            // InternalAdaptSem.g:2316:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            // InternalAdaptSem.g:2317:2: ( rule__Rule__PremisesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_1()); 
            }
            // InternalAdaptSem.g:2318:2: ( rule__Rule__PremisesAssignment_5_1 )
            // InternalAdaptSem.g:2318:3: rule__Rule__PremisesAssignment_5_1
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
    // InternalAdaptSem.g:2326:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2330:1: ( rule__Rule__Group_5__2__Impl )
            // InternalAdaptSem.g:2331:2: rule__Rule__Group_5__2__Impl
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
    // InternalAdaptSem.g:2337:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Group_5_2__0 )* ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2341:1: ( ( ( rule__Rule__Group_5_2__0 )* ) )
            // InternalAdaptSem.g:2342:1: ( ( rule__Rule__Group_5_2__0 )* )
            {
            // InternalAdaptSem.g:2342:1: ( ( rule__Rule__Group_5_2__0 )* )
            // InternalAdaptSem.g:2343:2: ( rule__Rule__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5_2()); 
            }
            // InternalAdaptSem.g:2344:2: ( rule__Rule__Group_5_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAdaptSem.g:2344:3: rule__Rule__Group_5_2__0
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
    // InternalAdaptSem.g:2353:1: rule__Rule__Group_5_2__0 : rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 ;
    public final void rule__Rule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2357:1: ( rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 )
            // InternalAdaptSem.g:2358:2: rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1
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
    // InternalAdaptSem.g:2365:1: rule__Rule__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2369:1: ( ( ';' ) )
            // InternalAdaptSem.g:2370:1: ( ';' )
            {
            // InternalAdaptSem.g:2370:1: ( ';' )
            // InternalAdaptSem.g:2371:2: ';'
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
    // InternalAdaptSem.g:2380:1: rule__Rule__Group_5_2__1 : rule__Rule__Group_5_2__1__Impl ;
    public final void rule__Rule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2384:1: ( rule__Rule__Group_5_2__1__Impl )
            // InternalAdaptSem.g:2385:2: rule__Rule__Group_5_2__1__Impl
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
    // InternalAdaptSem.g:2391:1: rule__Rule__Group_5_2__1__Impl : ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) ;
    public final void rule__Rule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2395:1: ( ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) )
            // InternalAdaptSem.g:2396:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            {
            // InternalAdaptSem.g:2396:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            // InternalAdaptSem.g:2397:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_2_1()); 
            }
            // InternalAdaptSem.g:2398:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            // InternalAdaptSem.g:2398:3: rule__Rule__PremisesAssignment_5_2_1
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
    // InternalAdaptSem.g:2407:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2411:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalAdaptSem.g:2412:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
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
    // InternalAdaptSem.g:2419:1: rule__Rule__Group_6__0__Impl : ( 'bind' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2423:1: ( ( 'bind' ) )
            // InternalAdaptSem.g:2424:1: ( 'bind' )
            {
            // InternalAdaptSem.g:2424:1: ( 'bind' )
            // InternalAdaptSem.g:2425:2: 'bind'
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
    // InternalAdaptSem.g:2434:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2438:1: ( rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 )
            // InternalAdaptSem.g:2439:2: rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2
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
    // InternalAdaptSem.g:2446:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__BindingsAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2450:1: ( ( ( rule__Rule__BindingsAssignment_6_1 ) ) )
            // InternalAdaptSem.g:2451:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            {
            // InternalAdaptSem.g:2451:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            // InternalAdaptSem.g:2452:2: ( rule__Rule__BindingsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_1()); 
            }
            // InternalAdaptSem.g:2453:2: ( rule__Rule__BindingsAssignment_6_1 )
            // InternalAdaptSem.g:2453:3: rule__Rule__BindingsAssignment_6_1
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
    // InternalAdaptSem.g:2461:1: rule__Rule__Group_6__2 : rule__Rule__Group_6__2__Impl ;
    public final void rule__Rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2465:1: ( rule__Rule__Group_6__2__Impl )
            // InternalAdaptSem.g:2466:2: rule__Rule__Group_6__2__Impl
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
    // InternalAdaptSem.g:2472:1: rule__Rule__Group_6__2__Impl : ( ( rule__Rule__Group_6_2__0 )* ) ;
    public final void rule__Rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2476:1: ( ( ( rule__Rule__Group_6_2__0 )* ) )
            // InternalAdaptSem.g:2477:1: ( ( rule__Rule__Group_6_2__0 )* )
            {
            // InternalAdaptSem.g:2477:1: ( ( rule__Rule__Group_6_2__0 )* )
            // InternalAdaptSem.g:2478:2: ( rule__Rule__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6_2()); 
            }
            // InternalAdaptSem.g:2479:2: ( rule__Rule__Group_6_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAdaptSem.g:2479:3: rule__Rule__Group_6_2__0
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
    // InternalAdaptSem.g:2488:1: rule__Rule__Group_6_2__0 : rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 ;
    public final void rule__Rule__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2492:1: ( rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 )
            // InternalAdaptSem.g:2493:2: rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1
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
    // InternalAdaptSem.g:2500:1: rule__Rule__Group_6_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2504:1: ( ( ';' ) )
            // InternalAdaptSem.g:2505:1: ( ';' )
            {
            // InternalAdaptSem.g:2505:1: ( ';' )
            // InternalAdaptSem.g:2506:2: ';'
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
    // InternalAdaptSem.g:2515:1: rule__Rule__Group_6_2__1 : rule__Rule__Group_6_2__1__Impl ;
    public final void rule__Rule__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2519:1: ( rule__Rule__Group_6_2__1__Impl )
            // InternalAdaptSem.g:2520:2: rule__Rule__Group_6_2__1__Impl
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
    // InternalAdaptSem.g:2526:1: rule__Rule__Group_6_2__1__Impl : ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) ;
    public final void rule__Rule__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2530:1: ( ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) )
            // InternalAdaptSem.g:2531:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            {
            // InternalAdaptSem.g:2531:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            // InternalAdaptSem.g:2532:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_2_1()); 
            }
            // InternalAdaptSem.g:2533:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            // InternalAdaptSem.g:2533:3: rule__Rule__BindingsAssignment_6_2_1
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
    // InternalAdaptSem.g:2542:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2546:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalAdaptSem.g:2547:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
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
    // InternalAdaptSem.g:2554:1: rule__Rule__Group_7__0__Impl : ( 'IO' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2558:1: ( ( 'IO' ) )
            // InternalAdaptSem.g:2559:1: ( 'IO' )
            {
            // InternalAdaptSem.g:2559:1: ( 'IO' )
            // InternalAdaptSem.g:2560:2: 'IO'
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
    // InternalAdaptSem.g:2569:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2573:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // InternalAdaptSem.g:2574:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
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
    // InternalAdaptSem.g:2581:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Alternatives_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2585:1: ( ( ( rule__Rule__Alternatives_7_1 ) ) )
            // InternalAdaptSem.g:2586:1: ( ( rule__Rule__Alternatives_7_1 ) )
            {
            // InternalAdaptSem.g:2586:1: ( ( rule__Rule__Alternatives_7_1 ) )
            // InternalAdaptSem.g:2587:2: ( rule__Rule__Alternatives_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_1()); 
            }
            // InternalAdaptSem.g:2588:2: ( rule__Rule__Alternatives_7_1 )
            // InternalAdaptSem.g:2588:3: rule__Rule__Alternatives_7_1
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
    // InternalAdaptSem.g:2596:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2600:1: ( rule__Rule__Group_7__2__Impl )
            // InternalAdaptSem.g:2601:2: rule__Rule__Group_7__2__Impl
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
    // InternalAdaptSem.g:2607:1: rule__Rule__Group_7__2__Impl : ( ( rule__Rule__Group_7_2__0 )* ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2611:1: ( ( ( rule__Rule__Group_7_2__0 )* ) )
            // InternalAdaptSem.g:2612:1: ( ( rule__Rule__Group_7_2__0 )* )
            {
            // InternalAdaptSem.g:2612:1: ( ( rule__Rule__Group_7_2__0 )* )
            // InternalAdaptSem.g:2613:2: ( rule__Rule__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7_2()); 
            }
            // InternalAdaptSem.g:2614:2: ( rule__Rule__Group_7_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdaptSem.g:2614:3: rule__Rule__Group_7_2__0
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
    // InternalAdaptSem.g:2623:1: rule__Rule__Group_7_2__0 : rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 ;
    public final void rule__Rule__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2627:1: ( rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 )
            // InternalAdaptSem.g:2628:2: rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1
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
    // InternalAdaptSem.g:2635:1: rule__Rule__Group_7_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2639:1: ( ( ';' ) )
            // InternalAdaptSem.g:2640:1: ( ';' )
            {
            // InternalAdaptSem.g:2640:1: ( ';' )
            // InternalAdaptSem.g:2641:2: ';'
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
    // InternalAdaptSem.g:2650:1: rule__Rule__Group_7_2__1 : rule__Rule__Group_7_2__1__Impl ;
    public final void rule__Rule__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2654:1: ( rule__Rule__Group_7_2__1__Impl )
            // InternalAdaptSem.g:2655:2: rule__Rule__Group_7_2__1__Impl
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
    // InternalAdaptSem.g:2661:1: rule__Rule__Group_7_2__1__Impl : ( ( rule__Rule__Alternatives_7_2_1 ) ) ;
    public final void rule__Rule__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2665:1: ( ( ( rule__Rule__Alternatives_7_2_1 ) ) )
            // InternalAdaptSem.g:2666:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            {
            // InternalAdaptSem.g:2666:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            // InternalAdaptSem.g:2667:2: ( rule__Rule__Alternatives_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_2_1()); 
            }
            // InternalAdaptSem.g:2668:2: ( rule__Rule__Alternatives_7_2_1 )
            // InternalAdaptSem.g:2668:3: rule__Rule__Alternatives_7_2_1
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
    // InternalAdaptSem.g:2677:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2681:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalAdaptSem.g:2682:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalAdaptSem.g:2689:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2693:1: ( ( () ) )
            // InternalAdaptSem.g:2694:1: ( () )
            {
            // InternalAdaptSem.g:2694:1: ( () )
            // InternalAdaptSem.g:2695:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalAdaptSem.g:2696:2: ()
            // InternalAdaptSem.g:2696:3: 
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
    // InternalAdaptSem.g:2704:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2708:1: ( rule__Condition__Group__1__Impl )
            // InternalAdaptSem.g:2709:2: rule__Condition__Group__1__Impl
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
    // InternalAdaptSem.g:2715:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CondAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2719:1: ( ( ( rule__Condition__CondAssignment_1 ) ) )
            // InternalAdaptSem.g:2720:1: ( ( rule__Condition__CondAssignment_1 ) )
            {
            // InternalAdaptSem.g:2720:1: ( ( rule__Condition__CondAssignment_1 ) )
            // InternalAdaptSem.g:2721:2: ( rule__Condition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCondAssignment_1()); 
            }
            // InternalAdaptSem.g:2722:2: ( rule__Condition__CondAssignment_1 )
            // InternalAdaptSem.g:2722:3: rule__Condition__CondAssignment_1
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
    // InternalAdaptSem.g:2731:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2735:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAdaptSem.g:2736:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalAdaptSem.g:2743:1: rule__Input__Group__0__Impl : ( ( rule__Input__AssigneeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2747:1: ( ( ( rule__Input__AssigneeAssignment_0 ) ) )
            // InternalAdaptSem.g:2748:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            {
            // InternalAdaptSem.g:2748:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            // InternalAdaptSem.g:2749:2: ( rule__Input__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAssigneeAssignment_0()); 
            }
            // InternalAdaptSem.g:2750:2: ( rule__Input__AssigneeAssignment_0 )
            // InternalAdaptSem.g:2750:3: rule__Input__AssigneeAssignment_0
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
    // InternalAdaptSem.g:2758:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2762:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAdaptSem.g:2763:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalAdaptSem.g:2770:1: rule__Input__Group__1__Impl : ( '=' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2774:1: ( ( '=' ) )
            // InternalAdaptSem.g:2775:1: ( '=' )
            {
            // InternalAdaptSem.g:2775:1: ( '=' )
            // InternalAdaptSem.g:2776:2: '='
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
    // InternalAdaptSem.g:2785:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2789:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAdaptSem.g:2790:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalAdaptSem.g:2797:1: rule__Input__Group__2__Impl : ( ( rule__Input__OperationAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2801:1: ( ( ( rule__Input__OperationAssignment_2 ) ) )
            // InternalAdaptSem.g:2802:1: ( ( rule__Input__OperationAssignment_2 ) )
            {
            // InternalAdaptSem.g:2802:1: ( ( rule__Input__OperationAssignment_2 ) )
            // InternalAdaptSem.g:2803:2: ( rule__Input__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationAssignment_2()); 
            }
            // InternalAdaptSem.g:2804:2: ( rule__Input__OperationAssignment_2 )
            // InternalAdaptSem.g:2804:3: rule__Input__OperationAssignment_2
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
    // InternalAdaptSem.g:2812:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2816:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAdaptSem.g:2817:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalAdaptSem.g:2824:1: rule__Input__Group__3__Impl : ( '(' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2828:1: ( ( '(' ) )
            // InternalAdaptSem.g:2829:1: ( '(' )
            {
            // InternalAdaptSem.g:2829:1: ( '(' )
            // InternalAdaptSem.g:2830:2: '('
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
    // InternalAdaptSem.g:2839:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2843:1: ( rule__Input__Group__4__Impl )
            // InternalAdaptSem.g:2844:2: rule__Input__Group__4__Impl
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
    // InternalAdaptSem.g:2850:1: rule__Input__Group__4__Impl : ( ')' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2854:1: ( ( ')' ) )
            // InternalAdaptSem.g:2855:1: ( ')' )
            {
            // InternalAdaptSem.g:2855:1: ( ')' )
            // InternalAdaptSem.g:2856:2: ')'
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
    // InternalAdaptSem.g:2866:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2870:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAdaptSem.g:2871:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalAdaptSem.g:2878:1: rule__Output__Group__0__Impl : ( ( rule__Output__OperationAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2882:1: ( ( ( rule__Output__OperationAssignment_0 ) ) )
            // InternalAdaptSem.g:2883:1: ( ( rule__Output__OperationAssignment_0 ) )
            {
            // InternalAdaptSem.g:2883:1: ( ( rule__Output__OperationAssignment_0 ) )
            // InternalAdaptSem.g:2884:2: ( rule__Output__OperationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationAssignment_0()); 
            }
            // InternalAdaptSem.g:2885:2: ( rule__Output__OperationAssignment_0 )
            // InternalAdaptSem.g:2885:3: rule__Output__OperationAssignment_0
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
    // InternalAdaptSem.g:2893:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2897:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAdaptSem.g:2898:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalAdaptSem.g:2905:1: rule__Output__Group__1__Impl : ( '(' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2909:1: ( ( '(' ) )
            // InternalAdaptSem.g:2910:1: ( '(' )
            {
            // InternalAdaptSem.g:2910:1: ( '(' )
            // InternalAdaptSem.g:2911:2: '('
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
    // InternalAdaptSem.g:2920:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2924:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAdaptSem.g:2925:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalAdaptSem.g:2932:1: rule__Output__Group__2__Impl : ( ( rule__Output__Group_2__0 )? ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2936:1: ( ( ( rule__Output__Group_2__0 )? ) )
            // InternalAdaptSem.g:2937:1: ( ( rule__Output__Group_2__0 )? )
            {
            // InternalAdaptSem.g:2937:1: ( ( rule__Output__Group_2__0 )? )
            // InternalAdaptSem.g:2938:2: ( rule__Output__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:2939:2: ( rule__Output__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==30||LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdaptSem.g:2939:3: rule__Output__Group_2__0
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
    // InternalAdaptSem.g:2947:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2951:1: ( rule__Output__Group__3__Impl )
            // InternalAdaptSem.g:2952:2: rule__Output__Group__3__Impl
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
    // InternalAdaptSem.g:2958:1: rule__Output__Group__3__Impl : ( ')' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2962:1: ( ( ')' ) )
            // InternalAdaptSem.g:2963:1: ( ')' )
            {
            // InternalAdaptSem.g:2963:1: ( ')' )
            // InternalAdaptSem.g:2964:2: ')'
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
    // InternalAdaptSem.g:2974:1: rule__Output__Group_2__0 : rule__Output__Group_2__0__Impl rule__Output__Group_2__1 ;
    public final void rule__Output__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2978:1: ( rule__Output__Group_2__0__Impl rule__Output__Group_2__1 )
            // InternalAdaptSem.g:2979:2: rule__Output__Group_2__0__Impl rule__Output__Group_2__1
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
    // InternalAdaptSem.g:2986:1: rule__Output__Group_2__0__Impl : ( ( rule__Output__ArgsAssignment_2_0 ) ) ;
    public final void rule__Output__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2990:1: ( ( ( rule__Output__ArgsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:2991:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:2991:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            // InternalAdaptSem.g:2992:2: ( rule__Output__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:2993:2: ( rule__Output__ArgsAssignment_2_0 )
            // InternalAdaptSem.g:2993:3: rule__Output__ArgsAssignment_2_0
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
    // InternalAdaptSem.g:3001:1: rule__Output__Group_2__1 : rule__Output__Group_2__1__Impl ;
    public final void rule__Output__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3005:1: ( rule__Output__Group_2__1__Impl )
            // InternalAdaptSem.g:3006:2: rule__Output__Group_2__1__Impl
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
    // InternalAdaptSem.g:3012:1: rule__Output__Group_2__1__Impl : ( ( rule__Output__Group_2_1__0 )* ) ;
    public final void rule__Output__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3016:1: ( ( ( rule__Output__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:3017:1: ( ( rule__Output__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:3017:1: ( ( rule__Output__Group_2_1__0 )* )
            // InternalAdaptSem.g:3018:2: ( rule__Output__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:3019:2: ( rule__Output__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAdaptSem.g:3019:3: rule__Output__Group_2_1__0
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
    // InternalAdaptSem.g:3028:1: rule__Output__Group_2_1__0 : rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 ;
    public final void rule__Output__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3032:1: ( rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 )
            // InternalAdaptSem.g:3033:2: rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1
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
    // InternalAdaptSem.g:3040:1: rule__Output__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3044:1: ( ( ',' ) )
            // InternalAdaptSem.g:3045:1: ( ',' )
            {
            // InternalAdaptSem.g:3045:1: ( ',' )
            // InternalAdaptSem.g:3046:2: ','
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
    // InternalAdaptSem.g:3055:1: rule__Output__Group_2_1__1 : rule__Output__Group_2_1__1__Impl ;
    public final void rule__Output__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3059:1: ( rule__Output__Group_2_1__1__Impl )
            // InternalAdaptSem.g:3060:2: rule__Output__Group_2_1__1__Impl
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
    // InternalAdaptSem.g:3066:1: rule__Output__Group_2_1__1__Impl : ( ( rule__Output__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Output__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3070:1: ( ( ( rule__Output__ArgsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:3071:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:3071:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:3072:2: ( rule__Output__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:3073:2: ( rule__Output__ArgsAssignment_2_1_1 )
            // InternalAdaptSem.g:3073:3: rule__Output__ArgsAssignment_2_1_1
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
    // InternalAdaptSem.g:3082:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3086:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalAdaptSem.g:3087:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalAdaptSem.g:3094:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__AssigneeAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3098:1: ( ( ( rule__Binding__AssigneeAssignment_0 ) ) )
            // InternalAdaptSem.g:3099:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            {
            // InternalAdaptSem.g:3099:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            // InternalAdaptSem.g:3100:2: ( rule__Binding__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getAssigneeAssignment_0()); 
            }
            // InternalAdaptSem.g:3101:2: ( rule__Binding__AssigneeAssignment_0 )
            // InternalAdaptSem.g:3101:3: rule__Binding__AssigneeAssignment_0
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
    // InternalAdaptSem.g:3109:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3113:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalAdaptSem.g:3114:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalAdaptSem.g:3121:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3125:1: ( ( '=' ) )
            // InternalAdaptSem.g:3126:1: ( '=' )
            {
            // InternalAdaptSem.g:3126:1: ( '=' )
            // InternalAdaptSem.g:3127:2: '='
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
    // InternalAdaptSem.g:3136:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3140:1: ( rule__Binding__Group__2__Impl )
            // InternalAdaptSem.g:3141:2: rule__Binding__Group__2__Impl
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
    // InternalAdaptSem.g:3147:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ExprAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3151:1: ( ( ( rule__Binding__ExprAssignment_2 ) ) )
            // InternalAdaptSem.g:3152:1: ( ( rule__Binding__ExprAssignment_2 ) )
            {
            // InternalAdaptSem.g:3152:1: ( ( rule__Binding__ExprAssignment_2 ) )
            // InternalAdaptSem.g:3153:2: ( rule__Binding__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            }
            // InternalAdaptSem.g:3154:2: ( rule__Binding__ExprAssignment_2 )
            // InternalAdaptSem.g:3154:3: rule__Binding__ExprAssignment_2
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
    // InternalAdaptSem.g:3163:1: rule__SemanticDomainAccess__Group__0 : rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 ;
    public final void rule__SemanticDomainAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3167:1: ( rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 )
            // InternalAdaptSem.g:3168:2: rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1
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
    // InternalAdaptSem.g:3175:1: rule__SemanticDomainAccess__Group__0__Impl : ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) ;
    public final void rule__SemanticDomainAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3179:1: ( ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) )
            // InternalAdaptSem.g:3180:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            {
            // InternalAdaptSem.g:3180:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            // InternalAdaptSem.g:3181:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getRecieverAssignment_0()); 
            }
            // InternalAdaptSem.g:3182:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            // InternalAdaptSem.g:3182:3: rule__SemanticDomainAccess__RecieverAssignment_0
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
    // InternalAdaptSem.g:3190:1: rule__SemanticDomainAccess__Group__1 : rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 ;
    public final void rule__SemanticDomainAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3194:1: ( rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 )
            // InternalAdaptSem.g:3195:2: rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2
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
    // InternalAdaptSem.g:3202:1: rule__SemanticDomainAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3206:1: ( ( '.' ) )
            // InternalAdaptSem.g:3207:1: ( '.' )
            {
            // InternalAdaptSem.g:3207:1: ( '.' )
            // InternalAdaptSem.g:3208:2: '.'
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
    // InternalAdaptSem.g:3217:1: rule__SemanticDomainAccess__Group__2 : rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 ;
    public final void rule__SemanticDomainAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3221:1: ( rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 )
            // InternalAdaptSem.g:3222:2: rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3
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
    // InternalAdaptSem.g:3229:1: rule__SemanticDomainAccess__Group__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3233:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) )
            // InternalAdaptSem.g:3234:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            {
            // InternalAdaptSem.g:3234:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            // InternalAdaptSem.g:3235:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_2()); 
            }
            // InternalAdaptSem.g:3236:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            // InternalAdaptSem.g:3236:3: rule__SemanticDomainAccess__FieldAssignment_2
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
    // InternalAdaptSem.g:3244:1: rule__SemanticDomainAccess__Group__3 : rule__SemanticDomainAccess__Group__3__Impl ;
    public final void rule__SemanticDomainAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3248:1: ( rule__SemanticDomainAccess__Group__3__Impl )
            // InternalAdaptSem.g:3249:2: rule__SemanticDomainAccess__Group__3__Impl
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
    // InternalAdaptSem.g:3255:1: rule__SemanticDomainAccess__Group__3__Impl : ( ( rule__SemanticDomainAccess__Group_3__0 )* ) ;
    public final void rule__SemanticDomainAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3259:1: ( ( ( rule__SemanticDomainAccess__Group_3__0 )* ) )
            // InternalAdaptSem.g:3260:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            {
            // InternalAdaptSem.g:3260:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            // InternalAdaptSem.g:3261:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup_3()); 
            }
            // InternalAdaptSem.g:3262:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAdaptSem.g:3262:3: rule__SemanticDomainAccess__Group_3__0
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
    // InternalAdaptSem.g:3271:1: rule__SemanticDomainAccess__Group_3__0 : rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 ;
    public final void rule__SemanticDomainAccess__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3275:1: ( rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 )
            // InternalAdaptSem.g:3276:2: rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1
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
    // InternalAdaptSem.g:3283:1: rule__SemanticDomainAccess__Group_3__0__Impl : ( () ) ;
    public final void rule__SemanticDomainAccess__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3287:1: ( ( () ) )
            // InternalAdaptSem.g:3288:1: ( () )
            {
            // InternalAdaptSem.g:3288:1: ( () )
            // InternalAdaptSem.g:3289:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0()); 
            }
            // InternalAdaptSem.g:3290:2: ()
            // InternalAdaptSem.g:3290:3: 
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
    // InternalAdaptSem.g:3298:1: rule__SemanticDomainAccess__Group_3__1 : rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 ;
    public final void rule__SemanticDomainAccess__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3302:1: ( rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 )
            // InternalAdaptSem.g:3303:2: rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2
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
    // InternalAdaptSem.g:3310:1: rule__SemanticDomainAccess__Group_3__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3314:1: ( ( '.' ) )
            // InternalAdaptSem.g:3315:1: ( '.' )
            {
            // InternalAdaptSem.g:3315:1: ( '.' )
            // InternalAdaptSem.g:3316:2: '.'
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
    // InternalAdaptSem.g:3325:1: rule__SemanticDomainAccess__Group_3__2 : rule__SemanticDomainAccess__Group_3__2__Impl ;
    public final void rule__SemanticDomainAccess__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3329:1: ( rule__SemanticDomainAccess__Group_3__2__Impl )
            // InternalAdaptSem.g:3330:2: rule__SemanticDomainAccess__Group_3__2__Impl
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
    // InternalAdaptSem.g:3336:1: rule__SemanticDomainAccess__Group_3__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3340:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) )
            // InternalAdaptSem.g:3341:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            {
            // InternalAdaptSem.g:3341:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            // InternalAdaptSem.g:3342:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_3_2()); 
            }
            // InternalAdaptSem.g:3343:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            // InternalAdaptSem.g:3343:3: rule__SemanticDomainAccess__FieldAssignment_3_2
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
    // InternalAdaptSem.g:3352:1: rule__Self__Group__0 : rule__Self__Group__0__Impl rule__Self__Group__1 ;
    public final void rule__Self__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3356:1: ( rule__Self__Group__0__Impl rule__Self__Group__1 )
            // InternalAdaptSem.g:3357:2: rule__Self__Group__0__Impl rule__Self__Group__1
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
    // InternalAdaptSem.g:3364:1: rule__Self__Group__0__Impl : ( () ) ;
    public final void rule__Self__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3368:1: ( ( () ) )
            // InternalAdaptSem.g:3369:1: ( () )
            {
            // InternalAdaptSem.g:3369:1: ( () )
            // InternalAdaptSem.g:3370:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfAction_0()); 
            }
            // InternalAdaptSem.g:3371:2: ()
            // InternalAdaptSem.g:3371:3: 
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
    // InternalAdaptSem.g:3379:1: rule__Self__Group__1 : rule__Self__Group__1__Impl ;
    public final void rule__Self__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3383:1: ( rule__Self__Group__1__Impl )
            // InternalAdaptSem.g:3384:2: rule__Self__Group__1__Impl
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
    // InternalAdaptSem.g:3390:1: rule__Self__Group__1__Impl : ( 'self' ) ;
    public final void rule__Self__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3394:1: ( ( 'self' ) )
            // InternalAdaptSem.g:3395:1: ( 'self' )
            {
            // InternalAdaptSem.g:3395:1: ( 'self' )
            // InternalAdaptSem.g:3396:2: 'self'
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
    // InternalAdaptSem.g:3406:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3410:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalAdaptSem.g:3411:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
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
    // InternalAdaptSem.g:3418:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__FromAssignment_0 ) ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3422:1: ( ( ( rule__Conclusion__FromAssignment_0 ) ) )
            // InternalAdaptSem.g:3423:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            {
            // InternalAdaptSem.g:3423:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            // InternalAdaptSem.g:3424:2: ( rule__Conclusion__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getFromAssignment_0()); 
            }
            // InternalAdaptSem.g:3425:2: ( rule__Conclusion__FromAssignment_0 )
            // InternalAdaptSem.g:3425:3: rule__Conclusion__FromAssignment_0
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
    // InternalAdaptSem.g:3433:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3437:1: ( rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 )
            // InternalAdaptSem.g:3438:2: rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2
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
    // InternalAdaptSem.g:3445:1: rule__Conclusion__Group__1__Impl : ( '->' ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3449:1: ( ( '->' ) )
            // InternalAdaptSem.g:3450:1: ( '->' )
            {
            // InternalAdaptSem.g:3450:1: ( '->' )
            // InternalAdaptSem.g:3451:2: '->'
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
    // InternalAdaptSem.g:3460:1: rule__Conclusion__Group__2 : rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 ;
    public final void rule__Conclusion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3464:1: ( rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 )
            // InternalAdaptSem.g:3465:2: rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3
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
    // InternalAdaptSem.g:3472:1: rule__Conclusion__Group__2__Impl : ( ( rule__Conclusion__TerminationAssignment_2 )? ) ;
    public final void rule__Conclusion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3476:1: ( ( ( rule__Conclusion__TerminationAssignment_2 )? ) )
            // InternalAdaptSem.g:3477:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            {
            // InternalAdaptSem.g:3477:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            // InternalAdaptSem.g:3478:2: ( rule__Conclusion__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationAssignment_2()); 
            }
            // InternalAdaptSem.g:3479:2: ( rule__Conclusion__TerminationAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdaptSem.g:3479:3: rule__Conclusion__TerminationAssignment_2
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
    // InternalAdaptSem.g:3487:1: rule__Conclusion__Group__3 : rule__Conclusion__Group__3__Impl ;
    public final void rule__Conclusion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3491:1: ( rule__Conclusion__Group__3__Impl )
            // InternalAdaptSem.g:3492:2: rule__Conclusion__Group__3__Impl
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
    // InternalAdaptSem.g:3498:1: rule__Conclusion__Group__3__Impl : ( ( rule__Conclusion__ToAssignment_3 ) ) ;
    public final void rule__Conclusion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3502:1: ( ( ( rule__Conclusion__ToAssignment_3 ) ) )
            // InternalAdaptSem.g:3503:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            {
            // InternalAdaptSem.g:3503:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            // InternalAdaptSem.g:3504:2: ( rule__Conclusion__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getToAssignment_3()); 
            }
            // InternalAdaptSem.g:3505:2: ( rule__Conclusion__ToAssignment_3 )
            // InternalAdaptSem.g:3505:3: rule__Conclusion__ToAssignment_3
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
    // InternalAdaptSem.g:3514:1: rule__Premise__Group__0 : rule__Premise__Group__0__Impl rule__Premise__Group__1 ;
    public final void rule__Premise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3518:1: ( rule__Premise__Group__0__Impl rule__Premise__Group__1 )
            // InternalAdaptSem.g:3519:2: rule__Premise__Group__0__Impl rule__Premise__Group__1
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
    // InternalAdaptSem.g:3526:1: rule__Premise__Group__0__Impl : ( ( rule__Premise__FromAssignment_0 ) ) ;
    public final void rule__Premise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3530:1: ( ( ( rule__Premise__FromAssignment_0 ) ) )
            // InternalAdaptSem.g:3531:1: ( ( rule__Premise__FromAssignment_0 ) )
            {
            // InternalAdaptSem.g:3531:1: ( ( rule__Premise__FromAssignment_0 ) )
            // InternalAdaptSem.g:3532:2: ( rule__Premise__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getFromAssignment_0()); 
            }
            // InternalAdaptSem.g:3533:2: ( rule__Premise__FromAssignment_0 )
            // InternalAdaptSem.g:3533:3: rule__Premise__FromAssignment_0
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
    // InternalAdaptSem.g:3541:1: rule__Premise__Group__1 : rule__Premise__Group__1__Impl rule__Premise__Group__2 ;
    public final void rule__Premise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3545:1: ( rule__Premise__Group__1__Impl rule__Premise__Group__2 )
            // InternalAdaptSem.g:3546:2: rule__Premise__Group__1__Impl rule__Premise__Group__2
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
    // InternalAdaptSem.g:3553:1: rule__Premise__Group__1__Impl : ( '->' ) ;
    public final void rule__Premise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3557:1: ( ( '->' ) )
            // InternalAdaptSem.g:3558:1: ( '->' )
            {
            // InternalAdaptSem.g:3558:1: ( '->' )
            // InternalAdaptSem.g:3559:2: '->'
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
    // InternalAdaptSem.g:3568:1: rule__Premise__Group__2 : rule__Premise__Group__2__Impl rule__Premise__Group__3 ;
    public final void rule__Premise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3572:1: ( rule__Premise__Group__2__Impl rule__Premise__Group__3 )
            // InternalAdaptSem.g:3573:2: rule__Premise__Group__2__Impl rule__Premise__Group__3
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
    // InternalAdaptSem.g:3580:1: rule__Premise__Group__2__Impl : ( ( rule__Premise__TerminationAssignment_2 )? ) ;
    public final void rule__Premise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3584:1: ( ( ( rule__Premise__TerminationAssignment_2 )? ) )
            // InternalAdaptSem.g:3585:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            {
            // InternalAdaptSem.g:3585:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            // InternalAdaptSem.g:3586:2: ( rule__Premise__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationAssignment_2()); 
            }
            // InternalAdaptSem.g:3587:2: ( rule__Premise__TerminationAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdaptSem.g:3587:3: rule__Premise__TerminationAssignment_2
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
    // InternalAdaptSem.g:3595:1: rule__Premise__Group__3 : rule__Premise__Group__3__Impl ;
    public final void rule__Premise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3599:1: ( rule__Premise__Group__3__Impl )
            // InternalAdaptSem.g:3600:2: rule__Premise__Group__3__Impl
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
    // InternalAdaptSem.g:3606:1: rule__Premise__Group__3__Impl : ( ( rule__Premise__ToAssignment_3 ) ) ;
    public final void rule__Premise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3610:1: ( ( ( rule__Premise__ToAssignment_3 ) ) )
            // InternalAdaptSem.g:3611:1: ( ( rule__Premise__ToAssignment_3 ) )
            {
            // InternalAdaptSem.g:3611:1: ( ( rule__Premise__ToAssignment_3 ) )
            // InternalAdaptSem.g:3612:2: ( rule__Premise__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getToAssignment_3()); 
            }
            // InternalAdaptSem.g:3613:2: ( rule__Premise__ToAssignment_3 )
            // InternalAdaptSem.g:3613:3: rule__Premise__ToAssignment_3
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
    // InternalAdaptSem.g:3622:1: rule__DefConfiguration__Group__0 : rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 ;
    public final void rule__DefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3626:1: ( rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 )
            // InternalAdaptSem.g:3627:2: rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1
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
    // InternalAdaptSem.g:3634:1: rule__DefConfiguration__Group__0__Impl : ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__DefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3638:1: ( ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) )
            // InternalAdaptSem.g:3639:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalAdaptSem.g:3639:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            // InternalAdaptSem.g:3640:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalAdaptSem.g:3641:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            // InternalAdaptSem.g:3641:3: rule__DefConfiguration__ConceptAssignment_0
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
    // InternalAdaptSem.g:3649:1: rule__DefConfiguration__Group__1 : rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 ;
    public final void rule__DefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3653:1: ( rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 )
            // InternalAdaptSem.g:3654:2: rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2
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
    // InternalAdaptSem.g:3661:1: rule__DefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__DefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3665:1: ( ( '(' ) )
            // InternalAdaptSem.g:3666:1: ( '(' )
            {
            // InternalAdaptSem.g:3666:1: ( '(' )
            // InternalAdaptSem.g:3667:2: '('
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
    // InternalAdaptSem.g:3676:1: rule__DefConfiguration__Group__2 : rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 ;
    public final void rule__DefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3680:1: ( rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 )
            // InternalAdaptSem.g:3681:2: rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3
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
    // InternalAdaptSem.g:3688:1: rule__DefConfiguration__Group__2__Impl : ( ( rule__DefConfiguration__Group_2__0 )? ) ;
    public final void rule__DefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3692:1: ( ( ( rule__DefConfiguration__Group_2__0 )? ) )
            // InternalAdaptSem.g:3693:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            {
            // InternalAdaptSem.g:3693:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            // InternalAdaptSem.g:3694:2: ( rule__DefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:3695:2: ( rule__DefConfiguration__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==30||LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAdaptSem.g:3695:3: rule__DefConfiguration__Group_2__0
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
    // InternalAdaptSem.g:3703:1: rule__DefConfiguration__Group__3 : rule__DefConfiguration__Group__3__Impl ;
    public final void rule__DefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3707:1: ( rule__DefConfiguration__Group__3__Impl )
            // InternalAdaptSem.g:3708:2: rule__DefConfiguration__Group__3__Impl
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
    // InternalAdaptSem.g:3714:1: rule__DefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__DefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3718:1: ( ( ')' ) )
            // InternalAdaptSem.g:3719:1: ( ')' )
            {
            // InternalAdaptSem.g:3719:1: ( ')' )
            // InternalAdaptSem.g:3720:2: ')'
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
    // InternalAdaptSem.g:3730:1: rule__DefConfiguration__Group_2__0 : rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 ;
    public final void rule__DefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3734:1: ( rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 )
            // InternalAdaptSem.g:3735:2: rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1
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
    // InternalAdaptSem.g:3742:1: rule__DefConfiguration__Group_2__0__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__DefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3746:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:3747:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:3747:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            // InternalAdaptSem.g:3748:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:3749:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            // InternalAdaptSem.g:3749:3: rule__DefConfiguration__ChildsAssignment_2_0
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
    // InternalAdaptSem.g:3757:1: rule__DefConfiguration__Group_2__1 : rule__DefConfiguration__Group_2__1__Impl ;
    public final void rule__DefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3761:1: ( rule__DefConfiguration__Group_2__1__Impl )
            // InternalAdaptSem.g:3762:2: rule__DefConfiguration__Group_2__1__Impl
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
    // InternalAdaptSem.g:3768:1: rule__DefConfiguration__Group_2__1__Impl : ( ( rule__DefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__DefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3772:1: ( ( ( rule__DefConfiguration__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:3773:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:3773:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            // InternalAdaptSem.g:3774:2: ( rule__DefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:3775:2: ( rule__DefConfiguration__Group_2_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==18) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAdaptSem.g:3775:3: rule__DefConfiguration__Group_2_1__0
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
    // InternalAdaptSem.g:3784:1: rule__DefConfiguration__Group_2_1__0 : rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 ;
    public final void rule__DefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3788:1: ( rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 )
            // InternalAdaptSem.g:3789:2: rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1
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
    // InternalAdaptSem.g:3796:1: rule__DefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3800:1: ( ( ',' ) )
            // InternalAdaptSem.g:3801:1: ( ',' )
            {
            // InternalAdaptSem.g:3801:1: ( ',' )
            // InternalAdaptSem.g:3802:2: ','
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
    // InternalAdaptSem.g:3811:1: rule__DefConfiguration__Group_2_1__1 : rule__DefConfiguration__Group_2_1__1__Impl ;
    public final void rule__DefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3815:1: ( rule__DefConfiguration__Group_2_1__1__Impl )
            // InternalAdaptSem.g:3816:2: rule__DefConfiguration__Group_2_1__1__Impl
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
    // InternalAdaptSem.g:3822:1: rule__DefConfiguration__Group_2_1__1__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__DefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3826:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:3827:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:3827:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:3828:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:3829:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            // InternalAdaptSem.g:3829:3: rule__DefConfiguration__ChildsAssignment_2_1_1
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
    // InternalAdaptSem.g:3838:1: rule__RefConfiguration__Group__0 : rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 ;
    public final void rule__RefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3842:1: ( rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 )
            // InternalAdaptSem.g:3843:2: rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1
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
    // InternalAdaptSem.g:3850:1: rule__RefConfiguration__Group__0__Impl : ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__RefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3854:1: ( ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) )
            // InternalAdaptSem.g:3855:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalAdaptSem.g:3855:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            // InternalAdaptSem.g:3856:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalAdaptSem.g:3857:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            // InternalAdaptSem.g:3857:3: rule__RefConfiguration__ConceptAssignment_0
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
    // InternalAdaptSem.g:3865:1: rule__RefConfiguration__Group__1 : rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 ;
    public final void rule__RefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3869:1: ( rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 )
            // InternalAdaptSem.g:3870:2: rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2
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
    // InternalAdaptSem.g:3877:1: rule__RefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__RefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3881:1: ( ( '(' ) )
            // InternalAdaptSem.g:3882:1: ( '(' )
            {
            // InternalAdaptSem.g:3882:1: ( '(' )
            // InternalAdaptSem.g:3883:2: '('
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
    // InternalAdaptSem.g:3892:1: rule__RefConfiguration__Group__2 : rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 ;
    public final void rule__RefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3896:1: ( rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 )
            // InternalAdaptSem.g:3897:2: rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3
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
    // InternalAdaptSem.g:3904:1: rule__RefConfiguration__Group__2__Impl : ( ( rule__RefConfiguration__Group_2__0 )? ) ;
    public final void rule__RefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3908:1: ( ( ( rule__RefConfiguration__Group_2__0 )? ) )
            // InternalAdaptSem.g:3909:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            {
            // InternalAdaptSem.g:3909:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            // InternalAdaptSem.g:3910:2: ( rule__RefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:3911:2: ( rule__RefConfiguration__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==30||LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAdaptSem.g:3911:3: rule__RefConfiguration__Group_2__0
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
    // InternalAdaptSem.g:3919:1: rule__RefConfiguration__Group__3 : rule__RefConfiguration__Group__3__Impl ;
    public final void rule__RefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3923:1: ( rule__RefConfiguration__Group__3__Impl )
            // InternalAdaptSem.g:3924:2: rule__RefConfiguration__Group__3__Impl
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
    // InternalAdaptSem.g:3930:1: rule__RefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__RefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3934:1: ( ( ')' ) )
            // InternalAdaptSem.g:3935:1: ( ')' )
            {
            // InternalAdaptSem.g:3935:1: ( ')' )
            // InternalAdaptSem.g:3936:2: ')'
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
    // InternalAdaptSem.g:3946:1: rule__RefConfiguration__Group_2__0 : rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 ;
    public final void rule__RefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3950:1: ( rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 )
            // InternalAdaptSem.g:3951:2: rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1
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
    // InternalAdaptSem.g:3958:1: rule__RefConfiguration__Group_2__0__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__RefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3962:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:3963:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:3963:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            // InternalAdaptSem.g:3964:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:3965:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            // InternalAdaptSem.g:3965:3: rule__RefConfiguration__ChildsAssignment_2_0
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
    // InternalAdaptSem.g:3973:1: rule__RefConfiguration__Group_2__1 : rule__RefConfiguration__Group_2__1__Impl ;
    public final void rule__RefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3977:1: ( rule__RefConfiguration__Group_2__1__Impl )
            // InternalAdaptSem.g:3978:2: rule__RefConfiguration__Group_2__1__Impl
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
    // InternalAdaptSem.g:3984:1: rule__RefConfiguration__Group_2__1__Impl : ( ( rule__RefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__RefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3988:1: ( ( ( rule__RefConfiguration__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:3989:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:3989:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            // InternalAdaptSem.g:3990:2: ( rule__RefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:3991:2: ( rule__RefConfiguration__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==18) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAdaptSem.g:3991:3: rule__RefConfiguration__Group_2_1__0
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
    // InternalAdaptSem.g:4000:1: rule__RefConfiguration__Group_2_1__0 : rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 ;
    public final void rule__RefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4004:1: ( rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 )
            // InternalAdaptSem.g:4005:2: rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1
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
    // InternalAdaptSem.g:4012:1: rule__RefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__RefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4016:1: ( ( ',' ) )
            // InternalAdaptSem.g:4017:1: ( ',' )
            {
            // InternalAdaptSem.g:4017:1: ( ',' )
            // InternalAdaptSem.g:4018:2: ','
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
    // InternalAdaptSem.g:4027:1: rule__RefConfiguration__Group_2_1__1 : rule__RefConfiguration__Group_2_1__1__Impl ;
    public final void rule__RefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4031:1: ( rule__RefConfiguration__Group_2_1__1__Impl )
            // InternalAdaptSem.g:4032:2: rule__RefConfiguration__Group_2_1__1__Impl
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
    // InternalAdaptSem.g:4038:1: rule__RefConfiguration__Group_2_1__1__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__RefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4042:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:4043:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:4043:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:4044:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:4045:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            // InternalAdaptSem.g:4045:3: rule__RefConfiguration__ChildsAssignment_2_1_1
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
    // InternalAdaptSem.g:4054:1: rule__SymbolDef__Group__0 : rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 ;
    public final void rule__SymbolDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4058:1: ( rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 )
            // InternalAdaptSem.g:4059:2: rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1
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
    // InternalAdaptSem.g:4066:1: rule__SymbolDef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4070:1: ( ( () ) )
            // InternalAdaptSem.g:4071:1: ( () )
            {
            // InternalAdaptSem.g:4071:1: ( () )
            // InternalAdaptSem.g:4072:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getSymbolDefAction_0()); 
            }
            // InternalAdaptSem.g:4073:2: ()
            // InternalAdaptSem.g:4073:3: 
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
    // InternalAdaptSem.g:4081:1: rule__SymbolDef__Group__1 : rule__SymbolDef__Group__1__Impl ;
    public final void rule__SymbolDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4085:1: ( rule__SymbolDef__Group__1__Impl )
            // InternalAdaptSem.g:4086:2: rule__SymbolDef__Group__1__Impl
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
    // InternalAdaptSem.g:4092:1: rule__SymbolDef__Group__1__Impl : ( ( rule__SymbolDef__NameAssignment_1 ) ) ;
    public final void rule__SymbolDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4096:1: ( ( ( rule__SymbolDef__NameAssignment_1 ) ) )
            // InternalAdaptSem.g:4097:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            {
            // InternalAdaptSem.g:4097:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            // InternalAdaptSem.g:4098:2: ( rule__SymbolDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getNameAssignment_1()); 
            }
            // InternalAdaptSem.g:4099:2: ( rule__SymbolDef__NameAssignment_1 )
            // InternalAdaptSem.g:4099:3: rule__SymbolDef__NameAssignment_1
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
    // InternalAdaptSem.g:4108:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4112:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // InternalAdaptSem.g:4113:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
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
    // InternalAdaptSem.g:4120:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4124:1: ( ( () ) )
            // InternalAdaptSem.g:4125:1: ( () )
            {
            // InternalAdaptSem.g:4125:1: ( () )
            // InternalAdaptSem.g:4126:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            }
            // InternalAdaptSem.g:4127:2: ()
            // InternalAdaptSem.g:4127:3: 
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
    // InternalAdaptSem.g:4135:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4139:1: ( rule__SymbolRef__Group__1__Impl )
            // InternalAdaptSem.g:4140:2: rule__SymbolRef__Group__1__Impl
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
    // InternalAdaptSem.g:4146:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__DefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4150:1: ( ( ( rule__SymbolRef__DefAssignment_1 ) ) )
            // InternalAdaptSem.g:4151:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            {
            // InternalAdaptSem.g:4151:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            // InternalAdaptSem.g:4152:2: ( rule__SymbolRef__DefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefAssignment_1()); 
            }
            // InternalAdaptSem.g:4153:2: ( rule__SymbolRef__DefAssignment_1 )
            // InternalAdaptSem.g:4153:3: rule__SymbolRef__DefAssignment_1
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
    // InternalAdaptSem.g:4162:1: rule__ListDef__Group__0 : rule__ListDef__Group__0__Impl rule__ListDef__Group__1 ;
    public final void rule__ListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4166:1: ( rule__ListDef__Group__0__Impl rule__ListDef__Group__1 )
            // InternalAdaptSem.g:4167:2: rule__ListDef__Group__0__Impl rule__ListDef__Group__1
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
    // InternalAdaptSem.g:4174:1: rule__ListDef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4178:1: ( ( '[' ) )
            // InternalAdaptSem.g:4179:1: ( '[' )
            {
            // InternalAdaptSem.g:4179:1: ( '[' )
            // InternalAdaptSem.g:4180:2: '['
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
    // InternalAdaptSem.g:4189:1: rule__ListDef__Group__1 : rule__ListDef__Group__1__Impl rule__ListDef__Group__2 ;
    public final void rule__ListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4193:1: ( rule__ListDef__Group__1__Impl rule__ListDef__Group__2 )
            // InternalAdaptSem.g:4194:2: rule__ListDef__Group__1__Impl rule__ListDef__Group__2
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
    // InternalAdaptSem.g:4201:1: rule__ListDef__Group__1__Impl : ( ( rule__ListDef__HeadAssignment_1 ) ) ;
    public final void rule__ListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4205:1: ( ( ( rule__ListDef__HeadAssignment_1 ) ) )
            // InternalAdaptSem.g:4206:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            {
            // InternalAdaptSem.g:4206:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            // InternalAdaptSem.g:4207:2: ( rule__ListDef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getHeadAssignment_1()); 
            }
            // InternalAdaptSem.g:4208:2: ( rule__ListDef__HeadAssignment_1 )
            // InternalAdaptSem.g:4208:3: rule__ListDef__HeadAssignment_1
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
    // InternalAdaptSem.g:4216:1: rule__ListDef__Group__2 : rule__ListDef__Group__2__Impl rule__ListDef__Group__3 ;
    public final void rule__ListDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4220:1: ( rule__ListDef__Group__2__Impl rule__ListDef__Group__3 )
            // InternalAdaptSem.g:4221:2: rule__ListDef__Group__2__Impl rule__ListDef__Group__3
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
    // InternalAdaptSem.g:4228:1: rule__ListDef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4232:1: ( ( '|' ) )
            // InternalAdaptSem.g:4233:1: ( '|' )
            {
            // InternalAdaptSem.g:4233:1: ( '|' )
            // InternalAdaptSem.g:4234:2: '|'
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
    // InternalAdaptSem.g:4243:1: rule__ListDef__Group__3 : rule__ListDef__Group__3__Impl rule__ListDef__Group__4 ;
    public final void rule__ListDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4247:1: ( rule__ListDef__Group__3__Impl rule__ListDef__Group__4 )
            // InternalAdaptSem.g:4248:2: rule__ListDef__Group__3__Impl rule__ListDef__Group__4
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
    // InternalAdaptSem.g:4255:1: rule__ListDef__Group__3__Impl : ( ( rule__ListDef__TailAssignment_3 ) ) ;
    public final void rule__ListDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4259:1: ( ( ( rule__ListDef__TailAssignment_3 ) ) )
            // InternalAdaptSem.g:4260:1: ( ( rule__ListDef__TailAssignment_3 ) )
            {
            // InternalAdaptSem.g:4260:1: ( ( rule__ListDef__TailAssignment_3 ) )
            // InternalAdaptSem.g:4261:2: ( rule__ListDef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTailAssignment_3()); 
            }
            // InternalAdaptSem.g:4262:2: ( rule__ListDef__TailAssignment_3 )
            // InternalAdaptSem.g:4262:3: rule__ListDef__TailAssignment_3
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
    // InternalAdaptSem.g:4270:1: rule__ListDef__Group__4 : rule__ListDef__Group__4__Impl ;
    public final void rule__ListDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4274:1: ( rule__ListDef__Group__4__Impl )
            // InternalAdaptSem.g:4275:2: rule__ListDef__Group__4__Impl
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
    // InternalAdaptSem.g:4281:1: rule__ListDef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4285:1: ( ( ']' ) )
            // InternalAdaptSem.g:4286:1: ( ']' )
            {
            // InternalAdaptSem.g:4286:1: ( ']' )
            // InternalAdaptSem.g:4287:2: ']'
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
    // InternalAdaptSem.g:4297:1: rule__ListRef__Group__0 : rule__ListRef__Group__0__Impl rule__ListRef__Group__1 ;
    public final void rule__ListRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4301:1: ( rule__ListRef__Group__0__Impl rule__ListRef__Group__1 )
            // InternalAdaptSem.g:4302:2: rule__ListRef__Group__0__Impl rule__ListRef__Group__1
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
    // InternalAdaptSem.g:4309:1: rule__ListRef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4313:1: ( ( '[' ) )
            // InternalAdaptSem.g:4314:1: ( '[' )
            {
            // InternalAdaptSem.g:4314:1: ( '[' )
            // InternalAdaptSem.g:4315:2: '['
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
    // InternalAdaptSem.g:4324:1: rule__ListRef__Group__1 : rule__ListRef__Group__1__Impl rule__ListRef__Group__2 ;
    public final void rule__ListRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4328:1: ( rule__ListRef__Group__1__Impl rule__ListRef__Group__2 )
            // InternalAdaptSem.g:4329:2: rule__ListRef__Group__1__Impl rule__ListRef__Group__2
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
    // InternalAdaptSem.g:4336:1: rule__ListRef__Group__1__Impl : ( ( rule__ListRef__HeadAssignment_1 ) ) ;
    public final void rule__ListRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4340:1: ( ( ( rule__ListRef__HeadAssignment_1 ) ) )
            // InternalAdaptSem.g:4341:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            {
            // InternalAdaptSem.g:4341:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            // InternalAdaptSem.g:4342:2: ( rule__ListRef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getHeadAssignment_1()); 
            }
            // InternalAdaptSem.g:4343:2: ( rule__ListRef__HeadAssignment_1 )
            // InternalAdaptSem.g:4343:3: rule__ListRef__HeadAssignment_1
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
    // InternalAdaptSem.g:4351:1: rule__ListRef__Group__2 : rule__ListRef__Group__2__Impl rule__ListRef__Group__3 ;
    public final void rule__ListRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4355:1: ( rule__ListRef__Group__2__Impl rule__ListRef__Group__3 )
            // InternalAdaptSem.g:4356:2: rule__ListRef__Group__2__Impl rule__ListRef__Group__3
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
    // InternalAdaptSem.g:4363:1: rule__ListRef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4367:1: ( ( '|' ) )
            // InternalAdaptSem.g:4368:1: ( '|' )
            {
            // InternalAdaptSem.g:4368:1: ( '|' )
            // InternalAdaptSem.g:4369:2: '|'
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
    // InternalAdaptSem.g:4378:1: rule__ListRef__Group__3 : rule__ListRef__Group__3__Impl rule__ListRef__Group__4 ;
    public final void rule__ListRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4382:1: ( rule__ListRef__Group__3__Impl rule__ListRef__Group__4 )
            // InternalAdaptSem.g:4383:2: rule__ListRef__Group__3__Impl rule__ListRef__Group__4
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
    // InternalAdaptSem.g:4390:1: rule__ListRef__Group__3__Impl : ( ( rule__ListRef__TailAssignment_3 ) ) ;
    public final void rule__ListRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4394:1: ( ( ( rule__ListRef__TailAssignment_3 ) ) )
            // InternalAdaptSem.g:4395:1: ( ( rule__ListRef__TailAssignment_3 ) )
            {
            // InternalAdaptSem.g:4395:1: ( ( rule__ListRef__TailAssignment_3 ) )
            // InternalAdaptSem.g:4396:2: ( rule__ListRef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getTailAssignment_3()); 
            }
            // InternalAdaptSem.g:4397:2: ( rule__ListRef__TailAssignment_3 )
            // InternalAdaptSem.g:4397:3: rule__ListRef__TailAssignment_3
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
    // InternalAdaptSem.g:4405:1: rule__ListRef__Group__4 : rule__ListRef__Group__4__Impl ;
    public final void rule__ListRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4409:1: ( rule__ListRef__Group__4__Impl )
            // InternalAdaptSem.g:4410:2: rule__ListRef__Group__4__Impl
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
    // InternalAdaptSem.g:4416:1: rule__ListRef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4420:1: ( ( ']' ) )
            // InternalAdaptSem.g:4421:1: ( ']' )
            {
            // InternalAdaptSem.g:4421:1: ( ']' )
            // InternalAdaptSem.g:4422:2: ']'
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
    // InternalAdaptSem.g:4432:1: rule__VoidList__Group__0 : rule__VoidList__Group__0__Impl rule__VoidList__Group__1 ;
    public final void rule__VoidList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4436:1: ( rule__VoidList__Group__0__Impl rule__VoidList__Group__1 )
            // InternalAdaptSem.g:4437:2: rule__VoidList__Group__0__Impl rule__VoidList__Group__1
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
    // InternalAdaptSem.g:4444:1: rule__VoidList__Group__0__Impl : ( () ) ;
    public final void rule__VoidList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4448:1: ( ( () ) )
            // InternalAdaptSem.g:4449:1: ( () )
            {
            // InternalAdaptSem.g:4449:1: ( () )
            // InternalAdaptSem.g:4450:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getVoidListAction_0()); 
            }
            // InternalAdaptSem.g:4451:2: ()
            // InternalAdaptSem.g:4451:3: 
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
    // InternalAdaptSem.g:4459:1: rule__VoidList__Group__1 : rule__VoidList__Group__1__Impl ;
    public final void rule__VoidList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4463:1: ( rule__VoidList__Group__1__Impl )
            // InternalAdaptSem.g:4464:2: rule__VoidList__Group__1__Impl
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
    // InternalAdaptSem.g:4470:1: rule__VoidList__Group__1__Impl : ( '[]' ) ;
    public final void rule__VoidList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4474:1: ( ( '[]' ) )
            // InternalAdaptSem.g:4475:1: ( '[]' )
            {
            // InternalAdaptSem.g:4475:1: ( '[]' )
            // InternalAdaptSem.g:4476:2: '[]'
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
    // InternalAdaptSem.g:4486:1: rule__CondNot__Group__0 : rule__CondNot__Group__0__Impl rule__CondNot__Group__1 ;
    public final void rule__CondNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4490:1: ( rule__CondNot__Group__0__Impl rule__CondNot__Group__1 )
            // InternalAdaptSem.g:4491:2: rule__CondNot__Group__0__Impl rule__CondNot__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptSem.g:4498:1: rule__CondNot__Group__0__Impl : ( () ) ;
    public final void rule__CondNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4502:1: ( ( () ) )
            // InternalAdaptSem.g:4503:1: ( () )
            {
            // InternalAdaptSem.g:4503:1: ( () )
            // InternalAdaptSem.g:4504:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getNotAction_0()); 
            }
            // InternalAdaptSem.g:4505:2: ()
            // InternalAdaptSem.g:4505:3: 
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
    // InternalAdaptSem.g:4513:1: rule__CondNot__Group__1 : rule__CondNot__Group__1__Impl rule__CondNot__Group__2 ;
    public final void rule__CondNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4517:1: ( rule__CondNot__Group__1__Impl rule__CondNot__Group__2 )
            // InternalAdaptSem.g:4518:2: rule__CondNot__Group__1__Impl rule__CondNot__Group__2
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
    // InternalAdaptSem.g:4525:1: rule__CondNot__Group__1__Impl : ( '!' ) ;
    public final void rule__CondNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4529:1: ( ( '!' ) )
            // InternalAdaptSem.g:4530:1: ( '!' )
            {
            // InternalAdaptSem.g:4530:1: ( '!' )
            // InternalAdaptSem.g:4531:2: '!'
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
    // InternalAdaptSem.g:4540:1: rule__CondNot__Group__2 : rule__CondNot__Group__2__Impl ;
    public final void rule__CondNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4544:1: ( rule__CondNot__Group__2__Impl )
            // InternalAdaptSem.g:4545:2: rule__CondNot__Group__2__Impl
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
    // InternalAdaptSem.g:4551:1: rule__CondNot__Group__2__Impl : ( ( rule__CondNot__ExprAssignment_2 ) ) ;
    public final void rule__CondNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4555:1: ( ( ( rule__CondNot__ExprAssignment_2 ) ) )
            // InternalAdaptSem.g:4556:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            {
            // InternalAdaptSem.g:4556:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            // InternalAdaptSem.g:4557:2: ( rule__CondNot__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExprAssignment_2()); 
            }
            // InternalAdaptSem.g:4558:2: ( rule__CondNot__ExprAssignment_2 )
            // InternalAdaptSem.g:4558:3: rule__CondNot__ExprAssignment_2
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
    // InternalAdaptSem.g:4567:1: rule__CondOr__Group__0 : rule__CondOr__Group__0__Impl rule__CondOr__Group__1 ;
    public final void rule__CondOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4571:1: ( rule__CondOr__Group__0__Impl rule__CondOr__Group__1 )
            // InternalAdaptSem.g:4572:2: rule__CondOr__Group__0__Impl rule__CondOr__Group__1
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
    // InternalAdaptSem.g:4579:1: rule__CondOr__Group__0__Impl : ( () ) ;
    public final void rule__CondOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4583:1: ( ( () ) )
            // InternalAdaptSem.g:4584:1: ( () )
            {
            // InternalAdaptSem.g:4584:1: ( () )
            // InternalAdaptSem.g:4585:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getOrAction_0()); 
            }
            // InternalAdaptSem.g:4586:2: ()
            // InternalAdaptSem.g:4586:3: 
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
    // InternalAdaptSem.g:4594:1: rule__CondOr__Group__1 : rule__CondOr__Group__1__Impl rule__CondOr__Group__2 ;
    public final void rule__CondOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4598:1: ( rule__CondOr__Group__1__Impl rule__CondOr__Group__2 )
            // InternalAdaptSem.g:4599:2: rule__CondOr__Group__1__Impl rule__CondOr__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptSem.g:4606:1: rule__CondOr__Group__1__Impl : ( ( rule__CondOr__LhsAssignment_1 ) ) ;
    public final void rule__CondOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4610:1: ( ( ( rule__CondOr__LhsAssignment_1 ) ) )
            // InternalAdaptSem.g:4611:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            {
            // InternalAdaptSem.g:4611:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            // InternalAdaptSem.g:4612:2: ( rule__CondOr__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getLhsAssignment_1()); 
            }
            // InternalAdaptSem.g:4613:2: ( rule__CondOr__LhsAssignment_1 )
            // InternalAdaptSem.g:4613:3: rule__CondOr__LhsAssignment_1
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
    // InternalAdaptSem.g:4621:1: rule__CondOr__Group__2 : rule__CondOr__Group__2__Impl rule__CondOr__Group__3 ;
    public final void rule__CondOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4625:1: ( rule__CondOr__Group__2__Impl rule__CondOr__Group__3 )
            // InternalAdaptSem.g:4626:2: rule__CondOr__Group__2__Impl rule__CondOr__Group__3
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
    // InternalAdaptSem.g:4633:1: rule__CondOr__Group__2__Impl : ( '||' ) ;
    public final void rule__CondOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4637:1: ( ( '||' ) )
            // InternalAdaptSem.g:4638:1: ( '||' )
            {
            // InternalAdaptSem.g:4638:1: ( '||' )
            // InternalAdaptSem.g:4639:2: '||'
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
    // InternalAdaptSem.g:4648:1: rule__CondOr__Group__3 : rule__CondOr__Group__3__Impl ;
    public final void rule__CondOr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4652:1: ( rule__CondOr__Group__3__Impl )
            // InternalAdaptSem.g:4653:2: rule__CondOr__Group__3__Impl
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
    // InternalAdaptSem.g:4659:1: rule__CondOr__Group__3__Impl : ( ( rule__CondOr__RhsAssignment_3 ) ) ;
    public final void rule__CondOr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4663:1: ( ( ( rule__CondOr__RhsAssignment_3 ) ) )
            // InternalAdaptSem.g:4664:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            {
            // InternalAdaptSem.g:4664:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            // InternalAdaptSem.g:4665:2: ( rule__CondOr__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getRhsAssignment_3()); 
            }
            // InternalAdaptSem.g:4666:2: ( rule__CondOr__RhsAssignment_3 )
            // InternalAdaptSem.g:4666:3: rule__CondOr__RhsAssignment_3
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
    // InternalAdaptSem.g:4675:1: rule__CondAnd__Group__0 : rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 ;
    public final void rule__CondAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4679:1: ( rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 )
            // InternalAdaptSem.g:4680:2: rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1
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
    // InternalAdaptSem.g:4687:1: rule__CondAnd__Group__0__Impl : ( () ) ;
    public final void rule__CondAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4691:1: ( ( () ) )
            // InternalAdaptSem.g:4692:1: ( () )
            {
            // InternalAdaptSem.g:4692:1: ( () )
            // InternalAdaptSem.g:4693:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAndAction_0()); 
            }
            // InternalAdaptSem.g:4694:2: ()
            // InternalAdaptSem.g:4694:3: 
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
    // InternalAdaptSem.g:4702:1: rule__CondAnd__Group__1 : rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 ;
    public final void rule__CondAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4706:1: ( rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 )
            // InternalAdaptSem.g:4707:2: rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptSem.g:4714:1: rule__CondAnd__Group__1__Impl : ( ( rule__CondAnd__LhsAssignment_1 ) ) ;
    public final void rule__CondAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4718:1: ( ( ( rule__CondAnd__LhsAssignment_1 ) ) )
            // InternalAdaptSem.g:4719:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            {
            // InternalAdaptSem.g:4719:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            // InternalAdaptSem.g:4720:2: ( rule__CondAnd__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getLhsAssignment_1()); 
            }
            // InternalAdaptSem.g:4721:2: ( rule__CondAnd__LhsAssignment_1 )
            // InternalAdaptSem.g:4721:3: rule__CondAnd__LhsAssignment_1
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
    // InternalAdaptSem.g:4729:1: rule__CondAnd__Group__2 : rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 ;
    public final void rule__CondAnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4733:1: ( rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 )
            // InternalAdaptSem.g:4734:2: rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3
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
    // InternalAdaptSem.g:4741:1: rule__CondAnd__Group__2__Impl : ( '&&' ) ;
    public final void rule__CondAnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4745:1: ( ( '&&' ) )
            // InternalAdaptSem.g:4746:1: ( '&&' )
            {
            // InternalAdaptSem.g:4746:1: ( '&&' )
            // InternalAdaptSem.g:4747:2: '&&'
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
    // InternalAdaptSem.g:4756:1: rule__CondAnd__Group__3 : rule__CondAnd__Group__3__Impl ;
    public final void rule__CondAnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4760:1: ( rule__CondAnd__Group__3__Impl )
            // InternalAdaptSem.g:4761:2: rule__CondAnd__Group__3__Impl
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
    // InternalAdaptSem.g:4767:1: rule__CondAnd__Group__3__Impl : ( ( rule__CondAnd__RhsAssignment_3 ) ) ;
    public final void rule__CondAnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4771:1: ( ( ( rule__CondAnd__RhsAssignment_3 ) ) )
            // InternalAdaptSem.g:4772:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            {
            // InternalAdaptSem.g:4772:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            // InternalAdaptSem.g:4773:2: ( rule__CondAnd__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getRhsAssignment_3()); 
            }
            // InternalAdaptSem.g:4774:2: ( rule__CondAnd__RhsAssignment_3 )
            // InternalAdaptSem.g:4774:3: rule__CondAnd__RhsAssignment_3
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
    // InternalAdaptSem.g:4783:1: rule__CondEquality__Group_0__0 : rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 ;
    public final void rule__CondEquality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4787:1: ( rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 )
            // InternalAdaptSem.g:4788:2: rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1
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
    // InternalAdaptSem.g:4795:1: rule__CondEquality__Group_0__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4799:1: ( ( () ) )
            // InternalAdaptSem.g:4800:1: ( () )
            {
            // InternalAdaptSem.g:4800:1: ( () )
            // InternalAdaptSem.g:4801:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualAction_0_0()); 
            }
            // InternalAdaptSem.g:4802:2: ()
            // InternalAdaptSem.g:4802:3: 
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
    // InternalAdaptSem.g:4810:1: rule__CondEquality__Group_0__1 : rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 ;
    public final void rule__CondEquality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4814:1: ( rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 )
            // InternalAdaptSem.g:4815:2: rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptSem.g:4822:1: rule__CondEquality__Group_0__1__Impl : ( ( rule__CondEquality__LhsAssignment_0_1 ) ) ;
    public final void rule__CondEquality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4826:1: ( ( ( rule__CondEquality__LhsAssignment_0_1 ) ) )
            // InternalAdaptSem.g:4827:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:4827:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            // InternalAdaptSem.g:4828:2: ( rule__CondEquality__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_0_1()); 
            }
            // InternalAdaptSem.g:4829:2: ( rule__CondEquality__LhsAssignment_0_1 )
            // InternalAdaptSem.g:4829:3: rule__CondEquality__LhsAssignment_0_1
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
    // InternalAdaptSem.g:4837:1: rule__CondEquality__Group_0__2 : rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 ;
    public final void rule__CondEquality__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4841:1: ( rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 )
            // InternalAdaptSem.g:4842:2: rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3
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
    // InternalAdaptSem.g:4849:1: rule__CondEquality__Group_0__2__Impl : ( '==' ) ;
    public final void rule__CondEquality__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4853:1: ( ( '==' ) )
            // InternalAdaptSem.g:4854:1: ( '==' )
            {
            // InternalAdaptSem.g:4854:1: ( '==' )
            // InternalAdaptSem.g:4855:2: '=='
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
    // InternalAdaptSem.g:4864:1: rule__CondEquality__Group_0__3 : rule__CondEquality__Group_0__3__Impl ;
    public final void rule__CondEquality__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4868:1: ( rule__CondEquality__Group_0__3__Impl )
            // InternalAdaptSem.g:4869:2: rule__CondEquality__Group_0__3__Impl
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
    // InternalAdaptSem.g:4875:1: rule__CondEquality__Group_0__3__Impl : ( ( rule__CondEquality__RhsAssignment_0_3 ) ) ;
    public final void rule__CondEquality__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4879:1: ( ( ( rule__CondEquality__RhsAssignment_0_3 ) ) )
            // InternalAdaptSem.g:4880:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            {
            // InternalAdaptSem.g:4880:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            // InternalAdaptSem.g:4881:2: ( rule__CondEquality__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_0_3()); 
            }
            // InternalAdaptSem.g:4882:2: ( rule__CondEquality__RhsAssignment_0_3 )
            // InternalAdaptSem.g:4882:3: rule__CondEquality__RhsAssignment_0_3
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
    // InternalAdaptSem.g:4891:1: rule__CondEquality__Group_1__0 : rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 ;
    public final void rule__CondEquality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4895:1: ( rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 )
            // InternalAdaptSem.g:4896:2: rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1
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
    // InternalAdaptSem.g:4903:1: rule__CondEquality__Group_1__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4907:1: ( ( () ) )
            // InternalAdaptSem.g:4908:1: ( () )
            {
            // InternalAdaptSem.g:4908:1: ( () )
            // InternalAdaptSem.g:4909:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0()); 
            }
            // InternalAdaptSem.g:4910:2: ()
            // InternalAdaptSem.g:4910:3: 
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
    // InternalAdaptSem.g:4918:1: rule__CondEquality__Group_1__1 : rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 ;
    public final void rule__CondEquality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4922:1: ( rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 )
            // InternalAdaptSem.g:4923:2: rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdaptSem.g:4930:1: rule__CondEquality__Group_1__1__Impl : ( ( rule__CondEquality__LhsAssignment_1_1 ) ) ;
    public final void rule__CondEquality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4934:1: ( ( ( rule__CondEquality__LhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:4935:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:4935:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            // InternalAdaptSem.g:4936:2: ( rule__CondEquality__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:4937:2: ( rule__CondEquality__LhsAssignment_1_1 )
            // InternalAdaptSem.g:4937:3: rule__CondEquality__LhsAssignment_1_1
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
    // InternalAdaptSem.g:4945:1: rule__CondEquality__Group_1__2 : rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 ;
    public final void rule__CondEquality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4949:1: ( rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 )
            // InternalAdaptSem.g:4950:2: rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3
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
    // InternalAdaptSem.g:4957:1: rule__CondEquality__Group_1__2__Impl : ( '!=' ) ;
    public final void rule__CondEquality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4961:1: ( ( '!=' ) )
            // InternalAdaptSem.g:4962:1: ( '!=' )
            {
            // InternalAdaptSem.g:4962:1: ( '!=' )
            // InternalAdaptSem.g:4963:2: '!='
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
    // InternalAdaptSem.g:4972:1: rule__CondEquality__Group_1__3 : rule__CondEquality__Group_1__3__Impl ;
    public final void rule__CondEquality__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4976:1: ( rule__CondEquality__Group_1__3__Impl )
            // InternalAdaptSem.g:4977:2: rule__CondEquality__Group_1__3__Impl
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
    // InternalAdaptSem.g:4983:1: rule__CondEquality__Group_1__3__Impl : ( ( rule__CondEquality__RhsAssignment_1_3 ) ) ;
    public final void rule__CondEquality__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4987:1: ( ( ( rule__CondEquality__RhsAssignment_1_3 ) ) )
            // InternalAdaptSem.g:4988:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            {
            // InternalAdaptSem.g:4988:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            // InternalAdaptSem.g:4989:2: ( rule__CondEquality__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_1_3()); 
            }
            // InternalAdaptSem.g:4990:2: ( rule__CondEquality__RhsAssignment_1_3 )
            // InternalAdaptSem.g:4990:3: rule__CondEquality__RhsAssignment_1_3
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
    // InternalAdaptSem.g:4999:1: rule__CondComparison__Group_0__0 : rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 ;
    public final void rule__CondComparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5003:1: ( rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 )
            // InternalAdaptSem.g:5004:2: rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1
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
    // InternalAdaptSem.g:5011:1: rule__CondComparison__Group_0__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5015:1: ( ( () ) )
            // InternalAdaptSem.g:5016:1: ( () )
            {
            // InternalAdaptSem.g:5016:1: ( () )
            // InternalAdaptSem.g:5017:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessAction_0_0()); 
            }
            // InternalAdaptSem.g:5018:2: ()
            // InternalAdaptSem.g:5018:3: 
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
    // InternalAdaptSem.g:5026:1: rule__CondComparison__Group_0__1 : rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 ;
    public final void rule__CondComparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5030:1: ( rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 )
            // InternalAdaptSem.g:5031:2: rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptSem.g:5038:1: rule__CondComparison__Group_0__1__Impl : ( ( rule__CondComparison__LhsAssignment_0_1 ) ) ;
    public final void rule__CondComparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5042:1: ( ( ( rule__CondComparison__LhsAssignment_0_1 ) ) )
            // InternalAdaptSem.g:5043:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:5043:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            // InternalAdaptSem.g:5044:2: ( rule__CondComparison__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_0_1()); 
            }
            // InternalAdaptSem.g:5045:2: ( rule__CondComparison__LhsAssignment_0_1 )
            // InternalAdaptSem.g:5045:3: rule__CondComparison__LhsAssignment_0_1
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
    // InternalAdaptSem.g:5053:1: rule__CondComparison__Group_0__2 : rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 ;
    public final void rule__CondComparison__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5057:1: ( rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 )
            // InternalAdaptSem.g:5058:2: rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3
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
    // InternalAdaptSem.g:5065:1: rule__CondComparison__Group_0__2__Impl : ( '<' ) ;
    public final void rule__CondComparison__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5069:1: ( ( '<' ) )
            // InternalAdaptSem.g:5070:1: ( '<' )
            {
            // InternalAdaptSem.g:5070:1: ( '<' )
            // InternalAdaptSem.g:5071:2: '<'
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
    // InternalAdaptSem.g:5080:1: rule__CondComparison__Group_0__3 : rule__CondComparison__Group_0__3__Impl ;
    public final void rule__CondComparison__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5084:1: ( rule__CondComparison__Group_0__3__Impl )
            // InternalAdaptSem.g:5085:2: rule__CondComparison__Group_0__3__Impl
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
    // InternalAdaptSem.g:5091:1: rule__CondComparison__Group_0__3__Impl : ( ( rule__CondComparison__RhsAssignment_0_3 ) ) ;
    public final void rule__CondComparison__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5095:1: ( ( ( rule__CondComparison__RhsAssignment_0_3 ) ) )
            // InternalAdaptSem.g:5096:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            {
            // InternalAdaptSem.g:5096:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            // InternalAdaptSem.g:5097:2: ( rule__CondComparison__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_0_3()); 
            }
            // InternalAdaptSem.g:5098:2: ( rule__CondComparison__RhsAssignment_0_3 )
            // InternalAdaptSem.g:5098:3: rule__CondComparison__RhsAssignment_0_3
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
    // InternalAdaptSem.g:5107:1: rule__CondComparison__Group_1__0 : rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 ;
    public final void rule__CondComparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5111:1: ( rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 )
            // InternalAdaptSem.g:5112:2: rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1
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
    // InternalAdaptSem.g:5119:1: rule__CondComparison__Group_1__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5123:1: ( ( () ) )
            // InternalAdaptSem.g:5124:1: ( () )
            {
            // InternalAdaptSem.g:5124:1: ( () )
            // InternalAdaptSem.g:5125:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessEqAction_1_0()); 
            }
            // InternalAdaptSem.g:5126:2: ()
            // InternalAdaptSem.g:5126:3: 
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
    // InternalAdaptSem.g:5134:1: rule__CondComparison__Group_1__1 : rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 ;
    public final void rule__CondComparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5138:1: ( rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 )
            // InternalAdaptSem.g:5139:2: rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptSem.g:5146:1: rule__CondComparison__Group_1__1__Impl : ( ( rule__CondComparison__LhsAssignment_1_1 ) ) ;
    public final void rule__CondComparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5150:1: ( ( ( rule__CondComparison__LhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5151:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5151:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5152:2: ( rule__CondComparison__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5153:2: ( rule__CondComparison__LhsAssignment_1_1 )
            // InternalAdaptSem.g:5153:3: rule__CondComparison__LhsAssignment_1_1
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
    // InternalAdaptSem.g:5161:1: rule__CondComparison__Group_1__2 : rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 ;
    public final void rule__CondComparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5165:1: ( rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 )
            // InternalAdaptSem.g:5166:2: rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3
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
    // InternalAdaptSem.g:5173:1: rule__CondComparison__Group_1__2__Impl : ( '<=' ) ;
    public final void rule__CondComparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5177:1: ( ( '<=' ) )
            // InternalAdaptSem.g:5178:1: ( '<=' )
            {
            // InternalAdaptSem.g:5178:1: ( '<=' )
            // InternalAdaptSem.g:5179:2: '<='
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
    // InternalAdaptSem.g:5188:1: rule__CondComparison__Group_1__3 : rule__CondComparison__Group_1__3__Impl ;
    public final void rule__CondComparison__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5192:1: ( rule__CondComparison__Group_1__3__Impl )
            // InternalAdaptSem.g:5193:2: rule__CondComparison__Group_1__3__Impl
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
    // InternalAdaptSem.g:5199:1: rule__CondComparison__Group_1__3__Impl : ( ( rule__CondComparison__RhsAssignment_1_3 ) ) ;
    public final void rule__CondComparison__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5203:1: ( ( ( rule__CondComparison__RhsAssignment_1_3 ) ) )
            // InternalAdaptSem.g:5204:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            {
            // InternalAdaptSem.g:5204:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            // InternalAdaptSem.g:5205:2: ( rule__CondComparison__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_1_3()); 
            }
            // InternalAdaptSem.g:5206:2: ( rule__CondComparison__RhsAssignment_1_3 )
            // InternalAdaptSem.g:5206:3: rule__CondComparison__RhsAssignment_1_3
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


    // $ANTLR start "rule__Or__Group__0"
    // InternalAdaptSem.g:5215:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5219:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalAdaptSem.g:5220:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptSem.g:5227:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5231:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:5232:1: ( ruleAnd )
            {
            // InternalAdaptSem.g:5232:1: ( ruleAnd )
            // InternalAdaptSem.g:5233:2: ruleAnd
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
    // InternalAdaptSem.g:5242:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5246:1: ( rule__Or__Group__1__Impl )
            // InternalAdaptSem.g:5247:2: rule__Or__Group__1__Impl
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
    // InternalAdaptSem.g:5253:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5257:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalAdaptSem.g:5258:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5258:1: ( ( rule__Or__Group_1__0 )* )
            // InternalAdaptSem.g:5259:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5260:2: ( rule__Or__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdaptSem.g:5260:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
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
    // InternalAdaptSem.g:5269:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5273:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalAdaptSem.g:5274:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptSem.g:5281:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5285:1: ( ( () ) )
            // InternalAdaptSem.g:5286:1: ( () )
            {
            // InternalAdaptSem.g:5286:1: ( () )
            // InternalAdaptSem.g:5287:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLhsAction_1_0()); 
            }
            // InternalAdaptSem.g:5288:2: ()
            // InternalAdaptSem.g:5288:3: 
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
    // InternalAdaptSem.g:5296:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5300:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalAdaptSem.g:5301:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalAdaptSem.g:5308:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5312:1: ( ( '||' ) )
            // InternalAdaptSem.g:5313:1: ( '||' )
            {
            // InternalAdaptSem.g:5313:1: ( '||' )
            // InternalAdaptSem.g:5314:2: '||'
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
    // InternalAdaptSem.g:5323:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5327:1: ( rule__Or__Group_1__2__Impl )
            // InternalAdaptSem.g:5328:2: rule__Or__Group_1__2__Impl
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
    // InternalAdaptSem.g:5334:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RhsAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5338:1: ( ( ( rule__Or__RhsAssignment_1_2 ) ) )
            // InternalAdaptSem.g:5339:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:5339:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            // InternalAdaptSem.g:5340:2: ( rule__Or__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRhsAssignment_1_2()); 
            }
            // InternalAdaptSem.g:5341:2: ( rule__Or__RhsAssignment_1_2 )
            // InternalAdaptSem.g:5341:3: rule__Or__RhsAssignment_1_2
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
    // InternalAdaptSem.g:5350:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5354:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalAdaptSem.g:5355:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptSem.g:5362:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5366:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:5367:1: ( ruleEquality )
            {
            // InternalAdaptSem.g:5367:1: ( ruleEquality )
            // InternalAdaptSem.g:5368:2: ruleEquality
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
    // InternalAdaptSem.g:5377:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5381:1: ( rule__And__Group__1__Impl )
            // InternalAdaptSem.g:5382:2: rule__And__Group__1__Impl
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
    // InternalAdaptSem.g:5388:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5392:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalAdaptSem.g:5393:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5393:1: ( ( rule__And__Group_1__0 )* )
            // InternalAdaptSem.g:5394:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5395:2: ( rule__And__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==36) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdaptSem.g:5395:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalAdaptSem.g:5404:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5408:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalAdaptSem.g:5409:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptSem.g:5416:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5420:1: ( ( () ) )
            // InternalAdaptSem.g:5421:1: ( () )
            {
            // InternalAdaptSem.g:5421:1: ( () )
            // InternalAdaptSem.g:5422:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLhsAction_1_0()); 
            }
            // InternalAdaptSem.g:5423:2: ()
            // InternalAdaptSem.g:5423:3: 
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
    // InternalAdaptSem.g:5431:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5435:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalAdaptSem.g:5436:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalAdaptSem.g:5443:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5447:1: ( ( '&&' ) )
            // InternalAdaptSem.g:5448:1: ( '&&' )
            {
            // InternalAdaptSem.g:5448:1: ( '&&' )
            // InternalAdaptSem.g:5449:2: '&&'
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
    // InternalAdaptSem.g:5458:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5462:1: ( rule__And__Group_1__2__Impl )
            // InternalAdaptSem.g:5463:2: rule__And__Group_1__2__Impl
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
    // InternalAdaptSem.g:5469:1: rule__And__Group_1__2__Impl : ( ( rule__And__RhsAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5473:1: ( ( ( rule__And__RhsAssignment_1_2 ) ) )
            // InternalAdaptSem.g:5474:1: ( ( rule__And__RhsAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:5474:1: ( ( rule__And__RhsAssignment_1_2 ) )
            // InternalAdaptSem.g:5475:2: ( rule__And__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRhsAssignment_1_2()); 
            }
            // InternalAdaptSem.g:5476:2: ( rule__And__RhsAssignment_1_2 )
            // InternalAdaptSem.g:5476:3: rule__And__RhsAssignment_1_2
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
    // InternalAdaptSem.g:5485:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5489:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalAdaptSem.g:5490:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptSem.g:5497:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5501:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:5502:1: ( ruleComparison )
            {
            // InternalAdaptSem.g:5502:1: ( ruleComparison )
            // InternalAdaptSem.g:5503:2: ruleComparison
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
    // InternalAdaptSem.g:5512:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5516:1: ( rule__Equality__Group__1__Impl )
            // InternalAdaptSem.g:5517:2: rule__Equality__Group__1__Impl
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
    // InternalAdaptSem.g:5523:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5527:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalAdaptSem.g:5528:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5528:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalAdaptSem.g:5529:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5530:2: ( rule__Equality__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=37 && LA41_0<=38)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAdaptSem.g:5530:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalAdaptSem.g:5539:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5543:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalAdaptSem.g:5544:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalAdaptSem.g:5551:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5555:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:5556:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:5556:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalAdaptSem.g:5557:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:5558:2: ( rule__Equality__Alternatives_1_0 )
            // InternalAdaptSem.g:5558:3: rule__Equality__Alternatives_1_0
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
    // InternalAdaptSem.g:5566:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5570:1: ( rule__Equality__Group_1__1__Impl )
            // InternalAdaptSem.g:5571:2: rule__Equality__Group_1__1__Impl
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
    // InternalAdaptSem.g:5577:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RhsAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5581:1: ( ( ( rule__Equality__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5582:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5582:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5583:2: ( rule__Equality__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5584:2: ( rule__Equality__RhsAssignment_1_1 )
            // InternalAdaptSem.g:5584:3: rule__Equality__RhsAssignment_1_1
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
    // InternalAdaptSem.g:5593:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5597:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalAdaptSem.g:5598:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptSem.g:5605:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5609:1: ( ( () ) )
            // InternalAdaptSem.g:5610:1: ( () )
            {
            // InternalAdaptSem.g:5610:1: ( () )
            // InternalAdaptSem.g:5611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:5612:2: ()
            // InternalAdaptSem.g:5612:3: 
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
    // InternalAdaptSem.g:5620:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5624:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:5625:2: rule__Equality__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:5631:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5635:1: ( ( '==' ) )
            // InternalAdaptSem.g:5636:1: ( '==' )
            {
            // InternalAdaptSem.g:5636:1: ( '==' )
            // InternalAdaptSem.g:5637:2: '=='
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
    // InternalAdaptSem.g:5647:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5651:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalAdaptSem.g:5652:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptSem.g:5659:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5663:1: ( ( () ) )
            // InternalAdaptSem.g:5664:1: ( () )
            {
            // InternalAdaptSem.g:5664:1: ( () )
            // InternalAdaptSem.g:5665:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:5666:2: ()
            // InternalAdaptSem.g:5666:3: 
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
    // InternalAdaptSem.g:5674:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5678:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:5679:2: rule__Equality__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:5685:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5689:1: ( ( '!=' ) )
            // InternalAdaptSem.g:5690:1: ( '!=' )
            {
            // InternalAdaptSem.g:5690:1: ( '!=' )
            // InternalAdaptSem.g:5691:2: '!='
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
    // InternalAdaptSem.g:5701:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5705:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalAdaptSem.g:5706:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptSem.g:5713:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5717:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:5718:1: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:5718:1: ( rulePlusOrMinus )
            // InternalAdaptSem.g:5719:2: rulePlusOrMinus
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
    // InternalAdaptSem.g:5728:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5732:1: ( rule__Comparison__Group__1__Impl )
            // InternalAdaptSem.g:5733:2: rule__Comparison__Group__1__Impl
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
    // InternalAdaptSem.g:5739:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5743:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalAdaptSem.g:5744:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5744:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalAdaptSem.g:5745:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5746:2: ( rule__Comparison__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=39 && LA42_0<=40)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAdaptSem.g:5746:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
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
    // InternalAdaptSem.g:5755:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5759:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalAdaptSem.g:5760:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalAdaptSem.g:5767:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5771:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:5772:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:5772:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalAdaptSem.g:5773:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:5774:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalAdaptSem.g:5774:3: rule__Comparison__Alternatives_1_0
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
    // InternalAdaptSem.g:5782:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5786:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalAdaptSem.g:5787:2: rule__Comparison__Group_1__1__Impl
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
    // InternalAdaptSem.g:5793:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RhsAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5797:1: ( ( ( rule__Comparison__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5798:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5798:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5799:2: ( rule__Comparison__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5800:2: ( rule__Comparison__RhsAssignment_1_1 )
            // InternalAdaptSem.g:5800:3: rule__Comparison__RhsAssignment_1_1
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
    // InternalAdaptSem.g:5809:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5813:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalAdaptSem.g:5814:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptSem.g:5821:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5825:1: ( ( () ) )
            // InternalAdaptSem.g:5826:1: ( () )
            {
            // InternalAdaptSem.g:5826:1: ( () )
            // InternalAdaptSem.g:5827:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:5828:2: ()
            // InternalAdaptSem.g:5828:3: 
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
    // InternalAdaptSem.g:5836:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5840:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:5841:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:5847:1: rule__Comparison__Group_1_0_0__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5851:1: ( ( '<' ) )
            // InternalAdaptSem.g:5852:1: ( '<' )
            {
            // InternalAdaptSem.g:5852:1: ( '<' )
            // InternalAdaptSem.g:5853:2: '<'
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
    // InternalAdaptSem.g:5863:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5867:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalAdaptSem.g:5868:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptSem.g:5875:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5879:1: ( ( () ) )
            // InternalAdaptSem.g:5880:1: ( () )
            {
            // InternalAdaptSem.g:5880:1: ( () )
            // InternalAdaptSem.g:5881:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:5882:2: ()
            // InternalAdaptSem.g:5882:3: 
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
    // InternalAdaptSem.g:5890:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5894:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:5895:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:5901:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5905:1: ( ( '<=' ) )
            // InternalAdaptSem.g:5906:1: ( '<=' )
            {
            // InternalAdaptSem.g:5906:1: ( '<=' )
            // InternalAdaptSem.g:5907:2: '<='
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
    // InternalAdaptSem.g:5917:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5921:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalAdaptSem.g:5922:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdaptSem.g:5929:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5933:1: ( ( ruleMulOrDiv ) )
            // InternalAdaptSem.g:5934:1: ( ruleMulOrDiv )
            {
            // InternalAdaptSem.g:5934:1: ( ruleMulOrDiv )
            // InternalAdaptSem.g:5935:2: ruleMulOrDiv
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
    // InternalAdaptSem.g:5944:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5948:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalAdaptSem.g:5949:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalAdaptSem.g:5955:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5959:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalAdaptSem.g:5960:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5960:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalAdaptSem.g:5961:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5962:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=41 && LA43_0<=42)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdaptSem.g:5962:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
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
    // InternalAdaptSem.g:5971:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5975:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalAdaptSem.g:5976:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalAdaptSem.g:5983:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5987:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:5988:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:5988:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalAdaptSem.g:5989:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:5990:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalAdaptSem.g:5990:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalAdaptSem.g:5998:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6002:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalAdaptSem.g:6003:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalAdaptSem.g:6009:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6013:1: ( ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6014:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6014:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6015:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6016:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6016:3: rule__PlusOrMinus__RhsAssignment_1_1
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
    // InternalAdaptSem.g:6025:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6029:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalAdaptSem.g:6030:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAdaptSem.g:6037:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6041:1: ( ( () ) )
            // InternalAdaptSem.g:6042:1: ( () )
            {
            // InternalAdaptSem.g:6042:1: ( () )
            // InternalAdaptSem.g:6043:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6044:2: ()
            // InternalAdaptSem.g:6044:3: 
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
    // InternalAdaptSem.g:6052:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6056:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6057:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:6063:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6067:1: ( ( '+' ) )
            // InternalAdaptSem.g:6068:1: ( '+' )
            {
            // InternalAdaptSem.g:6068:1: ( '+' )
            // InternalAdaptSem.g:6069:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6079:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6083:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalAdaptSem.g:6084:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdaptSem.g:6091:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6095:1: ( ( () ) )
            // InternalAdaptSem.g:6096:1: ( () )
            {
            // InternalAdaptSem.g:6096:1: ( () )
            // InternalAdaptSem.g:6097:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6098:2: ()
            // InternalAdaptSem.g:6098:3: 
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
    // InternalAdaptSem.g:6106:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6110:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6111:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:6117:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6121:1: ( ( '-' ) )
            // InternalAdaptSem.g:6122:1: ( '-' )
            {
            // InternalAdaptSem.g:6122:1: ( '-' )
            // InternalAdaptSem.g:6123:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6133:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6137:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalAdaptSem.g:6138:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdaptSem.g:6145:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6149:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:6150:1: ( rulePrimary )
            {
            // InternalAdaptSem.g:6150:1: ( rulePrimary )
            // InternalAdaptSem.g:6151:2: rulePrimary
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
    // InternalAdaptSem.g:6160:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6164:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalAdaptSem.g:6165:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalAdaptSem.g:6171:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6175:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalAdaptSem.g:6176:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6176:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalAdaptSem.g:6177:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6178:2: ( rule__MulOrDiv__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=43 && LA44_0<=44)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAdaptSem.g:6178:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
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
    // InternalAdaptSem.g:6187:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6191:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalAdaptSem.g:6192:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalAdaptSem.g:6199:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6203:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6204:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6204:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6205:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6206:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalAdaptSem.g:6206:3: rule__MulOrDiv__Alternatives_1_0
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
    // InternalAdaptSem.g:6214:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6218:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalAdaptSem.g:6219:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalAdaptSem.g:6225:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6229:1: ( ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6230:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6230:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6231:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6232:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6232:3: rule__MulOrDiv__RhsAssignment_1_1
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
    // InternalAdaptSem.g:6241:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6245:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalAdaptSem.g:6246:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAdaptSem.g:6253:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6257:1: ( ( () ) )
            // InternalAdaptSem.g:6258:1: ( () )
            {
            // InternalAdaptSem.g:6258:1: ( () )
            // InternalAdaptSem.g:6259:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6260:2: ()
            // InternalAdaptSem.g:6260:3: 
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
    // InternalAdaptSem.g:6268:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6272:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6273:2: rule__MulOrDiv__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:6279:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6283:1: ( ( '*' ) )
            // InternalAdaptSem.g:6284:1: ( '*' )
            {
            // InternalAdaptSem.g:6284:1: ( '*' )
            // InternalAdaptSem.g:6285:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6295:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6299:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalAdaptSem.g:6300:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdaptSem.g:6307:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6311:1: ( ( () ) )
            // InternalAdaptSem.g:6312:1: ( () )
            {
            // InternalAdaptSem.g:6312:1: ( () )
            // InternalAdaptSem.g:6313:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6314:2: ()
            // InternalAdaptSem.g:6314:3: 
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
    // InternalAdaptSem.g:6322:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6326:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6327:2: rule__MulOrDiv__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:6333:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6337:1: ( ( '/' ) )
            // InternalAdaptSem.g:6338:1: ( '/' )
            {
            // InternalAdaptSem.g:6338:1: ( '/' )
            // InternalAdaptSem.g:6339:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6349:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6353:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalAdaptSem.g:6354:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalAdaptSem.g:6361:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6365:1: ( ( '(' ) )
            // InternalAdaptSem.g:6366:1: ( '(' )
            {
            // InternalAdaptSem.g:6366:1: ( '(' )
            // InternalAdaptSem.g:6367:2: '('
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
    // InternalAdaptSem.g:6376:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6380:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalAdaptSem.g:6381:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalAdaptSem.g:6388:1: rule__Primary__Group_0__1__Impl : ( ruleExpr ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6392:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:6393:1: ( ruleExpr )
            {
            // InternalAdaptSem.g:6393:1: ( ruleExpr )
            // InternalAdaptSem.g:6394:2: ruleExpr
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
    // InternalAdaptSem.g:6403:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6407:1: ( rule__Primary__Group_0__2__Impl )
            // InternalAdaptSem.g:6408:2: rule__Primary__Group_0__2__Impl
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
    // InternalAdaptSem.g:6414:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6418:1: ( ( ')' ) )
            // InternalAdaptSem.g:6419:1: ( ')' )
            {
            // InternalAdaptSem.g:6419:1: ( ')' )
            // InternalAdaptSem.g:6420:2: ')'
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
    // InternalAdaptSem.g:6430:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6434:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalAdaptSem.g:6435:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalAdaptSem.g:6442:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6446:1: ( ( () ) )
            // InternalAdaptSem.g:6447:1: ( () )
            {
            // InternalAdaptSem.g:6447:1: ( () )
            // InternalAdaptSem.g:6448:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalAdaptSem.g:6449:2: ()
            // InternalAdaptSem.g:6449:3: 
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
    // InternalAdaptSem.g:6457:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6461:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalAdaptSem.g:6462:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalAdaptSem.g:6469:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6473:1: ( ( '!' ) )
            // InternalAdaptSem.g:6474:1: ( '!' )
            {
            // InternalAdaptSem.g:6474:1: ( '!' )
            // InternalAdaptSem.g:6475:2: '!'
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
    // InternalAdaptSem.g:6484:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6488:1: ( rule__Primary__Group_1__2__Impl )
            // InternalAdaptSem.g:6489:2: rule__Primary__Group_1__2__Impl
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
    // InternalAdaptSem.g:6495:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExprAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6499:1: ( ( ( rule__Primary__ExprAssignment_1_2 ) ) )
            // InternalAdaptSem.g:6500:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:6500:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            // InternalAdaptSem.g:6501:2: ( rule__Primary__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_1_2()); 
            }
            // InternalAdaptSem.g:6502:2: ( rule__Primary__ExprAssignment_1_2 )
            // InternalAdaptSem.g:6502:3: rule__Primary__ExprAssignment_1_2
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
    // InternalAdaptSem.g:6511:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6515:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAdaptSem.g:6516:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalAdaptSem.g:6523:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6527:1: ( ( () ) )
            // InternalAdaptSem.g:6528:1: ( () )
            {
            // InternalAdaptSem.g:6528:1: ( () )
            // InternalAdaptSem.g:6529:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getOppositeAction_2_0()); 
            }
            // InternalAdaptSem.g:6530:2: ()
            // InternalAdaptSem.g:6530:3: 
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
    // InternalAdaptSem.g:6538:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6542:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAdaptSem.g:6543:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalAdaptSem.g:6550:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6554:1: ( ( '-' ) )
            // InternalAdaptSem.g:6555:1: ( '-' )
            {
            // InternalAdaptSem.g:6555:1: ( '-' )
            // InternalAdaptSem.g:6556:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6565:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6569:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAdaptSem.g:6570:2: rule__Primary__Group_2__2__Impl
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
    // InternalAdaptSem.g:6576:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExprAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6580:1: ( ( ( rule__Primary__ExprAssignment_2_2 ) ) )
            // InternalAdaptSem.g:6581:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            {
            // InternalAdaptSem.g:6581:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            // InternalAdaptSem.g:6582:2: ( rule__Primary__ExprAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_2_2()); 
            }
            // InternalAdaptSem.g:6583:2: ( rule__Primary__ExprAssignment_2_2 )
            // InternalAdaptSem.g:6583:3: rule__Primary__ExprAssignment_2_2
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


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalAdaptSem.g:6592:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6596:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalAdaptSem.g:6597:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalAdaptSem.g:6604:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6608:1: ( ( () ) )
            // InternalAdaptSem.g:6609:1: ( () )
            {
            // InternalAdaptSem.g:6609:1: ( () )
            // InternalAdaptSem.g:6610:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }
            // InternalAdaptSem.g:6611:2: ()
            // InternalAdaptSem.g:6611:3: 
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
    // InternalAdaptSem.g:6619:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6623:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalAdaptSem.g:6624:2: rule__Atomic__Group_0__1__Impl
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
    // InternalAdaptSem.g:6630:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6634:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalAdaptSem.g:6635:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:6635:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalAdaptSem.g:6636:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalAdaptSem.g:6637:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalAdaptSem.g:6637:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalAdaptSem.g:6646:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6650:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalAdaptSem.g:6651:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalAdaptSem.g:6658:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6662:1: ( ( () ) )
            // InternalAdaptSem.g:6663:1: ( () )
            {
            // InternalAdaptSem.g:6663:1: ( () )
            // InternalAdaptSem.g:6664:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0()); 
            }
            // InternalAdaptSem.g:6665:2: ()
            // InternalAdaptSem.g:6665:3: 
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
    // InternalAdaptSem.g:6673:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6677:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalAdaptSem.g:6678:2: rule__Atomic__Group_1__1__Impl
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
    // InternalAdaptSem.g:6684:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6688:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6689:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6689:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalAdaptSem.g:6690:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6691:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalAdaptSem.g:6691:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalAdaptSem.g:6700:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6704:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalAdaptSem.g:6705:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalAdaptSem.g:6712:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6716:1: ( ( () ) )
            // InternalAdaptSem.g:6717:1: ( () )
            {
            // InternalAdaptSem.g:6717:1: ( () )
            // InternalAdaptSem.g:6718:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            }
            // InternalAdaptSem.g:6719:2: ()
            // InternalAdaptSem.g:6719:3: 
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
    // InternalAdaptSem.g:6727:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6731:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalAdaptSem.g:6732:2: rule__Atomic__Group_2__1__Impl
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
    // InternalAdaptSem.g:6738:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6742:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalAdaptSem.g:6743:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalAdaptSem.g:6743:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalAdaptSem.g:6744:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalAdaptSem.g:6745:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalAdaptSem.g:6745:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalAdaptSem.g:6754:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6758:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalAdaptSem.g:6759:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalAdaptSem.g:6766:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6770:1: ( ( () ) )
            // InternalAdaptSem.g:6771:1: ( () )
            {
            // InternalAdaptSem.g:6771:1: ( () )
            // InternalAdaptSem.g:6772:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }
            // InternalAdaptSem.g:6773:2: ()
            // InternalAdaptSem.g:6773:3: 
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
    // InternalAdaptSem.g:6781:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6785:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalAdaptSem.g:6786:2: rule__Atomic__Group_3__1__Impl
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
    // InternalAdaptSem.g:6792:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6796:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalAdaptSem.g:6797:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalAdaptSem.g:6797:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalAdaptSem.g:6798:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalAdaptSem.g:6799:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalAdaptSem.g:6799:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalAdaptSem.g:6808:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6812:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAdaptSem.g:6813:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalAdaptSem.g:6820:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6824:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:6825:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:6825:1: ( RULE_ID )
            // InternalAdaptSem.g:6826:2: RULE_ID
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
    // InternalAdaptSem.g:6835:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6839:1: ( rule__FQN__Group__1__Impl )
            // InternalAdaptSem.g:6840:2: rule__FQN__Group__1__Impl
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
    // InternalAdaptSem.g:6846:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6850:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAdaptSem.g:6851:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6851:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAdaptSem.g:6852:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6853:2: ( rule__FQN__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAdaptSem.g:6853:3: rule__FQN__Group_1__0
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
    // InternalAdaptSem.g:6862:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6866:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAdaptSem.g:6867:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalAdaptSem.g:6874:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6878:1: ( ( '.' ) )
            // InternalAdaptSem.g:6879:1: ( '.' )
            {
            // InternalAdaptSem.g:6879:1: ( '.' )
            // InternalAdaptSem.g:6880:2: '.'
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
    // InternalAdaptSem.g:6889:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6893:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAdaptSem.g:6894:2: rule__FQN__Group_1__1__Impl
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
    // InternalAdaptSem.g:6900:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6904:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:6905:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:6905:1: ( RULE_ID )
            // InternalAdaptSem.g:6906:2: RULE_ID
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
    // InternalAdaptSem.g:6916:1: rule__OperationFQN__Group__0 : rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 ;
    public final void rule__OperationFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6920:1: ( rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 )
            // InternalAdaptSem.g:6921:2: rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1
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
    // InternalAdaptSem.g:6928:1: rule__OperationFQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6932:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:6933:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:6933:1: ( RULE_ID )
            // InternalAdaptSem.g:6934:2: RULE_ID
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
    // InternalAdaptSem.g:6943:1: rule__OperationFQN__Group__1 : rule__OperationFQN__Group__1__Impl ;
    public final void rule__OperationFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6947:1: ( rule__OperationFQN__Group__1__Impl )
            // InternalAdaptSem.g:6948:2: rule__OperationFQN__Group__1__Impl
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
    // InternalAdaptSem.g:6954:1: rule__OperationFQN__Group__1__Impl : ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) ;
    public final void rule__OperationFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6958:1: ( ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) )
            // InternalAdaptSem.g:6959:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            {
            // InternalAdaptSem.g:6959:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            // InternalAdaptSem.g:6960:2: ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6960:2: ( ( rule__OperationFQN__Group_1__0 ) )
            // InternalAdaptSem.g:6961:3: ( rule__OperationFQN__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6962:3: ( rule__OperationFQN__Group_1__0 )
            // InternalAdaptSem.g:6962:4: rule__OperationFQN__Group_1__0
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

            // InternalAdaptSem.g:6965:2: ( ( rule__OperationFQN__Group_1__0 )* )
            // InternalAdaptSem.g:6966:3: ( rule__OperationFQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6967:3: ( rule__OperationFQN__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAdaptSem.g:6967:4: rule__OperationFQN__Group_1__0
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
    // InternalAdaptSem.g:6977:1: rule__OperationFQN__Group_1__0 : rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 ;
    public final void rule__OperationFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6981:1: ( rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 )
            // InternalAdaptSem.g:6982:2: rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1
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
    // InternalAdaptSem.g:6989:1: rule__OperationFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__OperationFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6993:1: ( ( '.' ) )
            // InternalAdaptSem.g:6994:1: ( '.' )
            {
            // InternalAdaptSem.g:6994:1: ( '.' )
            // InternalAdaptSem.g:6995:2: '.'
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
    // InternalAdaptSem.g:7004:1: rule__OperationFQN__Group_1__1 : rule__OperationFQN__Group_1__1__Impl ;
    public final void rule__OperationFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7008:1: ( rule__OperationFQN__Group_1__1__Impl )
            // InternalAdaptSem.g:7009:2: rule__OperationFQN__Group_1__1__Impl
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
    // InternalAdaptSem.g:7015:1: rule__OperationFQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7019:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7020:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7020:1: ( RULE_ID )
            // InternalAdaptSem.g:7021:2: RULE_ID
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
    // InternalAdaptSem.g:7031:1: rule__AdaptiveSemantics__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__AdaptiveSemantics__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7035:1: ( ( ruleModel ) )
            // InternalAdaptSem.g:7036:2: ( ruleModel )
            {
            // InternalAdaptSem.g:7036:2: ( ruleModel )
            // InternalAdaptSem.g:7037:3: ruleModel
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
    // InternalAdaptSem.g:7046:1: rule__AdaptiveSemantics__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__AdaptiveSemantics__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7050:1: ( ( ruleImport ) )
            // InternalAdaptSem.g:7051:2: ( ruleImport )
            {
            // InternalAdaptSem.g:7051:2: ( ruleImport )
            // InternalAdaptSem.g:7052:3: ruleImport
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
    // InternalAdaptSem.g:7061:1: rule__AdaptiveSemantics__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__AdaptiveSemantics__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7065:1: ( ( ruleRule ) )
            // InternalAdaptSem.g:7066:2: ( ruleRule )
            {
            // InternalAdaptSem.g:7066:2: ( ruleRule )
            // InternalAdaptSem.g:7067:3: ruleRule
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
    // InternalAdaptSem.g:7076:1: rule__Model__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7080:1: ( ( ruleEString ) )
            // InternalAdaptSem.g:7081:2: ( ruleEString )
            {
            // InternalAdaptSem.g:7081:2: ( ruleEString )
            // InternalAdaptSem.g:7082:3: ruleEString
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
    // InternalAdaptSem.g:7091:1: rule__Model__SemanticdomainAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Model__SemanticdomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7095:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7096:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7096:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7097:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0()); 
            }
            // InternalAdaptSem.g:7098:3: ( ruleFQN )
            // InternalAdaptSem.g:7099:4: ruleFQN
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
    // InternalAdaptSem.g:7110:1: rule__Import__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7114:1: ( ( ruleEString ) )
            // InternalAdaptSem.g:7115:2: ( ruleEString )
            {
            // InternalAdaptSem.g:7115:2: ( ruleEString )
            // InternalAdaptSem.g:7116:3: ruleEString
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
    // InternalAdaptSem.g:7125:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7129:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7130:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7130:2: ( RULE_ID )
            // InternalAdaptSem.g:7131:3: RULE_ID
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
    // InternalAdaptSem.g:7140:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7144:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7145:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7145:2: ( RULE_ID )
            // InternalAdaptSem.g:7146:3: RULE_ID
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
    // InternalAdaptSem.g:7155:1: rule__Rule__ConclusionAssignment_3 : ( ruleConclusion ) ;
    public final void rule__Rule__ConclusionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7159:1: ( ( ruleConclusion ) )
            // InternalAdaptSem.g:7160:2: ( ruleConclusion )
            {
            // InternalAdaptSem.g:7160:2: ( ruleConclusion )
            // InternalAdaptSem.g:7161:3: ruleConclusion
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
    // InternalAdaptSem.g:7170:1: rule__Rule__ConditionsAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7174:1: ( ( ruleCondition ) )
            // InternalAdaptSem.g:7175:2: ( ruleCondition )
            {
            // InternalAdaptSem.g:7175:2: ( ruleCondition )
            // InternalAdaptSem.g:7176:3: ruleCondition
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
    // InternalAdaptSem.g:7185:1: rule__Rule__ConditionsAssignment_4_2_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7189:1: ( ( ruleCondition ) )
            // InternalAdaptSem.g:7190:2: ( ruleCondition )
            {
            // InternalAdaptSem.g:7190:2: ( ruleCondition )
            // InternalAdaptSem.g:7191:3: ruleCondition
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
    // InternalAdaptSem.g:7200:1: rule__Rule__PremisesAssignment_5_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7204:1: ( ( rulePremise ) )
            // InternalAdaptSem.g:7205:2: ( rulePremise )
            {
            // InternalAdaptSem.g:7205:2: ( rulePremise )
            // InternalAdaptSem.g:7206:3: rulePremise
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
    // InternalAdaptSem.g:7215:1: rule__Rule__PremisesAssignment_5_2_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7219:1: ( ( rulePremise ) )
            // InternalAdaptSem.g:7220:2: ( rulePremise )
            {
            // InternalAdaptSem.g:7220:2: ( rulePremise )
            // InternalAdaptSem.g:7221:3: rulePremise
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
    // InternalAdaptSem.g:7230:1: rule__Rule__BindingsAssignment_6_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7234:1: ( ( ruleBinding ) )
            // InternalAdaptSem.g:7235:2: ( ruleBinding )
            {
            // InternalAdaptSem.g:7235:2: ( ruleBinding )
            // InternalAdaptSem.g:7236:3: ruleBinding
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
    // InternalAdaptSem.g:7245:1: rule__Rule__BindingsAssignment_6_2_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7249:1: ( ( ruleBinding ) )
            // InternalAdaptSem.g:7250:2: ( ruleBinding )
            {
            // InternalAdaptSem.g:7250:2: ( ruleBinding )
            // InternalAdaptSem.g:7251:3: ruleBinding
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
    // InternalAdaptSem.g:7260:1: rule__Rule__InputsAssignment_7_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7264:1: ( ( ruleInput ) )
            // InternalAdaptSem.g:7265:2: ( ruleInput )
            {
            // InternalAdaptSem.g:7265:2: ( ruleInput )
            // InternalAdaptSem.g:7266:3: ruleInput
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
    // InternalAdaptSem.g:7275:1: rule__Rule__OutputsAssignment_7_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7279:1: ( ( ruleOutput ) )
            // InternalAdaptSem.g:7280:2: ( ruleOutput )
            {
            // InternalAdaptSem.g:7280:2: ( ruleOutput )
            // InternalAdaptSem.g:7281:3: ruleOutput
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
    // InternalAdaptSem.g:7290:1: rule__Rule__InputsAssignment_7_2_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7294:1: ( ( ruleInput ) )
            // InternalAdaptSem.g:7295:2: ( ruleInput )
            {
            // InternalAdaptSem.g:7295:2: ( ruleInput )
            // InternalAdaptSem.g:7296:3: ruleInput
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
    // InternalAdaptSem.g:7305:1: rule__Rule__OutputsAssignment_7_2_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7309:1: ( ( ruleOutput ) )
            // InternalAdaptSem.g:7310:2: ( ruleOutput )
            {
            // InternalAdaptSem.g:7310:2: ( ruleOutput )
            // InternalAdaptSem.g:7311:3: ruleOutput
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
    // InternalAdaptSem.g:7320:1: rule__Condition__CondAssignment_1 : ( ruleCondExpr ) ;
    public final void rule__Condition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7324:1: ( ( ruleCondExpr ) )
            // InternalAdaptSem.g:7325:2: ( ruleCondExpr )
            {
            // InternalAdaptSem.g:7325:2: ( ruleCondExpr )
            // InternalAdaptSem.g:7326:3: ruleCondExpr
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
    // InternalAdaptSem.g:7335:1: rule__Input__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Input__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7339:1: ( ( ruleAssignee ) )
            // InternalAdaptSem.g:7340:2: ( ruleAssignee )
            {
            // InternalAdaptSem.g:7340:2: ( ruleAssignee )
            // InternalAdaptSem.g:7341:3: ruleAssignee
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
    // InternalAdaptSem.g:7350:1: rule__Input__OperationAssignment_2 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Input__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7354:1: ( ( ( ruleOperationFQN ) ) )
            // InternalAdaptSem.g:7355:2: ( ( ruleOperationFQN ) )
            {
            // InternalAdaptSem.g:7355:2: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:7356:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0()); 
            }
            // InternalAdaptSem.g:7357:3: ( ruleOperationFQN )
            // InternalAdaptSem.g:7358:4: ruleOperationFQN
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
    // InternalAdaptSem.g:7369:1: rule__Output__OperationAssignment_0 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Output__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7373:1: ( ( ( ruleOperationFQN ) ) )
            // InternalAdaptSem.g:7374:2: ( ( ruleOperationFQN ) )
            {
            // InternalAdaptSem.g:7374:2: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:7375:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:7376:3: ( ruleOperationFQN )
            // InternalAdaptSem.g:7377:4: ruleOperationFQN
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
    // InternalAdaptSem.g:7388:1: rule__Output__ArgsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7392:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7393:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7393:2: ( ruleTermRef )
            // InternalAdaptSem.g:7394:3: ruleTermRef
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
    // InternalAdaptSem.g:7403:1: rule__Output__ArgsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7407:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7408:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7408:2: ( ruleTermRef )
            // InternalAdaptSem.g:7409:3: ruleTermRef
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
    // InternalAdaptSem.g:7418:1: rule__Binding__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Binding__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7422:1: ( ( ruleAssignee ) )
            // InternalAdaptSem.g:7423:2: ( ruleAssignee )
            {
            // InternalAdaptSem.g:7423:2: ( ruleAssignee )
            // InternalAdaptSem.g:7424:3: ruleAssignee
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
    // InternalAdaptSem.g:7433:1: rule__Binding__ExprAssignment_2 : ( ruleAssignable ) ;
    public final void rule__Binding__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7437:1: ( ( ruleAssignable ) )
            // InternalAdaptSem.g:7438:2: ( ruleAssignable )
            {
            // InternalAdaptSem.g:7438:2: ( ruleAssignable )
            // InternalAdaptSem.g:7439:3: ruleAssignable
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
    // InternalAdaptSem.g:7448:1: rule__SemanticDomainAccess__RecieverAssignment_0 : ( ruleTerminalAccessExpression ) ;
    public final void rule__SemanticDomainAccess__RecieverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7452:1: ( ( ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:7453:2: ( ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:7453:2: ( ruleTerminalAccessExpression )
            // InternalAdaptSem.g:7454:3: ruleTerminalAccessExpression
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
    // InternalAdaptSem.g:7463:1: rule__SemanticDomainAccess__FieldAssignment_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7467:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7468:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7468:2: ( RULE_ID )
            // InternalAdaptSem.g:7469:3: RULE_ID
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
    // InternalAdaptSem.g:7478:1: rule__SemanticDomainAccess__FieldAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7482:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7483:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7483:2: ( RULE_ID )
            // InternalAdaptSem.g:7484:3: RULE_ID
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
    // InternalAdaptSem.g:7493:1: rule__Conclusion__FromAssignment_0 : ( ruleDefConfiguration ) ;
    public final void rule__Conclusion__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7497:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:7498:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:7498:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:7499:3: ruleDefConfiguration
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
    // InternalAdaptSem.g:7508:1: rule__Conclusion__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Conclusion__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7512:1: ( ( ( 'termination' ) ) )
            // InternalAdaptSem.g:7513:2: ( ( 'termination' ) )
            {
            // InternalAdaptSem.g:7513:2: ( ( 'termination' ) )
            // InternalAdaptSem.g:7514:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalAdaptSem.g:7515:3: ( 'termination' )
            // InternalAdaptSem.g:7516:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7527:1: rule__Conclusion__ToAssignment_3 : ( ruleSingleTermRef ) ;
    public final void rule__Conclusion__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7531:1: ( ( ruleSingleTermRef ) )
            // InternalAdaptSem.g:7532:2: ( ruleSingleTermRef )
            {
            // InternalAdaptSem.g:7532:2: ( ruleSingleTermRef )
            // InternalAdaptSem.g:7533:3: ruleSingleTermRef
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
    // InternalAdaptSem.g:7542:1: rule__Premise__FromAssignment_0 : ( ruleSymbolRef ) ;
    public final void rule__Premise__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7546:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:7547:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:7547:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:7548:3: ruleSymbolRef
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
    // InternalAdaptSem.g:7557:1: rule__Premise__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Premise__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7561:1: ( ( ( 'termination' ) ) )
            // InternalAdaptSem.g:7562:2: ( ( 'termination' ) )
            {
            // InternalAdaptSem.g:7562:2: ( ( 'termination' ) )
            // InternalAdaptSem.g:7563:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalAdaptSem.g:7564:3: ( 'termination' )
            // InternalAdaptSem.g:7565:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7576:1: rule__Premise__ToAssignment_3 : ( ruleSingleTermDef ) ;
    public final void rule__Premise__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7580:1: ( ( ruleSingleTermDef ) )
            // InternalAdaptSem.g:7581:2: ( ruleSingleTermDef )
            {
            // InternalAdaptSem.g:7581:2: ( ruleSingleTermDef )
            // InternalAdaptSem.g:7582:3: ruleSingleTermDef
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
    // InternalAdaptSem.g:7591:1: rule__DefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__DefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7595:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7596:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7596:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7597:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:7598:3: ( ruleFQN )
            // InternalAdaptSem.g:7599:4: ruleFQN
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
    // InternalAdaptSem.g:7610:1: rule__DefConfiguration__ChildsAssignment_2_0 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7614:1: ( ( ruleTermDef ) )
            // InternalAdaptSem.g:7615:2: ( ruleTermDef )
            {
            // InternalAdaptSem.g:7615:2: ( ruleTermDef )
            // InternalAdaptSem.g:7616:3: ruleTermDef
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
    // InternalAdaptSem.g:7625:1: rule__DefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7629:1: ( ( ruleTermDef ) )
            // InternalAdaptSem.g:7630:2: ( ruleTermDef )
            {
            // InternalAdaptSem.g:7630:2: ( ruleTermDef )
            // InternalAdaptSem.g:7631:3: ruleTermDef
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
    // InternalAdaptSem.g:7640:1: rule__RefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__RefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7644:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7645:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7645:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7646:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:7647:3: ( ruleFQN )
            // InternalAdaptSem.g:7648:4: ruleFQN
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
    // InternalAdaptSem.g:7659:1: rule__RefConfiguration__ChildsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7663:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7664:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7664:2: ( ruleTermRef )
            // InternalAdaptSem.g:7665:3: ruleTermRef
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
    // InternalAdaptSem.g:7674:1: rule__RefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7678:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:7679:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:7679:2: ( ruleTermRef )
            // InternalAdaptSem.g:7680:3: ruleTermRef
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
    // InternalAdaptSem.g:7689:1: rule__SymbolDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7693:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7694:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7694:2: ( RULE_ID )
            // InternalAdaptSem.g:7695:3: RULE_ID
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
    // InternalAdaptSem.g:7704:1: rule__SymbolRef__DefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7708:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptSem.g:7709:2: ( ( RULE_ID ) )
            {
            // InternalAdaptSem.g:7709:2: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7710:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0()); 
            }
            // InternalAdaptSem.g:7711:3: ( RULE_ID )
            // InternalAdaptSem.g:7712:4: RULE_ID
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
    // InternalAdaptSem.g:7723:1: rule__ListDef__HeadAssignment_1 : ( ruleSingleTermDef ) ;
    public final void rule__ListDef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7727:1: ( ( ruleSingleTermDef ) )
            // InternalAdaptSem.g:7728:2: ( ruleSingleTermDef )
            {
            // InternalAdaptSem.g:7728:2: ( ruleSingleTermDef )
            // InternalAdaptSem.g:7729:3: ruleSingleTermDef
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
    // InternalAdaptSem.g:7738:1: rule__ListDef__TailAssignment_3 : ( ruleSymbolDef ) ;
    public final void rule__ListDef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7742:1: ( ( ruleSymbolDef ) )
            // InternalAdaptSem.g:7743:2: ( ruleSymbolDef )
            {
            // InternalAdaptSem.g:7743:2: ( ruleSymbolDef )
            // InternalAdaptSem.g:7744:3: ruleSymbolDef
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
    // InternalAdaptSem.g:7753:1: rule__ListRef__HeadAssignment_1 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7757:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:7758:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:7758:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:7759:3: ruleSymbolRef
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
    // InternalAdaptSem.g:7768:1: rule__ListRef__TailAssignment_3 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7772:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:7773:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:7773:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:7774:3: ruleSymbolRef
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
    // InternalAdaptSem.g:7783:1: rule__CondNot__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__CondNot__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7787:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:7788:2: ( ruleExpr )
            {
            // InternalAdaptSem.g:7788:2: ( ruleExpr )
            // InternalAdaptSem.g:7789:3: ruleExpr
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
    // InternalAdaptSem.g:7798:1: rule__CondOr__LhsAssignment_1 : ( ruleAnd ) ;
    public final void rule__CondOr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7802:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:7803:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:7803:2: ( ruleAnd )
            // InternalAdaptSem.g:7804:3: ruleAnd
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
    // InternalAdaptSem.g:7813:1: rule__CondOr__RhsAssignment_3 : ( ruleAnd ) ;
    public final void rule__CondOr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7817:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:7818:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:7818:2: ( ruleAnd )
            // InternalAdaptSem.g:7819:3: ruleAnd
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
    // InternalAdaptSem.g:7828:1: rule__CondAnd__LhsAssignment_1 : ( ruleEquality ) ;
    public final void rule__CondAnd__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7832:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:7833:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:7833:2: ( ruleEquality )
            // InternalAdaptSem.g:7834:3: ruleEquality
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
    // InternalAdaptSem.g:7843:1: rule__CondAnd__RhsAssignment_3 : ( ruleEquality ) ;
    public final void rule__CondAnd__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7847:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:7848:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:7848:2: ( ruleEquality )
            // InternalAdaptSem.g:7849:3: ruleEquality
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
    // InternalAdaptSem.g:7858:1: rule__CondEquality__LhsAssignment_0_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7862:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:7863:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:7863:2: ( ruleComparison )
            // InternalAdaptSem.g:7864:3: ruleComparison
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
    // InternalAdaptSem.g:7873:1: rule__CondEquality__RhsAssignment_0_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7877:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:7878:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:7878:2: ( ruleComparison )
            // InternalAdaptSem.g:7879:3: ruleComparison
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
    // InternalAdaptSem.g:7888:1: rule__CondEquality__LhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7892:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:7893:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:7893:2: ( ruleComparison )
            // InternalAdaptSem.g:7894:3: ruleComparison
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
    // InternalAdaptSem.g:7903:1: rule__CondEquality__RhsAssignment_1_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7907:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:7908:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:7908:2: ( ruleComparison )
            // InternalAdaptSem.g:7909:3: ruleComparison
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
    // InternalAdaptSem.g:7918:1: rule__CondComparison__LhsAssignment_0_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7922:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:7923:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:7923:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:7924:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:7933:1: rule__CondComparison__RhsAssignment_0_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7937:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:7938:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:7938:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:7939:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:7948:1: rule__CondComparison__LhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7952:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:7953:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:7953:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:7954:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:7963:1: rule__CondComparison__RhsAssignment_1_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7967:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:7968:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:7968:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:7969:3: rulePlusOrMinus
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


    // $ANTLR start "rule__Or__RhsAssignment_1_2"
    // InternalAdaptSem.g:7978:1: rule__Or__RhsAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7982:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:7983:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:7983:2: ( ruleAnd )
            // InternalAdaptSem.g:7984:3: ruleAnd
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
    // InternalAdaptSem.g:7993:1: rule__And__RhsAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7997:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:7998:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:7998:2: ( ruleEquality )
            // InternalAdaptSem.g:7999:3: ruleEquality
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
    // InternalAdaptSem.g:8008:1: rule__Equality__RhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8012:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8013:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8013:2: ( ruleComparison )
            // InternalAdaptSem.g:8014:3: ruleComparison
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
    // InternalAdaptSem.g:8023:1: rule__Comparison__RhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8027:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8028:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8028:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8029:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:8038:1: rule__PlusOrMinus__RhsAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8042:1: ( ( ruleMulOrDiv ) )
            // InternalAdaptSem.g:8043:2: ( ruleMulOrDiv )
            {
            // InternalAdaptSem.g:8043:2: ( ruleMulOrDiv )
            // InternalAdaptSem.g:8044:3: ruleMulOrDiv
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
    // InternalAdaptSem.g:8053:1: rule__MulOrDiv__RhsAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8057:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8058:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8058:2: ( rulePrimary )
            // InternalAdaptSem.g:8059:3: rulePrimary
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
    // InternalAdaptSem.g:8068:1: rule__Primary__ExprAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8072:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8073:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8073:2: ( rulePrimary )
            // InternalAdaptSem.g:8074:3: rulePrimary
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
    // InternalAdaptSem.g:8083:1: rule__Primary__ExprAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8087:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8088:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8088:2: ( rulePrimary )
            // InternalAdaptSem.g:8089:3: rulePrimary
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


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalAdaptSem.g:8098:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8102:1: ( ( RULE_INT ) )
            // InternalAdaptSem.g:8103:2: ( RULE_INT )
            {
            // InternalAdaptSem.g:8103:2: ( RULE_INT )
            // InternalAdaptSem.g:8104:3: RULE_INT
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
    // InternalAdaptSem.g:8113:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8117:1: ( ( RULE_DOUBLE ) )
            // InternalAdaptSem.g:8118:2: ( RULE_DOUBLE )
            {
            // InternalAdaptSem.g:8118:2: ( RULE_DOUBLE )
            // InternalAdaptSem.g:8119:3: RULE_DOUBLE
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
    // InternalAdaptSem.g:8128:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8132:1: ( ( RULE_STRING ) )
            // InternalAdaptSem.g:8133:2: ( RULE_STRING )
            {
            // InternalAdaptSem.g:8133:2: ( RULE_STRING )
            // InternalAdaptSem.g:8134:3: RULE_STRING
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
    // InternalAdaptSem.g:8143:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8147:1: ( ( RULE_BOOL ) )
            // InternalAdaptSem.g:8148:2: ( RULE_BOOL )
            {
            // InternalAdaptSem.g:8148:2: ( RULE_BOOL )
            // InternalAdaptSem.g:8149:3: RULE_BOOL
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
        // InternalAdaptSem.g:1200:2: ( ( ruleExpr ) )
        // InternalAdaptSem.g:1200:2: ( ruleExpr )
        {
        // InternalAdaptSem.g:1200:2: ( ruleExpr )
        // InternalAdaptSem.g:1201:3: ruleExpr
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

    // $ANTLR start synpred13_InternalAdaptSem
    public final void synpred13_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1365:2: ( ( ruleCondOr ) )
        // InternalAdaptSem.g:1365:2: ( ruleCondOr )
        {
        // InternalAdaptSem.g:1365:2: ( ruleCondOr )
        // InternalAdaptSem.g:1366:3: ruleCondOr
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
        // InternalAdaptSem.g:1371:2: ( ( ruleCondAnd ) )
        // InternalAdaptSem.g:1371:2: ( ruleCondAnd )
        {
        // InternalAdaptSem.g:1371:2: ( ruleCondAnd )
        // InternalAdaptSem.g:1372:3: ruleCondAnd
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
        // InternalAdaptSem.g:1377:2: ( ( ruleCondEquality ) )
        // InternalAdaptSem.g:1377:2: ( ruleCondEquality )
        {
        // InternalAdaptSem.g:1377:2: ( ruleCondEquality )
        // InternalAdaptSem.g:1378:3: ruleCondEquality
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
        // InternalAdaptSem.g:1383:2: ( ( ruleCondComparison ) )
        // InternalAdaptSem.g:1383:2: ( ruleCondComparison )
        {
        // InternalAdaptSem.g:1383:2: ( ruleCondComparison )
        // InternalAdaptSem.g:1384:3: ruleCondComparison
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
        // InternalAdaptSem.g:1404:2: ( ( ( rule__CondEquality__Group_0__0 ) ) )
        // InternalAdaptSem.g:1404:2: ( ( rule__CondEquality__Group_0__0 ) )
        {
        // InternalAdaptSem.g:1404:2: ( ( rule__CondEquality__Group_0__0 ) )
        // InternalAdaptSem.g:1405:3: ( rule__CondEquality__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
        }
        // InternalAdaptSem.g:1406:3: ( rule__CondEquality__Group_0__0 )
        // InternalAdaptSem.g:1406:4: rule__CondEquality__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondEquality__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalAdaptSem

    // $ANTLR start synpred18_InternalAdaptSem
    public final void synpred18_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1425:2: ( ( ( rule__CondComparison__Group_0__0 ) ) )
        // InternalAdaptSem.g:1425:2: ( ( rule__CondComparison__Group_0__0 ) )
        {
        // InternalAdaptSem.g:1425:2: ( ( rule__CondComparison__Group_0__0 ) )
        // InternalAdaptSem.g:1426:3: ( rule__CondComparison__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
        }
        // InternalAdaptSem.g:1427:3: ( rule__CondComparison__Group_0__0 )
        // InternalAdaptSem.g:1427:4: rule__CondComparison__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondComparison__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalAdaptSem

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
            return "1153:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );";
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
            return "1174:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\2\1\6\uffff";
    static final String dfa_9s = "\1\4\1\uffff\2\21\1\5\1\uffff\1\5\1\31\1\0\1\uffff";
    static final String dfa_10s = "\1\52\1\uffff\2\54\1\5\1\uffff\1\5\1\33\1\0\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\2\3\uffff\1\3";
    static final String dfa_12s = "\7\uffff\1\0\1\1\1\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\3\1\20\uffff\1\1\2\uffff\1\3\5\uffff\1\1\7\uffff\1\1",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\1\5\1\uffff\1\4\7\uffff\12\1",
            "\1\1\2\uffff\1\1\2\uffff\1\1\3\uffff\1\6\7\uffff\12\1",
            "\1\7",
            "",
            "\1\10",
            "\1\5\1\uffff\1\5",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1195:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_7==25||LA3_7==27) ) {s = 5;}

                        else if ( (synpred3_InternalAdaptSem()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAdaptSem()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_8);
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
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\1\4\11\0\5\uffff";
    static final String dfa_16s = "\1\52\11\0\5\uffff";
    static final String dfa_17s = "\12\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\1\10\1\4\1\5\1\7\20\uffff\1\1\2\uffff\1\11\5\uffff\1\2\7\uffff\1\3",
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
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1360:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) );";
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

                        else if ( (true) ) {s = 14;}

                         
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
    static final String dfa_20s = "\14\uffff";
    static final String dfa_21s = "\1\4\11\0\2\uffff";
    static final String dfa_22s = "\1\52\11\0\2\uffff";
    static final String dfa_23s = "\12\uffff\1\1\1\2";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_25s = {
            "\1\6\1\10\1\4\1\5\1\7\20\uffff\1\1\2\uffff\1\11\5\uffff\1\2\7\uffff\1\3",
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

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1399:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );";
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
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalAdaptSem()) ) {s = 10;}

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
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1420:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );";
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
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAdaptSem()) ) {s = 10;}

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000404120001F0L});
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200244000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200240000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000100L});

}