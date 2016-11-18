header {package decaf;}

options 
{
  mangleLiteralPrefix = "TK_";
  language="Java";
}

class DecafScanner extends Lexer;
options 
{
  k=4;
}

tokens 
{
  "class"; "int"; "escreva"; "if"; "maior";
}

LCURLY options { paraphrase = "{"; } : "{";
RCURLY options { paraphrase = "}"; } : "}";

FIMPROG options {paraphrase = "an identifier";} : ("fim");

INICIOPROG options {paraphrase = "an identifier";} : ("inicio");

NOMECLASSE options {paraphrase = "an identifier";} : ("classe");

ABREP options {paraphrase = "an identifier";} : ("(");

FECHAP options {paraphrase = "an identifier";} : (")");

ID options { paraphrase = "an identifier"; } : ('a'..'z' | 'A'..'Z')+;

INT options { paraphrase = "an identifier"; } : ('0'..'9')+;

OP options { paraphrase = "an identifier"; } : ('+'|'-'|'!'|'&');

OP2 options {paraphrase = "an identifier";} : ('*'|'/');

IF options {paraphrase = "an identifier";} : ("if");

FIMIF options {paraphrase = "an identifier";} : ("fimif");

FOR options {paraphrase = "an identifier";} : ("for");

FIMFOR options {paraphrase = "an identifier";} : ("fimfor");

MAIOR options {paraphrase = "an identifier";} : (">");

MENOR options {paraphrase = "an identifier";} : ("<");

IGUAL options {paraphrase = "an identifier";} : ("==");

ATRIBUI options {paraphrase = "an identifier";} : ("=");




WS_ : (' ' | '\t' | '\r'| '\n' {newline();}) {_ttype = Token.SKIP; };

SL_COMMENT : "//" (~'\n')* '\n' {_ttype = Token.SKIP; newline (); };

STRING : '"' (ESC|~'"')* '"';
CHAR : '\'' (ESC|~'\'') '\'';
CHARLITERAL : CHAR;
protected
ESC :  '\\' ('n'|'"');
