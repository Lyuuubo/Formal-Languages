grammar CondStatement;
init : 'if' '(' exp ')' exp ;

exp: 	exp '+' exp		# AddExpr
	| exp '-' exp		# SubExpr
 	| exp '<' exp		# LowerExpr
  	| exp '>' exp		# HiguerExpr
 	| exp '<=' exp		# LowerEqExpr
 	| exp '>=' exp		# HigherEqExpr
 	| exp '=' exp		# EqualExpr
 	| INT			# IntExpr
 	| VARNAME		# VarnameExpr
 	| '(' exp ')'		# ExprExpr
 	;

ADD : '+ ' ; // assigns token name to '*' used above in grammar
SUB : '-' ;
LOWER : '<' ;
HIGHER : '>' ;
LEQ : ' <=' ;
HEQ : ' >=' ;
EQ : '=' ;

INT : [0-9]+ ;
VARNAME: ([a-z] | [A-Z]) ( [a-z] | [A-Z] | [0-9] )*;
WS : [ \t\r\n]+ -> skip ;

