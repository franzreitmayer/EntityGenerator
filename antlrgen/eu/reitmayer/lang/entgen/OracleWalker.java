// $ANTLR 3.4 C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g 2012-06-24 16:01:24

package eu.reitmayer.lang.entgen;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class OracleWalker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public OracleWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return OracleWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g"; }


    	public GlobalContext context = new GlobalContext();


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:19:1: prog : ( stat )+ ;
    public final OracleWalker.prog_return prog() throws RecognitionException {
        OracleWalker.prog_return retval = new OracleWalker.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.stat_return stat1 =null;



        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:19:5: ( ( stat )+ )
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:20:2: ( stat )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:20:2: ( stat )+
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
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:20:2: stat
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_stat_in_prog63);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());


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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:23:1: stat : (dom= domain_stat |dae= data_element_stat |ent= entity_stat );
    public final OracleWalker.stat_return stat() throws RecognitionException {
        OracleWalker.stat_return retval = new OracleWalker.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.domain_stat_return dom =null;

        OracleWalker.data_element_stat_return dae =null;

        OracleWalker.entity_stat_return ent =null;



        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:23:5: (dom= domain_stat |dae= data_element_stat |ent= entity_stat )
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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:24:4: dom= domain_stat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_domain_stat_in_stat79);
                    dom=domain_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, dom.getTree());


                    System.out.println((dom!=null?dom.return_domain:null).toString());

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:25:4: dae= data_element_stat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_data_element_stat_in_stat88);
                    dae=data_element_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, dae.getTree());


                    System.out.println((dae!=null?dae.return_data_element:null).toString());

                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:26:4: ent= entity_stat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_entity_stat_in_stat97);
                    ent=entity_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, ent.getTree());


                    System.out.println((ent!=null?ent.return_entity:null).toString());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class domain_stat_return extends TreeRuleReturnScope {
        public Domain return_domain;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "domain_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:30:1: domain_stat returns [Domain return_domain] : ( ^( 'DOMAIN' ID ) | ^( 'DOMAIN' i1= ID i2= ID i3= ID ) | ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT ) | ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT p= INT ) );
    public final OracleWalker.domain_stat_return domain_stat() throws RecognitionException {
        OracleWalker.domain_stat_return retval = new OracleWalker.domain_stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree i3=null;
        CommonTree l=null;
        CommonTree p=null;
        CommonTree string_literal2=null;
        CommonTree ID3=null;
        CommonTree string_literal4=null;
        CommonTree string_literal5=null;
        CommonTree string_literal6=null;

        CommonTree i1_tree=null;
        CommonTree i2_tree=null;
        CommonTree i3_tree=null;
        CommonTree l_tree=null;
        CommonTree p_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree ID3_tree=null;
        CommonTree string_literal4_tree=null;
        CommonTree string_literal5_tree=null;
        CommonTree string_literal6_tree=null;

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:30:43: ( ^( 'DOMAIN' ID ) | ^( 'DOMAIN' i1= ID i2= ID i3= ID ) | ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT ) | ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT p= INT ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==ID) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==UP) ) {
                            alt3=1;
                        }
                        else if ( (LA3_3==ID) ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==ID) ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6==UP) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_6==INT) ) {
                                    int LA3_8 = input.LA(7);

                                    if ( (LA3_8==UP) ) {
                                        alt3=3;
                                    }
                                    else if ( (LA3_8==INT) ) {
                                        alt3=4;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 8, input);

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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:31:4: ^( 'DOMAIN' ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal2=(CommonTree)match(input,17,FOLLOW_17_in_domain_stat119); 
                    string_literal2_tree = (CommonTree)adaptor.dupNode(string_literal2);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal2_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat121); 
                    ID3_tree = (CommonTree)adaptor.dupNode(ID3);


                    adaptor.addChild(root_1, ID3_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                     Domain d = context.domains.get((ID3!=null?ID3.getText():null));
                    	  if (d == null) {throw new RuntimeException("Domain " + (ID3!=null?ID3.getText():null) + " is undefined");}
                    	  retval.return_domain = d;
                    	  

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:35:4: ^( 'DOMAIN' i1= ID i2= ID i3= ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal4=(CommonTree)match(input,17,FOLLOW_17_in_domain_stat130); 
                    string_literal4_tree = (CommonTree)adaptor.dupNode(string_literal4);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal4_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat134); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    _last = (CommonTree)input.LT(1);
                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat138); 
                    i2_tree = (CommonTree)adaptor.dupNode(i2);


                    adaptor.addChild(root_1, i2_tree);


                    _last = (CommonTree)input.LT(1);
                    i3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat142); 
                    i3_tree = (CommonTree)adaptor.dupNode(i3);


                    adaptor.addChild(root_1, i3_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Domain d = new Domain((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), (i3!=null?i3.getText():null), -1, -1);
                    		context.domains.put((i1!=null?i1.getText():null), d);
                    		retval.return_domain = d;
                    		

                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:39:4: ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal5=(CommonTree)match(input,17,FOLLOW_17_in_domain_stat151); 
                    string_literal5_tree = (CommonTree)adaptor.dupNode(string_literal5);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat155); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    _last = (CommonTree)input.LT(1);
                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat159); 
                    i2_tree = (CommonTree)adaptor.dupNode(i2);


                    adaptor.addChild(root_1, i2_tree);


                    _last = (CommonTree)input.LT(1);
                    i3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat163); 
                    i3_tree = (CommonTree)adaptor.dupNode(i3);


                    adaptor.addChild(root_1, i3_tree);


                    _last = (CommonTree)input.LT(1);
                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_domain_stat167); 
                    l_tree = (CommonTree)adaptor.dupNode(l);


                    adaptor.addChild(root_1, l_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Domain d = new Domain((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), (i3!=null?i3.getText():null), Integer.parseInt((l!=null?l.getText():null)), -1);
                    		context.domains.put((i1!=null?i1.getText():null), d);
                    		retval.return_domain = d;
                    		

                    }
                    break;
                case 4 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:43:4: ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT p= INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal6=(CommonTree)match(input,17,FOLLOW_17_in_domain_stat176); 
                    string_literal6_tree = (CommonTree)adaptor.dupNode(string_literal6);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal6_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat180); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    _last = (CommonTree)input.LT(1);
                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat184); 
                    i2_tree = (CommonTree)adaptor.dupNode(i2);


                    adaptor.addChild(root_1, i2_tree);


                    _last = (CommonTree)input.LT(1);
                    i3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat188); 
                    i3_tree = (CommonTree)adaptor.dupNode(i3);


                    adaptor.addChild(root_1, i3_tree);


                    _last = (CommonTree)input.LT(1);
                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_domain_stat192); 
                    l_tree = (CommonTree)adaptor.dupNode(l);


                    adaptor.addChild(root_1, l_tree);


                    _last = (CommonTree)input.LT(1);
                    p=(CommonTree)match(input,INT,FOLLOW_INT_in_domain_stat196); 
                    p_tree = (CommonTree)adaptor.dupNode(p);


                    adaptor.addChild(root_1, p_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Domain d = new Domain((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), (i3!=null?i3.getText():null), Integer.parseInt((l!=null?l.getText():null)), Integer.parseInt((p!=null?p.getText():null)));
                    		context.domains.put((i1!=null?i1.getText():null), d);
                    		retval.return_domain = d;
                    		

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "domain_stat"


    public static class data_element_stat_return extends TreeRuleReturnScope {
        public DataElement return_data_element;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_element_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:49:1: data_element_stat returns [DataElement return_data_element] : ( ^( 'ELEMENT' i1= ID ) | ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING ) | ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ) | ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ltext= STRING ) );
    public final OracleWalker.data_element_stat_return data_element_stat() throws RecognitionException {
        OracleWalker.data_element_stat_return retval = new OracleWalker.data_element_stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i1=null;
        CommonTree stext=null;
        CommonTree mtext=null;
        CommonTree ltext=null;
        CommonTree string_literal7=null;
        CommonTree string_literal8=null;
        CommonTree string_literal9=null;
        CommonTree string_literal10=null;
        OracleWalker.domain_stat_return dom =null;


        CommonTree i1_tree=null;
        CommonTree stext_tree=null;
        CommonTree mtext_tree=null;
        CommonTree ltext_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        CommonTree string_literal10_tree=null;

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:49:60: ( ^( 'ELEMENT' i1= ID ) | ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING ) | ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ) | ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ltext= STRING ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==DOWN) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==ID) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==UP) ) {
                            alt4=1;
                        }
                        else if ( (LA4_3==17) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==DOWN) ) {
                                int LA4_6 = input.LA(6);

                                if ( (LA4_6==ID) ) {
                                    int LA4_7 = input.LA(7);

                                    if ( (LA4_7==UP) ) {
                                        int LA4_8 = input.LA(8);

                                        if ( (LA4_8==STRING) ) {
                                            int LA4_10 = input.LA(9);

                                            if ( (LA4_10==UP) ) {
                                                alt4=2;
                                            }
                                            else if ( (LA4_10==STRING) ) {
                                                int LA4_13 = input.LA(10);

                                                if ( (LA4_13==UP) ) {
                                                    alt4=3;
                                                }
                                                else if ( (LA4_13==STRING) ) {
                                                    alt4=4;
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
                                    else if ( (LA4_7==ID) ) {
                                        int LA4_9 = input.LA(8);

                                        if ( (LA4_9==ID) ) {
                                            int LA4_11 = input.LA(9);

                                            if ( (LA4_11==UP) ) {
                                                int LA4_14 = input.LA(10);

                                                if ( (LA4_14==STRING) ) {
                                                    int LA4_10 = input.LA(11);

                                                    if ( (LA4_10==UP) ) {
                                                        alt4=2;
                                                    }
                                                    else if ( (LA4_10==STRING) ) {
                                                        int LA4_13 = input.LA(12);

                                                        if ( (LA4_13==UP) ) {
                                                            alt4=3;
                                                        }
                                                        else if ( (LA4_13==STRING) ) {
                                                            alt4=4;
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
                                                        new NoViableAltException("", 4, 14, input);

                                                    throw nvae;

                                                }
                                            }
                                            else if ( (LA4_11==INT) ) {
                                                int LA4_15 = input.LA(10);

                                                if ( (LA4_15==UP) ) {
                                                    int LA4_18 = input.LA(11);

                                                    if ( (LA4_18==STRING) ) {
                                                        int LA4_10 = input.LA(12);

                                                        if ( (LA4_10==UP) ) {
                                                            alt4=2;
                                                        }
                                                        else if ( (LA4_10==STRING) ) {
                                                            int LA4_13 = input.LA(13);

                                                            if ( (LA4_13==UP) ) {
                                                                alt4=3;
                                                            }
                                                            else if ( (LA4_13==STRING) ) {
                                                                alt4=4;
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
                                                            new NoViableAltException("", 4, 18, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else if ( (LA4_15==INT) ) {
                                                    int LA4_19 = input.LA(11);

                                                    if ( (LA4_19==UP) ) {
                                                        int LA4_20 = input.LA(12);

                                                        if ( (LA4_20==STRING) ) {
                                                            int LA4_10 = input.LA(13);

                                                            if ( (LA4_10==UP) ) {
                                                                alt4=2;
                                                            }
                                                            else if ( (LA4_10==STRING) ) {
                                                                int LA4_13 = input.LA(14);

                                                                if ( (LA4_13==UP) ) {
                                                                    alt4=3;
                                                                }
                                                                else if ( (LA4_13==STRING) ) {
                                                                    alt4=4;
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
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 4, 15, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 4, 11, input);

                                                throw nvae;

                                            }
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
                                        new NoViableAltException("", 4, 6, input);

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
                                new NoViableAltException("", 4, 3, input);

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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:50:5: ^( 'ELEMENT' i1= ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal7=(CommonTree)match(input,18,FOLLOW_18_in_data_element_stat218); 
                    string_literal7_tree = (CommonTree)adaptor.dupNode(string_literal7);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal7_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat222); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    DataElement de = context.dataElements.get((i1!=null?i1.getText():null));
                    	   if (de == null) {throw new RuntimeException("The data element " + (i1!=null?i1.getText():null) + " is undefined");}
                    	   retval.return_data_element = de;
                    	   

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:54:6: ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal8=(CommonTree)match(input,18,FOLLOW_18_in_data_element_stat233); 
                    string_literal8_tree = (CommonTree)adaptor.dupNode(string_literal8);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat237); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_domain_stat_in_data_element_stat241);
                    dom=domain_stat();

                    state._fsp--;

                    adaptor.addChild(root_1, dom.getTree());


                    _last = (CommonTree)input.LT(1);
                    stext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat245); 
                    stext_tree = (CommonTree)adaptor.dupNode(stext);


                    adaptor.addChild(root_1, stext_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  	DataElement de = new DataElement((i1!=null?i1.getText():null), (stext!=null?stext.getText():null), "", "", (dom!=null?dom.return_domain:null));
                    	  	context.dataElements.put((i1!=null?i1.getText():null), de);
                    	  	retval.return_data_element = de;
                    	  

                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:59:6: ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal9=(CommonTree)match(input,18,FOLLOW_18_in_data_element_stat256); 
                    string_literal9_tree = (CommonTree)adaptor.dupNode(string_literal9);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat260); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_domain_stat_in_data_element_stat264);
                    dom=domain_stat();

                    state._fsp--;

                    adaptor.addChild(root_1, dom.getTree());


                    _last = (CommonTree)input.LT(1);
                    stext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat268); 
                    stext_tree = (CommonTree)adaptor.dupNode(stext);


                    adaptor.addChild(root_1, stext_tree);


                    _last = (CommonTree)input.LT(1);
                    mtext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat272); 
                    mtext_tree = (CommonTree)adaptor.dupNode(mtext);


                    adaptor.addChild(root_1, mtext_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  	DataElement de = new DataElement((i1!=null?i1.getText():null), (stext!=null?stext.getText():null), (mtext!=null?mtext.getText():null), "", (dom!=null?dom.return_domain:null));
                    	  	context.dataElements.put((i1!=null?i1.getText():null), de);
                    	  	retval.return_data_element = de;
                    	  

                    }
                    break;
                case 4 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:64:6: ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ltext= STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal10=(CommonTree)match(input,18,FOLLOW_18_in_data_element_stat282); 
                    string_literal10_tree = (CommonTree)adaptor.dupNode(string_literal10);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal10_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat286); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_domain_stat_in_data_element_stat290);
                    dom=domain_stat();

                    state._fsp--;

                    adaptor.addChild(root_1, dom.getTree());


                    _last = (CommonTree)input.LT(1);
                    stext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat294); 
                    stext_tree = (CommonTree)adaptor.dupNode(stext);


                    adaptor.addChild(root_1, stext_tree);


                    _last = (CommonTree)input.LT(1);
                    mtext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat298); 
                    mtext_tree = (CommonTree)adaptor.dupNode(mtext);


                    adaptor.addChild(root_1, mtext_tree);


                    _last = (CommonTree)input.LT(1);
                    ltext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat302); 
                    ltext_tree = (CommonTree)adaptor.dupNode(ltext);


                    adaptor.addChild(root_1, ltext_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  	DataElement de = new DataElement((i1!=null?i1.getText():null), (stext!=null?stext.getText():null), (mtext!=null?mtext.getText():null), (ltext!=null?ltext.getText():null), (dom!=null?dom.return_domain:null));
                    	  	context.dataElements.put((i1!=null?i1.getText():null), de);
                    	  	retval.return_data_element = de;
                    	  

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_element_stat"


    public static class entity_element_stat_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity_element_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:71:1: entity_element_stat : ( data_element_stat | ^( 'KEY' data_element_stat ) );
    public final OracleWalker.entity_element_stat_return entity_element_stat() throws RecognitionException {
        OracleWalker.entity_element_stat_return retval = new OracleWalker.entity_element_stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal12=null;
        OracleWalker.data_element_stat_return data_element_stat11 =null;

        OracleWalker.data_element_stat_return data_element_stat13 =null;


        CommonTree string_literal12_tree=null;

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:71:20: ( data_element_stat | ^( 'KEY' data_element_stat ) )
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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:72:2: data_element_stat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_data_element_stat_in_entity_element_stat315);
                    data_element_stat11=data_element_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, data_element_stat11.getTree());


                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:73:4: ^( 'KEY' data_element_stat )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal12=(CommonTree)match(input,21,FOLLOW_21_in_entity_element_stat321); 
                    string_literal12_tree = (CommonTree)adaptor.dupNode(string_literal12);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal12_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_data_element_stat_in_entity_element_stat323);
                    data_element_stat13=data_element_stat();

                    state._fsp--;

                    adaptor.addChild(root_1, data_element_stat13.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_element_stat"


    public static class entity_stat_return extends TreeRuleReturnScope {
        public Entity return_entity;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:76:1: entity_stat returns [Entity return_entity] : ( ^( 'ENTITY' i1= ID ) | ^( 'ENTITY' i1= ID (dae+= data_element_stat )+ ) );
    public final OracleWalker.entity_stat_return entity_stat() throws RecognitionException {
        OracleWalker.entity_stat_return retval = new OracleWalker.entity_stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i1=null;
        CommonTree string_literal14=null;
        CommonTree string_literal15=null;
        List list_dae=null;
        RuleReturnScope dae = null;
        CommonTree i1_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree string_literal15_tree=null;

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:76:42: ( ^( 'ENTITY' i1= ID ) | ^( 'ENTITY' i1= ID (dae+= data_element_stat )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==ID) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==UP) ) {
                            alt7=1;
                        }
                        else if ( (LA7_3==18) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;

                        }
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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:77:2: ^( 'ENTITY' i1= ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal14=(CommonTree)match(input,19,FOLLOW_19_in_entity_stat338); 
                    string_literal14_tree = (CommonTree)adaptor.dupNode(string_literal14);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal14_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_stat342); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Entity e = context.entities.get((i1!=null?i1.getText():null));
                    	if (e==null) {throw new RuntimeException("The entity" + (i1!=null?i1.getText():null) + " is not defined");}
                    	retval.return_entity = e;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:81:4: ^( 'ENTITY' i1= ID (dae+= data_element_stat )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal15=(CommonTree)match(input,19,FOLLOW_19_in_entity_stat351); 
                    string_literal15_tree = (CommonTree)adaptor.dupNode(string_literal15);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_stat355); 
                    i1_tree = (CommonTree)adaptor.dupNode(i1);


                    adaptor.addChild(root_1, i1_tree);


                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:81:24: (dae+= data_element_stat )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleWalker.g:81:24: dae+= data_element_stat
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_data_element_stat_in_entity_stat359);
                    	    dae=data_element_stat();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, dae.getTree());

                    	    if (list_dae==null) list_dae=new ArrayList();
                    	    list_dae.add(dae.getTree());


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


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Entity e = new Entity((i1!=null?i1.getText():null), list_dae, context);
                    	context.entities.put((i1!=null?i1.getText():null), e);
                    	retval.return_entity = e;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_stat"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog63 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_domain_stat_in_stat79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_element_stat_in_stat88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entity_stat_in_stat97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_domain_stat119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_domain_stat130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_domain_stat151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_domain_stat176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat188 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat241 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat260 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat264 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat268 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat286 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat290 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat294 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat298 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_data_element_stat_in_entity_element_stat315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_entity_element_stat321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_data_element_stat_in_entity_element_stat323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_entity_stat338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_stat342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_entity_stat351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_stat355 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_data_element_stat_in_entity_stat359 = new BitSet(new long[]{0x0000000000040008L});

}