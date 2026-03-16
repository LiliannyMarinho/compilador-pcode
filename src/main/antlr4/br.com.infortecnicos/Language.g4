grammar Language;

prog: stat* EOF;

// STATEMENTS
stat
    : varDecl
    | assig
    | ifStat
    | whileStat
    | printStat
    | inputStat
    ;

// DECLARAÇÃO
varDecl: VAR IDENT ('=' expr)? ';' ;

// ATRIBUIÇÃO
assig: IDENT '=' expr ';' ;

// IF
ifStat: IF '(' cond ')' block ;

// WHILE
whileStat: WHILE '(' cond ')' block ;

// PRINT
printStat: PRINT '(' (STRING | expr) ')' ';' ;

// INPUT
inputStat: INPUT '(' IDENT ')' ';' ;

// BLOCO
block: '{' stat* '}' ;


// EXPRESSÕES ARITMÉTICAS
expr
    : <assoc=right> expr '^' expr
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | atom
    ;

atom
    : NUMBER
    | IDENT
    | '(' expr ')'
    ;


// EXPRESSÕES BOOLEANAS
cond: orExpr ;

orExpr: andExpr (OR andExpr)* ;

andExpr: notExpr (AND notExpr)* ;

notExpr
    : NOT notExpr
    | comparison
    | TRUE
    | FALSE
    | '(' cond ')'
    ;

comparison: expr RELATIONAL expr ;


// KEYWORDS
VAR: 'var';
IF: 'if';
WHILE: 'while';
PRINT: 'print';
INPUT: 'input';
AND: 'and';
OR: 'or';
NOT: 'not';
TRUE: 'true';
FALSE: 'false';

// OPERADORES
RELATIONAL: '<=' | '>=' | '==' | '!=' | '<' | '>' ;

// LITERAIS
NUMBER: [0-9]+ ('.' [0-9]+)? ;

STRING: '"' ( '\\' . | ~["\\] )* '"' ;

// IDENTIFICADOR
IDENT: [a-zA-Z_][a-zA-Z0-9_]* ;

// IGNORAR
WS: [ \t\r\n]+ -> skip ;
COMMENT: '//' ~[\r\n]* -> skip ;