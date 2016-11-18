package decaf;

import java.io.*;
import antlr.Token;
import java6035.tools.CLI.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);
        	
        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=DecafParserTokenTypes.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();
		
		        			switch (token.getType())
		        			{
		        			case DecafScannerTokenTypes.ID:
		        				type = "IDENTIFIER";
		        				break;
						case DecafScannerTokenTypes.CHAR:
							type = " CHARLITERAL";
							break;		
						case DecafScannerTokenTypes.OP:
							type = "OP";
							break; 
						case DecafScannerTokenTypes.OP2:
							type = "OP2";
							break;       
						case DecafScannerTokenTypes.INT:
							type = "INT";
							break; 
						case DecafScannerTokenTypes.NOMECLASSE:
							type = "NOMECLASSE";
							break;  
						case DecafScannerTokenTypes.INICIOPROG:
							type = "INICIO";
							break;      
						case DecafScannerTokenTypes.FIMPROG:
							type = "FIM";
							break;
						case DecafScannerTokenTypes.TK_escreva:
							type = "ESCREVA";
							break;          						case DecafScannerTokenTypes.TK_if:
							type = "if";
							break;	
		    				case DecafScannerTokenTypes.FIMIF:
							type = "FIMIF";
							break;	
						case DecafScannerTokenTypes.FOR:
							type = "FOR";
							break;	
						case DecafScannerTokenTypes.FIMFOR:
							type = "FIMFOR";
							break;	
						case DecafScannerTokenTypes.MAIOR:
							type = "MAIOR";
							break;
						case DecafScannerTokenTypes.MENOR:
							type = "MENOR";
							break;
						case DecafScannerTokenTypes.IGUAL:
							type = "IGUAL";
							break;
						case DecafScannerTokenTypes.ATRIBUI:
							type = "ATRIBUI";
							break;
}						
						
		        			System.out.println (type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
        	            lexer.consume ();
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		DecafParser parser = new DecafParser (lexer);
                parser.program();
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}
