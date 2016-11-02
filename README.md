# compiladores
  Este projeto consiste em criar um compilador referente a disciplina de compiladores do 6º semestre de ciência da computação do Uniceub ministrada pelo professor Eduardo Santos.
  O projeto consistirá de três entregas sendo que a primeira delas, para a data de 05/10/2016.
  Inicialmente foi pensado em criar uma gramatica com alguns elementos em português, o exemplo da gramatica é o arquivo "gramatica.txt".
  Os arquivos todos fazem parte de um projeto do netbeans onde a gramatica é executada utilizando a ferramente JFlex
  
  
-----------------------------------------------------------------------------------------------------------------------------

A segunda entrega foi prevista para o dia 2 de novembro, o projeto sofreu algumas alterações, utilizaremos agora a ferramenta ANTLR4, os elementos em português continuam a gramatica porém agora seu foco é mais em operações matemáticas e em evitar redundancias e ambiguidades. Foi feita a divisão dos operadores para trabalharmos com precedências. 

Para executar a gramatica precisamos do antlr4. Segue link de um tutorial. https://github.com/antlr/antlr4/blob/master/doc/getting-started.md

Após a instalação do tutorial precisamos compilar o programa:
$ antlr4 Hello.g4
  $ javac Hello*.java
  $ grun Hello sentence -tree (para gerar os tokens)
  $ grun Hello sentence -gui (para gerar a arvore de parsing)
  
  Por
    Victor Hugo Gonçalves.
  
