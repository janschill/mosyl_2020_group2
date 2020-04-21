package org.mdse.pts.schedule.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScheduleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Schedule", "For", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int For=5;
    public static final int RULE_DIGIT=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_LETTER=6;
    public static final int RULE_INT=9;
    public static final int Schedule=4;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalScheduleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScheduleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScheduleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScheduleParser.g"; }



     	private ScheduleGrammarAccess grammarAccess;

        public InternalScheduleParser(TokenStream input, ScheduleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schedule";
       	}

       	@Override
       	protected ScheduleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchedule"
    // InternalScheduleParser.g:57:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalScheduleParser.g:57:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalScheduleParser.g:58:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalScheduleParser.g:64:1: ruleSchedule returns [EObject current=null] : (otherlv_0= Schedule otherlv_1= For () ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalScheduleParser.g:70:2: ( (otherlv_0= Schedule otherlv_1= For () ) )
            // InternalScheduleParser.g:71:2: (otherlv_0= Schedule otherlv_1= For () )
            {
            // InternalScheduleParser.g:71:2: (otherlv_0= Schedule otherlv_1= For () )
            // InternalScheduleParser.g:72:3: otherlv_0= Schedule otherlv_1= For ()
            {
            otherlv_0=(Token)match(input,Schedule,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
            		
            otherlv_1=(Token)match(input,For,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getForKeyword_1());
            		
            // InternalScheduleParser.g:80:3: ()
            // InternalScheduleParser.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScheduleAccess().getScheduleAction_2(),
            					current);
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});

}