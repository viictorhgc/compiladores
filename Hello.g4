grammar Hello;

sentence : 'inicio' 'classe' nomeclasse expr 'fim' ;
expr: expr op expr | INT | ID | '(' expr ')' | exprop2 op2 exprop2;
exprop2 : INT;
nomeclasse : ID;
ID : [a-zA-Z]+ ;
INT : [0-9]+;
op : '+' | '-';
op2 : '*' | '/';

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
