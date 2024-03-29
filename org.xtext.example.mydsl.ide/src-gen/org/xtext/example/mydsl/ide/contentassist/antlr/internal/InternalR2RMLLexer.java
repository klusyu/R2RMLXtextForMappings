package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalR2RMLLexer extends Lexer {
    public static final int RULE_URIREF=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=5;
    public static final int RULE_DECIMAL=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=9;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_EXPONENT=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalR2RMLLexer() {;} 
    public InternalR2RMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalR2RMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalR2RML.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:11:7: ( 'AND' )
            // InternalR2RML.g:11:9: 'AND'
            {
            match("AND"); 


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
            // InternalR2RML.g:12:7: ( 'OR' )
            // InternalR2RML.g:12:9: 'OR'
            {
            match("OR"); 


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
            // InternalR2RML.g:13:7: ( '=' )
            // InternalR2RML.g:13:9: '='
            {
            match('='); 

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
            // InternalR2RML.g:14:7: ( '<>' )
            // InternalR2RML.g:14:9: '<>'
            {
            match("<>"); 


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
            // InternalR2RML.g:15:7: ( '<' )
            // InternalR2RML.g:15:9: '<'
            {
            match('<'); 

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
            // InternalR2RML.g:16:7: ( '<=' )
            // InternalR2RML.g:16:9: '<='
            {
            match("<="); 


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
            // InternalR2RML.g:17:7: ( '>' )
            // InternalR2RML.g:17:9: '>'
            {
            match('>'); 

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
            // InternalR2RML.g:18:7: ( '>=' )
            // InternalR2RML.g:18:9: '>='
            {
            match(">="); 


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
            // InternalR2RML.g:19:7: ( 'true' )
            // InternalR2RML.g:19:9: 'true'
            {
            match("true"); 


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
            // InternalR2RML.g:20:7: ( 'false' )
            // InternalR2RML.g:20:9: 'false'
            {
            match("false"); 


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
            // InternalR2RML.g:21:7: ( '.' )
            // InternalR2RML.g:21:9: '.'
            {
            match('.'); 

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
            // InternalR2RML.g:22:7: ( '@prefix' )
            // InternalR2RML.g:22:9: '@prefix'
            {
            match("@prefix"); 


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
            // InternalR2RML.g:23:7: ( 'logicalTable' )
            // InternalR2RML.g:23:9: 'logicalTable'
            {
            match("logicalTable"); 


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
            // InternalR2RML.g:24:7: ( '[' )
            // InternalR2RML.g:24:9: '['
            {
            match('['); 

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
            // InternalR2RML.g:25:7: ( ']' )
            // InternalR2RML.g:25:9: ']'
            {
            match(']'); 

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
            // InternalR2RML.g:26:7: ( ';' )
            // InternalR2RML.g:26:9: ';'
            {
            match(';'); 

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
            // InternalR2RML.g:27:7: ( 'sqlQuery' )
            // InternalR2RML.g:27:9: 'sqlQuery'
            {
            match("sqlQuery"); 


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
            // InternalR2RML.g:28:7: ( 'tableName' )
            // InternalR2RML.g:28:9: 'tableName'
            {
            match("tableName"); 


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
            // InternalR2RML.g:29:7: ( 'subjectMap' )
            // InternalR2RML.g:29:9: 'subjectMap'
            {
            match("subjectMap"); 


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
            // InternalR2RML.g:30:7: ( 'predicateObjectMap' )
            // InternalR2RML.g:30:9: 'predicateObjectMap'
            {
            match("predicateObjectMap"); 


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
            // InternalR2RML.g:31:7: ( 'objectMap' )
            // InternalR2RML.g:31:9: 'objectMap'
            {
            match("objectMap"); 


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
            // InternalR2RML.g:32:7: ( 'class' )
            // InternalR2RML.g:32:9: 'class'
            {
            match("class"); 


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
            // InternalR2RML.g:33:7: ( 'predicate' )
            // InternalR2RML.g:33:9: 'predicate'
            {
            match("predicate"); 


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
            // InternalR2RML.g:34:7: ( 'template' )
            // InternalR2RML.g:34:9: 'template'
            {
            match("template"); 


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
            // InternalR2RML.g:35:7: ( 'column' )
            // InternalR2RML.g:35:9: 'column'
            {
            match("column"); 


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
            // InternalR2RML.g:36:7: ( 'datatype' )
            // InternalR2RML.g:36:9: 'datatype'
            {
            match("datatype"); 


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
            // InternalR2RML.g:37:7: ( 'constant' )
            // InternalR2RML.g:37:9: 'constant'
            {
            match("constant"); 


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
            // InternalR2RML.g:38:7: ( ':' )
            // InternalR2RML.g:38:9: ':'
            {
            match(':'); 

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
            // InternalR2RML.g:39:7: ( 'SELECT' )
            // InternalR2RML.g:39:9: 'SELECT'
            {
            match("SELECT"); 


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
            // InternalR2RML.g:40:7: ( 'FROM' )
            // InternalR2RML.g:40:9: 'FROM'
            {
            match("FROM"); 


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
            // InternalR2RML.g:41:7: ( ',' )
            // InternalR2RML.g:41:9: ','
            {
            match(','); 

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
            // InternalR2RML.g:42:7: ( 'WHERE' )
            // InternalR2RML.g:42:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4068:13: ( ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT ) )
            // InternalR2RML.g:4068:15: ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            {
            // InternalR2RML.g:4068:15: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalR2RML.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalR2RML.g:4068:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalR2RML.g:4068:27: ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT
                    {
                    // InternalR2RML.g:4068:27: ( '0' .. '9' )+
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
                    	    // InternalR2RML.g:4068:28: '0' .. '9'
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
                    // InternalR2RML.g:4068:43: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalR2RML.g:4068:44: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 2 :
                    // InternalR2RML.g:4068:69: '.' ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    match('.'); 
                    // InternalR2RML.g:4068:73: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalR2RML.g:4068:74: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalR2RML.g:4068:99: ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    // InternalR2RML.g:4068:99: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalR2RML.g:4068:100: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    mRULE_EXPONENT(); 

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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4070:14: ( ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ ) )
            // InternalR2RML.g:4070:16: ( '-' | '+' )? ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            {
            // InternalR2RML.g:4070:16: ( '-' | '+' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalR2RML.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalR2RML.g:4070:27: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=1;
            }
            else if ( (LA11_0=='.') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalR2RML.g:4070:28: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // InternalR2RML.g:4070:28: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalR2RML.g:4070:29: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // InternalR2RML.g:4070:44: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalR2RML.g:4070:45: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:4070:56: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalR2RML.g:4070:60: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalR2RML.g:4070:61: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalR2RML.g:4072:24: ( ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )+ )
            // InternalR2RML.g:4072:26: ( 'e' | 'E' ) ( '-' | '+' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalR2RML.g:4072:36: ( '-' | '+' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalR2RML.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalR2RML.g:4072:47: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalR2RML.g:4072:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_URIREF"
    public final void mRULE_URIREF() throws RecognitionException {
        try {
            int _type = RULE_URIREF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4074:13: ( '<' ( options {greedy=false; } : . )* '>' )
            // InternalR2RML.g:4074:15: '<' ( options {greedy=false; } : . )* '>'
            {
            match('<'); 
            // InternalR2RML.g:4074:19: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='>') ) {
                    alt14=2;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='=')||(LA14_0>='?' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalR2RML.g:4074:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URIREF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4076:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalR2RML.g:4076:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalR2RML.g:4076:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalR2RML.g:4076:11: '^'
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

            // InternalR2RML.g:4076:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='-'||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalR2RML.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4078:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalR2RML.g:4078:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalR2RML.g:4078:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalR2RML.g:4078:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalR2RML.g:4078:39: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalR2RML.g:4078:40: ( '\\r' )? '\\n'
                    {
                    // InternalR2RML.g:4078:40: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalR2RML.g:4078:40: '\\r'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4080:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalR2RML.g:4080:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalR2RML.g:4080:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\"') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='\"') ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3=='\"') ) {
                        alt23=3;
                    }
                    else {
                        alt23=1;}
                }
                else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0=='\'') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalR2RML.g:4080:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalR2RML.g:4080:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalR2RML.g:4080:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalR2RML.g:4080:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalR2RML.g:4080:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalR2RML.g:4080:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalR2RML.g:4080:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalR2RML.g:4080:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 3 :
                    // InternalR2RML.g:4080:83: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalR2RML.g:4080:89: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\"') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='\"') ) {
                                int LA22_3 = input.LA(3);

                                if ( (LA22_3=='\"') ) {
                                    alt22=2;
                                }
                                else if ( ((LA22_3>='\u0000' && LA22_3<='!')||(LA22_3>='#' && LA22_3<='\uFFFF')) ) {
                                    alt22=1;
                                }


                            }
                            else if ( ((LA22_1>='\u0000' && LA22_1<='!')||(LA22_1>='#' && LA22_1<='\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalR2RML.g:4080:117: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match("\"\"\""); 


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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4082:10: ( ( '0' .. '9' )+ )
            // InternalR2RML.g:4082:12: ( '0' .. '9' )+
            {
            // InternalR2RML.g:4082:12: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalR2RML.g:4082:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4084:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalR2RML.g:4084:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalR2RML.g:4084:24: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='*') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='/') ) {
                        alt25=2;
                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalR2RML.g:4084:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalR2RML.g:4086:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalR2RML.g:4086:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalR2RML.g:4086:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalR2RML.g:
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalR2RML.g:4088:16: ( . )
            // InternalR2RML.g:4088:18: .
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
        // InternalR2RML.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_DOUBLE | RULE_DECIMAL | RULE_URIREF | RULE_ID | RULE_SL_COMMENT | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt27=42;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalR2RML.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalR2RML.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalR2RML.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalR2RML.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalR2RML.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalR2RML.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalR2RML.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalR2RML.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalR2RML.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalR2RML.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalR2RML.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalR2RML.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalR2RML.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalR2RML.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalR2RML.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalR2RML.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalR2RML.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalR2RML.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalR2RML.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalR2RML.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalR2RML.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalR2RML.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalR2RML.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalR2RML.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalR2RML.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalR2RML.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalR2RML.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalR2RML.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalR2RML.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalR2RML.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalR2RML.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalR2RML.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalR2RML.g:1:202: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 34 :
                // InternalR2RML.g:1:214: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 35 :
                // InternalR2RML.g:1:227: RULE_URIREF
                {
                mRULE_URIREF(); 

                }
                break;
            case 36 :
                // InternalR2RML.g:1:239: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalR2RML.g:1:247: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalR2RML.g:1:263: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalR2RML.g:1:275: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalR2RML.g:1:284: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalR2RML.g:1:300: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalR2RML.g:1:308: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA6_eotS =
        "\5\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\2\56\3\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "4068:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | '.' ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )";
        }
    }
    static final String DFA27_eotS =
        "\1\uffff\2\43\1\uffff\1\50\1\53\2\43\1\60\1\41\1\43\3\uffff\5\43\1\uffff\2\43\1\uffff\1\43\1\41\1\105\1\41\2\uffff\3\41\2\uffff\1\43\1\uffff\1\116\1\uffff\1\117\1\120\4\uffff\4\43\1\uffff\1\125\1\uffff\1\43\3\uffff\7\43\1\uffff\2\43\1\uffff\1\43\3\uffff\1\125\1\105\5\uffff\1\143\3\uffff\4\43\1\uffff\14\43\1\125\1\uffff\1\164\15\43\1\u0082\1\43\1\uffff\2\43\1\u0086\5\43\1\u008c\4\43\1\uffff\1\u0091\2\43\1\uffff\5\43\1\uffff\1\u0099\2\43\1\u009c\1\uffff\7\43\1\uffff\2\43\1\uffff\1\43\1\u00a7\1\43\1\u00a9\3\43\1\u00ad\1\u00ae\1\u00af\1\uffff\1\43\1\uffff\1\43\1\u00b3\1\u00b4\3\uffff\1\43\1\u00b6\1\43\2\uffff\1\43\1\uffff\1\43\1\u00ba\1\43\1\uffff\5\43\1\u00c1\1\uffff";
    static final String DFA27_eofS =
        "\u00c2\uffff";
    static final String DFA27_minS =
        "\1\0\1\116\1\122\1\uffff\1\0\1\75\2\141\1\60\1\160\1\157\3\uffff\1\161\1\162\1\142\1\154\1\141\1\uffff\1\105\1\122\1\uffff\1\110\2\56\1\101\2\uffff\2\0\1\52\2\uffff\1\104\1\uffff\1\55\1\uffff\2\0\4\uffff\1\165\1\142\1\155\1\154\1\uffff\1\60\1\uffff\1\147\3\uffff\1\154\1\142\1\145\1\152\1\141\1\154\1\164\1\uffff\1\114\1\117\1\uffff\1\105\1\56\1\60\1\uffff\1\60\1\56\5\uffff\1\55\3\uffff\1\145\1\154\1\160\1\163\1\uffff\1\151\1\121\1\152\1\144\1\145\1\163\1\165\1\163\1\141\1\105\1\115\1\122\1\60\1\uffff\1\55\1\145\1\154\1\145\1\143\1\165\1\145\1\151\1\143\1\163\1\155\2\164\1\103\1\55\1\105\1\uffff\1\116\1\141\1\55\1\141\1\145\2\143\1\164\1\55\1\156\1\141\1\171\1\124\1\uffff\1\55\1\141\1\164\1\uffff\1\154\1\162\1\164\1\141\1\115\1\uffff\1\55\1\156\1\160\1\55\1\uffff\1\155\1\145\1\124\1\171\1\115\1\164\1\141\1\uffff\1\164\1\145\1\uffff\1\145\1\55\1\141\1\55\1\141\1\145\1\160\3\55\1\uffff\1\142\1\uffff\1\160\2\55\3\uffff\1\154\1\55\1\142\2\uffff\1\145\1\uffff\1\152\1\55\1\145\1\uffff\1\143\1\164\1\115\1\141\1\160\1\55\1\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\116\1\122\1\uffff\1\uffff\1\75\1\162\1\141\1\71\1\160\1\157\3\uffff\1\165\1\162\1\142\1\157\1\141\1\uffff\1\105\1\122\1\uffff\1\110\1\71\1\145\1\172\2\uffff\2\uffff\1\52\2\uffff\1\104\1\uffff\1\172\1\uffff\2\uffff\4\uffff\1\165\1\142\1\155\1\154\1\uffff\1\145\1\uffff\1\147\3\uffff\1\154\1\142\1\145\1\152\1\141\1\156\1\164\1\uffff\1\114\1\117\1\uffff\1\105\1\145\1\71\1\uffff\2\145\5\uffff\1\172\3\uffff\1\145\1\154\1\160\1\163\1\uffff\1\151\1\121\1\152\1\144\1\145\1\163\1\165\1\163\1\141\1\105\1\115\1\122\1\145\1\uffff\1\172\1\145\1\154\1\145\1\143\1\165\1\145\1\151\1\143\1\163\1\155\2\164\1\103\1\172\1\105\1\uffff\1\116\1\141\1\172\1\141\1\145\2\143\1\164\1\172\1\156\1\141\1\171\1\124\1\uffff\1\172\1\141\1\164\1\uffff\1\154\1\162\1\164\1\141\1\115\1\uffff\1\172\1\156\1\160\1\172\1\uffff\1\155\1\145\1\124\1\171\1\115\1\164\1\141\1\uffff\1\164\1\145\1\uffff\1\145\1\172\1\141\1\172\1\141\1\145\1\160\3\172\1\uffff\1\142\1\uffff\1\160\2\172\3\uffff\1\154\1\172\1\142\2\uffff\1\145\1\uffff\1\152\1\172\1\145\1\uffff\1\143\1\164\1\115\1\141\1\160\1\172\1\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\1\3\7\uffff\1\16\1\17\1\20\5\uffff\1\34\2\uffff\1\37\4\uffff\1\44\1\45\3\uffff\1\51\1\52\1\uffff\1\44\1\uffff\1\3\2\uffff\1\5\1\43\1\10\1\7\4\uffff\1\13\1\uffff\1\14\1\uffff\1\16\1\17\1\20\7\uffff\1\34\2\uffff\1\37\3\uffff\1\47\2\uffff\1\41\1\45\1\46\1\50\1\51\1\uffff\1\2\1\4\1\6\4\uffff\1\42\15\uffff\1\1\20\uffff\1\11\15\uffff\1\36\3\uffff\1\12\5\uffff\1\26\4\uffff\1\40\7\uffff\1\31\2\uffff\1\35\12\uffff\1\30\1\uffff\1\21\3\uffff\1\33\1\32\1\22\3\uffff\1\27\1\25\1\uffff\1\23\3\uffff\1\15\6\uffff\1\24";
    static final String DFA27_specialS =
        "\1\3\3\uffff\1\2\30\uffff\1\5\1\1\7\uffff\1\4\1\0\u009a\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\1\34\3\41\1\36\3\41\1\30\1\26\1\30\1\10\1\37\12\31\1\23\1\15\1\4\1\3\1\5\1\41\1\11\1\1\4\33\1\25\10\33\1\2\3\33\1\24\3\33\1\27\3\33\1\13\1\41\1\14\1\32\1\33\1\41\2\33\1\21\1\22\1\33\1\7\5\33\1\12\2\33\1\20\1\17\2\33\1\16\1\6\6\33\uff85\41",
            "\1\42",
            "\1\44",
            "",
            "\75\51\1\47\1\46\uffc1\51",
            "\1\52",
            "\1\55\3\uffff\1\56\14\uffff\1\54",
            "\1\57",
            "\12\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\1\67\3\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73\2\uffff\1\74",
            "\1\75",
            "",
            "\1\77",
            "\1\100",
            "",
            "\1\102",
            "\1\104\1\uffff\12\103",
            "\1\106\1\uffff\12\107\13\uffff\1\110\37\uffff\1\110",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\112",
            "\0\112",
            "\1\113",
            "",
            "",
            "\1\115",
            "",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\51",
            "\0\51",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\12\61\13\uffff\1\110\37\uffff\1\110",
            "",
            "\1\126",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\1\uffff\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\106\1\uffff\12\103\13\uffff\1\110\37\uffff\1\110",
            "\12\61",
            "",
            "\12\142\13\uffff\1\110\37\uffff\1\110",
            "\1\106\1\uffff\12\107\13\uffff\1\110\37\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\142\13\uffff\1\110\37\uffff\1\110",
            "",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009a",
            "\1\u009b",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a8",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\43\2\uffff\12\43\7\uffff\16\43\1\u00b2\13\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b7",
            "",
            "",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_DOUBLE | RULE_DECIMAL | RULE_URIREF | RULE_ID | RULE_SL_COMMENT | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_39 = input.LA(1);

                        s = -1;
                        if ( ((LA27_39>='\u0000' && LA27_39<='\uFFFF')) ) {s = 41;}

                        else s = 80;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_30 = input.LA(1);

                        s = -1;
                        if ( ((LA27_30>='\u0000' && LA27_30<='\uFFFF')) ) {s = 74;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_4 = input.LA(1);

                        s = -1;
                        if ( (LA27_4=='>') ) {s = 38;}

                        else if ( (LA27_4=='=') ) {s = 39;}

                        else if ( ((LA27_4>='\u0000' && LA27_4<='<')||(LA27_4>='?' && LA27_4<='\uFFFF')) ) {s = 41;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='A') ) {s = 1;}

                        else if ( (LA27_0=='O') ) {s = 2;}

                        else if ( (LA27_0=='=') ) {s = 3;}

                        else if ( (LA27_0=='<') ) {s = 4;}

                        else if ( (LA27_0=='>') ) {s = 5;}

                        else if ( (LA27_0=='t') ) {s = 6;}

                        else if ( (LA27_0=='f') ) {s = 7;}

                        else if ( (LA27_0=='.') ) {s = 8;}

                        else if ( (LA27_0=='@') ) {s = 9;}

                        else if ( (LA27_0=='l') ) {s = 10;}

                        else if ( (LA27_0=='[') ) {s = 11;}

                        else if ( (LA27_0==']') ) {s = 12;}

                        else if ( (LA27_0==';') ) {s = 13;}

                        else if ( (LA27_0=='s') ) {s = 14;}

                        else if ( (LA27_0=='p') ) {s = 15;}

                        else if ( (LA27_0=='o') ) {s = 16;}

                        else if ( (LA27_0=='c') ) {s = 17;}

                        else if ( (LA27_0=='d') ) {s = 18;}

                        else if ( (LA27_0==':') ) {s = 19;}

                        else if ( (LA27_0=='S') ) {s = 20;}

                        else if ( (LA27_0=='F') ) {s = 21;}

                        else if ( (LA27_0==',') ) {s = 22;}

                        else if ( (LA27_0=='W') ) {s = 23;}

                        else if ( (LA27_0=='+'||LA27_0=='-') ) {s = 24;}

                        else if ( ((LA27_0>='0' && LA27_0<='9')) ) {s = 25;}

                        else if ( (LA27_0=='^') ) {s = 26;}

                        else if ( ((LA27_0>='B' && LA27_0<='E')||(LA27_0>='G' && LA27_0<='N')||(LA27_0>='P' && LA27_0<='R')||(LA27_0>='T' && LA27_0<='V')||(LA27_0>='X' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='b')||LA27_0=='e'||(LA27_0>='g' && LA27_0<='k')||(LA27_0>='m' && LA27_0<='n')||(LA27_0>='q' && LA27_0<='r')||(LA27_0>='u' && LA27_0<='z')) ) {s = 27;}

                        else if ( (LA27_0=='#') ) {s = 28;}

                        else if ( (LA27_0=='\"') ) {s = 29;}

                        else if ( (LA27_0=='\'') ) {s = 30;}

                        else if ( (LA27_0=='/') ) {s = 31;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 32;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='$' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='*')||LA27_0=='?'||LA27_0=='\\'||LA27_0=='`'||(LA27_0>='{' && LA27_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_38 = input.LA(1);

                        s = -1;
                        if ( ((LA27_38>='\u0000' && LA27_38<='\uFFFF')) ) {s = 41;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_29 = input.LA(1);

                        s = -1;
                        if ( ((LA27_29>='\u0000' && LA27_29<='\uFFFF')) ) {s = 74;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}