package fr.irisa.diverse.semanticadaptation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemAdaptLexer extends Lexer {
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

    public InternalSemAdaptLexer() {;} 
    public InternalSemAdaptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSemAdaptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSemAdapt.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:11:7: ( 'semantics' )
            // InternalSemAdapt.g:11:9: 'semantics'
            {
            match("semantics"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:12:7: ( '{' )
            // InternalSemAdapt.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:13:7: ( '}' )
            // InternalSemAdapt.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:14:7: ( 'recursive' )
            // InternalSemAdapt.g:14:9: 'recursive'
            {
            match("recursive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:15:7: ( 'match' )
            // InternalSemAdapt.g:15:9: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:16:7: ( 'where' )
            // InternalSemAdapt.g:16:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:17:7: ( ',' )
            // InternalSemAdapt.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:18:7: ( 'Specialization' )
            // InternalSemAdapt.g:18:9: 'Specialization'
            {
            match("Specialization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:19:7: ( 'Before' )
            // InternalSemAdapt.g:19:9: 'Before'
            {
            match("Before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:20:7: ( 'After' )
            // InternalSemAdapt.g:20:9: 'After'
            {
            match("After"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:21:7: ( 'model' )
            // InternalSemAdapt.g:21:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:22:7: ( 'with' )
            // InternalSemAdapt.g:22:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:23:7: ( 'import' )
            // InternalSemAdapt.g:23:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:24:7: ( 'as' )
            // InternalSemAdapt.g:24:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:25:7: ( 'rule' )
            // InternalSemAdapt.g:25:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:26:7: ( ';' )
            // InternalSemAdapt.g:26:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:27:7: ( 'resolve' )
            // InternalSemAdapt.g:27:9: 'resolve'
            {
            match("resolve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:28:7: ( 'bind' )
            // InternalSemAdapt.g:28:9: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:29:7: ( 'IO' )
            // InternalSemAdapt.g:29:9: 'IO'
            {
            match("IO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:30:7: ( '=' )
            // InternalSemAdapt.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:31:7: ( '(' )
            // InternalSemAdapt.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:32:7: ( ')' )
            // InternalSemAdapt.g:32:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:33:7: ( '.' )
            // InternalSemAdapt.g:33:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:34:7: ( 'self' )
            // InternalSemAdapt.g:34:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:35:7: ( '->' )
            // InternalSemAdapt.g:35:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:36:7: ( 'termination' )
            // InternalSemAdapt.g:36:9: 'termination'
            {
            match("termination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:37:7: ( '[' )
            // InternalSemAdapt.g:37:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:38:7: ( '|' )
            // InternalSemAdapt.g:38:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:39:7: ( ']' )
            // InternalSemAdapt.g:39:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:40:7: ( '[]' )
            // InternalSemAdapt.g:40:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:41:7: ( '!' )
            // InternalSemAdapt.g:41:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:42:7: ( '||' )
            // InternalSemAdapt.g:42:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:43:7: ( '&&' )
            // InternalSemAdapt.g:43:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:44:7: ( '==' )
            // InternalSemAdapt.g:44:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:45:7: ( '!=' )
            // InternalSemAdapt.g:45:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:46:7: ( '<' )
            // InternalSemAdapt.g:46:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:47:7: ( '<=' )
            // InternalSemAdapt.g:47:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:48:7: ( '+' )
            // InternalSemAdapt.g:48:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:49:7: ( '-' )
            // InternalSemAdapt.g:49:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:50:7: ( '*' )
            // InternalSemAdapt.g:50:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:51:7: ( '/' )
            // InternalSemAdapt.g:51:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3837:11: ( ( 'true' | 'false' ) )
            // InternalSemAdapt.g:3837:13: ( 'true' | 'false' )
            {
            // InternalSemAdapt.g:3837:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSemAdapt.g:3837:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:3837:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3839:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalSemAdapt.g:3839:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalSemAdapt.g:3839:15: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSemAdapt.g:3839:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalSemAdapt.g:3839:31: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSemAdapt.g:3839:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3841:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSemAdapt.g:3841:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSemAdapt.g:3841:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSemAdapt.g:3841:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSemAdapt.g:3841:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSemAdapt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3843:10: ( ( '0' .. '9' )+ )
            // InternalSemAdapt.g:3843:12: ( '0' .. '9' )+
            {
            // InternalSemAdapt.g:3843:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSemAdapt.g:3843:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3845:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSemAdapt.g:3845:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSemAdapt.g:3845:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSemAdapt.g:3845:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSemAdapt.g:3845:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSemAdapt.g:3845:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSemAdapt.g:3845:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSemAdapt.g:3845:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSemAdapt.g:3845:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSemAdapt.g:3845:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSemAdapt.g:3845:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3847:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSemAdapt.g:3847:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSemAdapt.g:3847:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSemAdapt.g:3847:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3849:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSemAdapt.g:3849:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSemAdapt.g:3849:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSemAdapt.g:3849:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalSemAdapt.g:3849:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSemAdapt.g:3849:41: ( '\\r' )? '\\n'
                    {
                    // InternalSemAdapt.g:3849:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSemAdapt.g:3849:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3851:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSemAdapt.g:3851:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSemAdapt.g:3851:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSemAdapt.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSemAdapt.g:3853:16: ( . )
            // InternalSemAdapt.g:3853:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSemAdapt.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=50;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalSemAdapt.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalSemAdapt.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalSemAdapt.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalSemAdapt.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalSemAdapt.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalSemAdapt.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalSemAdapt.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalSemAdapt.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalSemAdapt.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalSemAdapt.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalSemAdapt.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalSemAdapt.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalSemAdapt.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalSemAdapt.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalSemAdapt.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalSemAdapt.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalSemAdapt.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalSemAdapt.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalSemAdapt.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalSemAdapt.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalSemAdapt.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalSemAdapt.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalSemAdapt.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalSemAdapt.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalSemAdapt.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalSemAdapt.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalSemAdapt.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalSemAdapt.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalSemAdapt.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalSemAdapt.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalSemAdapt.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalSemAdapt.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalSemAdapt.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalSemAdapt.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalSemAdapt.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalSemAdapt.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalSemAdapt.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalSemAdapt.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalSemAdapt.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalSemAdapt.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalSemAdapt.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalSemAdapt.g:1:256: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 43 :
                // InternalSemAdapt.g:1:266: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 44 :
                // InternalSemAdapt.g:1:278: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // InternalSemAdapt.g:1:286: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalSemAdapt.g:1:295: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalSemAdapt.g:1:307: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalSemAdapt.g:1:323: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalSemAdapt.g:1:339: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalSemAdapt.g:1:347: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\50\2\uffff\3\50\1\uffff\5\50\1\uffff\2\50\1\73\3\uffff\1\100\1\50\1\104\1\106\1\uffff\1\111\1\46\1\114\2\uffff\1\121\1\50\1\123\1\46\1\uffff\2\46\2\uffff\1\50\3\uffff\6\50\1\uffff\4\50\1\145\1\uffff\1\50\1\147\7\uffff\2\50\17\uffff\1\50\2\uffff\1\123\2\uffff\15\50\1\uffff\1\50\1\uffff\4\50\1\175\2\50\1\u0080\3\50\1\u0084\4\50\1\u0089\1\50\1\u008b\2\50\1\uffff\2\50\1\uffff\1\u0090\1\u0091\1\u0092\1\uffff\2\50\1\u0095\1\50\1\uffff\1\50\1\uffff\1\u008b\3\50\3\uffff\1\50\1\u009c\1\uffff\1\u009d\3\50\1\u00a1\1\50\2\uffff\3\50\1\uffff\2\50\1\u00a8\1\u00a9\2\50\2\uffff\3\50\1\u00af\1\50\1\uffff\1\50\1\u00b2\1\uffff";
    static final String DFA15_eofS =
        "\u00b3\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\2\uffff\1\145\1\141\1\150\1\uffff\1\160\1\145\1\146\1\155\1\163\1\uffff\1\151\1\117\1\75\3\uffff\1\76\1\145\1\135\1\174\1\uffff\1\75\1\46\1\75\2\uffff\1\52\1\141\1\56\1\101\1\uffff\2\0\2\uffff\1\154\3\uffff\1\143\1\154\1\164\1\144\1\145\1\164\1\uffff\1\145\1\146\1\164\1\160\1\60\1\uffff\1\156\1\60\7\uffff\1\162\1\165\17\uffff\1\154\2\uffff\1\56\2\uffff\1\141\1\146\1\165\1\157\1\145\1\143\1\145\1\162\1\150\1\143\1\157\1\145\1\157\1\uffff\1\144\1\uffff\1\155\1\145\1\163\1\156\1\60\1\162\1\154\1\60\1\150\1\154\1\145\1\60\1\151\3\162\1\60\1\151\1\60\1\145\1\164\1\uffff\1\163\1\166\1\uffff\3\60\1\uffff\1\141\1\145\1\60\1\164\1\uffff\1\156\1\uffff\1\60\2\151\1\145\3\uffff\1\154\1\60\1\uffff\1\60\1\141\1\143\1\166\1\60\1\151\2\uffff\1\164\1\163\1\145\1\uffff\1\172\1\151\2\60\1\141\1\157\2\uffff\1\164\1\156\1\151\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\145\2\uffff\1\165\1\157\1\151\1\uffff\1\160\1\145\1\146\1\155\1\163\1\uffff\1\151\1\117\1\75\3\uffff\1\76\1\162\1\135\1\174\1\uffff\1\75\1\46\1\75\2\uffff\1\57\1\141\1\71\1\172\1\uffff\2\uffff\2\uffff\1\155\3\uffff\1\163\1\154\1\164\1\144\1\145\1\164\1\uffff\1\145\1\146\1\164\1\160\1\172\1\uffff\1\156\1\172\7\uffff\1\162\1\165\17\uffff\1\154\2\uffff\1\71\2\uffff\1\141\1\146\1\165\1\157\1\145\1\143\1\145\1\162\1\150\1\143\1\157\1\145\1\157\1\uffff\1\144\1\uffff\1\155\1\145\1\163\1\156\1\172\1\162\1\154\1\172\1\150\1\154\1\145\1\172\1\151\3\162\1\172\1\151\1\172\1\145\1\164\1\uffff\1\163\1\166\1\uffff\3\172\1\uffff\1\141\1\145\1\172\1\164\1\uffff\1\156\1\uffff\1\172\2\151\1\145\3\uffff\1\154\1\172\1\uffff\1\172\1\141\1\143\1\166\1\172\1\151\2\uffff\1\164\1\163\1\145\1\uffff\1\172\1\151\2\172\1\141\1\157\2\uffff\1\164\1\156\1\151\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\5\uffff\1\20\3\uffff\1\25\1\26\1\27\4\uffff\1\35\3\uffff\1\46\1\50\4\uffff\1\54\2\uffff\1\61\1\62\1\uffff\1\54\1\2\1\3\6\uffff\1\7\5\uffff\1\20\2\uffff\1\42\1\24\1\25\1\26\1\27\1\31\1\47\2\uffff\1\36\1\33\1\40\1\34\1\35\1\43\1\37\1\41\1\45\1\44\1\46\1\50\1\57\1\60\1\51\1\uffff\1\55\1\53\1\uffff\1\56\1\61\15\uffff\1\16\1\uffff\1\23\25\uffff\1\30\2\uffff\1\17\3\uffff\1\14\4\uffff\1\22\1\uffff\1\52\4\uffff\1\5\1\13\1\6\2\uffff\1\12\6\uffff\1\11\1\15\3\uffff\1\21\6\uffff\1\1\1\4\5\uffff\1\32\2\uffff\1\10";
    static final String DFA15_specialS =
        "\1\1\42\uffff\1\0\1\2\u008e\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\31\1\43\3\46\1\32\1\44\1\21\1\22\1\35\1\34\1\7\1\24\1\23\1\36\12\40\1\46\1\15\1\33\1\20\3\46\1\12\1\11\6\42\1\17\11\42\1\10\7\42\1\26\1\46\1\30\1\41\1\42\1\46\1\14\1\16\3\42\1\37\2\42\1\13\3\42\1\5\4\42\1\4\1\1\1\25\2\42\1\6\3\42\1\2\1\27\1\3\uff82\46",
            "\1\47",
            "",
            "",
            "\1\53\17\uffff\1\54",
            "\1\55\15\uffff\1\56",
            "\1\57\1\60",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "\1\77",
            "\1\101\14\uffff\1\102",
            "\1\103",
            "\1\105",
            "",
            "\1\110",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\117\4\uffff\1\120",
            "\1\122",
            "\1\124\1\uffff\12\125",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\126",
            "\0\126",
            "",
            "",
            "\1\131\1\130",
            "",
            "",
            "",
            "\1\132\17\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\146",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "\1\124\1\uffff\12\125",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\176",
            "\1\177",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0093",
            "\1\u0094",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "\1\u009b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_BOOL | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_35 = input.LA(1);

                        s = -1;
                        if ( ((LA15_35>='\u0000' && LA15_35<='\uFFFF')) ) {s = 86;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='s') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='}') ) {s = 3;}

                        else if ( (LA15_0=='r') ) {s = 4;}

                        else if ( (LA15_0=='m') ) {s = 5;}

                        else if ( (LA15_0=='w') ) {s = 6;}

                        else if ( (LA15_0==',') ) {s = 7;}

                        else if ( (LA15_0=='S') ) {s = 8;}

                        else if ( (LA15_0=='B') ) {s = 9;}

                        else if ( (LA15_0=='A') ) {s = 10;}

                        else if ( (LA15_0=='i') ) {s = 11;}

                        else if ( (LA15_0=='a') ) {s = 12;}

                        else if ( (LA15_0==';') ) {s = 13;}

                        else if ( (LA15_0=='b') ) {s = 14;}

                        else if ( (LA15_0=='I') ) {s = 15;}

                        else if ( (LA15_0=='=') ) {s = 16;}

                        else if ( (LA15_0=='(') ) {s = 17;}

                        else if ( (LA15_0==')') ) {s = 18;}

                        else if ( (LA15_0=='.') ) {s = 19;}

                        else if ( (LA15_0=='-') ) {s = 20;}

                        else if ( (LA15_0=='t') ) {s = 21;}

                        else if ( (LA15_0=='[') ) {s = 22;}

                        else if ( (LA15_0=='|') ) {s = 23;}

                        else if ( (LA15_0==']') ) {s = 24;}

                        else if ( (LA15_0=='!') ) {s = 25;}

                        else if ( (LA15_0=='&') ) {s = 26;}

                        else if ( (LA15_0=='<') ) {s = 27;}

                        else if ( (LA15_0=='+') ) {s = 28;}

                        else if ( (LA15_0=='*') ) {s = 29;}

                        else if ( (LA15_0=='/') ) {s = 30;}

                        else if ( (LA15_0=='f') ) {s = 31;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 32;}

                        else if ( (LA15_0=='^') ) {s = 33;}

                        else if ( ((LA15_0>='C' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='R')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='c' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='l')||(LA15_0>='n' && LA15_0<='q')||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 34;}

                        else if ( (LA15_0=='\"') ) {s = 35;}

                        else if ( (LA15_0=='\'') ) {s = 36;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 37;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='%')||LA15_0==':'||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\uFFFF')) ) {s = 86;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}