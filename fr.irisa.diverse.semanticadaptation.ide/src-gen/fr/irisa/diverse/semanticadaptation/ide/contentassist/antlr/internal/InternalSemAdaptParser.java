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


    // $ANTLR start "entryRuleCondIs"
    // InternalSemAdapt.g:954:1: entryRuleCondIs : ruleCondIs EOF ;
    public final void entryRuleCondIs() throws RecognitionException {
        try {
            // InternalSemAdapt.g:955:1: ( ruleCondIs EOF )
            // InternalSemAdapt.g:956:1: ruleCondIs EOF
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
    // InternalSemAdapt.g:963:1: ruleCondIs : ( ( rule__CondIs__Group__0 ) ) ;
    public final void ruleCondIs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:967:2: ( ( ( rule__CondIs__Group__0 ) ) )
            // InternalSemAdapt.g:968:2: ( ( rule__CondIs__Group__0 ) )
            {
            // InternalSemAdapt.g:968:2: ( ( rule__CondIs__Group__0 ) )
            // InternalSemAdapt.g:969:3: ( rule__CondIs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getGroup()); 
            }
            // InternalSemAdapt.g:970:3: ( rule__CondIs__Group__0 )
            // InternalSemAdapt.g:970:4: rule__CondIs__Group__0
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
    // InternalSemAdapt.g:979:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalSemAdapt.g:980:1: ( ruleExpr EOF )
            // InternalSemAdapt.g:981:1: ruleExpr EOF
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
    // InternalSemAdapt.g:988:1: ruleExpr : ( ruleOr ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:992:2: ( ( ruleOr ) )
            // InternalSemAdapt.g:993:2: ( ruleOr )
            {
            // InternalSemAdapt.g:993:2: ( ruleOr )
            // InternalSemAdapt.g:994:3: ruleOr
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
    // InternalSemAdapt.g:1004:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1005:1: ( ruleOr EOF )
            // InternalSemAdapt.g:1006:1: ruleOr EOF
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
    // InternalSemAdapt.g:1013:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1017:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSemAdapt.g:1018:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSemAdapt.g:1018:2: ( ( rule__Or__Group__0 ) )
            // InternalSemAdapt.g:1019:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1020:3: ( rule__Or__Group__0 )
            // InternalSemAdapt.g:1020:4: rule__Or__Group__0
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
    // InternalSemAdapt.g:1029:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1030:1: ( ruleAnd EOF )
            // InternalSemAdapt.g:1031:1: ruleAnd EOF
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
    // InternalSemAdapt.g:1038:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1042:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSemAdapt.g:1043:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSemAdapt.g:1043:2: ( ( rule__And__Group__0 ) )
            // InternalSemAdapt.g:1044:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1045:3: ( rule__And__Group__0 )
            // InternalSemAdapt.g:1045:4: rule__And__Group__0
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
    // InternalSemAdapt.g:1054:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1055:1: ( ruleEquality EOF )
            // InternalSemAdapt.g:1056:1: ruleEquality EOF
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
    // InternalSemAdapt.g:1063:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1067:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalSemAdapt.g:1068:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalSemAdapt.g:1068:2: ( ( rule__Equality__Group__0 ) )
            // InternalSemAdapt.g:1069:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1070:3: ( rule__Equality__Group__0 )
            // InternalSemAdapt.g:1070:4: rule__Equality__Group__0
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
    // InternalSemAdapt.g:1079:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1080:1: ( ruleComparison EOF )
            // InternalSemAdapt.g:1081:1: ruleComparison EOF
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
    // InternalSemAdapt.g:1088:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1092:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalSemAdapt.g:1093:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalSemAdapt.g:1093:2: ( ( rule__Comparison__Group__0 ) )
            // InternalSemAdapt.g:1094:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1095:3: ( rule__Comparison__Group__0 )
            // InternalSemAdapt.g:1095:4: rule__Comparison__Group__0
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
    // InternalSemAdapt.g:1104:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1105:1: ( rulePlusOrMinus EOF )
            // InternalSemAdapt.g:1106:1: rulePlusOrMinus EOF
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
    // InternalSemAdapt.g:1113:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1117:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalSemAdapt.g:1118:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalSemAdapt.g:1118:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalSemAdapt.g:1119:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1120:3: ( rule__PlusOrMinus__Group__0 )
            // InternalSemAdapt.g:1120:4: rule__PlusOrMinus__Group__0
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
    // InternalSemAdapt.g:1129:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1130:1: ( ruleMulOrDiv EOF )
            // InternalSemAdapt.g:1131:1: ruleMulOrDiv EOF
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
    // InternalSemAdapt.g:1138:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1142:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalSemAdapt.g:1143:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalSemAdapt.g:1143:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalSemAdapt.g:1144:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1145:3: ( rule__MulOrDiv__Group__0 )
            // InternalSemAdapt.g:1145:4: rule__MulOrDiv__Group__0
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
    // InternalSemAdapt.g:1154:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1155:1: ( rulePrimary EOF )
            // InternalSemAdapt.g:1156:1: rulePrimary EOF
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
    // InternalSemAdapt.g:1163:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1167:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSemAdapt.g:1168:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSemAdapt.g:1168:2: ( ( rule__Primary__Alternatives ) )
            // InternalSemAdapt.g:1169:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:1170:3: ( rule__Primary__Alternatives )
            // InternalSemAdapt.g:1170:4: rule__Primary__Alternatives
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
    // InternalSemAdapt.g:1179:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1180:1: ( ruleAtomic EOF )
            // InternalSemAdapt.g:1181:1: ruleAtomic EOF
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
    // InternalSemAdapt.g:1188:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1192:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalSemAdapt.g:1193:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalSemAdapt.g:1193:2: ( ( rule__Atomic__Alternatives ) )
            // InternalSemAdapt.g:1194:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:1195:3: ( rule__Atomic__Alternatives )
            // InternalSemAdapt.g:1195:4: rule__Atomic__Alternatives
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
    // InternalSemAdapt.g:1204:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1205:1: ( ruleEString EOF )
            // InternalSemAdapt.g:1206:1: ruleEString EOF
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
    // InternalSemAdapt.g:1213:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1217:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSemAdapt.g:1218:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSemAdapt.g:1218:2: ( ( rule__EString__Alternatives ) )
            // InternalSemAdapt.g:1219:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalSemAdapt.g:1220:3: ( rule__EString__Alternatives )
            // InternalSemAdapt.g:1220:4: rule__EString__Alternatives
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
    // InternalSemAdapt.g:1229:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1230:1: ( ruleFQN EOF )
            // InternalSemAdapt.g:1231:1: ruleFQN EOF
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
    // InternalSemAdapt.g:1238:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1242:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSemAdapt.g:1243:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSemAdapt.g:1243:2: ( ( rule__FQN__Group__0 ) )
            // InternalSemAdapt.g:1244:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1245:3: ( rule__FQN__Group__0 )
            // InternalSemAdapt.g:1245:4: rule__FQN__Group__0
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
    // InternalSemAdapt.g:1254:1: entryRuleOperationFQN : ruleOperationFQN EOF ;
    public final void entryRuleOperationFQN() throws RecognitionException {
        try {
            // InternalSemAdapt.g:1255:1: ( ruleOperationFQN EOF )
            // InternalSemAdapt.g:1256:1: ruleOperationFQN EOF
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
    // InternalSemAdapt.g:1263:1: ruleOperationFQN : ( ( rule__OperationFQN__Group__0 ) ) ;
    public final void ruleOperationFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1267:2: ( ( ( rule__OperationFQN__Group__0 ) ) )
            // InternalSemAdapt.g:1268:2: ( ( rule__OperationFQN__Group__0 ) )
            {
            // InternalSemAdapt.g:1268:2: ( ( rule__OperationFQN__Group__0 ) )
            // InternalSemAdapt.g:1269:3: ( rule__OperationFQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup()); 
            }
            // InternalSemAdapt.g:1270:3: ( rule__OperationFQN__Group__0 )
            // InternalSemAdapt.g:1270:4: rule__OperationFQN__Group__0
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
    // InternalSemAdapt.g:1278:1: rule__Adaptation__Alternatives_0 : ( ( ( rule__Adaptation__Group_0_0__0 ) ) | ( ( rule__Adaptation__Group_0_1__0 ) ) | ( ( rule__Adaptation__Group_0_2__0 ) ) );
    public final void rule__Adaptation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1282:1: ( ( ( rule__Adaptation__Group_0_0__0 ) ) | ( ( rule__Adaptation__Group_0_1__0 ) ) | ( ( rule__Adaptation__Group_0_2__0 ) ) )
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
                    // InternalSemAdapt.g:1283:2: ( ( rule__Adaptation__Group_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1283:2: ( ( rule__Adaptation__Group_0_0__0 ) )
                    // InternalSemAdapt.g:1284:3: ( rule__Adaptation__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdaptationAccess().getGroup_0_0()); 
                    }
                    // InternalSemAdapt.g:1285:3: ( rule__Adaptation__Group_0_0__0 )
                    // InternalSemAdapt.g:1285:4: rule__Adaptation__Group_0_0__0
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
                    // InternalSemAdapt.g:1289:2: ( ( rule__Adaptation__Group_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1289:2: ( ( rule__Adaptation__Group_0_1__0 ) )
                    // InternalSemAdapt.g:1290:3: ( rule__Adaptation__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdaptationAccess().getGroup_0_1()); 
                    }
                    // InternalSemAdapt.g:1291:3: ( rule__Adaptation__Group_0_1__0 )
                    // InternalSemAdapt.g:1291:4: rule__Adaptation__Group_0_1__0
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
                    // InternalSemAdapt.g:1295:2: ( ( rule__Adaptation__Group_0_2__0 ) )
                    {
                    // InternalSemAdapt.g:1295:2: ( ( rule__Adaptation__Group_0_2__0 ) )
                    // InternalSemAdapt.g:1296:3: ( rule__Adaptation__Group_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdaptationAccess().getGroup_0_2()); 
                    }
                    // InternalSemAdapt.g:1297:3: ( rule__Adaptation__Group_0_2__0 )
                    // InternalSemAdapt.g:1297:4: rule__Adaptation__Group_0_2__0
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
    // InternalSemAdapt.g:1305:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1309:1: ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSemAdapt.g:1310:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    {
                    // InternalSemAdapt.g:1310:2: ( ( rule__Rule__InputsAssignment_7_1_0 ) )
                    // InternalSemAdapt.g:1311:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_1_0()); 
                    }
                    // InternalSemAdapt.g:1312:3: ( rule__Rule__InputsAssignment_7_1_0 )
                    // InternalSemAdapt.g:1312:4: rule__Rule__InputsAssignment_7_1_0
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
                    // InternalSemAdapt.g:1316:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    {
                    // InternalSemAdapt.g:1316:2: ( ( rule__Rule__OutputsAssignment_7_1_1 ) )
                    // InternalSemAdapt.g:1317:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_1_1()); 
                    }
                    // InternalSemAdapt.g:1318:3: ( rule__Rule__OutputsAssignment_7_1_1 )
                    // InternalSemAdapt.g:1318:4: rule__Rule__OutputsAssignment_7_1_1
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
    // InternalSemAdapt.g:1326:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );
    public final void rule__Rule__Alternatives_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1330:1: ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSemAdapt.g:1331:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    {
                    // InternalSemAdapt.g:1331:2: ( ( rule__Rule__InputsAssignment_7_2_1_0 ) )
                    // InternalSemAdapt.g:1332:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getInputsAssignment_7_2_1_0()); 
                    }
                    // InternalSemAdapt.g:1333:3: ( rule__Rule__InputsAssignment_7_2_1_0 )
                    // InternalSemAdapt.g:1333:4: rule__Rule__InputsAssignment_7_2_1_0
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
                    // InternalSemAdapt.g:1337:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    {
                    // InternalSemAdapt.g:1337:2: ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) )
                    // InternalSemAdapt.g:1338:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getOutputsAssignment_7_2_1_1()); 
                    }
                    // InternalSemAdapt.g:1339:3: ( rule__Rule__OutputsAssignment_7_2_1_1 )
                    // InternalSemAdapt.g:1339:4: rule__Rule__OutputsAssignment_7_2_1_1
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
    // InternalSemAdapt.g:1347:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1351:1: ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSemAdapt.g:1352:2: ( ruleExpr )
                    {
                    // InternalSemAdapt.g:1352:2: ( ruleExpr )
                    // InternalSemAdapt.g:1353:3: ruleExpr
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
                    // InternalSemAdapt.g:1358:2: ( ruleRefConfiguration )
                    {
                    // InternalSemAdapt.g:1358:2: ( ruleRefConfiguration )
                    // InternalSemAdapt.g:1359:3: ruleRefConfiguration
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
                    // InternalSemAdapt.g:1364:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalSemAdapt.g:1364:2: ( ruleSemanticDomainAccess )
                    // InternalSemAdapt.g:1365:3: ruleSemanticDomainAccess
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
    // InternalSemAdapt.g:1374:1: rule__Assignee__Alternatives : ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1378:1: ( ( ruleSymbolDef ) | ( ruleSemanticDomainAccess ) )
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
                    // InternalSemAdapt.g:1379:2: ( ruleSymbolDef )
                    {
                    // InternalSemAdapt.g:1379:2: ( ruleSymbolDef )
                    // InternalSemAdapt.g:1380:3: ruleSymbolDef
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
                    // InternalSemAdapt.g:1385:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalSemAdapt.g:1385:2: ( ruleSemanticDomainAccess )
                    // InternalSemAdapt.g:1386:3: ruleSemanticDomainAccess
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
    // InternalSemAdapt.g:1395:1: rule__TerminalAccessExpression__Alternatives : ( ( ruleSymbolRef ) | ( ruleSelf ) );
    public final void rule__TerminalAccessExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1399:1: ( ( ruleSymbolRef ) | ( ruleSelf ) )
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
                    // InternalSemAdapt.g:1400:2: ( ruleSymbolRef )
                    {
                    // InternalSemAdapt.g:1400:2: ( ruleSymbolRef )
                    // InternalSemAdapt.g:1401:3: ruleSymbolRef
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
                    // InternalSemAdapt.g:1406:2: ( ruleSelf )
                    {
                    // InternalSemAdapt.g:1406:2: ( ruleSelf )
                    // InternalSemAdapt.g:1407:3: ruleSelf
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
    // InternalSemAdapt.g:1416:1: rule__TermDef__Alternatives : ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) );
    public final void rule__TermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1420:1: ( ( ruleSingleTermDef ) | ( ruleListDef ) | ( ruleVoidList ) )
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
                    // InternalSemAdapt.g:1421:2: ( ruleSingleTermDef )
                    {
                    // InternalSemAdapt.g:1421:2: ( ruleSingleTermDef )
                    // InternalSemAdapt.g:1422:3: ruleSingleTermDef
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
                    // InternalSemAdapt.g:1427:2: ( ruleListDef )
                    {
                    // InternalSemAdapt.g:1427:2: ( ruleListDef )
                    // InternalSemAdapt.g:1428:3: ruleListDef
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
                    // InternalSemAdapt.g:1433:2: ( ruleVoidList )
                    {
                    // InternalSemAdapt.g:1433:2: ( ruleVoidList )
                    // InternalSemAdapt.g:1434:3: ruleVoidList
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
    // InternalSemAdapt.g:1443:1: rule__TermRef__Alternatives : ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) );
    public final void rule__TermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1447:1: ( ( ruleSingleTermRef ) | ( ruleListRef ) | ( ruleVoidList ) )
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
                    // InternalSemAdapt.g:1448:2: ( ruleSingleTermRef )
                    {
                    // InternalSemAdapt.g:1448:2: ( ruleSingleTermRef )
                    // InternalSemAdapt.g:1449:3: ruleSingleTermRef
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
                    // InternalSemAdapt.g:1454:2: ( ruleListRef )
                    {
                    // InternalSemAdapt.g:1454:2: ( ruleListRef )
                    // InternalSemAdapt.g:1455:3: ruleListRef
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
                    // InternalSemAdapt.g:1460:2: ( ruleVoidList )
                    {
                    // InternalSemAdapt.g:1460:2: ( ruleVoidList )
                    // InternalSemAdapt.g:1461:3: ruleVoidList
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
    // InternalSemAdapt.g:1470:1: rule__SingleTermDef__Alternatives : ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) );
    public final void rule__SingleTermDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1474:1: ( ( ruleDefConfiguration ) | ( ruleSymbolDef ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==15||(LA9_1>=18 && LA9_1<=21)||LA9_1==27||(LA9_1>=29 && LA9_1<=30)||LA9_1==33||LA9_1==38) ) {
                    alt9=2;
                }
                else if ( (LA9_1==32||LA9_1==34) ) {
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
                    // InternalSemAdapt.g:1475:2: ( ruleDefConfiguration )
                    {
                    // InternalSemAdapt.g:1475:2: ( ruleDefConfiguration )
                    // InternalSemAdapt.g:1476:3: ruleDefConfiguration
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
                    // InternalSemAdapt.g:1481:2: ( ruleSymbolDef )
                    {
                    // InternalSemAdapt.g:1481:2: ( ruleSymbolDef )
                    // InternalSemAdapt.g:1482:3: ruleSymbolDef
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
    // InternalSemAdapt.g:1491:1: rule__SingleTermRef__Alternatives : ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) );
    public final void rule__SingleTermRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1495:1: ( ( ( ruleRefConfiguration ) ) | ( ruleSymbolRef ) )
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
                    // InternalSemAdapt.g:1496:2: ( ( ruleRefConfiguration ) )
                    {
                    // InternalSemAdapt.g:1496:2: ( ( ruleRefConfiguration ) )
                    // InternalSemAdapt.g:1497:3: ( ruleRefConfiguration )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0()); 
                    }
                    // InternalSemAdapt.g:1498:3: ( ruleRefConfiguration )
                    // InternalSemAdapt.g:1498:4: ruleRefConfiguration
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
                    // InternalSemAdapt.g:1502:2: ( ruleSymbolRef )
                    {
                    // InternalSemAdapt.g:1502:2: ( ruleSymbolRef )
                    // InternalSemAdapt.g:1503:3: ruleSymbolRef
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
    // InternalSemAdapt.g:1512:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) );
    public final void rule__CondExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1516:1: ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalSemAdapt.g:1517:2: ( ruleCondOr )
                    {
                    // InternalSemAdapt.g:1517:2: ( ruleCondOr )
                    // InternalSemAdapt.g:1518:3: ruleCondOr
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
                    // InternalSemAdapt.g:1523:2: ( ruleCondAnd )
                    {
                    // InternalSemAdapt.g:1523:2: ( ruleCondAnd )
                    // InternalSemAdapt.g:1524:3: ruleCondAnd
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
                    // InternalSemAdapt.g:1529:2: ( ruleCondEquality )
                    {
                    // InternalSemAdapt.g:1529:2: ( ruleCondEquality )
                    // InternalSemAdapt.g:1530:3: ruleCondEquality
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
                    // InternalSemAdapt.g:1535:2: ( ruleCondComparison )
                    {
                    // InternalSemAdapt.g:1535:2: ( ruleCondComparison )
                    // InternalSemAdapt.g:1536:3: ruleCondComparison
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
                    // InternalSemAdapt.g:1541:2: ( ruleCondNot )
                    {
                    // InternalSemAdapt.g:1541:2: ( ruleCondNot )
                    // InternalSemAdapt.g:1542:3: ruleCondNot
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
                    // InternalSemAdapt.g:1547:2: ( ruleCondIs )
                    {
                    // InternalSemAdapt.g:1547:2: ( ruleCondIs )
                    // InternalSemAdapt.g:1548:3: ruleCondIs
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
    // InternalSemAdapt.g:1557:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );
    public final void rule__CondEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1561:1: ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSemAdapt.g:1562:2: ( ( rule__CondEquality__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1562:2: ( ( rule__CondEquality__Group_0__0 ) )
                    // InternalSemAdapt.g:1563:3: ( rule__CondEquality__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1564:3: ( rule__CondEquality__Group_0__0 )
                    // InternalSemAdapt.g:1564:4: rule__CondEquality__Group_0__0
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
                    // InternalSemAdapt.g:1568:2: ( ( rule__CondEquality__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1568:2: ( ( rule__CondEquality__Group_1__0 ) )
                    // InternalSemAdapt.g:1569:3: ( rule__CondEquality__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondEqualityAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1570:3: ( rule__CondEquality__Group_1__0 )
                    // InternalSemAdapt.g:1570:4: rule__CondEquality__Group_1__0
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
    // InternalSemAdapt.g:1578:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );
    public final void rule__CondComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1582:1: ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSemAdapt.g:1583:2: ( ( rule__CondComparison__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1583:2: ( ( rule__CondComparison__Group_0__0 ) )
                    // InternalSemAdapt.g:1584:3: ( rule__CondComparison__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1585:3: ( rule__CondComparison__Group_0__0 )
                    // InternalSemAdapt.g:1585:4: rule__CondComparison__Group_0__0
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
                    // InternalSemAdapt.g:1589:2: ( ( rule__CondComparison__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1589:2: ( ( rule__CondComparison__Group_1__0 ) )
                    // InternalSemAdapt.g:1590:3: ( rule__CondComparison__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCondComparisonAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1591:3: ( rule__CondComparison__Group_1__0 )
                    // InternalSemAdapt.g:1591:4: rule__CondComparison__Group_1__0
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
    // InternalSemAdapt.g:1599:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1603:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
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
                    // InternalSemAdapt.g:1604:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1604:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1605:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1606:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1606:4: rule__Equality__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1610:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1610:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1611:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1612:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1612:4: rule__Equality__Group_1_0_1__0
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
    // InternalSemAdapt.g:1620:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1624:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) )
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
                    // InternalSemAdapt.g:1625:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1625:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1626:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1627:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1627:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1631:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1631:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1632:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1633:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1633:4: rule__Comparison__Group_1_0_1__0
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
    // InternalSemAdapt.g:1641:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1645:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
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
                    // InternalSemAdapt.g:1646:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1646:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1647:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1648:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1648:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1652:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1652:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1653:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1654:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1654:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalSemAdapt.g:1662:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1666:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
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
                    // InternalSemAdapt.g:1667:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalSemAdapt.g:1667:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalSemAdapt.g:1668:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalSemAdapt.g:1669:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalSemAdapt.g:1669:4: rule__MulOrDiv__Group_1_0_0__0
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
                    // InternalSemAdapt.g:1673:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalSemAdapt.g:1673:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalSemAdapt.g:1674:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalSemAdapt.g:1675:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalSemAdapt.g:1675:4: rule__MulOrDiv__Group_1_0_1__0
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
    // InternalSemAdapt.g:1683:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1687:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) )
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSemAdapt.g:1688:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1688:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalSemAdapt.g:1689:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1690:3: ( rule__Primary__Group_0__0 )
                    // InternalSemAdapt.g:1690:4: rule__Primary__Group_0__0
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
                    // InternalSemAdapt.g:1694:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1694:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalSemAdapt.g:1695:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1696:3: ( rule__Primary__Group_1__0 )
                    // InternalSemAdapt.g:1696:4: rule__Primary__Group_1__0
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
                    // InternalSemAdapt.g:1700:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalSemAdapt.g:1700:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalSemAdapt.g:1701:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalSemAdapt.g:1702:3: ( rule__Primary__Group_2__0 )
                    // InternalSemAdapt.g:1702:4: rule__Primary__Group_2__0
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
                    // InternalSemAdapt.g:1706:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalSemAdapt.g:1706:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalSemAdapt.g:1707:3: ( rule__Primary__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    }
                    // InternalSemAdapt.g:1708:3: ( rule__Primary__Group_3__0 )
                    // InternalSemAdapt.g:1708:4: rule__Primary__Group_3__0
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
                    // InternalSemAdapt.g:1712:2: ( ruleAtomic )
                    {
                    // InternalSemAdapt.g:1712:2: ( ruleAtomic )
                    // InternalSemAdapt.g:1713:3: ruleAtomic
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
    // InternalSemAdapt.g:1722:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1726:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ruleSemanticDomainAccess ) | ( ruleTerminalAccessExpression ) )
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
                    // InternalSemAdapt.g:1727:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalSemAdapt.g:1727:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalSemAdapt.g:1728:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalSemAdapt.g:1729:3: ( rule__Atomic__Group_0__0 )
                    // InternalSemAdapt.g:1729:4: rule__Atomic__Group_0__0
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
                    // InternalSemAdapt.g:1733:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalSemAdapt.g:1733:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalSemAdapt.g:1734:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalSemAdapt.g:1735:3: ( rule__Atomic__Group_1__0 )
                    // InternalSemAdapt.g:1735:4: rule__Atomic__Group_1__0
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
                    // InternalSemAdapt.g:1739:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalSemAdapt.g:1739:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalSemAdapt.g:1740:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalSemAdapt.g:1741:3: ( rule__Atomic__Group_2__0 )
                    // InternalSemAdapt.g:1741:4: rule__Atomic__Group_2__0
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
                    // InternalSemAdapt.g:1745:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalSemAdapt.g:1745:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalSemAdapt.g:1746:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalSemAdapt.g:1747:3: ( rule__Atomic__Group_3__0 )
                    // InternalSemAdapt.g:1747:4: rule__Atomic__Group_3__0
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
                    // InternalSemAdapt.g:1751:2: ( ruleSemanticDomainAccess )
                    {
                    // InternalSemAdapt.g:1751:2: ( ruleSemanticDomainAccess )
                    // InternalSemAdapt.g:1752:3: ruleSemanticDomainAccess
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
                    // InternalSemAdapt.g:1757:2: ( ruleTerminalAccessExpression )
                    {
                    // InternalSemAdapt.g:1757:2: ( ruleTerminalAccessExpression )
                    // InternalSemAdapt.g:1758:3: ruleTerminalAccessExpression
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
    // InternalSemAdapt.g:1767:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1771:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSemAdapt.g:1772:2: ( RULE_STRING )
                    {
                    // InternalSemAdapt.g:1772:2: ( RULE_STRING )
                    // InternalSemAdapt.g:1773:3: RULE_STRING
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
                    // InternalSemAdapt.g:1778:2: ( RULE_ID )
                    {
                    // InternalSemAdapt.g:1778:2: ( RULE_ID )
                    // InternalSemAdapt.g:1779:3: RULE_ID
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
    // InternalSemAdapt.g:1788:1: rule__SemanticAdaptation__Group__0 : rule__SemanticAdaptation__Group__0__Impl rule__SemanticAdaptation__Group__1 ;
    public final void rule__SemanticAdaptation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1792:1: ( rule__SemanticAdaptation__Group__0__Impl rule__SemanticAdaptation__Group__1 )
            // InternalSemAdapt.g:1793:2: rule__SemanticAdaptation__Group__0__Impl rule__SemanticAdaptation__Group__1
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
    // InternalSemAdapt.g:1800:1: rule__SemanticAdaptation__Group__0__Impl : ( ( rule__SemanticAdaptation__ModelAssignment_0 ) ) ;
    public final void rule__SemanticAdaptation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1804:1: ( ( ( rule__SemanticAdaptation__ModelAssignment_0 ) ) )
            // InternalSemAdapt.g:1805:1: ( ( rule__SemanticAdaptation__ModelAssignment_0 ) )
            {
            // InternalSemAdapt.g:1805:1: ( ( rule__SemanticAdaptation__ModelAssignment_0 ) )
            // InternalSemAdapt.g:1806:2: ( rule__SemanticAdaptation__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getModelAssignment_0()); 
            }
            // InternalSemAdapt.g:1807:2: ( rule__SemanticAdaptation__ModelAssignment_0 )
            // InternalSemAdapt.g:1807:3: rule__SemanticAdaptation__ModelAssignment_0
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
    // InternalSemAdapt.g:1815:1: rule__SemanticAdaptation__Group__1 : rule__SemanticAdaptation__Group__1__Impl rule__SemanticAdaptation__Group__2 ;
    public final void rule__SemanticAdaptation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1819:1: ( rule__SemanticAdaptation__Group__1__Impl rule__SemanticAdaptation__Group__2 )
            // InternalSemAdapt.g:1820:2: rule__SemanticAdaptation__Group__1__Impl rule__SemanticAdaptation__Group__2
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
    // InternalSemAdapt.g:1827:1: rule__SemanticAdaptation__Group__1__Impl : ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) ) ;
    public final void rule__SemanticAdaptation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1831:1: ( ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) ) )
            // InternalSemAdapt.g:1832:1: ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) )
            {
            // InternalSemAdapt.g:1832:1: ( ( rule__SemanticAdaptation__SemanticsAssignment_1 ) )
            // InternalSemAdapt.g:1833:2: ( rule__SemanticAdaptation__SemanticsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getSemanticsAssignment_1()); 
            }
            // InternalSemAdapt.g:1834:2: ( rule__SemanticAdaptation__SemanticsAssignment_1 )
            // InternalSemAdapt.g:1834:3: rule__SemanticAdaptation__SemanticsAssignment_1
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
    // InternalSemAdapt.g:1842:1: rule__SemanticAdaptation__Group__2 : rule__SemanticAdaptation__Group__2__Impl rule__SemanticAdaptation__Group__3 ;
    public final void rule__SemanticAdaptation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1846:1: ( rule__SemanticAdaptation__Group__2__Impl rule__SemanticAdaptation__Group__3 )
            // InternalSemAdapt.g:1847:2: rule__SemanticAdaptation__Group__2__Impl rule__SemanticAdaptation__Group__3
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
    // InternalSemAdapt.g:1854:1: rule__SemanticAdaptation__Group__2__Impl : ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* ) ;
    public final void rule__SemanticAdaptation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1858:1: ( ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* ) )
            // InternalSemAdapt.g:1859:1: ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* )
            {
            // InternalSemAdapt.g:1859:1: ( ( rule__SemanticAdaptation__ImportsAssignment_2 )* )
            // InternalSemAdapt.g:1860:2: ( rule__SemanticAdaptation__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getImportsAssignment_2()); 
            }
            // InternalSemAdapt.g:1861:2: ( rule__SemanticAdaptation__ImportsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSemAdapt.g:1861:3: rule__SemanticAdaptation__ImportsAssignment_2
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
    // InternalSemAdapt.g:1869:1: rule__SemanticAdaptation__Group__3 : rule__SemanticAdaptation__Group__3__Impl ;
    public final void rule__SemanticAdaptation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1873:1: ( rule__SemanticAdaptation__Group__3__Impl )
            // InternalSemAdapt.g:1874:2: rule__SemanticAdaptation__Group__3__Impl
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
    // InternalSemAdapt.g:1880:1: rule__SemanticAdaptation__Group__3__Impl : ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* ) ;
    public final void rule__SemanticAdaptation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1884:1: ( ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* ) )
            // InternalSemAdapt.g:1885:1: ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* )
            {
            // InternalSemAdapt.g:1885:1: ( ( rule__SemanticAdaptation__ModulesAssignment_3 )* )
            // InternalSemAdapt.g:1886:2: ( rule__SemanticAdaptation__ModulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticAdaptationAccess().getModulesAssignment_3()); 
            }
            // InternalSemAdapt.g:1887:2: ( rule__SemanticAdaptation__ModulesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSemAdapt.g:1887:3: rule__SemanticAdaptation__ModulesAssignment_3
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
    // InternalSemAdapt.g:1896:1: rule__Semantics__Group__0 : rule__Semantics__Group__0__Impl rule__Semantics__Group__1 ;
    public final void rule__Semantics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1900:1: ( rule__Semantics__Group__0__Impl rule__Semantics__Group__1 )
            // InternalSemAdapt.g:1901:2: rule__Semantics__Group__0__Impl rule__Semantics__Group__1
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
    // InternalSemAdapt.g:1908:1: rule__Semantics__Group__0__Impl : ( 'semantics' ) ;
    public final void rule__Semantics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1912:1: ( ( 'semantics' ) )
            // InternalSemAdapt.g:1913:1: ( 'semantics' )
            {
            // InternalSemAdapt.g:1913:1: ( 'semantics' )
            // InternalSemAdapt.g:1914:2: 'semantics'
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
    // InternalSemAdapt.g:1923:1: rule__Semantics__Group__1 : rule__Semantics__Group__1__Impl ;
    public final void rule__Semantics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1927:1: ( rule__Semantics__Group__1__Impl )
            // InternalSemAdapt.g:1928:2: rule__Semantics__Group__1__Impl
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
    // InternalSemAdapt.g:1934:1: rule__Semantics__Group__1__Impl : ( ( rule__Semantics__ImportURIAssignment_1 ) ) ;
    public final void rule__Semantics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1938:1: ( ( ( rule__Semantics__ImportURIAssignment_1 ) ) )
            // InternalSemAdapt.g:1939:1: ( ( rule__Semantics__ImportURIAssignment_1 ) )
            {
            // InternalSemAdapt.g:1939:1: ( ( rule__Semantics__ImportURIAssignment_1 ) )
            // InternalSemAdapt.g:1940:2: ( rule__Semantics__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticsAccess().getImportURIAssignment_1()); 
            }
            // InternalSemAdapt.g:1941:2: ( rule__Semantics__ImportURIAssignment_1 )
            // InternalSemAdapt.g:1941:3: rule__Semantics__ImportURIAssignment_1
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
    // InternalSemAdapt.g:1950:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1954:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalSemAdapt.g:1955:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalSemAdapt.g:1962:1: rule__Module__Group__0__Impl : ( ( rule__Module__NameAssignment_0 ) ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1966:1: ( ( ( rule__Module__NameAssignment_0 ) ) )
            // InternalSemAdapt.g:1967:1: ( ( rule__Module__NameAssignment_0 ) )
            {
            // InternalSemAdapt.g:1967:1: ( ( rule__Module__NameAssignment_0 ) )
            // InternalSemAdapt.g:1968:2: ( rule__Module__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNameAssignment_0()); 
            }
            // InternalSemAdapt.g:1969:2: ( rule__Module__NameAssignment_0 )
            // InternalSemAdapt.g:1969:3: rule__Module__NameAssignment_0
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
    // InternalSemAdapt.g:1977:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1981:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalSemAdapt.g:1982:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalSemAdapt.g:1989:1: rule__Module__Group__1__Impl : ( '{' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:1993:1: ( ( '{' ) )
            // InternalSemAdapt.g:1994:1: ( '{' )
            {
            // InternalSemAdapt.g:1994:1: ( '{' )
            // InternalSemAdapt.g:1995:2: '{'
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
    // InternalSemAdapt.g:2004:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2008:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalSemAdapt.g:2009:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalSemAdapt.g:2016:1: rule__Module__Group__2__Impl : ( ( rule__Module__PointcutsAssignment_2 )* ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2020:1: ( ( ( rule__Module__PointcutsAssignment_2 )* ) )
            // InternalSemAdapt.g:2021:1: ( ( rule__Module__PointcutsAssignment_2 )* )
            {
            // InternalSemAdapt.g:2021:1: ( ( rule__Module__PointcutsAssignment_2 )* )
            // InternalSemAdapt.g:2022:2: ( rule__Module__PointcutsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPointcutsAssignment_2()); 
            }
            // InternalSemAdapt.g:2023:2: ( rule__Module__PointcutsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16||LA23_0==52) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSemAdapt.g:2023:3: rule__Module__PointcutsAssignment_2
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
    // InternalSemAdapt.g:2031:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2035:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalSemAdapt.g:2036:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalSemAdapt.g:2043:1: rule__Module__Group__3__Impl : ( ( rule__Module__AdaptationsAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2047:1: ( ( ( rule__Module__AdaptationsAssignment_3 )* ) )
            // InternalSemAdapt.g:2048:1: ( ( rule__Module__AdaptationsAssignment_3 )* )
            {
            // InternalSemAdapt.g:2048:1: ( ( rule__Module__AdaptationsAssignment_3 )* )
            // InternalSemAdapt.g:2049:2: ( rule__Module__AdaptationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getAdaptationsAssignment_3()); 
            }
            // InternalSemAdapt.g:2050:2: ( rule__Module__AdaptationsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=19 && LA24_0<=21)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSemAdapt.g:2050:3: rule__Module__AdaptationsAssignment_3
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
    // InternalSemAdapt.g:2058:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2062:1: ( rule__Module__Group__4__Impl )
            // InternalSemAdapt.g:2063:2: rule__Module__Group__4__Impl
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
    // InternalSemAdapt.g:2069:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2073:1: ( ( '}' ) )
            // InternalSemAdapt.g:2074:1: ( '}' )
            {
            // InternalSemAdapt.g:2074:1: ( '}' )
            // InternalSemAdapt.g:2075:2: '}'
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
    // InternalSemAdapt.g:2085:1: rule__Pointcut__Group__0 : rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 ;
    public final void rule__Pointcut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2089:1: ( rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 )
            // InternalSemAdapt.g:2090:2: rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1
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
    // InternalSemAdapt.g:2097:1: rule__Pointcut__Group__0__Impl : ( ( rule__Pointcut__RecursiveAssignment_0 )? ) ;
    public final void rule__Pointcut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2101:1: ( ( ( rule__Pointcut__RecursiveAssignment_0 )? ) )
            // InternalSemAdapt.g:2102:1: ( ( rule__Pointcut__RecursiveAssignment_0 )? )
            {
            // InternalSemAdapt.g:2102:1: ( ( rule__Pointcut__RecursiveAssignment_0 )? )
            // InternalSemAdapt.g:2103:2: ( rule__Pointcut__RecursiveAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getRecursiveAssignment_0()); 
            }
            // InternalSemAdapt.g:2104:2: ( rule__Pointcut__RecursiveAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemAdapt.g:2104:3: rule__Pointcut__RecursiveAssignment_0
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
    // InternalSemAdapt.g:2112:1: rule__Pointcut__Group__1 : rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 ;
    public final void rule__Pointcut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2116:1: ( rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 )
            // InternalSemAdapt.g:2117:2: rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2
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
    // InternalSemAdapt.g:2124:1: rule__Pointcut__Group__1__Impl : ( 'match' ) ;
    public final void rule__Pointcut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2128:1: ( ( 'match' ) )
            // InternalSemAdapt.g:2129:1: ( 'match' )
            {
            // InternalSemAdapt.g:2129:1: ( 'match' )
            // InternalSemAdapt.g:2130:2: 'match'
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
    // InternalSemAdapt.g:2139:1: rule__Pointcut__Group__2 : rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 ;
    public final void rule__Pointcut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2143:1: ( rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 )
            // InternalSemAdapt.g:2144:2: rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3
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
    // InternalSemAdapt.g:2151:1: rule__Pointcut__Group__2__Impl : ( ( rule__Pointcut__StructureAssignment_2 ) ) ;
    public final void rule__Pointcut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2155:1: ( ( ( rule__Pointcut__StructureAssignment_2 ) ) )
            // InternalSemAdapt.g:2156:1: ( ( rule__Pointcut__StructureAssignment_2 ) )
            {
            // InternalSemAdapt.g:2156:1: ( ( rule__Pointcut__StructureAssignment_2 ) )
            // InternalSemAdapt.g:2157:2: ( rule__Pointcut__StructureAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getStructureAssignment_2()); 
            }
            // InternalSemAdapt.g:2158:2: ( rule__Pointcut__StructureAssignment_2 )
            // InternalSemAdapt.g:2158:3: rule__Pointcut__StructureAssignment_2
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
    // InternalSemAdapt.g:2166:1: rule__Pointcut__Group__3 : rule__Pointcut__Group__3__Impl ;
    public final void rule__Pointcut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2170:1: ( rule__Pointcut__Group__3__Impl )
            // InternalSemAdapt.g:2171:2: rule__Pointcut__Group__3__Impl
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
    // InternalSemAdapt.g:2177:1: rule__Pointcut__Group__3__Impl : ( ( rule__Pointcut__Group_3__0 )? ) ;
    public final void rule__Pointcut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2181:1: ( ( ( rule__Pointcut__Group_3__0 )? ) )
            // InternalSemAdapt.g:2182:1: ( ( rule__Pointcut__Group_3__0 )? )
            {
            // InternalSemAdapt.g:2182:1: ( ( rule__Pointcut__Group_3__0 )? )
            // InternalSemAdapt.g:2183:2: ( rule__Pointcut__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_3()); 
            }
            // InternalSemAdapt.g:2184:2: ( rule__Pointcut__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSemAdapt.g:2184:3: rule__Pointcut__Group_3__0
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
    // InternalSemAdapt.g:2193:1: rule__Pointcut__Group_3__0 : rule__Pointcut__Group_3__0__Impl rule__Pointcut__Group_3__1 ;
    public final void rule__Pointcut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2197:1: ( rule__Pointcut__Group_3__0__Impl rule__Pointcut__Group_3__1 )
            // InternalSemAdapt.g:2198:2: rule__Pointcut__Group_3__0__Impl rule__Pointcut__Group_3__1
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
    // InternalSemAdapt.g:2205:1: rule__Pointcut__Group_3__0__Impl : ( 'where' ) ;
    public final void rule__Pointcut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2209:1: ( ( 'where' ) )
            // InternalSemAdapt.g:2210:1: ( 'where' )
            {
            // InternalSemAdapt.g:2210:1: ( 'where' )
            // InternalSemAdapt.g:2211:2: 'where'
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
    // InternalSemAdapt.g:2220:1: rule__Pointcut__Group_3__1 : rule__Pointcut__Group_3__1__Impl rule__Pointcut__Group_3__2 ;
    public final void rule__Pointcut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2224:1: ( rule__Pointcut__Group_3__1__Impl rule__Pointcut__Group_3__2 )
            // InternalSemAdapt.g:2225:2: rule__Pointcut__Group_3__1__Impl rule__Pointcut__Group_3__2
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
    // InternalSemAdapt.g:2232:1: rule__Pointcut__Group_3__1__Impl : ( ( rule__Pointcut__ConditionsAssignment_3_1 ) ) ;
    public final void rule__Pointcut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2236:1: ( ( ( rule__Pointcut__ConditionsAssignment_3_1 ) ) )
            // InternalSemAdapt.g:2237:1: ( ( rule__Pointcut__ConditionsAssignment_3_1 ) )
            {
            // InternalSemAdapt.g:2237:1: ( ( rule__Pointcut__ConditionsAssignment_3_1 ) )
            // InternalSemAdapt.g:2238:2: ( rule__Pointcut__ConditionsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getConditionsAssignment_3_1()); 
            }
            // InternalSemAdapt.g:2239:2: ( rule__Pointcut__ConditionsAssignment_3_1 )
            // InternalSemAdapt.g:2239:3: rule__Pointcut__ConditionsAssignment_3_1
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
    // InternalSemAdapt.g:2247:1: rule__Pointcut__Group_3__2 : rule__Pointcut__Group_3__2__Impl ;
    public final void rule__Pointcut__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2251:1: ( rule__Pointcut__Group_3__2__Impl )
            // InternalSemAdapt.g:2252:2: rule__Pointcut__Group_3__2__Impl
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
    // InternalSemAdapt.g:2258:1: rule__Pointcut__Group_3__2__Impl : ( ( rule__Pointcut__Group_3_2__0 )* ) ;
    public final void rule__Pointcut__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2262:1: ( ( ( rule__Pointcut__Group_3_2__0 )* ) )
            // InternalSemAdapt.g:2263:1: ( ( rule__Pointcut__Group_3_2__0 )* )
            {
            // InternalSemAdapt.g:2263:1: ( ( rule__Pointcut__Group_3_2__0 )* )
            // InternalSemAdapt.g:2264:2: ( rule__Pointcut__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_3_2()); 
            }
            // InternalSemAdapt.g:2265:2: ( rule__Pointcut__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSemAdapt.g:2265:3: rule__Pointcut__Group_3_2__0
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
    // InternalSemAdapt.g:2274:1: rule__Pointcut__Group_3_2__0 : rule__Pointcut__Group_3_2__0__Impl rule__Pointcut__Group_3_2__1 ;
    public final void rule__Pointcut__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2278:1: ( rule__Pointcut__Group_3_2__0__Impl rule__Pointcut__Group_3_2__1 )
            // InternalSemAdapt.g:2279:2: rule__Pointcut__Group_3_2__0__Impl rule__Pointcut__Group_3_2__1
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
    // InternalSemAdapt.g:2286:1: rule__Pointcut__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Pointcut__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2290:1: ( ( ',' ) )
            // InternalSemAdapt.g:2291:1: ( ',' )
            {
            // InternalSemAdapt.g:2291:1: ( ',' )
            // InternalSemAdapt.g:2292:2: ','
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
    // InternalSemAdapt.g:2301:1: rule__Pointcut__Group_3_2__1 : rule__Pointcut__Group_3_2__1__Impl ;
    public final void rule__Pointcut__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2305:1: ( rule__Pointcut__Group_3_2__1__Impl )
            // InternalSemAdapt.g:2306:2: rule__Pointcut__Group_3_2__1__Impl
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
    // InternalSemAdapt.g:2312:1: rule__Pointcut__Group_3_2__1__Impl : ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) ) ;
    public final void rule__Pointcut__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2316:1: ( ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) ) )
            // InternalSemAdapt.g:2317:1: ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) )
            {
            // InternalSemAdapt.g:2317:1: ( ( rule__Pointcut__ConditionsAssignment_3_2_1 ) )
            // InternalSemAdapt.g:2318:2: ( rule__Pointcut__ConditionsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getConditionsAssignment_3_2_1()); 
            }
            // InternalSemAdapt.g:2319:2: ( rule__Pointcut__ConditionsAssignment_3_2_1 )
            // InternalSemAdapt.g:2319:3: rule__Pointcut__ConditionsAssignment_3_2_1
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
    // InternalSemAdapt.g:2328:1: rule__Adaptation__Group__0 : rule__Adaptation__Group__0__Impl rule__Adaptation__Group__1 ;
    public final void rule__Adaptation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2332:1: ( rule__Adaptation__Group__0__Impl rule__Adaptation__Group__1 )
            // InternalSemAdapt.g:2333:2: rule__Adaptation__Group__0__Impl rule__Adaptation__Group__1
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
    // InternalSemAdapt.g:2340:1: rule__Adaptation__Group__0__Impl : ( ( rule__Adaptation__Alternatives_0 ) ) ;
    public final void rule__Adaptation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2344:1: ( ( ( rule__Adaptation__Alternatives_0 ) ) )
            // InternalSemAdapt.g:2345:1: ( ( rule__Adaptation__Alternatives_0 ) )
            {
            // InternalSemAdapt.g:2345:1: ( ( rule__Adaptation__Alternatives_0 ) )
            // InternalSemAdapt.g:2346:2: ( rule__Adaptation__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAlternatives_0()); 
            }
            // InternalSemAdapt.g:2347:2: ( rule__Adaptation__Alternatives_0 )
            // InternalSemAdapt.g:2347:3: rule__Adaptation__Alternatives_0
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
    // InternalSemAdapt.g:2355:1: rule__Adaptation__Group__1 : rule__Adaptation__Group__1__Impl rule__Adaptation__Group__2 ;
    public final void rule__Adaptation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2359:1: ( rule__Adaptation__Group__1__Impl rule__Adaptation__Group__2 )
            // InternalSemAdapt.g:2360:2: rule__Adaptation__Group__1__Impl rule__Adaptation__Group__2
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
    // InternalSemAdapt.g:2367:1: rule__Adaptation__Group__1__Impl : ( ( rule__Adaptation__TargetAssignment_1 ) ) ;
    public final void rule__Adaptation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2371:1: ( ( ( rule__Adaptation__TargetAssignment_1 ) ) )
            // InternalSemAdapt.g:2372:1: ( ( rule__Adaptation__TargetAssignment_1 ) )
            {
            // InternalSemAdapt.g:2372:1: ( ( rule__Adaptation__TargetAssignment_1 ) )
            // InternalSemAdapt.g:2373:2: ( rule__Adaptation__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getTargetAssignment_1()); 
            }
            // InternalSemAdapt.g:2374:2: ( rule__Adaptation__TargetAssignment_1 )
            // InternalSemAdapt.g:2374:3: rule__Adaptation__TargetAssignment_1
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
    // InternalSemAdapt.g:2382:1: rule__Adaptation__Group__2 : rule__Adaptation__Group__2__Impl ;
    public final void rule__Adaptation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2386:1: ( rule__Adaptation__Group__2__Impl )
            // InternalSemAdapt.g:2387:2: rule__Adaptation__Group__2__Impl
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
    // InternalSemAdapt.g:2393:1: rule__Adaptation__Group__2__Impl : ( ( rule__Adaptation__AdaptationAssignment_2 ) ) ;
    public final void rule__Adaptation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2397:1: ( ( ( rule__Adaptation__AdaptationAssignment_2 ) ) )
            // InternalSemAdapt.g:2398:1: ( ( rule__Adaptation__AdaptationAssignment_2 ) )
            {
            // InternalSemAdapt.g:2398:1: ( ( rule__Adaptation__AdaptationAssignment_2 ) )
            // InternalSemAdapt.g:2399:2: ( rule__Adaptation__AdaptationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAdaptationAssignment_2()); 
            }
            // InternalSemAdapt.g:2400:2: ( rule__Adaptation__AdaptationAssignment_2 )
            // InternalSemAdapt.g:2400:3: rule__Adaptation__AdaptationAssignment_2
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
    // InternalSemAdapt.g:2409:1: rule__Adaptation__Group_0_0__0 : rule__Adaptation__Group_0_0__0__Impl rule__Adaptation__Group_0_0__1 ;
    public final void rule__Adaptation__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2413:1: ( rule__Adaptation__Group_0_0__0__Impl rule__Adaptation__Group_0_0__1 )
            // InternalSemAdapt.g:2414:2: rule__Adaptation__Group_0_0__0__Impl rule__Adaptation__Group_0_0__1
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
    // InternalSemAdapt.g:2421:1: rule__Adaptation__Group_0_0__0__Impl : ( () ) ;
    public final void rule__Adaptation__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2425:1: ( ( () ) )
            // InternalSemAdapt.g:2426:1: ( () )
            {
            // InternalSemAdapt.g:2426:1: ( () )
            // InternalSemAdapt.g:2427:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getSpecializationAction_0_0_0()); 
            }
            // InternalSemAdapt.g:2428:2: ()
            // InternalSemAdapt.g:2428:3: 
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
    // InternalSemAdapt.g:2436:1: rule__Adaptation__Group_0_0__1 : rule__Adaptation__Group_0_0__1__Impl ;
    public final void rule__Adaptation__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2440:1: ( rule__Adaptation__Group_0_0__1__Impl )
            // InternalSemAdapt.g:2441:2: rule__Adaptation__Group_0_0__1__Impl
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
    // InternalSemAdapt.g:2447:1: rule__Adaptation__Group_0_0__1__Impl : ( 'Specialization' ) ;
    public final void rule__Adaptation__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2451:1: ( ( 'Specialization' ) )
            // InternalSemAdapt.g:2452:1: ( 'Specialization' )
            {
            // InternalSemAdapt.g:2452:1: ( 'Specialization' )
            // InternalSemAdapt.g:2453:2: 'Specialization'
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
    // InternalSemAdapt.g:2463:1: rule__Adaptation__Group_0_1__0 : rule__Adaptation__Group_0_1__0__Impl rule__Adaptation__Group_0_1__1 ;
    public final void rule__Adaptation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2467:1: ( rule__Adaptation__Group_0_1__0__Impl rule__Adaptation__Group_0_1__1 )
            // InternalSemAdapt.g:2468:2: rule__Adaptation__Group_0_1__0__Impl rule__Adaptation__Group_0_1__1
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
    // InternalSemAdapt.g:2475:1: rule__Adaptation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__Adaptation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2479:1: ( ( () ) )
            // InternalSemAdapt.g:2480:1: ( () )
            {
            // InternalSemAdapt.g:2480:1: ( () )
            // InternalSemAdapt.g:2481:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getBeforeAction_0_1_0()); 
            }
            // InternalSemAdapt.g:2482:2: ()
            // InternalSemAdapt.g:2482:3: 
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
    // InternalSemAdapt.g:2490:1: rule__Adaptation__Group_0_1__1 : rule__Adaptation__Group_0_1__1__Impl ;
    public final void rule__Adaptation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2494:1: ( rule__Adaptation__Group_0_1__1__Impl )
            // InternalSemAdapt.g:2495:2: rule__Adaptation__Group_0_1__1__Impl
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
    // InternalSemAdapt.g:2501:1: rule__Adaptation__Group_0_1__1__Impl : ( 'Before' ) ;
    public final void rule__Adaptation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2505:1: ( ( 'Before' ) )
            // InternalSemAdapt.g:2506:1: ( 'Before' )
            {
            // InternalSemAdapt.g:2506:1: ( 'Before' )
            // InternalSemAdapt.g:2507:2: 'Before'
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
    // InternalSemAdapt.g:2517:1: rule__Adaptation__Group_0_2__0 : rule__Adaptation__Group_0_2__0__Impl rule__Adaptation__Group_0_2__1 ;
    public final void rule__Adaptation__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2521:1: ( rule__Adaptation__Group_0_2__0__Impl rule__Adaptation__Group_0_2__1 )
            // InternalSemAdapt.g:2522:2: rule__Adaptation__Group_0_2__0__Impl rule__Adaptation__Group_0_2__1
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
    // InternalSemAdapt.g:2529:1: rule__Adaptation__Group_0_2__0__Impl : ( () ) ;
    public final void rule__Adaptation__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2533:1: ( ( () ) )
            // InternalSemAdapt.g:2534:1: ( () )
            {
            // InternalSemAdapt.g:2534:1: ( () )
            // InternalSemAdapt.g:2535:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getAfterAction_0_2_0()); 
            }
            // InternalSemAdapt.g:2536:2: ()
            // InternalSemAdapt.g:2536:3: 
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
    // InternalSemAdapt.g:2544:1: rule__Adaptation__Group_0_2__1 : rule__Adaptation__Group_0_2__1__Impl ;
    public final void rule__Adaptation__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2548:1: ( rule__Adaptation__Group_0_2__1__Impl )
            // InternalSemAdapt.g:2549:2: rule__Adaptation__Group_0_2__1__Impl
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
    // InternalSemAdapt.g:2555:1: rule__Adaptation__Group_0_2__1__Impl : ( 'After' ) ;
    public final void rule__Adaptation__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2559:1: ( ( 'After' ) )
            // InternalSemAdapt.g:2560:1: ( 'After' )
            {
            // InternalSemAdapt.g:2560:1: ( 'After' )
            // InternalSemAdapt.g:2561:2: 'After'
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
    // InternalSemAdapt.g:2571:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2575:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSemAdapt.g:2576:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSemAdapt.g:2583:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2587:1: ( ( 'model' ) )
            // InternalSemAdapt.g:2588:1: ( 'model' )
            {
            // InternalSemAdapt.g:2588:1: ( 'model' )
            // InternalSemAdapt.g:2589:2: 'model'
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
    // InternalSemAdapt.g:2598:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2602:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSemAdapt.g:2603:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSemAdapt.g:2610:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportURIAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2614:1: ( ( ( rule__Model__ImportURIAssignment_1 ) ) )
            // InternalSemAdapt.g:2615:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            {
            // InternalSemAdapt.g:2615:1: ( ( rule__Model__ImportURIAssignment_1 ) )
            // InternalSemAdapt.g:2616:2: ( rule__Model__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportURIAssignment_1()); 
            }
            // InternalSemAdapt.g:2617:2: ( rule__Model__ImportURIAssignment_1 )
            // InternalSemAdapt.g:2617:3: rule__Model__ImportURIAssignment_1
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
    // InternalSemAdapt.g:2625:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2629:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSemAdapt.g:2630:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSemAdapt.g:2637:1: rule__Model__Group__2__Impl : ( 'with' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2641:1: ( ( 'with' ) )
            // InternalSemAdapt.g:2642:1: ( 'with' )
            {
            // InternalSemAdapt.g:2642:1: ( 'with' )
            // InternalSemAdapt.g:2643:2: 'with'
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
    // InternalSemAdapt.g:2652:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2656:1: ( rule__Model__Group__3__Impl )
            // InternalSemAdapt.g:2657:2: rule__Model__Group__3__Impl
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
    // InternalSemAdapt.g:2663:1: rule__Model__Group__3__Impl : ( ( rule__Model__SemanticdomainAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2667:1: ( ( ( rule__Model__SemanticdomainAssignment_3 ) ) )
            // InternalSemAdapt.g:2668:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            {
            // InternalSemAdapt.g:2668:1: ( ( rule__Model__SemanticdomainAssignment_3 ) )
            // InternalSemAdapt.g:2669:2: ( rule__Model__SemanticdomainAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainAssignment_3()); 
            }
            // InternalSemAdapt.g:2670:2: ( rule__Model__SemanticdomainAssignment_3 )
            // InternalSemAdapt.g:2670:3: rule__Model__SemanticdomainAssignment_3
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
    // InternalSemAdapt.g:2679:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2683:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSemAdapt.g:2684:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalSemAdapt.g:2691:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2695:1: ( ( 'import' ) )
            // InternalSemAdapt.g:2696:1: ( 'import' )
            {
            // InternalSemAdapt.g:2696:1: ( 'import' )
            // InternalSemAdapt.g:2697:2: 'import'
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
    // InternalSemAdapt.g:2706:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2710:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalSemAdapt.g:2711:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalSemAdapt.g:2718:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2722:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalSemAdapt.g:2723:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalSemAdapt.g:2723:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalSemAdapt.g:2724:2: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // InternalSemAdapt.g:2725:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalSemAdapt.g:2725:3: rule__Import__ImportURIAssignment_1
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
    // InternalSemAdapt.g:2733:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2737:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalSemAdapt.g:2738:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalSemAdapt.g:2745:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2749:1: ( ( 'as' ) )
            // InternalSemAdapt.g:2750:1: ( 'as' )
            {
            // InternalSemAdapt.g:2750:1: ( 'as' )
            // InternalSemAdapt.g:2751:2: 'as'
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
    // InternalSemAdapt.g:2760:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2764:1: ( rule__Import__Group__3__Impl )
            // InternalSemAdapt.g:2765:2: rule__Import__Group__3__Impl
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
    // InternalSemAdapt.g:2771:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2775:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalSemAdapt.g:2776:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalSemAdapt.g:2776:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalSemAdapt.g:2777:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalSemAdapt.g:2778:2: ( rule__Import__NameAssignment_3 )
            // InternalSemAdapt.g:2778:3: rule__Import__NameAssignment_3
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
    // InternalSemAdapt.g:2787:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2791:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSemAdapt.g:2792:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalSemAdapt.g:2799:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2803:1: ( ( 'rule' ) )
            // InternalSemAdapt.g:2804:1: ( 'rule' )
            {
            // InternalSemAdapt.g:2804:1: ( 'rule' )
            // InternalSemAdapt.g:2805:2: 'rule'
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
    // InternalSemAdapt.g:2814:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2818:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSemAdapt.g:2819:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalSemAdapt.g:2826:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2830:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalSemAdapt.g:2831:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalSemAdapt.g:2831:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalSemAdapt.g:2832:2: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // InternalSemAdapt.g:2833:2: ( rule__Rule__NameAssignment_1 )
            // InternalSemAdapt.g:2833:3: rule__Rule__NameAssignment_1
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
    // InternalSemAdapt.g:2841:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2845:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSemAdapt.g:2846:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalSemAdapt.g:2853:1: rule__Rule__Group__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2857:1: ( ( ',' ) )
            // InternalSemAdapt.g:2858:1: ( ',' )
            {
            // InternalSemAdapt.g:2858:1: ( ',' )
            // InternalSemAdapt.g:2859:2: ','
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
    // InternalSemAdapt.g:2868:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2872:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSemAdapt.g:2873:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalSemAdapt.g:2880:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConclusionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2884:1: ( ( ( rule__Rule__ConclusionAssignment_3 ) ) )
            // InternalSemAdapt.g:2885:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            {
            // InternalSemAdapt.g:2885:1: ( ( rule__Rule__ConclusionAssignment_3 ) )
            // InternalSemAdapt.g:2886:2: ( rule__Rule__ConclusionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConclusionAssignment_3()); 
            }
            // InternalSemAdapt.g:2887:2: ( rule__Rule__ConclusionAssignment_3 )
            // InternalSemAdapt.g:2887:3: rule__Rule__ConclusionAssignment_3
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
    // InternalSemAdapt.g:2895:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2899:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSemAdapt.g:2900:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalSemAdapt.g:2907:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )? ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2911:1: ( ( ( rule__Rule__Group_4__0 )? ) )
            // InternalSemAdapt.g:2912:1: ( ( rule__Rule__Group_4__0 )? )
            {
            // InternalSemAdapt.g:2912:1: ( ( rule__Rule__Group_4__0 )? )
            // InternalSemAdapt.g:2913:2: ( rule__Rule__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4()); 
            }
            // InternalSemAdapt.g:2914:2: ( rule__Rule__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSemAdapt.g:2914:3: rule__Rule__Group_4__0
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
    // InternalSemAdapt.g:2922:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2926:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalSemAdapt.g:2927:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalSemAdapt.g:2934:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2938:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalSemAdapt.g:2939:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalSemAdapt.g:2939:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalSemAdapt.g:2940:2: ( rule__Rule__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5()); 
            }
            // InternalSemAdapt.g:2941:2: ( rule__Rule__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSemAdapt.g:2941:3: rule__Rule__Group_5__0
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
    // InternalSemAdapt.g:2949:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2953:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalSemAdapt.g:2954:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
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
    // InternalSemAdapt.g:2961:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2965:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalSemAdapt.g:2966:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalSemAdapt.g:2966:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalSemAdapt.g:2967:2: ( rule__Rule__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6()); 
            }
            // InternalSemAdapt.g:2968:2: ( rule__Rule__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemAdapt.g:2968:3: rule__Rule__Group_6__0
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
    // InternalSemAdapt.g:2976:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2980:1: ( rule__Rule__Group__7__Impl )
            // InternalSemAdapt.g:2981:2: rule__Rule__Group__7__Impl
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
    // InternalSemAdapt.g:2987:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__Group_7__0 )? ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:2991:1: ( ( ( rule__Rule__Group_7__0 )? ) )
            // InternalSemAdapt.g:2992:1: ( ( rule__Rule__Group_7__0 )? )
            {
            // InternalSemAdapt.g:2992:1: ( ( rule__Rule__Group_7__0 )? )
            // InternalSemAdapt.g:2993:2: ( rule__Rule__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7()); 
            }
            // InternalSemAdapt.g:2994:2: ( rule__Rule__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSemAdapt.g:2994:3: rule__Rule__Group_7__0
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
    // InternalSemAdapt.g:3003:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3007:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // InternalSemAdapt.g:3008:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
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
    // InternalSemAdapt.g:3015:1: rule__Rule__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3019:1: ( ( 'where' ) )
            // InternalSemAdapt.g:3020:1: ( 'where' )
            {
            // InternalSemAdapt.g:3020:1: ( 'where' )
            // InternalSemAdapt.g:3021:2: 'where'
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
    // InternalSemAdapt.g:3030:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3034:1: ( rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2 )
            // InternalSemAdapt.g:3035:2: rule__Rule__Group_4__1__Impl rule__Rule__Group_4__2
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
    // InternalSemAdapt.g:3042:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3046:1: ( ( ( rule__Rule__ConditionsAssignment_4_1 ) ) )
            // InternalSemAdapt.g:3047:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            {
            // InternalSemAdapt.g:3047:1: ( ( rule__Rule__ConditionsAssignment_4_1 ) )
            // InternalSemAdapt.g:3048:2: ( rule__Rule__ConditionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_1()); 
            }
            // InternalSemAdapt.g:3049:2: ( rule__Rule__ConditionsAssignment_4_1 )
            // InternalSemAdapt.g:3049:3: rule__Rule__ConditionsAssignment_4_1
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
    // InternalSemAdapt.g:3057:1: rule__Rule__Group_4__2 : rule__Rule__Group_4__2__Impl ;
    public final void rule__Rule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3061:1: ( rule__Rule__Group_4__2__Impl )
            // InternalSemAdapt.g:3062:2: rule__Rule__Group_4__2__Impl
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
    // InternalSemAdapt.g:3068:1: rule__Rule__Group_4__2__Impl : ( ( rule__Rule__Group_4_2__0 )* ) ;
    public final void rule__Rule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3072:1: ( ( ( rule__Rule__Group_4_2__0 )* ) )
            // InternalSemAdapt.g:3073:1: ( ( rule__Rule__Group_4_2__0 )* )
            {
            // InternalSemAdapt.g:3073:1: ( ( rule__Rule__Group_4_2__0 )* )
            // InternalSemAdapt.g:3074:2: ( rule__Rule__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_4_2()); 
            }
            // InternalSemAdapt.g:3075:2: ( rule__Rule__Group_4_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSemAdapt.g:3075:3: rule__Rule__Group_4_2__0
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
    // InternalSemAdapt.g:3084:1: rule__Rule__Group_4_2__0 : rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 ;
    public final void rule__Rule__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3088:1: ( rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1 )
            // InternalSemAdapt.g:3089:2: rule__Rule__Group_4_2__0__Impl rule__Rule__Group_4_2__1
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
    // InternalSemAdapt.g:3096:1: rule__Rule__Group_4_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3100:1: ( ( ';' ) )
            // InternalSemAdapt.g:3101:1: ( ';' )
            {
            // InternalSemAdapt.g:3101:1: ( ';' )
            // InternalSemAdapt.g:3102:2: ';'
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
    // InternalSemAdapt.g:3111:1: rule__Rule__Group_4_2__1 : rule__Rule__Group_4_2__1__Impl ;
    public final void rule__Rule__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3115:1: ( rule__Rule__Group_4_2__1__Impl )
            // InternalSemAdapt.g:3116:2: rule__Rule__Group_4_2__1__Impl
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
    // InternalSemAdapt.g:3122:1: rule__Rule__Group_4_2__1__Impl : ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) ;
    public final void rule__Rule__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3126:1: ( ( ( rule__Rule__ConditionsAssignment_4_2_1 ) ) )
            // InternalSemAdapt.g:3127:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            {
            // InternalSemAdapt.g:3127:1: ( ( rule__Rule__ConditionsAssignment_4_2_1 ) )
            // InternalSemAdapt.g:3128:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getConditionsAssignment_4_2_1()); 
            }
            // InternalSemAdapt.g:3129:2: ( rule__Rule__ConditionsAssignment_4_2_1 )
            // InternalSemAdapt.g:3129:3: rule__Rule__ConditionsAssignment_4_2_1
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
    // InternalSemAdapt.g:3138:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3142:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalSemAdapt.g:3143:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
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
    // InternalSemAdapt.g:3150:1: rule__Rule__Group_5__0__Impl : ( 'resolve' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3154:1: ( ( 'resolve' ) )
            // InternalSemAdapt.g:3155:1: ( 'resolve' )
            {
            // InternalSemAdapt.g:3155:1: ( 'resolve' )
            // InternalSemAdapt.g:3156:2: 'resolve'
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
    // InternalSemAdapt.g:3165:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3169:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalSemAdapt.g:3170:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
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
    // InternalSemAdapt.g:3177:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__PremisesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3181:1: ( ( ( rule__Rule__PremisesAssignment_5_1 ) ) )
            // InternalSemAdapt.g:3182:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            {
            // InternalSemAdapt.g:3182:1: ( ( rule__Rule__PremisesAssignment_5_1 ) )
            // InternalSemAdapt.g:3183:2: ( rule__Rule__PremisesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_1()); 
            }
            // InternalSemAdapt.g:3184:2: ( rule__Rule__PremisesAssignment_5_1 )
            // InternalSemAdapt.g:3184:3: rule__Rule__PremisesAssignment_5_1
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
    // InternalSemAdapt.g:3192:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3196:1: ( rule__Rule__Group_5__2__Impl )
            // InternalSemAdapt.g:3197:2: rule__Rule__Group_5__2__Impl
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
    // InternalSemAdapt.g:3203:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Group_5_2__0 )* ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3207:1: ( ( ( rule__Rule__Group_5_2__0 )* ) )
            // InternalSemAdapt.g:3208:1: ( ( rule__Rule__Group_5_2__0 )* )
            {
            // InternalSemAdapt.g:3208:1: ( ( rule__Rule__Group_5_2__0 )* )
            // InternalSemAdapt.g:3209:2: ( rule__Rule__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_5_2()); 
            }
            // InternalSemAdapt.g:3210:2: ( rule__Rule__Group_5_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSemAdapt.g:3210:3: rule__Rule__Group_5_2__0
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
    // InternalSemAdapt.g:3219:1: rule__Rule__Group_5_2__0 : rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 ;
    public final void rule__Rule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3223:1: ( rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 )
            // InternalSemAdapt.g:3224:2: rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1
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
    // InternalSemAdapt.g:3231:1: rule__Rule__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3235:1: ( ( ';' ) )
            // InternalSemAdapt.g:3236:1: ( ';' )
            {
            // InternalSemAdapt.g:3236:1: ( ';' )
            // InternalSemAdapt.g:3237:2: ';'
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
    // InternalSemAdapt.g:3246:1: rule__Rule__Group_5_2__1 : rule__Rule__Group_5_2__1__Impl ;
    public final void rule__Rule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3250:1: ( rule__Rule__Group_5_2__1__Impl )
            // InternalSemAdapt.g:3251:2: rule__Rule__Group_5_2__1__Impl
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
    // InternalSemAdapt.g:3257:1: rule__Rule__Group_5_2__1__Impl : ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) ;
    public final void rule__Rule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3261:1: ( ( ( rule__Rule__PremisesAssignment_5_2_1 ) ) )
            // InternalSemAdapt.g:3262:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            {
            // InternalSemAdapt.g:3262:1: ( ( rule__Rule__PremisesAssignment_5_2_1 ) )
            // InternalSemAdapt.g:3263:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getPremisesAssignment_5_2_1()); 
            }
            // InternalSemAdapt.g:3264:2: ( rule__Rule__PremisesAssignment_5_2_1 )
            // InternalSemAdapt.g:3264:3: rule__Rule__PremisesAssignment_5_2_1
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
    // InternalSemAdapt.g:3273:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3277:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalSemAdapt.g:3278:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
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
    // InternalSemAdapt.g:3285:1: rule__Rule__Group_6__0__Impl : ( 'bind' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3289:1: ( ( 'bind' ) )
            // InternalSemAdapt.g:3290:1: ( 'bind' )
            {
            // InternalSemAdapt.g:3290:1: ( 'bind' )
            // InternalSemAdapt.g:3291:2: 'bind'
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
    // InternalSemAdapt.g:3300:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3304:1: ( rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 )
            // InternalSemAdapt.g:3305:2: rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2
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
    // InternalSemAdapt.g:3312:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__BindingsAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3316:1: ( ( ( rule__Rule__BindingsAssignment_6_1 ) ) )
            // InternalSemAdapt.g:3317:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            {
            // InternalSemAdapt.g:3317:1: ( ( rule__Rule__BindingsAssignment_6_1 ) )
            // InternalSemAdapt.g:3318:2: ( rule__Rule__BindingsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_1()); 
            }
            // InternalSemAdapt.g:3319:2: ( rule__Rule__BindingsAssignment_6_1 )
            // InternalSemAdapt.g:3319:3: rule__Rule__BindingsAssignment_6_1
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
    // InternalSemAdapt.g:3327:1: rule__Rule__Group_6__2 : rule__Rule__Group_6__2__Impl ;
    public final void rule__Rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3331:1: ( rule__Rule__Group_6__2__Impl )
            // InternalSemAdapt.g:3332:2: rule__Rule__Group_6__2__Impl
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
    // InternalSemAdapt.g:3338:1: rule__Rule__Group_6__2__Impl : ( ( rule__Rule__Group_6_2__0 )* ) ;
    public final void rule__Rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3342:1: ( ( ( rule__Rule__Group_6_2__0 )* ) )
            // InternalSemAdapt.g:3343:1: ( ( rule__Rule__Group_6_2__0 )* )
            {
            // InternalSemAdapt.g:3343:1: ( ( rule__Rule__Group_6_2__0 )* )
            // InternalSemAdapt.g:3344:2: ( rule__Rule__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_6_2()); 
            }
            // InternalSemAdapt.g:3345:2: ( rule__Rule__Group_6_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSemAdapt.g:3345:3: rule__Rule__Group_6_2__0
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
    // InternalSemAdapt.g:3354:1: rule__Rule__Group_6_2__0 : rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 ;
    public final void rule__Rule__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3358:1: ( rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1 )
            // InternalSemAdapt.g:3359:2: rule__Rule__Group_6_2__0__Impl rule__Rule__Group_6_2__1
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
    // InternalSemAdapt.g:3366:1: rule__Rule__Group_6_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3370:1: ( ( ';' ) )
            // InternalSemAdapt.g:3371:1: ( ';' )
            {
            // InternalSemAdapt.g:3371:1: ( ';' )
            // InternalSemAdapt.g:3372:2: ';'
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
    // InternalSemAdapt.g:3381:1: rule__Rule__Group_6_2__1 : rule__Rule__Group_6_2__1__Impl ;
    public final void rule__Rule__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3385:1: ( rule__Rule__Group_6_2__1__Impl )
            // InternalSemAdapt.g:3386:2: rule__Rule__Group_6_2__1__Impl
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
    // InternalSemAdapt.g:3392:1: rule__Rule__Group_6_2__1__Impl : ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) ;
    public final void rule__Rule__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3396:1: ( ( ( rule__Rule__BindingsAssignment_6_2_1 ) ) )
            // InternalSemAdapt.g:3397:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            {
            // InternalSemAdapt.g:3397:1: ( ( rule__Rule__BindingsAssignment_6_2_1 ) )
            // InternalSemAdapt.g:3398:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getBindingsAssignment_6_2_1()); 
            }
            // InternalSemAdapt.g:3399:2: ( rule__Rule__BindingsAssignment_6_2_1 )
            // InternalSemAdapt.g:3399:3: rule__Rule__BindingsAssignment_6_2_1
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
    // InternalSemAdapt.g:3408:1: rule__Rule__Group_7__0 : rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 ;
    public final void rule__Rule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3412:1: ( rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1 )
            // InternalSemAdapt.g:3413:2: rule__Rule__Group_7__0__Impl rule__Rule__Group_7__1
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
    // InternalSemAdapt.g:3420:1: rule__Rule__Group_7__0__Impl : ( 'IO' ) ;
    public final void rule__Rule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3424:1: ( ( 'IO' ) )
            // InternalSemAdapt.g:3425:1: ( 'IO' )
            {
            // InternalSemAdapt.g:3425:1: ( 'IO' )
            // InternalSemAdapt.g:3426:2: 'IO'
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
    // InternalSemAdapt.g:3435:1: rule__Rule__Group_7__1 : rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 ;
    public final void rule__Rule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3439:1: ( rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2 )
            // InternalSemAdapt.g:3440:2: rule__Rule__Group_7__1__Impl rule__Rule__Group_7__2
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
    // InternalSemAdapt.g:3447:1: rule__Rule__Group_7__1__Impl : ( ( rule__Rule__Alternatives_7_1 ) ) ;
    public final void rule__Rule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3451:1: ( ( ( rule__Rule__Alternatives_7_1 ) ) )
            // InternalSemAdapt.g:3452:1: ( ( rule__Rule__Alternatives_7_1 ) )
            {
            // InternalSemAdapt.g:3452:1: ( ( rule__Rule__Alternatives_7_1 ) )
            // InternalSemAdapt.g:3453:2: ( rule__Rule__Alternatives_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_1()); 
            }
            // InternalSemAdapt.g:3454:2: ( rule__Rule__Alternatives_7_1 )
            // InternalSemAdapt.g:3454:3: rule__Rule__Alternatives_7_1
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
    // InternalSemAdapt.g:3462:1: rule__Rule__Group_7__2 : rule__Rule__Group_7__2__Impl ;
    public final void rule__Rule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3466:1: ( rule__Rule__Group_7__2__Impl )
            // InternalSemAdapt.g:3467:2: rule__Rule__Group_7__2__Impl
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
    // InternalSemAdapt.g:3473:1: rule__Rule__Group_7__2__Impl : ( ( rule__Rule__Group_7_2__0 )* ) ;
    public final void rule__Rule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3477:1: ( ( ( rule__Rule__Group_7_2__0 )* ) )
            // InternalSemAdapt.g:3478:1: ( ( rule__Rule__Group_7_2__0 )* )
            {
            // InternalSemAdapt.g:3478:1: ( ( rule__Rule__Group_7_2__0 )* )
            // InternalSemAdapt.g:3479:2: ( rule__Rule__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup_7_2()); 
            }
            // InternalSemAdapt.g:3480:2: ( rule__Rule__Group_7_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSemAdapt.g:3480:3: rule__Rule__Group_7_2__0
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
    // InternalSemAdapt.g:3489:1: rule__Rule__Group_7_2__0 : rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 ;
    public final void rule__Rule__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3493:1: ( rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1 )
            // InternalSemAdapt.g:3494:2: rule__Rule__Group_7_2__0__Impl rule__Rule__Group_7_2__1
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
    // InternalSemAdapt.g:3501:1: rule__Rule__Group_7_2__0__Impl : ( ';' ) ;
    public final void rule__Rule__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3505:1: ( ( ';' ) )
            // InternalSemAdapt.g:3506:1: ( ';' )
            {
            // InternalSemAdapt.g:3506:1: ( ';' )
            // InternalSemAdapt.g:3507:2: ';'
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
    // InternalSemAdapt.g:3516:1: rule__Rule__Group_7_2__1 : rule__Rule__Group_7_2__1__Impl ;
    public final void rule__Rule__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3520:1: ( rule__Rule__Group_7_2__1__Impl )
            // InternalSemAdapt.g:3521:2: rule__Rule__Group_7_2__1__Impl
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
    // InternalSemAdapt.g:3527:1: rule__Rule__Group_7_2__1__Impl : ( ( rule__Rule__Alternatives_7_2_1 ) ) ;
    public final void rule__Rule__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3531:1: ( ( ( rule__Rule__Alternatives_7_2_1 ) ) )
            // InternalSemAdapt.g:3532:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            {
            // InternalSemAdapt.g:3532:1: ( ( rule__Rule__Alternatives_7_2_1 ) )
            // InternalSemAdapt.g:3533:2: ( rule__Rule__Alternatives_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_7_2_1()); 
            }
            // InternalSemAdapt.g:3534:2: ( rule__Rule__Alternatives_7_2_1 )
            // InternalSemAdapt.g:3534:3: rule__Rule__Alternatives_7_2_1
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
    // InternalSemAdapt.g:3543:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3547:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalSemAdapt.g:3548:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalSemAdapt.g:3555:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3559:1: ( ( () ) )
            // InternalSemAdapt.g:3560:1: ( () )
            {
            // InternalSemAdapt.g:3560:1: ( () )
            // InternalSemAdapt.g:3561:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            }
            // InternalSemAdapt.g:3562:2: ()
            // InternalSemAdapt.g:3562:3: 
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
    // InternalSemAdapt.g:3570:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3574:1: ( rule__Condition__Group__1__Impl )
            // InternalSemAdapt.g:3575:2: rule__Condition__Group__1__Impl
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
    // InternalSemAdapt.g:3581:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__CondAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3585:1: ( ( ( rule__Condition__CondAssignment_1 ) ) )
            // InternalSemAdapt.g:3586:1: ( ( rule__Condition__CondAssignment_1 ) )
            {
            // InternalSemAdapt.g:3586:1: ( ( rule__Condition__CondAssignment_1 ) )
            // InternalSemAdapt.g:3587:2: ( rule__Condition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getCondAssignment_1()); 
            }
            // InternalSemAdapt.g:3588:2: ( rule__Condition__CondAssignment_1 )
            // InternalSemAdapt.g:3588:3: rule__Condition__CondAssignment_1
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
    // InternalSemAdapt.g:3597:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3601:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalSemAdapt.g:3602:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalSemAdapt.g:3609:1: rule__Input__Group__0__Impl : ( ( rule__Input__AssigneeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3613:1: ( ( ( rule__Input__AssigneeAssignment_0 ) ) )
            // InternalSemAdapt.g:3614:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            {
            // InternalSemAdapt.g:3614:1: ( ( rule__Input__AssigneeAssignment_0 ) )
            // InternalSemAdapt.g:3615:2: ( rule__Input__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAssigneeAssignment_0()); 
            }
            // InternalSemAdapt.g:3616:2: ( rule__Input__AssigneeAssignment_0 )
            // InternalSemAdapt.g:3616:3: rule__Input__AssigneeAssignment_0
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
    // InternalSemAdapt.g:3624:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3628:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalSemAdapt.g:3629:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalSemAdapt.g:3636:1: rule__Input__Group__1__Impl : ( '=' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3640:1: ( ( '=' ) )
            // InternalSemAdapt.g:3641:1: ( '=' )
            {
            // InternalSemAdapt.g:3641:1: ( '=' )
            // InternalSemAdapt.g:3642:2: '='
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
    // InternalSemAdapt.g:3651:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3655:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalSemAdapt.g:3656:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalSemAdapt.g:3663:1: rule__Input__Group__2__Impl : ( ( rule__Input__OperationAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3667:1: ( ( ( rule__Input__OperationAssignment_2 ) ) )
            // InternalSemAdapt.g:3668:1: ( ( rule__Input__OperationAssignment_2 ) )
            {
            // InternalSemAdapt.g:3668:1: ( ( rule__Input__OperationAssignment_2 ) )
            // InternalSemAdapt.g:3669:2: ( rule__Input__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationAssignment_2()); 
            }
            // InternalSemAdapt.g:3670:2: ( rule__Input__OperationAssignment_2 )
            // InternalSemAdapt.g:3670:3: rule__Input__OperationAssignment_2
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
    // InternalSemAdapt.g:3678:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3682:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalSemAdapt.g:3683:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalSemAdapt.g:3690:1: rule__Input__Group__3__Impl : ( '(' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3694:1: ( ( '(' ) )
            // InternalSemAdapt.g:3695:1: ( '(' )
            {
            // InternalSemAdapt.g:3695:1: ( '(' )
            // InternalSemAdapt.g:3696:2: '('
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
    // InternalSemAdapt.g:3705:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3709:1: ( rule__Input__Group__4__Impl )
            // InternalSemAdapt.g:3710:2: rule__Input__Group__4__Impl
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
    // InternalSemAdapt.g:3716:1: rule__Input__Group__4__Impl : ( ')' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3720:1: ( ( ')' ) )
            // InternalSemAdapt.g:3721:1: ( ')' )
            {
            // InternalSemAdapt.g:3721:1: ( ')' )
            // InternalSemAdapt.g:3722:2: ')'
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
    // InternalSemAdapt.g:3732:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3736:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalSemAdapt.g:3737:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalSemAdapt.g:3744:1: rule__Output__Group__0__Impl : ( ( rule__Output__OperationAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3748:1: ( ( ( rule__Output__OperationAssignment_0 ) ) )
            // InternalSemAdapt.g:3749:1: ( ( rule__Output__OperationAssignment_0 ) )
            {
            // InternalSemAdapt.g:3749:1: ( ( rule__Output__OperationAssignment_0 ) )
            // InternalSemAdapt.g:3750:2: ( rule__Output__OperationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationAssignment_0()); 
            }
            // InternalSemAdapt.g:3751:2: ( rule__Output__OperationAssignment_0 )
            // InternalSemAdapt.g:3751:3: rule__Output__OperationAssignment_0
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
    // InternalSemAdapt.g:3759:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3763:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalSemAdapt.g:3764:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalSemAdapt.g:3771:1: rule__Output__Group__1__Impl : ( '(' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3775:1: ( ( '(' ) )
            // InternalSemAdapt.g:3776:1: ( '(' )
            {
            // InternalSemAdapt.g:3776:1: ( '(' )
            // InternalSemAdapt.g:3777:2: '('
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
    // InternalSemAdapt.g:3786:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3790:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalSemAdapt.g:3791:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalSemAdapt.g:3798:1: rule__Output__Group__2__Impl : ( ( rule__Output__Group_2__0 )? ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3802:1: ( ( ( rule__Output__Group_2__0 )? ) )
            // InternalSemAdapt.g:3803:1: ( ( rule__Output__Group_2__0 )? )
            {
            // InternalSemAdapt.g:3803:1: ( ( rule__Output__Group_2__0 )? )
            // InternalSemAdapt.g:3804:2: ( rule__Output__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2()); 
            }
            // InternalSemAdapt.g:3805:2: ( rule__Output__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==37||LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSemAdapt.g:3805:3: rule__Output__Group_2__0
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
    // InternalSemAdapt.g:3813:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3817:1: ( rule__Output__Group__3__Impl )
            // InternalSemAdapt.g:3818:2: rule__Output__Group__3__Impl
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
    // InternalSemAdapt.g:3824:1: rule__Output__Group__3__Impl : ( ')' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3828:1: ( ( ')' ) )
            // InternalSemAdapt.g:3829:1: ( ')' )
            {
            // InternalSemAdapt.g:3829:1: ( ')' )
            // InternalSemAdapt.g:3830:2: ')'
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
    // InternalSemAdapt.g:3840:1: rule__Output__Group_2__0 : rule__Output__Group_2__0__Impl rule__Output__Group_2__1 ;
    public final void rule__Output__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3844:1: ( rule__Output__Group_2__0__Impl rule__Output__Group_2__1 )
            // InternalSemAdapt.g:3845:2: rule__Output__Group_2__0__Impl rule__Output__Group_2__1
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
    // InternalSemAdapt.g:3852:1: rule__Output__Group_2__0__Impl : ( ( rule__Output__ArgsAssignment_2_0 ) ) ;
    public final void rule__Output__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3856:1: ( ( ( rule__Output__ArgsAssignment_2_0 ) ) )
            // InternalSemAdapt.g:3857:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            {
            // InternalSemAdapt.g:3857:1: ( ( rule__Output__ArgsAssignment_2_0 ) )
            // InternalSemAdapt.g:3858:2: ( rule__Output__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_0()); 
            }
            // InternalSemAdapt.g:3859:2: ( rule__Output__ArgsAssignment_2_0 )
            // InternalSemAdapt.g:3859:3: rule__Output__ArgsAssignment_2_0
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
    // InternalSemAdapt.g:3867:1: rule__Output__Group_2__1 : rule__Output__Group_2__1__Impl ;
    public final void rule__Output__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3871:1: ( rule__Output__Group_2__1__Impl )
            // InternalSemAdapt.g:3872:2: rule__Output__Group_2__1__Impl
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
    // InternalSemAdapt.g:3878:1: rule__Output__Group_2__1__Impl : ( ( rule__Output__Group_2_1__0 )* ) ;
    public final void rule__Output__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3882:1: ( ( ( rule__Output__Group_2_1__0 )* ) )
            // InternalSemAdapt.g:3883:1: ( ( rule__Output__Group_2_1__0 )* )
            {
            // InternalSemAdapt.g:3883:1: ( ( rule__Output__Group_2_1__0 )* )
            // InternalSemAdapt.g:3884:2: ( rule__Output__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_2_1()); 
            }
            // InternalSemAdapt.g:3885:2: ( rule__Output__Group_2_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSemAdapt.g:3885:3: rule__Output__Group_2_1__0
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
    // InternalSemAdapt.g:3894:1: rule__Output__Group_2_1__0 : rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 ;
    public final void rule__Output__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3898:1: ( rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1 )
            // InternalSemAdapt.g:3899:2: rule__Output__Group_2_1__0__Impl rule__Output__Group_2_1__1
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
    // InternalSemAdapt.g:3906:1: rule__Output__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3910:1: ( ( ',' ) )
            // InternalSemAdapt.g:3911:1: ( ',' )
            {
            // InternalSemAdapt.g:3911:1: ( ',' )
            // InternalSemAdapt.g:3912:2: ','
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
    // InternalSemAdapt.g:3921:1: rule__Output__Group_2_1__1 : rule__Output__Group_2_1__1__Impl ;
    public final void rule__Output__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3925:1: ( rule__Output__Group_2_1__1__Impl )
            // InternalSemAdapt.g:3926:2: rule__Output__Group_2_1__1__Impl
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
    // InternalSemAdapt.g:3932:1: rule__Output__Group_2_1__1__Impl : ( ( rule__Output__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Output__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3936:1: ( ( ( rule__Output__ArgsAssignment_2_1_1 ) ) )
            // InternalSemAdapt.g:3937:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            {
            // InternalSemAdapt.g:3937:1: ( ( rule__Output__ArgsAssignment_2_1_1 ) )
            // InternalSemAdapt.g:3938:2: ( rule__Output__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getArgsAssignment_2_1_1()); 
            }
            // InternalSemAdapt.g:3939:2: ( rule__Output__ArgsAssignment_2_1_1 )
            // InternalSemAdapt.g:3939:3: rule__Output__ArgsAssignment_2_1_1
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
    // InternalSemAdapt.g:3948:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3952:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalSemAdapt.g:3953:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalSemAdapt.g:3960:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__AssigneeAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3964:1: ( ( ( rule__Binding__AssigneeAssignment_0 ) ) )
            // InternalSemAdapt.g:3965:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            {
            // InternalSemAdapt.g:3965:1: ( ( rule__Binding__AssigneeAssignment_0 ) )
            // InternalSemAdapt.g:3966:2: ( rule__Binding__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getAssigneeAssignment_0()); 
            }
            // InternalSemAdapt.g:3967:2: ( rule__Binding__AssigneeAssignment_0 )
            // InternalSemAdapt.g:3967:3: rule__Binding__AssigneeAssignment_0
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
    // InternalSemAdapt.g:3975:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3979:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalSemAdapt.g:3980:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
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
    // InternalSemAdapt.g:3987:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:3991:1: ( ( '=' ) )
            // InternalSemAdapt.g:3992:1: ( '=' )
            {
            // InternalSemAdapt.g:3992:1: ( '=' )
            // InternalSemAdapt.g:3993:2: '='
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
    // InternalSemAdapt.g:4002:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4006:1: ( rule__Binding__Group__2__Impl )
            // InternalSemAdapt.g:4007:2: rule__Binding__Group__2__Impl
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
    // InternalSemAdapt.g:4013:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ExprAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4017:1: ( ( ( rule__Binding__ExprAssignment_2 ) ) )
            // InternalSemAdapt.g:4018:1: ( ( rule__Binding__ExprAssignment_2 ) )
            {
            // InternalSemAdapt.g:4018:1: ( ( rule__Binding__ExprAssignment_2 ) )
            // InternalSemAdapt.g:4019:2: ( rule__Binding__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExprAssignment_2()); 
            }
            // InternalSemAdapt.g:4020:2: ( rule__Binding__ExprAssignment_2 )
            // InternalSemAdapt.g:4020:3: rule__Binding__ExprAssignment_2
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
    // InternalSemAdapt.g:4029:1: rule__SemanticDomainAccess__Group__0 : rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 ;
    public final void rule__SemanticDomainAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4033:1: ( rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1 )
            // InternalSemAdapt.g:4034:2: rule__SemanticDomainAccess__Group__0__Impl rule__SemanticDomainAccess__Group__1
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
    // InternalSemAdapt.g:4041:1: rule__SemanticDomainAccess__Group__0__Impl : ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) ;
    public final void rule__SemanticDomainAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4045:1: ( ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) ) )
            // InternalSemAdapt.g:4046:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            {
            // InternalSemAdapt.g:4046:1: ( ( rule__SemanticDomainAccess__RecieverAssignment_0 ) )
            // InternalSemAdapt.g:4047:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getRecieverAssignment_0()); 
            }
            // InternalSemAdapt.g:4048:2: ( rule__SemanticDomainAccess__RecieverAssignment_0 )
            // InternalSemAdapt.g:4048:3: rule__SemanticDomainAccess__RecieverAssignment_0
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
    // InternalSemAdapt.g:4056:1: rule__SemanticDomainAccess__Group__1 : rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 ;
    public final void rule__SemanticDomainAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4060:1: ( rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2 )
            // InternalSemAdapt.g:4061:2: rule__SemanticDomainAccess__Group__1__Impl rule__SemanticDomainAccess__Group__2
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
    // InternalSemAdapt.g:4068:1: rule__SemanticDomainAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4072:1: ( ( '.' ) )
            // InternalSemAdapt.g:4073:1: ( '.' )
            {
            // InternalSemAdapt.g:4073:1: ( '.' )
            // InternalSemAdapt.g:4074:2: '.'
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
    // InternalSemAdapt.g:4083:1: rule__SemanticDomainAccess__Group__2 : rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 ;
    public final void rule__SemanticDomainAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4087:1: ( rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3 )
            // InternalSemAdapt.g:4088:2: rule__SemanticDomainAccess__Group__2__Impl rule__SemanticDomainAccess__Group__3
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
    // InternalSemAdapt.g:4095:1: rule__SemanticDomainAccess__Group__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4099:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) ) )
            // InternalSemAdapt.g:4100:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            {
            // InternalSemAdapt.g:4100:1: ( ( rule__SemanticDomainAccess__FieldAssignment_2 ) )
            // InternalSemAdapt.g:4101:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_2()); 
            }
            // InternalSemAdapt.g:4102:2: ( rule__SemanticDomainAccess__FieldAssignment_2 )
            // InternalSemAdapt.g:4102:3: rule__SemanticDomainAccess__FieldAssignment_2
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
    // InternalSemAdapt.g:4110:1: rule__SemanticDomainAccess__Group__3 : rule__SemanticDomainAccess__Group__3__Impl ;
    public final void rule__SemanticDomainAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4114:1: ( rule__SemanticDomainAccess__Group__3__Impl )
            // InternalSemAdapt.g:4115:2: rule__SemanticDomainAccess__Group__3__Impl
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
    // InternalSemAdapt.g:4121:1: rule__SemanticDomainAccess__Group__3__Impl : ( ( rule__SemanticDomainAccess__Group_3__0 )* ) ;
    public final void rule__SemanticDomainAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4125:1: ( ( ( rule__SemanticDomainAccess__Group_3__0 )* ) )
            // InternalSemAdapt.g:4126:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            {
            // InternalSemAdapt.g:4126:1: ( ( rule__SemanticDomainAccess__Group_3__0 )* )
            // InternalSemAdapt.g:4127:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getGroup_3()); 
            }
            // InternalSemAdapt.g:4128:2: ( rule__SemanticDomainAccess__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==34) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSemAdapt.g:4128:3: rule__SemanticDomainAccess__Group_3__0
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
    // InternalSemAdapt.g:4137:1: rule__SemanticDomainAccess__Group_3__0 : rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 ;
    public final void rule__SemanticDomainAccess__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4141:1: ( rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1 )
            // InternalSemAdapt.g:4142:2: rule__SemanticDomainAccess__Group_3__0__Impl rule__SemanticDomainAccess__Group_3__1
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
    // InternalSemAdapt.g:4149:1: rule__SemanticDomainAccess__Group_3__0__Impl : ( () ) ;
    public final void rule__SemanticDomainAccess__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4153:1: ( ( () ) )
            // InternalSemAdapt.g:4154:1: ( () )
            {
            // InternalSemAdapt.g:4154:1: ( () )
            // InternalSemAdapt.g:4155:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0()); 
            }
            // InternalSemAdapt.g:4156:2: ()
            // InternalSemAdapt.g:4156:3: 
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
    // InternalSemAdapt.g:4164:1: rule__SemanticDomainAccess__Group_3__1 : rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 ;
    public final void rule__SemanticDomainAccess__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4168:1: ( rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2 )
            // InternalSemAdapt.g:4169:2: rule__SemanticDomainAccess__Group_3__1__Impl rule__SemanticDomainAccess__Group_3__2
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
    // InternalSemAdapt.g:4176:1: rule__SemanticDomainAccess__Group_3__1__Impl : ( '.' ) ;
    public final void rule__SemanticDomainAccess__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4180:1: ( ( '.' ) )
            // InternalSemAdapt.g:4181:1: ( '.' )
            {
            // InternalSemAdapt.g:4181:1: ( '.' )
            // InternalSemAdapt.g:4182:2: '.'
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
    // InternalSemAdapt.g:4191:1: rule__SemanticDomainAccess__Group_3__2 : rule__SemanticDomainAccess__Group_3__2__Impl ;
    public final void rule__SemanticDomainAccess__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4195:1: ( rule__SemanticDomainAccess__Group_3__2__Impl )
            // InternalSemAdapt.g:4196:2: rule__SemanticDomainAccess__Group_3__2__Impl
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
    // InternalSemAdapt.g:4202:1: rule__SemanticDomainAccess__Group_3__2__Impl : ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) ;
    public final void rule__SemanticDomainAccess__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4206:1: ( ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) ) )
            // InternalSemAdapt.g:4207:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            {
            // InternalSemAdapt.g:4207:1: ( ( rule__SemanticDomainAccess__FieldAssignment_3_2 ) )
            // InternalSemAdapt.g:4208:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSemanticDomainAccessAccess().getFieldAssignment_3_2()); 
            }
            // InternalSemAdapt.g:4209:2: ( rule__SemanticDomainAccess__FieldAssignment_3_2 )
            // InternalSemAdapt.g:4209:3: rule__SemanticDomainAccess__FieldAssignment_3_2
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
    // InternalSemAdapt.g:4218:1: rule__Self__Group__0 : rule__Self__Group__0__Impl rule__Self__Group__1 ;
    public final void rule__Self__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4222:1: ( rule__Self__Group__0__Impl rule__Self__Group__1 )
            // InternalSemAdapt.g:4223:2: rule__Self__Group__0__Impl rule__Self__Group__1
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
    // InternalSemAdapt.g:4230:1: rule__Self__Group__0__Impl : ( () ) ;
    public final void rule__Self__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4234:1: ( ( () ) )
            // InternalSemAdapt.g:4235:1: ( () )
            {
            // InternalSemAdapt.g:4235:1: ( () )
            // InternalSemAdapt.g:4236:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfAction_0()); 
            }
            // InternalSemAdapt.g:4237:2: ()
            // InternalSemAdapt.g:4237:3: 
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
    // InternalSemAdapt.g:4245:1: rule__Self__Group__1 : rule__Self__Group__1__Impl ;
    public final void rule__Self__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4249:1: ( rule__Self__Group__1__Impl )
            // InternalSemAdapt.g:4250:2: rule__Self__Group__1__Impl
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
    // InternalSemAdapt.g:4256:1: rule__Self__Group__1__Impl : ( 'self' ) ;
    public final void rule__Self__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4260:1: ( ( 'self' ) )
            // InternalSemAdapt.g:4261:1: ( 'self' )
            {
            // InternalSemAdapt.g:4261:1: ( 'self' )
            // InternalSemAdapt.g:4262:2: 'self'
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
    // InternalSemAdapt.g:4272:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4276:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalSemAdapt.g:4277:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
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
    // InternalSemAdapt.g:4284:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__FromAssignment_0 ) ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4288:1: ( ( ( rule__Conclusion__FromAssignment_0 ) ) )
            // InternalSemAdapt.g:4289:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            {
            // InternalSemAdapt.g:4289:1: ( ( rule__Conclusion__FromAssignment_0 ) )
            // InternalSemAdapt.g:4290:2: ( rule__Conclusion__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getFromAssignment_0()); 
            }
            // InternalSemAdapt.g:4291:2: ( rule__Conclusion__FromAssignment_0 )
            // InternalSemAdapt.g:4291:3: rule__Conclusion__FromAssignment_0
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
    // InternalSemAdapt.g:4299:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4303:1: ( rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2 )
            // InternalSemAdapt.g:4304:2: rule__Conclusion__Group__1__Impl rule__Conclusion__Group__2
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
    // InternalSemAdapt.g:4311:1: rule__Conclusion__Group__1__Impl : ( '->' ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4315:1: ( ( '->' ) )
            // InternalSemAdapt.g:4316:1: ( '->' )
            {
            // InternalSemAdapt.g:4316:1: ( '->' )
            // InternalSemAdapt.g:4317:2: '->'
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
    // InternalSemAdapt.g:4326:1: rule__Conclusion__Group__2 : rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 ;
    public final void rule__Conclusion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4330:1: ( rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3 )
            // InternalSemAdapt.g:4331:2: rule__Conclusion__Group__2__Impl rule__Conclusion__Group__3
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
    // InternalSemAdapt.g:4338:1: rule__Conclusion__Group__2__Impl : ( ( rule__Conclusion__TerminationAssignment_2 )? ) ;
    public final void rule__Conclusion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4342:1: ( ( ( rule__Conclusion__TerminationAssignment_2 )? ) )
            // InternalSemAdapt.g:4343:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            {
            // InternalSemAdapt.g:4343:1: ( ( rule__Conclusion__TerminationAssignment_2 )? )
            // InternalSemAdapt.g:4344:2: ( rule__Conclusion__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationAssignment_2()); 
            }
            // InternalSemAdapt.g:4345:2: ( rule__Conclusion__TerminationAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSemAdapt.g:4345:3: rule__Conclusion__TerminationAssignment_2
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
    // InternalSemAdapt.g:4353:1: rule__Conclusion__Group__3 : rule__Conclusion__Group__3__Impl ;
    public final void rule__Conclusion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4357:1: ( rule__Conclusion__Group__3__Impl )
            // InternalSemAdapt.g:4358:2: rule__Conclusion__Group__3__Impl
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
    // InternalSemAdapt.g:4364:1: rule__Conclusion__Group__3__Impl : ( ( rule__Conclusion__ToAssignment_3 ) ) ;
    public final void rule__Conclusion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4368:1: ( ( ( rule__Conclusion__ToAssignment_3 ) ) )
            // InternalSemAdapt.g:4369:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            {
            // InternalSemAdapt.g:4369:1: ( ( rule__Conclusion__ToAssignment_3 ) )
            // InternalSemAdapt.g:4370:2: ( rule__Conclusion__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getToAssignment_3()); 
            }
            // InternalSemAdapt.g:4371:2: ( rule__Conclusion__ToAssignment_3 )
            // InternalSemAdapt.g:4371:3: rule__Conclusion__ToAssignment_3
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
    // InternalSemAdapt.g:4380:1: rule__Premise__Group__0 : rule__Premise__Group__0__Impl rule__Premise__Group__1 ;
    public final void rule__Premise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4384:1: ( rule__Premise__Group__0__Impl rule__Premise__Group__1 )
            // InternalSemAdapt.g:4385:2: rule__Premise__Group__0__Impl rule__Premise__Group__1
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
    // InternalSemAdapt.g:4392:1: rule__Premise__Group__0__Impl : ( ( rule__Premise__FromAssignment_0 ) ) ;
    public final void rule__Premise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4396:1: ( ( ( rule__Premise__FromAssignment_0 ) ) )
            // InternalSemAdapt.g:4397:1: ( ( rule__Premise__FromAssignment_0 ) )
            {
            // InternalSemAdapt.g:4397:1: ( ( rule__Premise__FromAssignment_0 ) )
            // InternalSemAdapt.g:4398:2: ( rule__Premise__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getFromAssignment_0()); 
            }
            // InternalSemAdapt.g:4399:2: ( rule__Premise__FromAssignment_0 )
            // InternalSemAdapt.g:4399:3: rule__Premise__FromAssignment_0
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
    // InternalSemAdapt.g:4407:1: rule__Premise__Group__1 : rule__Premise__Group__1__Impl rule__Premise__Group__2 ;
    public final void rule__Premise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4411:1: ( rule__Premise__Group__1__Impl rule__Premise__Group__2 )
            // InternalSemAdapt.g:4412:2: rule__Premise__Group__1__Impl rule__Premise__Group__2
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
    // InternalSemAdapt.g:4419:1: rule__Premise__Group__1__Impl : ( '->' ) ;
    public final void rule__Premise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4423:1: ( ( '->' ) )
            // InternalSemAdapt.g:4424:1: ( '->' )
            {
            // InternalSemAdapt.g:4424:1: ( '->' )
            // InternalSemAdapt.g:4425:2: '->'
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
    // InternalSemAdapt.g:4434:1: rule__Premise__Group__2 : rule__Premise__Group__2__Impl rule__Premise__Group__3 ;
    public final void rule__Premise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4438:1: ( rule__Premise__Group__2__Impl rule__Premise__Group__3 )
            // InternalSemAdapt.g:4439:2: rule__Premise__Group__2__Impl rule__Premise__Group__3
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
    // InternalSemAdapt.g:4446:1: rule__Premise__Group__2__Impl : ( ( rule__Premise__TerminationAssignment_2 )? ) ;
    public final void rule__Premise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4450:1: ( ( ( rule__Premise__TerminationAssignment_2 )? ) )
            // InternalSemAdapt.g:4451:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            {
            // InternalSemAdapt.g:4451:1: ( ( rule__Premise__TerminationAssignment_2 )? )
            // InternalSemAdapt.g:4452:2: ( rule__Premise__TerminationAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationAssignment_2()); 
            }
            // InternalSemAdapt.g:4453:2: ( rule__Premise__TerminationAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSemAdapt.g:4453:3: rule__Premise__TerminationAssignment_2
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
    // InternalSemAdapt.g:4461:1: rule__Premise__Group__3 : rule__Premise__Group__3__Impl ;
    public final void rule__Premise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4465:1: ( rule__Premise__Group__3__Impl )
            // InternalSemAdapt.g:4466:2: rule__Premise__Group__3__Impl
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
    // InternalSemAdapt.g:4472:1: rule__Premise__Group__3__Impl : ( ( rule__Premise__ToAssignment_3 ) ) ;
    public final void rule__Premise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4476:1: ( ( ( rule__Premise__ToAssignment_3 ) ) )
            // InternalSemAdapt.g:4477:1: ( ( rule__Premise__ToAssignment_3 ) )
            {
            // InternalSemAdapt.g:4477:1: ( ( rule__Premise__ToAssignment_3 ) )
            // InternalSemAdapt.g:4478:2: ( rule__Premise__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getToAssignment_3()); 
            }
            // InternalSemAdapt.g:4479:2: ( rule__Premise__ToAssignment_3 )
            // InternalSemAdapt.g:4479:3: rule__Premise__ToAssignment_3
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
    // InternalSemAdapt.g:4488:1: rule__DefConfiguration__Group__0 : rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 ;
    public final void rule__DefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4492:1: ( rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1 )
            // InternalSemAdapt.g:4493:2: rule__DefConfiguration__Group__0__Impl rule__DefConfiguration__Group__1
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
    // InternalSemAdapt.g:4500:1: rule__DefConfiguration__Group__0__Impl : ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__DefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4504:1: ( ( ( rule__DefConfiguration__ConceptAssignment_0 ) ) )
            // InternalSemAdapt.g:4505:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalSemAdapt.g:4505:1: ( ( rule__DefConfiguration__ConceptAssignment_0 ) )
            // InternalSemAdapt.g:4506:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalSemAdapt.g:4507:2: ( rule__DefConfiguration__ConceptAssignment_0 )
            // InternalSemAdapt.g:4507:3: rule__DefConfiguration__ConceptAssignment_0
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
    // InternalSemAdapt.g:4515:1: rule__DefConfiguration__Group__1 : rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 ;
    public final void rule__DefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4519:1: ( rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2 )
            // InternalSemAdapt.g:4520:2: rule__DefConfiguration__Group__1__Impl rule__DefConfiguration__Group__2
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
    // InternalSemAdapt.g:4527:1: rule__DefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__DefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4531:1: ( ( '(' ) )
            // InternalSemAdapt.g:4532:1: ( '(' )
            {
            // InternalSemAdapt.g:4532:1: ( '(' )
            // InternalSemAdapt.g:4533:2: '('
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
    // InternalSemAdapt.g:4542:1: rule__DefConfiguration__Group__2 : rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 ;
    public final void rule__DefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4546:1: ( rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3 )
            // InternalSemAdapt.g:4547:2: rule__DefConfiguration__Group__2__Impl rule__DefConfiguration__Group__3
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
    // InternalSemAdapt.g:4554:1: rule__DefConfiguration__Group__2__Impl : ( ( rule__DefConfiguration__Group_2__0 )? ) ;
    public final void rule__DefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4558:1: ( ( ( rule__DefConfiguration__Group_2__0 )? ) )
            // InternalSemAdapt.g:4559:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            {
            // InternalSemAdapt.g:4559:1: ( ( rule__DefConfiguration__Group_2__0 )? )
            // InternalSemAdapt.g:4560:2: ( rule__DefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2()); 
            }
            // InternalSemAdapt.g:4561:2: ( rule__DefConfiguration__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==37||LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSemAdapt.g:4561:3: rule__DefConfiguration__Group_2__0
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
    // InternalSemAdapt.g:4569:1: rule__DefConfiguration__Group__3 : rule__DefConfiguration__Group__3__Impl ;
    public final void rule__DefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4573:1: ( rule__DefConfiguration__Group__3__Impl )
            // InternalSemAdapt.g:4574:2: rule__DefConfiguration__Group__3__Impl
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
    // InternalSemAdapt.g:4580:1: rule__DefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__DefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4584:1: ( ( ')' ) )
            // InternalSemAdapt.g:4585:1: ( ')' )
            {
            // InternalSemAdapt.g:4585:1: ( ')' )
            // InternalSemAdapt.g:4586:2: ')'
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
    // InternalSemAdapt.g:4596:1: rule__DefConfiguration__Group_2__0 : rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 ;
    public final void rule__DefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4600:1: ( rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1 )
            // InternalSemAdapt.g:4601:2: rule__DefConfiguration__Group_2__0__Impl rule__DefConfiguration__Group_2__1
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
    // InternalSemAdapt.g:4608:1: rule__DefConfiguration__Group_2__0__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__DefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4612:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalSemAdapt.g:4613:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalSemAdapt.g:4613:1: ( ( rule__DefConfiguration__ChildsAssignment_2_0 ) )
            // InternalSemAdapt.g:4614:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalSemAdapt.g:4615:2: ( rule__DefConfiguration__ChildsAssignment_2_0 )
            // InternalSemAdapt.g:4615:3: rule__DefConfiguration__ChildsAssignment_2_0
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
    // InternalSemAdapt.g:4623:1: rule__DefConfiguration__Group_2__1 : rule__DefConfiguration__Group_2__1__Impl ;
    public final void rule__DefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4627:1: ( rule__DefConfiguration__Group_2__1__Impl )
            // InternalSemAdapt.g:4628:2: rule__DefConfiguration__Group_2__1__Impl
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
    // InternalSemAdapt.g:4634:1: rule__DefConfiguration__Group_2__1__Impl : ( ( rule__DefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__DefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4638:1: ( ( ( rule__DefConfiguration__Group_2_1__0 )* ) )
            // InternalSemAdapt.g:4639:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            {
            // InternalSemAdapt.g:4639:1: ( ( rule__DefConfiguration__Group_2_1__0 )* )
            // InternalSemAdapt.g:4640:2: ( rule__DefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalSemAdapt.g:4641:2: ( rule__DefConfiguration__Group_2_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSemAdapt.g:4641:3: rule__DefConfiguration__Group_2_1__0
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
    // InternalSemAdapt.g:4650:1: rule__DefConfiguration__Group_2_1__0 : rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 ;
    public final void rule__DefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4654:1: ( rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1 )
            // InternalSemAdapt.g:4655:2: rule__DefConfiguration__Group_2_1__0__Impl rule__DefConfiguration__Group_2_1__1
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
    // InternalSemAdapt.g:4662:1: rule__DefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4666:1: ( ( ',' ) )
            // InternalSemAdapt.g:4667:1: ( ',' )
            {
            // InternalSemAdapt.g:4667:1: ( ',' )
            // InternalSemAdapt.g:4668:2: ','
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
    // InternalSemAdapt.g:4677:1: rule__DefConfiguration__Group_2_1__1 : rule__DefConfiguration__Group_2_1__1__Impl ;
    public final void rule__DefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4681:1: ( rule__DefConfiguration__Group_2_1__1__Impl )
            // InternalSemAdapt.g:4682:2: rule__DefConfiguration__Group_2_1__1__Impl
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
    // InternalSemAdapt.g:4688:1: rule__DefConfiguration__Group_2_1__1__Impl : ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__DefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4692:1: ( ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalSemAdapt.g:4693:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalSemAdapt.g:4693:1: ( ( rule__DefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalSemAdapt.g:4694:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalSemAdapt.g:4695:2: ( rule__DefConfiguration__ChildsAssignment_2_1_1 )
            // InternalSemAdapt.g:4695:3: rule__DefConfiguration__ChildsAssignment_2_1_1
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
    // InternalSemAdapt.g:4704:1: rule__RefConfiguration__Group__0 : rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 ;
    public final void rule__RefConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4708:1: ( rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1 )
            // InternalSemAdapt.g:4709:2: rule__RefConfiguration__Group__0__Impl rule__RefConfiguration__Group__1
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
    // InternalSemAdapt.g:4716:1: rule__RefConfiguration__Group__0__Impl : ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) ;
    public final void rule__RefConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4720:1: ( ( ( rule__RefConfiguration__ConceptAssignment_0 ) ) )
            // InternalSemAdapt.g:4721:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            {
            // InternalSemAdapt.g:4721:1: ( ( rule__RefConfiguration__ConceptAssignment_0 ) )
            // InternalSemAdapt.g:4722:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptAssignment_0()); 
            }
            // InternalSemAdapt.g:4723:2: ( rule__RefConfiguration__ConceptAssignment_0 )
            // InternalSemAdapt.g:4723:3: rule__RefConfiguration__ConceptAssignment_0
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
    // InternalSemAdapt.g:4731:1: rule__RefConfiguration__Group__1 : rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 ;
    public final void rule__RefConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4735:1: ( rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2 )
            // InternalSemAdapt.g:4736:2: rule__RefConfiguration__Group__1__Impl rule__RefConfiguration__Group__2
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
    // InternalSemAdapt.g:4743:1: rule__RefConfiguration__Group__1__Impl : ( '(' ) ;
    public final void rule__RefConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4747:1: ( ( '(' ) )
            // InternalSemAdapt.g:4748:1: ( '(' )
            {
            // InternalSemAdapt.g:4748:1: ( '(' )
            // InternalSemAdapt.g:4749:2: '('
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
    // InternalSemAdapt.g:4758:1: rule__RefConfiguration__Group__2 : rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 ;
    public final void rule__RefConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4762:1: ( rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3 )
            // InternalSemAdapt.g:4763:2: rule__RefConfiguration__Group__2__Impl rule__RefConfiguration__Group__3
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
    // InternalSemAdapt.g:4770:1: rule__RefConfiguration__Group__2__Impl : ( ( rule__RefConfiguration__Group_2__0 )? ) ;
    public final void rule__RefConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4774:1: ( ( ( rule__RefConfiguration__Group_2__0 )? ) )
            // InternalSemAdapt.g:4775:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            {
            // InternalSemAdapt.g:4775:1: ( ( rule__RefConfiguration__Group_2__0 )? )
            // InternalSemAdapt.g:4776:2: ( rule__RefConfiguration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2()); 
            }
            // InternalSemAdapt.g:4777:2: ( rule__RefConfiguration__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==37||LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSemAdapt.g:4777:3: rule__RefConfiguration__Group_2__0
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
    // InternalSemAdapt.g:4785:1: rule__RefConfiguration__Group__3 : rule__RefConfiguration__Group__3__Impl ;
    public final void rule__RefConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4789:1: ( rule__RefConfiguration__Group__3__Impl )
            // InternalSemAdapt.g:4790:2: rule__RefConfiguration__Group__3__Impl
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
    // InternalSemAdapt.g:4796:1: rule__RefConfiguration__Group__3__Impl : ( ')' ) ;
    public final void rule__RefConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4800:1: ( ( ')' ) )
            // InternalSemAdapt.g:4801:1: ( ')' )
            {
            // InternalSemAdapt.g:4801:1: ( ')' )
            // InternalSemAdapt.g:4802:2: ')'
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
    // InternalSemAdapt.g:4812:1: rule__RefConfiguration__Group_2__0 : rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 ;
    public final void rule__RefConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4816:1: ( rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1 )
            // InternalSemAdapt.g:4817:2: rule__RefConfiguration__Group_2__0__Impl rule__RefConfiguration__Group_2__1
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
    // InternalSemAdapt.g:4824:1: rule__RefConfiguration__Group_2__0__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) ;
    public final void rule__RefConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4828:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) ) )
            // InternalSemAdapt.g:4829:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            {
            // InternalSemAdapt.g:4829:1: ( ( rule__RefConfiguration__ChildsAssignment_2_0 ) )
            // InternalSemAdapt.g:4830:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_0()); 
            }
            // InternalSemAdapt.g:4831:2: ( rule__RefConfiguration__ChildsAssignment_2_0 )
            // InternalSemAdapt.g:4831:3: rule__RefConfiguration__ChildsAssignment_2_0
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
    // InternalSemAdapt.g:4839:1: rule__RefConfiguration__Group_2__1 : rule__RefConfiguration__Group_2__1__Impl ;
    public final void rule__RefConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4843:1: ( rule__RefConfiguration__Group_2__1__Impl )
            // InternalSemAdapt.g:4844:2: rule__RefConfiguration__Group_2__1__Impl
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
    // InternalSemAdapt.g:4850:1: rule__RefConfiguration__Group_2__1__Impl : ( ( rule__RefConfiguration__Group_2_1__0 )* ) ;
    public final void rule__RefConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4854:1: ( ( ( rule__RefConfiguration__Group_2_1__0 )* ) )
            // InternalSemAdapt.g:4855:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            {
            // InternalSemAdapt.g:4855:1: ( ( rule__RefConfiguration__Group_2_1__0 )* )
            // InternalSemAdapt.g:4856:2: ( rule__RefConfiguration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getGroup_2_1()); 
            }
            // InternalSemAdapt.g:4857:2: ( rule__RefConfiguration__Group_2_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSemAdapt.g:4857:3: rule__RefConfiguration__Group_2_1__0
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
    // InternalSemAdapt.g:4866:1: rule__RefConfiguration__Group_2_1__0 : rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 ;
    public final void rule__RefConfiguration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4870:1: ( rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1 )
            // InternalSemAdapt.g:4871:2: rule__RefConfiguration__Group_2_1__0__Impl rule__RefConfiguration__Group_2_1__1
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
    // InternalSemAdapt.g:4878:1: rule__RefConfiguration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__RefConfiguration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4882:1: ( ( ',' ) )
            // InternalSemAdapt.g:4883:1: ( ',' )
            {
            // InternalSemAdapt.g:4883:1: ( ',' )
            // InternalSemAdapt.g:4884:2: ','
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
    // InternalSemAdapt.g:4893:1: rule__RefConfiguration__Group_2_1__1 : rule__RefConfiguration__Group_2_1__1__Impl ;
    public final void rule__RefConfiguration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4897:1: ( rule__RefConfiguration__Group_2_1__1__Impl )
            // InternalSemAdapt.g:4898:2: rule__RefConfiguration__Group_2_1__1__Impl
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
    // InternalSemAdapt.g:4904:1: rule__RefConfiguration__Group_2_1__1__Impl : ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) ;
    public final void rule__RefConfiguration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4908:1: ( ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) ) )
            // InternalSemAdapt.g:4909:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            {
            // InternalSemAdapt.g:4909:1: ( ( rule__RefConfiguration__ChildsAssignment_2_1_1 ) )
            // InternalSemAdapt.g:4910:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getChildsAssignment_2_1_1()); 
            }
            // InternalSemAdapt.g:4911:2: ( rule__RefConfiguration__ChildsAssignment_2_1_1 )
            // InternalSemAdapt.g:4911:3: rule__RefConfiguration__ChildsAssignment_2_1_1
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
    // InternalSemAdapt.g:4920:1: rule__SymbolDef__Group__0 : rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 ;
    public final void rule__SymbolDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4924:1: ( rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1 )
            // InternalSemAdapt.g:4925:2: rule__SymbolDef__Group__0__Impl rule__SymbolDef__Group__1
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
    // InternalSemAdapt.g:4932:1: rule__SymbolDef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4936:1: ( ( () ) )
            // InternalSemAdapt.g:4937:1: ( () )
            {
            // InternalSemAdapt.g:4937:1: ( () )
            // InternalSemAdapt.g:4938:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getSymbolDefAction_0()); 
            }
            // InternalSemAdapt.g:4939:2: ()
            // InternalSemAdapt.g:4939:3: 
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
    // InternalSemAdapt.g:4947:1: rule__SymbolDef__Group__1 : rule__SymbolDef__Group__1__Impl ;
    public final void rule__SymbolDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4951:1: ( rule__SymbolDef__Group__1__Impl )
            // InternalSemAdapt.g:4952:2: rule__SymbolDef__Group__1__Impl
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
    // InternalSemAdapt.g:4958:1: rule__SymbolDef__Group__1__Impl : ( ( rule__SymbolDef__NameAssignment_1 ) ) ;
    public final void rule__SymbolDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4962:1: ( ( ( rule__SymbolDef__NameAssignment_1 ) ) )
            // InternalSemAdapt.g:4963:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            {
            // InternalSemAdapt.g:4963:1: ( ( rule__SymbolDef__NameAssignment_1 ) )
            // InternalSemAdapt.g:4964:2: ( rule__SymbolDef__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolDefAccess().getNameAssignment_1()); 
            }
            // InternalSemAdapt.g:4965:2: ( rule__SymbolDef__NameAssignment_1 )
            // InternalSemAdapt.g:4965:3: rule__SymbolDef__NameAssignment_1
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
    // InternalSemAdapt.g:4974:1: rule__SymbolRef__Group__0 : rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 ;
    public final void rule__SymbolRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4978:1: ( rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1 )
            // InternalSemAdapt.g:4979:2: rule__SymbolRef__Group__0__Impl rule__SymbolRef__Group__1
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
    // InternalSemAdapt.g:4986:1: rule__SymbolRef__Group__0__Impl : ( () ) ;
    public final void rule__SymbolRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:4990:1: ( ( () ) )
            // InternalSemAdapt.g:4991:1: ( () )
            {
            // InternalSemAdapt.g:4991:1: ( () )
            // InternalSemAdapt.g:4992:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getSymbolRefAction_0()); 
            }
            // InternalSemAdapt.g:4993:2: ()
            // InternalSemAdapt.g:4993:3: 
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
    // InternalSemAdapt.g:5001:1: rule__SymbolRef__Group__1 : rule__SymbolRef__Group__1__Impl ;
    public final void rule__SymbolRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5005:1: ( rule__SymbolRef__Group__1__Impl )
            // InternalSemAdapt.g:5006:2: rule__SymbolRef__Group__1__Impl
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
    // InternalSemAdapt.g:5012:1: rule__SymbolRef__Group__1__Impl : ( ( rule__SymbolRef__DefAssignment_1 ) ) ;
    public final void rule__SymbolRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5016:1: ( ( ( rule__SymbolRef__DefAssignment_1 ) ) )
            // InternalSemAdapt.g:5017:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            {
            // InternalSemAdapt.g:5017:1: ( ( rule__SymbolRef__DefAssignment_1 ) )
            // InternalSemAdapt.g:5018:2: ( rule__SymbolRef__DefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefAssignment_1()); 
            }
            // InternalSemAdapt.g:5019:2: ( rule__SymbolRef__DefAssignment_1 )
            // InternalSemAdapt.g:5019:3: rule__SymbolRef__DefAssignment_1
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
    // InternalSemAdapt.g:5028:1: rule__ListDef__Group__0 : rule__ListDef__Group__0__Impl rule__ListDef__Group__1 ;
    public final void rule__ListDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5032:1: ( rule__ListDef__Group__0__Impl rule__ListDef__Group__1 )
            // InternalSemAdapt.g:5033:2: rule__ListDef__Group__0__Impl rule__ListDef__Group__1
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
    // InternalSemAdapt.g:5040:1: rule__ListDef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5044:1: ( ( '[' ) )
            // InternalSemAdapt.g:5045:1: ( '[' )
            {
            // InternalSemAdapt.g:5045:1: ( '[' )
            // InternalSemAdapt.g:5046:2: '['
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
    // InternalSemAdapt.g:5055:1: rule__ListDef__Group__1 : rule__ListDef__Group__1__Impl rule__ListDef__Group__2 ;
    public final void rule__ListDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5059:1: ( rule__ListDef__Group__1__Impl rule__ListDef__Group__2 )
            // InternalSemAdapt.g:5060:2: rule__ListDef__Group__1__Impl rule__ListDef__Group__2
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
    // InternalSemAdapt.g:5067:1: rule__ListDef__Group__1__Impl : ( ( rule__ListDef__HeadAssignment_1 ) ) ;
    public final void rule__ListDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5071:1: ( ( ( rule__ListDef__HeadAssignment_1 ) ) )
            // InternalSemAdapt.g:5072:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            {
            // InternalSemAdapt.g:5072:1: ( ( rule__ListDef__HeadAssignment_1 ) )
            // InternalSemAdapt.g:5073:2: ( rule__ListDef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getHeadAssignment_1()); 
            }
            // InternalSemAdapt.g:5074:2: ( rule__ListDef__HeadAssignment_1 )
            // InternalSemAdapt.g:5074:3: rule__ListDef__HeadAssignment_1
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
    // InternalSemAdapt.g:5082:1: rule__ListDef__Group__2 : rule__ListDef__Group__2__Impl rule__ListDef__Group__3 ;
    public final void rule__ListDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5086:1: ( rule__ListDef__Group__2__Impl rule__ListDef__Group__3 )
            // InternalSemAdapt.g:5087:2: rule__ListDef__Group__2__Impl rule__ListDef__Group__3
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
    // InternalSemAdapt.g:5094:1: rule__ListDef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5098:1: ( ( '|' ) )
            // InternalSemAdapt.g:5099:1: ( '|' )
            {
            // InternalSemAdapt.g:5099:1: ( '|' )
            // InternalSemAdapt.g:5100:2: '|'
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
    // InternalSemAdapt.g:5109:1: rule__ListDef__Group__3 : rule__ListDef__Group__3__Impl rule__ListDef__Group__4 ;
    public final void rule__ListDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5113:1: ( rule__ListDef__Group__3__Impl rule__ListDef__Group__4 )
            // InternalSemAdapt.g:5114:2: rule__ListDef__Group__3__Impl rule__ListDef__Group__4
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
    // InternalSemAdapt.g:5121:1: rule__ListDef__Group__3__Impl : ( ( rule__ListDef__TailAssignment_3 ) ) ;
    public final void rule__ListDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5125:1: ( ( ( rule__ListDef__TailAssignment_3 ) ) )
            // InternalSemAdapt.g:5126:1: ( ( rule__ListDef__TailAssignment_3 ) )
            {
            // InternalSemAdapt.g:5126:1: ( ( rule__ListDef__TailAssignment_3 ) )
            // InternalSemAdapt.g:5127:2: ( rule__ListDef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListDefAccess().getTailAssignment_3()); 
            }
            // InternalSemAdapt.g:5128:2: ( rule__ListDef__TailAssignment_3 )
            // InternalSemAdapt.g:5128:3: rule__ListDef__TailAssignment_3
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
    // InternalSemAdapt.g:5136:1: rule__ListDef__Group__4 : rule__ListDef__Group__4__Impl ;
    public final void rule__ListDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5140:1: ( rule__ListDef__Group__4__Impl )
            // InternalSemAdapt.g:5141:2: rule__ListDef__Group__4__Impl
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
    // InternalSemAdapt.g:5147:1: rule__ListDef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5151:1: ( ( ']' ) )
            // InternalSemAdapt.g:5152:1: ( ']' )
            {
            // InternalSemAdapt.g:5152:1: ( ']' )
            // InternalSemAdapt.g:5153:2: ']'
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
    // InternalSemAdapt.g:5163:1: rule__ListRef__Group__0 : rule__ListRef__Group__0__Impl rule__ListRef__Group__1 ;
    public final void rule__ListRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5167:1: ( rule__ListRef__Group__0__Impl rule__ListRef__Group__1 )
            // InternalSemAdapt.g:5168:2: rule__ListRef__Group__0__Impl rule__ListRef__Group__1
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
    // InternalSemAdapt.g:5175:1: rule__ListRef__Group__0__Impl : ( '[' ) ;
    public final void rule__ListRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5179:1: ( ( '[' ) )
            // InternalSemAdapt.g:5180:1: ( '[' )
            {
            // InternalSemAdapt.g:5180:1: ( '[' )
            // InternalSemAdapt.g:5181:2: '['
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
    // InternalSemAdapt.g:5190:1: rule__ListRef__Group__1 : rule__ListRef__Group__1__Impl rule__ListRef__Group__2 ;
    public final void rule__ListRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5194:1: ( rule__ListRef__Group__1__Impl rule__ListRef__Group__2 )
            // InternalSemAdapt.g:5195:2: rule__ListRef__Group__1__Impl rule__ListRef__Group__2
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
    // InternalSemAdapt.g:5202:1: rule__ListRef__Group__1__Impl : ( ( rule__ListRef__HeadAssignment_1 ) ) ;
    public final void rule__ListRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5206:1: ( ( ( rule__ListRef__HeadAssignment_1 ) ) )
            // InternalSemAdapt.g:5207:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            {
            // InternalSemAdapt.g:5207:1: ( ( rule__ListRef__HeadAssignment_1 ) )
            // InternalSemAdapt.g:5208:2: ( rule__ListRef__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getHeadAssignment_1()); 
            }
            // InternalSemAdapt.g:5209:2: ( rule__ListRef__HeadAssignment_1 )
            // InternalSemAdapt.g:5209:3: rule__ListRef__HeadAssignment_1
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
    // InternalSemAdapt.g:5217:1: rule__ListRef__Group__2 : rule__ListRef__Group__2__Impl rule__ListRef__Group__3 ;
    public final void rule__ListRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5221:1: ( rule__ListRef__Group__2__Impl rule__ListRef__Group__3 )
            // InternalSemAdapt.g:5222:2: rule__ListRef__Group__2__Impl rule__ListRef__Group__3
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
    // InternalSemAdapt.g:5229:1: rule__ListRef__Group__2__Impl : ( '|' ) ;
    public final void rule__ListRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5233:1: ( ( '|' ) )
            // InternalSemAdapt.g:5234:1: ( '|' )
            {
            // InternalSemAdapt.g:5234:1: ( '|' )
            // InternalSemAdapt.g:5235:2: '|'
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
    // InternalSemAdapt.g:5244:1: rule__ListRef__Group__3 : rule__ListRef__Group__3__Impl rule__ListRef__Group__4 ;
    public final void rule__ListRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5248:1: ( rule__ListRef__Group__3__Impl rule__ListRef__Group__4 )
            // InternalSemAdapt.g:5249:2: rule__ListRef__Group__3__Impl rule__ListRef__Group__4
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
    // InternalSemAdapt.g:5256:1: rule__ListRef__Group__3__Impl : ( ( rule__ListRef__TailAssignment_3 ) ) ;
    public final void rule__ListRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5260:1: ( ( ( rule__ListRef__TailAssignment_3 ) ) )
            // InternalSemAdapt.g:5261:1: ( ( rule__ListRef__TailAssignment_3 ) )
            {
            // InternalSemAdapt.g:5261:1: ( ( rule__ListRef__TailAssignment_3 ) )
            // InternalSemAdapt.g:5262:2: ( rule__ListRef__TailAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRefAccess().getTailAssignment_3()); 
            }
            // InternalSemAdapt.g:5263:2: ( rule__ListRef__TailAssignment_3 )
            // InternalSemAdapt.g:5263:3: rule__ListRef__TailAssignment_3
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
    // InternalSemAdapt.g:5271:1: rule__ListRef__Group__4 : rule__ListRef__Group__4__Impl ;
    public final void rule__ListRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5275:1: ( rule__ListRef__Group__4__Impl )
            // InternalSemAdapt.g:5276:2: rule__ListRef__Group__4__Impl
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
    // InternalSemAdapt.g:5282:1: rule__ListRef__Group__4__Impl : ( ']' ) ;
    public final void rule__ListRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5286:1: ( ( ']' ) )
            // InternalSemAdapt.g:5287:1: ( ']' )
            {
            // InternalSemAdapt.g:5287:1: ( ']' )
            // InternalSemAdapt.g:5288:2: ']'
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
    // InternalSemAdapt.g:5298:1: rule__VoidList__Group__0 : rule__VoidList__Group__0__Impl rule__VoidList__Group__1 ;
    public final void rule__VoidList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5302:1: ( rule__VoidList__Group__0__Impl rule__VoidList__Group__1 )
            // InternalSemAdapt.g:5303:2: rule__VoidList__Group__0__Impl rule__VoidList__Group__1
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
    // InternalSemAdapt.g:5310:1: rule__VoidList__Group__0__Impl : ( () ) ;
    public final void rule__VoidList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5314:1: ( ( () ) )
            // InternalSemAdapt.g:5315:1: ( () )
            {
            // InternalSemAdapt.g:5315:1: ( () )
            // InternalSemAdapt.g:5316:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoidListAccess().getVoidListAction_0()); 
            }
            // InternalSemAdapt.g:5317:2: ()
            // InternalSemAdapt.g:5317:3: 
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
    // InternalSemAdapt.g:5325:1: rule__VoidList__Group__1 : rule__VoidList__Group__1__Impl ;
    public final void rule__VoidList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5329:1: ( rule__VoidList__Group__1__Impl )
            // InternalSemAdapt.g:5330:2: rule__VoidList__Group__1__Impl
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
    // InternalSemAdapt.g:5336:1: rule__VoidList__Group__1__Impl : ( '[]' ) ;
    public final void rule__VoidList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5340:1: ( ( '[]' ) )
            // InternalSemAdapt.g:5341:1: ( '[]' )
            {
            // InternalSemAdapt.g:5341:1: ( '[]' )
            // InternalSemAdapt.g:5342:2: '[]'
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
    // InternalSemAdapt.g:5352:1: rule__CondNot__Group__0 : rule__CondNot__Group__0__Impl rule__CondNot__Group__1 ;
    public final void rule__CondNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5356:1: ( rule__CondNot__Group__0__Impl rule__CondNot__Group__1 )
            // InternalSemAdapt.g:5357:2: rule__CondNot__Group__0__Impl rule__CondNot__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSemAdapt.g:5364:1: rule__CondNot__Group__0__Impl : ( () ) ;
    public final void rule__CondNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5368:1: ( ( () ) )
            // InternalSemAdapt.g:5369:1: ( () )
            {
            // InternalSemAdapt.g:5369:1: ( () )
            // InternalSemAdapt.g:5370:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getNotAction_0()); 
            }
            // InternalSemAdapt.g:5371:2: ()
            // InternalSemAdapt.g:5371:3: 
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
    // InternalSemAdapt.g:5379:1: rule__CondNot__Group__1 : rule__CondNot__Group__1__Impl rule__CondNot__Group__2 ;
    public final void rule__CondNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5383:1: ( rule__CondNot__Group__1__Impl rule__CondNot__Group__2 )
            // InternalSemAdapt.g:5384:2: rule__CondNot__Group__1__Impl rule__CondNot__Group__2
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
    // InternalSemAdapt.g:5391:1: rule__CondNot__Group__1__Impl : ( '!' ) ;
    public final void rule__CondNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5395:1: ( ( '!' ) )
            // InternalSemAdapt.g:5396:1: ( '!' )
            {
            // InternalSemAdapt.g:5396:1: ( '!' )
            // InternalSemAdapt.g:5397:2: '!'
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
    // InternalSemAdapt.g:5406:1: rule__CondNot__Group__2 : rule__CondNot__Group__2__Impl ;
    public final void rule__CondNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5410:1: ( rule__CondNot__Group__2__Impl )
            // InternalSemAdapt.g:5411:2: rule__CondNot__Group__2__Impl
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
    // InternalSemAdapt.g:5417:1: rule__CondNot__Group__2__Impl : ( ( rule__CondNot__ExprAssignment_2 ) ) ;
    public final void rule__CondNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5421:1: ( ( ( rule__CondNot__ExprAssignment_2 ) ) )
            // InternalSemAdapt.g:5422:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            {
            // InternalSemAdapt.g:5422:1: ( ( rule__CondNot__ExprAssignment_2 ) )
            // InternalSemAdapt.g:5423:2: ( rule__CondNot__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondNotAccess().getExprAssignment_2()); 
            }
            // InternalSemAdapt.g:5424:2: ( rule__CondNot__ExprAssignment_2 )
            // InternalSemAdapt.g:5424:3: rule__CondNot__ExprAssignment_2
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
    // InternalSemAdapt.g:5433:1: rule__CondOr__Group__0 : rule__CondOr__Group__0__Impl rule__CondOr__Group__1 ;
    public final void rule__CondOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5437:1: ( rule__CondOr__Group__0__Impl rule__CondOr__Group__1 )
            // InternalSemAdapt.g:5438:2: rule__CondOr__Group__0__Impl rule__CondOr__Group__1
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
    // InternalSemAdapt.g:5445:1: rule__CondOr__Group__0__Impl : ( () ) ;
    public final void rule__CondOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5449:1: ( ( () ) )
            // InternalSemAdapt.g:5450:1: ( () )
            {
            // InternalSemAdapt.g:5450:1: ( () )
            // InternalSemAdapt.g:5451:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getOrAction_0()); 
            }
            // InternalSemAdapt.g:5452:2: ()
            // InternalSemAdapt.g:5452:3: 
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
    // InternalSemAdapt.g:5460:1: rule__CondOr__Group__1 : rule__CondOr__Group__1__Impl rule__CondOr__Group__2 ;
    public final void rule__CondOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5464:1: ( rule__CondOr__Group__1__Impl rule__CondOr__Group__2 )
            // InternalSemAdapt.g:5465:2: rule__CondOr__Group__1__Impl rule__CondOr__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSemAdapt.g:5472:1: rule__CondOr__Group__1__Impl : ( ( rule__CondOr__LhsAssignment_1 ) ) ;
    public final void rule__CondOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5476:1: ( ( ( rule__CondOr__LhsAssignment_1 ) ) )
            // InternalSemAdapt.g:5477:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            {
            // InternalSemAdapt.g:5477:1: ( ( rule__CondOr__LhsAssignment_1 ) )
            // InternalSemAdapt.g:5478:2: ( rule__CondOr__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getLhsAssignment_1()); 
            }
            // InternalSemAdapt.g:5479:2: ( rule__CondOr__LhsAssignment_1 )
            // InternalSemAdapt.g:5479:3: rule__CondOr__LhsAssignment_1
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
    // InternalSemAdapt.g:5487:1: rule__CondOr__Group__2 : rule__CondOr__Group__2__Impl rule__CondOr__Group__3 ;
    public final void rule__CondOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5491:1: ( rule__CondOr__Group__2__Impl rule__CondOr__Group__3 )
            // InternalSemAdapt.g:5492:2: rule__CondOr__Group__2__Impl rule__CondOr__Group__3
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
    // InternalSemAdapt.g:5499:1: rule__CondOr__Group__2__Impl : ( '||' ) ;
    public final void rule__CondOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5503:1: ( ( '||' ) )
            // InternalSemAdapt.g:5504:1: ( '||' )
            {
            // InternalSemAdapt.g:5504:1: ( '||' )
            // InternalSemAdapt.g:5505:2: '||'
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
    // InternalSemAdapt.g:5514:1: rule__CondOr__Group__3 : rule__CondOr__Group__3__Impl ;
    public final void rule__CondOr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5518:1: ( rule__CondOr__Group__3__Impl )
            // InternalSemAdapt.g:5519:2: rule__CondOr__Group__3__Impl
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
    // InternalSemAdapt.g:5525:1: rule__CondOr__Group__3__Impl : ( ( rule__CondOr__RhsAssignment_3 ) ) ;
    public final void rule__CondOr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5529:1: ( ( ( rule__CondOr__RhsAssignment_3 ) ) )
            // InternalSemAdapt.g:5530:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            {
            // InternalSemAdapt.g:5530:1: ( ( rule__CondOr__RhsAssignment_3 ) )
            // InternalSemAdapt.g:5531:2: ( rule__CondOr__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondOrAccess().getRhsAssignment_3()); 
            }
            // InternalSemAdapt.g:5532:2: ( rule__CondOr__RhsAssignment_3 )
            // InternalSemAdapt.g:5532:3: rule__CondOr__RhsAssignment_3
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
    // InternalSemAdapt.g:5541:1: rule__CondAnd__Group__0 : rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 ;
    public final void rule__CondAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5545:1: ( rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1 )
            // InternalSemAdapt.g:5546:2: rule__CondAnd__Group__0__Impl rule__CondAnd__Group__1
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
    // InternalSemAdapt.g:5553:1: rule__CondAnd__Group__0__Impl : ( () ) ;
    public final void rule__CondAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5557:1: ( ( () ) )
            // InternalSemAdapt.g:5558:1: ( () )
            {
            // InternalSemAdapt.g:5558:1: ( () )
            // InternalSemAdapt.g:5559:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getAndAction_0()); 
            }
            // InternalSemAdapt.g:5560:2: ()
            // InternalSemAdapt.g:5560:3: 
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
    // InternalSemAdapt.g:5568:1: rule__CondAnd__Group__1 : rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 ;
    public final void rule__CondAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5572:1: ( rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2 )
            // InternalSemAdapt.g:5573:2: rule__CondAnd__Group__1__Impl rule__CondAnd__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalSemAdapt.g:5580:1: rule__CondAnd__Group__1__Impl : ( ( rule__CondAnd__LhsAssignment_1 ) ) ;
    public final void rule__CondAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5584:1: ( ( ( rule__CondAnd__LhsAssignment_1 ) ) )
            // InternalSemAdapt.g:5585:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            {
            // InternalSemAdapt.g:5585:1: ( ( rule__CondAnd__LhsAssignment_1 ) )
            // InternalSemAdapt.g:5586:2: ( rule__CondAnd__LhsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getLhsAssignment_1()); 
            }
            // InternalSemAdapt.g:5587:2: ( rule__CondAnd__LhsAssignment_1 )
            // InternalSemAdapt.g:5587:3: rule__CondAnd__LhsAssignment_1
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
    // InternalSemAdapt.g:5595:1: rule__CondAnd__Group__2 : rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 ;
    public final void rule__CondAnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5599:1: ( rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3 )
            // InternalSemAdapt.g:5600:2: rule__CondAnd__Group__2__Impl rule__CondAnd__Group__3
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
    // InternalSemAdapt.g:5607:1: rule__CondAnd__Group__2__Impl : ( '&&' ) ;
    public final void rule__CondAnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5611:1: ( ( '&&' ) )
            // InternalSemAdapt.g:5612:1: ( '&&' )
            {
            // InternalSemAdapt.g:5612:1: ( '&&' )
            // InternalSemAdapt.g:5613:2: '&&'
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
    // InternalSemAdapt.g:5622:1: rule__CondAnd__Group__3 : rule__CondAnd__Group__3__Impl ;
    public final void rule__CondAnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5626:1: ( rule__CondAnd__Group__3__Impl )
            // InternalSemAdapt.g:5627:2: rule__CondAnd__Group__3__Impl
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
    // InternalSemAdapt.g:5633:1: rule__CondAnd__Group__3__Impl : ( ( rule__CondAnd__RhsAssignment_3 ) ) ;
    public final void rule__CondAnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5637:1: ( ( ( rule__CondAnd__RhsAssignment_3 ) ) )
            // InternalSemAdapt.g:5638:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            {
            // InternalSemAdapt.g:5638:1: ( ( rule__CondAnd__RhsAssignment_3 ) )
            // InternalSemAdapt.g:5639:2: ( rule__CondAnd__RhsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondAndAccess().getRhsAssignment_3()); 
            }
            // InternalSemAdapt.g:5640:2: ( rule__CondAnd__RhsAssignment_3 )
            // InternalSemAdapt.g:5640:3: rule__CondAnd__RhsAssignment_3
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
    // InternalSemAdapt.g:5649:1: rule__CondEquality__Group_0__0 : rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 ;
    public final void rule__CondEquality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5653:1: ( rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1 )
            // InternalSemAdapt.g:5654:2: rule__CondEquality__Group_0__0__Impl rule__CondEquality__Group_0__1
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
    // InternalSemAdapt.g:5661:1: rule__CondEquality__Group_0__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5665:1: ( ( () ) )
            // InternalSemAdapt.g:5666:1: ( () )
            {
            // InternalSemAdapt.g:5666:1: ( () )
            // InternalSemAdapt.g:5667:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getEqualAction_0_0()); 
            }
            // InternalSemAdapt.g:5668:2: ()
            // InternalSemAdapt.g:5668:3: 
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
    // InternalSemAdapt.g:5676:1: rule__CondEquality__Group_0__1 : rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 ;
    public final void rule__CondEquality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5680:1: ( rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2 )
            // InternalSemAdapt.g:5681:2: rule__CondEquality__Group_0__1__Impl rule__CondEquality__Group_0__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSemAdapt.g:5688:1: rule__CondEquality__Group_0__1__Impl : ( ( rule__CondEquality__LhsAssignment_0_1 ) ) ;
    public final void rule__CondEquality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5692:1: ( ( ( rule__CondEquality__LhsAssignment_0_1 ) ) )
            // InternalSemAdapt.g:5693:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            {
            // InternalSemAdapt.g:5693:1: ( ( rule__CondEquality__LhsAssignment_0_1 ) )
            // InternalSemAdapt.g:5694:2: ( rule__CondEquality__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_0_1()); 
            }
            // InternalSemAdapt.g:5695:2: ( rule__CondEquality__LhsAssignment_0_1 )
            // InternalSemAdapt.g:5695:3: rule__CondEquality__LhsAssignment_0_1
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
    // InternalSemAdapt.g:5703:1: rule__CondEquality__Group_0__2 : rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 ;
    public final void rule__CondEquality__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5707:1: ( rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3 )
            // InternalSemAdapt.g:5708:2: rule__CondEquality__Group_0__2__Impl rule__CondEquality__Group_0__3
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
    // InternalSemAdapt.g:5715:1: rule__CondEquality__Group_0__2__Impl : ( '==' ) ;
    public final void rule__CondEquality__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5719:1: ( ( '==' ) )
            // InternalSemAdapt.g:5720:1: ( '==' )
            {
            // InternalSemAdapt.g:5720:1: ( '==' )
            // InternalSemAdapt.g:5721:2: '=='
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
    // InternalSemAdapt.g:5730:1: rule__CondEquality__Group_0__3 : rule__CondEquality__Group_0__3__Impl ;
    public final void rule__CondEquality__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5734:1: ( rule__CondEquality__Group_0__3__Impl )
            // InternalSemAdapt.g:5735:2: rule__CondEquality__Group_0__3__Impl
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
    // InternalSemAdapt.g:5741:1: rule__CondEquality__Group_0__3__Impl : ( ( rule__CondEquality__RhsAssignment_0_3 ) ) ;
    public final void rule__CondEquality__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5745:1: ( ( ( rule__CondEquality__RhsAssignment_0_3 ) ) )
            // InternalSemAdapt.g:5746:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            {
            // InternalSemAdapt.g:5746:1: ( ( rule__CondEquality__RhsAssignment_0_3 ) )
            // InternalSemAdapt.g:5747:2: ( rule__CondEquality__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_0_3()); 
            }
            // InternalSemAdapt.g:5748:2: ( rule__CondEquality__RhsAssignment_0_3 )
            // InternalSemAdapt.g:5748:3: rule__CondEquality__RhsAssignment_0_3
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
    // InternalSemAdapt.g:5757:1: rule__CondEquality__Group_1__0 : rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 ;
    public final void rule__CondEquality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5761:1: ( rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1 )
            // InternalSemAdapt.g:5762:2: rule__CondEquality__Group_1__0__Impl rule__CondEquality__Group_1__1
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
    // InternalSemAdapt.g:5769:1: rule__CondEquality__Group_1__0__Impl : ( () ) ;
    public final void rule__CondEquality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5773:1: ( ( () ) )
            // InternalSemAdapt.g:5774:1: ( () )
            {
            // InternalSemAdapt.g:5774:1: ( () )
            // InternalSemAdapt.g:5775:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0()); 
            }
            // InternalSemAdapt.g:5776:2: ()
            // InternalSemAdapt.g:5776:3: 
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
    // InternalSemAdapt.g:5784:1: rule__CondEquality__Group_1__1 : rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 ;
    public final void rule__CondEquality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5788:1: ( rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2 )
            // InternalSemAdapt.g:5789:2: rule__CondEquality__Group_1__1__Impl rule__CondEquality__Group_1__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSemAdapt.g:5796:1: rule__CondEquality__Group_1__1__Impl : ( ( rule__CondEquality__LhsAssignment_1_1 ) ) ;
    public final void rule__CondEquality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5800:1: ( ( ( rule__CondEquality__LhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:5801:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:5801:1: ( ( rule__CondEquality__LhsAssignment_1_1 ) )
            // InternalSemAdapt.g:5802:2: ( rule__CondEquality__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getLhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:5803:2: ( rule__CondEquality__LhsAssignment_1_1 )
            // InternalSemAdapt.g:5803:3: rule__CondEquality__LhsAssignment_1_1
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
    // InternalSemAdapt.g:5811:1: rule__CondEquality__Group_1__2 : rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 ;
    public final void rule__CondEquality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5815:1: ( rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3 )
            // InternalSemAdapt.g:5816:2: rule__CondEquality__Group_1__2__Impl rule__CondEquality__Group_1__3
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
    // InternalSemAdapt.g:5823:1: rule__CondEquality__Group_1__2__Impl : ( '!=' ) ;
    public final void rule__CondEquality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5827:1: ( ( '!=' ) )
            // InternalSemAdapt.g:5828:1: ( '!=' )
            {
            // InternalSemAdapt.g:5828:1: ( '!=' )
            // InternalSemAdapt.g:5829:2: '!='
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
    // InternalSemAdapt.g:5838:1: rule__CondEquality__Group_1__3 : rule__CondEquality__Group_1__3__Impl ;
    public final void rule__CondEquality__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5842:1: ( rule__CondEquality__Group_1__3__Impl )
            // InternalSemAdapt.g:5843:2: rule__CondEquality__Group_1__3__Impl
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
    // InternalSemAdapt.g:5849:1: rule__CondEquality__Group_1__3__Impl : ( ( rule__CondEquality__RhsAssignment_1_3 ) ) ;
    public final void rule__CondEquality__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5853:1: ( ( ( rule__CondEquality__RhsAssignment_1_3 ) ) )
            // InternalSemAdapt.g:5854:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            {
            // InternalSemAdapt.g:5854:1: ( ( rule__CondEquality__RhsAssignment_1_3 ) )
            // InternalSemAdapt.g:5855:2: ( rule__CondEquality__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondEqualityAccess().getRhsAssignment_1_3()); 
            }
            // InternalSemAdapt.g:5856:2: ( rule__CondEquality__RhsAssignment_1_3 )
            // InternalSemAdapt.g:5856:3: rule__CondEquality__RhsAssignment_1_3
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
    // InternalSemAdapt.g:5865:1: rule__CondComparison__Group_0__0 : rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 ;
    public final void rule__CondComparison__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5869:1: ( rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1 )
            // InternalSemAdapt.g:5870:2: rule__CondComparison__Group_0__0__Impl rule__CondComparison__Group_0__1
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
    // InternalSemAdapt.g:5877:1: rule__CondComparison__Group_0__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5881:1: ( ( () ) )
            // InternalSemAdapt.g:5882:1: ( () )
            {
            // InternalSemAdapt.g:5882:1: ( () )
            // InternalSemAdapt.g:5883:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessAction_0_0()); 
            }
            // InternalSemAdapt.g:5884:2: ()
            // InternalSemAdapt.g:5884:3: 
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
    // InternalSemAdapt.g:5892:1: rule__CondComparison__Group_0__1 : rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 ;
    public final void rule__CondComparison__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5896:1: ( rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2 )
            // InternalSemAdapt.g:5897:2: rule__CondComparison__Group_0__1__Impl rule__CondComparison__Group_0__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalSemAdapt.g:5904:1: rule__CondComparison__Group_0__1__Impl : ( ( rule__CondComparison__LhsAssignment_0_1 ) ) ;
    public final void rule__CondComparison__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5908:1: ( ( ( rule__CondComparison__LhsAssignment_0_1 ) ) )
            // InternalSemAdapt.g:5909:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            {
            // InternalSemAdapt.g:5909:1: ( ( rule__CondComparison__LhsAssignment_0_1 ) )
            // InternalSemAdapt.g:5910:2: ( rule__CondComparison__LhsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_0_1()); 
            }
            // InternalSemAdapt.g:5911:2: ( rule__CondComparison__LhsAssignment_0_1 )
            // InternalSemAdapt.g:5911:3: rule__CondComparison__LhsAssignment_0_1
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
    // InternalSemAdapt.g:5919:1: rule__CondComparison__Group_0__2 : rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 ;
    public final void rule__CondComparison__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5923:1: ( rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3 )
            // InternalSemAdapt.g:5924:2: rule__CondComparison__Group_0__2__Impl rule__CondComparison__Group_0__3
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
    // InternalSemAdapt.g:5931:1: rule__CondComparison__Group_0__2__Impl : ( '<' ) ;
    public final void rule__CondComparison__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5935:1: ( ( '<' ) )
            // InternalSemAdapt.g:5936:1: ( '<' )
            {
            // InternalSemAdapt.g:5936:1: ( '<' )
            // InternalSemAdapt.g:5937:2: '<'
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
    // InternalSemAdapt.g:5946:1: rule__CondComparison__Group_0__3 : rule__CondComparison__Group_0__3__Impl ;
    public final void rule__CondComparison__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5950:1: ( rule__CondComparison__Group_0__3__Impl )
            // InternalSemAdapt.g:5951:2: rule__CondComparison__Group_0__3__Impl
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
    // InternalSemAdapt.g:5957:1: rule__CondComparison__Group_0__3__Impl : ( ( rule__CondComparison__RhsAssignment_0_3 ) ) ;
    public final void rule__CondComparison__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5961:1: ( ( ( rule__CondComparison__RhsAssignment_0_3 ) ) )
            // InternalSemAdapt.g:5962:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            {
            // InternalSemAdapt.g:5962:1: ( ( rule__CondComparison__RhsAssignment_0_3 ) )
            // InternalSemAdapt.g:5963:2: ( rule__CondComparison__RhsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_0_3()); 
            }
            // InternalSemAdapt.g:5964:2: ( rule__CondComparison__RhsAssignment_0_3 )
            // InternalSemAdapt.g:5964:3: rule__CondComparison__RhsAssignment_0_3
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
    // InternalSemAdapt.g:5973:1: rule__CondComparison__Group_1__0 : rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 ;
    public final void rule__CondComparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5977:1: ( rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1 )
            // InternalSemAdapt.g:5978:2: rule__CondComparison__Group_1__0__Impl rule__CondComparison__Group_1__1
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
    // InternalSemAdapt.g:5985:1: rule__CondComparison__Group_1__0__Impl : ( () ) ;
    public final void rule__CondComparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:5989:1: ( ( () ) )
            // InternalSemAdapt.g:5990:1: ( () )
            {
            // InternalSemAdapt.g:5990:1: ( () )
            // InternalSemAdapt.g:5991:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLessEqAction_1_0()); 
            }
            // InternalSemAdapt.g:5992:2: ()
            // InternalSemAdapt.g:5992:3: 
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
    // InternalSemAdapt.g:6000:1: rule__CondComparison__Group_1__1 : rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 ;
    public final void rule__CondComparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6004:1: ( rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2 )
            // InternalSemAdapt.g:6005:2: rule__CondComparison__Group_1__1__Impl rule__CondComparison__Group_1__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalSemAdapt.g:6012:1: rule__CondComparison__Group_1__1__Impl : ( ( rule__CondComparison__LhsAssignment_1_1 ) ) ;
    public final void rule__CondComparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6016:1: ( ( ( rule__CondComparison__LhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6017:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6017:1: ( ( rule__CondComparison__LhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6018:2: ( rule__CondComparison__LhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getLhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6019:2: ( rule__CondComparison__LhsAssignment_1_1 )
            // InternalSemAdapt.g:6019:3: rule__CondComparison__LhsAssignment_1_1
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
    // InternalSemAdapt.g:6027:1: rule__CondComparison__Group_1__2 : rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 ;
    public final void rule__CondComparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6031:1: ( rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3 )
            // InternalSemAdapt.g:6032:2: rule__CondComparison__Group_1__2__Impl rule__CondComparison__Group_1__3
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
    // InternalSemAdapt.g:6039:1: rule__CondComparison__Group_1__2__Impl : ( '<=' ) ;
    public final void rule__CondComparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6043:1: ( ( '<=' ) )
            // InternalSemAdapt.g:6044:1: ( '<=' )
            {
            // InternalSemAdapt.g:6044:1: ( '<=' )
            // InternalSemAdapt.g:6045:2: '<='
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
    // InternalSemAdapt.g:6054:1: rule__CondComparison__Group_1__3 : rule__CondComparison__Group_1__3__Impl ;
    public final void rule__CondComparison__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6058:1: ( rule__CondComparison__Group_1__3__Impl )
            // InternalSemAdapt.g:6059:2: rule__CondComparison__Group_1__3__Impl
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
    // InternalSemAdapt.g:6065:1: rule__CondComparison__Group_1__3__Impl : ( ( rule__CondComparison__RhsAssignment_1_3 ) ) ;
    public final void rule__CondComparison__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6069:1: ( ( ( rule__CondComparison__RhsAssignment_1_3 ) ) )
            // InternalSemAdapt.g:6070:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            {
            // InternalSemAdapt.g:6070:1: ( ( rule__CondComparison__RhsAssignment_1_3 ) )
            // InternalSemAdapt.g:6071:2: ( rule__CondComparison__RhsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondComparisonAccess().getRhsAssignment_1_3()); 
            }
            // InternalSemAdapt.g:6072:2: ( rule__CondComparison__RhsAssignment_1_3 )
            // InternalSemAdapt.g:6072:3: rule__CondComparison__RhsAssignment_1_3
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
    // InternalSemAdapt.g:6081:1: rule__CondIs__Group__0 : rule__CondIs__Group__0__Impl rule__CondIs__Group__1 ;
    public final void rule__CondIs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6085:1: ( rule__CondIs__Group__0__Impl rule__CondIs__Group__1 )
            // InternalSemAdapt.g:6086:2: rule__CondIs__Group__0__Impl rule__CondIs__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6093:1: rule__CondIs__Group__0__Impl : ( () ) ;
    public final void rule__CondIs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6097:1: ( ( () ) )
            // InternalSemAdapt.g:6098:1: ( () )
            {
            // InternalSemAdapt.g:6098:1: ( () )
            // InternalSemAdapt.g:6099:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getIsAction_0()); 
            }
            // InternalSemAdapt.g:6100:2: ()
            // InternalSemAdapt.g:6100:3: 
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
    // InternalSemAdapt.g:6108:1: rule__CondIs__Group__1 : rule__CondIs__Group__1__Impl rule__CondIs__Group__2 ;
    public final void rule__CondIs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6112:1: ( rule__CondIs__Group__1__Impl rule__CondIs__Group__2 )
            // InternalSemAdapt.g:6113:2: rule__CondIs__Group__1__Impl rule__CondIs__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalSemAdapt.g:6120:1: rule__CondIs__Group__1__Impl : ( ( rule__CondIs__PatternAssignment_1 ) ) ;
    public final void rule__CondIs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6124:1: ( ( ( rule__CondIs__PatternAssignment_1 ) ) )
            // InternalSemAdapt.g:6125:1: ( ( rule__CondIs__PatternAssignment_1 ) )
            {
            // InternalSemAdapt.g:6125:1: ( ( rule__CondIs__PatternAssignment_1 ) )
            // InternalSemAdapt.g:6126:2: ( rule__CondIs__PatternAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getPatternAssignment_1()); 
            }
            // InternalSemAdapt.g:6127:2: ( rule__CondIs__PatternAssignment_1 )
            // InternalSemAdapt.g:6127:3: rule__CondIs__PatternAssignment_1
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
    // InternalSemAdapt.g:6135:1: rule__CondIs__Group__2 : rule__CondIs__Group__2__Impl rule__CondIs__Group__3 ;
    public final void rule__CondIs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6139:1: ( rule__CondIs__Group__2__Impl rule__CondIs__Group__3 )
            // InternalSemAdapt.g:6140:2: rule__CondIs__Group__2__Impl rule__CondIs__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:6147:1: rule__CondIs__Group__2__Impl : ( 'match' ) ;
    public final void rule__CondIs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6151:1: ( ( 'match' ) )
            // InternalSemAdapt.g:6152:1: ( 'match' )
            {
            // InternalSemAdapt.g:6152:1: ( 'match' )
            // InternalSemAdapt.g:6153:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getMatchKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:6162:1: rule__CondIs__Group__3 : rule__CondIs__Group__3__Impl ;
    public final void rule__CondIs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6166:1: ( rule__CondIs__Group__3__Impl )
            // InternalSemAdapt.g:6167:2: rule__CondIs__Group__3__Impl
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
    // InternalSemAdapt.g:6173:1: rule__CondIs__Group__3__Impl : ( ( rule__CondIs__ExprAssignment_3 ) ) ;
    public final void rule__CondIs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6177:1: ( ( ( rule__CondIs__ExprAssignment_3 ) ) )
            // InternalSemAdapt.g:6178:1: ( ( rule__CondIs__ExprAssignment_3 ) )
            {
            // InternalSemAdapt.g:6178:1: ( ( rule__CondIs__ExprAssignment_3 ) )
            // InternalSemAdapt.g:6179:2: ( rule__CondIs__ExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCondIsAccess().getExprAssignment_3()); 
            }
            // InternalSemAdapt.g:6180:2: ( rule__CondIs__ExprAssignment_3 )
            // InternalSemAdapt.g:6180:3: rule__CondIs__ExprAssignment_3
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
    // InternalSemAdapt.g:6189:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6193:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSemAdapt.g:6194:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSemAdapt.g:6201:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6205:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:6206:1: ( ruleAnd )
            {
            // InternalSemAdapt.g:6206:1: ( ruleAnd )
            // InternalSemAdapt.g:6207:2: ruleAnd
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
    // InternalSemAdapt.g:6216:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6220:1: ( rule__Or__Group__1__Impl )
            // InternalSemAdapt.g:6221:2: rule__Or__Group__1__Impl
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
    // InternalSemAdapt.g:6227:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6231:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSemAdapt.g:6232:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6232:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSemAdapt.g:6233:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6234:2: ( rule__Or__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==42) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSemAdapt.g:6234:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
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
    // InternalSemAdapt.g:6243:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6247:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSemAdapt.g:6248:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSemAdapt.g:6255:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6259:1: ( ( () ) )
            // InternalSemAdapt.g:6260:1: ( () )
            {
            // InternalSemAdapt.g:6260:1: ( () )
            // InternalSemAdapt.g:6261:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLhsAction_1_0()); 
            }
            // InternalSemAdapt.g:6262:2: ()
            // InternalSemAdapt.g:6262:3: 
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
    // InternalSemAdapt.g:6270:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6274:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSemAdapt.g:6275:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalSemAdapt.g:6282:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6286:1: ( ( '||' ) )
            // InternalSemAdapt.g:6287:1: ( '||' )
            {
            // InternalSemAdapt.g:6287:1: ( '||' )
            // InternalSemAdapt.g:6288:2: '||'
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
    // InternalSemAdapt.g:6297:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6301:1: ( rule__Or__Group_1__2__Impl )
            // InternalSemAdapt.g:6302:2: rule__Or__Group_1__2__Impl
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
    // InternalSemAdapt.g:6308:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RhsAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6312:1: ( ( ( rule__Or__RhsAssignment_1_2 ) ) )
            // InternalSemAdapt.g:6313:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            {
            // InternalSemAdapt.g:6313:1: ( ( rule__Or__RhsAssignment_1_2 ) )
            // InternalSemAdapt.g:6314:2: ( rule__Or__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRhsAssignment_1_2()); 
            }
            // InternalSemAdapt.g:6315:2: ( rule__Or__RhsAssignment_1_2 )
            // InternalSemAdapt.g:6315:3: rule__Or__RhsAssignment_1_2
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
    // InternalSemAdapt.g:6324:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6328:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSemAdapt.g:6329:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSemAdapt.g:6336:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6340:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:6341:1: ( ruleEquality )
            {
            // InternalSemAdapt.g:6341:1: ( ruleEquality )
            // InternalSemAdapt.g:6342:2: ruleEquality
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
    // InternalSemAdapt.g:6351:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6355:1: ( rule__And__Group__1__Impl )
            // InternalSemAdapt.g:6356:2: rule__And__Group__1__Impl
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
    // InternalSemAdapt.g:6362:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6366:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSemAdapt.g:6367:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6367:1: ( ( rule__And__Group_1__0 )* )
            // InternalSemAdapt.g:6368:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6369:2: ( rule__And__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSemAdapt.g:6369:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
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
    // InternalSemAdapt.g:6378:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6382:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSemAdapt.g:6383:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSemAdapt.g:6390:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6394:1: ( ( () ) )
            // InternalSemAdapt.g:6395:1: ( () )
            {
            // InternalSemAdapt.g:6395:1: ( () )
            // InternalSemAdapt.g:6396:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLhsAction_1_0()); 
            }
            // InternalSemAdapt.g:6397:2: ()
            // InternalSemAdapt.g:6397:3: 
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
    // InternalSemAdapt.g:6405:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6409:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSemAdapt.g:6410:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalSemAdapt.g:6417:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6421:1: ( ( '&&' ) )
            // InternalSemAdapt.g:6422:1: ( '&&' )
            {
            // InternalSemAdapt.g:6422:1: ( '&&' )
            // InternalSemAdapt.g:6423:2: '&&'
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
    // InternalSemAdapt.g:6432:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6436:1: ( rule__And__Group_1__2__Impl )
            // InternalSemAdapt.g:6437:2: rule__And__Group_1__2__Impl
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
    // InternalSemAdapt.g:6443:1: rule__And__Group_1__2__Impl : ( ( rule__And__RhsAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6447:1: ( ( ( rule__And__RhsAssignment_1_2 ) ) )
            // InternalSemAdapt.g:6448:1: ( ( rule__And__RhsAssignment_1_2 ) )
            {
            // InternalSemAdapt.g:6448:1: ( ( rule__And__RhsAssignment_1_2 ) )
            // InternalSemAdapt.g:6449:2: ( rule__And__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRhsAssignment_1_2()); 
            }
            // InternalSemAdapt.g:6450:2: ( rule__And__RhsAssignment_1_2 )
            // InternalSemAdapt.g:6450:3: rule__And__RhsAssignment_1_2
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
    // InternalSemAdapt.g:6459:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6463:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalSemAdapt.g:6464:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSemAdapt.g:6471:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6475:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:6476:1: ( ruleComparison )
            {
            // InternalSemAdapt.g:6476:1: ( ruleComparison )
            // InternalSemAdapt.g:6477:2: ruleComparison
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
    // InternalSemAdapt.g:6486:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6490:1: ( rule__Equality__Group__1__Impl )
            // InternalSemAdapt.g:6491:2: rule__Equality__Group__1__Impl
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
    // InternalSemAdapt.g:6497:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6501:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalSemAdapt.g:6502:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6502:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalSemAdapt.g:6503:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6504:2: ( rule__Equality__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=44 && LA47_0<=45)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSemAdapt.g:6504:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
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
    // InternalSemAdapt.g:6513:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6517:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalSemAdapt.g:6518:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalSemAdapt.g:6525:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6529:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:6530:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:6530:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalSemAdapt.g:6531:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:6532:2: ( rule__Equality__Alternatives_1_0 )
            // InternalSemAdapt.g:6532:3: rule__Equality__Alternatives_1_0
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
    // InternalSemAdapt.g:6540:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6544:1: ( rule__Equality__Group_1__1__Impl )
            // InternalSemAdapt.g:6545:2: rule__Equality__Group_1__1__Impl
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
    // InternalSemAdapt.g:6551:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RhsAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6555:1: ( ( ( rule__Equality__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6556:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6556:1: ( ( rule__Equality__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6557:2: ( rule__Equality__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6558:2: ( rule__Equality__RhsAssignment_1_1 )
            // InternalSemAdapt.g:6558:3: rule__Equality__RhsAssignment_1_1
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
    // InternalSemAdapt.g:6567:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6571:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalSemAdapt.g:6572:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSemAdapt.g:6579:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6583:1: ( ( () ) )
            // InternalSemAdapt.g:6584:1: ( () )
            {
            // InternalSemAdapt.g:6584:1: ( () )
            // InternalSemAdapt.g:6585:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:6586:2: ()
            // InternalSemAdapt.g:6586:3: 
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
    // InternalSemAdapt.g:6594:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6598:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:6599:2: rule__Equality__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:6605:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6609:1: ( ( '==' ) )
            // InternalSemAdapt.g:6610:1: ( '==' )
            {
            // InternalSemAdapt.g:6610:1: ( '==' )
            // InternalSemAdapt.g:6611:2: '=='
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
    // InternalSemAdapt.g:6621:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6625:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalSemAdapt.g:6626:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSemAdapt.g:6633:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6637:1: ( ( () ) )
            // InternalSemAdapt.g:6638:1: ( () )
            {
            // InternalSemAdapt.g:6638:1: ( () )
            // InternalSemAdapt.g:6639:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:6640:2: ()
            // InternalSemAdapt.g:6640:3: 
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
    // InternalSemAdapt.g:6648:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6652:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:6653:2: rule__Equality__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:6659:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6663:1: ( ( '!=' ) )
            // InternalSemAdapt.g:6664:1: ( '!=' )
            {
            // InternalSemAdapt.g:6664:1: ( '!=' )
            // InternalSemAdapt.g:6665:2: '!='
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
    // InternalSemAdapt.g:6675:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6679:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalSemAdapt.g:6680:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalSemAdapt.g:6687:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6691:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:6692:1: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:6692:1: ( rulePlusOrMinus )
            // InternalSemAdapt.g:6693:2: rulePlusOrMinus
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
    // InternalSemAdapt.g:6702:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6706:1: ( rule__Comparison__Group__1__Impl )
            // InternalSemAdapt.g:6707:2: rule__Comparison__Group__1__Impl
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
    // InternalSemAdapt.g:6713:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6717:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalSemAdapt.g:6718:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6718:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalSemAdapt.g:6719:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6720:2: ( rule__Comparison__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=46 && LA48_0<=47)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSemAdapt.g:6720:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
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
    // InternalSemAdapt.g:6729:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6733:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalSemAdapt.g:6734:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalSemAdapt.g:6741:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6745:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:6746:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:6746:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalSemAdapt.g:6747:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:6748:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalSemAdapt.g:6748:3: rule__Comparison__Alternatives_1_0
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
    // InternalSemAdapt.g:6756:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6760:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalSemAdapt.g:6761:2: rule__Comparison__Group_1__1__Impl
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
    // InternalSemAdapt.g:6767:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RhsAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6771:1: ( ( ( rule__Comparison__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6772:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6772:1: ( ( rule__Comparison__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6773:2: ( rule__Comparison__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6774:2: ( rule__Comparison__RhsAssignment_1_1 )
            // InternalSemAdapt.g:6774:3: rule__Comparison__RhsAssignment_1_1
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
    // InternalSemAdapt.g:6783:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6787:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalSemAdapt.g:6788:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSemAdapt.g:6795:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6799:1: ( ( () ) )
            // InternalSemAdapt.g:6800:1: ( () )
            {
            // InternalSemAdapt.g:6800:1: ( () )
            // InternalSemAdapt.g:6801:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:6802:2: ()
            // InternalSemAdapt.g:6802:3: 
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
    // InternalSemAdapt.g:6810:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6814:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:6815:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:6821:1: rule__Comparison__Group_1_0_0__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6825:1: ( ( '<' ) )
            // InternalSemAdapt.g:6826:1: ( '<' )
            {
            // InternalSemAdapt.g:6826:1: ( '<' )
            // InternalSemAdapt.g:6827:2: '<'
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
    // InternalSemAdapt.g:6837:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6841:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalSemAdapt.g:6842:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalSemAdapt.g:6849:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6853:1: ( ( () ) )
            // InternalSemAdapt.g:6854:1: ( () )
            {
            // InternalSemAdapt.g:6854:1: ( () )
            // InternalSemAdapt.g:6855:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:6856:2: ()
            // InternalSemAdapt.g:6856:3: 
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
    // InternalSemAdapt.g:6864:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6868:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:6869:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:6875:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6879:1: ( ( '<=' ) )
            // InternalSemAdapt.g:6880:1: ( '<=' )
            {
            // InternalSemAdapt.g:6880:1: ( '<=' )
            // InternalSemAdapt.g:6881:2: '<='
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
    // InternalSemAdapt.g:6891:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6895:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalSemAdapt.g:6896:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSemAdapt.g:6903:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6907:1: ( ( ruleMulOrDiv ) )
            // InternalSemAdapt.g:6908:1: ( ruleMulOrDiv )
            {
            // InternalSemAdapt.g:6908:1: ( ruleMulOrDiv )
            // InternalSemAdapt.g:6909:2: ruleMulOrDiv
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
    // InternalSemAdapt.g:6918:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6922:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalSemAdapt.g:6923:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalSemAdapt.g:6929:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6933:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalSemAdapt.g:6934:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalSemAdapt.g:6934:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalSemAdapt.g:6935:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:6936:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=48 && LA49_0<=49)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSemAdapt.g:6936:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
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
    // InternalSemAdapt.g:6945:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6949:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalSemAdapt.g:6950:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalSemAdapt.g:6957:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6961:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:6962:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:6962:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalSemAdapt.g:6963:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:6964:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalSemAdapt.g:6964:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalSemAdapt.g:6972:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6976:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalSemAdapt.g:6977:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalSemAdapt.g:6983:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:6987:1: ( ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:6988:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:6988:1: ( ( rule__PlusOrMinus__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:6989:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:6990:2: ( rule__PlusOrMinus__RhsAssignment_1_1 )
            // InternalSemAdapt.g:6990:3: rule__PlusOrMinus__RhsAssignment_1_1
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
    // InternalSemAdapt.g:6999:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7003:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalSemAdapt.g:7004:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalSemAdapt.g:7011:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7015:1: ( ( () ) )
            // InternalSemAdapt.g:7016:1: ( () )
            {
            // InternalSemAdapt.g:7016:1: ( () )
            // InternalSemAdapt.g:7017:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:7018:2: ()
            // InternalSemAdapt.g:7018:3: 
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
    // InternalSemAdapt.g:7026:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7030:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:7031:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:7037:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7041:1: ( ( '+' ) )
            // InternalSemAdapt.g:7042:1: ( '+' )
            {
            // InternalSemAdapt.g:7042:1: ( '+' )
            // InternalSemAdapt.g:7043:2: '+'
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
    // InternalSemAdapt.g:7053:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7057:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalSemAdapt.g:7058:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSemAdapt.g:7065:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7069:1: ( ( () ) )
            // InternalSemAdapt.g:7070:1: ( () )
            {
            // InternalSemAdapt.g:7070:1: ( () )
            // InternalSemAdapt.g:7071:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:7072:2: ()
            // InternalSemAdapt.g:7072:3: 
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
    // InternalSemAdapt.g:7080:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7084:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:7085:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:7091:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7095:1: ( ( '-' ) )
            // InternalSemAdapt.g:7096:1: ( '-' )
            {
            // InternalSemAdapt.g:7096:1: ( '-' )
            // InternalSemAdapt.g:7097:2: '-'
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
    // InternalSemAdapt.g:7107:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7111:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalSemAdapt.g:7112:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalSemAdapt.g:7119:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7123:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:7124:1: ( rulePrimary )
            {
            // InternalSemAdapt.g:7124:1: ( rulePrimary )
            // InternalSemAdapt.g:7125:2: rulePrimary
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
    // InternalSemAdapt.g:7134:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7138:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalSemAdapt.g:7139:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalSemAdapt.g:7145:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7149:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalSemAdapt.g:7150:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalSemAdapt.g:7150:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalSemAdapt.g:7151:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:7152:2: ( rule__MulOrDiv__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=50 && LA50_0<=51)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSemAdapt.g:7152:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_59);
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
    // InternalSemAdapt.g:7161:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7165:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalSemAdapt.g:7166:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalSemAdapt.g:7173:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7177:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalSemAdapt.g:7178:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalSemAdapt.g:7178:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalSemAdapt.g:7179:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalSemAdapt.g:7180:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalSemAdapt.g:7180:3: rule__MulOrDiv__Alternatives_1_0
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
    // InternalSemAdapt.g:7188:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7192:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalSemAdapt.g:7193:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalSemAdapt.g:7199:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7203:1: ( ( ( rule__MulOrDiv__RhsAssignment_1_1 ) ) )
            // InternalSemAdapt.g:7204:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:7204:1: ( ( rule__MulOrDiv__RhsAssignment_1_1 ) )
            // InternalSemAdapt.g:7205:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRhsAssignment_1_1()); 
            }
            // InternalSemAdapt.g:7206:2: ( rule__MulOrDiv__RhsAssignment_1_1 )
            // InternalSemAdapt.g:7206:3: rule__MulOrDiv__RhsAssignment_1_1
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
    // InternalSemAdapt.g:7215:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7219:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalSemAdapt.g:7220:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalSemAdapt.g:7227:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7231:1: ( ( () ) )
            // InternalSemAdapt.g:7232:1: ( () )
            {
            // InternalSemAdapt.g:7232:1: ( () )
            // InternalSemAdapt.g:7233:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()); 
            }
            // InternalSemAdapt.g:7234:2: ()
            // InternalSemAdapt.g:7234:3: 
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
    // InternalSemAdapt.g:7242:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7246:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalSemAdapt.g:7247:2: rule__MulOrDiv__Group_1_0_0__1__Impl
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
    // InternalSemAdapt.g:7253:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7257:1: ( ( '*' ) )
            // InternalSemAdapt.g:7258:1: ( '*' )
            {
            // InternalSemAdapt.g:7258:1: ( '*' )
            // InternalSemAdapt.g:7259:2: '*'
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
    // InternalSemAdapt.g:7269:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7273:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalSemAdapt.g:7274:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalSemAdapt.g:7281:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7285:1: ( ( () ) )
            // InternalSemAdapt.g:7286:1: ( () )
            {
            // InternalSemAdapt.g:7286:1: ( () )
            // InternalSemAdapt.g:7287:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()); 
            }
            // InternalSemAdapt.g:7288:2: ()
            // InternalSemAdapt.g:7288:3: 
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
    // InternalSemAdapt.g:7296:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7300:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalSemAdapt.g:7301:2: rule__MulOrDiv__Group_1_0_1__1__Impl
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
    // InternalSemAdapt.g:7307:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7311:1: ( ( '/' ) )
            // InternalSemAdapt.g:7312:1: ( '/' )
            {
            // InternalSemAdapt.g:7312:1: ( '/' )
            // InternalSemAdapt.g:7313:2: '/'
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
    // InternalSemAdapt.g:7323:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7327:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalSemAdapt.g:7328:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalSemAdapt.g:7335:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7339:1: ( ( '(' ) )
            // InternalSemAdapt.g:7340:1: ( '(' )
            {
            // InternalSemAdapt.g:7340:1: ( '(' )
            // InternalSemAdapt.g:7341:2: '('
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
    // InternalSemAdapt.g:7350:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7354:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalSemAdapt.g:7355:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalSemAdapt.g:7362:1: rule__Primary__Group_0__1__Impl : ( ruleExpr ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7366:1: ( ( ruleExpr ) )
            // InternalSemAdapt.g:7367:1: ( ruleExpr )
            {
            // InternalSemAdapt.g:7367:1: ( ruleExpr )
            // InternalSemAdapt.g:7368:2: ruleExpr
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
    // InternalSemAdapt.g:7377:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7381:1: ( rule__Primary__Group_0__2__Impl )
            // InternalSemAdapt.g:7382:2: rule__Primary__Group_0__2__Impl
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
    // InternalSemAdapt.g:7388:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7392:1: ( ( ')' ) )
            // InternalSemAdapt.g:7393:1: ( ')' )
            {
            // InternalSemAdapt.g:7393:1: ( ')' )
            // InternalSemAdapt.g:7394:2: ')'
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
    // InternalSemAdapt.g:7404:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7408:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalSemAdapt.g:7409:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSemAdapt.g:7416:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7420:1: ( ( () ) )
            // InternalSemAdapt.g:7421:1: ( () )
            {
            // InternalSemAdapt.g:7421:1: ( () )
            // InternalSemAdapt.g:7422:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalSemAdapt.g:7423:2: ()
            // InternalSemAdapt.g:7423:3: 
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
    // InternalSemAdapt.g:7431:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7435:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalSemAdapt.g:7436:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalSemAdapt.g:7443:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7447:1: ( ( '!' ) )
            // InternalSemAdapt.g:7448:1: ( '!' )
            {
            // InternalSemAdapt.g:7448:1: ( '!' )
            // InternalSemAdapt.g:7449:2: '!'
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
    // InternalSemAdapt.g:7458:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7462:1: ( rule__Primary__Group_1__2__Impl )
            // InternalSemAdapt.g:7463:2: rule__Primary__Group_1__2__Impl
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
    // InternalSemAdapt.g:7469:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExprAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7473:1: ( ( ( rule__Primary__ExprAssignment_1_2 ) ) )
            // InternalSemAdapt.g:7474:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            {
            // InternalSemAdapt.g:7474:1: ( ( rule__Primary__ExprAssignment_1_2 ) )
            // InternalSemAdapt.g:7475:2: ( rule__Primary__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_1_2()); 
            }
            // InternalSemAdapt.g:7476:2: ( rule__Primary__ExprAssignment_1_2 )
            // InternalSemAdapt.g:7476:3: rule__Primary__ExprAssignment_1_2
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
    // InternalSemAdapt.g:7485:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7489:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalSemAdapt.g:7490:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalSemAdapt.g:7497:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7501:1: ( ( () ) )
            // InternalSemAdapt.g:7502:1: ( () )
            {
            // InternalSemAdapt.g:7502:1: ( () )
            // InternalSemAdapt.g:7503:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getOppositeAction_2_0()); 
            }
            // InternalSemAdapt.g:7504:2: ()
            // InternalSemAdapt.g:7504:3: 
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
    // InternalSemAdapt.g:7512:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7516:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalSemAdapt.g:7517:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalSemAdapt.g:7524:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7528:1: ( ( '-' ) )
            // InternalSemAdapt.g:7529:1: ( '-' )
            {
            // InternalSemAdapt.g:7529:1: ( '-' )
            // InternalSemAdapt.g:7530:2: '-'
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
    // InternalSemAdapt.g:7539:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7543:1: ( rule__Primary__Group_2__2__Impl )
            // InternalSemAdapt.g:7544:2: rule__Primary__Group_2__2__Impl
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
    // InternalSemAdapt.g:7550:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExprAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7554:1: ( ( ( rule__Primary__ExprAssignment_2_2 ) ) )
            // InternalSemAdapt.g:7555:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            {
            // InternalSemAdapt.g:7555:1: ( ( rule__Primary__ExprAssignment_2_2 ) )
            // InternalSemAdapt.g:7556:2: ( rule__Primary__ExprAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_2_2()); 
            }
            // InternalSemAdapt.g:7557:2: ( rule__Primary__ExprAssignment_2_2 )
            // InternalSemAdapt.g:7557:3: rule__Primary__ExprAssignment_2_2
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
    // InternalSemAdapt.g:7566:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7570:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalSemAdapt.g:7571:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemAdapt.g:7578:1: rule__Primary__Group_3__0__Impl : ( () ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7582:1: ( ( () ) )
            // InternalSemAdapt.g:7583:1: ( () )
            {
            // InternalSemAdapt.g:7583:1: ( () )
            // InternalSemAdapt.g:7584:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getIsAction_3_0()); 
            }
            // InternalSemAdapt.g:7585:2: ()
            // InternalSemAdapt.g:7585:3: 
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
    // InternalSemAdapt.g:7593:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7597:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalSemAdapt.g:7598:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalSemAdapt.g:7605:1: rule__Primary__Group_3__1__Impl : ( ( rule__Primary__PatternAssignment_3_1 ) ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7609:1: ( ( ( rule__Primary__PatternAssignment_3_1 ) ) )
            // InternalSemAdapt.g:7610:1: ( ( rule__Primary__PatternAssignment_3_1 ) )
            {
            // InternalSemAdapt.g:7610:1: ( ( rule__Primary__PatternAssignment_3_1 ) )
            // InternalSemAdapt.g:7611:2: ( rule__Primary__PatternAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getPatternAssignment_3_1()); 
            }
            // InternalSemAdapt.g:7612:2: ( rule__Primary__PatternAssignment_3_1 )
            // InternalSemAdapt.g:7612:3: rule__Primary__PatternAssignment_3_1
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
    // InternalSemAdapt.g:7620:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7624:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalSemAdapt.g:7625:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSemAdapt.g:7632:1: rule__Primary__Group_3__2__Impl : ( 'match' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7636:1: ( ( 'match' ) )
            // InternalSemAdapt.g:7637:1: ( 'match' )
            {
            // InternalSemAdapt.g:7637:1: ( 'match' )
            // InternalSemAdapt.g:7638:2: 'match'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMatchKeyword_3_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalSemAdapt.g:7647:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7651:1: ( rule__Primary__Group_3__3__Impl )
            // InternalSemAdapt.g:7652:2: rule__Primary__Group_3__3__Impl
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
    // InternalSemAdapt.g:7658:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExprAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7662:1: ( ( ( rule__Primary__ExprAssignment_3_3 ) ) )
            // InternalSemAdapt.g:7663:1: ( ( rule__Primary__ExprAssignment_3_3 ) )
            {
            // InternalSemAdapt.g:7663:1: ( ( rule__Primary__ExprAssignment_3_3 ) )
            // InternalSemAdapt.g:7664:2: ( rule__Primary__ExprAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExprAssignment_3_3()); 
            }
            // InternalSemAdapt.g:7665:2: ( rule__Primary__ExprAssignment_3_3 )
            // InternalSemAdapt.g:7665:3: rule__Primary__ExprAssignment_3_3
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
    // InternalSemAdapt.g:7674:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7678:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalSemAdapt.g:7679:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalSemAdapt.g:7686:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7690:1: ( ( () ) )
            // InternalSemAdapt.g:7691:1: ( () )
            {
            // InternalSemAdapt.g:7691:1: ( () )
            // InternalSemAdapt.g:7692:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }
            // InternalSemAdapt.g:7693:2: ()
            // InternalSemAdapt.g:7693:3: 
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
    // InternalSemAdapt.g:7701:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7705:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalSemAdapt.g:7706:2: rule__Atomic__Group_0__1__Impl
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
    // InternalSemAdapt.g:7712:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7716:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalSemAdapt.g:7717:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalSemAdapt.g:7717:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalSemAdapt.g:7718:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalSemAdapt.g:7719:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalSemAdapt.g:7719:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalSemAdapt.g:7728:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7732:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalSemAdapt.g:7733:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalSemAdapt.g:7740:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7744:1: ( ( () ) )
            // InternalSemAdapt.g:7745:1: ( () )
            {
            // InternalSemAdapt.g:7745:1: ( () )
            // InternalSemAdapt.g:7746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0()); 
            }
            // InternalSemAdapt.g:7747:2: ()
            // InternalSemAdapt.g:7747:3: 
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
    // InternalSemAdapt.g:7755:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7759:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalSemAdapt.g:7760:2: rule__Atomic__Group_1__1__Impl
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
    // InternalSemAdapt.g:7766:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7770:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalSemAdapt.g:7771:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalSemAdapt.g:7771:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalSemAdapt.g:7772:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalSemAdapt.g:7773:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalSemAdapt.g:7773:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalSemAdapt.g:7782:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7786:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalSemAdapt.g:7787:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalSemAdapt.g:7794:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7798:1: ( ( () ) )
            // InternalSemAdapt.g:7799:1: ( () )
            {
            // InternalSemAdapt.g:7799:1: ( () )
            // InternalSemAdapt.g:7800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            }
            // InternalSemAdapt.g:7801:2: ()
            // InternalSemAdapt.g:7801:3: 
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
    // InternalSemAdapt.g:7809:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7813:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalSemAdapt.g:7814:2: rule__Atomic__Group_2__1__Impl
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
    // InternalSemAdapt.g:7820:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7824:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalSemAdapt.g:7825:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalSemAdapt.g:7825:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalSemAdapt.g:7826:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalSemAdapt.g:7827:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalSemAdapt.g:7827:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalSemAdapt.g:7836:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7840:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalSemAdapt.g:7841:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalSemAdapt.g:7848:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7852:1: ( ( () ) )
            // InternalSemAdapt.g:7853:1: ( () )
            {
            // InternalSemAdapt.g:7853:1: ( () )
            // InternalSemAdapt.g:7854:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }
            // InternalSemAdapt.g:7855:2: ()
            // InternalSemAdapt.g:7855:3: 
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
    // InternalSemAdapt.g:7863:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7867:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalSemAdapt.g:7868:2: rule__Atomic__Group_3__1__Impl
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
    // InternalSemAdapt.g:7874:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7878:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalSemAdapt.g:7879:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalSemAdapt.g:7879:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalSemAdapt.g:7880:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalSemAdapt.g:7881:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalSemAdapt.g:7881:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalSemAdapt.g:7890:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7894:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSemAdapt.g:7895:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalSemAdapt.g:7902:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7906:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7907:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:7907:1: ( RULE_ID )
            // InternalSemAdapt.g:7908:2: RULE_ID
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
    // InternalSemAdapt.g:7917:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7921:1: ( rule__FQN__Group__1__Impl )
            // InternalSemAdapt.g:7922:2: rule__FQN__Group__1__Impl
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
    // InternalSemAdapt.g:7928:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7932:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSemAdapt.g:7933:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSemAdapt.g:7933:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSemAdapt.g:7934:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:7935:2: ( rule__FQN__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==34) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSemAdapt.g:7935:3: rule__FQN__Group_1__0
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
    // InternalSemAdapt.g:7944:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7948:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSemAdapt.g:7949:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSemAdapt.g:7956:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7960:1: ( ( '.' ) )
            // InternalSemAdapt.g:7961:1: ( '.' )
            {
            // InternalSemAdapt.g:7961:1: ( '.' )
            // InternalSemAdapt.g:7962:2: '.'
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
    // InternalSemAdapt.g:7971:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7975:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSemAdapt.g:7976:2: rule__FQN__Group_1__1__Impl
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
    // InternalSemAdapt.g:7982:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:7986:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:7987:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:7987:1: ( RULE_ID )
            // InternalSemAdapt.g:7988:2: RULE_ID
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
    // InternalSemAdapt.g:7998:1: rule__OperationFQN__Group__0 : rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 ;
    public final void rule__OperationFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8002:1: ( rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1 )
            // InternalSemAdapt.g:8003:2: rule__OperationFQN__Group__0__Impl rule__OperationFQN__Group__1
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
    // InternalSemAdapt.g:8010:1: rule__OperationFQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8014:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8015:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:8015:1: ( RULE_ID )
            // InternalSemAdapt.g:8016:2: RULE_ID
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
    // InternalSemAdapt.g:8025:1: rule__OperationFQN__Group__1 : rule__OperationFQN__Group__1__Impl ;
    public final void rule__OperationFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8029:1: ( rule__OperationFQN__Group__1__Impl )
            // InternalSemAdapt.g:8030:2: rule__OperationFQN__Group__1__Impl
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
    // InternalSemAdapt.g:8036:1: rule__OperationFQN__Group__1__Impl : ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) ;
    public final void rule__OperationFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8040:1: ( ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) ) )
            // InternalSemAdapt.g:8041:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            {
            // InternalSemAdapt.g:8041:1: ( ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* ) )
            // InternalSemAdapt.g:8042:2: ( ( rule__OperationFQN__Group_1__0 ) ) ( ( rule__OperationFQN__Group_1__0 )* )
            {
            // InternalSemAdapt.g:8042:2: ( ( rule__OperationFQN__Group_1__0 ) )
            // InternalSemAdapt.g:8043:3: ( rule__OperationFQN__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:8044:3: ( rule__OperationFQN__Group_1__0 )
            // InternalSemAdapt.g:8044:4: rule__OperationFQN__Group_1__0
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

            // InternalSemAdapt.g:8047:2: ( ( rule__OperationFQN__Group_1__0 )* )
            // InternalSemAdapt.g:8048:3: ( rule__OperationFQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationFQNAccess().getGroup_1()); 
            }
            // InternalSemAdapt.g:8049:3: ( rule__OperationFQN__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSemAdapt.g:8049:4: rule__OperationFQN__Group_1__0
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
    // InternalSemAdapt.g:8059:1: rule__OperationFQN__Group_1__0 : rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 ;
    public final void rule__OperationFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8063:1: ( rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1 )
            // InternalSemAdapt.g:8064:2: rule__OperationFQN__Group_1__0__Impl rule__OperationFQN__Group_1__1
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
    // InternalSemAdapt.g:8071:1: rule__OperationFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__OperationFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8075:1: ( ( '.' ) )
            // InternalSemAdapt.g:8076:1: ( '.' )
            {
            // InternalSemAdapt.g:8076:1: ( '.' )
            // InternalSemAdapt.g:8077:2: '.'
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
    // InternalSemAdapt.g:8086:1: rule__OperationFQN__Group_1__1 : rule__OperationFQN__Group_1__1__Impl ;
    public final void rule__OperationFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8090:1: ( rule__OperationFQN__Group_1__1__Impl )
            // InternalSemAdapt.g:8091:2: rule__OperationFQN__Group_1__1__Impl
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
    // InternalSemAdapt.g:8097:1: rule__OperationFQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__OperationFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8101:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8102:1: ( RULE_ID )
            {
            // InternalSemAdapt.g:8102:1: ( RULE_ID )
            // InternalSemAdapt.g:8103:2: RULE_ID
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
    // InternalSemAdapt.g:8113:1: rule__SemanticAdaptation__ModelAssignment_0 : ( ruleModel ) ;
    public final void rule__SemanticAdaptation__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8117:1: ( ( ruleModel ) )
            // InternalSemAdapt.g:8118:2: ( ruleModel )
            {
            // InternalSemAdapt.g:8118:2: ( ruleModel )
            // InternalSemAdapt.g:8119:3: ruleModel
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
    // InternalSemAdapt.g:8128:1: rule__SemanticAdaptation__SemanticsAssignment_1 : ( ruleSemantics ) ;
    public final void rule__SemanticAdaptation__SemanticsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8132:1: ( ( ruleSemantics ) )
            // InternalSemAdapt.g:8133:2: ( ruleSemantics )
            {
            // InternalSemAdapt.g:8133:2: ( ruleSemantics )
            // InternalSemAdapt.g:8134:3: ruleSemantics
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
    // InternalSemAdapt.g:8143:1: rule__SemanticAdaptation__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__SemanticAdaptation__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8147:1: ( ( ruleImport ) )
            // InternalSemAdapt.g:8148:2: ( ruleImport )
            {
            // InternalSemAdapt.g:8148:2: ( ruleImport )
            // InternalSemAdapt.g:8149:3: ruleImport
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
    // InternalSemAdapt.g:8158:1: rule__SemanticAdaptation__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__SemanticAdaptation__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8162:1: ( ( ruleModule ) )
            // InternalSemAdapt.g:8163:2: ( ruleModule )
            {
            // InternalSemAdapt.g:8163:2: ( ruleModule )
            // InternalSemAdapt.g:8164:3: ruleModule
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
    // InternalSemAdapt.g:8173:1: rule__Semantics__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Semantics__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8177:1: ( ( ruleEString ) )
            // InternalSemAdapt.g:8178:2: ( ruleEString )
            {
            // InternalSemAdapt.g:8178:2: ( ruleEString )
            // InternalSemAdapt.g:8179:3: ruleEString
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
    // InternalSemAdapt.g:8188:1: rule__Module__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8192:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8193:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8193:2: ( RULE_ID )
            // InternalSemAdapt.g:8194:3: RULE_ID
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
    // InternalSemAdapt.g:8203:1: rule__Module__PointcutsAssignment_2 : ( rulePointcut ) ;
    public final void rule__Module__PointcutsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8207:1: ( ( rulePointcut ) )
            // InternalSemAdapt.g:8208:2: ( rulePointcut )
            {
            // InternalSemAdapt.g:8208:2: ( rulePointcut )
            // InternalSemAdapt.g:8209:3: rulePointcut
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
    // InternalSemAdapt.g:8218:1: rule__Module__AdaptationsAssignment_3 : ( ruleAdaptation ) ;
    public final void rule__Module__AdaptationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8222:1: ( ( ruleAdaptation ) )
            // InternalSemAdapt.g:8223:2: ( ruleAdaptation )
            {
            // InternalSemAdapt.g:8223:2: ( ruleAdaptation )
            // InternalSemAdapt.g:8224:3: ruleAdaptation
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
    // InternalSemAdapt.g:8233:1: rule__Pointcut__RecursiveAssignment_0 : ( ( 'recursive' ) ) ;
    public final void rule__Pointcut__RecursiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8237:1: ( ( ( 'recursive' ) ) )
            // InternalSemAdapt.g:8238:2: ( ( 'recursive' ) )
            {
            // InternalSemAdapt.g:8238:2: ( ( 'recursive' ) )
            // InternalSemAdapt.g:8239:3: ( 'recursive' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getRecursiveRecursiveKeyword_0_0()); 
            }
            // InternalSemAdapt.g:8240:3: ( 'recursive' )
            // InternalSemAdapt.g:8241:4: 'recursive'
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
    // InternalSemAdapt.g:8252:1: rule__Pointcut__StructureAssignment_2 : ( ruleDefConfiguration ) ;
    public final void rule__Pointcut__StructureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8256:1: ( ( ruleDefConfiguration ) )
            // InternalSemAdapt.g:8257:2: ( ruleDefConfiguration )
            {
            // InternalSemAdapt.g:8257:2: ( ruleDefConfiguration )
            // InternalSemAdapt.g:8258:3: ruleDefConfiguration
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
    // InternalSemAdapt.g:8267:1: rule__Pointcut__ConditionsAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Pointcut__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8271:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8272:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8272:2: ( ruleCondition )
            // InternalSemAdapt.g:8273:3: ruleCondition
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
    // InternalSemAdapt.g:8282:1: rule__Pointcut__ConditionsAssignment_3_2_1 : ( ruleCondition ) ;
    public final void rule__Pointcut__ConditionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8286:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8287:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8287:2: ( ruleCondition )
            // InternalSemAdapt.g:8288:3: ruleCondition
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
    // InternalSemAdapt.g:8297:1: rule__Adaptation__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Adaptation__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8301:1: ( ( ( RULE_ID ) ) )
            // InternalSemAdapt.g:8302:2: ( ( RULE_ID ) )
            {
            // InternalSemAdapt.g:8302:2: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8303:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdaptationAccess().getTargetRuleCrossReference_1_0()); 
            }
            // InternalSemAdapt.g:8304:3: ( RULE_ID )
            // InternalSemAdapt.g:8305:4: RULE_ID
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
    // InternalSemAdapt.g:8316:1: rule__Adaptation__AdaptationAssignment_2 : ( ruleRule ) ;
    public final void rule__Adaptation__AdaptationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8320:1: ( ( ruleRule ) )
            // InternalSemAdapt.g:8321:2: ( ruleRule )
            {
            // InternalSemAdapt.g:8321:2: ( ruleRule )
            // InternalSemAdapt.g:8322:3: ruleRule
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
    // InternalSemAdapt.g:8331:1: rule__Model__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8335:1: ( ( ruleEString ) )
            // InternalSemAdapt.g:8336:2: ( ruleEString )
            {
            // InternalSemAdapt.g:8336:2: ( ruleEString )
            // InternalSemAdapt.g:8337:3: ruleEString
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
    // InternalSemAdapt.g:8346:1: rule__Model__SemanticdomainAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Model__SemanticdomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8350:1: ( ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:8351:2: ( ( ruleFQN ) )
            {
            // InternalSemAdapt.g:8351:2: ( ( ruleFQN ) )
            // InternalSemAdapt.g:8352:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0()); 
            }
            // InternalSemAdapt.g:8353:3: ( ruleFQN )
            // InternalSemAdapt.g:8354:4: ruleFQN
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
    // InternalSemAdapt.g:8365:1: rule__Import__ImportURIAssignment_1 : ( ruleEString ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8369:1: ( ( ruleEString ) )
            // InternalSemAdapt.g:8370:2: ( ruleEString )
            {
            // InternalSemAdapt.g:8370:2: ( ruleEString )
            // InternalSemAdapt.g:8371:3: ruleEString
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
    // InternalSemAdapt.g:8380:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8384:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8385:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8385:2: ( RULE_ID )
            // InternalSemAdapt.g:8386:3: RULE_ID
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
    // InternalSemAdapt.g:8395:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8399:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8400:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8400:2: ( RULE_ID )
            // InternalSemAdapt.g:8401:3: RULE_ID
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
    // InternalSemAdapt.g:8410:1: rule__Rule__ConclusionAssignment_3 : ( ruleConclusion ) ;
    public final void rule__Rule__ConclusionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8414:1: ( ( ruleConclusion ) )
            // InternalSemAdapt.g:8415:2: ( ruleConclusion )
            {
            // InternalSemAdapt.g:8415:2: ( ruleConclusion )
            // InternalSemAdapt.g:8416:3: ruleConclusion
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
    // InternalSemAdapt.g:8425:1: rule__Rule__ConditionsAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8429:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8430:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8430:2: ( ruleCondition )
            // InternalSemAdapt.g:8431:3: ruleCondition
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
    // InternalSemAdapt.g:8440:1: rule__Rule__ConditionsAssignment_4_2_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8444:1: ( ( ruleCondition ) )
            // InternalSemAdapt.g:8445:2: ( ruleCondition )
            {
            // InternalSemAdapt.g:8445:2: ( ruleCondition )
            // InternalSemAdapt.g:8446:3: ruleCondition
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
    // InternalSemAdapt.g:8455:1: rule__Rule__PremisesAssignment_5_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8459:1: ( ( rulePremise ) )
            // InternalSemAdapt.g:8460:2: ( rulePremise )
            {
            // InternalSemAdapt.g:8460:2: ( rulePremise )
            // InternalSemAdapt.g:8461:3: rulePremise
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
    // InternalSemAdapt.g:8470:1: rule__Rule__PremisesAssignment_5_2_1 : ( rulePremise ) ;
    public final void rule__Rule__PremisesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8474:1: ( ( rulePremise ) )
            // InternalSemAdapt.g:8475:2: ( rulePremise )
            {
            // InternalSemAdapt.g:8475:2: ( rulePremise )
            // InternalSemAdapt.g:8476:3: rulePremise
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
    // InternalSemAdapt.g:8485:1: rule__Rule__BindingsAssignment_6_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8489:1: ( ( ruleBinding ) )
            // InternalSemAdapt.g:8490:2: ( ruleBinding )
            {
            // InternalSemAdapt.g:8490:2: ( ruleBinding )
            // InternalSemAdapt.g:8491:3: ruleBinding
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
    // InternalSemAdapt.g:8500:1: rule__Rule__BindingsAssignment_6_2_1 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8504:1: ( ( ruleBinding ) )
            // InternalSemAdapt.g:8505:2: ( ruleBinding )
            {
            // InternalSemAdapt.g:8505:2: ( ruleBinding )
            // InternalSemAdapt.g:8506:3: ruleBinding
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
    // InternalSemAdapt.g:8515:1: rule__Rule__InputsAssignment_7_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8519:1: ( ( ruleInput ) )
            // InternalSemAdapt.g:8520:2: ( ruleInput )
            {
            // InternalSemAdapt.g:8520:2: ( ruleInput )
            // InternalSemAdapt.g:8521:3: ruleInput
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
    // InternalSemAdapt.g:8530:1: rule__Rule__OutputsAssignment_7_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8534:1: ( ( ruleOutput ) )
            // InternalSemAdapt.g:8535:2: ( ruleOutput )
            {
            // InternalSemAdapt.g:8535:2: ( ruleOutput )
            // InternalSemAdapt.g:8536:3: ruleOutput
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
    // InternalSemAdapt.g:8545:1: rule__Rule__InputsAssignment_7_2_1_0 : ( ruleInput ) ;
    public final void rule__Rule__InputsAssignment_7_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8549:1: ( ( ruleInput ) )
            // InternalSemAdapt.g:8550:2: ( ruleInput )
            {
            // InternalSemAdapt.g:8550:2: ( ruleInput )
            // InternalSemAdapt.g:8551:3: ruleInput
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
    // InternalSemAdapt.g:8560:1: rule__Rule__OutputsAssignment_7_2_1_1 : ( ruleOutput ) ;
    public final void rule__Rule__OutputsAssignment_7_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8564:1: ( ( ruleOutput ) )
            // InternalSemAdapt.g:8565:2: ( ruleOutput )
            {
            // InternalSemAdapt.g:8565:2: ( ruleOutput )
            // InternalSemAdapt.g:8566:3: ruleOutput
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
    // InternalSemAdapt.g:8575:1: rule__Condition__CondAssignment_1 : ( ruleCondExpr ) ;
    public final void rule__Condition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8579:1: ( ( ruleCondExpr ) )
            // InternalSemAdapt.g:8580:2: ( ruleCondExpr )
            {
            // InternalSemAdapt.g:8580:2: ( ruleCondExpr )
            // InternalSemAdapt.g:8581:3: ruleCondExpr
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
    // InternalSemAdapt.g:8590:1: rule__Input__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Input__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8594:1: ( ( ruleAssignee ) )
            // InternalSemAdapt.g:8595:2: ( ruleAssignee )
            {
            // InternalSemAdapt.g:8595:2: ( ruleAssignee )
            // InternalSemAdapt.g:8596:3: ruleAssignee
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
    // InternalSemAdapt.g:8605:1: rule__Input__OperationAssignment_2 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Input__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8609:1: ( ( ( ruleOperationFQN ) ) )
            // InternalSemAdapt.g:8610:2: ( ( ruleOperationFQN ) )
            {
            // InternalSemAdapt.g:8610:2: ( ( ruleOperationFQN ) )
            // InternalSemAdapt.g:8611:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0()); 
            }
            // InternalSemAdapt.g:8612:3: ( ruleOperationFQN )
            // InternalSemAdapt.g:8613:4: ruleOperationFQN
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
    // InternalSemAdapt.g:8624:1: rule__Output__OperationAssignment_0 : ( ( ruleOperationFQN ) ) ;
    public final void rule__Output__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8628:1: ( ( ( ruleOperationFQN ) ) )
            // InternalSemAdapt.g:8629:2: ( ( ruleOperationFQN ) )
            {
            // InternalSemAdapt.g:8629:2: ( ( ruleOperationFQN ) )
            // InternalSemAdapt.g:8630:3: ( ruleOperationFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0()); 
            }
            // InternalSemAdapt.g:8631:3: ( ruleOperationFQN )
            // InternalSemAdapt.g:8632:4: ruleOperationFQN
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
    // InternalSemAdapt.g:8643:1: rule__Output__ArgsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8647:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8648:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8648:2: ( ruleTermRef )
            // InternalSemAdapt.g:8649:3: ruleTermRef
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
    // InternalSemAdapt.g:8658:1: rule__Output__ArgsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__Output__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8662:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8663:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8663:2: ( ruleTermRef )
            // InternalSemAdapt.g:8664:3: ruleTermRef
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
    // InternalSemAdapt.g:8673:1: rule__Binding__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Binding__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8677:1: ( ( ruleAssignee ) )
            // InternalSemAdapt.g:8678:2: ( ruleAssignee )
            {
            // InternalSemAdapt.g:8678:2: ( ruleAssignee )
            // InternalSemAdapt.g:8679:3: ruleAssignee
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
    // InternalSemAdapt.g:8688:1: rule__Binding__ExprAssignment_2 : ( ruleAssignable ) ;
    public final void rule__Binding__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8692:1: ( ( ruleAssignable ) )
            // InternalSemAdapt.g:8693:2: ( ruleAssignable )
            {
            // InternalSemAdapt.g:8693:2: ( ruleAssignable )
            // InternalSemAdapt.g:8694:3: ruleAssignable
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
    // InternalSemAdapt.g:8703:1: rule__SemanticDomainAccess__RecieverAssignment_0 : ( ruleTerminalAccessExpression ) ;
    public final void rule__SemanticDomainAccess__RecieverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8707:1: ( ( ruleTerminalAccessExpression ) )
            // InternalSemAdapt.g:8708:2: ( ruleTerminalAccessExpression )
            {
            // InternalSemAdapt.g:8708:2: ( ruleTerminalAccessExpression )
            // InternalSemAdapt.g:8709:3: ruleTerminalAccessExpression
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
    // InternalSemAdapt.g:8718:1: rule__SemanticDomainAccess__FieldAssignment_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8722:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8723:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8723:2: ( RULE_ID )
            // InternalSemAdapt.g:8724:3: RULE_ID
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
    // InternalSemAdapt.g:8733:1: rule__SemanticDomainAccess__FieldAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SemanticDomainAccess__FieldAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8737:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8738:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8738:2: ( RULE_ID )
            // InternalSemAdapt.g:8739:3: RULE_ID
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
    // InternalSemAdapt.g:8748:1: rule__Conclusion__FromAssignment_0 : ( ruleDefConfiguration ) ;
    public final void rule__Conclusion__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8752:1: ( ( ruleDefConfiguration ) )
            // InternalSemAdapt.g:8753:2: ( ruleDefConfiguration )
            {
            // InternalSemAdapt.g:8753:2: ( ruleDefConfiguration )
            // InternalSemAdapt.g:8754:3: ruleDefConfiguration
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
    // InternalSemAdapt.g:8763:1: rule__Conclusion__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Conclusion__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8767:1: ( ( ( 'termination' ) ) )
            // InternalSemAdapt.g:8768:2: ( ( 'termination' ) )
            {
            // InternalSemAdapt.g:8768:2: ( ( 'termination' ) )
            // InternalSemAdapt.g:8769:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalSemAdapt.g:8770:3: ( 'termination' )
            // InternalSemAdapt.g:8771:4: 'termination'
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
    // InternalSemAdapt.g:8782:1: rule__Conclusion__ToAssignment_3 : ( ruleSingleTermRef ) ;
    public final void rule__Conclusion__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8786:1: ( ( ruleSingleTermRef ) )
            // InternalSemAdapt.g:8787:2: ( ruleSingleTermRef )
            {
            // InternalSemAdapt.g:8787:2: ( ruleSingleTermRef )
            // InternalSemAdapt.g:8788:3: ruleSingleTermRef
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
    // InternalSemAdapt.g:8797:1: rule__Premise__FromAssignment_0 : ( ruleSymbolRef ) ;
    public final void rule__Premise__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8801:1: ( ( ruleSymbolRef ) )
            // InternalSemAdapt.g:8802:2: ( ruleSymbolRef )
            {
            // InternalSemAdapt.g:8802:2: ( ruleSymbolRef )
            // InternalSemAdapt.g:8803:3: ruleSymbolRef
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
    // InternalSemAdapt.g:8812:1: rule__Premise__TerminationAssignment_2 : ( ( 'termination' ) ) ;
    public final void rule__Premise__TerminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8816:1: ( ( ( 'termination' ) ) )
            // InternalSemAdapt.g:8817:2: ( ( 'termination' ) )
            {
            // InternalSemAdapt.g:8817:2: ( ( 'termination' ) )
            // InternalSemAdapt.g:8818:3: ( 'termination' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0()); 
            }
            // InternalSemAdapt.g:8819:3: ( 'termination' )
            // InternalSemAdapt.g:8820:4: 'termination'
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
    // InternalSemAdapt.g:8831:1: rule__Premise__ToAssignment_3 : ( ruleSingleTermDef ) ;
    public final void rule__Premise__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8835:1: ( ( ruleSingleTermDef ) )
            // InternalSemAdapt.g:8836:2: ( ruleSingleTermDef )
            {
            // InternalSemAdapt.g:8836:2: ( ruleSingleTermDef )
            // InternalSemAdapt.g:8837:3: ruleSingleTermDef
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
    // InternalSemAdapt.g:8846:1: rule__DefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__DefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8850:1: ( ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:8851:2: ( ( ruleFQN ) )
            {
            // InternalSemAdapt.g:8851:2: ( ( ruleFQN ) )
            // InternalSemAdapt.g:8852:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalSemAdapt.g:8853:3: ( ruleFQN )
            // InternalSemAdapt.g:8854:4: ruleFQN
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
    // InternalSemAdapt.g:8865:1: rule__DefConfiguration__ChildsAssignment_2_0 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8869:1: ( ( ruleTermDef ) )
            // InternalSemAdapt.g:8870:2: ( ruleTermDef )
            {
            // InternalSemAdapt.g:8870:2: ( ruleTermDef )
            // InternalSemAdapt.g:8871:3: ruleTermDef
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
    // InternalSemAdapt.g:8880:1: rule__DefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermDef ) ;
    public final void rule__DefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8884:1: ( ( ruleTermDef ) )
            // InternalSemAdapt.g:8885:2: ( ruleTermDef )
            {
            // InternalSemAdapt.g:8885:2: ( ruleTermDef )
            // InternalSemAdapt.g:8886:3: ruleTermDef
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
    // InternalSemAdapt.g:8895:1: rule__RefConfiguration__ConceptAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__RefConfiguration__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8899:1: ( ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:8900:2: ( ( ruleFQN ) )
            {
            // InternalSemAdapt.g:8900:2: ( ( ruleFQN ) )
            // InternalSemAdapt.g:8901:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0()); 
            }
            // InternalSemAdapt.g:8902:3: ( ruleFQN )
            // InternalSemAdapt.g:8903:4: ruleFQN
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
    // InternalSemAdapt.g:8914:1: rule__RefConfiguration__ChildsAssignment_2_0 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8918:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8919:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8919:2: ( ruleTermRef )
            // InternalSemAdapt.g:8920:3: ruleTermRef
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
    // InternalSemAdapt.g:8929:1: rule__RefConfiguration__ChildsAssignment_2_1_1 : ( ruleTermRef ) ;
    public final void rule__RefConfiguration__ChildsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8933:1: ( ( ruleTermRef ) )
            // InternalSemAdapt.g:8934:2: ( ruleTermRef )
            {
            // InternalSemAdapt.g:8934:2: ( ruleTermRef )
            // InternalSemAdapt.g:8935:3: ruleTermRef
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
    // InternalSemAdapt.g:8944:1: rule__SymbolDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8948:1: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8949:2: ( RULE_ID )
            {
            // InternalSemAdapt.g:8949:2: ( RULE_ID )
            // InternalSemAdapt.g:8950:3: RULE_ID
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
    // InternalSemAdapt.g:8959:1: rule__SymbolRef__DefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SymbolRef__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8963:1: ( ( ( RULE_ID ) ) )
            // InternalSemAdapt.g:8964:2: ( ( RULE_ID ) )
            {
            // InternalSemAdapt.g:8964:2: ( ( RULE_ID ) )
            // InternalSemAdapt.g:8965:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0()); 
            }
            // InternalSemAdapt.g:8966:3: ( RULE_ID )
            // InternalSemAdapt.g:8967:4: RULE_ID
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
    // InternalSemAdapt.g:8978:1: rule__ListDef__HeadAssignment_1 : ( ruleSingleTermDef ) ;
    public final void rule__ListDef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8982:1: ( ( ruleSingleTermDef ) )
            // InternalSemAdapt.g:8983:2: ( ruleSingleTermDef )
            {
            // InternalSemAdapt.g:8983:2: ( ruleSingleTermDef )
            // InternalSemAdapt.g:8984:3: ruleSingleTermDef
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
    // InternalSemAdapt.g:8993:1: rule__ListDef__TailAssignment_3 : ( ruleSymbolDef ) ;
    public final void rule__ListDef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:8997:1: ( ( ruleSymbolDef ) )
            // InternalSemAdapt.g:8998:2: ( ruleSymbolDef )
            {
            // InternalSemAdapt.g:8998:2: ( ruleSymbolDef )
            // InternalSemAdapt.g:8999:3: ruleSymbolDef
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
    // InternalSemAdapt.g:9008:1: rule__ListRef__HeadAssignment_1 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9012:1: ( ( ruleSymbolRef ) )
            // InternalSemAdapt.g:9013:2: ( ruleSymbolRef )
            {
            // InternalSemAdapt.g:9013:2: ( ruleSymbolRef )
            // InternalSemAdapt.g:9014:3: ruleSymbolRef
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
    // InternalSemAdapt.g:9023:1: rule__ListRef__TailAssignment_3 : ( ruleSymbolRef ) ;
    public final void rule__ListRef__TailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9027:1: ( ( ruleSymbolRef ) )
            // InternalSemAdapt.g:9028:2: ( ruleSymbolRef )
            {
            // InternalSemAdapt.g:9028:2: ( ruleSymbolRef )
            // InternalSemAdapt.g:9029:3: ruleSymbolRef
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
    // InternalSemAdapt.g:9038:1: rule__CondNot__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__CondNot__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9042:1: ( ( ruleExpr ) )
            // InternalSemAdapt.g:9043:2: ( ruleExpr )
            {
            // InternalSemAdapt.g:9043:2: ( ruleExpr )
            // InternalSemAdapt.g:9044:3: ruleExpr
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
    // InternalSemAdapt.g:9053:1: rule__CondOr__LhsAssignment_1 : ( ruleAnd ) ;
    public final void rule__CondOr__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9057:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:9058:2: ( ruleAnd )
            {
            // InternalSemAdapt.g:9058:2: ( ruleAnd )
            // InternalSemAdapt.g:9059:3: ruleAnd
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
    // InternalSemAdapt.g:9068:1: rule__CondOr__RhsAssignment_3 : ( ruleAnd ) ;
    public final void rule__CondOr__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9072:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:9073:2: ( ruleAnd )
            {
            // InternalSemAdapt.g:9073:2: ( ruleAnd )
            // InternalSemAdapt.g:9074:3: ruleAnd
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
    // InternalSemAdapt.g:9083:1: rule__CondAnd__LhsAssignment_1 : ( ruleEquality ) ;
    public final void rule__CondAnd__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9087:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:9088:2: ( ruleEquality )
            {
            // InternalSemAdapt.g:9088:2: ( ruleEquality )
            // InternalSemAdapt.g:9089:3: ruleEquality
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
    // InternalSemAdapt.g:9098:1: rule__CondAnd__RhsAssignment_3 : ( ruleEquality ) ;
    public final void rule__CondAnd__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9102:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:9103:2: ( ruleEquality )
            {
            // InternalSemAdapt.g:9103:2: ( ruleEquality )
            // InternalSemAdapt.g:9104:3: ruleEquality
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
    // InternalSemAdapt.g:9113:1: rule__CondEquality__LhsAssignment_0_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9117:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:9118:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:9118:2: ( ruleComparison )
            // InternalSemAdapt.g:9119:3: ruleComparison
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
    // InternalSemAdapt.g:9128:1: rule__CondEquality__RhsAssignment_0_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9132:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:9133:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:9133:2: ( ruleComparison )
            // InternalSemAdapt.g:9134:3: ruleComparison
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
    // InternalSemAdapt.g:9143:1: rule__CondEquality__LhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__CondEquality__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9147:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:9148:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:9148:2: ( ruleComparison )
            // InternalSemAdapt.g:9149:3: ruleComparison
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
    // InternalSemAdapt.g:9158:1: rule__CondEquality__RhsAssignment_1_3 : ( ruleComparison ) ;
    public final void rule__CondEquality__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9162:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:9163:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:9163:2: ( ruleComparison )
            // InternalSemAdapt.g:9164:3: ruleComparison
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
    // InternalSemAdapt.g:9173:1: rule__CondComparison__LhsAssignment_0_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9177:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:9178:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:9178:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:9179:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:9188:1: rule__CondComparison__RhsAssignment_0_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9192:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:9193:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:9193:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:9194:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:9203:1: rule__CondComparison__LhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__LhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9207:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:9208:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:9208:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:9209:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:9218:1: rule__CondComparison__RhsAssignment_1_3 : ( rulePlusOrMinus ) ;
    public final void rule__CondComparison__RhsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9222:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:9223:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:9223:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:9224:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:9233:1: rule__CondIs__PatternAssignment_1 : ( ruleDefConfiguration ) ;
    public final void rule__CondIs__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9237:1: ( ( ruleDefConfiguration ) )
            // InternalSemAdapt.g:9238:2: ( ruleDefConfiguration )
            {
            // InternalSemAdapt.g:9238:2: ( ruleDefConfiguration )
            // InternalSemAdapt.g:9239:3: ruleDefConfiguration
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
    // InternalSemAdapt.g:9248:1: rule__CondIs__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__CondIs__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9252:1: ( ( ruleExpr ) )
            // InternalSemAdapt.g:9253:2: ( ruleExpr )
            {
            // InternalSemAdapt.g:9253:2: ( ruleExpr )
            // InternalSemAdapt.g:9254:3: ruleExpr
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
    // InternalSemAdapt.g:9263:1: rule__Or__RhsAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9267:1: ( ( ruleAnd ) )
            // InternalSemAdapt.g:9268:2: ( ruleAnd )
            {
            // InternalSemAdapt.g:9268:2: ( ruleAnd )
            // InternalSemAdapt.g:9269:3: ruleAnd
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
    // InternalSemAdapt.g:9278:1: rule__And__RhsAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9282:1: ( ( ruleEquality ) )
            // InternalSemAdapt.g:9283:2: ( ruleEquality )
            {
            // InternalSemAdapt.g:9283:2: ( ruleEquality )
            // InternalSemAdapt.g:9284:3: ruleEquality
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
    // InternalSemAdapt.g:9293:1: rule__Equality__RhsAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9297:1: ( ( ruleComparison ) )
            // InternalSemAdapt.g:9298:2: ( ruleComparison )
            {
            // InternalSemAdapt.g:9298:2: ( ruleComparison )
            // InternalSemAdapt.g:9299:3: ruleComparison
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
    // InternalSemAdapt.g:9308:1: rule__Comparison__RhsAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9312:1: ( ( rulePlusOrMinus ) )
            // InternalSemAdapt.g:9313:2: ( rulePlusOrMinus )
            {
            // InternalSemAdapt.g:9313:2: ( rulePlusOrMinus )
            // InternalSemAdapt.g:9314:3: rulePlusOrMinus
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
    // InternalSemAdapt.g:9323:1: rule__PlusOrMinus__RhsAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9327:1: ( ( ruleMulOrDiv ) )
            // InternalSemAdapt.g:9328:2: ( ruleMulOrDiv )
            {
            // InternalSemAdapt.g:9328:2: ( ruleMulOrDiv )
            // InternalSemAdapt.g:9329:3: ruleMulOrDiv
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
    // InternalSemAdapt.g:9338:1: rule__MulOrDiv__RhsAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9342:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9343:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9343:2: ( rulePrimary )
            // InternalSemAdapt.g:9344:3: rulePrimary
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
    // InternalSemAdapt.g:9353:1: rule__Primary__ExprAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9357:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9358:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9358:2: ( rulePrimary )
            // InternalSemAdapt.g:9359:3: rulePrimary
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
    // InternalSemAdapt.g:9368:1: rule__Primary__ExprAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9372:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9373:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9373:2: ( rulePrimary )
            // InternalSemAdapt.g:9374:3: rulePrimary
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
    // InternalSemAdapt.g:9383:1: rule__Primary__PatternAssignment_3_1 : ( ruleDefConfiguration ) ;
    public final void rule__Primary__PatternAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9387:1: ( ( ruleDefConfiguration ) )
            // InternalSemAdapt.g:9388:2: ( ruleDefConfiguration )
            {
            // InternalSemAdapt.g:9388:2: ( ruleDefConfiguration )
            // InternalSemAdapt.g:9389:3: ruleDefConfiguration
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
    // InternalSemAdapt.g:9398:1: rule__Primary__ExprAssignment_3_3 : ( rulePrimary ) ;
    public final void rule__Primary__ExprAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9402:1: ( ( rulePrimary ) )
            // InternalSemAdapt.g:9403:2: ( rulePrimary )
            {
            // InternalSemAdapt.g:9403:2: ( rulePrimary )
            // InternalSemAdapt.g:9404:3: rulePrimary
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
    // InternalSemAdapt.g:9413:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9417:1: ( ( RULE_INT ) )
            // InternalSemAdapt.g:9418:2: ( RULE_INT )
            {
            // InternalSemAdapt.g:9418:2: ( RULE_INT )
            // InternalSemAdapt.g:9419:3: RULE_INT
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
    // InternalSemAdapt.g:9428:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9432:1: ( ( RULE_DOUBLE ) )
            // InternalSemAdapt.g:9433:2: ( RULE_DOUBLE )
            {
            // InternalSemAdapt.g:9433:2: ( RULE_DOUBLE )
            // InternalSemAdapt.g:9434:3: RULE_DOUBLE
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
    // InternalSemAdapt.g:9443:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9447:1: ( ( RULE_STRING ) )
            // InternalSemAdapt.g:9448:2: ( RULE_STRING )
            {
            // InternalSemAdapt.g:9448:2: ( RULE_STRING )
            // InternalSemAdapt.g:9449:3: RULE_STRING
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
    // InternalSemAdapt.g:9458:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_BOOL ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemAdapt.g:9462:1: ( ( RULE_BOOL ) )
            // InternalSemAdapt.g:9463:2: ( RULE_BOOL )
            {
            // InternalSemAdapt.g:9463:2: ( RULE_BOOL )
            // InternalSemAdapt.g:9464:3: RULE_BOOL
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
        // InternalSemAdapt.g:1352:2: ( ( ruleExpr ) )
        // InternalSemAdapt.g:1352:2: ( ruleExpr )
        {
        // InternalSemAdapt.g:1352:2: ( ruleExpr )
        // InternalSemAdapt.g:1353:3: ruleExpr
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

    // $ANTLR start synpred6_InternalSemAdapt
    public final void synpred6_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1358:2: ( ( ruleRefConfiguration ) )
        // InternalSemAdapt.g:1358:2: ( ruleRefConfiguration )
        {
        // InternalSemAdapt.g:1358:2: ( ruleRefConfiguration )
        // InternalSemAdapt.g:1359:3: ruleRefConfiguration
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
    // $ANTLR end synpred6_InternalSemAdapt

    // $ANTLR start synpred15_InternalSemAdapt
    public final void synpred15_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1517:2: ( ( ruleCondOr ) )
        // InternalSemAdapt.g:1517:2: ( ruleCondOr )
        {
        // InternalSemAdapt.g:1517:2: ( ruleCondOr )
        // InternalSemAdapt.g:1518:3: ruleCondOr
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
        // InternalSemAdapt.g:1523:2: ( ( ruleCondAnd ) )
        // InternalSemAdapt.g:1523:2: ( ruleCondAnd )
        {
        // InternalSemAdapt.g:1523:2: ( ruleCondAnd )
        // InternalSemAdapt.g:1524:3: ruleCondAnd
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
        // InternalSemAdapt.g:1529:2: ( ( ruleCondEquality ) )
        // InternalSemAdapt.g:1529:2: ( ruleCondEquality )
        {
        // InternalSemAdapt.g:1529:2: ( ruleCondEquality )
        // InternalSemAdapt.g:1530:3: ruleCondEquality
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
        // InternalSemAdapt.g:1535:2: ( ( ruleCondComparison ) )
        // InternalSemAdapt.g:1535:2: ( ruleCondComparison )
        {
        // InternalSemAdapt.g:1535:2: ( ruleCondComparison )
        // InternalSemAdapt.g:1536:3: ruleCondComparison
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
        // InternalSemAdapt.g:1541:2: ( ( ruleCondNot ) )
        // InternalSemAdapt.g:1541:2: ( ruleCondNot )
        {
        // InternalSemAdapt.g:1541:2: ( ruleCondNot )
        // InternalSemAdapt.g:1542:3: ruleCondNot
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
    // $ANTLR end synpred19_InternalSemAdapt

    // $ANTLR start synpred20_InternalSemAdapt
    public final void synpred20_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1562:2: ( ( ( rule__CondEquality__Group_0__0 ) ) )
        // InternalSemAdapt.g:1562:2: ( ( rule__CondEquality__Group_0__0 ) )
        {
        // InternalSemAdapt.g:1562:2: ( ( rule__CondEquality__Group_0__0 ) )
        // InternalSemAdapt.g:1563:3: ( rule__CondEquality__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondEqualityAccess().getGroup_0()); 
        }
        // InternalSemAdapt.g:1564:3: ( rule__CondEquality__Group_0__0 )
        // InternalSemAdapt.g:1564:4: rule__CondEquality__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondEquality__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSemAdapt

    // $ANTLR start synpred21_InternalSemAdapt
    public final void synpred21_InternalSemAdapt_fragment() throws RecognitionException {   
        // InternalSemAdapt.g:1583:2: ( ( ( rule__CondComparison__Group_0__0 ) ) )
        // InternalSemAdapt.g:1583:2: ( ( rule__CondComparison__Group_0__0 ) )
        {
        // InternalSemAdapt.g:1583:2: ( ( rule__CondComparison__Group_0__0 ) )
        // InternalSemAdapt.g:1584:3: ( rule__CondComparison__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCondComparisonAccess().getGroup_0()); 
        }
        // InternalSemAdapt.g:1585:3: ( rule__CondComparison__Group_0__0 )
        // InternalSemAdapt.g:1585:4: rule__CondComparison__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CondComparison__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalSemAdapt

    // Delegated rules

    public final boolean synpred21_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred6_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSemAdapt_fragment(); // can never throw exception
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
    protected DFA18 dfa18 = new DFA18(this);
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
            return "1305:1: rule__Rule__Alternatives_7_1 : ( ( ( rule__Rule__InputsAssignment_7_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_1_1 ) ) );";
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
            return "1326:1: rule__Rule__Alternatives_7_2_1 : ( ( ( rule__Rule__InputsAssignment_7_2_1_0 ) ) | ( ( rule__Rule__OutputsAssignment_7_2_1_1 ) ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_9s = "\1\61\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String dfa_11s = "\4\uffff\1\0\4\uffff\1\1\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\4\3\1\27\uffff\1\1\2\uffff\1\11\5\uffff\1\1\7\uffff\1\1",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1347:1: rule__Assignable__Alternatives : ( ( ruleExpr ) | ( ruleRefConfiguration ) | ( ruleSemanticDomainAccess ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSemAdapt()) ) {s = 1;}

                        else if ( (synpred6_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSemAdapt()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_9);
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
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\4\11\0\6\uffff";
    static final String dfa_15s = "\1\61\11\0\6\uffff";
    static final String dfa_16s = "\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] dfa_18s = {
            "\1\7\1\4\1\5\1\6\1\10\27\uffff\1\1\2\uffff\1\11\5\uffff\1\2\7\uffff\1\3",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1512:1: rule__CondExpr__Alternatives : ( ( ruleCondOr ) | ( ruleCondAnd ) | ( ruleCondEquality ) | ( ruleCondComparison ) | ( ruleCondNot ) | ( ruleCondIs ) );";
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

                        else if ( (synpred19_InternalSemAdapt()) ) {s = 14;}

                         
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

                        else if ( (true) ) {s = 15;}

                         
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
    static final String dfa_19s = "\1\4\11\0\2\uffff";
    static final String dfa_20s = "\1\61\11\0\2\uffff";
    static final String dfa_21s = "\12\uffff\1\1\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_23s = {
            "\1\7\1\4\1\5\1\6\1\10\27\uffff\1\1\2\uffff\1\11\5\uffff\1\2\7\uffff\1\3",
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
            return "1557:1: rule__CondEquality__Alternatives : ( ( ( rule__CondEquality__Group_0__0 ) ) | ( ( rule__CondEquality__Group_1__0 ) ) );";
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
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSemAdapt()) ) {s = 10;}

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
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1578:1: rule__CondComparison__Alternatives : ( ( ( rule__CondComparison__Group_0__0 ) ) | ( ( rule__CondComparison__Group_1__0 ) ) );";
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
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSemAdapt()) ) {s = 10;}

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
    static final String dfa_24s = "\13\uffff";
    static final String dfa_25s = "\4\uffff\1\5\3\uffff\1\5\1\uffff\1\5";
    static final String dfa_26s = "\1\4\3\uffff\1\17\1\uffff\1\5\1\uffff\1\17\1\5\1\17";
    static final String dfa_27s = "\1\61\3\uffff\1\64\1\uffff\1\5\1\uffff\1\64\1\5\1\64";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\4\3\uffff";
    static final String dfa_29s = "\13\uffff}>";
    static final String[] dfa_30s = {
            "\1\5\1\4\3\5\27\uffff\1\1\2\uffff\1\5\5\uffff\1\2\7\uffff\1\3",
            "",
            "",
            "",
            "\2\5\1\uffff\4\5\5\uffff\4\5\1\uffff\1\7\1\5\1\6\7\uffff\13\5",
            "",
            "\1\10",
            "",
            "\2\5\1\uffff\4\5\5\uffff\4\5\1\uffff\1\7\1\5\1\11\7\uffff\13\5",
            "\1\12",
            "\2\5\1\uffff\4\5\5\uffff\4\5\1\uffff\1\7\1\5\1\11\7\uffff\13\5"
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1683:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleAtomic ) );";
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
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000100L});

}