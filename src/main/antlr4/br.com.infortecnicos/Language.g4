grammar Language;

prog: stat* EOF;

// STATEMENTS
stat
    : varDecl
    | assign
    | ifStat
    | whileStat
    | forStat
    | printStat
    | inputStat
    ;

// DECLARAÇÃO
varDecl: VAR IDENT ('=' expr)? ';' ;

// ATRIBUIÇÃO
assign: IDENT '=' expr (';')? ;

// CONTROLE
ifStat: IF '(' cond ')' block (ELSE block)? ;

whileStat: WHILE '(' cond ')' block ;

forStat: FOR '(' assign ';' cond ';' assign ')' block ;

// IO
printStat: PRINT '(' (STRING | expr) ')' ';' ;

inputStat: INPUT '(' IDENT ')' ';' ;

// BLOCO
block: '{' (stat)* '}' ;

// EXPRESSÕES
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

// BOOLEANOS
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
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
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

// IDENT
IDENT: [a-zA-Z_][a-zA-Z0-9_]* ;

// IGNORAR
WS: [ \t\r\n]+ -> skip ;
COMMENT: '//' ~[\r\n]* -> skip ;