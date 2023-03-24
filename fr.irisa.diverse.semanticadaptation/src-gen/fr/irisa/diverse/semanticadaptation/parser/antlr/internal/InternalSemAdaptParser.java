package fr.irisa.diverse.semanticadaptation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.irisa.diverse.semanticadaptation.services.SemAdaptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSemAdaptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'semantics'", "'{'", "'}'", "'recursive'", "'match'", "'where'", "','", "'Specialization'", "'Before'", "'After'", "'model'", "'with'", "'import'", "'as'", "'rule'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'.'", "'self'", "'->'", "'termination'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private SemAdaptGrammarAccess grammarAccess;

        public InternalSemAdaptParser(TokenStream input, SemAdaptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SemanticAdaptation";
       	}

       	@Override
       	protected SemAdaptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSemanticAdaptation"
    // InternalSemAdapt.g:70:1: entryRuleSemanticAdaptation returns [EObject current=null] : iv_ruleSemanticAdaptation= ruleSemanticAdaptation EOF ;
    public final EObject entryRuleSemanticAdaptation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticAdaptation = null;


        try {
            // InternalSemAdapt.g:70:59: (iv_ruleSemanticAdaptation= ruleSemanticAdaptation EOF )
            // InternalSemAdapt.g:71:2: iv_ruleSemanticAdaptation= ruleSemanticAdaptation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticAdaptationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSemanticAdaptation=ruleSemanticAdaptation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemanticAdaptation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSemanticAdaptation"


    // $ANTLR start "ruleSemanticAdaptation"
    // InternalSemAdapt.g:77:1: ruleSemanticAdaptation returns [EObject current=null] : ( ( (lv_model_0_0= ruleModel ) ) ( (lv_semantics_1_0= ruleSemantics ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_modules_3_0= ruleModule ) )* ) ;
    public final EObject ruleSemanticAdaptation() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;

        EObject lv_semantics_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_modules_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:83:2: ( ( ( (lv_model_0_0= ruleModel ) ) ( (lv_semantics_1_0= ruleSemantics ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_modules_3_0= ruleModule ) )* ) )
            // InternalSemAdapt.g:84:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_semantics_1_0= ruleSemantics ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_modules_3_0= ruleModule ) )* )
            {
            // InternalSemAdapt.g:84:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_semantics_1_0= ruleSemantics ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_modules_3_0= ruleModule ) )* )
            // InternalSemAdapt.g:85:3: ( (lv_model_0_0= ruleModel ) ) ( (lv_semantics_1_0= ruleSemantics ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_modules_3_0= ruleModule ) )*
            {
            // InternalSemAdapt.g:85:3: ( (lv_model_0_0= ruleModel ) )
            // InternalSemAdapt.g:86:4: (lv_model_0_0= ruleModel )
            {
            // InternalSemAdapt.g:86:4: (lv_model_0_0= ruleModel )
            // InternalSemAdapt.g:87:5: lv_model_0_0= ruleModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticAdaptationAccess().getModelModelParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_model_0_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticAdaptationRule());
              					}
              					set(
              						current,
              						"model",
              						lv_model_0_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Model");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSemAdapt.g:104:3: ( (lv_semantics_1_0= ruleSemantics ) )
            // InternalSemAdapt.g:105:4: (lv_semantics_1_0= ruleSemantics )
            {
            // InternalSemAdapt.g:105:4: (lv_semantics_1_0= ruleSemantics )
            // InternalSemAdapt.g:106:5: lv_semantics_1_0= ruleSemantics
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticAdaptationAccess().getSemanticsSemanticsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_semantics_1_0=ruleSemantics();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticAdaptationRule());
              					}
              					set(
              						current,
              						"semantics",
              						lv_semantics_1_0,
              						"fr.irisa.diverse.semanticadaptation.SemAdapt.Semantics");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSemAdapt.g:123:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSemAdapt.g:124:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalSemAdapt.g:124:4: (lv_imports_2_0= ruleImport )
            	    // InternalSemAdapt.g:125:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSemanticAdaptationAccess().getImportsImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSemanticAdaptationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_2_0,
            	      						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSemAdapt.g:142:3: ( (lv_modules_3_0= ruleModule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSemAdapt.g:143:4: (lv_modules_3_0= ruleModule )
            	    {
            	    // InternalSemAdapt.g:143:4: (lv_modules_3_0= ruleModule )
            	    // InternalSemAdapt.g:144:5: lv_modules_3_0= ruleModule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSemanticAdaptationAccess().getModulesModuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_modules_3_0=ruleModule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSemanticAdaptationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"modules",
            	      						lv_modules_3_0,
            	      						"fr.irisa.diverse.semanticadaptation.SemAdapt.Module");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemanticAdaptation"


    // $ANTLR start "entryRuleSemantics"
    // InternalSemAdapt.g:165:1: entryRuleSemantics returns [EObject current=null] : iv_ruleSemantics= ruleSemantics EOF ;
    public final EObject entryRuleSemantics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemantics = null;


        try {
            // InternalSemAdapt.g:165:50: (iv_ruleSemantics= ruleSemantics EOF )
            // InternalSemAdapt.g:166:2: iv_ruleSemantics= ruleSemantics EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSemantics=ruleSemantics();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemantics; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSemantics"


    // $ANTLR start "ruleSemantics"
    // InternalSemAdapt.g:172:1: ruleSemantics returns [EObject current=null] : (otherlv_0= 'semantics' ( (lv_importURI_1_0= ruleEString ) ) ) ;
    public final EObject ruleSemantics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:178:2: ( (otherlv_0= 'semantics' ( (lv_importURI_1_0= ruleEString ) ) ) )
            // InternalSemAdapt.g:179:2: (otherlv_0= 'semantics' ( (lv_importURI_1_0= ruleEString ) ) )
            {
            // InternalSemAdapt.g:179:2: (otherlv_0= 'semantics' ( (lv_importURI_1_0= ruleEString ) ) )
            // InternalSemAdapt.g:180:3: otherlv_0= 'semantics' ( (lv_importURI_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSemanticsAccess().getSemanticsKeyword_0());
              		
            }
            // InternalSemAdapt.g:184:3: ( (lv_importURI_1_0= ruleEString ) )
            // InternalSemAdapt.g:185:4: (lv_importURI_1_0= ruleEString )
            {
            // InternalSemAdapt.g:185:4: (lv_importURI_1_0= ruleEString )
            // InternalSemAdapt.g:186:5: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticsAccess().getImportURIEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importURI_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticsRule());
              					}
              					set(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemantics"


    // $ANTLR start "entryRuleModule"
    // InternalSemAdapt.g:207:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalSemAdapt.g:207:47: (iv_ruleModule= ruleModule EOF )
            // InternalSemAdapt.g:208:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalSemAdapt.g:214:1: ruleModule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pointcuts_2_0= rulePointcut ) )* ( (lv_adaptations_3_0= ruleAdaptation ) )* otherlv_4= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_pointcuts_2_0 = null;

        EObject lv_adaptations_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:220:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pointcuts_2_0= rulePointcut ) )* ( (lv_adaptations_3_0= ruleAdaptation ) )* otherlv_4= '}' ) )
            // InternalSemAdapt.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pointcuts_2_0= rulePointcut ) )* ( (lv_adaptations_3_0= ruleAdaptation ) )* otherlv_4= '}' )
            {
            // InternalSemAdapt.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pointcuts_2_0= rulePointcut ) )* ( (lv_adaptations_3_0= ruleAdaptation ) )* otherlv_4= '}' )
            // InternalSemAdapt.g:222:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_pointcuts_2_0= rulePointcut ) )* ( (lv_adaptations_3_0= ruleAdaptation ) )* otherlv_4= '}'
            {
            // InternalSemAdapt.g:222:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSemAdapt.g:223:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSemAdapt.g:223:4: (lv_name_0_0= RULE_ID )
            // InternalSemAdapt.g:224:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSemAdapt.g:244:3: ( (lv_pointcuts_2_0= rulePointcut ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSemAdapt.g:245:4: (lv_pointcuts_2_0= rulePointcut )
            	    {
            	    // InternalSemAdapt.g:245:4: (lv_pointcuts_2_0= rulePointcut )
            	    // InternalSemAdapt.g:246:5: lv_pointcuts_2_0= rulePointcut
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getPointcutsPointcutParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_pointcuts_2_0=rulePointcut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pointcuts",
            	      						lv_pointcuts_2_0,
            	      						"fr.irisa.diverse.semanticadaptation.SemAdapt.Pointcut");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSemAdapt.g:263:3: ( (lv_adaptations_3_0= ruleAdaptation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSemAdapt.g:264:4: (lv_adaptations_3_0= ruleAdaptation )
            	    {
            	    // InternalSemAdapt.g:264:4: (lv_adaptations_3_0= ruleAdaptation )
            	    // InternalSemAdapt.g:265:5: lv_adaptations_3_0= ruleAdaptation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleAccess().getAdaptationsAdaptationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_adaptations_3_0=ruleAdaptation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"adaptations",
            	      						lv_adaptations_3_0,
            	      						"fr.irisa.diverse.semanticadaptation.SemAdapt.Adaptation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePointcut"
    // InternalSemAdapt.g:290:1: entryRulePointcut returns [EObject current=null] : iv_rulePointcut= rulePointcut EOF ;
    public final EObject entryRulePointcut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut = null;


        try {
            // InternalSemAdapt.g:290:49: (iv_rulePointcut= rulePointcut EOF )
            // InternalSemAdapt.g:291:2: iv_rulePointcut= rulePointcut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointcutRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointcut=rulePointcut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointcut; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointcut"


    // $ANTLR start "rulePointcut"
    // InternalSemAdapt.g:297:1: rulePointcut returns [EObject current=null] : ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'match' ( (lv_structure_2_0= ruleDefConfiguration ) ) (otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* )? ) ;
    public final EObject rulePointcut() throws RecognitionException {
        EObject current = null;

        Token lv_recursive_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_structure_2_0 = null;

        EObject lv_conditions_4_0 = null;

        EObject lv_conditions_6_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:303:2: ( ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'match' ( (lv_structure_2_0= ruleDefConfiguration ) ) (otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* )? ) )
            // InternalSemAdapt.g:304:2: ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'match' ( (lv_structure_2_0= ruleDefConfiguration ) ) (otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* )? )
            {
            // InternalSemAdapt.g:304:2: ( ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'match' ( (lv_structure_2_0= ruleDefConfiguration ) ) (otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* )? )
            // InternalSemAdapt.g:305:3: ( (lv_recursive_0_0= 'recursive' ) )? otherlv_1= 'match' ( (lv_structure_2_0= ruleDefConfiguration ) ) (otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* )?
            {
            // InternalSemAdapt.g:305:3: ( (lv_recursive_0_0= 'recursive' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSemAdapt.g:306:4: (lv_recursive_0_0= 'recursive' )
                    {
                    // InternalSemAdapt.g:306:4: (lv_recursive_0_0= 'recursive' )
                    // InternalSemAdapt.g:307:5: lv_recursive_0_0= 'recursive'
                    {
                    lv_recursive_0_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_recursive_0_0, grammarAccess.getPointcutAccess().getRecursiveRecursiveKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPointcutRule());
                      					}
                      					setWithLastConsumed(current, "recursive", lv_recursive_0_0 != null, "recursive");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPointcutAccess().getMatchKeyword_1());
              		
            }
            // InternalSemAdapt.g:323:3: ( (lv_structure_2_0= ruleDefConfiguration ) )
            // InternalSemAdapt.g:324:4: (lv_structure_2_0= ruleDefConfiguration )
            {
            // InternalSemAdapt.g:324:4: (lv_structure_2_0= ruleDefConfiguration )
            // InternalSemAdapt.g:325:5: lv_structure_2_0= ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPointcutAccess().getStructureDefConfigurationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_structure_2_0=ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPointcutRule());
              					}
              					set(
              						current,
              						"structure",
              						lv_structure_2_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.DefConfiguration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSemAdapt.g:342:3: (otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSemAdapt.g:343:4: otherlv_3= 'where' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPointcutAccess().getWhereKeyword_3_0());
                      			
                    }
                    // InternalSemAdapt.g:347:4: ( (lv_conditions_4_0= ruleCondition ) )
                    // InternalSemAdapt.g:348:5: (lv_conditions_4_0= ruleCondition )
                    {
                    // InternalSemAdapt.g:348:5: (lv_conditions_4_0= ruleCondition )
                    // InternalSemAdapt.g:349:6: lv_conditions_4_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPointcutAccess().getConditionsConditionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_conditions_4_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPointcutRule());
                      						}
                      						add(
                      							current,
                      							"conditions",
                      							lv_conditions_4_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Condition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:366:4: (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSemAdapt.g:367:5: otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getPointcutAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:371:5: ( (lv_conditions_6_0= ruleCondition ) )
                    	    // InternalSemAdapt.g:372:6: (lv_conditions_6_0= ruleCondition )
                    	    {
                    	    // InternalSemAdapt.g:372:6: (lv_conditions_6_0= ruleCondition )
                    	    // InternalSemAdapt.g:373:7: lv_conditions_6_0= ruleCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPointcutAccess().getConditionsConditionParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_conditions_6_0=ruleCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPointcutRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"conditions",
                    	      								lv_conditions_6_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.Condition");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointcut"


    // $ANTLR start "entryRuleAdaptation"
    // InternalSemAdapt.g:396:1: entryRuleAdaptation returns [EObject current=null] : iv_ruleAdaptation= ruleAdaptation EOF ;
    public final EObject entryRuleAdaptation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptation = null;


        try {
            // InternalSemAdapt.g:396:51: (iv_ruleAdaptation= ruleAdaptation EOF )
            // InternalSemAdapt.g:397:2: iv_ruleAdaptation= ruleAdaptation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdaptationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdaptation=ruleAdaptation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdaptation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdaptation"


    // $ANTLR start "ruleAdaptation"
    // InternalSemAdapt.g:403:1: ruleAdaptation returns [EObject current=null] : ( ( ( () otherlv_1= 'Specialization' ) | ( () otherlv_3= 'Before' ) | ( () otherlv_5= 'After' ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_adaptation_7_0= ruleRule ) ) ) ;
    public final EObject ruleAdaptation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_adaptation_7_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:409:2: ( ( ( ( () otherlv_1= 'Specialization' ) | ( () otherlv_3= 'Before' ) | ( () otherlv_5= 'After' ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_adaptation_7_0= ruleRule ) ) ) )
            // InternalSemAdapt.g:410:2: ( ( ( () otherlv_1= 'Specialization' ) | ( () otherlv_3= 'Before' ) | ( () otherlv_5= 'After' ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_adaptation_7_0= ruleRule ) ) )
            {
            // InternalSemAdapt.g:410:2: ( ( ( () otherlv_1= 'Specialization' ) | ( () otherlv_3= 'Before' ) | ( () otherlv_5= 'After' ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_adaptation_7_0= ruleRule ) ) )
            // InternalSemAdapt.g:411:3: ( ( () otherlv_1= 'Specialization' ) | ( () otherlv_3= 'Before' ) | ( () otherlv_5= 'After' ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_adaptation_7_0= ruleRule ) )
            {
            // InternalSemAdapt.g:411:3: ( ( () otherlv_1= 'Specialization' ) | ( () otherlv_3= 'Before' ) | ( () otherlv_5= 'After' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSemAdapt.g:412:4: ( () otherlv_1= 'Specialization' )
                    {
                    // InternalSemAdapt.g:412:4: ( () otherlv_1= 'Specialization' )
                    // InternalSemAdapt.g:413:5: () otherlv_1= 'Specialization'
                    {
                    // InternalSemAdapt.g:413:5: ()
                    // InternalSemAdapt.g:414:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getAdaptationAccess().getSpecializationAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getAdaptationAccess().getSpecializationKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:429:4: ( () otherlv_3= 'Before' )
                    {
                    // InternalSemAdapt.g:429:4: ( () otherlv_3= 'Before' )
                    // InternalSemAdapt.g:430:5: () otherlv_3= 'Before'
                    {
                    // InternalSemAdapt.g:430:5: ()
                    // InternalSemAdapt.g:431:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getAdaptationAccess().getBeforeAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getAdaptationAccess().getBeforeKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:446:4: ( () otherlv_5= 'After' )
                    {
                    // InternalSemAdapt.g:446:4: ( () otherlv_5= 'After' )
                    // InternalSemAdapt.g:447:5: () otherlv_5= 'After'
                    {
                    // InternalSemAdapt.g:447:5: ()
                    // InternalSemAdapt.g:448:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getAdaptationAccess().getAfterAction_0_2_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getAdaptationAccess().getAfterKeyword_0_2_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSemAdapt.g:463:3: ( (otherlv_6= RULE_ID ) )
            // InternalSemAdapt.g:464:4: (otherlv_6= RULE_ID )
            {
            // InternalSemAdapt.g:464:4: (otherlv_6= RULE_ID )
            // InternalSemAdapt.g:465:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAdaptationRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getAdaptationAccess().getTargetRuleCrossReference_1_0());
              				
            }

            }


            }

            // InternalSemAdapt.g:479:3: ( (lv_adaptation_7_0= ruleRule ) )
            // InternalSemAdapt.g:480:4: (lv_adaptation_7_0= ruleRule )
            {
            // InternalSemAdapt.g:480:4: (lv_adaptation_7_0= ruleRule )
            // InternalSemAdapt.g:481:5: lv_adaptation_7_0= ruleRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdaptationAccess().getAdaptationRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_adaptation_7_0=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdaptationRule());
              					}
              					set(
              						current,
              						"adaptation",
              						lv_adaptation_7_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdaptation"


    // $ANTLR start "entryRuleModel"
    // InternalSemAdapt.g:502:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSemAdapt.g:502:46: (iv_ruleModel= ruleModel EOF )
            // InternalSemAdapt.g:503:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSemAdapt.g:509:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:515:2: ( (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) ) )
            // InternalSemAdapt.g:516:2: (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) )
            {
            // InternalSemAdapt.g:516:2: (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) )
            // InternalSemAdapt.g:517:3: otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
              		
            }
            // InternalSemAdapt.g:521:3: ( (lv_importURI_1_0= ruleEString ) )
            // InternalSemAdapt.g:522:4: (lv_importURI_1_0= ruleEString )
            {
            // InternalSemAdapt.g:522:4: (lv_importURI_1_0= ruleEString )
            // InternalSemAdapt.g:523:5: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getImportURIEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_importURI_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getWithKeyword_2());
              		
            }
            // InternalSemAdapt.g:544:3: ( ( ruleFQN ) )
            // InternalSemAdapt.g:545:4: ( ruleFQN )
            {
            // InternalSemAdapt.g:545:4: ( ruleFQN )
            // InternalSemAdapt.g:546:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getSemanticdomainEPackageCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalSemAdapt.g:567:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSemAdapt.g:567:47: (iv_ruleImport= ruleImport EOF )
            // InternalSemAdapt.g:568:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSemAdapt.g:574:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:580:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSemAdapt.g:581:2: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSemAdapt.g:581:2: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSemAdapt.g:582:3: otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalSemAdapt.g:586:3: ( (lv_importURI_1_0= ruleEString ) )
            // InternalSemAdapt.g:587:4: (lv_importURI_1_0= ruleEString )
            {
            // InternalSemAdapt.g:587:4: (lv_importURI_1_0= ruleEString )
            // InternalSemAdapt.g:588:5: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_importURI_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
              		
            }
            // InternalSemAdapt.g:609:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSemAdapt.g:610:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSemAdapt.g:610:4: (lv_name_3_0= RULE_ID )
            // InternalSemAdapt.g:611:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRule"
    // InternalSemAdapt.g:631:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSemAdapt.g:631:45: (iv_ruleRule= ruleRule EOF )
            // InternalSemAdapt.g:632:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSemAdapt.g:638:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        EObject lv_conclusion_3_0 = null;

        EObject lv_conditions_5_0 = null;

        EObject lv_conditions_7_0 = null;

        EObject lv_premises_9_0 = null;

        EObject lv_premises_11_0 = null;

        EObject lv_bindings_13_0 = null;

        EObject lv_bindings_15_0 = null;

        EObject lv_inputs_17_0 = null;

        EObject lv_outputs_18_0 = null;

        EObject lv_inputs_20_0 = null;

        EObject lv_outputs_21_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:644:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? ) )
            // InternalSemAdapt.g:645:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? )
            {
            // InternalSemAdapt.g:645:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? )
            // InternalSemAdapt.g:646:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
              		
            }
            // InternalSemAdapt.g:650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSemAdapt.g:651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSemAdapt.g:651:4: (lv_name_1_0= RULE_ID )
            // InternalSemAdapt.g:652:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCommaKeyword_2());
              		
            }
            // InternalSemAdapt.g:672:3: ( (lv_conclusion_3_0= ruleConclusion ) )
            // InternalSemAdapt.g:673:4: (lv_conclusion_3_0= ruleConclusion )
            {
            // InternalSemAdapt.g:673:4: (lv_conclusion_3_0= ruleConclusion )
            // InternalSemAdapt.g:674:5: lv_conclusion_3_0= ruleConclusion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getConclusionConclusionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_conclusion_3_0=ruleConclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleRule());
              					}
              					set(
              						current,
              						"conclusion",
              						lv_conclusion_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Conclusion");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSemAdapt.g:691:3: (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSemAdapt.g:692:4: otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getWhereKeyword_4_0());
                      			
                    }
                    // InternalSemAdapt.g:696:4: ( (lv_conditions_5_0= ruleCondition ) )
                    // InternalSemAdapt.g:697:5: (lv_conditions_5_0= ruleCondition )
                    {
                    // InternalSemAdapt.g:697:5: (lv_conditions_5_0= ruleCondition )
                    // InternalSemAdapt.g:698:6: lv_conditions_5_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_conditions_5_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRuleRule());
                      						}
                      						add(
                      							current,
                      							"conditions",
                      							lv_conditions_5_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Condition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:715:4: (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSemAdapt.g:716:5: otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getSemicolonKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:720:5: ( (lv_conditions_7_0= ruleCondition ) )
                    	    // InternalSemAdapt.g:721:6: (lv_conditions_7_0= ruleCondition )
                    	    {
                    	    // InternalSemAdapt.g:721:6: (lv_conditions_7_0= ruleCondition )
                    	    // InternalSemAdapt.g:722:7: lv_conditions_7_0= ruleCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_conditions_7_0=ruleCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"conditions",
                    	      								lv_conditions_7_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.Condition");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSemAdapt.g:741:3: (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSemAdapt.g:742:4: otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )*
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getResolveKeyword_5_0());
                      			
                    }
                    // InternalSemAdapt.g:746:4: ( (lv_premises_9_0= rulePremise ) )
                    // InternalSemAdapt.g:747:5: (lv_premises_9_0= rulePremise )
                    {
                    // InternalSemAdapt.g:747:5: (lv_premises_9_0= rulePremise )
                    // InternalSemAdapt.g:748:6: lv_premises_9_0= rulePremise
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_premises_9_0=rulePremise();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRuleRule());
                      						}
                      						add(
                      							current,
                      							"premises",
                      							lv_premises_9_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Premise");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:765:4: (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSemAdapt.g:766:5: otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) )
                    	    {
                    	    otherlv_10=(Token)match(input,28,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getSemicolonKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:770:5: ( (lv_premises_11_0= rulePremise ) )
                    	    // InternalSemAdapt.g:771:6: (lv_premises_11_0= rulePremise )
                    	    {
                    	    // InternalSemAdapt.g:771:6: (lv_premises_11_0= rulePremise )
                    	    // InternalSemAdapt.g:772:7: lv_premises_11_0= rulePremise
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_premises_11_0=rulePremise();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"premises",
                    	      								lv_premises_11_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.Premise");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSemAdapt.g:791:3: (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSemAdapt.g:792:4: otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )*
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getBindKeyword_6_0());
                      			
                    }
                    // InternalSemAdapt.g:796:4: ( (lv_bindings_13_0= ruleBinding ) )
                    // InternalSemAdapt.g:797:5: (lv_bindings_13_0= ruleBinding )
                    {
                    // InternalSemAdapt.g:797:5: (lv_bindings_13_0= ruleBinding )
                    // InternalSemAdapt.g:798:6: lv_bindings_13_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_bindings_13_0=ruleBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRuleRule());
                      						}
                      						add(
                      							current,
                      							"bindings",
                      							lv_bindings_13_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Binding");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:815:4: (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==28) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSemAdapt.g:816:5: otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) )
                    	    {
                    	    otherlv_14=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getRuleAccess().getSemicolonKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:820:5: ( (lv_bindings_15_0= ruleBinding ) )
                    	    // InternalSemAdapt.g:821:6: (lv_bindings_15_0= ruleBinding )
                    	    {
                    	    // InternalSemAdapt.g:821:6: (lv_bindings_15_0= ruleBinding )
                    	    // InternalSemAdapt.g:822:7: lv_bindings_15_0= ruleBinding
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_bindings_15_0=ruleBinding();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"bindings",
                    	      								lv_bindings_15_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.Binding");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSemAdapt.g:841:3: (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSemAdapt.g:842:4: otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )*
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getIOKeyword_7_0());
                      			
                    }
                    // InternalSemAdapt.g:846:4: ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) )
                    int alt15=2;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // InternalSemAdapt.g:847:5: ( (lv_inputs_17_0= ruleInput ) )
                            {
                            // InternalSemAdapt.g:847:5: ( (lv_inputs_17_0= ruleInput ) )
                            // InternalSemAdapt.g:848:6: (lv_inputs_17_0= ruleInput )
                            {
                            // InternalSemAdapt.g:848:6: (lv_inputs_17_0= ruleInput )
                            // InternalSemAdapt.g:849:7: lv_inputs_17_0= ruleInput
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_inputs_17_0=ruleInput();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRuleRule());
                              							}
                              							add(
                              								current,
                              								"inputs",
                              								lv_inputs_17_0,
                              								"fr.irisa.diverse.adaptivesemantics.AdaptSem.Input");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSemAdapt.g:867:5: ( (lv_outputs_18_0= ruleOutput ) )
                            {
                            // InternalSemAdapt.g:867:5: ( (lv_outputs_18_0= ruleOutput ) )
                            // InternalSemAdapt.g:868:6: (lv_outputs_18_0= ruleOutput )
                            {
                            // InternalSemAdapt.g:868:6: (lv_outputs_18_0= ruleOutput )
                            // InternalSemAdapt.g:869:7: lv_outputs_18_0= ruleOutput
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
                            lv_outputs_18_0=ruleOutput();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRuleRule());
                              							}
                              							add(
                              								current,
                              								"outputs",
                              								lv_outputs_18_0,
                              								"fr.irisa.diverse.adaptivesemantics.AdaptSem.Output");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSemAdapt.g:887:4: (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==28) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSemAdapt.g:888:5: otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) )
                    	    {
                    	    otherlv_19=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_19, grammarAccess.getRuleAccess().getSemicolonKeyword_7_2_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:892:5: ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) )
                    	    int alt16=2;
                    	    alt16 = dfa16.predict(input);
                    	    switch (alt16) {
                    	        case 1 :
                    	            // InternalSemAdapt.g:893:6: ( (lv_inputs_20_0= ruleInput ) )
                    	            {
                    	            // InternalSemAdapt.g:893:6: ( (lv_inputs_20_0= ruleInput ) )
                    	            // InternalSemAdapt.g:894:7: (lv_inputs_20_0= ruleInput )
                    	            {
                    	            // InternalSemAdapt.g:894:7: (lv_inputs_20_0= ruleInput )
                    	            // InternalSemAdapt.g:895:8: lv_inputs_20_0= ruleInput
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_2_1_0_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_24);
                    	            lv_inputs_20_0=ruleInput();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getRuleRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"inputs",
                    	              									lv_inputs_20_0,
                    	              									"fr.irisa.diverse.adaptivesemantics.AdaptSem.Input");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSemAdapt.g:913:6: ( (lv_outputs_21_0= ruleOutput ) )
                    	            {
                    	            // InternalSemAdapt.g:913:6: ( (lv_outputs_21_0= ruleOutput ) )
                    	            // InternalSemAdapt.g:914:7: (lv_outputs_21_0= ruleOutput )
                    	            {
                    	            // InternalSemAdapt.g:914:7: (lv_outputs_21_0= ruleOutput )
                    	            // InternalSemAdapt.g:915:8: lv_outputs_21_0= ruleOutput
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_2_1_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_24);
                    	            lv_outputs_21_0=ruleOutput();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getRuleRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"outputs",
                    	              									lv_outputs_21_0,
                    	              									"fr.irisa.diverse.adaptivesemantics.AdaptSem.Output");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalSemAdapt.g:939:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSemAdapt.g:939:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSemAdapt.g:940:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSemAdapt.g:946:1: ruleCondition returns [EObject current=null] : ( () ( (lv_cond_1_0= ruleCondExpr ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:952:2: ( ( () ( (lv_cond_1_0= ruleCondExpr ) ) ) )
            // InternalSemAdapt.g:953:2: ( () ( (lv_cond_1_0= ruleCondExpr ) ) )
            {
            // InternalSemAdapt.g:953:2: ( () ( (lv_cond_1_0= ruleCondExpr ) ) )
            // InternalSemAdapt.g:954:3: () ( (lv_cond_1_0= ruleCondExpr ) )
            {
            // InternalSemAdapt.g:954:3: ()
            // InternalSemAdapt.g:955:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionAccess().getConditionAction_0(),
              					current);
              			
            }

            }

            // InternalSemAdapt.g:964:3: ( (lv_cond_1_0= ruleCondExpr ) )
            // InternalSemAdapt.g:965:4: (lv_cond_1_0= ruleCondExpr )
            {
            // InternalSemAdapt.g:965:4: (lv_cond_1_0= ruleCondExpr )
            // InternalSemAdapt.g:966:5: lv_cond_1_0= ruleCondExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getCondCondExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_cond_1_0=ruleCondExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.CondExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleInput"
    // InternalSemAdapt.g:987:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalSemAdapt.g:987:46: (iv_ruleInput= ruleInput EOF )
            // InternalSemAdapt.g:988:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalSemAdapt.g:994:1: ruleInput returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_assignee_0_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1000:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' ) )
            // InternalSemAdapt.g:1001:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' )
            {
            // InternalSemAdapt.g:1001:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' )
            // InternalSemAdapt.g:1002:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')'
            {
            // InternalSemAdapt.g:1002:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalSemAdapt.g:1003:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalSemAdapt.g:1003:4: (lv_assignee_0_0= ruleAssignee )
            // InternalSemAdapt.g:1004:5: lv_assignee_0_0= ruleAssignee
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInputAccess().getAssigneeAssigneeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_assignee_0_0=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInputRule());
              					}
              					set(
              						current,
              						"assignee",
              						lv_assignee_0_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Assignee");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSemAdapt.g:1025:3: ( ( ruleOperationFQN ) )
            // InternalSemAdapt.g:1026:4: ( ruleOperationFQN )
            {
            // InternalSemAdapt.g:1026:4: ( ruleOperationFQN )
            // InternalSemAdapt.g:1027:5: ruleOperationFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInputAccess().getOperationEOperationCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getLeftParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalSemAdapt.g:1056:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalSemAdapt.g:1056:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalSemAdapt.g:1057:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalSemAdapt.g:1063:1: ruleOutput returns [EObject current=null] : ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1069:2: ( ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) )
            // InternalSemAdapt.g:1070:2: ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            {
            // InternalSemAdapt.g:1070:2: ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            // InternalSemAdapt.g:1071:3: ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')'
            {
            // InternalSemAdapt.g:1071:3: ( ( ruleOperationFQN ) )
            // InternalSemAdapt.g:1072:4: ( ruleOperationFQN )
            {
            // InternalSemAdapt.g:1072:4: ( ruleOperationFQN )
            // InternalSemAdapt.g:1073:5: ruleOperationFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutputAccess().getOperationEOperationCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSemAdapt.g:1094:3: ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==39||LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSemAdapt.g:1095:4: ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )*
                    {
                    // InternalSemAdapt.g:1095:4: ( (lv_args_2_0= ruleTermRef ) )
                    // InternalSemAdapt.g:1096:5: (lv_args_2_0= ruleTermRef )
                    {
                    // InternalSemAdapt.g:1096:5: (lv_args_2_0= ruleTermRef )
                    // InternalSemAdapt.g:1097:6: lv_args_2_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_args_2_0=ruleTermRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOutputRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_2_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:1114:4: (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==19) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSemAdapt.g:1115:5: otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:1119:5: ( (lv_args_4_0= ruleTermRef ) )
                    	    // InternalSemAdapt.g:1120:6: (lv_args_4_0= ruleTermRef )
                    	    {
                    	    // InternalSemAdapt.g:1120:6: (lv_args_4_0= ruleTermRef )
                    	    // InternalSemAdapt.g:1121:7: lv_args_4_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_args_4_0=ruleTermRef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOutputRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_4_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermRef");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleBinding"
    // InternalSemAdapt.g:1148:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalSemAdapt.g:1148:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalSemAdapt.g:1149:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalSemAdapt.g:1155:1: ruleBinding returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignee_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1161:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) ) )
            // InternalSemAdapt.g:1162:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) )
            {
            // InternalSemAdapt.g:1162:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) )
            // InternalSemAdapt.g:1163:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) )
            {
            // InternalSemAdapt.g:1163:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalSemAdapt.g:1164:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalSemAdapt.g:1164:4: (lv_assignee_0_0= ruleAssignee )
            // InternalSemAdapt.g:1165:5: lv_assignee_0_0= ruleAssignee
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getAssigneeAssigneeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_assignee_0_0=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"assignee",
              						lv_assignee_0_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Assignee");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSemAdapt.g:1186:3: ( (lv_expr_2_0= ruleAssignable ) )
            // InternalSemAdapt.g:1187:4: (lv_expr_2_0= ruleAssignable )
            {
            // InternalSemAdapt.g:1187:4: (lv_expr_2_0= ruleAssignable )
            // InternalSemAdapt.g:1188:5: lv_expr_2_0= ruleAssignable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getExprAssignableParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAssignable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Assignable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleAssignable"
    // InternalSemAdapt.g:1209:1: entryRuleAssignable returns [EObject current=null] : iv_ruleAssignable= ruleAssignable EOF ;
    public final EObject entryRuleAssignable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignable = null;


        try {
            // InternalSemAdapt.g:1209:51: (iv_ruleAssignable= ruleAssignable EOF )
            // InternalSemAdapt.g:1210:2: iv_ruleAssignable= ruleAssignable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignable=ruleAssignable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignable"


    // $ANTLR start "ruleAssignable"
    // InternalSemAdapt.g:1216:1: ruleAssignable returns [EObject current=null] : (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess ) ;
    public final EObject ruleAssignable() throws RecognitionException {
        EObject current = null;

        EObject this_Expr_0 = null;

        EObject this_RefConfiguration_1 = null;

        EObject this_SemanticDomainAccess_2 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1222:2: ( (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess ) )
            // InternalSemAdapt.g:1223:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )
            {
            // InternalSemAdapt.g:1223:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSemAdapt.g:1224:3: this_Expr_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignableAccess().getExprParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expr_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expr_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1236:3: this_RefConfiguration_1= ruleRefConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignableAccess().getRefConfigurationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefConfiguration_1=ruleRefConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefConfiguration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:1248:3: this_SemanticDomainAccess_2= ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignableAccess().getSemanticDomainAccessParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SemanticDomainAccess_2=ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SemanticDomainAccess_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignable"


    // $ANTLR start "entryRuleAssignee"
    // InternalSemAdapt.g:1263:1: entryRuleAssignee returns [EObject current=null] : iv_ruleAssignee= ruleAssignee EOF ;
    public final EObject entryRuleAssignee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignee = null;


        try {
            // InternalSemAdapt.g:1263:49: (iv_ruleAssignee= ruleAssignee EOF )
            // InternalSemAdapt.g:1264:2: iv_ruleAssignee= ruleAssignee EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssigneeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignee=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignee; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignee"


    // $ANTLR start "ruleAssignee"
    // InternalSemAdapt.g:1270:1: ruleAssignee returns [EObject current=null] : (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess ) ;
    public final EObject ruleAssignee() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolDef_0 = null;

        EObject this_SemanticDomainAccess_1 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1276:2: ( (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess ) )
            // InternalSemAdapt.g:1277:2: (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess )
            {
            // InternalSemAdapt.g:1277:2: (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==32) ) {
                    alt22=1;
                }
                else if ( (LA22_1==35) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSemAdapt.g:1278:3: this_SymbolDef_0= ruleSymbolDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssigneeAccess().getSymbolDefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SymbolDef_0=ruleSymbolDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SymbolDef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1290:3: this_SemanticDomainAccess_1= ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssigneeAccess().getSemanticDomainAccessParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SemanticDomainAccess_1=ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SemanticDomainAccess_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignee"


    // $ANTLR start "entryRuleSemanticDomainAccess"
    // InternalSemAdapt.g:1305:1: entryRuleSemanticDomainAccess returns [EObject current=null] : iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF ;
    public final EObject entryRuleSemanticDomainAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticDomainAccess = null;


        try {
            // InternalSemAdapt.g:1305:61: (iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF )
            // InternalSemAdapt.g:1306:2: iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticDomainAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSemanticDomainAccess=ruleSemanticDomainAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemanticDomainAccess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSemanticDomainAccess"


    // $ANTLR start "ruleSemanticDomainAccess"
    // InternalSemAdapt.g:1312:1: ruleSemanticDomainAccess returns [EObject current=null] : ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* ) ;
    public final EObject ruleSemanticDomainAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        Token otherlv_4=null;
        Token lv_field_5_0=null;
        EObject lv_reciever_0_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1318:2: ( ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* ) )
            // InternalSemAdapt.g:1319:2: ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* )
            {
            // InternalSemAdapt.g:1319:2: ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* )
            // InternalSemAdapt.g:1320:3: ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )*
            {
            // InternalSemAdapt.g:1320:3: ( (lv_reciever_0_0= ruleTerminalAccessExpression ) )
            // InternalSemAdapt.g:1321:4: (lv_reciever_0_0= ruleTerminalAccessExpression )
            {
            // InternalSemAdapt.g:1321:4: (lv_reciever_0_0= ruleTerminalAccessExpression )
            // InternalSemAdapt.g:1322:5: lv_reciever_0_0= ruleTerminalAccessExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticDomainAccessAccess().getRecieverTerminalAccessExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_reciever_0_0=ruleTerminalAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticDomainAccessRule());
              					}
              					set(
              						current,
              						"reciever",
              						lv_reciever_0_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.TerminalAccessExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1());
              		
            }
            // InternalSemAdapt.g:1343:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalSemAdapt.g:1344:4: (lv_field_2_0= RULE_ID )
            {
            // InternalSemAdapt.g:1344:4: (lv_field_2_0= RULE_ID )
            // InternalSemAdapt.g:1345:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_field_2_0, grammarAccess.getSemanticDomainAccessAccess().getFieldIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSemanticDomainAccessRule());
              					}
              					setWithLastConsumed(
              						current,
              						"field",
              						lv_field_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSemAdapt.g:1361:3: ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSemAdapt.g:1362:4: () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) )
            	    {
            	    // InternalSemAdapt.g:1362:4: ()
            	    // InternalSemAdapt.g:1363:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSemanticDomainAccessAccess().getSemanticDomainAccessRecieverAction_3_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_4=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1());
            	      			
            	    }
            	    // InternalSemAdapt.g:1376:4: ( (lv_field_5_0= RULE_ID ) )
            	    // InternalSemAdapt.g:1377:5: (lv_field_5_0= RULE_ID )
            	    {
            	    // InternalSemAdapt.g:1377:5: (lv_field_5_0= RULE_ID )
            	    // InternalSemAdapt.g:1378:6: lv_field_5_0= RULE_ID
            	    {
            	    lv_field_5_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_field_5_0, grammarAccess.getSemanticDomainAccessAccess().getFieldIDTerminalRuleCall_3_2_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSemanticDomainAccessRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"field",
            	      							lv_field_5_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemanticDomainAccess"


    // $ANTLR start "entryRuleTerminalAccessExpression"
    // InternalSemAdapt.g:1399:1: entryRuleTerminalAccessExpression returns [EObject current=null] : iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF ;
    public final EObject entryRuleTerminalAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAccessExpression = null;


        try {
            // InternalSemAdapt.g:1399:65: (iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF )
            // InternalSemAdapt.g:1400:2: iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalAccessExpression=ruleTerminalAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalAccessExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalAccessExpression"


    // $ANTLR start "ruleTerminalAccessExpression"
    // InternalSemAdapt.g:1406:1: ruleTerminalAccessExpression returns [EObject current=null] : (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf ) ;
    public final EObject ruleTerminalAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolRef_0 = null;

        EObject this_Self_1 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1412:2: ( (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf ) )
            // InternalSemAdapt.g:1413:2: (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf )
            {
            // InternalSemAdapt.g:1413:2: (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemAdapt.g:1414:3: this_SymbolRef_0= ruleSymbolRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalAccessExpressionAccess().getSymbolRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SymbolRef_0=ruleSymbolRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SymbolRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1426:3: this_Self_1= ruleSelf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalAccessExpressionAccess().getSelfParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Self_1=ruleSelf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Self_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalAccessExpression"


    // $ANTLR start "entryRuleSelf"
    // InternalSemAdapt.g:1441:1: entryRuleSelf returns [EObject current=null] : iv_ruleSelf= ruleSelf EOF ;
    public final EObject entryRuleSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf = null;


        try {
            // InternalSemAdapt.g:1441:45: (iv_ruleSelf= ruleSelf EOF )
            // InternalSemAdapt.g:1442:2: iv_ruleSelf= ruleSelf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelf=ruleSelf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelf"


    // $ANTLR start "ruleSelf"
    // InternalSemAdapt.g:1448:1: ruleSelf returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:1454:2: ( ( () otherlv_1= 'self' ) )
            // InternalSemAdapt.g:1455:2: ( () otherlv_1= 'self' )
            {
            // InternalSemAdapt.g:1455:2: ( () otherlv_1= 'self' )
            // InternalSemAdapt.g:1456:3: () otherlv_1= 'self'
            {
            // InternalSemAdapt.g:1456:3: ()
            // InternalSemAdapt.g:1457:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSelfAccess().getSelfAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelfAccess().getSelfKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelf"


    // $ANTLR start "entryRuleConclusion"
    // InternalSemAdapt.g:1474:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalSemAdapt.g:1474:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalSemAdapt.g:1475:2: iv_ruleConclusion= ruleConclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConclusionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConclusion=ruleConclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConclusion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConclusion"


    // $ANTLR start "ruleConclusion"
    // InternalSemAdapt.g:1481:1: ruleConclusion returns [EObject current=null] : ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termination_2_0=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1487:2: ( ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) ) )
            // InternalSemAdapt.g:1488:2: ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) )
            {
            // InternalSemAdapt.g:1488:2: ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) )
            // InternalSemAdapt.g:1489:3: ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) )
            {
            // InternalSemAdapt.g:1489:3: ( (lv_from_0_0= ruleDefConfiguration ) )
            // InternalSemAdapt.g:1490:4: (lv_from_0_0= ruleDefConfiguration )
            {
            // InternalSemAdapt.g:1490:4: (lv_from_0_0= ruleDefConfiguration )
            // InternalSemAdapt.g:1491:5: lv_from_0_0= ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConclusionAccess().getFromDefConfigurationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_from_0_0=ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConclusionRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_0_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.DefConfiguration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalSemAdapt.g:1512:3: ( (lv_termination_2_0= 'termination' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemAdapt.g:1513:4: (lv_termination_2_0= 'termination' )
                    {
                    // InternalSemAdapt.g:1513:4: (lv_termination_2_0= 'termination' )
                    // InternalSemAdapt.g:1514:5: lv_termination_2_0= 'termination'
                    {
                    lv_termination_2_0=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_termination_2_0, grammarAccess.getConclusionAccess().getTerminationTerminationKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConclusionRule());
                      					}
                      					setWithLastConsumed(current, "termination", lv_termination_2_0 != null, "termination");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSemAdapt.g:1526:3: ( (lv_to_3_0= ruleSingleTermRef ) )
            // InternalSemAdapt.g:1527:4: (lv_to_3_0= ruleSingleTermRef )
            {
            // InternalSemAdapt.g:1527:4: (lv_to_3_0= ruleSingleTermRef )
            // InternalSemAdapt.g:1528:5: lv_to_3_0= ruleSingleTermRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConclusionAccess().getToSingleTermRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_to_3_0=ruleSingleTermRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConclusionRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SingleTermRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConclusion"


    // $ANTLR start "entryRulePremise"
    // InternalSemAdapt.g:1549:1: entryRulePremise returns [EObject current=null] : iv_rulePremise= rulePremise EOF ;
    public final EObject entryRulePremise() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePremise = null;


        try {
            // InternalSemAdapt.g:1549:48: (iv_rulePremise= rulePremise EOF )
            // InternalSemAdapt.g:1550:2: iv_rulePremise= rulePremise EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPremiseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePremise=rulePremise();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePremise; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePremise"


    // $ANTLR start "rulePremise"
    // InternalSemAdapt.g:1556:1: rulePremise returns [EObject current=null] : ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) ) ;
    public final EObject rulePremise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termination_2_0=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1562:2: ( ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) ) )
            // InternalSemAdapt.g:1563:2: ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) )
            {
            // InternalSemAdapt.g:1563:2: ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) )
            // InternalSemAdapt.g:1564:3: ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) )
            {
            // InternalSemAdapt.g:1564:3: ( (lv_from_0_0= ruleSymbolRef ) )
            // InternalSemAdapt.g:1565:4: (lv_from_0_0= ruleSymbolRef )
            {
            // InternalSemAdapt.g:1565:4: (lv_from_0_0= ruleSymbolRef )
            // InternalSemAdapt.g:1566:5: lv_from_0_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPremiseAccess().getFromSymbolRefParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_from_0_0=ruleSymbolRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPremiseRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_0_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SymbolRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalSemAdapt.g:1587:3: ( (lv_termination_2_0= 'termination' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSemAdapt.g:1588:4: (lv_termination_2_0= 'termination' )
                    {
                    // InternalSemAdapt.g:1588:4: (lv_termination_2_0= 'termination' )
                    // InternalSemAdapt.g:1589:5: lv_termination_2_0= 'termination'
                    {
                    lv_termination_2_0=(Token)match(input,38,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_termination_2_0, grammarAccess.getPremiseAccess().getTerminationTerminationKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPremiseRule());
                      					}
                      					setWithLastConsumed(current, "termination", lv_termination_2_0 != null, "termination");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSemAdapt.g:1601:3: ( (lv_to_3_0= ruleSingleTermDef ) )
            // InternalSemAdapt.g:1602:4: (lv_to_3_0= ruleSingleTermDef )
            {
            // InternalSemAdapt.g:1602:4: (lv_to_3_0= ruleSingleTermDef )
            // InternalSemAdapt.g:1603:5: lv_to_3_0= ruleSingleTermDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPremiseAccess().getToSingleTermDefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_to_3_0=ruleSingleTermDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPremiseRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SingleTermDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePremise"


    // $ANTLR start "entryRuleTermDef"
    // InternalSemAdapt.g:1624:1: entryRuleTermDef returns [EObject current=null] : iv_ruleTermDef= ruleTermDef EOF ;
    public final EObject entryRuleTermDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermDef = null;


        try {
            // InternalSemAdapt.g:1624:48: (iv_ruleTermDef= ruleTermDef EOF )
            // InternalSemAdapt.g:1625:2: iv_ruleTermDef= ruleTermDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTermDef=ruleTermDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermDef"


    // $ANTLR start "ruleTermDef"
    // InternalSemAdapt.g:1631:1: ruleTermDef returns [EObject current=null] : (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList ) ;
    public final EObject ruleTermDef() throws RecognitionException {
        EObject current = null;

        EObject this_SingleTermDef_0 = null;

        EObject this_ListDef_1 = null;

        EObject this_VoidList_2 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1637:2: ( (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList ) )
            // InternalSemAdapt.g:1638:2: (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList )
            {
            // InternalSemAdapt.g:1638:2: (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 42:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSemAdapt.g:1639:3: this_SingleTermDef_0= ruleSingleTermDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermDefAccess().getSingleTermDefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SingleTermDef_0=ruleSingleTermDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SingleTermDef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1651:3: this_ListDef_1= ruleListDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermDefAccess().getListDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListDef_1=ruleListDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:1663:3: this_VoidList_2= ruleVoidList
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermDefAccess().getVoidListParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VoidList_2=ruleVoidList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VoidList_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermDef"


    // $ANTLR start "entryRuleTermRef"
    // InternalSemAdapt.g:1678:1: entryRuleTermRef returns [EObject current=null] : iv_ruleTermRef= ruleTermRef EOF ;
    public final EObject entryRuleTermRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermRef = null;


        try {
            // InternalSemAdapt.g:1678:48: (iv_ruleTermRef= ruleTermRef EOF )
            // InternalSemAdapt.g:1679:2: iv_ruleTermRef= ruleTermRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTermRef=ruleTermRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermRef"


    // $ANTLR start "ruleTermRef"
    // InternalSemAdapt.g:1685:1: ruleTermRef returns [EObject current=null] : (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList ) ;
    public final EObject ruleTermRef() throws RecognitionException {
        EObject current = null;

        EObject this_SingleTermRef_0 = null;

        EObject this_ListRef_1 = null;

        EObject this_VoidList_2 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1691:2: ( (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList ) )
            // InternalSemAdapt.g:1692:2: (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList )
            {
            // InternalSemAdapt.g:1692:2: (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case 39:
                {
                alt28=2;
                }
                break;
            case 42:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSemAdapt.g:1693:3: this_SingleTermRef_0= ruleSingleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermRefAccess().getSingleTermRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SingleTermRef_0=ruleSingleTermRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SingleTermRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1705:3: this_ListRef_1= ruleListRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermRefAccess().getListRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListRef_1=ruleListRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:1717:3: this_VoidList_2= ruleVoidList
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermRefAccess().getVoidListParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VoidList_2=ruleVoidList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VoidList_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermRef"


    // $ANTLR start "entryRuleSingleTermDef"
    // InternalSemAdapt.g:1732:1: entryRuleSingleTermDef returns [EObject current=null] : iv_ruleSingleTermDef= ruleSingleTermDef EOF ;
    public final EObject entryRuleSingleTermDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTermDef = null;


        try {
            // InternalSemAdapt.g:1732:54: (iv_ruleSingleTermDef= ruleSingleTermDef EOF )
            // InternalSemAdapt.g:1733:2: iv_ruleSingleTermDef= ruleSingleTermDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleTermDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleTermDef=ruleSingleTermDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleTermDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleTermDef"


    // $ANTLR start "ruleSingleTermDef"
    // InternalSemAdapt.g:1739:1: ruleSingleTermDef returns [EObject current=null] : (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef ) ;
    public final EObject ruleSingleTermDef() throws RecognitionException {
        EObject current = null;

        EObject this_DefConfiguration_0 = null;

        EObject this_SymbolDef_1 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1745:2: ( (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef ) )
            // InternalSemAdapt.g:1746:2: (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef )
            {
            // InternalSemAdapt.g:1746:2: (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==33||LA29_1==35) ) {
                    alt29=1;
                }
                else if ( (LA29_1==EOF||LA29_1==15||(LA29_1>=19 && LA29_1<=22)||LA29_1==28||(LA29_1>=30 && LA29_1<=31)||LA29_1==34||LA29_1==40) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSemAdapt.g:1747:3: this_DefConfiguration_0= ruleDefConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleTermDefAccess().getDefConfigurationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefConfiguration_0=ruleDefConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefConfiguration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1759:3: this_SymbolDef_1= ruleSymbolDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleTermDefAccess().getSymbolDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SymbolDef_1=ruleSymbolDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SymbolDef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleTermDef"


    // $ANTLR start "entryRuleSingleTermRef"
    // InternalSemAdapt.g:1774:1: entryRuleSingleTermRef returns [EObject current=null] : iv_ruleSingleTermRef= ruleSingleTermRef EOF ;
    public final EObject entryRuleSingleTermRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTermRef = null;


        try {
            // InternalSemAdapt.g:1774:54: (iv_ruleSingleTermRef= ruleSingleTermRef EOF )
            // InternalSemAdapt.g:1775:2: iv_ruleSingleTermRef= ruleSingleTermRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleTermRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleTermRef=ruleSingleTermRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleTermRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleTermRef"


    // $ANTLR start "ruleSingleTermRef"
    // InternalSemAdapt.g:1781:1: ruleSingleTermRef returns [EObject current=null] : ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef ) ;
    public final EObject ruleSingleTermRef() throws RecognitionException {
        EObject current = null;

        EObject this_RefConfiguration_0 = null;

        EObject this_SymbolRef_1 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1787:2: ( ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef ) )
            // InternalSemAdapt.g:1788:2: ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef )
            {
            // InternalSemAdapt.g:1788:2: ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||LA30_1==15||(LA30_1>=18 && LA30_1<=22)||(LA30_1>=29 && LA30_1<=31)||LA30_1==34) ) {
                    alt30=2;
                }
                else if ( (LA30_1==33||LA30_1==35) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemAdapt.g:1789:3: ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration )
                    {
                    // InternalSemAdapt.g:1789:3: ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration )
                    // InternalSemAdapt.g:1790:4: ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSingleTermRefAccess().getRefConfigurationParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RefConfiguration_0=ruleRefConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RefConfiguration_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:1804:3: this_SymbolRef_1= ruleSymbolRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleTermRefAccess().getSymbolRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SymbolRef_1=ruleSymbolRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SymbolRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleTermRef"


    // $ANTLR start "entryRuleDefConfiguration"
    // InternalSemAdapt.g:1819:1: entryRuleDefConfiguration returns [EObject current=null] : iv_ruleDefConfiguration= ruleDefConfiguration EOF ;
    public final EObject entryRuleDefConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefConfiguration = null;


        try {
            // InternalSemAdapt.g:1819:57: (iv_ruleDefConfiguration= ruleDefConfiguration EOF )
            // InternalSemAdapt.g:1820:2: iv_ruleDefConfiguration= ruleDefConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefConfiguration=ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefConfiguration"


    // $ANTLR start "ruleDefConfiguration"
    // InternalSemAdapt.g:1826:1: ruleDefConfiguration returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleDefConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_childs_2_0 = null;

        EObject lv_childs_4_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1832:2: ( ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' ) )
            // InternalSemAdapt.g:1833:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' )
            {
            // InternalSemAdapt.g:1833:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' )
            // InternalSemAdapt.g:1834:3: ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')'
            {
            // InternalSemAdapt.g:1834:3: ( ( ruleFQN ) )
            // InternalSemAdapt.g:1835:4: ( ruleFQN )
            {
            // InternalSemAdapt.g:1835:4: ( ruleFQN )
            // InternalSemAdapt.g:1836:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefConfigurationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefConfigurationAccess().getConceptEClassCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefConfigurationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSemAdapt.g:1857:3: ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==39||LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSemAdapt.g:1858:4: ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )*
                    {
                    // InternalSemAdapt.g:1858:4: ( (lv_childs_2_0= ruleTermDef ) )
                    // InternalSemAdapt.g:1859:5: (lv_childs_2_0= ruleTermDef )
                    {
                    // InternalSemAdapt.g:1859:5: (lv_childs_2_0= ruleTermDef )
                    // InternalSemAdapt.g:1860:6: lv_childs_2_0= ruleTermDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_childs_2_0=ruleTermDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefConfigurationRule());
                      						}
                      						add(
                      							current,
                      							"childs",
                      							lv_childs_2_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:1877:4: (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==19) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSemAdapt.g:1878:5: otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDefConfigurationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:1882:5: ( (lv_childs_4_0= ruleTermDef ) )
                    	    // InternalSemAdapt.g:1883:6: (lv_childs_4_0= ruleTermDef )
                    	    {
                    	    // InternalSemAdapt.g:1883:6: (lv_childs_4_0= ruleTermDef )
                    	    // InternalSemAdapt.g:1884:7: lv_childs_4_0= ruleTermDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_childs_4_0=ruleTermDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefConfigurationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"childs",
                    	      								lv_childs_4_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermDef");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefConfigurationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefConfiguration"


    // $ANTLR start "entryRuleRefConfiguration"
    // InternalSemAdapt.g:1911:1: entryRuleRefConfiguration returns [EObject current=null] : iv_ruleRefConfiguration= ruleRefConfiguration EOF ;
    public final EObject entryRuleRefConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefConfiguration = null;


        try {
            // InternalSemAdapt.g:1911:57: (iv_ruleRefConfiguration= ruleRefConfiguration EOF )
            // InternalSemAdapt.g:1912:2: iv_ruleRefConfiguration= ruleRefConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefConfiguration=ruleRefConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefConfiguration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefConfiguration"


    // $ANTLR start "ruleRefConfiguration"
    // InternalSemAdapt.g:1918:1: ruleRefConfiguration returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleRefConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_childs_2_0 = null;

        EObject lv_childs_4_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:1924:2: ( ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) )
            // InternalSemAdapt.g:1925:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            {
            // InternalSemAdapt.g:1925:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            // InternalSemAdapt.g:1926:3: ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')'
            {
            // InternalSemAdapt.g:1926:3: ( ( ruleFQN ) )
            // InternalSemAdapt.g:1927:4: ( ruleFQN )
            {
            // InternalSemAdapt.g:1927:4: ( ruleFQN )
            // InternalSemAdapt.g:1928:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRefConfigurationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefConfigurationAccess().getConceptEClassCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRefConfigurationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSemAdapt.g:1949:3: ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==39||LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSemAdapt.g:1950:4: ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )*
                    {
                    // InternalSemAdapt.g:1950:4: ( (lv_childs_2_0= ruleTermRef ) )
                    // InternalSemAdapt.g:1951:5: (lv_childs_2_0= ruleTermRef )
                    {
                    // InternalSemAdapt.g:1951:5: (lv_childs_2_0= ruleTermRef )
                    // InternalSemAdapt.g:1952:6: lv_childs_2_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_childs_2_0=ruleTermRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefConfigurationRule());
                      						}
                      						add(
                      							current,
                      							"childs",
                      							lv_childs_2_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSemAdapt.g:1969:4: (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==19) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSemAdapt.g:1970:5: otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRefConfigurationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSemAdapt.g:1974:5: ( (lv_childs_4_0= ruleTermRef ) )
                    	    // InternalSemAdapt.g:1975:6: (lv_childs_4_0= ruleTermRef )
                    	    {
                    	    // InternalSemAdapt.g:1975:6: (lv_childs_4_0= ruleTermRef )
                    	    // InternalSemAdapt.g:1976:7: lv_childs_4_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_childs_4_0=ruleTermRef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRefConfigurationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"childs",
                    	      								lv_childs_4_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermRef");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRefConfigurationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefConfiguration"


    // $ANTLR start "entryRuleSymbolDef"
    // InternalSemAdapt.g:2003:1: entryRuleSymbolDef returns [EObject current=null] : iv_ruleSymbolDef= ruleSymbolDef EOF ;
    public final EObject entryRuleSymbolDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolDef = null;


        try {
            // InternalSemAdapt.g:2003:50: (iv_ruleSymbolDef= ruleSymbolDef EOF )
            // InternalSemAdapt.g:2004:2: iv_ruleSymbolDef= ruleSymbolDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbolDef=ruleSymbolDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolDef"


    // $ANTLR start "ruleSymbolDef"
    // InternalSemAdapt.g:2010:1: ruleSymbolDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:2016:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSemAdapt.g:2017:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSemAdapt.g:2017:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSemAdapt.g:2018:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSemAdapt.g:2018:3: ()
            // InternalSemAdapt.g:2019:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSymbolDefAccess().getSymbolDefAction_0(),
              					current);
              			
            }

            }

            // InternalSemAdapt.g:2028:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSemAdapt.g:2029:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSemAdapt.g:2029:4: (lv_name_1_0= RULE_ID )
            // InternalSemAdapt.g:2030:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSymbolDefAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSymbolDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolDef"


    // $ANTLR start "entryRuleSymbolRef"
    // InternalSemAdapt.g:2050:1: entryRuleSymbolRef returns [EObject current=null] : iv_ruleSymbolRef= ruleSymbolRef EOF ;
    public final EObject entryRuleSymbolRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolRef = null;


        try {
            // InternalSemAdapt.g:2050:50: (iv_ruleSymbolRef= ruleSymbolRef EOF )
            // InternalSemAdapt.g:2051:2: iv_ruleSymbolRef= ruleSymbolRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbolRef=ruleSymbolRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolRef"


    // $ANTLR start "ruleSymbolRef"
    // InternalSemAdapt.g:2057:1: ruleSymbolRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSymbolRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:2063:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSemAdapt.g:2064:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSemAdapt.g:2064:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalSemAdapt.g:2065:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalSemAdapt.g:2065:3: ()
            // InternalSemAdapt.g:2066:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSymbolRefAccess().getSymbolRefAction_0(),
              					current);
              			
            }

            }

            // InternalSemAdapt.g:2075:3: ( (otherlv_1= RULE_ID ) )
            // InternalSemAdapt.g:2076:4: (otherlv_1= RULE_ID )
            {
            // InternalSemAdapt.g:2076:4: (otherlv_1= RULE_ID )
            // InternalSemAdapt.g:2077:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSymbolRefRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSymbolRefAccess().getDefSymbolDefCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolRef"


    // $ANTLR start "entryRuleListDef"
    // InternalSemAdapt.g:2095:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalSemAdapt.g:2095:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalSemAdapt.g:2096:2: iv_ruleListDef= ruleListDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListDef=ruleListDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListDef"


    // $ANTLR start "ruleListDef"
    // InternalSemAdapt.g:2102:1: ruleListDef returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2108:2: ( (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' ) )
            // InternalSemAdapt.g:2109:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' )
            {
            // InternalSemAdapt.g:2109:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' )
            // InternalSemAdapt.g:2110:3: otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalSemAdapt.g:2114:3: ( (lv_head_1_0= ruleSingleTermDef ) )
            // InternalSemAdapt.g:2115:4: (lv_head_1_0= ruleSingleTermDef )
            {
            // InternalSemAdapt.g:2115:4: (lv_head_1_0= ruleSingleTermDef )
            // InternalSemAdapt.g:2116:5: lv_head_1_0= ruleSingleTermDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getHeadSingleTermDefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_head_1_0=ruleSingleTermDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListDefRule());
              					}
              					set(
              						current,
              						"head",
              						lv_head_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SingleTermDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListDefAccess().getVerticalLineKeyword_2());
              		
            }
            // InternalSemAdapt.g:2137:3: ( (lv_tail_3_0= ruleSymbolDef ) )
            // InternalSemAdapt.g:2138:4: (lv_tail_3_0= ruleSymbolDef )
            {
            // InternalSemAdapt.g:2138:4: (lv_tail_3_0= ruleSymbolDef )
            // InternalSemAdapt.g:2139:5: lv_tail_3_0= ruleSymbolDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getTailSymbolDefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_tail_3_0=ruleSymbolDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListDefRule());
              					}
              					set(
              						current,
              						"tail",
              						lv_tail_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SymbolDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getListDefAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListDef"


    // $ANTLR start "entryRuleListRef"
    // InternalSemAdapt.g:2164:1: entryRuleListRef returns [EObject current=null] : iv_ruleListRef= ruleListRef EOF ;
    public final EObject entryRuleListRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListRef = null;


        try {
            // InternalSemAdapt.g:2164:48: (iv_ruleListRef= ruleListRef EOF )
            // InternalSemAdapt.g:2165:2: iv_ruleListRef= ruleListRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListRef=ruleListRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListRef"


    // $ANTLR start "ruleListRef"
    // InternalSemAdapt.g:2171:1: ruleListRef returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' ) ;
    public final EObject ruleListRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2177:2: ( (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' ) )
            // InternalSemAdapt.g:2178:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' )
            {
            // InternalSemAdapt.g:2178:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' )
            // InternalSemAdapt.g:2179:3: otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalSemAdapt.g:2183:3: ( (lv_head_1_0= ruleSymbolRef ) )
            // InternalSemAdapt.g:2184:4: (lv_head_1_0= ruleSymbolRef )
            {
            // InternalSemAdapt.g:2184:4: (lv_head_1_0= ruleSymbolRef )
            // InternalSemAdapt.g:2185:5: lv_head_1_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListRefAccess().getHeadSymbolRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_head_1_0=ruleSymbolRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListRefRule());
              					}
              					set(
              						current,
              						"head",
              						lv_head_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SymbolRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListRefAccess().getVerticalLineKeyword_2());
              		
            }
            // InternalSemAdapt.g:2206:3: ( (lv_tail_3_0= ruleSymbolRef ) )
            // InternalSemAdapt.g:2207:4: (lv_tail_3_0= ruleSymbolRef )
            {
            // InternalSemAdapt.g:2207:4: (lv_tail_3_0= ruleSymbolRef )
            // InternalSemAdapt.g:2208:5: lv_tail_3_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListRefAccess().getTailSymbolRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_tail_3_0=ruleSymbolRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListRefRule());
              					}
              					set(
              						current,
              						"tail",
              						lv_tail_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.SymbolRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getListRefAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListRef"


    // $ANTLR start "entryRuleVoidList"
    // InternalSemAdapt.g:2233:1: entryRuleVoidList returns [EObject current=null] : iv_ruleVoidList= ruleVoidList EOF ;
    public final EObject entryRuleVoidList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidList = null;


        try {
            // InternalSemAdapt.g:2233:49: (iv_ruleVoidList= ruleVoidList EOF )
            // InternalSemAdapt.g:2234:2: iv_ruleVoidList= ruleVoidList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoidListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVoidList=ruleVoidList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoidList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidList"


    // $ANTLR start "ruleVoidList"
    // InternalSemAdapt.g:2240:1: ruleVoidList returns [EObject current=null] : ( () otherlv_1= '[]' ) ;
    public final EObject ruleVoidList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:2246:2: ( ( () otherlv_1= '[]' ) )
            // InternalSemAdapt.g:2247:2: ( () otherlv_1= '[]' )
            {
            // InternalSemAdapt.g:2247:2: ( () otherlv_1= '[]' )
            // InternalSemAdapt.g:2248:3: () otherlv_1= '[]'
            {
            // InternalSemAdapt.g:2248:3: ()
            // InternalSemAdapt.g:2249:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVoidListAccess().getVoidListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVoidListAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidList"


    // $ANTLR start "entryRuleCondExpr"
    // InternalSemAdapt.g:2266:1: entryRuleCondExpr returns [EObject current=null] : iv_ruleCondExpr= ruleCondExpr EOF ;
    public final EObject entryRuleCondExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondExpr = null;


        try {
            // InternalSemAdapt.g:2266:49: (iv_ruleCondExpr= ruleCondExpr EOF )
            // InternalSemAdapt.g:2267:2: iv_ruleCondExpr= ruleCondExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondExpr=ruleCondExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondExpr"


    // $ANTLR start "ruleCondExpr"
    // InternalSemAdapt.g:2273:1: ruleCondExpr returns [EObject current=null] : (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs ) ;
    public final EObject ruleCondExpr() throws RecognitionException {
        EObject current = null;

        EObject this_CondOr_0 = null;

        EObject this_CondAnd_1 = null;

        EObject this_CondEquality_2 = null;

        EObject this_CondComparison_3 = null;

        EObject this_CondNot_4 = null;

        EObject this_CondIs_5 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2279:2: ( (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs ) )
            // InternalSemAdapt.g:2280:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs )
            {
            // InternalSemAdapt.g:2280:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs )
            int alt35=6;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalSemAdapt.g:2281:3: this_CondOr_0= ruleCondOr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCondExprAccess().getCondOrParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CondOr_0=ruleCondOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CondOr_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:2293:3: this_CondAnd_1= ruleCondAnd
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCondExprAccess().getCondAndParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CondAnd_1=ruleCondAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CondAnd_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:2305:3: this_CondEquality_2= ruleCondEquality
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCondExprAccess().getCondEqualityParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CondEquality_2=ruleCondEquality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CondEquality_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSemAdapt.g:2317:3: this_CondComparison_3= ruleCondComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCondExprAccess().getCondComparisonParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CondComparison_3=ruleCondComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CondComparison_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSemAdapt.g:2329:3: this_CondNot_4= ruleCondNot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCondExprAccess().getCondNotParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CondNot_4=ruleCondNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CondNot_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSemAdapt.g:2341:3: this_CondIs_5= ruleCondIs
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCondExprAccess().getCondIsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CondIs_5=ruleCondIs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CondIs_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondExpr"


    // $ANTLR start "entryRuleCondNot"
    // InternalSemAdapt.g:2356:1: entryRuleCondNot returns [EObject current=null] : iv_ruleCondNot= ruleCondNot EOF ;
    public final EObject entryRuleCondNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondNot = null;


        try {
            // InternalSemAdapt.g:2356:48: (iv_ruleCondNot= ruleCondNot EOF )
            // InternalSemAdapt.g:2357:2: iv_ruleCondNot= ruleCondNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondNot=ruleCondNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondNot"


    // $ANTLR start "ruleCondNot"
    // InternalSemAdapt.g:2363:1: ruleCondNot returns [EObject current=null] : ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleCondNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2369:2: ( ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalSemAdapt.g:2370:2: ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalSemAdapt.g:2370:2: ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalSemAdapt.g:2371:3: () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalSemAdapt.g:2371:3: ()
            // InternalSemAdapt.g:2372:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCondNotAccess().getNotAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1());
              		
            }
            // InternalSemAdapt.g:2385:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalSemAdapt.g:2386:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalSemAdapt.g:2386:4: (lv_expr_2_0= ruleExpr )
            // InternalSemAdapt.g:2387:5: lv_expr_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondNotAccess().getExprExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondNotRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondNot"


    // $ANTLR start "entryRuleCondOr"
    // InternalSemAdapt.g:2408:1: entryRuleCondOr returns [EObject current=null] : iv_ruleCondOr= ruleCondOr EOF ;
    public final EObject entryRuleCondOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondOr = null;


        try {
            // InternalSemAdapt.g:2408:47: (iv_ruleCondOr= ruleCondOr EOF )
            // InternalSemAdapt.g:2409:2: iv_ruleCondOr= ruleCondOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondOr=ruleCondOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondOr"


    // $ANTLR start "ruleCondOr"
    // InternalSemAdapt.g:2415:1: ruleCondOr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) ) ;
    public final EObject ruleCondOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2421:2: ( ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) ) )
            // InternalSemAdapt.g:2422:2: ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )
            {
            // InternalSemAdapt.g:2422:2: ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )
            // InternalSemAdapt.g:2423:3: () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            {
            // InternalSemAdapt.g:2423:3: ()
            // InternalSemAdapt.g:2424:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCondOrAccess().getOrAction_0(),
              					current);
              			
            }

            }

            // InternalSemAdapt.g:2433:3: ( (lv_lhs_1_0= ruleAnd ) )
            // InternalSemAdapt.g:2434:4: (lv_lhs_1_0= ruleAnd )
            {
            // InternalSemAdapt.g:2434:4: (lv_lhs_1_0= ruleAnd )
            // InternalSemAdapt.g:2435:5: lv_lhs_1_0= ruleAnd
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondOrAccess().getLhsAndParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_lhs_1_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondOrRule());
              					}
              					set(
              						current,
              						"lhs",
              						lv_lhs_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.And");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2());
              		
            }
            // InternalSemAdapt.g:2456:3: ( (lv_rhs_3_0= ruleAnd ) )
            // InternalSemAdapt.g:2457:4: (lv_rhs_3_0= ruleAnd )
            {
            // InternalSemAdapt.g:2457:4: (lv_rhs_3_0= ruleAnd )
            // InternalSemAdapt.g:2458:5: lv_rhs_3_0= ruleAnd
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondOrAccess().getRhsAndParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rhs_3_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondOrRule());
              					}
              					set(
              						current,
              						"rhs",
              						lv_rhs_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.And");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondOr"


    // $ANTLR start "entryRuleCondAnd"
    // InternalSemAdapt.g:2479:1: entryRuleCondAnd returns [EObject current=null] : iv_ruleCondAnd= ruleCondAnd EOF ;
    public final EObject entryRuleCondAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondAnd = null;


        try {
            // InternalSemAdapt.g:2479:48: (iv_ruleCondAnd= ruleCondAnd EOF )
            // InternalSemAdapt.g:2480:2: iv_ruleCondAnd= ruleCondAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondAnd=ruleCondAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondAnd"


    // $ANTLR start "ruleCondAnd"
    // InternalSemAdapt.g:2486:1: ruleCondAnd returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) ) ;
    public final EObject ruleCondAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2492:2: ( ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) ) )
            // InternalSemAdapt.g:2493:2: ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )
            {
            // InternalSemAdapt.g:2493:2: ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )
            // InternalSemAdapt.g:2494:3: () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            {
            // InternalSemAdapt.g:2494:3: ()
            // InternalSemAdapt.g:2495:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCondAndAccess().getAndAction_0(),
              					current);
              			
            }

            }

            // InternalSemAdapt.g:2504:3: ( (lv_lhs_1_0= ruleEquality ) )
            // InternalSemAdapt.g:2505:4: (lv_lhs_1_0= ruleEquality )
            {
            // InternalSemAdapt.g:2505:4: (lv_lhs_1_0= ruleEquality )
            // InternalSemAdapt.g:2506:5: lv_lhs_1_0= ruleEquality
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondAndAccess().getLhsEqualityParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_lhs_1_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondAndRule());
              					}
              					set(
              						current,
              						"lhs",
              						lv_lhs_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Equality");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2());
              		
            }
            // InternalSemAdapt.g:2527:3: ( (lv_rhs_3_0= ruleEquality ) )
            // InternalSemAdapt.g:2528:4: (lv_rhs_3_0= ruleEquality )
            {
            // InternalSemAdapt.g:2528:4: (lv_rhs_3_0= ruleEquality )
            // InternalSemAdapt.g:2529:5: lv_rhs_3_0= ruleEquality
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondAndAccess().getRhsEqualityParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rhs_3_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondAndRule());
              					}
              					set(
              						current,
              						"rhs",
              						lv_rhs_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Equality");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondAnd"


    // $ANTLR start "entryRuleCondEquality"
    // InternalSemAdapt.g:2550:1: entryRuleCondEquality returns [EObject current=null] : iv_ruleCondEquality= ruleCondEquality EOF ;
    public final EObject entryRuleCondEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondEquality = null;


        try {
            // InternalSemAdapt.g:2550:53: (iv_ruleCondEquality= ruleCondEquality EOF )
            // InternalSemAdapt.g:2551:2: iv_ruleCondEquality= ruleCondEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondEquality=ruleCondEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondEquality"


    // $ANTLR start "ruleCondEquality"
    // InternalSemAdapt.g:2557:1: ruleCondEquality returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) ) ;
    public final EObject ruleCondEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_lhs_5_0 = null;

        EObject lv_rhs_7_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2563:2: ( ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) ) )
            // InternalSemAdapt.g:2564:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )
            {
            // InternalSemAdapt.g:2564:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalSemAdapt.g:2565:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
                    {
                    // InternalSemAdapt.g:2565:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
                    // InternalSemAdapt.g:2566:4: () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) )
                    {
                    // InternalSemAdapt.g:2566:4: ()
                    // InternalSemAdapt.g:2567:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCondEqualityAccess().getEqualAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:2576:4: ( (lv_lhs_1_0= ruleComparison ) )
                    // InternalSemAdapt.g:2577:5: (lv_lhs_1_0= ruleComparison )
                    {
                    // InternalSemAdapt.g:2577:5: (lv_lhs_1_0= ruleComparison )
                    // InternalSemAdapt.g:2578:6: lv_lhs_1_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_lhs_1_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondEqualityRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_1_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Comparison");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2());
                      			
                    }
                    // InternalSemAdapt.g:2599:4: ( (lv_rhs_3_0= ruleComparison ) )
                    // InternalSemAdapt.g:2600:5: (lv_rhs_3_0= ruleComparison )
                    {
                    // InternalSemAdapt.g:2600:5: (lv_rhs_3_0= ruleComparison )
                    // InternalSemAdapt.g:2601:6: lv_rhs_3_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_3_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondEqualityRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Comparison");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:2620:3: ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) )
                    {
                    // InternalSemAdapt.g:2620:3: ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) )
                    // InternalSemAdapt.g:2621:4: () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) )
                    {
                    // InternalSemAdapt.g:2621:4: ()
                    // InternalSemAdapt.g:2622:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCondEqualityAccess().getNotEqualAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:2631:4: ( (lv_lhs_5_0= ruleComparison ) )
                    // InternalSemAdapt.g:2632:5: (lv_lhs_5_0= ruleComparison )
                    {
                    // InternalSemAdapt.g:2632:5: (lv_lhs_5_0= ruleComparison )
                    // InternalSemAdapt.g:2633:6: lv_lhs_5_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_lhs_5_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondEqualityRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_5_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Comparison");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,47,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalSemAdapt.g:2654:4: ( (lv_rhs_7_0= ruleComparison ) )
                    // InternalSemAdapt.g:2655:5: (lv_rhs_7_0= ruleComparison )
                    {
                    // InternalSemAdapt.g:2655:5: (lv_rhs_7_0= ruleComparison )
                    // InternalSemAdapt.g:2656:6: lv_rhs_7_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_7_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondEqualityRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_7_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Comparison");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondEquality"


    // $ANTLR start "entryRuleCondComparison"
    // InternalSemAdapt.g:2678:1: entryRuleCondComparison returns [EObject current=null] : iv_ruleCondComparison= ruleCondComparison EOF ;
    public final EObject entryRuleCondComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondComparison = null;


        try {
            // InternalSemAdapt.g:2678:55: (iv_ruleCondComparison= ruleCondComparison EOF )
            // InternalSemAdapt.g:2679:2: iv_ruleCondComparison= ruleCondComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondComparison=ruleCondComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondComparison"


    // $ANTLR start "ruleCondComparison"
    // InternalSemAdapt.g:2685:1: ruleCondComparison returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) ) ;
    public final EObject ruleCondComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_lhs_5_0 = null;

        EObject lv_rhs_7_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2691:2: ( ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) ) )
            // InternalSemAdapt.g:2692:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )
            {
            // InternalSemAdapt.g:2692:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalSemAdapt.g:2693:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
                    {
                    // InternalSemAdapt.g:2693:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
                    // InternalSemAdapt.g:2694:4: () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) )
                    {
                    // InternalSemAdapt.g:2694:4: ()
                    // InternalSemAdapt.g:2695:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCondComparisonAccess().getLessAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:2704:4: ( (lv_lhs_1_0= rulePlusOrMinus ) )
                    // InternalSemAdapt.g:2705:5: (lv_lhs_1_0= rulePlusOrMinus )
                    {
                    // InternalSemAdapt.g:2705:5: (lv_lhs_1_0= rulePlusOrMinus )
                    // InternalSemAdapt.g:2706:6: lv_lhs_1_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_lhs_1_0=rulePlusOrMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondComparisonRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_1_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.PlusOrMinus");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2());
                      			
                    }
                    // InternalSemAdapt.g:2727:4: ( (lv_rhs_3_0= rulePlusOrMinus ) )
                    // InternalSemAdapt.g:2728:5: (lv_rhs_3_0= rulePlusOrMinus )
                    {
                    // InternalSemAdapt.g:2728:5: (lv_rhs_3_0= rulePlusOrMinus )
                    // InternalSemAdapt.g:2729:6: lv_rhs_3_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_3_0=rulePlusOrMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondComparisonRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.PlusOrMinus");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:2748:3: ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) )
                    {
                    // InternalSemAdapt.g:2748:3: ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) )
                    // InternalSemAdapt.g:2749:4: () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) )
                    {
                    // InternalSemAdapt.g:2749:4: ()
                    // InternalSemAdapt.g:2750:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCondComparisonAccess().getLessEqAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:2759:4: ( (lv_lhs_5_0= rulePlusOrMinus ) )
                    // InternalSemAdapt.g:2760:5: (lv_lhs_5_0= rulePlusOrMinus )
                    {
                    // InternalSemAdapt.g:2760:5: (lv_lhs_5_0= rulePlusOrMinus )
                    // InternalSemAdapt.g:2761:6: lv_lhs_5_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_lhs_5_0=rulePlusOrMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondComparisonRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_5_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.PlusOrMinus");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,49,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalSemAdapt.g:2782:4: ( (lv_rhs_7_0= rulePlusOrMinus ) )
                    // InternalSemAdapt.g:2783:5: (lv_rhs_7_0= rulePlusOrMinus )
                    {
                    // InternalSemAdapt.g:2783:5: (lv_rhs_7_0= rulePlusOrMinus )
                    // InternalSemAdapt.g:2784:6: lv_rhs_7_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_7_0=rulePlusOrMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCondComparisonRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_7_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.PlusOrMinus");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondComparison"


    // $ANTLR start "entryRuleCondIs"
    // InternalSemAdapt.g:2806:1: entryRuleCondIs returns [EObject current=null] : iv_ruleCondIs= ruleCondIs EOF ;
    public final EObject entryRuleCondIs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondIs = null;


        try {
            // InternalSemAdapt.g:2806:47: (iv_ruleCondIs= ruleCondIs EOF )
            // InternalSemAdapt.g:2807:2: iv_ruleCondIs= ruleCondIs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondIsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondIs=ruleCondIs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondIs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondIs"


    // $ANTLR start "ruleCondIs"
    // InternalSemAdapt.g:2813:1: ruleCondIs returns [EObject current=null] : ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) ) ;
    public final EObject ruleCondIs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_pattern_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2819:2: ( ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) ) )
            // InternalSemAdapt.g:2820:2: ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) )
            {
            // InternalSemAdapt.g:2820:2: ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) )
            // InternalSemAdapt.g:2821:3: () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) )
            {
            // InternalSemAdapt.g:2821:3: ()
            // InternalSemAdapt.g:2822:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCondIsAccess().getIsAction_0(),
              					current);
              			
            }

            }

            // InternalSemAdapt.g:2831:3: ( (lv_pattern_1_0= ruleDefConfiguration ) )
            // InternalSemAdapt.g:2832:4: (lv_pattern_1_0= ruleDefConfiguration )
            {
            // InternalSemAdapt.g:2832:4: (lv_pattern_1_0= ruleDefConfiguration )
            // InternalSemAdapt.g:2833:5: lv_pattern_1_0= ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondIsAccess().getPatternDefConfigurationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_pattern_1_0=ruleDefConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondIsRule());
              					}
              					set(
              						current,
              						"pattern",
              						lv_pattern_1_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.DefConfiguration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondIsAccess().getMatchKeyword_2());
              		
            }
            // InternalSemAdapt.g:2854:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalSemAdapt.g:2855:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalSemAdapt.g:2855:4: (lv_expr_3_0= ruleExpr )
            // InternalSemAdapt.g:2856:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondIsAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCondIsRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondIs"


    // $ANTLR start "entryRuleExpr"
    // InternalSemAdapt.g:2877:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalSemAdapt.g:2877:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalSemAdapt.g:2878:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalSemAdapt.g:2884:1: ruleExpr returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2890:2: (this_Or_0= ruleOr )
            // InternalSemAdapt.g:2891:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExprAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOr"
    // InternalSemAdapt.g:2905:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSemAdapt.g:2905:43: (iv_ruleOr= ruleOr EOF )
            // InternalSemAdapt.g:2906:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSemAdapt.g:2912:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2918:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) )
            // InternalSemAdapt.g:2919:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            {
            // InternalSemAdapt.g:2919:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            // InternalSemAdapt.g:2920:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSemAdapt.g:2931:3: ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSemAdapt.g:2932:4: () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            	    {
            	    // InternalSemAdapt.g:2932:4: ()
            	    // InternalSemAdapt.g:2933:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalSemAdapt.g:2946:4: ( (lv_rhs_3_0= ruleAnd ) )
            	    // InternalSemAdapt.g:2947:5: (lv_rhs_3_0= ruleAnd )
            	    {
            	    // InternalSemAdapt.g:2947:5: (lv_rhs_3_0= ruleAnd )
            	    // InternalSemAdapt.g:2948:6: lv_rhs_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_rhs_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSemAdapt.g:2970:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSemAdapt.g:2970:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSemAdapt.g:2971:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSemAdapt.g:2977:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:2983:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) )
            // InternalSemAdapt.g:2984:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            {
            // InternalSemAdapt.g:2984:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            // InternalSemAdapt.g:2985:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSemAdapt.g:2996:3: ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==45) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSemAdapt.g:2997:4: () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            	    {
            	    // InternalSemAdapt.g:2997:4: ()
            	    // InternalSemAdapt.g:2998:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalSemAdapt.g:3011:4: ( (lv_rhs_3_0= ruleEquality ) )
            	    // InternalSemAdapt.g:3012:5: (lv_rhs_3_0= ruleEquality )
            	    {
            	    // InternalSemAdapt.g:3012:5: (lv_rhs_3_0= ruleEquality )
            	    // InternalSemAdapt.g:3013:6: lv_rhs_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_rhs_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalSemAdapt.g:3035:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalSemAdapt.g:3035:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalSemAdapt.g:3036:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalSemAdapt.g:3042:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:3048:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* ) )
            // InternalSemAdapt.g:3049:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* )
            {
            // InternalSemAdapt.g:3049:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* )
            // InternalSemAdapt.g:3050:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSemAdapt.g:3061:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=46 && LA41_0<=47)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSemAdapt.g:3062:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) )
            	    {
            	    // InternalSemAdapt.g:3062:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==46) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==47) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalSemAdapt.g:3063:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalSemAdapt.g:3063:5: ( () otherlv_2= '==' )
            	            // InternalSemAdapt.g:3064:6: () otherlv_2= '=='
            	            {
            	            // InternalSemAdapt.g:3064:6: ()
            	            // InternalSemAdapt.g:3065:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,46,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSemAdapt.g:3080:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalSemAdapt.g:3080:5: ( () otherlv_4= '!=' )
            	            // InternalSemAdapt.g:3081:6: () otherlv_4= '!='
            	            {
            	            // InternalSemAdapt.g:3081:6: ()
            	            // InternalSemAdapt.g:3082:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,47,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSemAdapt.g:3097:4: ( (lv_rhs_5_0= ruleComparison ) )
            	    // InternalSemAdapt.g:3098:5: (lv_rhs_5_0= ruleComparison )
            	    {
            	    // InternalSemAdapt.g:3098:5: (lv_rhs_5_0= ruleComparison )
            	    // InternalSemAdapt.g:3099:6: lv_rhs_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_rhs_5_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalSemAdapt.g:3121:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSemAdapt.g:3121:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSemAdapt.g:3122:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalSemAdapt.g:3128:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:3134:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* ) )
            // InternalSemAdapt.g:3135:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* )
            {
            // InternalSemAdapt.g:3135:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* )
            // InternalSemAdapt.g:3136:3: this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSemAdapt.g:3147:3: ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=48 && LA43_0<=49)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSemAdapt.g:3148:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) )
            	    {
            	    // InternalSemAdapt.g:3148:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==48) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==49) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalSemAdapt.g:3149:5: ( () otherlv_2= '<' )
            	            {
            	            // InternalSemAdapt.g:3149:5: ( () otherlv_2= '<' )
            	            // InternalSemAdapt.g:3150:6: () otherlv_2= '<'
            	            {
            	            // InternalSemAdapt.g:3150:6: ()
            	            // InternalSemAdapt.g:3151:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,48,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSemAdapt.g:3166:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalSemAdapt.g:3166:5: ( () otherlv_4= '<=' )
            	            // InternalSemAdapt.g:3167:6: () otherlv_4= '<='
            	            {
            	            // InternalSemAdapt.g:3167:6: ()
            	            // InternalSemAdapt.g:3168:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,49,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSemAdapt.g:3183:4: ( (lv_rhs_5_0= rulePlusOrMinus ) )
            	    // InternalSemAdapt.g:3184:5: (lv_rhs_5_0= rulePlusOrMinus )
            	    {
            	    // InternalSemAdapt.g:3184:5: (lv_rhs_5_0= rulePlusOrMinus )
            	    // InternalSemAdapt.g:3185:6: lv_rhs_5_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_rhs_5_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalSemAdapt.g:3207:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalSemAdapt.g:3207:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalSemAdapt.g:3208:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalSemAdapt.g:3214:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:3220:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalSemAdapt.g:3221:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalSemAdapt.g:3221:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* )
            // InternalSemAdapt.g:3222:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSemAdapt.g:3233:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=50 && LA45_0<=51)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSemAdapt.g:3234:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalSemAdapt.g:3234:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==50) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==51) ) {
            	        alt44=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalSemAdapt.g:3235:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalSemAdapt.g:3235:5: ( () otherlv_2= '+' )
            	            // InternalSemAdapt.g:3236:6: () otherlv_2= '+'
            	            {
            	            // InternalSemAdapt.g:3236:6: ()
            	            // InternalSemAdapt.g:3237:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,50,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSemAdapt.g:3252:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalSemAdapt.g:3252:5: ( () otherlv_4= '-' )
            	            // InternalSemAdapt.g:3253:6: () otherlv_4= '-'
            	            {
            	            // InternalSemAdapt.g:3253:6: ()
            	            // InternalSemAdapt.g:3254:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,51,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSemAdapt.g:3269:4: ( (lv_rhs_5_0= ruleMulOrDiv ) )
            	    // InternalSemAdapt.g:3270:5: (lv_rhs_5_0= ruleMulOrDiv )
            	    {
            	    // InternalSemAdapt.g:3270:5: (lv_rhs_5_0= ruleMulOrDiv )
            	    // InternalSemAdapt.g:3271:6: lv_rhs_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRhsMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_rhs_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalSemAdapt.g:3293:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalSemAdapt.g:3293:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalSemAdapt.g:3294:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalSemAdapt.g:3300:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:3306:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // InternalSemAdapt.g:3307:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // InternalSemAdapt.g:3307:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // InternalSemAdapt.g:3308:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSemAdapt.g:3319:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=52 && LA47_0<=53)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSemAdapt.g:3320:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // InternalSemAdapt.g:3320:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==52) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==53) ) {
            	        alt46=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalSemAdapt.g:3321:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalSemAdapt.g:3321:5: ( () otherlv_2= '*' )
            	            // InternalSemAdapt.g:3322:6: () otherlv_2= '*'
            	            {
            	            // InternalSemAdapt.g:3322:6: ()
            	            // InternalSemAdapt.g:3323:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,52,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSemAdapt.g:3338:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalSemAdapt.g:3338:5: ( () otherlv_4= '/' )
            	            // InternalSemAdapt.g:3339:6: () otherlv_4= '/'
            	            {
            	            // InternalSemAdapt.g:3339:6: ()
            	            // InternalSemAdapt.g:3340:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,53,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSemAdapt.g:3355:4: ( (lv_rhs_5_0= rulePrimary ) )
            	    // InternalSemAdapt.g:3356:5: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // InternalSemAdapt.g:3356:5: (lv_rhs_5_0= rulePrimary )
            	    // InternalSemAdapt.g:3357:6: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRhsPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_rhs_5_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalSemAdapt.g:3379:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSemAdapt.g:3379:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSemAdapt.g:3380:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSemAdapt.g:3386:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject this_Expr_1 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_pattern_10_0 = null;

        EObject lv_expr_12_0 = null;

        EObject this_Atomic_13 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:3392:2: ( ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic ) )
            // InternalSemAdapt.g:3393:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic )
            {
            // InternalSemAdapt.g:3393:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic )
            int alt48=5;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalSemAdapt.g:3394:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    {
                    // InternalSemAdapt.g:3394:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    // InternalSemAdapt.g:3395:4: otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_Expr_1=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:3416:3: ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) )
                    {
                    // InternalSemAdapt.g:3416:3: ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) )
                    // InternalSemAdapt.g:3417:4: () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) )
                    {
                    // InternalSemAdapt.g:3417:4: ()
                    // InternalSemAdapt.g:3418:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalSemAdapt.g:3431:4: ( (lv_expr_5_0= rulePrimary ) )
                    // InternalSemAdapt.g:3432:5: (lv_expr_5_0= rulePrimary )
                    {
                    // InternalSemAdapt.g:3432:5: (lv_expr_5_0= rulePrimary )
                    // InternalSemAdapt.g:3433:6: lv_expr_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_5_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:3452:3: ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) )
                    {
                    // InternalSemAdapt.g:3452:3: ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) )
                    // InternalSemAdapt.g:3453:4: () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) )
                    {
                    // InternalSemAdapt.g:3453:4: ()
                    // InternalSemAdapt.g:3454:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getOppositeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalSemAdapt.g:3467:4: ( (lv_expr_8_0= rulePrimary ) )
                    // InternalSemAdapt.g:3468:5: (lv_expr_8_0= rulePrimary )
                    {
                    // InternalSemAdapt.g:3468:5: (lv_expr_8_0= rulePrimary )
                    // InternalSemAdapt.g:3469:6: lv_expr_8_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_8_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_8_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSemAdapt.g:3488:3: ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) )
                    {
                    // InternalSemAdapt.g:3488:3: ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) )
                    // InternalSemAdapt.g:3489:4: () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) )
                    {
                    // InternalSemAdapt.g:3489:4: ()
                    // InternalSemAdapt.g:3490:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getIsAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:3499:4: ( (lv_pattern_10_0= ruleDefConfiguration ) )
                    // InternalSemAdapt.g:3500:5: (lv_pattern_10_0= ruleDefConfiguration )
                    {
                    // InternalSemAdapt.g:3500:5: (lv_pattern_10_0= ruleDefConfiguration )
                    // InternalSemAdapt.g:3501:6: lv_pattern_10_0= ruleDefConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getPatternDefConfigurationParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_pattern_10_0=ruleDefConfiguration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"pattern",
                      							lv_pattern_10_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.DefConfiguration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getMatchKeyword_3_2());
                      			
                    }
                    // InternalSemAdapt.g:3522:4: ( (lv_expr_12_0= rulePrimary ) )
                    // InternalSemAdapt.g:3523:5: (lv_expr_12_0= rulePrimary )
                    {
                    // InternalSemAdapt.g:3523:5: (lv_expr_12_0= rulePrimary )
                    // InternalSemAdapt.g:3524:6: lv_expr_12_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExprPrimaryParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_12_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_12_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSemAdapt.g:3543:3: this_Atomic_13= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_13=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalSemAdapt.g:3558:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSemAdapt.g:3558:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSemAdapt.g:3559:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalSemAdapt.g:3565:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        EObject this_SemanticDomainAccess_8 = null;

        EObject this_TerminalAccessExpression_9 = null;



        	enterRule();

        try {
            // InternalSemAdapt.g:3571:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression ) )
            // InternalSemAdapt.g:3572:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression )
            {
            // InternalSemAdapt.g:3572:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression )
            int alt49=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt49=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt49=2;
                }
                break;
            case RULE_STRING:
                {
                alt49=3;
                }
                break;
            case RULE_BOOL:
                {
                alt49=4;
                }
                break;
            case RULE_ID:
                {
                int LA49_5 = input.LA(2);

                if ( (LA49_5==35) ) {
                    alt49=5;
                }
                else if ( (LA49_5==EOF||(LA49_5>=15 && LA49_5<=17)||(LA49_5>=19 && LA49_5<=22)||(LA49_5>=28 && LA49_5<=31)||LA49_5==34||(LA49_5>=44 && LA49_5<=53)) ) {
                    alt49=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 5, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA49_6 = input.LA(2);

                if ( (LA49_6==35) ) {
                    alt49=5;
                }
                else if ( (LA49_6==EOF||(LA49_6>=15 && LA49_6<=17)||(LA49_6>=19 && LA49_6<=22)||(LA49_6>=28 && LA49_6<=31)||LA49_6==34||(LA49_6>=44 && LA49_6<=53)) ) {
                    alt49=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalSemAdapt.g:3573:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalSemAdapt.g:3573:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalSemAdapt.g:3574:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalSemAdapt.g:3574:4: ()
                    // InternalSemAdapt.g:3575:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:3584:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSemAdapt.g:3585:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSemAdapt.g:3585:5: (lv_value_1_0= RULE_INT )
                    // InternalSemAdapt.g:3586:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:3604:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    {
                    // InternalSemAdapt.g:3604:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    // InternalSemAdapt.g:3605:4: () ( (lv_value_3_0= RULE_DOUBLE ) )
                    {
                    // InternalSemAdapt.g:3605:4: ()
                    // InternalSemAdapt.g:3606:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:3615:4: ( (lv_value_3_0= RULE_DOUBLE ) )
                    // InternalSemAdapt.g:3616:5: (lv_value_3_0= RULE_DOUBLE )
                    {
                    // InternalSemAdapt.g:3616:5: (lv_value_3_0= RULE_DOUBLE )
                    // InternalSemAdapt.g:3617:6: lv_value_3_0= RULE_DOUBLE
                    {
                    lv_value_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.DOUBLE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSemAdapt.g:3635:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalSemAdapt.g:3635:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalSemAdapt.g:3636:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalSemAdapt.g:3636:4: ()
                    // InternalSemAdapt.g:3637:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:3646:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalSemAdapt.g:3647:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalSemAdapt.g:3647:5: (lv_value_5_0= RULE_STRING )
                    // InternalSemAdapt.g:3648:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSemAdapt.g:3666:3: ( () ( (lv_value_7_0= RULE_BOOL ) ) )
                    {
                    // InternalSemAdapt.g:3666:3: ( () ( (lv_value_7_0= RULE_BOOL ) ) )
                    // InternalSemAdapt.g:3667:4: () ( (lv_value_7_0= RULE_BOOL ) )
                    {
                    // InternalSemAdapt.g:3667:4: ()
                    // InternalSemAdapt.g:3668:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSemAdapt.g:3677:4: ( (lv_value_7_0= RULE_BOOL ) )
                    // InternalSemAdapt.g:3678:5: (lv_value_7_0= RULE_BOOL )
                    {
                    // InternalSemAdapt.g:3678:5: (lv_value_7_0= RULE_BOOL )
                    // InternalSemAdapt.g:3679:6: lv_value_7_0= RULE_BOOL
                    {
                    lv_value_7_0=(Token)match(input,RULE_BOOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueBOOLTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.BOOL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSemAdapt.g:3697:3: this_SemanticDomainAccess_8= ruleSemanticDomainAccess
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getSemanticDomainAccessParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SemanticDomainAccess_8=ruleSemanticDomainAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SemanticDomainAccess_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSemAdapt.g:3709:3: this_TerminalAccessExpression_9= ruleTerminalAccessExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getTerminalAccessExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TerminalAccessExpression_9=ruleTerminalAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TerminalAccessExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleEString"
    // InternalSemAdapt.g:3724:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSemAdapt.g:3724:47: (iv_ruleEString= ruleEString EOF )
            // InternalSemAdapt.g:3725:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSemAdapt.g:3731:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:3737:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSemAdapt.g:3738:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSemAdapt.g:3738:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalSemAdapt.g:3739:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:3747:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFQN"
    // InternalSemAdapt.g:3758:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSemAdapt.g:3758:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSemAdapt.g:3759:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalSemAdapt.g:3765:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:3771:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSemAdapt.g:3772:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSemAdapt.g:3772:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSemAdapt.g:3773:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSemAdapt.g:3780:3: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==35) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSemAdapt.g:3781:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleOperationFQN"
    // InternalSemAdapt.g:3798:1: entryRuleOperationFQN returns [String current=null] : iv_ruleOperationFQN= ruleOperationFQN EOF ;
    public final String entryRuleOperationFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationFQN = null;


        try {
            // InternalSemAdapt.g:3798:52: (iv_ruleOperationFQN= ruleOperationFQN EOF )
            // InternalSemAdapt.g:3799:2: iv_ruleOperationFQN= ruleOperationFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationFQN=ruleOperationFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationFQN"


    // $ANTLR start "ruleOperationFQN"
    // InternalSemAdapt.g:3805:1: ruleOperationFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleOperationFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSemAdapt.g:3811:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalSemAdapt.g:3812:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalSemAdapt.g:3812:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalSemAdapt.g:3813:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalSemAdapt.g:3820:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==35) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSemAdapt.g:3821:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOperationFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationFQN"

    // $ANTLR start synpred22_InternalSemAdapt
    public final void synpred22_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_Expr_0 = null;


        // InternalSemAdapt.g:1224:3: (this_Expr_0= ruleExpr )
        // InternalSemAdapt.g:1224:3: this_Expr_0= ruleExpr
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Expr_0=ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalSemAdapt

    // $ANTLR start synpred23_InternalSemAdapt
    public final void synpred23_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_RefConfiguration_1 = null;


        // InternalSemAdapt.g:1236:3: (this_RefConfiguration_1= ruleRefConfiguration )
        // InternalSemAdapt.g:1236:3: this_RefConfiguration_1= ruleRefConfiguration
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_RefConfiguration_1=ruleRefConfiguration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalSemAdapt

    // $ANTLR start synpred40_InternalSemAdapt
    public final void synpred40_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_CondOr_0 = null;


        // InternalSemAdapt.g:2281:3: (this_CondOr_0= ruleCondOr )
        // InternalSemAdapt.g:2281:3: this_CondOr_0= ruleCondOr
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CondOr_0=ruleCondOr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalSemAdapt

    // $ANTLR start synpred41_InternalSemAdapt
    public final void synpred41_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_CondAnd_1 = null;


        // InternalSemAdapt.g:2293:3: (this_CondAnd_1= ruleCondAnd )
        // InternalSemAdapt.g:2293:3: this_CondAnd_1= ruleCondAnd
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CondAnd_1=ruleCondAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalSemAdapt

    // $ANTLR start synpred42_InternalSemAdapt
    public final void synpred42_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_CondEquality_2 = null;


        // InternalSemAdapt.g:2305:3: (this_CondEquality_2= ruleCondEquality )
        // InternalSemAdapt.g:2305:3: this_CondEquality_2= ruleCondEquality
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CondEquality_2=ruleCondEquality();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalSemAdapt

    // $ANTLR start synpred43_InternalSemAdapt
    public final void synpred43_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_CondComparison_3 = null;


        // InternalSemAdapt.g:2317:3: (this_CondComparison_3= ruleCondComparison )
        // InternalSemAdapt.g:2317:3: this_CondComparison_3= ruleCondComparison
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CondComparison_3=ruleCondComparison();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalSemAdapt

    // $ANTLR start synpred44_InternalSemAdapt
    public final void synpred44_InternalSemAdapt_fragment() throws RecognitionException {   
        EObject this_CondNot_4 = null;


        // InternalSemAdapt.g:2329:3: (this_CondNot_4= ruleCondNot )
        // InternalSemAdapt.g:2329:3: this_CondNot_4= ruleCondNot
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CondNot_4=ruleCondNot();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalSemAdapt

    // $ANTLR start synpred45_InternalSemAdapt
    public final void synpred45_InternalSemAdapt_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


        // InternalSemAdapt.g:2565:3: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) )
        // InternalSemAdapt.g:2565:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
        {
        // InternalSemAdapt.g:2565:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
        // InternalSemAdapt.g:2566:4: () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) )
        {
        // InternalSemAdapt.g:2566:4: ()
        // InternalSemAdapt.g:2567:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSemAdapt.g:2576:4: ( (lv_lhs_1_0= ruleComparison ) )
        // InternalSemAdapt.g:2577:5: (lv_lhs_1_0= ruleComparison )
        {
        // InternalSemAdapt.g:2577:5: (lv_lhs_1_0= ruleComparison )
        // InternalSemAdapt.g:2578:6: lv_lhs_1_0= ruleComparison
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_41);
        lv_lhs_1_0=ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,46,FOLLOW_13); if (state.failed) return ;
        // InternalSemAdapt.g:2599:4: ( (lv_rhs_3_0= ruleComparison ) )
        // InternalSemAdapt.g:2600:5: (lv_rhs_3_0= ruleComparison )
        {
        // InternalSemAdapt.g:2600:5: (lv_rhs_3_0= ruleComparison )
        // InternalSemAdapt.g:2601:6: lv_rhs_3_0= ruleComparison
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondEqualityAccess().getRhsComparisonParserRuleCall_0_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred45_InternalSemAdapt

    // $ANTLR start synpred46_InternalSemAdapt
    public final void synpred46_InternalSemAdapt_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


        // InternalSemAdapt.g:2693:3: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) )
        // InternalSemAdapt.g:2693:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
        {
        // InternalSemAdapt.g:2693:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
        // InternalSemAdapt.g:2694:4: () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) )
        {
        // InternalSemAdapt.g:2694:4: ()
        // InternalSemAdapt.g:2695:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalSemAdapt.g:2704:4: ( (lv_lhs_1_0= rulePlusOrMinus ) )
        // InternalSemAdapt.g:2705:5: (lv_lhs_1_0= rulePlusOrMinus )
        {
        // InternalSemAdapt.g:2705:5: (lv_lhs_1_0= rulePlusOrMinus )
        // InternalSemAdapt.g:2706:6: lv_lhs_1_0= rulePlusOrMinus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_43);
        lv_lhs_1_0=rulePlusOrMinus();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,48,FOLLOW_13); if (state.failed) return ;
        // InternalSemAdapt.g:2727:4: ( (lv_rhs_3_0= rulePlusOrMinus ) )
        // InternalSemAdapt.g:2728:5: (lv_rhs_3_0= rulePlusOrMinus )
        {
        // InternalSemAdapt.g:2728:5: (lv_rhs_3_0= rulePlusOrMinus )
        // InternalSemAdapt.g:2729:6: lv_rhs_3_0= rulePlusOrMinus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondComparisonAccess().getRhsPlusOrMinusParserRuleCall_0_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=rulePlusOrMinus();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred46_InternalSemAdapt

    // Delegated rules

    public final boolean synpred40_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalSemAdapt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSemAdapt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\4\1\40\1\uffff\1\4\1\40\1\uffff\1\4\1\40";
    static final String dfa_3s = "\1\44\1\43\1\uffff\1\4\1\43\1\uffff\1\4\1\43";
    static final String dfa_4s = "\2\uffff\1\1\2\uffff\1\2\2\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\37\uffff\1\2",
            "\1\2\2\uffff\1\3",
            "",
            "\1\4",
            "\1\2\1\5\1\uffff\1\6",
            "",
            "\1\7",
            "\1\2\1\5\1\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "846:4: ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) )";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "892:5: ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_9s = "\1\63\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String dfa_11s = "\4\uffff\1\0\4\uffff\1\1\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\4\1\30\uffff\1\1\2\uffff\1\11\6\uffff\1\1\7\uffff\1\1",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1223:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSemAdapt()) ) {s = 1;}

                        else if ( (synpred23_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSemAdapt()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\4\11\0\6\uffff";
    static final String dfa_15s = "\1\63\11\0\6\uffff";
    static final String dfa_16s = "\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] dfa_18s = {
            "\1\4\1\5\1\6\1\7\1\10\30\uffff\1\1\2\uffff\1\11\6\uffff\1\2\7\uffff\1\3",
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

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2280:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                        else if ( (synpred44_InternalSemAdapt()) ) {s = 14;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_3 = input.LA(1);

                         
                        int index35_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_8 = input.LA(1);

                         
                        int index35_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_9 = input.LA(1);

                         
                        int index35_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSemAdapt()) ) {s = 10;}

                        else if ( (synpred41_InternalSemAdapt()) ) {s = 11;}

                        else if ( (synpred42_InternalSemAdapt()) ) {s = 12;}

                        else if ( (synpred43_InternalSemAdapt()) ) {s = 13;}

                         
                        input.seek(index35_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\1\4\11\0\2\uffff";
    static final String dfa_20s = "\1\63\11\0\2\uffff";
    static final String dfa_21s = "\12\uffff\1\1\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_23s = {
            "\1\4\1\5\1\6\1\7\1\10\30\uffff\1\1\2\uffff\1\11\6\uffff\1\2\7\uffff\1\3",
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

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2564:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2692:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSemAdapt()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_24s = "\13\uffff";
    static final String dfa_25s = "\4\uffff\1\5\3\uffff\1\5\1\uffff\1\5";
    static final String dfa_26s = "\1\4\3\uffff\1\17\1\uffff\1\4\1\uffff\1\17\1\4\1\17";
    static final String dfa_27s = "\1\63\3\uffff\1\65\1\uffff\1\4\1\uffff\1\65\1\4\1\65";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\4\3\uffff";
    static final String dfa_29s = "\13\uffff}>";
    static final String[] dfa_30s = {
            "\1\4\4\5\30\uffff\1\1\2\uffff\1\5\6\uffff\1\2\7\uffff\1\3",
            "",
            "",
            "",
            "\3\5\1\uffff\4\5\5\uffff\4\5\1\uffff\1\7\1\5\1\6\10\uffff\12\5",
            "",
            "\1\10",
            "",
            "\3\5\1\uffff\4\5\5\uffff\4\5\1\uffff\1\7\1\5\1\11\10\uffff\12\5",
            "\1\12",
            "\3\5\1\uffff\4\5\5\uffff\4\5\1\uffff\1\7\1\5\1\11\10\uffff\12\5"
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3393:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000738000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000708000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00080812000001F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000E0040002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000D0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000048400000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000048000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000004C400000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000004C000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0030000000000002L});

}