package org.mdse.pts.schedule.dsl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScheduleParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("FOR", "'FOR'");
    		tokenNameToValue.put("WITH", "'WITH'");
    		tokenNameToValue.put("TRAIN", "'TRAIN'");
    		tokenNameToValue.put("SCHEDULE", "'SCHEDULE'");
    	}

    	public void setGrammarAccess(ScheduleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleSchedule"
    // InternalScheduleParser.g:60:1: entryRuleSchedule : ruleSchedule EOF ;
    public final void entryRuleSchedule() throws RecognitionException {
        try {
            // InternalScheduleParser.g:61:1: ( ruleSchedule EOF )
            // InternalScheduleParser.g:62:1: ruleSchedule EOF
            {
             before(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleSchedule();

            state._fsp--;

             after(grammarAccess.getScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalScheduleParser.g:69:1: ruleSchedule : ( ( rule__Schedule__Group__0 ) ) ;
    public final void ruleSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:73:2: ( ( ( rule__Schedule__Group__0 ) ) )
            // InternalScheduleParser.g:74:2: ( ( rule__Schedule__Group__0 ) )
            {
            // InternalScheduleParser.g:74:2: ( ( rule__Schedule__Group__0 ) )
            // InternalScheduleParser.g:75:3: ( rule__Schedule__Group__0 )
            {
             before(grammarAccess.getScheduleAccess().getGroup()); 
            // InternalScheduleParser.g:76:3: ( rule__Schedule__Group__0 )
            // InternalScheduleParser.g:76:4: rule__Schedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getGroup()); 

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
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleNetworkReference"
    // InternalScheduleParser.g:85:1: entryRuleNetworkReference : ruleNetworkReference EOF ;
    public final void entryRuleNetworkReference() throws RecognitionException {
        try {
            // InternalScheduleParser.g:86:1: ( ruleNetworkReference EOF )
            // InternalScheduleParser.g:87:1: ruleNetworkReference EOF
            {
             before(grammarAccess.getNetworkReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkReference();

            state._fsp--;

             after(grammarAccess.getNetworkReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNetworkReference"


    // $ANTLR start "ruleNetworkReference"
    // InternalScheduleParser.g:94:1: ruleNetworkReference : ( ( rule__NetworkReference__NetworkAssignment ) ) ;
    public final void ruleNetworkReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:98:2: ( ( ( rule__NetworkReference__NetworkAssignment ) ) )
            // InternalScheduleParser.g:99:2: ( ( rule__NetworkReference__NetworkAssignment ) )
            {
            // InternalScheduleParser.g:99:2: ( ( rule__NetworkReference__NetworkAssignment ) )
            // InternalScheduleParser.g:100:3: ( rule__NetworkReference__NetworkAssignment )
            {
             before(grammarAccess.getNetworkReferenceAccess().getNetworkAssignment()); 
            // InternalScheduleParser.g:101:3: ( rule__NetworkReference__NetworkAssignment )
            // InternalScheduleParser.g:101:4: rule__NetworkReference__NetworkAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NetworkReference__NetworkAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNetworkReferenceAccess().getNetworkAssignment()); 

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
    // $ANTLR end "ruleNetworkReference"


    // $ANTLR start "entryRuleDepotReference"
    // InternalScheduleParser.g:110:1: entryRuleDepotReference : ruleDepotReference EOF ;
    public final void entryRuleDepotReference() throws RecognitionException {
        try {
            // InternalScheduleParser.g:111:1: ( ruleDepotReference EOF )
            // InternalScheduleParser.g:112:1: ruleDepotReference EOF
            {
             before(grammarAccess.getDepotReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleDepotReference();

            state._fsp--;

             after(grammarAccess.getDepotReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDepotReference"


    // $ANTLR start "ruleDepotReference"
    // InternalScheduleParser.g:119:1: ruleDepotReference : ( ( rule__DepotReference__DepotAssignment ) ) ;
    public final void ruleDepotReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:123:2: ( ( ( rule__DepotReference__DepotAssignment ) ) )
            // InternalScheduleParser.g:124:2: ( ( rule__DepotReference__DepotAssignment ) )
            {
            // InternalScheduleParser.g:124:2: ( ( rule__DepotReference__DepotAssignment ) )
            // InternalScheduleParser.g:125:3: ( rule__DepotReference__DepotAssignment )
            {
             before(grammarAccess.getDepotReferenceAccess().getDepotAssignment()); 
            // InternalScheduleParser.g:126:3: ( rule__DepotReference__DepotAssignment )
            // InternalScheduleParser.g:126:4: rule__DepotReference__DepotAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DepotReference__DepotAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDepotReferenceAccess().getDepotAssignment()); 

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
    // $ANTLR end "ruleDepotReference"


    // $ANTLR start "entryRuleTrainReference"
    // InternalScheduleParser.g:135:1: entryRuleTrainReference : ruleTrainReference EOF ;
    public final void entryRuleTrainReference() throws RecognitionException {
        try {
            // InternalScheduleParser.g:136:1: ( ruleTrainReference EOF )
            // InternalScheduleParser.g:137:1: ruleTrainReference EOF
            {
             before(grammarAccess.getTrainReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainReference();

            state._fsp--;

             after(grammarAccess.getTrainReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainReference"


    // $ANTLR start "ruleTrainReference"
    // InternalScheduleParser.g:144:1: ruleTrainReference : ( ( rule__TrainReference__TrainAssignment ) ) ;
    public final void ruleTrainReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:148:2: ( ( ( rule__TrainReference__TrainAssignment ) ) )
            // InternalScheduleParser.g:149:2: ( ( rule__TrainReference__TrainAssignment ) )
            {
            // InternalScheduleParser.g:149:2: ( ( rule__TrainReference__TrainAssignment ) )
            // InternalScheduleParser.g:150:3: ( rule__TrainReference__TrainAssignment )
            {
             before(grammarAccess.getTrainReferenceAccess().getTrainAssignment()); 
            // InternalScheduleParser.g:151:3: ( rule__TrainReference__TrainAssignment )
            // InternalScheduleParser.g:151:4: rule__TrainReference__TrainAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TrainReference__TrainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTrainReferenceAccess().getTrainAssignment()); 

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
    // $ANTLR end "ruleTrainReference"


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalScheduleParser.g:159:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:163:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalScheduleParser.g:164:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Schedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0"


    // $ANTLR start "rule__Schedule__Group__0__Impl"
    // InternalScheduleParser.g:171:1: rule__Schedule__Group__0__Impl : ( SCHEDULE ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:175:1: ( ( SCHEDULE ) )
            // InternalScheduleParser.g:176:1: ( SCHEDULE )
            {
            // InternalScheduleParser.g:176:1: ( SCHEDULE )
            // InternalScheduleParser.g:177:2: SCHEDULE
            {
             before(grammarAccess.getScheduleAccess().getSCHEDULEKeyword_0()); 
            match(input,SCHEDULE,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getSCHEDULEKeyword_0()); 

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
    // $ANTLR end "rule__Schedule__Group__0__Impl"


    // $ANTLR start "rule__Schedule__Group__1"
    // InternalScheduleParser.g:186:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:190:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalScheduleParser.g:191:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1"


    // $ANTLR start "rule__Schedule__Group__1__Impl"
    // InternalScheduleParser.g:198:1: rule__Schedule__Group__1__Impl : ( FOR ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:202:1: ( ( FOR ) )
            // InternalScheduleParser.g:203:1: ( FOR )
            {
            // InternalScheduleParser.g:203:1: ( FOR )
            // InternalScheduleParser.g:204:2: FOR
            {
             before(grammarAccess.getScheduleAccess().getFORKeyword_1()); 
            match(input,FOR,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getFORKeyword_1()); 

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
    // $ANTLR end "rule__Schedule__Group__1__Impl"


    // $ANTLR start "rule__Schedule__Group__2"
    // InternalScheduleParser.g:213:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:217:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalScheduleParser.g:218:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Schedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2"


    // $ANTLR start "rule__Schedule__Group__2__Impl"
    // InternalScheduleParser.g:225:1: rule__Schedule__Group__2__Impl : ( ( rule__Schedule__NetworkReferenceAssignment_2 ) ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:229:1: ( ( ( rule__Schedule__NetworkReferenceAssignment_2 ) ) )
            // InternalScheduleParser.g:230:1: ( ( rule__Schedule__NetworkReferenceAssignment_2 ) )
            {
            // InternalScheduleParser.g:230:1: ( ( rule__Schedule__NetworkReferenceAssignment_2 ) )
            // InternalScheduleParser.g:231:2: ( rule__Schedule__NetworkReferenceAssignment_2 )
            {
             before(grammarAccess.getScheduleAccess().getNetworkReferenceAssignment_2()); 
            // InternalScheduleParser.g:232:2: ( rule__Schedule__NetworkReferenceAssignment_2 )
            // InternalScheduleParser.g:232:3: rule__Schedule__NetworkReferenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__NetworkReferenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getNetworkReferenceAssignment_2()); 

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
    // $ANTLR end "rule__Schedule__Group__2__Impl"


    // $ANTLR start "rule__Schedule__Group__3"
    // InternalScheduleParser.g:240:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl rule__Schedule__Group__4 ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:244:1: ( rule__Schedule__Group__3__Impl rule__Schedule__Group__4 )
            // InternalScheduleParser.g:245:2: rule__Schedule__Group__3__Impl rule__Schedule__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__3"


    // $ANTLR start "rule__Schedule__Group__3__Impl"
    // InternalScheduleParser.g:252:1: rule__Schedule__Group__3__Impl : ( WITH ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:256:1: ( ( WITH ) )
            // InternalScheduleParser.g:257:1: ( WITH )
            {
            // InternalScheduleParser.g:257:1: ( WITH )
            // InternalScheduleParser.g:258:2: WITH
            {
             before(grammarAccess.getScheduleAccess().getWITHKeyword_3()); 
            match(input,WITH,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getWITHKeyword_3()); 

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
    // $ANTLR end "rule__Schedule__Group__3__Impl"


    // $ANTLR start "rule__Schedule__Group__4"
    // InternalScheduleParser.g:267:1: rule__Schedule__Group__4 : rule__Schedule__Group__4__Impl rule__Schedule__Group__5 ;
    public final void rule__Schedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:271:1: ( rule__Schedule__Group__4__Impl rule__Schedule__Group__5 )
            // InternalScheduleParser.g:272:2: rule__Schedule__Group__4__Impl rule__Schedule__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Schedule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__4"


    // $ANTLR start "rule__Schedule__Group__4__Impl"
    // InternalScheduleParser.g:279:1: rule__Schedule__Group__4__Impl : ( ( rule__Schedule__DepotReferenceAssignment_4 ) ) ;
    public final void rule__Schedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:283:1: ( ( ( rule__Schedule__DepotReferenceAssignment_4 ) ) )
            // InternalScheduleParser.g:284:1: ( ( rule__Schedule__DepotReferenceAssignment_4 ) )
            {
            // InternalScheduleParser.g:284:1: ( ( rule__Schedule__DepotReferenceAssignment_4 ) )
            // InternalScheduleParser.g:285:2: ( rule__Schedule__DepotReferenceAssignment_4 )
            {
             before(grammarAccess.getScheduleAccess().getDepotReferenceAssignment_4()); 
            // InternalScheduleParser.g:286:2: ( rule__Schedule__DepotReferenceAssignment_4 )
            // InternalScheduleParser.g:286:3: rule__Schedule__DepotReferenceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__DepotReferenceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getDepotReferenceAssignment_4()); 

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
    // $ANTLR end "rule__Schedule__Group__4__Impl"


    // $ANTLR start "rule__Schedule__Group__5"
    // InternalScheduleParser.g:294:1: rule__Schedule__Group__5 : rule__Schedule__Group__5__Impl rule__Schedule__Group__6 ;
    public final void rule__Schedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:298:1: ( rule__Schedule__Group__5__Impl rule__Schedule__Group__6 )
            // InternalScheduleParser.g:299:2: rule__Schedule__Group__5__Impl rule__Schedule__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Schedule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__5"


    // $ANTLR start "rule__Schedule__Group__5__Impl"
    // InternalScheduleParser.g:306:1: rule__Schedule__Group__5__Impl : ( Colon ) ;
    public final void rule__Schedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:310:1: ( ( Colon ) )
            // InternalScheduleParser.g:311:1: ( Colon )
            {
            // InternalScheduleParser.g:311:1: ( Colon )
            // InternalScheduleParser.g:312:2: Colon
            {
             before(grammarAccess.getScheduleAccess().getColonKeyword_5()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Schedule__Group__5__Impl"


    // $ANTLR start "rule__Schedule__Group__6"
    // InternalScheduleParser.g:321:1: rule__Schedule__Group__6 : rule__Schedule__Group__6__Impl rule__Schedule__Group__7 ;
    public final void rule__Schedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:325:1: ( rule__Schedule__Group__6__Impl rule__Schedule__Group__7 )
            // InternalScheduleParser.g:326:2: rule__Schedule__Group__6__Impl rule__Schedule__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__6"


    // $ANTLR start "rule__Schedule__Group__6__Impl"
    // InternalScheduleParser.g:333:1: rule__Schedule__Group__6__Impl : ( TRAIN ) ;
    public final void rule__Schedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:337:1: ( ( TRAIN ) )
            // InternalScheduleParser.g:338:1: ( TRAIN )
            {
            // InternalScheduleParser.g:338:1: ( TRAIN )
            // InternalScheduleParser.g:339:2: TRAIN
            {
             before(grammarAccess.getScheduleAccess().getTRAINKeyword_6()); 
            match(input,TRAIN,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getTRAINKeyword_6()); 

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
    // $ANTLR end "rule__Schedule__Group__6__Impl"


    // $ANTLR start "rule__Schedule__Group__7"
    // InternalScheduleParser.g:348:1: rule__Schedule__Group__7 : rule__Schedule__Group__7__Impl ;
    public final void rule__Schedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:352:1: ( rule__Schedule__Group__7__Impl )
            // InternalScheduleParser.g:353:2: rule__Schedule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__7"


    // $ANTLR start "rule__Schedule__Group__7__Impl"
    // InternalScheduleParser.g:359:1: rule__Schedule__Group__7__Impl : ( ( rule__Schedule__TrainReferenceAssignment_7 ) ) ;
    public final void rule__Schedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:363:1: ( ( ( rule__Schedule__TrainReferenceAssignment_7 ) ) )
            // InternalScheduleParser.g:364:1: ( ( rule__Schedule__TrainReferenceAssignment_7 ) )
            {
            // InternalScheduleParser.g:364:1: ( ( rule__Schedule__TrainReferenceAssignment_7 ) )
            // InternalScheduleParser.g:365:2: ( rule__Schedule__TrainReferenceAssignment_7 )
            {
             before(grammarAccess.getScheduleAccess().getTrainReferenceAssignment_7()); 
            // InternalScheduleParser.g:366:2: ( rule__Schedule__TrainReferenceAssignment_7 )
            // InternalScheduleParser.g:366:3: rule__Schedule__TrainReferenceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__TrainReferenceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getTrainReferenceAssignment_7()); 

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
    // $ANTLR end "rule__Schedule__Group__7__Impl"


    // $ANTLR start "rule__Schedule__NetworkReferenceAssignment_2"
    // InternalScheduleParser.g:375:1: rule__Schedule__NetworkReferenceAssignment_2 : ( ruleNetworkReference ) ;
    public final void rule__Schedule__NetworkReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:379:1: ( ( ruleNetworkReference ) )
            // InternalScheduleParser.g:380:2: ( ruleNetworkReference )
            {
            // InternalScheduleParser.g:380:2: ( ruleNetworkReference )
            // InternalScheduleParser.g:381:3: ruleNetworkReference
            {
             before(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkReference();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Schedule__NetworkReferenceAssignment_2"


    // $ANTLR start "rule__Schedule__DepotReferenceAssignment_4"
    // InternalScheduleParser.g:390:1: rule__Schedule__DepotReferenceAssignment_4 : ( ruleDepotReference ) ;
    public final void rule__Schedule__DepotReferenceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:394:1: ( ( ruleDepotReference ) )
            // InternalScheduleParser.g:395:2: ( ruleDepotReference )
            {
            // InternalScheduleParser.g:395:2: ( ruleDepotReference )
            // InternalScheduleParser.g:396:3: ruleDepotReference
            {
             before(grammarAccess.getScheduleAccess().getDepotReferenceDepotReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDepotReference();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getDepotReferenceDepotReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Schedule__DepotReferenceAssignment_4"


    // $ANTLR start "rule__Schedule__TrainReferenceAssignment_7"
    // InternalScheduleParser.g:405:1: rule__Schedule__TrainReferenceAssignment_7 : ( ruleTrainReference ) ;
    public final void rule__Schedule__TrainReferenceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:409:1: ( ( ruleTrainReference ) )
            // InternalScheduleParser.g:410:2: ( ruleTrainReference )
            {
            // InternalScheduleParser.g:410:2: ( ruleTrainReference )
            // InternalScheduleParser.g:411:3: ruleTrainReference
            {
             before(grammarAccess.getScheduleAccess().getTrainReferenceTrainReferenceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainReference();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getTrainReferenceTrainReferenceParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Schedule__TrainReferenceAssignment_7"


    // $ANTLR start "rule__NetworkReference__NetworkAssignment"
    // InternalScheduleParser.g:420:1: rule__NetworkReference__NetworkAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NetworkReference__NetworkAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:424:1: ( ( ( RULE_ID ) ) )
            // InternalScheduleParser.g:425:2: ( ( RULE_ID ) )
            {
            // InternalScheduleParser.g:425:2: ( ( RULE_ID ) )
            // InternalScheduleParser.g:426:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkReferenceAccess().getNetworkNetworkCrossReference_0()); 
            // InternalScheduleParser.g:427:3: ( RULE_ID )
            // InternalScheduleParser.g:428:4: RULE_ID
            {
             before(grammarAccess.getNetworkReferenceAccess().getNetworkNetworkIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkReferenceAccess().getNetworkNetworkIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getNetworkReferenceAccess().getNetworkNetworkCrossReference_0()); 

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
    // $ANTLR end "rule__NetworkReference__NetworkAssignment"


    // $ANTLR start "rule__DepotReference__DepotAssignment"
    // InternalScheduleParser.g:439:1: rule__DepotReference__DepotAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DepotReference__DepotAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:443:1: ( ( ( RULE_ID ) ) )
            // InternalScheduleParser.g:444:2: ( ( RULE_ID ) )
            {
            // InternalScheduleParser.g:444:2: ( ( RULE_ID ) )
            // InternalScheduleParser.g:445:3: ( RULE_ID )
            {
             before(grammarAccess.getDepotReferenceAccess().getDepotDepotCrossReference_0()); 
            // InternalScheduleParser.g:446:3: ( RULE_ID )
            // InternalScheduleParser.g:447:4: RULE_ID
            {
             before(grammarAccess.getDepotReferenceAccess().getDepotDepotIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDepotReferenceAccess().getDepotDepotIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDepotReferenceAccess().getDepotDepotCrossReference_0()); 

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
    // $ANTLR end "rule__DepotReference__DepotAssignment"


    // $ANTLR start "rule__TrainReference__TrainAssignment"
    // InternalScheduleParser.g:458:1: rule__TrainReference__TrainAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TrainReference__TrainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:462:1: ( ( ( RULE_ID ) ) )
            // InternalScheduleParser.g:463:2: ( ( RULE_ID ) )
            {
            // InternalScheduleParser.g:463:2: ( ( RULE_ID ) )
            // InternalScheduleParser.g:464:3: ( RULE_ID )
            {
             before(grammarAccess.getTrainReferenceAccess().getTrainTrainCrossReference_0()); 
            // InternalScheduleParser.g:465:3: ( RULE_ID )
            // InternalScheduleParser.g:466:4: RULE_ID
            {
             before(grammarAccess.getTrainReferenceAccess().getTrainTrainIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTrainReferenceAccess().getTrainTrainIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTrainReferenceAccess().getTrainTrainCrossReference_0()); 

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
    // $ANTLR end "rule__TrainReference__TrainAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}