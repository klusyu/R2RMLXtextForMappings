package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.R2RMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalR2RMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_URIREF", "RULE_INT", "RULE_EXPONENT", "RULE_DOUBLE", "RULE_DECIMAL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'", "'.'", "'@prefix'", "'logicalTable'", "'['", "']'", "';'", "'sqlQuery'", "'tableName'", "'subjectMap'", "'predicateObjectMap'", "'objectMap'", "'class'", "'predicate'", "'template'", "'column'", "'datatype'", "'constant'", "':'", "'SELECT'", "'FROM'", "','", "'WHERE'"
    };
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


        public InternalR2RMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalR2RMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalR2RMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalR2RML.g"; }


    	private R2RMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(R2RMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMapping"
    // InternalR2RML.g:54:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalR2RML.g:55:1: ( ruleMapping EOF )
            // InternalR2RML.g:56:1: ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalR2RML.g:63:1: ruleMapping : ( ( rule__Mapping__StatementsAssignment )* ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:67:2: ( ( ( rule__Mapping__StatementsAssignment )* ) )
            // InternalR2RML.g:68:2: ( ( rule__Mapping__StatementsAssignment )* )
            {
            // InternalR2RML.g:68:2: ( ( rule__Mapping__StatementsAssignment )* )
            // InternalR2RML.g:69:3: ( rule__Mapping__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getStatementsAssignment()); 
            }
            // InternalR2RML.g:70:3: ( rule__Mapping__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_URIREF||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalR2RML.g:70:4: rule__Mapping__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Mapping__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getStatementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleStatement"
    // InternalR2RML.g:79:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalR2RML.g:80:1: ( ruleStatement EOF )
            // InternalR2RML.g:81:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalR2RML.g:88:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:92:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalR2RML.g:93:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalR2RML.g:93:2: ( ( rule__Statement__Group__0 ) )
            // InternalR2RML.g:94:3: ( rule__Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup()); 
            }
            // InternalR2RML.g:95:3: ( rule__Statement__Group__0 )
            // InternalR2RML.g:95:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrefix"
    // InternalR2RML.g:104:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalR2RML.g:105:1: ( rulePrefix EOF )
            // InternalR2RML.g:106:1: rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalR2RML.g:113:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:117:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalR2RML.g:118:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalR2RML.g:118:2: ( ( rule__Prefix__Group__0 ) )
            // InternalR2RML.g:119:3: ( rule__Prefix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getGroup()); 
            }
            // InternalR2RML.g:120:3: ( rule__Prefix__Group__0 )
            // InternalR2RML.g:120:4: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleTriplesMap"
    // InternalR2RML.g:129:1: entryRuleTriplesMap : ruleTriplesMap EOF ;
    public final void entryRuleTriplesMap() throws RecognitionException {
        try {
            // InternalR2RML.g:130:1: ( ruleTriplesMap EOF )
            // InternalR2RML.g:131:1: ruleTriplesMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTriplesMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriplesMap"


    // $ANTLR start "ruleTriplesMap"
    // InternalR2RML.g:138:1: ruleTriplesMap : ( ( rule__TriplesMap__Group__0 ) ) ;
    public final void ruleTriplesMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:142:2: ( ( ( rule__TriplesMap__Group__0 ) ) )
            // InternalR2RML.g:143:2: ( ( rule__TriplesMap__Group__0 ) )
            {
            // InternalR2RML.g:143:2: ( ( rule__TriplesMap__Group__0 ) )
            // InternalR2RML.g:144:3: ( rule__TriplesMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getGroup()); 
            }
            // InternalR2RML.g:145:3: ( rule__TriplesMap__Group__0 )
            // InternalR2RML.g:145:4: rule__TriplesMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriplesMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriplesMap"


    // $ANTLR start "entryRuleLogicalTable"
    // InternalR2RML.g:154:1: entryRuleLogicalTable : ruleLogicalTable EOF ;
    public final void entryRuleLogicalTable() throws RecognitionException {
        try {
            // InternalR2RML.g:155:1: ( ruleLogicalTable EOF )
            // InternalR2RML.g:156:1: ruleLogicalTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicalTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalTable"


    // $ANTLR start "ruleLogicalTable"
    // InternalR2RML.g:163:1: ruleLogicalTable : ( ( rule__LogicalTable__Group__0 ) ) ;
    public final void ruleLogicalTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:167:2: ( ( ( rule__LogicalTable__Group__0 ) ) )
            // InternalR2RML.g:168:2: ( ( rule__LogicalTable__Group__0 ) )
            {
            // InternalR2RML.g:168:2: ( ( rule__LogicalTable__Group__0 ) )
            // InternalR2RML.g:169:3: ( rule__LogicalTable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getGroup()); 
            }
            // InternalR2RML.g:170:3: ( rule__LogicalTable__Group__0 )
            // InternalR2RML.g:170:4: rule__LogicalTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalTable"


    // $ANTLR start "entryRuleSubjectMap"
    // InternalR2RML.g:179:1: entryRuleSubjectMap : ruleSubjectMap EOF ;
    public final void entryRuleSubjectMap() throws RecognitionException {
        try {
            // InternalR2RML.g:180:1: ( ruleSubjectMap EOF )
            // InternalR2RML.g:181:1: ruleSubjectMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubjectMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubjectMap"


    // $ANTLR start "ruleSubjectMap"
    // InternalR2RML.g:188:1: ruleSubjectMap : ( ( rule__SubjectMap__Group__0 ) ) ;
    public final void ruleSubjectMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:192:2: ( ( ( rule__SubjectMap__Group__0 ) ) )
            // InternalR2RML.g:193:2: ( ( rule__SubjectMap__Group__0 ) )
            {
            // InternalR2RML.g:193:2: ( ( rule__SubjectMap__Group__0 ) )
            // InternalR2RML.g:194:3: ( rule__SubjectMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getGroup()); 
            }
            // InternalR2RML.g:195:3: ( rule__SubjectMap__Group__0 )
            // InternalR2RML.g:195:4: rule__SubjectMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubjectMap"


    // $ANTLR start "entryRulePredicateObjectMap"
    // InternalR2RML.g:204:1: entryRulePredicateObjectMap : rulePredicateObjectMap EOF ;
    public final void entryRulePredicateObjectMap() throws RecognitionException {
        try {
            // InternalR2RML.g:205:1: ( rulePredicateObjectMap EOF )
            // InternalR2RML.g:206:1: rulePredicateObjectMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicateObjectMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateObjectMap"


    // $ANTLR start "rulePredicateObjectMap"
    // InternalR2RML.g:213:1: rulePredicateObjectMap : ( ( rule__PredicateObjectMap__Group__0 ) ) ;
    public final void rulePredicateObjectMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:217:2: ( ( ( rule__PredicateObjectMap__Group__0 ) ) )
            // InternalR2RML.g:218:2: ( ( rule__PredicateObjectMap__Group__0 ) )
            {
            // InternalR2RML.g:218:2: ( ( rule__PredicateObjectMap__Group__0 ) )
            // InternalR2RML.g:219:3: ( rule__PredicateObjectMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getGroup()); 
            }
            // InternalR2RML.g:220:3: ( rule__PredicateObjectMap__Group__0 )
            // InternalR2RML.g:220:4: rule__PredicateObjectMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateObjectMap"


    // $ANTLR start "entryRuleObjectMap"
    // InternalR2RML.g:229:1: entryRuleObjectMap : ruleObjectMap EOF ;
    public final void entryRuleObjectMap() throws RecognitionException {
        try {
            // InternalR2RML.g:230:1: ( ruleObjectMap EOF )
            // InternalR2RML.g:231:1: ruleObjectMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjectMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectMap"


    // $ANTLR start "ruleObjectMap"
    // InternalR2RML.g:238:1: ruleObjectMap : ( ( rule__ObjectMap__Group__0 ) ) ;
    public final void ruleObjectMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:242:2: ( ( ( rule__ObjectMap__Group__0 ) ) )
            // InternalR2RML.g:243:2: ( ( rule__ObjectMap__Group__0 ) )
            {
            // InternalR2RML.g:243:2: ( ( rule__ObjectMap__Group__0 ) )
            // InternalR2RML.g:244:3: ( rule__ObjectMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getGroup()); 
            }
            // InternalR2RML.g:245:3: ( rule__ObjectMap__Group__0 )
            // InternalR2RML.g:245:4: rule__ObjectMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectMap"


    // $ANTLR start "entryRuleClass"
    // InternalR2RML.g:254:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalR2RML.g:255:1: ( ruleClass EOF )
            // InternalR2RML.g:256:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalR2RML.g:263:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:267:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalR2RML.g:268:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalR2RML.g:268:2: ( ( rule__Class__Group__0 ) )
            // InternalR2RML.g:269:3: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalR2RML.g:270:3: ( rule__Class__Group__0 )
            // InternalR2RML.g:270:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRulePredicate"
    // InternalR2RML.g:279:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalR2RML.g:280:1: ( rulePredicate EOF )
            // InternalR2RML.g:281:1: rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalR2RML.g:288:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:292:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalR2RML.g:293:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalR2RML.g:293:2: ( ( rule__Predicate__Group__0 ) )
            // InternalR2RML.g:294:3: ( rule__Predicate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup()); 
            }
            // InternalR2RML.g:295:3: ( rule__Predicate__Group__0 )
            // InternalR2RML.g:295:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleTemplate"
    // InternalR2RML.g:304:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalR2RML.g:305:1: ( ruleTemplate EOF )
            // InternalR2RML.g:306:1: ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTemplate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalR2RML.g:313:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:317:2: ( ( ( rule__Template__Group__0 ) ) )
            // InternalR2RML.g:318:2: ( ( rule__Template__Group__0 ) )
            {
            // InternalR2RML.g:318:2: ( ( rule__Template__Group__0 ) )
            // InternalR2RML.g:319:3: ( rule__Template__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup()); 
            }
            // InternalR2RML.g:320:3: ( rule__Template__Group__0 )
            // InternalR2RML.g:320:4: rule__Template__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleColumn"
    // InternalR2RML.g:329:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalR2RML.g:330:1: ( ruleColumn EOF )
            // InternalR2RML.g:331:1: ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalR2RML.g:338:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:342:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalR2RML.g:343:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalR2RML.g:343:2: ( ( rule__Column__Group__0 ) )
            // InternalR2RML.g:344:3: ( rule__Column__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getGroup()); 
            }
            // InternalR2RML.g:345:3: ( rule__Column__Group__0 )
            // InternalR2RML.g:345:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleDatatype"
    // InternalR2RML.g:354:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalR2RML.g:355:1: ( ruleDatatype EOF )
            // InternalR2RML.g:356:1: ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalR2RML.g:363:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:367:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalR2RML.g:368:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalR2RML.g:368:2: ( ( rule__Datatype__Group__0 ) )
            // InternalR2RML.g:369:3: ( rule__Datatype__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getGroup()); 
            }
            // InternalR2RML.g:370:3: ( rule__Datatype__Group__0 )
            // InternalR2RML.g:370:4: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleConstant"
    // InternalR2RML.g:379:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalR2RML.g:380:1: ( ruleConstant EOF )
            // InternalR2RML.g:381:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalR2RML.g:388:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:392:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalR2RML.g:393:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalR2RML.g:393:2: ( ( rule__Constant__Group__0 ) )
            // InternalR2RML.g:394:3: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // InternalR2RML.g:395:3: ( rule__Constant__Group__0 )
            // InternalR2RML.g:395:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleiResource"
    // InternalR2RML.g:404:1: entryRuleiResource : ruleiResource EOF ;
    public final void entryRuleiResource() throws RecognitionException {
        try {
            // InternalR2RML.g:405:1: ( ruleiResource EOF )
            // InternalR2RML.g:406:1: ruleiResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleiResource"


    // $ANTLR start "ruleiResource"
    // InternalR2RML.g:413:1: ruleiResource : ( ( rule__IResource__Alternatives ) ) ;
    public final void ruleiResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:417:2: ( ( ( rule__IResource__Alternatives ) ) )
            // InternalR2RML.g:418:2: ( ( rule__IResource__Alternatives ) )
            {
            // InternalR2RML.g:418:2: ( ( rule__IResource__Alternatives ) )
            // InternalR2RML.g:419:3: ( rule__IResource__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceAccess().getAlternatives()); 
            }
            // InternalR2RML.g:420:3: ( rule__IResource__Alternatives )
            // InternalR2RML.g:420:4: rule__IResource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IResource__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleiResource"


    // $ANTLR start "entryRuleQname"
    // InternalR2RML.g:429:1: entryRuleQname : ruleQname EOF ;
    public final void entryRuleQname() throws RecognitionException {
        try {
            // InternalR2RML.g:430:1: ( ruleQname EOF )
            // InternalR2RML.g:431:1: ruleQname EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQname"


    // $ANTLR start "ruleQname"
    // InternalR2RML.g:438:1: ruleQname : ( ( rule__Qname__Group__0 ) ) ;
    public final void ruleQname() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:442:2: ( ( ( rule__Qname__Group__0 ) ) )
            // InternalR2RML.g:443:2: ( ( rule__Qname__Group__0 ) )
            {
            // InternalR2RML.g:443:2: ( ( rule__Qname__Group__0 ) )
            // InternalR2RML.g:444:3: ( rule__Qname__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getGroup()); 
            }
            // InternalR2RML.g:445:3: ( rule__Qname__Group__0 )
            // InternalR2RML.g:445:4: rule__Qname__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qname__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQname"


    // $ANTLR start "entryRulePrefixName"
    // InternalR2RML.g:454:1: entryRulePrefixName : rulePrefixName EOF ;
    public final void entryRulePrefixName() throws RecognitionException {
        try {
            // InternalR2RML.g:455:1: ( rulePrefixName EOF )
            // InternalR2RML.g:456:1: rulePrefixName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixName"


    // $ANTLR start "rulePrefixName"
    // InternalR2RML.g:463:1: rulePrefixName : ( ( rule__PrefixName__Group__0 ) ) ;
    public final void rulePrefixName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:467:2: ( ( ( rule__PrefixName__Group__0 ) ) )
            // InternalR2RML.g:468:2: ( ( rule__PrefixName__Group__0 ) )
            {
            // InternalR2RML.g:468:2: ( ( rule__PrefixName__Group__0 ) )
            // InternalR2RML.g:469:3: ( rule__PrefixName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameAccess().getGroup()); 
            }
            // InternalR2RML.g:470:3: ( rule__PrefixName__Group__0 )
            // InternalR2RML.g:470:4: rule__PrefixName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrefixName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixName"


    // $ANTLR start "entryRuleQuotedString"
    // InternalR2RML.g:479:1: entryRuleQuotedString : ruleQuotedString EOF ;
    public final void entryRuleQuotedString() throws RecognitionException {
        try {
            // InternalR2RML.g:480:1: ( ruleQuotedString EOF )
            // InternalR2RML.g:481:1: ruleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // InternalR2RML.g:488:1: ruleQuotedString : ( RULE_STRING ) ;
    public final void ruleQuotedString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:492:2: ( ( RULE_STRING ) )
            // InternalR2RML.g:493:2: ( RULE_STRING )
            {
            // InternalR2RML.g:493:2: ( RULE_STRING )
            // InternalR2RML.g:494:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedString"


    // $ANTLR start "entryRuleSimpleSelectStatement"
    // InternalR2RML.g:504:1: entryRuleSimpleSelectStatement : ruleSimpleSelectStatement EOF ;
    public final void entryRuleSimpleSelectStatement() throws RecognitionException {
        try {
            // InternalR2RML.g:505:1: ( ruleSimpleSelectStatement EOF )
            // InternalR2RML.g:506:1: ruleSimpleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleSelectStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleSelectStatement"


    // $ANTLR start "ruleSimpleSelectStatement"
    // InternalR2RML.g:513:1: ruleSimpleSelectStatement : ( ( rule__SimpleSelectStatement__Group__0 ) ) ;
    public final void ruleSimpleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:517:2: ( ( ( rule__SimpleSelectStatement__Group__0 ) ) )
            // InternalR2RML.g:518:2: ( ( rule__SimpleSelectStatement__Group__0 ) )
            {
            // InternalR2RML.g:518:2: ( ( rule__SimpleSelectStatement__Group__0 ) )
            // InternalR2RML.g:519:3: ( rule__SimpleSelectStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getGroup()); 
            }
            // InternalR2RML.g:520:3: ( rule__SimpleSelectStatement__Group__0 )
            // InternalR2RML.g:520:4: rule__SimpleSelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSelectStatement"


    // $ANTLR start "entryRuleSelectedColumns"
    // InternalR2RML.g:529:1: entryRuleSelectedColumns : ruleSelectedColumns EOF ;
    public final void entryRuleSelectedColumns() throws RecognitionException {
        try {
            // InternalR2RML.g:530:1: ( ruleSelectedColumns EOF )
            // InternalR2RML.g:531:1: ruleSelectedColumns EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelectedColumns();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectedColumns"


    // $ANTLR start "ruleSelectedColumns"
    // InternalR2RML.g:538:1: ruleSelectedColumns : ( ( rule__SelectedColumns__Group__0 ) ) ;
    public final void ruleSelectedColumns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:542:2: ( ( ( rule__SelectedColumns__Group__0 ) ) )
            // InternalR2RML.g:543:2: ( ( rule__SelectedColumns__Group__0 ) )
            {
            // InternalR2RML.g:543:2: ( ( rule__SelectedColumns__Group__0 ) )
            // InternalR2RML.g:544:3: ( rule__SelectedColumns__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getGroup()); 
            }
            // InternalR2RML.g:545:3: ( rule__SelectedColumns__Group__0 )
            // InternalR2RML.g:545:4: rule__SelectedColumns__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectedColumns"


    // $ANTLR start "entryRuleWhereClause"
    // InternalR2RML.g:554:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalR2RML.g:555:1: ( ruleWhereClause EOF )
            // InternalR2RML.g:556:1: ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhereClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalR2RML.g:563:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:567:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalR2RML.g:568:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalR2RML.g:568:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalR2RML.g:569:3: ( rule__WhereClause__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getGroup()); 
            }
            // InternalR2RML.g:570:3: ( rule__WhereClause__Group__0 )
            // InternalR2RML.g:570:4: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleCondition"
    // InternalR2RML.g:579:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalR2RML.g:580:1: ( ruleCondition EOF )
            // InternalR2RML.g:581:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalR2RML.g:588:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:592:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalR2RML.g:593:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalR2RML.g:593:2: ( ( rule__Condition__Group__0 ) )
            // InternalR2RML.g:594:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalR2RML.g:595:3: ( rule__Condition__Group__0 )
            // InternalR2RML.g:595:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleLogic"
    // InternalR2RML.g:604:1: entryRuleLogic : ruleLogic EOF ;
    public final void entryRuleLogic() throws RecognitionException {
        try {
            // InternalR2RML.g:605:1: ( ruleLogic EOF )
            // InternalR2RML.g:606:1: ruleLogic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogic"


    // $ANTLR start "ruleLogic"
    // InternalR2RML.g:613:1: ruleLogic : ( ( rule__Logic__Alternatives ) ) ;
    public final void ruleLogic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:617:2: ( ( ( rule__Logic__Alternatives ) ) )
            // InternalR2RML.g:618:2: ( ( rule__Logic__Alternatives ) )
            {
            // InternalR2RML.g:618:2: ( ( rule__Logic__Alternatives ) )
            // InternalR2RML.g:619:3: ( rule__Logic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicAccess().getAlternatives()); 
            }
            // InternalR2RML.g:620:3: ( rule__Logic__Alternatives )
            // InternalR2RML.g:620:4: rule__Logic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Logic__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogic"


    // $ANTLR start "entryRuleOperator"
    // InternalR2RML.g:629:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalR2RML.g:630:1: ( ruleOperator EOF )
            // InternalR2RML.g:631:1: ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalR2RML.g:638:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:642:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalR2RML.g:643:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalR2RML.g:643:2: ( ( rule__Operator__Alternatives ) )
            // InternalR2RML.g:644:3: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // InternalR2RML.g:645:3: ( rule__Operator__Alternatives )
            // InternalR2RML.g:645:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleValue"
    // InternalR2RML.g:654:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalR2RML.g:655:1: ( ruleValue EOF )
            // InternalR2RML.g:656:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalR2RML.g:663:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:667:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalR2RML.g:668:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalR2RML.g:668:2: ( ( rule__Value__Alternatives ) )
            // InternalR2RML.g:669:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalR2RML.g:670:3: ( rule__Value__Alternatives )
            // InternalR2RML.g:670:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalR2RML.g:679:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalR2RML.g:680:1: ( ruleBooleanValue EOF )
            // InternalR2RML.g:681:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalR2RML.g:688:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:692:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalR2RML.g:693:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalR2RML.g:693:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalR2RML.g:694:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalR2RML.g:695:3: ( rule__BooleanValue__ValueAssignment )
            // InternalR2RML.g:695:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalR2RML.g:704:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalR2RML.g:705:1: ( ruleNumberValue EOF )
            // InternalR2RML.g:706:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalR2RML.g:713:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:717:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalR2RML.g:718:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalR2RML.g:718:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalR2RML.g:719:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalR2RML.g:720:3: ( rule__NumberValue__ValueAssignment )
            // InternalR2RML.g:720:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalR2RML.g:729:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalR2RML.g:730:1: ( ruleStringValue EOF )
            // InternalR2RML.g:731:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalR2RML.g:738:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:742:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalR2RML.g:743:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalR2RML.g:743:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalR2RML.g:744:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalR2RML.g:745:3: ( rule__StringValue__ValueAssignment )
            // InternalR2RML.g:745:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "rule__Statement__Alternatives_0"
    // InternalR2RML.g:753:1: rule__Statement__Alternatives_0 : ( ( ( rule__Statement__PrefixAssignment_0_0 ) ) | ( ( rule__Statement__TriplesMapAssignment_0_1 ) ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:757:1: ( ( ( rule__Statement__PrefixAssignment_0_0 ) ) | ( ( rule__Statement__TriplesMapAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_URIREF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalR2RML.g:758:2: ( ( rule__Statement__PrefixAssignment_0_0 ) )
                    {
                    // InternalR2RML.g:758:2: ( ( rule__Statement__PrefixAssignment_0_0 ) )
                    // InternalR2RML.g:759:3: ( rule__Statement__PrefixAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPrefixAssignment_0_0()); 
                    }
                    // InternalR2RML.g:760:3: ( rule__Statement__PrefixAssignment_0_0 )
                    // InternalR2RML.g:760:4: rule__Statement__PrefixAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__PrefixAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPrefixAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:764:2: ( ( rule__Statement__TriplesMapAssignment_0_1 ) )
                    {
                    // InternalR2RML.g:764:2: ( ( rule__Statement__TriplesMapAssignment_0_1 ) )
                    // InternalR2RML.g:765:3: ( rule__Statement__TriplesMapAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTriplesMapAssignment_0_1()); 
                    }
                    // InternalR2RML.g:766:3: ( rule__Statement__TriplesMapAssignment_0_1 )
                    // InternalR2RML.g:766:4: rule__Statement__TriplesMapAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__TriplesMapAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTriplesMapAssignment_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_0"


    // $ANTLR start "rule__LogicalTable__Alternatives_3"
    // InternalR2RML.g:774:1: rule__LogicalTable__Alternatives_3 : ( ( ( rule__LogicalTable__Group_3_0__0 ) ) | ( ( rule__LogicalTable__Group_3_1__0 ) ) );
    public final void rule__LogicalTable__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:778:1: ( ( ( rule__LogicalTable__Group_3_0__0 ) ) | ( ( rule__LogicalTable__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==42) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==32) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==31) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==42) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==32) ) {
                    alt3=2;
                }
                else if ( (LA3_2==31) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalR2RML.g:779:2: ( ( rule__LogicalTable__Group_3_0__0 ) )
                    {
                    // InternalR2RML.g:779:2: ( ( rule__LogicalTable__Group_3_0__0 ) )
                    // InternalR2RML.g:780:3: ( rule__LogicalTable__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalTableAccess().getGroup_3_0()); 
                    }
                    // InternalR2RML.g:781:3: ( rule__LogicalTable__Group_3_0__0 )
                    // InternalR2RML.g:781:4: rule__LogicalTable__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalTable__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalTableAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:785:2: ( ( rule__LogicalTable__Group_3_1__0 ) )
                    {
                    // InternalR2RML.g:785:2: ( ( rule__LogicalTable__Group_3_1__0 ) )
                    // InternalR2RML.g:786:3: ( rule__LogicalTable__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalTableAccess().getGroup_3_1()); 
                    }
                    // InternalR2RML.g:787:3: ( rule__LogicalTable__Group_3_1__0 )
                    // InternalR2RML.g:787:4: rule__LogicalTable__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalTable__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalTableAccess().getGroup_3_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Alternatives_3"


    // $ANTLR start "rule__Constant__Alternatives_2"
    // InternalR2RML.g:795:1: rule__Constant__Alternatives_2 : ( ( ( rule__Constant__ConstNameAssignment_2_0 ) ) | ( ( rule__Constant__ConstStrAssignment_2_1 ) ) );
    public final void rule__Constant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:799:1: ( ( ( rule__Constant__ConstNameAssignment_2_0 ) ) | ( ( rule__Constant__ConstStrAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_URIREF)||LA4_0==42) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalR2RML.g:800:2: ( ( rule__Constant__ConstNameAssignment_2_0 ) )
                    {
                    // InternalR2RML.g:800:2: ( ( rule__Constant__ConstNameAssignment_2_0 ) )
                    // InternalR2RML.g:801:3: ( rule__Constant__ConstNameAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getConstNameAssignment_2_0()); 
                    }
                    // InternalR2RML.g:802:3: ( rule__Constant__ConstNameAssignment_2_0 )
                    // InternalR2RML.g:802:4: rule__Constant__ConstNameAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ConstNameAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getConstNameAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:806:2: ( ( rule__Constant__ConstStrAssignment_2_1 ) )
                    {
                    // InternalR2RML.g:806:2: ( ( rule__Constant__ConstStrAssignment_2_1 ) )
                    // InternalR2RML.g:807:3: ( rule__Constant__ConstStrAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getConstStrAssignment_2_1()); 
                    }
                    // InternalR2RML.g:808:3: ( rule__Constant__ConstStrAssignment_2_1 )
                    // InternalR2RML.g:808:4: rule__Constant__ConstStrAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ConstStrAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getConstStrAssignment_2_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives_2"


    // $ANTLR start "rule__IResource__Alternatives"
    // InternalR2RML.g:816:1: rule__IResource__Alternatives : ( ( ( rule__IResource__UriRefAssignment_0 ) ) | ( ( rule__IResource__QnameAssignment_1 ) ) );
    public final void rule__IResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:820:1: ( ( ( rule__IResource__UriRefAssignment_0 ) ) | ( ( rule__IResource__QnameAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_URIREF) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==42) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalR2RML.g:821:2: ( ( rule__IResource__UriRefAssignment_0 ) )
                    {
                    // InternalR2RML.g:821:2: ( ( rule__IResource__UriRefAssignment_0 ) )
                    // InternalR2RML.g:822:3: ( rule__IResource__UriRefAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIResourceAccess().getUriRefAssignment_0()); 
                    }
                    // InternalR2RML.g:823:3: ( rule__IResource__UriRefAssignment_0 )
                    // InternalR2RML.g:823:4: rule__IResource__UriRefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IResource__UriRefAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIResourceAccess().getUriRefAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:827:2: ( ( rule__IResource__QnameAssignment_1 ) )
                    {
                    // InternalR2RML.g:827:2: ( ( rule__IResource__QnameAssignment_1 ) )
                    // InternalR2RML.g:828:3: ( rule__IResource__QnameAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIResourceAccess().getQnameAssignment_1()); 
                    }
                    // InternalR2RML.g:829:3: ( rule__IResource__QnameAssignment_1 )
                    // InternalR2RML.g:829:4: rule__IResource__QnameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IResource__QnameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIResourceAccess().getQnameAssignment_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IResource__Alternatives"


    // $ANTLR start "rule__Logic__Alternatives"
    // InternalR2RML.g:837:1: rule__Logic__Alternatives : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__Logic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:841:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalR2RML.g:842:2: ( 'AND' )
                    {
                    // InternalR2RML.g:842:2: ( 'AND' )
                    // InternalR2RML.g:843:3: 'AND'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicAccess().getANDKeyword_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicAccess().getANDKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:848:2: ( 'OR' )
                    {
                    // InternalR2RML.g:848:2: ( 'OR' )
                    // InternalR2RML.g:849:3: 'OR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicAccess().getORKeyword_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicAccess().getORKeyword_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logic__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalR2RML.g:858:1: rule__Operator__Alternatives : ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:862:1: ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalR2RML.g:863:2: ( '=' )
                    {
                    // InternalR2RML.g:863:2: ( '=' )
                    // InternalR2RML.g:864:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:869:2: ( '<>' )
                    {
                    // InternalR2RML.g:869:2: ( '<>' )
                    // InternalR2RML.g:870:3: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalR2RML.g:875:2: ( '<' )
                    {
                    // InternalR2RML.g:875:2: ( '<' )
                    // InternalR2RML.g:876:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalR2RML.g:881:2: ( '<=' )
                    {
                    // InternalR2RML.g:881:2: ( '<=' )
                    // InternalR2RML.g:882:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalR2RML.g:887:2: ( '>' )
                    {
                    // InternalR2RML.g:887:2: ( '>' )
                    // InternalR2RML.g:888:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalR2RML.g:893:2: ( '>=' )
                    {
                    // InternalR2RML.g:893:2: ( '>=' )
                    // InternalR2RML.g:894:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalR2RML.g:903:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:907:1: ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalR2RML.g:908:2: ( ruleBooleanValue )
                    {
                    // InternalR2RML.g:908:2: ( ruleBooleanValue )
                    // InternalR2RML.g:909:3: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:914:2: ( ruleNumberValue )
                    {
                    // InternalR2RML.g:914:2: ( ruleNumberValue )
                    // InternalR2RML.g:915:3: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalR2RML.g:920:2: ( ruleStringValue )
                    {
                    // InternalR2RML.g:920:2: ( ruleStringValue )
                    // InternalR2RML.g:921:3: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BooleanValue__ValueAlternatives_0"
    // InternalR2RML.g:930:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:934:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalR2RML.g:935:2: ( 'true' )
                    {
                    // InternalR2RML.g:935:2: ( 'true' )
                    // InternalR2RML.g:936:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalR2RML.g:941:2: ( 'false' )
                    {
                    // InternalR2RML.g:941:2: ( 'false' )
                    // InternalR2RML.g:942:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAlternatives_0"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalR2RML.g:951:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:955:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalR2RML.g:956:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalR2RML.g:963:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:967:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalR2RML.g:968:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalR2RML.g:968:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalR2RML.g:969:2: ( rule__Statement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            }
            // InternalR2RML.g:970:2: ( rule__Statement__Alternatives_0 )
            // InternalR2RML.g:970:3: rule__Statement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalR2RML.g:978:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:982:1: ( rule__Statement__Group__1__Impl )
            // InternalR2RML.g:983:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalR2RML.g:989:1: rule__Statement__Group__1__Impl : ( '.' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:993:1: ( ( '.' ) )
            // InternalR2RML.g:994:1: ( '.' )
            {
            // InternalR2RML.g:994:1: ( '.' )
            // InternalR2RML.g:995:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalR2RML.g:1005:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1009:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalR2RML.g:1010:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Prefix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // InternalR2RML.g:1017:1: rule__Prefix__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1021:1: ( ( '@prefix' ) )
            // InternalR2RML.g:1022:1: ( '@prefix' )
            {
            // InternalR2RML.g:1022:1: ( '@prefix' )
            // InternalR2RML.g:1023:2: '@prefix'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // InternalR2RML.g:1032:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1036:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // InternalR2RML.g:1037:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Prefix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // InternalR2RML.g:1044:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__PrefixNameAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1048:1: ( ( ( rule__Prefix__PrefixNameAssignment_1 ) ) )
            // InternalR2RML.g:1049:1: ( ( rule__Prefix__PrefixNameAssignment_1 ) )
            {
            // InternalR2RML.g:1049:1: ( ( rule__Prefix__PrefixNameAssignment_1 ) )
            // InternalR2RML.g:1050:2: ( rule__Prefix__PrefixNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getPrefixNameAssignment_1()); 
            }
            // InternalR2RML.g:1051:2: ( rule__Prefix__PrefixNameAssignment_1 )
            // InternalR2RML.g:1051:3: rule__Prefix__PrefixNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__PrefixNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getPrefixNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Prefix__Group__2"
    // InternalR2RML.g:1059:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1063:1: ( rule__Prefix__Group__2__Impl )
            // InternalR2RML.g:1064:2: rule__Prefix__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2"


    // $ANTLR start "rule__Prefix__Group__2__Impl"
    // InternalR2RML.g:1070:1: rule__Prefix__Group__2__Impl : ( ( rule__Prefix__UriAssignment_2 ) ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1074:1: ( ( ( rule__Prefix__UriAssignment_2 ) ) )
            // InternalR2RML.g:1075:1: ( ( rule__Prefix__UriAssignment_2 ) )
            {
            // InternalR2RML.g:1075:1: ( ( rule__Prefix__UriAssignment_2 ) )
            // InternalR2RML.g:1076:2: ( rule__Prefix__UriAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getUriAssignment_2()); 
            }
            // InternalR2RML.g:1077:2: ( rule__Prefix__UriAssignment_2 )
            // InternalR2RML.g:1077:3: rule__Prefix__UriAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__UriAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getUriAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__2__Impl"


    // $ANTLR start "rule__TriplesMap__Group__0"
    // InternalR2RML.g:1086:1: rule__TriplesMap__Group__0 : rule__TriplesMap__Group__0__Impl rule__TriplesMap__Group__1 ;
    public final void rule__TriplesMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1090:1: ( rule__TriplesMap__Group__0__Impl rule__TriplesMap__Group__1 )
            // InternalR2RML.g:1091:2: rule__TriplesMap__Group__0__Impl rule__TriplesMap__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TriplesMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TriplesMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__0"


    // $ANTLR start "rule__TriplesMap__Group__0__Impl"
    // InternalR2RML.g:1098:1: rule__TriplesMap__Group__0__Impl : ( ( rule__TriplesMap__NameAssignment_0 ) ) ;
    public final void rule__TriplesMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1102:1: ( ( ( rule__TriplesMap__NameAssignment_0 ) ) )
            // InternalR2RML.g:1103:1: ( ( rule__TriplesMap__NameAssignment_0 ) )
            {
            // InternalR2RML.g:1103:1: ( ( rule__TriplesMap__NameAssignment_0 ) )
            // InternalR2RML.g:1104:2: ( rule__TriplesMap__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getNameAssignment_0()); 
            }
            // InternalR2RML.g:1105:2: ( rule__TriplesMap__NameAssignment_0 )
            // InternalR2RML.g:1105:3: rule__TriplesMap__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TriplesMap__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__0__Impl"


    // $ANTLR start "rule__TriplesMap__Group__1"
    // InternalR2RML.g:1113:1: rule__TriplesMap__Group__1 : rule__TriplesMap__Group__1__Impl rule__TriplesMap__Group__2 ;
    public final void rule__TriplesMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1117:1: ( rule__TriplesMap__Group__1__Impl rule__TriplesMap__Group__2 )
            // InternalR2RML.g:1118:2: rule__TriplesMap__Group__1__Impl rule__TriplesMap__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TriplesMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TriplesMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__1"


    // $ANTLR start "rule__TriplesMap__Group__1__Impl"
    // InternalR2RML.g:1125:1: rule__TriplesMap__Group__1__Impl : ( ( rule__TriplesMap__LogicalTableAssignment_1 ) ) ;
    public final void rule__TriplesMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1129:1: ( ( ( rule__TriplesMap__LogicalTableAssignment_1 ) ) )
            // InternalR2RML.g:1130:1: ( ( rule__TriplesMap__LogicalTableAssignment_1 ) )
            {
            // InternalR2RML.g:1130:1: ( ( rule__TriplesMap__LogicalTableAssignment_1 ) )
            // InternalR2RML.g:1131:2: ( rule__TriplesMap__LogicalTableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getLogicalTableAssignment_1()); 
            }
            // InternalR2RML.g:1132:2: ( rule__TriplesMap__LogicalTableAssignment_1 )
            // InternalR2RML.g:1132:3: rule__TriplesMap__LogicalTableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TriplesMap__LogicalTableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getLogicalTableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__1__Impl"


    // $ANTLR start "rule__TriplesMap__Group__2"
    // InternalR2RML.g:1140:1: rule__TriplesMap__Group__2 : rule__TriplesMap__Group__2__Impl rule__TriplesMap__Group__3 ;
    public final void rule__TriplesMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1144:1: ( rule__TriplesMap__Group__2__Impl rule__TriplesMap__Group__3 )
            // InternalR2RML.g:1145:2: rule__TriplesMap__Group__2__Impl rule__TriplesMap__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TriplesMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TriplesMap__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__2"


    // $ANTLR start "rule__TriplesMap__Group__2__Impl"
    // InternalR2RML.g:1152:1: rule__TriplesMap__Group__2__Impl : ( ( rule__TriplesMap__SubjectMapAssignment_2 )? ) ;
    public final void rule__TriplesMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1156:1: ( ( ( rule__TriplesMap__SubjectMapAssignment_2 )? ) )
            // InternalR2RML.g:1157:1: ( ( rule__TriplesMap__SubjectMapAssignment_2 )? )
            {
            // InternalR2RML.g:1157:1: ( ( rule__TriplesMap__SubjectMapAssignment_2 )? )
            // InternalR2RML.g:1158:2: ( rule__TriplesMap__SubjectMapAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getSubjectMapAssignment_2()); 
            }
            // InternalR2RML.g:1159:2: ( rule__TriplesMap__SubjectMapAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==42) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==33) ) {
                        alt10=1;
                    }
                }
            }
            else if ( (LA10_0==42) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==33) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalR2RML.g:1159:3: rule__TriplesMap__SubjectMapAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TriplesMap__SubjectMapAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getSubjectMapAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__2__Impl"


    // $ANTLR start "rule__TriplesMap__Group__3"
    // InternalR2RML.g:1167:1: rule__TriplesMap__Group__3 : rule__TriplesMap__Group__3__Impl ;
    public final void rule__TriplesMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1171:1: ( rule__TriplesMap__Group__3__Impl )
            // InternalR2RML.g:1172:2: rule__TriplesMap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriplesMap__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__3"


    // $ANTLR start "rule__TriplesMap__Group__3__Impl"
    // InternalR2RML.g:1178:1: rule__TriplesMap__Group__3__Impl : ( ( rule__TriplesMap__PredicateObjectMapsAssignment_3 )* ) ;
    public final void rule__TriplesMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1182:1: ( ( ( rule__TriplesMap__PredicateObjectMapsAssignment_3 )* ) )
            // InternalR2RML.g:1183:1: ( ( rule__TriplesMap__PredicateObjectMapsAssignment_3 )* )
            {
            // InternalR2RML.g:1183:1: ( ( rule__TriplesMap__PredicateObjectMapsAssignment_3 )* )
            // InternalR2RML.g:1184:2: ( rule__TriplesMap__PredicateObjectMapsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getPredicateObjectMapsAssignment_3()); 
            }
            // InternalR2RML.g:1185:2: ( rule__TriplesMap__PredicateObjectMapsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalR2RML.g:1185:3: rule__TriplesMap__PredicateObjectMapsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TriplesMap__PredicateObjectMapsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getPredicateObjectMapsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__Group__3__Impl"


    // $ANTLR start "rule__LogicalTable__Group__0"
    // InternalR2RML.g:1194:1: rule__LogicalTable__Group__0 : rule__LogicalTable__Group__0__Impl rule__LogicalTable__Group__1 ;
    public final void rule__LogicalTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1198:1: ( rule__LogicalTable__Group__0__Impl rule__LogicalTable__Group__1 )
            // InternalR2RML.g:1199:2: rule__LogicalTable__Group__0__Impl rule__LogicalTable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LogicalTable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__0"


    // $ANTLR start "rule__LogicalTable__Group__0__Impl"
    // InternalR2RML.g:1206:1: rule__LogicalTable__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__LogicalTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1210:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:1211:1: ( rulePrefixName )
            {
            // InternalR2RML.g:1211:1: ( rulePrefixName )
            // InternalR2RML.g:1212:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__0__Impl"


    // $ANTLR start "rule__LogicalTable__Group__1"
    // InternalR2RML.g:1221:1: rule__LogicalTable__Group__1 : rule__LogicalTable__Group__1__Impl rule__LogicalTable__Group__2 ;
    public final void rule__LogicalTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1225:1: ( rule__LogicalTable__Group__1__Impl rule__LogicalTable__Group__2 )
            // InternalR2RML.g:1226:2: rule__LogicalTable__Group__1__Impl rule__LogicalTable__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__LogicalTable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__1"


    // $ANTLR start "rule__LogicalTable__Group__1__Impl"
    // InternalR2RML.g:1233:1: rule__LogicalTable__Group__1__Impl : ( 'logicalTable' ) ;
    public final void rule__LogicalTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1237:1: ( ( 'logicalTable' ) )
            // InternalR2RML.g:1238:1: ( 'logicalTable' )
            {
            // InternalR2RML.g:1238:1: ( 'logicalTable' )
            // InternalR2RML.g:1239:2: 'logicalTable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getLogicalTableKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getLogicalTableKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__1__Impl"


    // $ANTLR start "rule__LogicalTable__Group__2"
    // InternalR2RML.g:1248:1: rule__LogicalTable__Group__2 : rule__LogicalTable__Group__2__Impl rule__LogicalTable__Group__3 ;
    public final void rule__LogicalTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1252:1: ( rule__LogicalTable__Group__2__Impl rule__LogicalTable__Group__3 )
            // InternalR2RML.g:1253:2: rule__LogicalTable__Group__2__Impl rule__LogicalTable__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LogicalTable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__2"


    // $ANTLR start "rule__LogicalTable__Group__2__Impl"
    // InternalR2RML.g:1260:1: rule__LogicalTable__Group__2__Impl : ( '[' ) ;
    public final void rule__LogicalTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1264:1: ( ( '[' ) )
            // InternalR2RML.g:1265:1: ( '[' )
            {
            // InternalR2RML.g:1265:1: ( '[' )
            // InternalR2RML.g:1266:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__2__Impl"


    // $ANTLR start "rule__LogicalTable__Group__3"
    // InternalR2RML.g:1275:1: rule__LogicalTable__Group__3 : rule__LogicalTable__Group__3__Impl rule__LogicalTable__Group__4 ;
    public final void rule__LogicalTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1279:1: ( rule__LogicalTable__Group__3__Impl rule__LogicalTable__Group__4 )
            // InternalR2RML.g:1280:2: rule__LogicalTable__Group__3__Impl rule__LogicalTable__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__LogicalTable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__3"


    // $ANTLR start "rule__LogicalTable__Group__3__Impl"
    // InternalR2RML.g:1287:1: rule__LogicalTable__Group__3__Impl : ( ( rule__LogicalTable__Alternatives_3 ) ) ;
    public final void rule__LogicalTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1291:1: ( ( ( rule__LogicalTable__Alternatives_3 ) ) )
            // InternalR2RML.g:1292:1: ( ( rule__LogicalTable__Alternatives_3 ) )
            {
            // InternalR2RML.g:1292:1: ( ( rule__LogicalTable__Alternatives_3 ) )
            // InternalR2RML.g:1293:2: ( rule__LogicalTable__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getAlternatives_3()); 
            }
            // InternalR2RML.g:1294:2: ( rule__LogicalTable__Alternatives_3 )
            // InternalR2RML.g:1294:3: rule__LogicalTable__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__3__Impl"


    // $ANTLR start "rule__LogicalTable__Group__4"
    // InternalR2RML.g:1302:1: rule__LogicalTable__Group__4 : rule__LogicalTable__Group__4__Impl rule__LogicalTable__Group__5 ;
    public final void rule__LogicalTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1306:1: ( rule__LogicalTable__Group__4__Impl rule__LogicalTable__Group__5 )
            // InternalR2RML.g:1307:2: rule__LogicalTable__Group__4__Impl rule__LogicalTable__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__LogicalTable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__4"


    // $ANTLR start "rule__LogicalTable__Group__4__Impl"
    // InternalR2RML.g:1314:1: rule__LogicalTable__Group__4__Impl : ( ']' ) ;
    public final void rule__LogicalTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1318:1: ( ( ']' ) )
            // InternalR2RML.g:1319:1: ( ']' )
            {
            // InternalR2RML.g:1319:1: ( ']' )
            // InternalR2RML.g:1320:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__4__Impl"


    // $ANTLR start "rule__LogicalTable__Group__5"
    // InternalR2RML.g:1329:1: rule__LogicalTable__Group__5 : rule__LogicalTable__Group__5__Impl ;
    public final void rule__LogicalTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1333:1: ( rule__LogicalTable__Group__5__Impl )
            // InternalR2RML.g:1334:2: rule__LogicalTable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__5"


    // $ANTLR start "rule__LogicalTable__Group__5__Impl"
    // InternalR2RML.g:1340:1: rule__LogicalTable__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__LogicalTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1344:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:1345:1: ( ( ';' )? )
            {
            // InternalR2RML.g:1345:1: ( ( ';' )? )
            // InternalR2RML.g:1346:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getSemicolonKeyword_5()); 
            }
            // InternalR2RML.g:1347:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalR2RML.g:1347:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group__5__Impl"


    // $ANTLR start "rule__LogicalTable__Group_3_0__0"
    // InternalR2RML.g:1356:1: rule__LogicalTable__Group_3_0__0 : rule__LogicalTable__Group_3_0__0__Impl rule__LogicalTable__Group_3_0__1 ;
    public final void rule__LogicalTable__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1360:1: ( rule__LogicalTable__Group_3_0__0__Impl rule__LogicalTable__Group_3_0__1 )
            // InternalR2RML.g:1361:2: rule__LogicalTable__Group_3_0__0__Impl rule__LogicalTable__Group_3_0__1
            {
            pushFollow(FOLLOW_12);
            rule__LogicalTable__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_0__0"


    // $ANTLR start "rule__LogicalTable__Group_3_0__0__Impl"
    // InternalR2RML.g:1368:1: rule__LogicalTable__Group_3_0__0__Impl : ( rulePrefixName ) ;
    public final void rule__LogicalTable__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1372:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:1373:1: ( rulePrefixName )
            {
            // InternalR2RML.g:1373:1: ( rulePrefixName )
            // InternalR2RML.g:1374:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_0__0__Impl"


    // $ANTLR start "rule__LogicalTable__Group_3_0__1"
    // InternalR2RML.g:1383:1: rule__LogicalTable__Group_3_0__1 : rule__LogicalTable__Group_3_0__1__Impl rule__LogicalTable__Group_3_0__2 ;
    public final void rule__LogicalTable__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1387:1: ( rule__LogicalTable__Group_3_0__1__Impl rule__LogicalTable__Group_3_0__2 )
            // InternalR2RML.g:1388:2: rule__LogicalTable__Group_3_0__1__Impl rule__LogicalTable__Group_3_0__2
            {
            pushFollow(FOLLOW_13);
            rule__LogicalTable__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_0__1"


    // $ANTLR start "rule__LogicalTable__Group_3_0__1__Impl"
    // InternalR2RML.g:1395:1: rule__LogicalTable__Group_3_0__1__Impl : ( 'sqlQuery' ) ;
    public final void rule__LogicalTable__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1399:1: ( ( 'sqlQuery' ) )
            // InternalR2RML.g:1400:1: ( 'sqlQuery' )
            {
            // InternalR2RML.g:1400:1: ( 'sqlQuery' )
            // InternalR2RML.g:1401:2: 'sqlQuery'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getSqlQueryKeyword_3_0_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getSqlQueryKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_0__1__Impl"


    // $ANTLR start "rule__LogicalTable__Group_3_0__2"
    // InternalR2RML.g:1410:1: rule__LogicalTable__Group_3_0__2 : rule__LogicalTable__Group_3_0__2__Impl ;
    public final void rule__LogicalTable__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1414:1: ( rule__LogicalTable__Group_3_0__2__Impl )
            // InternalR2RML.g:1415:2: rule__LogicalTable__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_0__2"


    // $ANTLR start "rule__LogicalTable__Group_3_0__2__Impl"
    // InternalR2RML.g:1421:1: rule__LogicalTable__Group_3_0__2__Impl : ( ( rule__LogicalTable__QueryAssignment_3_0_2 ) ) ;
    public final void rule__LogicalTable__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1425:1: ( ( ( rule__LogicalTable__QueryAssignment_3_0_2 ) ) )
            // InternalR2RML.g:1426:1: ( ( rule__LogicalTable__QueryAssignment_3_0_2 ) )
            {
            // InternalR2RML.g:1426:1: ( ( rule__LogicalTable__QueryAssignment_3_0_2 ) )
            // InternalR2RML.g:1427:2: ( rule__LogicalTable__QueryAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getQueryAssignment_3_0_2()); 
            }
            // InternalR2RML.g:1428:2: ( rule__LogicalTable__QueryAssignment_3_0_2 )
            // InternalR2RML.g:1428:3: rule__LogicalTable__QueryAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__QueryAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getQueryAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_0__2__Impl"


    // $ANTLR start "rule__LogicalTable__Group_3_1__0"
    // InternalR2RML.g:1437:1: rule__LogicalTable__Group_3_1__0 : rule__LogicalTable__Group_3_1__0__Impl rule__LogicalTable__Group_3_1__1 ;
    public final void rule__LogicalTable__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1441:1: ( rule__LogicalTable__Group_3_1__0__Impl rule__LogicalTable__Group_3_1__1 )
            // InternalR2RML.g:1442:2: rule__LogicalTable__Group_3_1__0__Impl rule__LogicalTable__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__LogicalTable__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_1__0"


    // $ANTLR start "rule__LogicalTable__Group_3_1__0__Impl"
    // InternalR2RML.g:1449:1: rule__LogicalTable__Group_3_1__0__Impl : ( rulePrefixName ) ;
    public final void rule__LogicalTable__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1453:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:1454:1: ( rulePrefixName )
            {
            // InternalR2RML.g:1454:1: ( rulePrefixName )
            // InternalR2RML.g:1455:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getPrefixNameParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_1__0__Impl"


    // $ANTLR start "rule__LogicalTable__Group_3_1__1"
    // InternalR2RML.g:1464:1: rule__LogicalTable__Group_3_1__1 : rule__LogicalTable__Group_3_1__1__Impl rule__LogicalTable__Group_3_1__2 ;
    public final void rule__LogicalTable__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1468:1: ( rule__LogicalTable__Group_3_1__1__Impl rule__LogicalTable__Group_3_1__2 )
            // InternalR2RML.g:1469:2: rule__LogicalTable__Group_3_1__1__Impl rule__LogicalTable__Group_3_1__2
            {
            pushFollow(FOLLOW_15);
            rule__LogicalTable__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_1__1"


    // $ANTLR start "rule__LogicalTable__Group_3_1__1__Impl"
    // InternalR2RML.g:1476:1: rule__LogicalTable__Group_3_1__1__Impl : ( 'tableName' ) ;
    public final void rule__LogicalTable__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1480:1: ( ( 'tableName' ) )
            // InternalR2RML.g:1481:1: ( 'tableName' )
            {
            // InternalR2RML.g:1481:1: ( 'tableName' )
            // InternalR2RML.g:1482:2: 'tableName'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getTableNameKeyword_3_1_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getTableNameKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_1__1__Impl"


    // $ANTLR start "rule__LogicalTable__Group_3_1__2"
    // InternalR2RML.g:1491:1: rule__LogicalTable__Group_3_1__2 : rule__LogicalTable__Group_3_1__2__Impl ;
    public final void rule__LogicalTable__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1495:1: ( rule__LogicalTable__Group_3_1__2__Impl )
            // InternalR2RML.g:1496:2: rule__LogicalTable__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_1__2"


    // $ANTLR start "rule__LogicalTable__Group_3_1__2__Impl"
    // InternalR2RML.g:1502:1: rule__LogicalTable__Group_3_1__2__Impl : ( ( rule__LogicalTable__TableNameAssignment_3_1_2 ) ) ;
    public final void rule__LogicalTable__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1506:1: ( ( ( rule__LogicalTable__TableNameAssignment_3_1_2 ) ) )
            // InternalR2RML.g:1507:1: ( ( rule__LogicalTable__TableNameAssignment_3_1_2 ) )
            {
            // InternalR2RML.g:1507:1: ( ( rule__LogicalTable__TableNameAssignment_3_1_2 ) )
            // InternalR2RML.g:1508:2: ( rule__LogicalTable__TableNameAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getTableNameAssignment_3_1_2()); 
            }
            // InternalR2RML.g:1509:2: ( rule__LogicalTable__TableNameAssignment_3_1_2 )
            // InternalR2RML.g:1509:3: rule__LogicalTable__TableNameAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalTable__TableNameAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getTableNameAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__Group_3_1__2__Impl"


    // $ANTLR start "rule__SubjectMap__Group__0"
    // InternalR2RML.g:1518:1: rule__SubjectMap__Group__0 : rule__SubjectMap__Group__0__Impl rule__SubjectMap__Group__1 ;
    public final void rule__SubjectMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1522:1: ( rule__SubjectMap__Group__0__Impl rule__SubjectMap__Group__1 )
            // InternalR2RML.g:1523:2: rule__SubjectMap__Group__0__Impl rule__SubjectMap__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SubjectMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__0"


    // $ANTLR start "rule__SubjectMap__Group__0__Impl"
    // InternalR2RML.g:1530:1: rule__SubjectMap__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__SubjectMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1534:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:1535:1: ( rulePrefixName )
            {
            // InternalR2RML.g:1535:1: ( rulePrefixName )
            // InternalR2RML.g:1536:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__0__Impl"


    // $ANTLR start "rule__SubjectMap__Group__1"
    // InternalR2RML.g:1545:1: rule__SubjectMap__Group__1 : rule__SubjectMap__Group__1__Impl rule__SubjectMap__Group__2 ;
    public final void rule__SubjectMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1549:1: ( rule__SubjectMap__Group__1__Impl rule__SubjectMap__Group__2 )
            // InternalR2RML.g:1550:2: rule__SubjectMap__Group__1__Impl rule__SubjectMap__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SubjectMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__1"


    // $ANTLR start "rule__SubjectMap__Group__1__Impl"
    // InternalR2RML.g:1557:1: rule__SubjectMap__Group__1__Impl : ( 'subjectMap' ) ;
    public final void rule__SubjectMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1561:1: ( ( 'subjectMap' ) )
            // InternalR2RML.g:1562:1: ( 'subjectMap' )
            {
            // InternalR2RML.g:1562:1: ( 'subjectMap' )
            // InternalR2RML.g:1563:2: 'subjectMap'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getSubjectMapKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getSubjectMapKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__1__Impl"


    // $ANTLR start "rule__SubjectMap__Group__2"
    // InternalR2RML.g:1572:1: rule__SubjectMap__Group__2 : rule__SubjectMap__Group__2__Impl rule__SubjectMap__Group__3 ;
    public final void rule__SubjectMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1576:1: ( rule__SubjectMap__Group__2__Impl rule__SubjectMap__Group__3 )
            // InternalR2RML.g:1577:2: rule__SubjectMap__Group__2__Impl rule__SubjectMap__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubjectMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__2"


    // $ANTLR start "rule__SubjectMap__Group__2__Impl"
    // InternalR2RML.g:1584:1: rule__SubjectMap__Group__2__Impl : ( '[' ) ;
    public final void rule__SubjectMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1588:1: ( ( '[' ) )
            // InternalR2RML.g:1589:1: ( '[' )
            {
            // InternalR2RML.g:1589:1: ( '[' )
            // InternalR2RML.g:1590:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__2__Impl"


    // $ANTLR start "rule__SubjectMap__Group__3"
    // InternalR2RML.g:1599:1: rule__SubjectMap__Group__3 : rule__SubjectMap__Group__3__Impl rule__SubjectMap__Group__4 ;
    public final void rule__SubjectMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1603:1: ( rule__SubjectMap__Group__3__Impl rule__SubjectMap__Group__4 )
            // InternalR2RML.g:1604:2: rule__SubjectMap__Group__3__Impl rule__SubjectMap__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__SubjectMap__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__3"


    // $ANTLR start "rule__SubjectMap__Group__3__Impl"
    // InternalR2RML.g:1611:1: rule__SubjectMap__Group__3__Impl : ( ( rule__SubjectMap__TemplateAssignment_3 ) ) ;
    public final void rule__SubjectMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1615:1: ( ( ( rule__SubjectMap__TemplateAssignment_3 ) ) )
            // InternalR2RML.g:1616:1: ( ( rule__SubjectMap__TemplateAssignment_3 ) )
            {
            // InternalR2RML.g:1616:1: ( ( rule__SubjectMap__TemplateAssignment_3 ) )
            // InternalR2RML.g:1617:2: ( rule__SubjectMap__TemplateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getTemplateAssignment_3()); 
            }
            // InternalR2RML.g:1618:2: ( rule__SubjectMap__TemplateAssignment_3 )
            // InternalR2RML.g:1618:3: rule__SubjectMap__TemplateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMap__TemplateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getTemplateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__3__Impl"


    // $ANTLR start "rule__SubjectMap__Group__4"
    // InternalR2RML.g:1626:1: rule__SubjectMap__Group__4 : rule__SubjectMap__Group__4__Impl rule__SubjectMap__Group__5 ;
    public final void rule__SubjectMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1630:1: ( rule__SubjectMap__Group__4__Impl rule__SubjectMap__Group__5 )
            // InternalR2RML.g:1631:2: rule__SubjectMap__Group__4__Impl rule__SubjectMap__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__SubjectMap__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__4"


    // $ANTLR start "rule__SubjectMap__Group__4__Impl"
    // InternalR2RML.g:1638:1: rule__SubjectMap__Group__4__Impl : ( ( rule__SubjectMap__ClassAssignment_4 )? ) ;
    public final void rule__SubjectMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1642:1: ( ( ( rule__SubjectMap__ClassAssignment_4 )? ) )
            // InternalR2RML.g:1643:1: ( ( rule__SubjectMap__ClassAssignment_4 )? )
            {
            // InternalR2RML.g:1643:1: ( ( rule__SubjectMap__ClassAssignment_4 )? )
            // InternalR2RML.g:1644:2: ( rule__SubjectMap__ClassAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getClassAssignment_4()); 
            }
            // InternalR2RML.g:1645:2: ( rule__SubjectMap__ClassAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalR2RML.g:1645:3: rule__SubjectMap__ClassAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubjectMap__ClassAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getClassAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__4__Impl"


    // $ANTLR start "rule__SubjectMap__Group__5"
    // InternalR2RML.g:1653:1: rule__SubjectMap__Group__5 : rule__SubjectMap__Group__5__Impl rule__SubjectMap__Group__6 ;
    public final void rule__SubjectMap__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1657:1: ( rule__SubjectMap__Group__5__Impl rule__SubjectMap__Group__6 )
            // InternalR2RML.g:1658:2: rule__SubjectMap__Group__5__Impl rule__SubjectMap__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SubjectMap__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__5"


    // $ANTLR start "rule__SubjectMap__Group__5__Impl"
    // InternalR2RML.g:1665:1: rule__SubjectMap__Group__5__Impl : ( ']' ) ;
    public final void rule__SubjectMap__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1669:1: ( ( ']' ) )
            // InternalR2RML.g:1670:1: ( ']' )
            {
            // InternalR2RML.g:1670:1: ( ']' )
            // InternalR2RML.g:1671:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__5__Impl"


    // $ANTLR start "rule__SubjectMap__Group__6"
    // InternalR2RML.g:1680:1: rule__SubjectMap__Group__6 : rule__SubjectMap__Group__6__Impl ;
    public final void rule__SubjectMap__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1684:1: ( rule__SubjectMap__Group__6__Impl )
            // InternalR2RML.g:1685:2: rule__SubjectMap__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMap__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__6"


    // $ANTLR start "rule__SubjectMap__Group__6__Impl"
    // InternalR2RML.g:1691:1: rule__SubjectMap__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__SubjectMap__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1695:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:1696:1: ( ( ';' )? )
            {
            // InternalR2RML.g:1696:1: ( ( ';' )? )
            // InternalR2RML.g:1697:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getSemicolonKeyword_6()); 
            }
            // InternalR2RML.g:1698:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalR2RML.g:1698:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__Group__6__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__0"
    // InternalR2RML.g:1707:1: rule__PredicateObjectMap__Group__0 : rule__PredicateObjectMap__Group__0__Impl rule__PredicateObjectMap__Group__1 ;
    public final void rule__PredicateObjectMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1711:1: ( rule__PredicateObjectMap__Group__0__Impl rule__PredicateObjectMap__Group__1 )
            // InternalR2RML.g:1712:2: rule__PredicateObjectMap__Group__0__Impl rule__PredicateObjectMap__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__PredicateObjectMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__0"


    // $ANTLR start "rule__PredicateObjectMap__Group__0__Impl"
    // InternalR2RML.g:1719:1: rule__PredicateObjectMap__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__PredicateObjectMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1723:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:1724:1: ( rulePrefixName )
            {
            // InternalR2RML.g:1724:1: ( rulePrefixName )
            // InternalR2RML.g:1725:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__0__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__1"
    // InternalR2RML.g:1734:1: rule__PredicateObjectMap__Group__1 : rule__PredicateObjectMap__Group__1__Impl rule__PredicateObjectMap__Group__2 ;
    public final void rule__PredicateObjectMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1738:1: ( rule__PredicateObjectMap__Group__1__Impl rule__PredicateObjectMap__Group__2 )
            // InternalR2RML.g:1739:2: rule__PredicateObjectMap__Group__1__Impl rule__PredicateObjectMap__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PredicateObjectMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__1"


    // $ANTLR start "rule__PredicateObjectMap__Group__1__Impl"
    // InternalR2RML.g:1746:1: rule__PredicateObjectMap__Group__1__Impl : ( 'predicateObjectMap' ) ;
    public final void rule__PredicateObjectMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1750:1: ( ( 'predicateObjectMap' ) )
            // InternalR2RML.g:1751:1: ( 'predicateObjectMap' )
            {
            // InternalR2RML.g:1751:1: ( 'predicateObjectMap' )
            // InternalR2RML.g:1752:2: 'predicateObjectMap'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getPredicateObjectMapKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getPredicateObjectMapKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__1__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__2"
    // InternalR2RML.g:1761:1: rule__PredicateObjectMap__Group__2 : rule__PredicateObjectMap__Group__2__Impl rule__PredicateObjectMap__Group__3 ;
    public final void rule__PredicateObjectMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1765:1: ( rule__PredicateObjectMap__Group__2__Impl rule__PredicateObjectMap__Group__3 )
            // InternalR2RML.g:1766:2: rule__PredicateObjectMap__Group__2__Impl rule__PredicateObjectMap__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PredicateObjectMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__2"


    // $ANTLR start "rule__PredicateObjectMap__Group__2__Impl"
    // InternalR2RML.g:1773:1: rule__PredicateObjectMap__Group__2__Impl : ( '[' ) ;
    public final void rule__PredicateObjectMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1777:1: ( ( '[' ) )
            // InternalR2RML.g:1778:1: ( '[' )
            {
            // InternalR2RML.g:1778:1: ( '[' )
            // InternalR2RML.g:1779:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__2__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__3"
    // InternalR2RML.g:1788:1: rule__PredicateObjectMap__Group__3 : rule__PredicateObjectMap__Group__3__Impl rule__PredicateObjectMap__Group__4 ;
    public final void rule__PredicateObjectMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1792:1: ( rule__PredicateObjectMap__Group__3__Impl rule__PredicateObjectMap__Group__4 )
            // InternalR2RML.g:1793:2: rule__PredicateObjectMap__Group__3__Impl rule__PredicateObjectMap__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PredicateObjectMap__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__3"


    // $ANTLR start "rule__PredicateObjectMap__Group__3__Impl"
    // InternalR2RML.g:1800:1: rule__PredicateObjectMap__Group__3__Impl : ( ( rule__PredicateObjectMap__PredicateAssignment_3 ) ) ;
    public final void rule__PredicateObjectMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1804:1: ( ( ( rule__PredicateObjectMap__PredicateAssignment_3 ) ) )
            // InternalR2RML.g:1805:1: ( ( rule__PredicateObjectMap__PredicateAssignment_3 ) )
            {
            // InternalR2RML.g:1805:1: ( ( rule__PredicateObjectMap__PredicateAssignment_3 ) )
            // InternalR2RML.g:1806:2: ( rule__PredicateObjectMap__PredicateAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getPredicateAssignment_3()); 
            }
            // InternalR2RML.g:1807:2: ( rule__PredicateObjectMap__PredicateAssignment_3 )
            // InternalR2RML.g:1807:3: rule__PredicateObjectMap__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__PredicateAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getPredicateAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__3__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__4"
    // InternalR2RML.g:1815:1: rule__PredicateObjectMap__Group__4 : rule__PredicateObjectMap__Group__4__Impl rule__PredicateObjectMap__Group__5 ;
    public final void rule__PredicateObjectMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1819:1: ( rule__PredicateObjectMap__Group__4__Impl rule__PredicateObjectMap__Group__5 )
            // InternalR2RML.g:1820:2: rule__PredicateObjectMap__Group__4__Impl rule__PredicateObjectMap__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__PredicateObjectMap__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__4"


    // $ANTLR start "rule__PredicateObjectMap__Group__4__Impl"
    // InternalR2RML.g:1827:1: rule__PredicateObjectMap__Group__4__Impl : ( ( rule__PredicateObjectMap__ObjectMapAssignment_4 ) ) ;
    public final void rule__PredicateObjectMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1831:1: ( ( ( rule__PredicateObjectMap__ObjectMapAssignment_4 ) ) )
            // InternalR2RML.g:1832:1: ( ( rule__PredicateObjectMap__ObjectMapAssignment_4 ) )
            {
            // InternalR2RML.g:1832:1: ( ( rule__PredicateObjectMap__ObjectMapAssignment_4 ) )
            // InternalR2RML.g:1833:2: ( rule__PredicateObjectMap__ObjectMapAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getObjectMapAssignment_4()); 
            }
            // InternalR2RML.g:1834:2: ( rule__PredicateObjectMap__ObjectMapAssignment_4 )
            // InternalR2RML.g:1834:3: rule__PredicateObjectMap__ObjectMapAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__ObjectMapAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getObjectMapAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__4__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__5"
    // InternalR2RML.g:1842:1: rule__PredicateObjectMap__Group__5 : rule__PredicateObjectMap__Group__5__Impl rule__PredicateObjectMap__Group__6 ;
    public final void rule__PredicateObjectMap__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1846:1: ( rule__PredicateObjectMap__Group__5__Impl rule__PredicateObjectMap__Group__6 )
            // InternalR2RML.g:1847:2: rule__PredicateObjectMap__Group__5__Impl rule__PredicateObjectMap__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__PredicateObjectMap__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__5"


    // $ANTLR start "rule__PredicateObjectMap__Group__5__Impl"
    // InternalR2RML.g:1854:1: rule__PredicateObjectMap__Group__5__Impl : ( ']' ) ;
    public final void rule__PredicateObjectMap__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1858:1: ( ( ']' ) )
            // InternalR2RML.g:1859:1: ( ']' )
            {
            // InternalR2RML.g:1859:1: ( ']' )
            // InternalR2RML.g:1860:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__5__Impl"


    // $ANTLR start "rule__PredicateObjectMap__Group__6"
    // InternalR2RML.g:1869:1: rule__PredicateObjectMap__Group__6 : rule__PredicateObjectMap__Group__6__Impl ;
    public final void rule__PredicateObjectMap__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1873:1: ( rule__PredicateObjectMap__Group__6__Impl )
            // InternalR2RML.g:1874:2: rule__PredicateObjectMap__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateObjectMap__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__6"


    // $ANTLR start "rule__PredicateObjectMap__Group__6__Impl"
    // InternalR2RML.g:1880:1: rule__PredicateObjectMap__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__PredicateObjectMap__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1884:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:1885:1: ( ( ';' )? )
            {
            // InternalR2RML.g:1885:1: ( ( ';' )? )
            // InternalR2RML.g:1886:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getSemicolonKeyword_6()); 
            }
            // InternalR2RML.g:1887:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalR2RML.g:1887:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__Group__6__Impl"


    // $ANTLR start "rule__ObjectMap__Group__0"
    // InternalR2RML.g:1896:1: rule__ObjectMap__Group__0 : rule__ObjectMap__Group__0__Impl rule__ObjectMap__Group__1 ;
    public final void rule__ObjectMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1900:1: ( rule__ObjectMap__Group__0__Impl rule__ObjectMap__Group__1 )
            // InternalR2RML.g:1901:2: rule__ObjectMap__Group__0__Impl rule__ObjectMap__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__0"


    // $ANTLR start "rule__ObjectMap__Group__0__Impl"
    // InternalR2RML.g:1908:1: rule__ObjectMap__Group__0__Impl : ( () ) ;
    public final void rule__ObjectMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1912:1: ( ( () ) )
            // InternalR2RML.g:1913:1: ( () )
            {
            // InternalR2RML.g:1913:1: ( () )
            // InternalR2RML.g:1914:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getObjectMapAction_0()); 
            }
            // InternalR2RML.g:1915:2: ()
            // InternalR2RML.g:1915:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getObjectMapAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__0__Impl"


    // $ANTLR start "rule__ObjectMap__Group__1"
    // InternalR2RML.g:1923:1: rule__ObjectMap__Group__1 : rule__ObjectMap__Group__1__Impl rule__ObjectMap__Group__2 ;
    public final void rule__ObjectMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1927:1: ( rule__ObjectMap__Group__1__Impl rule__ObjectMap__Group__2 )
            // InternalR2RML.g:1928:2: rule__ObjectMap__Group__1__Impl rule__ObjectMap__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ObjectMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__1"


    // $ANTLR start "rule__ObjectMap__Group__1__Impl"
    // InternalR2RML.g:1935:1: rule__ObjectMap__Group__1__Impl : ( rulePrefixName ) ;
    public final void rule__ObjectMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1939:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:1940:1: ( rulePrefixName )
            {
            // InternalR2RML.g:1940:1: ( rulePrefixName )
            // InternalR2RML.g:1941:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getPrefixNameParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getPrefixNameParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__1__Impl"


    // $ANTLR start "rule__ObjectMap__Group__2"
    // InternalR2RML.g:1950:1: rule__ObjectMap__Group__2 : rule__ObjectMap__Group__2__Impl rule__ObjectMap__Group__3 ;
    public final void rule__ObjectMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1954:1: ( rule__ObjectMap__Group__2__Impl rule__ObjectMap__Group__3 )
            // InternalR2RML.g:1955:2: rule__ObjectMap__Group__2__Impl rule__ObjectMap__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ObjectMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__2"


    // $ANTLR start "rule__ObjectMap__Group__2__Impl"
    // InternalR2RML.g:1962:1: rule__ObjectMap__Group__2__Impl : ( 'objectMap' ) ;
    public final void rule__ObjectMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1966:1: ( ( 'objectMap' ) )
            // InternalR2RML.g:1967:1: ( 'objectMap' )
            {
            // InternalR2RML.g:1967:1: ( 'objectMap' )
            // InternalR2RML.g:1968:2: 'objectMap'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getObjectMapKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getObjectMapKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__2__Impl"


    // $ANTLR start "rule__ObjectMap__Group__3"
    // InternalR2RML.g:1977:1: rule__ObjectMap__Group__3 : rule__ObjectMap__Group__3__Impl rule__ObjectMap__Group__4 ;
    public final void rule__ObjectMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1981:1: ( rule__ObjectMap__Group__3__Impl rule__ObjectMap__Group__4 )
            // InternalR2RML.g:1982:2: rule__ObjectMap__Group__3__Impl rule__ObjectMap__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ObjectMap__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__3"


    // $ANTLR start "rule__ObjectMap__Group__3__Impl"
    // InternalR2RML.g:1989:1: rule__ObjectMap__Group__3__Impl : ( '[' ) ;
    public final void rule__ObjectMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:1993:1: ( ( '[' ) )
            // InternalR2RML.g:1994:1: ( '[' )
            {
            // InternalR2RML.g:1994:1: ( '[' )
            // InternalR2RML.g:1995:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getLeftSquareBracketKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getLeftSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__3__Impl"


    // $ANTLR start "rule__ObjectMap__Group__4"
    // InternalR2RML.g:2004:1: rule__ObjectMap__Group__4 : rule__ObjectMap__Group__4__Impl rule__ObjectMap__Group__5 ;
    public final void rule__ObjectMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2008:1: ( rule__ObjectMap__Group__4__Impl rule__ObjectMap__Group__5 )
            // InternalR2RML.g:2009:2: rule__ObjectMap__Group__4__Impl rule__ObjectMap__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ObjectMap__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__4"


    // $ANTLR start "rule__ObjectMap__Group__4__Impl"
    // InternalR2RML.g:2016:1: rule__ObjectMap__Group__4__Impl : ( ( rule__ObjectMap__ColumnAssignment_4 )? ) ;
    public final void rule__ObjectMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2020:1: ( ( ( rule__ObjectMap__ColumnAssignment_4 )? ) )
            // InternalR2RML.g:2021:1: ( ( rule__ObjectMap__ColumnAssignment_4 )? )
            {
            // InternalR2RML.g:2021:1: ( ( rule__ObjectMap__ColumnAssignment_4 )? )
            // InternalR2RML.g:2022:2: ( rule__ObjectMap__ColumnAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getColumnAssignment_4()); 
            }
            // InternalR2RML.g:2023:2: ( rule__ObjectMap__ColumnAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==42) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==39) ) {
                        alt16=1;
                    }
                }
            }
            else if ( (LA16_0==42) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==39) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalR2RML.g:2023:3: rule__ObjectMap__ColumnAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectMap__ColumnAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getColumnAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__4__Impl"


    // $ANTLR start "rule__ObjectMap__Group__5"
    // InternalR2RML.g:2031:1: rule__ObjectMap__Group__5 : rule__ObjectMap__Group__5__Impl rule__ObjectMap__Group__6 ;
    public final void rule__ObjectMap__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2035:1: ( rule__ObjectMap__Group__5__Impl rule__ObjectMap__Group__6 )
            // InternalR2RML.g:2036:2: rule__ObjectMap__Group__5__Impl rule__ObjectMap__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ObjectMap__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__5"


    // $ANTLR start "rule__ObjectMap__Group__5__Impl"
    // InternalR2RML.g:2043:1: rule__ObjectMap__Group__5__Impl : ( ( rule__ObjectMap__TemplateAssignment_5 )? ) ;
    public final void rule__ObjectMap__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2047:1: ( ( ( rule__ObjectMap__TemplateAssignment_5 )? ) )
            // InternalR2RML.g:2048:1: ( ( rule__ObjectMap__TemplateAssignment_5 )? )
            {
            // InternalR2RML.g:2048:1: ( ( rule__ObjectMap__TemplateAssignment_5 )? )
            // InternalR2RML.g:2049:2: ( rule__ObjectMap__TemplateAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getTemplateAssignment_5()); 
            }
            // InternalR2RML.g:2050:2: ( rule__ObjectMap__TemplateAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==42) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==38) ) {
                        alt17=1;
                    }
                }
            }
            else if ( (LA17_0==42) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==38) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalR2RML.g:2050:3: rule__ObjectMap__TemplateAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectMap__TemplateAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getTemplateAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__5__Impl"


    // $ANTLR start "rule__ObjectMap__Group__6"
    // InternalR2RML.g:2058:1: rule__ObjectMap__Group__6 : rule__ObjectMap__Group__6__Impl rule__ObjectMap__Group__7 ;
    public final void rule__ObjectMap__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2062:1: ( rule__ObjectMap__Group__6__Impl rule__ObjectMap__Group__7 )
            // InternalR2RML.g:2063:2: rule__ObjectMap__Group__6__Impl rule__ObjectMap__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__ObjectMap__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__6"


    // $ANTLR start "rule__ObjectMap__Group__6__Impl"
    // InternalR2RML.g:2070:1: rule__ObjectMap__Group__6__Impl : ( ( rule__ObjectMap__ConstantAssignment_6 )? ) ;
    public final void rule__ObjectMap__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2074:1: ( ( ( rule__ObjectMap__ConstantAssignment_6 )? ) )
            // InternalR2RML.g:2075:1: ( ( rule__ObjectMap__ConstantAssignment_6 )? )
            {
            // InternalR2RML.g:2075:1: ( ( rule__ObjectMap__ConstantAssignment_6 )? )
            // InternalR2RML.g:2076:2: ( rule__ObjectMap__ConstantAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getConstantAssignment_6()); 
            }
            // InternalR2RML.g:2077:2: ( rule__ObjectMap__ConstantAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==42) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==41) ) {
                        alt18=1;
                    }
                }
            }
            else if ( (LA18_0==42) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==41) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalR2RML.g:2077:3: rule__ObjectMap__ConstantAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectMap__ConstantAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getConstantAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__6__Impl"


    // $ANTLR start "rule__ObjectMap__Group__7"
    // InternalR2RML.g:2085:1: rule__ObjectMap__Group__7 : rule__ObjectMap__Group__7__Impl rule__ObjectMap__Group__8 ;
    public final void rule__ObjectMap__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2089:1: ( rule__ObjectMap__Group__7__Impl rule__ObjectMap__Group__8 )
            // InternalR2RML.g:2090:2: rule__ObjectMap__Group__7__Impl rule__ObjectMap__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ObjectMap__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__7"


    // $ANTLR start "rule__ObjectMap__Group__7__Impl"
    // InternalR2RML.g:2097:1: rule__ObjectMap__Group__7__Impl : ( ( rule__ObjectMap__DatatypeAssignment_7 )? ) ;
    public final void rule__ObjectMap__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2101:1: ( ( ( rule__ObjectMap__DatatypeAssignment_7 )? ) )
            // InternalR2RML.g:2102:1: ( ( rule__ObjectMap__DatatypeAssignment_7 )? )
            {
            // InternalR2RML.g:2102:1: ( ( rule__ObjectMap__DatatypeAssignment_7 )? )
            // InternalR2RML.g:2103:2: ( rule__ObjectMap__DatatypeAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getDatatypeAssignment_7()); 
            }
            // InternalR2RML.g:2104:2: ( rule__ObjectMap__DatatypeAssignment_7 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalR2RML.g:2104:3: rule__ObjectMap__DatatypeAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectMap__DatatypeAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getDatatypeAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__7__Impl"


    // $ANTLR start "rule__ObjectMap__Group__8"
    // InternalR2RML.g:2112:1: rule__ObjectMap__Group__8 : rule__ObjectMap__Group__8__Impl rule__ObjectMap__Group__9 ;
    public final void rule__ObjectMap__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2116:1: ( rule__ObjectMap__Group__8__Impl rule__ObjectMap__Group__9 )
            // InternalR2RML.g:2117:2: rule__ObjectMap__Group__8__Impl rule__ObjectMap__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__ObjectMap__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__8"


    // $ANTLR start "rule__ObjectMap__Group__8__Impl"
    // InternalR2RML.g:2124:1: rule__ObjectMap__Group__8__Impl : ( ']' ) ;
    public final void rule__ObjectMap__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2128:1: ( ( ']' ) )
            // InternalR2RML.g:2129:1: ( ']' )
            {
            // InternalR2RML.g:2129:1: ( ']' )
            // InternalR2RML.g:2130:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getRightSquareBracketKeyword_8()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getRightSquareBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__8__Impl"


    // $ANTLR start "rule__ObjectMap__Group__9"
    // InternalR2RML.g:2139:1: rule__ObjectMap__Group__9 : rule__ObjectMap__Group__9__Impl ;
    public final void rule__ObjectMap__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2143:1: ( rule__ObjectMap__Group__9__Impl )
            // InternalR2RML.g:2144:2: rule__ObjectMap__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectMap__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__9"


    // $ANTLR start "rule__ObjectMap__Group__9__Impl"
    // InternalR2RML.g:2150:1: rule__ObjectMap__Group__9__Impl : ( ( ';' )? ) ;
    public final void rule__ObjectMap__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2154:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2155:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2155:1: ( ( ';' )? )
            // InternalR2RML.g:2156:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getSemicolonKeyword_9()); 
            }
            // InternalR2RML.g:2157:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalR2RML.g:2157:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__Group__9__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalR2RML.g:2166:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2170:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalR2RML.g:2171:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalR2RML.g:2178:1: rule__Class__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2182:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:2183:1: ( rulePrefixName )
            {
            // InternalR2RML.g:2183:1: ( rulePrefixName )
            // InternalR2RML.g:2184:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalR2RML.g:2193:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2197:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalR2RML.g:2198:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalR2RML.g:2205:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2209:1: ( ( 'class' ) )
            // InternalR2RML.g:2210:1: ( 'class' )
            {
            // InternalR2RML.g:2210:1: ( 'class' )
            // InternalR2RML.g:2211:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalR2RML.g:2220:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2224:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalR2RML.g:2225:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalR2RML.g:2232:1: rule__Class__Group__2__Impl : ( ( rule__Class__ClassNameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2236:1: ( ( ( rule__Class__ClassNameAssignment_2 ) ) )
            // InternalR2RML.g:2237:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            {
            // InternalR2RML.g:2237:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            // InternalR2RML.g:2238:2: ( rule__Class__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassNameAssignment_2()); 
            }
            // InternalR2RML.g:2239:2: ( rule__Class__ClassNameAssignment_2 )
            // InternalR2RML.g:2239:3: rule__Class__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__ClassNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalR2RML.g:2247:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2251:1: ( rule__Class__Group__3__Impl )
            // InternalR2RML.g:2252:2: rule__Class__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalR2RML.g:2258:1: rule__Class__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2262:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2263:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2263:1: ( ( ';' )? )
            // InternalR2RML.g:2264:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSemicolonKeyword_3()); 
            }
            // InternalR2RML.g:2265:2: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalR2RML.g:2265:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalR2RML.g:2274:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2278:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalR2RML.g:2279:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Predicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalR2RML.g:2286:1: rule__Predicate__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2290:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:2291:1: ( rulePrefixName )
            {
            // InternalR2RML.g:2291:1: ( rulePrefixName )
            // InternalR2RML.g:2292:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalR2RML.g:2301:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2305:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalR2RML.g:2306:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Predicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalR2RML.g:2313:1: rule__Predicate__Group__1__Impl : ( 'predicate' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2317:1: ( ( 'predicate' ) )
            // InternalR2RML.g:2318:1: ( 'predicate' )
            {
            // InternalR2RML.g:2318:1: ( 'predicate' )
            // InternalR2RML.g:2319:2: 'predicate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPredicateKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPredicateKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // InternalR2RML.g:2328:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2332:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalR2RML.g:2333:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Predicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // InternalR2RML.g:2340:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__PredicateNameAssignment_2 ) ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2344:1: ( ( ( rule__Predicate__PredicateNameAssignment_2 ) ) )
            // InternalR2RML.g:2345:1: ( ( rule__Predicate__PredicateNameAssignment_2 ) )
            {
            // InternalR2RML.g:2345:1: ( ( rule__Predicate__PredicateNameAssignment_2 ) )
            // InternalR2RML.g:2346:2: ( rule__Predicate__PredicateNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPredicateNameAssignment_2()); 
            }
            // InternalR2RML.g:2347:2: ( rule__Predicate__PredicateNameAssignment_2 )
            // InternalR2RML.g:2347:3: rule__Predicate__PredicateNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__PredicateNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPredicateNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // InternalR2RML.g:2355:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2359:1: ( rule__Predicate__Group__3__Impl )
            // InternalR2RML.g:2360:2: rule__Predicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // InternalR2RML.g:2366:1: rule__Predicate__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2370:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2371:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2371:1: ( ( ';' )? )
            // InternalR2RML.g:2372:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getSemicolonKeyword_3()); 
            }
            // InternalR2RML.g:2373:2: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalR2RML.g:2373:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // InternalR2RML.g:2382:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2386:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalR2RML.g:2387:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Template__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // InternalR2RML.g:2394:1: rule__Template__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2398:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:2399:1: ( rulePrefixName )
            {
            // InternalR2RML.g:2399:1: ( rulePrefixName )
            // InternalR2RML.g:2400:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // InternalR2RML.g:2409:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2413:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalR2RML.g:2414:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Template__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // InternalR2RML.g:2421:1: rule__Template__Group__1__Impl : ( 'template' ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2425:1: ( ( 'template' ) )
            // InternalR2RML.g:2426:1: ( 'template' )
            {
            // InternalR2RML.g:2426:1: ( 'template' )
            // InternalR2RML.g:2427:2: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // InternalR2RML.g:2436:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2440:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalR2RML.g:2441:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Template__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // InternalR2RML.g:2448:1: rule__Template__Group__2__Impl : ( ( rule__Template__NameAssignment_2 ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2452:1: ( ( ( rule__Template__NameAssignment_2 ) ) )
            // InternalR2RML.g:2453:1: ( ( rule__Template__NameAssignment_2 ) )
            {
            // InternalR2RML.g:2453:1: ( ( rule__Template__NameAssignment_2 ) )
            // InternalR2RML.g:2454:2: ( rule__Template__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
            }
            // InternalR2RML.g:2455:2: ( rule__Template__NameAssignment_2 )
            // InternalR2RML.g:2455:3: rule__Template__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Template__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // InternalR2RML.g:2463:1: rule__Template__Group__3 : rule__Template__Group__3__Impl ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2467:1: ( rule__Template__Group__3__Impl )
            // InternalR2RML.g:2468:2: rule__Template__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // InternalR2RML.g:2474:1: rule__Template__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2478:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2479:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2479:1: ( ( ';' )? )
            // InternalR2RML.g:2480:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getSemicolonKeyword_3()); 
            }
            // InternalR2RML.g:2481:2: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalR2RML.g:2481:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalR2RML.g:2490:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2494:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalR2RML.g:2495:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Column__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalR2RML.g:2502:1: rule__Column__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2506:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:2507:1: ( rulePrefixName )
            {
            // InternalR2RML.g:2507:1: ( rulePrefixName )
            // InternalR2RML.g:2508:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalR2RML.g:2517:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2521:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalR2RML.g:2522:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Column__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalR2RML.g:2529:1: rule__Column__Group__1__Impl : ( 'column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2533:1: ( ( 'column' ) )
            // InternalR2RML.g:2534:1: ( 'column' )
            {
            // InternalR2RML.g:2534:1: ( 'column' )
            // InternalR2RML.g:2535:2: 'column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalR2RML.g:2544:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2548:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalR2RML.g:2549:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalR2RML.g:2556:1: rule__Column__Group__2__Impl : ( ( rule__Column__NameAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2560:1: ( ( ( rule__Column__NameAssignment_2 ) ) )
            // InternalR2RML.g:2561:1: ( ( rule__Column__NameAssignment_2 ) )
            {
            // InternalR2RML.g:2561:1: ( ( rule__Column__NameAssignment_2 ) )
            // InternalR2RML.g:2562:2: ( rule__Column__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            }
            // InternalR2RML.g:2563:2: ( rule__Column__NameAssignment_2 )
            // InternalR2RML.g:2563:3: rule__Column__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalR2RML.g:2571:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2575:1: ( rule__Column__Group__3__Impl )
            // InternalR2RML.g:2576:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalR2RML.g:2582:1: rule__Column__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2586:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2587:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2587:1: ( ( ';' )? )
            // InternalR2RML.g:2588:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getSemicolonKeyword_3()); 
            }
            // InternalR2RML.g:2589:2: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalR2RML.g:2589:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Datatype__Group__0"
    // InternalR2RML.g:2598:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2602:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalR2RML.g:2603:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Datatype__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0"


    // $ANTLR start "rule__Datatype__Group__0__Impl"
    // InternalR2RML.g:2610:1: rule__Datatype__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2614:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:2615:1: ( rulePrefixName )
            {
            // InternalR2RML.g:2615:1: ( rulePrefixName )
            // InternalR2RML.g:2616:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0__Impl"


    // $ANTLR start "rule__Datatype__Group__1"
    // InternalR2RML.g:2625:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2629:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalR2RML.g:2630:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Datatype__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1"


    // $ANTLR start "rule__Datatype__Group__1__Impl"
    // InternalR2RML.g:2637:1: rule__Datatype__Group__1__Impl : ( 'datatype' ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2641:1: ( ( 'datatype' ) )
            // InternalR2RML.g:2642:1: ( 'datatype' )
            {
            // InternalR2RML.g:2642:1: ( 'datatype' )
            // InternalR2RML.g:2643:2: 'datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1__Impl"


    // $ANTLR start "rule__Datatype__Group__2"
    // InternalR2RML.g:2652:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl rule__Datatype__Group__3 ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2656:1: ( rule__Datatype__Group__2__Impl rule__Datatype__Group__3 )
            // InternalR2RML.g:2657:2: rule__Datatype__Group__2__Impl rule__Datatype__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Datatype__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2"


    // $ANTLR start "rule__Datatype__Group__2__Impl"
    // InternalR2RML.g:2664:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__DtNameAssignment_2 ) ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2668:1: ( ( ( rule__Datatype__DtNameAssignment_2 ) ) )
            // InternalR2RML.g:2669:1: ( ( rule__Datatype__DtNameAssignment_2 ) )
            {
            // InternalR2RML.g:2669:1: ( ( rule__Datatype__DtNameAssignment_2 ) )
            // InternalR2RML.g:2670:2: ( rule__Datatype__DtNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getDtNameAssignment_2()); 
            }
            // InternalR2RML.g:2671:2: ( rule__Datatype__DtNameAssignment_2 )
            // InternalR2RML.g:2671:3: rule__Datatype__DtNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__DtNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getDtNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2__Impl"


    // $ANTLR start "rule__Datatype__Group__3"
    // InternalR2RML.g:2679:1: rule__Datatype__Group__3 : rule__Datatype__Group__3__Impl ;
    public final void rule__Datatype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2683:1: ( rule__Datatype__Group__3__Impl )
            // InternalR2RML.g:2684:2: rule__Datatype__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__3"


    // $ANTLR start "rule__Datatype__Group__3__Impl"
    // InternalR2RML.g:2690:1: rule__Datatype__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Datatype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2694:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2695:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2695:1: ( ( ';' )? )
            // InternalR2RML.g:2696:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getSemicolonKeyword_3()); 
            }
            // InternalR2RML.g:2697:2: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalR2RML.g:2697:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalR2RML.g:2706:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2710:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalR2RML.g:2711:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalR2RML.g:2718:1: rule__Constant__Group__0__Impl : ( rulePrefixName ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2722:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:2723:1: ( rulePrefixName )
            {
            // InternalR2RML.g:2723:1: ( rulePrefixName )
            // InternalR2RML.g:2724:2: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getPrefixNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getPrefixNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalR2RML.g:2733:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2737:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalR2RML.g:2738:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalR2RML.g:2745:1: rule__Constant__Group__1__Impl : ( 'constant' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2749:1: ( ( 'constant' ) )
            // InternalR2RML.g:2750:1: ( 'constant' )
            {
            // InternalR2RML.g:2750:1: ( 'constant' )
            // InternalR2RML.g:2751:2: 'constant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstantKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstantKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalR2RML.g:2760:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2764:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalR2RML.g:2765:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalR2RML.g:2772:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Alternatives_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2776:1: ( ( ( rule__Constant__Alternatives_2 ) ) )
            // InternalR2RML.g:2777:1: ( ( rule__Constant__Alternatives_2 ) )
            {
            // InternalR2RML.g:2777:1: ( ( rule__Constant__Alternatives_2 ) )
            // InternalR2RML.g:2778:2: ( rule__Constant__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives_2()); 
            }
            // InternalR2RML.g:2779:2: ( rule__Constant__Alternatives_2 )
            // InternalR2RML.g:2779:3: rule__Constant__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalR2RML.g:2787:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2791:1: ( rule__Constant__Group__3__Impl )
            // InternalR2RML.g:2792:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalR2RML.g:2798:1: rule__Constant__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2802:1: ( ( ( ';' )? ) )
            // InternalR2RML.g:2803:1: ( ( ';' )? )
            {
            // InternalR2RML.g:2803:1: ( ( ';' )? )
            // InternalR2RML.g:2804:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getSemicolonKeyword_3()); 
            }
            // InternalR2RML.g:2805:2: ( ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalR2RML.g:2805:3: ';'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Qname__Group__0"
    // InternalR2RML.g:2814:1: rule__Qname__Group__0 : rule__Qname__Group__0__Impl rule__Qname__Group__1 ;
    public final void rule__Qname__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2818:1: ( rule__Qname__Group__0__Impl rule__Qname__Group__1 )
            // InternalR2RML.g:2819:2: rule__Qname__Group__0__Impl rule__Qname__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Qname__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qname__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__0"


    // $ANTLR start "rule__Qname__Group__0__Impl"
    // InternalR2RML.g:2826:1: rule__Qname__Group__0__Impl : ( () ) ;
    public final void rule__Qname__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2830:1: ( ( () ) )
            // InternalR2RML.g:2831:1: ( () )
            {
            // InternalR2RML.g:2831:1: ( () )
            // InternalR2RML.g:2832:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getQnameAction_0()); 
            }
            // InternalR2RML.g:2833:2: ()
            // InternalR2RML.g:2833:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getQnameAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__0__Impl"


    // $ANTLR start "rule__Qname__Group__1"
    // InternalR2RML.g:2841:1: rule__Qname__Group__1 : rule__Qname__Group__1__Impl rule__Qname__Group__2 ;
    public final void rule__Qname__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2845:1: ( rule__Qname__Group__1__Impl rule__Qname__Group__2 )
            // InternalR2RML.g:2846:2: rule__Qname__Group__1__Impl rule__Qname__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Qname__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qname__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__1"


    // $ANTLR start "rule__Qname__Group__1__Impl"
    // InternalR2RML.g:2853:1: rule__Qname__Group__1__Impl : ( ( rule__Qname__PrefixNameAssignment_1 ) ) ;
    public final void rule__Qname__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2857:1: ( ( ( rule__Qname__PrefixNameAssignment_1 ) ) )
            // InternalR2RML.g:2858:1: ( ( rule__Qname__PrefixNameAssignment_1 ) )
            {
            // InternalR2RML.g:2858:1: ( ( rule__Qname__PrefixNameAssignment_1 ) )
            // InternalR2RML.g:2859:2: ( rule__Qname__PrefixNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getPrefixNameAssignment_1()); 
            }
            // InternalR2RML.g:2860:2: ( rule__Qname__PrefixNameAssignment_1 )
            // InternalR2RML.g:2860:3: rule__Qname__PrefixNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Qname__PrefixNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getPrefixNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__1__Impl"


    // $ANTLR start "rule__Qname__Group__2"
    // InternalR2RML.g:2868:1: rule__Qname__Group__2 : rule__Qname__Group__2__Impl ;
    public final void rule__Qname__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2872:1: ( rule__Qname__Group__2__Impl )
            // InternalR2RML.g:2873:2: rule__Qname__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qname__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__2"


    // $ANTLR start "rule__Qname__Group__2__Impl"
    // InternalR2RML.g:2879:1: rule__Qname__Group__2__Impl : ( ( rule__Qname__NameAssignment_2 )? ) ;
    public final void rule__Qname__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2883:1: ( ( ( rule__Qname__NameAssignment_2 )? ) )
            // InternalR2RML.g:2884:1: ( ( rule__Qname__NameAssignment_2 )? )
            {
            // InternalR2RML.g:2884:1: ( ( rule__Qname__NameAssignment_2 )? )
            // InternalR2RML.g:2885:2: ( rule__Qname__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getNameAssignment_2()); 
            }
            // InternalR2RML.g:2886:2: ( rule__Qname__NameAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred32_InternalR2RML()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalR2RML.g:2886:3: rule__Qname__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qname__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__Group__2__Impl"


    // $ANTLR start "rule__PrefixName__Group__0"
    // InternalR2RML.g:2895:1: rule__PrefixName__Group__0 : rule__PrefixName__Group__0__Impl rule__PrefixName__Group__1 ;
    public final void rule__PrefixName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2899:1: ( rule__PrefixName__Group__0__Impl rule__PrefixName__Group__1 )
            // InternalR2RML.g:2900:2: rule__PrefixName__Group__0__Impl rule__PrefixName__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrefixName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrefixName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__0"


    // $ANTLR start "rule__PrefixName__Group__0__Impl"
    // InternalR2RML.g:2907:1: rule__PrefixName__Group__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__PrefixName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2911:1: ( ( ( RULE_ID )? ) )
            // InternalR2RML.g:2912:1: ( ( RULE_ID )? )
            {
            // InternalR2RML.g:2912:1: ( ( RULE_ID )? )
            // InternalR2RML.g:2913:2: ( RULE_ID )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameAccess().getIDTerminalRuleCall_0()); 
            }
            // InternalR2RML.g:2914:2: ( RULE_ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalR2RML.g:2914:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__0__Impl"


    // $ANTLR start "rule__PrefixName__Group__1"
    // InternalR2RML.g:2922:1: rule__PrefixName__Group__1 : rule__PrefixName__Group__1__Impl ;
    public final void rule__PrefixName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2926:1: ( rule__PrefixName__Group__1__Impl )
            // InternalR2RML.g:2927:2: rule__PrefixName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrefixName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__1"


    // $ANTLR start "rule__PrefixName__Group__1__Impl"
    // InternalR2RML.g:2933:1: rule__PrefixName__Group__1__Impl : ( ':' ) ;
    public final void rule__PrefixName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2937:1: ( ( ':' ) )
            // InternalR2RML.g:2938:1: ( ':' )
            {
            // InternalR2RML.g:2938:1: ( ':' )
            // InternalR2RML.g:2939:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixNameAccess().getColonKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixNameAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixName__Group__1__Impl"


    // $ANTLR start "rule__SimpleSelectStatement__Group__0"
    // InternalR2RML.g:2949:1: rule__SimpleSelectStatement__Group__0 : rule__SimpleSelectStatement__Group__0__Impl rule__SimpleSelectStatement__Group__1 ;
    public final void rule__SimpleSelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2953:1: ( rule__SimpleSelectStatement__Group__0__Impl rule__SimpleSelectStatement__Group__1 )
            // InternalR2RML.g:2954:2: rule__SimpleSelectStatement__Group__0__Impl rule__SimpleSelectStatement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__SimpleSelectStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__0"


    // $ANTLR start "rule__SimpleSelectStatement__Group__0__Impl"
    // InternalR2RML.g:2961:1: rule__SimpleSelectStatement__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SimpleSelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2965:1: ( ( 'SELECT' ) )
            // InternalR2RML.g:2966:1: ( 'SELECT' )
            {
            // InternalR2RML.g:2966:1: ( 'SELECT' )
            // InternalR2RML.g:2967:2: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getSELECTKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getSELECTKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SimpleSelectStatement__Group__1"
    // InternalR2RML.g:2976:1: rule__SimpleSelectStatement__Group__1 : rule__SimpleSelectStatement__Group__1__Impl rule__SimpleSelectStatement__Group__2 ;
    public final void rule__SimpleSelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2980:1: ( rule__SimpleSelectStatement__Group__1__Impl rule__SimpleSelectStatement__Group__2 )
            // InternalR2RML.g:2981:2: rule__SimpleSelectStatement__Group__1__Impl rule__SimpleSelectStatement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__SimpleSelectStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__1"


    // $ANTLR start "rule__SimpleSelectStatement__Group__1__Impl"
    // InternalR2RML.g:2988:1: rule__SimpleSelectStatement__Group__1__Impl : ( ( rule__SimpleSelectStatement__SelectedColumnsAssignment_1 ) ) ;
    public final void rule__SimpleSelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:2992:1: ( ( ( rule__SimpleSelectStatement__SelectedColumnsAssignment_1 ) ) )
            // InternalR2RML.g:2993:1: ( ( rule__SimpleSelectStatement__SelectedColumnsAssignment_1 ) )
            {
            // InternalR2RML.g:2993:1: ( ( rule__SimpleSelectStatement__SelectedColumnsAssignment_1 ) )
            // InternalR2RML.g:2994:2: ( rule__SimpleSelectStatement__SelectedColumnsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getSelectedColumnsAssignment_1()); 
            }
            // InternalR2RML.g:2995:2: ( rule__SimpleSelectStatement__SelectedColumnsAssignment_1 )
            // InternalR2RML.g:2995:3: rule__SimpleSelectStatement__SelectedColumnsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__SelectedColumnsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getSelectedColumnsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SimpleSelectStatement__Group__2"
    // InternalR2RML.g:3003:1: rule__SimpleSelectStatement__Group__2 : rule__SimpleSelectStatement__Group__2__Impl rule__SimpleSelectStatement__Group__3 ;
    public final void rule__SimpleSelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3007:1: ( rule__SimpleSelectStatement__Group__2__Impl rule__SimpleSelectStatement__Group__3 )
            // InternalR2RML.g:3008:2: rule__SimpleSelectStatement__Group__2__Impl rule__SimpleSelectStatement__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SimpleSelectStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__2"


    // $ANTLR start "rule__SimpleSelectStatement__Group__2__Impl"
    // InternalR2RML.g:3015:1: rule__SimpleSelectStatement__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__SimpleSelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3019:1: ( ( 'FROM' ) )
            // InternalR2RML.g:3020:1: ( 'FROM' )
            {
            // InternalR2RML.g:3020:1: ( 'FROM' )
            // InternalR2RML.g:3021:2: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getFROMKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getFROMKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SimpleSelectStatement__Group__3"
    // InternalR2RML.g:3030:1: rule__SimpleSelectStatement__Group__3 : rule__SimpleSelectStatement__Group__3__Impl rule__SimpleSelectStatement__Group__4 ;
    public final void rule__SimpleSelectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3034:1: ( rule__SimpleSelectStatement__Group__3__Impl rule__SimpleSelectStatement__Group__4 )
            // InternalR2RML.g:3035:2: rule__SimpleSelectStatement__Group__3__Impl rule__SimpleSelectStatement__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__SimpleSelectStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__3"


    // $ANTLR start "rule__SimpleSelectStatement__Group__3__Impl"
    // InternalR2RML.g:3042:1: rule__SimpleSelectStatement__Group__3__Impl : ( ( rule__SimpleSelectStatement__TableNameAssignment_3 ) ) ;
    public final void rule__SimpleSelectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3046:1: ( ( ( rule__SimpleSelectStatement__TableNameAssignment_3 ) ) )
            // InternalR2RML.g:3047:1: ( ( rule__SimpleSelectStatement__TableNameAssignment_3 ) )
            {
            // InternalR2RML.g:3047:1: ( ( rule__SimpleSelectStatement__TableNameAssignment_3 ) )
            // InternalR2RML.g:3048:2: ( rule__SimpleSelectStatement__TableNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getTableNameAssignment_3()); 
            }
            // InternalR2RML.g:3049:2: ( rule__SimpleSelectStatement__TableNameAssignment_3 )
            // InternalR2RML.g:3049:3: rule__SimpleSelectStatement__TableNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__TableNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getTableNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__3__Impl"


    // $ANTLR start "rule__SimpleSelectStatement__Group__4"
    // InternalR2RML.g:3057:1: rule__SimpleSelectStatement__Group__4 : rule__SimpleSelectStatement__Group__4__Impl ;
    public final void rule__SimpleSelectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3061:1: ( rule__SimpleSelectStatement__Group__4__Impl )
            // InternalR2RML.g:3062:2: rule__SimpleSelectStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__4"


    // $ANTLR start "rule__SimpleSelectStatement__Group__4__Impl"
    // InternalR2RML.g:3068:1: rule__SimpleSelectStatement__Group__4__Impl : ( ( rule__SimpleSelectStatement__WhereClauseAssignment_4 )? ) ;
    public final void rule__SimpleSelectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3072:1: ( ( ( rule__SimpleSelectStatement__WhereClauseAssignment_4 )? ) )
            // InternalR2RML.g:3073:1: ( ( rule__SimpleSelectStatement__WhereClauseAssignment_4 )? )
            {
            // InternalR2RML.g:3073:1: ( ( rule__SimpleSelectStatement__WhereClauseAssignment_4 )? )
            // InternalR2RML.g:3074:2: ( rule__SimpleSelectStatement__WhereClauseAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getWhereClauseAssignment_4()); 
            }
            // InternalR2RML.g:3075:2: ( rule__SimpleSelectStatement__WhereClauseAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalR2RML.g:3075:3: rule__SimpleSelectStatement__WhereClauseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelectStatement__WhereClauseAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getWhereClauseAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__Group__4__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__0"
    // InternalR2RML.g:3084:1: rule__SelectedColumns__Group__0 : rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1 ;
    public final void rule__SelectedColumns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3088:1: ( rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1 )
            // InternalR2RML.g:3089:2: rule__SelectedColumns__Group__0__Impl rule__SelectedColumns__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SelectedColumns__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__0"


    // $ANTLR start "rule__SelectedColumns__Group__0__Impl"
    // InternalR2RML.g:3096:1: rule__SelectedColumns__Group__0__Impl : ( ( rule__SelectedColumns__ColumnsAssignment_0 ) ) ;
    public final void rule__SelectedColumns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3100:1: ( ( ( rule__SelectedColumns__ColumnsAssignment_0 ) ) )
            // InternalR2RML.g:3101:1: ( ( rule__SelectedColumns__ColumnsAssignment_0 ) )
            {
            // InternalR2RML.g:3101:1: ( ( rule__SelectedColumns__ColumnsAssignment_0 ) )
            // InternalR2RML.g:3102:2: ( rule__SelectedColumns__ColumnsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_0()); 
            }
            // InternalR2RML.g:3103:2: ( rule__SelectedColumns__ColumnsAssignment_0 )
            // InternalR2RML.g:3103:3: rule__SelectedColumns__ColumnsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__ColumnsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group__1"
    // InternalR2RML.g:3111:1: rule__SelectedColumns__Group__1 : rule__SelectedColumns__Group__1__Impl ;
    public final void rule__SelectedColumns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3115:1: ( rule__SelectedColumns__Group__1__Impl )
            // InternalR2RML.g:3116:2: rule__SelectedColumns__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__1"


    // $ANTLR start "rule__SelectedColumns__Group__1__Impl"
    // InternalR2RML.g:3122:1: rule__SelectedColumns__Group__1__Impl : ( ( rule__SelectedColumns__Group_1__0 )* ) ;
    public final void rule__SelectedColumns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3126:1: ( ( ( rule__SelectedColumns__Group_1__0 )* ) )
            // InternalR2RML.g:3127:1: ( ( rule__SelectedColumns__Group_1__0 )* )
            {
            // InternalR2RML.g:3127:1: ( ( rule__SelectedColumns__Group_1__0 )* )
            // InternalR2RML.g:3128:2: ( rule__SelectedColumns__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getGroup_1()); 
            }
            // InternalR2RML.g:3129:2: ( rule__SelectedColumns__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalR2RML.g:3129:3: rule__SelectedColumns__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SelectedColumns__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group__1__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_1__0"
    // InternalR2RML.g:3138:1: rule__SelectedColumns__Group_1__0 : rule__SelectedColumns__Group_1__0__Impl rule__SelectedColumns__Group_1__1 ;
    public final void rule__SelectedColumns__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3142:1: ( rule__SelectedColumns__Group_1__0__Impl rule__SelectedColumns__Group_1__1 )
            // InternalR2RML.g:3143:2: rule__SelectedColumns__Group_1__0__Impl rule__SelectedColumns__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__SelectedColumns__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_1__0"


    // $ANTLR start "rule__SelectedColumns__Group_1__0__Impl"
    // InternalR2RML.g:3150:1: rule__SelectedColumns__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SelectedColumns__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3154:1: ( ( ',' ) )
            // InternalR2RML.g:3155:1: ( ',' )
            {
            // InternalR2RML.g:3155:1: ( ',' )
            // InternalR2RML.g:3156:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_1__0__Impl"


    // $ANTLR start "rule__SelectedColumns__Group_1__1"
    // InternalR2RML.g:3165:1: rule__SelectedColumns__Group_1__1 : rule__SelectedColumns__Group_1__1__Impl ;
    public final void rule__SelectedColumns__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3169:1: ( rule__SelectedColumns__Group_1__1__Impl )
            // InternalR2RML.g:3170:2: rule__SelectedColumns__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_1__1"


    // $ANTLR start "rule__SelectedColumns__Group_1__1__Impl"
    // InternalR2RML.g:3176:1: rule__SelectedColumns__Group_1__1__Impl : ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) ) ;
    public final void rule__SelectedColumns__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3180:1: ( ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) ) )
            // InternalR2RML.g:3181:1: ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) )
            {
            // InternalR2RML.g:3181:1: ( ( rule__SelectedColumns__ColumnsAssignment_1_1 ) )
            // InternalR2RML.g:3182:2: ( rule__SelectedColumns__ColumnsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_1_1()); 
            }
            // InternalR2RML.g:3183:2: ( rule__SelectedColumns__ColumnsAssignment_1_1 )
            // InternalR2RML.g:3183:3: rule__SelectedColumns__ColumnsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectedColumns__ColumnsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getColumnsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__Group_1__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalR2RML.g:3192:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3196:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalR2RML.g:3197:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // InternalR2RML.g:3204:1: rule__WhereClause__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3208:1: ( ( 'WHERE' ) )
            // InternalR2RML.g:3209:1: ( 'WHERE' )
            {
            // InternalR2RML.g:3209:1: ( 'WHERE' )
            // InternalR2RML.g:3210:2: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // InternalR2RML.g:3219:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl rule__WhereClause__Group__2 ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3223:1: ( rule__WhereClause__Group__1__Impl rule__WhereClause__Group__2 )
            // InternalR2RML.g:3224:2: rule__WhereClause__Group__1__Impl rule__WhereClause__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__WhereClause__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // InternalR2RML.g:3231:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ConditionsAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3235:1: ( ( ( rule__WhereClause__ConditionsAssignment_1 ) ) )
            // InternalR2RML.g:3236:1: ( ( rule__WhereClause__ConditionsAssignment_1 ) )
            {
            // InternalR2RML.g:3236:1: ( ( rule__WhereClause__ConditionsAssignment_1 ) )
            // InternalR2RML.g:3237:2: ( rule__WhereClause__ConditionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getConditionsAssignment_1()); 
            }
            // InternalR2RML.g:3238:2: ( rule__WhereClause__ConditionsAssignment_1 )
            // InternalR2RML.g:3238:3: rule__WhereClause__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__ConditionsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getConditionsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__2"
    // InternalR2RML.g:3246:1: rule__WhereClause__Group__2 : rule__WhereClause__Group__2__Impl ;
    public final void rule__WhereClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3250:1: ( rule__WhereClause__Group__2__Impl )
            // InternalR2RML.g:3251:2: rule__WhereClause__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__2"


    // $ANTLR start "rule__WhereClause__Group__2__Impl"
    // InternalR2RML.g:3257:1: rule__WhereClause__Group__2__Impl : ( ( rule__WhereClause__Group_2__0 )* ) ;
    public final void rule__WhereClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3261:1: ( ( ( rule__WhereClause__Group_2__0 )* ) )
            // InternalR2RML.g:3262:1: ( ( rule__WhereClause__Group_2__0 )* )
            {
            // InternalR2RML.g:3262:1: ( ( rule__WhereClause__Group_2__0 )* )
            // InternalR2RML.g:3263:2: ( rule__WhereClause__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getGroup_2()); 
            }
            // InternalR2RML.g:3264:2: ( rule__WhereClause__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=15 && LA31_0<=16)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalR2RML.g:3264:3: rule__WhereClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__WhereClause__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__2__Impl"


    // $ANTLR start "rule__WhereClause__Group_2__0"
    // InternalR2RML.g:3273:1: rule__WhereClause__Group_2__0 : rule__WhereClause__Group_2__0__Impl rule__WhereClause__Group_2__1 ;
    public final void rule__WhereClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3277:1: ( rule__WhereClause__Group_2__0__Impl rule__WhereClause__Group_2__1 )
            // InternalR2RML.g:3278:2: rule__WhereClause__Group_2__0__Impl rule__WhereClause__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__WhereClause__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group_2__0"


    // $ANTLR start "rule__WhereClause__Group_2__0__Impl"
    // InternalR2RML.g:3285:1: rule__WhereClause__Group_2__0__Impl : ( ( rule__WhereClause__LogicAssignment_2_0 ) ) ;
    public final void rule__WhereClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3289:1: ( ( ( rule__WhereClause__LogicAssignment_2_0 ) ) )
            // InternalR2RML.g:3290:1: ( ( rule__WhereClause__LogicAssignment_2_0 ) )
            {
            // InternalR2RML.g:3290:1: ( ( rule__WhereClause__LogicAssignment_2_0 ) )
            // InternalR2RML.g:3291:2: ( rule__WhereClause__LogicAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getLogicAssignment_2_0()); 
            }
            // InternalR2RML.g:3292:2: ( rule__WhereClause__LogicAssignment_2_0 )
            // InternalR2RML.g:3292:3: rule__WhereClause__LogicAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__LogicAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getLogicAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group_2__0__Impl"


    // $ANTLR start "rule__WhereClause__Group_2__1"
    // InternalR2RML.g:3300:1: rule__WhereClause__Group_2__1 : rule__WhereClause__Group_2__1__Impl ;
    public final void rule__WhereClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3304:1: ( rule__WhereClause__Group_2__1__Impl )
            // InternalR2RML.g:3305:2: rule__WhereClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group_2__1"


    // $ANTLR start "rule__WhereClause__Group_2__1__Impl"
    // InternalR2RML.g:3311:1: rule__WhereClause__Group_2__1__Impl : ( ( rule__WhereClause__ConditionsAssignment_2_1 ) ) ;
    public final void rule__WhereClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3315:1: ( ( ( rule__WhereClause__ConditionsAssignment_2_1 ) ) )
            // InternalR2RML.g:3316:1: ( ( rule__WhereClause__ConditionsAssignment_2_1 ) )
            {
            // InternalR2RML.g:3316:1: ( ( rule__WhereClause__ConditionsAssignment_2_1 ) )
            // InternalR2RML.g:3317:2: ( rule__WhereClause__ConditionsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getConditionsAssignment_2_1()); 
            }
            // InternalR2RML.g:3318:2: ( rule__WhereClause__ConditionsAssignment_2_1 )
            // InternalR2RML.g:3318:3: rule__WhereClause__ConditionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__ConditionsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getConditionsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalR2RML.g:3327:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3331:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalR2RML.g:3332:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalR2RML.g:3339:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__ColumnAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3343:1: ( ( ( rule__Condition__ColumnAssignment_0 ) ) )
            // InternalR2RML.g:3344:1: ( ( rule__Condition__ColumnAssignment_0 ) )
            {
            // InternalR2RML.g:3344:1: ( ( rule__Condition__ColumnAssignment_0 ) )
            // InternalR2RML.g:3345:2: ( rule__Condition__ColumnAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getColumnAssignment_0()); 
            }
            // InternalR2RML.g:3346:2: ( rule__Condition__ColumnAssignment_0 )
            // InternalR2RML.g:3346:3: rule__Condition__ColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ColumnAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getColumnAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalR2RML.g:3354:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3358:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalR2RML.g:3359:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalR2RML.g:3366:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3370:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalR2RML.g:3371:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalR2RML.g:3371:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalR2RML.g:3372:2: ( rule__Condition__OperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            }
            // InternalR2RML.g:3373:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalR2RML.g:3373:3: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalR2RML.g:3381:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3385:1: ( rule__Condition__Group__2__Impl )
            // InternalR2RML.g:3386:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalR2RML.g:3392:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3396:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // InternalR2RML.g:3397:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // InternalR2RML.g:3397:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // InternalR2RML.g:3398:2: ( rule__Condition__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            }
            // InternalR2RML.g:3399:2: ( rule__Condition__ValueAssignment_2 )
            // InternalR2RML.g:3399:3: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Mapping__StatementsAssignment"
    // InternalR2RML.g:3408:1: rule__Mapping__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Mapping__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3412:1: ( ( ruleStatement ) )
            // InternalR2RML.g:3413:2: ( ruleStatement )
            {
            // InternalR2RML.g:3413:2: ( ruleStatement )
            // InternalR2RML.g:3414:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__StatementsAssignment"


    // $ANTLR start "rule__Statement__PrefixAssignment_0_0"
    // InternalR2RML.g:3423:1: rule__Statement__PrefixAssignment_0_0 : ( rulePrefix ) ;
    public final void rule__Statement__PrefixAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3427:1: ( ( rulePrefix ) )
            // InternalR2RML.g:3428:2: ( rulePrefix )
            {
            // InternalR2RML.g:3428:2: ( rulePrefix )
            // InternalR2RML.g:3429:3: rulePrefix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPrefixPrefixParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPrefixPrefixParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__PrefixAssignment_0_0"


    // $ANTLR start "rule__Statement__TriplesMapAssignment_0_1"
    // InternalR2RML.g:3438:1: rule__Statement__TriplesMapAssignment_0_1 : ( ruleTriplesMap ) ;
    public final void rule__Statement__TriplesMapAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3442:1: ( ( ruleTriplesMap ) )
            // InternalR2RML.g:3443:2: ( ruleTriplesMap )
            {
            // InternalR2RML.g:3443:2: ( ruleTriplesMap )
            // InternalR2RML.g:3444:3: ruleTriplesMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTriplesMapTriplesMapParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTriplesMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getTriplesMapTriplesMapParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TriplesMapAssignment_0_1"


    // $ANTLR start "rule__Prefix__PrefixNameAssignment_1"
    // InternalR2RML.g:3453:1: rule__Prefix__PrefixNameAssignment_1 : ( rulePrefixName ) ;
    public final void rule__Prefix__PrefixNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3457:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:3458:2: ( rulePrefixName )
            {
            // InternalR2RML.g:3458:2: ( rulePrefixName )
            // InternalR2RML.g:3459:3: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__PrefixNameAssignment_1"


    // $ANTLR start "rule__Prefix__UriAssignment_2"
    // InternalR2RML.g:3468:1: rule__Prefix__UriAssignment_2 : ( RULE_URIREF ) ;
    public final void rule__Prefix__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3472:1: ( ( RULE_URIREF ) )
            // InternalR2RML.g:3473:2: ( RULE_URIREF )
            {
            // InternalR2RML.g:3473:2: ( RULE_URIREF )
            // InternalR2RML.g:3474:3: RULE_URIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getUriURIREFTerminalRuleCall_2_0()); 
            }
            match(input,RULE_URIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getUriURIREFTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__UriAssignment_2"


    // $ANTLR start "rule__TriplesMap__NameAssignment_0"
    // InternalR2RML.g:3483:1: rule__TriplesMap__NameAssignment_0 : ( RULE_URIREF ) ;
    public final void rule__TriplesMap__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3487:1: ( ( RULE_URIREF ) )
            // InternalR2RML.g:3488:2: ( RULE_URIREF )
            {
            // InternalR2RML.g:3488:2: ( RULE_URIREF )
            // InternalR2RML.g:3489:3: RULE_URIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getNameURIREFTerminalRuleCall_0_0()); 
            }
            match(input,RULE_URIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getNameURIREFTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__NameAssignment_0"


    // $ANTLR start "rule__TriplesMap__LogicalTableAssignment_1"
    // InternalR2RML.g:3498:1: rule__TriplesMap__LogicalTableAssignment_1 : ( ruleLogicalTable ) ;
    public final void rule__TriplesMap__LogicalTableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3502:1: ( ( ruleLogicalTable ) )
            // InternalR2RML.g:3503:2: ( ruleLogicalTable )
            {
            // InternalR2RML.g:3503:2: ( ruleLogicalTable )
            // InternalR2RML.g:3504:3: ruleLogicalTable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getLogicalTableLogicalTableParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicalTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getLogicalTableLogicalTableParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__LogicalTableAssignment_1"


    // $ANTLR start "rule__TriplesMap__SubjectMapAssignment_2"
    // InternalR2RML.g:3513:1: rule__TriplesMap__SubjectMapAssignment_2 : ( ruleSubjectMap ) ;
    public final void rule__TriplesMap__SubjectMapAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3517:1: ( ( ruleSubjectMap ) )
            // InternalR2RML.g:3518:2: ( ruleSubjectMap )
            {
            // InternalR2RML.g:3518:2: ( ruleSubjectMap )
            // InternalR2RML.g:3519:3: ruleSubjectMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getSubjectMapSubjectMapParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubjectMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getSubjectMapSubjectMapParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__SubjectMapAssignment_2"


    // $ANTLR start "rule__TriplesMap__PredicateObjectMapsAssignment_3"
    // InternalR2RML.g:3528:1: rule__TriplesMap__PredicateObjectMapsAssignment_3 : ( rulePredicateObjectMap ) ;
    public final void rule__TriplesMap__PredicateObjectMapsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3532:1: ( ( rulePredicateObjectMap ) )
            // InternalR2RML.g:3533:2: ( rulePredicateObjectMap )
            {
            // InternalR2RML.g:3533:2: ( rulePredicateObjectMap )
            // InternalR2RML.g:3534:3: rulePredicateObjectMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriplesMapAccess().getPredicateObjectMapsPredicateObjectMapParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicateObjectMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriplesMapAccess().getPredicateObjectMapsPredicateObjectMapParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriplesMap__PredicateObjectMapsAssignment_3"


    // $ANTLR start "rule__LogicalTable__QueryAssignment_3_0_2"
    // InternalR2RML.g:3543:1: rule__LogicalTable__QueryAssignment_3_0_2 : ( ruleSimpleSelectStatement ) ;
    public final void rule__LogicalTable__QueryAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3547:1: ( ( ruleSimpleSelectStatement ) )
            // InternalR2RML.g:3548:2: ( ruleSimpleSelectStatement )
            {
            // InternalR2RML.g:3548:2: ( ruleSimpleSelectStatement )
            // InternalR2RML.g:3549:3: ruleSimpleSelectStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getQuerySimpleSelectStatementParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleSelectStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getQuerySimpleSelectStatementParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__QueryAssignment_3_0_2"


    // $ANTLR start "rule__LogicalTable__TableNameAssignment_3_1_2"
    // InternalR2RML.g:3558:1: rule__LogicalTable__TableNameAssignment_3_1_2 : ( RULE_STRING ) ;
    public final void rule__LogicalTable__TableNameAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3562:1: ( ( RULE_STRING ) )
            // InternalR2RML.g:3563:2: ( RULE_STRING )
            {
            // InternalR2RML.g:3563:2: ( RULE_STRING )
            // InternalR2RML.g:3564:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalTableAccess().getTableNameSTRINGTerminalRuleCall_3_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalTableAccess().getTableNameSTRINGTerminalRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalTable__TableNameAssignment_3_1_2"


    // $ANTLR start "rule__SubjectMap__TemplateAssignment_3"
    // InternalR2RML.g:3573:1: rule__SubjectMap__TemplateAssignment_3 : ( ruleTemplate ) ;
    public final void rule__SubjectMap__TemplateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3577:1: ( ( ruleTemplate ) )
            // InternalR2RML.g:3578:2: ( ruleTemplate )
            {
            // InternalR2RML.g:3578:2: ( ruleTemplate )
            // InternalR2RML.g:3579:3: ruleTemplate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getTemplateTemplateParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemplate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getTemplateTemplateParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__TemplateAssignment_3"


    // $ANTLR start "rule__SubjectMap__ClassAssignment_4"
    // InternalR2RML.g:3588:1: rule__SubjectMap__ClassAssignment_4 : ( ruleClass ) ;
    public final void rule__SubjectMap__ClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3592:1: ( ( ruleClass ) )
            // InternalR2RML.g:3593:2: ( ruleClass )
            {
            // InternalR2RML.g:3593:2: ( ruleClass )
            // InternalR2RML.g:3594:3: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectMapAccess().getClassClassParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectMapAccess().getClassClassParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMap__ClassAssignment_4"


    // $ANTLR start "rule__PredicateObjectMap__PredicateAssignment_3"
    // InternalR2RML.g:3603:1: rule__PredicateObjectMap__PredicateAssignment_3 : ( rulePredicate ) ;
    public final void rule__PredicateObjectMap__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3607:1: ( ( rulePredicate ) )
            // InternalR2RML.g:3608:2: ( rulePredicate )
            {
            // InternalR2RML.g:3608:2: ( rulePredicate )
            // InternalR2RML.g:3609:3: rulePredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getPredicatePredicateParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getPredicatePredicateParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__PredicateAssignment_3"


    // $ANTLR start "rule__PredicateObjectMap__ObjectMapAssignment_4"
    // InternalR2RML.g:3618:1: rule__PredicateObjectMap__ObjectMapAssignment_4 : ( ruleObjectMap ) ;
    public final void rule__PredicateObjectMap__ObjectMapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3622:1: ( ( ruleObjectMap ) )
            // InternalR2RML.g:3623:2: ( ruleObjectMap )
            {
            // InternalR2RML.g:3623:2: ( ruleObjectMap )
            // InternalR2RML.g:3624:3: ruleObjectMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateObjectMapAccess().getObjectMapObjectMapParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjectMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateObjectMapAccess().getObjectMapObjectMapParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateObjectMap__ObjectMapAssignment_4"


    // $ANTLR start "rule__ObjectMap__ColumnAssignment_4"
    // InternalR2RML.g:3633:1: rule__ObjectMap__ColumnAssignment_4 : ( ruleColumn ) ;
    public final void rule__ObjectMap__ColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3637:1: ( ( ruleColumn ) )
            // InternalR2RML.g:3638:2: ( ruleColumn )
            {
            // InternalR2RML.g:3638:2: ( ruleColumn )
            // InternalR2RML.g:3639:3: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getColumnColumnParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getColumnColumnParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__ColumnAssignment_4"


    // $ANTLR start "rule__ObjectMap__TemplateAssignment_5"
    // InternalR2RML.g:3648:1: rule__ObjectMap__TemplateAssignment_5 : ( ruleTemplate ) ;
    public final void rule__ObjectMap__TemplateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3652:1: ( ( ruleTemplate ) )
            // InternalR2RML.g:3653:2: ( ruleTemplate )
            {
            // InternalR2RML.g:3653:2: ( ruleTemplate )
            // InternalR2RML.g:3654:3: ruleTemplate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getTemplateTemplateParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemplate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getTemplateTemplateParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__TemplateAssignment_5"


    // $ANTLR start "rule__ObjectMap__ConstantAssignment_6"
    // InternalR2RML.g:3663:1: rule__ObjectMap__ConstantAssignment_6 : ( ruleConstant ) ;
    public final void rule__ObjectMap__ConstantAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3667:1: ( ( ruleConstant ) )
            // InternalR2RML.g:3668:2: ( ruleConstant )
            {
            // InternalR2RML.g:3668:2: ( ruleConstant )
            // InternalR2RML.g:3669:3: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getConstantConstantParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getConstantConstantParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__ConstantAssignment_6"


    // $ANTLR start "rule__ObjectMap__DatatypeAssignment_7"
    // InternalR2RML.g:3678:1: rule__ObjectMap__DatatypeAssignment_7 : ( ruleDatatype ) ;
    public final void rule__ObjectMap__DatatypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3682:1: ( ( ruleDatatype ) )
            // InternalR2RML.g:3683:2: ( ruleDatatype )
            {
            // InternalR2RML.g:3683:2: ( ruleDatatype )
            // InternalR2RML.g:3684:3: ruleDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectMapAccess().getDatatypeDatatypeParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectMapAccess().getDatatypeDatatypeParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectMap__DatatypeAssignment_7"


    // $ANTLR start "rule__Class__ClassNameAssignment_2"
    // InternalR2RML.g:3693:1: rule__Class__ClassNameAssignment_2 : ( ruleQname ) ;
    public final void rule__Class__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3697:1: ( ( ruleQname ) )
            // InternalR2RML.g:3698:2: ( ruleQname )
            {
            // InternalR2RML.g:3698:2: ( ruleQname )
            // InternalR2RML.g:3699:3: ruleQname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassNameQnameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassNameQnameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ClassNameAssignment_2"


    // $ANTLR start "rule__Predicate__PredicateNameAssignment_2"
    // InternalR2RML.g:3708:1: rule__Predicate__PredicateNameAssignment_2 : ( ruleQname ) ;
    public final void rule__Predicate__PredicateNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3712:1: ( ( ruleQname ) )
            // InternalR2RML.g:3713:2: ( ruleQname )
            {
            // InternalR2RML.g:3713:2: ( ruleQname )
            // InternalR2RML.g:3714:3: ruleQname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPredicateNameQnameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPredicateNameQnameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__PredicateNameAssignment_2"


    // $ANTLR start "rule__Template__NameAssignment_2"
    // InternalR2RML.g:3723:1: rule__Template__NameAssignment_2 : ( ruleQuotedString ) ;
    public final void rule__Template__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3727:1: ( ( ruleQuotedString ) )
            // InternalR2RML.g:3728:2: ( ruleQuotedString )
            {
            // InternalR2RML.g:3728:2: ( ruleQuotedString )
            // InternalR2RML.g:3729:3: ruleQuotedString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getNameQuotedStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getNameQuotedStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__NameAssignment_2"


    // $ANTLR start "rule__Column__NameAssignment_2"
    // InternalR2RML.g:3738:1: rule__Column__NameAssignment_2 : ( ruleQuotedString ) ;
    public final void rule__Column__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3742:1: ( ( ruleQuotedString ) )
            // InternalR2RML.g:3743:2: ( ruleQuotedString )
            {
            // InternalR2RML.g:3743:2: ( ruleQuotedString )
            // InternalR2RML.g:3744:3: ruleQuotedString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getNameQuotedStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getNameQuotedStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_2"


    // $ANTLR start "rule__Datatype__DtNameAssignment_2"
    // InternalR2RML.g:3753:1: rule__Datatype__DtNameAssignment_2 : ( ruleQname ) ;
    public final void rule__Datatype__DtNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3757:1: ( ( ruleQname ) )
            // InternalR2RML.g:3758:2: ( ruleQname )
            {
            // InternalR2RML.g:3758:2: ( ruleQname )
            // InternalR2RML.g:3759:3: ruleQname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getDtNameQnameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getDtNameQnameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__DtNameAssignment_2"


    // $ANTLR start "rule__Constant__ConstNameAssignment_2_0"
    // InternalR2RML.g:3768:1: rule__Constant__ConstNameAssignment_2_0 : ( ruleiResource ) ;
    public final void rule__Constant__ConstNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3772:1: ( ( ruleiResource ) )
            // InternalR2RML.g:3773:2: ( ruleiResource )
            {
            // InternalR2RML.g:3773:2: ( ruleiResource )
            // InternalR2RML.g:3774:3: ruleiResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstNameIResourceParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleiResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstNameIResourceParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ConstNameAssignment_2_0"


    // $ANTLR start "rule__Constant__ConstStrAssignment_2_1"
    // InternalR2RML.g:3783:1: rule__Constant__ConstStrAssignment_2_1 : ( ruleQuotedString ) ;
    public final void rule__Constant__ConstStrAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3787:1: ( ( ruleQuotedString ) )
            // InternalR2RML.g:3788:2: ( ruleQuotedString )
            {
            // InternalR2RML.g:3788:2: ( ruleQuotedString )
            // InternalR2RML.g:3789:3: ruleQuotedString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstStrQuotedStringParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQuotedString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstStrQuotedStringParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ConstStrAssignment_2_1"


    // $ANTLR start "rule__IResource__UriRefAssignment_0"
    // InternalR2RML.g:3798:1: rule__IResource__UriRefAssignment_0 : ( RULE_URIREF ) ;
    public final void rule__IResource__UriRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3802:1: ( ( RULE_URIREF ) )
            // InternalR2RML.g:3803:2: ( RULE_URIREF )
            {
            // InternalR2RML.g:3803:2: ( RULE_URIREF )
            // InternalR2RML.g:3804:3: RULE_URIREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceAccess().getUriRefURIREFTerminalRuleCall_0_0()); 
            }
            match(input,RULE_URIREF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceAccess().getUriRefURIREFTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IResource__UriRefAssignment_0"


    // $ANTLR start "rule__IResource__QnameAssignment_1"
    // InternalR2RML.g:3813:1: rule__IResource__QnameAssignment_1 : ( ruleQname ) ;
    public final void rule__IResource__QnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3817:1: ( ( ruleQname ) )
            // InternalR2RML.g:3818:2: ( ruleQname )
            {
            // InternalR2RML.g:3818:2: ( ruleQname )
            // InternalR2RML.g:3819:3: ruleQname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIResourceAccess().getQnameQnameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIResourceAccess().getQnameQnameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IResource__QnameAssignment_1"


    // $ANTLR start "rule__Qname__PrefixNameAssignment_1"
    // InternalR2RML.g:3828:1: rule__Qname__PrefixNameAssignment_1 : ( rulePrefixName ) ;
    public final void rule__Qname__PrefixNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3832:1: ( ( rulePrefixName ) )
            // InternalR2RML.g:3833:2: ( rulePrefixName )
            {
            // InternalR2RML.g:3833:2: ( rulePrefixName )
            // InternalR2RML.g:3834:3: rulePrefixName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getPrefixNamePrefixNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__PrefixNameAssignment_1"


    // $ANTLR start "rule__Qname__NameAssignment_2"
    // InternalR2RML.g:3843:1: rule__Qname__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Qname__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3847:1: ( ( RULE_ID ) )
            // InternalR2RML.g:3848:2: ( RULE_ID )
            {
            // InternalR2RML.g:3848:2: ( RULE_ID )
            // InternalR2RML.g:3849:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQnameAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQnameAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qname__NameAssignment_2"


    // $ANTLR start "rule__SimpleSelectStatement__SelectedColumnsAssignment_1"
    // InternalR2RML.g:3858:1: rule__SimpleSelectStatement__SelectedColumnsAssignment_1 : ( ruleSelectedColumns ) ;
    public final void rule__SimpleSelectStatement__SelectedColumnsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3862:1: ( ( ruleSelectedColumns ) )
            // InternalR2RML.g:3863:2: ( ruleSelectedColumns )
            {
            // InternalR2RML.g:3863:2: ( ruleSelectedColumns )
            // InternalR2RML.g:3864:3: ruleSelectedColumns
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getSelectedColumnsSelectedColumnsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelectedColumns();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getSelectedColumnsSelectedColumnsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__SelectedColumnsAssignment_1"


    // $ANTLR start "rule__SimpleSelectStatement__TableNameAssignment_3"
    // InternalR2RML.g:3873:1: rule__SimpleSelectStatement__TableNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SimpleSelectStatement__TableNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3877:1: ( ( RULE_ID ) )
            // InternalR2RML.g:3878:2: ( RULE_ID )
            {
            // InternalR2RML.g:3878:2: ( RULE_ID )
            // InternalR2RML.g:3879:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getTableNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getTableNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__TableNameAssignment_3"


    // $ANTLR start "rule__SimpleSelectStatement__WhereClauseAssignment_4"
    // InternalR2RML.g:3888:1: rule__SimpleSelectStatement__WhereClauseAssignment_4 : ( ruleWhereClause ) ;
    public final void rule__SimpleSelectStatement__WhereClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3892:1: ( ( ruleWhereClause ) )
            // InternalR2RML.g:3893:2: ( ruleWhereClause )
            {
            // InternalR2RML.g:3893:2: ( ruleWhereClause )
            // InternalR2RML.g:3894:3: ruleWhereClause
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectStatement__WhereClauseAssignment_4"


    // $ANTLR start "rule__SelectedColumns__ColumnsAssignment_0"
    // InternalR2RML.g:3903:1: rule__SelectedColumns__ColumnsAssignment_0 : ( RULE_ID ) ;
    public final void rule__SelectedColumns__ColumnsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3907:1: ( ( RULE_ID ) )
            // InternalR2RML.g:3908:2: ( RULE_ID )
            {
            // InternalR2RML.g:3908:2: ( RULE_ID )
            // InternalR2RML.g:3909:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__ColumnsAssignment_0"


    // $ANTLR start "rule__SelectedColumns__ColumnsAssignment_1_1"
    // InternalR2RML.g:3918:1: rule__SelectedColumns__ColumnsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SelectedColumns__ColumnsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3922:1: ( ( RULE_ID ) )
            // InternalR2RML.g:3923:2: ( RULE_ID )
            {
            // InternalR2RML.g:3923:2: ( RULE_ID )
            // InternalR2RML.g:3924:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectedColumnsAccess().getColumnsIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedColumns__ColumnsAssignment_1_1"


    // $ANTLR start "rule__WhereClause__ConditionsAssignment_1"
    // InternalR2RML.g:3933:1: rule__WhereClause__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__WhereClause__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3937:1: ( ( ruleCondition ) )
            // InternalR2RML.g:3938:2: ( ruleCondition )
            {
            // InternalR2RML.g:3938:2: ( ruleCondition )
            // InternalR2RML.g:3939:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getConditionsConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getConditionsConditionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__ConditionsAssignment_1"


    // $ANTLR start "rule__WhereClause__LogicAssignment_2_0"
    // InternalR2RML.g:3948:1: rule__WhereClause__LogicAssignment_2_0 : ( ruleLogic ) ;
    public final void rule__WhereClause__LogicAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3952:1: ( ( ruleLogic ) )
            // InternalR2RML.g:3953:2: ( ruleLogic )
            {
            // InternalR2RML.g:3953:2: ( ruleLogic )
            // InternalR2RML.g:3954:3: ruleLogic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getLogicLogicParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getLogicLogicParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__LogicAssignment_2_0"


    // $ANTLR start "rule__WhereClause__ConditionsAssignment_2_1"
    // InternalR2RML.g:3963:1: rule__WhereClause__ConditionsAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__WhereClause__ConditionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3967:1: ( ( ruleCondition ) )
            // InternalR2RML.g:3968:2: ( ruleCondition )
            {
            // InternalR2RML.g:3968:2: ( ruleCondition )
            // InternalR2RML.g:3969:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhereClauseAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhereClauseAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__ConditionsAssignment_2_1"


    // $ANTLR start "rule__Condition__ColumnAssignment_0"
    // InternalR2RML.g:3978:1: rule__Condition__ColumnAssignment_0 : ( RULE_ID ) ;
    public final void rule__Condition__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3982:1: ( ( RULE_ID ) )
            // InternalR2RML.g:3983:2: ( RULE_ID )
            {
            // InternalR2RML.g:3983:2: ( RULE_ID )
            // InternalR2RML.g:3984:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getColumnIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getColumnIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ColumnAssignment_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_1"
    // InternalR2RML.g:3993:1: rule__Condition__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:3997:1: ( ( ruleOperator ) )
            // InternalR2RML.g:3998:2: ( ruleOperator )
            {
            // InternalR2RML.g:3998:2: ( ruleOperator )
            // InternalR2RML.g:3999:3: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_1"


    // $ANTLR start "rule__Condition__ValueAssignment_2"
    // InternalR2RML.g:4008:1: rule__Condition__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:4012:1: ( ( ruleValue ) )
            // InternalR2RML.g:4013:2: ( ruleValue )
            {
            // InternalR2RML.g:4013:2: ( ruleValue )
            // InternalR2RML.g:4014:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getValueValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_2"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalR2RML.g:4023:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:4027:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalR2RML.g:4028:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalR2RML.g:4028:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalR2RML.g:4029:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            }
            // InternalR2RML.g:4030:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalR2RML.g:4030:4: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalR2RML.g:4038:1: rule__NumberValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:4042:1: ( ( RULE_INT ) )
            // InternalR2RML.g:4043:2: ( RULE_INT )
            {
            // InternalR2RML.g:4043:2: ( RULE_INT )
            // InternalR2RML.g:4044:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalR2RML.g:4053:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalR2RML.g:4057:1: ( ( RULE_STRING ) )
            // InternalR2RML.g:4058:2: ( RULE_STRING )
            {
            // InternalR2RML.g:4058:2: ( RULE_STRING )
            // InternalR2RML.g:4059:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"

    // $ANTLR start synpred32_InternalR2RML
    public final void synpred32_InternalR2RML_fragment() throws RecognitionException {   
        // InternalR2RML.g:2886:3: ( rule__Qname__NameAssignment_2 )
        // InternalR2RML.g:2886:3: rule__Qname__NameAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Qname__NameAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalR2RML

    // Delegated rules

    public final boolean synpred32_InternalR2RML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalR2RML_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040020000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001800090L});

}