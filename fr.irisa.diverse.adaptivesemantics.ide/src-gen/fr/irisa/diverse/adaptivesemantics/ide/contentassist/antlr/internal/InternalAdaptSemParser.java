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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'with'", "'import'", "'as'", "'rule'", "','", "'where'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'on'", "'.'", "'self'", "'->'", "':'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'match'", "'+'", "'-'", "'*'", "'/'", "'termination'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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


    // $ANTLR start "rule__Input__TargetAlternatives_6_1_0"
    // InternalAdaptSem.g:1220:1: rule__Input__TargetAlternatives_6_1_0 : ( ( ruleTerminalAccessExpression ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Input__TargetAlternatives_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1224:1: ( ( ruleTerminalAccessExpression ) | ( ruleSemanticDomainAccess ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==17||LA3_1==20) ) {
                    alt3=1;
                }
                else if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==29) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==17||LA3_2==20) ) {
                    alt3=1;
                }
                else if ( (LA3_2==28) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdaptSem.g:1225:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalAdaptSem.g:1225:2: ( ruleTerminalAccessExpression )
                    // InternalAdaptSem.g:1226:3: ruleTerminalAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getTargetTerminalAccessExpressionParserRuleCall_6_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTerminalAccessExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getTargetTerminalAccessExpressionParserRuleCall_6_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1231:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1231:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1232:3: ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getTargetSemanticDomainAccessParserRuleCall_6_1_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getTargetSemanticDomainAccessParserRuleCall_6_1_0_1()); 
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
    // $ANTLR end "rule__Input__TargetAlternatives_6_1_0"


    // $ANTLR start "rule__Output__TargetAlternatives_4_1_0"
    // InternalAdaptSem.g:1241:1: rule__Output__TargetAlternatives_4_1_0 : ( ( ruleTerminalAccessExpression ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Output__TargetAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1245:1: ( ( ruleTerminalAccessExpression ) | ( ruleSemanticDomainAccess ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==17||LA4_1==20) ) {
                    alt4=1;
                }
                else if ( (LA4_1==28) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==29) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||LA4_2==17||LA4_2==20) ) {
                    alt4=1;
                }
                else if ( (LA4_2==28) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAdaptSem.g:1246:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalAdaptSem.g:1246:2: ( ruleTerminalAccessExpression )
                    // InternalAdaptSem.g:1247:3: ruleTerminalAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getTargetTerminalAccessExpressionParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTerminalAccessExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputAccess().getTargetTerminalAccessExpressionParserRuleCall_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:1252:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1252:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1253:3: ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOutputAccess().getTargetSemanticDomainAccessParserRuleCall_4_1_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOutputAccess().getTargetSemanticDomainAccessParserRuleCall_4_1_0_1()); 
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
    // $ANTLR end "rule__Output__TargetAlternatives_4_1_0"


    // $ANTLR start "rule__Assignable__Alternatives"
    // InternalAdaptSem.g:1262:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1266:1: ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAdaptSem.g:1267:2: ( ruleExpr )
                    {
                    // InternalAdaptSem.g:1267:2: ( ruleExpr )
                    // InternalAdaptSem.g:1268:3: ruleExpr
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
                    // InternalAdaptSem.g:1273:2: ( ruleRefConfiguration )
                    {
                    // InternalAdaptSem.g:1273:2: ( ruleRefConfiguration )
                    // InternalAdaptSem.g:1274:3: ruleRefConfiguration
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
                    // InternalAdaptSem.g:1279:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1279:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1280:3: ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:1289:1: rule__Assignee__Alternatives : ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1293:1: ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==28) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==24) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdaptSem.g:1294:2: ( ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1294:2: ( ruleSymbolDef )
                    // InternalAdaptSem.g:1295:3: ruleSymbolDef
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
                    // InternalAdaptSem.g:1300:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1300:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1301:3: ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:1310:1: rule__TerminalAccessExpression__Alternatives : ( ( ruleSymbolRef ) | ( ruleSelf ) );
    public final void rule__TerminalAccessExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1314:1: ( ( ruleSymbolRef ) | ( ruleSelf ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdaptSem.g:1315:2: ( ruleSymbolRef )
                    {
                    // InternalAdaptSem.g:1315:2: ( ruleSymbolRef )
                    // InternalAdaptSem.g:1316:3: ruleSymbolRef
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
                    // InternalAdaptSem.g:1321:2: ( ruleSelf )
                    {
                    // InternalAdaptSem.g:1321:2: ( ruleSelf )
                    // InternalAdaptSem.g:1322:3: ruleSelf
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
    // InternalAdaptSem.g:1331:1: rule__TermDef__Alternatives : ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) );
    public final void rule__TermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1335:1: ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAdaptSem.g:1336:2: ( ruleSingleTermDef )
                    {
                    // InternalAdaptSem.g:1336:2: ( ruleSingleTermDef )
                    // InternalAdaptSem.g:1337:3: ruleSingleTermDef
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
                    // InternalAdaptSem.g:1342:2: ( ruleListDef )
                    {
                    // InternalAdaptSem.g:1342:2: ( ruleListDef )
                    // InternalAdaptSem.g:1343:3: ruleListDef
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
                    // InternalAdaptSem.g:1348:2: ( ruleVoidList )
                    {
                    // InternalAdaptSem.g:1348:2: ( ruleVoidList )
                    // InternalAdaptSem.g:1349:3: ruleVoidList
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
    // InternalAdaptSem.g:1358:1: rule__TermRef__Alternatives : ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) );
    public final void rule__TermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1362:1: ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAdaptSem.g:1363:2: ( ruleSingleTermRef )
                    {
                    // InternalAdaptSem.g:1363:2: ( ruleSingleTermRef )
                    // InternalAdaptSem.g:1364:3: ruleSingleTermRef
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
                    // InternalAdaptSem.g:1369:2: ( ruleListRef )
                    {
                    // InternalAdaptSem.g:1369:2: ( ruleListRef )
                    // InternalAdaptSem.g:1370:3: ruleListRef
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
                    // InternalAdaptSem.g:1375:2: ( ruleVoidList )
                    {
                    // InternalAdaptSem.g:1375:2: ( ruleVoidList )
                    // InternalAdaptSem.g:1376:3: ruleVoidList
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
    // InternalAdaptSem.g:1385:1: rule__SingleTermDef__Alternatives : ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) );
    public final void rule__SingleTermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1389:1: ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||(LA10_1>=17 && LA10_1<=18)||LA10_1==20||(LA10_1>=22 && LA10_1<=23)||LA10_1==26||LA10_1==33) ) {
                    alt10=2;
                }
                else if ( (LA10_1==25||LA10_1==28) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAdaptSem.g:1390:2: ( ruleDefConfiguration )
                    {
                    // InternalAdaptSem.g:1390:2: ( ruleDefConfiguration )
                    // InternalAdaptSem.g:1391:3: ruleDefConfiguration
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
                    // InternalAdaptSem.g:1396:2: ( ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1396:2: ( ruleSymbolDef )
                    // InternalAdaptSem.g:1397:3: ruleSymbolDef
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
    // InternalAdaptSem.g:1406:1: rule__SingleTermRef__Alternatives : ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) );
    public final void rule__SingleTermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1410:1: ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==25||LA11_1==28) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||(LA11_1>=17 && LA11_1<=19)||(LA11_1>=21 && LA11_1<=23)||LA11_1==26) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdaptSem.g:1411:2: ( ( ruleRefConfiguration ) )
                    {
                    // InternalAdaptSem.g:1411:2: ( ( ruleRefConfiguration ) )
                    // InternalAdaptSem.g:1412:3: ( ruleRefConfiguration )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0()); 
                    }
                    // InternalAdaptSem.g:1413:3: ( ruleRefConfiguration )
                    // InternalAdaptSem.g:1413:4: ruleRefConfiguration
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
                    // InternalAdaptSem.g:1417:2: ( ruleSymbolRef )
                    {
                    // InternalAdaptSem.g:1417:2: ( ruleSymbolRef )
                    // InternalAdaptSem.g:1418:3: ruleSymbolRef
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
    // InternalAdaptSem.g:1427:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) );
    public final void rule__CondExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1431:1: ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) )
            int alt12=6;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAdaptSem.g:1432:2: ( ruleCondOr )
                    {
                    // InternalAdaptSem.g:1432:2: ( ruleCondOr )
                    // InternalAdaptSem.g:1433:3: ruleCondOr
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
                    // InternalAdaptSem.g:1438:2: ( ruleCondAnd )
                    {
                    // InternalAdaptSem.g:1438:2: ( ruleCondAnd )
                    // InternalAdaptSem.g:1439:3: ruleCondAnd
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
                    // InternalAdaptSem.g:1444:2: ( ruleCondEquality )
                    {
                    // InternalAdaptSem.g:1444:2: ( ruleCondEquality )
                    // InternalAdaptSem.g:1445:3: ruleCondEquality
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
                    // InternalAdaptSem.g:1450:2: ( ruleCondComparison )
                    {
                    // InternalAdaptSem.g:1450:2: ( ruleCondComparison )
                    // InternalAdaptSem.g:1451:3: ruleCondComparison
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
                    // InternalAdaptSem.g:1456:2: ( ruleCondNot )
                    {
                    // InternalAdaptSem.g:1456:2: ( ruleCondNot )
                    // InternalAdaptSem.g:1457:3: ruleCondNot
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
                    // InternalAdaptSem.g:1462:2: ( ruleCondIs )
                    {
                    // InternalAdaptSem.g:1462:2: ( ruleCondIs )
                    // InternalAdaptSem.g:1463:3: ruleCondIs
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
    // InternalAdaptSem.g:1472:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );
    public final void rule__CondEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1476:1: ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalAdaptSem.g:1477:2: ( ( rule__CondEquality__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1477:2: ( ( rule__CondEquality__Group_0__0 ) )
                    // InternalAdaptSem.g:1478:3: ( rule__CondEquality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1479:3: ( rule__CondEquality__Group_0__0 )
                    // InternalAdaptSem.g:1479:4: rule__CondEquality__Group_0__0
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
                    // InternalAdaptSem.g:1483:2: ( ( rule__CondEquality__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1483:2: ( ( rule__CondEquality__Group_1__0 ) )
                    // InternalAdaptSem.g:1484:3: ( rule__CondEquality__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1485:3: ( rule__CondEquality__Group_1__0 )
                    // InternalAdaptSem.g:1485:4: rule__CondEquality__Group_1__0
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
    // InternalAdaptSem.g:1493:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );
    public final void rule__CondComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1497:1: ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalAdaptSem.g:1498:2: ( ( rule__CondComparison__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1498:2: ( ( rule__CondComparison__Group_0__0 ) )
                    // InternalAdaptSem.g:1499:3: ( rule__CondComparison__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1500:3: ( rule__CondComparison__Group_0__0 )
                    // InternalAdaptSem.g:1500:4: rule__CondComparison__Group_0__0
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
                    // InternalAdaptSem.g:1504:2: ( ( rule__CondComparison__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1504:2: ( ( rule__CondComparison__Group_1__0 ) )
                    // InternalAdaptSem.g:1505:3: ( rule__CondComparison__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1506:3: ( rule__CondComparison__Group_1__0 )
                    // InternalAdaptSem.g:1506:4: rule__CondComparison__Group_1__0
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
    // InternalAdaptSem.g:1514:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1518:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
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
                    // InternalAdaptSem.g:1519:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1519:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1520:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1521:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1521:4: rule__Equality__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1525:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1525:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1526:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1527:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1527:4: rule__Equality__Group_1_0_1__0
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
    // InternalAdaptSem.g:1535:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1539:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
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
                    // InternalAdaptSem.g:1540:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1540:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1541:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1542:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1542:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1546:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1546:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1547:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1548:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1548:4: rule__Comparison__Group_1_0_1__0
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
    // InternalAdaptSem.g:1556:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1560:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            else if ( (LA17_0==45) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdaptSem.g:1561:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1561:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1562:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1563:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1563:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1567:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1567:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1568:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1569:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1569:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalAdaptSem.g:1577:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1581:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            else if ( (LA18_0==47) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptSem.g:1582:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalAdaptSem.g:1582:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalAdaptSem.g:1583:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalAdaptSem.g:1584:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalAdaptSem.g:1584:4: rule__MulOrDiv__Group_1_0_0__0
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
                    // InternalAdaptSem.g:1588:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalAdaptSem.g:1588:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalAdaptSem.g:1589:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalAdaptSem.g:1590:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalAdaptSem.g:1590:4: rule__MulOrDiv__Group_1_0_1__0
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
    // InternalAdaptSem.g:1598:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1602:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalAdaptSem.g:1603:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1603:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalAdaptSem.g:1604:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1605:3: ( rule__Primary__Group_0__0 )
                    // InternalAdaptSem.g:1605:4: rule__Primary__Group_0__0
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
                    // InternalAdaptSem.g:1609:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1609:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalAdaptSem.g:1610:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1611:3: ( rule__Primary__Group_1__0 )
                    // InternalAdaptSem.g:1611:4: rule__Primary__Group_1__0
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
                    // InternalAdaptSem.g:1615:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalAdaptSem.g:1615:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalAdaptSem.g:1616:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalAdaptSem.g:1617:3: ( rule__Primary__Group_2__0 )
                    // InternalAdaptSem.g:1617:4: rule__Primary__Group_2__0
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
                    // InternalAdaptSem.g:1621:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalAdaptSem.g:1621:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalAdaptSem.g:1622:3: ( rule__Primary__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    }
                    // InternalAdaptSem.g:1623:3: ( rule__Primary__Group_3__0 )
                    // InternalAdaptSem.g:1623:4: rule__Primary__Group_3__0
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
                    // InternalAdaptSem.g:1627:2: ( ruleAtomic )
                    {
                    // InternalAdaptSem.g:1627:2: ( ruleAtomic )
                    // InternalAdaptSem.g:1628:3: ruleAtomic
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
    // InternalAdaptSem.g:1637:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1641:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt20=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            case RULE_BOOL:
                {
                alt20=4;
                }
                break;
            case RULE_ID:
                {
                int LA20_5 = input.LA(2);

                if ( (LA20_5==EOF||LA20_5==17||(LA20_5>=20 && LA20_5<=23)||LA20_5==26||(LA20_5>=37 && LA20_5<=42)||(LA20_5>=44 && LA20_5<=47)) ) {
                    alt20=6;
                }
                else if ( (LA20_5==28) ) {
                    alt20=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 5, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA20_6 = input.LA(2);

                if ( (LA20_6==28) ) {
                    alt20=5;
                }
                else if ( (LA20_6==EOF||LA20_6==17||(LA20_6>=20 && LA20_6<=23)||LA20_6==26||(LA20_6>=37 && LA20_6<=42)||(LA20_6>=44 && LA20_6<=47)) ) {
                    alt20=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAdaptSem.g:1642:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalAdaptSem.g:1642:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalAdaptSem.g:1643:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalAdaptSem.g:1644:3: ( rule__Atomic__Group_0__0 )
                    // InternalAdaptSem.g:1644:4: rule__Atomic__Group_0__0
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
                    // InternalAdaptSem.g:1648:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalAdaptSem.g:1648:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalAdaptSem.g:1649:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalAdaptSem.g:1650:3: ( rule__Atomic__Group_1__0 )
                    // InternalAdaptSem.g:1650:4: rule__Atomic__Group_1__0
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
                    // InternalAdaptSem.g:1654:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalAdaptSem.g:1654:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalAdaptSem.g:1655:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalAdaptSem.g:1656:3: ( rule__Atomic__Group_2__0 )
                    // InternalAdaptSem.g:1656:4: rule__Atomic__Group_2__0
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
                    // InternalAdaptSem.g:1660:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalAdaptSem.g:1660:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalAdaptSem.g:1661:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalAdaptSem.g:1662:3: ( rule__Atomic__Group_3__0 )
                    // InternalAdaptSem.g:1662:4: rule__Atomic__Group_3__0
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
                    // InternalAdaptSem.g:1666:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:1666:2: ( ruleSemanticDomainAccess )
                    // InternalAdaptSem.g:1667:3: ruleSemanticDomainAccess
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
                    // InternalAdaptSem.g:1672:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalAdaptSem.g:1672:2: ( ruleTerminalAccessExpression )
                    // InternalAdaptSem.g:1673:3: ruleTerminalAccessExpression
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
    // InternalAdaptSem.g:1682:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1686:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdaptSem.g:1687:2: ( RULE_STRING )
                    {
                    // InternalAdaptSem.g:1687:2: ( RULE_STRING )
                    // InternalAdaptSem.g:1688:3: RULE_STRING
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
                    // InternalAdaptSem.g:1693:2: ( RULE_ID )
                    {
                    // InternalAdaptSem.g:1693:2: ( RULE_ID )
                    // InternalAdaptSem.g:1694:3: RULE_ID
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
    // InternalAdaptSem.g:1703:1: rule__AdaptiveSemantics__Group__0 : rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1 ;
    public final void rule__AdaptiveSemantics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1707:1: ( rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1 )
            // InternalAdaptSem.g:1708:2: rule__AdaptiveSemantics__Group__0__Impl rule__AdaptiveSemantics__Group__1
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
    // InternalAdaptSem.g:1715:1: rule__AdaptiveSemantics__Group__0__Impl : ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) ) ;
    public final void rule__AdaptiveSemantics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1719:1: ( ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) ) )
            // InternalAdaptSem.g:1720:1: ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) )
            {
            // InternalAdaptSem.g:1720:1: ( ( rule__AdaptiveSemantics__ModelAssignment_0 ) )
            // InternalAdaptSem.g:1721:2: ( rule__AdaptiveSemantics__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getModelAssignment_0()); 
            }
            // InternalAdaptSem.g:1722:2: ( rule__AdaptiveSemantics__ModelAssignment_0 )
            // InternalAdaptSem.g:1722:3: rule__AdaptiveSemantics__ModelAssignment_0
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
    // InternalAdaptSem.g:1730:1: rule__AdaptiveSemantics__Group__1 : rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2 ;
    public final void rule__AdaptiveSemantics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1734:1: ( rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2 )
            // InternalAdaptSem.g:1735:2: rule__AdaptiveSemantics__Group__1__Impl rule__AdaptiveSemantics__Group__2
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
    // InternalAdaptSem.g:1742:1: rule__AdaptiveSemantics__Group__1__Impl : ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* ) ;
    public final void rule__AdaptiveSemantics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1746:1: ( ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* ) )
            // InternalAdaptSem.g:1747:1: ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* )
            {
            // InternalAdaptSem.g:1747:1: ( ( rule__AdaptiveSemantics__ImportsAssignment_1 )* )
            // InternalAdaptSem.g:1748:2: ( rule__AdaptiveSemantics__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getImportsAssignment_1()); 
            }
            // InternalAdaptSem.g:1749:2: ( rule__AdaptiveSemantics__ImportsAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAdaptSem.g:1749:3: rule__AdaptiveSemantics__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__AdaptiveSemantics__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalAdaptSem.g:1757:1: rule__AdaptiveSemantics__Group__2 : rule__AdaptiveSemantics__Group__2__Impl ;
    public final void rule__AdaptiveSemantics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1761:1: ( rule__AdaptiveSemantics__Group__2__Impl )
            // InternalAdaptSem.g:1762:2: rule__AdaptiveSemantics__Group__2__Impl
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
    // InternalAdaptSem.g:1768:1: rule__AdaptiveSemantics__Group__2__Impl : ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* ) ;
    public final void rule__AdaptiveSemantics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1772:1: ( ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* ) )
            // InternalAdaptSem.g:1773:1: ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* )
            {
            // InternalAdaptSem.g:1773:1: ( ( rule__AdaptiveSemantics__RulesAssignment_2 )* )
            // InternalAdaptSem.g:1774:2: ( rule__AdaptiveSemantics__RulesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptiveSemanticsAccess().getRulesAssignment_2()); 
            }
            // InternalAdaptSem.g:1775:2: ( rule__AdaptiveSemantics__RulesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAdaptSem.g:1775:3: rule__AdaptiveSemantics__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AdaptiveSemantics__RulesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAdaptSem.g:1784:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1788:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptSem.g:1789:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAdaptSem.g:1796:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1800:1: ( ( 'model' ) )
            // InternalAdaptSem.g:1801:1: ( 'model' )
            {
            // InternalAdaptSem.g:1801:1: ( 'model' )
            // InternalAdaptSem.g:1802:2: 'model'
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
    // InternalAdaptSem.g:1811:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1815:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAdaptSem.g:1816:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAdaptSem.g:1823:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportURIAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1827:1: ( ( ( rule__Model__ImportURIAssignment_1 ) ) )
            // InternalAdaptSem.g:1828:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            {
            // InternalAdaptSem.g:1828:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            // InternalAdaptSem.g:1829:2: ( rule__Model__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            }
            // InternalAdaptSem.g:1830:2: ( rule__Model__ImportURIAssignment_1 )
            // InternalAdaptSem.g:1830:3: rule__Model__ImportURIAssignment_1
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
    // InternalAdaptSem.g:1838:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1842:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAdaptSem.g:1843:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAdaptSem.g:1850:1: rule__Model__Group__2__Impl : ( 'with' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1854:1: ( ( 'with' ) )
            // InternalAdaptSem.g:1855:1: ( 'with' )
            {
            // InternalAdaptSem.g:1855:1: ( 'with' )
            // InternalAdaptSem.g:1856:2: 'with'
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
    // InternalAdaptSem.g:1865:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1869:1: ( rule__Model__Group__3__Impl )
            // InternalAdaptSem.g:1870:2: rule__Model__Group__3__Impl
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
    // InternalAdaptSem.g:1876:1: rule__Model__Group__3__Impl : ( ( rule__Model__SemanticdomainAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1880:1: ( ( ( rule__Model__SemanticdomainAssignment_3 ) ) )
            // InternalAdaptSem.g:1881:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            {
            // InternalAdaptSem.g:1881:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            // InternalAdaptSem.g:1882:2: ( rule__Model__SemanticdomainAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainAssignment_3()); 
            }
            // InternalAdaptSem.g:1883:2: ( rule__Model__SemanticdomainAssignment_3 )
            // InternalAdaptSem.g:1883:3: rule__Model__SemanticdomainAssignment_3
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
    // InternalAdaptSem.g:1892:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1896:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAdaptSem.g:1897:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAdaptSem.g:1904:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1908:1: ( ( 'import' ) )
            // InternalAdaptSem.g:1909:1: ( 'import' )
            {
            // InternalAdaptSem.g:1909:1: ( 'import' )
            // InternalAdaptSem.g:1910:2: 'import'
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
    // InternalAdaptSem.g:1919:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1923:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalAdaptSem.g:1924:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalAdaptSem.g:1931:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1935:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalAdaptSem.g:1936:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalAdaptSem.g:1936:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalAdaptSem.g:1937:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalAdaptSem.g:1938:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalAdaptSem.g:1938:3: rule__Import__ImportURIAssignment_1
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
    // InternalAdaptSem.g:1946:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1950:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalAdaptSem.g:1951:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalAdaptSem.g:1958:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1962:1: ( ( 'as' ) )
            // InternalAdaptSem.g:1963:1: ( 'as' )
            {
            // InternalAdaptSem.g:1963:1: ( 'as' )
            // InternalAdaptSem.g:1964:2: 'as'
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
    // InternalAdaptSem.g:1973:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1977:1: ( rule__Import__Group__3__Impl )
            // InternalAdaptSem.g:1978:2: rule__Import__Group__3__Impl
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
    // InternalAdaptSem.g:1984:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:1988:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalAdaptSem.g:1989:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalAdaptSem.g:1989:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalAdaptSem.g:1990:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalAdaptSem.g:1991:2: ( rule__Import__NameAssignment_3 )
            // InternalAdaptSem.g:1991:3: rule__Import__NameAssignment_3
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
    // InternalAdaptSem.g:2000:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2004:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalAdaptSem.g:2005:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalAdaptSem.g:2012:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2016:1: ( ( 'rule' ) )
            // InternalAdaptSem.g:2017:1: ( 'rule' )
            {
            // InternalAdaptSem.g:2017:1: ( 'rule' )
            // InternalAdaptSem.g:2018:2: 'rule'
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
    // InternalAdaptSem.g:2027:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2031:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalAdaptSem.g:2032:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalAdaptSem.g:2039:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2043:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalAdaptSem.g:2044:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalAdaptSem.g:2044:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalAdaptSem.g:2045:2: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // InternalAdaptSem.g:2046:2: ( rule__Rule__NameAssignment_1 )
            // InternalAdaptSem.g:2046:3: rule__Rule__NameAssignment_1
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
    // InternalAdaptSem.g:2054:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2058:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalAdaptSem.g:2059:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalAdaptSem.g:2066:1: rule__Rule__Group__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2070:1: ( ( ',' ) )
            // InternalAdaptSem.g:2071:1: ( ',' )
            {
            // InternalAdaptSem.g:2071:1: ( ',' )
            // InternalAdaptSem.g:2072:2: ','
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
    // InternalAdaptSem.g:2081:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2085:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalAdaptSem.g:2086:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalAdaptSem.g:2093:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConclusionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2097:1: ( ( ( rule__Rule__ConclusionAssignment_3 ) ) )
            // InternalAdaptSem.g:2098:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            {
            // InternalAdaptSem.g:2098:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            // InternalAdaptSem.g:2099:2: ( rule__Rule__ConclusionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConclusionAssignment_3()); 
            }
            // InternalAdaptSem.g:2100:2: ( rule__Rule__ConclusionAssignment_3 )
            // InternalAdaptSem.g:2100:3: rule__Rule__ConclusionAssignment_3
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
    // InternalAdaptSem.g:2108:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2112:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalAdaptSem.g:2113:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalAdaptSem.g:2120:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2124:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalAdaptSem.g:2125:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalAdaptSem.g:2125:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalAdaptSem.g:2126:2: ( rule__Rule__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4()); 
            }
            // InternalAdaptSem.g:2127:2: ( rule__Rule__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptSem.g:2127:3: rule__Rule__Group_4__0
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
    // InternalAdaptSem.g:2135:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2139:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalAdaptSem.g:2140:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalAdaptSem.g:2147:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2151:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalAdaptSem.g:2152:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalAdaptSem.g:2152:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalAdaptSem.g:2153:2: ( rule__Rule__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5()); 
            }
            // InternalAdaptSem.g:2154:2: ( rule__Rule__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptSem.g:2154:3: rule__Rule__Group_5__0
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
    // InternalAdaptSem.g:2162:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2166:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalAdaptSem.g:2167:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
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
    // InternalAdaptSem.g:2174:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2178:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalAdaptSem.g:2179:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalAdaptSem.g:2179:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalAdaptSem.g:2180:2: ( rule__Rule__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6()); 
            }
            // InternalAdaptSem.g:2181:2: ( rule__Rule__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptSem.g:2181:3: rule__Rule__Group_6__0
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
    // InternalAdaptSem.g:2189:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2193:1: ( rule__Rule__Group__7__Impl )
            // InternalAdaptSem.g:2194:2: rule__Rule__Group__7__Impl
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
    // InternalAdaptSem.g:2200:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )? ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2204:1: ( ( ( rule__Rule__Group_7__0 )? ) )
            // InternalAdaptSem.g:2205:1: ( ( rule__Rule__Group_7__0 )? )
            {
            // InternalAdaptSem.g:2205:1: ( ( rule__Rule__Group_7__0 )? )
            // InternalAdaptSem.g:2206:2: ( rule__Rule__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7()); 
            }
            // InternalAdaptSem.g:2207:2: ( rule__Rule__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdaptSem.g:2207:3: rule__Rule__Group_7__0
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
    // InternalAdaptSem.g:2216:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2220:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalAdaptSem.g:2221:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
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
    // InternalAdaptSem.g:2228:1: rule__Rule__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2232:1: ( ( 'where' ) )
            // InternalAdaptSem.g:2233:1: ( 'where' )
            {
            // InternalAdaptSem.g:2233:1: ( 'where' )
            // InternalAdaptSem.g:2234:2: 'where'
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
    // InternalAdaptSem.g:2243:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2247:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalAdaptSem.g:2248:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
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
    // InternalAdaptSem.g:2255:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2259:1: ( ( ( rule__Rule__ConditionsAssignment_4_1 ) ) )
            // InternalAdaptSem.g:2260:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            {
            // InternalAdaptSem.g:2260:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            // InternalAdaptSem.g:2261:2: ( rule__Rule__ConditionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_1()); 
            }
            // InternalAdaptSem.g:2262:2: ( rule__Rule__ConditionsAssignment_4_1 )
            // InternalAdaptSem.g:2262:3: rule__Rule__ConditionsAssignment_4_1
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
    // InternalAdaptSem.g:2270:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2274:1: ( rule__Rule__Group_4__2__Impl )
            // InternalAdaptSem.g:2275:2: rule__Rule__Group_4__2__Impl
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
    // InternalAdaptSem.g:2281:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2285:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalAdaptSem.g:2286:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalAdaptSem.g:2286:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalAdaptSem.g:2287:2: ( rule__Rule__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            }
            // InternalAdaptSem.g:2288:2: ( rule__Rule__Group_4_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAdaptSem.g:2288:3: rule__Rule__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAdaptSem.g:2297:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2301:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalAdaptSem.g:2302:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
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
    // InternalAdaptSem.g:2309:1: rule__Rule__Group_4_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2313:1: ( ( ';' ) )
            // InternalAdaptSem.g:2314:1: ( ';' )
            {
            // InternalAdaptSem.g:2314:1: ( ';' )
            // InternalAdaptSem.g:2315:2: ';'
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
    // InternalAdaptSem.g:2324:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2328:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalAdaptSem.g:2329:2: rule__Rule__Group_4_2__1__Impl
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
    // InternalAdaptSem.g:2335:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2339:1: ( ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) )
            // InternalAdaptSem.g:2340:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            {
            // InternalAdaptSem.g:2340:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            // InternalAdaptSem.g:2341:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_2_1()); 
            }
            // InternalAdaptSem.g:2342:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            // InternalAdaptSem.g:2342:3: rule__Rule__ConditionsAssignment_4_2_1
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
    // InternalAdaptSem.g:2351:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2355:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalAdaptSem.g:2356:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
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
    // InternalAdaptSem.g:2363:1: rule__Rule__Group_5__0__Impl : ( 'resolve' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2367:1: ( ( 'resolve' ) )
            // InternalAdaptSem.g:2368:1: ( 'resolve' )
            {
            // InternalAdaptSem.g:2368:1: ( 'resolve' )
            // InternalAdaptSem.g:2369:2: 'resolve'
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
    // InternalAdaptSem.g:2378:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2382:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalAdaptSem.g:2383:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
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
    // InternalAdaptSem.g:2390:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__PremisesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2394:1: ( ( ( rule__Rule__PremisesAssignment_5_1 ) ) )
            // InternalAdaptSem.g:2395:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            {
            // InternalAdaptSem.g:2395:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            // InternalAdaptSem.g:2396:2: ( rule__Rule__PremisesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_1()); 
            }
            // InternalAdaptSem.g:2397:2: ( rule__Rule__PremisesAssignment_5_1 )
            // InternalAdaptSem.g:2397:3: rule__Rule__PremisesAssignment_5_1
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
    // InternalAdaptSem.g:2405:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2409:1: ( rule__Rule__Group_5__2__Impl )
            // InternalAdaptSem.g:2410:2: rule__Rule__Group_5__2__Impl
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
    // InternalAdaptSem.g:2416:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Group_5_2__0 )* ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2420:1: ( ( ( rule__Rule__Group_5_2__0 )* ) )
            // InternalAdaptSem.g:2421:1: ( ( rule__Rule__Group_5_2__0 )* )
            {
            // InternalAdaptSem.g:2421:1: ( ( rule__Rule__Group_5_2__0 )* )
            // InternalAdaptSem.g:2422:2: ( rule__Rule__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5_2()); 
            }
            // InternalAdaptSem.g:2423:2: ( rule__Rule__Group_5_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdaptSem.g:2423:3: rule__Rule__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalAdaptSem.g:2432:1: rule__Rule__Group_5_2__0 : rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 ;
    public final void rule__Rule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2436:1: ( rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 )
            // InternalAdaptSem.g:2437:2: rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1
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
    // InternalAdaptSem.g:2444:1: rule__Rule__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2448:1: ( ( ';' ) )
            // InternalAdaptSem.g:2449:1: ( ';' )
            {
            // InternalAdaptSem.g:2449:1: ( ';' )
            // InternalAdaptSem.g:2450:2: ';'
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
    // InternalAdaptSem.g:2459:1: rule__Rule__Group_5_2__1 : rule__Rule__Group_5_2__1__Impl ;
    public final void rule__Rule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2463:1: ( rule__Rule__Group_5_2__1__Impl )
            // InternalAdaptSem.g:2464:2: rule__Rule__Group_5_2__1__Impl
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
    // InternalAdaptSem.g:2470:1: rule__Rule__Group_5_2__1__Impl : ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) ;
    public final void rule__Rule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2474:1: ( ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) )
            // InternalAdaptSem.g:2475:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            {
            // InternalAdaptSem.g:2475:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            // InternalAdaptSem.g:2476:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_2_1()); 
            }
            // InternalAdaptSem.g:2477:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            // InternalAdaptSem.g:2477:3: rule__Rule__PremisesAssignment_5_2_1
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
    // InternalAdaptSem.g:2486:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2490:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalAdaptSem.g:2491:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
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
    // InternalAdaptSem.g:2498:1: rule__Rule__Group_6__0__Impl : ( 'bind' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2502:1: ( ( 'bind' ) )
            // InternalAdaptSem.g:2503:1: ( 'bind' )
            {
            // InternalAdaptSem.g:2503:1: ( 'bind' )
            // InternalAdaptSem.g:2504:2: 'bind'
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
    // InternalAdaptSem.g:2513:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2517:1: ( rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 )
            // InternalAdaptSem.g:2518:2: rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2
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
    // InternalAdaptSem.g:2525:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__BindingsAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2529:1: ( ( ( rule__Rule__BindingsAssignment_6_1 ) ) )
            // InternalAdaptSem.g:2530:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            {
            // InternalAdaptSem.g:2530:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            // InternalAdaptSem.g:2531:2: ( rule__Rule__BindingsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_1()); 
            }
            // InternalAdaptSem.g:2532:2: ( rule__Rule__BindingsAssignment_6_1 )
            // InternalAdaptSem.g:2532:3: rule__Rule__BindingsAssignment_6_1
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
    // InternalAdaptSem.g:2540:1: rule__Rule__Group_6__2 : rule__Rule__Group_6__2__Impl ;
    public final void rule__Rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2544:1: ( rule__Rule__Group_6__2__Impl )
            // InternalAdaptSem.g:2545:2: rule__Rule__Group_6__2__Impl
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
    // InternalAdaptSem.g:2551:1: rule__Rule__Group_6__2__Impl : ( ( rule__Rule__Group_6_2__0 )* ) ;
    public final void rule__Rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2555:1: ( ( ( rule__Rule__Group_6_2__0 )* ) )
            // InternalAdaptSem.g:2556:1: ( ( rule__Rule__Group_6_2__0 )* )
            {
            // InternalAdaptSem.g:2556:1: ( ( rule__Rule__Group_6_2__0 )* )
            // InternalAdaptSem.g:2557:2: ( rule__Rule__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6_2()); 
            }
            // InternalAdaptSem.g:2558:2: ( rule__Rule__Group_6_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdaptSem.g:2558:3: rule__Rule__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAdaptSem.g:2567:1: rule__Rule__Group_6_2__0 : rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 ;
    public final void rule__Rule__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2571:1: ( rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 )
            // InternalAdaptSem.g:2572:2: rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1
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
    // InternalAdaptSem.g:2579:1: rule__Rule__Group_6_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2583:1: ( ( ';' ) )
            // InternalAdaptSem.g:2584:1: ( ';' )
            {
            // InternalAdaptSem.g:2584:1: ( ';' )
            // InternalAdaptSem.g:2585:2: ';'
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
    // InternalAdaptSem.g:2594:1: rule__Rule__Group_6_2__1 : rule__Rule__Group_6_2__1__Impl ;
    public final void rule__Rule__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2598:1: ( rule__Rule__Group_6_2__1__Impl )
            // InternalAdaptSem.g:2599:2: rule__Rule__Group_6_2__1__Impl
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
    // InternalAdaptSem.g:2605:1: rule__Rule__Group_6_2__1__Impl : ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) ;
    public final void rule__Rule__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2609:1: ( ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) )
            // InternalAdaptSem.g:2610:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            {
            // InternalAdaptSem.g:2610:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            // InternalAdaptSem.g:2611:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_2_1()); 
            }
            // InternalAdaptSem.g:2612:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            // InternalAdaptSem.g:2612:3: rule__Rule__BindingsAssignment_6_2_1
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
    // InternalAdaptSem.g:2621:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2625:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalAdaptSem.g:2626:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
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
    // InternalAdaptSem.g:2633:1: rule__Rule__Group_7__0__Impl : ( 'IO' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2637:1: ( ( 'IO' ) )
            // InternalAdaptSem.g:2638:1: ( 'IO' )
            {
            // InternalAdaptSem.g:2638:1: ( 'IO' )
            // InternalAdaptSem.g:2639:2: 'IO'
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
    // InternalAdaptSem.g:2648:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2652:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // InternalAdaptSem.g:2653:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
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
    // InternalAdaptSem.g:2660:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Alternatives_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2664:1: ( ( ( rule__Rule__Alternatives_7_1 ) ) )
            // InternalAdaptSem.g:2665:1: ( ( rule__Rule__Alternatives_7_1 ) )
            {
            // InternalAdaptSem.g:2665:1: ( ( rule__Rule__Alternatives_7_1 ) )
            // InternalAdaptSem.g:2666:2: ( rule__Rule__Alternatives_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_1()); 
            }
            // InternalAdaptSem.g:2667:2: ( rule__Rule__Alternatives_7_1 )
            // InternalAdaptSem.g:2667:3: rule__Rule__Alternatives_7_1
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
    // InternalAdaptSem.g:2675:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2679:1: ( rule__Rule__Group_7__2__Impl )
            // InternalAdaptSem.g:2680:2: rule__Rule__Group_7__2__Impl
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
    // InternalAdaptSem.g:2686:1: rule__Rule__Group_7__2__Impl : ( ( rule__Rule__Group_7_2__0 )* ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2690:1: ( ( ( rule__Rule__Group_7_2__0 )* ) )
            // InternalAdaptSem.g:2691:1: ( ( rule__Rule__Group_7_2__0 )* )
            {
            // InternalAdaptSem.g:2691:1: ( ( rule__Rule__Group_7_2__0 )* )
            // InternalAdaptSem.g:2692:2: ( rule__Rule__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7_2()); 
            }
            // InternalAdaptSem.g:2693:2: ( rule__Rule__Group_7_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAdaptSem.g:2693:3: rule__Rule__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rule__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAdaptSem.g:2702:1: rule__Rule__Group_7_2__0 : rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 ;
    public final void rule__Rule__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2706:1: ( rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 )
            // InternalAdaptSem.g:2707:2: rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1
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
    // InternalAdaptSem.g:2714:1: rule__Rule__Group_7_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2718:1: ( ( ';' ) )
            // InternalAdaptSem.g:2719:1: ( ';' )
            {
            // InternalAdaptSem.g:2719:1: ( ';' )
            // InternalAdaptSem.g:2720:2: ';'
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
    // InternalAdaptSem.g:2729:1: rule__Rule__Group_7_2__1 : rule__Rule__Group_7_2__1__Impl ;
    public final void rule__Rule__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2733:1: ( rule__Rule__Group_7_2__1__Impl )
            // InternalAdaptSem.g:2734:2: rule__Rule__Group_7_2__1__Impl
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
    // InternalAdaptSem.g:2740:1: rule__Rule__Group_7_2__1__Impl : ( ( rule__Rule__Alternatives_7_2_1 ) ) ;
    public final void rule__Rule__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2744:1: ( ( ( rule__Rule__Alternatives_7_2_1 ) ) )
            // InternalAdaptSem.g:2745:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            {
            // InternalAdaptSem.g:2745:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            // InternalAdaptSem.g:2746:2: ( rule__Rule__Alternatives_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_2_1()); 
            }
            // InternalAdaptSem.g:2747:2: ( rule__Rule__Alternatives_7_2_1 )
            // InternalAdaptSem.g:2747:3: rule__Rule__Alternatives_7_2_1
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
    // InternalAdaptSem.g:2756:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2760:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalAdaptSem.g:2761:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalAdaptSem.g:2768:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2772:1: ( ( () ) )
            // InternalAdaptSem.g:2773:1: ( () )
            {
            // InternalAdaptSem.g:2773:1: ( () )
            // InternalAdaptSem.g:2774:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalAdaptSem.g:2775:2: ()
            // InternalAdaptSem.g:2775:3: 
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
    // InternalAdaptSem.g:2783:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2787:1: ( rule__Condition__Group__1__Impl )
            // InternalAdaptSem.g:2788:2: rule__Condition__Group__1__Impl
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
    // InternalAdaptSem.g:2794:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CondAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2798:1: ( ( ( rule__Condition__CondAssignment_1 ) ) )
            // InternalAdaptSem.g:2799:1: ( ( rule__Condition__CondAssignment_1 ) )
            {
            // InternalAdaptSem.g:2799:1: ( ( rule__Condition__CondAssignment_1 ) )
            // InternalAdaptSem.g:2800:2: ( rule__Condition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCondAssignment_1()); 
            }
            // InternalAdaptSem.g:2801:2: ( rule__Condition__CondAssignment_1 )
            // InternalAdaptSem.g:2801:3: rule__Condition__CondAssignment_1
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
    // InternalAdaptSem.g:2810:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2814:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalAdaptSem.g:2815:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalAdaptSem.g:2822:1: rule__Input__Group__0__Impl : ( ( rule__Input__AssigneeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2826:1: ( ( ( rule__Input__AssigneeAssignment_0 ) ) )
            // InternalAdaptSem.g:2827:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            {
            // InternalAdaptSem.g:2827:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            // InternalAdaptSem.g:2828:2: ( rule__Input__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAssigneeAssignment_0()); 
            }
            // InternalAdaptSem.g:2829:2: ( rule__Input__AssigneeAssignment_0 )
            // InternalAdaptSem.g:2829:3: rule__Input__AssigneeAssignment_0
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
    // InternalAdaptSem.g:2837:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2841:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalAdaptSem.g:2842:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalAdaptSem.g:2849:1: rule__Input__Group__1__Impl : ( '=' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2853:1: ( ( '=' ) )
            // InternalAdaptSem.g:2854:1: ( '=' )
            {
            // InternalAdaptSem.g:2854:1: ( '=' )
            // InternalAdaptSem.g:2855:2: '='
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
    // InternalAdaptSem.g:2864:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2868:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalAdaptSem.g:2869:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalAdaptSem.g:2876:1: rule__Input__Group__2__Impl : ( ( rule__Input__OperationAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2880:1: ( ( ( rule__Input__OperationAssignment_2 ) ) )
            // InternalAdaptSem.g:2881:1: ( ( rule__Input__OperationAssignment_2 ) )
            {
            // InternalAdaptSem.g:2881:1: ( ( rule__Input__OperationAssignment_2 ) )
            // InternalAdaptSem.g:2882:2: ( rule__Input__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationAssignment_2()); 
            }
            // InternalAdaptSem.g:2883:2: ( rule__Input__OperationAssignment_2 )
            // InternalAdaptSem.g:2883:3: rule__Input__OperationAssignment_2
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
    // InternalAdaptSem.g:2891:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2895:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalAdaptSem.g:2896:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalAdaptSem.g:2903:1: rule__Input__Group__3__Impl : ( '(' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2907:1: ( ( '(' ) )
            // InternalAdaptSem.g:2908:1: ( '(' )
            {
            // InternalAdaptSem.g:2908:1: ( '(' )
            // InternalAdaptSem.g:2909:2: '('
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
    // InternalAdaptSem.g:2918:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2922:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalAdaptSem.g:2923:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Input__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAdaptSem.g:2930:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2934:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalAdaptSem.g:2935:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalAdaptSem.g:2935:1: ( ( rule__Input__Group_4__0 )? )
            // InternalAdaptSem.g:2936:2: ( rule__Input__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_4()); 
            }
            // InternalAdaptSem.g:2937:2: ( rule__Input__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==32||LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdaptSem.g:2937:3: rule__Input__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group__5"
    // InternalAdaptSem.g:2945:1: rule__Input__Group__5 : rule__Input__Group__5__Impl rule__Input__Group__6 ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2949:1: ( rule__Input__Group__5__Impl rule__Input__Group__6 )
            // InternalAdaptSem.g:2950:2: rule__Input__Group__5__Impl rule__Input__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Input__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // InternalAdaptSem.g:2957:1: rule__Input__Group__5__Impl : ( ')' ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2961:1: ( ( ')' ) )
            // InternalAdaptSem.g:2962:1: ( ')' )
            {
            // InternalAdaptSem.g:2962:1: ( ')' )
            // InternalAdaptSem.g:2963:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group__6"
    // InternalAdaptSem.g:2972:1: rule__Input__Group__6 : rule__Input__Group__6__Impl ;
    public final void rule__Input__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2976:1: ( rule__Input__Group__6__Impl )
            // InternalAdaptSem.g:2977:2: rule__Input__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6"


    // $ANTLR start "rule__Input__Group__6__Impl"
    // InternalAdaptSem.g:2983:1: rule__Input__Group__6__Impl : ( ( rule__Input__Group_6__0 )? ) ;
    public final void rule__Input__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:2987:1: ( ( ( rule__Input__Group_6__0 )? ) )
            // InternalAdaptSem.g:2988:1: ( ( rule__Input__Group_6__0 )? )
            {
            // InternalAdaptSem.g:2988:1: ( ( rule__Input__Group_6__0 )? )
            // InternalAdaptSem.g:2989:2: ( rule__Input__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_6()); 
            }
            // InternalAdaptSem.g:2990:2: ( rule__Input__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdaptSem.g:2990:3: rule__Input__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6__Impl"


    // $ANTLR start "rule__Input__Group_4__0"
    // InternalAdaptSem.g:2999:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3003:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalAdaptSem.g:3004:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Input__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__0"


    // $ANTLR start "rule__Input__Group_4__0__Impl"
    // InternalAdaptSem.g:3011:1: rule__Input__Group_4__0__Impl : ( ( rule__Input__ArgsAssignment_4_0 ) ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3015:1: ( ( ( rule__Input__ArgsAssignment_4_0 ) ) )
            // InternalAdaptSem.g:3016:1: ( ( rule__Input__ArgsAssignment_4_0 ) )
            {
            // InternalAdaptSem.g:3016:1: ( ( rule__Input__ArgsAssignment_4_0 ) )
            // InternalAdaptSem.g:3017:2: ( rule__Input__ArgsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getArgsAssignment_4_0()); 
            }
            // InternalAdaptSem.g:3018:2: ( rule__Input__ArgsAssignment_4_0 )
            // InternalAdaptSem.g:3018:3: rule__Input__ArgsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__ArgsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getArgsAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__0__Impl"


    // $ANTLR start "rule__Input__Group_4__1"
    // InternalAdaptSem.g:3026:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3030:1: ( rule__Input__Group_4__1__Impl )
            // InternalAdaptSem.g:3031:2: rule__Input__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__1"


    // $ANTLR start "rule__Input__Group_4__1__Impl"
    // InternalAdaptSem.g:3037:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__Group_4_1__0 )* ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3041:1: ( ( ( rule__Input__Group_4_1__0 )* ) )
            // InternalAdaptSem.g:3042:1: ( ( rule__Input__Group_4_1__0 )* )
            {
            // InternalAdaptSem.g:3042:1: ( ( rule__Input__Group_4_1__0 )* )
            // InternalAdaptSem.g:3043:2: ( rule__Input__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_4_1()); 
            }
            // InternalAdaptSem.g:3044:2: ( rule__Input__Group_4_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAdaptSem.g:3044:3: rule__Input__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Input__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__1__Impl"


    // $ANTLR start "rule__Input__Group_4_1__0"
    // InternalAdaptSem.g:3053:1: rule__Input__Group_4_1__0 : rule__Input__Group_4_1__0__Impl rule__Input__Group_4_1__1 ;
    public final void rule__Input__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3057:1: ( rule__Input__Group_4_1__0__Impl rule__Input__Group_4_1__1 )
            // InternalAdaptSem.g:3058:2: rule__Input__Group_4_1__0__Impl rule__Input__Group_4_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Input__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4_1__0"


    // $ANTLR start "rule__Input__Group_4_1__0__Impl"
    // InternalAdaptSem.g:3065:1: rule__Input__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3069:1: ( ( ',' ) )
            // InternalAdaptSem.g:3070:1: ( ',' )
            {
            // InternalAdaptSem.g:3070:1: ( ',' )
            // InternalAdaptSem.g:3071:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4_1__0__Impl"


    // $ANTLR start "rule__Input__Group_4_1__1"
    // InternalAdaptSem.g:3080:1: rule__Input__Group_4_1__1 : rule__Input__Group_4_1__1__Impl ;
    public final void rule__Input__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3084:1: ( rule__Input__Group_4_1__1__Impl )
            // InternalAdaptSem.g:3085:2: rule__Input__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4_1__1"


    // $ANTLR start "rule__Input__Group_4_1__1__Impl"
    // InternalAdaptSem.g:3091:1: rule__Input__Group_4_1__1__Impl : ( ( rule__Input__ArgsAssignment_4_1_1 ) ) ;
    public final void rule__Input__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3095:1: ( ( ( rule__Input__ArgsAssignment_4_1_1 ) ) )
            // InternalAdaptSem.g:3096:1: ( ( rule__Input__ArgsAssignment_4_1_1 ) )
            {
            // InternalAdaptSem.g:3096:1: ( ( rule__Input__ArgsAssignment_4_1_1 ) )
            // InternalAdaptSem.g:3097:2: ( rule__Input__ArgsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getArgsAssignment_4_1_1()); 
            }
            // InternalAdaptSem.g:3098:2: ( rule__Input__ArgsAssignment_4_1_1 )
            // InternalAdaptSem.g:3098:3: rule__Input__ArgsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__ArgsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getArgsAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4_1__1__Impl"


    // $ANTLR start "rule__Input__Group_6__0"
    // InternalAdaptSem.g:3107:1: rule__Input__Group_6__0 : rule__Input__Group_6__0__Impl rule__Input__Group_6__1 ;
    public final void rule__Input__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3111:1: ( rule__Input__Group_6__0__Impl rule__Input__Group_6__1 )
            // InternalAdaptSem.g:3112:2: rule__Input__Group_6__0__Impl rule__Input__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Input__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Input__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__0"


    // $ANTLR start "rule__Input__Group_6__0__Impl"
    // InternalAdaptSem.g:3119:1: rule__Input__Group_6__0__Impl : ( 'on' ) ;
    public final void rule__Input__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3123:1: ( ( 'on' ) )
            // InternalAdaptSem.g:3124:1: ( 'on' )
            {
            // InternalAdaptSem.g:3124:1: ( 'on' )
            // InternalAdaptSem.g:3125:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOnKeyword_6_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getOnKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__0__Impl"


    // $ANTLR start "rule__Input__Group_6__1"
    // InternalAdaptSem.g:3134:1: rule__Input__Group_6__1 : rule__Input__Group_6__1__Impl ;
    public final void rule__Input__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3138:1: ( rule__Input__Group_6__1__Impl )
            // InternalAdaptSem.g:3139:2: rule__Input__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__1"


    // $ANTLR start "rule__Input__Group_6__1__Impl"
    // InternalAdaptSem.g:3145:1: rule__Input__Group_6__1__Impl : ( ( rule__Input__TargetAssignment_6_1 ) ) ;
    public final void rule__Input__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3149:1: ( ( ( rule__Input__TargetAssignment_6_1 ) ) )
            // InternalAdaptSem.g:3150:1: ( ( rule__Input__TargetAssignment_6_1 ) )
            {
            // InternalAdaptSem.g:3150:1: ( ( rule__Input__TargetAssignment_6_1 ) )
            // InternalAdaptSem.g:3151:2: ( rule__Input__TargetAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTargetAssignment_6_1()); 
            }
            // InternalAdaptSem.g:3152:2: ( rule__Input__TargetAssignment_6_1 )
            // InternalAdaptSem.g:3152:3: rule__Input__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__TargetAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTargetAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalAdaptSem.g:3161:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3165:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalAdaptSem.g:3166:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalAdaptSem.g:3173:1: rule__Output__Group__0__Impl : ( ( rule__Output__OperationAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3177:1: ( ( ( rule__Output__OperationAssignment_0 ) ) )
            // InternalAdaptSem.g:3178:1: ( ( rule__Output__OperationAssignment_0 ) )
            {
            // InternalAdaptSem.g:3178:1: ( ( rule__Output__OperationAssignment_0 ) )
            // InternalAdaptSem.g:3179:2: ( rule__Output__OperationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationAssignment_0()); 
            }
            // InternalAdaptSem.g:3180:2: ( rule__Output__OperationAssignment_0 )
            // InternalAdaptSem.g:3180:3: rule__Output__OperationAssignment_0
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
    // InternalAdaptSem.g:3188:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3192:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalAdaptSem.g:3193:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptSem.g:3200:1: rule__Output__Group__1__Impl : ( '(' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3204:1: ( ( '(' ) )
            // InternalAdaptSem.g:3205:1: ( '(' )
            {
            // InternalAdaptSem.g:3205:1: ( '(' )
            // InternalAdaptSem.g:3206:2: '('
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
    // InternalAdaptSem.g:3215:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3219:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalAdaptSem.g:3220:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptSem.g:3227:1: rule__Output__Group__2__Impl : ( ( rule__Output__Group_2__0 )? ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3231:1: ( ( ( rule__Output__Group_2__0 )? ) )
            // InternalAdaptSem.g:3232:1: ( ( rule__Output__Group_2__0 )? )
            {
            // InternalAdaptSem.g:3232:1: ( ( rule__Output__Group_2__0 )? )
            // InternalAdaptSem.g:3233:2: ( rule__Output__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:3234:2: ( rule__Output__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==32||LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAdaptSem.g:3234:3: rule__Output__Group_2__0
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
    // InternalAdaptSem.g:3242:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3246:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalAdaptSem.g:3247:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Output__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAdaptSem.g:3254:1: rule__Output__Group__3__Impl : ( ')' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3258:1: ( ( ')' ) )
            // InternalAdaptSem.g:3259:1: ( ')' )
            {
            // InternalAdaptSem.g:3259:1: ( ')' )
            // InternalAdaptSem.g:3260:2: ')'
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


    // $ANTLR start "rule__Output__Group__4"
    // InternalAdaptSem.g:3269:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3273:1: ( rule__Output__Group__4__Impl )
            // InternalAdaptSem.g:3274:2: rule__Output__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalAdaptSem.g:3280:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3284:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalAdaptSem.g:3285:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalAdaptSem.g:3285:1: ( ( rule__Output__Group_4__0 )? )
            // InternalAdaptSem.g:3286:2: ( rule__Output__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_4()); 
            }
            // InternalAdaptSem.g:3287:2: ( rule__Output__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAdaptSem.g:3287:3: rule__Output__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group_2__0"
    // InternalAdaptSem.g:3296:1: rule__Output__Group_2__0 : rule__Output__Group_2__0__Impl rule__Output__Group_2__1 ;
    public final void rule__Output__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3300:1: ( rule__Output__Group_2__0__Impl rule__Output__Group_2__1 )
            // InternalAdaptSem.g:3301:2: rule__Output__Group_2__0__Impl rule__Output__Group_2__1
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
    // InternalAdaptSem.g:3308:1: rule__Output__Group_2__0__Impl : ( ( rule__Output__ArgsAssignment_2_0 ) ) ;
    public final void rule__Output__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3312:1: ( ( ( rule__Output__ArgsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:3313:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:3313:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            // InternalAdaptSem.g:3314:2: ( rule__Output__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:3315:2: ( rule__Output__ArgsAssignment_2_0 )
            // InternalAdaptSem.g:3315:3: rule__Output__ArgsAssignment_2_0
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
    // InternalAdaptSem.g:3323:1: rule__Output__Group_2__1 : rule__Output__Group_2__1__Impl ;
    public final void rule__Output__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3327:1: ( rule__Output__Group_2__1__Impl )
            // InternalAdaptSem.g:3328:2: rule__Output__Group_2__1__Impl
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
    // InternalAdaptSem.g:3334:1: rule__Output__Group_2__1__Impl : ( ( rule__Output__Group_2_1__0 )* ) ;
    public final void rule__Output__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3338:1: ( ( ( rule__Output__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:3339:1: ( ( rule__Output__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:3339:1: ( ( rule__Output__Group_2_1__0 )* )
            // InternalAdaptSem.g:3340:2: ( rule__Output__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:3341:2: ( rule__Output__Group_2_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAdaptSem.g:3341:3: rule__Output__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Output__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAdaptSem.g:3350:1: rule__Output__Group_2_1__0 : rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 ;
    public final void rule__Output__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3354:1: ( rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 )
            // InternalAdaptSem.g:3355:2: rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1
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
    // InternalAdaptSem.g:3362:1: rule__Output__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3366:1: ( ( ',' ) )
            // InternalAdaptSem.g:3367:1: ( ',' )
            {
            // InternalAdaptSem.g:3367:1: ( ',' )
            // InternalAdaptSem.g:3368:2: ','
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
    // InternalAdaptSem.g:3377:1: rule__Output__Group_2_1__1 : rule__Output__Group_2_1__1__Impl ;
    public final void rule__Output__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3381:1: ( rule__Output__Group_2_1__1__Impl )
            // InternalAdaptSem.g:3382:2: rule__Output__Group_2_1__1__Impl
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
    // InternalAdaptSem.g:3388:1: rule__Output__Group_2_1__1__Impl : ( ( rule__Output__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Output__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3392:1: ( ( ( rule__Output__ArgsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:3393:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:3393:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:3394:2: ( rule__Output__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:3395:2: ( rule__Output__ArgsAssignment_2_1_1 )
            // InternalAdaptSem.g:3395:3: rule__Output__ArgsAssignment_2_1_1
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


    // $ANTLR start "rule__Output__Group_4__0"
    // InternalAdaptSem.g:3404:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3408:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalAdaptSem.g:3409:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Output__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0"


    // $ANTLR start "rule__Output__Group_4__0__Impl"
    // InternalAdaptSem.g:3416:1: rule__Output__Group_4__0__Impl : ( 'on' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3420:1: ( ( 'on' ) )
            // InternalAdaptSem.g:3421:1: ( 'on' )
            {
            // InternalAdaptSem.g:3421:1: ( 'on' )
            // InternalAdaptSem.g:3422:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOnKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getOnKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0__Impl"


    // $ANTLR start "rule__Output__Group_4__1"
    // InternalAdaptSem.g:3431:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3435:1: ( rule__Output__Group_4__1__Impl )
            // InternalAdaptSem.g:3436:2: rule__Output__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1"


    // $ANTLR start "rule__Output__Group_4__1__Impl"
    // InternalAdaptSem.g:3442:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__TargetAssignment_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3446:1: ( ( ( rule__Output__TargetAssignment_4_1 ) ) )
            // InternalAdaptSem.g:3447:1: ( ( rule__Output__TargetAssignment_4_1 ) )
            {
            // InternalAdaptSem.g:3447:1: ( ( rule__Output__TargetAssignment_4_1 ) )
            // InternalAdaptSem.g:3448:2: ( rule__Output__TargetAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getTargetAssignment_4_1()); 
            }
            // InternalAdaptSem.g:3449:2: ( rule__Output__TargetAssignment_4_1 )
            // InternalAdaptSem.g:3449:3: rule__Output__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__TargetAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getTargetAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalAdaptSem.g:3458:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3462:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalAdaptSem.g:3463:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalAdaptSem.g:3470:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__AssigneeAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3474:1: ( ( ( rule__Binding__AssigneeAssignment_0 ) ) )
            // InternalAdaptSem.g:3475:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            {
            // InternalAdaptSem.g:3475:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            // InternalAdaptSem.g:3476:2: ( rule__Binding__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getAssigneeAssignment_0()); 
            }
            // InternalAdaptSem.g:3477:2: ( rule__Binding__AssigneeAssignment_0 )
            // InternalAdaptSem.g:3477:3: rule__Binding__AssigneeAssignment_0
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
    // InternalAdaptSem.g:3485:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3489:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalAdaptSem.g:3490:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalAdaptSem.g:3497:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3501:1: ( ( '=' ) )
            // InternalAdaptSem.g:3502:1: ( '=' )
            {
            // InternalAdaptSem.g:3502:1: ( '=' )
            // InternalAdaptSem.g:3503:2: '='
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
    // InternalAdaptSem.g:3512:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3516:1: ( rule__Binding__Group__2__Impl )
            // InternalAdaptSem.g:3517:2: rule__Binding__Group__2__Impl
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
    // InternalAdaptSem.g:3523:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ExprAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3527:1: ( ( ( rule__Binding__ExprAssignment_2 ) ) )
            // InternalAdaptSem.g:3528:1: ( ( rule__Binding__ExprAssignment_2 ) )
            {
            // InternalAdaptSem.g:3528:1: ( ( rule__Binding__ExprAssignment_2 ) )
            // InternalAdaptSem.g:3529:2: ( rule__Binding__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            }
            // InternalAdaptSem.g:3530:2: ( rule__Binding__ExprAssignment_2 )
            // InternalAdaptSem.g:3530:3: rule__Binding__ExprAssignment_2
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
    // InternalAdaptSem.g:3539:1: rule__SemanticDomainAccess__Group__0 : rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 ;
    public final void rule__SemanticDomainAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3543:1: ( rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 )
            // InternalAdaptSem.g:3544:2: rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1
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
    // InternalAdaptSem.g:3551:1: rule__SemanticDomainAccess__Group__0__Impl : ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) ;
    public final void rule__SemanticDomainAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3555:1: ( ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) )
            // InternalAdaptSem.g:3556:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            {
            // InternalAdaptSem.g:3556:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            // InternalAdaptSem.g:3557:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getRecieverAssignment_0()); 
            }
            // InternalAdaptSem.g:3558:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            // InternalAdaptSem.g:3558:3: rule__SemanticDomainAccess__RecieverAssignment_0
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
    // InternalAdaptSem.g:3566:1: rule__SemanticDomainAccess__Group__1 : rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 ;
    public final void rule__SemanticDomainAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3570:1: ( rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 )
            // InternalAdaptSem.g:3571:2: rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2
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
    // InternalAdaptSem.g:3578:1: rule__SemanticDomainAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3582:1: ( ( '.' ) )
            // InternalAdaptSem.g:3583:1: ( '.' )
            {
            // InternalAdaptSem.g:3583:1: ( '.' )
            // InternalAdaptSem.g:3584:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:3593:1: rule__SemanticDomainAccess__Group__2 : rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 ;
    public final void rule__SemanticDomainAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3597:1: ( rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 )
            // InternalAdaptSem.g:3598:2: rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3
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
    // InternalAdaptSem.g:3605:1: rule__SemanticDomainAccess__Group__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3609:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) )
            // InternalAdaptSem.g:3610:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            {
            // InternalAdaptSem.g:3610:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            // InternalAdaptSem.g:3611:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_2()); 
            }
            // InternalAdaptSem.g:3612:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            // InternalAdaptSem.g:3612:3: rule__SemanticDomainAccess__FieldAssignment_2
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
    // InternalAdaptSem.g:3620:1: rule__SemanticDomainAccess__Group__3 : rule__SemanticDomainAccess__Group__3__Impl ;
    public final void rule__SemanticDomainAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3624:1: ( rule__SemanticDomainAccess__Group__3__Impl )
            // InternalAdaptSem.g:3625:2: rule__SemanticDomainAccess__Group__3__Impl
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
    // InternalAdaptSem.g:3631:1: rule__SemanticDomainAccess__Group__3__Impl : ( ( rule__SemanticDomainAccess__Group_3__0 )* ) ;
    public final void rule__SemanticDomainAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3635:1: ( ( ( rule__SemanticDomainAccess__Group_3__0 )* ) )
            // InternalAdaptSem.g:3636:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            {
            // InternalAdaptSem.g:3636:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            // InternalAdaptSem.g:3637:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup_3()); 
            }
            // InternalAdaptSem.g:3638:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAdaptSem.g:3638:3: rule__SemanticDomainAccess__Group_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SemanticDomainAccess__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalAdaptSem.g:3647:1: rule__SemanticDomainAccess__Group_3__0 : rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 ;
    public final void rule__SemanticDomainAccess__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3651:1: ( rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 )
            // InternalAdaptSem.g:3652:2: rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1
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
    // InternalAdaptSem.g:3659:1: rule__SemanticDomainAccess__Group_3__0__Impl : ( () ) ;
    public final void rule__SemanticDomainAccess__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3663:1: ( ( () ) )
            // InternalAdaptSem.g:3664:1: ( () )
            {
            // InternalAdaptSem.g:3664:1: ( () )
            // InternalAdaptSem.g:3665:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0()); 
            }
            // InternalAdaptSem.g:3666:2: ()
            // InternalAdaptSem.g:3666:3: 
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
    // InternalAdaptSem.g:3674:1: rule__SemanticDomainAccess__Group_3__1 : rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 ;
    public final void rule__SemanticDomainAccess__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3678:1: ( rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 )
            // InternalAdaptSem.g:3679:2: rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2
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
    // InternalAdaptSem.g:3686:1: rule__SemanticDomainAccess__Group_3__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3690:1: ( ( '.' ) )
            // InternalAdaptSem.g:3691:1: ( '.' )
            {
            // InternalAdaptSem.g:3691:1: ( '.' )
            // InternalAdaptSem.g:3692:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:3701:1: rule__SemanticDomainAccess__Group_3__2 : rule__SemanticDomainAccess__Group_3__2__Impl ;
    public final void rule__SemanticDomainAccess__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3705:1: ( rule__SemanticDomainAccess__Group_3__2__Impl )
            // InternalAdaptSem.g:3706:2: rule__SemanticDomainAccess__Group_3__2__Impl
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
    // InternalAdaptSem.g:3712:1: rule__SemanticDomainAccess__Group_3__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3716:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) )
            // InternalAdaptSem.g:3717:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            {
            // InternalAdaptSem.g:3717:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            // InternalAdaptSem.g:3718:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_3_2()); 
            }
            // InternalAdaptSem.g:3719:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            // InternalAdaptSem.g:3719:3: rule__SemanticDomainAccess__FieldAssignment_3_2
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
    // InternalAdaptSem.g:3728:1: rule__Self__Group__0 : rule__Self__Group__0__Impl rule__Self__Group__1 ;
    public final void rule__Self__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3732:1: ( rule__Self__Group__0__Impl rule__Self__Group__1 )
            // InternalAdaptSem.g:3733:2: rule__Self__Group__0__Impl rule__Self__Group__1
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
    // InternalAdaptSem.g:3740:1: rule__Self__Group__0__Impl : ( () ) ;
    public final void rule__Self__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3744:1: ( ( () ) )
            // InternalAdaptSem.g:3745:1: ( () )
            {
            // InternalAdaptSem.g:3745:1: ( () )
            // InternalAdaptSem.g:3746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfAction_0()); 
            }
            // InternalAdaptSem.g:3747:2: ()
            // InternalAdaptSem.g:3747:3: 
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
    // InternalAdaptSem.g:3755:1: rule__Self__Group__1 : rule__Self__Group__1__Impl ;
    public final void rule__Self__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3759:1: ( rule__Self__Group__1__Impl )
            // InternalAdaptSem.g:3760:2: rule__Self__Group__1__Impl
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
    // InternalAdaptSem.g:3766:1: rule__Self__Group__1__Impl : ( 'self' ) ;
    public final void rule__Self__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3770:1: ( ( 'self' ) )
            // InternalAdaptSem.g:3771:1: ( 'self' )
            {
            // InternalAdaptSem.g:3771:1: ( 'self' )
            // InternalAdaptSem.g:3772:2: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:3782:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3786:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalAdaptSem.g:3787:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
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
    // InternalAdaptSem.g:3794:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__FromAssignment_0 ) ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3798:1: ( ( ( rule__Conclusion__FromAssignment_0 ) ) )
            // InternalAdaptSem.g:3799:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            {
            // InternalAdaptSem.g:3799:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            // InternalAdaptSem.g:3800:2: ( rule__Conclusion__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getFromAssignment_0()); 
            }
            // InternalAdaptSem.g:3801:2: ( rule__Conclusion__FromAssignment_0 )
            // InternalAdaptSem.g:3801:3: rule__Conclusion__FromAssignment_0
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
    // InternalAdaptSem.g:3809:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3813:1: ( rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 )
            // InternalAdaptSem.g:3814:2: rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2
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
    // InternalAdaptSem.g:3821:1: rule__Conclusion__Group__1__Impl : ( '->' ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3825:1: ( ( '->' ) )
            // InternalAdaptSem.g:3826:1: ( '->' )
            {
            // InternalAdaptSem.g:3826:1: ( '->' )
            // InternalAdaptSem.g:3827:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:3836:1: rule__Conclusion__Group__2 : rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 ;
    public final void rule__Conclusion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3840:1: ( rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 )
            // InternalAdaptSem.g:3841:2: rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3
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
    // InternalAdaptSem.g:3848:1: rule__Conclusion__Group__2__Impl : ( ( rule__Conclusion__TerminationAssignment_2 )? ) ;
    public final void rule__Conclusion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3852:1: ( ( ( rule__Conclusion__TerminationAssignment_2 )? ) )
            // InternalAdaptSem.g:3853:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            {
            // InternalAdaptSem.g:3853:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            // InternalAdaptSem.g:3854:2: ( rule__Conclusion__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationAssignment_2()); 
            }
            // InternalAdaptSem.g:3855:2: ( rule__Conclusion__TerminationAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAdaptSem.g:3855:3: rule__Conclusion__TerminationAssignment_2
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
    // InternalAdaptSem.g:3863:1: rule__Conclusion__Group__3 : rule__Conclusion__Group__3__Impl ;
    public final void rule__Conclusion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3867:1: ( rule__Conclusion__Group__3__Impl )
            // InternalAdaptSem.g:3868:2: rule__Conclusion__Group__3__Impl
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
    // InternalAdaptSem.g:3874:1: rule__Conclusion__Group__3__Impl : ( ( rule__Conclusion__ToAssignment_3 ) ) ;
    public final void rule__Conclusion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3878:1: ( ( ( rule__Conclusion__ToAssignment_3 ) ) )
            // InternalAdaptSem.g:3879:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            {
            // InternalAdaptSem.g:3879:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            // InternalAdaptSem.g:3880:2: ( rule__Conclusion__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getToAssignment_3()); 
            }
            // InternalAdaptSem.g:3881:2: ( rule__Conclusion__ToAssignment_3 )
            // InternalAdaptSem.g:3881:3: rule__Conclusion__ToAssignment_3
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
    // InternalAdaptSem.g:3890:1: rule__Premise__Group__0 : rule__Premise__Group__0__Impl rule__Premise__Group__1 ;
    public final void rule__Premise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3894:1: ( rule__Premise__Group__0__Impl rule__Premise__Group__1 )
            // InternalAdaptSem.g:3895:2: rule__Premise__Group__0__Impl rule__Premise__Group__1
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
    // InternalAdaptSem.g:3902:1: rule__Premise__Group__0__Impl : ( ( rule__Premise__FromAssignment_0 ) ) ;
    public final void rule__Premise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3906:1: ( ( ( rule__Premise__FromAssignment_0 ) ) )
            // InternalAdaptSem.g:3907:1: ( ( rule__Premise__FromAssignment_0 ) )
            {
            // InternalAdaptSem.g:3907:1: ( ( rule__Premise__FromAssignment_0 ) )
            // InternalAdaptSem.g:3908:2: ( rule__Premise__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getFromAssignment_0()); 
            }
            // InternalAdaptSem.g:3909:2: ( rule__Premise__FromAssignment_0 )
            // InternalAdaptSem.g:3909:3: rule__Premise__FromAssignment_0
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
    // InternalAdaptSem.g:3917:1: rule__Premise__Group__1 : rule__Premise__Group__1__Impl rule__Premise__Group__2 ;
    public final void rule__Premise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3921:1: ( rule__Premise__Group__1__Impl rule__Premise__Group__2 )
            // InternalAdaptSem.g:3922:2: rule__Premise__Group__1__Impl rule__Premise__Group__2
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
    // InternalAdaptSem.g:3929:1: rule__Premise__Group__1__Impl : ( '->' ) ;
    public final void rule__Premise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3933:1: ( ( '->' ) )
            // InternalAdaptSem.g:3934:1: ( '->' )
            {
            // InternalAdaptSem.g:3934:1: ( '->' )
            // InternalAdaptSem.g:3935:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:3944:1: rule__Premise__Group__2 : rule__Premise__Group__2__Impl rule__Premise__Group__3 ;
    public final void rule__Premise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3948:1: ( rule__Premise__Group__2__Impl rule__Premise__Group__3 )
            // InternalAdaptSem.g:3949:2: rule__Premise__Group__2__Impl rule__Premise__Group__3
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
    // InternalAdaptSem.g:3956:1: rule__Premise__Group__2__Impl : ( ( rule__Premise__TerminationAssignment_2 )? ) ;
    public final void rule__Premise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3960:1: ( ( ( rule__Premise__TerminationAssignment_2 )? ) )
            // InternalAdaptSem.g:3961:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            {
            // InternalAdaptSem.g:3961:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            // InternalAdaptSem.g:3962:2: ( rule__Premise__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationAssignment_2()); 
            }
            // InternalAdaptSem.g:3963:2: ( rule__Premise__TerminationAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAdaptSem.g:3963:3: rule__Premise__TerminationAssignment_2
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
    // InternalAdaptSem.g:3971:1: rule__Premise__Group__3 : rule__Premise__Group__3__Impl ;
    public final void rule__Premise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3975:1: ( rule__Premise__Group__3__Impl )
            // InternalAdaptSem.g:3976:2: rule__Premise__Group__3__Impl
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
    // InternalAdaptSem.g:3982:1: rule__Premise__Group__3__Impl : ( ( rule__Premise__ToAssignment_3 ) ) ;
    public final void rule__Premise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:3986:1: ( ( ( rule__Premise__ToAssignment_3 ) ) )
            // InternalAdaptSem.g:3987:1: ( ( rule__Premise__ToAssignment_3 ) )
            {
            // InternalAdaptSem.g:3987:1: ( ( rule__Premise__ToAssignment_3 ) )
            // InternalAdaptSem.g:3988:2: ( rule__Premise__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getToAssignment_3()); 
            }
            // InternalAdaptSem.g:3989:2: ( rule__Premise__ToAssignment_3 )
            // InternalAdaptSem.g:3989:3: rule__Premise__ToAssignment_3
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
    // InternalAdaptSem.g:3998:1: rule__DefConfiguration__Group__0 : rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 ;
    public final void rule__DefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4002:1: ( rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 )
            // InternalAdaptSem.g:4003:2: rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1
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
    // InternalAdaptSem.g:4010:1: rule__DefConfiguration__Group__0__Impl : ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__DefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4014:1: ( ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) )
            // InternalAdaptSem.g:4015:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalAdaptSem.g:4015:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            // InternalAdaptSem.g:4016:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalAdaptSem.g:4017:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            // InternalAdaptSem.g:4017:3: rule__DefConfiguration__ConceptAssignment_0
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
    // InternalAdaptSem.g:4025:1: rule__DefConfiguration__Group__1 : rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 ;
    public final void rule__DefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4029:1: ( rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 )
            // InternalAdaptSem.g:4030:2: rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2
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
    // InternalAdaptSem.g:4037:1: rule__DefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__DefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4041:1: ( ( '(' ) )
            // InternalAdaptSem.g:4042:1: ( '(' )
            {
            // InternalAdaptSem.g:4042:1: ( '(' )
            // InternalAdaptSem.g:4043:2: '('
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
    // InternalAdaptSem.g:4052:1: rule__DefConfiguration__Group__2 : rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 ;
    public final void rule__DefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4056:1: ( rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 )
            // InternalAdaptSem.g:4057:2: rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3
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
    // InternalAdaptSem.g:4064:1: rule__DefConfiguration__Group__2__Impl : ( ( rule__DefConfiguration__Group_2__0 )? ) ;
    public final void rule__DefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4068:1: ( ( ( rule__DefConfiguration__Group_2__0 )? ) )
            // InternalAdaptSem.g:4069:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            {
            // InternalAdaptSem.g:4069:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            // InternalAdaptSem.g:4070:2: ( rule__DefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:4071:2: ( rule__DefConfiguration__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==32||LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAdaptSem.g:4071:3: rule__DefConfiguration__Group_2__0
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
    // InternalAdaptSem.g:4079:1: rule__DefConfiguration__Group__3 : rule__DefConfiguration__Group__3__Impl rule__DefConfiguration__Group__4 ;
    public final void rule__DefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4083:1: ( rule__DefConfiguration__Group__3__Impl rule__DefConfiguration__Group__4 )
            // InternalAdaptSem.g:4084:2: rule__DefConfiguration__Group__3__Impl rule__DefConfiguration__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__DefConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAdaptSem.g:4091:1: rule__DefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__DefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4095:1: ( ( ')' ) )
            // InternalAdaptSem.g:4096:1: ( ')' )
            {
            // InternalAdaptSem.g:4096:1: ( ')' )
            // InternalAdaptSem.g:4097:2: ')'
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


    // $ANTLR start "rule__DefConfiguration__Group__4"
    // InternalAdaptSem.g:4106:1: rule__DefConfiguration__Group__4 : rule__DefConfiguration__Group__4__Impl ;
    public final void rule__DefConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4110:1: ( rule__DefConfiguration__Group__4__Impl )
            // InternalAdaptSem.g:4111:2: rule__DefConfiguration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__4"


    // $ANTLR start "rule__DefConfiguration__Group__4__Impl"
    // InternalAdaptSem.g:4117:1: rule__DefConfiguration__Group__4__Impl : ( ( rule__DefConfiguration__Group_4__0 )? ) ;
    public final void rule__DefConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4121:1: ( ( ( rule__DefConfiguration__Group_4__0 )? ) )
            // InternalAdaptSem.g:4122:1: ( ( rule__DefConfiguration__Group_4__0 )? )
            {
            // InternalAdaptSem.g:4122:1: ( ( rule__DefConfiguration__Group_4__0 )? )
            // InternalAdaptSem.g:4123:2: ( rule__DefConfiguration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_4()); 
            }
            // InternalAdaptSem.g:4124:2: ( rule__DefConfiguration__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAdaptSem.g:4124:3: rule__DefConfiguration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefConfiguration__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group__4__Impl"


    // $ANTLR start "rule__DefConfiguration__Group_2__0"
    // InternalAdaptSem.g:4133:1: rule__DefConfiguration__Group_2__0 : rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 ;
    public final void rule__DefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4137:1: ( rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 )
            // InternalAdaptSem.g:4138:2: rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1
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
    // InternalAdaptSem.g:4145:1: rule__DefConfiguration__Group_2__0__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__DefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4149:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:4150:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:4150:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            // InternalAdaptSem.g:4151:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:4152:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            // InternalAdaptSem.g:4152:3: rule__DefConfiguration__ChildsAssignment_2_0
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
    // InternalAdaptSem.g:4160:1: rule__DefConfiguration__Group_2__1 : rule__DefConfiguration__Group_2__1__Impl ;
    public final void rule__DefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4164:1: ( rule__DefConfiguration__Group_2__1__Impl )
            // InternalAdaptSem.g:4165:2: rule__DefConfiguration__Group_2__1__Impl
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
    // InternalAdaptSem.g:4171:1: rule__DefConfiguration__Group_2__1__Impl : ( ( rule__DefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__DefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4175:1: ( ( ( rule__DefConfiguration__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:4176:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:4176:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            // InternalAdaptSem.g:4177:2: ( rule__DefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:4178:2: ( rule__DefConfiguration__Group_2_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==18) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdaptSem.g:4178:3: rule__DefConfiguration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DefConfiguration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalAdaptSem.g:4187:1: rule__DefConfiguration__Group_2_1__0 : rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 ;
    public final void rule__DefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4191:1: ( rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 )
            // InternalAdaptSem.g:4192:2: rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdaptSem.g:4199:1: rule__DefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4203:1: ( ( ',' ) )
            // InternalAdaptSem.g:4204:1: ( ',' )
            {
            // InternalAdaptSem.g:4204:1: ( ',' )
            // InternalAdaptSem.g:4205:2: ','
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
    // InternalAdaptSem.g:4214:1: rule__DefConfiguration__Group_2_1__1 : rule__DefConfiguration__Group_2_1__1__Impl ;
    public final void rule__DefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4218:1: ( rule__DefConfiguration__Group_2_1__1__Impl )
            // InternalAdaptSem.g:4219:2: rule__DefConfiguration__Group_2_1__1__Impl
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
    // InternalAdaptSem.g:4225:1: rule__DefConfiguration__Group_2_1__1__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__DefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4229:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:4230:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:4230:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:4231:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:4232:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            // InternalAdaptSem.g:4232:3: rule__DefConfiguration__ChildsAssignment_2_1_1
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


    // $ANTLR start "rule__DefConfiguration__Group_4__0"
    // InternalAdaptSem.g:4241:1: rule__DefConfiguration__Group_4__0 : rule__DefConfiguration__Group_4__0__Impl rule__DefConfiguration__Group_4__1 ;
    public final void rule__DefConfiguration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4245:1: ( rule__DefConfiguration__Group_4__0__Impl rule__DefConfiguration__Group_4__1 )
            // InternalAdaptSem.g:4246:2: rule__DefConfiguration__Group_4__0__Impl rule__DefConfiguration__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DefConfiguration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_4__0"


    // $ANTLR start "rule__DefConfiguration__Group_4__0__Impl"
    // InternalAdaptSem.g:4253:1: rule__DefConfiguration__Group_4__0__Impl : ( ':' ) ;
    public final void rule__DefConfiguration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4257:1: ( ( ':' ) )
            // InternalAdaptSem.g:4258:1: ( ':' )
            {
            // InternalAdaptSem.g:4258:1: ( ':' )
            // InternalAdaptSem.g:4259:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getColonKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getColonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_4__0__Impl"


    // $ANTLR start "rule__DefConfiguration__Group_4__1"
    // InternalAdaptSem.g:4268:1: rule__DefConfiguration__Group_4__1 : rule__DefConfiguration__Group_4__1__Impl ;
    public final void rule__DefConfiguration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4272:1: ( rule__DefConfiguration__Group_4__1__Impl )
            // InternalAdaptSem.g:4273:2: rule__DefConfiguration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_4__1"


    // $ANTLR start "rule__DefConfiguration__Group_4__1__Impl"
    // InternalAdaptSem.g:4279:1: rule__DefConfiguration__Group_4__1__Impl : ( ( rule__DefConfiguration__SymbolAssignment_4_1 ) ) ;
    public final void rule__DefConfiguration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4283:1: ( ( ( rule__DefConfiguration__SymbolAssignment_4_1 ) ) )
            // InternalAdaptSem.g:4284:1: ( ( rule__DefConfiguration__SymbolAssignment_4_1 ) )
            {
            // InternalAdaptSem.g:4284:1: ( ( rule__DefConfiguration__SymbolAssignment_4_1 ) )
            // InternalAdaptSem.g:4285:2: ( rule__DefConfiguration__SymbolAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getSymbolAssignment_4_1()); 
            }
            // InternalAdaptSem.g:4286:2: ( rule__DefConfiguration__SymbolAssignment_4_1 )
            // InternalAdaptSem.g:4286:3: rule__DefConfiguration__SymbolAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DefConfiguration__SymbolAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getSymbolAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__Group_4__1__Impl"


    // $ANTLR start "rule__RefConfiguration__Group__0"
    // InternalAdaptSem.g:4295:1: rule__RefConfiguration__Group__0 : rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 ;
    public final void rule__RefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4299:1: ( rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 )
            // InternalAdaptSem.g:4300:2: rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1
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
    // InternalAdaptSem.g:4307:1: rule__RefConfiguration__Group__0__Impl : ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__RefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4311:1: ( ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) )
            // InternalAdaptSem.g:4312:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalAdaptSem.g:4312:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            // InternalAdaptSem.g:4313:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalAdaptSem.g:4314:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            // InternalAdaptSem.g:4314:3: rule__RefConfiguration__ConceptAssignment_0
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
    // InternalAdaptSem.g:4322:1: rule__RefConfiguration__Group__1 : rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 ;
    public final void rule__RefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4326:1: ( rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 )
            // InternalAdaptSem.g:4327:2: rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptSem.g:4334:1: rule__RefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__RefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4338:1: ( ( '(' ) )
            // InternalAdaptSem.g:4339:1: ( '(' )
            {
            // InternalAdaptSem.g:4339:1: ( '(' )
            // InternalAdaptSem.g:4340:2: '('
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
    // InternalAdaptSem.g:4349:1: rule__RefConfiguration__Group__2 : rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 ;
    public final void rule__RefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4353:1: ( rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 )
            // InternalAdaptSem.g:4354:2: rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptSem.g:4361:1: rule__RefConfiguration__Group__2__Impl : ( ( rule__RefConfiguration__Group_2__0 )? ) ;
    public final void rule__RefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4365:1: ( ( ( rule__RefConfiguration__Group_2__0 )? ) )
            // InternalAdaptSem.g:4366:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            {
            // InternalAdaptSem.g:4366:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            // InternalAdaptSem.g:4367:2: ( rule__RefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2()); 
            }
            // InternalAdaptSem.g:4368:2: ( rule__RefConfiguration__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==32||LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAdaptSem.g:4368:3: rule__RefConfiguration__Group_2__0
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
    // InternalAdaptSem.g:4376:1: rule__RefConfiguration__Group__3 : rule__RefConfiguration__Group__3__Impl ;
    public final void rule__RefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4380:1: ( rule__RefConfiguration__Group__3__Impl )
            // InternalAdaptSem.g:4381:2: rule__RefConfiguration__Group__3__Impl
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
    // InternalAdaptSem.g:4387:1: rule__RefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__RefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4391:1: ( ( ')' ) )
            // InternalAdaptSem.g:4392:1: ( ')' )
            {
            // InternalAdaptSem.g:4392:1: ( ')' )
            // InternalAdaptSem.g:4393:2: ')'
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
    // InternalAdaptSem.g:4403:1: rule__RefConfiguration__Group_2__0 : rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 ;
    public final void rule__RefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4407:1: ( rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 )
            // InternalAdaptSem.g:4408:2: rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1
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
    // InternalAdaptSem.g:4415:1: rule__RefConfiguration__Group_2__0__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__RefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4419:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalAdaptSem.g:4420:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalAdaptSem.g:4420:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            // InternalAdaptSem.g:4421:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalAdaptSem.g:4422:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            // InternalAdaptSem.g:4422:3: rule__RefConfiguration__ChildsAssignment_2_0
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
    // InternalAdaptSem.g:4430:1: rule__RefConfiguration__Group_2__1 : rule__RefConfiguration__Group_2__1__Impl ;
    public final void rule__RefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4434:1: ( rule__RefConfiguration__Group_2__1__Impl )
            // InternalAdaptSem.g:4435:2: rule__RefConfiguration__Group_2__1__Impl
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
    // InternalAdaptSem.g:4441:1: rule__RefConfiguration__Group_2__1__Impl : ( ( rule__RefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__RefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4445:1: ( ( ( rule__RefConfiguration__Group_2_1__0 )* ) )
            // InternalAdaptSem.g:4446:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            {
            // InternalAdaptSem.g:4446:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            // InternalAdaptSem.g:4447:2: ( rule__RefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalAdaptSem.g:4448:2: ( rule__RefConfiguration__Group_2_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==18) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAdaptSem.g:4448:3: rule__RefConfiguration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RefConfiguration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalAdaptSem.g:4457:1: rule__RefConfiguration__Group_2_1__0 : rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 ;
    public final void rule__RefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4461:1: ( rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 )
            // InternalAdaptSem.g:4462:2: rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1
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
    // InternalAdaptSem.g:4469:1: rule__RefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__RefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4473:1: ( ( ',' ) )
            // InternalAdaptSem.g:4474:1: ( ',' )
            {
            // InternalAdaptSem.g:4474:1: ( ',' )
            // InternalAdaptSem.g:4475:2: ','
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
    // InternalAdaptSem.g:4484:1: rule__RefConfiguration__Group_2_1__1 : rule__RefConfiguration__Group_2_1__1__Impl ;
    public final void rule__RefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4488:1: ( rule__RefConfiguration__Group_2_1__1__Impl )
            // InternalAdaptSem.g:4489:2: rule__RefConfiguration__Group_2_1__1__Impl
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
    // InternalAdaptSem.g:4495:1: rule__RefConfiguration__Group_2_1__1__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__RefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4499:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalAdaptSem.g:4500:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalAdaptSem.g:4500:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalAdaptSem.g:4501:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalAdaptSem.g:4502:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            // InternalAdaptSem.g:4502:3: rule__RefConfiguration__ChildsAssignment_2_1_1
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
    // InternalAdaptSem.g:4511:1: rule__SymbolDef__Group__0 : rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 ;
    public final void rule__SymbolDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4515:1: ( rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 )
            // InternalAdaptSem.g:4516:2: rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1
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
    // InternalAdaptSem.g:4523:1: rule__SymbolDef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4527:1: ( ( () ) )
            // InternalAdaptSem.g:4528:1: ( () )
            {
            // InternalAdaptSem.g:4528:1: ( () )
            // InternalAdaptSem.g:4529:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getSymbolDefAction_0()); 
            }
            // InternalAdaptSem.g:4530:2: ()
            // InternalAdaptSem.g:4530:3: 
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
    // InternalAdaptSem.g:4538:1: rule__SymbolDef__Group__1 : rule__SymbolDef__Group__1__Impl ;
    public final void rule__SymbolDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4542:1: ( rule__SymbolDef__Group__1__Impl )
            // InternalAdaptSem.g:4543:2: rule__SymbolDef__Group__1__Impl
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
    // InternalAdaptSem.g:4549:1: rule__SymbolDef__Group__1__Impl : ( ( rule__SymbolDef__NameAssignment_1 ) ) ;
    public final void rule__SymbolDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4553:1: ( ( ( rule__SymbolDef__NameAssignment_1 ) ) )
            // InternalAdaptSem.g:4554:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            {
            // InternalAdaptSem.g:4554:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            // InternalAdaptSem.g:4555:2: ( rule__SymbolDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getNameAssignment_1()); 
            }
            // InternalAdaptSem.g:4556:2: ( rule__SymbolDef__NameAssignment_1 )
            // InternalAdaptSem.g:4556:3: rule__SymbolDef__NameAssignment_1
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
    // InternalAdaptSem.g:4565:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4569:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // InternalAdaptSem.g:4570:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
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
    // InternalAdaptSem.g:4577:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4581:1: ( ( () ) )
            // InternalAdaptSem.g:4582:1: ( () )
            {
            // InternalAdaptSem.g:4582:1: ( () )
            // InternalAdaptSem.g:4583:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            }
            // InternalAdaptSem.g:4584:2: ()
            // InternalAdaptSem.g:4584:3: 
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
    // InternalAdaptSem.g:4592:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4596:1: ( rule__SymbolRef__Group__1__Impl )
            // InternalAdaptSem.g:4597:2: rule__SymbolRef__Group__1__Impl
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
    // InternalAdaptSem.g:4603:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__DefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4607:1: ( ( ( rule__SymbolRef__DefAssignment_1 ) ) )
            // InternalAdaptSem.g:4608:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            {
            // InternalAdaptSem.g:4608:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            // InternalAdaptSem.g:4609:2: ( rule__SymbolRef__DefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefAssignment_1()); 
            }
            // InternalAdaptSem.g:4610:2: ( rule__SymbolRef__DefAssignment_1 )
            // InternalAdaptSem.g:4610:3: rule__SymbolRef__DefAssignment_1
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
    // InternalAdaptSem.g:4619:1: rule__ListDef__Group__0 : rule__ListDef__Group__0__Impl rule__ListDef__Group__1 ;
    public final void rule__ListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4623:1: ( rule__ListDef__Group__0__Impl rule__ListDef__Group__1 )
            // InternalAdaptSem.g:4624:2: rule__ListDef__Group__0__Impl rule__ListDef__Group__1
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
    // InternalAdaptSem.g:4631:1: rule__ListDef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4635:1: ( ( '[' ) )
            // InternalAdaptSem.g:4636:1: ( '[' )
            {
            // InternalAdaptSem.g:4636:1: ( '[' )
            // InternalAdaptSem.g:4637:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:4646:1: rule__ListDef__Group__1 : rule__ListDef__Group__1__Impl rule__ListDef__Group__2 ;
    public final void rule__ListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4650:1: ( rule__ListDef__Group__1__Impl rule__ListDef__Group__2 )
            // InternalAdaptSem.g:4651:2: rule__ListDef__Group__1__Impl rule__ListDef__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdaptSem.g:4658:1: rule__ListDef__Group__1__Impl : ( ( rule__ListDef__HeadAssignment_1 ) ) ;
    public final void rule__ListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4662:1: ( ( ( rule__ListDef__HeadAssignment_1 ) ) )
            // InternalAdaptSem.g:4663:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            {
            // InternalAdaptSem.g:4663:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            // InternalAdaptSem.g:4664:2: ( rule__ListDef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getHeadAssignment_1()); 
            }
            // InternalAdaptSem.g:4665:2: ( rule__ListDef__HeadAssignment_1 )
            // InternalAdaptSem.g:4665:3: rule__ListDef__HeadAssignment_1
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
    // InternalAdaptSem.g:4673:1: rule__ListDef__Group__2 : rule__ListDef__Group__2__Impl rule__ListDef__Group__3 ;
    public final void rule__ListDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4677:1: ( rule__ListDef__Group__2__Impl rule__ListDef__Group__3 )
            // InternalAdaptSem.g:4678:2: rule__ListDef__Group__2__Impl rule__ListDef__Group__3
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
    // InternalAdaptSem.g:4685:1: rule__ListDef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4689:1: ( ( '|' ) )
            // InternalAdaptSem.g:4690:1: ( '|' )
            {
            // InternalAdaptSem.g:4690:1: ( '|' )
            // InternalAdaptSem.g:4691:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getVerticalLineKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:4700:1: rule__ListDef__Group__3 : rule__ListDef__Group__3__Impl rule__ListDef__Group__4 ;
    public final void rule__ListDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4704:1: ( rule__ListDef__Group__3__Impl rule__ListDef__Group__4 )
            // InternalAdaptSem.g:4705:2: rule__ListDef__Group__3__Impl rule__ListDef__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptSem.g:4712:1: rule__ListDef__Group__3__Impl : ( ( rule__ListDef__TailAssignment_3 ) ) ;
    public final void rule__ListDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4716:1: ( ( ( rule__ListDef__TailAssignment_3 ) ) )
            // InternalAdaptSem.g:4717:1: ( ( rule__ListDef__TailAssignment_3 ) )
            {
            // InternalAdaptSem.g:4717:1: ( ( rule__ListDef__TailAssignment_3 ) )
            // InternalAdaptSem.g:4718:2: ( rule__ListDef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTailAssignment_3()); 
            }
            // InternalAdaptSem.g:4719:2: ( rule__ListDef__TailAssignment_3 )
            // InternalAdaptSem.g:4719:3: rule__ListDef__TailAssignment_3
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
    // InternalAdaptSem.g:4727:1: rule__ListDef__Group__4 : rule__ListDef__Group__4__Impl rule__ListDef__Group__5 ;
    public final void rule__ListDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4731:1: ( rule__ListDef__Group__4__Impl rule__ListDef__Group__5 )
            // InternalAdaptSem.g:4732:2: rule__ListDef__Group__4__Impl rule__ListDef__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__ListDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAdaptSem.g:4739:1: rule__ListDef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4743:1: ( ( ']' ) )
            // InternalAdaptSem.g:4744:1: ( ']' )
            {
            // InternalAdaptSem.g:4744:1: ( ']' )
            // InternalAdaptSem.g:4745:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ListDef__Group__5"
    // InternalAdaptSem.g:4754:1: rule__ListDef__Group__5 : rule__ListDef__Group__5__Impl ;
    public final void rule__ListDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4758:1: ( rule__ListDef__Group__5__Impl )
            // InternalAdaptSem.g:4759:2: rule__ListDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__5"


    // $ANTLR start "rule__ListDef__Group__5__Impl"
    // InternalAdaptSem.g:4765:1: rule__ListDef__Group__5__Impl : ( ( rule__ListDef__Group_5__0 )? ) ;
    public final void rule__ListDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4769:1: ( ( ( rule__ListDef__Group_5__0 )? ) )
            // InternalAdaptSem.g:4770:1: ( ( rule__ListDef__Group_5__0 )? )
            {
            // InternalAdaptSem.g:4770:1: ( ( rule__ListDef__Group_5__0 )? )
            // InternalAdaptSem.g:4771:2: ( rule__ListDef__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getGroup_5()); 
            }
            // InternalAdaptSem.g:4772:2: ( rule__ListDef__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==31) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAdaptSem.g:4772:3: rule__ListDef__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListDef__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group__5__Impl"


    // $ANTLR start "rule__ListDef__Group_5__0"
    // InternalAdaptSem.g:4781:1: rule__ListDef__Group_5__0 : rule__ListDef__Group_5__0__Impl rule__ListDef__Group_5__1 ;
    public final void rule__ListDef__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4785:1: ( rule__ListDef__Group_5__0__Impl rule__ListDef__Group_5__1 )
            // InternalAdaptSem.g:4786:2: rule__ListDef__Group_5__0__Impl rule__ListDef__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ListDef__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListDef__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group_5__0"


    // $ANTLR start "rule__ListDef__Group_5__0__Impl"
    // InternalAdaptSem.g:4793:1: rule__ListDef__Group_5__0__Impl : ( ':' ) ;
    public final void rule__ListDef__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4797:1: ( ( ':' ) )
            // InternalAdaptSem.g:4798:1: ( ':' )
            {
            // InternalAdaptSem.g:4798:1: ( ':' )
            // InternalAdaptSem.g:4799:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getColonKeyword_5_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getColonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group_5__0__Impl"


    // $ANTLR start "rule__ListDef__Group_5__1"
    // InternalAdaptSem.g:4808:1: rule__ListDef__Group_5__1 : rule__ListDef__Group_5__1__Impl ;
    public final void rule__ListDef__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4812:1: ( rule__ListDef__Group_5__1__Impl )
            // InternalAdaptSem.g:4813:2: rule__ListDef__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group_5__1"


    // $ANTLR start "rule__ListDef__Group_5__1__Impl"
    // InternalAdaptSem.g:4819:1: rule__ListDef__Group_5__1__Impl : ( ( rule__ListDef__SymbolAssignment_5_1 ) ) ;
    public final void rule__ListDef__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4823:1: ( ( ( rule__ListDef__SymbolAssignment_5_1 ) ) )
            // InternalAdaptSem.g:4824:1: ( ( rule__ListDef__SymbolAssignment_5_1 ) )
            {
            // InternalAdaptSem.g:4824:1: ( ( rule__ListDef__SymbolAssignment_5_1 ) )
            // InternalAdaptSem.g:4825:2: ( rule__ListDef__SymbolAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getSymbolAssignment_5_1()); 
            }
            // InternalAdaptSem.g:4826:2: ( rule__ListDef__SymbolAssignment_5_1 )
            // InternalAdaptSem.g:4826:3: rule__ListDef__SymbolAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ListDef__SymbolAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getSymbolAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__Group_5__1__Impl"


    // $ANTLR start "rule__ListRef__Group__0"
    // InternalAdaptSem.g:4835:1: rule__ListRef__Group__0 : rule__ListRef__Group__0__Impl rule__ListRef__Group__1 ;
    public final void rule__ListRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4839:1: ( rule__ListRef__Group__0__Impl rule__ListRef__Group__1 )
            // InternalAdaptSem.g:4840:2: rule__ListRef__Group__0__Impl rule__ListRef__Group__1
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
    // InternalAdaptSem.g:4847:1: rule__ListRef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4851:1: ( ( '[' ) )
            // InternalAdaptSem.g:4852:1: ( '[' )
            {
            // InternalAdaptSem.g:4852:1: ( '[' )
            // InternalAdaptSem.g:4853:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:4862:1: rule__ListRef__Group__1 : rule__ListRef__Group__1__Impl rule__ListRef__Group__2 ;
    public final void rule__ListRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4866:1: ( rule__ListRef__Group__1__Impl rule__ListRef__Group__2 )
            // InternalAdaptSem.g:4867:2: rule__ListRef__Group__1__Impl rule__ListRef__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdaptSem.g:4874:1: rule__ListRef__Group__1__Impl : ( ( rule__ListRef__HeadAssignment_1 ) ) ;
    public final void rule__ListRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4878:1: ( ( ( rule__ListRef__HeadAssignment_1 ) ) )
            // InternalAdaptSem.g:4879:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            {
            // InternalAdaptSem.g:4879:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            // InternalAdaptSem.g:4880:2: ( rule__ListRef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getHeadAssignment_1()); 
            }
            // InternalAdaptSem.g:4881:2: ( rule__ListRef__HeadAssignment_1 )
            // InternalAdaptSem.g:4881:3: rule__ListRef__HeadAssignment_1
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
    // InternalAdaptSem.g:4889:1: rule__ListRef__Group__2 : rule__ListRef__Group__2__Impl rule__ListRef__Group__3 ;
    public final void rule__ListRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4893:1: ( rule__ListRef__Group__2__Impl rule__ListRef__Group__3 )
            // InternalAdaptSem.g:4894:2: rule__ListRef__Group__2__Impl rule__ListRef__Group__3
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
    // InternalAdaptSem.g:4901:1: rule__ListRef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4905:1: ( ( '|' ) )
            // InternalAdaptSem.g:4906:1: ( '|' )
            {
            // InternalAdaptSem.g:4906:1: ( '|' )
            // InternalAdaptSem.g:4907:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getVerticalLineKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:4916:1: rule__ListRef__Group__3 : rule__ListRef__Group__3__Impl rule__ListRef__Group__4 ;
    public final void rule__ListRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4920:1: ( rule__ListRef__Group__3__Impl rule__ListRef__Group__4 )
            // InternalAdaptSem.g:4921:2: rule__ListRef__Group__3__Impl rule__ListRef__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptSem.g:4928:1: rule__ListRef__Group__3__Impl : ( ( rule__ListRef__TailAssignment_3 ) ) ;
    public final void rule__ListRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4932:1: ( ( ( rule__ListRef__TailAssignment_3 ) ) )
            // InternalAdaptSem.g:4933:1: ( ( rule__ListRef__TailAssignment_3 ) )
            {
            // InternalAdaptSem.g:4933:1: ( ( rule__ListRef__TailAssignment_3 ) )
            // InternalAdaptSem.g:4934:2: ( rule__ListRef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getTailAssignment_3()); 
            }
            // InternalAdaptSem.g:4935:2: ( rule__ListRef__TailAssignment_3 )
            // InternalAdaptSem.g:4935:3: rule__ListRef__TailAssignment_3
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
    // InternalAdaptSem.g:4943:1: rule__ListRef__Group__4 : rule__ListRef__Group__4__Impl ;
    public final void rule__ListRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4947:1: ( rule__ListRef__Group__4__Impl )
            // InternalAdaptSem.g:4948:2: rule__ListRef__Group__4__Impl
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
    // InternalAdaptSem.g:4954:1: rule__ListRef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4958:1: ( ( ']' ) )
            // InternalAdaptSem.g:4959:1: ( ']' )
            {
            // InternalAdaptSem.g:4959:1: ( ']' )
            // InternalAdaptSem.g:4960:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:4970:1: rule__VoidList__Group__0 : rule__VoidList__Group__0__Impl rule__VoidList__Group__1 ;
    public final void rule__VoidList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4974:1: ( rule__VoidList__Group__0__Impl rule__VoidList__Group__1 )
            // InternalAdaptSem.g:4975:2: rule__VoidList__Group__0__Impl rule__VoidList__Group__1
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
    // InternalAdaptSem.g:4982:1: rule__VoidList__Group__0__Impl : ( () ) ;
    public final void rule__VoidList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:4986:1: ( ( () ) )
            // InternalAdaptSem.g:4987:1: ( () )
            {
            // InternalAdaptSem.g:4987:1: ( () )
            // InternalAdaptSem.g:4988:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getVoidListAction_0()); 
            }
            // InternalAdaptSem.g:4989:2: ()
            // InternalAdaptSem.g:4989:3: 
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
    // InternalAdaptSem.g:4997:1: rule__VoidList__Group__1 : rule__VoidList__Group__1__Impl ;
    public final void rule__VoidList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5001:1: ( rule__VoidList__Group__1__Impl )
            // InternalAdaptSem.g:5002:2: rule__VoidList__Group__1__Impl
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
    // InternalAdaptSem.g:5008:1: rule__VoidList__Group__1__Impl : ( '[]' ) ;
    public final void rule__VoidList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5012:1: ( ( '[]' ) )
            // InternalAdaptSem.g:5013:1: ( '[]' )
            {
            // InternalAdaptSem.g:5013:1: ( '[]' )
            // InternalAdaptSem.g:5014:2: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5024:1: rule__CondNot__Group__0 : rule__CondNot__Group__0__Impl rule__CondNot__Group__1 ;
    public final void rule__CondNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5028:1: ( rule__CondNot__Group__0__Impl rule__CondNot__Group__1 )
            // InternalAdaptSem.g:5029:2: rule__CondNot__Group__0__Impl rule__CondNot__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptSem.g:5036:1: rule__CondNot__Group__0__Impl : ( () ) ;
    public final void rule__CondNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5040:1: ( ( () ) )
            // InternalAdaptSem.g:5041:1: ( () )
            {
            // InternalAdaptSem.g:5041:1: ( () )
            // InternalAdaptSem.g:5042:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getNotAction_0()); 
            }
            // InternalAdaptSem.g:5043:2: ()
            // InternalAdaptSem.g:5043:3: 
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
    // InternalAdaptSem.g:5051:1: rule__CondNot__Group__1 : rule__CondNot__Group__1__Impl rule__CondNot__Group__2 ;
    public final void rule__CondNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5055:1: ( rule__CondNot__Group__1__Impl rule__CondNot__Group__2 )
            // InternalAdaptSem.g:5056:2: rule__CondNot__Group__1__Impl rule__CondNot__Group__2
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
    // InternalAdaptSem.g:5063:1: rule__CondNot__Group__1__Impl : ( '!' ) ;
    public final void rule__CondNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5067:1: ( ( '!' ) )
            // InternalAdaptSem.g:5068:1: ( '!' )
            {
            // InternalAdaptSem.g:5068:1: ( '!' )
            // InternalAdaptSem.g:5069:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5078:1: rule__CondNot__Group__2 : rule__CondNot__Group__2__Impl ;
    public final void rule__CondNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5082:1: ( rule__CondNot__Group__2__Impl )
            // InternalAdaptSem.g:5083:2: rule__CondNot__Group__2__Impl
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
    // InternalAdaptSem.g:5089:1: rule__CondNot__Group__2__Impl : ( ( rule__CondNot__ExprAssignment_2 ) ) ;
    public final void rule__CondNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5093:1: ( ( ( rule__CondNot__ExprAssignment_2 ) ) )
            // InternalAdaptSem.g:5094:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            {
            // InternalAdaptSem.g:5094:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            // InternalAdaptSem.g:5095:2: ( rule__CondNot__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExprAssignment_2()); 
            }
            // InternalAdaptSem.g:5096:2: ( rule__CondNot__ExprAssignment_2 )
            // InternalAdaptSem.g:5096:3: rule__CondNot__ExprAssignment_2
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
    // InternalAdaptSem.g:5105:1: rule__CondOr__Group__0 : rule__CondOr__Group__0__Impl rule__CondOr__Group__1 ;
    public final void rule__CondOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5109:1: ( rule__CondOr__Group__0__Impl rule__CondOr__Group__1 )
            // InternalAdaptSem.g:5110:2: rule__CondOr__Group__0__Impl rule__CondOr__Group__1
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
    // InternalAdaptSem.g:5117:1: rule__CondOr__Group__0__Impl : ( () ) ;
    public final void rule__CondOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5121:1: ( ( () ) )
            // InternalAdaptSem.g:5122:1: ( () )
            {
            // InternalAdaptSem.g:5122:1: ( () )
            // InternalAdaptSem.g:5123:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getOrAction_0()); 
            }
            // InternalAdaptSem.g:5124:2: ()
            // InternalAdaptSem.g:5124:3: 
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
    // InternalAdaptSem.g:5132:1: rule__CondOr__Group__1 : rule__CondOr__Group__1__Impl rule__CondOr__Group__2 ;
    public final void rule__CondOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5136:1: ( rule__CondOr__Group__1__Impl rule__CondOr__Group__2 )
            // InternalAdaptSem.g:5137:2: rule__CondOr__Group__1__Impl rule__CondOr__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptSem.g:5144:1: rule__CondOr__Group__1__Impl : ( ( rule__CondOr__LhsAssignment_1 ) ) ;
    public final void rule__CondOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5148:1: ( ( ( rule__CondOr__LhsAssignment_1 ) ) )
            // InternalAdaptSem.g:5149:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            {
            // InternalAdaptSem.g:5149:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            // InternalAdaptSem.g:5150:2: ( rule__CondOr__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getLhsAssignment_1()); 
            }
            // InternalAdaptSem.g:5151:2: ( rule__CondOr__LhsAssignment_1 )
            // InternalAdaptSem.g:5151:3: rule__CondOr__LhsAssignment_1
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
    // InternalAdaptSem.g:5159:1: rule__CondOr__Group__2 : rule__CondOr__Group__2__Impl rule__CondOr__Group__3 ;
    public final void rule__CondOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5163:1: ( rule__CondOr__Group__2__Impl rule__CondOr__Group__3 )
            // InternalAdaptSem.g:5164:2: rule__CondOr__Group__2__Impl rule__CondOr__Group__3
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
    // InternalAdaptSem.g:5171:1: rule__CondOr__Group__2__Impl : ( '||' ) ;
    public final void rule__CondOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5175:1: ( ( '||' ) )
            // InternalAdaptSem.g:5176:1: ( '||' )
            {
            // InternalAdaptSem.g:5176:1: ( '||' )
            // InternalAdaptSem.g:5177:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5186:1: rule__CondOr__Group__3 : rule__CondOr__Group__3__Impl ;
    public final void rule__CondOr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5190:1: ( rule__CondOr__Group__3__Impl )
            // InternalAdaptSem.g:5191:2: rule__CondOr__Group__3__Impl
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
    // InternalAdaptSem.g:5197:1: rule__CondOr__Group__3__Impl : ( ( rule__CondOr__RhsAssignment_3 ) ) ;
    public final void rule__CondOr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5201:1: ( ( ( rule__CondOr__RhsAssignment_3 ) ) )
            // InternalAdaptSem.g:5202:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            {
            // InternalAdaptSem.g:5202:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            // InternalAdaptSem.g:5203:2: ( rule__CondOr__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getRhsAssignment_3()); 
            }
            // InternalAdaptSem.g:5204:2: ( rule__CondOr__RhsAssignment_3 )
            // InternalAdaptSem.g:5204:3: rule__CondOr__RhsAssignment_3
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
    // InternalAdaptSem.g:5213:1: rule__CondAnd__Group__0 : rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 ;
    public final void rule__CondAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5217:1: ( rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 )
            // InternalAdaptSem.g:5218:2: rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1
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
    // InternalAdaptSem.g:5225:1: rule__CondAnd__Group__0__Impl : ( () ) ;
    public final void rule__CondAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5229:1: ( ( () ) )
            // InternalAdaptSem.g:5230:1: ( () )
            {
            // InternalAdaptSem.g:5230:1: ( () )
            // InternalAdaptSem.g:5231:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAndAction_0()); 
            }
            // InternalAdaptSem.g:5232:2: ()
            // InternalAdaptSem.g:5232:3: 
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
    // InternalAdaptSem.g:5240:1: rule__CondAnd__Group__1 : rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 ;
    public final void rule__CondAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5244:1: ( rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 )
            // InternalAdaptSem.g:5245:2: rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdaptSem.g:5252:1: rule__CondAnd__Group__1__Impl : ( ( rule__CondAnd__LhsAssignment_1 ) ) ;
    public final void rule__CondAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5256:1: ( ( ( rule__CondAnd__LhsAssignment_1 ) ) )
            // InternalAdaptSem.g:5257:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            {
            // InternalAdaptSem.g:5257:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            // InternalAdaptSem.g:5258:2: ( rule__CondAnd__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getLhsAssignment_1()); 
            }
            // InternalAdaptSem.g:5259:2: ( rule__CondAnd__LhsAssignment_1 )
            // InternalAdaptSem.g:5259:3: rule__CondAnd__LhsAssignment_1
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
    // InternalAdaptSem.g:5267:1: rule__CondAnd__Group__2 : rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 ;
    public final void rule__CondAnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5271:1: ( rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 )
            // InternalAdaptSem.g:5272:2: rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3
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
    // InternalAdaptSem.g:5279:1: rule__CondAnd__Group__2__Impl : ( '&&' ) ;
    public final void rule__CondAnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5283:1: ( ( '&&' ) )
            // InternalAdaptSem.g:5284:1: ( '&&' )
            {
            // InternalAdaptSem.g:5284:1: ( '&&' )
            // InternalAdaptSem.g:5285:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5294:1: rule__CondAnd__Group__3 : rule__CondAnd__Group__3__Impl ;
    public final void rule__CondAnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5298:1: ( rule__CondAnd__Group__3__Impl )
            // InternalAdaptSem.g:5299:2: rule__CondAnd__Group__3__Impl
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
    // InternalAdaptSem.g:5305:1: rule__CondAnd__Group__3__Impl : ( ( rule__CondAnd__RhsAssignment_3 ) ) ;
    public final void rule__CondAnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5309:1: ( ( ( rule__CondAnd__RhsAssignment_3 ) ) )
            // InternalAdaptSem.g:5310:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            {
            // InternalAdaptSem.g:5310:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            // InternalAdaptSem.g:5311:2: ( rule__CondAnd__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getRhsAssignment_3()); 
            }
            // InternalAdaptSem.g:5312:2: ( rule__CondAnd__RhsAssignment_3 )
            // InternalAdaptSem.g:5312:3: rule__CondAnd__RhsAssignment_3
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
    // InternalAdaptSem.g:5321:1: rule__CondEquality__Group_0__0 : rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 ;
    public final void rule__CondEquality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5325:1: ( rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 )
            // InternalAdaptSem.g:5326:2: rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1
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
    // InternalAdaptSem.g:5333:1: rule__CondEquality__Group_0__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5337:1: ( ( () ) )
            // InternalAdaptSem.g:5338:1: ( () )
            {
            // InternalAdaptSem.g:5338:1: ( () )
            // InternalAdaptSem.g:5339:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualAction_0_0()); 
            }
            // InternalAdaptSem.g:5340:2: ()
            // InternalAdaptSem.g:5340:3: 
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
    // InternalAdaptSem.g:5348:1: rule__CondEquality__Group_0__1 : rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 ;
    public final void rule__CondEquality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5352:1: ( rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 )
            // InternalAdaptSem.g:5353:2: rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptSem.g:5360:1: rule__CondEquality__Group_0__1__Impl : ( ( rule__CondEquality__LhsAssignment_0_1 ) ) ;
    public final void rule__CondEquality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5364:1: ( ( ( rule__CondEquality__LhsAssignment_0_1 ) ) )
            // InternalAdaptSem.g:5365:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:5365:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            // InternalAdaptSem.g:5366:2: ( rule__CondEquality__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_0_1()); 
            }
            // InternalAdaptSem.g:5367:2: ( rule__CondEquality__LhsAssignment_0_1 )
            // InternalAdaptSem.g:5367:3: rule__CondEquality__LhsAssignment_0_1
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
    // InternalAdaptSem.g:5375:1: rule__CondEquality__Group_0__2 : rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 ;
    public final void rule__CondEquality__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5379:1: ( rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 )
            // InternalAdaptSem.g:5380:2: rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3
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
    // InternalAdaptSem.g:5387:1: rule__CondEquality__Group_0__2__Impl : ( '==' ) ;
    public final void rule__CondEquality__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5391:1: ( ( '==' ) )
            // InternalAdaptSem.g:5392:1: ( '==' )
            {
            // InternalAdaptSem.g:5392:1: ( '==' )
            // InternalAdaptSem.g:5393:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5402:1: rule__CondEquality__Group_0__3 : rule__CondEquality__Group_0__3__Impl ;
    public final void rule__CondEquality__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5406:1: ( rule__CondEquality__Group_0__3__Impl )
            // InternalAdaptSem.g:5407:2: rule__CondEquality__Group_0__3__Impl
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
    // InternalAdaptSem.g:5413:1: rule__CondEquality__Group_0__3__Impl : ( ( rule__CondEquality__RhsAssignment_0_3 ) ) ;
    public final void rule__CondEquality__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5417:1: ( ( ( rule__CondEquality__RhsAssignment_0_3 ) ) )
            // InternalAdaptSem.g:5418:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            {
            // InternalAdaptSem.g:5418:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            // InternalAdaptSem.g:5419:2: ( rule__CondEquality__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_0_3()); 
            }
            // InternalAdaptSem.g:5420:2: ( rule__CondEquality__RhsAssignment_0_3 )
            // InternalAdaptSem.g:5420:3: rule__CondEquality__RhsAssignment_0_3
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
    // InternalAdaptSem.g:5429:1: rule__CondEquality__Group_1__0 : rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 ;
    public final void rule__CondEquality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5433:1: ( rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 )
            // InternalAdaptSem.g:5434:2: rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1
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
    // InternalAdaptSem.g:5441:1: rule__CondEquality__Group_1__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5445:1: ( ( () ) )
            // InternalAdaptSem.g:5446:1: ( () )
            {
            // InternalAdaptSem.g:5446:1: ( () )
            // InternalAdaptSem.g:5447:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0()); 
            }
            // InternalAdaptSem.g:5448:2: ()
            // InternalAdaptSem.g:5448:3: 
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
    // InternalAdaptSem.g:5456:1: rule__CondEquality__Group_1__1 : rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 ;
    public final void rule__CondEquality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5460:1: ( rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 )
            // InternalAdaptSem.g:5461:2: rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptSem.g:5468:1: rule__CondEquality__Group_1__1__Impl : ( ( rule__CondEquality__LhsAssignment_1_1 ) ) ;
    public final void rule__CondEquality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5472:1: ( ( ( rule__CondEquality__LhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5473:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5473:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5474:2: ( rule__CondEquality__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5475:2: ( rule__CondEquality__LhsAssignment_1_1 )
            // InternalAdaptSem.g:5475:3: rule__CondEquality__LhsAssignment_1_1
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
    // InternalAdaptSem.g:5483:1: rule__CondEquality__Group_1__2 : rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 ;
    public final void rule__CondEquality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5487:1: ( rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 )
            // InternalAdaptSem.g:5488:2: rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3
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
    // InternalAdaptSem.g:5495:1: rule__CondEquality__Group_1__2__Impl : ( '!=' ) ;
    public final void rule__CondEquality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5499:1: ( ( '!=' ) )
            // InternalAdaptSem.g:5500:1: ( '!=' )
            {
            // InternalAdaptSem.g:5500:1: ( '!=' )
            // InternalAdaptSem.g:5501:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5510:1: rule__CondEquality__Group_1__3 : rule__CondEquality__Group_1__3__Impl ;
    public final void rule__CondEquality__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5514:1: ( rule__CondEquality__Group_1__3__Impl )
            // InternalAdaptSem.g:5515:2: rule__CondEquality__Group_1__3__Impl
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
    // InternalAdaptSem.g:5521:1: rule__CondEquality__Group_1__3__Impl : ( ( rule__CondEquality__RhsAssignment_1_3 ) ) ;
    public final void rule__CondEquality__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5525:1: ( ( ( rule__CondEquality__RhsAssignment_1_3 ) ) )
            // InternalAdaptSem.g:5526:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            {
            // InternalAdaptSem.g:5526:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            // InternalAdaptSem.g:5527:2: ( rule__CondEquality__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_1_3()); 
            }
            // InternalAdaptSem.g:5528:2: ( rule__CondEquality__RhsAssignment_1_3 )
            // InternalAdaptSem.g:5528:3: rule__CondEquality__RhsAssignment_1_3
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
    // InternalAdaptSem.g:5537:1: rule__CondComparison__Group_0__0 : rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 ;
    public final void rule__CondComparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5541:1: ( rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 )
            // InternalAdaptSem.g:5542:2: rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1
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
    // InternalAdaptSem.g:5549:1: rule__CondComparison__Group_0__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5553:1: ( ( () ) )
            // InternalAdaptSem.g:5554:1: ( () )
            {
            // InternalAdaptSem.g:5554:1: ( () )
            // InternalAdaptSem.g:5555:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessAction_0_0()); 
            }
            // InternalAdaptSem.g:5556:2: ()
            // InternalAdaptSem.g:5556:3: 
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
    // InternalAdaptSem.g:5564:1: rule__CondComparison__Group_0__1 : rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 ;
    public final void rule__CondComparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5568:1: ( rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 )
            // InternalAdaptSem.g:5569:2: rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptSem.g:5576:1: rule__CondComparison__Group_0__1__Impl : ( ( rule__CondComparison__LhsAssignment_0_1 ) ) ;
    public final void rule__CondComparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5580:1: ( ( ( rule__CondComparison__LhsAssignment_0_1 ) ) )
            // InternalAdaptSem.g:5581:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:5581:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            // InternalAdaptSem.g:5582:2: ( rule__CondComparison__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_0_1()); 
            }
            // InternalAdaptSem.g:5583:2: ( rule__CondComparison__LhsAssignment_0_1 )
            // InternalAdaptSem.g:5583:3: rule__CondComparison__LhsAssignment_0_1
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
    // InternalAdaptSem.g:5591:1: rule__CondComparison__Group_0__2 : rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 ;
    public final void rule__CondComparison__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5595:1: ( rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 )
            // InternalAdaptSem.g:5596:2: rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3
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
    // InternalAdaptSem.g:5603:1: rule__CondComparison__Group_0__2__Impl : ( '<' ) ;
    public final void rule__CondComparison__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5607:1: ( ( '<' ) )
            // InternalAdaptSem.g:5608:1: ( '<' )
            {
            // InternalAdaptSem.g:5608:1: ( '<' )
            // InternalAdaptSem.g:5609:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5618:1: rule__CondComparison__Group_0__3 : rule__CondComparison__Group_0__3__Impl ;
    public final void rule__CondComparison__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5622:1: ( rule__CondComparison__Group_0__3__Impl )
            // InternalAdaptSem.g:5623:2: rule__CondComparison__Group_0__3__Impl
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
    // InternalAdaptSem.g:5629:1: rule__CondComparison__Group_0__3__Impl : ( ( rule__CondComparison__RhsAssignment_0_3 ) ) ;
    public final void rule__CondComparison__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5633:1: ( ( ( rule__CondComparison__RhsAssignment_0_3 ) ) )
            // InternalAdaptSem.g:5634:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            {
            // InternalAdaptSem.g:5634:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            // InternalAdaptSem.g:5635:2: ( rule__CondComparison__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_0_3()); 
            }
            // InternalAdaptSem.g:5636:2: ( rule__CondComparison__RhsAssignment_0_3 )
            // InternalAdaptSem.g:5636:3: rule__CondComparison__RhsAssignment_0_3
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
    // InternalAdaptSem.g:5645:1: rule__CondComparison__Group_1__0 : rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 ;
    public final void rule__CondComparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5649:1: ( rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 )
            // InternalAdaptSem.g:5650:2: rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1
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
    // InternalAdaptSem.g:5657:1: rule__CondComparison__Group_1__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5661:1: ( ( () ) )
            // InternalAdaptSem.g:5662:1: ( () )
            {
            // InternalAdaptSem.g:5662:1: ( () )
            // InternalAdaptSem.g:5663:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessEqAction_1_0()); 
            }
            // InternalAdaptSem.g:5664:2: ()
            // InternalAdaptSem.g:5664:3: 
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
    // InternalAdaptSem.g:5672:1: rule__CondComparison__Group_1__1 : rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 ;
    public final void rule__CondComparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5676:1: ( rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 )
            // InternalAdaptSem.g:5677:2: rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdaptSem.g:5684:1: rule__CondComparison__Group_1__1__Impl : ( ( rule__CondComparison__LhsAssignment_1_1 ) ) ;
    public final void rule__CondComparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5688:1: ( ( ( rule__CondComparison__LhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:5689:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:5689:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            // InternalAdaptSem.g:5690:2: ( rule__CondComparison__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:5691:2: ( rule__CondComparison__LhsAssignment_1_1 )
            // InternalAdaptSem.g:5691:3: rule__CondComparison__LhsAssignment_1_1
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
    // InternalAdaptSem.g:5699:1: rule__CondComparison__Group_1__2 : rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 ;
    public final void rule__CondComparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5703:1: ( rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 )
            // InternalAdaptSem.g:5704:2: rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3
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
    // InternalAdaptSem.g:5711:1: rule__CondComparison__Group_1__2__Impl : ( '<=' ) ;
    public final void rule__CondComparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5715:1: ( ( '<=' ) )
            // InternalAdaptSem.g:5716:1: ( '<=' )
            {
            // InternalAdaptSem.g:5716:1: ( '<=' )
            // InternalAdaptSem.g:5717:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5726:1: rule__CondComparison__Group_1__3 : rule__CondComparison__Group_1__3__Impl ;
    public final void rule__CondComparison__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5730:1: ( rule__CondComparison__Group_1__3__Impl )
            // InternalAdaptSem.g:5731:2: rule__CondComparison__Group_1__3__Impl
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
    // InternalAdaptSem.g:5737:1: rule__CondComparison__Group_1__3__Impl : ( ( rule__CondComparison__RhsAssignment_1_3 ) ) ;
    public final void rule__CondComparison__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5741:1: ( ( ( rule__CondComparison__RhsAssignment_1_3 ) ) )
            // InternalAdaptSem.g:5742:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            {
            // InternalAdaptSem.g:5742:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            // InternalAdaptSem.g:5743:2: ( rule__CondComparison__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_1_3()); 
            }
            // InternalAdaptSem.g:5744:2: ( rule__CondComparison__RhsAssignment_1_3 )
            // InternalAdaptSem.g:5744:3: rule__CondComparison__RhsAssignment_1_3
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
    // InternalAdaptSem.g:5753:1: rule__CondIs__Group__0 : rule__CondIs__Group__0__Impl rule__CondIs__Group__1 ;
    public final void rule__CondIs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5757:1: ( rule__CondIs__Group__0__Impl rule__CondIs__Group__1 )
            // InternalAdaptSem.g:5758:2: rule__CondIs__Group__0__Impl rule__CondIs__Group__1
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
    // InternalAdaptSem.g:5765:1: rule__CondIs__Group__0__Impl : ( () ) ;
    public final void rule__CondIs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5769:1: ( ( () ) )
            // InternalAdaptSem.g:5770:1: ( () )
            {
            // InternalAdaptSem.g:5770:1: ( () )
            // InternalAdaptSem.g:5771:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getIsAction_0()); 
            }
            // InternalAdaptSem.g:5772:2: ()
            // InternalAdaptSem.g:5772:3: 
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
    // InternalAdaptSem.g:5780:1: rule__CondIs__Group__1 : rule__CondIs__Group__1__Impl rule__CondIs__Group__2 ;
    public final void rule__CondIs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5784:1: ( rule__CondIs__Group__1__Impl rule__CondIs__Group__2 )
            // InternalAdaptSem.g:5785:2: rule__CondIs__Group__1__Impl rule__CondIs__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptSem.g:5792:1: rule__CondIs__Group__1__Impl : ( ( rule__CondIs__PatternAssignment_1 ) ) ;
    public final void rule__CondIs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5796:1: ( ( ( rule__CondIs__PatternAssignment_1 ) ) )
            // InternalAdaptSem.g:5797:1: ( ( rule__CondIs__PatternAssignment_1 ) )
            {
            // InternalAdaptSem.g:5797:1: ( ( rule__CondIs__PatternAssignment_1 ) )
            // InternalAdaptSem.g:5798:2: ( rule__CondIs__PatternAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getPatternAssignment_1()); 
            }
            // InternalAdaptSem.g:5799:2: ( rule__CondIs__PatternAssignment_1 )
            // InternalAdaptSem.g:5799:3: rule__CondIs__PatternAssignment_1
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
    // InternalAdaptSem.g:5807:1: rule__CondIs__Group__2 : rule__CondIs__Group__2__Impl rule__CondIs__Group__3 ;
    public final void rule__CondIs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5811:1: ( rule__CondIs__Group__2__Impl rule__CondIs__Group__3 )
            // InternalAdaptSem.g:5812:2: rule__CondIs__Group__2__Impl rule__CondIs__Group__3
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
    // InternalAdaptSem.g:5819:1: rule__CondIs__Group__2__Impl : ( 'match' ) ;
    public final void rule__CondIs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5823:1: ( ( 'match' ) )
            // InternalAdaptSem.g:5824:1: ( 'match' )
            {
            // InternalAdaptSem.g:5824:1: ( 'match' )
            // InternalAdaptSem.g:5825:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getMatchKeyword_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5834:1: rule__CondIs__Group__3 : rule__CondIs__Group__3__Impl ;
    public final void rule__CondIs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5838:1: ( rule__CondIs__Group__3__Impl )
            // InternalAdaptSem.g:5839:2: rule__CondIs__Group__3__Impl
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
    // InternalAdaptSem.g:5845:1: rule__CondIs__Group__3__Impl : ( ( rule__CondIs__ExprAssignment_3 ) ) ;
    public final void rule__CondIs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5849:1: ( ( ( rule__CondIs__ExprAssignment_3 ) ) )
            // InternalAdaptSem.g:5850:1: ( ( rule__CondIs__ExprAssignment_3 ) )
            {
            // InternalAdaptSem.g:5850:1: ( ( rule__CondIs__ExprAssignment_3 ) )
            // InternalAdaptSem.g:5851:2: ( rule__CondIs__ExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getExprAssignment_3()); 
            }
            // InternalAdaptSem.g:5852:2: ( rule__CondIs__ExprAssignment_3 )
            // InternalAdaptSem.g:5852:3: rule__CondIs__ExprAssignment_3
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
    // InternalAdaptSem.g:5861:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5865:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalAdaptSem.g:5866:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptSem.g:5873:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5877:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:5878:1: ( ruleAnd )
            {
            // InternalAdaptSem.g:5878:1: ( ruleAnd )
            // InternalAdaptSem.g:5879:2: ruleAnd
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
    // InternalAdaptSem.g:5888:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5892:1: ( rule__Or__Group__1__Impl )
            // InternalAdaptSem.g:5893:2: rule__Or__Group__1__Impl
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
    // InternalAdaptSem.g:5899:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5903:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalAdaptSem.g:5904:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalAdaptSem.g:5904:1: ( ( rule__Or__Group_1__0 )* )
            // InternalAdaptSem.g:5905:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:5906:2: ( rule__Or__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==37) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAdaptSem.g:5906:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalAdaptSem.g:5915:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5919:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalAdaptSem.g:5920:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptSem.g:5927:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5931:1: ( ( () ) )
            // InternalAdaptSem.g:5932:1: ( () )
            {
            // InternalAdaptSem.g:5932:1: ( () )
            // InternalAdaptSem.g:5933:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLhsAction_1_0()); 
            }
            // InternalAdaptSem.g:5934:2: ()
            // InternalAdaptSem.g:5934:3: 
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
    // InternalAdaptSem.g:5942:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5946:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalAdaptSem.g:5947:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalAdaptSem.g:5954:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5958:1: ( ( '||' ) )
            // InternalAdaptSem.g:5959:1: ( '||' )
            {
            // InternalAdaptSem.g:5959:1: ( '||' )
            // InternalAdaptSem.g:5960:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:5969:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5973:1: ( rule__Or__Group_1__2__Impl )
            // InternalAdaptSem.g:5974:2: rule__Or__Group_1__2__Impl
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
    // InternalAdaptSem.g:5980:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RhsAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:5984:1: ( ( ( rule__Or__RhsAssignment_1_2 ) ) )
            // InternalAdaptSem.g:5985:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:5985:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            // InternalAdaptSem.g:5986:2: ( rule__Or__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRhsAssignment_1_2()); 
            }
            // InternalAdaptSem.g:5987:2: ( rule__Or__RhsAssignment_1_2 )
            // InternalAdaptSem.g:5987:3: rule__Or__RhsAssignment_1_2
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
    // InternalAdaptSem.g:5996:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6000:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalAdaptSem.g:6001:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdaptSem.g:6008:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6012:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:6013:1: ( ruleEquality )
            {
            // InternalAdaptSem.g:6013:1: ( ruleEquality )
            // InternalAdaptSem.g:6014:2: ruleEquality
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
    // InternalAdaptSem.g:6023:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6027:1: ( rule__And__Group__1__Impl )
            // InternalAdaptSem.g:6028:2: rule__And__Group__1__Impl
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
    // InternalAdaptSem.g:6034:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6038:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalAdaptSem.g:6039:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6039:1: ( ( rule__And__Group_1__0 )* )
            // InternalAdaptSem.g:6040:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6041:2: ( rule__And__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==38) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAdaptSem.g:6041:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalAdaptSem.g:6050:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6054:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalAdaptSem.g:6055:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdaptSem.g:6062:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6066:1: ( ( () ) )
            // InternalAdaptSem.g:6067:1: ( () )
            {
            // InternalAdaptSem.g:6067:1: ( () )
            // InternalAdaptSem.g:6068:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLhsAction_1_0()); 
            }
            // InternalAdaptSem.g:6069:2: ()
            // InternalAdaptSem.g:6069:3: 
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
    // InternalAdaptSem.g:6077:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6081:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalAdaptSem.g:6082:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalAdaptSem.g:6089:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6093:1: ( ( '&&' ) )
            // InternalAdaptSem.g:6094:1: ( '&&' )
            {
            // InternalAdaptSem.g:6094:1: ( '&&' )
            // InternalAdaptSem.g:6095:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6104:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6108:1: ( rule__And__Group_1__2__Impl )
            // InternalAdaptSem.g:6109:2: rule__And__Group_1__2__Impl
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
    // InternalAdaptSem.g:6115:1: rule__And__Group_1__2__Impl : ( ( rule__And__RhsAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6119:1: ( ( ( rule__And__RhsAssignment_1_2 ) ) )
            // InternalAdaptSem.g:6120:1: ( ( rule__And__RhsAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:6120:1: ( ( rule__And__RhsAssignment_1_2 ) )
            // InternalAdaptSem.g:6121:2: ( rule__And__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRhsAssignment_1_2()); 
            }
            // InternalAdaptSem.g:6122:2: ( rule__And__RhsAssignment_1_2 )
            // InternalAdaptSem.g:6122:3: rule__And__RhsAssignment_1_2
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
    // InternalAdaptSem.g:6131:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6135:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalAdaptSem.g:6136:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptSem.g:6143:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6147:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:6148:1: ( ruleComparison )
            {
            // InternalAdaptSem.g:6148:1: ( ruleComparison )
            // InternalAdaptSem.g:6149:2: ruleComparison
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
    // InternalAdaptSem.g:6158:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6162:1: ( rule__Equality__Group__1__Impl )
            // InternalAdaptSem.g:6163:2: rule__Equality__Group__1__Impl
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
    // InternalAdaptSem.g:6169:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6173:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalAdaptSem.g:6174:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6174:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalAdaptSem.g:6175:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6176:2: ( rule__Equality__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=39 && LA49_0<=40)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAdaptSem.g:6176:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalAdaptSem.g:6185:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6189:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalAdaptSem.g:6190:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalAdaptSem.g:6197:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6201:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6202:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6202:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6203:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6204:2: ( rule__Equality__Alternatives_1_0 )
            // InternalAdaptSem.g:6204:3: rule__Equality__Alternatives_1_0
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
    // InternalAdaptSem.g:6212:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6216:1: ( rule__Equality__Group_1__1__Impl )
            // InternalAdaptSem.g:6217:2: rule__Equality__Group_1__1__Impl
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
    // InternalAdaptSem.g:6223:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RhsAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6227:1: ( ( ( rule__Equality__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6228:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6228:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6229:2: ( rule__Equality__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6230:2: ( rule__Equality__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6230:3: rule__Equality__RhsAssignment_1_1
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
    // InternalAdaptSem.g:6239:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6243:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalAdaptSem.g:6244:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptSem.g:6251:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6255:1: ( ( () ) )
            // InternalAdaptSem.g:6256:1: ( () )
            {
            // InternalAdaptSem.g:6256:1: ( () )
            // InternalAdaptSem.g:6257:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6258:2: ()
            // InternalAdaptSem.g:6258:3: 
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
    // InternalAdaptSem.g:6266:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6270:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6271:2: rule__Equality__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:6277:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6281:1: ( ( '==' ) )
            // InternalAdaptSem.g:6282:1: ( '==' )
            {
            // InternalAdaptSem.g:6282:1: ( '==' )
            // InternalAdaptSem.g:6283:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6293:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6297:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalAdaptSem.g:6298:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptSem.g:6305:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6309:1: ( ( () ) )
            // InternalAdaptSem.g:6310:1: ( () )
            {
            // InternalAdaptSem.g:6310:1: ( () )
            // InternalAdaptSem.g:6311:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6312:2: ()
            // InternalAdaptSem.g:6312:3: 
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
    // InternalAdaptSem.g:6320:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6324:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6325:2: rule__Equality__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:6331:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6335:1: ( ( '!=' ) )
            // InternalAdaptSem.g:6336:1: ( '!=' )
            {
            // InternalAdaptSem.g:6336:1: ( '!=' )
            // InternalAdaptSem.g:6337:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6347:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6351:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalAdaptSem.g:6352:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdaptSem.g:6359:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6363:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:6364:1: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:6364:1: ( rulePlusOrMinus )
            // InternalAdaptSem.g:6365:2: rulePlusOrMinus
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
    // InternalAdaptSem.g:6374:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6378:1: ( rule__Comparison__Group__1__Impl )
            // InternalAdaptSem.g:6379:2: rule__Comparison__Group__1__Impl
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
    // InternalAdaptSem.g:6385:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6389:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalAdaptSem.g:6390:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6390:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalAdaptSem.g:6391:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6392:2: ( rule__Comparison__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=41 && LA50_0<=42)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAdaptSem.g:6392:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalAdaptSem.g:6401:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6405:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalAdaptSem.g:6406:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalAdaptSem.g:6413:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6417:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6418:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6418:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6419:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6420:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalAdaptSem.g:6420:3: rule__Comparison__Alternatives_1_0
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
    // InternalAdaptSem.g:6428:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6432:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalAdaptSem.g:6433:2: rule__Comparison__Group_1__1__Impl
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
    // InternalAdaptSem.g:6439:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RhsAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6443:1: ( ( ( rule__Comparison__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6444:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6444:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6445:2: ( rule__Comparison__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6446:2: ( rule__Comparison__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6446:3: rule__Comparison__RhsAssignment_1_1
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
    // InternalAdaptSem.g:6455:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6459:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalAdaptSem.g:6460:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptSem.g:6467:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6471:1: ( ( () ) )
            // InternalAdaptSem.g:6472:1: ( () )
            {
            // InternalAdaptSem.g:6472:1: ( () )
            // InternalAdaptSem.g:6473:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6474:2: ()
            // InternalAdaptSem.g:6474:3: 
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
    // InternalAdaptSem.g:6482:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6486:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6487:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:6493:1: rule__Comparison__Group_1_0_0__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6497:1: ( ( '<' ) )
            // InternalAdaptSem.g:6498:1: ( '<' )
            {
            // InternalAdaptSem.g:6498:1: ( '<' )
            // InternalAdaptSem.g:6499:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6509:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6513:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalAdaptSem.g:6514:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdaptSem.g:6521:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6525:1: ( ( () ) )
            // InternalAdaptSem.g:6526:1: ( () )
            {
            // InternalAdaptSem.g:6526:1: ( () )
            // InternalAdaptSem.g:6527:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6528:2: ()
            // InternalAdaptSem.g:6528:3: 
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
    // InternalAdaptSem.g:6536:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6540:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6541:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:6547:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6551:1: ( ( '<=' ) )
            // InternalAdaptSem.g:6552:1: ( '<=' )
            {
            // InternalAdaptSem.g:6552:1: ( '<=' )
            // InternalAdaptSem.g:6553:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6563:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6567:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalAdaptSem.g:6568:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdaptSem.g:6575:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6579:1: ( ( ruleMulOrDiv ) )
            // InternalAdaptSem.g:6580:1: ( ruleMulOrDiv )
            {
            // InternalAdaptSem.g:6580:1: ( ruleMulOrDiv )
            // InternalAdaptSem.g:6581:2: ruleMulOrDiv
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
    // InternalAdaptSem.g:6590:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6594:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalAdaptSem.g:6595:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalAdaptSem.g:6601:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6605:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalAdaptSem.g:6606:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6606:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalAdaptSem.g:6607:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6608:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=44 && LA51_0<=45)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAdaptSem.g:6608:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalAdaptSem.g:6617:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6621:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalAdaptSem.g:6622:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalAdaptSem.g:6629:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6633:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6634:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6634:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6635:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6636:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalAdaptSem.g:6636:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalAdaptSem.g:6644:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6648:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalAdaptSem.g:6649:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalAdaptSem.g:6655:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6659:1: ( ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6660:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6660:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6661:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6662:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6662:3: rule__PlusOrMinus__RhsAssignment_1_1
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
    // InternalAdaptSem.g:6671:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6675:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalAdaptSem.g:6676:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAdaptSem.g:6683:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6687:1: ( ( () ) )
            // InternalAdaptSem.g:6688:1: ( () )
            {
            // InternalAdaptSem.g:6688:1: ( () )
            // InternalAdaptSem.g:6689:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6690:2: ()
            // InternalAdaptSem.g:6690:3: 
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
    // InternalAdaptSem.g:6698:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6702:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6703:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:6709:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6713:1: ( ( '+' ) )
            // InternalAdaptSem.g:6714:1: ( '+' )
            {
            // InternalAdaptSem.g:6714:1: ( '+' )
            // InternalAdaptSem.g:6715:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6725:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6729:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalAdaptSem.g:6730:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdaptSem.g:6737:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6741:1: ( ( () ) )
            // InternalAdaptSem.g:6742:1: ( () )
            {
            // InternalAdaptSem.g:6742:1: ( () )
            // InternalAdaptSem.g:6743:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6744:2: ()
            // InternalAdaptSem.g:6744:3: 
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
    // InternalAdaptSem.g:6752:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6756:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6757:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:6763:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6767:1: ( ( '-' ) )
            // InternalAdaptSem.g:6768:1: ( '-' )
            {
            // InternalAdaptSem.g:6768:1: ( '-' )
            // InternalAdaptSem.g:6769:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6779:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6783:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalAdaptSem.g:6784:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalAdaptSem.g:6791:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6795:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:6796:1: ( rulePrimary )
            {
            // InternalAdaptSem.g:6796:1: ( rulePrimary )
            // InternalAdaptSem.g:6797:2: rulePrimary
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
    // InternalAdaptSem.g:6806:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6810:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalAdaptSem.g:6811:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalAdaptSem.g:6817:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6821:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalAdaptSem.g:6822:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalAdaptSem.g:6822:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalAdaptSem.g:6823:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:6824:2: ( rule__MulOrDiv__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=46 && LA52_0<=47)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAdaptSem.g:6824:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalAdaptSem.g:6833:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6837:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalAdaptSem.g:6838:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalAdaptSem.g:6845:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6849:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalAdaptSem.g:6850:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalAdaptSem.g:6850:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalAdaptSem.g:6851:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalAdaptSem.g:6852:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalAdaptSem.g:6852:3: rule__MulOrDiv__Alternatives_1_0
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
    // InternalAdaptSem.g:6860:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6864:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalAdaptSem.g:6865:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalAdaptSem.g:6871:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6875:1: ( ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) )
            // InternalAdaptSem.g:6876:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:6876:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            // InternalAdaptSem.g:6877:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRhsAssignment_1_1()); 
            }
            // InternalAdaptSem.g:6878:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            // InternalAdaptSem.g:6878:3: rule__MulOrDiv__RhsAssignment_1_1
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
    // InternalAdaptSem.g:6887:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6891:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalAdaptSem.g:6892:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalAdaptSem.g:6899:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6903:1: ( ( () ) )
            // InternalAdaptSem.g:6904:1: ( () )
            {
            // InternalAdaptSem.g:6904:1: ( () )
            // InternalAdaptSem.g:6905:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()); 
            }
            // InternalAdaptSem.g:6906:2: ()
            // InternalAdaptSem.g:6906:3: 
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
    // InternalAdaptSem.g:6914:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6918:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalAdaptSem.g:6919:2: rule__MulOrDiv__Group_1_0_0__1__Impl
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
    // InternalAdaptSem.g:6925:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6929:1: ( ( '*' ) )
            // InternalAdaptSem.g:6930:1: ( '*' )
            {
            // InternalAdaptSem.g:6930:1: ( '*' )
            // InternalAdaptSem.g:6931:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6941:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6945:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalAdaptSem.g:6946:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalAdaptSem.g:6953:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6957:1: ( ( () ) )
            // InternalAdaptSem.g:6958:1: ( () )
            {
            // InternalAdaptSem.g:6958:1: ( () )
            // InternalAdaptSem.g:6959:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()); 
            }
            // InternalAdaptSem.g:6960:2: ()
            // InternalAdaptSem.g:6960:3: 
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
    // InternalAdaptSem.g:6968:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6972:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalAdaptSem.g:6973:2: rule__MulOrDiv__Group_1_0_1__1__Impl
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
    // InternalAdaptSem.g:6979:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6983:1: ( ( '/' ) )
            // InternalAdaptSem.g:6984:1: ( '/' )
            {
            // InternalAdaptSem.g:6984:1: ( '/' )
            // InternalAdaptSem.g:6985:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:6995:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:6999:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalAdaptSem.g:7000:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalAdaptSem.g:7007:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7011:1: ( ( '(' ) )
            // InternalAdaptSem.g:7012:1: ( '(' )
            {
            // InternalAdaptSem.g:7012:1: ( '(' )
            // InternalAdaptSem.g:7013:2: '('
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
    // InternalAdaptSem.g:7022:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7026:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalAdaptSem.g:7027:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalAdaptSem.g:7034:1: rule__Primary__Group_0__1__Impl : ( ruleExpr ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7038:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:7039:1: ( ruleExpr )
            {
            // InternalAdaptSem.g:7039:1: ( ruleExpr )
            // InternalAdaptSem.g:7040:2: ruleExpr
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
    // InternalAdaptSem.g:7049:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7053:1: ( rule__Primary__Group_0__2__Impl )
            // InternalAdaptSem.g:7054:2: rule__Primary__Group_0__2__Impl
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
    // InternalAdaptSem.g:7060:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7064:1: ( ( ')' ) )
            // InternalAdaptSem.g:7065:1: ( ')' )
            {
            // InternalAdaptSem.g:7065:1: ( ')' )
            // InternalAdaptSem.g:7066:2: ')'
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
    // InternalAdaptSem.g:7076:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7080:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalAdaptSem.g:7081:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptSem.g:7088:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7092:1: ( ( () ) )
            // InternalAdaptSem.g:7093:1: ( () )
            {
            // InternalAdaptSem.g:7093:1: ( () )
            // InternalAdaptSem.g:7094:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalAdaptSem.g:7095:2: ()
            // InternalAdaptSem.g:7095:3: 
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
    // InternalAdaptSem.g:7103:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7107:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalAdaptSem.g:7108:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalAdaptSem.g:7115:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7119:1: ( ( '!' ) )
            // InternalAdaptSem.g:7120:1: ( '!' )
            {
            // InternalAdaptSem.g:7120:1: ( '!' )
            // InternalAdaptSem.g:7121:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7130:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7134:1: ( rule__Primary__Group_1__2__Impl )
            // InternalAdaptSem.g:7135:2: rule__Primary__Group_1__2__Impl
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
    // InternalAdaptSem.g:7141:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExprAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7145:1: ( ( ( rule__Primary__ExprAssignment_1_2 ) ) )
            // InternalAdaptSem.g:7146:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            {
            // InternalAdaptSem.g:7146:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            // InternalAdaptSem.g:7147:2: ( rule__Primary__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_1_2()); 
            }
            // InternalAdaptSem.g:7148:2: ( rule__Primary__ExprAssignment_1_2 )
            // InternalAdaptSem.g:7148:3: rule__Primary__ExprAssignment_1_2
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
    // InternalAdaptSem.g:7157:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7161:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalAdaptSem.g:7162:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalAdaptSem.g:7169:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7173:1: ( ( () ) )
            // InternalAdaptSem.g:7174:1: ( () )
            {
            // InternalAdaptSem.g:7174:1: ( () )
            // InternalAdaptSem.g:7175:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getOppositeAction_2_0()); 
            }
            // InternalAdaptSem.g:7176:2: ()
            // InternalAdaptSem.g:7176:3: 
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
    // InternalAdaptSem.g:7184:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7188:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalAdaptSem.g:7189:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalAdaptSem.g:7196:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7200:1: ( ( '-' ) )
            // InternalAdaptSem.g:7201:1: ( '-' )
            {
            // InternalAdaptSem.g:7201:1: ( '-' )
            // InternalAdaptSem.g:7202:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7211:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7215:1: ( rule__Primary__Group_2__2__Impl )
            // InternalAdaptSem.g:7216:2: rule__Primary__Group_2__2__Impl
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
    // InternalAdaptSem.g:7222:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExprAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7226:1: ( ( ( rule__Primary__ExprAssignment_2_2 ) ) )
            // InternalAdaptSem.g:7227:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            {
            // InternalAdaptSem.g:7227:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            // InternalAdaptSem.g:7228:2: ( rule__Primary__ExprAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_2_2()); 
            }
            // InternalAdaptSem.g:7229:2: ( rule__Primary__ExprAssignment_2_2 )
            // InternalAdaptSem.g:7229:3: rule__Primary__ExprAssignment_2_2
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
    // InternalAdaptSem.g:7238:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7242:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalAdaptSem.g:7243:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
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
    // InternalAdaptSem.g:7250:1: rule__Primary__Group_3__0__Impl : ( () ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7254:1: ( ( () ) )
            // InternalAdaptSem.g:7255:1: ( () )
            {
            // InternalAdaptSem.g:7255:1: ( () )
            // InternalAdaptSem.g:7256:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getIsAction_3_0()); 
            }
            // InternalAdaptSem.g:7257:2: ()
            // InternalAdaptSem.g:7257:3: 
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
    // InternalAdaptSem.g:7265:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7269:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalAdaptSem.g:7270:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptSem.g:7277:1: rule__Primary__Group_3__1__Impl : ( ( rule__Primary__PatternAssignment_3_1 ) ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7281:1: ( ( ( rule__Primary__PatternAssignment_3_1 ) ) )
            // InternalAdaptSem.g:7282:1: ( ( rule__Primary__PatternAssignment_3_1 ) )
            {
            // InternalAdaptSem.g:7282:1: ( ( rule__Primary__PatternAssignment_3_1 ) )
            // InternalAdaptSem.g:7283:2: ( rule__Primary__PatternAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getPatternAssignment_3_1()); 
            }
            // InternalAdaptSem.g:7284:2: ( rule__Primary__PatternAssignment_3_1 )
            // InternalAdaptSem.g:7284:3: rule__Primary__PatternAssignment_3_1
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
    // InternalAdaptSem.g:7292:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7296:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalAdaptSem.g:7297:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
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
    // InternalAdaptSem.g:7304:1: rule__Primary__Group_3__2__Impl : ( 'match' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7308:1: ( ( 'match' ) )
            // InternalAdaptSem.g:7309:1: ( 'match' )
            {
            // InternalAdaptSem.g:7309:1: ( 'match' )
            // InternalAdaptSem.g:7310:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMatchKeyword_3_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7319:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7323:1: ( rule__Primary__Group_3__3__Impl )
            // InternalAdaptSem.g:7324:2: rule__Primary__Group_3__3__Impl
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
    // InternalAdaptSem.g:7330:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExprAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7334:1: ( ( ( rule__Primary__ExprAssignment_3_3 ) ) )
            // InternalAdaptSem.g:7335:1: ( ( rule__Primary__ExprAssignment_3_3 ) )
            {
            // InternalAdaptSem.g:7335:1: ( ( rule__Primary__ExprAssignment_3_3 ) )
            // InternalAdaptSem.g:7336:2: ( rule__Primary__ExprAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_3_3()); 
            }
            // InternalAdaptSem.g:7337:2: ( rule__Primary__ExprAssignment_3_3 )
            // InternalAdaptSem.g:7337:3: rule__Primary__ExprAssignment_3_3
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
    // InternalAdaptSem.g:7346:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7350:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalAdaptSem.g:7351:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalAdaptSem.g:7358:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7362:1: ( ( () ) )
            // InternalAdaptSem.g:7363:1: ( () )
            {
            // InternalAdaptSem.g:7363:1: ( () )
            // InternalAdaptSem.g:7364:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }
            // InternalAdaptSem.g:7365:2: ()
            // InternalAdaptSem.g:7365:3: 
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
    // InternalAdaptSem.g:7373:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7377:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalAdaptSem.g:7378:2: rule__Atomic__Group_0__1__Impl
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
    // InternalAdaptSem.g:7384:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7388:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalAdaptSem.g:7389:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalAdaptSem.g:7389:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalAdaptSem.g:7390:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalAdaptSem.g:7391:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalAdaptSem.g:7391:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalAdaptSem.g:7400:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7404:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalAdaptSem.g:7405:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalAdaptSem.g:7412:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7416:1: ( ( () ) )
            // InternalAdaptSem.g:7417:1: ( () )
            {
            // InternalAdaptSem.g:7417:1: ( () )
            // InternalAdaptSem.g:7418:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0()); 
            }
            // InternalAdaptSem.g:7419:2: ()
            // InternalAdaptSem.g:7419:3: 
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
    // InternalAdaptSem.g:7427:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7431:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalAdaptSem.g:7432:2: rule__Atomic__Group_1__1__Impl
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
    // InternalAdaptSem.g:7438:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7442:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalAdaptSem.g:7443:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalAdaptSem.g:7443:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalAdaptSem.g:7444:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalAdaptSem.g:7445:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalAdaptSem.g:7445:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalAdaptSem.g:7454:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7458:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalAdaptSem.g:7459:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalAdaptSem.g:7466:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7470:1: ( ( () ) )
            // InternalAdaptSem.g:7471:1: ( () )
            {
            // InternalAdaptSem.g:7471:1: ( () )
            // InternalAdaptSem.g:7472:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            }
            // InternalAdaptSem.g:7473:2: ()
            // InternalAdaptSem.g:7473:3: 
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
    // InternalAdaptSem.g:7481:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7485:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalAdaptSem.g:7486:2: rule__Atomic__Group_2__1__Impl
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
    // InternalAdaptSem.g:7492:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7496:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalAdaptSem.g:7497:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalAdaptSem.g:7497:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalAdaptSem.g:7498:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalAdaptSem.g:7499:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalAdaptSem.g:7499:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalAdaptSem.g:7508:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7512:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalAdaptSem.g:7513:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalAdaptSem.g:7520:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7524:1: ( ( () ) )
            // InternalAdaptSem.g:7525:1: ( () )
            {
            // InternalAdaptSem.g:7525:1: ( () )
            // InternalAdaptSem.g:7526:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }
            // InternalAdaptSem.g:7527:2: ()
            // InternalAdaptSem.g:7527:3: 
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
    // InternalAdaptSem.g:7535:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7539:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalAdaptSem.g:7540:2: rule__Atomic__Group_3__1__Impl
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
    // InternalAdaptSem.g:7546:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7550:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalAdaptSem.g:7551:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalAdaptSem.g:7551:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalAdaptSem.g:7552:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalAdaptSem.g:7553:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalAdaptSem.g:7553:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalAdaptSem.g:7562:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7566:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalAdaptSem.g:7567:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalAdaptSem.g:7574:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7578:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7579:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7579:1: ( RULE_ID )
            // InternalAdaptSem.g:7580:2: RULE_ID
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
    // InternalAdaptSem.g:7589:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7593:1: ( rule__FQN__Group__1__Impl )
            // InternalAdaptSem.g:7594:2: rule__FQN__Group__1__Impl
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
    // InternalAdaptSem.g:7600:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7604:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalAdaptSem.g:7605:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalAdaptSem.g:7605:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalAdaptSem.g:7606:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:7607:2: ( rule__FQN__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==28) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAdaptSem.g:7607:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalAdaptSem.g:7616:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7620:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalAdaptSem.g:7621:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalAdaptSem.g:7628:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7632:1: ( ( '.' ) )
            // InternalAdaptSem.g:7633:1: ( '.' )
            {
            // InternalAdaptSem.g:7633:1: ( '.' )
            // InternalAdaptSem.g:7634:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7643:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7647:1: ( rule__FQN__Group_1__1__Impl )
            // InternalAdaptSem.g:7648:2: rule__FQN__Group_1__1__Impl
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
    // InternalAdaptSem.g:7654:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7658:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7659:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7659:1: ( RULE_ID )
            // InternalAdaptSem.g:7660:2: RULE_ID
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
    // InternalAdaptSem.g:7670:1: rule__OperationFQN__Group__0 : rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 ;
    public final void rule__OperationFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7674:1: ( rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 )
            // InternalAdaptSem.g:7675:2: rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1
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
    // InternalAdaptSem.g:7682:1: rule__OperationFQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7686:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7687:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7687:1: ( RULE_ID )
            // InternalAdaptSem.g:7688:2: RULE_ID
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
    // InternalAdaptSem.g:7697:1: rule__OperationFQN__Group__1 : rule__OperationFQN__Group__1__Impl ;
    public final void rule__OperationFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7701:1: ( rule__OperationFQN__Group__1__Impl )
            // InternalAdaptSem.g:7702:2: rule__OperationFQN__Group__1__Impl
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
    // InternalAdaptSem.g:7708:1: rule__OperationFQN__Group__1__Impl : ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) ;
    public final void rule__OperationFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7712:1: ( ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) )
            // InternalAdaptSem.g:7713:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            {
            // InternalAdaptSem.g:7713:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            // InternalAdaptSem.g:7714:2: ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* )
            {
            // InternalAdaptSem.g:7714:2: ( ( rule__OperationFQN__Group_1__0 ) )
            // InternalAdaptSem.g:7715:3: ( rule__OperationFQN__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:7716:3: ( rule__OperationFQN__Group_1__0 )
            // InternalAdaptSem.g:7716:4: rule__OperationFQN__Group_1__0
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

            // InternalAdaptSem.g:7719:2: ( ( rule__OperationFQN__Group_1__0 )* )
            // InternalAdaptSem.g:7720:3: ( rule__OperationFQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalAdaptSem.g:7721:3: ( rule__OperationFQN__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==28) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAdaptSem.g:7721:4: rule__OperationFQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__OperationFQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalAdaptSem.g:7731:1: rule__OperationFQN__Group_1__0 : rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 ;
    public final void rule__OperationFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7735:1: ( rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 )
            // InternalAdaptSem.g:7736:2: rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1
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
    // InternalAdaptSem.g:7743:1: rule__OperationFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__OperationFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7747:1: ( ( '.' ) )
            // InternalAdaptSem.g:7748:1: ( '.' )
            {
            // InternalAdaptSem.g:7748:1: ( '.' )
            // InternalAdaptSem.g:7749:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:7758:1: rule__OperationFQN__Group_1__1 : rule__OperationFQN__Group_1__1__Impl ;
    public final void rule__OperationFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7762:1: ( rule__OperationFQN__Group_1__1__Impl )
            // InternalAdaptSem.g:7763:2: rule__OperationFQN__Group_1__1__Impl
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
    // InternalAdaptSem.g:7769:1: rule__OperationFQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7773:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7774:1: ( RULE_ID )
            {
            // InternalAdaptSem.g:7774:1: ( RULE_ID )
            // InternalAdaptSem.g:7775:2: RULE_ID
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
    // InternalAdaptSem.g:7785:1: rule__AdaptiveSemantics__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__AdaptiveSemantics__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7789:1: ( ( ruleModel ) )
            // InternalAdaptSem.g:7790:2: ( ruleModel )
            {
            // InternalAdaptSem.g:7790:2: ( ruleModel )
            // InternalAdaptSem.g:7791:3: ruleModel
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
    // InternalAdaptSem.g:7800:1: rule__AdaptiveSemantics__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__AdaptiveSemantics__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7804:1: ( ( ruleImport ) )
            // InternalAdaptSem.g:7805:2: ( ruleImport )
            {
            // InternalAdaptSem.g:7805:2: ( ruleImport )
            // InternalAdaptSem.g:7806:3: ruleImport
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
    // InternalAdaptSem.g:7815:1: rule__AdaptiveSemantics__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__AdaptiveSemantics__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7819:1: ( ( ruleRule ) )
            // InternalAdaptSem.g:7820:2: ( ruleRule )
            {
            // InternalAdaptSem.g:7820:2: ( ruleRule )
            // InternalAdaptSem.g:7821:3: ruleRule
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
    // InternalAdaptSem.g:7830:1: rule__Model__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7834:1: ( ( ruleEString ) )
            // InternalAdaptSem.g:7835:2: ( ruleEString )
            {
            // InternalAdaptSem.g:7835:2: ( ruleEString )
            // InternalAdaptSem.g:7836:3: ruleEString
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
    // InternalAdaptSem.g:7845:1: rule__Model__SemanticdomainAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Model__SemanticdomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7849:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:7850:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:7850:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:7851:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0()); 
            }
            // InternalAdaptSem.g:7852:3: ( ruleFQN )
            // InternalAdaptSem.g:7853:4: ruleFQN
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
    // InternalAdaptSem.g:7864:1: rule__Import__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7868:1: ( ( ruleEString ) )
            // InternalAdaptSem.g:7869:2: ( ruleEString )
            {
            // InternalAdaptSem.g:7869:2: ( ruleEString )
            // InternalAdaptSem.g:7870:3: ruleEString
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
    // InternalAdaptSem.g:7879:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7883:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7884:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7884:2: ( RULE_ID )
            // InternalAdaptSem.g:7885:3: RULE_ID
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
    // InternalAdaptSem.g:7894:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7898:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:7899:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:7899:2: ( RULE_ID )
            // InternalAdaptSem.g:7900:3: RULE_ID
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
    // InternalAdaptSem.g:7909:1: rule__Rule__ConclusionAssignment_3 : ( ruleConclusion ) ;
    public final void rule__Rule__ConclusionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7913:1: ( ( ruleConclusion ) )
            // InternalAdaptSem.g:7914:2: ( ruleConclusion )
            {
            // InternalAdaptSem.g:7914:2: ( ruleConclusion )
            // InternalAdaptSem.g:7915:3: ruleConclusion
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
    // InternalAdaptSem.g:7924:1: rule__Rule__ConditionsAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7928:1: ( ( ruleCondition ) )
            // InternalAdaptSem.g:7929:2: ( ruleCondition )
            {
            // InternalAdaptSem.g:7929:2: ( ruleCondition )
            // InternalAdaptSem.g:7930:3: ruleCondition
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
    // InternalAdaptSem.g:7939:1: rule__Rule__ConditionsAssignment_4_2_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7943:1: ( ( ruleCondition ) )
            // InternalAdaptSem.g:7944:2: ( ruleCondition )
            {
            // InternalAdaptSem.g:7944:2: ( ruleCondition )
            // InternalAdaptSem.g:7945:3: ruleCondition
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
    // InternalAdaptSem.g:7954:1: rule__Rule__PremisesAssignment_5_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7958:1: ( ( rulePremise ) )
            // InternalAdaptSem.g:7959:2: ( rulePremise )
            {
            // InternalAdaptSem.g:7959:2: ( rulePremise )
            // InternalAdaptSem.g:7960:3: rulePremise
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
    // InternalAdaptSem.g:7969:1: rule__Rule__PremisesAssignment_5_2_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7973:1: ( ( rulePremise ) )
            // InternalAdaptSem.g:7974:2: ( rulePremise )
            {
            // InternalAdaptSem.g:7974:2: ( rulePremise )
            // InternalAdaptSem.g:7975:3: rulePremise
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
    // InternalAdaptSem.g:7984:1: rule__Rule__BindingsAssignment_6_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:7988:1: ( ( ruleBinding ) )
            // InternalAdaptSem.g:7989:2: ( ruleBinding )
            {
            // InternalAdaptSem.g:7989:2: ( ruleBinding )
            // InternalAdaptSem.g:7990:3: ruleBinding
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
    // InternalAdaptSem.g:7999:1: rule__Rule__BindingsAssignment_6_2_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8003:1: ( ( ruleBinding ) )
            // InternalAdaptSem.g:8004:2: ( ruleBinding )
            {
            // InternalAdaptSem.g:8004:2: ( ruleBinding )
            // InternalAdaptSem.g:8005:3: ruleBinding
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
    // InternalAdaptSem.g:8014:1: rule__Rule__InputsAssignment_7_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8018:1: ( ( ruleInput ) )
            // InternalAdaptSem.g:8019:2: ( ruleInput )
            {
            // InternalAdaptSem.g:8019:2: ( ruleInput )
            // InternalAdaptSem.g:8020:3: ruleInput
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
    // InternalAdaptSem.g:8029:1: rule__Rule__OutputsAssignment_7_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8033:1: ( ( ruleOutput ) )
            // InternalAdaptSem.g:8034:2: ( ruleOutput )
            {
            // InternalAdaptSem.g:8034:2: ( ruleOutput )
            // InternalAdaptSem.g:8035:3: ruleOutput
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
    // InternalAdaptSem.g:8044:1: rule__Rule__InputsAssignment_7_2_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8048:1: ( ( ruleInput ) )
            // InternalAdaptSem.g:8049:2: ( ruleInput )
            {
            // InternalAdaptSem.g:8049:2: ( ruleInput )
            // InternalAdaptSem.g:8050:3: ruleInput
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
    // InternalAdaptSem.g:8059:1: rule__Rule__OutputsAssignment_7_2_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8063:1: ( ( ruleOutput ) )
            // InternalAdaptSem.g:8064:2: ( ruleOutput )
            {
            // InternalAdaptSem.g:8064:2: ( ruleOutput )
            // InternalAdaptSem.g:8065:3: ruleOutput
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
    // InternalAdaptSem.g:8074:1: rule__Condition__CondAssignment_1 : ( ruleCondExpr ) ;
    public final void rule__Condition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8078:1: ( ( ruleCondExpr ) )
            // InternalAdaptSem.g:8079:2: ( ruleCondExpr )
            {
            // InternalAdaptSem.g:8079:2: ( ruleCondExpr )
            // InternalAdaptSem.g:8080:3: ruleCondExpr
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
    // InternalAdaptSem.g:8089:1: rule__Input__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Input__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8093:1: ( ( ruleAssignee ) )
            // InternalAdaptSem.g:8094:2: ( ruleAssignee )
            {
            // InternalAdaptSem.g:8094:2: ( ruleAssignee )
            // InternalAdaptSem.g:8095:3: ruleAssignee
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
    // InternalAdaptSem.g:8104:1: rule__Input__OperationAssignment_2 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Input__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8108:1: ( ( ( ruleOperationFQN ) ) )
            // InternalAdaptSem.g:8109:2: ( ( ruleOperationFQN ) )
            {
            // InternalAdaptSem.g:8109:2: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:8110:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0()); 
            }
            // InternalAdaptSem.g:8111:3: ( ruleOperationFQN )
            // InternalAdaptSem.g:8112:4: ruleOperationFQN
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


    // $ANTLR start "rule__Input__ArgsAssignment_4_0"
    // InternalAdaptSem.g:8123:1: rule__Input__ArgsAssignment_4_0 : ( ruleTermRef ) ;
    public final void rule__Input__ArgsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8127:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:8128:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:8128:2: ( ruleTermRef )
            // InternalAdaptSem.g:8129:3: ruleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getArgsTermRefParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getArgsTermRefParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ArgsAssignment_4_0"


    // $ANTLR start "rule__Input__ArgsAssignment_4_1_1"
    // InternalAdaptSem.g:8138:1: rule__Input__ArgsAssignment_4_1_1 : ( ruleTermRef ) ;
    public final void rule__Input__ArgsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8142:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:8143:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:8143:2: ( ruleTermRef )
            // InternalAdaptSem.g:8144:3: ruleTermRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getArgsTermRefParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getArgsTermRefParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ArgsAssignment_4_1_1"


    // $ANTLR start "rule__Input__TargetAssignment_6_1"
    // InternalAdaptSem.g:8153:1: rule__Input__TargetAssignment_6_1 : ( ( rule__Input__TargetAlternatives_6_1_0 ) ) ;
    public final void rule__Input__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8157:1: ( ( ( rule__Input__TargetAlternatives_6_1_0 ) ) )
            // InternalAdaptSem.g:8158:2: ( ( rule__Input__TargetAlternatives_6_1_0 ) )
            {
            // InternalAdaptSem.g:8158:2: ( ( rule__Input__TargetAlternatives_6_1_0 ) )
            // InternalAdaptSem.g:8159:3: ( rule__Input__TargetAlternatives_6_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTargetAlternatives_6_1_0()); 
            }
            // InternalAdaptSem.g:8160:3: ( rule__Input__TargetAlternatives_6_1_0 )
            // InternalAdaptSem.g:8160:4: rule__Input__TargetAlternatives_6_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__TargetAlternatives_6_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTargetAlternatives_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TargetAssignment_6_1"


    // $ANTLR start "rule__Output__OperationAssignment_0"
    // InternalAdaptSem.g:8168:1: rule__Output__OperationAssignment_0 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Output__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8172:1: ( ( ( ruleOperationFQN ) ) )
            // InternalAdaptSem.g:8173:2: ( ( ruleOperationFQN ) )
            {
            // InternalAdaptSem.g:8173:2: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:8174:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:8175:3: ( ruleOperationFQN )
            // InternalAdaptSem.g:8176:4: ruleOperationFQN
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
    // InternalAdaptSem.g:8187:1: rule__Output__ArgsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8191:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:8192:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:8192:2: ( ruleTermRef )
            // InternalAdaptSem.g:8193:3: ruleTermRef
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
    // InternalAdaptSem.g:8202:1: rule__Output__ArgsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8206:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:8207:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:8207:2: ( ruleTermRef )
            // InternalAdaptSem.g:8208:3: ruleTermRef
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


    // $ANTLR start "rule__Output__TargetAssignment_4_1"
    // InternalAdaptSem.g:8217:1: rule__Output__TargetAssignment_4_1 : ( ( rule__Output__TargetAlternatives_4_1_0 ) ) ;
    public final void rule__Output__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8221:1: ( ( ( rule__Output__TargetAlternatives_4_1_0 ) ) )
            // InternalAdaptSem.g:8222:2: ( ( rule__Output__TargetAlternatives_4_1_0 ) )
            {
            // InternalAdaptSem.g:8222:2: ( ( rule__Output__TargetAlternatives_4_1_0 ) )
            // InternalAdaptSem.g:8223:3: ( rule__Output__TargetAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getTargetAlternatives_4_1_0()); 
            }
            // InternalAdaptSem.g:8224:3: ( rule__Output__TargetAlternatives_4_1_0 )
            // InternalAdaptSem.g:8224:4: rule__Output__TargetAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__TargetAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getTargetAlternatives_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__TargetAssignment_4_1"


    // $ANTLR start "rule__Binding__AssigneeAssignment_0"
    // InternalAdaptSem.g:8232:1: rule__Binding__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Binding__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8236:1: ( ( ruleAssignee ) )
            // InternalAdaptSem.g:8237:2: ( ruleAssignee )
            {
            // InternalAdaptSem.g:8237:2: ( ruleAssignee )
            // InternalAdaptSem.g:8238:3: ruleAssignee
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
    // InternalAdaptSem.g:8247:1: rule__Binding__ExprAssignment_2 : ( ruleAssignable ) ;
    public final void rule__Binding__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8251:1: ( ( ruleAssignable ) )
            // InternalAdaptSem.g:8252:2: ( ruleAssignable )
            {
            // InternalAdaptSem.g:8252:2: ( ruleAssignable )
            // InternalAdaptSem.g:8253:3: ruleAssignable
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
    // InternalAdaptSem.g:8262:1: rule__SemanticDomainAccess__RecieverAssignment_0 : ( ruleTerminalAccessExpression ) ;
    public final void rule__SemanticDomainAccess__RecieverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8266:1: ( ( ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:8267:2: ( ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:8267:2: ( ruleTerminalAccessExpression )
            // InternalAdaptSem.g:8268:3: ruleTerminalAccessExpression
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
    // InternalAdaptSem.g:8277:1: rule__SemanticDomainAccess__FieldAssignment_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8281:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:8282:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:8282:2: ( RULE_ID )
            // InternalAdaptSem.g:8283:3: RULE_ID
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
    // InternalAdaptSem.g:8292:1: rule__SemanticDomainAccess__FieldAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8296:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:8297:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:8297:2: ( RULE_ID )
            // InternalAdaptSem.g:8298:3: RULE_ID
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
    // InternalAdaptSem.g:8307:1: rule__Conclusion__FromAssignment_0 : ( ruleDefConfiguration ) ;
    public final void rule__Conclusion__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8311:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:8312:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:8312:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:8313:3: ruleDefConfiguration
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
    // InternalAdaptSem.g:8322:1: rule__Conclusion__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Conclusion__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8326:1: ( ( ( 'termination' ) ) )
            // InternalAdaptSem.g:8327:2: ( ( 'termination' ) )
            {
            // InternalAdaptSem.g:8327:2: ( ( 'termination' ) )
            // InternalAdaptSem.g:8328:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalAdaptSem.g:8329:3: ( 'termination' )
            // InternalAdaptSem.g:8330:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:8341:1: rule__Conclusion__ToAssignment_3 : ( ruleSingleTermRef ) ;
    public final void rule__Conclusion__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8345:1: ( ( ruleSingleTermRef ) )
            // InternalAdaptSem.g:8346:2: ( ruleSingleTermRef )
            {
            // InternalAdaptSem.g:8346:2: ( ruleSingleTermRef )
            // InternalAdaptSem.g:8347:3: ruleSingleTermRef
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
    // InternalAdaptSem.g:8356:1: rule__Premise__FromAssignment_0 : ( ruleSymbolRef ) ;
    public final void rule__Premise__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8360:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:8361:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:8361:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:8362:3: ruleSymbolRef
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
    // InternalAdaptSem.g:8371:1: rule__Premise__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Premise__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8375:1: ( ( ( 'termination' ) ) )
            // InternalAdaptSem.g:8376:2: ( ( 'termination' ) )
            {
            // InternalAdaptSem.g:8376:2: ( ( 'termination' ) )
            // InternalAdaptSem.g:8377:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalAdaptSem.g:8378:3: ( 'termination' )
            // InternalAdaptSem.g:8379:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAdaptSem.g:8390:1: rule__Premise__ToAssignment_3 : ( ruleSingleTermDef ) ;
    public final void rule__Premise__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8394:1: ( ( ruleSingleTermDef ) )
            // InternalAdaptSem.g:8395:2: ( ruleSingleTermDef )
            {
            // InternalAdaptSem.g:8395:2: ( ruleSingleTermDef )
            // InternalAdaptSem.g:8396:3: ruleSingleTermDef
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
    // InternalAdaptSem.g:8405:1: rule__DefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__DefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8409:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:8410:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:8410:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:8411:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:8412:3: ( ruleFQN )
            // InternalAdaptSem.g:8413:4: ruleFQN
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
    // InternalAdaptSem.g:8424:1: rule__DefConfiguration__ChildsAssignment_2_0 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8428:1: ( ( ruleTermDef ) )
            // InternalAdaptSem.g:8429:2: ( ruleTermDef )
            {
            // InternalAdaptSem.g:8429:2: ( ruleTermDef )
            // InternalAdaptSem.g:8430:3: ruleTermDef
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
    // InternalAdaptSem.g:8439:1: rule__DefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8443:1: ( ( ruleTermDef ) )
            // InternalAdaptSem.g:8444:2: ( ruleTermDef )
            {
            // InternalAdaptSem.g:8444:2: ( ruleTermDef )
            // InternalAdaptSem.g:8445:3: ruleTermDef
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


    // $ANTLR start "rule__DefConfiguration__SymbolAssignment_4_1"
    // InternalAdaptSem.g:8454:1: rule__DefConfiguration__SymbolAssignment_4_1 : ( ruleSymbolDef ) ;
    public final void rule__DefConfiguration__SymbolAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8458:1: ( ( ruleSymbolDef ) )
            // InternalAdaptSem.g:8459:2: ( ruleSymbolDef )
            {
            // InternalAdaptSem.g:8459:2: ( ruleSymbolDef )
            // InternalAdaptSem.g:8460:3: ruleSymbolDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getSymbolSymbolDefParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSymbolDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefConfigurationAccess().getSymbolSymbolDefParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefConfiguration__SymbolAssignment_4_1"


    // $ANTLR start "rule__RefConfiguration__ConceptAssignment_0"
    // InternalAdaptSem.g:8469:1: rule__RefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__RefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8473:1: ( ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:8474:2: ( ( ruleFQN ) )
            {
            // InternalAdaptSem.g:8474:2: ( ( ruleFQN ) )
            // InternalAdaptSem.g:8475:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalAdaptSem.g:8476:3: ( ruleFQN )
            // InternalAdaptSem.g:8477:4: ruleFQN
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
    // InternalAdaptSem.g:8488:1: rule__RefConfiguration__ChildsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8492:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:8493:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:8493:2: ( ruleTermRef )
            // InternalAdaptSem.g:8494:3: ruleTermRef
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
    // InternalAdaptSem.g:8503:1: rule__RefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8507:1: ( ( ruleTermRef ) )
            // InternalAdaptSem.g:8508:2: ( ruleTermRef )
            {
            // InternalAdaptSem.g:8508:2: ( ruleTermRef )
            // InternalAdaptSem.g:8509:3: ruleTermRef
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
    // InternalAdaptSem.g:8518:1: rule__SymbolDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8522:1: ( ( RULE_ID ) )
            // InternalAdaptSem.g:8523:2: ( RULE_ID )
            {
            // InternalAdaptSem.g:8523:2: ( RULE_ID )
            // InternalAdaptSem.g:8524:3: RULE_ID
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
    // InternalAdaptSem.g:8533:1: rule__SymbolRef__DefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8537:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptSem.g:8538:2: ( ( RULE_ID ) )
            {
            // InternalAdaptSem.g:8538:2: ( ( RULE_ID ) )
            // InternalAdaptSem.g:8539:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0()); 
            }
            // InternalAdaptSem.g:8540:3: ( RULE_ID )
            // InternalAdaptSem.g:8541:4: RULE_ID
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
    // InternalAdaptSem.g:8552:1: rule__ListDef__HeadAssignment_1 : ( ruleSingleTermDef ) ;
    public final void rule__ListDef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8556:1: ( ( ruleSingleTermDef ) )
            // InternalAdaptSem.g:8557:2: ( ruleSingleTermDef )
            {
            // InternalAdaptSem.g:8557:2: ( ruleSingleTermDef )
            // InternalAdaptSem.g:8558:3: ruleSingleTermDef
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
    // InternalAdaptSem.g:8567:1: rule__ListDef__TailAssignment_3 : ( ruleSymbolDef ) ;
    public final void rule__ListDef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8571:1: ( ( ruleSymbolDef ) )
            // InternalAdaptSem.g:8572:2: ( ruleSymbolDef )
            {
            // InternalAdaptSem.g:8572:2: ( ruleSymbolDef )
            // InternalAdaptSem.g:8573:3: ruleSymbolDef
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


    // $ANTLR start "rule__ListDef__SymbolAssignment_5_1"
    // InternalAdaptSem.g:8582:1: rule__ListDef__SymbolAssignment_5_1 : ( ruleSymbolDef ) ;
    public final void rule__ListDef__SymbolAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8586:1: ( ( ruleSymbolDef ) )
            // InternalAdaptSem.g:8587:2: ( ruleSymbolDef )
            {
            // InternalAdaptSem.g:8587:2: ( ruleSymbolDef )
            // InternalAdaptSem.g:8588:3: ruleSymbolDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getSymbolSymbolDefParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSymbolDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListDefAccess().getSymbolSymbolDefParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListDef__SymbolAssignment_5_1"


    // $ANTLR start "rule__ListRef__HeadAssignment_1"
    // InternalAdaptSem.g:8597:1: rule__ListRef__HeadAssignment_1 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8601:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:8602:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:8602:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:8603:3: ruleSymbolRef
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
    // InternalAdaptSem.g:8612:1: rule__ListRef__TailAssignment_3 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8616:1: ( ( ruleSymbolRef ) )
            // InternalAdaptSem.g:8617:2: ( ruleSymbolRef )
            {
            // InternalAdaptSem.g:8617:2: ( ruleSymbolRef )
            // InternalAdaptSem.g:8618:3: ruleSymbolRef
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
    // InternalAdaptSem.g:8627:1: rule__CondNot__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__CondNot__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8631:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:8632:2: ( ruleExpr )
            {
            // InternalAdaptSem.g:8632:2: ( ruleExpr )
            // InternalAdaptSem.g:8633:3: ruleExpr
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
    // InternalAdaptSem.g:8642:1: rule__CondOr__LhsAssignment_1 : ( ruleAnd ) ;
    public final void rule__CondOr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8646:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:8647:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:8647:2: ( ruleAnd )
            // InternalAdaptSem.g:8648:3: ruleAnd
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
    // InternalAdaptSem.g:8657:1: rule__CondOr__RhsAssignment_3 : ( ruleAnd ) ;
    public final void rule__CondOr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8661:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:8662:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:8662:2: ( ruleAnd )
            // InternalAdaptSem.g:8663:3: ruleAnd
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
    // InternalAdaptSem.g:8672:1: rule__CondAnd__LhsAssignment_1 : ( ruleEquality ) ;
    public final void rule__CondAnd__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8676:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:8677:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:8677:2: ( ruleEquality )
            // InternalAdaptSem.g:8678:3: ruleEquality
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
    // InternalAdaptSem.g:8687:1: rule__CondAnd__RhsAssignment_3 : ( ruleEquality ) ;
    public final void rule__CondAnd__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8691:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:8692:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:8692:2: ( ruleEquality )
            // InternalAdaptSem.g:8693:3: ruleEquality
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
    // InternalAdaptSem.g:8702:1: rule__CondEquality__LhsAssignment_0_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8706:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8707:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8707:2: ( ruleComparison )
            // InternalAdaptSem.g:8708:3: ruleComparison
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
    // InternalAdaptSem.g:8717:1: rule__CondEquality__RhsAssignment_0_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8721:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8722:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8722:2: ( ruleComparison )
            // InternalAdaptSem.g:8723:3: ruleComparison
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
    // InternalAdaptSem.g:8732:1: rule__CondEquality__LhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8736:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8737:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8737:2: ( ruleComparison )
            // InternalAdaptSem.g:8738:3: ruleComparison
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
    // InternalAdaptSem.g:8747:1: rule__CondEquality__RhsAssignment_1_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8751:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8752:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8752:2: ( ruleComparison )
            // InternalAdaptSem.g:8753:3: ruleComparison
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
    // InternalAdaptSem.g:8762:1: rule__CondComparison__LhsAssignment_0_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8766:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8767:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8767:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8768:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:8777:1: rule__CondComparison__RhsAssignment_0_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8781:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8782:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8782:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8783:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:8792:1: rule__CondComparison__LhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8796:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8797:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8797:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8798:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:8807:1: rule__CondComparison__RhsAssignment_1_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8811:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8812:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8812:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8813:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:8822:1: rule__CondIs__PatternAssignment_1 : ( ruleDefConfiguration ) ;
    public final void rule__CondIs__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8826:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:8827:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:8827:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:8828:3: ruleDefConfiguration
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
    // InternalAdaptSem.g:8837:1: rule__CondIs__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__CondIs__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8841:1: ( ( ruleExpr ) )
            // InternalAdaptSem.g:8842:2: ( ruleExpr )
            {
            // InternalAdaptSem.g:8842:2: ( ruleExpr )
            // InternalAdaptSem.g:8843:3: ruleExpr
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
    // InternalAdaptSem.g:8852:1: rule__Or__RhsAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8856:1: ( ( ruleAnd ) )
            // InternalAdaptSem.g:8857:2: ( ruleAnd )
            {
            // InternalAdaptSem.g:8857:2: ( ruleAnd )
            // InternalAdaptSem.g:8858:3: ruleAnd
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
    // InternalAdaptSem.g:8867:1: rule__And__RhsAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8871:1: ( ( ruleEquality ) )
            // InternalAdaptSem.g:8872:2: ( ruleEquality )
            {
            // InternalAdaptSem.g:8872:2: ( ruleEquality )
            // InternalAdaptSem.g:8873:3: ruleEquality
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
    // InternalAdaptSem.g:8882:1: rule__Equality__RhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8886:1: ( ( ruleComparison ) )
            // InternalAdaptSem.g:8887:2: ( ruleComparison )
            {
            // InternalAdaptSem.g:8887:2: ( ruleComparison )
            // InternalAdaptSem.g:8888:3: ruleComparison
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
    // InternalAdaptSem.g:8897:1: rule__Comparison__RhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8901:1: ( ( rulePlusOrMinus ) )
            // InternalAdaptSem.g:8902:2: ( rulePlusOrMinus )
            {
            // InternalAdaptSem.g:8902:2: ( rulePlusOrMinus )
            // InternalAdaptSem.g:8903:3: rulePlusOrMinus
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
    // InternalAdaptSem.g:8912:1: rule__PlusOrMinus__RhsAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8916:1: ( ( ruleMulOrDiv ) )
            // InternalAdaptSem.g:8917:2: ( ruleMulOrDiv )
            {
            // InternalAdaptSem.g:8917:2: ( ruleMulOrDiv )
            // InternalAdaptSem.g:8918:3: ruleMulOrDiv
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
    // InternalAdaptSem.g:8927:1: rule__MulOrDiv__RhsAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8931:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8932:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8932:2: ( rulePrimary )
            // InternalAdaptSem.g:8933:3: rulePrimary
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
    // InternalAdaptSem.g:8942:1: rule__Primary__ExprAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8946:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8947:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8947:2: ( rulePrimary )
            // InternalAdaptSem.g:8948:3: rulePrimary
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
    // InternalAdaptSem.g:8957:1: rule__Primary__ExprAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8961:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8962:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8962:2: ( rulePrimary )
            // InternalAdaptSem.g:8963:3: rulePrimary
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
    // InternalAdaptSem.g:8972:1: rule__Primary__PatternAssignment_3_1 : ( ruleDefConfiguration ) ;
    public final void rule__Primary__PatternAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8976:1: ( ( ruleDefConfiguration ) )
            // InternalAdaptSem.g:8977:2: ( ruleDefConfiguration )
            {
            // InternalAdaptSem.g:8977:2: ( ruleDefConfiguration )
            // InternalAdaptSem.g:8978:3: ruleDefConfiguration
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
    // InternalAdaptSem.g:8987:1: rule__Primary__ExprAssignment_3_3 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:8991:1: ( ( rulePrimary ) )
            // InternalAdaptSem.g:8992:2: ( rulePrimary )
            {
            // InternalAdaptSem.g:8992:2: ( rulePrimary )
            // InternalAdaptSem.g:8993:3: rulePrimary
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
    // InternalAdaptSem.g:9002:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:9006:1: ( ( RULE_INT ) )
            // InternalAdaptSem.g:9007:2: ( RULE_INT )
            {
            // InternalAdaptSem.g:9007:2: ( RULE_INT )
            // InternalAdaptSem.g:9008:3: RULE_INT
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
    // InternalAdaptSem.g:9017:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:9021:1: ( ( RULE_DOUBLE ) )
            // InternalAdaptSem.g:9022:2: ( RULE_DOUBLE )
            {
            // InternalAdaptSem.g:9022:2: ( RULE_DOUBLE )
            // InternalAdaptSem.g:9023:3: RULE_DOUBLE
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
    // InternalAdaptSem.g:9032:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:9036:1: ( ( RULE_STRING ) )
            // InternalAdaptSem.g:9037:2: ( RULE_STRING )
            {
            // InternalAdaptSem.g:9037:2: ( RULE_STRING )
            // InternalAdaptSem.g:9038:3: RULE_STRING
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
    // InternalAdaptSem.g:9047:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptSem.g:9051:1: ( ( RULE_BOOL ) )
            // InternalAdaptSem.g:9052:2: ( RULE_BOOL )
            {
            // InternalAdaptSem.g:9052:2: ( RULE_BOOL )
            // InternalAdaptSem.g:9053:3: RULE_BOOL
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

    // $ANTLR start synpred5_InternalAdaptSem
    public final void synpred5_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1267:2: ( ( ruleExpr ) )
        // InternalAdaptSem.g:1267:2: ( ruleExpr )
        {
        // InternalAdaptSem.g:1267:2: ( ruleExpr )
        // InternalAdaptSem.g:1268:3: ruleExpr
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
    // $ANTLR end synpred5_InternalAdaptSem

    // $ANTLR start synpred6_InternalAdaptSem
    public final void synpred6_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1273:2: ( ( ruleRefConfiguration ) )
        // InternalAdaptSem.g:1273:2: ( ruleRefConfiguration )
        {
        // InternalAdaptSem.g:1273:2: ( ruleRefConfiguration )
        // InternalAdaptSem.g:1274:3: ruleRefConfiguration
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
    // $ANTLR end synpred6_InternalAdaptSem

    // $ANTLR start synpred15_InternalAdaptSem
    public final void synpred15_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1432:2: ( ( ruleCondOr ) )
        // InternalAdaptSem.g:1432:2: ( ruleCondOr )
        {
        // InternalAdaptSem.g:1432:2: ( ruleCondOr )
        // InternalAdaptSem.g:1433:3: ruleCondOr
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
    // $ANTLR end synpred15_InternalAdaptSem

    // $ANTLR start synpred16_InternalAdaptSem
    public final void synpred16_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1438:2: ( ( ruleCondAnd ) )
        // InternalAdaptSem.g:1438:2: ( ruleCondAnd )
        {
        // InternalAdaptSem.g:1438:2: ( ruleCondAnd )
        // InternalAdaptSem.g:1439:3: ruleCondAnd
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
    // $ANTLR end synpred16_InternalAdaptSem

    // $ANTLR start synpred17_InternalAdaptSem
    public final void synpred17_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1444:2: ( ( ruleCondEquality ) )
        // InternalAdaptSem.g:1444:2: ( ruleCondEquality )
        {
        // InternalAdaptSem.g:1444:2: ( ruleCondEquality )
        // InternalAdaptSem.g:1445:3: ruleCondEquality
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
    // $ANTLR end synpred17_InternalAdaptSem

    // $ANTLR start synpred18_InternalAdaptSem
    public final void synpred18_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1450:2: ( ( ruleCondComparison ) )
        // InternalAdaptSem.g:1450:2: ( ruleCondComparison )
        {
        // InternalAdaptSem.g:1450:2: ( ruleCondComparison )
        // InternalAdaptSem.g:1451:3: ruleCondComparison
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
    // $ANTLR end synpred18_InternalAdaptSem

    // $ANTLR start synpred19_InternalAdaptSem
    public final void synpred19_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1456:2: ( ( ruleCondNot ) )
        // InternalAdaptSem.g:1456:2: ( ruleCondNot )
        {
        // InternalAdaptSem.g:1456:2: ( ruleCondNot )
        // InternalAdaptSem.g:1457:3: ruleCondNot
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
    // $ANTLR end synpred19_InternalAdaptSem

    // $ANTLR start synpred20_InternalAdaptSem
    public final void synpred20_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1477:2: ( ( ( rule__CondEquality__Group_0__0 ) ) )
        // InternalAdaptSem.g:1477:2: ( ( rule__CondEquality__Group_0__0 ) )
        {
        // InternalAdaptSem.g:1477:2: ( ( rule__CondEquality__Group_0__0 ) )
        // InternalAdaptSem.g:1478:3: ( rule__CondEquality__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
        }
        // InternalAdaptSem.g:1479:3: ( rule__CondEquality__Group_0__0 )
        // InternalAdaptSem.g:1479:4: rule__CondEquality__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondEquality__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalAdaptSem

    // $ANTLR start synpred21_InternalAdaptSem
    public final void synpred21_InternalAdaptSem_fragment() throws RecognitionException {   
        // InternalAdaptSem.g:1498:2: ( ( ( rule__CondComparison__Group_0__0 ) ) )
        // InternalAdaptSem.g:1498:2: ( ( rule__CondComparison__Group_0__0 ) )
        {
        // InternalAdaptSem.g:1498:2: ( ( rule__CondComparison__Group_0__0 ) )
        // InternalAdaptSem.g:1499:3: ( rule__CondComparison__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
        }
        // InternalAdaptSem.g:1500:3: ( rule__CondComparison__Group_0__0 )
        // InternalAdaptSem.g:1500:4: rule__CondComparison__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondComparison__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalAdaptSem

    // Delegated rules

    public final boolean synpred5_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred21_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalAdaptSem_fragment(); // can never throw exception
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
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\30\1\uffff\1\5\1\30\1\5\1\uffff\1\30";
    static final String dfa_3s = "\1\35\1\34\1\uffff\1\5\1\34\1\5\1\uffff\1\34";
    static final String dfa_4s = "\2\uffff\1\1\3\uffff\1\2\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\27\uffff\1\2",
            "\1\2\3\uffff\1\3",
            "",
            "\1\4",
            "\1\2\1\6\2\uffff\1\5",
            "\1\7",
            "",
            "\1\2\1\6\2\uffff\1\5"
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
    static final String dfa_9s = "\1\55\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String dfa_11s = "\4\uffff\1\0\4\uffff\1\1\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\4\3\1\20\uffff\1\1\3\uffff\1\11\6\uffff\1\1\10\uffff\1\1",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1262:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalAdaptSem()) ) {s = 1;}

                        else if ( (synpred6_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_9 = input.LA(1);

                         
                        int index5_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalAdaptSem()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\4\11\0\6\uffff";
    static final String dfa_15s = "\1\55\11\0\6\uffff";
    static final String dfa_16s = "\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] dfa_18s = {
            "\1\7\1\4\1\5\1\6\1\10\20\uffff\1\1\3\uffff\1\11\6\uffff\1\2\10\uffff\1\3",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1427:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) );";
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
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                        else if ( (synpred19_InternalAdaptSem()) ) {s = 14;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred16_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred17_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred18_InternalAdaptSem()) ) {s = 13;}

                         
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
    static final String dfa_19s = "\1\4\11\0\2\uffff";
    static final String dfa_20s = "\1\55\11\0\2\uffff";
    static final String dfa_21s = "\12\uffff\1\1\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_23s = {
            "\1\7\1\4\1\5\1\6\1\10\20\uffff\1\1\3\uffff\1\11\6\uffff\1\2\10\uffff\1\3",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1472:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1493:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_24s = "\13\uffff";
    static final String dfa_25s = "\4\uffff\1\5\3\uffff\1\5\1\uffff\1\5";
    static final String dfa_26s = "\1\4\3\uffff\1\21\1\uffff\1\5\1\uffff\1\21\1\5\1\21";
    static final String dfa_27s = "\1\55\3\uffff\1\57\1\uffff\1\5\1\uffff\1\57\1\5\1\57";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\4\3\uffff";
    static final String dfa_29s = "\13\uffff}>";
    static final String[] dfa_30s = {
            "\1\5\1\4\3\5\20\uffff\1\1\3\uffff\1\5\6\uffff\1\2\10\uffff\1\3",
            "",
            "",
            "",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\uffff\1\6\10\uffff\6\5\1\uffff\4\5",
            "",
            "\1\10",
            "",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\uffff\1\11\10\uffff\6\5\1\uffff\4\5",
            "\1\12",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\uffff\1\11\10\uffff\6\5\1\uffff\4\5"
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1598:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );";
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00002010220001F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000904000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000900000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000904000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000900000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000100L});

}