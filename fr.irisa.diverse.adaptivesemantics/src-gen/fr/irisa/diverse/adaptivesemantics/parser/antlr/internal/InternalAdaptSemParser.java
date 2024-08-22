package fr.irisa.diverse.adaptivesemantics.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.irisa.diverse.adaptivesemantics.services.AdaptSemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAdaptSemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'with'", "'import'", "'as'", "'rule'", "','", "'where'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'on'", "'.'", "'self'", "'->'", "'termination'", "':'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'match'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private AdaptSemGrammarAccess grammarAccess;

        public InternalAdaptSemParser(TokenStream input, AdaptSemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AdaptiveSemantics";
       	}

       	@Override
       	protected AdaptSemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAdaptiveSemantics"
    // InternalAdaptSem.g:70:1: entryRuleAdaptiveSemantics returns [EObject current=null] : iv_ruleAdaptiveSemantics= ruleAdaptiveSemantics EOF ;
    public final EObject entryRuleAdaptiveSemantics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptiveSemantics = null;


        try {
            // InternalAdaptSem.g:70:58: (iv_ruleAdaptiveSemantics= ruleAdaptiveSemantics EOF )
            // InternalAdaptSem.g:71:2: iv_ruleAdaptiveSemantics= ruleAdaptiveSemantics EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdaptiveSemanticsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdaptiveSemantics=ruleAdaptiveSemantics();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdaptiveSemantics; 
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
    // $ANTLR end "entryRuleAdaptiveSemantics"


    // $ANTLR start "ruleAdaptiveSemantics"
    // InternalAdaptSem.g:77:1: ruleAdaptiveSemantics returns [EObject current=null] : ( ( (lv_model_0_0= ruleModel ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleAdaptiveSemantics() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:83:2: ( ( ( (lv_model_0_0= ruleModel ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalAdaptSem.g:84:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalAdaptSem.g:84:2: ( ( (lv_model_0_0= ruleModel ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_rules_2_0= ruleRule ) )* )
            // InternalAdaptSem.g:85:3: ( (lv_model_0_0= ruleModel ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalAdaptSem.g:85:3: ( (lv_model_0_0= ruleModel ) )
            // InternalAdaptSem.g:86:4: (lv_model_0_0= ruleModel )
            {
            // InternalAdaptSem.g:86:4: (lv_model_0_0= ruleModel )
            // InternalAdaptSem.g:87:5: lv_model_0_0= ruleModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdaptiveSemanticsAccess().getModelModelParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_model_0_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdaptiveSemanticsRule());
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

            // InternalAdaptSem.g:104:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAdaptSem.g:105:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalAdaptSem.g:105:4: (lv_imports_1_0= ruleImport )
            	    // InternalAdaptSem.g:106:5: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAdaptiveSemanticsAccess().getImportsImportParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAdaptiveSemanticsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_1_0,
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

            // InternalAdaptSem.g:123:3: ( (lv_rules_2_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdaptSem.g:124:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalAdaptSem.g:124:4: (lv_rules_2_0= ruleRule )
            	    // InternalAdaptSem.g:125:5: lv_rules_2_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAdaptiveSemanticsAccess().getRulesRuleParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAdaptiveSemanticsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_2_0,
            	      						"fr.irisa.diverse.adaptivesemantics.AdaptSem.Rule");
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
    // $ANTLR end "ruleAdaptiveSemantics"


    // $ANTLR start "entryRuleModel"
    // InternalAdaptSem.g:146:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAdaptSem.g:146:46: (iv_ruleModel= ruleModel EOF )
            // InternalAdaptSem.g:147:2: iv_ruleModel= ruleModel EOF
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
    // InternalAdaptSem.g:153:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:159:2: ( (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) ) )
            // InternalAdaptSem.g:160:2: (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) )
            {
            // InternalAdaptSem.g:160:2: (otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) ) )
            // InternalAdaptSem.g:161:3: otherlv_0= 'model' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'with' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
              		
            }
            // InternalAdaptSem.g:165:3: ( (lv_importURI_1_0= ruleEString ) )
            // InternalAdaptSem.g:166:4: (lv_importURI_1_0= ruleEString )
            {
            // InternalAdaptSem.g:166:4: (lv_importURI_1_0= ruleEString )
            // InternalAdaptSem.g:167:5: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getImportURIEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getWithKeyword_2());
              		
            }
            // InternalAdaptSem.g:188:3: ( ( ruleFQN ) )
            // InternalAdaptSem.g:189:4: ( ruleFQN )
            {
            // InternalAdaptSem.g:189:4: ( ruleFQN )
            // InternalAdaptSem.g:190:5: ruleFQN
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
    // InternalAdaptSem.g:211:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAdaptSem.g:211:47: (iv_ruleImport= ruleImport EOF )
            // InternalAdaptSem.g:212:2: iv_ruleImport= ruleImport EOF
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
    // InternalAdaptSem.g:218:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:224:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalAdaptSem.g:225:2: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalAdaptSem.g:225:2: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalAdaptSem.g:226:3: otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalAdaptSem.g:230:3: ( (lv_importURI_1_0= ruleEString ) )
            // InternalAdaptSem.g:231:4: (lv_importURI_1_0= ruleEString )
            {
            // InternalAdaptSem.g:231:4: (lv_importURI_1_0= ruleEString )
            // InternalAdaptSem.g:232:5: lv_importURI_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
              		
            }
            // InternalAdaptSem.g:253:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAdaptSem.g:254:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAdaptSem.g:254:4: (lv_name_3_0= RULE_ID )
            // InternalAdaptSem.g:255:5: lv_name_3_0= RULE_ID
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
    // InternalAdaptSem.g:275:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalAdaptSem.g:275:45: (iv_ruleRule= ruleRule EOF )
            // InternalAdaptSem.g:276:2: iv_ruleRule= ruleRule EOF
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
    // InternalAdaptSem.g:282:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? ) ;
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
            // InternalAdaptSem.g:288:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? ) )
            // InternalAdaptSem.g:289:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? )
            {
            // InternalAdaptSem.g:289:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )? )
            // InternalAdaptSem.g:290:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_conclusion_3_0= ruleConclusion ) ) (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )? (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )? (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )? (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
              		
            }
            // InternalAdaptSem.g:294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptSem.g:295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptSem.g:295:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptSem.g:296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCommaKeyword_2());
              		
            }
            // InternalAdaptSem.g:316:3: ( (lv_conclusion_3_0= ruleConclusion ) )
            // InternalAdaptSem.g:317:4: (lv_conclusion_3_0= ruleConclusion )
            {
            // InternalAdaptSem.g:317:4: (lv_conclusion_3_0= ruleConclusion )
            // InternalAdaptSem.g:318:5: lv_conclusion_3_0= ruleConclusion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getConclusionConclusionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalAdaptSem.g:335:3: (otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAdaptSem.g:336:4: otherlv_4= 'where' ( (lv_conditions_5_0= ruleCondition ) ) (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )*
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getWhereKeyword_4_0());
                      			
                    }
                    // InternalAdaptSem.g:340:4: ( (lv_conditions_5_0= ruleCondition ) )
                    // InternalAdaptSem.g:341:5: (lv_conditions_5_0= ruleCondition )
                    {
                    // InternalAdaptSem.g:341:5: (lv_conditions_5_0= ruleCondition )
                    // InternalAdaptSem.g:342:6: lv_conditions_5_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalAdaptSem.g:359:4: (otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAdaptSem.g:360:5: otherlv_6= ';' ( (lv_conditions_7_0= ruleCondition ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getSemicolonKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:364:5: ( (lv_conditions_7_0= ruleCondition ) )
                    	    // InternalAdaptSem.g:365:6: (lv_conditions_7_0= ruleCondition )
                    	    {
                    	    // InternalAdaptSem.g:365:6: (lv_conditions_7_0= ruleCondition )
                    	    // InternalAdaptSem.g:366:7: lv_conditions_7_0= ruleCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAdaptSem.g:385:3: (otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdaptSem.g:386:4: otherlv_8= 'resolve' ( (lv_premises_9_0= rulePremise ) ) (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getResolveKeyword_5_0());
                      			
                    }
                    // InternalAdaptSem.g:390:4: ( (lv_premises_9_0= rulePremise ) )
                    // InternalAdaptSem.g:391:5: (lv_premises_9_0= rulePremise )
                    {
                    // InternalAdaptSem.g:391:5: (lv_premises_9_0= rulePremise )
                    // InternalAdaptSem.g:392:6: lv_premises_9_0= rulePremise
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalAdaptSem.g:409:4: (otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAdaptSem.g:410:5: otherlv_10= ';' ( (lv_premises_11_0= rulePremise ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getSemicolonKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:414:5: ( (lv_premises_11_0= rulePremise ) )
                    	    // InternalAdaptSem.g:415:6: (lv_premises_11_0= rulePremise )
                    	    {
                    	    // InternalAdaptSem.g:415:6: (lv_premises_11_0= rulePremise )
                    	    // InternalAdaptSem.g:416:7: lv_premises_11_0= rulePremise
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRuleAccess().getPremisesPremiseParserRuleCall_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAdaptSem.g:435:3: (otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdaptSem.g:436:4: otherlv_12= 'bind' ( (lv_bindings_13_0= ruleBinding ) ) (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )*
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getBindKeyword_6_0());
                      			
                    }
                    // InternalAdaptSem.g:440:4: ( (lv_bindings_13_0= ruleBinding ) )
                    // InternalAdaptSem.g:441:5: (lv_bindings_13_0= ruleBinding )
                    {
                    // InternalAdaptSem.g:441:5: (lv_bindings_13_0= ruleBinding )
                    // InternalAdaptSem.g:442:6: lv_bindings_13_0= ruleBinding
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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

                    // InternalAdaptSem.g:459:4: (otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAdaptSem.g:460:5: otherlv_14= ';' ( (lv_bindings_15_0= ruleBinding ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getRuleAccess().getSemicolonKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:464:5: ( (lv_bindings_15_0= ruleBinding ) )
                    	    // InternalAdaptSem.g:465:6: (lv_bindings_15_0= ruleBinding )
                    	    {
                    	    // InternalAdaptSem.g:465:6: (lv_bindings_15_0= ruleBinding )
                    	    // InternalAdaptSem.g:466:7: lv_bindings_15_0= ruleBinding
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAdaptSem.g:485:3: (otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdaptSem.g:486:4: otherlv_16= 'IO' ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) ) (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )*
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getIOKeyword_7_0());
                      			
                    }
                    // InternalAdaptSem.g:490:4: ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) )
                    int alt9=2;
                    alt9 = dfa9.predict(input);
                    switch (alt9) {
                        case 1 :
                            // InternalAdaptSem.g:491:5: ( (lv_inputs_17_0= ruleInput ) )
                            {
                            // InternalAdaptSem.g:491:5: ( (lv_inputs_17_0= ruleInput ) )
                            // InternalAdaptSem.g:492:6: (lv_inputs_17_0= ruleInput )
                            {
                            // InternalAdaptSem.g:492:6: (lv_inputs_17_0= ruleInput )
                            // InternalAdaptSem.g:493:7: lv_inputs_17_0= ruleInput
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
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
                            // InternalAdaptSem.g:511:5: ( (lv_outputs_18_0= ruleOutput ) )
                            {
                            // InternalAdaptSem.g:511:5: ( (lv_outputs_18_0= ruleOutput ) )
                            // InternalAdaptSem.g:512:6: (lv_outputs_18_0= ruleOutput )
                            {
                            // InternalAdaptSem.g:512:6: (lv_outputs_18_0= ruleOutput )
                            // InternalAdaptSem.g:513:7: lv_outputs_18_0= ruleOutput
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
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

                    // InternalAdaptSem.g:531:4: (otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAdaptSem.g:532:5: otherlv_19= ';' ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) )
                    	    {
                    	    otherlv_19=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_19, grammarAccess.getRuleAccess().getSemicolonKeyword_7_2_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:536:5: ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) )
                    	    int alt10=2;
                    	    alt10 = dfa10.predict(input);
                    	    switch (alt10) {
                    	        case 1 :
                    	            // InternalAdaptSem.g:537:6: ( (lv_inputs_20_0= ruleInput ) )
                    	            {
                    	            // InternalAdaptSem.g:537:6: ( (lv_inputs_20_0= ruleInput ) )
                    	            // InternalAdaptSem.g:538:7: (lv_inputs_20_0= ruleInput )
                    	            {
                    	            // InternalAdaptSem.g:538:7: (lv_inputs_20_0= ruleInput )
                    	            // InternalAdaptSem.g:539:8: lv_inputs_20_0= ruleInput
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getRuleAccess().getInputsInputParserRuleCall_7_2_1_0_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_16);
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
                    	            // InternalAdaptSem.g:557:6: ( (lv_outputs_21_0= ruleOutput ) )
                    	            {
                    	            // InternalAdaptSem.g:557:6: ( (lv_outputs_21_0= ruleOutput ) )
                    	            // InternalAdaptSem.g:558:7: (lv_outputs_21_0= ruleOutput )
                    	            {
                    	            // InternalAdaptSem.g:558:7: (lv_outputs_21_0= ruleOutput )
                    	            // InternalAdaptSem.g:559:8: lv_outputs_21_0= ruleOutput
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getRuleAccess().getOutputsOutputParserRuleCall_7_2_1_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_16);
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
                    	    break loop11;
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
    // InternalAdaptSem.g:583:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalAdaptSem.g:583:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalAdaptSem.g:584:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalAdaptSem.g:590:1: ruleCondition returns [EObject current=null] : ( () ( (lv_cond_1_0= ruleCondExpr ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:596:2: ( ( () ( (lv_cond_1_0= ruleCondExpr ) ) ) )
            // InternalAdaptSem.g:597:2: ( () ( (lv_cond_1_0= ruleCondExpr ) ) )
            {
            // InternalAdaptSem.g:597:2: ( () ( (lv_cond_1_0= ruleCondExpr ) ) )
            // InternalAdaptSem.g:598:3: () ( (lv_cond_1_0= ruleCondExpr ) )
            {
            // InternalAdaptSem.g:598:3: ()
            // InternalAdaptSem.g:599:4: 
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

            // InternalAdaptSem.g:608:3: ( (lv_cond_1_0= ruleCondExpr ) )
            // InternalAdaptSem.g:609:4: (lv_cond_1_0= ruleCondExpr )
            {
            // InternalAdaptSem.g:609:4: (lv_cond_1_0= ruleCondExpr )
            // InternalAdaptSem.g:610:5: lv_cond_1_0= ruleCondExpr
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
    // InternalAdaptSem.g:631:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalAdaptSem.g:631:46: (iv_ruleInput= ruleInput EOF )
            // InternalAdaptSem.g:632:2: iv_ruleInput= ruleInput EOF
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
    // InternalAdaptSem.g:638:1: ruleInput returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )* )? otherlv_7= ')' (otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_assignee_0_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;

        EObject lv_target_9_1 = null;

        EObject lv_target_9_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:644:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )* )? otherlv_7= ')' (otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) ) )? ) )
            // InternalAdaptSem.g:645:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )* )? otherlv_7= ')' (otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) ) )? )
            {
            // InternalAdaptSem.g:645:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )* )? otherlv_7= ')' (otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) ) )? )
            // InternalAdaptSem.g:646:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )* )? otherlv_7= ')' (otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) ) )?
            {
            // InternalAdaptSem.g:646:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalAdaptSem.g:647:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalAdaptSem.g:647:4: (lv_assignee_0_0= ruleAssignee )
            // InternalAdaptSem.g:648:5: lv_assignee_0_0= ruleAssignee
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInputAccess().getAssigneeAssigneeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalAdaptSem.g:669:3: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:670:4: ( ruleOperationFQN )
            {
            // InternalAdaptSem.g:670:4: ( ruleOperationFQN )
            // InternalAdaptSem.g:671:5: ruleOperationFQN
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
            pushFollow(FOLLOW_18);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalAdaptSem.g:692:3: ( ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==33||LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdaptSem.g:693:4: ( (lv_args_4_0= ruleTermRef ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )*
                    {
                    // InternalAdaptSem.g:693:4: ( (lv_args_4_0= ruleTermRef ) )
                    // InternalAdaptSem.g:694:5: (lv_args_4_0= ruleTermRef )
                    {
                    // InternalAdaptSem.g:694:5: (lv_args_4_0= ruleTermRef )
                    // InternalAdaptSem.g:695:6: lv_args_4_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInputAccess().getArgsTermRefParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_args_4_0=ruleTermRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInputRule());
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

                    // InternalAdaptSem.g:712:4: (otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAdaptSem.g:713:5: otherlv_5= ',' ( (lv_args_6_0= ruleTermRef ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getInputAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:717:5: ( (lv_args_6_0= ruleTermRef ) )
                    	    // InternalAdaptSem.g:718:6: (lv_args_6_0= ruleTermRef )
                    	    {
                    	    // InternalAdaptSem.g:718:6: (lv_args_6_0= ruleTermRef )
                    	    // InternalAdaptSem.g:719:7: lv_args_6_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInputAccess().getArgsTermRefParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_args_6_0=ruleTermRef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInputRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_6_0,
                    	      								"fr.irisa.diverse.adaptivesemantics.AdaptSem.TermRef");
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

            otherlv_7=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getInputAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalAdaptSem.g:742:3: (otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptSem.g:743:4: otherlv_8= 'on' ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInputAccess().getOnKeyword_6_0());
                      			
                    }
                    // InternalAdaptSem.g:747:4: ( ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) ) )
                    // InternalAdaptSem.g:748:5: ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) )
                    {
                    // InternalAdaptSem.g:748:5: ( (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess ) )
                    // InternalAdaptSem.g:749:6: (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:749:6: (lv_target_9_1= ruleTerminalAccessExpression | lv_target_9_2= ruleSemanticDomainAccess )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==28) ) {
                            alt15=2;
                        }
                        else if ( (LA15_1==EOF||LA15_1==17||LA15_1==20) ) {
                            alt15=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_0==29) ) {
                        int LA15_2 = input.LA(2);

                        if ( (LA15_2==EOF||LA15_2==17||LA15_2==20) ) {
                            alt15=1;
                        }
                        else if ( (LA15_2==28) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAdaptSem.g:750:7: lv_target_9_1= ruleTerminalAccessExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getInputAccess().getTargetTerminalAccessExpressionParserRuleCall_6_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_target_9_1=ruleTerminalAccessExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getInputRule());
                              							}
                              							set(
                              								current,
                              								"target",
                              								lv_target_9_1,
                              								"fr.irisa.diverse.adaptivesemantics.AdaptSem.TerminalAccessExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalAdaptSem.g:766:7: lv_target_9_2= ruleSemanticDomainAccess
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getInputAccess().getTargetSemanticDomainAccessParserRuleCall_6_1_0_1());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_target_9_2=ruleSemanticDomainAccess();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getInputRule());
                              							}
                              							set(
                              								current,
                              								"target",
                              								lv_target_9_2,
                              								"fr.irisa.diverse.adaptivesemantics.AdaptSem.SemanticDomainAccess");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalAdaptSem.g:789:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAdaptSem.g:789:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalAdaptSem.g:790:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalAdaptSem.g:796:1: ruleOutput returns [EObject current=null] : ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' (otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) ) )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_target_7_1 = null;

        EObject lv_target_7_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:802:2: ( ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' (otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) ) )? ) )
            // InternalAdaptSem.g:803:2: ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' (otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) ) )? )
            {
            // InternalAdaptSem.g:803:2: ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' (otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) ) )? )
            // InternalAdaptSem.g:804:3: ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' (otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) ) )?
            {
            // InternalAdaptSem.g:804:3: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:805:4: ( ruleOperationFQN )
            {
            // InternalAdaptSem.g:805:4: ( ruleOperationFQN )
            // InternalAdaptSem.g:806:5: ruleOperationFQN
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
            pushFollow(FOLLOW_18);
            ruleOperationFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAdaptSem.g:827:3: ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==33||LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptSem.g:828:4: ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )*
                    {
                    // InternalAdaptSem.g:828:4: ( (lv_args_2_0= ruleTermRef ) )
                    // InternalAdaptSem.g:829:5: (lv_args_2_0= ruleTermRef )
                    {
                    // InternalAdaptSem.g:829:5: (lv_args_2_0= ruleTermRef )
                    // InternalAdaptSem.g:830:6: lv_args_2_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAdaptSem.g:847:4: (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAdaptSem.g:848:5: otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:852:5: ( (lv_args_4_0= ruleTermRef ) )
                    	    // InternalAdaptSem.g:853:6: (lv_args_4_0= ruleTermRef )
                    	    {
                    	    // InternalAdaptSem.g:853:6: (lv_args_4_0= ruleTermRef )
                    	    // InternalAdaptSem.g:854:7: lv_args_4_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAdaptSem.g:877:3: (otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptSem.g:878:4: otherlv_6= 'on' ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getOnKeyword_4_0());
                      			
                    }
                    // InternalAdaptSem.g:882:4: ( ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) ) )
                    // InternalAdaptSem.g:883:5: ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) )
                    {
                    // InternalAdaptSem.g:883:5: ( (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess ) )
                    // InternalAdaptSem.g:884:6: (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess )
                    {
                    // InternalAdaptSem.g:884:6: (lv_target_7_1= ruleTerminalAccessExpression | lv_target_7_2= ruleSemanticDomainAccess )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==28) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==EOF||LA19_1==17||LA19_1==20) ) {
                            alt19=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA19_0==29) ) {
                        int LA19_2 = input.LA(2);

                        if ( (LA19_2==EOF||LA19_2==17||LA19_2==20) ) {
                            alt19=1;
                        }
                        else if ( (LA19_2==28) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAdaptSem.g:885:7: lv_target_7_1= ruleTerminalAccessExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOutputAccess().getTargetTerminalAccessExpressionParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_target_7_1=ruleTerminalAccessExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOutputRule());
                              							}
                              							set(
                              								current,
                              								"target",
                              								lv_target_7_1,
                              								"fr.irisa.diverse.adaptivesemantics.AdaptSem.TerminalAccessExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalAdaptSem.g:901:7: lv_target_7_2= ruleSemanticDomainAccess
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOutputAccess().getTargetSemanticDomainAccessParserRuleCall_4_1_0_1());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_target_7_2=ruleSemanticDomainAccess();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOutputRule());
                              							}
                              							set(
                              								current,
                              								"target",
                              								lv_target_7_2,
                              								"fr.irisa.diverse.adaptivesemantics.AdaptSem.SemanticDomainAccess");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleBinding"
    // InternalAdaptSem.g:924:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalAdaptSem.g:924:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalAdaptSem.g:925:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalAdaptSem.g:931:1: ruleBinding returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignee_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:937:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) ) )
            // InternalAdaptSem.g:938:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) )
            {
            // InternalAdaptSem.g:938:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) )
            // InternalAdaptSem.g:939:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) )
            {
            // InternalAdaptSem.g:939:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalAdaptSem.g:940:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalAdaptSem.g:940:4: (lv_assignee_0_0= ruleAssignee )
            // InternalAdaptSem.g:941:5: lv_assignee_0_0= ruleAssignee
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getAssigneeAssigneeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalAdaptSem.g:962:3: ( (lv_expr_2_0= ruleAssignable ) )
            // InternalAdaptSem.g:963:4: (lv_expr_2_0= ruleAssignable )
            {
            // InternalAdaptSem.g:963:4: (lv_expr_2_0= ruleAssignable )
            // InternalAdaptSem.g:964:5: lv_expr_2_0= ruleAssignable
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
    // InternalAdaptSem.g:985:1: entryRuleAssignable returns [EObject current=null] : iv_ruleAssignable= ruleAssignable EOF ;
    public final EObject entryRuleAssignable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignable = null;


        try {
            // InternalAdaptSem.g:985:51: (iv_ruleAssignable= ruleAssignable EOF )
            // InternalAdaptSem.g:986:2: iv_ruleAssignable= ruleAssignable EOF
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
    // InternalAdaptSem.g:992:1: ruleAssignable returns [EObject current=null] : (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess ) ;
    public final EObject ruleAssignable() throws RecognitionException {
        EObject current = null;

        EObject this_Expr_0 = null;

        EObject this_RefConfiguration_1 = null;

        EObject this_SemanticDomainAccess_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:998:2: ( (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess ) )
            // InternalAdaptSem.g:999:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )
            {
            // InternalAdaptSem.g:999:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalAdaptSem.g:1000:3: this_Expr_0= ruleExpr
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
                    // InternalAdaptSem.g:1012:3: this_RefConfiguration_1= ruleRefConfiguration
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
                    // InternalAdaptSem.g:1024:3: this_SemanticDomainAccess_2= ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:1039:1: entryRuleAssignee returns [EObject current=null] : iv_ruleAssignee= ruleAssignee EOF ;
    public final EObject entryRuleAssignee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignee = null;


        try {
            // InternalAdaptSem.g:1039:49: (iv_ruleAssignee= ruleAssignee EOF )
            // InternalAdaptSem.g:1040:2: iv_ruleAssignee= ruleAssignee EOF
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
    // InternalAdaptSem.g:1046:1: ruleAssignee returns [EObject current=null] : (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess ) ;
    public final EObject ruleAssignee() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolDef_0 = null;

        EObject this_SemanticDomainAccess_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1052:2: ( (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess ) )
            // InternalAdaptSem.g:1053:2: (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess )
            {
            // InternalAdaptSem.g:1053:2: (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==24) ) {
                    alt22=1;
                }
                else if ( (LA22_1==28) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==29) ) {
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
                    // InternalAdaptSem.g:1054:3: this_SymbolDef_0= ruleSymbolDef
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
                    // InternalAdaptSem.g:1066:3: this_SemanticDomainAccess_1= ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:1081:1: entryRuleSemanticDomainAccess returns [EObject current=null] : iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF ;
    public final EObject entryRuleSemanticDomainAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticDomainAccess = null;


        try {
            // InternalAdaptSem.g:1081:61: (iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF )
            // InternalAdaptSem.g:1082:2: iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF
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
    // InternalAdaptSem.g:1088:1: ruleSemanticDomainAccess returns [EObject current=null] : ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* ) ;
    public final EObject ruleSemanticDomainAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        Token otherlv_4=null;
        Token lv_field_5_0=null;
        EObject lv_reciever_0_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1094:2: ( ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* ) )
            // InternalAdaptSem.g:1095:2: ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* )
            {
            // InternalAdaptSem.g:1095:2: ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* )
            // InternalAdaptSem.g:1096:3: ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )*
            {
            // InternalAdaptSem.g:1096:3: ( (lv_reciever_0_0= ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:1097:4: (lv_reciever_0_0= ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:1097:4: (lv_reciever_0_0= ruleTerminalAccessExpression )
            // InternalAdaptSem.g:1098:5: lv_reciever_0_0= ruleTerminalAccessExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticDomainAccessAccess().getRecieverTerminalAccessExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1());
              		
            }
            // InternalAdaptSem.g:1119:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalAdaptSem.g:1120:4: (lv_field_2_0= RULE_ID )
            {
            // InternalAdaptSem.g:1120:4: (lv_field_2_0= RULE_ID )
            // InternalAdaptSem.g:1121:5: lv_field_2_0= RULE_ID
            {
            lv_field_2_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
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

            // InternalAdaptSem.g:1137:3: ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAdaptSem.g:1138:4: () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) )
            	    {
            	    // InternalAdaptSem.g:1138:4: ()
            	    // InternalAdaptSem.g:1139:5: 
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

            	    otherlv_4=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1());
            	      			
            	    }
            	    // InternalAdaptSem.g:1152:4: ( (lv_field_5_0= RULE_ID ) )
            	    // InternalAdaptSem.g:1153:5: (lv_field_5_0= RULE_ID )
            	    {
            	    // InternalAdaptSem.g:1153:5: (lv_field_5_0= RULE_ID )
            	    // InternalAdaptSem.g:1154:6: lv_field_5_0= RULE_ID
            	    {
            	    lv_field_5_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
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
    // InternalAdaptSem.g:1175:1: entryRuleTerminalAccessExpression returns [EObject current=null] : iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF ;
    public final EObject entryRuleTerminalAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAccessExpression = null;


        try {
            // InternalAdaptSem.g:1175:65: (iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF )
            // InternalAdaptSem.g:1176:2: iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF
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
    // InternalAdaptSem.g:1182:1: ruleTerminalAccessExpression returns [EObject current=null] : (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf ) ;
    public final EObject ruleTerminalAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolRef_0 = null;

        EObject this_Self_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1188:2: ( (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf ) )
            // InternalAdaptSem.g:1189:2: (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf )
            {
            // InternalAdaptSem.g:1189:2: (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==29) ) {
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
                    // InternalAdaptSem.g:1190:3: this_SymbolRef_0= ruleSymbolRef
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
                    // InternalAdaptSem.g:1202:3: this_Self_1= ruleSelf
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
    // InternalAdaptSem.g:1217:1: entryRuleSelf returns [EObject current=null] : iv_ruleSelf= ruleSelf EOF ;
    public final EObject entryRuleSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf = null;


        try {
            // InternalAdaptSem.g:1217:45: (iv_ruleSelf= ruleSelf EOF )
            // InternalAdaptSem.g:1218:2: iv_ruleSelf= ruleSelf EOF
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
    // InternalAdaptSem.g:1224:1: ruleSelf returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1230:2: ( ( () otherlv_1= 'self' ) )
            // InternalAdaptSem.g:1231:2: ( () otherlv_1= 'self' )
            {
            // InternalAdaptSem.g:1231:2: ( () otherlv_1= 'self' )
            // InternalAdaptSem.g:1232:3: () otherlv_1= 'self'
            {
            // InternalAdaptSem.g:1232:3: ()
            // InternalAdaptSem.g:1233:4: 
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

            otherlv_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1250:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalAdaptSem.g:1250:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalAdaptSem.g:1251:2: iv_ruleConclusion= ruleConclusion EOF
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
    // InternalAdaptSem.g:1257:1: ruleConclusion returns [EObject current=null] : ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termination_2_0=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1263:2: ( ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) ) )
            // InternalAdaptSem.g:1264:2: ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) )
            {
            // InternalAdaptSem.g:1264:2: ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) )
            // InternalAdaptSem.g:1265:3: ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) )
            {
            // InternalAdaptSem.g:1265:3: ( (lv_from_0_0= ruleDefConfiguration ) )
            // InternalAdaptSem.g:1266:4: (lv_from_0_0= ruleDefConfiguration )
            {
            // InternalAdaptSem.g:1266:4: (lv_from_0_0= ruleDefConfiguration )
            // InternalAdaptSem.g:1267:5: lv_from_0_0= ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConclusionAccess().getFromDefConfigurationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalAdaptSem.g:1288:3: ( (lv_termination_2_0= 'termination' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptSem.g:1289:4: (lv_termination_2_0= 'termination' )
                    {
                    // InternalAdaptSem.g:1289:4: (lv_termination_2_0= 'termination' )
                    // InternalAdaptSem.g:1290:5: lv_termination_2_0= 'termination'
                    {
                    lv_termination_2_0=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
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

            // InternalAdaptSem.g:1302:3: ( (lv_to_3_0= ruleSingleTermRef ) )
            // InternalAdaptSem.g:1303:4: (lv_to_3_0= ruleSingleTermRef )
            {
            // InternalAdaptSem.g:1303:4: (lv_to_3_0= ruleSingleTermRef )
            // InternalAdaptSem.g:1304:5: lv_to_3_0= ruleSingleTermRef
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
    // InternalAdaptSem.g:1325:1: entryRulePremise returns [EObject current=null] : iv_rulePremise= rulePremise EOF ;
    public final EObject entryRulePremise() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePremise = null;


        try {
            // InternalAdaptSem.g:1325:48: (iv_rulePremise= rulePremise EOF )
            // InternalAdaptSem.g:1326:2: iv_rulePremise= rulePremise EOF
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
    // InternalAdaptSem.g:1332:1: rulePremise returns [EObject current=null] : ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) ) ;
    public final EObject rulePremise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termination_2_0=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1338:2: ( ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) ) )
            // InternalAdaptSem.g:1339:2: ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) )
            {
            // InternalAdaptSem.g:1339:2: ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) )
            // InternalAdaptSem.g:1340:3: ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) )
            {
            // InternalAdaptSem.g:1340:3: ( (lv_from_0_0= ruleSymbolRef ) )
            // InternalAdaptSem.g:1341:4: (lv_from_0_0= ruleSymbolRef )
            {
            // InternalAdaptSem.g:1341:4: (lv_from_0_0= ruleSymbolRef )
            // InternalAdaptSem.g:1342:5: lv_from_0_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPremiseAccess().getFromSymbolRefParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalAdaptSem.g:1363:3: ( (lv_termination_2_0= 'termination' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptSem.g:1364:4: (lv_termination_2_0= 'termination' )
                    {
                    // InternalAdaptSem.g:1364:4: (lv_termination_2_0= 'termination' )
                    // InternalAdaptSem.g:1365:5: lv_termination_2_0= 'termination'
                    {
                    lv_termination_2_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
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

            // InternalAdaptSem.g:1377:3: ( (lv_to_3_0= ruleSingleTermDef ) )
            // InternalAdaptSem.g:1378:4: (lv_to_3_0= ruleSingleTermDef )
            {
            // InternalAdaptSem.g:1378:4: (lv_to_3_0= ruleSingleTermDef )
            // InternalAdaptSem.g:1379:5: lv_to_3_0= ruleSingleTermDef
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
    // InternalAdaptSem.g:1400:1: entryRuleTermDef returns [EObject current=null] : iv_ruleTermDef= ruleTermDef EOF ;
    public final EObject entryRuleTermDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermDef = null;


        try {
            // InternalAdaptSem.g:1400:48: (iv_ruleTermDef= ruleTermDef EOF )
            // InternalAdaptSem.g:1401:2: iv_ruleTermDef= ruleTermDef EOF
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
    // InternalAdaptSem.g:1407:1: ruleTermDef returns [EObject current=null] : (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList ) ;
    public final EObject ruleTermDef() throws RecognitionException {
        EObject current = null;

        EObject this_SingleTermDef_0 = null;

        EObject this_ListDef_1 = null;

        EObject this_VoidList_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1413:2: ( (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList ) )
            // InternalAdaptSem.g:1414:2: (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList )
            {
            // InternalAdaptSem.g:1414:2: (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case 33:
                {
                alt27=2;
                }
                break;
            case 36:
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
                    // InternalAdaptSem.g:1415:3: this_SingleTermDef_0= ruleSingleTermDef
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
                    // InternalAdaptSem.g:1427:3: this_ListDef_1= ruleListDef
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
                    // InternalAdaptSem.g:1439:3: this_VoidList_2= ruleVoidList
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
    // InternalAdaptSem.g:1454:1: entryRuleTermRef returns [EObject current=null] : iv_ruleTermRef= ruleTermRef EOF ;
    public final EObject entryRuleTermRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermRef = null;


        try {
            // InternalAdaptSem.g:1454:48: (iv_ruleTermRef= ruleTermRef EOF )
            // InternalAdaptSem.g:1455:2: iv_ruleTermRef= ruleTermRef EOF
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
    // InternalAdaptSem.g:1461:1: ruleTermRef returns [EObject current=null] : (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList ) ;
    public final EObject ruleTermRef() throws RecognitionException {
        EObject current = null;

        EObject this_SingleTermRef_0 = null;

        EObject this_ListRef_1 = null;

        EObject this_VoidList_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1467:2: ( (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList ) )
            // InternalAdaptSem.g:1468:2: (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList )
            {
            // InternalAdaptSem.g:1468:2: (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case 33:
                {
                alt28=2;
                }
                break;
            case 36:
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
                    // InternalAdaptSem.g:1469:3: this_SingleTermRef_0= ruleSingleTermRef
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
                    // InternalAdaptSem.g:1481:3: this_ListRef_1= ruleListRef
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
                    // InternalAdaptSem.g:1493:3: this_VoidList_2= ruleVoidList
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
    // InternalAdaptSem.g:1508:1: entryRuleSingleTermDef returns [EObject current=null] : iv_ruleSingleTermDef= ruleSingleTermDef EOF ;
    public final EObject entryRuleSingleTermDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTermDef = null;


        try {
            // InternalAdaptSem.g:1508:54: (iv_ruleSingleTermDef= ruleSingleTermDef EOF )
            // InternalAdaptSem.g:1509:2: iv_ruleSingleTermDef= ruleSingleTermDef EOF
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
    // InternalAdaptSem.g:1515:1: ruleSingleTermDef returns [EObject current=null] : (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef ) ;
    public final EObject ruleSingleTermDef() throws RecognitionException {
        EObject current = null;

        EObject this_DefConfiguration_0 = null;

        EObject this_SymbolDef_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1521:2: ( (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef ) )
            // InternalAdaptSem.g:1522:2: (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef )
            {
            // InternalAdaptSem.g:1522:2: (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==25||LA29_1==28) ) {
                    alt29=1;
                }
                else if ( (LA29_1==EOF||(LA29_1>=17 && LA29_1<=18)||LA29_1==20||(LA29_1>=22 && LA29_1<=23)||LA29_1==26||LA29_1==34) ) {
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
                    // InternalAdaptSem.g:1523:3: this_DefConfiguration_0= ruleDefConfiguration
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
                    // InternalAdaptSem.g:1535:3: this_SymbolDef_1= ruleSymbolDef
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
    // InternalAdaptSem.g:1550:1: entryRuleSingleTermRef returns [EObject current=null] : iv_ruleSingleTermRef= ruleSingleTermRef EOF ;
    public final EObject entryRuleSingleTermRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTermRef = null;


        try {
            // InternalAdaptSem.g:1550:54: (iv_ruleSingleTermRef= ruleSingleTermRef EOF )
            // InternalAdaptSem.g:1551:2: iv_ruleSingleTermRef= ruleSingleTermRef EOF
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
    // InternalAdaptSem.g:1557:1: ruleSingleTermRef returns [EObject current=null] : ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef ) ;
    public final EObject ruleSingleTermRef() throws RecognitionException {
        EObject current = null;

        EObject this_RefConfiguration_0 = null;

        EObject this_SymbolRef_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1563:2: ( ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef ) )
            // InternalAdaptSem.g:1564:2: ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef )
            {
            // InternalAdaptSem.g:1564:2: ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||(LA30_1>=17 && LA30_1<=19)||(LA30_1>=21 && LA30_1<=23)||LA30_1==26) ) {
                    alt30=2;
                }
                else if ( (LA30_1==25||LA30_1==28) ) {
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
                    // InternalAdaptSem.g:1565:3: ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration )
                    {
                    // InternalAdaptSem.g:1565:3: ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration )
                    // InternalAdaptSem.g:1566:4: ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration
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
                    // InternalAdaptSem.g:1580:3: this_SymbolRef_1= ruleSymbolRef
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
    // InternalAdaptSem.g:1595:1: entryRuleDefConfiguration returns [EObject current=null] : iv_ruleDefConfiguration= ruleDefConfiguration EOF ;
    public final EObject entryRuleDefConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefConfiguration = null;


        try {
            // InternalAdaptSem.g:1595:57: (iv_ruleDefConfiguration= ruleDefConfiguration EOF )
            // InternalAdaptSem.g:1596:2: iv_ruleDefConfiguration= ruleDefConfiguration EOF
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
    // InternalAdaptSem.g:1602:1: ruleDefConfiguration returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) ) )? ) ;
    public final EObject ruleDefConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_childs_2_0 = null;

        EObject lv_childs_4_0 = null;

        EObject lv_symbol_7_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1608:2: ( ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) ) )? ) )
            // InternalAdaptSem.g:1609:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) ) )? )
            {
            // InternalAdaptSem.g:1609:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) ) )? )
            // InternalAdaptSem.g:1610:3: ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) ) )?
            {
            // InternalAdaptSem.g:1610:3: ( ( ruleFQN ) )
            // InternalAdaptSem.g:1611:4: ( ruleFQN )
            {
            // InternalAdaptSem.g:1611:4: ( ruleFQN )
            // InternalAdaptSem.g:1612:5: ruleFQN
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
            pushFollow(FOLLOW_18);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefConfigurationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAdaptSem.g:1633:3: ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==33||LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdaptSem.g:1634:4: ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )*
                    {
                    // InternalAdaptSem.g:1634:4: ( (lv_childs_2_0= ruleTermDef ) )
                    // InternalAdaptSem.g:1635:5: (lv_childs_2_0= ruleTermDef )
                    {
                    // InternalAdaptSem.g:1635:5: (lv_childs_2_0= ruleTermDef )
                    // InternalAdaptSem.g:1636:6: lv_childs_2_0= ruleTermDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAdaptSem.g:1653:4: (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==18) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalAdaptSem.g:1654:5: otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDefConfigurationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:1658:5: ( (lv_childs_4_0= ruleTermDef ) )
                    	    // InternalAdaptSem.g:1659:6: (lv_childs_4_0= ruleTermDef )
                    	    {
                    	    // InternalAdaptSem.g:1659:6: (lv_childs_4_0= ruleTermDef )
                    	    // InternalAdaptSem.g:1660:7: lv_childs_4_0= ruleTermDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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

            otherlv_5=(Token)match(input,26,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefConfigurationAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAdaptSem.g:1683:3: (otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdaptSem.g:1684:4: otherlv_6= ':' ( (lv_symbol_7_0= ruleSymbolDef ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDefConfigurationAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalAdaptSem.g:1688:4: ( (lv_symbol_7_0= ruleSymbolDef ) )
                    // InternalAdaptSem.g:1689:5: (lv_symbol_7_0= ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1689:5: (lv_symbol_7_0= ruleSymbolDef )
                    // InternalAdaptSem.g:1690:6: lv_symbol_7_0= ruleSymbolDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefConfigurationAccess().getSymbolSymbolDefParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_7_0=ruleSymbolDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefConfigurationRule());
                      						}
                      						set(
                      							current,
                      							"symbol",
                      							lv_symbol_7_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.SymbolDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


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
    // $ANTLR end "ruleDefConfiguration"


    // $ANTLR start "entryRuleRefConfiguration"
    // InternalAdaptSem.g:1712:1: entryRuleRefConfiguration returns [EObject current=null] : iv_ruleRefConfiguration= ruleRefConfiguration EOF ;
    public final EObject entryRuleRefConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefConfiguration = null;


        try {
            // InternalAdaptSem.g:1712:57: (iv_ruleRefConfiguration= ruleRefConfiguration EOF )
            // InternalAdaptSem.g:1713:2: iv_ruleRefConfiguration= ruleRefConfiguration EOF
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
    // InternalAdaptSem.g:1719:1: ruleRefConfiguration returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleRefConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_childs_2_0 = null;

        EObject lv_childs_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1725:2: ( ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) )
            // InternalAdaptSem.g:1726:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            {
            // InternalAdaptSem.g:1726:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            // InternalAdaptSem.g:1727:3: ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')'
            {
            // InternalAdaptSem.g:1727:3: ( ( ruleFQN ) )
            // InternalAdaptSem.g:1728:4: ( ruleFQN )
            {
            // InternalAdaptSem.g:1728:4: ( ruleFQN )
            // InternalAdaptSem.g:1729:5: ruleFQN
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
            pushFollow(FOLLOW_18);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRefConfigurationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAdaptSem.g:1750:3: ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==33||LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAdaptSem.g:1751:4: ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )*
                    {
                    // InternalAdaptSem.g:1751:4: ( (lv_childs_2_0= ruleTermRef ) )
                    // InternalAdaptSem.g:1752:5: (lv_childs_2_0= ruleTermRef )
                    {
                    // InternalAdaptSem.g:1752:5: (lv_childs_2_0= ruleTermRef )
                    // InternalAdaptSem.g:1753:6: lv_childs_2_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    // InternalAdaptSem.g:1770:4: (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalAdaptSem.g:1771:5: otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRefConfigurationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:1775:5: ( (lv_childs_4_0= ruleTermRef ) )
                    	    // InternalAdaptSem.g:1776:6: (lv_childs_4_0= ruleTermRef )
                    	    {
                    	    // InternalAdaptSem.g:1776:6: (lv_childs_4_0= ruleTermRef )
                    	    // InternalAdaptSem.g:1777:7: lv_childs_4_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1804:1: entryRuleSymbolDef returns [EObject current=null] : iv_ruleSymbolDef= ruleSymbolDef EOF ;
    public final EObject entryRuleSymbolDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolDef = null;


        try {
            // InternalAdaptSem.g:1804:50: (iv_ruleSymbolDef= ruleSymbolDef EOF )
            // InternalAdaptSem.g:1805:2: iv_ruleSymbolDef= ruleSymbolDef EOF
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
    // InternalAdaptSem.g:1811:1: ruleSymbolDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1817:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdaptSem.g:1818:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdaptSem.g:1818:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdaptSem.g:1819:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAdaptSem.g:1819:3: ()
            // InternalAdaptSem.g:1820:4: 
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

            // InternalAdaptSem.g:1829:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptSem.g:1830:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptSem.g:1830:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptSem.g:1831:5: lv_name_1_0= RULE_ID
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
    // InternalAdaptSem.g:1851:1: entryRuleSymbolRef returns [EObject current=null] : iv_ruleSymbolRef= ruleSymbolRef EOF ;
    public final EObject entryRuleSymbolRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolRef = null;


        try {
            // InternalAdaptSem.g:1851:50: (iv_ruleSymbolRef= ruleSymbolRef EOF )
            // InternalAdaptSem.g:1852:2: iv_ruleSymbolRef= ruleSymbolRef EOF
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
    // InternalAdaptSem.g:1858:1: ruleSymbolRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSymbolRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1864:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAdaptSem.g:1865:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAdaptSem.g:1865:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalAdaptSem.g:1866:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalAdaptSem.g:1866:3: ()
            // InternalAdaptSem.g:1867:4: 
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

            // InternalAdaptSem.g:1876:3: ( (otherlv_1= RULE_ID ) )
            // InternalAdaptSem.g:1877:4: (otherlv_1= RULE_ID )
            {
            // InternalAdaptSem.g:1877:4: (otherlv_1= RULE_ID )
            // InternalAdaptSem.g:1878:5: otherlv_1= RULE_ID
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
    // InternalAdaptSem.g:1896:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalAdaptSem.g:1896:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalAdaptSem.g:1897:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalAdaptSem.g:1903:1: ruleListDef returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) ) )? ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;

        EObject lv_symbol_6_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1909:2: ( (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) ) )? ) )
            // InternalAdaptSem.g:1910:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) ) )? )
            {
            // InternalAdaptSem.g:1910:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) ) )? )
            // InternalAdaptSem.g:1911:3: otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' (otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAdaptSem.g:1915:3: ( (lv_head_1_0= ruleSingleTermDef ) )
            // InternalAdaptSem.g:1916:4: (lv_head_1_0= ruleSingleTermDef )
            {
            // InternalAdaptSem.g:1916:4: (lv_head_1_0= ruleSingleTermDef )
            // InternalAdaptSem.g:1917:5: lv_head_1_0= ruleSingleTermDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getHeadSingleTermDefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListDefAccess().getVerticalLineKeyword_2());
              		
            }
            // InternalAdaptSem.g:1938:3: ( (lv_tail_3_0= ruleSymbolDef ) )
            // InternalAdaptSem.g:1939:4: (lv_tail_3_0= ruleSymbolDef )
            {
            // InternalAdaptSem.g:1939:4: (lv_tail_3_0= ruleSymbolDef )
            // InternalAdaptSem.g:1940:5: lv_tail_3_0= ruleSymbolDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getTailSymbolDefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getListDefAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalAdaptSem.g:1961:3: (otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAdaptSem.g:1962:4: otherlv_5= ':' ( (lv_symbol_6_0= ruleSymbolDef ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getListDefAccess().getColonKeyword_5_0());
                      			
                    }
                    // InternalAdaptSem.g:1966:4: ( (lv_symbol_6_0= ruleSymbolDef ) )
                    // InternalAdaptSem.g:1967:5: (lv_symbol_6_0= ruleSymbolDef )
                    {
                    // InternalAdaptSem.g:1967:5: (lv_symbol_6_0= ruleSymbolDef )
                    // InternalAdaptSem.g:1968:6: lv_symbol_6_0= ruleSymbolDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListDefAccess().getSymbolSymbolDefParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_6_0=ruleSymbolDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListDefRule());
                      						}
                      						set(
                      							current,
                      							"symbol",
                      							lv_symbol_6_0,
                      							"fr.irisa.diverse.adaptivesemantics.AdaptSem.SymbolDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


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
    // $ANTLR end "ruleListDef"


    // $ANTLR start "entryRuleListRef"
    // InternalAdaptSem.g:1990:1: entryRuleListRef returns [EObject current=null] : iv_ruleListRef= ruleListRef EOF ;
    public final EObject entryRuleListRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListRef = null;


        try {
            // InternalAdaptSem.g:1990:48: (iv_ruleListRef= ruleListRef EOF )
            // InternalAdaptSem.g:1991:2: iv_ruleListRef= ruleListRef EOF
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
    // InternalAdaptSem.g:1997:1: ruleListRef returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' ) ;
    public final EObject ruleListRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2003:2: ( (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' ) )
            // InternalAdaptSem.g:2004:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' )
            {
            // InternalAdaptSem.g:2004:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' )
            // InternalAdaptSem.g:2005:3: otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAdaptSem.g:2009:3: ( (lv_head_1_0= ruleSymbolRef ) )
            // InternalAdaptSem.g:2010:4: (lv_head_1_0= ruleSymbolRef )
            {
            // InternalAdaptSem.g:2010:4: (lv_head_1_0= ruleSymbolRef )
            // InternalAdaptSem.g:2011:5: lv_head_1_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListRefAccess().getHeadSymbolRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListRefAccess().getVerticalLineKeyword_2());
              		
            }
            // InternalAdaptSem.g:2032:3: ( (lv_tail_3_0= ruleSymbolRef ) )
            // InternalAdaptSem.g:2033:4: (lv_tail_3_0= ruleSymbolRef )
            {
            // InternalAdaptSem.g:2033:4: (lv_tail_3_0= ruleSymbolRef )
            // InternalAdaptSem.g:2034:5: lv_tail_3_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListRefAccess().getTailSymbolRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:2059:1: entryRuleVoidList returns [EObject current=null] : iv_ruleVoidList= ruleVoidList EOF ;
    public final EObject entryRuleVoidList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidList = null;


        try {
            // InternalAdaptSem.g:2059:49: (iv_ruleVoidList= ruleVoidList EOF )
            // InternalAdaptSem.g:2060:2: iv_ruleVoidList= ruleVoidList EOF
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
    // InternalAdaptSem.g:2066:1: ruleVoidList returns [EObject current=null] : ( () otherlv_1= '[]' ) ;
    public final EObject ruleVoidList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:2072:2: ( ( () otherlv_1= '[]' ) )
            // InternalAdaptSem.g:2073:2: ( () otherlv_1= '[]' )
            {
            // InternalAdaptSem.g:2073:2: ( () otherlv_1= '[]' )
            // InternalAdaptSem.g:2074:3: () otherlv_1= '[]'
            {
            // InternalAdaptSem.g:2074:3: ()
            // InternalAdaptSem.g:2075:4: 
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

            otherlv_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:2092:1: entryRuleCondExpr returns [EObject current=null] : iv_ruleCondExpr= ruleCondExpr EOF ;
    public final EObject entryRuleCondExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondExpr = null;


        try {
            // InternalAdaptSem.g:2092:49: (iv_ruleCondExpr= ruleCondExpr EOF )
            // InternalAdaptSem.g:2093:2: iv_ruleCondExpr= ruleCondExpr EOF
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
    // InternalAdaptSem.g:2099:1: ruleCondExpr returns [EObject current=null] : (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs ) ;
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
            // InternalAdaptSem.g:2105:2: ( (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs ) )
            // InternalAdaptSem.g:2106:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs )
            {
            // InternalAdaptSem.g:2106:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs )
            int alt37=6;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalAdaptSem.g:2107:3: this_CondOr_0= ruleCondOr
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
                    // InternalAdaptSem.g:2119:3: this_CondAnd_1= ruleCondAnd
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
                    // InternalAdaptSem.g:2131:3: this_CondEquality_2= ruleCondEquality
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
                    // InternalAdaptSem.g:2143:3: this_CondComparison_3= ruleCondComparison
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
                    // InternalAdaptSem.g:2155:3: this_CondNot_4= ruleCondNot
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
                    // InternalAdaptSem.g:2167:3: this_CondIs_5= ruleCondIs
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
    // InternalAdaptSem.g:2182:1: entryRuleCondNot returns [EObject current=null] : iv_ruleCondNot= ruleCondNot EOF ;
    public final EObject entryRuleCondNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondNot = null;


        try {
            // InternalAdaptSem.g:2182:48: (iv_ruleCondNot= ruleCondNot EOF )
            // InternalAdaptSem.g:2183:2: iv_ruleCondNot= ruleCondNot EOF
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
    // InternalAdaptSem.g:2189:1: ruleCondNot returns [EObject current=null] : ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleCondNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2195:2: ( ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalAdaptSem.g:2196:2: ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalAdaptSem.g:2196:2: ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalAdaptSem.g:2197:3: () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalAdaptSem.g:2197:3: ()
            // InternalAdaptSem.g:2198:4: 
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

            otherlv_1=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1());
              		
            }
            // InternalAdaptSem.g:2211:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalAdaptSem.g:2212:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalAdaptSem.g:2212:4: (lv_expr_2_0= ruleExpr )
            // InternalAdaptSem.g:2213:5: lv_expr_2_0= ruleExpr
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
    // InternalAdaptSem.g:2234:1: entryRuleCondOr returns [EObject current=null] : iv_ruleCondOr= ruleCondOr EOF ;
    public final EObject entryRuleCondOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondOr = null;


        try {
            // InternalAdaptSem.g:2234:47: (iv_ruleCondOr= ruleCondOr EOF )
            // InternalAdaptSem.g:2235:2: iv_ruleCondOr= ruleCondOr EOF
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
    // InternalAdaptSem.g:2241:1: ruleCondOr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) ) ;
    public final EObject ruleCondOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2247:2: ( ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) ) )
            // InternalAdaptSem.g:2248:2: ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )
            {
            // InternalAdaptSem.g:2248:2: ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )
            // InternalAdaptSem.g:2249:3: () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            {
            // InternalAdaptSem.g:2249:3: ()
            // InternalAdaptSem.g:2250:4: 
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

            // InternalAdaptSem.g:2259:3: ( (lv_lhs_1_0= ruleAnd ) )
            // InternalAdaptSem.g:2260:4: (lv_lhs_1_0= ruleAnd )
            {
            // InternalAdaptSem.g:2260:4: (lv_lhs_1_0= ruleAnd )
            // InternalAdaptSem.g:2261:5: lv_lhs_1_0= ruleAnd
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondOrAccess().getLhsAndParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2());
              		
            }
            // InternalAdaptSem.g:2282:3: ( (lv_rhs_3_0= ruleAnd ) )
            // InternalAdaptSem.g:2283:4: (lv_rhs_3_0= ruleAnd )
            {
            // InternalAdaptSem.g:2283:4: (lv_rhs_3_0= ruleAnd )
            // InternalAdaptSem.g:2284:5: lv_rhs_3_0= ruleAnd
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
    // InternalAdaptSem.g:2305:1: entryRuleCondAnd returns [EObject current=null] : iv_ruleCondAnd= ruleCondAnd EOF ;
    public final EObject entryRuleCondAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondAnd = null;


        try {
            // InternalAdaptSem.g:2305:48: (iv_ruleCondAnd= ruleCondAnd EOF )
            // InternalAdaptSem.g:2306:2: iv_ruleCondAnd= ruleCondAnd EOF
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
    // InternalAdaptSem.g:2312:1: ruleCondAnd returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) ) ;
    public final EObject ruleCondAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2318:2: ( ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) ) )
            // InternalAdaptSem.g:2319:2: ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )
            {
            // InternalAdaptSem.g:2319:2: ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )
            // InternalAdaptSem.g:2320:3: () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            {
            // InternalAdaptSem.g:2320:3: ()
            // InternalAdaptSem.g:2321:4: 
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

            // InternalAdaptSem.g:2330:3: ( (lv_lhs_1_0= ruleEquality ) )
            // InternalAdaptSem.g:2331:4: (lv_lhs_1_0= ruleEquality )
            {
            // InternalAdaptSem.g:2331:4: (lv_lhs_1_0= ruleEquality )
            // InternalAdaptSem.g:2332:5: lv_lhs_1_0= ruleEquality
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondAndAccess().getLhsEqualityParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2());
              		
            }
            // InternalAdaptSem.g:2353:3: ( (lv_rhs_3_0= ruleEquality ) )
            // InternalAdaptSem.g:2354:4: (lv_rhs_3_0= ruleEquality )
            {
            // InternalAdaptSem.g:2354:4: (lv_rhs_3_0= ruleEquality )
            // InternalAdaptSem.g:2355:5: lv_rhs_3_0= ruleEquality
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
    // InternalAdaptSem.g:2376:1: entryRuleCondEquality returns [EObject current=null] : iv_ruleCondEquality= ruleCondEquality EOF ;
    public final EObject entryRuleCondEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondEquality = null;


        try {
            // InternalAdaptSem.g:2376:53: (iv_ruleCondEquality= ruleCondEquality EOF )
            // InternalAdaptSem.g:2377:2: iv_ruleCondEquality= ruleCondEquality EOF
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
    // InternalAdaptSem.g:2383:1: ruleCondEquality returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) ) ;
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
            // InternalAdaptSem.g:2389:2: ( ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) ) )
            // InternalAdaptSem.g:2390:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )
            {
            // InternalAdaptSem.g:2390:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalAdaptSem.g:2391:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
                    {
                    // InternalAdaptSem.g:2391:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
                    // InternalAdaptSem.g:2392:4: () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) )
                    {
                    // InternalAdaptSem.g:2392:4: ()
                    // InternalAdaptSem.g:2393:5: 
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

                    // InternalAdaptSem.g:2402:4: ( (lv_lhs_1_0= ruleComparison ) )
                    // InternalAdaptSem.g:2403:5: (lv_lhs_1_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2403:5: (lv_lhs_1_0= ruleComparison )
                    // InternalAdaptSem.g:2404:6: lv_lhs_1_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2());
                      			
                    }
                    // InternalAdaptSem.g:2425:4: ( (lv_rhs_3_0= ruleComparison ) )
                    // InternalAdaptSem.g:2426:5: (lv_rhs_3_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2426:5: (lv_rhs_3_0= ruleComparison )
                    // InternalAdaptSem.g:2427:6: lv_rhs_3_0= ruleComparison
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
                    // InternalAdaptSem.g:2446:3: ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) )
                    {
                    // InternalAdaptSem.g:2446:3: ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) )
                    // InternalAdaptSem.g:2447:4: () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) )
                    {
                    // InternalAdaptSem.g:2447:4: ()
                    // InternalAdaptSem.g:2448:5: 
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

                    // InternalAdaptSem.g:2457:4: ( (lv_lhs_5_0= ruleComparison ) )
                    // InternalAdaptSem.g:2458:5: (lv_lhs_5_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2458:5: (lv_lhs_5_0= ruleComparison )
                    // InternalAdaptSem.g:2459:6: lv_lhs_5_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    otherlv_6=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAdaptSem.g:2480:4: ( (lv_rhs_7_0= ruleComparison ) )
                    // InternalAdaptSem.g:2481:5: (lv_rhs_7_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2481:5: (lv_rhs_7_0= ruleComparison )
                    // InternalAdaptSem.g:2482:6: lv_rhs_7_0= ruleComparison
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
    // InternalAdaptSem.g:2504:1: entryRuleCondComparison returns [EObject current=null] : iv_ruleCondComparison= ruleCondComparison EOF ;
    public final EObject entryRuleCondComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondComparison = null;


        try {
            // InternalAdaptSem.g:2504:55: (iv_ruleCondComparison= ruleCondComparison EOF )
            // InternalAdaptSem.g:2505:2: iv_ruleCondComparison= ruleCondComparison EOF
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
    // InternalAdaptSem.g:2511:1: ruleCondComparison returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) ) ;
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
            // InternalAdaptSem.g:2517:2: ( ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) ) )
            // InternalAdaptSem.g:2518:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )
            {
            // InternalAdaptSem.g:2518:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalAdaptSem.g:2519:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
                    {
                    // InternalAdaptSem.g:2519:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
                    // InternalAdaptSem.g:2520:4: () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) )
                    {
                    // InternalAdaptSem.g:2520:4: ()
                    // InternalAdaptSem.g:2521:5: 
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

                    // InternalAdaptSem.g:2530:4: ( (lv_lhs_1_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2531:5: (lv_lhs_1_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2531:5: (lv_lhs_1_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2532:6: lv_lhs_1_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    otherlv_2=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2());
                      			
                    }
                    // InternalAdaptSem.g:2553:4: ( (lv_rhs_3_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2554:5: (lv_rhs_3_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2554:5: (lv_rhs_3_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2555:6: lv_rhs_3_0= rulePlusOrMinus
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
                    // InternalAdaptSem.g:2574:3: ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) )
                    {
                    // InternalAdaptSem.g:2574:3: ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) )
                    // InternalAdaptSem.g:2575:4: () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) )
                    {
                    // InternalAdaptSem.g:2575:4: ()
                    // InternalAdaptSem.g:2576:5: 
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

                    // InternalAdaptSem.g:2585:4: ( (lv_lhs_5_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2586:5: (lv_lhs_5_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2586:5: (lv_lhs_5_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2587:6: lv_lhs_5_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
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

                    otherlv_6=(Token)match(input,43,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAdaptSem.g:2608:4: ( (lv_rhs_7_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2609:5: (lv_rhs_7_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2609:5: (lv_rhs_7_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2610:6: lv_rhs_7_0= rulePlusOrMinus
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
    // InternalAdaptSem.g:2632:1: entryRuleCondIs returns [EObject current=null] : iv_ruleCondIs= ruleCondIs EOF ;
    public final EObject entryRuleCondIs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondIs = null;


        try {
            // InternalAdaptSem.g:2632:47: (iv_ruleCondIs= ruleCondIs EOF )
            // InternalAdaptSem.g:2633:2: iv_ruleCondIs= ruleCondIs EOF
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
    // InternalAdaptSem.g:2639:1: ruleCondIs returns [EObject current=null] : ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) ) ;
    public final EObject ruleCondIs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_pattern_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2645:2: ( ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) ) )
            // InternalAdaptSem.g:2646:2: ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) )
            {
            // InternalAdaptSem.g:2646:2: ( () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) ) )
            // InternalAdaptSem.g:2647:3: () ( (lv_pattern_1_0= ruleDefConfiguration ) ) otherlv_2= 'match' ( (lv_expr_3_0= ruleExpr ) )
            {
            // InternalAdaptSem.g:2647:3: ()
            // InternalAdaptSem.g:2648:4: 
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

            // InternalAdaptSem.g:2657:3: ( (lv_pattern_1_0= ruleDefConfiguration ) )
            // InternalAdaptSem.g:2658:4: (lv_pattern_1_0= ruleDefConfiguration )
            {
            // InternalAdaptSem.g:2658:4: (lv_pattern_1_0= ruleDefConfiguration )
            // InternalAdaptSem.g:2659:5: lv_pattern_1_0= ruleDefConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondIsAccess().getPatternDefConfigurationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            otherlv_2=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondIsAccess().getMatchKeyword_2());
              		
            }
            // InternalAdaptSem.g:2680:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalAdaptSem.g:2681:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalAdaptSem.g:2681:4: (lv_expr_3_0= ruleExpr )
            // InternalAdaptSem.g:2682:5: lv_expr_3_0= ruleExpr
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
    // InternalAdaptSem.g:2703:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalAdaptSem.g:2703:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalAdaptSem.g:2704:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalAdaptSem.g:2710:1: ruleExpr returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2716:2: (this_Or_0= ruleOr )
            // InternalAdaptSem.g:2717:2: this_Or_0= ruleOr
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
    // InternalAdaptSem.g:2731:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalAdaptSem.g:2731:43: (iv_ruleOr= ruleOr EOF )
            // InternalAdaptSem.g:2732:2: iv_ruleOr= ruleOr EOF
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
    // InternalAdaptSem.g:2738:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2744:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) )
            // InternalAdaptSem.g:2745:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            {
            // InternalAdaptSem.g:2745:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            // InternalAdaptSem.g:2746:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2757:3: ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==38) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdaptSem.g:2758:4: () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            	    {
            	    // InternalAdaptSem.g:2758:4: ()
            	    // InternalAdaptSem.g:2759:5: 
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

            	    otherlv_2=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalAdaptSem.g:2772:4: ( (lv_rhs_3_0= ruleAnd ) )
            	    // InternalAdaptSem.g:2773:5: (lv_rhs_3_0= ruleAnd )
            	    {
            	    // InternalAdaptSem.g:2773:5: (lv_rhs_3_0= ruleAnd )
            	    // InternalAdaptSem.g:2774:6: lv_rhs_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop40;
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
    // InternalAdaptSem.g:2796:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalAdaptSem.g:2796:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalAdaptSem.g:2797:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalAdaptSem.g:2803:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2809:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) )
            // InternalAdaptSem.g:2810:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            {
            // InternalAdaptSem.g:2810:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            // InternalAdaptSem.g:2811:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2822:3: ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAdaptSem.g:2823:4: () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            	    {
            	    // InternalAdaptSem.g:2823:4: ()
            	    // InternalAdaptSem.g:2824:5: 
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

            	    otherlv_2=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalAdaptSem.g:2837:4: ( (lv_rhs_3_0= ruleEquality ) )
            	    // InternalAdaptSem.g:2838:5: (lv_rhs_3_0= ruleEquality )
            	    {
            	    // InternalAdaptSem.g:2838:5: (lv_rhs_3_0= ruleEquality )
            	    // InternalAdaptSem.g:2839:6: lv_rhs_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalAdaptSem.g:2861:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalAdaptSem.g:2861:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalAdaptSem.g:2862:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalAdaptSem.g:2868:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2874:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* ) )
            // InternalAdaptSem.g:2875:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* )
            {
            // InternalAdaptSem.g:2875:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* )
            // InternalAdaptSem.g:2876:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2887:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=40 && LA43_0<=41)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdaptSem.g:2888:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) )
            	    {
            	    // InternalAdaptSem.g:2888:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==40) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==41) ) {
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
            	            // InternalAdaptSem.g:2889:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalAdaptSem.g:2889:5: ( () otherlv_2= '==' )
            	            // InternalAdaptSem.g:2890:6: () otherlv_2= '=='
            	            {
            	            // InternalAdaptSem.g:2890:6: ()
            	            // InternalAdaptSem.g:2891:7: 
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

            	            otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:2906:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalAdaptSem.g:2906:5: ( () otherlv_4= '!=' )
            	            // InternalAdaptSem.g:2907:6: () otherlv_4= '!='
            	            {
            	            // InternalAdaptSem.g:2907:6: ()
            	            // InternalAdaptSem.g:2908:7: 
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

            	            otherlv_4=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:2923:4: ( (lv_rhs_5_0= ruleComparison ) )
            	    // InternalAdaptSem.g:2924:5: (lv_rhs_5_0= ruleComparison )
            	    {
            	    // InternalAdaptSem.g:2924:5: (lv_rhs_5_0= ruleComparison )
            	    // InternalAdaptSem.g:2925:6: lv_rhs_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalAdaptSem.g:2947:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalAdaptSem.g:2947:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalAdaptSem.g:2948:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalAdaptSem.g:2954:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2960:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* ) )
            // InternalAdaptSem.g:2961:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* )
            {
            // InternalAdaptSem.g:2961:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* )
            // InternalAdaptSem.g:2962:3: this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2973:3: ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=42 && LA45_0<=43)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAdaptSem.g:2974:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) )
            	    {
            	    // InternalAdaptSem.g:2974:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==42) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==43) ) {
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
            	            // InternalAdaptSem.g:2975:5: ( () otherlv_2= '<' )
            	            {
            	            // InternalAdaptSem.g:2975:5: ( () otherlv_2= '<' )
            	            // InternalAdaptSem.g:2976:6: () otherlv_2= '<'
            	            {
            	            // InternalAdaptSem.g:2976:6: ()
            	            // InternalAdaptSem.g:2977:7: 
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

            	            otherlv_2=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:2992:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalAdaptSem.g:2992:5: ( () otherlv_4= '<=' )
            	            // InternalAdaptSem.g:2993:6: () otherlv_4= '<='
            	            {
            	            // InternalAdaptSem.g:2993:6: ()
            	            // InternalAdaptSem.g:2994:7: 
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

            	            otherlv_4=(Token)match(input,43,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:3009:4: ( (lv_rhs_5_0= rulePlusOrMinus ) )
            	    // InternalAdaptSem.g:3010:5: (lv_rhs_5_0= rulePlusOrMinus )
            	    {
            	    // InternalAdaptSem.g:3010:5: (lv_rhs_5_0= rulePlusOrMinus )
            	    // InternalAdaptSem.g:3011:6: lv_rhs_5_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalAdaptSem.g:3033:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalAdaptSem.g:3033:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalAdaptSem.g:3034:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalAdaptSem.g:3040:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:3046:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalAdaptSem.g:3047:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalAdaptSem.g:3047:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* )
            // InternalAdaptSem.g:3048:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:3059:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=45 && LA47_0<=46)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAdaptSem.g:3060:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalAdaptSem.g:3060:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==45) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==46) ) {
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
            	            // InternalAdaptSem.g:3061:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalAdaptSem.g:3061:5: ( () otherlv_2= '+' )
            	            // InternalAdaptSem.g:3062:6: () otherlv_2= '+'
            	            {
            	            // InternalAdaptSem.g:3062:6: ()
            	            // InternalAdaptSem.g:3063:7: 
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

            	            otherlv_2=(Token)match(input,45,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:3078:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalAdaptSem.g:3078:5: ( () otherlv_4= '-' )
            	            // InternalAdaptSem.g:3079:6: () otherlv_4= '-'
            	            {
            	            // InternalAdaptSem.g:3079:6: ()
            	            // InternalAdaptSem.g:3080:7: 
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

            	            otherlv_4=(Token)match(input,46,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:3095:4: ( (lv_rhs_5_0= ruleMulOrDiv ) )
            	    // InternalAdaptSem.g:3096:5: (lv_rhs_5_0= ruleMulOrDiv )
            	    {
            	    // InternalAdaptSem.g:3096:5: (lv_rhs_5_0= ruleMulOrDiv )
            	    // InternalAdaptSem.g:3097:6: lv_rhs_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRhsMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalAdaptSem.g:3119:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalAdaptSem.g:3119:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalAdaptSem.g:3120:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalAdaptSem.g:3126:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:3132:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // InternalAdaptSem.g:3133:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // InternalAdaptSem.g:3133:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // InternalAdaptSem.g:3134:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:3145:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=47 && LA49_0<=48)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAdaptSem.g:3146:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // InternalAdaptSem.g:3146:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==47) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==48) ) {
            	        alt48=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalAdaptSem.g:3147:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalAdaptSem.g:3147:5: ( () otherlv_2= '*' )
            	            // InternalAdaptSem.g:3148:6: () otherlv_2= '*'
            	            {
            	            // InternalAdaptSem.g:3148:6: ()
            	            // InternalAdaptSem.g:3149:7: 
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

            	            otherlv_2=(Token)match(input,47,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:3164:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalAdaptSem.g:3164:5: ( () otherlv_4= '/' )
            	            // InternalAdaptSem.g:3165:6: () otherlv_4= '/'
            	            {
            	            // InternalAdaptSem.g:3165:6: ()
            	            // InternalAdaptSem.g:3166:7: 
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

            	            otherlv_4=(Token)match(input,48,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:3181:4: ( (lv_rhs_5_0= rulePrimary ) )
            	    // InternalAdaptSem.g:3182:5: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // InternalAdaptSem.g:3182:5: (lv_rhs_5_0= rulePrimary )
            	    // InternalAdaptSem.g:3183:6: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRhsPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop49;
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
    // InternalAdaptSem.g:3205:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAdaptSem.g:3205:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAdaptSem.g:3206:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalAdaptSem.g:3212:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic ) ;
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
            // InternalAdaptSem.g:3218:2: ( ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic ) )
            // InternalAdaptSem.g:3219:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic )
            {
            // InternalAdaptSem.g:3219:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic )
            int alt50=5;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalAdaptSem.g:3220:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    {
                    // InternalAdaptSem.g:3220:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    // InternalAdaptSem.g:3221:4: otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_45);
                    this_Expr_1=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptSem.g:3242:3: ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) )
                    {
                    // InternalAdaptSem.g:3242:3: ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) )
                    // InternalAdaptSem.g:3243:4: () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) )
                    {
                    // InternalAdaptSem.g:3243:4: ()
                    // InternalAdaptSem.g:3244:5: 
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

                    otherlv_4=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalAdaptSem.g:3257:4: ( (lv_expr_5_0= rulePrimary ) )
                    // InternalAdaptSem.g:3258:5: (lv_expr_5_0= rulePrimary )
                    {
                    // InternalAdaptSem.g:3258:5: (lv_expr_5_0= rulePrimary )
                    // InternalAdaptSem.g:3259:6: lv_expr_5_0= rulePrimary
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
                    // InternalAdaptSem.g:3278:3: ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) )
                    {
                    // InternalAdaptSem.g:3278:3: ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) )
                    // InternalAdaptSem.g:3279:4: () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) )
                    {
                    // InternalAdaptSem.g:3279:4: ()
                    // InternalAdaptSem.g:3280:5: 
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

                    otherlv_7=(Token)match(input,46,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalAdaptSem.g:3293:4: ( (lv_expr_8_0= rulePrimary ) )
                    // InternalAdaptSem.g:3294:5: (lv_expr_8_0= rulePrimary )
                    {
                    // InternalAdaptSem.g:3294:5: (lv_expr_8_0= rulePrimary )
                    // InternalAdaptSem.g:3295:6: lv_expr_8_0= rulePrimary
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
                    // InternalAdaptSem.g:3314:3: ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) )
                    {
                    // InternalAdaptSem.g:3314:3: ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) )
                    // InternalAdaptSem.g:3315:4: () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) )
                    {
                    // InternalAdaptSem.g:3315:4: ()
                    // InternalAdaptSem.g:3316:5: 
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

                    // InternalAdaptSem.g:3325:4: ( (lv_pattern_10_0= ruleDefConfiguration ) )
                    // InternalAdaptSem.g:3326:5: (lv_pattern_10_0= ruleDefConfiguration )
                    {
                    // InternalAdaptSem.g:3326:5: (lv_pattern_10_0= ruleDefConfiguration )
                    // InternalAdaptSem.g:3327:6: lv_pattern_10_0= ruleDefConfiguration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getPatternDefConfigurationParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    otherlv_11=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getMatchKeyword_3_2());
                      			
                    }
                    // InternalAdaptSem.g:3348:4: ( (lv_expr_12_0= rulePrimary ) )
                    // InternalAdaptSem.g:3349:5: (lv_expr_12_0= rulePrimary )
                    {
                    // InternalAdaptSem.g:3349:5: (lv_expr_12_0= rulePrimary )
                    // InternalAdaptSem.g:3350:6: lv_expr_12_0= rulePrimary
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
                    // InternalAdaptSem.g:3369:3: this_Atomic_13= ruleAtomic
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
    // InternalAdaptSem.g:3384:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalAdaptSem.g:3384:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalAdaptSem.g:3385:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalAdaptSem.g:3391:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression ) ;
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
            // InternalAdaptSem.g:3397:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:3398:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:3398:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression )
            int alt51=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt51=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt51=2;
                }
                break;
            case RULE_STRING:
                {
                alt51=3;
                }
                break;
            case RULE_BOOL:
                {
                alt51=4;
                }
                break;
            case RULE_ID:
                {
                int LA51_5 = input.LA(2);

                if ( (LA51_5==EOF||LA51_5==17||(LA51_5>=20 && LA51_5<=23)||LA51_5==26||(LA51_5>=38 && LA51_5<=43)||(LA51_5>=45 && LA51_5<=48)) ) {
                    alt51=6;
                }
                else if ( (LA51_5==28) ) {
                    alt51=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 5, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA51_6 = input.LA(2);

                if ( (LA51_6==EOF||LA51_6==17||(LA51_6>=20 && LA51_6<=23)||LA51_6==26||(LA51_6>=38 && LA51_6<=43)||(LA51_6>=45 && LA51_6<=48)) ) {
                    alt51=6;
                }
                else if ( (LA51_6==28) ) {
                    alt51=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalAdaptSem.g:3399:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalAdaptSem.g:3399:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalAdaptSem.g:3400:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalAdaptSem.g:3400:4: ()
                    // InternalAdaptSem.g:3401:5: 
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

                    // InternalAdaptSem.g:3410:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalAdaptSem.g:3411:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalAdaptSem.g:3411:5: (lv_value_1_0= RULE_INT )
                    // InternalAdaptSem.g:3412:6: lv_value_1_0= RULE_INT
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
                    // InternalAdaptSem.g:3430:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    {
                    // InternalAdaptSem.g:3430:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    // InternalAdaptSem.g:3431:4: () ( (lv_value_3_0= RULE_DOUBLE ) )
                    {
                    // InternalAdaptSem.g:3431:4: ()
                    // InternalAdaptSem.g:3432:5: 
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

                    // InternalAdaptSem.g:3441:4: ( (lv_value_3_0= RULE_DOUBLE ) )
                    // InternalAdaptSem.g:3442:5: (lv_value_3_0= RULE_DOUBLE )
                    {
                    // InternalAdaptSem.g:3442:5: (lv_value_3_0= RULE_DOUBLE )
                    // InternalAdaptSem.g:3443:6: lv_value_3_0= RULE_DOUBLE
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
                    // InternalAdaptSem.g:3461:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalAdaptSem.g:3461:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalAdaptSem.g:3462:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalAdaptSem.g:3462:4: ()
                    // InternalAdaptSem.g:3463:5: 
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

                    // InternalAdaptSem.g:3472:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalAdaptSem.g:3473:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalAdaptSem.g:3473:5: (lv_value_5_0= RULE_STRING )
                    // InternalAdaptSem.g:3474:6: lv_value_5_0= RULE_STRING
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
                    // InternalAdaptSem.g:3492:3: ( () ( (lv_value_7_0= RULE_BOOL ) ) )
                    {
                    // InternalAdaptSem.g:3492:3: ( () ( (lv_value_7_0= RULE_BOOL ) ) )
                    // InternalAdaptSem.g:3493:4: () ( (lv_value_7_0= RULE_BOOL ) )
                    {
                    // InternalAdaptSem.g:3493:4: ()
                    // InternalAdaptSem.g:3494:5: 
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

                    // InternalAdaptSem.g:3503:4: ( (lv_value_7_0= RULE_BOOL ) )
                    // InternalAdaptSem.g:3504:5: (lv_value_7_0= RULE_BOOL )
                    {
                    // InternalAdaptSem.g:3504:5: (lv_value_7_0= RULE_BOOL )
                    // InternalAdaptSem.g:3505:6: lv_value_7_0= RULE_BOOL
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
                    // InternalAdaptSem.g:3523:3: this_SemanticDomainAccess_8= ruleSemanticDomainAccess
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
                    // InternalAdaptSem.g:3535:3: this_TerminalAccessExpression_9= ruleTerminalAccessExpression
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
    // InternalAdaptSem.g:3550:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAdaptSem.g:3550:47: (iv_ruleEString= ruleEString EOF )
            // InternalAdaptSem.g:3551:2: iv_ruleEString= ruleEString EOF
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
    // InternalAdaptSem.g:3557:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:3563:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAdaptSem.g:3564:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAdaptSem.g:3564:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAdaptSem.g:3565:3: this_STRING_0= RULE_STRING
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
                    // InternalAdaptSem.g:3573:3: this_ID_1= RULE_ID
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
    // InternalAdaptSem.g:3584:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalAdaptSem.g:3584:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalAdaptSem.g:3585:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalAdaptSem.g:3591:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:3597:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAdaptSem.g:3598:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAdaptSem.g:3598:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAdaptSem.g:3599:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAdaptSem.g:3606:3: (kw= '.' this_ID_2= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==28) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAdaptSem.g:3607:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalAdaptSem.g:3624:1: entryRuleOperationFQN returns [String current=null] : iv_ruleOperationFQN= ruleOperationFQN EOF ;
    public final String entryRuleOperationFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationFQN = null;


        try {
            // InternalAdaptSem.g:3624:52: (iv_ruleOperationFQN= ruleOperationFQN EOF )
            // InternalAdaptSem.g:3625:2: iv_ruleOperationFQN= ruleOperationFQN EOF
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
    // InternalAdaptSem.g:3631:1: ruleOperationFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleOperationFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:3637:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalAdaptSem.g:3638:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalAdaptSem.g:3638:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalAdaptSem.g:3639:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAdaptSem.g:3646:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==28) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAdaptSem.g:3647:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOperationFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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

    // $ANTLR start synpred21_InternalAdaptSem
    public final void synpred21_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_Expr_0 = null;


        // InternalAdaptSem.g:1000:3: (this_Expr_0= ruleExpr )
        // InternalAdaptSem.g:1000:3: this_Expr_0= ruleExpr
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
    // $ANTLR end synpred21_InternalAdaptSem

    // $ANTLR start synpred22_InternalAdaptSem
    public final void synpred22_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_RefConfiguration_1 = null;


        // InternalAdaptSem.g:1012:3: (this_RefConfiguration_1= ruleRefConfiguration )
        // InternalAdaptSem.g:1012:3: this_RefConfiguration_1= ruleRefConfiguration
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
    // $ANTLR end synpred22_InternalAdaptSem

    // $ANTLR start synpred41_InternalAdaptSem
    public final void synpred41_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondOr_0 = null;


        // InternalAdaptSem.g:2107:3: (this_CondOr_0= ruleCondOr )
        // InternalAdaptSem.g:2107:3: this_CondOr_0= ruleCondOr
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
    // $ANTLR end synpred41_InternalAdaptSem

    // $ANTLR start synpred42_InternalAdaptSem
    public final void synpred42_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondAnd_1 = null;


        // InternalAdaptSem.g:2119:3: (this_CondAnd_1= ruleCondAnd )
        // InternalAdaptSem.g:2119:3: this_CondAnd_1= ruleCondAnd
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
    // $ANTLR end synpred42_InternalAdaptSem

    // $ANTLR start synpred43_InternalAdaptSem
    public final void synpred43_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondEquality_2 = null;


        // InternalAdaptSem.g:2131:3: (this_CondEquality_2= ruleCondEquality )
        // InternalAdaptSem.g:2131:3: this_CondEquality_2= ruleCondEquality
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
    // $ANTLR end synpred43_InternalAdaptSem

    // $ANTLR start synpred44_InternalAdaptSem
    public final void synpred44_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondComparison_3 = null;


        // InternalAdaptSem.g:2143:3: (this_CondComparison_3= ruleCondComparison )
        // InternalAdaptSem.g:2143:3: this_CondComparison_3= ruleCondComparison
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
    // $ANTLR end synpred44_InternalAdaptSem

    // $ANTLR start synpred45_InternalAdaptSem
    public final void synpred45_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondNot_4 = null;


        // InternalAdaptSem.g:2155:3: (this_CondNot_4= ruleCondNot )
        // InternalAdaptSem.g:2155:3: this_CondNot_4= ruleCondNot
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
    // $ANTLR end synpred45_InternalAdaptSem

    // $ANTLR start synpred46_InternalAdaptSem
    public final void synpred46_InternalAdaptSem_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


        // InternalAdaptSem.g:2391:3: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) )
        // InternalAdaptSem.g:2391:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
        {
        // InternalAdaptSem.g:2391:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
        // InternalAdaptSem.g:2392:4: () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) )
        {
        // InternalAdaptSem.g:2392:4: ()
        // InternalAdaptSem.g:2393:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAdaptSem.g:2402:4: ( (lv_lhs_1_0= ruleComparison ) )
        // InternalAdaptSem.g:2403:5: (lv_lhs_1_0= ruleComparison )
        {
        // InternalAdaptSem.g:2403:5: (lv_lhs_1_0= ruleComparison )
        // InternalAdaptSem.g:2404:6: lv_lhs_1_0= ruleComparison
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_34);
        lv_lhs_1_0=ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return ;
        // InternalAdaptSem.g:2425:4: ( (lv_rhs_3_0= ruleComparison ) )
        // InternalAdaptSem.g:2426:5: (lv_rhs_3_0= ruleComparison )
        {
        // InternalAdaptSem.g:2426:5: (lv_rhs_3_0= ruleComparison )
        // InternalAdaptSem.g:2427:6: lv_rhs_3_0= ruleComparison
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
    // $ANTLR end synpred46_InternalAdaptSem

    // $ANTLR start synpred47_InternalAdaptSem
    public final void synpred47_InternalAdaptSem_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


        // InternalAdaptSem.g:2519:3: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) )
        // InternalAdaptSem.g:2519:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
        {
        // InternalAdaptSem.g:2519:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
        // InternalAdaptSem.g:2520:4: () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) )
        {
        // InternalAdaptSem.g:2520:4: ()
        // InternalAdaptSem.g:2521:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAdaptSem.g:2530:4: ( (lv_lhs_1_0= rulePlusOrMinus ) )
        // InternalAdaptSem.g:2531:5: (lv_lhs_1_0= rulePlusOrMinus )
        {
        // InternalAdaptSem.g:2531:5: (lv_lhs_1_0= rulePlusOrMinus )
        // InternalAdaptSem.g:2532:6: lv_lhs_1_0= rulePlusOrMinus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_36);
        lv_lhs_1_0=rulePlusOrMinus();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,42,FOLLOW_11); if (state.failed) return ;
        // InternalAdaptSem.g:2553:4: ( (lv_rhs_3_0= rulePlusOrMinus ) )
        // InternalAdaptSem.g:2554:5: (lv_rhs_3_0= rulePlusOrMinus )
        {
        // InternalAdaptSem.g:2554:5: (lv_rhs_3_0= rulePlusOrMinus )
        // InternalAdaptSem.g:2555:6: lv_rhs_3_0= rulePlusOrMinus
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
    // $ANTLR end synpred47_InternalAdaptSem

    // Delegated rules

    public final boolean synpred43_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalAdaptSem_fragment(); // can never throw exception
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\4\1\30\1\uffff\1\4\1\30\1\4\1\uffff\1\30";
    static final String dfa_3s = "\1\35\1\34\1\uffff\1\4\1\34\1\4\1\uffff\1\34";
    static final String dfa_4s = "\2\uffff\1\1\3\uffff\1\2\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\30\uffff\1\2",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "490:4: ( ( (lv_inputs_17_0= ruleInput ) ) | ( (lv_outputs_18_0= ruleOutput ) ) )";
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "536:5: ( ( (lv_inputs_20_0= ruleInput ) ) | ( (lv_outputs_21_0= ruleOutput ) ) )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_9s = "\1\56\3\uffff\1\0\4\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String dfa_11s = "\4\uffff\1\0\4\uffff\1\1\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\4\1\20\uffff\1\1\3\uffff\1\11\7\uffff\1\1\10\uffff\1\1",
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
            return "999:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )";
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
                        if ( (synpred21_InternalAdaptSem()) ) {s = 1;}

                        else if ( (synpred22_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAdaptSem()) ) {s = 1;}

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
    static final String dfa_15s = "\1\56\11\0\6\uffff";
    static final String dfa_16s = "\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] dfa_18s = {
            "\1\4\1\5\1\6\1\7\1\10\20\uffff\1\1\3\uffff\1\11\7\uffff\1\2\10\uffff\1\3",
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

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2106:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot | this_CondIs_5= ruleCondIs )";
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
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                        else if ( (synpred45_InternalAdaptSem()) ) {s = 14;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred42_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred43_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred44_InternalAdaptSem()) ) {s = 13;}

                         
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
    static final String dfa_19s = "\1\4\11\0\2\uffff";
    static final String dfa_20s = "\1\56\11\0\2\uffff";
    static final String dfa_21s = "\12\uffff\1\1\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_23s = {
            "\1\4\1\5\1\6\1\7\1\10\20\uffff\1\1\3\uffff\1\11\7\uffff\1\2\10\uffff\1\3",
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

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2390:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2518:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_24s = "\13\uffff";
    static final String dfa_25s = "\4\uffff\1\5\3\uffff\1\5\1\uffff\1\5";
    static final String dfa_26s = "\1\4\3\uffff\1\21\1\uffff\1\4\1\uffff\1\21\1\4\1\21";
    static final String dfa_27s = "\1\56\3\uffff\1\60\1\uffff\1\4\1\uffff\1\60\1\4\1\60";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\4\3\uffff";
    static final String dfa_29s = "\13\uffff}>";
    static final String[] dfa_30s = {
            "\1\4\4\5\20\uffff\1\1\3\uffff\1\5\7\uffff\1\2\10\uffff\1\3",
            "",
            "",
            "",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\uffff\1\6\11\uffff\6\5\1\uffff\4\5",
            "",
            "\1\10",
            "",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\uffff\1\11\11\uffff\6\5\1\uffff\4\5",
            "\1\12",
            "\1\5\2\uffff\4\5\1\uffff\1\7\1\5\1\uffff\1\11\11\uffff\6\5\1\uffff\4\5"
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_24;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3219:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | ( () ( (lv_pattern_10_0= ruleDefConfiguration ) ) otherlv_11= 'match' ( (lv_expr_12_0= rulePrimary ) ) ) | this_Atomic_13= ruleAtomic )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000E80002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00004020220001F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000D00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001204000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001200000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001284000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001280000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000004000000L});

}