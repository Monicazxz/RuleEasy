parser grammar RuleParser ;

options {
    tokenVocab = RuleLexer;
}

steps
	: step follow_step? PERIOD EOF ;

step
	: K_EXECUTE process ;

follow_step
    : COMMA (is_continue COMMA)? K_THEN step;

process
	: CHINESE_CHAR ;

is_continue
    : K_SUCCESS | K_FAIL ;