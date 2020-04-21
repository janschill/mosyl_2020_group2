/*
 * generated by Xtext 2.21.0
 */
lexer grammar InternalScheduleLexer;

@header {
package org.mdse.pts.schedule.dsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Schedule : ('S'|'s')('C'|'c')('H'|'h')('E'|'e')('D'|'d')('U'|'u')('L'|'l')('E'|'e');

With : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

For : ('F'|'f')('O'|'o')('R'|'r');

Colon : ':';

fragment RULE_LETTER : ('a'..'z'|'A'..'Z');

fragment RULE_DIGIT : '0'..'9';

RULE_ID : '^'? ('_'|RULE_LETTER) ('_'|RULE_LETTER|RULE_DIGIT)*;

RULE_INT : RULE_DIGIT+;

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
