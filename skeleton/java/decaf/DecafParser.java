// $ANTLR 2.7.7 (2006-11-01): "Parser.g" -> "DecafParser.java"$
package decaf;
import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class DecafParser extends antlr.LLkParser       implements DecafParserTokenTypes
 {

protected DecafParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public DecafParser(TokenBuffer tokenBuf) {
  this(tokenBuf,3);
}

protected DecafParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public DecafParser(TokenStream lexer) {
  this(lexer,3);
}

public DecafParser(ParserSharedInputState state) {
  super(state,3);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void program() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST program_AST = null;
		
		try {      // for error handling
			AST tmp1_AST = null;
			tmp1_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp1_AST);
			match(INICIO);
			AST tmp2_AST = null;
			tmp2_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp2_AST);
			match(NOMECLASSE);
			expr();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp3_AST = null;
			tmp3_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp3_AST);
			match(FIM);
			program_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		returnAST = program_AST;
	}
	
	public final void expr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expr_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				AST tmp4_AST = null;
				tmp4_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp4_AST);
				match(ID);
				expr_AST = (AST)currentAST.root;
				break;
			}
			case ABREP:
			{
				AST tmp5_AST = null;
				tmp5_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp5_AST);
				match(ABREP);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp6_AST = null;
				tmp6_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp6_AST);
				match(FECHAP);
				expr_AST = (AST)currentAST.root;
				break;
			}
			default:
				if ((LA(1)==INT) && (LA(2)==FECHAP||LA(2)==FIM)) {
					AST tmp7_AST = null;
					tmp7_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp7_AST);
					match(INT);
					expr_AST = (AST)currentAST.root;
				}
				else if ((LA(1)==INT) && (LA(2)==OP2)) {
					exprop2();
					astFactory.addASTChild(currentAST, returnAST);
					AST tmp8_AST = null;
					tmp8_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp8_AST);
					match(OP2);
					exprop2();
					astFactory.addASTChild(currentAST, returnAST);
					expr_AST = (AST)currentAST.root;
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		returnAST = expr_AST;
	}
	
	public final void exprop2() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exprop2_AST = null;
		
		try {      // for error handling
			AST tmp9_AST = null;
			tmp9_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp9_AST);
			match(INT);
			exprop2_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
		returnAST = exprop2_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"class\"",
		"\"int\"",
		"\"escreva\"",
		"\"if\"",
		"\"maior\"",
		"{",
		"}",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"an identifier",
		"WS_",
		"SL_COMMENT",
		"STRING",
		"CHAR",
		"CHARLITERAL",
		"ESC",
		"INICIO",
		"FIM"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 34359771136L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 34360295424L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	
	}
