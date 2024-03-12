package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.R2RMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalR2RMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URIREF", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_EXPONENT", "RULE_DOUBLE", "RULE_DECIMAL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'@prefix'", "'logicalTable'", "'['", "'sqlQuery'", "'tableName'", "']'", "';'", "'subjectMap'", "'predicateObjectMap'", "'objectMap'", "'class'", "'predicate'", "'template'", "'column'", "'datatype'", "'constant'", "':'", "'SELECT'", "'FROM'", "','", "'WHERE'", "'AND'", "'OR'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'"
    };
    public static final int RULE_URIREF=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=5;
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


        public InternalR2RMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalR2RMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalR2RMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalR2RML.g"; }



     	private R2RMLGrammarAccess grammarAccess;

        public InternalR2RMLParser(TokenStream input, R2RMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mapping";
       	}

       	@Override
       	protected R2RMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMapping"
    // InternalR2RML.g:64:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalR2RML.g:64:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalR2RML.g:65:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalR2RML.g:71:1: ruleMapping returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalR2RML.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalR2RML.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_URIREF||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalR2RML.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalR2RML.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalR2RML.g:80:4: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMappingAccess().getStatementsStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getMappingRule());
            	      				}
            	      				add(
            	      					current,
            	      					"statements",
            	      					lv_statements_0_0,
            	      					"org.xtext.example.mydsl.R2RML.Statement");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleStatement"
    // InternalR2RML.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalR2RML.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalR2RML.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalR2RML.g:107:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_prefix_0_0= rulePrefix ) ) | ( (lv_triplesMap_1_0= ruleTriplesMap ) ) ) otherlv_2= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_prefix_0_0 = null;

        EObject lv_triplesMap_1_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:113:2: ( ( ( ( (lv_prefix_0_0= rulePrefix ) ) | ( (lv_triplesMap_1_0= ruleTriplesMap ) ) ) otherlv_2= '.' ) )
            // InternalR2RML.g:114:2: ( ( ( (lv_prefix_0_0= rulePrefix ) ) | ( (lv_triplesMap_1_0= ruleTriplesMap ) ) ) otherlv_2= '.' )
            {
            // InternalR2RML.g:114:2: ( ( ( (lv_prefix_0_0= rulePrefix ) ) | ( (lv_triplesMap_1_0= ruleTriplesMap ) ) ) otherlv_2= '.' )
            // InternalR2RML.g:115:3: ( ( (lv_prefix_0_0= rulePrefix ) ) | ( (lv_triplesMap_1_0= ruleTriplesMap ) ) ) otherlv_2= '.'
            {
            // InternalR2RML.g:115:3: ( ( (lv_prefix_0_0= rulePrefix ) ) | ( (lv_triplesMap_1_0= ruleTriplesMap ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_URIREF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalR2RML.g:116:4: ( (lv_prefix_0_0= rulePrefix ) )
                    {
                    // InternalR2RML.g:116:4: ( (lv_prefix_0_0= rulePrefix ) )
                    // InternalR2RML.g:117:5: (lv_prefix_0_0= rulePrefix )
                    {
                    // InternalR2RML.g:117:5: (lv_prefix_0_0= rulePrefix )
                    // InternalR2RML.g:118:6: lv_prefix_0_0= rulePrefix
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getPrefixPrefixParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_prefix_0_0=rulePrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"prefix",
                      							lv_prefix_0_0,
                      							"org.xtext.example.mydsl.R2RML.Prefix");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:136:4: ( (lv_triplesMap_1_0= ruleTriplesMap ) )
                    {
                    // InternalR2RML.g:136:4: ( (lv_triplesMap_1_0= ruleTriplesMap ) )
                    // InternalR2RML.g:137:5: (lv_triplesMap_1_0= ruleTriplesMap )
                    {
                    // InternalR2RML.g:137:5: (lv_triplesMap_1_0= ruleTriplesMap )
                    // InternalR2RML.g:138:6: lv_triplesMap_1_0= ruleTriplesMap
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getTriplesMapTriplesMapParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_triplesMap_1_0=ruleTriplesMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"triplesMap",
                      							lv_triplesMap_1_0,
                      							"org.xtext.example.mydsl.R2RML.TriplesMap");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getFullStopKeyword_1());
              		
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrefix"
    // InternalR2RML.g:164:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalR2RML.g:164:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalR2RML.g:165:2: iv_rulePrefix= rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefix; 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalR2RML.g:171:1: rulePrefix returns [EObject current=null] : (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_uri_2_0= RULE_URIREF ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_uri_2_0=null;
        AntlrDatatypeRuleToken lv_prefixName_1_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:177:2: ( (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_uri_2_0= RULE_URIREF ) ) ) )
            // InternalR2RML.g:178:2: (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_uri_2_0= RULE_URIREF ) ) )
            {
            // InternalR2RML.g:178:2: (otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_uri_2_0= RULE_URIREF ) ) )
            // InternalR2RML.g:179:3: otherlv_0= '@prefix' ( (lv_prefixName_1_0= rulePrefixName ) ) ( (lv_uri_2_0= RULE_URIREF ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
              		
            }
            // InternalR2RML.g:183:3: ( (lv_prefixName_1_0= rulePrefixName ) )
            // InternalR2RML.g:184:4: (lv_prefixName_1_0= rulePrefixName )
            {
            // InternalR2RML.g:184:4: (lv_prefixName_1_0= rulePrefixName )
            // InternalR2RML.g:185:5: lv_prefixName_1_0= rulePrefixName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrefixAccess().getPrefixNamePrefixNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_prefixName_1_0=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrefixRule());
              					}
              					set(
              						current,
              						"prefixName",
              						lv_prefixName_1_0,
              						"org.xtext.example.mydsl.R2RML.PrefixName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:202:3: ( (lv_uri_2_0= RULE_URIREF ) )
            // InternalR2RML.g:203:4: (lv_uri_2_0= RULE_URIREF )
            {
            // InternalR2RML.g:203:4: (lv_uri_2_0= RULE_URIREF )
            // InternalR2RML.g:204:5: lv_uri_2_0= RULE_URIREF
            {
            lv_uri_2_0=(Token)match(input,RULE_URIREF,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_uri_2_0, grammarAccess.getPrefixAccess().getUriURIREFTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrefixRule());
              					}
              					setWithLastConsumed(
              						current,
              						"uri",
              						lv_uri_2_0,
              						"org.xtext.example.mydsl.R2RML.URIREF");
              				
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleTriplesMap"
    // InternalR2RML.g:224:1: entryRuleTriplesMap returns [EObject current=null] : iv_ruleTriplesMap= ruleTriplesMap EOF ;
    public final EObject entryRuleTriplesMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriplesMap = null;


        try {
            // InternalR2RML.g:224:51: (iv_ruleTriplesMap= ruleTriplesMap EOF )
            // InternalR2RML.g:225:2: iv_ruleTriplesMap= ruleTriplesMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriplesMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTriplesMap=ruleTriplesMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriplesMap; 
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
    // $ANTLR end "entryRuleTriplesMap"


    // $ANTLR start "ruleTriplesMap"
    // InternalR2RML.g:231:1: ruleTriplesMap returns [EObject current=null] : ( ( (lv_name_0_0= RULE_URIREF ) ) ( (lv_logicalTable_1_0= ruleLogicalTable ) ) ( (lv_subjectMap_2_0= ruleSubjectMap ) )? ( (lv_predicateObjectMaps_3_0= rulePredicateObjectMap ) )* ) ;
    public final EObject ruleTriplesMap() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_logicalTable_1_0 = null;

        EObject lv_subjectMap_2_0 = null;

        EObject lv_predicateObjectMaps_3_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:237:2: ( ( ( (lv_name_0_0= RULE_URIREF ) ) ( (lv_logicalTable_1_0= ruleLogicalTable ) ) ( (lv_subjectMap_2_0= ruleSubjectMap ) )? ( (lv_predicateObjectMaps_3_0= rulePredicateObjectMap ) )* ) )
            // InternalR2RML.g:238:2: ( ( (lv_name_0_0= RULE_URIREF ) ) ( (lv_logicalTable_1_0= ruleLogicalTable ) ) ( (lv_subjectMap_2_0= ruleSubjectMap ) )? ( (lv_predicateObjectMaps_3_0= rulePredicateObjectMap ) )* )
            {
            // InternalR2RML.g:238:2: ( ( (lv_name_0_0= RULE_URIREF ) ) ( (lv_logicalTable_1_0= ruleLogicalTable ) ) ( (lv_subjectMap_2_0= ruleSubjectMap ) )? ( (lv_predicateObjectMaps_3_0= rulePredicateObjectMap ) )* )
            // InternalR2RML.g:239:3: ( (lv_name_0_0= RULE_URIREF ) ) ( (lv_logicalTable_1_0= ruleLogicalTable ) ) ( (lv_subjectMap_2_0= ruleSubjectMap ) )? ( (lv_predicateObjectMaps_3_0= rulePredicateObjectMap ) )*
            {
            // InternalR2RML.g:239:3: ( (lv_name_0_0= RULE_URIREF ) )
            // InternalR2RML.g:240:4: (lv_name_0_0= RULE_URIREF )
            {
            // InternalR2RML.g:240:4: (lv_name_0_0= RULE_URIREF )
            // InternalR2RML.g:241:5: lv_name_0_0= RULE_URIREF
            {
            lv_name_0_0=(Token)match(input,RULE_URIREF,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTriplesMapAccess().getNameURIREFTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTriplesMapRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.example.mydsl.R2RML.URIREF");
              				
            }

            }


            }

            // InternalR2RML.g:257:3: ( (lv_logicalTable_1_0= ruleLogicalTable ) )
            // InternalR2RML.g:258:4: (lv_logicalTable_1_0= ruleLogicalTable )
            {
            // InternalR2RML.g:258:4: (lv_logicalTable_1_0= ruleLogicalTable )
            // InternalR2RML.g:259:5: lv_logicalTable_1_0= ruleLogicalTable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTriplesMapAccess().getLogicalTableLogicalTableParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_logicalTable_1_0=ruleLogicalTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTriplesMapRule());
              					}
              					set(
              						current,
              						"logicalTable",
              						lv_logicalTable_1_0,
              						"org.xtext.example.mydsl.R2RML.LogicalTable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:276:3: ( (lv_subjectMap_2_0= ruleSubjectMap ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==32) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==23) ) {
                        alt3=1;
                    }
                }
            }
            else if ( (LA3_0==32) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==23) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalR2RML.g:277:4: (lv_subjectMap_2_0= ruleSubjectMap )
                    {
                    // InternalR2RML.g:277:4: (lv_subjectMap_2_0= ruleSubjectMap )
                    // InternalR2RML.g:278:5: lv_subjectMap_2_0= ruleSubjectMap
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTriplesMapAccess().getSubjectMapSubjectMapParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_subjectMap_2_0=ruleSubjectMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTriplesMapRule());
                      					}
                      					set(
                      						current,
                      						"subjectMap",
                      						lv_subjectMap_2_0,
                      						"org.xtext.example.mydsl.R2RML.SubjectMap");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalR2RML.g:295:3: ( (lv_predicateObjectMaps_3_0= rulePredicateObjectMap ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalR2RML.g:296:4: (lv_predicateObjectMaps_3_0= rulePredicateObjectMap )
            	    {
            	    // InternalR2RML.g:296:4: (lv_predicateObjectMaps_3_0= rulePredicateObjectMap )
            	    // InternalR2RML.g:297:5: lv_predicateObjectMaps_3_0= rulePredicateObjectMap
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTriplesMapAccess().getPredicateObjectMapsPredicateObjectMapParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_predicateObjectMaps_3_0=rulePredicateObjectMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTriplesMapRule());
            	      					}
            	      					add(
            	      						current,
            	      						"predicateObjectMaps",
            	      						lv_predicateObjectMaps_3_0,
            	      						"org.xtext.example.mydsl.R2RML.PredicateObjectMap");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleTriplesMap"


    // $ANTLR start "entryRuleLogicalTable"
    // InternalR2RML.g:318:1: entryRuleLogicalTable returns [EObject current=null] : iv_ruleLogicalTable= ruleLogicalTable EOF ;
    public final EObject entryRuleLogicalTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalTable = null;


        try {
            // InternalR2RML.g:318:53: (iv_ruleLogicalTable= ruleLogicalTable EOF )
            // InternalR2RML.g:319:2: iv_ruleLogicalTable= ruleLogicalTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalTable=ruleLogicalTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalTable; 
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
    // $ANTLR end "entryRuleLogicalTable"


    // $ANTLR start "ruleLogicalTable"
    // InternalR2RML.g:325:1: ruleLogicalTable returns [EObject current=null] : ( rulePrefixName otherlv_1= 'logicalTable' otherlv_2= '[' ( ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) ) | ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) ) ) otherlv_9= ']' (otherlv_10= ';' )? ) ;
    public final EObject ruleLogicalTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_tableName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_query_5_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:331:2: ( ( rulePrefixName otherlv_1= 'logicalTable' otherlv_2= '[' ( ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) ) | ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) ) ) otherlv_9= ']' (otherlv_10= ';' )? ) )
            // InternalR2RML.g:332:2: ( rulePrefixName otherlv_1= 'logicalTable' otherlv_2= '[' ( ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) ) | ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) ) ) otherlv_9= ']' (otherlv_10= ';' )? )
            {
            // InternalR2RML.g:332:2: ( rulePrefixName otherlv_1= 'logicalTable' otherlv_2= '[' ( ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) ) | ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) ) ) otherlv_9= ']' (otherlv_10= ';' )? )
            // InternalR2RML.g:333:3: rulePrefixName otherlv_1= 'logicalTable' otherlv_2= '[' ( ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) ) | ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) ) ) otherlv_9= ']' (otherlv_10= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLogicalTableAccess().getLogicalTableKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLogicalTableAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalR2RML.g:348:3: ( ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) ) | ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==32) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==19) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==20) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==32) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==19) ) {
                    alt5=1;
                }
                else if ( (LA5_2==20) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalR2RML.g:349:4: ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) )
                    {
                    // InternalR2RML.g:349:4: ( rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) ) )
                    // InternalR2RML.g:350:5: rulePrefixName otherlv_4= 'sqlQuery' ( (lv_query_5_0= ruleSimpleSelectStatement ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_3_0_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    rulePrefixName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getLogicalTableAccess().getSqlQueryKeyword_3_0_1());
                      				
                    }
                    // InternalR2RML.g:361:5: ( (lv_query_5_0= ruleSimpleSelectStatement ) )
                    // InternalR2RML.g:362:6: (lv_query_5_0= ruleSimpleSelectStatement )
                    {
                    // InternalR2RML.g:362:6: (lv_query_5_0= ruleSimpleSelectStatement )
                    // InternalR2RML.g:363:7: lv_query_5_0= ruleSimpleSelectStatement
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalTableAccess().getQuerySimpleSelectStatementParserRuleCall_3_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
                    lv_query_5_0=ruleSimpleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLogicalTableRule());
                      							}
                      							set(
                      								current,
                      								"query",
                      								lv_query_5_0,
                      								"org.xtext.example.mydsl.R2RML.SimpleSelectStatement");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:382:4: ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) )
                    {
                    // InternalR2RML.g:382:4: ( rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) ) )
                    // InternalR2RML.g:383:5: rulePrefixName otherlv_7= 'tableName' ( (lv_tableName_8_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_3_1_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    rulePrefixName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_7=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getLogicalTableAccess().getTableNameKeyword_3_1_1());
                      				
                    }
                    // InternalR2RML.g:394:5: ( (lv_tableName_8_0= RULE_STRING ) )
                    // InternalR2RML.g:395:6: (lv_tableName_8_0= RULE_STRING )
                    {
                    // InternalR2RML.g:395:6: (lv_tableName_8_0= RULE_STRING )
                    // InternalR2RML.g:396:7: lv_tableName_8_0= RULE_STRING
                    {
                    lv_tableName_8_0=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_tableName_8_0, grammarAccess.getLogicalTableAccess().getTableNameSTRINGTerminalRuleCall_3_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getLogicalTableRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"tableName",
                      								lv_tableName_8_0,
                      								"org.xtext.example.mydsl.R2RML.STRING");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getLogicalTableAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalR2RML.g:418:3: (otherlv_10= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalR2RML.g:419:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getLogicalTableAccess().getSemicolonKeyword_5());
                      			
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
    // $ANTLR end "ruleLogicalTable"


    // $ANTLR start "entryRuleSubjectMap"
    // InternalR2RML.g:428:1: entryRuleSubjectMap returns [EObject current=null] : iv_ruleSubjectMap= ruleSubjectMap EOF ;
    public final EObject entryRuleSubjectMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectMap = null;


        try {
            // InternalR2RML.g:428:51: (iv_ruleSubjectMap= ruleSubjectMap EOF )
            // InternalR2RML.g:429:2: iv_ruleSubjectMap= ruleSubjectMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubjectMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubjectMap=ruleSubjectMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubjectMap; 
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
    // $ANTLR end "entryRuleSubjectMap"


    // $ANTLR start "ruleSubjectMap"
    // InternalR2RML.g:435:1: ruleSubjectMap returns [EObject current=null] : ( rulePrefixName otherlv_1= 'subjectMap' otherlv_2= '[' ( (lv_template_3_0= ruleTemplate ) ) ( (lv_class_4_0= ruleClass ) )? otherlv_5= ']' (otherlv_6= ';' )? ) ;
    public final EObject ruleSubjectMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_template_3_0 = null;

        EObject lv_class_4_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:441:2: ( ( rulePrefixName otherlv_1= 'subjectMap' otherlv_2= '[' ( (lv_template_3_0= ruleTemplate ) ) ( (lv_class_4_0= ruleClass ) )? otherlv_5= ']' (otherlv_6= ';' )? ) )
            // InternalR2RML.g:442:2: ( rulePrefixName otherlv_1= 'subjectMap' otherlv_2= '[' ( (lv_template_3_0= ruleTemplate ) ) ( (lv_class_4_0= ruleClass ) )? otherlv_5= ']' (otherlv_6= ';' )? )
            {
            // InternalR2RML.g:442:2: ( rulePrefixName otherlv_1= 'subjectMap' otherlv_2= '[' ( (lv_template_3_0= ruleTemplate ) ) ( (lv_class_4_0= ruleClass ) )? otherlv_5= ']' (otherlv_6= ';' )? )
            // InternalR2RML.g:443:3: rulePrefixName otherlv_1= 'subjectMap' otherlv_2= '[' ( (lv_template_3_0= ruleTemplate ) ) ( (lv_class_4_0= ruleClass ) )? otherlv_5= ']' (otherlv_6= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSubjectMapAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSubjectMapAccess().getSubjectMapKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubjectMapAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalR2RML.g:458:3: ( (lv_template_3_0= ruleTemplate ) )
            // InternalR2RML.g:459:4: (lv_template_3_0= ruleTemplate )
            {
            // InternalR2RML.g:459:4: (lv_template_3_0= ruleTemplate )
            // InternalR2RML.g:460:5: lv_template_3_0= ruleTemplate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubjectMapAccess().getTemplateTemplateParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_template_3_0=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubjectMapRule());
              					}
              					set(
              						current,
              						"template",
              						lv_template_3_0,
              						"org.xtext.example.mydsl.R2RML.Template");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:477:3: ( (lv_class_4_0= ruleClass ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalR2RML.g:478:4: (lv_class_4_0= ruleClass )
                    {
                    // InternalR2RML.g:478:4: (lv_class_4_0= ruleClass )
                    // InternalR2RML.g:479:5: lv_class_4_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSubjectMapAccess().getClassClassParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_class_4_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSubjectMapRule());
                      					}
                      					set(
                      						current,
                      						"class",
                      						lv_class_4_0,
                      						"org.xtext.example.mydsl.R2RML.Class");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSubjectMapAccess().getRightSquareBracketKeyword_5());
              		
            }
            // InternalR2RML.g:500:3: (otherlv_6= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalR2RML.g:501:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSubjectMapAccess().getSemicolonKeyword_6());
                      			
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
    // $ANTLR end "ruleSubjectMap"


    // $ANTLR start "entryRulePredicateObjectMap"
    // InternalR2RML.g:510:1: entryRulePredicateObjectMap returns [EObject current=null] : iv_rulePredicateObjectMap= rulePredicateObjectMap EOF ;
    public final EObject entryRulePredicateObjectMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectMap = null;


        try {
            // InternalR2RML.g:510:59: (iv_rulePredicateObjectMap= rulePredicateObjectMap EOF )
            // InternalR2RML.g:511:2: iv_rulePredicateObjectMap= rulePredicateObjectMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateObjectMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicateObjectMap=rulePredicateObjectMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateObjectMap; 
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
    // $ANTLR end "entryRulePredicateObjectMap"


    // $ANTLR start "rulePredicateObjectMap"
    // InternalR2RML.g:517:1: rulePredicateObjectMap returns [EObject current=null] : ( rulePrefixName otherlv_1= 'predicateObjectMap' otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) ( (lv_objectMap_4_0= ruleObjectMap ) ) otherlv_5= ']' (otherlv_6= ';' )? ) ;
    public final EObject rulePredicateObjectMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_objectMap_4_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:523:2: ( ( rulePrefixName otherlv_1= 'predicateObjectMap' otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) ( (lv_objectMap_4_0= ruleObjectMap ) ) otherlv_5= ']' (otherlv_6= ';' )? ) )
            // InternalR2RML.g:524:2: ( rulePrefixName otherlv_1= 'predicateObjectMap' otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) ( (lv_objectMap_4_0= ruleObjectMap ) ) otherlv_5= ']' (otherlv_6= ';' )? )
            {
            // InternalR2RML.g:524:2: ( rulePrefixName otherlv_1= 'predicateObjectMap' otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) ( (lv_objectMap_4_0= ruleObjectMap ) ) otherlv_5= ']' (otherlv_6= ';' )? )
            // InternalR2RML.g:525:3: rulePrefixName otherlv_1= 'predicateObjectMap' otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) ( (lv_objectMap_4_0= ruleObjectMap ) ) otherlv_5= ']' (otherlv_6= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPredicateObjectMapAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPredicateObjectMapAccess().getPredicateObjectMapKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPredicateObjectMapAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalR2RML.g:540:3: ( (lv_predicate_3_0= rulePredicate ) )
            // InternalR2RML.g:541:4: (lv_predicate_3_0= rulePredicate )
            {
            // InternalR2RML.g:541:4: (lv_predicate_3_0= rulePredicate )
            // InternalR2RML.g:542:5: lv_predicate_3_0= rulePredicate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateObjectMapAccess().getPredicatePredicateParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_predicate_3_0=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredicateObjectMapRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_3_0,
              						"org.xtext.example.mydsl.R2RML.Predicate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:559:3: ( (lv_objectMap_4_0= ruleObjectMap ) )
            // InternalR2RML.g:560:4: (lv_objectMap_4_0= ruleObjectMap )
            {
            // InternalR2RML.g:560:4: (lv_objectMap_4_0= ruleObjectMap )
            // InternalR2RML.g:561:5: lv_objectMap_4_0= ruleObjectMap
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateObjectMapAccess().getObjectMapObjectMapParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_objectMap_4_0=ruleObjectMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredicateObjectMapRule());
              					}
              					set(
              						current,
              						"objectMap",
              						lv_objectMap_4_0,
              						"org.xtext.example.mydsl.R2RML.ObjectMap");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPredicateObjectMapAccess().getRightSquareBracketKeyword_5());
              		
            }
            // InternalR2RML.g:582:3: (otherlv_6= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalR2RML.g:583:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPredicateObjectMapAccess().getSemicolonKeyword_6());
                      			
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
    // $ANTLR end "rulePredicateObjectMap"


    // $ANTLR start "entryRuleObjectMap"
    // InternalR2RML.g:592:1: entryRuleObjectMap returns [EObject current=null] : iv_ruleObjectMap= ruleObjectMap EOF ;
    public final EObject entryRuleObjectMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMap = null;


        try {
            // InternalR2RML.g:592:50: (iv_ruleObjectMap= ruleObjectMap EOF )
            // InternalR2RML.g:593:2: iv_ruleObjectMap= ruleObjectMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectMap=ruleObjectMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectMap; 
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
    // $ANTLR end "entryRuleObjectMap"


    // $ANTLR start "ruleObjectMap"
    // InternalR2RML.g:599:1: ruleObjectMap returns [EObject current=null] : ( () rulePrefixName otherlv_2= 'objectMap' otherlv_3= '[' ( (lv_column_4_0= ruleColumn ) )? ( (lv_template_5_0= ruleTemplate ) )? ( (lv_constant_6_0= ruleConstant ) )? ( (lv_datatype_7_0= ruleDatatype ) )? otherlv_8= ']' (otherlv_9= ';' )? ) ;
    public final EObject ruleObjectMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_column_4_0 = null;

        EObject lv_template_5_0 = null;

        EObject lv_constant_6_0 = null;

        EObject lv_datatype_7_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:605:2: ( ( () rulePrefixName otherlv_2= 'objectMap' otherlv_3= '[' ( (lv_column_4_0= ruleColumn ) )? ( (lv_template_5_0= ruleTemplate ) )? ( (lv_constant_6_0= ruleConstant ) )? ( (lv_datatype_7_0= ruleDatatype ) )? otherlv_8= ']' (otherlv_9= ';' )? ) )
            // InternalR2RML.g:606:2: ( () rulePrefixName otherlv_2= 'objectMap' otherlv_3= '[' ( (lv_column_4_0= ruleColumn ) )? ( (lv_template_5_0= ruleTemplate ) )? ( (lv_constant_6_0= ruleConstant ) )? ( (lv_datatype_7_0= ruleDatatype ) )? otherlv_8= ']' (otherlv_9= ';' )? )
            {
            // InternalR2RML.g:606:2: ( () rulePrefixName otherlv_2= 'objectMap' otherlv_3= '[' ( (lv_column_4_0= ruleColumn ) )? ( (lv_template_5_0= ruleTemplate ) )? ( (lv_constant_6_0= ruleConstant ) )? ( (lv_datatype_7_0= ruleDatatype ) )? otherlv_8= ']' (otherlv_9= ';' )? )
            // InternalR2RML.g:607:3: () rulePrefixName otherlv_2= 'objectMap' otherlv_3= '[' ( (lv_column_4_0= ruleColumn ) )? ( (lv_template_5_0= ruleTemplate ) )? ( (lv_constant_6_0= ruleConstant ) )? ( (lv_datatype_7_0= ruleDatatype ) )? otherlv_8= ']' (otherlv_9= ';' )?
            {
            // InternalR2RML.g:607:3: ()
            // InternalR2RML.g:608:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectMapAccess().getObjectMapAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getObjectMapAccess().getPrefixNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_19);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getObjectMapAccess().getObjectMapKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,18,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getObjectMapAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalR2RML.g:629:3: ( (lv_column_4_0= ruleColumn ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==32) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==29) ) {
                        alt10=1;
                    }
                }
            }
            else if ( (LA10_0==32) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==29) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalR2RML.g:630:4: (lv_column_4_0= ruleColumn )
                    {
                    // InternalR2RML.g:630:4: (lv_column_4_0= ruleColumn )
                    // InternalR2RML.g:631:5: lv_column_4_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectMapAccess().getColumnColumnParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_column_4_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectMapRule());
                      					}
                      					set(
                      						current,
                      						"column",
                      						lv_column_4_0,
                      						"org.xtext.example.mydsl.R2RML.Column");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalR2RML.g:648:3: ( (lv_template_5_0= ruleTemplate ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==32) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==28) ) {
                        alt11=1;
                    }
                }
            }
            else if ( (LA11_0==32) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==28) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalR2RML.g:649:4: (lv_template_5_0= ruleTemplate )
                    {
                    // InternalR2RML.g:649:4: (lv_template_5_0= ruleTemplate )
                    // InternalR2RML.g:650:5: lv_template_5_0= ruleTemplate
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectMapAccess().getTemplateTemplateParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_template_5_0=ruleTemplate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectMapRule());
                      					}
                      					set(
                      						current,
                      						"template",
                      						lv_template_5_0,
                      						"org.xtext.example.mydsl.R2RML.Template");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalR2RML.g:667:3: ( (lv_constant_6_0= ruleConstant ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==32) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==31) ) {
                        alt12=1;
                    }
                }
            }
            else if ( (LA12_0==32) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==31) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalR2RML.g:668:4: (lv_constant_6_0= ruleConstant )
                    {
                    // InternalR2RML.g:668:4: (lv_constant_6_0= ruleConstant )
                    // InternalR2RML.g:669:5: lv_constant_6_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectMapAccess().getConstantConstantParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_constant_6_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectMapRule());
                      					}
                      					set(
                      						current,
                      						"constant",
                      						lv_constant_6_0,
                      						"org.xtext.example.mydsl.R2RML.Constant");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalR2RML.g:686:3: ( (lv_datatype_7_0= ruleDatatype ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalR2RML.g:687:4: (lv_datatype_7_0= ruleDatatype )
                    {
                    // InternalR2RML.g:687:4: (lv_datatype_7_0= ruleDatatype )
                    // InternalR2RML.g:688:5: lv_datatype_7_0= ruleDatatype
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getObjectMapAccess().getDatatypeDatatypeParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_datatype_7_0=ruleDatatype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getObjectMapRule());
                      					}
                      					set(
                      						current,
                      						"datatype",
                      						lv_datatype_7_0,
                      						"org.xtext.example.mydsl.R2RML.Datatype");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getObjectMapAccess().getRightSquareBracketKeyword_8());
              		
            }
            // InternalR2RML.g:709:3: (otherlv_9= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalR2RML.g:710:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getObjectMapAccess().getSemicolonKeyword_9());
                      			
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
    // $ANTLR end "ruleObjectMap"


    // $ANTLR start "entryRuleClass"
    // InternalR2RML.g:719:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalR2RML.g:719:46: (iv_ruleClass= ruleClass EOF )
            // InternalR2RML.g:720:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalR2RML.g:726:1: ruleClass returns [EObject current=null] : ( rulePrefixName otherlv_1= 'class' ( (lv_className_2_0= ruleQname ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_className_2_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:732:2: ( ( rulePrefixName otherlv_1= 'class' ( (lv_className_2_0= ruleQname ) ) (otherlv_3= ';' )? ) )
            // InternalR2RML.g:733:2: ( rulePrefixName otherlv_1= 'class' ( (lv_className_2_0= ruleQname ) ) (otherlv_3= ';' )? )
            {
            // InternalR2RML.g:733:2: ( rulePrefixName otherlv_1= 'class' ( (lv_className_2_0= ruleQname ) ) (otherlv_3= ';' )? )
            // InternalR2RML.g:734:3: rulePrefixName otherlv_1= 'class' ( (lv_className_2_0= ruleQname ) ) (otherlv_3= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getClassAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
              		
            }
            // InternalR2RML.g:745:3: ( (lv_className_2_0= ruleQname ) )
            // InternalR2RML.g:746:4: (lv_className_2_0= ruleQname )
            {
            // InternalR2RML.g:746:4: (lv_className_2_0= ruleQname )
            // InternalR2RML.g:747:5: lv_className_2_0= ruleQname
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassAccess().getClassNameQnameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_className_2_0=ruleQname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassRule());
              					}
              					set(
              						current,
              						"className",
              						lv_className_2_0,
              						"org.xtext.example.mydsl.R2RML.Qname");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:764:3: (otherlv_3= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalR2RML.g:765:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRulePredicate"
    // InternalR2RML.g:774:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalR2RML.g:774:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalR2RML.g:775:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalR2RML.g:781:1: rulePredicate returns [EObject current=null] : ( rulePrefixName otherlv_1= 'predicate' ( (lv_predicateName_2_0= ruleQname ) ) (otherlv_3= ';' )? ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_predicateName_2_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:787:2: ( ( rulePrefixName otherlv_1= 'predicate' ( (lv_predicateName_2_0= ruleQname ) ) (otherlv_3= ';' )? ) )
            // InternalR2RML.g:788:2: ( rulePrefixName otherlv_1= 'predicate' ( (lv_predicateName_2_0= ruleQname ) ) (otherlv_3= ';' )? )
            {
            // InternalR2RML.g:788:2: ( rulePrefixName otherlv_1= 'predicate' ( (lv_predicateName_2_0= ruleQname ) ) (otherlv_3= ';' )? )
            // InternalR2RML.g:789:3: rulePrefixName otherlv_1= 'predicate' ( (lv_predicateName_2_0= ruleQname ) ) (otherlv_3= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPredicateAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getPredicateKeyword_1());
              		
            }
            // InternalR2RML.g:800:3: ( (lv_predicateName_2_0= ruleQname ) )
            // InternalR2RML.g:801:4: (lv_predicateName_2_0= ruleQname )
            {
            // InternalR2RML.g:801:4: (lv_predicateName_2_0= ruleQname )
            // InternalR2RML.g:802:5: lv_predicateName_2_0= ruleQname
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateAccess().getPredicateNameQnameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_predicateName_2_0=ruleQname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredicateRule());
              					}
              					set(
              						current,
              						"predicateName",
              						lv_predicateName_2_0,
              						"org.xtext.example.mydsl.R2RML.Qname");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:819:3: (otherlv_3= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalR2RML.g:820:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPredicateAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleTemplate"
    // InternalR2RML.g:829:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalR2RML.g:829:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalR2RML.g:830:2: iv_ruleTemplate= ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplate; 
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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalR2RML.g:836:1: ruleTemplate returns [EObject current=null] : ( rulePrefixName otherlv_1= 'template' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:842:2: ( ( rulePrefixName otherlv_1= 'template' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? ) )
            // InternalR2RML.g:843:2: ( rulePrefixName otherlv_1= 'template' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? )
            {
            // InternalR2RML.g:843:2: ( rulePrefixName otherlv_1= 'template' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? )
            // InternalR2RML.g:844:3: rulePrefixName otherlv_1= 'template' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTemplateAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTemplateAccess().getTemplateKeyword_1());
              		
            }
            // InternalR2RML.g:855:3: ( (lv_name_2_0= ruleQuotedString ) )
            // InternalR2RML.g:856:4: (lv_name_2_0= ruleQuotedString )
            {
            // InternalR2RML.g:856:4: (lv_name_2_0= ruleQuotedString )
            // InternalR2RML.g:857:5: lv_name_2_0= ruleQuotedString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemplateAccess().getNameQuotedStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTemplateRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.example.mydsl.R2RML.QuotedString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:874:3: (otherlv_3= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalR2RML.g:875:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTemplateAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleColumn"
    // InternalR2RML.g:884:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalR2RML.g:884:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalR2RML.g:885:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalR2RML.g:891:1: ruleColumn returns [EObject current=null] : ( rulePrefixName otherlv_1= 'column' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:897:2: ( ( rulePrefixName otherlv_1= 'column' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? ) )
            // InternalR2RML.g:898:2: ( rulePrefixName otherlv_1= 'column' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? )
            {
            // InternalR2RML.g:898:2: ( rulePrefixName otherlv_1= 'column' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )? )
            // InternalR2RML.g:899:3: rulePrefixName otherlv_1= 'column' ( (lv_name_2_0= ruleQuotedString ) ) (otherlv_3= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getColumnAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
              		
            }
            // InternalR2RML.g:910:3: ( (lv_name_2_0= ruleQuotedString ) )
            // InternalR2RML.g:911:4: (lv_name_2_0= ruleQuotedString )
            {
            // InternalR2RML.g:911:4: (lv_name_2_0= ruleQuotedString )
            // InternalR2RML.g:912:5: lv_name_2_0= ruleQuotedString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColumnAccess().getNameQuotedStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColumnRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.example.mydsl.R2RML.QuotedString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:929:3: (otherlv_3= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalR2RML.g:930:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleDatatype"
    // InternalR2RML.g:939:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalR2RML.g:939:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalR2RML.g:940:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype; 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalR2RML.g:946:1: ruleDatatype returns [EObject current=null] : ( rulePrefixName otherlv_1= 'datatype' ( (lv_dtName_2_0= ruleQname ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dtName_2_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:952:2: ( ( rulePrefixName otherlv_1= 'datatype' ( (lv_dtName_2_0= ruleQname ) ) (otherlv_3= ';' )? ) )
            // InternalR2RML.g:953:2: ( rulePrefixName otherlv_1= 'datatype' ( (lv_dtName_2_0= ruleQname ) ) (otherlv_3= ';' )? )
            {
            // InternalR2RML.g:953:2: ( rulePrefixName otherlv_1= 'datatype' ( (lv_dtName_2_0= ruleQname ) ) (otherlv_3= ';' )? )
            // InternalR2RML.g:954:3: rulePrefixName otherlv_1= 'datatype' ( (lv_dtName_2_0= ruleQname ) ) (otherlv_3= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDatatypeAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDatatypeAccess().getDatatypeKeyword_1());
              		
            }
            // InternalR2RML.g:965:3: ( (lv_dtName_2_0= ruleQname ) )
            // InternalR2RML.g:966:4: (lv_dtName_2_0= ruleQname )
            {
            // InternalR2RML.g:966:4: (lv_dtName_2_0= ruleQname )
            // InternalR2RML.g:967:5: lv_dtName_2_0= ruleQname
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDatatypeAccess().getDtNameQnameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_dtName_2_0=ruleQname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDatatypeRule());
              					}
              					set(
              						current,
              						"dtName",
              						lv_dtName_2_0,
              						"org.xtext.example.mydsl.R2RML.Qname");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:984:3: (otherlv_3= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalR2RML.g:985:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleConstant"
    // InternalR2RML.g:994:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalR2RML.g:994:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalR2RML.g:995:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalR2RML.g:1001:1: ruleConstant returns [EObject current=null] : ( rulePrefixName otherlv_1= 'constant' ( ( (lv_constName_2_0= ruleiResource ) ) | ( (lv_constStr_3_0= ruleQuotedString ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_constName_2_0 = null;

        AntlrDatatypeRuleToken lv_constStr_3_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1007:2: ( ( rulePrefixName otherlv_1= 'constant' ( ( (lv_constName_2_0= ruleiResource ) ) | ( (lv_constStr_3_0= ruleQuotedString ) ) ) (otherlv_4= ';' )? ) )
            // InternalR2RML.g:1008:2: ( rulePrefixName otherlv_1= 'constant' ( ( (lv_constName_2_0= ruleiResource ) ) | ( (lv_constStr_3_0= ruleQuotedString ) ) ) (otherlv_4= ';' )? )
            {
            // InternalR2RML.g:1008:2: ( rulePrefixName otherlv_1= 'constant' ( ( (lv_constName_2_0= ruleiResource ) ) | ( (lv_constStr_3_0= ruleQuotedString ) ) ) (otherlv_4= ';' )? )
            // InternalR2RML.g:1009:3: rulePrefixName otherlv_1= 'constant' ( ( (lv_constName_2_0= ruleiResource ) ) | ( (lv_constStr_3_0= ruleQuotedString ) ) ) (otherlv_4= ';' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstantAccess().getPrefixNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
              		
            }
            // InternalR2RML.g:1020:3: ( ( (lv_constName_2_0= ruleiResource ) ) | ( (lv_constStr_3_0= ruleQuotedString ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_URIREF||LA20_0==RULE_ID||LA20_0==32) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalR2RML.g:1021:4: ( (lv_constName_2_0= ruleiResource ) )
                    {
                    // InternalR2RML.g:1021:4: ( (lv_constName_2_0= ruleiResource ) )
                    // InternalR2RML.g:1022:5: (lv_constName_2_0= ruleiResource )
                    {
                    // InternalR2RML.g:1022:5: (lv_constName_2_0= ruleiResource )
                    // InternalR2RML.g:1023:6: lv_constName_2_0= ruleiResource
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstantAccess().getConstNameIResourceParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_constName_2_0=ruleiResource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstantRule());
                      						}
                      						set(
                      							current,
                      							"constName",
                      							lv_constName_2_0,
                      							"org.xtext.example.mydsl.R2RML.iResource");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:1041:4: ( (lv_constStr_3_0= ruleQuotedString ) )
                    {
                    // InternalR2RML.g:1041:4: ( (lv_constStr_3_0= ruleQuotedString ) )
                    // InternalR2RML.g:1042:5: (lv_constStr_3_0= ruleQuotedString )
                    {
                    // InternalR2RML.g:1042:5: (lv_constStr_3_0= ruleQuotedString )
                    // InternalR2RML.g:1043:6: lv_constStr_3_0= ruleQuotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstantAccess().getConstStrQuotedStringParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_constStr_3_0=ruleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstantRule());
                      						}
                      						set(
                      							current,
                      							"constStr",
                      							lv_constStr_3_0,
                      							"org.xtext.example.mydsl.R2RML.QuotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalR2RML.g:1061:3: (otherlv_4= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalR2RML.g:1062:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleiResource"
    // InternalR2RML.g:1071:1: entryRuleiResource returns [EObject current=null] : iv_ruleiResource= ruleiResource EOF ;
    public final EObject entryRuleiResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiResource = null;


        try {
            // InternalR2RML.g:1071:50: (iv_ruleiResource= ruleiResource EOF )
            // InternalR2RML.g:1072:2: iv_ruleiResource= ruleiResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIResourceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleiResource=ruleiResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiResource; 
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
    // $ANTLR end "entryRuleiResource"


    // $ANTLR start "ruleiResource"
    // InternalR2RML.g:1078:1: ruleiResource returns [EObject current=null] : ( ( (lv_uriRef_0_0= RULE_URIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) ) ;
    public final EObject ruleiResource() throws RecognitionException {
        EObject current = null;

        Token lv_uriRef_0_0=null;
        EObject lv_qname_1_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1084:2: ( ( ( (lv_uriRef_0_0= RULE_URIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) ) )
            // InternalR2RML.g:1085:2: ( ( (lv_uriRef_0_0= RULE_URIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) )
            {
            // InternalR2RML.g:1085:2: ( ( (lv_uriRef_0_0= RULE_URIREF ) ) | ( (lv_qname_1_0= ruleQname ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_URIREF) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID||LA22_0==32) ) {
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
                    // InternalR2RML.g:1086:3: ( (lv_uriRef_0_0= RULE_URIREF ) )
                    {
                    // InternalR2RML.g:1086:3: ( (lv_uriRef_0_0= RULE_URIREF ) )
                    // InternalR2RML.g:1087:4: (lv_uriRef_0_0= RULE_URIREF )
                    {
                    // InternalR2RML.g:1087:4: (lv_uriRef_0_0= RULE_URIREF )
                    // InternalR2RML.g:1088:5: lv_uriRef_0_0= RULE_URIREF
                    {
                    lv_uriRef_0_0=(Token)match(input,RULE_URIREF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_uriRef_0_0, grammarAccess.getIResourceAccess().getUriRefURIREFTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIResourceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"uriRef",
                      						lv_uriRef_0_0,
                      						"org.xtext.example.mydsl.R2RML.URIREF");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:1105:3: ( (lv_qname_1_0= ruleQname ) )
                    {
                    // InternalR2RML.g:1105:3: ( (lv_qname_1_0= ruleQname ) )
                    // InternalR2RML.g:1106:4: (lv_qname_1_0= ruleQname )
                    {
                    // InternalR2RML.g:1106:4: (lv_qname_1_0= ruleQname )
                    // InternalR2RML.g:1107:5: lv_qname_1_0= ruleQname
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIResourceAccess().getQnameQnameParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_qname_1_0=ruleQname();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIResourceRule());
                      					}
                      					set(
                      						current,
                      						"qname",
                      						lv_qname_1_0,
                      						"org.xtext.example.mydsl.R2RML.Qname");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleiResource"


    // $ANTLR start "entryRuleQname"
    // InternalR2RML.g:1128:1: entryRuleQname returns [EObject current=null] : iv_ruleQname= ruleQname EOF ;
    public final EObject entryRuleQname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQname = null;


        try {
            // InternalR2RML.g:1128:46: (iv_ruleQname= ruleQname EOF )
            // InternalR2RML.g:1129:2: iv_ruleQname= ruleQname EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQnameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQname=ruleQname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQname; 
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
    // $ANTLR end "entryRuleQname"


    // $ANTLR start "ruleQname"
    // InternalR2RML.g:1135:1: ruleQname returns [EObject current=null] : ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleQname() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_prefixName_1_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1141:2: ( ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? ) )
            // InternalR2RML.g:1142:2: ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalR2RML.g:1142:2: ( () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )? )
            // InternalR2RML.g:1143:3: () ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) ) ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )?
            {
            // InternalR2RML.g:1143:3: ()
            // InternalR2RML.g:1144:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQnameAccess().getQnameAction_0(),
              					current);
              			
            }

            }

            // InternalR2RML.g:1150:3: ( ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName ) )
            // InternalR2RML.g:1151:4: ( ( rulePrefixName ) )=> (lv_prefixName_1_0= rulePrefixName )
            {
            // InternalR2RML.g:1155:4: (lv_prefixName_1_0= rulePrefixName )
            // InternalR2RML.g:1156:5: lv_prefixName_1_0= rulePrefixName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQnameAccess().getPrefixNamePrefixNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_prefixName_1_0=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQnameRule());
              					}
              					set(
              						current,
              						"prefixName",
              						lv_prefixName_1_0,
              						"org.xtext.example.mydsl.R2RML.PrefixName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:1173:3: ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred2_InternalR2RML()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalR2RML.g:1174:4: ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID )
                    {
                    // InternalR2RML.g:1178:4: (lv_name_2_0= RULE_ID )
                    // InternalR2RML.g:1179:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getQnameAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getQnameRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"org.xtext.example.mydsl.R2RML.ID");
                      				
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
    // $ANTLR end "ruleQname"


    // $ANTLR start "entryRulePrefixName"
    // InternalR2RML.g:1199:1: entryRulePrefixName returns [String current=null] : iv_rulePrefixName= rulePrefixName EOF ;
    public final String entryRulePrefixName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixName = null;


        try {
            // InternalR2RML.g:1199:50: (iv_rulePrefixName= rulePrefixName EOF )
            // InternalR2RML.g:1200:2: iv_rulePrefixName= rulePrefixName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixName=rulePrefixName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixName.getText(); 
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
    // $ANTLR end "entryRulePrefixName"


    // $ANTLR start "rulePrefixName"
    // InternalR2RML.g:1206:1: rulePrefixName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )? kw= ':' ) ;
    public final AntlrDatatypeRuleToken rulePrefixName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalR2RML.g:1212:2: ( ( (this_ID_0= RULE_ID )? kw= ':' ) )
            // InternalR2RML.g:1213:2: ( (this_ID_0= RULE_ID )? kw= ':' )
            {
            // InternalR2RML.g:1213:2: ( (this_ID_0= RULE_ID )? kw= ':' )
            // InternalR2RML.g:1214:3: (this_ID_0= RULE_ID )? kw= ':'
            {
            // InternalR2RML.g:1214:3: (this_ID_0= RULE_ID )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalR2RML.g:1215:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_0, grammarAccess.getPrefixNameAccess().getIDTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPrefixNameAccess().getColonKeyword_1());
              		
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
    // $ANTLR end "rulePrefixName"


    // $ANTLR start "entryRuleQuotedString"
    // InternalR2RML.g:1232:1: entryRuleQuotedString returns [String current=null] : iv_ruleQuotedString= ruleQuotedString EOF ;
    public final String entryRuleQuotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotedString = null;


        try {
            // InternalR2RML.g:1232:52: (iv_ruleQuotedString= ruleQuotedString EOF )
            // InternalR2RML.g:1233:2: iv_ruleQuotedString= ruleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuotedString=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedString.getText(); 
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
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // InternalR2RML.g:1239:1: ruleQuotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleQuotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalR2RML.g:1245:2: (this_STRING_0= RULE_STRING )
            // InternalR2RML.g:1246:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall());
              	
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
    // $ANTLR end "ruleQuotedString"


    // $ANTLR start "entryRuleSimpleSelectStatement"
    // InternalR2RML.g:1256:1: entryRuleSimpleSelectStatement returns [EObject current=null] : iv_ruleSimpleSelectStatement= ruleSimpleSelectStatement EOF ;
    public final EObject entryRuleSimpleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectStatement = null;


        try {
            // InternalR2RML.g:1256:62: (iv_ruleSimpleSelectStatement= ruleSimpleSelectStatement EOF )
            // InternalR2RML.g:1257:2: iv_ruleSimpleSelectStatement= ruleSimpleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSelectStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSelectStatement=ruleSimpleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSelectStatement; 
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
    // $ANTLR end "entryRuleSimpleSelectStatement"


    // $ANTLR start "ruleSimpleSelectStatement"
    // InternalR2RML.g:1263:1: ruleSimpleSelectStatement returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_ID ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? ) ;
    public final EObject ruleSimpleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_tableName_3_0=null;
        EObject lv_selectedColumns_1_0 = null;

        EObject lv_whereClause_4_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1269:2: ( (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_ID ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? ) )
            // InternalR2RML.g:1270:2: (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_ID ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? )
            {
            // InternalR2RML.g:1270:2: (otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_ID ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )? )
            // InternalR2RML.g:1271:3: otherlv_0= 'SELECT' ( (lv_selectedColumns_1_0= ruleSelectedColumns ) ) otherlv_2= 'FROM' ( (lv_tableName_3_0= RULE_ID ) ) ( (lv_whereClause_4_0= ruleWhereClause ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSimpleSelectStatementAccess().getSELECTKeyword_0());
              		
            }
            // InternalR2RML.g:1275:3: ( (lv_selectedColumns_1_0= ruleSelectedColumns ) )
            // InternalR2RML.g:1276:4: (lv_selectedColumns_1_0= ruleSelectedColumns )
            {
            // InternalR2RML.g:1276:4: (lv_selectedColumns_1_0= ruleSelectedColumns )
            // InternalR2RML.g:1277:5: lv_selectedColumns_1_0= ruleSelectedColumns
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleSelectStatementAccess().getSelectedColumnsSelectedColumnsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_selectedColumns_1_0=ruleSelectedColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimpleSelectStatementRule());
              					}
              					set(
              						current,
              						"selectedColumns",
              						lv_selectedColumns_1_0,
              						"org.xtext.example.mydsl.R2RML.SelectedColumns");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSimpleSelectStatementAccess().getFROMKeyword_2());
              		
            }
            // InternalR2RML.g:1298:3: ( (lv_tableName_3_0= RULE_ID ) )
            // InternalR2RML.g:1299:4: (lv_tableName_3_0= RULE_ID )
            {
            // InternalR2RML.g:1299:4: (lv_tableName_3_0= RULE_ID )
            // InternalR2RML.g:1300:5: lv_tableName_3_0= RULE_ID
            {
            lv_tableName_3_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_tableName_3_0, grammarAccess.getSimpleSelectStatementAccess().getTableNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSimpleSelectStatementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"tableName",
              						lv_tableName_3_0,
              						"org.xtext.example.mydsl.R2RML.ID");
              				
            }

            }


            }

            // InternalR2RML.g:1316:3: ( (lv_whereClause_4_0= ruleWhereClause ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalR2RML.g:1317:4: (lv_whereClause_4_0= ruleWhereClause )
                    {
                    // InternalR2RML.g:1317:4: (lv_whereClause_4_0= ruleWhereClause )
                    // InternalR2RML.g:1318:5: lv_whereClause_4_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_whereClause_4_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimpleSelectStatementRule());
                      					}
                      					set(
                      						current,
                      						"whereClause",
                      						lv_whereClause_4_0,
                      						"org.xtext.example.mydsl.R2RML.WhereClause");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleSimpleSelectStatement"


    // $ANTLR start "entryRuleSelectedColumns"
    // InternalR2RML.g:1339:1: entryRuleSelectedColumns returns [EObject current=null] : iv_ruleSelectedColumns= ruleSelectedColumns EOF ;
    public final EObject entryRuleSelectedColumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedColumns = null;


        try {
            // InternalR2RML.g:1339:56: (iv_ruleSelectedColumns= ruleSelectedColumns EOF )
            // InternalR2RML.g:1340:2: iv_ruleSelectedColumns= ruleSelectedColumns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectedColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectedColumns=ruleSelectedColumns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectedColumns; 
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
    // $ANTLR end "entryRuleSelectedColumns"


    // $ANTLR start "ruleSelectedColumns"
    // InternalR2RML.g:1346:1: ruleSelectedColumns returns [EObject current=null] : ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleSelectedColumns() throws RecognitionException {
        EObject current = null;

        Token lv_columns_0_0=null;
        Token otherlv_1=null;
        Token lv_columns_2_0=null;


        	enterRule();

        try {
            // InternalR2RML.g:1352:2: ( ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* ) )
            // InternalR2RML.g:1353:2: ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* )
            {
            // InternalR2RML.g:1353:2: ( ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )* )
            // InternalR2RML.g:1354:3: ( (lv_columns_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )*
            {
            // InternalR2RML.g:1354:3: ( (lv_columns_0_0= RULE_ID ) )
            // InternalR2RML.g:1355:4: (lv_columns_0_0= RULE_ID )
            {
            // InternalR2RML.g:1355:4: (lv_columns_0_0= RULE_ID )
            // InternalR2RML.g:1356:5: lv_columns_0_0= RULE_ID
            {
            lv_columns_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_columns_0_0, grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSelectedColumnsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"columns",
              						lv_columns_0_0,
              						"org.xtext.example.mydsl.R2RML.ID");
              				
            }

            }


            }

            // InternalR2RML.g:1372:3: (otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalR2RML.g:1373:4: otherlv_1= ',' ( (lv_columns_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSelectedColumnsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalR2RML.g:1377:4: ( (lv_columns_2_0= RULE_ID ) )
            	    // InternalR2RML.g:1378:5: (lv_columns_2_0= RULE_ID )
            	    {
            	    // InternalR2RML.g:1378:5: (lv_columns_2_0= RULE_ID )
            	    // InternalR2RML.g:1379:6: lv_columns_2_0= RULE_ID
            	    {
            	    lv_columns_2_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_columns_2_0, grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSelectedColumnsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"columns",
            	      							lv_columns_2_0,
            	      							"org.xtext.example.mydsl.R2RML.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleSelectedColumns"


    // $ANTLR start "entryRuleWhereClause"
    // InternalR2RML.g:1400:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalR2RML.g:1400:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalR2RML.g:1401:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalR2RML.g:1407:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_conditions_1_0= ruleCondition ) ) ( ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) ) )* ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditions_1_0 = null;

        AntlrDatatypeRuleToken lv_logic_2_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1413:2: ( (otherlv_0= 'WHERE' ( (lv_conditions_1_0= ruleCondition ) ) ( ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) ) )* ) )
            // InternalR2RML.g:1414:2: (otherlv_0= 'WHERE' ( (lv_conditions_1_0= ruleCondition ) ) ( ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) ) )* )
            {
            // InternalR2RML.g:1414:2: (otherlv_0= 'WHERE' ( (lv_conditions_1_0= ruleCondition ) ) ( ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) ) )* )
            // InternalR2RML.g:1415:3: otherlv_0= 'WHERE' ( (lv_conditions_1_0= ruleCondition ) ) ( ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
              		
            }
            // InternalR2RML.g:1419:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalR2RML.g:1420:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalR2RML.g:1420:4: (lv_conditions_1_0= ruleCondition )
            // InternalR2RML.g:1421:5: lv_conditions_1_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhereClauseAccess().getConditionsConditionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_conditions_1_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
              					}
              					add(
              						current,
              						"conditions",
              						lv_conditions_1_0,
              						"org.xtext.example.mydsl.R2RML.Condition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:1438:3: ( ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=37 && LA27_0<=38)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalR2RML.g:1439:4: ( (lv_logic_2_0= ruleLogic ) ) ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    // InternalR2RML.g:1439:4: ( (lv_logic_2_0= ruleLogic ) )
            	    // InternalR2RML.g:1440:5: (lv_logic_2_0= ruleLogic )
            	    {
            	    // InternalR2RML.g:1440:5: (lv_logic_2_0= ruleLogic )
            	    // InternalR2RML.g:1441:6: lv_logic_2_0= ruleLogic
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhereClauseAccess().getLogicLogicParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_logic_2_0=ruleLogic();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"logic",
            	      							lv_logic_2_0,
            	      							"org.xtext.example.mydsl.R2RML.Logic");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalR2RML.g:1458:4: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalR2RML.g:1459:5: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalR2RML.g:1459:5: (lv_conditions_3_0= ruleCondition )
            	    // InternalR2RML.g:1460:6: lv_conditions_3_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhereClauseAccess().getConditionsConditionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_3_0,
            	      							"org.xtext.example.mydsl.R2RML.Condition");
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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleCondition"
    // InternalR2RML.g:1482:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalR2RML.g:1482:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalR2RML.g:1483:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalR2RML.g:1489:1: ruleCondition returns [EObject current=null] : ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_column_0_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1495:2: ( ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalR2RML.g:1496:2: ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalR2RML.g:1496:2: ( ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) ) )
            // InternalR2RML.g:1497:3: ( (lv_column_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_value_2_0= ruleValue ) )
            {
            // InternalR2RML.g:1497:3: ( (lv_column_0_0= RULE_ID ) )
            // InternalR2RML.g:1498:4: (lv_column_0_0= RULE_ID )
            {
            // InternalR2RML.g:1498:4: (lv_column_0_0= RULE_ID )
            // InternalR2RML.g:1499:5: lv_column_0_0= RULE_ID
            {
            lv_column_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_column_0_0, grammarAccess.getConditionAccess().getColumnIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConditionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"column",
              						lv_column_0_0,
              						"org.xtext.example.mydsl.R2RML.ID");
              				
            }

            }


            }

            // InternalR2RML.g:1515:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalR2RML.g:1516:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalR2RML.g:1516:4: (lv_operator_1_0= ruleOperator )
            // InternalR2RML.g:1517:5: lv_operator_1_0= ruleOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_operator_1_0=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_1_0,
              						"org.xtext.example.mydsl.R2RML.Operator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalR2RML.g:1534:3: ( (lv_value_2_0= ruleValue ) )
            // InternalR2RML.g:1535:4: (lv_value_2_0= ruleValue )
            {
            // InternalR2RML.g:1535:4: (lv_value_2_0= ruleValue )
            // InternalR2RML.g:1536:5: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getValueValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.xtext.example.mydsl.R2RML.Value");
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


    // $ANTLR start "entryRuleLogic"
    // InternalR2RML.g:1557:1: entryRuleLogic returns [String current=null] : iv_ruleLogic= ruleLogic EOF ;
    public final String entryRuleLogic() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogic = null;


        try {
            // InternalR2RML.g:1557:45: (iv_ruleLogic= ruleLogic EOF )
            // InternalR2RML.g:1558:2: iv_ruleLogic= ruleLogic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogic=ruleLogic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogic.getText(); 
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
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalR2RML.g:1564:1: ruleLogic returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= 'OR' ) ;
    public final AntlrDatatypeRuleToken ruleLogic() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalR2RML.g:1570:2: ( (kw= 'AND' | kw= 'OR' ) )
            // InternalR2RML.g:1571:2: (kw= 'AND' | kw= 'OR' )
            {
            // InternalR2RML.g:1571:2: (kw= 'AND' | kw= 'OR' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalR2RML.g:1572:3: kw= 'AND'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicAccess().getANDKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalR2RML.g:1578:3: kw= 'OR'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLogicAccess().getORKeyword_1());
                      		
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
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleOperator"
    // InternalR2RML.g:1587:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalR2RML.g:1587:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalR2RML.g:1588:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalR2RML.g:1594:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalR2RML.g:1600:2: ( (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // InternalR2RML.g:1601:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // InternalR2RML.g:1601:2: (kw= '=' | kw= '<>' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt29=1;
                }
                break;
            case 40:
                {
                alt29=2;
                }
                break;
            case 41:
                {
                alt29=3;
                }
                break;
            case 42:
                {
                alt29=4;
                }
                break;
            case 43:
                {
                alt29=5;
                }
                break;
            case 44:
                {
                alt29=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalR2RML.g:1602:3: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalR2RML.g:1608:3: kw= '<>'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalR2RML.g:1614:3: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalR2RML.g:1620:3: kw= '<='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalR2RML.g:1626:3: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalR2RML.g:1632:3: kw= '>='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_5());
                      		
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleValue"
    // InternalR2RML.g:1641:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalR2RML.g:1641:46: (iv_ruleValue= ruleValue EOF )
            // InternalR2RML.g:1642:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalR2RML.g:1648:1: ruleValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_StringValue_2 = null;



        	enterRule();

        try {
            // InternalR2RML.g:1654:2: ( (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) )
            // InternalR2RML.g:1655:2: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            {
            // InternalR2RML.g:1655:2: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
                {
                alt30=1;
                }
                break;
            case RULE_INT:
                {
                alt30=2;
                }
                break;
            case RULE_STRING:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalR2RML.g:1656:3: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalR2RML.g:1665:3: this_NumberValue_1= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberValue_1=ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalR2RML.g:1674:3: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_2;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalR2RML.g:1686:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalR2RML.g:1686:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalR2RML.g:1687:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalR2RML.g:1693:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalR2RML.g:1699:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalR2RML.g:1700:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalR2RML.g:1700:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalR2RML.g:1701:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalR2RML.g:1701:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalR2RML.g:1702:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalR2RML.g:1702:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            else if ( (LA31_0==46) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalR2RML.g:1703:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanValueRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalR2RML.g:1714:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanValueRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_2, null);
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalR2RML.g:1730:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalR2RML.g:1730:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalR2RML.g:1731:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalR2RML.g:1737:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalR2RML.g:1743:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalR2RML.g:1744:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalR2RML.g:1744:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalR2RML.g:1745:3: (lv_value_0_0= RULE_INT )
            {
            // InternalR2RML.g:1745:3: (lv_value_0_0= RULE_INT )
            // InternalR2RML.g:1746:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNumberValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalR2RML.g:1765:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalR2RML.g:1765:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalR2RML.g:1766:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalR2RML.g:1772:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalR2RML.g:1778:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalR2RML.g:1779:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalR2RML.g:1779:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalR2RML.g:1780:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalR2RML.g:1780:3: (lv_value_0_0= RULE_STRING )
            // InternalR2RML.g:1781:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.xtext.example.mydsl.R2RML.STRING");
              			
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
    // $ANTLR end "ruleStringValue"

    // $ANTLR start synpred2_InternalR2RML
    public final void synpred2_InternalR2RML_fragment() throws RecognitionException {   
        // InternalR2RML.g:1174:4: ( ( RULE_ID ) )
        // InternalR2RML.g:1174:5: ( RULE_ID )
        {
        // InternalR2RML.g:1174:5: ( RULE_ID )
        // InternalR2RML.g:1175:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalR2RML

    // Delegated rules

    public final boolean synpred2_InternalR2RML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalR2RML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100200040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00006000000000A0L});

}