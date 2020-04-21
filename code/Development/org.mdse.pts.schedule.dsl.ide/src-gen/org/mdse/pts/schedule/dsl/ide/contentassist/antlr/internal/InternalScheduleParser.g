/*
 * generated by Xtext 2.21.0
 */
parser grammar InternalScheduleParser;

options {
	tokenVocab=InternalScheduleLexer;
	superClass=AbstractInternalContentAssistParser;
}

@header {
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

}
@members {
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
}

// Entry rule entryRuleSchedule
entryRuleSchedule
:
{ before(grammarAccess.getScheduleRule()); }
	 ruleSchedule
{ after(grammarAccess.getScheduleRule()); } 
	 EOF 
;

// Rule Schedule
ruleSchedule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScheduleAccess().getGroup()); }
		(rule__Schedule__Group__0)
		{ after(grammarAccess.getScheduleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNetworkReference
entryRuleNetworkReference
:
{ before(grammarAccess.getNetworkReferenceRule()); }
	 ruleNetworkReference
{ after(grammarAccess.getNetworkReferenceRule()); } 
	 EOF 
;

// Rule NetworkReference
ruleNetworkReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNetworkReferenceAccess().getGroup()); }
		(rule__NetworkReference__Group__0)
		{ after(grammarAccess.getNetworkReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schedule__Group__0__Impl
	rule__Schedule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); }
	Schedule
	{ after(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schedule__Group__1__Impl
	rule__Schedule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScheduleAccess().getNetworkReferenceAssignment_1()); }
	(rule__Schedule__NetworkReferenceAssignment_1)
	{ after(grammarAccess.getScheduleAccess().getNetworkReferenceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schedule__Group__2__Impl
	rule__Schedule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScheduleAccess().getWithKeyword_2()); }
	With
	{ after(grammarAccess.getScheduleAccess().getWithKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schedule__Group__3__Impl
	rule__Schedule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScheduleAccess().getWithDepotAssignment_3()); }
	(rule__Schedule__WithDepotAssignment_3)
	{ after(grammarAccess.getScheduleAccess().getWithDepotAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Schedule__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScheduleAccess().getColonKeyword_4()); }
	Colon
	{ after(grammarAccess.getScheduleAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkReference__Group__0__Impl
	rule__NetworkReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkReferenceAccess().getForKeyword_0()); }
	For
	{ after(grammarAccess.getNetworkReferenceAccess().getForKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkReferenceAccess().getForAssignment_1()); }
	(rule__NetworkReference__ForAssignment_1)
	{ after(grammarAccess.getNetworkReferenceAccess().getForAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Schedule__NetworkReferenceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_1_0()); }
		ruleNetworkReference
		{ after(grammarAccess.getScheduleAccess().getNetworkReferenceNetworkReferenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Schedule__WithDepotAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScheduleAccess().getWithDepotDepotCrossReference_3_0()); }
		(
			{ before(grammarAccess.getScheduleAccess().getWithDepotDepotIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getScheduleAccess().getWithDepotDepotIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getScheduleAccess().getWithDepotDepotCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkReference__ForAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkReferenceAccess().getForNetworkCrossReference_1_0()); }
		(
			{ before(grammarAccess.getNetworkReferenceAccess().getForNetworkIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNetworkReferenceAccess().getForNetworkIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getNetworkReferenceAccess().getForNetworkCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
