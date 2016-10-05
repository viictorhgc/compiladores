package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
E = [{ > < == ) ( }]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"inicio" {return INICIO;}
"fim" {return FIM;}
"classe" {return CLASSE;}
"escreva" {return ESCREVA;}
"if" {return IF;}
"fimif" {return FIMIF;}
"for" {return FOR;}
"fimfor" {return FIMFOR;}
"(" {return ABREP;}
")" {return FECHAP;}
">" {return MAIOR;}
"<" {return MENOR;}
"==" {return IGUAL;}
"=" {return ATRIBUI;}
"+" {return SOMA;}
"*" {return MULT;}
"-" {return MENOS;}
"/" {return DIV;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}