header {package decaf;}

options
{
  mangleLiteralPrefix = "TK_";
  language="Java";
}

class DecafParser extends Parser;
options
{
  importVocab=DecafScanner;
  k=3;
  buildAST=true;
}

/* program: TK_class ID LCURLY RCURLY EOF; */

program : INICIO NOMECLASSE expr FIM ;

expr:  INT | ID | ABREP expr FECHAP | exprop2 OP2 exprop2;

exprop2 : INT;


