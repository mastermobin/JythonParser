grammar Jython;

program : importClass* (classDec)? ;

importClass : ('import' USER_TYPE) ;

classDec : 'class'  className = USER_TYPE ('(' parentClass = USER_TYPE ')')? '{' classBody* '}' ;

classBody : varDec
           | methodDec
           | constructor
           | arrayDec
           | assignment
           ;

varDec : varType = type  varName = ID  ;

arrayDec : varType = type '['']' varName = ID  ;

methodDec : 'def'  methodType = returnType name = ID '(' parameters* ')''{' ( statement)* '}';

returnType : type|'void'|type '['']';

constructor : 'def'  USER_TYPE '(' parameters ')''{' ( statement)* '}' ;

variable : (varDec | arrayDec);

parameters : variable (',' variable)* ;

statement :
          whileStatement
         | ifElseStatement
         | forStatement
         | varDec
         | assignment
         | printStatement
         | methodCall
         | returnStatement
         | arrayDec
         ;

returnStatement : 'return'  expression ;

conditionList : expression (('or'|'and')  expression)* ;

whileStatement : 'while' '(' conditionList ')' '{' statement* '}' ;

ifElseStatement : ifExp elifExp* elseExp?;

ifExp : 'if' '(' conditionList ')' '{' statement* '}';
elifExp : ('elif' '(' conditionList ')' '{' statement* '}');
elseExp :  ('else' '{' statement* '}');

printStatement : 'print' '('  expression ')' ;

forStatement : 'for' it = ID 'in' leftExp '{' statement* '}'
             | 'for' it = ID 'in' 'range''('expression (',' expression)? (',' expression)? ')' '{' statement* '}'
             ;

assignment  : varAssign
            | varDecAssign
            | arrayDec '='  arrayRightDec
            | leftExp '=' arrayRightDec
            ;

varDecAssign: varDec assignmentOperators expression;
varAssign: leftExp assignmentOperators expression;

arrayRightDec : type '('')' ('['expression']');


expression  :
              expression multModDiv expression
            | expression addSub expression
            | expression eqNeq  expression
            | expression relationOperators expression
            | rightExp
            ;

rightExp :
            'none'
            | bool
            | INTEGER
            | STRING
            | FLOAT
            | USER_TYPE args
            | parentheses
            | methodCall
            | leftExp
            ;


leftExp :  ((var | 'self' | func) (('.' var) | index | ('.' func))* (('.' var) | index)) | var;
leftFun : ((var | 'self' | func) (('.' var) | index | ('.' func))* (('.' var) | index)) | var;
methodCall: ((leftFun '.') | 'self' )? func;

var : varName = ID ;
func : funcName = ID args;
index : '[' expression ']';
parentheses : '(' expression ')';
args :  '(' (explist)? ')' ;
explist  :  expression (',' expression)*;


assignmentOperators : '=' | '+=' | '-=' | '*=' | '/=' ;
eqNeq               : '==' | '!=' ;
relationOperators   : '>' | '<' | '>=' | '<=';
addSub              : '+' | '-';
multModDiv         : '*' | '/' | '%';
type                 : jythonType | USER_TYPE ;
USER_TYPE            : UpperCaseChar (LowerCaseChar|UpperCaseChar|DIGIT|'_')*  ;
jythonType           : 'float'|'int'|'bool'|'string';
ID                   : (LowerCaseChar)(LowerCaseChar|UpperCaseChar|DIGIT|'_' )*;
INTEGER              : CDIGIT(DIGIT)* | [0] ;
STRING               : '"' ~('\r' | '\n' | '"')* '"';
bool                 : 'true' | 'false';
FLOAT                : DIGIT*'.'(DIGIT)*;
LowerCaseChar        : [a-z];
UpperCaseChar        : [A-Z];
DIGIT                : [0-9];
CDIGIT               : [1-9];
WS                   : [ \t]+ -> skip ;
NEWLINE              : ( '\r' '\n'?| '\n') -> skip ;
BlockComment         : '#*' .*? '*#'  -> skip  ;
LineComment          : '#' ~('\r'|'\n')* -> skip ;