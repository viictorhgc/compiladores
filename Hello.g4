grammar Hello;

sentence : 'inicio' 'classe' ID operacoes 'fim' ;
operacoes : D soma D | D menos D | D mult D | D div D;
ID : [a-z]+ ;
D : [0-9];


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
soma : '+';
mult : '*';
menos : '-';
div : '/';


WS : [ \t\r\n]+ -> skip;

