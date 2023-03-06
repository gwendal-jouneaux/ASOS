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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'with'", "'import'", "'as'", "'rule'", "','", "'where'", "';'", "'resolve'", "'bind'", "'IO'", "'='", "'('", "')'", "'.'", "'self'", "'->'", "'termination'", "'['", "'|'", "']'", "'[]'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'"
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
    // InternalAdaptSem.g:638:1: ruleInput returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_assignee_0_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:644:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' ) )
            // InternalAdaptSem.g:645:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' )
            {
            // InternalAdaptSem.g:645:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')' )
            // InternalAdaptSem.g:646:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( ( ruleOperationFQN ) ) otherlv_3= '(' otherlv_4= ')'
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
            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:700:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalAdaptSem.g:700:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalAdaptSem.g:701:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalAdaptSem.g:707:1: ruleOutput returns [EObject current=null] : ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:713:2: ( ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) )
            // InternalAdaptSem.g:714:2: ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            {
            // InternalAdaptSem.g:714:2: ( ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            // InternalAdaptSem.g:715:3: ( ( ruleOperationFQN ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )? otherlv_5= ')'
            {
            // InternalAdaptSem.g:715:3: ( ( ruleOperationFQN ) )
            // InternalAdaptSem.g:716:4: ( ruleOperationFQN )
            {
            // InternalAdaptSem.g:716:4: ( ruleOperationFQN )
            // InternalAdaptSem.g:717:5: ruleOperationFQN
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

            otherlv_1=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAdaptSem.g:738:3: ( ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==31||LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdaptSem.g:739:4: ( (lv_args_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )*
                    {
                    // InternalAdaptSem.g:739:4: ( (lv_args_2_0= ruleTermRef ) )
                    // InternalAdaptSem.g:740:5: (lv_args_2_0= ruleTermRef )
                    {
                    // InternalAdaptSem.g:740:5: (lv_args_2_0= ruleTermRef )
                    // InternalAdaptSem.g:741:6: lv_args_2_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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

                    // InternalAdaptSem.g:758:4: (otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAdaptSem.g:759:5: otherlv_3= ',' ( (lv_args_4_0= ruleTermRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:763:5: ( (lv_args_4_0= ruleTermRef ) )
                    	    // InternalAdaptSem.g:764:6: (lv_args_4_0= ruleTermRef )
                    	    {
                    	    // InternalAdaptSem.g:764:6: (lv_args_4_0= ruleTermRef )
                    	    // InternalAdaptSem.g:765:7: lv_args_4_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOutputAccess().getArgsTermRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:792:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalAdaptSem.g:792:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalAdaptSem.g:793:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalAdaptSem.g:799:1: ruleBinding returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignee_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:805:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) ) )
            // InternalAdaptSem.g:806:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) )
            {
            // InternalAdaptSem.g:806:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) ) )
            // InternalAdaptSem.g:807:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleAssignable ) )
            {
            // InternalAdaptSem.g:807:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalAdaptSem.g:808:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalAdaptSem.g:808:4: (lv_assignee_0_0= ruleAssignee )
            // InternalAdaptSem.g:809:5: lv_assignee_0_0= ruleAssignee
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
            // InternalAdaptSem.g:830:3: ( (lv_expr_2_0= ruleAssignable ) )
            // InternalAdaptSem.g:831:4: (lv_expr_2_0= ruleAssignable )
            {
            // InternalAdaptSem.g:831:4: (lv_expr_2_0= ruleAssignable )
            // InternalAdaptSem.g:832:5: lv_expr_2_0= ruleAssignable
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
    // InternalAdaptSem.g:853:1: entryRuleAssignable returns [EObject current=null] : iv_ruleAssignable= ruleAssignable EOF ;
    public final EObject entryRuleAssignable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignable = null;


        try {
            // InternalAdaptSem.g:853:51: (iv_ruleAssignable= ruleAssignable EOF )
            // InternalAdaptSem.g:854:2: iv_ruleAssignable= ruleAssignable EOF
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
    // InternalAdaptSem.g:860:1: ruleAssignable returns [EObject current=null] : (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess ) ;
    public final EObject ruleAssignable() throws RecognitionException {
        EObject current = null;

        EObject this_Expr_0 = null;

        EObject this_RefConfiguration_1 = null;

        EObject this_SemanticDomainAccess_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:866:2: ( (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess ) )
            // InternalAdaptSem.g:867:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )
            {
            // InternalAdaptSem.g:867:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalAdaptSem.g:868:3: this_Expr_0= ruleExpr
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
                    // InternalAdaptSem.g:880:3: this_RefConfiguration_1= ruleRefConfiguration
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
                    // InternalAdaptSem.g:892:3: this_SemanticDomainAccess_2= ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:907:1: entryRuleAssignee returns [EObject current=null] : iv_ruleAssignee= ruleAssignee EOF ;
    public final EObject entryRuleAssignee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignee = null;


        try {
            // InternalAdaptSem.g:907:49: (iv_ruleAssignee= ruleAssignee EOF )
            // InternalAdaptSem.g:908:2: iv_ruleAssignee= ruleAssignee EOF
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
    // InternalAdaptSem.g:914:1: ruleAssignee returns [EObject current=null] : (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess ) ;
    public final EObject ruleAssignee() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolDef_0 = null;

        EObject this_SemanticDomainAccess_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:920:2: ( (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess ) )
            // InternalAdaptSem.g:921:2: (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess )
            {
            // InternalAdaptSem.g:921:2: (this_SymbolDef_0= ruleSymbolDef | this_SemanticDomainAccess_1= ruleSemanticDomainAccess )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==27) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||LA16_1==24) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptSem.g:922:3: this_SymbolDef_0= ruleSymbolDef
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
                    // InternalAdaptSem.g:934:3: this_SemanticDomainAccess_1= ruleSemanticDomainAccess
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
    // InternalAdaptSem.g:949:1: entryRuleSemanticDomainAccess returns [EObject current=null] : iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF ;
    public final EObject entryRuleSemanticDomainAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticDomainAccess = null;


        try {
            // InternalAdaptSem.g:949:61: (iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF )
            // InternalAdaptSem.g:950:2: iv_ruleSemanticDomainAccess= ruleSemanticDomainAccess EOF
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
    // InternalAdaptSem.g:956:1: ruleSemanticDomainAccess returns [EObject current=null] : ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* ) ;
    public final EObject ruleSemanticDomainAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_field_2_0=null;
        Token otherlv_4=null;
        Token lv_field_5_0=null;
        EObject lv_reciever_0_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:962:2: ( ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* ) )
            // InternalAdaptSem.g:963:2: ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* )
            {
            // InternalAdaptSem.g:963:2: ( ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )* )
            // InternalAdaptSem.g:964:3: ( (lv_reciever_0_0= ruleTerminalAccessExpression ) ) otherlv_1= '.' ( (lv_field_2_0= RULE_ID ) ) ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )*
            {
            // InternalAdaptSem.g:964:3: ( (lv_reciever_0_0= ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:965:4: (lv_reciever_0_0= ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:965:4: (lv_reciever_0_0= ruleTerminalAccessExpression )
            // InternalAdaptSem.g:966:5: lv_reciever_0_0= ruleTerminalAccessExpression
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

            otherlv_1=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_1());
              		
            }
            // InternalAdaptSem.g:987:3: ( (lv_field_2_0= RULE_ID ) )
            // InternalAdaptSem.g:988:4: (lv_field_2_0= RULE_ID )
            {
            // InternalAdaptSem.g:988:4: (lv_field_2_0= RULE_ID )
            // InternalAdaptSem.g:989:5: lv_field_2_0= RULE_ID
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

            // InternalAdaptSem.g:1005:3: ( () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAdaptSem.g:1006:4: () otherlv_4= '.' ( (lv_field_5_0= RULE_ID ) )
            	    {
            	    // InternalAdaptSem.g:1006:4: ()
            	    // InternalAdaptSem.g:1007:5: 
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

            	    otherlv_4=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSemanticDomainAccessAccess().getFullStopKeyword_3_1());
            	      			
            	    }
            	    // InternalAdaptSem.g:1020:4: ( (lv_field_5_0= RULE_ID ) )
            	    // InternalAdaptSem.g:1021:5: (lv_field_5_0= RULE_ID )
            	    {
            	    // InternalAdaptSem.g:1021:5: (lv_field_5_0= RULE_ID )
            	    // InternalAdaptSem.g:1022:6: lv_field_5_0= RULE_ID
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
            	    break loop17;
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
    // InternalAdaptSem.g:1043:1: entryRuleTerminalAccessExpression returns [EObject current=null] : iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF ;
    public final EObject entryRuleTerminalAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAccessExpression = null;


        try {
            // InternalAdaptSem.g:1043:65: (iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF )
            // InternalAdaptSem.g:1044:2: iv_ruleTerminalAccessExpression= ruleTerminalAccessExpression EOF
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
    // InternalAdaptSem.g:1050:1: ruleTerminalAccessExpression returns [EObject current=null] : (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf ) ;
    public final EObject ruleTerminalAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolRef_0 = null;

        EObject this_Self_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1056:2: ( (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf ) )
            // InternalAdaptSem.g:1057:2: (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf )
            {
            // InternalAdaptSem.g:1057:2: (this_SymbolRef_0= ruleSymbolRef | this_Self_1= ruleSelf )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptSem.g:1058:3: this_SymbolRef_0= ruleSymbolRef
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
                    // InternalAdaptSem.g:1070:3: this_Self_1= ruleSelf
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
    // InternalAdaptSem.g:1085:1: entryRuleSelf returns [EObject current=null] : iv_ruleSelf= ruleSelf EOF ;
    public final EObject entryRuleSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf = null;


        try {
            // InternalAdaptSem.g:1085:45: (iv_ruleSelf= ruleSelf EOF )
            // InternalAdaptSem.g:1086:2: iv_ruleSelf= ruleSelf EOF
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
    // InternalAdaptSem.g:1092:1: ruleSelf returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1098:2: ( ( () otherlv_1= 'self' ) )
            // InternalAdaptSem.g:1099:2: ( () otherlv_1= 'self' )
            {
            // InternalAdaptSem.g:1099:2: ( () otherlv_1= 'self' )
            // InternalAdaptSem.g:1100:3: () otherlv_1= 'self'
            {
            // InternalAdaptSem.g:1100:3: ()
            // InternalAdaptSem.g:1101:4: 
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

            otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1118:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalAdaptSem.g:1118:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalAdaptSem.g:1119:2: iv_ruleConclusion= ruleConclusion EOF
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
    // InternalAdaptSem.g:1125:1: ruleConclusion returns [EObject current=null] : ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termination_2_0=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1131:2: ( ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) ) )
            // InternalAdaptSem.g:1132:2: ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) )
            {
            // InternalAdaptSem.g:1132:2: ( ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) ) )
            // InternalAdaptSem.g:1133:3: ( (lv_from_0_0= ruleDefConfiguration ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermRef ) )
            {
            // InternalAdaptSem.g:1133:3: ( (lv_from_0_0= ruleDefConfiguration ) )
            // InternalAdaptSem.g:1134:4: (lv_from_0_0= ruleDefConfiguration )
            {
            // InternalAdaptSem.g:1134:4: (lv_from_0_0= ruleDefConfiguration )
            // InternalAdaptSem.g:1135:5: lv_from_0_0= ruleDefConfiguration
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

            otherlv_1=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConclusionAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalAdaptSem.g:1156:3: ( (lv_termination_2_0= 'termination' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptSem.g:1157:4: (lv_termination_2_0= 'termination' )
                    {
                    // InternalAdaptSem.g:1157:4: (lv_termination_2_0= 'termination' )
                    // InternalAdaptSem.g:1158:5: lv_termination_2_0= 'termination'
                    {
                    lv_termination_2_0=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
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

            // InternalAdaptSem.g:1170:3: ( (lv_to_3_0= ruleSingleTermRef ) )
            // InternalAdaptSem.g:1171:4: (lv_to_3_0= ruleSingleTermRef )
            {
            // InternalAdaptSem.g:1171:4: (lv_to_3_0= ruleSingleTermRef )
            // InternalAdaptSem.g:1172:5: lv_to_3_0= ruleSingleTermRef
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
    // InternalAdaptSem.g:1193:1: entryRulePremise returns [EObject current=null] : iv_rulePremise= rulePremise EOF ;
    public final EObject entryRulePremise() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePremise = null;


        try {
            // InternalAdaptSem.g:1193:48: (iv_rulePremise= rulePremise EOF )
            // InternalAdaptSem.g:1194:2: iv_rulePremise= rulePremise EOF
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
    // InternalAdaptSem.g:1200:1: rulePremise returns [EObject current=null] : ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) ) ;
    public final EObject rulePremise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termination_2_0=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1206:2: ( ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) ) )
            // InternalAdaptSem.g:1207:2: ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) )
            {
            // InternalAdaptSem.g:1207:2: ( ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) ) )
            // InternalAdaptSem.g:1208:3: ( (lv_from_0_0= ruleSymbolRef ) ) otherlv_1= '->' ( (lv_termination_2_0= 'termination' ) )? ( (lv_to_3_0= ruleSingleTermDef ) )
            {
            // InternalAdaptSem.g:1208:3: ( (lv_from_0_0= ruleSymbolRef ) )
            // InternalAdaptSem.g:1209:4: (lv_from_0_0= ruleSymbolRef )
            {
            // InternalAdaptSem.g:1209:4: (lv_from_0_0= ruleSymbolRef )
            // InternalAdaptSem.g:1210:5: lv_from_0_0= ruleSymbolRef
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

            otherlv_1=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPremiseAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalAdaptSem.g:1231:3: ( (lv_termination_2_0= 'termination' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptSem.g:1232:4: (lv_termination_2_0= 'termination' )
                    {
                    // InternalAdaptSem.g:1232:4: (lv_termination_2_0= 'termination' )
                    // InternalAdaptSem.g:1233:5: lv_termination_2_0= 'termination'
                    {
                    lv_termination_2_0=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
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

            // InternalAdaptSem.g:1245:3: ( (lv_to_3_0= ruleSingleTermDef ) )
            // InternalAdaptSem.g:1246:4: (lv_to_3_0= ruleSingleTermDef )
            {
            // InternalAdaptSem.g:1246:4: (lv_to_3_0= ruleSingleTermDef )
            // InternalAdaptSem.g:1247:5: lv_to_3_0= ruleSingleTermDef
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
    // InternalAdaptSem.g:1268:1: entryRuleTermDef returns [EObject current=null] : iv_ruleTermDef= ruleTermDef EOF ;
    public final EObject entryRuleTermDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermDef = null;


        try {
            // InternalAdaptSem.g:1268:48: (iv_ruleTermDef= ruleTermDef EOF )
            // InternalAdaptSem.g:1269:2: iv_ruleTermDef= ruleTermDef EOF
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
    // InternalAdaptSem.g:1275:1: ruleTermDef returns [EObject current=null] : (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList ) ;
    public final EObject ruleTermDef() throws RecognitionException {
        EObject current = null;

        EObject this_SingleTermDef_0 = null;

        EObject this_ListDef_1 = null;

        EObject this_VoidList_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1281:2: ( (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList ) )
            // InternalAdaptSem.g:1282:2: (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList )
            {
            // InternalAdaptSem.g:1282:2: (this_SingleTermDef_0= ruleSingleTermDef | this_ListDef_1= ruleListDef | this_VoidList_2= ruleVoidList )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 34:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAdaptSem.g:1283:3: this_SingleTermDef_0= ruleSingleTermDef
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
                    // InternalAdaptSem.g:1295:3: this_ListDef_1= ruleListDef
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
                    // InternalAdaptSem.g:1307:3: this_VoidList_2= ruleVoidList
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
    // InternalAdaptSem.g:1322:1: entryRuleTermRef returns [EObject current=null] : iv_ruleTermRef= ruleTermRef EOF ;
    public final EObject entryRuleTermRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermRef = null;


        try {
            // InternalAdaptSem.g:1322:48: (iv_ruleTermRef= ruleTermRef EOF )
            // InternalAdaptSem.g:1323:2: iv_ruleTermRef= ruleTermRef EOF
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
    // InternalAdaptSem.g:1329:1: ruleTermRef returns [EObject current=null] : (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList ) ;
    public final EObject ruleTermRef() throws RecognitionException {
        EObject current = null;

        EObject this_SingleTermRef_0 = null;

        EObject this_ListRef_1 = null;

        EObject this_VoidList_2 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1335:2: ( (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList ) )
            // InternalAdaptSem.g:1336:2: (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList )
            {
            // InternalAdaptSem.g:1336:2: (this_SingleTermRef_0= ruleSingleTermRef | this_ListRef_1= ruleListRef | this_VoidList_2= ruleVoidList )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 34:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAdaptSem.g:1337:3: this_SingleTermRef_0= ruleSingleTermRef
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
                    // InternalAdaptSem.g:1349:3: this_ListRef_1= ruleListRef
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
                    // InternalAdaptSem.g:1361:3: this_VoidList_2= ruleVoidList
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
    // InternalAdaptSem.g:1376:1: entryRuleSingleTermDef returns [EObject current=null] : iv_ruleSingleTermDef= ruleSingleTermDef EOF ;
    public final EObject entryRuleSingleTermDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTermDef = null;


        try {
            // InternalAdaptSem.g:1376:54: (iv_ruleSingleTermDef= ruleSingleTermDef EOF )
            // InternalAdaptSem.g:1377:2: iv_ruleSingleTermDef= ruleSingleTermDef EOF
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
    // InternalAdaptSem.g:1383:1: ruleSingleTermDef returns [EObject current=null] : (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef ) ;
    public final EObject ruleSingleTermDef() throws RecognitionException {
        EObject current = null;

        EObject this_DefConfiguration_0 = null;

        EObject this_SymbolDef_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1389:2: ( (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef ) )
            // InternalAdaptSem.g:1390:2: (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef )
            {
            // InternalAdaptSem.g:1390:2: (this_DefConfiguration_0= ruleDefConfiguration | this_SymbolDef_1= ruleSymbolDef )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=17 && LA23_1<=18)||LA23_1==20||(LA23_1>=22 && LA23_1<=23)||LA23_1==26||LA23_1==32) ) {
                    alt23=2;
                }
                else if ( (LA23_1==25||LA23_1==27) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptSem.g:1391:3: this_DefConfiguration_0= ruleDefConfiguration
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
                    // InternalAdaptSem.g:1403:3: this_SymbolDef_1= ruleSymbolDef
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
    // InternalAdaptSem.g:1418:1: entryRuleSingleTermRef returns [EObject current=null] : iv_ruleSingleTermRef= ruleSingleTermRef EOF ;
    public final EObject entryRuleSingleTermRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTermRef = null;


        try {
            // InternalAdaptSem.g:1418:54: (iv_ruleSingleTermRef= ruleSingleTermRef EOF )
            // InternalAdaptSem.g:1419:2: iv_ruleSingleTermRef= ruleSingleTermRef EOF
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
    // InternalAdaptSem.g:1425:1: ruleSingleTermRef returns [EObject current=null] : ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef ) ;
    public final EObject ruleSingleTermRef() throws RecognitionException {
        EObject current = null;

        EObject this_RefConfiguration_0 = null;

        EObject this_SymbolRef_1 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1431:2: ( ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef ) )
            // InternalAdaptSem.g:1432:2: ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef )
            {
            // InternalAdaptSem.g:1432:2: ( ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration ) | this_SymbolRef_1= ruleSymbolRef )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||(LA24_1>=17 && LA24_1<=19)||(LA24_1>=21 && LA24_1<=23)||LA24_1==26) ) {
                    alt24=2;
                }
                else if ( (LA24_1==25||LA24_1==27) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptSem.g:1433:3: ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration )
                    {
                    // InternalAdaptSem.g:1433:3: ( ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration )
                    // InternalAdaptSem.g:1434:4: ( ruleRefConfiguration )=>this_RefConfiguration_0= ruleRefConfiguration
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
                    // InternalAdaptSem.g:1448:3: this_SymbolRef_1= ruleSymbolRef
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
    // InternalAdaptSem.g:1463:1: entryRuleDefConfiguration returns [EObject current=null] : iv_ruleDefConfiguration= ruleDefConfiguration EOF ;
    public final EObject entryRuleDefConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefConfiguration = null;


        try {
            // InternalAdaptSem.g:1463:57: (iv_ruleDefConfiguration= ruleDefConfiguration EOF )
            // InternalAdaptSem.g:1464:2: iv_ruleDefConfiguration= ruleDefConfiguration EOF
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
    // InternalAdaptSem.g:1470:1: ruleDefConfiguration returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleDefConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_childs_2_0 = null;

        EObject lv_childs_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1476:2: ( ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' ) )
            // InternalAdaptSem.g:1477:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' )
            {
            // InternalAdaptSem.g:1477:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')' )
            // InternalAdaptSem.g:1478:3: ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )? otherlv_5= ')'
            {
            // InternalAdaptSem.g:1478:3: ( ( ruleFQN ) )
            // InternalAdaptSem.g:1479:4: ( ruleFQN )
            {
            // InternalAdaptSem.g:1479:4: ( ruleFQN )
            // InternalAdaptSem.g:1480:5: ruleFQN
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
            // InternalAdaptSem.g:1501:3: ( ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==31||LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptSem.g:1502:4: ( (lv_childs_2_0= ruleTermDef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )*
                    {
                    // InternalAdaptSem.g:1502:4: ( (lv_childs_2_0= ruleTermDef ) )
                    // InternalAdaptSem.g:1503:5: (lv_childs_2_0= ruleTermDef )
                    {
                    // InternalAdaptSem.g:1503:5: (lv_childs_2_0= ruleTermDef )
                    // InternalAdaptSem.g:1504:6: lv_childs_2_0= ruleTermDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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

                    // InternalAdaptSem.g:1521:4: (otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalAdaptSem.g:1522:5: otherlv_3= ',' ( (lv_childs_4_0= ruleTermDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDefConfigurationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:1526:5: ( (lv_childs_4_0= ruleTermDef ) )
                    	    // InternalAdaptSem.g:1527:6: (lv_childs_4_0= ruleTermDef )
                    	    {
                    	    // InternalAdaptSem.g:1527:6: (lv_childs_4_0= ruleTermDef )
                    	    // InternalAdaptSem.g:1528:7: lv_childs_4_0= ruleTermDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefConfigurationAccess().getChildsTermDefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1555:1: entryRuleRefConfiguration returns [EObject current=null] : iv_ruleRefConfiguration= ruleRefConfiguration EOF ;
    public final EObject entryRuleRefConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefConfiguration = null;


        try {
            // InternalAdaptSem.g:1555:57: (iv_ruleRefConfiguration= ruleRefConfiguration EOF )
            // InternalAdaptSem.g:1556:2: iv_ruleRefConfiguration= ruleRefConfiguration EOF
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
    // InternalAdaptSem.g:1562:1: ruleRefConfiguration returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleRefConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_childs_2_0 = null;

        EObject lv_childs_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1568:2: ( ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' ) )
            // InternalAdaptSem.g:1569:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            {
            // InternalAdaptSem.g:1569:2: ( ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')' )
            // InternalAdaptSem.g:1570:3: ( ( ruleFQN ) ) otherlv_1= '(' ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )? otherlv_5= ')'
            {
            // InternalAdaptSem.g:1570:3: ( ( ruleFQN ) )
            // InternalAdaptSem.g:1571:4: ( ruleFQN )
            {
            // InternalAdaptSem.g:1571:4: ( ruleFQN )
            // InternalAdaptSem.g:1572:5: ruleFQN
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

            otherlv_1=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRefConfigurationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAdaptSem.g:1593:3: ( ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==31||LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAdaptSem.g:1594:4: ( (lv_childs_2_0= ruleTermRef ) ) (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )*
                    {
                    // InternalAdaptSem.g:1594:4: ( (lv_childs_2_0= ruleTermRef ) )
                    // InternalAdaptSem.g:1595:5: (lv_childs_2_0= ruleTermRef )
                    {
                    // InternalAdaptSem.g:1595:5: (lv_childs_2_0= ruleTermRef )
                    // InternalAdaptSem.g:1596:6: lv_childs_2_0= ruleTermRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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

                    // InternalAdaptSem.g:1613:4: (otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalAdaptSem.g:1614:5: otherlv_3= ',' ( (lv_childs_4_0= ruleTermRef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRefConfigurationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAdaptSem.g:1618:5: ( (lv_childs_4_0= ruleTermRef ) )
                    	    // InternalAdaptSem.g:1619:6: (lv_childs_4_0= ruleTermRef )
                    	    {
                    	    // InternalAdaptSem.g:1619:6: (lv_childs_4_0= ruleTermRef )
                    	    // InternalAdaptSem.g:1620:7: lv_childs_4_0= ruleTermRef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRefConfigurationAccess().getChildsTermRefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop27;
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
    // InternalAdaptSem.g:1647:1: entryRuleSymbolDef returns [EObject current=null] : iv_ruleSymbolDef= ruleSymbolDef EOF ;
    public final EObject entryRuleSymbolDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolDef = null;


        try {
            // InternalAdaptSem.g:1647:50: (iv_ruleSymbolDef= ruleSymbolDef EOF )
            // InternalAdaptSem.g:1648:2: iv_ruleSymbolDef= ruleSymbolDef EOF
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
    // InternalAdaptSem.g:1654:1: ruleSymbolDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1660:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdaptSem.g:1661:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdaptSem.g:1661:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdaptSem.g:1662:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAdaptSem.g:1662:3: ()
            // InternalAdaptSem.g:1663:4: 
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

            // InternalAdaptSem.g:1672:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptSem.g:1673:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptSem.g:1673:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptSem.g:1674:5: lv_name_1_0= RULE_ID
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
    // InternalAdaptSem.g:1694:1: entryRuleSymbolRef returns [EObject current=null] : iv_ruleSymbolRef= ruleSymbolRef EOF ;
    public final EObject entryRuleSymbolRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolRef = null;


        try {
            // InternalAdaptSem.g:1694:50: (iv_ruleSymbolRef= ruleSymbolRef EOF )
            // InternalAdaptSem.g:1695:2: iv_ruleSymbolRef= ruleSymbolRef EOF
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
    // InternalAdaptSem.g:1701:1: ruleSymbolRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSymbolRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1707:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAdaptSem.g:1708:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAdaptSem.g:1708:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalAdaptSem.g:1709:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalAdaptSem.g:1709:3: ()
            // InternalAdaptSem.g:1710:4: 
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

            // InternalAdaptSem.g:1719:3: ( (otherlv_1= RULE_ID ) )
            // InternalAdaptSem.g:1720:4: (otherlv_1= RULE_ID )
            {
            // InternalAdaptSem.g:1720:4: (otherlv_1= RULE_ID )
            // InternalAdaptSem.g:1721:5: otherlv_1= RULE_ID
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
    // InternalAdaptSem.g:1739:1: entryRuleListDef returns [EObject current=null] : iv_ruleListDef= ruleListDef EOF ;
    public final EObject entryRuleListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDef = null;


        try {
            // InternalAdaptSem.g:1739:48: (iv_ruleListDef= ruleListDef EOF )
            // InternalAdaptSem.g:1740:2: iv_ruleListDef= ruleListDef EOF
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
    // InternalAdaptSem.g:1746:1: ruleListDef returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' ) ;
    public final EObject ruleListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1752:2: ( (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' ) )
            // InternalAdaptSem.g:1753:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' )
            {
            // InternalAdaptSem.g:1753:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']' )
            // InternalAdaptSem.g:1754:3: otherlv_0= '[' ( (lv_head_1_0= ruleSingleTermDef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolDef ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListDefAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAdaptSem.g:1758:3: ( (lv_head_1_0= ruleSingleTermDef ) )
            // InternalAdaptSem.g:1759:4: (lv_head_1_0= ruleSingleTermDef )
            {
            // InternalAdaptSem.g:1759:4: (lv_head_1_0= ruleSingleTermDef )
            // InternalAdaptSem.g:1760:5: lv_head_1_0= ruleSingleTermDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getHeadSingleTermDefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListDefAccess().getVerticalLineKeyword_2());
              		
            }
            // InternalAdaptSem.g:1781:3: ( (lv_tail_3_0= ruleSymbolDef ) )
            // InternalAdaptSem.g:1782:4: (lv_tail_3_0= ruleSymbolDef )
            {
            // InternalAdaptSem.g:1782:4: (lv_tail_3_0= ruleSymbolDef )
            // InternalAdaptSem.g:1783:5: lv_tail_3_0= ruleSymbolDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListDefAccess().getTailSymbolDefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1808:1: entryRuleListRef returns [EObject current=null] : iv_ruleListRef= ruleListRef EOF ;
    public final EObject entryRuleListRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListRef = null;


        try {
            // InternalAdaptSem.g:1808:48: (iv_ruleListRef= ruleListRef EOF )
            // InternalAdaptSem.g:1809:2: iv_ruleListRef= ruleListRef EOF
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
    // InternalAdaptSem.g:1815:1: ruleListRef returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' ) ;
    public final EObject ruleListRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1821:2: ( (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' ) )
            // InternalAdaptSem.g:1822:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' )
            {
            // InternalAdaptSem.g:1822:2: (otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']' )
            // InternalAdaptSem.g:1823:3: otherlv_0= '[' ( (lv_head_1_0= ruleSymbolRef ) ) otherlv_2= '|' ( (lv_tail_3_0= ruleSymbolRef ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListRefAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalAdaptSem.g:1827:3: ( (lv_head_1_0= ruleSymbolRef ) )
            // InternalAdaptSem.g:1828:4: (lv_head_1_0= ruleSymbolRef )
            {
            // InternalAdaptSem.g:1828:4: (lv_head_1_0= ruleSymbolRef )
            // InternalAdaptSem.g:1829:5: lv_head_1_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListRefAccess().getHeadSymbolRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListRefAccess().getVerticalLineKeyword_2());
              		
            }
            // InternalAdaptSem.g:1850:3: ( (lv_tail_3_0= ruleSymbolRef ) )
            // InternalAdaptSem.g:1851:4: (lv_tail_3_0= ruleSymbolRef )
            {
            // InternalAdaptSem.g:1851:4: (lv_tail_3_0= ruleSymbolRef )
            // InternalAdaptSem.g:1852:5: lv_tail_3_0= ruleSymbolRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListRefAccess().getTailSymbolRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1877:1: entryRuleVoidList returns [EObject current=null] : iv_ruleVoidList= ruleVoidList EOF ;
    public final EObject entryRuleVoidList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidList = null;


        try {
            // InternalAdaptSem.g:1877:49: (iv_ruleVoidList= ruleVoidList EOF )
            // InternalAdaptSem.g:1878:2: iv_ruleVoidList= ruleVoidList EOF
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
    // InternalAdaptSem.g:1884:1: ruleVoidList returns [EObject current=null] : ( () otherlv_1= '[]' ) ;
    public final EObject ruleVoidList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:1890:2: ( ( () otherlv_1= '[]' ) )
            // InternalAdaptSem.g:1891:2: ( () otherlv_1= '[]' )
            {
            // InternalAdaptSem.g:1891:2: ( () otherlv_1= '[]' )
            // InternalAdaptSem.g:1892:3: () otherlv_1= '[]'
            {
            // InternalAdaptSem.g:1892:3: ()
            // InternalAdaptSem.g:1893:4: 
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

            otherlv_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalAdaptSem.g:1910:1: entryRuleCondExpr returns [EObject current=null] : iv_ruleCondExpr= ruleCondExpr EOF ;
    public final EObject entryRuleCondExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondExpr = null;


        try {
            // InternalAdaptSem.g:1910:49: (iv_ruleCondExpr= ruleCondExpr EOF )
            // InternalAdaptSem.g:1911:2: iv_ruleCondExpr= ruleCondExpr EOF
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
    // InternalAdaptSem.g:1917:1: ruleCondExpr returns [EObject current=null] : (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot ) ;
    public final EObject ruleCondExpr() throws RecognitionException {
        EObject current = null;

        EObject this_CondOr_0 = null;

        EObject this_CondAnd_1 = null;

        EObject this_CondEquality_2 = null;

        EObject this_CondComparison_3 = null;

        EObject this_CondNot_4 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:1923:2: ( (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot ) )
            // InternalAdaptSem.g:1924:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot )
            {
            // InternalAdaptSem.g:1924:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalAdaptSem.g:1925:3: this_CondOr_0= ruleCondOr
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
                    // InternalAdaptSem.g:1937:3: this_CondAnd_1= ruleCondAnd
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
                    // InternalAdaptSem.g:1949:3: this_CondEquality_2= ruleCondEquality
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
                    // InternalAdaptSem.g:1961:3: this_CondComparison_3= ruleCondComparison
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
                    // InternalAdaptSem.g:1973:3: this_CondNot_4= ruleCondNot
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
    // InternalAdaptSem.g:1988:1: entryRuleCondNot returns [EObject current=null] : iv_ruleCondNot= ruleCondNot EOF ;
    public final EObject entryRuleCondNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondNot = null;


        try {
            // InternalAdaptSem.g:1988:48: (iv_ruleCondNot= ruleCondNot EOF )
            // InternalAdaptSem.g:1989:2: iv_ruleCondNot= ruleCondNot EOF
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
    // InternalAdaptSem.g:1995:1: ruleCondNot returns [EObject current=null] : ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleCondNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2001:2: ( ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalAdaptSem.g:2002:2: ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalAdaptSem.g:2002:2: ( () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalAdaptSem.g:2003:3: () otherlv_1= '!' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalAdaptSem.g:2003:3: ()
            // InternalAdaptSem.g:2004:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCondNotAccess().getExclamationMarkKeyword_1());
              		
            }
            // InternalAdaptSem.g:2017:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalAdaptSem.g:2018:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalAdaptSem.g:2018:4: (lv_expr_2_0= ruleExpr )
            // InternalAdaptSem.g:2019:5: lv_expr_2_0= ruleExpr
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
    // InternalAdaptSem.g:2040:1: entryRuleCondOr returns [EObject current=null] : iv_ruleCondOr= ruleCondOr EOF ;
    public final EObject entryRuleCondOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondOr = null;


        try {
            // InternalAdaptSem.g:2040:47: (iv_ruleCondOr= ruleCondOr EOF )
            // InternalAdaptSem.g:2041:2: iv_ruleCondOr= ruleCondOr EOF
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
    // InternalAdaptSem.g:2047:1: ruleCondOr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) ) ;
    public final EObject ruleCondOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2053:2: ( ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) ) )
            // InternalAdaptSem.g:2054:2: ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )
            {
            // InternalAdaptSem.g:2054:2: ( () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )
            // InternalAdaptSem.g:2055:3: () ( (lv_lhs_1_0= ruleAnd ) ) otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            {
            // InternalAdaptSem.g:2055:3: ()
            // InternalAdaptSem.g:2056:4: 
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

            // InternalAdaptSem.g:2065:3: ( (lv_lhs_1_0= ruleAnd ) )
            // InternalAdaptSem.g:2066:4: (lv_lhs_1_0= ruleAnd )
            {
            // InternalAdaptSem.g:2066:4: (lv_lhs_1_0= ruleAnd )
            // InternalAdaptSem.g:2067:5: lv_lhs_1_0= ruleAnd
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondOrAccess().getLhsAndParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondOrAccess().getVerticalLineVerticalLineKeyword_2());
              		
            }
            // InternalAdaptSem.g:2088:3: ( (lv_rhs_3_0= ruleAnd ) )
            // InternalAdaptSem.g:2089:4: (lv_rhs_3_0= ruleAnd )
            {
            // InternalAdaptSem.g:2089:4: (lv_rhs_3_0= ruleAnd )
            // InternalAdaptSem.g:2090:5: lv_rhs_3_0= ruleAnd
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
    // InternalAdaptSem.g:2111:1: entryRuleCondAnd returns [EObject current=null] : iv_ruleCondAnd= ruleCondAnd EOF ;
    public final EObject entryRuleCondAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondAnd = null;


        try {
            // InternalAdaptSem.g:2111:48: (iv_ruleCondAnd= ruleCondAnd EOF )
            // InternalAdaptSem.g:2112:2: iv_ruleCondAnd= ruleCondAnd EOF
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
    // InternalAdaptSem.g:2118:1: ruleCondAnd returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) ) ;
    public final EObject ruleCondAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2124:2: ( ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) ) )
            // InternalAdaptSem.g:2125:2: ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )
            {
            // InternalAdaptSem.g:2125:2: ( () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )
            // InternalAdaptSem.g:2126:3: () ( (lv_lhs_1_0= ruleEquality ) ) otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            {
            // InternalAdaptSem.g:2126:3: ()
            // InternalAdaptSem.g:2127:4: 
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

            // InternalAdaptSem.g:2136:3: ( (lv_lhs_1_0= ruleEquality ) )
            // InternalAdaptSem.g:2137:4: (lv_lhs_1_0= ruleEquality )
            {
            // InternalAdaptSem.g:2137:4: (lv_lhs_1_0= ruleEquality )
            // InternalAdaptSem.g:2138:5: lv_lhs_1_0= ruleEquality
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCondAndAccess().getLhsEqualityParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCondAndAccess().getAmpersandAmpersandKeyword_2());
              		
            }
            // InternalAdaptSem.g:2159:3: ( (lv_rhs_3_0= ruleEquality ) )
            // InternalAdaptSem.g:2160:4: (lv_rhs_3_0= ruleEquality )
            {
            // InternalAdaptSem.g:2160:4: (lv_rhs_3_0= ruleEquality )
            // InternalAdaptSem.g:2161:5: lv_rhs_3_0= ruleEquality
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
    // InternalAdaptSem.g:2182:1: entryRuleCondEquality returns [EObject current=null] : iv_ruleCondEquality= ruleCondEquality EOF ;
    public final EObject entryRuleCondEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondEquality = null;


        try {
            // InternalAdaptSem.g:2182:53: (iv_ruleCondEquality= ruleCondEquality EOF )
            // InternalAdaptSem.g:2183:2: iv_ruleCondEquality= ruleCondEquality EOF
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
    // InternalAdaptSem.g:2189:1: ruleCondEquality returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) ) ;
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
            // InternalAdaptSem.g:2195:2: ( ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) ) )
            // InternalAdaptSem.g:2196:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )
            {
            // InternalAdaptSem.g:2196:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalAdaptSem.g:2197:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
                    {
                    // InternalAdaptSem.g:2197:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
                    // InternalAdaptSem.g:2198:4: () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) )
                    {
                    // InternalAdaptSem.g:2198:4: ()
                    // InternalAdaptSem.g:2199:5: 
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

                    // InternalAdaptSem.g:2208:4: ( (lv_lhs_1_0= ruleComparison ) )
                    // InternalAdaptSem.g:2209:5: (lv_lhs_1_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2209:5: (lv_lhs_1_0= ruleComparison )
                    // InternalAdaptSem.g:2210:6: lv_lhs_1_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
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

                    otherlv_2=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCondEqualityAccess().getEqualsSignEqualsSignKeyword_0_2());
                      			
                    }
                    // InternalAdaptSem.g:2231:4: ( (lv_rhs_3_0= ruleComparison ) )
                    // InternalAdaptSem.g:2232:5: (lv_rhs_3_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2232:5: (lv_rhs_3_0= ruleComparison )
                    // InternalAdaptSem.g:2233:6: lv_rhs_3_0= ruleComparison
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
                    // InternalAdaptSem.g:2252:3: ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) )
                    {
                    // InternalAdaptSem.g:2252:3: ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) )
                    // InternalAdaptSem.g:2253:4: () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) )
                    {
                    // InternalAdaptSem.g:2253:4: ()
                    // InternalAdaptSem.g:2254:5: 
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

                    // InternalAdaptSem.g:2263:4: ( (lv_lhs_5_0= ruleComparison ) )
                    // InternalAdaptSem.g:2264:5: (lv_lhs_5_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2264:5: (lv_lhs_5_0= ruleComparison )
                    // InternalAdaptSem.g:2265:6: lv_lhs_5_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
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

                    otherlv_6=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCondEqualityAccess().getExclamationMarkEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAdaptSem.g:2286:4: ( (lv_rhs_7_0= ruleComparison ) )
                    // InternalAdaptSem.g:2287:5: (lv_rhs_7_0= ruleComparison )
                    {
                    // InternalAdaptSem.g:2287:5: (lv_rhs_7_0= ruleComparison )
                    // InternalAdaptSem.g:2288:6: lv_rhs_7_0= ruleComparison
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
    // InternalAdaptSem.g:2310:1: entryRuleCondComparison returns [EObject current=null] : iv_ruleCondComparison= ruleCondComparison EOF ;
    public final EObject entryRuleCondComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondComparison = null;


        try {
            // InternalAdaptSem.g:2310:55: (iv_ruleCondComparison= ruleCondComparison EOF )
            // InternalAdaptSem.g:2311:2: iv_ruleCondComparison= ruleCondComparison EOF
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
    // InternalAdaptSem.g:2317:1: ruleCondComparison returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) ) ;
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
            // InternalAdaptSem.g:2323:2: ( ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) ) )
            // InternalAdaptSem.g:2324:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )
            {
            // InternalAdaptSem.g:2324:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalAdaptSem.g:2325:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
                    {
                    // InternalAdaptSem.g:2325:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
                    // InternalAdaptSem.g:2326:4: () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) )
                    {
                    // InternalAdaptSem.g:2326:4: ()
                    // InternalAdaptSem.g:2327:5: 
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

                    // InternalAdaptSem.g:2336:4: ( (lv_lhs_1_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2337:5: (lv_lhs_1_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2337:5: (lv_lhs_1_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2338:6: lv_lhs_1_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCondComparisonAccess().getLessThanSignKeyword_0_2());
                      			
                    }
                    // InternalAdaptSem.g:2359:4: ( (lv_rhs_3_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2360:5: (lv_rhs_3_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2360:5: (lv_rhs_3_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2361:6: lv_rhs_3_0= rulePlusOrMinus
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
                    // InternalAdaptSem.g:2380:3: ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) )
                    {
                    // InternalAdaptSem.g:2380:3: ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) )
                    // InternalAdaptSem.g:2381:4: () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) )
                    {
                    // InternalAdaptSem.g:2381:4: ()
                    // InternalAdaptSem.g:2382:5: 
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

                    // InternalAdaptSem.g:2391:4: ( (lv_lhs_5_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2392:5: (lv_lhs_5_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2392:5: (lv_lhs_5_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2393:6: lv_lhs_5_0= rulePlusOrMinus
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    otherlv_6=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCondComparisonAccess().getLessThanSignEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAdaptSem.g:2414:4: ( (lv_rhs_7_0= rulePlusOrMinus ) )
                    // InternalAdaptSem.g:2415:5: (lv_rhs_7_0= rulePlusOrMinus )
                    {
                    // InternalAdaptSem.g:2415:5: (lv_rhs_7_0= rulePlusOrMinus )
                    // InternalAdaptSem.g:2416:6: lv_rhs_7_0= rulePlusOrMinus
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


    // $ANTLR start "entryRuleExpr"
    // InternalAdaptSem.g:2438:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalAdaptSem.g:2438:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalAdaptSem.g:2439:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalAdaptSem.g:2445:1: ruleExpr returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2451:2: (this_Or_0= ruleOr )
            // InternalAdaptSem.g:2452:2: this_Or_0= ruleOr
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
    // InternalAdaptSem.g:2466:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalAdaptSem.g:2466:43: (iv_ruleOr= ruleOr EOF )
            // InternalAdaptSem.g:2467:2: iv_ruleOr= ruleOr EOF
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
    // InternalAdaptSem.g:2473:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2479:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) )
            // InternalAdaptSem.g:2480:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            {
            // InternalAdaptSem.g:2480:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            // InternalAdaptSem.g:2481:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2492:3: ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAdaptSem.g:2493:4: () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            	    {
            	    // InternalAdaptSem.g:2493:4: ()
            	    // InternalAdaptSem.g:2494:5: 
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

            	    otherlv_2=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalAdaptSem.g:2507:4: ( (lv_rhs_3_0= ruleAnd ) )
            	    // InternalAdaptSem.g:2508:5: (lv_rhs_3_0= ruleAnd )
            	    {
            	    // InternalAdaptSem.g:2508:5: (lv_rhs_3_0= ruleAnd )
            	    // InternalAdaptSem.g:2509:6: lv_rhs_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop32;
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
    // InternalAdaptSem.g:2531:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalAdaptSem.g:2531:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalAdaptSem.g:2532:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalAdaptSem.g:2538:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2544:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) )
            // InternalAdaptSem.g:2545:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            {
            // InternalAdaptSem.g:2545:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            // InternalAdaptSem.g:2546:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2557:3: ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==37) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdaptSem.g:2558:4: () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            	    {
            	    // InternalAdaptSem.g:2558:4: ()
            	    // InternalAdaptSem.g:2559:5: 
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

            	    otherlv_2=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalAdaptSem.g:2572:4: ( (lv_rhs_3_0= ruleEquality ) )
            	    // InternalAdaptSem.g:2573:5: (lv_rhs_3_0= ruleEquality )
            	    {
            	    // InternalAdaptSem.g:2573:5: (lv_rhs_3_0= ruleEquality )
            	    // InternalAdaptSem.g:2574:6: lv_rhs_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop33;
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
    // InternalAdaptSem.g:2596:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalAdaptSem.g:2596:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalAdaptSem.g:2597:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalAdaptSem.g:2603:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2609:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* ) )
            // InternalAdaptSem.g:2610:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* )
            {
            // InternalAdaptSem.g:2610:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )* )
            // InternalAdaptSem.g:2611:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2622:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=38 && LA35_0<=39)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdaptSem.g:2623:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_rhs_5_0= ruleComparison ) )
            	    {
            	    // InternalAdaptSem.g:2623:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==38) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==39) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAdaptSem.g:2624:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalAdaptSem.g:2624:5: ( () otherlv_2= '==' )
            	            // InternalAdaptSem.g:2625:6: () otherlv_2= '=='
            	            {
            	            // InternalAdaptSem.g:2625:6: ()
            	            // InternalAdaptSem.g:2626:7: 
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

            	            otherlv_2=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:2641:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalAdaptSem.g:2641:5: ( () otherlv_4= '!=' )
            	            // InternalAdaptSem.g:2642:6: () otherlv_4= '!='
            	            {
            	            // InternalAdaptSem.g:2642:6: ()
            	            // InternalAdaptSem.g:2643:7: 
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

            	            otherlv_4=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:2658:4: ( (lv_rhs_5_0= ruleComparison ) )
            	    // InternalAdaptSem.g:2659:5: (lv_rhs_5_0= ruleComparison )
            	    {
            	    // InternalAdaptSem.g:2659:5: (lv_rhs_5_0= ruleComparison )
            	    // InternalAdaptSem.g:2660:6: lv_rhs_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop35;
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
    // InternalAdaptSem.g:2682:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalAdaptSem.g:2682:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalAdaptSem.g:2683:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalAdaptSem.g:2689:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2695:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* ) )
            // InternalAdaptSem.g:2696:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* )
            {
            // InternalAdaptSem.g:2696:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )* )
            // InternalAdaptSem.g:2697:3: this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2708:3: ( ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=40 && LA37_0<=41)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAdaptSem.g:2709:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) ) ( (lv_rhs_5_0= rulePlusOrMinus ) )
            	    {
            	    // InternalAdaptSem.g:2709:4: ( ( () otherlv_2= '<' ) | ( () otherlv_4= '<=' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==40) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==41) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalAdaptSem.g:2710:5: ( () otherlv_2= '<' )
            	            {
            	            // InternalAdaptSem.g:2710:5: ( () otherlv_2= '<' )
            	            // InternalAdaptSem.g:2711:6: () otherlv_2= '<'
            	            {
            	            // InternalAdaptSem.g:2711:6: ()
            	            // InternalAdaptSem.g:2712:7: 
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

            	            otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:2727:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalAdaptSem.g:2727:5: ( () otherlv_4= '<=' )
            	            // InternalAdaptSem.g:2728:6: () otherlv_4= '<='
            	            {
            	            // InternalAdaptSem.g:2728:6: ()
            	            // InternalAdaptSem.g:2729:7: 
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

            	            otherlv_4=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:2744:4: ( (lv_rhs_5_0= rulePlusOrMinus ) )
            	    // InternalAdaptSem.g:2745:5: (lv_rhs_5_0= rulePlusOrMinus )
            	    {
            	    // InternalAdaptSem.g:2745:5: (lv_rhs_5_0= rulePlusOrMinus )
            	    // InternalAdaptSem.g:2746:6: lv_rhs_5_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRhsPlusOrMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop37;
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
    // InternalAdaptSem.g:2768:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalAdaptSem.g:2768:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalAdaptSem.g:2769:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalAdaptSem.g:2775:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2781:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalAdaptSem.g:2782:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalAdaptSem.g:2782:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )* )
            // InternalAdaptSem.g:2783:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2794:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=42 && LA39_0<=43)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdaptSem.g:2795:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalAdaptSem.g:2795:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==42) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==43) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalAdaptSem.g:2796:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalAdaptSem.g:2796:5: ( () otherlv_2= '+' )
            	            // InternalAdaptSem.g:2797:6: () otherlv_2= '+'
            	            {
            	            // InternalAdaptSem.g:2797:6: ()
            	            // InternalAdaptSem.g:2798:7: 
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

            	            otherlv_2=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:2813:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalAdaptSem.g:2813:5: ( () otherlv_4= '-' )
            	            // InternalAdaptSem.g:2814:6: () otherlv_4= '-'
            	            {
            	            // InternalAdaptSem.g:2814:6: ()
            	            // InternalAdaptSem.g:2815:7: 
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

            	            otherlv_4=(Token)match(input,43,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:2830:4: ( (lv_rhs_5_0= ruleMulOrDiv ) )
            	    // InternalAdaptSem.g:2831:5: (lv_rhs_5_0= ruleMulOrDiv )
            	    {
            	    // InternalAdaptSem.g:2831:5: (lv_rhs_5_0= ruleMulOrDiv )
            	    // InternalAdaptSem.g:2832:6: lv_rhs_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRhsMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalAdaptSem.g:2854:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalAdaptSem.g:2854:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalAdaptSem.g:2855:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalAdaptSem.g:2861:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2867:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* ) )
            // InternalAdaptSem.g:2868:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            {
            // InternalAdaptSem.g:2868:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )* )
            // InternalAdaptSem.g:2869:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAdaptSem.g:2880:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=44 && LA41_0<=45)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAdaptSem.g:2881:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= rulePrimary ) )
            	    {
            	    // InternalAdaptSem.g:2881:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==44) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==45) ) {
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
            	            // InternalAdaptSem.g:2882:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalAdaptSem.g:2882:5: ( () otherlv_2= '*' )
            	            // InternalAdaptSem.g:2883:6: () otherlv_2= '*'
            	            {
            	            // InternalAdaptSem.g:2883:6: ()
            	            // InternalAdaptSem.g:2884:7: 
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

            	            otherlv_2=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdaptSem.g:2899:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalAdaptSem.g:2899:5: ( () otherlv_4= '/' )
            	            // InternalAdaptSem.g:2900:6: () otherlv_4= '/'
            	            {
            	            // InternalAdaptSem.g:2900:6: ()
            	            // InternalAdaptSem.g:2901:7: 
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

            	            otherlv_4=(Token)match(input,45,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdaptSem.g:2916:4: ( (lv_rhs_5_0= rulePrimary ) )
            	    // InternalAdaptSem.g:2917:5: (lv_rhs_5_0= rulePrimary )
            	    {
            	    // InternalAdaptSem.g:2917:5: (lv_rhs_5_0= rulePrimary )
            	    // InternalAdaptSem.g:2918:6: lv_rhs_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRhsPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalAdaptSem.g:2940:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAdaptSem.g:2940:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAdaptSem.g:2941:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalAdaptSem.g:2947:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Expr_1 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_expr_8_0 = null;

        EObject this_Atomic_9 = null;



        	enterRule();

        try {
            // InternalAdaptSem.g:2953:2: ( ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic ) )
            // InternalAdaptSem.g:2954:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic )
            {
            // InternalAdaptSem.g:2954:2: ( (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt42=1;
                }
                break;
            case 35:
                {
                alt42=2;
                }
                break;
            case 43:
                {
                alt42=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_BOOL:
            case 28:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalAdaptSem.g:2955:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    {
                    // InternalAdaptSem.g:2955:3: (otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')' )
                    // InternalAdaptSem.g:2956:4: otherlv_0= '(' this_Expr_1= ruleExpr otherlv_2= ')'
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
                    pushFollow(FOLLOW_19);
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
                    // InternalAdaptSem.g:2977:3: ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) )
                    {
                    // InternalAdaptSem.g:2977:3: ( () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) ) )
                    // InternalAdaptSem.g:2978:4: () otherlv_4= '!' ( (lv_expr_5_0= rulePrimary ) )
                    {
                    // InternalAdaptSem.g:2978:4: ()
                    // InternalAdaptSem.g:2979:5: 
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

                    otherlv_4=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalAdaptSem.g:2992:4: ( (lv_expr_5_0= rulePrimary ) )
                    // InternalAdaptSem.g:2993:5: (lv_expr_5_0= rulePrimary )
                    {
                    // InternalAdaptSem.g:2993:5: (lv_expr_5_0= rulePrimary )
                    // InternalAdaptSem.g:2994:6: lv_expr_5_0= rulePrimary
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
                    // InternalAdaptSem.g:3013:3: ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) )
                    {
                    // InternalAdaptSem.g:3013:3: ( () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) ) )
                    // InternalAdaptSem.g:3014:4: () otherlv_7= '-' ( (lv_expr_8_0= rulePrimary ) )
                    {
                    // InternalAdaptSem.g:3014:4: ()
                    // InternalAdaptSem.g:3015:5: 
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

                    otherlv_7=(Token)match(input,43,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalAdaptSem.g:3028:4: ( (lv_expr_8_0= rulePrimary ) )
                    // InternalAdaptSem.g:3029:5: (lv_expr_8_0= rulePrimary )
                    {
                    // InternalAdaptSem.g:3029:5: (lv_expr_8_0= rulePrimary )
                    // InternalAdaptSem.g:3030:6: lv_expr_8_0= rulePrimary
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
                    // InternalAdaptSem.g:3049:3: this_Atomic_9= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_9=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_9;
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
    // InternalAdaptSem.g:3064:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalAdaptSem.g:3064:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalAdaptSem.g:3065:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalAdaptSem.g:3071:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression ) ;
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
            // InternalAdaptSem.g:3077:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression ) )
            // InternalAdaptSem.g:3078:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression )
            {
            // InternalAdaptSem.g:3078:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_BOOL ) ) ) | this_SemanticDomainAccess_8= ruleSemanticDomainAccess | this_TerminalAccessExpression_9= ruleTerminalAccessExpression )
            int alt43=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt43=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt43=2;
                }
                break;
            case RULE_STRING:
                {
                alt43=3;
                }
                break;
            case RULE_BOOL:
                {
                alt43=4;
                }
                break;
            case RULE_ID:
                {
                int LA43_5 = input.LA(2);

                if ( (LA43_5==EOF||LA43_5==17||(LA43_5>=20 && LA43_5<=23)||LA43_5==26||(LA43_5>=36 && LA43_5<=45)) ) {
                    alt43=6;
                }
                else if ( (LA43_5==27) ) {
                    alt43=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 5, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA43_6 = input.LA(2);

                if ( (LA43_6==EOF||LA43_6==17||(LA43_6>=20 && LA43_6<=23)||LA43_6==26||(LA43_6>=36 && LA43_6<=45)) ) {
                    alt43=6;
                }
                else if ( (LA43_6==27) ) {
                    alt43=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalAdaptSem.g:3079:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalAdaptSem.g:3079:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalAdaptSem.g:3080:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalAdaptSem.g:3080:4: ()
                    // InternalAdaptSem.g:3081:5: 
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

                    // InternalAdaptSem.g:3090:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalAdaptSem.g:3091:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalAdaptSem.g:3091:5: (lv_value_1_0= RULE_INT )
                    // InternalAdaptSem.g:3092:6: lv_value_1_0= RULE_INT
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
                    // InternalAdaptSem.g:3110:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    {
                    // InternalAdaptSem.g:3110:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    // InternalAdaptSem.g:3111:4: () ( (lv_value_3_0= RULE_DOUBLE ) )
                    {
                    // InternalAdaptSem.g:3111:4: ()
                    // InternalAdaptSem.g:3112:5: 
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

                    // InternalAdaptSem.g:3121:4: ( (lv_value_3_0= RULE_DOUBLE ) )
                    // InternalAdaptSem.g:3122:5: (lv_value_3_0= RULE_DOUBLE )
                    {
                    // InternalAdaptSem.g:3122:5: (lv_value_3_0= RULE_DOUBLE )
                    // InternalAdaptSem.g:3123:6: lv_value_3_0= RULE_DOUBLE
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
                    // InternalAdaptSem.g:3141:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalAdaptSem.g:3141:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalAdaptSem.g:3142:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalAdaptSem.g:3142:4: ()
                    // InternalAdaptSem.g:3143:5: 
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

                    // InternalAdaptSem.g:3152:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalAdaptSem.g:3153:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalAdaptSem.g:3153:5: (lv_value_5_0= RULE_STRING )
                    // InternalAdaptSem.g:3154:6: lv_value_5_0= RULE_STRING
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
                    // InternalAdaptSem.g:3172:3: ( () ( (lv_value_7_0= RULE_BOOL ) ) )
                    {
                    // InternalAdaptSem.g:3172:3: ( () ( (lv_value_7_0= RULE_BOOL ) ) )
                    // InternalAdaptSem.g:3173:4: () ( (lv_value_7_0= RULE_BOOL ) )
                    {
                    // InternalAdaptSem.g:3173:4: ()
                    // InternalAdaptSem.g:3174:5: 
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

                    // InternalAdaptSem.g:3183:4: ( (lv_value_7_0= RULE_BOOL ) )
                    // InternalAdaptSem.g:3184:5: (lv_value_7_0= RULE_BOOL )
                    {
                    // InternalAdaptSem.g:3184:5: (lv_value_7_0= RULE_BOOL )
                    // InternalAdaptSem.g:3185:6: lv_value_7_0= RULE_BOOL
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
                    // InternalAdaptSem.g:3203:3: this_SemanticDomainAccess_8= ruleSemanticDomainAccess
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
                    // InternalAdaptSem.g:3215:3: this_TerminalAccessExpression_9= ruleTerminalAccessExpression
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
    // InternalAdaptSem.g:3230:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAdaptSem.g:3230:47: (iv_ruleEString= ruleEString EOF )
            // InternalAdaptSem.g:3231:2: iv_ruleEString= ruleEString EOF
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
    // InternalAdaptSem.g:3237:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:3243:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAdaptSem.g:3244:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAdaptSem.g:3244:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
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
                    // InternalAdaptSem.g:3245:3: this_STRING_0= RULE_STRING
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
                    // InternalAdaptSem.g:3253:3: this_ID_1= RULE_ID
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
    // InternalAdaptSem.g:3264:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalAdaptSem.g:3264:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalAdaptSem.g:3265:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalAdaptSem.g:3271:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:3277:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAdaptSem.g:3278:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAdaptSem.g:3278:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAdaptSem.g:3279:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAdaptSem.g:3286:3: (kw= '.' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAdaptSem.g:3287:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleOperationFQN"
    // InternalAdaptSem.g:3304:1: entryRuleOperationFQN returns [String current=null] : iv_ruleOperationFQN= ruleOperationFQN EOF ;
    public final String entryRuleOperationFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationFQN = null;


        try {
            // InternalAdaptSem.g:3304:52: (iv_ruleOperationFQN= ruleOperationFQN EOF )
            // InternalAdaptSem.g:3305:2: iv_ruleOperationFQN= ruleOperationFQN EOF
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
    // InternalAdaptSem.g:3311:1: ruleOperationFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleOperationFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAdaptSem.g:3317:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalAdaptSem.g:3318:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalAdaptSem.g:3318:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalAdaptSem.g:3319:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getOperationFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAdaptSem.g:3326:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAdaptSem.g:3327:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
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
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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

    // $ANTLR start synpred15_InternalAdaptSem
    public final void synpred15_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_Expr_0 = null;


        // InternalAdaptSem.g:868:3: (this_Expr_0= ruleExpr )
        // InternalAdaptSem.g:868:3: this_Expr_0= ruleExpr
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
    // $ANTLR end synpred15_InternalAdaptSem

    // $ANTLR start synpred33_InternalAdaptSem
    public final void synpred33_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondOr_0 = null;


        // InternalAdaptSem.g:1925:3: (this_CondOr_0= ruleCondOr )
        // InternalAdaptSem.g:1925:3: this_CondOr_0= ruleCondOr
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
    // $ANTLR end synpred33_InternalAdaptSem

    // $ANTLR start synpred34_InternalAdaptSem
    public final void synpred34_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondAnd_1 = null;


        // InternalAdaptSem.g:1937:3: (this_CondAnd_1= ruleCondAnd )
        // InternalAdaptSem.g:1937:3: this_CondAnd_1= ruleCondAnd
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
    // $ANTLR end synpred34_InternalAdaptSem

    // $ANTLR start synpred35_InternalAdaptSem
    public final void synpred35_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondEquality_2 = null;


        // InternalAdaptSem.g:1949:3: (this_CondEquality_2= ruleCondEquality )
        // InternalAdaptSem.g:1949:3: this_CondEquality_2= ruleCondEquality
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
    // $ANTLR end synpred35_InternalAdaptSem

    // $ANTLR start synpred36_InternalAdaptSem
    public final void synpred36_InternalAdaptSem_fragment() throws RecognitionException {   
        EObject this_CondComparison_3 = null;


        // InternalAdaptSem.g:1961:3: (this_CondComparison_3= ruleCondComparison )
        // InternalAdaptSem.g:1961:3: this_CondComparison_3= ruleCondComparison
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
    // $ANTLR end synpred36_InternalAdaptSem

    // $ANTLR start synpred37_InternalAdaptSem
    public final void synpred37_InternalAdaptSem_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


        // InternalAdaptSem.g:2197:3: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) )
        // InternalAdaptSem.g:2197:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
        {
        // InternalAdaptSem.g:2197:3: ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) )
        // InternalAdaptSem.g:2198:4: () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) )
        {
        // InternalAdaptSem.g:2198:4: ()
        // InternalAdaptSem.g:2199:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAdaptSem.g:2208:4: ( (lv_lhs_1_0= ruleComparison ) )
        // InternalAdaptSem.g:2209:5: (lv_lhs_1_0= ruleComparison )
        {
        // InternalAdaptSem.g:2209:5: (lv_lhs_1_0= ruleComparison )
        // InternalAdaptSem.g:2210:6: lv_lhs_1_0= ruleComparison
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondEqualityAccess().getLhsComparisonParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_33);
        lv_lhs_1_0=ruleComparison();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,38,FOLLOW_11); if (state.failed) return ;
        // InternalAdaptSem.g:2231:4: ( (lv_rhs_3_0= ruleComparison ) )
        // InternalAdaptSem.g:2232:5: (lv_rhs_3_0= ruleComparison )
        {
        // InternalAdaptSem.g:2232:5: (lv_rhs_3_0= ruleComparison )
        // InternalAdaptSem.g:2233:6: lv_rhs_3_0= ruleComparison
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
    // $ANTLR end synpred37_InternalAdaptSem

    // $ANTLR start synpred38_InternalAdaptSem
    public final void synpred38_InternalAdaptSem_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


        // InternalAdaptSem.g:2325:3: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) )
        // InternalAdaptSem.g:2325:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
        {
        // InternalAdaptSem.g:2325:3: ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) )
        // InternalAdaptSem.g:2326:4: () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) )
        {
        // InternalAdaptSem.g:2326:4: ()
        // InternalAdaptSem.g:2327:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAdaptSem.g:2336:4: ( (lv_lhs_1_0= rulePlusOrMinus ) )
        // InternalAdaptSem.g:2337:5: (lv_lhs_1_0= rulePlusOrMinus )
        {
        // InternalAdaptSem.g:2337:5: (lv_lhs_1_0= rulePlusOrMinus )
        // InternalAdaptSem.g:2338:6: lv_lhs_1_0= rulePlusOrMinus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getCondComparisonAccess().getLhsPlusOrMinusParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_35);
        lv_lhs_1_0=rulePlusOrMinus();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return ;
        // InternalAdaptSem.g:2359:4: ( (lv_rhs_3_0= rulePlusOrMinus ) )
        // InternalAdaptSem.g:2360:5: (lv_rhs_3_0= rulePlusOrMinus )
        {
        // InternalAdaptSem.g:2360:5: (lv_rhs_3_0= rulePlusOrMinus )
        // InternalAdaptSem.g:2361:6: lv_rhs_3_0= rulePlusOrMinus
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
    // $ANTLR end synpred38_InternalAdaptSem

    // Delegated rules

    public final boolean synpred37_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalAdaptSem_fragment(); // can never throw exception
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
    public final boolean synpred34_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalAdaptSem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalAdaptSem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalAdaptSem_fragment(); // can never throw exception
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
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\4\1\30\1\uffff\1\4\1\30\1\uffff\1\4\1\30";
    static final String dfa_3s = "\1\34\1\33\1\uffff\1\4\1\33\1\uffff\1\4\1\33";
    static final String dfa_4s = "\2\uffff\1\1\2\uffff\1\2\2\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\27\uffff\1\2",
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\2\1\6\uffff";
    static final String dfa_9s = "\1\4\1\uffff\2\21\1\4\1\uffff\1\4\1\31\1\0\1\uffff";
    static final String dfa_10s = "\1\53\1\uffff\2\55\1\4\1\uffff\1\4\1\33\1\0\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\2\3\uffff\1\3";
    static final String dfa_12s = "\7\uffff\1\1\1\0\1\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\4\1\20\uffff\1\1\2\uffff\1\3\6\uffff\1\1\7\uffff\1\1",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\1\5\1\uffff\1\4\10\uffff\12\1",
            "\1\1\2\uffff\1\1\2\uffff\1\1\3\uffff\1\6\10\uffff\12\1",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "867:2: (this_Expr_0= ruleExpr | this_RefConfiguration_1= ruleRefConfiguration | this_SemanticDomainAccess_2= ruleSemanticDomainAccess )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalAdaptSem()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_7==25||LA15_7==27) ) {s = 5;}

                        else if ( (synpred15_InternalAdaptSem()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\1\4\11\0\5\uffff";
    static final String dfa_16s = "\1\53\11\0\5\uffff";
    static final String dfa_17s = "\12\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff}>";
    static final String[] dfa_19s = {
            "\1\10\1\4\1\5\1\6\1\7\20\uffff\1\1\2\uffff\1\11\6\uffff\1\2\7\uffff\1\3",
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

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1924:2: (this_CondOr_0= ruleCondOr | this_CondAnd_1= ruleCondAnd | this_CondEquality_2= ruleCondEquality | this_CondComparison_3= ruleCondComparison | this_CondNot_4= ruleCondNot )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalAdaptSem()) ) {s = 10;}

                        else if ( (synpred34_InternalAdaptSem()) ) {s = 11;}

                        else if ( (synpred35_InternalAdaptSem()) ) {s = 12;}

                        else if ( (synpred36_InternalAdaptSem()) ) {s = 13;}

                         
                        input.seek(index29_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\14\uffff";
    static final String dfa_21s = "\1\4\11\0\2\uffff";
    static final String dfa_22s = "\1\53\11\0\2\uffff";
    static final String dfa_23s = "\12\uffff\1\1\1\2";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_25s = {
            "\1\10\1\4\1\5\1\6\1\7\20\uffff\1\1\2\uffff\1\11\6\uffff\1\2\7\uffff\1\3",
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

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2196:2: ( ( () ( (lv_lhs_1_0= ruleComparison ) ) otherlv_2= '==' ( (lv_rhs_3_0= ruleComparison ) ) ) | ( () ( (lv_lhs_5_0= ruleComparison ) ) otherlv_6= '!=' ( (lv_rhs_7_0= ruleComparison ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2324:2: ( ( () ( (lv_lhs_1_0= rulePlusOrMinus ) ) otherlv_2= '<' ( (lv_rhs_3_0= rulePlusOrMinus ) ) ) | ( () ( (lv_lhs_5_0= rulePlusOrMinus ) ) otherlv_6= '<=' ( (lv_rhs_7_0= rulePlusOrMinus ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalAdaptSem()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000808120001F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000D00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000484000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000480000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000004C4000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000004C0000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000300000000002L});

}