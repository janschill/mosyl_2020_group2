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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("For", "'for'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("Schedule", "'schedule'");
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
    // InternalScheduleParser.g:59:1: entryRuleSchedule : ruleSchedule EOF ;
    public final void entryRuleSchedule() throws RecognitionException {
        try {
            // InternalScheduleParser.g:60:1: ( ruleSchedule EOF )
            // InternalScheduleParser.g:61:1: ruleSchedule EOF
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
    // InternalScheduleParser.g:68:1: ruleSchedule : ( ( rule__Schedule__Group__0 ) ) ;
    public final void ruleSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:72:2: ( ( ( rule__Schedule__Group__0 ) ) )
            // InternalScheduleParser.g:73:2: ( ( rule__Schedule__Group__0 ) )
            {
            // InternalScheduleParser.g:73:2: ( ( rule__Schedule__Group__0 ) )
            // InternalScheduleParser.g:74:3: ( rule__Schedule__Group__0 )
            {
             before(grammarAccess.getScheduleAccess().getGroup()); 
            // InternalScheduleParser.g:75:3: ( rule__Schedule__Group__0 )
            // InternalScheduleParser.g:75:4: rule__Schedule__Group__0
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
    // InternalScheduleParser.g:84:1: entryRuleNetworkReference : ruleNetworkReference EOF ;
    public final void entryRuleNetworkReference() throws RecognitionException {
        try {
            // InternalScheduleParser.g:85:1: ( ruleNetworkReference EOF )
            // InternalScheduleParser.g:86:1: ruleNetworkReference EOF
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
    // InternalScheduleParser.g:93:1: ruleNetworkReference : ( ( rule__NetworkReference__Group__0 ) ) ;
    public final void ruleNetworkReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:97:2: ( ( ( rule__NetworkReference__Group__0 ) ) )
            // InternalScheduleParser.g:98:2: ( ( rule__NetworkReference__Group__0 ) )
            {
            // InternalScheduleParser.g:98:2: ( ( rule__NetworkReference__Group__0 ) )
            // InternalScheduleParser.g:99:3: ( rule__NetworkReference__Group__0 )
            {
             before(grammarAccess.getNetworkReferenceAccess().getGroup()); 
            // InternalScheduleParser.g:100:3: ( rule__NetworkReference__Group__0 )
            // InternalScheduleParser.g:100:4: rule__NetworkReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkReferenceAccess().getGroup()); 

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


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalScheduleParser.g:108:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:112:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalScheduleParser.g:113:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
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
    // InternalScheduleParser.g:120:1: rule__Schedule__Group__0__Impl : ( Schedule ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:124:1: ( ( Schedule ) )
            // InternalScheduleParser.g:125:1: ( Schedule )
            {
            // InternalScheduleParser.g:125:1: ( Schedule )
            // InternalScheduleParser.g:126:2: Schedule
            {
             before(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); 
            match(input,Schedule,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); 

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
    // InternalScheduleParser.g:135:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:139:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalScheduleParser.g:140:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
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
    // InternalScheduleParser.g:147:1: rule__Schedule__Group__1__Impl : ( ( rule__Schedule__NetworkReferenceAssignment_1 ) ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:151:1: ( ( ( rule__Schedule__NetworkReferenceAssignment_1 ) ) )
            // InternalScheduleParser.g:152:1: ( ( rule__Schedule__NetworkReferenceAssignment_1 ) )
            {
            // InternalScheduleParser.g:152:1: ( ( rule__Schedule__NetworkReferenceAssignment_1 ) )
            // InternalScheduleParser.g:153:2: ( rule__Schedule__NetworkReferenceAssignment_1 )
            {
             before(grammarAccess.getScheduleAccess().getNetworkReferenceAssignment_1()); 
            // InternalScheduleParser.g:154:2: ( rule__Schedule__NetworkReferenceAssignment_1 )
            // InternalScheduleParser.g:154:3: rule__Schedule__NetworkReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__NetworkReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getNetworkReferenceAssignment_1()); 

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
    // InternalScheduleParser.g:162:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:166:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalScheduleParser.g:167:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
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
    // InternalScheduleParser.g:174:1: rule__Schedule__Group__2__Impl : ( With ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:178:1: ( ( With ) )
            // InternalScheduleParser.g:179:1: ( With )
            {
            // InternalScheduleParser.g:179:1: ( With )
            // InternalScheduleParser.g:180:2: With
            {
             before(grammarAccess.getScheduleAccess().getWithKeyword_2()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getWithKeyword_2()); 

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
    // InternalScheduleParser.g:189:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl rule__Schedule__Group__4 ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:193:1: ( rule__Schedule__Group__3__Impl rule__Schedule__Group__4 )
            // InternalScheduleParser.g:194:2: rule__Schedule__Group__3__Impl rule__Schedule__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalScheduleParser.g:201:1: rule__Schedule__Group__3__Impl : ( ( rule__Schedule__WithDepotAssignment_3 ) ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:205:1: ( ( ( rule__Schedule__WithDepotAssignment_3 ) ) )
            // InternalScheduleParser.g:206:1: ( ( rule__Schedule__WithDepotAssignment_3 ) )
            {
            // InternalScheduleParser.g:206:1: ( ( rule__Schedule__WithDepotAssignment_3 ) )
            // InternalScheduleParser.g:207:2: ( rule__Schedule__WithDepotAssignment_3 )
            {
             before(grammarAccess.getScheduleAccess().getWithDepotAssignment_3()); 
            // InternalScheduleParser.g:208:2: ( rule__Schedule__WithDepotAssignment_3 )
            // InternalScheduleParser.g:208:3: rule__Schedule__WithDepotAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__WithDepotAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getWithDepotAssignment_3()); 

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
    // InternalScheduleParser.g:216:1: rule__Schedule__Group__4 : rule__Schedule__Group__4__Impl ;
    public final void rule__Schedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:220:1: ( rule__Schedule__Group__4__Impl )
            // InternalScheduleParser.g:221:2: rule__Schedule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__4__Impl();

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
    // InternalScheduleParser.g:227:1: rule__Schedule__Group__4__Impl : ( Colon ) ;
    public final void rule__Schedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:231:1: ( ( Colon ) )
            // InternalScheduleParser.g:232:1: ( Colon )
            {
            // InternalScheduleParser.g:232:1: ( Colon )
            // InternalScheduleParser.g:233:2: Colon
            {
             before(grammarAccess.getScheduleAccess().getColonKeyword_4()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getColonKeyword_4()); 

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


    // $ANTLR start "rule__NetworkReference__Group__0"
    // InternalScheduleParser.g:243:1: rule__NetworkReference__Group__0 : rule__NetworkReference__Group__0__Impl rule__NetworkReference__Group__1 ;
    public final void rule__NetworkReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:247:1: ( rule__NetworkReference__Group__0__Impl rule__NetworkReference__Group__1 )
            // InternalScheduleParser.g:248:2: rule__NetworkReference__Group__0__Impl rule__NetworkReference__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkReference__Group__1();

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
    // $ANTLR end "rule__NetworkReference__Group__0"


    // $ANTLR start "rule__NetworkReference__Group__0__Impl"
    // InternalScheduleParser.g:255:1: rule__NetworkReference__Group__0__Impl : ( For ) ;
    public final void rule__NetworkReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:259:1: ( ( For ) )
            // InternalScheduleParser.g:260:1: ( For )
            {
            // InternalScheduleParser.g:260:1: ( For )
            // InternalScheduleParser.g:261:2: For
            {
             before(grammarAccess.getNetworkReferenceAccess().getForKeyword_0()); 
            match(input,For,FOLLOW_2); 
             after(grammarAccess.getNetworkReferenceAccess().getForKeyword_0()); 

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
    // $ANTLR end "rule__NetworkReference__Group__0__Impl"


    // $ANTLR start "rule__NetworkReference__Group__1"
    // InternalScheduleParser.g:270:1: rule__NetworkReference__Group__1 : rule__NetworkReference__Group__1__Impl ;
    public final void rule__NetworkReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:274:1: ( rule__NetworkReference__Group__1__Impl )
            // InternalScheduleParser.g:275:2: rule__NetworkReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkReference__Group__1__Impl();

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
    // $ANTLR end "rule__NetworkReference__Group__1"


    // $ANTLR start "rule__NetworkReference__Group__1__Impl"
    // InternalScheduleParser.g:281:1: rule__NetworkReference__Group__1__Impl : ( ( rule__NetworkReference__ForAssignment_1 ) ) ;
    public final void rule__NetworkReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:285:1: ( ( ( rule__NetworkReference__ForAssignment_1 ) ) )
            // InternalScheduleParser.g:286:1: ( ( rule__NetworkReference__ForAssignment_1 ) )
            {
            // InternalScheduleParser.g:286:1: ( ( rule__NetworkReference__ForAssignment_1 ) )
            // InternalScheduleParser.g:287:2: ( rule__NetworkReference__ForAssignment_1 )
            {
             before(grammarAccess.getNetworkReferenceAccess().getForAssignment_1()); 
            // InternalScheduleParser.g:288:2: ( rule__NetworkReference__ForAssignment_1 )
            // InternalScheduleParser.g:288:3: rule__NetworkReference__ForAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkReference__ForAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkReferenceAccess().getForAssignment_1()); 

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
    // $ANTLR end "rule__NetworkReference__Group__1__Impl"


    // $ANTLR start "rule__Schedule__NetworkReferenceAssignment_1"
    // InternalScheduleParser.g:297:1: rule__Schedule__NetworkReferenceAssignment_1 : ( ruleNetworkReference ) ;
    public final void rule__Schedule__NetworkReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:301:1: ( ( ruleNetworkReference ) )
            // InternalScheduleParser.g:302:2: ( ruleNetworkReference )
            {
            // InternalScheduleParser.g:302:2: ( ruleNetworkReference )
            // InternalScheduleParser.g:303:3: ruleNetworkReference
            {
             before(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkReference();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Schedule__NetworkReferenceAssignment_1"


    // $ANTLR start "rule__Schedule__WithDepotAssignment_3"
    // InternalScheduleParser.g:312:1: rule__Schedule__WithDepotAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__WithDepotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:316:1: ( ( ( RULE_ID ) ) )
            // InternalScheduleParser.g:317:2: ( ( RULE_ID ) )
            {
            // InternalScheduleParser.g:317:2: ( ( RULE_ID ) )
            // InternalScheduleParser.g:318:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getWithDepotDepotCrossReference_3_0()); 
            // InternalScheduleParser.g:319:3: ( RULE_ID )
            // InternalScheduleParser.g:320:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getWithDepotDepotIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getWithDepotDepotIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getWithDepotDepotCrossReference_3_0()); 

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
    // $ANTLR end "rule__Schedule__WithDepotAssignment_3"


    // $ANTLR start "rule__NetworkReference__ForAssignment_1"
    // InternalScheduleParser.g:331:1: rule__NetworkReference__ForAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkReference__ForAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:335:1: ( ( ( RULE_ID ) ) )
            // InternalScheduleParser.g:336:2: ( ( RULE_ID ) )
            {
            // InternalScheduleParser.g:336:2: ( ( RULE_ID ) )
            // InternalScheduleParser.g:337:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkReferenceAccess().getForNetworkCrossReference_1_0()); 
            // InternalScheduleParser.g:338:3: ( RULE_ID )
            // InternalScheduleParser.g:339:4: RULE_ID
            {
             before(grammarAccess.getNetworkReferenceAccess().getForNetworkIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkReferenceAccess().getForNetworkIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNetworkReferenceAccess().getForNetworkCrossReference_1_0()); 

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
    // $ANTLR end "rule__NetworkReference__ForAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});

}