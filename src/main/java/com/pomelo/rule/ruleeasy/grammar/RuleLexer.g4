lexer grammar RuleLexer ;

K_EXECUTE
    : '执行' ;

K_THEN
    : '再' ;

K_SUCCESS
    : '如果成功' ;

K_FAIL
    : '如果失败' ;

COMMA
    : ',' ;

PERIOD
    : '.' ;

CHINESE_CHAR
    : [\u4e00-\u9fffa-zA-Z0-9（）()、]+ ;

SPACES
    : [ \u000B\t\r\n] -> skip ;