// $ANTLR 3.4 C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g 2012-06-24 15:59:17

package eu.reitmayer.lang.entgen;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class OracleEmmiter extends TreeParser {
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


    public OracleEmmiter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleEmmiter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("OracleEmmiterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return OracleEmmiter.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g"; }


    public GlobalContext context = new GlobalContext();


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:21:1: prog : (st+= stat )+ -> delegate_strings(sl=$st);
    public final OracleEmmiter.prog_return prog() throws RecognitionException {
        OracleEmmiter.prog_return retval = new OracleEmmiter.prog_return();
        retval.start = input.LT(1);


        List list_st=null;
        RuleReturnScope st = null;
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:21:5: ( (st+= stat )+ -> delegate_strings(sl=$st))
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:22:2: (st+= stat )+
            {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:22:4: (st+= stat )+
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
            	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:22:4: st+= stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog68);
            	    st=stat();

            	    state._fsp--;

            	    if (list_st==null) list_st=new ArrayList();
            	    list_st.add(st.getTemplate());


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


            // TEMPLATE REWRITE
            // 22:12: -> delegate_strings(sl=$st)
            {
                retval.st = templateLib.getInstanceOf("delegate_strings",new STAttrMap().put("sl", list_st));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:25:1: stat : ( domain_stat | data_element_stat | entity_stat -> delegate_string(s=$entity_stat.st));
    public final OracleEmmiter.stat_return stat() throws RecognitionException {
        OracleEmmiter.stat_return retval = new OracleEmmiter.stat_return();
        retval.start = input.LT(1);


        OracleEmmiter.entity_stat_return entity_stat1 =null;


        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:25:5: ( domain_stat | data_element_stat | entity_stat -> delegate_string(s=$entity_stat.st))
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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:26:4: domain_stat
                    {
                    pushFollow(FOLLOW_domain_stat_in_stat91);
                    domain_stat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:27:4: data_element_stat
                    {
                    pushFollow(FOLLOW_data_element_stat_in_stat97);
                    data_element_stat();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:28:4: entity_stat
                    {
                    pushFollow(FOLLOW_entity_stat_in_stat103);
                    entity_stat1=entity_stat();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 28:16: -> delegate_string(s=$entity_stat.st)
                    {
                        retval.st = templateLib.getInstanceOf("delegate_string",new STAttrMap().put("s", (entity_stat1!=null?entity_stat1.st:null)));
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class domain_stat_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "domain_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:31:1: domain_stat : ( ^( 'DOMAIN' ID ) -> type_def(t=context.domains.get($ID.text).getSQLText())| ^( 'DOMAIN' i1= ID i2= ID i3= ID ) -> type_def(t=$i3.text)| ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT ) -> type_def_length(t=$i3.textl=$l)| ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT p= INT ) -> type_def_length_precision(t=$i3.textl=$lp=$p));
    public final OracleEmmiter.domain_stat_return domain_stat() throws RecognitionException {
        OracleEmmiter.domain_stat_return retval = new OracleEmmiter.domain_stat_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree i3=null;
        CommonTree l=null;
        CommonTree p=null;
        CommonTree ID2=null;

        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:31:12: ( ^( 'DOMAIN' ID ) -> type_def(t=context.domains.get($ID.text).getSQLText())| ^( 'DOMAIN' i1= ID i2= ID i3= ID ) -> type_def(t=$i3.text)| ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT ) -> type_def_length(t=$i3.textl=$l)| ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT p= INT ) -> type_def_length_precision(t=$i3.textl=$lp=$p))
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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:32:4: ^( 'DOMAIN' ID )
                    {
                    match(input,17,FOLLOW_17_in_domain_stat126); 

                    match(input, Token.DOWN, null); 
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat128); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 32:19: -> type_def(t=context.domains.get($ID.text).getSQLText())
                    {
                        retval.st = templateLib.getInstanceOf("type_def",new STAttrMap().put("t", context.domains.get((ID2!=null?ID2.getText():null)).getSQLText()));
                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:33:4: ^( 'DOMAIN' i1= ID i2= ID i3= ID )
                    {
                    match(input,17,FOLLOW_17_in_domain_stat144); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat148); 

                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat152); 

                    i3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat156); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 33:34: -> type_def(t=$i3.text)
                    {
                        retval.st = templateLib.getInstanceOf("type_def",new STAttrMap().put("t", (i3!=null?i3.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:34:4: ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT )
                    {
                    match(input,17,FOLLOW_17_in_domain_stat172); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat176); 

                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat180); 

                    i3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat184); 

                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_domain_stat188); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 34:40: -> type_def_length(t=$i3.textl=$l)
                    {
                        retval.st = templateLib.getInstanceOf("type_def_length",new STAttrMap().put("t", (i3!=null?i3.getText():null)).put("l", l));
                    }



                    }
                    break;
                case 4 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:35:4: ^( 'DOMAIN' i1= ID i2= ID i3= ID l= INT p= INT )
                    {
                    match(input,17,FOLLOW_17_in_domain_stat209); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat213); 

                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat217); 

                    i3=(CommonTree)match(input,ID,FOLLOW_ID_in_domain_stat221); 

                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_domain_stat225); 

                    p=(CommonTree)match(input,INT,FOLLOW_INT_in_domain_stat229); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 35:46: -> type_def_length_precision(t=$i3.textl=$lp=$p)
                    {
                        retval.st = templateLib.getInstanceOf("type_def_length_precision",new STAttrMap().put("t", (i3!=null?i3.getText():null)).put("l", l).put("p", p));
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "domain_stat"


    public static class data_element_stat_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "data_element_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:38:1: data_element_stat : ( ^( 'ELEMENT' i1= ID ) -> delegate_string(s=$i1.text + \" \" + context.dataElements.get($ID.text).getDomain().getSQLText())| ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING ) -> delegate_string(s=$i1.text + \" \" + $dom.st)| ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ) -> delegate_string(s=$i1.text + \" \" + $dom.st)| ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ltext= STRING ) -> delegate_string(s=$i1.text + \" \" + $dom.st));
    public final OracleEmmiter.data_element_stat_return data_element_stat() throws RecognitionException {
        OracleEmmiter.data_element_stat_return retval = new OracleEmmiter.data_element_stat_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree stext=null;
        CommonTree mtext=null;
        CommonTree ltext=null;
        OracleEmmiter.domain_stat_return dom =null;


        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:38:18: ( ^( 'ELEMENT' i1= ID ) -> delegate_string(s=$i1.text + \" \" + context.dataElements.get($ID.text).getDomain().getSQLText())| ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING ) -> delegate_string(s=$i1.text + \" \" + $dom.st)| ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ) -> delegate_string(s=$i1.text + \" \" + $dom.st)| ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ltext= STRING ) -> delegate_string(s=$i1.text + \" \" + $dom.st))
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
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:39:5: ^( 'ELEMENT' i1= ID )
                    {
                    match(input,18,FOLLOW_18_in_data_element_stat264); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat268); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 39:24: -> delegate_string(s=$i1.text + \" \" + context.dataElements.get($ID.text).getDomain().getSQLText())
                    {
                        retval.st = templateLib.getInstanceOf("delegate_string",new STAttrMap().put("s", (i1!=null?i1.getText():null) + " " + context.dataElements.get((i1!=null?i1.getText():null)).getDomain().getSQLText()));
                    }



                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:40:6: ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING )
                    {
                    match(input,18,FOLLOW_18_in_data_element_stat287); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat291); 

                    pushFollow(FOLLOW_domain_stat_in_data_element_stat295);
                    dom=domain_stat();

                    state._fsp--;


                    stext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat299); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 40:54: -> delegate_string(s=$i1.text + \" \" + $dom.st)
                    {
                        retval.st = templateLib.getInstanceOf("delegate_string",new STAttrMap().put("s", (i1!=null?i1.getText():null) + " " + (dom!=null?dom.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:41:6: ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING )
                    {
                    match(input,18,FOLLOW_18_in_data_element_stat317); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat321); 

                    pushFollow(FOLLOW_domain_stat_in_data_element_stat325);
                    dom=domain_stat();

                    state._fsp--;


                    stext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat329); 

                    mtext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat333); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 41:67: -> delegate_string(s=$i1.text + \" \" + $dom.st)
                    {
                        retval.st = templateLib.getInstanceOf("delegate_string",new STAttrMap().put("s", (i1!=null?i1.getText():null) + " " + (dom!=null?dom.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:42:6: ^( 'ELEMENT' i1= ID dom= domain_stat stext= STRING mtext= STRING ltext= STRING )
                    {
                    match(input,18,FOLLOW_18_in_data_element_stat351); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_data_element_stat355); 

                    pushFollow(FOLLOW_domain_stat_in_data_element_stat359);
                    dom=domain_stat();

                    state._fsp--;


                    stext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat363); 

                    mtext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat367); 

                    ltext=(CommonTree)match(input,STRING,FOLLOW_STRING_in_data_element_stat371); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 42:80: -> delegate_string(s=$i1.text + \" \" + $dom.st)
                    {
                        retval.st = templateLib.getInstanceOf("delegate_string",new STAttrMap().put("s", (i1!=null?i1.getText():null) + " " + (dom!=null?dom.st:null)));
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_element_stat"


    public static class entity_stat_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "entity_stat"
    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:45:1: entity_stat : ( ^( 'ENTITY' i1= ID ) | ^( 'ENTITY' i1= ID (dae+= data_element_stat )+ ) -> create_table(table_id=$i1.textelems=$dae));
    public final OracleEmmiter.entity_stat_return entity_stat() throws RecognitionException {
        OracleEmmiter.entity_stat_return retval = new OracleEmmiter.entity_stat_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        List list_dae=null;
        RuleReturnScope dae = null;
        try {
            // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:45:12: ( ^( 'ENTITY' i1= ID ) | ^( 'ENTITY' i1= ID (dae+= data_element_stat )+ ) -> create_table(table_id=$i1.textelems=$dae))
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==ID) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==UP) ) {
                            alt6=1;
                        }
                        else if ( (LA6_3==18) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:46:2: ^( 'ENTITY' i1= ID )
                    {
                    match(input,19,FOLLOW_19_in_entity_stat393); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_stat397); 

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:47:4: ^( 'ENTITY' i1= ID (dae+= data_element_stat )+ )
                    {
                    match(input,19,FOLLOW_19_in_entity_stat404); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_stat408); 

                    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:47:24: (dae+= data_element_stat )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\franz\\workspace\\EntityGenerator\\src\\eu\\reitmayer\\lang\\entgen\\OracleEmmiter.g:47:24: dae+= data_element_stat
                    	    {
                    	    pushFollow(FOLLOW_data_element_stat_in_entity_stat412);
                    	    dae=data_element_stat();

                    	    state._fsp--;

                    	    if (list_dae==null) list_dae=new ArrayList();
                    	    list_dae.add(dae.getTemplate());


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


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 47:46: -> create_table(table_id=$i1.textelems=$dae)
                    {
                        retval.st = templateLib.getInstanceOf("create_table",new STAttrMap().put("table_id", (i1!=null?i1.getText():null)).put("elems", list_dae));
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_stat"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog68 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_domain_stat_in_stat91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_element_stat_in_stat97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entity_stat_in_stat103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_domain_stat126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_domain_stat144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_domain_stat172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat184 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_domain_stat209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_domain_stat213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_domain_stat221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_domain_stat229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat295 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat321 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat325 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat329 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_data_element_stat351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_data_element_stat355 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_domain_stat_in_data_element_stat359 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat363 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat367 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_data_element_stat371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_entity_stat393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_stat397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_entity_stat404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_stat408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_data_element_stat_in_entity_stat412 = new BitSet(new long[]{0x0000000000040008L});

}