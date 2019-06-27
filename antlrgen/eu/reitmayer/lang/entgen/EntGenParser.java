// $ANTLR 3.4 C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g 2012-06-24 16:01:23

package eu.reitmayer.lang.entgen;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class EntGenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Digit", "ID", "INT", "Letter", "ML", "SL_COMMENT", "STRING", "WS", "'('", "')'", "','", "';'", "'DBTYPE'", "'DOMAIN'", "'ELEMENT'", "'ENTITY'", "'JTYPE'", "'KEY'", "'LENGTH'", "'LTEXT'", "'MTEXT'", "'PRECISION'", "'STEXT'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EntGenParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EntGenParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return EntGenParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:16:1: prog : (s+= stat )+ ;
    public final EntGenParser.prog_return prog() throws RecognitionException {
        EntGenParser.prog_return retval = new EntGenParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        List list_s=null;
        RuleReturnScope s = null;

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:16:5: ( (s+= stat )+ )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:17:2: (s+= stat )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:17:3: (s+= stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 17 && LA1_0 <= 19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:17:3: s+= stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog48);
            	    s=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:20:1: stat : ( domain_stat ';' -> domain_stat | data_element_stat ';' -> data_element_stat | entity_stat ';' -> entity_stat );
    public final EntGenParser.stat_return stat() throws RecognitionException {
        EntGenParser.stat_return retval = new EntGenParser.stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        Token char_literal6=null;
        EntGenParser.domain_stat_return domain_stat1 =null;

        EntGenParser.data_element_stat_return data_element_stat3 =null;

        EntGenParser.entity_stat_return entity_stat5 =null;


        Object char_literal2_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_data_element_stat=new RewriteRuleSubtreeStream(adaptor,"rule data_element_stat");
        RewriteRuleSubtreeStream stream_entity_stat=new RewriteRuleSubtreeStream(adaptor,"rule entity_stat");
        RewriteRuleSubtreeStream stream_domain_stat=new RewriteRuleSubtreeStream(adaptor,"rule domain_stat");
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:20:5: ( domain_stat ';' -> domain_stat | data_element_stat ';' -> data_element_stat | entity_stat ';' -> entity_stat )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:21:4: domain_stat ';'
                    {
                    pushFollow(FOLLOW_domain_stat_in_stat62);
                    domain_stat1=domain_stat();

                    state._fsp--;

                    stream_domain_stat.add(domain_stat1.getTree());

                    char_literal2=(Token)match(input,15,FOLLOW_15_in_stat64);  
                    stream_15.add(char_literal2);


                    // AST REWRITE
                    // elements: domain_stat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 21:21: -> domain_stat
                    {
                        adaptor.addChild(root_0, stream_domain_stat.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:22:5: data_element_stat ';'
                    {
                    pushFollow(FOLLOW_data_element_stat_in_stat75);
                    data_element_stat3=data_element_stat();

                    state._fsp--;

                    stream_data_element_stat.add(data_element_stat3.getTree());

                    char_literal4=(Token)match(input,15,FOLLOW_15_in_stat77);  
                    stream_15.add(char_literal4);


                    // AST REWRITE
                    // elements: data_element_stat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 22:27: -> data_element_stat
                    {
                        adaptor.addChild(root_0, stream_data_element_stat.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:23:5: entity_stat ';'
                    {
                    pushFollow(FOLLOW_entity_stat_in_stat87);
                    entity_stat5=entity_stat();

                    state._fsp--;

                    stream_entity_stat.add(entity_stat5.getTree());

                    char_literal6=(Token)match(input,15,FOLLOW_15_in_stat89);  
                    stream_15.add(char_literal6);


                    // AST REWRITE
                    // elements: entity_stat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:21: -> entity_stat
                    {
                        adaptor.addChild(root_0, stream_entity_stat.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class domain_stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "domain_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:26:1: domain_stat : ( 'DOMAIN' ID -> ^( 'DOMAIN' ID ) | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID -> ^( 'DOMAIN' ID ID ID ) | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT -> ^( 'DOMAIN' ID ID ID INT ) | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT 'PRECISION' INT -> ^( 'DOMAIN' ID ID ID INT INT ) );
    public final EntGenParser.domain_stat_return domain_stat() throws RecognitionException {
        EntGenParser.domain_stat_return retval = new EntGenParser.domain_stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal7=null;
        Token ID8=null;
        Token string_literal9=null;
        Token ID10=null;
        Token string_literal11=null;
        Token ID12=null;
        Token string_literal13=null;
        Token ID14=null;
        Token string_literal15=null;
        Token ID16=null;
        Token string_literal17=null;
        Token ID18=null;
        Token string_literal19=null;
        Token ID20=null;
        Token string_literal21=null;
        Token INT22=null;
        Token string_literal23=null;
        Token ID24=null;
        Token string_literal25=null;
        Token ID26=null;
        Token string_literal27=null;
        Token ID28=null;
        Token string_literal29=null;
        Token INT30=null;
        Token string_literal31=null;
        Token INT32=null;

        Object string_literal7_tree=null;
        Object ID8_tree=null;
        Object string_literal9_tree=null;
        Object ID10_tree=null;
        Object string_literal11_tree=null;
        Object ID12_tree=null;
        Object string_literal13_tree=null;
        Object ID14_tree=null;
        Object string_literal15_tree=null;
        Object ID16_tree=null;
        Object string_literal17_tree=null;
        Object ID18_tree=null;
        Object string_literal19_tree=null;
        Object ID20_tree=null;
        Object string_literal21_tree=null;
        Object INT22_tree=null;
        Object string_literal23_tree=null;
        Object ID24_tree=null;
        Object string_literal25_tree=null;
        Object ID26_tree=null;
        Object string_literal27_tree=null;
        Object ID28_tree=null;
        Object string_literal29_tree=null;
        Object INT30_tree=null;
        Object string_literal31_tree=null;
        Object INT32_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:26:12: ( 'DOMAIN' ID -> ^( 'DOMAIN' ID ) | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID -> ^( 'DOMAIN' ID ID ID ) | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT -> ^( 'DOMAIN' ID ID ID INT ) | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT 'PRECISION' INT -> ^( 'DOMAIN' ID ID ID INT INT ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==20) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==ID) ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==16) ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6==ID) ) {
                                    int LA3_7 = input.LA(7);

                                    if ( (LA3_7==22) ) {
                                        int LA3_8 = input.LA(8);

                                        if ( (LA3_8==INT) ) {
                                            int LA3_10 = input.LA(9);

                                            if ( (LA3_10==25) ) {
                                                alt3=4;
                                            }
                                            else if ( (LA3_10==15||LA3_10==26) ) {
                                                alt3=3;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 3, 10, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 3, 8, input);

                                            throw nvae;

                                        }
                                    }
                                    else if ( (LA3_7==15||LA3_7==26) ) {
                                        alt3=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 7, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 6, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA3_2==15||LA3_2==26) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:27:5: 'DOMAIN' ID
                    {
                    string_literal7=(Token)match(input,17,FOLLOW_17_in_domain_stat107);  
                    stream_17.add(string_literal7);


                    ID8=(Token)match(input,ID,FOLLOW_ID_in_domain_stat109);  
                    stream_ID.add(ID8);


                    // AST REWRITE
                    // elements: ID, 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:17: -> ^( 'DOMAIN' ID )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:27:20: ^( 'DOMAIN' ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_17.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:28:5: 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID
                    {
                    string_literal9=(Token)match(input,17,FOLLOW_17_in_domain_stat123);  
                    stream_17.add(string_literal9);


                    ID10=(Token)match(input,ID,FOLLOW_ID_in_domain_stat125);  
                    stream_ID.add(ID10);


                    string_literal11=(Token)match(input,20,FOLLOW_20_in_domain_stat127);  
                    stream_20.add(string_literal11);


                    ID12=(Token)match(input,ID,FOLLOW_ID_in_domain_stat129);  
                    stream_ID.add(ID12);


                    string_literal13=(Token)match(input,16,FOLLOW_16_in_domain_stat131);  
                    stream_16.add(string_literal13);


                    ID14=(Token)match(input,ID,FOLLOW_ID_in_domain_stat133);  
                    stream_ID.add(ID14);


                    // AST REWRITE
                    // elements: ID, 17, ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:41: -> ^( 'DOMAIN' ID ID ID )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:28:44: ^( 'DOMAIN' ID ID ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_17.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:29:5: 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT
                    {
                    string_literal15=(Token)match(input,17,FOLLOW_17_in_domain_stat152);  
                    stream_17.add(string_literal15);


                    ID16=(Token)match(input,ID,FOLLOW_ID_in_domain_stat154);  
                    stream_ID.add(ID16);


                    string_literal17=(Token)match(input,20,FOLLOW_20_in_domain_stat156);  
                    stream_20.add(string_literal17);


                    ID18=(Token)match(input,ID,FOLLOW_ID_in_domain_stat158);  
                    stream_ID.add(ID18);


                    string_literal19=(Token)match(input,16,FOLLOW_16_in_domain_stat160);  
                    stream_16.add(string_literal19);


                    ID20=(Token)match(input,ID,FOLLOW_ID_in_domain_stat162);  
                    stream_ID.add(ID20);


                    string_literal21=(Token)match(input,22,FOLLOW_22_in_domain_stat164);  
                    stream_22.add(string_literal21);


                    INT22=(Token)match(input,INT,FOLLOW_INT_in_domain_stat166);  
                    stream_INT.add(INT22);


                    // AST REWRITE
                    // elements: INT, 17, ID, ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:53: -> ^( 'DOMAIN' ID ID ID INT )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:29:56: ^( 'DOMAIN' ID ID ID INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_17.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:30:5: 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT 'PRECISION' INT
                    {
                    string_literal23=(Token)match(input,17,FOLLOW_17_in_domain_stat186);  
                    stream_17.add(string_literal23);


                    ID24=(Token)match(input,ID,FOLLOW_ID_in_domain_stat188);  
                    stream_ID.add(ID24);


                    string_literal25=(Token)match(input,20,FOLLOW_20_in_domain_stat190);  
                    stream_20.add(string_literal25);


                    ID26=(Token)match(input,ID,FOLLOW_ID_in_domain_stat192);  
                    stream_ID.add(ID26);


                    string_literal27=(Token)match(input,16,FOLLOW_16_in_domain_stat194);  
                    stream_16.add(string_literal27);


                    ID28=(Token)match(input,ID,FOLLOW_ID_in_domain_stat196);  
                    stream_ID.add(ID28);


                    string_literal29=(Token)match(input,22,FOLLOW_22_in_domain_stat198);  
                    stream_22.add(string_literal29);


                    INT30=(Token)match(input,INT,FOLLOW_INT_in_domain_stat200);  
                    stream_INT.add(INT30);


                    string_literal31=(Token)match(input,25,FOLLOW_25_in_domain_stat202);  
                    stream_25.add(string_literal31);


                    INT32=(Token)match(input,INT,FOLLOW_INT_in_domain_stat204);  
                    stream_INT.add(INT32);


                    // AST REWRITE
                    // elements: ID, INT, ID, INT, ID, 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:69: -> ^( 'DOMAIN' ID ID ID INT INT )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:30:72: ^( 'DOMAIN' ID ID ID INT INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_17.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "domain_stat"


    public static class data_element_stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_element_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:33:1: data_element_stat : ( 'ELEMENT' ID -> ^( 'ELEMENT' ID ) | 'ELEMENT' ID d= domain_stat 'STEXT' STRING -> ^( 'ELEMENT' ID $d STRING ) | 'ELEMENT' ID d2= domain_stat 'STEXT' STRING 'MTEXT' STRING -> ^( 'ELEMENT' ID $d2 STRING STRING ) | 'ELEMENT' ID d3= domain_stat 'STEXT' STRING 'MTEXT' STRING 'LTEXT' STRING -> ^( 'ELEMENT' ID $d3 STRING STRING STRING ) );
    public final EntGenParser.data_element_stat_return data_element_stat() throws RecognitionException {
        EntGenParser.data_element_stat_return retval = new EntGenParser.data_element_stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal33=null;
        Token ID34=null;
        Token string_literal35=null;
        Token ID36=null;
        Token string_literal37=null;
        Token STRING38=null;
        Token string_literal39=null;
        Token ID40=null;
        Token string_literal41=null;
        Token STRING42=null;
        Token string_literal43=null;
        Token STRING44=null;
        Token string_literal45=null;
        Token ID46=null;
        Token string_literal47=null;
        Token STRING48=null;
        Token string_literal49=null;
        Token STRING50=null;
        Token string_literal51=null;
        Token STRING52=null;
        EntGenParser.domain_stat_return d =null;

        EntGenParser.domain_stat_return d2 =null;

        EntGenParser.domain_stat_return d3 =null;


        Object string_literal33_tree=null;
        Object ID34_tree=null;
        Object string_literal35_tree=null;
        Object ID36_tree=null;
        Object string_literal37_tree=null;
        Object STRING38_tree=null;
        Object string_literal39_tree=null;
        Object ID40_tree=null;
        Object string_literal41_tree=null;
        Object STRING42_tree=null;
        Object string_literal43_tree=null;
        Object STRING44_tree=null;
        Object string_literal45_tree=null;
        Object ID46_tree=null;
        Object string_literal47_tree=null;
        Object STRING48_tree=null;
        Object string_literal49_tree=null;
        Object STRING50_tree=null;
        Object string_literal51_tree=null;
        Object STRING52_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_domain_stat=new RewriteRuleSubtreeStream(adaptor,"rule domain_stat");
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:33:18: ( 'ELEMENT' ID -> ^( 'ELEMENT' ID ) | 'ELEMENT' ID d= domain_stat 'STEXT' STRING -> ^( 'ELEMENT' ID $d STRING ) | 'ELEMENT' ID d2= domain_stat 'STEXT' STRING 'MTEXT' STRING -> ^( 'ELEMENT' ID $d2 STRING STRING ) | 'ELEMENT' ID d3= domain_stat 'STEXT' STRING 'MTEXT' STRING 'LTEXT' STRING -> ^( 'ELEMENT' ID $d3 STRING STRING STRING ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2 >= 13 && LA4_2 <= 15)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==17) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==ID) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==20) ) {
                                int LA4_6 = input.LA(6);

                                if ( (LA4_6==ID) ) {
                                    int LA4_8 = input.LA(7);

                                    if ( (LA4_8==16) ) {
                                        int LA4_10 = input.LA(8);

                                        if ( (LA4_10==ID) ) {
                                            int LA4_13 = input.LA(9);

                                            if ( (LA4_13==22) ) {
                                                int LA4_15 = input.LA(10);

                                                if ( (LA4_15==INT) ) {
                                                    int LA4_18 = input.LA(11);

                                                    if ( (LA4_18==25) ) {
                                                        int LA4_19 = input.LA(12);

                                                        if ( (LA4_19==INT) ) {
                                                            int LA4_20 = input.LA(13);

                                                            if ( (LA4_20==26) ) {
                                                                int LA4_7 = input.LA(14);

                                                                if ( (LA4_7==STRING) ) {
                                                                    int LA4_9 = input.LA(15);

                                                                    if ( (LA4_9==24) ) {
                                                                        int LA4_11 = input.LA(16);

                                                                        if ( (LA4_11==STRING) ) {
                                                                            int LA4_14 = input.LA(17);

                                                                            if ( (LA4_14==23) ) {
                                                                                alt4=4;
                                                                            }
                                                                            else if ( ((LA4_14 >= 13 && LA4_14 <= 15)) ) {
                                                                                alt4=3;
                                                                            }
                                                                            else {
                                                                                NoViableAltException nvae =
                                                                                    new NoViableAltException("", 4, 14, input);

                                                                                throw nvae;

                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("", 4, 11, input);

                                                                            throw nvae;

                                                                        }
                                                                    }
                                                                    else if ( ((LA4_9 >= 13 && LA4_9 <= 15)) ) {
                                                                        alt4=2;
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 4, 9, input);

                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 4, 7, input);

                                                                    throw nvae;

                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 4, 20, input);

                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 4, 19, input);

                                                            throw nvae;

                                                        }
                                                    }
                                                    else if ( (LA4_18==26) ) {
                                                        int LA4_7 = input.LA(12);

                                                        if ( (LA4_7==STRING) ) {
                                                            int LA4_9 = input.LA(13);

                                                            if ( (LA4_9==24) ) {
                                                                int LA4_11 = input.LA(14);

                                                                if ( (LA4_11==STRING) ) {
                                                                    int LA4_14 = input.LA(15);

                                                                    if ( (LA4_14==23) ) {
                                                                        alt4=4;
                                                                    }
                                                                    else if ( ((LA4_14 >= 13 && LA4_14 <= 15)) ) {
                                                                        alt4=3;
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 4, 14, input);

                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 4, 11, input);

                                                                    throw nvae;

                                                                }
                                                            }
                                                            else if ( ((LA4_9 >= 13 && LA4_9 <= 15)) ) {
                                                                alt4=2;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 4, 9, input);

                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 4, 7, input);

                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 4, 18, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 4, 15, input);

                                                    throw nvae;

                                                }
                                            }
                                            else if ( (LA4_13==26) ) {
                                                int LA4_7 = input.LA(10);

                                                if ( (LA4_7==STRING) ) {
                                                    int LA4_9 = input.LA(11);

                                                    if ( (LA4_9==24) ) {
                                                        int LA4_11 = input.LA(12);

                                                        if ( (LA4_11==STRING) ) {
                                                            int LA4_14 = input.LA(13);

                                                            if ( (LA4_14==23) ) {
                                                                alt4=4;
                                                            }
                                                            else if ( ((LA4_14 >= 13 && LA4_14 <= 15)) ) {
                                                                alt4=3;
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 4, 14, input);

                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 4, 11, input);

                                                            throw nvae;

                                                        }
                                                    }
                                                    else if ( ((LA4_9 >= 13 && LA4_9 <= 15)) ) {
                                                        alt4=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 4, 9, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 4, 7, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 4, 13, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 4, 10, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 4, 8, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 6, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA4_5==26) ) {
                                int LA4_7 = input.LA(6);

                                if ( (LA4_7==STRING) ) {
                                    int LA4_9 = input.LA(7);

                                    if ( (LA4_9==24) ) {
                                        int LA4_11 = input.LA(8);

                                        if ( (LA4_11==STRING) ) {
                                            int LA4_14 = input.LA(9);

                                            if ( (LA4_14==23) ) {
                                                alt4=4;
                                            }
                                            else if ( ((LA4_14 >= 13 && LA4_14 <= 15)) ) {
                                                alt4=3;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 4, 14, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 4, 11, input);

                                            throw nvae;

                                        }
                                    }
                                    else if ( ((LA4_9 >= 13 && LA4_9 <= 15)) ) {
                                        alt4=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 4, 9, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 7, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:34:5: 'ELEMENT' ID
                    {
                    string_literal33=(Token)match(input,18,FOLLOW_18_in_data_element_stat234);  
                    stream_18.add(string_literal33);


                    ID34=(Token)match(input,ID,FOLLOW_ID_in_data_element_stat236);  
                    stream_ID.add(ID34);


                    // AST REWRITE
                    // elements: ID, 18
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 34:18: -> ^( 'ELEMENT' ID )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:34:21: ^( 'ELEMENT' ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_18.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:35:6: 'ELEMENT' ID d= domain_stat 'STEXT' STRING
                    {
                    string_literal35=(Token)match(input,18,FOLLOW_18_in_data_element_stat251);  
                    stream_18.add(string_literal35);


                    ID36=(Token)match(input,ID,FOLLOW_ID_in_data_element_stat253);  
                    stream_ID.add(ID36);


                    pushFollow(FOLLOW_domain_stat_in_data_element_stat257);
                    d=domain_stat();

                    state._fsp--;

                    stream_domain_stat.add(d.getTree());

                    string_literal37=(Token)match(input,26,FOLLOW_26_in_data_element_stat259);  
                    stream_26.add(string_literal37);


                    STRING38=(Token)match(input,STRING,FOLLOW_STRING_in_data_element_stat261);  
                    stream_STRING.add(STRING38);


                    // AST REWRITE
                    // elements: STRING, d, ID, 18
                    // token labels: 
                    // rule labels: retval, d
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 35:48: -> ^( 'ELEMENT' ID $d STRING )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:35:51: ^( 'ELEMENT' ID $d STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_18.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_d.nextTree());

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:36:6: 'ELEMENT' ID d2= domain_stat 'STEXT' STRING 'MTEXT' STRING
                    {
                    string_literal39=(Token)match(input,18,FOLLOW_18_in_data_element_stat281);  
                    stream_18.add(string_literal39);


                    ID40=(Token)match(input,ID,FOLLOW_ID_in_data_element_stat283);  
                    stream_ID.add(ID40);


                    pushFollow(FOLLOW_domain_stat_in_data_element_stat287);
                    d2=domain_stat();

                    state._fsp--;

                    stream_domain_stat.add(d2.getTree());

                    string_literal41=(Token)match(input,26,FOLLOW_26_in_data_element_stat289);  
                    stream_26.add(string_literal41);


                    STRING42=(Token)match(input,STRING,FOLLOW_STRING_in_data_element_stat291);  
                    stream_STRING.add(STRING42);


                    string_literal43=(Token)match(input,24,FOLLOW_24_in_data_element_stat293);  
                    stream_24.add(string_literal43);


                    STRING44=(Token)match(input,STRING,FOLLOW_STRING_in_data_element_stat295);  
                    stream_STRING.add(STRING44);


                    // AST REWRITE
                    // elements: STRING, d2, ID, STRING, 18
                    // token labels: 
                    // rule labels: retval, d2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_d2=new RewriteRuleSubtreeStream(adaptor,"rule d2",d2!=null?d2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 36:64: -> ^( 'ELEMENT' ID $d2 STRING STRING )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:36:67: ^( 'ELEMENT' ID $d2 STRING STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_18.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_d2.nextTree());

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:37:6: 'ELEMENT' ID d3= domain_stat 'STEXT' STRING 'MTEXT' STRING 'LTEXT' STRING
                    {
                    string_literal45=(Token)match(input,18,FOLLOW_18_in_data_element_stat317);  
                    stream_18.add(string_literal45);


                    ID46=(Token)match(input,ID,FOLLOW_ID_in_data_element_stat319);  
                    stream_ID.add(ID46);


                    pushFollow(FOLLOW_domain_stat_in_data_element_stat323);
                    d3=domain_stat();

                    state._fsp--;

                    stream_domain_stat.add(d3.getTree());

                    string_literal47=(Token)match(input,26,FOLLOW_26_in_data_element_stat325);  
                    stream_26.add(string_literal47);


                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_data_element_stat327);  
                    stream_STRING.add(STRING48);


                    string_literal49=(Token)match(input,24,FOLLOW_24_in_data_element_stat329);  
                    stream_24.add(string_literal49);


                    STRING50=(Token)match(input,STRING,FOLLOW_STRING_in_data_element_stat331);  
                    stream_STRING.add(STRING50);


                    string_literal51=(Token)match(input,23,FOLLOW_23_in_data_element_stat333);  
                    stream_23.add(string_literal51);


                    STRING52=(Token)match(input,STRING,FOLLOW_STRING_in_data_element_stat335);  
                    stream_STRING.add(STRING52);


                    // AST REWRITE
                    // elements: ID, STRING, d3, STRING, STRING, 18
                    // token labels: 
                    // rule labels: retval, d3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_d3=new RewriteRuleSubtreeStream(adaptor,"rule d3",d3!=null?d3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 37:79: -> ^( 'ELEMENT' ID $d3 STRING STRING STRING )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:37:82: ^( 'ELEMENT' ID $d3 STRING STRING STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_18.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_d3.nextTree());

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_element_stat"


    public static class entity_element_stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity_element_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:40:1: entity_element_stat : ( data_element_stat -> data_element_stat | 'KEY' data_element_stat -> ^( 'KEY' data_element_stat ) );
    public final EntGenParser.entity_element_stat_return entity_element_stat() throws RecognitionException {
        EntGenParser.entity_element_stat_return retval = new EntGenParser.entity_element_stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal54=null;
        EntGenParser.data_element_stat_return data_element_stat53 =null;

        EntGenParser.data_element_stat_return data_element_stat55 =null;


        Object string_literal54_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_data_element_stat=new RewriteRuleSubtreeStream(adaptor,"rule data_element_stat");
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:40:20: ( data_element_stat -> data_element_stat | 'KEY' data_element_stat -> ^( 'KEY' data_element_stat ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:41:2: data_element_stat
                    {
                    pushFollow(FOLLOW_data_element_stat_in_entity_element_stat362);
                    data_element_stat53=data_element_stat();

                    state._fsp--;

                    stream_data_element_stat.add(data_element_stat53.getTree());

                    // AST REWRITE
                    // elements: data_element_stat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:20: -> data_element_stat
                    {
                        adaptor.addChild(root_0, stream_data_element_stat.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:42:4: 'KEY' data_element_stat
                    {
                    string_literal54=(Token)match(input,21,FOLLOW_21_in_entity_element_stat371);  
                    stream_21.add(string_literal54);


                    pushFollow(FOLLOW_data_element_stat_in_entity_element_stat373);
                    data_element_stat55=data_element_stat();

                    state._fsp--;

                    stream_data_element_stat.add(data_element_stat55.getTree());

                    // AST REWRITE
                    // elements: data_element_stat, 21
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 42:28: -> ^( 'KEY' data_element_stat )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:42:31: ^( 'KEY' data_element_stat )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_21.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_data_element_stat.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_element_stat"


    public static class entity_stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:45:1: entity_stat : ( 'ENTITY' ID -> ^( 'ENTITY' ID ) | 'ENTITY' ID '(' de+= entity_element_stat ( ',' de+= entity_element_stat )* ')' -> ^( 'ENTITY' ID ( $de)+ ) );
    public final EntGenParser.entity_stat_return entity_stat() throws RecognitionException {
        EntGenParser.entity_stat_return retval = new EntGenParser.entity_stat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal56=null;
        Token ID57=null;
        Token string_literal58=null;
        Token ID59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal62=null;
        List list_de=null;
        RuleReturnScope de = null;
        Object string_literal56_tree=null;
        Object ID57_tree=null;
        Object string_literal58_tree=null;
        Object ID59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal62_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_entity_element_stat=new RewriteRuleSubtreeStream(adaptor,"rule entity_element_stat");
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:45:12: ( 'ENTITY' ID -> ^( 'ENTITY' ID ) | 'ENTITY' ID '(' de+= entity_element_stat ( ',' de+= entity_element_stat )* ')' -> ^( 'ENTITY' ID ( $de)+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==12) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==15) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:46:2: 'ENTITY' ID
                    {
                    string_literal56=(Token)match(input,19,FOLLOW_19_in_entity_stat392);  
                    stream_19.add(string_literal56);


                    ID57=(Token)match(input,ID,FOLLOW_ID_in_entity_stat394);  
                    stream_ID.add(ID57);


                    // AST REWRITE
                    // elements: ID, 19
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:14: -> ^( 'ENTITY' ID )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:46:17: ^( 'ENTITY' ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_19.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:47:3: 'ENTITY' ID '(' de+= entity_element_stat ( ',' de+= entity_element_stat )* ')'
                    {
                    string_literal58=(Token)match(input,19,FOLLOW_19_in_entity_stat406);  
                    stream_19.add(string_literal58);


                    ID59=(Token)match(input,ID,FOLLOW_ID_in_entity_stat408);  
                    stream_ID.add(ID59);


                    char_literal60=(Token)match(input,12,FOLLOW_12_in_entity_stat410);  
                    stream_12.add(char_literal60);


                    pushFollow(FOLLOW_entity_element_stat_in_entity_stat416);
                    de=entity_element_stat();

                    state._fsp--;

                    stream_entity_element_stat.add(de.getTree());
                    if (list_de==null) list_de=new ArrayList();
                    list_de.add(de.getTree());


                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:48:27: ( ',' de+= entity_element_stat )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:48:28: ',' de+= entity_element_stat
                    	    {
                    	    char_literal61=(Token)match(input,14,FOLLOW_14_in_entity_stat419);  
                    	    stream_14.add(char_literal61);


                    	    pushFollow(FOLLOW_entity_element_stat_in_entity_stat423);
                    	    de=entity_element_stat();

                    	    state._fsp--;

                    	    stream_entity_element_stat.add(de.getTree());
                    	    if (list_de==null) list_de=new ArrayList();
                    	    list_de.add(de.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    char_literal62=(Token)match(input,13,FOLLOW_13_in_entity_stat427);  
                    stream_13.add(char_literal62);


                    // AST REWRITE
                    // elements: 19, de, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: de
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_de=new RewriteRuleSubtreeStream(adaptor,"token de",list_de);
                    root_0 = (Object)adaptor.nil();
                    // 48:62: -> ^( 'ENTITY' ID ( $de)+ )
                    {
                        // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\EntGen.g:48:65: ^( 'ENTITY' ID ( $de)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_19.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        if ( !(stream_de.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_de.hasNext() ) {
                            adaptor.addChild(root_1, stream_de.nextTree());

                        }
                        stream_de.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_stat"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog48 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_domain_stat_in_stat62 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_stat64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_element_stat_in_stat75 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_stat77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entity_stat_in_stat87 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_stat89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_domain_stat107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_domain_stat123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat125 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_domain_stat127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat129 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_domain_stat131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_domain_stat152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat154 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_domain_stat156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat158 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_domain_stat160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat162 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_domain_stat164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_domain_stat186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat188 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_domain_stat190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_domain_stat194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat196 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_domain_stat198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat200 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_domain_stat202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_data_element_stat234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_data_element_stat236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_data_element_stat251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_data_element_stat253 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat257 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_data_element_stat259 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_data_element_stat281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_data_element_stat283 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat287 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_data_element_stat289 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat291 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_data_element_stat293 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_data_element_stat317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_data_element_stat319 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat323 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_data_element_stat325 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_data_element_stat329 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat331 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_data_element_stat333 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_element_stat_in_entity_element_stat362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_entity_element_stat371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_data_element_stat_in_entity_element_stat373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_entity_stat392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_entity_stat394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_entity_stat406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_entity_stat408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_entity_stat410 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_entity_element_stat_in_entity_stat416 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_entity_stat419 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_entity_element_stat_in_entity_stat423 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_entity_stat427 = new BitSet(new long[]{0x0000000000000002L});

}