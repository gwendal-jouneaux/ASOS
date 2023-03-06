package fr.irisa.diverse.semanticadaptation.ide.contentassist.antlr.internal;

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
import fr.irisa.diverse.semanticadaptation.services.SemAdaptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSemAdaptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'semantics'", "'{'", "'}'", "'match'", "'where'", "','", "'Specialization'", "'Before'", "'After'", "'model'", "'with'", "'import'", "'as'", "'rule'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'.'", "'self'", "'->'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'recursive'", "'termination'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    public static final int T__49=49;
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


        public InternalSemAdaptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemAdaptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemAdaptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSemAdapt.g"; }


    	private SemAdaptGrammarAccess grammarAccess;

    	public void setGrammarAccess(SemAdaptGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSemanticAdaptation"
    // InternalSemAdapt.g:54:1: entryRuleSemanticAdaptation : ruleSemanticAdaptation EOF ;
    public final void entryRuleSemanticAdaptation() throws RecognitionException {
        try {
            // InternalSemAdapt.g:55:1: ( ruleSemanticAdaptation EOF )
            // InternalSemAdapt.g:56:1: ruleSemanticAdaptation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSemanticAdaptation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationRule()); 
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
    // $ANTLR end "entryRuleSemanticAdaptation"


    // $ANTLR start "ruleSemanticAdaptation"
    // InternalSemAdapt.g:63:1: ruleSemanticAdaptation : ( ( rule__SemanticAdaptation__Group__0 ) ) ;
    public final void ruleSemanticAdaptation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:67:2: ( ( ( rule__SemanticAdaptation__Group__0 ) ) )
            // InternalSemAdapt.g:68:2: ( ( rule__SemanticAdaptation__Group__0 ) )
            {
            // InternalSemAdapt.g:68:2: ( ( rule__SemanticAdaptation__Group__0 ) )
            // InternalSemAdapt.g:69:3: ( rule__SemanticAdaptation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getGroup()); 
            }
            // InternalSemAdapt.g:70:3: ( rule__SemanticAdaptation__Group__0 )
            // InternalSemAdapt.g:70:4: rule__SemanticAdaptation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemanticAdaptation"


    // $ANTLR start "entryRuleSemantics"
    // InternalSemAdapt.g:79:1: entryRuleSemantics : ruleSemantics EOF ;
    public final void entryRuleSemantics() throws RecognitionException {
        try {
            // InternalSemAdapt.g:80:1: ( ruleSemantics EOF )
            // InternalSemAdapt.g:81:1: ruleSemantics EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSemantics();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticsRule()); 
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
    // $ANTLR end "entryRuleSemantics"


    // $ANTLR start "ruleSemantics"
    // InternalSemAdapt.g:88:1: ruleSemantics : ( ( rule__Semantics__Group__0 ) ) ;
    public final void ruleSemantics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:92:2: ( ( ( rule__Semantics__Group__0 ) ) )
            // InternalSemAdapt.g:93:2: ( ( rule__Semantics__Group__0 ) )
            {
            // InternalSemAdapt.g:93:2: ( ( rule__Semantics__Group__0 ) )
            // InternalSemAdapt.g:94:3: ( rule__Semantics__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticsAccess().getGroup()); 
            }
            // InternalSemAdapt.g:95:3: ( rule__Semantics__Group__0 )
            // InternalSemAdapt.g:95:4: rule__Semantics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Semantics__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemantics"


    // $ANTLR start "entryRuleModule"
    // InternalSemAdapt.g:104:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalSemAdapt.g:105:1: ( ruleModule EOF )
            // InternalSemAdapt.g:106:1: ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleRule()); 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalSemAdapt.g:113:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:117:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalSemAdapt.g:118:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalSemAdapt.g:118:2: ( ( rule__Module__Group__0 ) )
            // InternalSemAdapt.g:119:3: ( rule__Module__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getGroup()); 
            }
            // InternalSemAdapt.g:120:3: ( rule__Module__Group__0 )
            // InternalSemAdapt.g:120:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePointcut"
    // InternalSemAdapt.g:129:1: entryRulePointcut : rulePointcut EOF ;
    public final void entryRulePointcut() throws RecognitionException {
        try {
            // InternalSemAdapt.g:130:1: ( rulePointcut EOF )
            // InternalSemAdapt.g:131:1: rulePointcut EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePointcut();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutRule()); 
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
    // $ANTLR end "entryRulePointcut"


    // $ANTLR start "rulePointcut"
    // InternalSemAdapt.g:138:1: rulePointcut : ( ( rule__Pointcut__Group__0 ) ) ;
    public final void rulePointcut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:142:2: ( ( ( rule__Pointcut__Group__0 ) ) )
            // InternalSemAdapt.g:143:2: ( ( rule__Pointcut__Group__0 ) )
            {
            // InternalSemAdapt.g:143:2: ( ( rule__Pointcut__Group__0 ) )
            // InternalSemAdapt.g:144:3: ( rule__Pointcut__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup()); 
            }
            // InternalSemAdapt.g:145:3: ( rule__Pointcut__Group__0 )
            // InternalSemAdapt.g:145:4: rule__Pointcut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointcut"


    // $ANTLR start "entryRuleAdaptation"
    // InternalSemAdapt.g:154:1: entryRuleAdaptation : ruleAdaptation EOF ;
    public final void entryRuleAdaptation() throws RecognitionException {
        try {
            // InternalSemAdapt.g:155:1: ( ruleAdaptation EOF )
            // InternalSemAdapt.g:156:1: ruleAdaptation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdaptation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationRule()); 
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
    // $ANTLR end "entryRuleAdaptation"


    // $ANTLR start "ruleAdaptation"
    // InternalSemAdapt.g:163:1: ruleAdaptation : ( ( rule__Adaptation__Group__0 ) ) ;
    public final void ruleAdaptation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:167:2: ( ( ( rule__Adaptation__Group__0 ) ) )
            // InternalSemAdapt.g:168:2: ( ( rule__Adaptation__Group__0 ) )
            {
            // InternalSemAdapt.g:168:2: ( ( rule__Adaptation__Group__0 ) )
            // InternalSemAdapt.g:169:3: ( rule__Adaptation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getGroup()); 
            }
            // InternalSemAdapt.g:170:3: ( rule__Adaptation__Group__0 )
            // InternalSemAdapt.g:170:4: rule__Adaptation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdaptation"


    // $ANTLR start "entryRuleModel"
    // InternalSemAdapt.g:179:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSemAdapt.g:180:1: ( ruleModel EOF )
            // InternalSemAdapt.g:181:1: ruleModel EOF
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
    // InternalSemAdapt.g:188:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:192:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSemAdapt.g:193:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSemAdapt.g:193:2: ( ( rule__Model__Group__0 ) )
            // InternalSemAdapt.g:194:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalSemAdapt.g:195:3: ( rule__Model__Group__0 )
            // InternalSemAdapt.g:195:4: rule__Model__Group__0
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
    // InternalSemAdapt.g:204:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalSemAdapt.g:205:1: ( ruleImport EOF )
            // InternalSemAdapt.g:206:1: ruleImport EOF
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
    // InternalSemAdapt.g:213:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:217:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalSemAdapt.g:218:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalSemAdapt.g:218:2: ( ( rule__Import__Group__0 ) )
            // InternalSemAdapt.g:219:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalSemAdapt.g:220:3: ( rule__Import__Group__0 )
            // InternalSemAdapt.g:220:4: rule__Import__Group__0
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
    // InternalSemAdapt.g:229:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSemAdapt.g:230:1: ( ruleRule EOF )
            // InternalSemAdapt.g:231:1: ruleRule EOF
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
    // InternalSemAdapt.g:238:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:242:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSemAdapt.g:243:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSemAdapt.g:243:2: ( ( rule__Rule__Group__0 ) )
            // InternalSemAdapt.g:244:3: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalSemAdapt.g:245:3: ( rule__Rule__Group__0 )
            // InternalSemAdapt.g:245:4: rule__Rule__Group__0
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
    // InternalSemAdapt.g:254:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalSemAdapt.g:255:1: ( ruleCondition EOF )
            // InternalSemAdapt.g:256:1: ruleCondition EOF
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
    // InternalSemAdapt.g:263:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:267:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalSemAdapt.g:268:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalSemAdapt.g:268:2: ( ( rule__Condition__Group__0 ) )
            // InternalSemAdapt.g:269:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalSemAdapt.g:270:3: ( rule__Condition__Group__0 )
            // InternalSemAdapt.g:270:4: rule__Condition__Group__0
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
    // InternalSemAdapt.g:279:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalSemAdapt.g:280:1: ( ruleInput EOF )
            // InternalSemAdapt.g:281:1: ruleInput EOF
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
    // InternalSemAdapt.g:288:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:292:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalSemAdapt.g:293:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalSemAdapt.g:293:2: ( ( rule__Input__Group__0 ) )
            // InternalSemAdapt.g:294:3: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // InternalSemAdapt.g:295:3: ( rule__Input__Group__0 )
            // InternalSemAdapt.g:295:4: rule__Input__Group__0
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
    // InternalSemAdapt.g:304:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalSemAdapt.g:305:1: ( ruleOutput EOF )
            // InternalSemAdapt.g:306:1: ruleOutput EOF
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
    // InternalSemAdapt.g:313:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:317:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalSemAdapt.g:318:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalSemAdapt.g:318:2: ( ( rule__Output__Group__0 ) )
            // InternalSemAdapt.g:319:3: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // InternalSemAdapt.g:320:3: ( rule__Output__Group__0 )
            // InternalSemAdapt.g:320:4: rule__Output__Group__0
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
    // InternalSemAdapt.g:329:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalSemAdapt.g:330:1: ( ruleBinding EOF )
            // InternalSemAdapt.g:331:1: ruleBinding EOF
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
    // InternalSemAdapt.g:338:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:342:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalSemAdapt.g:343:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalSemAdapt.g:343:2: ( ( rule__Binding__Group__0 ) )
            // InternalSemAdapt.g:344:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalSemAdapt.g:345:3: ( rule__Binding__Group__0 )
            // InternalSemAdapt.g:345:4: rule__Binding__Group__0
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
    // InternalSemAdapt.g:354:1: entryRuleAssignable : ruleAssignable EOF ;
    public final void entryRuleAssignable() throws RecognitionException {
        try {
            // InternalSemAdapt.g:355:1: ( ruleAssignable EOF )
            // InternalSemAdapt.g:356:1: ruleAssignable EOF
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
    // InternalSemAdapt.g:363:1: ruleAssignable : ( ( rule__Assignable__Alternatives ) ) ;
    public final void ruleAssignable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:367:2: ( ( ( rule__Assignable__Alternatives ) ) )
            // InternalSemAdapt.g:368:2: ( ( rule__Assignable__Alternatives ) )
            {
            // InternalSemAdapt.g:368:2: ( ( rule__Assignable__Alternatives ) )
            // InternalSemAdapt.g:369:3: ( rule__Assignable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignableAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:370:3: ( rule__Assignable__Alternatives )
            // InternalSemAdapt.g:370:4: rule__Assignable__Alternatives
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
    // InternalSemAdapt.g:379:1: entryRuleAssignee : ruleAssignee EOF ;
    public final void entryRuleAssignee() throws RecognitionException {
        try {
            // InternalSemAdapt.g:380:1: ( ruleAssignee EOF )
            // InternalSemAdapt.g:381:1: ruleAssignee EOF
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
    // InternalSemAdapt.g:388:1: ruleAssignee : ( ( rule__Assignee__Alternatives ) ) ;
    public final void ruleAssignee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:392:2: ( ( ( rule__Assignee__Alternatives ) ) )
            // InternalSemAdapt.g:393:2: ( ( rule__Assignee__Alternatives ) )
            {
            // InternalSemAdapt.g:393:2: ( ( rule__Assignee__Alternatives ) )
            // InternalSemAdapt.g:394:3: ( rule__Assignee__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:395:3: ( rule__Assignee__Alternatives )
            // InternalSemAdapt.g:395:4: rule__Assignee__Alternatives
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
    // InternalSemAdapt.g:404:1: entryRuleSemanticDomainAccess : ruleSemanticDomainAccess EOF ;
    public final void entryRuleSemanticDomainAccess() throws RecognitionException {
        try {
            // InternalSemAdapt.g:405:1: ( ruleSemanticDomainAccess EOF )
            // InternalSemAdapt.g:406:1: ruleSemanticDomainAccess EOF
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
    // InternalSemAdapt.g:413:1: ruleSemanticDomainAccess : ( ( rule__SemanticDomainAccess__Group__0 ) ) ;
    public final void ruleSemanticDomainAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:417:2: ( ( ( rule__SemanticDomainAccess__Group__0 ) ) )
            // InternalSemAdapt.g:418:2: ( ( rule__SemanticDomainAccess__Group__0 ) )
            {
            // InternalSemAdapt.g:418:2: ( ( rule__SemanticDomainAccess__Group__0 ) )
            // InternalSemAdapt.g:419:3: ( rule__SemanticDomainAccess__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup()); 
            }
            // InternalSemAdapt.g:420:3: ( rule__SemanticDomainAccess__Group__0 )
            // InternalSemAdapt.g:420:4: rule__SemanticDomainAccess__Group__0
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
    // InternalSemAdapt.g:429:1: entryRuleTerminalAccessExpression : ruleTerminalAccessExpression EOF ;
    public final void entryRuleTerminalAccessExpression() throws RecognitionException {
        try {
            // InternalSemAdapt.g:430:1: ( ruleTerminalAccessExpression EOF )
            // InternalSemAdapt.g:431:1: ruleTerminalAccessExpression EOF
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
    // InternalSemAdapt.g:438:1: ruleTerminalAccessExpression : ( ( rule__TerminalAccessExpression__Alternatives ) ) ;
    public final void ruleTerminalAccessExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:442:2: ( ( ( rule__TerminalAccessExpression__Alternatives ) ) )
            // InternalSemAdapt.g:443:2: ( ( rule__TerminalAccessExpression__Alternatives ) )
            {
            // InternalSemAdapt.g:443:2: ( ( rule__TerminalAccessExpression__Alternatives ) )
            // InternalSemAdapt.g:444:3: ( rule__TerminalAccessExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccessExpressionAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:445:3: ( rule__TerminalAccessExpression__Alternatives )
            // InternalSemAdapt.g:445:4: rule__TerminalAccessExpression__Alternatives
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
    // InternalSemAdapt.g:454:1: entryRuleSelf : ruleSelf EOF ;
    public final void entryRuleSelf() throws RecognitionException {
        try {
            // InternalSemAdapt.g:455:1: ( ruleSelf EOF )
            // InternalSemAdapt.g:456:1: ruleSelf EOF
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
    // InternalSemAdapt.g:463:1: ruleSelf : ( ( rule__Self__Group__0 ) ) ;
    public final void ruleSelf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:467:2: ( ( ( rule__Self__Group__0 ) ) )
            // InternalSemAdapt.g:468:2: ( ( rule__Self__Group__0 ) )
            {
            // InternalSemAdapt.g:468:2: ( ( rule__Self__Group__0 ) )
            // InternalSemAdapt.g:469:3: ( rule__Self__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getGroup()); 
            }
            // InternalSemAdapt.g:470:3: ( rule__Self__Group__0 )
            // InternalSemAdapt.g:470:4: rule__Self__Group__0
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
    // InternalSemAdapt.g:479:1: entryRuleConclusion : ruleConclusion EOF ;
    public final void entryRuleConclusion() throws RecognitionException {
        try {
            // InternalSemAdapt.g:480:1: ( ruleConclusion EOF )
            // InternalSemAdapt.g:481:1: ruleConclusion EOF
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
    // InternalSemAdapt.g:488:1: ruleConclusion : ( ( rule__Conclusion__Group__0 ) ) ;
    public final void ruleConclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:492:2: ( ( ( rule__Conclusion__Group__0 ) ) )
            // InternalSemAdapt.g:493:2: ( ( rule__Conclusion__Group__0 ) )
            {
            // InternalSemAdapt.g:493:2: ( ( rule__Conclusion__Group__0 ) )
            // InternalSemAdapt.g:494:3: ( rule__Conclusion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getGroup()); 
            }
            // InternalSemAdapt.g:495:3: ( rule__Conclusion__Group__0 )
            // InternalSemAdapt.g:495:4: rule__Conclusion__Group__0
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
    // InternalSemAdapt.g:504:1: entryRulePremise : rulePremise EOF ;
    public final void entryRulePremise() throws RecognitionException {
        try {
            // InternalSemAdapt.g:505:1: ( rulePremise EOF )
            // InternalSemAdapt.g:506:1: rulePremise EOF
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
    // InternalSemAdapt.g:513:1: rulePremise : ( ( rule__Premise__Group__0 ) ) ;
    public final void rulePremise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:517:2: ( ( ( rule__Premise__Group__0 ) ) )
            // InternalSemAdapt.g:518:2: ( ( rule__Premise__Group__0 ) )
            {
            // InternalSemAdapt.g:518:2: ( ( rule__Premise__Group__0 ) )
            // InternalSemAdapt.g:519:3: ( rule__Premise__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getGroup()); 
            }
            // InternalSemAdapt.g:520:3: ( rule__Premise__Group__0 )
            // InternalSemAdapt.g:520:4: rule__Premise__Group__0
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
    // InternalSemAdapt.g:529:1: entryRuleTermDef : ruleTermDef EOF ;
    public final void entryRuleTermDef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:530:1: ( ruleTermDef EOF )
            // InternalSemAdapt.g:531:1: ruleTermDef EOF
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
    // InternalSemAdapt.g:538:1: ruleTermDef : ( ( rule__TermDef__Alternatives ) ) ;
    public final void ruleTermDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:542:2: ( ( ( rule__TermDef__Alternatives ) ) )
            // InternalSemAdapt.g:543:2: ( ( rule__TermDef__Alternatives ) )
            {
            // InternalSemAdapt.g:543:2: ( ( rule__TermDef__Alternatives ) )
            // InternalSemAdapt.g:544:3: ( rule__TermDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermDefAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:545:3: ( rule__TermDef__Alternatives )
            // InternalSemAdapt.g:545:4: rule__TermDef__Alternatives
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
    // InternalSemAdapt.g:554:1: entryRuleTermRef : ruleTermRef EOF ;
    public final void entryRuleTermRef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:555:1: ( ruleTermRef EOF )
            // InternalSemAdapt.g:556:1: ruleTermRef EOF
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
    // InternalSemAdapt.g:563:1: ruleTermRef : ( ( rule__TermRef__Alternatives ) ) ;
    public final void ruleTermRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:567:2: ( ( ( rule__TermRef__Alternatives ) ) )
            // InternalSemAdapt.g:568:2: ( ( rule__TermRef__Alternatives ) )
            {
            // InternalSemAdapt.g:568:2: ( ( rule__TermRef__Alternatives ) )
            // InternalSemAdapt.g:569:3: ( rule__TermRef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRefAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:570:3: ( rule__TermRef__Alternatives )
            // InternalSemAdapt.g:570:4: rule__TermRef__Alternatives
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
    // InternalSemAdapt.g:579:1: entryRuleSingleTermDef : ruleSingleTermDef EOF ;
    public final void entryRuleSingleTermDef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:580:1: ( ruleSingleTermDef EOF )
            // InternalSemAdapt.g:581:1: ruleSingleTermDef EOF
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
    // InternalSemAdapt.g:588:1: ruleSingleTermDef : ( ( rule__SingleTermDef__Alternatives ) ) ;
    public final void ruleSingleTermDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:592:2: ( ( ( rule__SingleTermDef__Alternatives ) ) )
            // InternalSemAdapt.g:593:2: ( ( rule__SingleTermDef__Alternatives ) )
            {
            // InternalSemAdapt.g:593:2: ( ( rule__SingleTermDef__Alternatives ) )
            // InternalSemAdapt.g:594:3: ( rule__SingleTermDef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTermDefAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:595:3: ( rule__SingleTermDef__Alternatives )
            // InternalSemAdapt.g:595:4: rule__SingleTermDef__Alternatives
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
    // InternalSemAdapt.g:604:1: entryRuleSingleTermRef : ruleSingleTermRef EOF ;
    public final void entryRuleSingleTermRef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:605:1: ( ruleSingleTermRef EOF )
            // InternalSemAdapt.g:606:1: ruleSingleTermRef EOF
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
    // InternalSemAdapt.g:613:1: ruleSingleTermRef : ( ( rule__SingleTermRef__Alternatives ) ) ;
    public final void ruleSingleTermRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:617:2: ( ( ( rule__SingleTermRef__Alternatives ) ) )
            // InternalSemAdapt.g:618:2: ( ( rule__SingleTermRef__Alternatives ) )
            {
            // InternalSemAdapt.g:618:2: ( ( rule__SingleTermRef__Alternatives ) )
            // InternalSemAdapt.g:619:3: ( rule__SingleTermRef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTermRefAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:620:3: ( rule__SingleTermRef__Alternatives )
            // InternalSemAdapt.g:620:4: rule__SingleTermRef__Alternatives
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
    // InternalSemAdapt.g:629:1: entryRuleDefConfiguration : ruleDefConfiguration EOF ;
    public final void entryRuleDefConfiguration() throws RecognitionException {
        try {
            // InternalSemAdapt.g:630:1: ( ruleDefConfiguration EOF )
            // InternalSemAdapt.g:631:1: ruleDefConfiguration EOF
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
    // InternalSemAdapt.g:638:1: ruleDefConfiguration : ( ( rule__DefConfiguration__Group__0 ) ) ;
    public final void ruleDefConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:642:2: ( ( ( rule__DefConfiguration__Group__0 ) ) )
            // InternalSemAdapt.g:643:2: ( ( rule__DefConfiguration__Group__0 ) )
            {
            // InternalSemAdapt.g:643:2: ( ( rule__DefConfiguration__Group__0 ) )
            // InternalSemAdapt.g:644:3: ( rule__DefConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup()); 
            }
            // InternalSemAdapt.g:645:3: ( rule__DefConfiguration__Group__0 )
            // InternalSemAdapt.g:645:4: rule__DefConfiguration__Group__0
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
    // InternalSemAdapt.g:654:1: entryRuleRefConfiguration : ruleRefConfiguration EOF ;
    public final void entryRuleRefConfiguration() throws RecognitionException {
        try {
            // InternalSemAdapt.g:655:1: ( ruleRefConfiguration EOF )
            // InternalSemAdapt.g:656:1: ruleRefConfiguration EOF
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
    // InternalSemAdapt.g:663:1: ruleRefConfiguration : ( ( rule__RefConfiguration__Group__0 ) ) ;
    public final void ruleRefConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:667:2: ( ( ( rule__RefConfiguration__Group__0 ) ) )
            // InternalSemAdapt.g:668:2: ( ( rule__RefConfiguration__Group__0 ) )
            {
            // InternalSemAdapt.g:668:2: ( ( rule__RefConfiguration__Group__0 ) )
            // InternalSemAdapt.g:669:3: ( rule__RefConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup()); 
            }
            // InternalSemAdapt.g:670:3: ( rule__RefConfiguration__Group__0 )
            // InternalSemAdapt.g:670:4: rule__RefConfiguration__Group__0
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
    // InternalSemAdapt.g:679:1: entryRuleSymbolDef : ruleSymbolDef EOF ;
    public final void entryRuleSymbolDef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:680:1: ( ruleSymbolDef EOF )
            // InternalSemAdapt.g:681:1: ruleSymbolDef EOF
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
    // InternalSemAdapt.g:688:1: ruleSymbolDef : ( ( rule__SymbolDef__Group__0 ) ) ;
    public final void ruleSymbolDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:692:2: ( ( ( rule__SymbolDef__Group__0 ) ) )
            // InternalSemAdapt.g:693:2: ( ( rule__SymbolDef__Group__0 ) )
            {
            // InternalSemAdapt.g:693:2: ( ( rule__SymbolDef__Group__0 ) )
            // InternalSemAdapt.g:694:3: ( rule__SymbolDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getGroup()); 
            }
            // InternalSemAdapt.g:695:3: ( rule__SymbolDef__Group__0 )
            // InternalSemAdapt.g:695:4: rule__SymbolDef__Group__0
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
    // InternalSemAdapt.g:704:1: entryRuleSymbolRef : ruleSymbolRef EOF ;
    public final void entryRuleSymbolRef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:705:1: ( ruleSymbolRef EOF )
            // InternalSemAdapt.g:706:1: ruleSymbolRef EOF
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
    // InternalSemAdapt.g:713:1: ruleSymbolRef : ( ( rule__SymbolRef__Group__0 ) ) ;
    public final void ruleSymbolRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:717:2: ( ( ( rule__SymbolRef__Group__0 ) ) )
            // InternalSemAdapt.g:718:2: ( ( rule__SymbolRef__Group__0 ) )
            {
            // InternalSemAdapt.g:718:2: ( ( rule__SymbolRef__Group__0 ) )
            // InternalSemAdapt.g:719:3: ( rule__SymbolRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getGroup()); 
            }
            // InternalSemAdapt.g:720:3: ( rule__SymbolRef__Group__0 )
            // InternalSemAdapt.g:720:4: rule__SymbolRef__Group__0
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
    // InternalSemAdapt.g:729:1: entryRuleListDef : ruleListDef EOF ;
    public final void entryRuleListDef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:730:1: ( ruleListDef EOF )
            // InternalSemAdapt.g:731:1: ruleListDef EOF
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
    // InternalSemAdapt.g:738:1: ruleListDef : ( ( rule__ListDef__Group__0 ) ) ;
    public final void ruleListDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:742:2: ( ( ( rule__ListDef__Group__0 ) ) )
            // InternalSemAdapt.g:743:2: ( ( rule__ListDef__Group__0 ) )
            {
            // InternalSemAdapt.g:743:2: ( ( rule__ListDef__Group__0 ) )
            // InternalSemAdapt.g:744:3: ( rule__ListDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getGroup()); 
            }
            // InternalSemAdapt.g:745:3: ( rule__ListDef__Group__0 )
            // InternalSemAdapt.g:745:4: rule__ListDef__Group__0
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
    // InternalSemAdapt.g:754:1: entryRuleListRef : ruleListRef EOF ;
    public final void entryRuleListRef() throws RecognitionException {
        try {
            // InternalSemAdapt.g:755:1: ( ruleListRef EOF )
            // InternalSemAdapt.g:756:1: ruleListRef EOF
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
    // InternalSemAdapt.g:763:1: ruleListRef : ( ( rule__ListRef__Group__0 ) ) ;
    public final void ruleListRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:767:2: ( ( ( rule__ListRef__Group__0 ) ) )
            // InternalSemAdapt.g:768:2: ( ( rule__ListRef__Group__0 ) )
            {
            // InternalSemAdapt.g:768:2: ( ( rule__ListRef__Group__0 ) )
            // InternalSemAdapt.g:769:3: ( rule__ListRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getGroup()); 
            }
            // InternalSemAdapt.g:770:3: ( rule__ListRef__Group__0 )
            // InternalSemAdapt.g:770:4: rule__ListRef__Group__0
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
    // InternalSemAdapt.g:779:1: entryRuleVoidList : ruleVoidList EOF ;
    public final void entryRuleVoidList() throws RecognitionException {
        try {
            // InternalSemAdapt.g:780:1: ( ruleVoidList EOF )
            // InternalSemAdapt.g:781:1: ruleVoidList EOF
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
    // InternalSemAdapt.g:788:1: ruleVoidList : ( ( rule__VoidList__Group__0 ) ) ;
    public final void ruleVoidList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:792:2: ( ( ( rule__VoidList__Group__0 ) ) )
            // InternalSemAdapt.g:793:2: ( ( rule__VoidList__Group__0 ) )
            {
            // InternalSemAdapt.g:793:2: ( ( rule__VoidList__Group__0 ) )
            // InternalSemAdapt.g:794:3: ( rule__VoidList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getGroup()); 
            }
            // InternalSemAdapt.g:795:3: ( rule__VoidList__Group__0 )
            // InternalSemAdapt.g:795:4: rule__VoidList__Group__0
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
    // InternalSemAdapt.g:804:1: entryRuleCondExpr : ruleCondExpr EOF ;
    public final void entryRuleCondExpr() throws RecognitionException {
        try {
            // InternalSemAdapt.g:805:1: ( ruleCondExpr EOF )
            // InternalSemAdapt.g:806:1: ruleCondExpr EOF
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
    // InternalSemAdapt.g:813:1: ruleCondExpr : ( ( rule__CondExpr__Alternatives ) ) ;
    public final void ruleCondExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:817:2: ( ( ( rule__CondExpr__Alternatives ) ) )
            // InternalSemAdapt.g:818:2: ( ( rule__CondExpr__Alternatives ) )
            {
            // InternalSemAdapt.g:818:2: ( ( rule__CondExpr__Alternatives ) )
            // InternalSemAdapt.g:819:3: ( rule__CondExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondExprAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:820:3: ( rule__CondExpr__Alternatives )
            // InternalSemAdapt.g:820:4: rule__CondExpr__Alternatives
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
    // InternalSemAdapt.g:829:1: entryRuleCondNot : ruleCondNot EOF ;
    public final void entryRuleCondNot() throws RecognitionException {
        try {
            // InternalSemAdapt.g:830:1: ( ruleCondNot EOF )
            // InternalSemAdapt.g:831:1: ruleCondNot EOF
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
    // InternalSemAdapt.g:838:1: ruleCondNot : ( ( rule__CondNot__Group__0 ) ) ;
    public final void ruleCondNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:842:2: ( ( ( rule__CondNot__Group__0 ) ) )
            // InternalSemAdapt.g:843:2: ( ( rule__CondNot__Group__0 ) )
            {
            // InternalSemAdapt.g:843:2: ( ( rule__CondNot__Group__0 ) )
            // InternalSemAdapt.g:844:3: ( rule__CondNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getGroup()); 
            }
            // InternalSemAdapt.g:845:3: ( rule__CondNot__Group__0 )
            // InternalSemAdapt.g:845:4: rule__CondNot__Group__0
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
    // InternalSemAdapt.g:854:1: entryRuleCondOr : ruleCondOr EOF ;
    public final void entryRuleCondOr() throws RecognitionException {
        try {
            // InternalSemAdapt.g:855:1: ( ruleCondOr EOF )
            // InternalSemAdapt.g:856:1: ruleCondOr EOF
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
    // InternalSemAdapt.g:863:1: ruleCondOr : ( ( rule__CondOr__Group__0 ) ) ;
    public final void ruleCondOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:867:2: ( ( ( rule__CondOr__Group__0 ) ) )
            // InternalSemAdapt.g:868:2: ( ( rule__CondOr__Group__0 ) )
            {
            // InternalSemAdapt.g:868:2: ( ( rule__CondOr__Group__0 ) )
            // InternalSemAdapt.g:869:3: ( rule__CondOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getGroup()); 
            }
            // InternalSemAdapt.g:870:3: ( rule__CondOr__Group__0 )
            // InternalSemAdapt.g:870:4: rule__CondOr__Group__0
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
    // InternalSemAdapt.g:879:1: entryRuleCondAnd : ruleCondAnd EOF ;
    public final void entryRuleCondAnd() throws RecognitionException {
        try {
            // InternalSemAdapt.g:880:1: ( ruleCondAnd EOF )
            // InternalSemAdapt.g:881:1: ruleCondAnd EOF
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
    // InternalSemAdapt.g:888:1: ruleCondAnd : ( ( rule__CondAnd__Group__0 ) ) ;
    public final void ruleCondAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:892:2: ( ( ( rule__CondAnd__Group__0 ) ) )
            // InternalSemAdapt.g:893:2: ( ( rule__CondAnd__Group__0 ) )
            {
            // InternalSemAdapt.g:893:2: ( ( rule__CondAnd__Group__0 ) )
            // InternalSemAdapt.g:894:3: ( rule__CondAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getGroup()); 
            }
            // InternalSemAdapt.g:895:3: ( rule__CondAnd__Group__0 )
            // InternalSemAdapt.g:895:4: rule__CondAnd__Group__0
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
    // InternalSemAdapt.g:904:1: entryRuleCondEquality : ruleCondEquality EOF ;
    public final void entryRuleCondEquality() throws RecognitionException {
        try {
            // InternalSemAdapt.g:905:1: ( ruleCondEquality EOF )
            // InternalSemAdapt.g:906:1: ruleCondEquality EOF
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
    // InternalSemAdapt.g:913:1: ruleCondEquality : ( ( rule__CondEquality__Alternatives ) ) ;
    public final void ruleCondEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:917:2: ( ( ( rule__CondEquality__Alternatives ) ) )
            // InternalSemAdapt.g:918:2: ( ( rule__CondEquality__Alternatives ) )
            {
            // InternalSemAdapt.g:918:2: ( ( rule__CondEquality__Alternatives ) )
            // InternalSemAdapt.g:919:3: ( rule__CondEquality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:920:3: ( rule__CondEquality__Alternatives )
            // InternalSemAdapt.g:920:4: rule__CondEquality__Alternatives
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
    // InternalSemAdapt.g:929:1: entryRuleCondComparison : ruleCondComparison EOF ;
    public final void entryRuleCondComparison() throws RecognitionException {
        try {
            // InternalSemAdapt.g:930:1: ( ruleCondComparison EOF )
            // InternalSemAdapt.g:931:1: ruleCondComparison EOF
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
    // InternalSemAdapt.g:938:1: ruleCondComparison : ( ( rule__CondComparison__Alternatives ) ) ;
    public final void ruleCondComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:942:2: ( ( ( rule__CondComparison__Alternatives ) ) )
            // InternalSemAdapt.g:943:2: ( ( rule__CondComparison__Alternatives ) )
            {
            // InternalSemAdapt.g:943:2: ( ( rule__CondComparison__Alternatives ) )
            // InternalSemAdapt.g:944:3: ( rule__CondComparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:945:3: ( rule__CondComparison__Alternatives )
            // InternalSemAdapt.g:945:4: rule__CondComparison__Alternatives
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
    // InternalSemAdapt.g:954:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalSemAdapt.g:955:1: ( ruleExpr EOF )
            // InternalSemAdapt.g:956:1: ruleExpr EOF
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
    // InternalSemAdapt.g:963:1: ruleExpr : ( ruleOr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:967:2: ( ( ruleOr ) )
            // InternalSemAdapt.g:968:2: ( ruleOr )
            {
            // InternalSemAdapt.g:968:2: ( ruleOr )
            // InternalSemAdapt.g:969:3: ruleOr
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
    // InternalSemAdapt.g:979:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSemAdapt.g:980:1: ( ruleOr EOF )
            // InternalSemAdapt.g:981:1: ruleOr EOF
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
    // InternalSemAdapt.g:988:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:992:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSemAdapt.g:993:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSemAdapt.g:993:2: ( ( rule__Or__Group__0 ) )
            // InternalSemAdapt.g:994:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalSemAdapt.g:995:3: ( rule__Or__Group__0 )
            // InternalSemAdapt.g:995:4: rule__Or__Group__0
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
    // InternalSemAdapt.g:1004:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1005:1: ( ruleAnd EOF )
            // InternalSemAdapt.g:1006:1: ruleAnd EOF
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
    // InternalSemAdapt.g:1013:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1017:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSemAdapt.g:1018:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSemAdapt.g:1018:2: ( ( rule__And__Group__0 ) )
            // InternalSemAdapt.g:1019:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1020:3: ( rule__And__Group__0 )
            // InternalSemAdapt.g:1020:4: rule__And__Group__0
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
    // InternalSemAdapt.g:1029:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1030:1: ( ruleEquality EOF )
            // InternalSemAdapt.g:1031:1: ruleEquality EOF
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
    // InternalSemAdapt.g:1038:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1042:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalSemAdapt.g:1043:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalSemAdapt.g:1043:2: ( ( rule__Equality__Group__0 ) )
            // InternalSemAdapt.g:1044:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1045:3: ( rule__Equality__Group__0 )
            // InternalSemAdapt.g:1045:4: rule__Equality__Group__0
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
    // InternalSemAdapt.g:1054:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1055:1: ( ruleComparison EOF )
            // InternalSemAdapt.g:1056:1: ruleComparison EOF
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
    // InternalSemAdapt.g:1063:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1067:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalSemAdapt.g:1068:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalSemAdapt.g:1068:2: ( ( rule__Comparison__Group__0 ) )
            // InternalSemAdapt.g:1069:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1070:3: ( rule__Comparison__Group__0 )
            // InternalSemAdapt.g:1070:4: rule__Comparison__Group__0
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
    // InternalSemAdapt.g:1079:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1080:1: ( rulePlusOrMinus EOF )
            // InternalSemAdapt.g:1081:1: rulePlusOrMinus EOF
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
    // InternalSemAdapt.g:1088:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1092:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalSemAdapt.g:1093:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalSemAdapt.g:1093:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalSemAdapt.g:1094:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1095:3: ( rule__PlusOrMinus__Group__0 )
            // InternalSemAdapt.g:1095:4: rule__PlusOrMinus__Group__0
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
    // InternalSemAdapt.g:1104:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1105:1: ( ruleMulOrDiv EOF )
            // InternalSemAdapt.g:1106:1: ruleMulOrDiv EOF
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
    // InternalSemAdapt.g:1113:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1117:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalSemAdapt.g:1118:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalSemAdapt.g:1118:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalSemAdapt.g:1119:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1120:3: ( rule__MulOrDiv__Group__0 )
            // InternalSemAdapt.g:1120:4: rule__MulOrDiv__Group__0
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
    // InternalSemAdapt.g:1129:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1130:1: ( rulePrimary EOF )
            // InternalSemAdapt.g:1131:1: rulePrimary EOF
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
    // InternalSemAdapt.g:1138:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1142:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSemAdapt.g:1143:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSemAdapt.g:1143:2: ( ( rule__Primary__Alternatives ) )
            // InternalSemAdapt.g:1144:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:1145:3: ( rule__Primary__Alternatives )
            // InternalSemAdapt.g:1145:4: rule__Primary__Alternatives
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
    // InternalSemAdapt.g:1154:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1155:1: ( ruleAtomic EOF )
            // InternalSemAdapt.g:1156:1: ruleAtomic EOF
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
    // InternalSemAdapt.g:1163:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1167:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalSemAdapt.g:1168:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalSemAdapt.g:1168:2: ( ( rule__Atomic__Alternatives ) )
            // InternalSemAdapt.g:1169:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:1170:3: ( rule__Atomic__Alternatives )
            // InternalSemAdapt.g:1170:4: rule__Atomic__Alternatives
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
    // InternalSemAdapt.g:1179:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1180:1: ( ruleEString EOF )
            // InternalSemAdapt.g:1181:1: ruleEString EOF
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
    // InternalSemAdapt.g:1188:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1192:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSemAdapt.g:1193:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSemAdapt.g:1193:2: ( ( rule__EString__Alternatives ) )
            // InternalSemAdapt.g:1194:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:1195:3: ( rule__EString__Alternatives )
            // InternalSemAdapt.g:1195:4: rule__EString__Alternatives
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
    // InternalSemAdapt.g:1204:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1205:1: ( ruleFQN EOF )
            // InternalSemAdapt.g:1206:1: ruleFQN EOF
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
    // InternalSemAdapt.g:1213:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1217:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSemAdapt.g:1218:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSemAdapt.g:1218:2: ( ( rule__FQN__Group__0 ) )
            // InternalSemAdapt.g:1219:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1220:3: ( rule__FQN__Group__0 )
            // InternalSemAdapt.g:1220:4: rule__FQN__Group__0
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
    // InternalSemAdapt.g:1229:1: entryRuleOperationFQN : ruleOperationFQN EOF ;
    public final void entryRuleOperationFQN() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1230:1: ( ruleOperationFQN EOF )
            // InternalSemAdapt.g:1231:1: ruleOperationFQN EOF
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
    // InternalSemAdapt.g:1238:1: ruleOperationFQN : ( ( rule__OperationFQN__Group__0 ) ) ;
    public final void ruleOperationFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1242:2: ( ( ( rule__OperationFQN__Group__0 ) ) )
            // InternalSemAdapt.g:1243:2: ( ( rule__OperationFQN__Group__0 ) )
            {
            // InternalSemAdapt.g:1243:2: ( ( rule__OperationFQN__Group__0 ) )
            // InternalSemAdapt.g:1244:3: ( rule__OperationFQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1245:3: ( rule__OperationFQN__Group__0 )
            // InternalSemAdapt.g:1245:4: rule__OperationFQN__Group__0
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


    // $ANTLR start "rule__Adaptation__Alternatives_0"
    // InternalSemAdapt.g:1253:1: rule__Adaptation__Alternatives_0 : ( ( ( rule__Adaptation__Group_0_0__0 ) ) | ( ( rule__Adaptation__Group_0_1__0 ) ) | ( ( rule__Adaptation__Group_0_2__0 ) ) );
    public final void rule__Adaptation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1257:1: ( ( ( rule__Adaptation__Group_0_0__0 ) ) | ( ( rule__Adaptation__Group_0_1__0 ) ) | ( ( rule__Adaptation__Group_0_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSemAdapt.g:1258:2: ( ( rule__Adaptation__Group_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1258:2: ( ( rule__Adaptation__Group_0_0__0 ) )
                    // InternalSemAdapt.g:1259:3: ( rule__Adaptation__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdaptationAccess().getGroup_0_0()); 
                    }
                    // InternalSemAdapt.g:1260:3: ( rule__Adaptation__Group_0_0__0 )
                    // InternalSemAdapt.g:1260:4: rule__Adaptation__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adaptation__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdaptationAccess().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1264:2: ( ( rule__Adaptation__Group_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1264:2: ( ( rule__Adaptation__Group_0_1__0 ) )
                    // InternalSemAdapt.g:1265:3: ( rule__Adaptation__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdaptationAccess().getGroup_0_1()); 
                    }
                    // InternalSemAdapt.g:1266:3: ( rule__Adaptation__Group_0_1__0 )
                    // InternalSemAdapt.g:1266:4: rule__Adaptation__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adaptation__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdaptationAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:1270:2: ( ( rule__Adaptation__Group_0_2__0 ) )
                    {
                    // InternalSemAdapt.g:1270:2: ( ( rule__Adaptation__Group_0_2__0 ) )
                    // InternalSemAdapt.g:1271:3: ( rule__Adaptation__Group_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdaptationAccess().getGroup_0_2()); 
                    }
                    // InternalSemAdapt.g:1272:3: ( rule__Adaptation__Group_0_2__0 )
                    // InternalSemAdapt.g:1272:4: rule__Adaptation__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Adaptation__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdaptationAccess().getGroup_0_2()); 
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
    // $ANTLR end "rule__Adaptation__Alternatives_0"


    // $ANTLR start "rule__Rule__Alternatives_7_1"
    // InternalSemAdapt.g:1280:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1284:1: ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSemAdapt.g:1285:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    {
                    // InternalSemAdapt.g:1285:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    // InternalSemAdapt.g:1286:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_1_0()); 
                    }
                    // InternalSemAdapt.g:1287:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    // InternalSemAdapt.g:1287:4: rule__Rule__InputsAssignment_7_1_0
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
                    // InternalSemAdapt.g:1291:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    {
                    // InternalSemAdapt.g:1291:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    // InternalSemAdapt.g:1292:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_1_1()); 
                    }
                    // InternalSemAdapt.g:1293:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    // InternalSemAdapt.g:1293:4: rule__Rule__OutputsAssignment_7_1_1
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
    // InternalSemAdapt.g:1301:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1305:1: ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSemAdapt.g:1306:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    {
                    // InternalSemAdapt.g:1306:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    // InternalSemAdapt.g:1307:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_2_1_0()); 
                    }
                    // InternalSemAdapt.g:1308:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    // InternalSemAdapt.g:1308:4: rule__Rule__InputsAssignment_7_2_1_0
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
                    // InternalSemAdapt.g:1312:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    {
                    // InternalSemAdapt.g:1312:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    // InternalSemAdapt.g:1313:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_2_1_1()); 
                    }
                    // InternalSemAdapt.g:1314:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    // InternalSemAdapt.g:1314:4: rule__Rule__OutputsAssignment_7_2_1_1
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
    // InternalSemAdapt.g:1322:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1326:1: ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSemAdapt.g:1327:2: ( ruleExpr )
                    {
                    // InternalSemAdapt.g:1327:2: ( ruleExpr )
                    // InternalSemAdapt.g:1328:3: ruleExpr
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
                    // InternalSemAdapt.g:1333:2: ( ruleRefConfiguration )
                    {
                    // InternalSemAdapt.g:1333:2: ( ruleRefConfiguration )
                    // InternalSemAdapt.g:1334:3: ruleRefConfiguration
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
                    // InternalSemAdapt.g:1339:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalSemAdapt.g:1339:2: ( ruleSemanticDomainAccess )
                    // InternalSemAdapt.g:1340:3: ruleSemanticDomainAccess
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
    // InternalSemAdapt.g:1349:1: rule__Assignee__Alternatives : ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1353:1: ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==31) ) {
                    alt5=1;
                }
                else if ( (LA5_1==34) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==35) ) {
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
                    // InternalSemAdapt.g:1354:2: ( ruleSymbolDef )
                    {
                    // InternalSemAdapt.g:1354:2: ( ruleSymbolDef )
                    // InternalSemAdapt.g:1355:3: ruleSymbolDef
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
                    // InternalSemAdapt.g:1360:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalSemAdapt.g:1360:2: ( ruleSemanticDomainAccess )
                    // InternalSemAdapt.g:1361:3: ruleSemanticDomainAccess
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
    // InternalSemAdapt.g:1370:1: rule__TerminalAccessExpression__Alternatives : ( ( ruleSymbolRef ) | ( ruleSelf ) );
    public final void rule__TerminalAccessExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1374:1: ( ( ruleSymbolRef ) | ( ruleSelf ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
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
                    // InternalSemAdapt.g:1375:2: ( ruleSymbolRef )
                    {
                    // InternalSemAdapt.g:1375:2: ( ruleSymbolRef )
                    // InternalSemAdapt.g:1376:3: ruleSymbolRef
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
                    // InternalSemAdapt.g:1381:2: ( ruleSelf )
                    {
                    // InternalSemAdapt.g:1381:2: ( ruleSelf )
                    // InternalSemAdapt.g:1382:3: ruleSelf
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
    // InternalSemAdapt.g:1391:1: rule__TermDef__Alternatives : ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) );
    public final void rule__TermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1395:1: ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 40:
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
                    // InternalSemAdapt.g:1396:2: ( ruleSingleTermDef )
                    {
                    // InternalSemAdapt.g:1396:2: ( ruleSingleTermDef )
                    // InternalSemAdapt.g:1397:3: ruleSingleTermDef
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
                    // InternalSemAdapt.g:1402:2: ( ruleListDef )
                    {
                    // InternalSemAdapt.g:1402:2: ( ruleListDef )
                    // InternalSemAdapt.g:1403:3: ruleListDef
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
                    // InternalSemAdapt.g:1408:2: ( ruleVoidList )
                    {
                    // InternalSemAdapt.g:1408:2: ( ruleVoidList )
                    // InternalSemAdapt.g:1409:3: ruleVoidList
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
    // InternalSemAdapt.g:1418:1: rule__TermRef__Alternatives : ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) );
    public final void rule__TermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1422:1: ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 40:
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
                    // InternalSemAdapt.g:1423:2: ( ruleSingleTermRef )
                    {
                    // InternalSemAdapt.g:1423:2: ( ruleSingleTermRef )
                    // InternalSemAdapt.g:1424:3: ruleSingleTermRef
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
                    // InternalSemAdapt.g:1429:2: ( ruleListRef )
                    {
                    // InternalSemAdapt.g:1429:2: ( ruleListRef )
                    // InternalSemAdapt.g:1430:3: ruleListRef
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
                    // InternalSemAdapt.g:1435:2: ( ruleVoidList )
                    {
                    // InternalSemAdapt.g:1435:2: ( ruleVoidList )
                    // InternalSemAdapt.g:1436:3: ruleVoidList
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
    // InternalSemAdapt.g:1445:1: rule__SingleTermDef__Alternatives : ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) );
    public final void rule__SingleTermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1449:1: ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==32||LA9_1==34) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||LA9_1==15||(LA9_1>=18 && LA9_1<=21)||LA9_1==27||(LA9_1>=29 && LA9_1<=30)||LA9_1==33||LA9_1==38) ) {
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
                    // InternalSemAdapt.g:1450:2: ( ruleDefConfiguration )
                    {
                    // InternalSemAdapt.g:1450:2: ( ruleDefConfiguration )
                    // InternalSemAdapt.g:1451:3: ruleDefConfiguration
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
                    // InternalSemAdapt.g:1456:2: ( ruleSymbolDef )
                    {
                    // InternalSemAdapt.g:1456:2: ( ruleSymbolDef )
                    // InternalSemAdapt.g:1457:3: ruleSymbolDef
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
    // InternalSemAdapt.g:1466:1: rule__SingleTermRef__Alternatives : ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) );
    public final void rule__SingleTermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1470:1: ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==15||(LA10_1>=17 && LA10_1<=21)||(LA10_1>=28 && LA10_1<=30)||LA10_1==33) ) {
                    alt10=2;
                }
                else if ( (LA10_1==32||LA10_1==34) ) {
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
                    // InternalSemAdapt.g:1471:2: ( ( ruleRefConfiguration ) )
                    {
                    // InternalSemAdapt.g:1471:2: ( ( ruleRefConfiguration ) )
                    // InternalSemAdapt.g:1472:3: ( ruleRefConfiguration )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0()); 
                    }
                    // InternalSemAdapt.g:1473:3: ( ruleRefConfiguration )
                    // InternalSemAdapt.g:1473:4: ruleRefConfiguration
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
                    // InternalSemAdapt.g:1477:2: ( ruleSymbolRef )
                    {
                    // InternalSemAdapt.g:1477:2: ( ruleSymbolRef )
                    // InternalSemAdapt.g:1478:3: ruleSymbolRef
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
    // InternalSemAdapt.g:1487:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) );
    public final void rule__CondExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1491:1: ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSemAdapt.g:1492:2: ( ruleCondOr )
                    {
                    // InternalSemAdapt.g:1492:2: ( ruleCondOr )
                    // InternalSemAdapt.g:1493:3: ruleCondOr
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
                    // InternalSemAdapt.g:1498:2: ( ruleCondAnd )
                    {
                    // InternalSemAdapt.g:1498:2: ( ruleCondAnd )
                    // InternalSemAdapt.g:1499:3: ruleCondAnd
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
                    // InternalSemAdapt.g:1504:2: ( ruleCondEquality )
                    {
                    // InternalSemAdapt.g:1504:2: ( ruleCondEquality )
                    // InternalSemAdapt.g:1505:3: ruleCondEquality
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
                    // InternalSemAdapt.g:1510:2: ( ruleCondComparison )
                    {
                    // InternalSemAdapt.g:1510:2: ( ruleCondComparison )
                    // InternalSemAdapt.g:1511:3: ruleCondComparison
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
                    // InternalSemAdapt.g:1516:2: ( ruleCondNot )
                    {
                    // InternalSemAdapt.g:1516:2: ( ruleCondNot )
                    // InternalSemAdapt.g:1517:3: ruleCondNot
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
    // InternalSemAdapt.g:1526:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );
    public final void rule__CondEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1530:1: ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSemAdapt.g:1531:2: ( ( rule__CondEquality__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1531:2: ( ( rule__CondEquality__Group_0__0 ) )
                    // InternalSemAdapt.g:1532:3: ( rule__CondEquality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1533:3: ( rule__CondEquality__Group_0__0 )
                    // InternalSemAdapt.g:1533:4: rule__CondEquality__Group_0__0
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
                    // InternalSemAdapt.g:1537:2: ( ( rule__CondEquality__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1537:2: ( ( rule__CondEquality__Group_1__0 ) )
                    // InternalSemAdapt.g:1538:3: ( rule__CondEquality__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1539:3: ( rule__CondEquality__Group_1__0 )
                    // InternalSemAdapt.g:1539:4: rule__CondEquality__Group_1__0
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
    // InternalSemAdapt.g:1547:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );
    public final void rule__CondComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1551:1: ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSemAdapt.g:1552:2: ( ( rule__CondComparison__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1552:2: ( ( rule__CondComparison__Group_0__0 ) )
                    // InternalSemAdapt.g:1553:3: ( rule__CondComparison__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1554:3: ( rule__CondComparison__Group_0__0 )
                    // InternalSemAdapt.g:1554:4: rule__CondComparison__Group_0__0
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
                    // InternalSemAdapt.g:1558:2: ( ( rule__CondComparison__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1558:2: ( ( rule__CondComparison__Group_1__0 ) )
                    // InternalSemAdapt.g:1559:3: ( rule__CondComparison__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1560:3: ( rule__CondComparison__Group_1__0 )
                    // InternalSemAdapt.g:1560:4: rule__CondComparison__Group_1__0
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
    // InternalSemAdapt.g:1568:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1572:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            else if ( (LA14_0==45) ) {
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
                    // InternalSemAdapt.g:1573:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1573:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1574:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1575:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1575:4: rule__Equality__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1579:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1579:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1580:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1581:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1581:4: rule__Equality__Group_1_0_1__0
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
    // InternalSemAdapt.g:1589:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1593:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            else if ( (LA15_0==47) ) {
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
                    // InternalSemAdapt.g:1594:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1594:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1595:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1596:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1596:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1600:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1600:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1601:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1602:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1602:4: rule__Comparison__Group_1_0_1__0
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
    // InternalSemAdapt.g:1610:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1614:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            else if ( (LA16_0==49) ) {
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
                    // InternalSemAdapt.g:1615:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1615:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1616:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1617:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1617:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1621:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1621:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1622:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1623:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1623:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalSemAdapt.g:1631:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1635:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            else if ( (LA17_0==51) ) {
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
                    // InternalSemAdapt.g:1636:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1636:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1637:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1638:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1638:4: rule__MulOrDiv__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1642:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1642:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1643:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1644:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1644:4: rule__MulOrDiv__Group_1_0_1__0
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
    // InternalSemAdapt.g:1652:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1656:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 49:
                {
                alt18=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOL:
            case 35:
                {
                alt18=4;
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
                    // InternalSemAdapt.g:1657:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1657:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalSemAdapt.g:1658:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1659:3: ( rule__Primary__Group_0__0 )
                    // InternalSemAdapt.g:1659:4: rule__Primary__Group_0__0
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
                    // InternalSemAdapt.g:1663:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1663:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalSemAdapt.g:1664:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1665:3: ( rule__Primary__Group_1__0 )
                    // InternalSemAdapt.g:1665:4: rule__Primary__Group_1__0
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
                    // InternalSemAdapt.g:1669:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSemAdapt.g:1669:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSemAdapt.g:1670:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalSemAdapt.g:1671:3: ( rule__Primary__Group_2__0 )
                    // InternalSemAdapt.g:1671:4: rule__Primary__Group_2__0
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
                    // InternalSemAdapt.g:1675:2: ( ruleAtomic )
                    {
                    // InternalSemAdapt.g:1675:2: ( ruleAtomic )
                    // InternalSemAdapt.g:1676:3: ruleAtomic
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
    // InternalSemAdapt.g:1685:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1689:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case RULE_BOOL:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
                {
                int LA19_5 = input.LA(2);

                if ( (LA19_5==EOF||(LA19_5>=15 && LA19_5<=16)||(LA19_5>=18 && LA19_5<=21)||(LA19_5>=27 && LA19_5<=30)||LA19_5==33||(LA19_5>=42 && LA19_5<=52)) ) {
                    alt19=6;
                }
                else if ( (LA19_5==34) ) {
                    alt19=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 5, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA19_6 = input.LA(2);

                if ( (LA19_6==EOF||(LA19_6>=15 && LA19_6<=16)||(LA19_6>=18 && LA19_6<=21)||(LA19_6>=27 && LA19_6<=30)||LA19_6==33||(LA19_6>=42 && LA19_6<=52)) ) {
                    alt19=6;
                }
                else if ( (LA19_6==34) ) {
                    alt19=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSemAdapt.g:1690:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1690:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalSemAdapt.g:1691:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1692:3: ( rule__Atomic__Group_0__0 )
                    // InternalSemAdapt.g:1692:4: rule__Atomic__Group_0__0
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
                    // InternalSemAdapt.g:1696:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1696:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalSemAdapt.g:1697:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1698:3: ( rule__Atomic__Group_1__0 )
                    // InternalSemAdapt.g:1698:4: rule__Atomic__Group_1__0
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
                    // InternalSemAdapt.g:1702:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalSemAdapt.g:1702:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalSemAdapt.g:1703:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalSemAdapt.g:1704:3: ( rule__Atomic__Group_2__0 )
                    // InternalSemAdapt.g:1704:4: rule__Atomic__Group_2__0
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
                    // InternalSemAdapt.g:1708:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalSemAdapt.g:1708:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalSemAdapt.g:1709:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalSemAdapt.g:1710:3: ( rule__Atomic__Group_3__0 )
                    // InternalSemAdapt.g:1710:4: rule__Atomic__Group_3__0
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
                    // InternalSemAdapt.g:1714:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalSemAdapt.g:1714:2: ( ruleSemanticDomainAccess )
                    // InternalSemAdapt.g:1715:3: ruleSemanticDomainAccess
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
                    // InternalSemAdapt.g:1720:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalSemAdapt.g:1720:2: ( ruleTerminalAccessExpression )
                    // InternalSemAdapt.g:1721:3: ruleTerminalAccessExpression
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
    // InternalSemAdapt.g:1730:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1734:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSemAdapt.g:1735:2: ( RULE_STRING )
                    {
                    // InternalSemAdapt.g:1735:2: ( RULE_STRING )
                    // InternalSemAdapt.g:1736:3: RULE_STRING
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
                    // InternalSemAdapt.g:1741:2: ( RULE_ID )
                    {
                    // InternalSemAdapt.g:1741:2: ( RULE_ID )
                    // InternalSemAdapt.g:1742:3: RULE_ID
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


    // $ANTLR start "rule__SemanticAdaptation__Group__0"
    // InternalSemAdapt.g:1751:1: rule__SemanticAdaptation__Group__0 : rule__SemanticAdaptation__Group__0__Impl rule__SemanticAdaptation__Group__1 ;
    public final void rule__SemanticAdaptation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1755:1: ( rule__SemanticAdaptation__Group__0__Impl rule__SemanticAdaptation__Group__1 )
            // InternalSemAdapt.g:1756:2: rule__SemanticAdaptation__Group__0__Impl rule__SemanticAdaptation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SemanticAdaptation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__0"


    // $ANTLR start "rule__SemanticAdaptation__Group__0__Impl"
    // InternalSemAdapt.g:1763:1: rule__SemanticAdaptation__Group__0__Impl : ( ( rule__SemanticAdaptation__ModelAssignment_0 ) ) ;
    public final void rule__SemanticAdaptation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1767:1: ( ( ( rule__SemanticAdaptation__ModelAssignment_0 ) ) )
            // InternalSemAdapt.g:1768:1: ( ( rule__SemanticAdaptation__ModelAssignment_0 ) )
            {
            // InternalSemAdapt.g:1768:1: ( ( rule__SemanticAdaptation__ModelAssignment_0 ) )
            // InternalSemAdapt.g:1769:2: ( rule__SemanticAdaptation__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getModelAssignment_0()); 
            }
            // InternalSemAdapt.g:1770:2: ( rule__SemanticAdaptation__ModelAssignment_0 )
            // InternalSemAdapt.g:1770:3: rule__SemanticAdaptation__ModelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__ModelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getModelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__0__Impl"


    // $ANTLR start "rule__SemanticAdaptation__Group__1"
    // InternalSemAdapt.g:1778:1: rule__SemanticAdaptation__Group__1 : rule__SemanticAdaptation__Group__1__Impl rule__SemanticAdaptation__Group__2 ;
    public final void rule__SemanticAdaptation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1782:1: ( rule__SemanticAdaptation__Group__1__Impl rule__SemanticAdaptation__Group__2 )
            // InternalSemAdapt.g:1783:2: rule__SemanticAdaptation__Group__1__Impl rule__SemanticAdaptation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SemanticAdaptation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__1"


    // $ANTLR start "rule__SemanticAdaptation__Group__1__Impl"
    // InternalSemAdapt.g:1790:1: rule__SemanticAdaptation__Group__1__Impl : ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) ) ;
    public final void rule__SemanticAdaptation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1794:1: ( ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) ) )
            // InternalSemAdapt.g:1795:1: ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) )
            {
            // InternalSemAdapt.g:1795:1: ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) )
            // InternalSemAdapt.g:1796:2: ( rule__SemanticAdaptation__SemanticsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getSemanticsAssignment_1()); 
            }
            // InternalSemAdapt.g:1797:2: ( rule__SemanticAdaptation__SemanticsAssignment_1 )
            // InternalSemAdapt.g:1797:3: rule__SemanticAdaptation__SemanticsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__SemanticsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getSemanticsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__1__Impl"


    // $ANTLR start "rule__SemanticAdaptation__Group__2"
    // InternalSemAdapt.g:1805:1: rule__SemanticAdaptation__Group__2 : rule__SemanticAdaptation__Group__2__Impl rule__SemanticAdaptation__Group__3 ;
    public final void rule__SemanticAdaptation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1809:1: ( rule__SemanticAdaptation__Group__2__Impl rule__SemanticAdaptation__Group__3 )
            // InternalSemAdapt.g:1810:2: rule__SemanticAdaptation__Group__2__Impl rule__SemanticAdaptation__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SemanticAdaptation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__2"


    // $ANTLR start "rule__SemanticAdaptation__Group__2__Impl"
    // InternalSemAdapt.g:1817:1: rule__SemanticAdaptation__Group__2__Impl : ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* ) ;
    public final void rule__SemanticAdaptation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1821:1: ( ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* ) )
            // InternalSemAdapt.g:1822:1: ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* )
            {
            // InternalSemAdapt.g:1822:1: ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* )
            // InternalSemAdapt.g:1823:2: ( rule__SemanticAdaptation__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getImportsAssignment_2()); 
            }
            // InternalSemAdapt.g:1824:2: ( rule__SemanticAdaptation__ImportsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSemAdapt.g:1824:3: rule__SemanticAdaptation__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SemanticAdaptation__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__2__Impl"


    // $ANTLR start "rule__SemanticAdaptation__Group__3"
    // InternalSemAdapt.g:1832:1: rule__SemanticAdaptation__Group__3 : rule__SemanticAdaptation__Group__3__Impl ;
    public final void rule__SemanticAdaptation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1836:1: ( rule__SemanticAdaptation__Group__3__Impl )
            // InternalSemAdapt.g:1837:2: rule__SemanticAdaptation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticAdaptation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__3"


    // $ANTLR start "rule__SemanticAdaptation__Group__3__Impl"
    // InternalSemAdapt.g:1843:1: rule__SemanticAdaptation__Group__3__Impl : ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* ) ;
    public final void rule__SemanticAdaptation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1847:1: ( ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* ) )
            // InternalSemAdapt.g:1848:1: ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* )
            {
            // InternalSemAdapt.g:1848:1: ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* )
            // InternalSemAdapt.g:1849:2: ( rule__SemanticAdaptation__ModulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getModulesAssignment_3()); 
            }
            // InternalSemAdapt.g:1850:2: ( rule__SemanticAdaptation__ModulesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSemAdapt.g:1850:3: rule__SemanticAdaptation__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SemanticAdaptation__ModulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getModulesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__Group__3__Impl"


    // $ANTLR start "rule__Semantics__Group__0"
    // InternalSemAdapt.g:1859:1: rule__Semantics__Group__0 : rule__Semantics__Group__0__Impl rule__Semantics__Group__1 ;
    public final void rule__Semantics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1863:1: ( rule__Semantics__Group__0__Impl rule__Semantics__Group__1 )
            // InternalSemAdapt.g:1864:2: rule__Semantics__Group__0__Impl rule__Semantics__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Semantics__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Semantics__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantics__Group__0"


    // $ANTLR start "rule__Semantics__Group__0__Impl"
    // InternalSemAdapt.g:1871:1: rule__Semantics__Group__0__Impl : ( 'semantics' ) ;
    public final void rule__Semantics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1875:1: ( ( 'semantics' ) )
            // InternalSemAdapt.g:1876:1: ( 'semantics' )
            {
            // InternalSemAdapt.g:1876:1: ( 'semantics' )
            // InternalSemAdapt.g:1877:2: 'semantics'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticsAccess().getSemanticsKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticsAccess().getSemanticsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantics__Group__0__Impl"


    // $ANTLR start "rule__Semantics__Group__1"
    // InternalSemAdapt.g:1886:1: rule__Semantics__Group__1 : rule__Semantics__Group__1__Impl ;
    public final void rule__Semantics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1890:1: ( rule__Semantics__Group__1__Impl )
            // InternalSemAdapt.g:1891:2: rule__Semantics__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Semantics__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantics__Group__1"


    // $ANTLR start "rule__Semantics__Group__1__Impl"
    // InternalSemAdapt.g:1897:1: rule__Semantics__Group__1__Impl : ( ( rule__Semantics__ImportURIAssignment_1 ) ) ;
    public final void rule__Semantics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1901:1: ( ( ( rule__Semantics__ImportURIAssignment_1 ) ) )
            // InternalSemAdapt.g:1902:1: ( ( rule__Semantics__ImportURIAssignment_1 ) )
            {
            // InternalSemAdapt.g:1902:1: ( ( rule__Semantics__ImportURIAssignment_1 ) )
            // InternalSemAdapt.g:1903:2: ( rule__Semantics__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticsAccess().getImportURIAssignment_1()); 
            }
            // InternalSemAdapt.g:1904:2: ( rule__Semantics__ImportURIAssignment_1 )
            // InternalSemAdapt.g:1904:3: rule__Semantics__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Semantics__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticsAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantics__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // InternalSemAdapt.g:1913:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1917:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalSemAdapt.g:1918:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Module__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalSemAdapt.g:1925:1: rule__Module__Group__0__Impl : ( ( rule__Module__NameAssignment_0 ) ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1929:1: ( ( ( rule__Module__NameAssignment_0 ) ) )
            // InternalSemAdapt.g:1930:1: ( ( rule__Module__NameAssignment_0 ) )
            {
            // InternalSemAdapt.g:1930:1: ( ( rule__Module__NameAssignment_0 ) )
            // InternalSemAdapt.g:1931:2: ( rule__Module__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNameAssignment_0()); 
            }
            // InternalSemAdapt.g:1932:2: ( rule__Module__NameAssignment_0 )
            // InternalSemAdapt.g:1932:3: rule__Module__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalSemAdapt.g:1940:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1944:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalSemAdapt.g:1945:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Module__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalSemAdapt.g:1952:1: rule__Module__Group__1__Impl : ( '{' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1956:1: ( ( '{' ) )
            // InternalSemAdapt.g:1957:1: ( '{' )
            {
            // InternalSemAdapt.g:1957:1: ( '{' )
            // InternalSemAdapt.g:1958:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalSemAdapt.g:1967:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1971:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalSemAdapt.g:1972:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Module__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalSemAdapt.g:1979:1: rule__Module__Group__2__Impl : ( ( rule__Module__PointcutsAssignment_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1983:1: ( ( ( rule__Module__PointcutsAssignment_2 )* ) )
            // InternalSemAdapt.g:1984:1: ( ( rule__Module__PointcutsAssignment_2 )* )
            {
            // InternalSemAdapt.g:1984:1: ( ( rule__Module__PointcutsAssignment_2 )* )
            // InternalSemAdapt.g:1985:2: ( rule__Module__PointcutsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPointcutsAssignment_2()); 
            }
            // InternalSemAdapt.g:1986:2: ( rule__Module__PointcutsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16||LA23_0==52) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSemAdapt.g:1986:3: rule__Module__PointcutsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Module__PointcutsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPointcutsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalSemAdapt.g:1994:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1998:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalSemAdapt.g:1999:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Module__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalSemAdapt.g:2006:1: rule__Module__Group__3__Impl : ( ( rule__Module__AdaptationsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2010:1: ( ( ( rule__Module__AdaptationsAssignment_3 )* ) )
            // InternalSemAdapt.g:2011:1: ( ( rule__Module__AdaptationsAssignment_3 )* )
            {
            // InternalSemAdapt.g:2011:1: ( ( rule__Module__AdaptationsAssignment_3 )* )
            // InternalSemAdapt.g:2012:2: ( rule__Module__AdaptationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getAdaptationsAssignment_3()); 
            }
            // InternalSemAdapt.g:2013:2: ( rule__Module__AdaptationsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=19 && LA24_0<=21)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSemAdapt.g:2013:3: rule__Module__AdaptationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Module__AdaptationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getAdaptationsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalSemAdapt.g:2021:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2025:1: ( rule__Module__Group__4__Impl )
            // InternalSemAdapt.g:2026:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalSemAdapt.g:2032:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2036:1: ( ( '}' ) )
            // InternalSemAdapt.g:2037:1: ( '}' )
            {
            // InternalSemAdapt.g:2037:1: ( '}' )
            // InternalSemAdapt.g:2038:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Pointcut__Group__0"
    // InternalSemAdapt.g:2048:1: rule__Pointcut__Group__0 : rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 ;
    public final void rule__Pointcut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2052:1: ( rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 )
            // InternalSemAdapt.g:2053:2: rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Pointcut__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__0"


    // $ANTLR start "rule__Pointcut__Group__0__Impl"
    // InternalSemAdapt.g:2060:1: rule__Pointcut__Group__0__Impl : ( ( rule__Pointcut__RecursiveAssignment_0 )? ) ;
    public final void rule__Pointcut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2064:1: ( ( ( rule__Pointcut__RecursiveAssignment_0 )? ) )
            // InternalSemAdapt.g:2065:1: ( ( rule__Pointcut__RecursiveAssignment_0 )? )
            {
            // InternalSemAdapt.g:2065:1: ( ( rule__Pointcut__RecursiveAssignment_0 )? )
            // InternalSemAdapt.g:2066:2: ( rule__Pointcut__RecursiveAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getRecursiveAssignment_0()); 
            }
            // InternalSemAdapt.g:2067:2: ( rule__Pointcut__RecursiveAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemAdapt.g:2067:3: rule__Pointcut__RecursiveAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pointcut__RecursiveAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getRecursiveAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__0__Impl"


    // $ANTLR start "rule__Pointcut__Group__1"
    // InternalSemAdapt.g:2075:1: rule__Pointcut__Group__1 : rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 ;
    public final void rule__Pointcut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2079:1: ( rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 )
            // InternalSemAdapt.g:2080:2: rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Pointcut__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__1"


    // $ANTLR start "rule__Pointcut__Group__1__Impl"
    // InternalSemAdapt.g:2087:1: rule__Pointcut__Group__1__Impl : ( 'match' ) ;
    public final void rule__Pointcut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2091:1: ( ( 'match' ) )
            // InternalSemAdapt.g:2092:1: ( 'match' )
            {
            // InternalSemAdapt.g:2092:1: ( 'match' )
            // InternalSemAdapt.g:2093:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getMatchKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getMatchKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__1__Impl"


    // $ANTLR start "rule__Pointcut__Group__2"
    // InternalSemAdapt.g:2102:1: rule__Pointcut__Group__2 : rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 ;
    public final void rule__Pointcut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2106:1: ( rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 )
            // InternalSemAdapt.g:2107:2: rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Pointcut__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__2"


    // $ANTLR start "rule__Pointcut__Group__2__Impl"
    // InternalSemAdapt.g:2114:1: rule__Pointcut__Group__2__Impl : ( ( rule__Pointcut__StructureAssignment_2 ) ) ;
    public final void rule__Pointcut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2118:1: ( ( ( rule__Pointcut__StructureAssignment_2 ) ) )
            // InternalSemAdapt.g:2119:1: ( ( rule__Pointcut__StructureAssignment_2 ) )
            {
            // InternalSemAdapt.g:2119:1: ( ( rule__Pointcut__StructureAssignment_2 ) )
            // InternalSemAdapt.g:2120:2: ( rule__Pointcut__StructureAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getStructureAssignment_2()); 
            }
            // InternalSemAdapt.g:2121:2: ( rule__Pointcut__StructureAssignment_2 )
            // InternalSemAdapt.g:2121:3: rule__Pointcut__StructureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__StructureAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getStructureAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__2__Impl"


    // $ANTLR start "rule__Pointcut__Group__3"
    // InternalSemAdapt.g:2129:1: rule__Pointcut__Group__3 : rule__Pointcut__Group__3__Impl ;
    public final void rule__Pointcut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2133:1: ( rule__Pointcut__Group__3__Impl )
            // InternalSemAdapt.g:2134:2: rule__Pointcut__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__3"


    // $ANTLR start "rule__Pointcut__Group__3__Impl"
    // InternalSemAdapt.g:2140:1: rule__Pointcut__Group__3__Impl : ( ( rule__Pointcut__Group_3__0 )? ) ;
    public final void rule__Pointcut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2144:1: ( ( ( rule__Pointcut__Group_3__0 )? ) )
            // InternalSemAdapt.g:2145:1: ( ( rule__Pointcut__Group_3__0 )? )
            {
            // InternalSemAdapt.g:2145:1: ( ( rule__Pointcut__Group_3__0 )? )
            // InternalSemAdapt.g:2146:2: ( rule__Pointcut__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_3()); 
            }
            // InternalSemAdapt.g:2147:2: ( rule__Pointcut__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSemAdapt.g:2147:3: rule__Pointcut__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pointcut__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__3__Impl"


    // $ANTLR start "rule__Pointcut__Group_3__0"
    // InternalSemAdapt.g:2156:1: rule__Pointcut__Group_3__0 : rule__Pointcut__Group_3__0__Impl rule__Pointcut__Group_3__1 ;
    public final void rule__Pointcut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2160:1: ( rule__Pointcut__Group_3__0__Impl rule__Pointcut__Group_3__1 )
            // InternalSemAdapt.g:2161:2: rule__Pointcut__Group_3__0__Impl rule__Pointcut__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Pointcut__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3__0"


    // $ANTLR start "rule__Pointcut__Group_3__0__Impl"
    // InternalSemAdapt.g:2168:1: rule__Pointcut__Group_3__0__Impl : ( 'where' ) ;
    public final void rule__Pointcut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2172:1: ( ( 'where' ) )
            // InternalSemAdapt.g:2173:1: ( 'where' )
            {
            // InternalSemAdapt.g:2173:1: ( 'where' )
            // InternalSemAdapt.g:2174:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getWhereKeyword_3_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getWhereKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3__0__Impl"


    // $ANTLR start "rule__Pointcut__Group_3__1"
    // InternalSemAdapt.g:2183:1: rule__Pointcut__Group_3__1 : rule__Pointcut__Group_3__1__Impl rule__Pointcut__Group_3__2 ;
    public final void rule__Pointcut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2187:1: ( rule__Pointcut__Group_3__1__Impl rule__Pointcut__Group_3__2 )
            // InternalSemAdapt.g:2188:2: rule__Pointcut__Group_3__1__Impl rule__Pointcut__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Pointcut__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3__1"


    // $ANTLR start "rule__Pointcut__Group_3__1__Impl"
    // InternalSemAdapt.g:2195:1: rule__Pointcut__Group_3__1__Impl : ( ( rule__Pointcut__ConditionsAssignment_3_1 ) ) ;
    public final void rule__Pointcut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2199:1: ( ( ( rule__Pointcut__ConditionsAssignment_3_1 ) ) )
            // InternalSemAdapt.g:2200:1: ( ( rule__Pointcut__ConditionsAssignment_3_1 ) )
            {
            // InternalSemAdapt.g:2200:1: ( ( rule__Pointcut__ConditionsAssignment_3_1 ) )
            // InternalSemAdapt.g:2201:2: ( rule__Pointcut__ConditionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getConditionsAssignment_3_1()); 
            }
            // InternalSemAdapt.g:2202:2: ( rule__Pointcut__ConditionsAssignment_3_1 )
            // InternalSemAdapt.g:2202:3: rule__Pointcut__ConditionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__ConditionsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getConditionsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3__1__Impl"


    // $ANTLR start "rule__Pointcut__Group_3__2"
    // InternalSemAdapt.g:2210:1: rule__Pointcut__Group_3__2 : rule__Pointcut__Group_3__2__Impl ;
    public final void rule__Pointcut__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2214:1: ( rule__Pointcut__Group_3__2__Impl )
            // InternalSemAdapt.g:2215:2: rule__Pointcut__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3__2"


    // $ANTLR start "rule__Pointcut__Group_3__2__Impl"
    // InternalSemAdapt.g:2221:1: rule__Pointcut__Group_3__2__Impl : ( ( rule__Pointcut__Group_3_2__0 )* ) ;
    public final void rule__Pointcut__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2225:1: ( ( ( rule__Pointcut__Group_3_2__0 )* ) )
            // InternalSemAdapt.g:2226:1: ( ( rule__Pointcut__Group_3_2__0 )* )
            {
            // InternalSemAdapt.g:2226:1: ( ( rule__Pointcut__Group_3_2__0 )* )
            // InternalSemAdapt.g:2227:2: ( rule__Pointcut__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_3_2()); 
            }
            // InternalSemAdapt.g:2228:2: ( rule__Pointcut__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSemAdapt.g:2228:3: rule__Pointcut__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Pointcut__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3__2__Impl"


    // $ANTLR start "rule__Pointcut__Group_3_2__0"
    // InternalSemAdapt.g:2237:1: rule__Pointcut__Group_3_2__0 : rule__Pointcut__Group_3_2__0__Impl rule__Pointcut__Group_3_2__1 ;
    public final void rule__Pointcut__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2241:1: ( rule__Pointcut__Group_3_2__0__Impl rule__Pointcut__Group_3_2__1 )
            // InternalSemAdapt.g:2242:2: rule__Pointcut__Group_3_2__0__Impl rule__Pointcut__Group_3_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Pointcut__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3_2__0"


    // $ANTLR start "rule__Pointcut__Group_3_2__0__Impl"
    // InternalSemAdapt.g:2249:1: rule__Pointcut__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Pointcut__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2253:1: ( ( ',' ) )
            // InternalSemAdapt.g:2254:1: ( ',' )
            {
            // InternalSemAdapt.g:2254:1: ( ',' )
            // InternalSemAdapt.g:2255:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3_2__0__Impl"


    // $ANTLR start "rule__Pointcut__Group_3_2__1"
    // InternalSemAdapt.g:2264:1: rule__Pointcut__Group_3_2__1 : rule__Pointcut__Group_3_2__1__Impl ;
    public final void rule__Pointcut__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2268:1: ( rule__Pointcut__Group_3_2__1__Impl )
            // InternalSemAdapt.g:2269:2: rule__Pointcut__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3_2__1"


    // $ANTLR start "rule__Pointcut__Group_3_2__1__Impl"
    // InternalSemAdapt.g:2275:1: rule__Pointcut__Group_3_2__1__Impl : ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) ) ;
    public final void rule__Pointcut__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2279:1: ( ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) ) )
            // InternalSemAdapt.g:2280:1: ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) )
            {
            // InternalSemAdapt.g:2280:1: ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) )
            // InternalSemAdapt.g:2281:2: ( rule__Pointcut__ConditionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getConditionsAssignment_3_2_1()); 
            }
            // InternalSemAdapt.g:2282:2: ( rule__Pointcut__ConditionsAssignment_3_2_1 )
            // InternalSemAdapt.g:2282:3: rule__Pointcut__ConditionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__ConditionsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getConditionsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_3_2__1__Impl"


    // $ANTLR start "rule__Adaptation__Group__0"
    // InternalSemAdapt.g:2291:1: rule__Adaptation__Group__0 : rule__Adaptation__Group__0__Impl rule__Adaptation__Group__1 ;
    public final void rule__Adaptation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2295:1: ( rule__Adaptation__Group__0__Impl rule__Adaptation__Group__1 )
            // InternalSemAdapt.g:2296:2: rule__Adaptation__Group__0__Impl rule__Adaptation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Adaptation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group__0"


    // $ANTLR start "rule__Adaptation__Group__0__Impl"
    // InternalSemAdapt.g:2303:1: rule__Adaptation__Group__0__Impl : ( ( rule__Adaptation__Alternatives_0 ) ) ;
    public final void rule__Adaptation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2307:1: ( ( ( rule__Adaptation__Alternatives_0 ) ) )
            // InternalSemAdapt.g:2308:1: ( ( rule__Adaptation__Alternatives_0 ) )
            {
            // InternalSemAdapt.g:2308:1: ( ( rule__Adaptation__Alternatives_0 ) )
            // InternalSemAdapt.g:2309:2: ( rule__Adaptation__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAlternatives_0()); 
            }
            // InternalSemAdapt.g:2310:2: ( rule__Adaptation__Alternatives_0 )
            // InternalSemAdapt.g:2310:3: rule__Adaptation__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group__0__Impl"


    // $ANTLR start "rule__Adaptation__Group__1"
    // InternalSemAdapt.g:2318:1: rule__Adaptation__Group__1 : rule__Adaptation__Group__1__Impl rule__Adaptation__Group__2 ;
    public final void rule__Adaptation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2322:1: ( rule__Adaptation__Group__1__Impl rule__Adaptation__Group__2 )
            // InternalSemAdapt.g:2323:2: rule__Adaptation__Group__1__Impl rule__Adaptation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Adaptation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group__1"


    // $ANTLR start "rule__Adaptation__Group__1__Impl"
    // InternalSemAdapt.g:2330:1: rule__Adaptation__Group__1__Impl : ( ( rule__Adaptation__TargetAssignment_1 ) ) ;
    public final void rule__Adaptation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2334:1: ( ( ( rule__Adaptation__TargetAssignment_1 ) ) )
            // InternalSemAdapt.g:2335:1: ( ( rule__Adaptation__TargetAssignment_1 ) )
            {
            // InternalSemAdapt.g:2335:1: ( ( rule__Adaptation__TargetAssignment_1 ) )
            // InternalSemAdapt.g:2336:2: ( rule__Adaptation__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getTargetAssignment_1()); 
            }
            // InternalSemAdapt.g:2337:2: ( rule__Adaptation__TargetAssignment_1 )
            // InternalSemAdapt.g:2337:3: rule__Adaptation__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__TargetAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getTargetAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group__1__Impl"


    // $ANTLR start "rule__Adaptation__Group__2"
    // InternalSemAdapt.g:2345:1: rule__Adaptation__Group__2 : rule__Adaptation__Group__2__Impl ;
    public final void rule__Adaptation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2349:1: ( rule__Adaptation__Group__2__Impl )
            // InternalSemAdapt.g:2350:2: rule__Adaptation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group__2"


    // $ANTLR start "rule__Adaptation__Group__2__Impl"
    // InternalSemAdapt.g:2356:1: rule__Adaptation__Group__2__Impl : ( ( rule__Adaptation__AdaptationAssignment_2 ) ) ;
    public final void rule__Adaptation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2360:1: ( ( ( rule__Adaptation__AdaptationAssignment_2 ) ) )
            // InternalSemAdapt.g:2361:1: ( ( rule__Adaptation__AdaptationAssignment_2 ) )
            {
            // InternalSemAdapt.g:2361:1: ( ( rule__Adaptation__AdaptationAssignment_2 ) )
            // InternalSemAdapt.g:2362:2: ( rule__Adaptation__AdaptationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAdaptationAssignment_2()); 
            }
            // InternalSemAdapt.g:2363:2: ( rule__Adaptation__AdaptationAssignment_2 )
            // InternalSemAdapt.g:2363:3: rule__Adaptation__AdaptationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__AdaptationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getAdaptationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group__2__Impl"


    // $ANTLR start "rule__Adaptation__Group_0_0__0"
    // InternalSemAdapt.g:2372:1: rule__Adaptation__Group_0_0__0 : rule__Adaptation__Group_0_0__0__Impl rule__Adaptation__Group_0_0__1 ;
    public final void rule__Adaptation__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2376:1: ( rule__Adaptation__Group_0_0__0__Impl rule__Adaptation__Group_0_0__1 )
            // InternalSemAdapt.g:2377:2: rule__Adaptation__Group_0_0__0__Impl rule__Adaptation__Group_0_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Adaptation__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_0__0"


    // $ANTLR start "rule__Adaptation__Group_0_0__0__Impl"
    // InternalSemAdapt.g:2384:1: rule__Adaptation__Group_0_0__0__Impl : ( () ) ;
    public final void rule__Adaptation__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2388:1: ( ( () ) )
            // InternalSemAdapt.g:2389:1: ( () )
            {
            // InternalSemAdapt.g:2389:1: ( () )
            // InternalSemAdapt.g:2390:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getSpecializationAction_0_0_0()); 
            }
            // InternalSemAdapt.g:2391:2: ()
            // InternalSemAdapt.g:2391:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getSpecializationAction_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_0__0__Impl"


    // $ANTLR start "rule__Adaptation__Group_0_0__1"
    // InternalSemAdapt.g:2399:1: rule__Adaptation__Group_0_0__1 : rule__Adaptation__Group_0_0__1__Impl ;
    public final void rule__Adaptation__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2403:1: ( rule__Adaptation__Group_0_0__1__Impl )
            // InternalSemAdapt.g:2404:2: rule__Adaptation__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_0__1"


    // $ANTLR start "rule__Adaptation__Group_0_0__1__Impl"
    // InternalSemAdapt.g:2410:1: rule__Adaptation__Group_0_0__1__Impl : ( 'Specialization' ) ;
    public final void rule__Adaptation__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2414:1: ( ( 'Specialization' ) )
            // InternalSemAdapt.g:2415:1: ( 'Specialization' )
            {
            // InternalSemAdapt.g:2415:1: ( 'Specialization' )
            // InternalSemAdapt.g:2416:2: 'Specialization'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getSpecializationKeyword_0_0_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getSpecializationKeyword_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_0__1__Impl"


    // $ANTLR start "rule__Adaptation__Group_0_1__0"
    // InternalSemAdapt.g:2426:1: rule__Adaptation__Group_0_1__0 : rule__Adaptation__Group_0_1__0__Impl rule__Adaptation__Group_0_1__1 ;
    public final void rule__Adaptation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2430:1: ( rule__Adaptation__Group_0_1__0__Impl rule__Adaptation__Group_0_1__1 )
            // InternalSemAdapt.g:2431:2: rule__Adaptation__Group_0_1__0__Impl rule__Adaptation__Group_0_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Adaptation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_1__0"


    // $ANTLR start "rule__Adaptation__Group_0_1__0__Impl"
    // InternalSemAdapt.g:2438:1: rule__Adaptation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__Adaptation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2442:1: ( ( () ) )
            // InternalSemAdapt.g:2443:1: ( () )
            {
            // InternalSemAdapt.g:2443:1: ( () )
            // InternalSemAdapt.g:2444:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getBeforeAction_0_1_0()); 
            }
            // InternalSemAdapt.g:2445:2: ()
            // InternalSemAdapt.g:2445:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getBeforeAction_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_1__0__Impl"


    // $ANTLR start "rule__Adaptation__Group_0_1__1"
    // InternalSemAdapt.g:2453:1: rule__Adaptation__Group_0_1__1 : rule__Adaptation__Group_0_1__1__Impl ;
    public final void rule__Adaptation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2457:1: ( rule__Adaptation__Group_0_1__1__Impl )
            // InternalSemAdapt.g:2458:2: rule__Adaptation__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_1__1"


    // $ANTLR start "rule__Adaptation__Group_0_1__1__Impl"
    // InternalSemAdapt.g:2464:1: rule__Adaptation__Group_0_1__1__Impl : ( 'Before' ) ;
    public final void rule__Adaptation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2468:1: ( ( 'Before' ) )
            // InternalSemAdapt.g:2469:1: ( 'Before' )
            {
            // InternalSemAdapt.g:2469:1: ( 'Before' )
            // InternalSemAdapt.g:2470:2: 'Before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getBeforeKeyword_0_1_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getBeforeKeyword_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_1__1__Impl"


    // $ANTLR start "rule__Adaptation__Group_0_2__0"
    // InternalSemAdapt.g:2480:1: rule__Adaptation__Group_0_2__0 : rule__Adaptation__Group_0_2__0__Impl rule__Adaptation__Group_0_2__1 ;
    public final void rule__Adaptation__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2484:1: ( rule__Adaptation__Group_0_2__0__Impl rule__Adaptation__Group_0_2__1 )
            // InternalSemAdapt.g:2485:2: rule__Adaptation__Group_0_2__0__Impl rule__Adaptation__Group_0_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Adaptation__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_2__0"


    // $ANTLR start "rule__Adaptation__Group_0_2__0__Impl"
    // InternalSemAdapt.g:2492:1: rule__Adaptation__Group_0_2__0__Impl : ( () ) ;
    public final void rule__Adaptation__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2496:1: ( ( () ) )
            // InternalSemAdapt.g:2497:1: ( () )
            {
            // InternalSemAdapt.g:2497:1: ( () )
            // InternalSemAdapt.g:2498:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAfterAction_0_2_0()); 
            }
            // InternalSemAdapt.g:2499:2: ()
            // InternalSemAdapt.g:2499:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getAfterAction_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_2__0__Impl"


    // $ANTLR start "rule__Adaptation__Group_0_2__1"
    // InternalSemAdapt.g:2507:1: rule__Adaptation__Group_0_2__1 : rule__Adaptation__Group_0_2__1__Impl ;
    public final void rule__Adaptation__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2511:1: ( rule__Adaptation__Group_0_2__1__Impl )
            // InternalSemAdapt.g:2512:2: rule__Adaptation__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Adaptation__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_2__1"


    // $ANTLR start "rule__Adaptation__Group_0_2__1__Impl"
    // InternalSemAdapt.g:2518:1: rule__Adaptation__Group_0_2__1__Impl : ( 'After' ) ;
    public final void rule__Adaptation__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2522:1: ( ( 'After' ) )
            // InternalSemAdapt.g:2523:1: ( 'After' )
            {
            // InternalSemAdapt.g:2523:1: ( 'After' )
            // InternalSemAdapt.g:2524:2: 'After'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAfterKeyword_0_2_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getAfterKeyword_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__Group_0_2__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSemAdapt.g:2534:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2538:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSemAdapt.g:2539:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSemAdapt.g:2546:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2550:1: ( ( 'model' ) )
            // InternalSemAdapt.g:2551:1: ( 'model' )
            {
            // InternalSemAdapt.g:2551:1: ( 'model' )
            // InternalSemAdapt.g:2552:2: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:2561:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2565:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSemAdapt.g:2566:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSemAdapt.g:2573:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportURIAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2577:1: ( ( ( rule__Model__ImportURIAssignment_1 ) ) )
            // InternalSemAdapt.g:2578:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            {
            // InternalSemAdapt.g:2578:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            // InternalSemAdapt.g:2579:2: ( rule__Model__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            }
            // InternalSemAdapt.g:2580:2: ( rule__Model__ImportURIAssignment_1 )
            // InternalSemAdapt.g:2580:3: rule__Model__ImportURIAssignment_1
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
    // InternalSemAdapt.g:2588:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2592:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSemAdapt.g:2593:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:2600:1: rule__Model__Group__2__Impl : ( 'with' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2604:1: ( ( 'with' ) )
            // InternalSemAdapt.g:2605:1: ( 'with' )
            {
            // InternalSemAdapt.g:2605:1: ( 'with' )
            // InternalSemAdapt.g:2606:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getWithKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:2615:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2619:1: ( rule__Model__Group__3__Impl )
            // InternalSemAdapt.g:2620:2: rule__Model__Group__3__Impl
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
    // InternalSemAdapt.g:2626:1: rule__Model__Group__3__Impl : ( ( rule__Model__SemanticdomainAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2630:1: ( ( ( rule__Model__SemanticdomainAssignment_3 ) ) )
            // InternalSemAdapt.g:2631:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            {
            // InternalSemAdapt.g:2631:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            // InternalSemAdapt.g:2632:2: ( rule__Model__SemanticdomainAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainAssignment_3()); 
            }
            // InternalSemAdapt.g:2633:2: ( rule__Model__SemanticdomainAssignment_3 )
            // InternalSemAdapt.g:2633:3: rule__Model__SemanticdomainAssignment_3
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
    // InternalSemAdapt.g:2642:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2646:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSemAdapt.g:2647:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSemAdapt.g:2654:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2658:1: ( ( 'import' ) )
            // InternalSemAdapt.g:2659:1: ( 'import' )
            {
            // InternalSemAdapt.g:2659:1: ( 'import' )
            // InternalSemAdapt.g:2660:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:2669:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2673:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalSemAdapt.g:2674:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSemAdapt.g:2681:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2685:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalSemAdapt.g:2686:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalSemAdapt.g:2686:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalSemAdapt.g:2687:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalSemAdapt.g:2688:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalSemAdapt.g:2688:3: rule__Import__ImportURIAssignment_1
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
    // InternalSemAdapt.g:2696:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2700:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalSemAdapt.g:2701:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:2708:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2712:1: ( ( 'as' ) )
            // InternalSemAdapt.g:2713:1: ( 'as' )
            {
            // InternalSemAdapt.g:2713:1: ( 'as' )
            // InternalSemAdapt.g:2714:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:2723:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2727:1: ( rule__Import__Group__3__Impl )
            // InternalSemAdapt.g:2728:2: rule__Import__Group__3__Impl
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
    // InternalSemAdapt.g:2734:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2738:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalSemAdapt.g:2739:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalSemAdapt.g:2739:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalSemAdapt.g:2740:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalSemAdapt.g:2741:2: ( rule__Import__NameAssignment_3 )
            // InternalSemAdapt.g:2741:3: rule__Import__NameAssignment_3
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
    // InternalSemAdapt.g:2750:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2754:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSemAdapt.g:2755:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:2762:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2766:1: ( ( 'rule' ) )
            // InternalSemAdapt.g:2767:1: ( 'rule' )
            {
            // InternalSemAdapt.g:2767:1: ( 'rule' )
            // InternalSemAdapt.g:2768:2: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:2777:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2781:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSemAdapt.g:2782:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSemAdapt.g:2789:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2793:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalSemAdapt.g:2794:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalSemAdapt.g:2794:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalSemAdapt.g:2795:2: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // InternalSemAdapt.g:2796:2: ( rule__Rule__NameAssignment_1 )
            // InternalSemAdapt.g:2796:3: rule__Rule__NameAssignment_1
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
    // InternalSemAdapt.g:2804:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2808:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSemAdapt.g:2809:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:2816:1: rule__Rule__Group__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2820:1: ( ( ',' ) )
            // InternalSemAdapt.g:2821:1: ( ',' )
            {
            // InternalSemAdapt.g:2821:1: ( ',' )
            // InternalSemAdapt.g:2822:2: ','
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
    // InternalSemAdapt.g:2831:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2835:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSemAdapt.g:2836:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSemAdapt.g:2843:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConclusionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2847:1: ( ( ( rule__Rule__ConclusionAssignment_3 ) ) )
            // InternalSemAdapt.g:2848:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            {
            // InternalSemAdapt.g:2848:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            // InternalSemAdapt.g:2849:2: ( rule__Rule__ConclusionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConclusionAssignment_3()); 
            }
            // InternalSemAdapt.g:2850:2: ( rule__Rule__ConclusionAssignment_3 )
            // InternalSemAdapt.g:2850:3: rule__Rule__ConclusionAssignment_3
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
    // InternalSemAdapt.g:2858:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2862:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSemAdapt.g:2863:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalSemAdapt.g:2870:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2874:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalSemAdapt.g:2875:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalSemAdapt.g:2875:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalSemAdapt.g:2876:2: ( rule__Rule__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4()); 
            }
            // InternalSemAdapt.g:2877:2: ( rule__Rule__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSemAdapt.g:2877:3: rule__Rule__Group_4__0
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
    // InternalSemAdapt.g:2885:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2889:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalSemAdapt.g:2890:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalSemAdapt.g:2897:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2901:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalSemAdapt.g:2902:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalSemAdapt.g:2902:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalSemAdapt.g:2903:2: ( rule__Rule__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5()); 
            }
            // InternalSemAdapt.g:2904:2: ( rule__Rule__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSemAdapt.g:2904:3: rule__Rule__Group_5__0
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
    // InternalSemAdapt.g:2912:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2916:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalSemAdapt.g:2917:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalSemAdapt.g:2924:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2928:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalSemAdapt.g:2929:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalSemAdapt.g:2929:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalSemAdapt.g:2930:2: ( rule__Rule__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6()); 
            }
            // InternalSemAdapt.g:2931:2: ( rule__Rule__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemAdapt.g:2931:3: rule__Rule__Group_6__0
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
    // InternalSemAdapt.g:2939:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2943:1: ( rule__Rule__Group__7__Impl )
            // InternalSemAdapt.g:2944:2: rule__Rule__Group__7__Impl
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
    // InternalSemAdapt.g:2950:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )? ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2954:1: ( ( ( rule__Rule__Group_7__0 )? ) )
            // InternalSemAdapt.g:2955:1: ( ( rule__Rule__Group_7__0 )? )
            {
            // InternalSemAdapt.g:2955:1: ( ( rule__Rule__Group_7__0 )? )
            // InternalSemAdapt.g:2956:2: ( rule__Rule__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7()); 
            }
            // InternalSemAdapt.g:2957:2: ( rule__Rule__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSemAdapt.g:2957:3: rule__Rule__Group_7__0
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
    // InternalSemAdapt.g:2966:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2970:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalSemAdapt.g:2971:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:2978:1: rule__Rule__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2982:1: ( ( 'where' ) )
            // InternalSemAdapt.g:2983:1: ( 'where' )
            {
            // InternalSemAdapt.g:2983:1: ( 'where' )
            // InternalSemAdapt.g:2984:2: 'where'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getWhereKeyword_4_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:2993:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2997:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalSemAdapt.g:2998:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemAdapt.g:3005:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3009:1: ( ( ( rule__Rule__ConditionsAssignment_4_1 ) ) )
            // InternalSemAdapt.g:3010:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            {
            // InternalSemAdapt.g:3010:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            // InternalSemAdapt.g:3011:2: ( rule__Rule__ConditionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_1()); 
            }
            // InternalSemAdapt.g:3012:2: ( rule__Rule__ConditionsAssignment_4_1 )
            // InternalSemAdapt.g:3012:3: rule__Rule__ConditionsAssignment_4_1
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
    // InternalSemAdapt.g:3020:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3024:1: ( rule__Rule__Group_4__2__Impl )
            // InternalSemAdapt.g:3025:2: rule__Rule__Group_4__2__Impl
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
    // InternalSemAdapt.g:3031:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3035:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalSemAdapt.g:3036:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalSemAdapt.g:3036:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalSemAdapt.g:3037:2: ( rule__Rule__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            }
            // InternalSemAdapt.g:3038:2: ( rule__Rule__Group_4_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSemAdapt.g:3038:3: rule__Rule__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Rule__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSemAdapt.g:3047:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3051:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalSemAdapt.g:3052:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:3059:1: rule__Rule__Group_4_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3063:1: ( ( ';' ) )
            // InternalSemAdapt.g:3064:1: ( ';' )
            {
            // InternalSemAdapt.g:3064:1: ( ';' )
            // InternalSemAdapt.g:3065:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_4_2_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3074:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3078:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalSemAdapt.g:3079:2: rule__Rule__Group_4_2__1__Impl
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
    // InternalSemAdapt.g:3085:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3089:1: ( ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) )
            // InternalSemAdapt.g:3090:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            {
            // InternalSemAdapt.g:3090:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            // InternalSemAdapt.g:3091:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_2_1()); 
            }
            // InternalSemAdapt.g:3092:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            // InternalSemAdapt.g:3092:3: rule__Rule__ConditionsAssignment_4_2_1
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
    // InternalSemAdapt.g:3101:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3105:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalSemAdapt.g:3106:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:3113:1: rule__Rule__Group_5__0__Impl : ( 'resolve' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3117:1: ( ( 'resolve' ) )
            // InternalSemAdapt.g:3118:1: ( 'resolve' )
            {
            // InternalSemAdapt.g:3118:1: ( 'resolve' )
            // InternalSemAdapt.g:3119:2: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getResolveKeyword_5_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3128:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3132:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalSemAdapt.g:3133:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemAdapt.g:3140:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__PremisesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3144:1: ( ( ( rule__Rule__PremisesAssignment_5_1 ) ) )
            // InternalSemAdapt.g:3145:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            {
            // InternalSemAdapt.g:3145:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            // InternalSemAdapt.g:3146:2: ( rule__Rule__PremisesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_1()); 
            }
            // InternalSemAdapt.g:3147:2: ( rule__Rule__PremisesAssignment_5_1 )
            // InternalSemAdapt.g:3147:3: rule__Rule__PremisesAssignment_5_1
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
    // InternalSemAdapt.g:3155:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3159:1: ( rule__Rule__Group_5__2__Impl )
            // InternalSemAdapt.g:3160:2: rule__Rule__Group_5__2__Impl
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
    // InternalSemAdapt.g:3166:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Group_5_2__0 )* ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3170:1: ( ( ( rule__Rule__Group_5_2__0 )* ) )
            // InternalSemAdapt.g:3171:1: ( ( rule__Rule__Group_5_2__0 )* )
            {
            // InternalSemAdapt.g:3171:1: ( ( rule__Rule__Group_5_2__0 )* )
            // InternalSemAdapt.g:3172:2: ( rule__Rule__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5_2()); 
            }
            // InternalSemAdapt.g:3173:2: ( rule__Rule__Group_5_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSemAdapt.g:3173:3: rule__Rule__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Rule__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalSemAdapt.g:3182:1: rule__Rule__Group_5_2__0 : rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 ;
    public final void rule__Rule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3186:1: ( rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 )
            // InternalSemAdapt.g:3187:2: rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:3194:1: rule__Rule__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3198:1: ( ( ';' ) )
            // InternalSemAdapt.g:3199:1: ( ';' )
            {
            // InternalSemAdapt.g:3199:1: ( ';' )
            // InternalSemAdapt.g:3200:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_5_2_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3209:1: rule__Rule__Group_5_2__1 : rule__Rule__Group_5_2__1__Impl ;
    public final void rule__Rule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3213:1: ( rule__Rule__Group_5_2__1__Impl )
            // InternalSemAdapt.g:3214:2: rule__Rule__Group_5_2__1__Impl
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
    // InternalSemAdapt.g:3220:1: rule__Rule__Group_5_2__1__Impl : ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) ;
    public final void rule__Rule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3224:1: ( ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) )
            // InternalSemAdapt.g:3225:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            {
            // InternalSemAdapt.g:3225:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            // InternalSemAdapt.g:3226:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_2_1()); 
            }
            // InternalSemAdapt.g:3227:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            // InternalSemAdapt.g:3227:3: rule__Rule__PremisesAssignment_5_2_1
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
    // InternalSemAdapt.g:3236:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3240:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalSemAdapt.g:3241:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemAdapt.g:3248:1: rule__Rule__Group_6__0__Impl : ( 'bind' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3252:1: ( ( 'bind' ) )
            // InternalSemAdapt.g:3253:1: ( 'bind' )
            {
            // InternalSemAdapt.g:3253:1: ( 'bind' )
            // InternalSemAdapt.g:3254:2: 'bind'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindKeyword_6_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3263:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3267:1: ( rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 )
            // InternalSemAdapt.g:3268:2: rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemAdapt.g:3275:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__BindingsAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3279:1: ( ( ( rule__Rule__BindingsAssignment_6_1 ) ) )
            // InternalSemAdapt.g:3280:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            {
            // InternalSemAdapt.g:3280:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            // InternalSemAdapt.g:3281:2: ( rule__Rule__BindingsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_1()); 
            }
            // InternalSemAdapt.g:3282:2: ( rule__Rule__BindingsAssignment_6_1 )
            // InternalSemAdapt.g:3282:3: rule__Rule__BindingsAssignment_6_1
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
    // InternalSemAdapt.g:3290:1: rule__Rule__Group_6__2 : rule__Rule__Group_6__2__Impl ;
    public final void rule__Rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3294:1: ( rule__Rule__Group_6__2__Impl )
            // InternalSemAdapt.g:3295:2: rule__Rule__Group_6__2__Impl
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
    // InternalSemAdapt.g:3301:1: rule__Rule__Group_6__2__Impl : ( ( rule__Rule__Group_6_2__0 )* ) ;
    public final void rule__Rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3305:1: ( ( ( rule__Rule__Group_6_2__0 )* ) )
            // InternalSemAdapt.g:3306:1: ( ( rule__Rule__Group_6_2__0 )* )
            {
            // InternalSemAdapt.g:3306:1: ( ( rule__Rule__Group_6_2__0 )* )
            // InternalSemAdapt.g:3307:2: ( rule__Rule__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6_2()); 
            }
            // InternalSemAdapt.g:3308:2: ( rule__Rule__Group_6_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSemAdapt.g:3308:3: rule__Rule__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Rule__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalSemAdapt.g:3317:1: rule__Rule__Group_6_2__0 : rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 ;
    public final void rule__Rule__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3321:1: ( rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 )
            // InternalSemAdapt.g:3322:2: rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemAdapt.g:3329:1: rule__Rule__Group_6_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3333:1: ( ( ';' ) )
            // InternalSemAdapt.g:3334:1: ( ';' )
            {
            // InternalSemAdapt.g:3334:1: ( ';' )
            // InternalSemAdapt.g:3335:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_6_2_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3344:1: rule__Rule__Group_6_2__1 : rule__Rule__Group_6_2__1__Impl ;
    public final void rule__Rule__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3348:1: ( rule__Rule__Group_6_2__1__Impl )
            // InternalSemAdapt.g:3349:2: rule__Rule__Group_6_2__1__Impl
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
    // InternalSemAdapt.g:3355:1: rule__Rule__Group_6_2__1__Impl : ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) ;
    public final void rule__Rule__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3359:1: ( ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) )
            // InternalSemAdapt.g:3360:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            {
            // InternalSemAdapt.g:3360:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            // InternalSemAdapt.g:3361:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_2_1()); 
            }
            // InternalSemAdapt.g:3362:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            // InternalSemAdapt.g:3362:3: rule__Rule__BindingsAssignment_6_2_1
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
    // InternalSemAdapt.g:3371:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3375:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalSemAdapt.g:3376:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemAdapt.g:3383:1: rule__Rule__Group_7__0__Impl : ( 'IO' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3387:1: ( ( 'IO' ) )
            // InternalSemAdapt.g:3388:1: ( 'IO' )
            {
            // InternalSemAdapt.g:3388:1: ( 'IO' )
            // InternalSemAdapt.g:3389:2: 'IO'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getIOKeyword_7_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3398:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3402:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // InternalSemAdapt.g:3403:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemAdapt.g:3410:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Alternatives_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3414:1: ( ( ( rule__Rule__Alternatives_7_1 ) ) )
            // InternalSemAdapt.g:3415:1: ( ( rule__Rule__Alternatives_7_1 ) )
            {
            // InternalSemAdapt.g:3415:1: ( ( rule__Rule__Alternatives_7_1 ) )
            // InternalSemAdapt.g:3416:2: ( rule__Rule__Alternatives_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_1()); 
            }
            // InternalSemAdapt.g:3417:2: ( rule__Rule__Alternatives_7_1 )
            // InternalSemAdapt.g:3417:3: rule__Rule__Alternatives_7_1
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
    // InternalSemAdapt.g:3425:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3429:1: ( rule__Rule__Group_7__2__Impl )
            // InternalSemAdapt.g:3430:2: rule__Rule__Group_7__2__Impl
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
    // InternalSemAdapt.g:3436:1: rule__Rule__Group_7__2__Impl : ( ( rule__Rule__Group_7_2__0 )* ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3440:1: ( ( ( rule__Rule__Group_7_2__0 )* ) )
            // InternalSemAdapt.g:3441:1: ( ( rule__Rule__Group_7_2__0 )* )
            {
            // InternalSemAdapt.g:3441:1: ( ( rule__Rule__Group_7_2__0 )* )
            // InternalSemAdapt.g:3442:2: ( rule__Rule__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7_2()); 
            }
            // InternalSemAdapt.g:3443:2: ( rule__Rule__Group_7_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSemAdapt.g:3443:3: rule__Rule__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Rule__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSemAdapt.g:3452:1: rule__Rule__Group_7_2__0 : rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 ;
    public final void rule__Rule__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3456:1: ( rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 )
            // InternalSemAdapt.g:3457:2: rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemAdapt.g:3464:1: rule__Rule__Group_7_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3468:1: ( ( ';' ) )
            // InternalSemAdapt.g:3469:1: ( ';' )
            {
            // InternalSemAdapt.g:3469:1: ( ';' )
            // InternalSemAdapt.g:3470:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getSemicolonKeyword_7_2_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3479:1: rule__Rule__Group_7_2__1 : rule__Rule__Group_7_2__1__Impl ;
    public final void rule__Rule__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3483:1: ( rule__Rule__Group_7_2__1__Impl )
            // InternalSemAdapt.g:3484:2: rule__Rule__Group_7_2__1__Impl
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
    // InternalSemAdapt.g:3490:1: rule__Rule__Group_7_2__1__Impl : ( ( rule__Rule__Alternatives_7_2_1 ) ) ;
    public final void rule__Rule__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3494:1: ( ( ( rule__Rule__Alternatives_7_2_1 ) ) )
            // InternalSemAdapt.g:3495:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            {
            // InternalSemAdapt.g:3495:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            // InternalSemAdapt.g:3496:2: ( rule__Rule__Alternatives_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_2_1()); 
            }
            // InternalSemAdapt.g:3497:2: ( rule__Rule__Alternatives_7_2_1 )
            // InternalSemAdapt.g:3497:3: rule__Rule__Alternatives_7_2_1
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
    // InternalSemAdapt.g:3506:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3510:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalSemAdapt.g:3511:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:3518:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3522:1: ( ( () ) )
            // InternalSemAdapt.g:3523:1: ( () )
            {
            // InternalSemAdapt.g:3523:1: ( () )
            // InternalSemAdapt.g:3524:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalSemAdapt.g:3525:2: ()
            // InternalSemAdapt.g:3525:3: 
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
    // InternalSemAdapt.g:3533:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3537:1: ( rule__Condition__Group__1__Impl )
            // InternalSemAdapt.g:3538:2: rule__Condition__Group__1__Impl
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
    // InternalSemAdapt.g:3544:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CondAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3548:1: ( ( ( rule__Condition__CondAssignment_1 ) ) )
            // InternalSemAdapt.g:3549:1: ( ( rule__Condition__CondAssignment_1 ) )
            {
            // InternalSemAdapt.g:3549:1: ( ( rule__Condition__CondAssignment_1 ) )
            // InternalSemAdapt.g:3550:2: ( rule__Condition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCondAssignment_1()); 
            }
            // InternalSemAdapt.g:3551:2: ( rule__Condition__CondAssignment_1 )
            // InternalSemAdapt.g:3551:3: rule__Condition__CondAssignment_1
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
    // InternalSemAdapt.g:3560:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3564:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalSemAdapt.g:3565:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSemAdapt.g:3572:1: rule__Input__Group__0__Impl : ( ( rule__Input__AssigneeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3576:1: ( ( ( rule__Input__AssigneeAssignment_0 ) ) )
            // InternalSemAdapt.g:3577:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            {
            // InternalSemAdapt.g:3577:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            // InternalSemAdapt.g:3578:2: ( rule__Input__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAssigneeAssignment_0()); 
            }
            // InternalSemAdapt.g:3579:2: ( rule__Input__AssigneeAssignment_0 )
            // InternalSemAdapt.g:3579:3: rule__Input__AssigneeAssignment_0
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
    // InternalSemAdapt.g:3587:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3591:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalSemAdapt.g:3592:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemAdapt.g:3599:1: rule__Input__Group__1__Impl : ( '=' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3603:1: ( ( '=' ) )
            // InternalSemAdapt.g:3604:1: ( '=' )
            {
            // InternalSemAdapt.g:3604:1: ( '=' )
            // InternalSemAdapt.g:3605:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getEqualsSignKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3614:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3618:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalSemAdapt.g:3619:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemAdapt.g:3626:1: rule__Input__Group__2__Impl : ( ( rule__Input__OperationAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3630:1: ( ( ( rule__Input__OperationAssignment_2 ) ) )
            // InternalSemAdapt.g:3631:1: ( ( rule__Input__OperationAssignment_2 ) )
            {
            // InternalSemAdapt.g:3631:1: ( ( rule__Input__OperationAssignment_2 ) )
            // InternalSemAdapt.g:3632:2: ( rule__Input__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationAssignment_2()); 
            }
            // InternalSemAdapt.g:3633:2: ( rule__Input__OperationAssignment_2 )
            // InternalSemAdapt.g:3633:3: rule__Input__OperationAssignment_2
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
    // InternalSemAdapt.g:3641:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3645:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalSemAdapt.g:3646:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSemAdapt.g:3653:1: rule__Input__Group__3__Impl : ( '(' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3657:1: ( ( '(' ) )
            // InternalSemAdapt.g:3658:1: ( '(' )
            {
            // InternalSemAdapt.g:3658:1: ( '(' )
            // InternalSemAdapt.g:3659:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3668:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3672:1: ( rule__Input__Group__4__Impl )
            // InternalSemAdapt.g:3673:2: rule__Input__Group__4__Impl
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
    // InternalSemAdapt.g:3679:1: rule__Input__Group__4__Impl : ( ')' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3683:1: ( ( ')' ) )
            // InternalSemAdapt.g:3684:1: ( ')' )
            {
            // InternalSemAdapt.g:3684:1: ( ')' )
            // InternalSemAdapt.g:3685:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3695:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3699:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalSemAdapt.g:3700:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemAdapt.g:3707:1: rule__Output__Group__0__Impl : ( ( rule__Output__OperationAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3711:1: ( ( ( rule__Output__OperationAssignment_0 ) ) )
            // InternalSemAdapt.g:3712:1: ( ( rule__Output__OperationAssignment_0 ) )
            {
            // InternalSemAdapt.g:3712:1: ( ( rule__Output__OperationAssignment_0 ) )
            // InternalSemAdapt.g:3713:2: ( rule__Output__OperationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationAssignment_0()); 
            }
            // InternalSemAdapt.g:3714:2: ( rule__Output__OperationAssignment_0 )
            // InternalSemAdapt.g:3714:3: rule__Output__OperationAssignment_0
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
    // InternalSemAdapt.g:3722:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3726:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalSemAdapt.g:3727:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSemAdapt.g:3734:1: rule__Output__Group__1__Impl : ( '(' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3738:1: ( ( '(' ) )
            // InternalSemAdapt.g:3739:1: ( '(' )
            {
            // InternalSemAdapt.g:3739:1: ( '(' )
            // InternalSemAdapt.g:3740:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3749:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3753:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalSemAdapt.g:3754:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalSemAdapt.g:3761:1: rule__Output__Group__2__Impl : ( ( rule__Output__Group_2__0 )? ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3765:1: ( ( ( rule__Output__Group_2__0 )? ) )
            // InternalSemAdapt.g:3766:1: ( ( rule__Output__Group_2__0 )? )
            {
            // InternalSemAdapt.g:3766:1: ( ( rule__Output__Group_2__0 )? )
            // InternalSemAdapt.g:3767:2: ( rule__Output__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2()); 
            }
            // InternalSemAdapt.g:3768:2: ( rule__Output__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==37||LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSemAdapt.g:3768:3: rule__Output__Group_2__0
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
    // InternalSemAdapt.g:3776:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3780:1: ( rule__Output__Group__3__Impl )
            // InternalSemAdapt.g:3781:2: rule__Output__Group__3__Impl
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
    // InternalSemAdapt.g:3787:1: rule__Output__Group__3__Impl : ( ')' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3791:1: ( ( ')' ) )
            // InternalSemAdapt.g:3792:1: ( ')' )
            {
            // InternalSemAdapt.g:3792:1: ( ')' )
            // InternalSemAdapt.g:3793:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3803:1: rule__Output__Group_2__0 : rule__Output__Group_2__0__Impl rule__Output__Group_2__1 ;
    public final void rule__Output__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3807:1: ( rule__Output__Group_2__0__Impl rule__Output__Group_2__1 )
            // InternalSemAdapt.g:3808:2: rule__Output__Group_2__0__Impl rule__Output__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSemAdapt.g:3815:1: rule__Output__Group_2__0__Impl : ( ( rule__Output__ArgsAssignment_2_0 ) ) ;
    public final void rule__Output__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3819:1: ( ( ( rule__Output__ArgsAssignment_2_0 ) ) )
            // InternalSemAdapt.g:3820:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            {
            // InternalSemAdapt.g:3820:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            // InternalSemAdapt.g:3821:2: ( rule__Output__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_0()); 
            }
            // InternalSemAdapt.g:3822:2: ( rule__Output__ArgsAssignment_2_0 )
            // InternalSemAdapt.g:3822:3: rule__Output__ArgsAssignment_2_0
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
    // InternalSemAdapt.g:3830:1: rule__Output__Group_2__1 : rule__Output__Group_2__1__Impl ;
    public final void rule__Output__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3834:1: ( rule__Output__Group_2__1__Impl )
            // InternalSemAdapt.g:3835:2: rule__Output__Group_2__1__Impl
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
    // InternalSemAdapt.g:3841:1: rule__Output__Group_2__1__Impl : ( ( rule__Output__Group_2_1__0 )* ) ;
    public final void rule__Output__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3845:1: ( ( ( rule__Output__Group_2_1__0 )* ) )
            // InternalSemAdapt.g:3846:1: ( ( rule__Output__Group_2_1__0 )* )
            {
            // InternalSemAdapt.g:3846:1: ( ( rule__Output__Group_2_1__0 )* )
            // InternalSemAdapt.g:3847:2: ( rule__Output__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2_1()); 
            }
            // InternalSemAdapt.g:3848:2: ( rule__Output__Group_2_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSemAdapt.g:3848:3: rule__Output__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalSemAdapt.g:3857:1: rule__Output__Group_2_1__0 : rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 ;
    public final void rule__Output__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3861:1: ( rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 )
            // InternalSemAdapt.g:3862:2: rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSemAdapt.g:3869:1: rule__Output__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3873:1: ( ( ',' ) )
            // InternalSemAdapt.g:3874:1: ( ',' )
            {
            // InternalSemAdapt.g:3874:1: ( ',' )
            // InternalSemAdapt.g:3875:2: ','
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
    // InternalSemAdapt.g:3884:1: rule__Output__Group_2_1__1 : rule__Output__Group_2_1__1__Impl ;
    public final void rule__Output__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3888:1: ( rule__Output__Group_2_1__1__Impl )
            // InternalSemAdapt.g:3889:2: rule__Output__Group_2_1__1__Impl
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
    // InternalSemAdapt.g:3895:1: rule__Output__Group_2_1__1__Impl : ( ( rule__Output__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Output__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3899:1: ( ( ( rule__Output__ArgsAssignment_2_1_1 ) ) )
            // InternalSemAdapt.g:3900:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            {
            // InternalSemAdapt.g:3900:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            // InternalSemAdapt.g:3901:2: ( rule__Output__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalSemAdapt.g:3902:2: ( rule__Output__ArgsAssignment_2_1_1 )
            // InternalSemAdapt.g:3902:3: rule__Output__ArgsAssignment_2_1_1
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
    // InternalSemAdapt.g:3911:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3915:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalSemAdapt.g:3916:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSemAdapt.g:3923:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__AssigneeAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3927:1: ( ( ( rule__Binding__AssigneeAssignment_0 ) ) )
            // InternalSemAdapt.g:3928:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            {
            // InternalSemAdapt.g:3928:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            // InternalSemAdapt.g:3929:2: ( rule__Binding__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getAssigneeAssignment_0()); 
            }
            // InternalSemAdapt.g:3930:2: ( rule__Binding__AssigneeAssignment_0 )
            // InternalSemAdapt.g:3930:3: rule__Binding__AssigneeAssignment_0
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
    // InternalSemAdapt.g:3938:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3942:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalSemAdapt.g:3943:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:3950:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3954:1: ( ( '=' ) )
            // InternalSemAdapt.g:3955:1: ( '=' )
            {
            // InternalSemAdapt.g:3955:1: ( '=' )
            // InternalSemAdapt.g:3956:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:3965:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3969:1: ( rule__Binding__Group__2__Impl )
            // InternalSemAdapt.g:3970:2: rule__Binding__Group__2__Impl
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
    // InternalSemAdapt.g:3976:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ExprAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3980:1: ( ( ( rule__Binding__ExprAssignment_2 ) ) )
            // InternalSemAdapt.g:3981:1: ( ( rule__Binding__ExprAssignment_2 ) )
            {
            // InternalSemAdapt.g:3981:1: ( ( rule__Binding__ExprAssignment_2 ) )
            // InternalSemAdapt.g:3982:2: ( rule__Binding__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            }
            // InternalSemAdapt.g:3983:2: ( rule__Binding__ExprAssignment_2 )
            // InternalSemAdapt.g:3983:3: rule__Binding__ExprAssignment_2
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
    // InternalSemAdapt.g:3992:1: rule__SemanticDomainAccess__Group__0 : rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 ;
    public final void rule__SemanticDomainAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3996:1: ( rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 )
            // InternalSemAdapt.g:3997:2: rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSemAdapt.g:4004:1: rule__SemanticDomainAccess__Group__0__Impl : ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) ;
    public final void rule__SemanticDomainAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4008:1: ( ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) )
            // InternalSemAdapt.g:4009:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            {
            // InternalSemAdapt.g:4009:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            // InternalSemAdapt.g:4010:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getRecieverAssignment_0()); 
            }
            // InternalSemAdapt.g:4011:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            // InternalSemAdapt.g:4011:3: rule__SemanticDomainAccess__RecieverAssignment_0
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
    // InternalSemAdapt.g:4019:1: rule__SemanticDomainAccess__Group__1 : rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 ;
    public final void rule__SemanticDomainAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4023:1: ( rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 )
            // InternalSemAdapt.g:4024:2: rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:4031:1: rule__SemanticDomainAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4035:1: ( ( '.' ) )
            // InternalSemAdapt.g:4036:1: ( '.' )
            {
            // InternalSemAdapt.g:4036:1: ( '.' )
            // InternalSemAdapt.g:4037:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4046:1: rule__SemanticDomainAccess__Group__2 : rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 ;
    public final void rule__SemanticDomainAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4050:1: ( rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 )
            // InternalSemAdapt.g:4051:2: rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSemAdapt.g:4058:1: rule__SemanticDomainAccess__Group__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4062:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) )
            // InternalSemAdapt.g:4063:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            {
            // InternalSemAdapt.g:4063:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            // InternalSemAdapt.g:4064:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_2()); 
            }
            // InternalSemAdapt.g:4065:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            // InternalSemAdapt.g:4065:3: rule__SemanticDomainAccess__FieldAssignment_2
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
    // InternalSemAdapt.g:4073:1: rule__SemanticDomainAccess__Group__3 : rule__SemanticDomainAccess__Group__3__Impl ;
    public final void rule__SemanticDomainAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4077:1: ( rule__SemanticDomainAccess__Group__3__Impl )
            // InternalSemAdapt.g:4078:2: rule__SemanticDomainAccess__Group__3__Impl
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
    // InternalSemAdapt.g:4084:1: rule__SemanticDomainAccess__Group__3__Impl : ( ( rule__SemanticDomainAccess__Group_3__0 )* ) ;
    public final void rule__SemanticDomainAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4088:1: ( ( ( rule__SemanticDomainAccess__Group_3__0 )* ) )
            // InternalSemAdapt.g:4089:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            {
            // InternalSemAdapt.g:4089:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            // InternalSemAdapt.g:4090:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup_3()); 
            }
            // InternalSemAdapt.g:4091:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==34) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSemAdapt.g:4091:3: rule__SemanticDomainAccess__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalSemAdapt.g:4100:1: rule__SemanticDomainAccess__Group_3__0 : rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 ;
    public final void rule__SemanticDomainAccess__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4104:1: ( rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 )
            // InternalSemAdapt.g:4105:2: rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSemAdapt.g:4112:1: rule__SemanticDomainAccess__Group_3__0__Impl : ( () ) ;
    public final void rule__SemanticDomainAccess__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4116:1: ( ( () ) )
            // InternalSemAdapt.g:4117:1: ( () )
            {
            // InternalSemAdapt.g:4117:1: ( () )
            // InternalSemAdapt.g:4118:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0()); 
            }
            // InternalSemAdapt.g:4119:2: ()
            // InternalSemAdapt.g:4119:3: 
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
    // InternalSemAdapt.g:4127:1: rule__SemanticDomainAccess__Group_3__1 : rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 ;
    public final void rule__SemanticDomainAccess__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4131:1: ( rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 )
            // InternalSemAdapt.g:4132:2: rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:4139:1: rule__SemanticDomainAccess__Group_3__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4143:1: ( ( '.' ) )
            // InternalSemAdapt.g:4144:1: ( '.' )
            {
            // InternalSemAdapt.g:4144:1: ( '.' )
            // InternalSemAdapt.g:4145:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4154:1: rule__SemanticDomainAccess__Group_3__2 : rule__SemanticDomainAccess__Group_3__2__Impl ;
    public final void rule__SemanticDomainAccess__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4158:1: ( rule__SemanticDomainAccess__Group_3__2__Impl )
            // InternalSemAdapt.g:4159:2: rule__SemanticDomainAccess__Group_3__2__Impl
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
    // InternalSemAdapt.g:4165:1: rule__SemanticDomainAccess__Group_3__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4169:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) )
            // InternalSemAdapt.g:4170:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            {
            // InternalSemAdapt.g:4170:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            // InternalSemAdapt.g:4171:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_3_2()); 
            }
            // InternalSemAdapt.g:4172:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            // InternalSemAdapt.g:4172:3: rule__SemanticDomainAccess__FieldAssignment_3_2
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
    // InternalSemAdapt.g:4181:1: rule__Self__Group__0 : rule__Self__Group__0__Impl rule__Self__Group__1 ;
    public final void rule__Self__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4185:1: ( rule__Self__Group__0__Impl rule__Self__Group__1 )
            // InternalSemAdapt.g:4186:2: rule__Self__Group__0__Impl rule__Self__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemAdapt.g:4193:1: rule__Self__Group__0__Impl : ( () ) ;
    public final void rule__Self__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4197:1: ( ( () ) )
            // InternalSemAdapt.g:4198:1: ( () )
            {
            // InternalSemAdapt.g:4198:1: ( () )
            // InternalSemAdapt.g:4199:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfAction_0()); 
            }
            // InternalSemAdapt.g:4200:2: ()
            // InternalSemAdapt.g:4200:3: 
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
    // InternalSemAdapt.g:4208:1: rule__Self__Group__1 : rule__Self__Group__1__Impl ;
    public final void rule__Self__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4212:1: ( rule__Self__Group__1__Impl )
            // InternalSemAdapt.g:4213:2: rule__Self__Group__1__Impl
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
    // InternalSemAdapt.g:4219:1: rule__Self__Group__1__Impl : ( 'self' ) ;
    public final void rule__Self__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4223:1: ( ( 'self' ) )
            // InternalSemAdapt.g:4224:1: ( 'self' )
            {
            // InternalSemAdapt.g:4224:1: ( 'self' )
            // InternalSemAdapt.g:4225:2: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4235:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4239:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalSemAdapt.g:4240:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSemAdapt.g:4247:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__FromAssignment_0 ) ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4251:1: ( ( ( rule__Conclusion__FromAssignment_0 ) ) )
            // InternalSemAdapt.g:4252:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            {
            // InternalSemAdapt.g:4252:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            // InternalSemAdapt.g:4253:2: ( rule__Conclusion__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getFromAssignment_0()); 
            }
            // InternalSemAdapt.g:4254:2: ( rule__Conclusion__FromAssignment_0 )
            // InternalSemAdapt.g:4254:3: rule__Conclusion__FromAssignment_0
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
    // InternalSemAdapt.g:4262:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4266:1: ( rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 )
            // InternalSemAdapt.g:4267:2: rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSemAdapt.g:4274:1: rule__Conclusion__Group__1__Impl : ( '->' ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4278:1: ( ( '->' ) )
            // InternalSemAdapt.g:4279:1: ( '->' )
            {
            // InternalSemAdapt.g:4279:1: ( '->' )
            // InternalSemAdapt.g:4280:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4289:1: rule__Conclusion__Group__2 : rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 ;
    public final void rule__Conclusion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4293:1: ( rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 )
            // InternalSemAdapt.g:4294:2: rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSemAdapt.g:4301:1: rule__Conclusion__Group__2__Impl : ( ( rule__Conclusion__TerminationAssignment_2 )? ) ;
    public final void rule__Conclusion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4305:1: ( ( ( rule__Conclusion__TerminationAssignment_2 )? ) )
            // InternalSemAdapt.g:4306:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            {
            // InternalSemAdapt.g:4306:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            // InternalSemAdapt.g:4307:2: ( rule__Conclusion__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationAssignment_2()); 
            }
            // InternalSemAdapt.g:4308:2: ( rule__Conclusion__TerminationAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSemAdapt.g:4308:3: rule__Conclusion__TerminationAssignment_2
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
    // InternalSemAdapt.g:4316:1: rule__Conclusion__Group__3 : rule__Conclusion__Group__3__Impl ;
    public final void rule__Conclusion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4320:1: ( rule__Conclusion__Group__3__Impl )
            // InternalSemAdapt.g:4321:2: rule__Conclusion__Group__3__Impl
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
    // InternalSemAdapt.g:4327:1: rule__Conclusion__Group__3__Impl : ( ( rule__Conclusion__ToAssignment_3 ) ) ;
    public final void rule__Conclusion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4331:1: ( ( ( rule__Conclusion__ToAssignment_3 ) ) )
            // InternalSemAdapt.g:4332:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            {
            // InternalSemAdapt.g:4332:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            // InternalSemAdapt.g:4333:2: ( rule__Conclusion__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getToAssignment_3()); 
            }
            // InternalSemAdapt.g:4334:2: ( rule__Conclusion__ToAssignment_3 )
            // InternalSemAdapt.g:4334:3: rule__Conclusion__ToAssignment_3
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
    // InternalSemAdapt.g:4343:1: rule__Premise__Group__0 : rule__Premise__Group__0__Impl rule__Premise__Group__1 ;
    public final void rule__Premise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4347:1: ( rule__Premise__Group__0__Impl rule__Premise__Group__1 )
            // InternalSemAdapt.g:4348:2: rule__Premise__Group__0__Impl rule__Premise__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSemAdapt.g:4355:1: rule__Premise__Group__0__Impl : ( ( rule__Premise__FromAssignment_0 ) ) ;
    public final void rule__Premise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4359:1: ( ( ( rule__Premise__FromAssignment_0 ) ) )
            // InternalSemAdapt.g:4360:1: ( ( rule__Premise__FromAssignment_0 ) )
            {
            // InternalSemAdapt.g:4360:1: ( ( rule__Premise__FromAssignment_0 ) )
            // InternalSemAdapt.g:4361:2: ( rule__Premise__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getFromAssignment_0()); 
            }
            // InternalSemAdapt.g:4362:2: ( rule__Premise__FromAssignment_0 )
            // InternalSemAdapt.g:4362:3: rule__Premise__FromAssignment_0
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
    // InternalSemAdapt.g:4370:1: rule__Premise__Group__1 : rule__Premise__Group__1__Impl rule__Premise__Group__2 ;
    public final void rule__Premise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4374:1: ( rule__Premise__Group__1__Impl rule__Premise__Group__2 )
            // InternalSemAdapt.g:4375:2: rule__Premise__Group__1__Impl rule__Premise__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSemAdapt.g:4382:1: rule__Premise__Group__1__Impl : ( '->' ) ;
    public final void rule__Premise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4386:1: ( ( '->' ) )
            // InternalSemAdapt.g:4387:1: ( '->' )
            {
            // InternalSemAdapt.g:4387:1: ( '->' )
            // InternalSemAdapt.g:4388:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4397:1: rule__Premise__Group__2 : rule__Premise__Group__2__Impl rule__Premise__Group__3 ;
    public final void rule__Premise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4401:1: ( rule__Premise__Group__2__Impl rule__Premise__Group__3 )
            // InternalSemAdapt.g:4402:2: rule__Premise__Group__2__Impl rule__Premise__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSemAdapt.g:4409:1: rule__Premise__Group__2__Impl : ( ( rule__Premise__TerminationAssignment_2 )? ) ;
    public final void rule__Premise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4413:1: ( ( ( rule__Premise__TerminationAssignment_2 )? ) )
            // InternalSemAdapt.g:4414:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            {
            // InternalSemAdapt.g:4414:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            // InternalSemAdapt.g:4415:2: ( rule__Premise__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationAssignment_2()); 
            }
            // InternalSemAdapt.g:4416:2: ( rule__Premise__TerminationAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSemAdapt.g:4416:3: rule__Premise__TerminationAssignment_2
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
    // InternalSemAdapt.g:4424:1: rule__Premise__Group__3 : rule__Premise__Group__3__Impl ;
    public final void rule__Premise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4428:1: ( rule__Premise__Group__3__Impl )
            // InternalSemAdapt.g:4429:2: rule__Premise__Group__3__Impl
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
    // InternalSemAdapt.g:4435:1: rule__Premise__Group__3__Impl : ( ( rule__Premise__ToAssignment_3 ) ) ;
    public final void rule__Premise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4439:1: ( ( ( rule__Premise__ToAssignment_3 ) ) )
            // InternalSemAdapt.g:4440:1: ( ( rule__Premise__ToAssignment_3 ) )
            {
            // InternalSemAdapt.g:4440:1: ( ( rule__Premise__ToAssignment_3 ) )
            // InternalSemAdapt.g:4441:2: ( rule__Premise__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getToAssignment_3()); 
            }
            // InternalSemAdapt.g:4442:2: ( rule__Premise__ToAssignment_3 )
            // InternalSemAdapt.g:4442:3: rule__Premise__ToAssignment_3
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
    // InternalSemAdapt.g:4451:1: rule__DefConfiguration__Group__0 : rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 ;
    public final void rule__DefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4455:1: ( rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 )
            // InternalSemAdapt.g:4456:2: rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemAdapt.g:4463:1: rule__DefConfiguration__Group__0__Impl : ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__DefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4467:1: ( ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) )
            // InternalSemAdapt.g:4468:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalSemAdapt.g:4468:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            // InternalSemAdapt.g:4469:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalSemAdapt.g:4470:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            // InternalSemAdapt.g:4470:3: rule__DefConfiguration__ConceptAssignment_0
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
    // InternalSemAdapt.g:4478:1: rule__DefConfiguration__Group__1 : rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 ;
    public final void rule__DefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4482:1: ( rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 )
            // InternalSemAdapt.g:4483:2: rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalSemAdapt.g:4490:1: rule__DefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__DefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4494:1: ( ( '(' ) )
            // InternalSemAdapt.g:4495:1: ( '(' )
            {
            // InternalSemAdapt.g:4495:1: ( '(' )
            // InternalSemAdapt.g:4496:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4505:1: rule__DefConfiguration__Group__2 : rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 ;
    public final void rule__DefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4509:1: ( rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 )
            // InternalSemAdapt.g:4510:2: rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSemAdapt.g:4517:1: rule__DefConfiguration__Group__2__Impl : ( ( rule__DefConfiguration__Group_2__0 )? ) ;
    public final void rule__DefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4521:1: ( ( ( rule__DefConfiguration__Group_2__0 )? ) )
            // InternalSemAdapt.g:4522:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            {
            // InternalSemAdapt.g:4522:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            // InternalSemAdapt.g:4523:2: ( rule__DefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2()); 
            }
            // InternalSemAdapt.g:4524:2: ( rule__DefConfiguration__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==37||LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSemAdapt.g:4524:3: rule__DefConfiguration__Group_2__0
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
    // InternalSemAdapt.g:4532:1: rule__DefConfiguration__Group__3 : rule__DefConfiguration__Group__3__Impl ;
    public final void rule__DefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4536:1: ( rule__DefConfiguration__Group__3__Impl )
            // InternalSemAdapt.g:4537:2: rule__DefConfiguration__Group__3__Impl
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
    // InternalSemAdapt.g:4543:1: rule__DefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__DefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4547:1: ( ( ')' ) )
            // InternalSemAdapt.g:4548:1: ( ')' )
            {
            // InternalSemAdapt.g:4548:1: ( ')' )
            // InternalSemAdapt.g:4549:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4559:1: rule__DefConfiguration__Group_2__0 : rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 ;
    public final void rule__DefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4563:1: ( rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 )
            // InternalSemAdapt.g:4564:2: rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSemAdapt.g:4571:1: rule__DefConfiguration__Group_2__0__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__DefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4575:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalSemAdapt.g:4576:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalSemAdapt.g:4576:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            // InternalSemAdapt.g:4577:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalSemAdapt.g:4578:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            // InternalSemAdapt.g:4578:3: rule__DefConfiguration__ChildsAssignment_2_0
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
    // InternalSemAdapt.g:4586:1: rule__DefConfiguration__Group_2__1 : rule__DefConfiguration__Group_2__1__Impl ;
    public final void rule__DefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4590:1: ( rule__DefConfiguration__Group_2__1__Impl )
            // InternalSemAdapt.g:4591:2: rule__DefConfiguration__Group_2__1__Impl
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
    // InternalSemAdapt.g:4597:1: rule__DefConfiguration__Group_2__1__Impl : ( ( rule__DefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__DefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4601:1: ( ( ( rule__DefConfiguration__Group_2_1__0 )* ) )
            // InternalSemAdapt.g:4602:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            {
            // InternalSemAdapt.g:4602:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            // InternalSemAdapt.g:4603:2: ( rule__DefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalSemAdapt.g:4604:2: ( rule__DefConfiguration__Group_2_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSemAdapt.g:4604:3: rule__DefConfiguration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DefConfiguration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalSemAdapt.g:4613:1: rule__DefConfiguration__Group_2_1__0 : rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 ;
    public final void rule__DefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4617:1: ( rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 )
            // InternalSemAdapt.g:4618:2: rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSemAdapt.g:4625:1: rule__DefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4629:1: ( ( ',' ) )
            // InternalSemAdapt.g:4630:1: ( ',' )
            {
            // InternalSemAdapt.g:4630:1: ( ',' )
            // InternalSemAdapt.g:4631:2: ','
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
    // InternalSemAdapt.g:4640:1: rule__DefConfiguration__Group_2_1__1 : rule__DefConfiguration__Group_2_1__1__Impl ;
    public final void rule__DefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4644:1: ( rule__DefConfiguration__Group_2_1__1__Impl )
            // InternalSemAdapt.g:4645:2: rule__DefConfiguration__Group_2_1__1__Impl
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
    // InternalSemAdapt.g:4651:1: rule__DefConfiguration__Group_2_1__1__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__DefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4655:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalSemAdapt.g:4656:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalSemAdapt.g:4656:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalSemAdapt.g:4657:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalSemAdapt.g:4658:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            // InternalSemAdapt.g:4658:3: rule__DefConfiguration__ChildsAssignment_2_1_1
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
    // InternalSemAdapt.g:4667:1: rule__RefConfiguration__Group__0 : rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 ;
    public final void rule__RefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4671:1: ( rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 )
            // InternalSemAdapt.g:4672:2: rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemAdapt.g:4679:1: rule__RefConfiguration__Group__0__Impl : ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__RefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4683:1: ( ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) )
            // InternalSemAdapt.g:4684:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalSemAdapt.g:4684:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            // InternalSemAdapt.g:4685:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalSemAdapt.g:4686:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            // InternalSemAdapt.g:4686:3: rule__RefConfiguration__ConceptAssignment_0
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
    // InternalSemAdapt.g:4694:1: rule__RefConfiguration__Group__1 : rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 ;
    public final void rule__RefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4698:1: ( rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 )
            // InternalSemAdapt.g:4699:2: rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSemAdapt.g:4706:1: rule__RefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__RefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4710:1: ( ( '(' ) )
            // InternalSemAdapt.g:4711:1: ( '(' )
            {
            // InternalSemAdapt.g:4711:1: ( '(' )
            // InternalSemAdapt.g:4712:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4721:1: rule__RefConfiguration__Group__2 : rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 ;
    public final void rule__RefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4725:1: ( rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 )
            // InternalSemAdapt.g:4726:2: rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalSemAdapt.g:4733:1: rule__RefConfiguration__Group__2__Impl : ( ( rule__RefConfiguration__Group_2__0 )? ) ;
    public final void rule__RefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4737:1: ( ( ( rule__RefConfiguration__Group_2__0 )? ) )
            // InternalSemAdapt.g:4738:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            {
            // InternalSemAdapt.g:4738:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            // InternalSemAdapt.g:4739:2: ( rule__RefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2()); 
            }
            // InternalSemAdapt.g:4740:2: ( rule__RefConfiguration__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==37||LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSemAdapt.g:4740:3: rule__RefConfiguration__Group_2__0
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
    // InternalSemAdapt.g:4748:1: rule__RefConfiguration__Group__3 : rule__RefConfiguration__Group__3__Impl ;
    public final void rule__RefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4752:1: ( rule__RefConfiguration__Group__3__Impl )
            // InternalSemAdapt.g:4753:2: rule__RefConfiguration__Group__3__Impl
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
    // InternalSemAdapt.g:4759:1: rule__RefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__RefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4763:1: ( ( ')' ) )
            // InternalSemAdapt.g:4764:1: ( ')' )
            {
            // InternalSemAdapt.g:4764:1: ( ')' )
            // InternalSemAdapt.g:4765:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:4775:1: rule__RefConfiguration__Group_2__0 : rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 ;
    public final void rule__RefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4779:1: ( rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 )
            // InternalSemAdapt.g:4780:2: rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSemAdapt.g:4787:1: rule__RefConfiguration__Group_2__0__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__RefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4791:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalSemAdapt.g:4792:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalSemAdapt.g:4792:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            // InternalSemAdapt.g:4793:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalSemAdapt.g:4794:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            // InternalSemAdapt.g:4794:3: rule__RefConfiguration__ChildsAssignment_2_0
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
    // InternalSemAdapt.g:4802:1: rule__RefConfiguration__Group_2__1 : rule__RefConfiguration__Group_2__1__Impl ;
    public final void rule__RefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4806:1: ( rule__RefConfiguration__Group_2__1__Impl )
            // InternalSemAdapt.g:4807:2: rule__RefConfiguration__Group_2__1__Impl
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
    // InternalSemAdapt.g:4813:1: rule__RefConfiguration__Group_2__1__Impl : ( ( rule__RefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__RefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4817:1: ( ( ( rule__RefConfiguration__Group_2_1__0 )* ) )
            // InternalSemAdapt.g:4818:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            {
            // InternalSemAdapt.g:4818:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            // InternalSemAdapt.g:4819:2: ( rule__RefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalSemAdapt.g:4820:2: ( rule__RefConfiguration__Group_2_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSemAdapt.g:4820:3: rule__RefConfiguration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RefConfiguration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalSemAdapt.g:4829:1: rule__RefConfiguration__Group_2_1__0 : rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 ;
    public final void rule__RefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4833:1: ( rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 )
            // InternalSemAdapt.g:4834:2: rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSemAdapt.g:4841:1: rule__RefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__RefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4845:1: ( ( ',' ) )
            // InternalSemAdapt.g:4846:1: ( ',' )
            {
            // InternalSemAdapt.g:4846:1: ( ',' )
            // InternalSemAdapt.g:4847:2: ','
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
    // InternalSemAdapt.g:4856:1: rule__RefConfiguration__Group_2_1__1 : rule__RefConfiguration__Group_2_1__1__Impl ;
    public final void rule__RefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4860:1: ( rule__RefConfiguration__Group_2_1__1__Impl )
            // InternalSemAdapt.g:4861:2: rule__RefConfiguration__Group_2_1__1__Impl
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
    // InternalSemAdapt.g:4867:1: rule__RefConfiguration__Group_2_1__1__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__RefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4871:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalSemAdapt.g:4872:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalSemAdapt.g:4872:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalSemAdapt.g:4873:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalSemAdapt.g:4874:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            // InternalSemAdapt.g:4874:3: rule__RefConfiguration__ChildsAssignment_2_1_1
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
    // InternalSemAdapt.g:4883:1: rule__SymbolDef__Group__0 : rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 ;
    public final void rule__SymbolDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4887:1: ( rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 )
            // InternalSemAdapt.g:4888:2: rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:4895:1: rule__SymbolDef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4899:1: ( ( () ) )
            // InternalSemAdapt.g:4900:1: ( () )
            {
            // InternalSemAdapt.g:4900:1: ( () )
            // InternalSemAdapt.g:4901:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getSymbolDefAction_0()); 
            }
            // InternalSemAdapt.g:4902:2: ()
            // InternalSemAdapt.g:4902:3: 
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
    // InternalSemAdapt.g:4910:1: rule__SymbolDef__Group__1 : rule__SymbolDef__Group__1__Impl ;
    public final void rule__SymbolDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4914:1: ( rule__SymbolDef__Group__1__Impl )
            // InternalSemAdapt.g:4915:2: rule__SymbolDef__Group__1__Impl
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
    // InternalSemAdapt.g:4921:1: rule__SymbolDef__Group__1__Impl : ( ( rule__SymbolDef__NameAssignment_1 ) ) ;
    public final void rule__SymbolDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4925:1: ( ( ( rule__SymbolDef__NameAssignment_1 ) ) )
            // InternalSemAdapt.g:4926:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            {
            // InternalSemAdapt.g:4926:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            // InternalSemAdapt.g:4927:2: ( rule__SymbolDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getNameAssignment_1()); 
            }
            // InternalSemAdapt.g:4928:2: ( rule__SymbolDef__NameAssignment_1 )
            // InternalSemAdapt.g:4928:3: rule__SymbolDef__NameAssignment_1
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
    // InternalSemAdapt.g:4937:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4941:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // InternalSemAdapt.g:4942:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:4949:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4953:1: ( ( () ) )
            // InternalSemAdapt.g:4954:1: ( () )
            {
            // InternalSemAdapt.g:4954:1: ( () )
            // InternalSemAdapt.g:4955:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            }
            // InternalSemAdapt.g:4956:2: ()
            // InternalSemAdapt.g:4956:3: 
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
    // InternalSemAdapt.g:4964:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4968:1: ( rule__SymbolRef__Group__1__Impl )
            // InternalSemAdapt.g:4969:2: rule__SymbolRef__Group__1__Impl
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
    // InternalSemAdapt.g:4975:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__DefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4979:1: ( ( ( rule__SymbolRef__DefAssignment_1 ) ) )
            // InternalSemAdapt.g:4980:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            {
            // InternalSemAdapt.g:4980:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            // InternalSemAdapt.g:4981:2: ( rule__SymbolRef__DefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefAssignment_1()); 
            }
            // InternalSemAdapt.g:4982:2: ( rule__SymbolRef__DefAssignment_1 )
            // InternalSemAdapt.g:4982:3: rule__SymbolRef__DefAssignment_1
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
    // InternalSemAdapt.g:4991:1: rule__ListDef__Group__0 : rule__ListDef__Group__0__Impl rule__ListDef__Group__1 ;
    public final void rule__ListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4995:1: ( rule__ListDef__Group__0__Impl rule__ListDef__Group__1 )
            // InternalSemAdapt.g:4996:2: rule__ListDef__Group__0__Impl rule__ListDef__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSemAdapt.g:5003:1: rule__ListDef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5007:1: ( ( '[' ) )
            // InternalSemAdapt.g:5008:1: ( '[' )
            {
            // InternalSemAdapt.g:5008:1: ( '[' )
            // InternalSemAdapt.g:5009:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5018:1: rule__ListDef__Group__1 : rule__ListDef__Group__1__Impl rule__ListDef__Group__2 ;
    public final void rule__ListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5022:1: ( rule__ListDef__Group__1__Impl rule__ListDef__Group__2 )
            // InternalSemAdapt.g:5023:2: rule__ListDef__Group__1__Impl rule__ListDef__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSemAdapt.g:5030:1: rule__ListDef__Group__1__Impl : ( ( rule__ListDef__HeadAssignment_1 ) ) ;
    public final void rule__ListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5034:1: ( ( ( rule__ListDef__HeadAssignment_1 ) ) )
            // InternalSemAdapt.g:5035:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            {
            // InternalSemAdapt.g:5035:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            // InternalSemAdapt.g:5036:2: ( rule__ListDef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getHeadAssignment_1()); 
            }
            // InternalSemAdapt.g:5037:2: ( rule__ListDef__HeadAssignment_1 )
            // InternalSemAdapt.g:5037:3: rule__ListDef__HeadAssignment_1
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
    // InternalSemAdapt.g:5045:1: rule__ListDef__Group__2 : rule__ListDef__Group__2__Impl rule__ListDef__Group__3 ;
    public final void rule__ListDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5049:1: ( rule__ListDef__Group__2__Impl rule__ListDef__Group__3 )
            // InternalSemAdapt.g:5050:2: rule__ListDef__Group__2__Impl rule__ListDef__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:5057:1: rule__ListDef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5061:1: ( ( '|' ) )
            // InternalSemAdapt.g:5062:1: ( '|' )
            {
            // InternalSemAdapt.g:5062:1: ( '|' )
            // InternalSemAdapt.g:5063:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getVerticalLineKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5072:1: rule__ListDef__Group__3 : rule__ListDef__Group__3__Impl rule__ListDef__Group__4 ;
    public final void rule__ListDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5076:1: ( rule__ListDef__Group__3__Impl rule__ListDef__Group__4 )
            // InternalSemAdapt.g:5077:2: rule__ListDef__Group__3__Impl rule__ListDef__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalSemAdapt.g:5084:1: rule__ListDef__Group__3__Impl : ( ( rule__ListDef__TailAssignment_3 ) ) ;
    public final void rule__ListDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5088:1: ( ( ( rule__ListDef__TailAssignment_3 ) ) )
            // InternalSemAdapt.g:5089:1: ( ( rule__ListDef__TailAssignment_3 ) )
            {
            // InternalSemAdapt.g:5089:1: ( ( rule__ListDef__TailAssignment_3 ) )
            // InternalSemAdapt.g:5090:2: ( rule__ListDef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTailAssignment_3()); 
            }
            // InternalSemAdapt.g:5091:2: ( rule__ListDef__TailAssignment_3 )
            // InternalSemAdapt.g:5091:3: rule__ListDef__TailAssignment_3
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
    // InternalSemAdapt.g:5099:1: rule__ListDef__Group__4 : rule__ListDef__Group__4__Impl ;
    public final void rule__ListDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5103:1: ( rule__ListDef__Group__4__Impl )
            // InternalSemAdapt.g:5104:2: rule__ListDef__Group__4__Impl
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
    // InternalSemAdapt.g:5110:1: rule__ListDef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5114:1: ( ( ']' ) )
            // InternalSemAdapt.g:5115:1: ( ']' )
            {
            // InternalSemAdapt.g:5115:1: ( ']' )
            // InternalSemAdapt.g:5116:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5126:1: rule__ListRef__Group__0 : rule__ListRef__Group__0__Impl rule__ListRef__Group__1 ;
    public final void rule__ListRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5130:1: ( rule__ListRef__Group__0__Impl rule__ListRef__Group__1 )
            // InternalSemAdapt.g:5131:2: rule__ListRef__Group__0__Impl rule__ListRef__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:5138:1: rule__ListRef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5142:1: ( ( '[' ) )
            // InternalSemAdapt.g:5143:1: ( '[' )
            {
            // InternalSemAdapt.g:5143:1: ( '[' )
            // InternalSemAdapt.g:5144:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5153:1: rule__ListRef__Group__1 : rule__ListRef__Group__1__Impl rule__ListRef__Group__2 ;
    public final void rule__ListRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5157:1: ( rule__ListRef__Group__1__Impl rule__ListRef__Group__2 )
            // InternalSemAdapt.g:5158:2: rule__ListRef__Group__1__Impl rule__ListRef__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSemAdapt.g:5165:1: rule__ListRef__Group__1__Impl : ( ( rule__ListRef__HeadAssignment_1 ) ) ;
    public final void rule__ListRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5169:1: ( ( ( rule__ListRef__HeadAssignment_1 ) ) )
            // InternalSemAdapt.g:5170:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            {
            // InternalSemAdapt.g:5170:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            // InternalSemAdapt.g:5171:2: ( rule__ListRef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getHeadAssignment_1()); 
            }
            // InternalSemAdapt.g:5172:2: ( rule__ListRef__HeadAssignment_1 )
            // InternalSemAdapt.g:5172:3: rule__ListRef__HeadAssignment_1
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
    // InternalSemAdapt.g:5180:1: rule__ListRef__Group__2 : rule__ListRef__Group__2__Impl rule__ListRef__Group__3 ;
    public final void rule__ListRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5184:1: ( rule__ListRef__Group__2__Impl rule__ListRef__Group__3 )
            // InternalSemAdapt.g:5185:2: rule__ListRef__Group__2__Impl rule__ListRef__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:5192:1: rule__ListRef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5196:1: ( ( '|' ) )
            // InternalSemAdapt.g:5197:1: ( '|' )
            {
            // InternalSemAdapt.g:5197:1: ( '|' )
            // InternalSemAdapt.g:5198:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getVerticalLineKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5207:1: rule__ListRef__Group__3 : rule__ListRef__Group__3__Impl rule__ListRef__Group__4 ;
    public final void rule__ListRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5211:1: ( rule__ListRef__Group__3__Impl rule__ListRef__Group__4 )
            // InternalSemAdapt.g:5212:2: rule__ListRef__Group__3__Impl rule__ListRef__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalSemAdapt.g:5219:1: rule__ListRef__Group__3__Impl : ( ( rule__ListRef__TailAssignment_3 ) ) ;
    public final void rule__ListRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5223:1: ( ( ( rule__ListRef__TailAssignment_3 ) ) )
            // InternalSemAdapt.g:5224:1: ( ( rule__ListRef__TailAssignment_3 ) )
            {
            // InternalSemAdapt.g:5224:1: ( ( rule__ListRef__TailAssignment_3 ) )
            // InternalSemAdapt.g:5225:2: ( rule__ListRef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getTailAssignment_3()); 
            }
            // InternalSemAdapt.g:5226:2: ( rule__ListRef__TailAssignment_3 )
            // InternalSemAdapt.g:5226:3: rule__ListRef__TailAssignment_3
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
    // InternalSemAdapt.g:5234:1: rule__ListRef__Group__4 : rule__ListRef__Group__4__Impl ;
    public final void rule__ListRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5238:1: ( rule__ListRef__Group__4__Impl )
            // InternalSemAdapt.g:5239:2: rule__ListRef__Group__4__Impl
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
    // InternalSemAdapt.g:5245:1: rule__ListRef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5249:1: ( ( ']' ) )
            // InternalSemAdapt.g:5250:1: ( ']' )
            {
            // InternalSemAdapt.g:5250:1: ( ']' )
            // InternalSemAdapt.g:5251:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5261:1: rule__VoidList__Group__0 : rule__VoidList__Group__0__Impl rule__VoidList__Group__1 ;
    public final void rule__VoidList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5265:1: ( rule__VoidList__Group__0__Impl rule__VoidList__Group__1 )
            // InternalSemAdapt.g:5266:2: rule__VoidList__Group__0__Impl rule__VoidList__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSemAdapt.g:5273:1: rule__VoidList__Group__0__Impl : ( () ) ;
    public final void rule__VoidList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5277:1: ( ( () ) )
            // InternalSemAdapt.g:5278:1: ( () )
            {
            // InternalSemAdapt.g:5278:1: ( () )
            // InternalSemAdapt.g:5279:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getVoidListAction_0()); 
            }
            // InternalSemAdapt.g:5280:2: ()
            // InternalSemAdapt.g:5280:3: 
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
    // InternalSemAdapt.g:5288:1: rule__VoidList__Group__1 : rule__VoidList__Group__1__Impl ;
    public final void rule__VoidList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5292:1: ( rule__VoidList__Group__1__Impl )
            // InternalSemAdapt.g:5293:2: rule__VoidList__Group__1__Impl
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
    // InternalSemAdapt.g:5299:1: rule__VoidList__Group__1__Impl : ( '[]' ) ;
    public final void rule__VoidList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5303:1: ( ( '[]' ) )
            // InternalSemAdapt.g:5304:1: ( '[]' )
            {
            // InternalSemAdapt.g:5304:1: ( '[]' )
            // InternalSemAdapt.g:5305:2: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5315:1: rule__CondNot__Group__0 : rule__CondNot__Group__0__Impl rule__CondNot__Group__1 ;
    public final void rule__CondNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5319:1: ( rule__CondNot__Group__0__Impl rule__CondNot__Group__1 )
            // InternalSemAdapt.g:5320:2: rule__CondNot__Group__0__Impl rule__CondNot__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5327:1: rule__CondNot__Group__0__Impl : ( () ) ;
    public final void rule__CondNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5331:1: ( ( () ) )
            // InternalSemAdapt.g:5332:1: ( () )
            {
            // InternalSemAdapt.g:5332:1: ( () )
            // InternalSemAdapt.g:5333:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getNotAction_0()); 
            }
            // InternalSemAdapt.g:5334:2: ()
            // InternalSemAdapt.g:5334:3: 
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
    // InternalSemAdapt.g:5342:1: rule__CondNot__Group__1 : rule__CondNot__Group__1__Impl rule__CondNot__Group__2 ;
    public final void rule__CondNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5346:1: ( rule__CondNot__Group__1__Impl rule__CondNot__Group__2 )
            // InternalSemAdapt.g:5347:2: rule__CondNot__Group__1__Impl rule__CondNot__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5354:1: rule__CondNot__Group__1__Impl : ( '!' ) ;
    public final void rule__CondNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5358:1: ( ( '!' ) )
            // InternalSemAdapt.g:5359:1: ( '!' )
            {
            // InternalSemAdapt.g:5359:1: ( '!' )
            // InternalSemAdapt.g:5360:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5369:1: rule__CondNot__Group__2 : rule__CondNot__Group__2__Impl ;
    public final void rule__CondNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5373:1: ( rule__CondNot__Group__2__Impl )
            // InternalSemAdapt.g:5374:2: rule__CondNot__Group__2__Impl
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
    // InternalSemAdapt.g:5380:1: rule__CondNot__Group__2__Impl : ( ( rule__CondNot__ExprAssignment_2 ) ) ;
    public final void rule__CondNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5384:1: ( ( ( rule__CondNot__ExprAssignment_2 ) ) )
            // InternalSemAdapt.g:5385:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            {
            // InternalSemAdapt.g:5385:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            // InternalSemAdapt.g:5386:2: ( rule__CondNot__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExprAssignment_2()); 
            }
            // InternalSemAdapt.g:5387:2: ( rule__CondNot__ExprAssignment_2 )
            // InternalSemAdapt.g:5387:3: rule__CondNot__ExprAssignment_2
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
    // InternalSemAdapt.g:5396:1: rule__CondOr__Group__0 : rule__CondOr__Group__0__Impl rule__CondOr__Group__1 ;
    public final void rule__CondOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5400:1: ( rule__CondOr__Group__0__Impl rule__CondOr__Group__1 )
            // InternalSemAdapt.g:5401:2: rule__CondOr__Group__0__Impl rule__CondOr__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5408:1: rule__CondOr__Group__0__Impl : ( () ) ;
    public final void rule__CondOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5412:1: ( ( () ) )
            // InternalSemAdapt.g:5413:1: ( () )
            {
            // InternalSemAdapt.g:5413:1: ( () )
            // InternalSemAdapt.g:5414:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getOrAction_0()); 
            }
            // InternalSemAdapt.g:5415:2: ()
            // InternalSemAdapt.g:5415:3: 
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
    // InternalSemAdapt.g:5423:1: rule__CondOr__Group__1 : rule__CondOr__Group__1__Impl rule__CondOr__Group__2 ;
    public final void rule__CondOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5427:1: ( rule__CondOr__Group__1__Impl rule__CondOr__Group__2 )
            // InternalSemAdapt.g:5428:2: rule__CondOr__Group__1__Impl rule__CondOr__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalSemAdapt.g:5435:1: rule__CondOr__Group__1__Impl : ( ( rule__CondOr__LhsAssignment_1 ) ) ;
    public final void rule__CondOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5439:1: ( ( ( rule__CondOr__LhsAssignment_1 ) ) )
            // InternalSemAdapt.g:5440:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            {
            // InternalSemAdapt.g:5440:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            // InternalSemAdapt.g:5441:2: ( rule__CondOr__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getLhsAssignment_1()); 
            }
            // InternalSemAdapt.g:5442:2: ( rule__CondOr__LhsAssignment_1 )
            // InternalSemAdapt.g:5442:3: rule__CondOr__LhsAssignment_1
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
    // InternalSemAdapt.g:5450:1: rule__CondOr__Group__2 : rule__CondOr__Group__2__Impl rule__CondOr__Group__3 ;
    public final void rule__CondOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5454:1: ( rule__CondOr__Group__2__Impl rule__CondOr__Group__3 )
            // InternalSemAdapt.g:5455:2: rule__CondOr__Group__2__Impl rule__CondOr__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5462:1: rule__CondOr__Group__2__Impl : ( '||' ) ;
    public final void rule__CondOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5466:1: ( ( '||' ) )
            // InternalSemAdapt.g:5467:1: ( '||' )
            {
            // InternalSemAdapt.g:5467:1: ( '||' )
            // InternalSemAdapt.g:5468:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5477:1: rule__CondOr__Group__3 : rule__CondOr__Group__3__Impl ;
    public final void rule__CondOr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5481:1: ( rule__CondOr__Group__3__Impl )
            // InternalSemAdapt.g:5482:2: rule__CondOr__Group__3__Impl
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
    // InternalSemAdapt.g:5488:1: rule__CondOr__Group__3__Impl : ( ( rule__CondOr__RhsAssignment_3 ) ) ;
    public final void rule__CondOr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5492:1: ( ( ( rule__CondOr__RhsAssignment_3 ) ) )
            // InternalSemAdapt.g:5493:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            {
            // InternalSemAdapt.g:5493:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            // InternalSemAdapt.g:5494:2: ( rule__CondOr__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getRhsAssignment_3()); 
            }
            // InternalSemAdapt.g:5495:2: ( rule__CondOr__RhsAssignment_3 )
            // InternalSemAdapt.g:5495:3: rule__CondOr__RhsAssignment_3
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
    // InternalSemAdapt.g:5504:1: rule__CondAnd__Group__0 : rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 ;
    public final void rule__CondAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5508:1: ( rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 )
            // InternalSemAdapt.g:5509:2: rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5516:1: rule__CondAnd__Group__0__Impl : ( () ) ;
    public final void rule__CondAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5520:1: ( ( () ) )
            // InternalSemAdapt.g:5521:1: ( () )
            {
            // InternalSemAdapt.g:5521:1: ( () )
            // InternalSemAdapt.g:5522:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAndAction_0()); 
            }
            // InternalSemAdapt.g:5523:2: ()
            // InternalSemAdapt.g:5523:3: 
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
    // InternalSemAdapt.g:5531:1: rule__CondAnd__Group__1 : rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 ;
    public final void rule__CondAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5535:1: ( rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 )
            // InternalSemAdapt.g:5536:2: rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSemAdapt.g:5543:1: rule__CondAnd__Group__1__Impl : ( ( rule__CondAnd__LhsAssignment_1 ) ) ;
    public final void rule__CondAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5547:1: ( ( ( rule__CondAnd__LhsAssignment_1 ) ) )
            // InternalSemAdapt.g:5548:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            {
            // InternalSemAdapt.g:5548:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            // InternalSemAdapt.g:5549:2: ( rule__CondAnd__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getLhsAssignment_1()); 
            }
            // InternalSemAdapt.g:5550:2: ( rule__CondAnd__LhsAssignment_1 )
            // InternalSemAdapt.g:5550:3: rule__CondAnd__LhsAssignment_1
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
    // InternalSemAdapt.g:5558:1: rule__CondAnd__Group__2 : rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 ;
    public final void rule__CondAnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5562:1: ( rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 )
            // InternalSemAdapt.g:5563:2: rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5570:1: rule__CondAnd__Group__2__Impl : ( '&&' ) ;
    public final void rule__CondAnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5574:1: ( ( '&&' ) )
            // InternalSemAdapt.g:5575:1: ( '&&' )
            {
            // InternalSemAdapt.g:5575:1: ( '&&' )
            // InternalSemAdapt.g:5576:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5585:1: rule__CondAnd__Group__3 : rule__CondAnd__Group__3__Impl ;
    public final void rule__CondAnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5589:1: ( rule__CondAnd__Group__3__Impl )
            // InternalSemAdapt.g:5590:2: rule__CondAnd__Group__3__Impl
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
    // InternalSemAdapt.g:5596:1: rule__CondAnd__Group__3__Impl : ( ( rule__CondAnd__RhsAssignment_3 ) ) ;
    public final void rule__CondAnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5600:1: ( ( ( rule__CondAnd__RhsAssignment_3 ) ) )
            // InternalSemAdapt.g:5601:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            {
            // InternalSemAdapt.g:5601:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            // InternalSemAdapt.g:5602:2: ( rule__CondAnd__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getRhsAssignment_3()); 
            }
            // InternalSemAdapt.g:5603:2: ( rule__CondAnd__RhsAssignment_3 )
            // InternalSemAdapt.g:5603:3: rule__CondAnd__RhsAssignment_3
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
    // InternalSemAdapt.g:5612:1: rule__CondEquality__Group_0__0 : rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 ;
    public final void rule__CondEquality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5616:1: ( rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 )
            // InternalSemAdapt.g:5617:2: rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5624:1: rule__CondEquality__Group_0__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5628:1: ( ( () ) )
            // InternalSemAdapt.g:5629:1: ( () )
            {
            // InternalSemAdapt.g:5629:1: ( () )
            // InternalSemAdapt.g:5630:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualAction_0_0()); 
            }
            // InternalSemAdapt.g:5631:2: ()
            // InternalSemAdapt.g:5631:3: 
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
    // InternalSemAdapt.g:5639:1: rule__CondEquality__Group_0__1 : rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 ;
    public final void rule__CondEquality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5643:1: ( rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 )
            // InternalSemAdapt.g:5644:2: rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalSemAdapt.g:5651:1: rule__CondEquality__Group_0__1__Impl : ( ( rule__CondEquality__LhsAssignment_0_1 ) ) ;
    public final void rule__CondEquality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5655:1: ( ( ( rule__CondEquality__LhsAssignment_0_1 ) ) )
            // InternalSemAdapt.g:5656:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            {
            // InternalSemAdapt.g:5656:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            // InternalSemAdapt.g:5657:2: ( rule__CondEquality__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_0_1()); 
            }
            // InternalSemAdapt.g:5658:2: ( rule__CondEquality__LhsAssignment_0_1 )
            // InternalSemAdapt.g:5658:3: rule__CondEquality__LhsAssignment_0_1
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
    // InternalSemAdapt.g:5666:1: rule__CondEquality__Group_0__2 : rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 ;
    public final void rule__CondEquality__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5670:1: ( rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 )
            // InternalSemAdapt.g:5671:2: rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5678:1: rule__CondEquality__Group_0__2__Impl : ( '==' ) ;
    public final void rule__CondEquality__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5682:1: ( ( '==' ) )
            // InternalSemAdapt.g:5683:1: ( '==' )
            {
            // InternalSemAdapt.g:5683:1: ( '==' )
            // InternalSemAdapt.g:5684:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5693:1: rule__CondEquality__Group_0__3 : rule__CondEquality__Group_0__3__Impl ;
    public final void rule__CondEquality__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5697:1: ( rule__CondEquality__Group_0__3__Impl )
            // InternalSemAdapt.g:5698:2: rule__CondEquality__Group_0__3__Impl
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
    // InternalSemAdapt.g:5704:1: rule__CondEquality__Group_0__3__Impl : ( ( rule__CondEquality__RhsAssignment_0_3 ) ) ;
    public final void rule__CondEquality__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5708:1: ( ( ( rule__CondEquality__RhsAssignment_0_3 ) ) )
            // InternalSemAdapt.g:5709:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            {
            // InternalSemAdapt.g:5709:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            // InternalSemAdapt.g:5710:2: ( rule__CondEquality__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_0_3()); 
            }
            // InternalSemAdapt.g:5711:2: ( rule__CondEquality__RhsAssignment_0_3 )
            // InternalSemAdapt.g:5711:3: rule__CondEquality__RhsAssignment_0_3
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
    // InternalSemAdapt.g:5720:1: rule__CondEquality__Group_1__0 : rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 ;
    public final void rule__CondEquality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5724:1: ( rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 )
            // InternalSemAdapt.g:5725:2: rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5732:1: rule__CondEquality__Group_1__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5736:1: ( ( () ) )
            // InternalSemAdapt.g:5737:1: ( () )
            {
            // InternalSemAdapt.g:5737:1: ( () )
            // InternalSemAdapt.g:5738:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0()); 
            }
            // InternalSemAdapt.g:5739:2: ()
            // InternalSemAdapt.g:5739:3: 
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
    // InternalSemAdapt.g:5747:1: rule__CondEquality__Group_1__1 : rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 ;
    public final void rule__CondEquality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5751:1: ( rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 )
            // InternalSemAdapt.g:5752:2: rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSemAdapt.g:5759:1: rule__CondEquality__Group_1__1__Impl : ( ( rule__CondEquality__LhsAssignment_1_1 ) ) ;
    public final void rule__CondEquality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5763:1: ( ( ( rule__CondEquality__LhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:5764:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:5764:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            // InternalSemAdapt.g:5765:2: ( rule__CondEquality__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:5766:2: ( rule__CondEquality__LhsAssignment_1_1 )
            // InternalSemAdapt.g:5766:3: rule__CondEquality__LhsAssignment_1_1
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
    // InternalSemAdapt.g:5774:1: rule__CondEquality__Group_1__2 : rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 ;
    public final void rule__CondEquality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5778:1: ( rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 )
            // InternalSemAdapt.g:5779:2: rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5786:1: rule__CondEquality__Group_1__2__Impl : ( '!=' ) ;
    public final void rule__CondEquality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5790:1: ( ( '!=' ) )
            // InternalSemAdapt.g:5791:1: ( '!=' )
            {
            // InternalSemAdapt.g:5791:1: ( '!=' )
            // InternalSemAdapt.g:5792:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5801:1: rule__CondEquality__Group_1__3 : rule__CondEquality__Group_1__3__Impl ;
    public final void rule__CondEquality__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5805:1: ( rule__CondEquality__Group_1__3__Impl )
            // InternalSemAdapt.g:5806:2: rule__CondEquality__Group_1__3__Impl
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
    // InternalSemAdapt.g:5812:1: rule__CondEquality__Group_1__3__Impl : ( ( rule__CondEquality__RhsAssignment_1_3 ) ) ;
    public final void rule__CondEquality__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5816:1: ( ( ( rule__CondEquality__RhsAssignment_1_3 ) ) )
            // InternalSemAdapt.g:5817:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            {
            // InternalSemAdapt.g:5817:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            // InternalSemAdapt.g:5818:2: ( rule__CondEquality__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_1_3()); 
            }
            // InternalSemAdapt.g:5819:2: ( rule__CondEquality__RhsAssignment_1_3 )
            // InternalSemAdapt.g:5819:3: rule__CondEquality__RhsAssignment_1_3
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
    // InternalSemAdapt.g:5828:1: rule__CondComparison__Group_0__0 : rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 ;
    public final void rule__CondComparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5832:1: ( rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 )
            // InternalSemAdapt.g:5833:2: rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5840:1: rule__CondComparison__Group_0__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5844:1: ( ( () ) )
            // InternalSemAdapt.g:5845:1: ( () )
            {
            // InternalSemAdapt.g:5845:1: ( () )
            // InternalSemAdapt.g:5846:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessAction_0_0()); 
            }
            // InternalSemAdapt.g:5847:2: ()
            // InternalSemAdapt.g:5847:3: 
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
    // InternalSemAdapt.g:5855:1: rule__CondComparison__Group_0__1 : rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 ;
    public final void rule__CondComparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5859:1: ( rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 )
            // InternalSemAdapt.g:5860:2: rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSemAdapt.g:5867:1: rule__CondComparison__Group_0__1__Impl : ( ( rule__CondComparison__LhsAssignment_0_1 ) ) ;
    public final void rule__CondComparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5871:1: ( ( ( rule__CondComparison__LhsAssignment_0_1 ) ) )
            // InternalSemAdapt.g:5872:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            {
            // InternalSemAdapt.g:5872:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            // InternalSemAdapt.g:5873:2: ( rule__CondComparison__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_0_1()); 
            }
            // InternalSemAdapt.g:5874:2: ( rule__CondComparison__LhsAssignment_0_1 )
            // InternalSemAdapt.g:5874:3: rule__CondComparison__LhsAssignment_0_1
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
    // InternalSemAdapt.g:5882:1: rule__CondComparison__Group_0__2 : rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 ;
    public final void rule__CondComparison__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5886:1: ( rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 )
            // InternalSemAdapt.g:5887:2: rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5894:1: rule__CondComparison__Group_0__2__Impl : ( '<' ) ;
    public final void rule__CondComparison__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5898:1: ( ( '<' ) )
            // InternalSemAdapt.g:5899:1: ( '<' )
            {
            // InternalSemAdapt.g:5899:1: ( '<' )
            // InternalSemAdapt.g:5900:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:5909:1: rule__CondComparison__Group_0__3 : rule__CondComparison__Group_0__3__Impl ;
    public final void rule__CondComparison__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5913:1: ( rule__CondComparison__Group_0__3__Impl )
            // InternalSemAdapt.g:5914:2: rule__CondComparison__Group_0__3__Impl
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
    // InternalSemAdapt.g:5920:1: rule__CondComparison__Group_0__3__Impl : ( ( rule__CondComparison__RhsAssignment_0_3 ) ) ;
    public final void rule__CondComparison__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5924:1: ( ( ( rule__CondComparison__RhsAssignment_0_3 ) ) )
            // InternalSemAdapt.g:5925:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            {
            // InternalSemAdapt.g:5925:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            // InternalSemAdapt.g:5926:2: ( rule__CondComparison__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_0_3()); 
            }
            // InternalSemAdapt.g:5927:2: ( rule__CondComparison__RhsAssignment_0_3 )
            // InternalSemAdapt.g:5927:3: rule__CondComparison__RhsAssignment_0_3
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
    // InternalSemAdapt.g:5936:1: rule__CondComparison__Group_1__0 : rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 ;
    public final void rule__CondComparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5940:1: ( rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 )
            // InternalSemAdapt.g:5941:2: rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:5948:1: rule__CondComparison__Group_1__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5952:1: ( ( () ) )
            // InternalSemAdapt.g:5953:1: ( () )
            {
            // InternalSemAdapt.g:5953:1: ( () )
            // InternalSemAdapt.g:5954:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessEqAction_1_0()); 
            }
            // InternalSemAdapt.g:5955:2: ()
            // InternalSemAdapt.g:5955:3: 
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
    // InternalSemAdapt.g:5963:1: rule__CondComparison__Group_1__1 : rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 ;
    public final void rule__CondComparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5967:1: ( rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 )
            // InternalSemAdapt.g:5968:2: rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalSemAdapt.g:5975:1: rule__CondComparison__Group_1__1__Impl : ( ( rule__CondComparison__LhsAssignment_1_1 ) ) ;
    public final void rule__CondComparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5979:1: ( ( ( rule__CondComparison__LhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:5980:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:5980:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            // InternalSemAdapt.g:5981:2: ( rule__CondComparison__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:5982:2: ( rule__CondComparison__LhsAssignment_1_1 )
            // InternalSemAdapt.g:5982:3: rule__CondComparison__LhsAssignment_1_1
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
    // InternalSemAdapt.g:5990:1: rule__CondComparison__Group_1__2 : rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 ;
    public final void rule__CondComparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5994:1: ( rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 )
            // InternalSemAdapt.g:5995:2: rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6002:1: rule__CondComparison__Group_1__2__Impl : ( '<=' ) ;
    public final void rule__CondComparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6006:1: ( ( '<=' ) )
            // InternalSemAdapt.g:6007:1: ( '<=' )
            {
            // InternalSemAdapt.g:6007:1: ( '<=' )
            // InternalSemAdapt.g:6008:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6017:1: rule__CondComparison__Group_1__3 : rule__CondComparison__Group_1__3__Impl ;
    public final void rule__CondComparison__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6021:1: ( rule__CondComparison__Group_1__3__Impl )
            // InternalSemAdapt.g:6022:2: rule__CondComparison__Group_1__3__Impl
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
    // InternalSemAdapt.g:6028:1: rule__CondComparison__Group_1__3__Impl : ( ( rule__CondComparison__RhsAssignment_1_3 ) ) ;
    public final void rule__CondComparison__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6032:1: ( ( ( rule__CondComparison__RhsAssignment_1_3 ) ) )
            // InternalSemAdapt.g:6033:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            {
            // InternalSemAdapt.g:6033:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            // InternalSemAdapt.g:6034:2: ( rule__CondComparison__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_1_3()); 
            }
            // InternalSemAdapt.g:6035:2: ( rule__CondComparison__RhsAssignment_1_3 )
            // InternalSemAdapt.g:6035:3: rule__CondComparison__RhsAssignment_1_3
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
    // InternalSemAdapt.g:6044:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6048:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSemAdapt.g:6049:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSemAdapt.g:6056:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6060:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:6061:1: ( ruleAnd )
            {
            // InternalSemAdapt.g:6061:1: ( ruleAnd )
            // InternalSemAdapt.g:6062:2: ruleAnd
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
    // InternalSemAdapt.g:6071:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6075:1: ( rule__Or__Group__1__Impl )
            // InternalSemAdapt.g:6076:2: rule__Or__Group__1__Impl
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
    // InternalSemAdapt.g:6082:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6086:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSemAdapt.g:6087:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6087:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSemAdapt.g:6088:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6089:2: ( rule__Or__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==42) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSemAdapt.g:6089:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalSemAdapt.g:6098:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6102:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSemAdapt.g:6103:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSemAdapt.g:6110:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6114:1: ( ( () ) )
            // InternalSemAdapt.g:6115:1: ( () )
            {
            // InternalSemAdapt.g:6115:1: ( () )
            // InternalSemAdapt.g:6116:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLhsAction_1_0()); 
            }
            // InternalSemAdapt.g:6117:2: ()
            // InternalSemAdapt.g:6117:3: 
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
    // InternalSemAdapt.g:6125:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6129:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSemAdapt.g:6130:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6137:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6141:1: ( ( '||' ) )
            // InternalSemAdapt.g:6142:1: ( '||' )
            {
            // InternalSemAdapt.g:6142:1: ( '||' )
            // InternalSemAdapt.g:6143:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6152:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6156:1: ( rule__Or__Group_1__2__Impl )
            // InternalSemAdapt.g:6157:2: rule__Or__Group_1__2__Impl
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
    // InternalSemAdapt.g:6163:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RhsAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6167:1: ( ( ( rule__Or__RhsAssignment_1_2 ) ) )
            // InternalSemAdapt.g:6168:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            {
            // InternalSemAdapt.g:6168:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            // InternalSemAdapt.g:6169:2: ( rule__Or__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRhsAssignment_1_2()); 
            }
            // InternalSemAdapt.g:6170:2: ( rule__Or__RhsAssignment_1_2 )
            // InternalSemAdapt.g:6170:3: rule__Or__RhsAssignment_1_2
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
    // InternalSemAdapt.g:6179:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6183:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSemAdapt.g:6184:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSemAdapt.g:6191:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6195:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:6196:1: ( ruleEquality )
            {
            // InternalSemAdapt.g:6196:1: ( ruleEquality )
            // InternalSemAdapt.g:6197:2: ruleEquality
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
    // InternalSemAdapt.g:6206:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6210:1: ( rule__And__Group__1__Impl )
            // InternalSemAdapt.g:6211:2: rule__And__Group__1__Impl
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
    // InternalSemAdapt.g:6217:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6221:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSemAdapt.g:6222:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6222:1: ( ( rule__And__Group_1__0 )* )
            // InternalSemAdapt.g:6223:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6224:2: ( rule__And__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSemAdapt.g:6224:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalSemAdapt.g:6233:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6237:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSemAdapt.g:6238:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSemAdapt.g:6245:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6249:1: ( ( () ) )
            // InternalSemAdapt.g:6250:1: ( () )
            {
            // InternalSemAdapt.g:6250:1: ( () )
            // InternalSemAdapt.g:6251:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLhsAction_1_0()); 
            }
            // InternalSemAdapt.g:6252:2: ()
            // InternalSemAdapt.g:6252:3: 
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
    // InternalSemAdapt.g:6260:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6264:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSemAdapt.g:6265:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6272:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6276:1: ( ( '&&' ) )
            // InternalSemAdapt.g:6277:1: ( '&&' )
            {
            // InternalSemAdapt.g:6277:1: ( '&&' )
            // InternalSemAdapt.g:6278:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6287:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6291:1: ( rule__And__Group_1__2__Impl )
            // InternalSemAdapt.g:6292:2: rule__And__Group_1__2__Impl
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
    // InternalSemAdapt.g:6298:1: rule__And__Group_1__2__Impl : ( ( rule__And__RhsAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6302:1: ( ( ( rule__And__RhsAssignment_1_2 ) ) )
            // InternalSemAdapt.g:6303:1: ( ( rule__And__RhsAssignment_1_2 ) )
            {
            // InternalSemAdapt.g:6303:1: ( ( rule__And__RhsAssignment_1_2 ) )
            // InternalSemAdapt.g:6304:2: ( rule__And__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRhsAssignment_1_2()); 
            }
            // InternalSemAdapt.g:6305:2: ( rule__And__RhsAssignment_1_2 )
            // InternalSemAdapt.g:6305:3: rule__And__RhsAssignment_1_2
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
    // InternalSemAdapt.g:6314:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6318:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalSemAdapt.g:6319:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalSemAdapt.g:6326:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6330:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:6331:1: ( ruleComparison )
            {
            // InternalSemAdapt.g:6331:1: ( ruleComparison )
            // InternalSemAdapt.g:6332:2: ruleComparison
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
    // InternalSemAdapt.g:6341:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6345:1: ( rule__Equality__Group__1__Impl )
            // InternalSemAdapt.g:6346:2: rule__Equality__Group__1__Impl
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
    // InternalSemAdapt.g:6352:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6356:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalSemAdapt.g:6357:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6357:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalSemAdapt.g:6358:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6359:2: ( rule__Equality__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=44 && LA47_0<=45)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSemAdapt.g:6359:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalSemAdapt.g:6368:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6372:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalSemAdapt.g:6373:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6380:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6384:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:6385:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:6385:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalSemAdapt.g:6386:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:6387:2: ( rule__Equality__Alternatives_1_0 )
            // InternalSemAdapt.g:6387:3: rule__Equality__Alternatives_1_0
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
    // InternalSemAdapt.g:6395:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6399:1: ( rule__Equality__Group_1__1__Impl )
            // InternalSemAdapt.g:6400:2: rule__Equality__Group_1__1__Impl
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
    // InternalSemAdapt.g:6406:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RhsAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6410:1: ( ( ( rule__Equality__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6411:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6411:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6412:2: ( rule__Equality__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6413:2: ( rule__Equality__RhsAssignment_1_1 )
            // InternalSemAdapt.g:6413:3: rule__Equality__RhsAssignment_1_1
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
    // InternalSemAdapt.g:6422:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6426:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalSemAdapt.g:6427:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSemAdapt.g:6434:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6438:1: ( ( () ) )
            // InternalSemAdapt.g:6439:1: ( () )
            {
            // InternalSemAdapt.g:6439:1: ( () )
            // InternalSemAdapt.g:6440:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:6441:2: ()
            // InternalSemAdapt.g:6441:3: 
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
    // InternalSemAdapt.g:6449:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6453:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:6454:2: rule__Equality__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:6460:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6464:1: ( ( '==' ) )
            // InternalSemAdapt.g:6465:1: ( '==' )
            {
            // InternalSemAdapt.g:6465:1: ( '==' )
            // InternalSemAdapt.g:6466:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6476:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6480:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalSemAdapt.g:6481:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalSemAdapt.g:6488:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6492:1: ( ( () ) )
            // InternalSemAdapt.g:6493:1: ( () )
            {
            // InternalSemAdapt.g:6493:1: ( () )
            // InternalSemAdapt.g:6494:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:6495:2: ()
            // InternalSemAdapt.g:6495:3: 
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
    // InternalSemAdapt.g:6503:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6507:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:6508:2: rule__Equality__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:6514:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6518:1: ( ( '!=' ) )
            // InternalSemAdapt.g:6519:1: ( '!=' )
            {
            // InternalSemAdapt.g:6519:1: ( '!=' )
            // InternalSemAdapt.g:6520:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6530:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6534:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalSemAdapt.g:6535:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSemAdapt.g:6542:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6546:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:6547:1: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:6547:1: ( rulePlusOrMinus )
            // InternalSemAdapt.g:6548:2: rulePlusOrMinus
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
    // InternalSemAdapt.g:6557:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6561:1: ( rule__Comparison__Group__1__Impl )
            // InternalSemAdapt.g:6562:2: rule__Comparison__Group__1__Impl
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
    // InternalSemAdapt.g:6568:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6572:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalSemAdapt.g:6573:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6573:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalSemAdapt.g:6574:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6575:2: ( rule__Comparison__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=46 && LA48_0<=47)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSemAdapt.g:6575:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalSemAdapt.g:6584:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6588:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalSemAdapt.g:6589:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6596:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6600:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:6601:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:6601:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalSemAdapt.g:6602:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:6603:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalSemAdapt.g:6603:3: rule__Comparison__Alternatives_1_0
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
    // InternalSemAdapt.g:6611:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6615:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalSemAdapt.g:6616:2: rule__Comparison__Group_1__1__Impl
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
    // InternalSemAdapt.g:6622:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RhsAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6626:1: ( ( ( rule__Comparison__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6627:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6627:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6628:2: ( rule__Comparison__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6629:2: ( rule__Comparison__RhsAssignment_1_1 )
            // InternalSemAdapt.g:6629:3: rule__Comparison__RhsAssignment_1_1
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
    // InternalSemAdapt.g:6638:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6642:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalSemAdapt.g:6643:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalSemAdapt.g:6650:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6654:1: ( ( () ) )
            // InternalSemAdapt.g:6655:1: ( () )
            {
            // InternalSemAdapt.g:6655:1: ( () )
            // InternalSemAdapt.g:6656:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:6657:2: ()
            // InternalSemAdapt.g:6657:3: 
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
    // InternalSemAdapt.g:6665:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6669:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:6670:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:6676:1: rule__Comparison__Group_1_0_0__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6680:1: ( ( '<' ) )
            // InternalSemAdapt.g:6681:1: ( '<' )
            {
            // InternalSemAdapt.g:6681:1: ( '<' )
            // InternalSemAdapt.g:6682:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6692:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6696:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalSemAdapt.g:6697:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSemAdapt.g:6704:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6708:1: ( ( () ) )
            // InternalSemAdapt.g:6709:1: ( () )
            {
            // InternalSemAdapt.g:6709:1: ( () )
            // InternalSemAdapt.g:6710:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:6711:2: ()
            // InternalSemAdapt.g:6711:3: 
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
    // InternalSemAdapt.g:6719:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6723:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:6724:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:6730:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6734:1: ( ( '<=' ) )
            // InternalSemAdapt.g:6735:1: ( '<=' )
            {
            // InternalSemAdapt.g:6735:1: ( '<=' )
            // InternalSemAdapt.g:6736:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6746:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6750:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalSemAdapt.g:6751:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalSemAdapt.g:6758:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6762:1: ( ( ruleMulOrDiv ) )
            // InternalSemAdapt.g:6763:1: ( ruleMulOrDiv )
            {
            // InternalSemAdapt.g:6763:1: ( ruleMulOrDiv )
            // InternalSemAdapt.g:6764:2: ruleMulOrDiv
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
    // InternalSemAdapt.g:6773:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6777:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalSemAdapt.g:6778:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalSemAdapt.g:6784:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6788:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalSemAdapt.g:6789:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6789:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalSemAdapt.g:6790:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6791:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=48 && LA49_0<=49)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSemAdapt.g:6791:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalSemAdapt.g:6800:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6804:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalSemAdapt.g:6805:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6812:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6816:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:6817:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:6817:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalSemAdapt.g:6818:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:6819:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalSemAdapt.g:6819:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalSemAdapt.g:6827:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6831:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalSemAdapt.g:6832:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalSemAdapt.g:6838:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6842:1: ( ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6843:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6843:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6844:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6845:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            // InternalSemAdapt.g:6845:3: rule__PlusOrMinus__RhsAssignment_1_1
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
    // InternalSemAdapt.g:6854:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6858:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalSemAdapt.g:6859:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSemAdapt.g:6866:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6870:1: ( ( () ) )
            // InternalSemAdapt.g:6871:1: ( () )
            {
            // InternalSemAdapt.g:6871:1: ( () )
            // InternalSemAdapt.g:6872:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:6873:2: ()
            // InternalSemAdapt.g:6873:3: 
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
    // InternalSemAdapt.g:6881:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6885:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:6886:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:6892:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6896:1: ( ( '+' ) )
            // InternalSemAdapt.g:6897:1: ( '+' )
            {
            // InternalSemAdapt.g:6897:1: ( '+' )
            // InternalSemAdapt.g:6898:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6908:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6912:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalSemAdapt.g:6913:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalSemAdapt.g:6920:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6924:1: ( ( () ) )
            // InternalSemAdapt.g:6925:1: ( () )
            {
            // InternalSemAdapt.g:6925:1: ( () )
            // InternalSemAdapt.g:6926:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:6927:2: ()
            // InternalSemAdapt.g:6927:3: 
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
    // InternalSemAdapt.g:6935:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6939:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:6940:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:6946:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6950:1: ( ( '-' ) )
            // InternalSemAdapt.g:6951:1: ( '-' )
            {
            // InternalSemAdapt.g:6951:1: ( '-' )
            // InternalSemAdapt.g:6952:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6962:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6966:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalSemAdapt.g:6967:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalSemAdapt.g:6974:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6978:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:6979:1: ( rulePrimary )
            {
            // InternalSemAdapt.g:6979:1: ( rulePrimary )
            // InternalSemAdapt.g:6980:2: rulePrimary
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
    // InternalSemAdapt.g:6989:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6993:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalSemAdapt.g:6994:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalSemAdapt.g:7000:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7004:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalSemAdapt.g:7005:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalSemAdapt.g:7005:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalSemAdapt.g:7006:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:7007:2: ( rule__MulOrDiv__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=50 && LA50_0<=51)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSemAdapt.g:7007:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalSemAdapt.g:7016:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7020:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalSemAdapt.g:7021:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:7028:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7032:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:7033:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:7033:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalSemAdapt.g:7034:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:7035:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalSemAdapt.g:7035:3: rule__MulOrDiv__Alternatives_1_0
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
    // InternalSemAdapt.g:7043:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7047:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalSemAdapt.g:7048:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalSemAdapt.g:7054:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7058:1: ( ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:7059:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:7059:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:7060:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:7061:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            // InternalSemAdapt.g:7061:3: rule__MulOrDiv__RhsAssignment_1_1
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
    // InternalSemAdapt.g:7070:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7074:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalSemAdapt.g:7075:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalSemAdapt.g:7082:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7086:1: ( ( () ) )
            // InternalSemAdapt.g:7087:1: ( () )
            {
            // InternalSemAdapt.g:7087:1: ( () )
            // InternalSemAdapt.g:7088:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:7089:2: ()
            // InternalSemAdapt.g:7089:3: 
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
    // InternalSemAdapt.g:7097:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7101:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:7102:2: rule__MulOrDiv__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:7108:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7112:1: ( ( '*' ) )
            // InternalSemAdapt.g:7113:1: ( '*' )
            {
            // InternalSemAdapt.g:7113:1: ( '*' )
            // InternalSemAdapt.g:7114:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7124:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7128:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalSemAdapt.g:7129:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalSemAdapt.g:7136:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7140:1: ( ( () ) )
            // InternalSemAdapt.g:7141:1: ( () )
            {
            // InternalSemAdapt.g:7141:1: ( () )
            // InternalSemAdapt.g:7142:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:7143:2: ()
            // InternalSemAdapt.g:7143:3: 
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
    // InternalSemAdapt.g:7151:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7155:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:7156:2: rule__MulOrDiv__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:7162:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7166:1: ( ( '/' ) )
            // InternalSemAdapt.g:7167:1: ( '/' )
            {
            // InternalSemAdapt.g:7167:1: ( '/' )
            // InternalSemAdapt.g:7168:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7178:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7182:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalSemAdapt.g:7183:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:7190:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7194:1: ( ( '(' ) )
            // InternalSemAdapt.g:7195:1: ( '(' )
            {
            // InternalSemAdapt.g:7195:1: ( '(' )
            // InternalSemAdapt.g:7196:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7205:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7209:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalSemAdapt.g:7210:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSemAdapt.g:7217:1: rule__Primary__Group_0__1__Impl : ( ruleExpr ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7221:1: ( ( ruleExpr ) )
            // InternalSemAdapt.g:7222:1: ( ruleExpr )
            {
            // InternalSemAdapt.g:7222:1: ( ruleExpr )
            // InternalSemAdapt.g:7223:2: ruleExpr
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
    // InternalSemAdapt.g:7232:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7236:1: ( rule__Primary__Group_0__2__Impl )
            // InternalSemAdapt.g:7237:2: rule__Primary__Group_0__2__Impl
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
    // InternalSemAdapt.g:7243:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7247:1: ( ( ')' ) )
            // InternalSemAdapt.g:7248:1: ( ')' )
            {
            // InternalSemAdapt.g:7248:1: ( ')' )
            // InternalSemAdapt.g:7249:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7259:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7263:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalSemAdapt.g:7264:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalSemAdapt.g:7271:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7275:1: ( ( () ) )
            // InternalSemAdapt.g:7276:1: ( () )
            {
            // InternalSemAdapt.g:7276:1: ( () )
            // InternalSemAdapt.g:7277:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalSemAdapt.g:7278:2: ()
            // InternalSemAdapt.g:7278:3: 
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
    // InternalSemAdapt.g:7286:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7290:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalSemAdapt.g:7291:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:7298:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7302:1: ( ( '!' ) )
            // InternalSemAdapt.g:7303:1: ( '!' )
            {
            // InternalSemAdapt.g:7303:1: ( '!' )
            // InternalSemAdapt.g:7304:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7313:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7317:1: ( rule__Primary__Group_1__2__Impl )
            // InternalSemAdapt.g:7318:2: rule__Primary__Group_1__2__Impl
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
    // InternalSemAdapt.g:7324:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExprAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7328:1: ( ( ( rule__Primary__ExprAssignment_1_2 ) ) )
            // InternalSemAdapt.g:7329:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            {
            // InternalSemAdapt.g:7329:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            // InternalSemAdapt.g:7330:2: ( rule__Primary__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_1_2()); 
            }
            // InternalSemAdapt.g:7331:2: ( rule__Primary__ExprAssignment_1_2 )
            // InternalSemAdapt.g:7331:3: rule__Primary__ExprAssignment_1_2
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
    // InternalSemAdapt.g:7340:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7344:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSemAdapt.g:7345:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalSemAdapt.g:7352:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7356:1: ( ( () ) )
            // InternalSemAdapt.g:7357:1: ( () )
            {
            // InternalSemAdapt.g:7357:1: ( () )
            // InternalSemAdapt.g:7358:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getOppositeAction_2_0()); 
            }
            // InternalSemAdapt.g:7359:2: ()
            // InternalSemAdapt.g:7359:3: 
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
    // InternalSemAdapt.g:7367:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7371:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSemAdapt.g:7372:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:7379:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7383:1: ( ( '-' ) )
            // InternalSemAdapt.g:7384:1: ( '-' )
            {
            // InternalSemAdapt.g:7384:1: ( '-' )
            // InternalSemAdapt.g:7385:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7394:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7398:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSemAdapt.g:7399:2: rule__Primary__Group_2__2__Impl
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
    // InternalSemAdapt.g:7405:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExprAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7409:1: ( ( ( rule__Primary__ExprAssignment_2_2 ) ) )
            // InternalSemAdapt.g:7410:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            {
            // InternalSemAdapt.g:7410:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            // InternalSemAdapt.g:7411:2: ( rule__Primary__ExprAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_2_2()); 
            }
            // InternalSemAdapt.g:7412:2: ( rule__Primary__ExprAssignment_2_2 )
            // InternalSemAdapt.g:7412:3: rule__Primary__ExprAssignment_2_2
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
    // InternalSemAdapt.g:7421:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7425:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalSemAdapt.g:7426:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalSemAdapt.g:7433:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7437:1: ( ( () ) )
            // InternalSemAdapt.g:7438:1: ( () )
            {
            // InternalSemAdapt.g:7438:1: ( () )
            // InternalSemAdapt.g:7439:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }
            // InternalSemAdapt.g:7440:2: ()
            // InternalSemAdapt.g:7440:3: 
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
    // InternalSemAdapt.g:7448:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7452:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalSemAdapt.g:7453:2: rule__Atomic__Group_0__1__Impl
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
    // InternalSemAdapt.g:7459:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7463:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalSemAdapt.g:7464:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalSemAdapt.g:7464:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalSemAdapt.g:7465:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalSemAdapt.g:7466:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalSemAdapt.g:7466:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalSemAdapt.g:7475:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7479:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalSemAdapt.g:7480:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalSemAdapt.g:7487:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7491:1: ( ( () ) )
            // InternalSemAdapt.g:7492:1: ( () )
            {
            // InternalSemAdapt.g:7492:1: ( () )
            // InternalSemAdapt.g:7493:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0()); 
            }
            // InternalSemAdapt.g:7494:2: ()
            // InternalSemAdapt.g:7494:3: 
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
    // InternalSemAdapt.g:7502:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7506:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalSemAdapt.g:7507:2: rule__Atomic__Group_1__1__Impl
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
    // InternalSemAdapt.g:7513:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7517:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalSemAdapt.g:7518:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:7518:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalSemAdapt.g:7519:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalSemAdapt.g:7520:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalSemAdapt.g:7520:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalSemAdapt.g:7529:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7533:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalSemAdapt.g:7534:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalSemAdapt.g:7541:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7545:1: ( ( () ) )
            // InternalSemAdapt.g:7546:1: ( () )
            {
            // InternalSemAdapt.g:7546:1: ( () )
            // InternalSemAdapt.g:7547:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            }
            // InternalSemAdapt.g:7548:2: ()
            // InternalSemAdapt.g:7548:3: 
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
    // InternalSemAdapt.g:7556:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7560:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalSemAdapt.g:7561:2: rule__Atomic__Group_2__1__Impl
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
    // InternalSemAdapt.g:7567:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7571:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalSemAdapt.g:7572:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalSemAdapt.g:7572:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalSemAdapt.g:7573:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalSemAdapt.g:7574:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalSemAdapt.g:7574:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalSemAdapt.g:7583:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7587:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalSemAdapt.g:7588:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalSemAdapt.g:7595:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7599:1: ( ( () ) )
            // InternalSemAdapt.g:7600:1: ( () )
            {
            // InternalSemAdapt.g:7600:1: ( () )
            // InternalSemAdapt.g:7601:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }
            // InternalSemAdapt.g:7602:2: ()
            // InternalSemAdapt.g:7602:3: 
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
    // InternalSemAdapt.g:7610:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7614:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalSemAdapt.g:7615:2: rule__Atomic__Group_3__1__Impl
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
    // InternalSemAdapt.g:7621:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7625:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalSemAdapt.g:7626:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalSemAdapt.g:7626:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalSemAdapt.g:7627:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalSemAdapt.g:7628:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalSemAdapt.g:7628:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalSemAdapt.g:7637:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7641:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSemAdapt.g:7642:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSemAdapt.g:7649:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7653:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7654:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:7654:1: ( RULE_ID )
            // InternalSemAdapt.g:7655:2: RULE_ID
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
    // InternalSemAdapt.g:7664:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7668:1: ( rule__FQN__Group__1__Impl )
            // InternalSemAdapt.g:7669:2: rule__FQN__Group__1__Impl
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
    // InternalSemAdapt.g:7675:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7679:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSemAdapt.g:7680:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSemAdapt.g:7680:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSemAdapt.g:7681:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:7682:2: ( rule__FQN__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==34) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSemAdapt.g:7682:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalSemAdapt.g:7691:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7695:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSemAdapt.g:7696:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:7703:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7707:1: ( ( '.' ) )
            // InternalSemAdapt.g:7708:1: ( '.' )
            {
            // InternalSemAdapt.g:7708:1: ( '.' )
            // InternalSemAdapt.g:7709:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7718:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7722:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSemAdapt.g:7723:2: rule__FQN__Group_1__1__Impl
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
    // InternalSemAdapt.g:7729:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7733:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7734:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:7734:1: ( RULE_ID )
            // InternalSemAdapt.g:7735:2: RULE_ID
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
    // InternalSemAdapt.g:7745:1: rule__OperationFQN__Group__0 : rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 ;
    public final void rule__OperationFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7749:1: ( rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 )
            // InternalSemAdapt.g:7750:2: rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSemAdapt.g:7757:1: rule__OperationFQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7761:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7762:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:7762:1: ( RULE_ID )
            // InternalSemAdapt.g:7763:2: RULE_ID
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
    // InternalSemAdapt.g:7772:1: rule__OperationFQN__Group__1 : rule__OperationFQN__Group__1__Impl ;
    public final void rule__OperationFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7776:1: ( rule__OperationFQN__Group__1__Impl )
            // InternalSemAdapt.g:7777:2: rule__OperationFQN__Group__1__Impl
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
    // InternalSemAdapt.g:7783:1: rule__OperationFQN__Group__1__Impl : ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) ;
    public final void rule__OperationFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7787:1: ( ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) )
            // InternalSemAdapt.g:7788:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            {
            // InternalSemAdapt.g:7788:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            // InternalSemAdapt.g:7789:2: ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* )
            {
            // InternalSemAdapt.g:7789:2: ( ( rule__OperationFQN__Group_1__0 ) )
            // InternalSemAdapt.g:7790:3: ( rule__OperationFQN__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:7791:3: ( rule__OperationFQN__Group_1__0 )
            // InternalSemAdapt.g:7791:4: rule__OperationFQN__Group_1__0
            {
            pushFollow(FOLLOW_34);
            rule__OperationFQN__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }

            }

            // InternalSemAdapt.g:7794:2: ( ( rule__OperationFQN__Group_1__0 )* )
            // InternalSemAdapt.g:7795:3: ( rule__OperationFQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:7796:3: ( rule__OperationFQN__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSemAdapt.g:7796:4: rule__OperationFQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__OperationFQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalSemAdapt.g:7806:1: rule__OperationFQN__Group_1__0 : rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 ;
    public final void rule__OperationFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7810:1: ( rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 )
            // InternalSemAdapt.g:7811:2: rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:7818:1: rule__OperationFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__OperationFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7822:1: ( ( '.' ) )
            // InternalSemAdapt.g:7823:1: ( '.' )
            {
            // InternalSemAdapt.g:7823:1: ( '.' )
            // InternalSemAdapt.g:7824:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7833:1: rule__OperationFQN__Group_1__1 : rule__OperationFQN__Group_1__1__Impl ;
    public final void rule__OperationFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7837:1: ( rule__OperationFQN__Group_1__1__Impl )
            // InternalSemAdapt.g:7838:2: rule__OperationFQN__Group_1__1__Impl
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
    // InternalSemAdapt.g:7844:1: rule__OperationFQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7848:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7849:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:7849:1: ( RULE_ID )
            // InternalSemAdapt.g:7850:2: RULE_ID
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


    // $ANTLR start "rule__SemanticAdaptation__ModelAssignment_0"
    // InternalSemAdapt.g:7860:1: rule__SemanticAdaptation__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__SemanticAdaptation__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7864:1: ( ( ruleModel ) )
            // InternalSemAdapt.g:7865:2: ( ruleModel )
            {
            // InternalSemAdapt.g:7865:2: ( ruleModel )
            // InternalSemAdapt.g:7866:3: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getModelModelParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getModelModelParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__ModelAssignment_0"


    // $ANTLR start "rule__SemanticAdaptation__SemanticsAssignment_1"
    // InternalSemAdapt.g:7875:1: rule__SemanticAdaptation__SemanticsAssignment_1 : ( ruleSemantics ) ;
    public final void rule__SemanticAdaptation__SemanticsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7879:1: ( ( ruleSemantics ) )
            // InternalSemAdapt.g:7880:2: ( ruleSemantics )
            {
            // InternalSemAdapt.g:7880:2: ( ruleSemantics )
            // InternalSemAdapt.g:7881:3: ruleSemantics
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getSemanticsSemanticsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSemantics();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getSemanticsSemanticsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__SemanticsAssignment_1"


    // $ANTLR start "rule__SemanticAdaptation__ImportsAssignment_2"
    // InternalSemAdapt.g:7890:1: rule__SemanticAdaptation__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__SemanticAdaptation__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7894:1: ( ( ruleImport ) )
            // InternalSemAdapt.g:7895:2: ( ruleImport )
            {
            // InternalSemAdapt.g:7895:2: ( ruleImport )
            // InternalSemAdapt.g:7896:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__ImportsAssignment_2"


    // $ANTLR start "rule__SemanticAdaptation__ModulesAssignment_3"
    // InternalSemAdapt.g:7905:1: rule__SemanticAdaptation__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__SemanticAdaptation__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7909:1: ( ( ruleModule ) )
            // InternalSemAdapt.g:7910:2: ( ruleModule )
            {
            // InternalSemAdapt.g:7910:2: ( ruleModule )
            // InternalSemAdapt.g:7911:3: ruleModule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getModulesModuleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticAdaptationAccess().getModulesModuleParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticAdaptation__ModulesAssignment_3"


    // $ANTLR start "rule__Semantics__ImportURIAssignment_1"
    // InternalSemAdapt.g:7920:1: rule__Semantics__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Semantics__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7924:1: ( ( ruleEString ) )
            // InternalSemAdapt.g:7925:2: ( ruleEString )
            {
            // InternalSemAdapt.g:7925:2: ( ruleEString )
            // InternalSemAdapt.g:7926:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticsAccess().getImportURIEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSemanticsAccess().getImportURIEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantics__ImportURIAssignment_1"


    // $ANTLR start "rule__Module__NameAssignment_0"
    // InternalSemAdapt.g:7935:1: rule__Module__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7939:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7940:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:7940:2: ( RULE_ID )
            // InternalSemAdapt.g:7941:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_0"


    // $ANTLR start "rule__Module__PointcutsAssignment_2"
    // InternalSemAdapt.g:7950:1: rule__Module__PointcutsAssignment_2 : ( rulePointcut ) ;
    public final void rule__Module__PointcutsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7954:1: ( ( rulePointcut ) )
            // InternalSemAdapt.g:7955:2: ( rulePointcut )
            {
            // InternalSemAdapt.g:7955:2: ( rulePointcut )
            // InternalSemAdapt.g:7956:3: rulePointcut
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPointcutsPointcutParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePointcut();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPointcutsPointcutParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PointcutsAssignment_2"


    // $ANTLR start "rule__Module__AdaptationsAssignment_3"
    // InternalSemAdapt.g:7965:1: rule__Module__AdaptationsAssignment_3 : ( ruleAdaptation ) ;
    public final void rule__Module__AdaptationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7969:1: ( ( ruleAdaptation ) )
            // InternalSemAdapt.g:7970:2: ( ruleAdaptation )
            {
            // InternalSemAdapt.g:7970:2: ( ruleAdaptation )
            // InternalSemAdapt.g:7971:3: ruleAdaptation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getAdaptationsAdaptationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdaptation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getAdaptationsAdaptationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__AdaptationsAssignment_3"


    // $ANTLR start "rule__Pointcut__RecursiveAssignment_0"
    // InternalSemAdapt.g:7980:1: rule__Pointcut__RecursiveAssignment_0 : ( ( 'recursive' ) ) ;
    public final void rule__Pointcut__RecursiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7984:1: ( ( ( 'recursive' ) ) )
            // InternalSemAdapt.g:7985:2: ( ( 'recursive' ) )
            {
            // InternalSemAdapt.g:7985:2: ( ( 'recursive' ) )
            // InternalSemAdapt.g:7986:3: ( 'recursive' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getRecursiveRecursiveKeyword_0_0()); 
            }
            // InternalSemAdapt.g:7987:3: ( 'recursive' )
            // InternalSemAdapt.g:7988:4: 'recursive'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getRecursiveRecursiveKeyword_0_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getRecursiveRecursiveKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getRecursiveRecursiveKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__RecursiveAssignment_0"


    // $ANTLR start "rule__Pointcut__StructureAssignment_2"
    // InternalSemAdapt.g:7999:1: rule__Pointcut__StructureAssignment_2 : ( ruleDefConfiguration ) ;
    public final void rule__Pointcut__StructureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8003:1: ( ( ruleDefConfiguration ) )
            // InternalSemAdapt.g:8004:2: ( ruleDefConfiguration )
            {
            // InternalSemAdapt.g:8004:2: ( ruleDefConfiguration )
            // InternalSemAdapt.g:8005:3: ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getStructureDefConfigurationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getStructureDefConfigurationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__StructureAssignment_2"


    // $ANTLR start "rule__Pointcut__ConditionsAssignment_3_1"
    // InternalSemAdapt.g:8014:1: rule__Pointcut__ConditionsAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Pointcut__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8018:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8019:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8019:2: ( ruleCondition )
            // InternalSemAdapt.g:8020:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getConditionsConditionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getConditionsConditionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__ConditionsAssignment_3_1"


    // $ANTLR start "rule__Pointcut__ConditionsAssignment_3_2_1"
    // InternalSemAdapt.g:8029:1: rule__Pointcut__ConditionsAssignment_3_2_1 : ( ruleCondition ) ;
    public final void rule__Pointcut__ConditionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8033:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8034:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8034:2: ( ruleCondition )
            // InternalSemAdapt.g:8035:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getConditionsConditionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getConditionsConditionParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__ConditionsAssignment_3_2_1"


    // $ANTLR start "rule__Adaptation__TargetAssignment_1"
    // InternalSemAdapt.g:8044:1: rule__Adaptation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adaptation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8048:1: ( ( ( RULE_ID ) ) )
            // InternalSemAdapt.g:8049:2: ( ( RULE_ID ) )
            {
            // InternalSemAdapt.g:8049:2: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8050:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getTargetRuleCrossReference_1_0()); 
            }
            // InternalSemAdapt.g:8051:3: ( RULE_ID )
            // InternalSemAdapt.g:8052:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getTargetRuleIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getTargetRuleIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getTargetRuleCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__TargetAssignment_1"


    // $ANTLR start "rule__Adaptation__AdaptationAssignment_2"
    // InternalSemAdapt.g:8063:1: rule__Adaptation__AdaptationAssignment_2 : ( ruleRule ) ;
    public final void rule__Adaptation__AdaptationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8067:1: ( ( ruleRule ) )
            // InternalSemAdapt.g:8068:2: ( ruleRule )
            {
            // InternalSemAdapt.g:8068:2: ( ruleRule )
            // InternalSemAdapt.g:8069:3: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAdaptationRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdaptationAccess().getAdaptationRuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adaptation__AdaptationAssignment_2"


    // $ANTLR start "rule__Model__ImportURIAssignment_1"
    // InternalSemAdapt.g:8078:1: rule__Model__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8082:1: ( ( ruleEString ) )
            // InternalSemAdapt.g:8083:2: ( ruleEString )
            {
            // InternalSemAdapt.g:8083:2: ( ruleEString )
            // InternalSemAdapt.g:8084:3: ruleEString
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
    // InternalSemAdapt.g:8093:1: rule__Model__SemanticdomainAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Model__SemanticdomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8097:1: ( ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:8098:2: ( ( ruleFQN ) )
            {
            // InternalSemAdapt.g:8098:2: ( ( ruleFQN ) )
            // InternalSemAdapt.g:8099:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0()); 
            }
            // InternalSemAdapt.g:8100:3: ( ruleFQN )
            // InternalSemAdapt.g:8101:4: ruleFQN
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
    // InternalSemAdapt.g:8112:1: rule__Import__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8116:1: ( ( ruleEString ) )
            // InternalSemAdapt.g:8117:2: ( ruleEString )
            {
            // InternalSemAdapt.g:8117:2: ( ruleEString )
            // InternalSemAdapt.g:8118:3: ruleEString
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
    // InternalSemAdapt.g:8127:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8131:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8132:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8132:2: ( RULE_ID )
            // InternalSemAdapt.g:8133:3: RULE_ID
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
    // InternalSemAdapt.g:8142:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8146:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8147:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8147:2: ( RULE_ID )
            // InternalSemAdapt.g:8148:3: RULE_ID
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
    // InternalSemAdapt.g:8157:1: rule__Rule__ConclusionAssignment_3 : ( ruleConclusion ) ;
    public final void rule__Rule__ConclusionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8161:1: ( ( ruleConclusion ) )
            // InternalSemAdapt.g:8162:2: ( ruleConclusion )
            {
            // InternalSemAdapt.g:8162:2: ( ruleConclusion )
            // InternalSemAdapt.g:8163:3: ruleConclusion
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
    // InternalSemAdapt.g:8172:1: rule__Rule__ConditionsAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8176:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8177:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8177:2: ( ruleCondition )
            // InternalSemAdapt.g:8178:3: ruleCondition
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
    // InternalSemAdapt.g:8187:1: rule__Rule__ConditionsAssignment_4_2_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8191:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8192:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8192:2: ( ruleCondition )
            // InternalSemAdapt.g:8193:3: ruleCondition
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
    // InternalSemAdapt.g:8202:1: rule__Rule__PremisesAssignment_5_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8206:1: ( ( rulePremise ) )
            // InternalSemAdapt.g:8207:2: ( rulePremise )
            {
            // InternalSemAdapt.g:8207:2: ( rulePremise )
            // InternalSemAdapt.g:8208:3: rulePremise
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
    // InternalSemAdapt.g:8217:1: rule__Rule__PremisesAssignment_5_2_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8221:1: ( ( rulePremise ) )
            // InternalSemAdapt.g:8222:2: ( rulePremise )
            {
            // InternalSemAdapt.g:8222:2: ( rulePremise )
            // InternalSemAdapt.g:8223:3: rulePremise
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
    // InternalSemAdapt.g:8232:1: rule__Rule__BindingsAssignment_6_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8236:1: ( ( ruleBinding ) )
            // InternalSemAdapt.g:8237:2: ( ruleBinding )
            {
            // InternalSemAdapt.g:8237:2: ( ruleBinding )
            // InternalSemAdapt.g:8238:3: ruleBinding
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
    // InternalSemAdapt.g:8247:1: rule__Rule__BindingsAssignment_6_2_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8251:1: ( ( ruleBinding ) )
            // InternalSemAdapt.g:8252:2: ( ruleBinding )
            {
            // InternalSemAdapt.g:8252:2: ( ruleBinding )
            // InternalSemAdapt.g:8253:3: ruleBinding
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
    // InternalSemAdapt.g:8262:1: rule__Rule__InputsAssignment_7_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8266:1: ( ( ruleInput ) )
            // InternalSemAdapt.g:8267:2: ( ruleInput )
            {
            // InternalSemAdapt.g:8267:2: ( ruleInput )
            // InternalSemAdapt.g:8268:3: ruleInput
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
    // InternalSemAdapt.g:8277:1: rule__Rule__OutputsAssignment_7_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8281:1: ( ( ruleOutput ) )
            // InternalSemAdapt.g:8282:2: ( ruleOutput )
            {
            // InternalSemAdapt.g:8282:2: ( ruleOutput )
            // InternalSemAdapt.g:8283:3: ruleOutput
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
    // InternalSemAdapt.g:8292:1: rule__Rule__InputsAssignment_7_2_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8296:1: ( ( ruleInput ) )
            // InternalSemAdapt.g:8297:2: ( ruleInput )
            {
            // InternalSemAdapt.g:8297:2: ( ruleInput )
            // InternalSemAdapt.g:8298:3: ruleInput
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
    // InternalSemAdapt.g:8307:1: rule__Rule__OutputsAssignment_7_2_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8311:1: ( ( ruleOutput ) )
            // InternalSemAdapt.g:8312:2: ( ruleOutput )
            {
            // InternalSemAdapt.g:8312:2: ( ruleOutput )
            // InternalSemAdapt.g:8313:3: ruleOutput
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
    // InternalSemAdapt.g:8322:1: rule__Condition__CondAssignment_1 : ( ruleCondExpr ) ;
    public final void rule__Condition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8326:1: ( ( ruleCondExpr ) )
            // InternalSemAdapt.g:8327:2: ( ruleCondExpr )
            {
            // InternalSemAdapt.g:8327:2: ( ruleCondExpr )
            // InternalSemAdapt.g:8328:3: ruleCondExpr
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
    // InternalSemAdapt.g:8337:1: rule__Input__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Input__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8341:1: ( ( ruleAssignee ) )
            // InternalSemAdapt.g:8342:2: ( ruleAssignee )
            {
            // InternalSemAdapt.g:8342:2: ( ruleAssignee )
            // InternalSemAdapt.g:8343:3: ruleAssignee
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
    // InternalSemAdapt.g:8352:1: rule__Input__OperationAssignment_2 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Input__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8356:1: ( ( ( ruleOperationFQN ) ) )
            // InternalSemAdapt.g:8357:2: ( ( ruleOperationFQN ) )
            {
            // InternalSemAdapt.g:8357:2: ( ( ruleOperationFQN ) )
            // InternalSemAdapt.g:8358:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0()); 
            }
            // InternalSemAdapt.g:8359:3: ( ruleOperationFQN )
            // InternalSemAdapt.g:8360:4: ruleOperationFQN
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
    // InternalSemAdapt.g:8371:1: rule__Output__OperationAssignment_0 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Output__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8375:1: ( ( ( ruleOperationFQN ) ) )
            // InternalSemAdapt.g:8376:2: ( ( ruleOperationFQN ) )
            {
            // InternalSemAdapt.g:8376:2: ( ( ruleOperationFQN ) )
            // InternalSemAdapt.g:8377:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0()); 
            }
            // InternalSemAdapt.g:8378:3: ( ruleOperationFQN )
            // InternalSemAdapt.g:8379:4: ruleOperationFQN
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
    // InternalSemAdapt.g:8390:1: rule__Output__ArgsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8394:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8395:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8395:2: ( ruleTermRef )
            // InternalSemAdapt.g:8396:3: ruleTermRef
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
    // InternalSemAdapt.g:8405:1: rule__Output__ArgsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8409:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8410:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8410:2: ( ruleTermRef )
            // InternalSemAdapt.g:8411:3: ruleTermRef
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
    // InternalSemAdapt.g:8420:1: rule__Binding__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Binding__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8424:1: ( ( ruleAssignee ) )
            // InternalSemAdapt.g:8425:2: ( ruleAssignee )
            {
            // InternalSemAdapt.g:8425:2: ( ruleAssignee )
            // InternalSemAdapt.g:8426:3: ruleAssignee
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
    // InternalSemAdapt.g:8435:1: rule__Binding__ExprAssignment_2 : ( ruleAssignable ) ;
    public final void rule__Binding__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8439:1: ( ( ruleAssignable ) )
            // InternalSemAdapt.g:8440:2: ( ruleAssignable )
            {
            // InternalSemAdapt.g:8440:2: ( ruleAssignable )
            // InternalSemAdapt.g:8441:3: ruleAssignable
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
    // InternalSemAdapt.g:8450:1: rule__SemanticDomainAccess__RecieverAssignment_0 : ( ruleTerminalAccessExpression ) ;
    public final void rule__SemanticDomainAccess__RecieverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8454:1: ( ( ruleTerminalAccessExpression ) )
            // InternalSemAdapt.g:8455:2: ( ruleTerminalAccessExpression )
            {
            // InternalSemAdapt.g:8455:2: ( ruleTerminalAccessExpression )
            // InternalSemAdapt.g:8456:3: ruleTerminalAccessExpression
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
    // InternalSemAdapt.g:8465:1: rule__SemanticDomainAccess__FieldAssignment_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8469:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8470:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8470:2: ( RULE_ID )
            // InternalSemAdapt.g:8471:3: RULE_ID
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
    // InternalSemAdapt.g:8480:1: rule__SemanticDomainAccess__FieldAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8484:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8485:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8485:2: ( RULE_ID )
            // InternalSemAdapt.g:8486:3: RULE_ID
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
    // InternalSemAdapt.g:8495:1: rule__Conclusion__FromAssignment_0 : ( ruleDefConfiguration ) ;
    public final void rule__Conclusion__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8499:1: ( ( ruleDefConfiguration ) )
            // InternalSemAdapt.g:8500:2: ( ruleDefConfiguration )
            {
            // InternalSemAdapt.g:8500:2: ( ruleDefConfiguration )
            // InternalSemAdapt.g:8501:3: ruleDefConfiguration
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
    // InternalSemAdapt.g:8510:1: rule__Conclusion__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Conclusion__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8514:1: ( ( ( 'termination' ) ) )
            // InternalSemAdapt.g:8515:2: ( ( 'termination' ) )
            {
            // InternalSemAdapt.g:8515:2: ( ( 'termination' ) )
            // InternalSemAdapt.g:8516:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalSemAdapt.g:8517:3: ( 'termination' )
            // InternalSemAdapt.g:8518:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:8529:1: rule__Conclusion__ToAssignment_3 : ( ruleSingleTermRef ) ;
    public final void rule__Conclusion__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8533:1: ( ( ruleSingleTermRef ) )
            // InternalSemAdapt.g:8534:2: ( ruleSingleTermRef )
            {
            // InternalSemAdapt.g:8534:2: ( ruleSingleTermRef )
            // InternalSemAdapt.g:8535:3: ruleSingleTermRef
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
    // InternalSemAdapt.g:8544:1: rule__Premise__FromAssignment_0 : ( ruleSymbolRef ) ;
    public final void rule__Premise__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8548:1: ( ( ruleSymbolRef ) )
            // InternalSemAdapt.g:8549:2: ( ruleSymbolRef )
            {
            // InternalSemAdapt.g:8549:2: ( ruleSymbolRef )
            // InternalSemAdapt.g:8550:3: ruleSymbolRef
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
    // InternalSemAdapt.g:8559:1: rule__Premise__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Premise__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8563:1: ( ( ( 'termination' ) ) )
            // InternalSemAdapt.g:8564:2: ( ( 'termination' ) )
            {
            // InternalSemAdapt.g:8564:2: ( ( 'termination' ) )
            // InternalSemAdapt.g:8565:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalSemAdapt.g:8566:3: ( 'termination' )
            // InternalSemAdapt.g:8567:4: 'termination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:8578:1: rule__Premise__ToAssignment_3 : ( ruleSingleTermDef ) ;
    public final void rule__Premise__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8582:1: ( ( ruleSingleTermDef ) )
            // InternalSemAdapt.g:8583:2: ( ruleSingleTermDef )
            {
            // InternalSemAdapt.g:8583:2: ( ruleSingleTermDef )
            // InternalSemAdapt.g:8584:3: ruleSingleTermDef
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
    // InternalSemAdapt.g:8593:1: rule__DefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__DefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8597:1: ( ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:8598:2: ( ( ruleFQN ) )
            {
            // InternalSemAdapt.g:8598:2: ( ( ruleFQN ) )
            // InternalSemAdapt.g:8599:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalSemAdapt.g:8600:3: ( ruleFQN )
            // InternalSemAdapt.g:8601:4: ruleFQN
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
    // InternalSemAdapt.g:8612:1: rule__DefConfiguration__ChildsAssignment_2_0 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8616:1: ( ( ruleTermDef ) )
            // InternalSemAdapt.g:8617:2: ( ruleTermDef )
            {
            // InternalSemAdapt.g:8617:2: ( ruleTermDef )
            // InternalSemAdapt.g:8618:3: ruleTermDef
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
    // InternalSemAdapt.g:8627:1: rule__DefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8631:1: ( ( ruleTermDef ) )
            // InternalSemAdapt.g:8632:2: ( ruleTermDef )
            {
            // InternalSemAdapt.g:8632:2: ( ruleTermDef )
            // InternalSemAdapt.g:8633:3: ruleTermDef
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
    // InternalSemAdapt.g:8642:1: rule__RefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__RefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8646:1: ( ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:8647:2: ( ( ruleFQN ) )
            {
            // InternalSemAdapt.g:8647:2: ( ( ruleFQN ) )
            // InternalSemAdapt.g:8648:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalSemAdapt.g:8649:3: ( ruleFQN )
            // InternalSemAdapt.g:8650:4: ruleFQN
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
    // InternalSemAdapt.g:8661:1: rule__RefConfiguration__ChildsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8665:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8666:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8666:2: ( ruleTermRef )
            // InternalSemAdapt.g:8667:3: ruleTermRef
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
    // InternalSemAdapt.g:8676:1: rule__RefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8680:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8681:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8681:2: ( ruleTermRef )
            // InternalSemAdapt.g:8682:3: ruleTermRef
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
    // InternalSemAdapt.g:8691:1: rule__SymbolDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8695:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8696:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8696:2: ( RULE_ID )
            // InternalSemAdapt.g:8697:3: RULE_ID
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
    // InternalSemAdapt.g:8706:1: rule__SymbolRef__DefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8710:1: ( ( ( RULE_ID ) ) )
            // InternalSemAdapt.g:8711:2: ( ( RULE_ID ) )
            {
            // InternalSemAdapt.g:8711:2: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8712:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0()); 
            }
            // InternalSemAdapt.g:8713:3: ( RULE_ID )
            // InternalSemAdapt.g:8714:4: RULE_ID
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
    // InternalSemAdapt.g:8725:1: rule__ListDef__HeadAssignment_1 : ( ruleSingleTermDef ) ;
    public final void rule__ListDef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8729:1: ( ( ruleSingleTermDef ) )
            // InternalSemAdapt.g:8730:2: ( ruleSingleTermDef )
            {
            // InternalSemAdapt.g:8730:2: ( ruleSingleTermDef )
            // InternalSemAdapt.g:8731:3: ruleSingleTermDef
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
    // InternalSemAdapt.g:8740:1: rule__ListDef__TailAssignment_3 : ( ruleSymbolDef ) ;
    public final void rule__ListDef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8744:1: ( ( ruleSymbolDef ) )
            // InternalSemAdapt.g:8745:2: ( ruleSymbolDef )
            {
            // InternalSemAdapt.g:8745:2: ( ruleSymbolDef )
            // InternalSemAdapt.g:8746:3: ruleSymbolDef
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
    // InternalSemAdapt.g:8755:1: rule__ListRef__HeadAssignment_1 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8759:1: ( ( ruleSymbolRef ) )
            // InternalSemAdapt.g:8760:2: ( ruleSymbolRef )
            {
            // InternalSemAdapt.g:8760:2: ( ruleSymbolRef )
            // InternalSemAdapt.g:8761:3: ruleSymbolRef
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
    // InternalSemAdapt.g:8770:1: rule__ListRef__TailAssignment_3 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8774:1: ( ( ruleSymbolRef ) )
            // InternalSemAdapt.g:8775:2: ( ruleSymbolRef )
            {
            // InternalSemAdapt.g:8775:2: ( ruleSymbolRef )
            // InternalSemAdapt.g:8776:3: ruleSymbolRef
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
    // InternalSemAdapt.g:8785:1: rule__CondNot__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__CondNot__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8789:1: ( ( ruleExpr ) )
            // InternalSemAdapt.g:8790:2: ( ruleExpr )
            {
            // InternalSemAdapt.g:8790:2: ( ruleExpr )
            // InternalSemAdapt.g:8791:3: ruleExpr
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
    // InternalSemAdapt.g:8800:1: rule__CondOr__LhsAssignment_1 : ( ruleAnd ) ;
    public final void rule__CondOr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8804:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:8805:2: ( ruleAnd )
            {
            // InternalSemAdapt.g:8805:2: ( ruleAnd )
            // InternalSemAdapt.g:8806:3: ruleAnd
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
    // InternalSemAdapt.g:8815:1: rule__CondOr__RhsAssignment_3 : ( ruleAnd ) ;
    public final void rule__CondOr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8819:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:8820:2: ( ruleAnd )
            {
            // InternalSemAdapt.g:8820:2: ( ruleAnd )
            // InternalSemAdapt.g:8821:3: ruleAnd
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
    // InternalSemAdapt.g:8830:1: rule__CondAnd__LhsAssignment_1 : ( ruleEquality ) ;
    public final void rule__CondAnd__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8834:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:8835:2: ( ruleEquality )
            {
            // InternalSemAdapt.g:8835:2: ( ruleEquality )
            // InternalSemAdapt.g:8836:3: ruleEquality
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
    // InternalSemAdapt.g:8845:1: rule__CondAnd__RhsAssignment_3 : ( ruleEquality ) ;
    public final void rule__CondAnd__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8849:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:8850:2: ( ruleEquality )
            {
            // InternalSemAdapt.g:8850:2: ( ruleEquality )
            // InternalSemAdapt.g:8851:3: ruleEquality
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
    // InternalSemAdapt.g:8860:1: rule__CondEquality__LhsAssignment_0_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8864:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:8865:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:8865:2: ( ruleComparison )
            // InternalSemAdapt.g:8866:3: ruleComparison
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
    // InternalSemAdapt.g:8875:1: rule__CondEquality__RhsAssignment_0_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8879:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:8880:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:8880:2: ( ruleComparison )
            // InternalSemAdapt.g:8881:3: ruleComparison
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
    // InternalSemAdapt.g:8890:1: rule__CondEquality__LhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8894:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:8895:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:8895:2: ( ruleComparison )
            // InternalSemAdapt.g:8896:3: ruleComparison
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
    // InternalSemAdapt.g:8905:1: rule__CondEquality__RhsAssignment_1_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8909:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:8910:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:8910:2: ( ruleComparison )
            // InternalSemAdapt.g:8911:3: ruleComparison
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
    // InternalSemAdapt.g:8920:1: rule__CondComparison__LhsAssignment_0_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8924:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:8925:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:8925:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:8926:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:8935:1: rule__CondComparison__RhsAssignment_0_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8939:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:8940:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:8940:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:8941:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:8950:1: rule__CondComparison__LhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8954:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:8955:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:8955:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:8956:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:8965:1: rule__CondComparison__RhsAssignment_1_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8969:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:8970:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:8970:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:8971:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:8980:1: rule__Or__RhsAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8984:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:8985:2: ( ruleAnd )
            {
            // InternalSemAdapt.g:8985:2: ( ruleAnd )
            // InternalSemAdapt.g:8986:3: ruleAnd
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
    // InternalSemAdapt.g:8995:1: rule__And__RhsAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8999:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:9000:2: ( ruleEquality )
            {
            // InternalSemAdapt.g:9000:2: ( ruleEquality )
            // InternalSemAdapt.g:9001:3: ruleEquality
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
    // InternalSemAdapt.g:9010:1: rule__Equality__RhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9014:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:9015:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:9015:2: ( ruleComparison )
            // InternalSemAdapt.g:9016:3: ruleComparison
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
    // InternalSemAdapt.g:9025:1: rule__Comparison__RhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9029:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:9030:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:9030:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:9031:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:9040:1: rule__PlusOrMinus__RhsAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9044:1: ( ( ruleMulOrDiv ) )
            // InternalSemAdapt.g:9045:2: ( ruleMulOrDiv )
            {
            // InternalSemAdapt.g:9045:2: ( ruleMulOrDiv )
            // InternalSemAdapt.g:9046:3: ruleMulOrDiv
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
    // InternalSemAdapt.g:9055:1: rule__MulOrDiv__RhsAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9059:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9060:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9060:2: ( rulePrimary )
            // InternalSemAdapt.g:9061:3: rulePrimary
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
    // InternalSemAdapt.g:9070:1: rule__Primary__ExprAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9074:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9075:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9075:2: ( rulePrimary )
            // InternalSemAdapt.g:9076:3: rulePrimary
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
    // InternalSemAdapt.g:9085:1: rule__Primary__ExprAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9089:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9090:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9090:2: ( rulePrimary )
            // InternalSemAdapt.g:9091:3: rulePrimary
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
    // InternalSemAdapt.g:9100:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9104:1: ( ( RULE_INT ) )
            // InternalSemAdapt.g:9105:2: ( RULE_INT )
            {
            // InternalSemAdapt.g:9105:2: ( RULE_INT )
            // InternalSemAdapt.g:9106:3: RULE_INT
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
    // InternalSemAdapt.g:9115:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9119:1: ( ( RULE_DOUBLE ) )
            // InternalSemAdapt.g:9120:2: ( RULE_DOUBLE )
            {
            // InternalSemAdapt.g:9120:2: ( RULE_DOUBLE )
            // InternalSemAdapt.g:9121:3: RULE_DOUBLE
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
    // InternalSemAdapt.g:9130:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9134:1: ( ( RULE_STRING ) )
            // InternalSemAdapt.g:9135:2: ( RULE_STRING )
            {
            // InternalSemAdapt.g:9135:2: ( RULE_STRING )
            // InternalSemAdapt.g:9136:3: RULE_STRING
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
    // InternalSemAdapt.g:9145:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9149:1: ( ( RULE_BOOL ) )
            // InternalSemAdapt.g:9150:2: ( RULE_BOOL )
            {
            // InternalSemAdapt.g:9150:2: ( RULE_BOOL )
            // InternalSemAdapt.g:9151:3: RULE_BOOL
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

    // $ANTLR start synpred5_InternalSemAdapt
    public final void synpred5_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1327:2: ( ( ruleExpr ) )
        // InternalSemAdapt.g:1327:2: ( ruleExpr )
        {
        // InternalSemAdapt.g:1327:2: ( ruleExpr )
        // InternalSemAdapt.g:1328:3: ruleExpr
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
    // $ANTLR end synpred5_InternalSemAdapt

    // $ANTLR start synpred15_InternalSemAdapt
    public final void synpred15_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1492:2: ( ( ruleCondOr ) )
        // InternalSemAdapt.g:1492:2: ( ruleCondOr )
        {
        // InternalSemAdapt.g:1492:2: ( ruleCondOr )
        // InternalSemAdapt.g:1493:3: ruleCondOr
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
    // $ANTLR end synpred15_InternalSemAdapt

    // $ANTLR start synpred16_InternalSemAdapt
    public final void synpred16_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1498:2: ( ( ruleCondAnd ) )
        // InternalSemAdapt.g:1498:2: ( ruleCondAnd )
        {
        // InternalSemAdapt.g:1498:2: ( ruleCondAnd )
        // InternalSemAdapt.g:1499:3: ruleCondAnd
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
    // $ANTLR end synpred16_InternalSemAdapt

    // $ANTLR start synpred17_InternalSemAdapt
    public final void synpred17_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1504:2: ( ( ruleCondEquality ) )
        // InternalSemAdapt.g:1504:2: ( ruleCondEquality )
        {
        // InternalSemAdapt.g:1504:2: ( ruleCondEquality )
        // InternalSemAdapt.g:1505:3: ruleCondEquality
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
    // $ANTLR end synpred17_InternalSemAdapt

    // $ANTLR start synpred18_InternalSemAdapt
    public final void synpred18_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1510:2: ( ( ruleCondComparison ) )
        // InternalSemAdapt.g:1510:2: ( ruleCondComparison )
        {
        // InternalSemAdapt.g:1510:2: ( ruleCondComparison )
        // InternalSemAdapt.g:1511:3: ruleCondComparison
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
    // $ANTLR end synpred18_InternalSemAdapt

    // $ANTLR start synpred19_InternalSemAdapt
    public final void synpred19_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1531:2: ( ( ( rule__CondEquality__Group_0__0 ) ) )
        // InternalSemAdapt.g:1531:2: ( ( rule__CondEquality__Group_0__0 ) )
        {
        // InternalSemAdapt.g:1531:2: ( ( rule__CondEquality__Group_0__0 ) )
        // InternalSemAdapt.g:1532:3: ( rule__CondEquality__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
        }
        // InternalSemAdapt.g:1533:3: ( rule__CondEquality__Group_0__0 )
        // InternalSemAdapt.g:1533:4: rule__CondEquality__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondEquality__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalSemAdapt

    // $ANTLR start synpred20_InternalSemAdapt
    public final void synpred20_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1552:2: ( ( ( rule__CondComparison__Group_0__0 ) ) )
        // InternalSemAdapt.g:1552:2: ( ( rule__CondComparison__Group_0__0 ) )
        {
        // InternalSemAdapt.g:1552:2: ( ( rule__CondComparison__Group_0__0 ) )
        // InternalSemAdapt.g:1553:3: ( rule__CondComparison__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
        }
        // InternalSemAdapt.g:1554:3: ( rule__CondComparison__Group_0__0 )
        // InternalSemAdapt.g:1554:4: rule__CondComparison__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondComparison__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSemAdapt

    // Delegated rules

    public final boolean synpred19_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\37\1\uffff\1\5\1\37\1\5\1\uffff\1\37";
    static final String dfa_3s = "\1\43\1\42\1\uffff\1\5\1\42\1\5\1\uffff\1\42";
    static final String dfa_4s = "\2\uffff\1\1\3\uffff\1\2\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\35\uffff\1\2",
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
            return "1280:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );";
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1301:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\2\1\6\uffff";
    static final String dfa_9s = "\1\4\1\uffff\2\17\1\5\1\uffff\1\5\1\40\1\0\1\uffff";
    static final String dfa_10s = "\1\61\1\uffff\2\63\1\5\1\uffff\1\5\1\42\1\0\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\2\3\uffff\1\3";
    static final String dfa_12s = "\7\uffff\1\1\1\0\1\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\3\1\27\uffff\1\1\2\uffff\1\3\5\uffff\1\1\7\uffff\1\1",
            "",
            "\1\1\3\uffff\3\1\5\uffff\1\1\2\uffff\1\1\1\uffff\1\5\1\uffff\1\4\7\uffff\12\1",
            "\1\1\3\uffff\3\1\5\uffff\1\1\2\uffff\1\1\3\uffff\1\6\7\uffff\12\1",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1322:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSemAdapt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_7==32||LA4_7==34) ) {s = 5;}

                        else if ( (synpred5_InternalSemAdapt()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\1\4\11\0\5\uffff";
    static final String dfa_16s = "\1\61\11\0\5\uffff";
    static final String dfa_17s = "\12\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\1\10\1\4\1\5\1\7\27\uffff\1\1\2\uffff\1\11\5\uffff\1\2\7\uffff\1\3",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1487:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) );";
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
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred16_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred17_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred18_InternalSemAdapt()) ) {s = 13;}

                         
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
    static final String dfa_20s = "\14\uffff";
    static final String dfa_21s = "\1\4\11\0\2\uffff";
    static final String dfa_22s = "\1\61\11\0\2\uffff";
    static final String dfa_23s = "\12\uffff\1\1\1\2";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_25s = {
            "\1\6\1\10\1\4\1\5\1\7\27\uffff\1\1\2\uffff\1\11\5\uffff\1\2\7\uffff\1\3",
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
            return "1526:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );";
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
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSemAdapt()) ) {s = 10;}

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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1547:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );";
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
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000398000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00020209000001F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000012200000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000012000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020012200000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020012000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000100L});

}