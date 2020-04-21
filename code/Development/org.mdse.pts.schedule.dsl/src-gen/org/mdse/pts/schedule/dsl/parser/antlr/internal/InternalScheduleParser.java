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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Schedule", "With", "For", "Colon", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=15;
    public static final int For=6;
    public static final int RULE_DIGIT=9;
    public static final int RULE_STRING=12;
    public static final int With=5;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_LETTER=8;
    public static final int RULE_INT=11;
    public static final int Schedule=4;
    public static final int RULE_ML_COMMENT=13;
    public static final int Colon=7;
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
    // InternalScheduleParser.g:64:1: ruleSchedule returns [EObject current=null] : (otherlv_0= Schedule ( (lv_networkReference_1_0= ruleNetworkReference ) ) otherlv_2= With ( (otherlv_3= RULE_ID ) ) otherlv_4= Colon ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_networkReference_1_0 = null;



        	enterRule();

        try {
            // InternalScheduleParser.g:70:2: ( (otherlv_0= Schedule ( (lv_networkReference_1_0= ruleNetworkReference ) ) otherlv_2= With ( (otherlv_3= RULE_ID ) ) otherlv_4= Colon ) )
            // InternalScheduleParser.g:71:2: (otherlv_0= Schedule ( (lv_networkReference_1_0= ruleNetworkReference ) ) otherlv_2= With ( (otherlv_3= RULE_ID ) ) otherlv_4= Colon )
            {
            // InternalScheduleParser.g:71:2: (otherlv_0= Schedule ( (lv_networkReference_1_0= ruleNetworkReference ) ) otherlv_2= With ( (otherlv_3= RULE_ID ) ) otherlv_4= Colon )
            // InternalScheduleParser.g:72:3: otherlv_0= Schedule ( (lv_networkReference_1_0= ruleNetworkReference ) ) otherlv_2= With ( (otherlv_3= RULE_ID ) ) otherlv_4= Colon
            {
            otherlv_0=(Token)match(input,Schedule,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
            		
            // InternalScheduleParser.g:76:3: ( (lv_networkReference_1_0= ruleNetworkReference ) )
            // InternalScheduleParser.g:77:4: (lv_networkReference_1_0= ruleNetworkReference )
            {
            // InternalScheduleParser.g:77:4: (lv_networkReference_1_0= ruleNetworkReference )
            // InternalScheduleParser.g:78:5: lv_networkReference_1_0= ruleNetworkReference
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_networkReference_1_0=ruleNetworkReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					set(
            						current,
            						"networkReference",
            						lv_networkReference_1_0,
            						"org.mdse.pts.schedule.dsl.Schedule.NetworkReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,With,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getWithKeyword_2());
            		
            // InternalScheduleParser.g:99:3: ( (otherlv_3= RULE_ID ) )
            // InternalScheduleParser.g:100:4: (otherlv_3= RULE_ID )
            {
            // InternalScheduleParser.g:100:4: (otherlv_3= RULE_ID )
            // InternalScheduleParser.g:101:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getWithDepotDepotCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Colon,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScheduleAccess().getColonKeyword_4());
            		

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


    // $ANTLR start "entryRuleNetworkReference"
    // InternalScheduleParser.g:120:1: entryRuleNetworkReference returns [EObject current=null] : iv_ruleNetworkReference= ruleNetworkReference EOF ;
    public final EObject entryRuleNetworkReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkReference = null;


        try {
            // InternalScheduleParser.g:120:57: (iv_ruleNetworkReference= ruleNetworkReference EOF )
            // InternalScheduleParser.g:121:2: iv_ruleNetworkReference= ruleNetworkReference EOF
            {
             newCompositeNode(grammarAccess.getNetworkReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkReference=ruleNetworkReference();

            state._fsp--;

             current =iv_ruleNetworkReference; 
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
    // $ANTLR end "entryRuleNetworkReference"


    // $ANTLR start "ruleNetworkReference"
    // InternalScheduleParser.g:127:1: ruleNetworkReference returns [EObject current=null] : (otherlv_0= For ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleNetworkReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalScheduleParser.g:133:2: ( (otherlv_0= For ( (otherlv_1= RULE_ID ) ) ) )
            // InternalScheduleParser.g:134:2: (otherlv_0= For ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalScheduleParser.g:134:2: (otherlv_0= For ( (otherlv_1= RULE_ID ) ) )
            // InternalScheduleParser.g:135:3: otherlv_0= For ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,For,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkReferenceAccess().getForKeyword_0());
            		
            // InternalScheduleParser.g:139:3: ( (otherlv_1= RULE_ID ) )
            // InternalScheduleParser.g:140:4: (otherlv_1= RULE_ID )
            {
            // InternalScheduleParser.g:140:4: (otherlv_1= RULE_ID )
            // InternalScheduleParser.g:141:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getNetworkReferenceAccess().getForNetworkCrossReference_1_0());
            				

            }


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
    // $ANTLR end "ruleNetworkReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});

}