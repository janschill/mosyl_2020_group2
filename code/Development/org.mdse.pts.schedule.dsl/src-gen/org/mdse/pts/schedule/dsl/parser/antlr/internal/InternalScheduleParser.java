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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SCHEDULE", "TRAIN", "WITH", "FOR", "Colon", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_ID=11;
    public static final int RULE_WS=16;
    public static final int FOR=7;
    public static final int RULE_DIGIT=10;
    public static final int RULE_STRING=13;
    public static final int TRAIN=5;
    public static final int WITH=6;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_LETTER=9;
    public static final int RULE_INT=12;
    public static final int RULE_ML_COMMENT=14;
    public static final int SCHEDULE=4;
    public static final int Colon=8;
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
    // InternalScheduleParser.g:64:1: ruleSchedule returns [EObject current=null] : (otherlv_0= SCHEDULE otherlv_1= FOR ( (lv_networkReference_2_0= ruleNetworkReference ) ) otherlv_3= WITH ( (lv_depotReference_4_0= ruleDepotReference ) ) otherlv_5= Colon otherlv_6= TRAIN ( (lv_trainReference_7_0= ruleTrainReference ) ) ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_networkReference_2_0 = null;

        EObject lv_depotReference_4_0 = null;

        EObject lv_trainReference_7_0 = null;



        	enterRule();

        try {
            // InternalScheduleParser.g:70:2: ( (otherlv_0= SCHEDULE otherlv_1= FOR ( (lv_networkReference_2_0= ruleNetworkReference ) ) otherlv_3= WITH ( (lv_depotReference_4_0= ruleDepotReference ) ) otherlv_5= Colon otherlv_6= TRAIN ( (lv_trainReference_7_0= ruleTrainReference ) ) ) )
            // InternalScheduleParser.g:71:2: (otherlv_0= SCHEDULE otherlv_1= FOR ( (lv_networkReference_2_0= ruleNetworkReference ) ) otherlv_3= WITH ( (lv_depotReference_4_0= ruleDepotReference ) ) otherlv_5= Colon otherlv_6= TRAIN ( (lv_trainReference_7_0= ruleTrainReference ) ) )
            {
            // InternalScheduleParser.g:71:2: (otherlv_0= SCHEDULE otherlv_1= FOR ( (lv_networkReference_2_0= ruleNetworkReference ) ) otherlv_3= WITH ( (lv_depotReference_4_0= ruleDepotReference ) ) otherlv_5= Colon otherlv_6= TRAIN ( (lv_trainReference_7_0= ruleTrainReference ) ) )
            // InternalScheduleParser.g:72:3: otherlv_0= SCHEDULE otherlv_1= FOR ( (lv_networkReference_2_0= ruleNetworkReference ) ) otherlv_3= WITH ( (lv_depotReference_4_0= ruleDepotReference ) ) otherlv_5= Colon otherlv_6= TRAIN ( (lv_trainReference_7_0= ruleTrainReference ) )
            {
            otherlv_0=(Token)match(input,SCHEDULE,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getSCHEDULEKeyword_0());
            		
            otherlv_1=(Token)match(input,FOR,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getFORKeyword_1());
            		
            // InternalScheduleParser.g:80:3: ( (lv_networkReference_2_0= ruleNetworkReference ) )
            // InternalScheduleParser.g:81:4: (lv_networkReference_2_0= ruleNetworkReference )
            {
            // InternalScheduleParser.g:81:4: (lv_networkReference_2_0= ruleNetworkReference )
            // InternalScheduleParser.g:82:5: lv_networkReference_2_0= ruleNetworkReference
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_networkReference_2_0=ruleNetworkReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					set(
            						current,
            						"networkReference",
            						lv_networkReference_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.NetworkReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,WITH,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getWITHKeyword_3());
            		
            // InternalScheduleParser.g:103:3: ( (lv_depotReference_4_0= ruleDepotReference ) )
            // InternalScheduleParser.g:104:4: (lv_depotReference_4_0= ruleDepotReference )
            {
            // InternalScheduleParser.g:104:4: (lv_depotReference_4_0= ruleDepotReference )
            // InternalScheduleParser.g:105:5: lv_depotReference_4_0= ruleDepotReference
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getDepotReferenceDepotReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_depotReference_4_0=ruleDepotReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					add(
            						current,
            						"depotReference",
            						lv_depotReference_4_0,
            						"org.mdse.pts.schedule.dsl.Schedule.DepotReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,TRAIN,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getScheduleAccess().getTRAINKeyword_6());
            		
            // InternalScheduleParser.g:130:3: ( (lv_trainReference_7_0= ruleTrainReference ) )
            // InternalScheduleParser.g:131:4: (lv_trainReference_7_0= ruleTrainReference )
            {
            // InternalScheduleParser.g:131:4: (lv_trainReference_7_0= ruleTrainReference )
            // InternalScheduleParser.g:132:5: lv_trainReference_7_0= ruleTrainReference
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getTrainReferenceTrainReferenceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_trainReference_7_0=ruleTrainReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					add(
            						current,
            						"trainReference",
            						lv_trainReference_7_0,
            						"org.mdse.pts.schedule.dsl.Schedule.TrainReference");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleNetworkReference"
    // InternalScheduleParser.g:153:1: entryRuleNetworkReference returns [EObject current=null] : iv_ruleNetworkReference= ruleNetworkReference EOF ;
    public final EObject entryRuleNetworkReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkReference = null;


        try {
            // InternalScheduleParser.g:153:57: (iv_ruleNetworkReference= ruleNetworkReference EOF )
            // InternalScheduleParser.g:154:2: iv_ruleNetworkReference= ruleNetworkReference EOF
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
    // InternalScheduleParser.g:160:1: ruleNetworkReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNetworkReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalScheduleParser.g:166:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalScheduleParser.g:167:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalScheduleParser.g:167:2: ( (otherlv_0= RULE_ID ) )
            // InternalScheduleParser.g:168:3: (otherlv_0= RULE_ID )
            {
            // InternalScheduleParser.g:168:3: (otherlv_0= RULE_ID )
            // InternalScheduleParser.g:169:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNetworkReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNetworkReferenceAccess().getNetworkNetworkCrossReference_0());
            			

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


    // $ANTLR start "entryRuleDepotReference"
    // InternalScheduleParser.g:183:1: entryRuleDepotReference returns [EObject current=null] : iv_ruleDepotReference= ruleDepotReference EOF ;
    public final EObject entryRuleDepotReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepotReference = null;


        try {
            // InternalScheduleParser.g:183:55: (iv_ruleDepotReference= ruleDepotReference EOF )
            // InternalScheduleParser.g:184:2: iv_ruleDepotReference= ruleDepotReference EOF
            {
             newCompositeNode(grammarAccess.getDepotReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepotReference=ruleDepotReference();

            state._fsp--;

             current =iv_ruleDepotReference; 
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
    // $ANTLR end "entryRuleDepotReference"


    // $ANTLR start "ruleDepotReference"
    // InternalScheduleParser.g:190:1: ruleDepotReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDepotReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalScheduleParser.g:196:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalScheduleParser.g:197:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalScheduleParser.g:197:2: ( (otherlv_0= RULE_ID ) )
            // InternalScheduleParser.g:198:3: (otherlv_0= RULE_ID )
            {
            // InternalScheduleParser.g:198:3: (otherlv_0= RULE_ID )
            // InternalScheduleParser.g:199:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDepotReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getDepotReferenceAccess().getDepotDepotCrossReference_0());
            			

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
    // $ANTLR end "ruleDepotReference"


    // $ANTLR start "entryRuleTrainReference"
    // InternalScheduleParser.g:213:1: entryRuleTrainReference returns [EObject current=null] : iv_ruleTrainReference= ruleTrainReference EOF ;
    public final EObject entryRuleTrainReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainReference = null;


        try {
            // InternalScheduleParser.g:213:55: (iv_ruleTrainReference= ruleTrainReference EOF )
            // InternalScheduleParser.g:214:2: iv_ruleTrainReference= ruleTrainReference EOF
            {
             newCompositeNode(grammarAccess.getTrainReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainReference=ruleTrainReference();

            state._fsp--;

             current =iv_ruleTrainReference; 
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
    // $ANTLR end "entryRuleTrainReference"


    // $ANTLR start "ruleTrainReference"
    // InternalScheduleParser.g:220:1: ruleTrainReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTrainReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalScheduleParser.g:226:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalScheduleParser.g:227:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalScheduleParser.g:227:2: ( (otherlv_0= RULE_ID ) )
            // InternalScheduleParser.g:228:3: (otherlv_0= RULE_ID )
            {
            // InternalScheduleParser.g:228:3: (otherlv_0= RULE_ID )
            // InternalScheduleParser.g:229:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTrainReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTrainReferenceAccess().getTrainTrainCrossReference_0());
            			

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
    // $ANTLR end "ruleTrainReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}