grammar Hello;

sentence : 'inicio' 'classe' ID expr 'fim' ;
expr: expr ('*'|'/') expr | expr ('+'|'-') expr | INT | ID | '(' expr ')' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+;


ESCREVA : 'escreva';
IF : 'if';
FIMIF : 'fimif';
FOR : 'for';
FIMFOR : 'fimfor';
abrep : '(';
fechap : ')';
maior :'>';
menor : '<';
igual : '==';
atribui :'=';



WS : [ \t\r\n]+ -> skip;

