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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("For", "'for'");
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
    // InternalScheduleParser.g:57:1: entryRuleSchedule : ruleSchedule EOF ;
    public final void entryRuleSchedule() throws RecognitionException {
        try {
            // InternalScheduleParser.g:58:1: ( ruleSchedule EOF )
            // InternalScheduleParser.g:59:1: ruleSchedule EOF
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
    // InternalScheduleParser.g:66:1: ruleSchedule : ( ( rule__Schedule__Group__0 ) ) ;
    public final void ruleSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:70:2: ( ( ( rule__Schedule__Group__0 ) ) )
            // InternalScheduleParser.g:71:2: ( ( rule__Schedule__Group__0 ) )
            {
            // InternalScheduleParser.g:71:2: ( ( rule__Schedule__Group__0 ) )
            // InternalScheduleParser.g:72:3: ( rule__Schedule__Group__0 )
            {
             before(grammarAccess.getScheduleAccess().getGroup()); 
            // InternalScheduleParser.g:73:3: ( rule__Schedule__Group__0 )
            // InternalScheduleParser.g:73:4: rule__Schedule__Group__0
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


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalScheduleParser.g:81:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:85:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalScheduleParser.g:86:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
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
    // InternalScheduleParser.g:93:1: rule__Schedule__Group__0__Impl : ( Schedule ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:97:1: ( ( Schedule ) )
            // InternalScheduleParser.g:98:1: ( Schedule )
            {
            // InternalScheduleParser.g:98:1: ( Schedule )
            // InternalScheduleParser.g:99:2: Schedule
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
    // InternalScheduleParser.g:108:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:112:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalScheduleParser.g:113:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
            {
            pushFollow(FOLLOW_1);
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
    // InternalScheduleParser.g:120:1: rule__Schedule__Group__1__Impl : ( For ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:124:1: ( ( For ) )
            // InternalScheduleParser.g:125:1: ( For )
            {
            // InternalScheduleParser.g:125:1: ( For )
            // InternalScheduleParser.g:126:2: For
            {
             before(grammarAccess.getScheduleAccess().getForKeyword_1()); 
            match(input,For,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getForKeyword_1()); 

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
    // InternalScheduleParser.g:135:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:139:1: ( rule__Schedule__Group__2__Impl )
            // InternalScheduleParser.g:140:2: rule__Schedule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__2__Impl();

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
    // InternalScheduleParser.g:146:1: rule__Schedule__Group__2__Impl : ( () ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheduleParser.g:150:1: ( ( () ) )
            // InternalScheduleParser.g:151:1: ( () )
            {
            // InternalScheduleParser.g:151:1: ( () )
            // InternalScheduleParser.g:152:2: ()
            {
             before(grammarAccess.getScheduleAccess().getScheduleAction_2()); 
            // InternalScheduleParser.g:153:2: ()
            // InternalScheduleParser.g:153:3: 
            {
            }

             after(grammarAccess.getScheduleAccess().getScheduleAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2__Impl"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});

}