// $ANTLR 3.4 C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g 2012-06-24 16:01:24

package eu.reitmayer.lang.entgen;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EntGenLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int Digit=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int Letter=7;
    public static final int ML=8;
    public static final int SL_COMMENT=9;
    public static final int STRING=10;
    public static final int WS=11;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public EntGenLexer() {} 
    public EntGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EntGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:11:7: ( '(' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:12:7: ( ')' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:13:7: ( ',' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:14:7: ( ';' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:15:7: ( 'DBTYPE' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:15:9: 'DBTYPE'
            {
            match("DBTYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:16:7: ( 'DOMAIN' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:16:9: 'DOMAIN'
            {
            match("DOMAIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:17:7: ( 'ELEMENT' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:17:9: 'ELEMENT'
            {
            match("ELEMENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:18:7: ( 'ENTITY' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:18:9: 'ENTITY'
            {
            match("ENTITY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:19:7: ( 'JTYPE' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:19:9: 'JTYPE'
            {
            match("JTYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:20:7: ( 'KEY' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:20:9: 'KEY'
            {
            match("KEY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:21:7: ( 'LENGTH' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:21:9: 'LENGTH'
            {
            match("LENGTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:22:7: ( 'LTEXT' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:22:9: 'LTEXT'
            {
            match("LTEXT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:23:7: ( 'MTEXT' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:23:9: 'MTEXT'
            {
            match("MTEXT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:24:7: ( 'PRECISION' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:24:9: 'PRECISION'
            {
            match("PRECISION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:25:7: ( 'STEXT' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:25:9: 'STEXT'
            {
            match("STEXT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "ML"
    public final void mML() throws RecognitionException {
        try {
            int _type = ML;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:59:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:60:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:60:8: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:60:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:62:12: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:8: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:24: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\r') ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:25: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:30: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:34: ( '\\n' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\n') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:63:35: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:69:7: ( '0' .. '9' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:73:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:79:4: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:80:3: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:80:3: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:88:4: ( Letter ( Letter | Digit | '_' )* )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:89:3: Letter ( Letter | Digit | '_' )*
            {
            mLetter(); 


            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:89:10: ( Letter | Digit | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:92:5: ( Digit ( Digit )* )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:93:3: Digit ( Digit )*
            {
            mDigit(); 


            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:93:9: ( Digit )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:96:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:97:3: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:97:7: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ML | SL_COMMENT | WS | ID | INT | STRING )
        int alt9=21;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:70: T__22
                {
                mT__22(); 


                }
                break;
            case 12 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:76: T__23
                {
                mT__23(); 


                }
                break;
            case 13 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:82: T__24
                {
                mT__24(); 


                }
                break;
            case 14 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:88: T__25
                {
                mT__25(); 


                }
                break;
            case 15 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:94: T__26
                {
                mT__26(); 


                }
                break;
            case 16 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:100: ML
                {
                mML(); 


                }
                break;
            case 17 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:103: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 18 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:114: WS
                {
                mWS(); 


                }
                break;
            case 19 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:117: ID
                {
                mID(); 


                }
                break;
            case 20 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:120: INT
                {
                mINT(); 


                }
                break;
            case 21 :
                // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:1:124: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\5\uffff\10\17\5\uffff\13\17\2\uffff\5\17\1\57\12\17\1\uffff\11"+
        "\17\1\103\1\17\1\105\1\106\1\17\1\110\1\111\1\112\1\17\1\114\1\uffff"+
        "\1\115\2\uffff\1\17\3\uffff\1\117\2\uffff\1\17\1\uffff\1\17\1\122"+
        "\1\uffff";
    static final String DFA9_eofS =
        "\123\uffff";
    static final String DFA9_minS =
        "\1\11\4\uffff\1\102\1\114\1\124\2\105\1\124\1\122\1\124\1\52\4\uffff"+
        "\1\124\1\115\1\105\1\124\2\131\1\116\4\105\2\uffff\1\131\1\101\1"+
        "\115\1\111\1\120\1\60\1\107\2\130\1\103\1\130\1\120\1\111\1\105"+
        "\1\124\1\105\1\uffff\3\124\1\111\1\124\1\105\2\116\1\131\1\60\1"+
        "\110\2\60\1\123\3\60\1\124\1\60\1\uffff\1\60\2\uffff\1\111\3\uffff"+
        "\1\60\2\uffff\1\117\1\uffff\1\116\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\172\4\uffff\1\117\1\116\1\124\1\105\2\124\1\122\1\124\1\57\4"+
        "\uffff\1\124\1\115\1\105\1\124\2\131\1\116\4\105\2\uffff\1\131\1"+
        "\101\1\115\1\111\1\120\1\172\1\107\2\130\1\103\1\130\1\120\1\111"+
        "\1\105\1\124\1\105\1\uffff\3\124\1\111\1\124\1\105\2\116\1\131\1"+
        "\172\1\110\2\172\1\123\3\172\1\124\1\172\1\uffff\1\172\2\uffff\1"+
        "\111\3\uffff\1\172\2\uffff\1\117\1\uffff\1\116\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\11\uffff\1\22\1\23\1\24\1\25\13\uffff\1"+
        "\20\1\21\20\uffff\1\12\23\uffff\1\11\1\uffff\1\14\1\15\1\uffff\1"+
        "\17\1\5\1\6\1\uffff\1\10\1\13\1\uffff\1\7\2\uffff\1\16";
    static final String DFA9_specialS =
        "\123\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\16\1\uffff\2\16\22\uffff\1\16\1\uffff\1\21\5\uffff\1\1\1"+
            "\2\2\uffff\1\3\2\uffff\1\15\12\20\1\uffff\1\4\5\uffff\3\17\1"+
            "\5\1\6\4\17\1\7\1\10\1\11\1\12\2\17\1\13\2\17\1\14\7\17\6\uffff"+
            "\32\17",
            "",
            "",
            "",
            "",
            "\1\22\14\uffff\1\23",
            "\1\24\1\uffff\1\25",
            "\1\26",
            "\1\27",
            "\1\30\16\uffff\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\104",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\107",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\113",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\1\116",
            "",
            "",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\1\120",
            "",
            "\1\121",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ML | SL_COMMENT | WS | ID | INT | STRING );";
        }
    }
 

}