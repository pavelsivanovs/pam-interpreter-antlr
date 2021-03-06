grammar Pam;
progr : series NEWLINE;
series : stmt (';' stmt)*;
stmt : input_stmt | output_stmt | assign_stmt | cond_stmt | loop;
input_stmt : 'read' varlist;
output_stmt : 'write' varlist;
assign_stmt : VARNAME ':=' (expr | logical_expr);
cond_stmt : 'if' (logical_expr) 'then' series ('else' series)? 'fi';
loop : 'while' (logical_expr) 'do' series 'end';
logical_expr : logical_expr DISJ logical_term | logical_term;
logical_term : logical_term CONJ logical_neg_elem | logical_neg_elem;
logical_neg_elem : NEG logical_elem | logical_elem;
logical_elem : '('logical_expr')' | BOOL | compar | VARNAME;
compar : expr RELATION expr;
varlist : VARNAME (',' VARNAME)*;
expr : term (WEAKOP term)*;
term : elem (STRONGOP elem)*;
elem : NUMBER | VARNAME | '(' expr ')';
BOOL : 'TRUE' | 'FALSE';
CONJ : 'and';
DISJ : 'or';
NEG : 'not';
NEWLINE : '\r' ? '\n';
WEAKOP : '+' | '-';
STRONGOP : '*' | '/';
RELATION : '<>' | '=<' | '>='| '=' | '<' | '>' ;
NUMBER : [1-9][0-9]* | [0];
VARNAME : ([a-z]|[A-Z]|'_') ([a-z]|[A-Z]|[0-9]|'_')*;
WS : [ \t\r\n]+ -> skip;
