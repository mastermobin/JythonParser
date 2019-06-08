grammar Jython;

program : importclass* (classDec)? ;

importclass : ('import' USER_TYPE) ;

classDec : 'class'  className = USER_TYPE ('(' parentClass = USER_TYPE ')')? '{' class_body* '}' ;

class_body : varDec
           | methodDec
           | constructor
           | arrayDec
           | assignment
           ;

varDec : varType = type  varName = ID  ;

arrayDec : varType = type '['expression']' varName = ID  ;

methodDec : 'def'  methodType = return_type name = ID '(' parameters* ')''{' ( statment)* '}';

return_type : type|'void'|type '['']';

constructor : 'def'  USER_TYPE '(' parameters ')''{' ( statment)* '}' ;

variable : (varDec | arrayDec);

parameters : variable (',' variable)* ;

statment :
          while_statment
         | if_else_statment
         | for_statment
         | varDec
         | assignment
         | print_statment
         | method_call
         | return_statment
         | arrayDec
         ;

return_statment : 'return'  expression ;

condition_list : expression (('or'|'and')  expression)* ;

while_statment : 'while' '(' condition_list ')' '{' statment* '}' ;

if_else_statment : ifexp elifexp* elseexp?;

ifexp : 'if' '(' condition_list ')' '{' statment* '}';
elifexp : ('elif' '(' condition_list ')' '{' statment* '}');
elseexp :  ('else' '{' statment* '}');

print_statment : 'print' '('  expression ')' ;

for_statment : 'for' it = ID 'in' leftExp '{' statment* '}'
             | 'for' it = ID 'in' 'range''('expression (',' expression)? (',' expression)? ')' '{' statment* '}'
             ;

assignment  : leftExp assignment_operators expression
            | varDec assignment_operators expression
            | arrayDec '='  type '('')' ('['expression']')
            | leftExp '=' type '(' ')' ('['expression']')
            ;


expression  :
              expression mult_mod_div expression
            | expression add_sub expression
            | expression eq_neq  expression
            | expression relation_operators expression
            | rightExp
            ;

rightExp :
              'none'
            | BOOL
            | INTEGER
            | STRING
            | FLOAT
            | USER_TYPE args
            | parentheses
            | method_call
            | leftExp
            ;

leftExp :  ((var | 'self' | func) (('.' var) | index | ('.' func))* (('.' var) | index)) | var;
leftFun : ((var | 'self' | func) (('.' var) | index | ('.' func))* (('.' var) | index)) | var;
method_call: ((leftFun '.') | 'self' )? func;

var : varName = ID ;
func : funcName = ID args;
index : '[' expression ']';
parentheses : '(' expression ')';
args :  '(' (explist)? ')' ;
explist  :  expression (',' expression)*;


assignment_operators : '=' | '+=' | '-=' | '*=' | '/=' ;
eq_neq               : '==' | '!=' ;
relation_operators   : '>' | '<' | '>=' | '<=';
add_sub              : '+' | '-';
mult_mod_div         : '*' | '/' | '%';
type                 : jythonType | USER_TYPE ;
USER_TYPE            : UpperCaseChar (LowerCaseChar|UpperCaseChar|DIGIT|'_')*  ;
jythonType           : 'float'|'int'|'bool'|'string';
ID                   : (LowerCaseChar)(LowerCaseChar|UpperCaseChar|DIGIT|'_' )*;
INTEGER              : CDIGIT(DIGIT)* | [0] ;
STRING               : '"' ~('\r' | '\n' | '"')* '"';
BOOL                 : 'false' |'true';
FLOAT                : DIGIT*'.'(DIGIT)+;
LowerCaseChar        : [a-z];
UpperCaseChar        : [A-Z];
DIGIT                : [0-9];
CDIGIT               : [1-9];
WS                   : [ \t]+ -> skip ;
NEWLINE              : ( '\r' '\n'?| '\n') -> skip ;
BlockComment         : '#*' .*? '*#'  -> skip  ;
LineComment          : '#' ~('\r'|'\n')* -> skip ;