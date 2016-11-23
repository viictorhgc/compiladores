// $ANTLR 2.7.7 (2006-11-01): "Lexer.g" -> "DecafScanner.java"$
package decaf;
import java.io.InputStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.ANTLRException;
import java.io.Reader;
import java.util.Hashtable;
import antlr.CharScanner;
import antlr.InputBuffer;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.Token;
import antlr.CommonToken;
import antlr.RecognitionException;
import antlr.NoViableAltForCharException;
import antlr.MismatchedCharException;
import antlr.TokenStream;
import antlr.ANTLRHashString;
import antlr.LexerSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.SemanticException;

public class DecafScanner extends antlr.CharScanner implements DecafScannerTokenTypes, TokenStream
 {
public DecafScanner(InputStream in) {
	this(new ByteBuffer(in));
}
public DecafScanner(Reader in) {
	this(new CharBuffer(in));
}
public DecafScanner(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public DecafScanner(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("class", this), new Integer(4));
	literals.put(new ANTLRHashString("if", this), new Integer(7));
	literals.put(new ANTLRHashString("maior", this), new Integer(8));
	literals.put(new ANTLRHashString("int", this), new Integer(5));
	literals.put(new ANTLRHashString("escreva", this), new Integer(6));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				switch ( LA(1)) {
				case '{':
				{
					mLCURLY(true);
					theRetToken=_returnToken;
					break;
				}
				case '}':
				{
					mRCURLY(true);
					theRetToken=_returnToken;
					break;
				}
				case '(':
				{
					mABREP(true);
					theRetToken=_returnToken;
					break;
				}
				case ')':
				{
					mFECHAP(true);
					theRetToken=_returnToken;
					break;
				}
				case '0':  case '1':  case '2':  case '3':
				case '4':  case '5':  case '6':  case '7':
				case '8':  case '9':
				{
					mINT(true);
					theRetToken=_returnToken;
					break;
				}
				case '!':  case '&':  case '+':  case '-':
				{
					mOP(true);
					theRetToken=_returnToken;
					break;
				}
				case '>':
				{
					mMAIOR(true);
					theRetToken=_returnToken;
					break;
				}
				case '<':
				{
					mMENOR(true);
					theRetToken=_returnToken;
					break;
				}
				case '\t':  case '\n':  case '\r':  case ' ':
				{
					mWS_(true);
					theRetToken=_returnToken;
					break;
				}
				case '"':
				{
					mSTRING(true);
					theRetToken=_returnToken;
					break;
				}
				default:
					if ((LA(1)=='i') && (LA(2)=='n') && (LA(3)=='i') && (LA(4)=='c')) {
						mINICIOPROG(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='c') && (LA(2)=='l') && (LA(3)=='a') && (LA(4)=='s')) {
						mNOMECLASSE(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='f') && (LA(2)=='i') && (LA(3)=='m') && (LA(4)=='i')) {
						mFIMIF(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='f') && (LA(2)=='i') && (LA(3)=='m') && (LA(4)=='f')) {
						mFIMFOR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='f') && (LA(2)=='i') && (LA(3)=='m') && (true)) {
						mFIMPROG(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='f') && (LA(2)=='o') && (LA(3)=='r') && (true)) {
						mFOR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='\'') && (_tokenSet_0.member(LA(2))) && (LA(3)=='"'||LA(3)=='\''||LA(3)=='n') && (true)) {
						mCHAR(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='\'') && (_tokenSet_0.member(LA(2))) && (LA(3)=='"'||LA(3)=='\''||LA(3)=='n') && (true)) {
						mCHARLITERAL(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='i') && (LA(2)=='f') && (true) && (true)) {
						mIF(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='=') && (LA(2)=='=')) {
						mIGUAL(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='/') && (LA(2)=='/')) {
						mSL_COMMENT(true);
						theRetToken=_returnToken;
					}
					else if ((_tokenSet_1.member(LA(1))) && (true) && (true) && (true)) {
						mID(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='*'||LA(1)=='/') && (true)) {
						mOP2(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='=') && (true)) {
						mATRIBUI(true);
						theRetToken=_returnToken;
					}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				}
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_ttype = testLiteralsTable(_ttype);
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mLCURLY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LCURLY;
		int _saveIndex;
		
		match("{");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRCURLY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RCURLY;
		int _saveIndex;
		
		match("}");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFIMPROG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIMPROG;
		int _saveIndex;
		
		{
		match("fim");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINICIOPROG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INICIOPROG;
		int _saveIndex;
		
		{
		match("inicio");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNOMECLASSE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NOMECLASSE;
		int _saveIndex;
		
		{
		match("classe");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mABREP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ABREP;
		int _saveIndex;
		
		{
		match("(");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFECHAP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FECHAP;
		int _saveIndex;
		
		{
		match(")");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mID(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ID;
		int _saveIndex;
		
		{
		int _cnt15=0;
		_loop15:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				matchRange('A','Z');
				break;
			}
			default:
			{
				if ( _cnt15>=1 ) { break _loop15; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt15++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INT;
		int _saveIndex;
		
		{
		int _cnt18=0;
		_loop18:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				matchRange('0','9');
			}
			else {
				if ( _cnt18>=1 ) { break _loop18; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt18++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OP;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case '+':
		{
			match('+');
			break;
		}
		case '-':
		{
			match('-');
			break;
		}
		case '!':
		{
			match('!');
			break;
		}
		case '&':
		{
			match('&');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOP2(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OP2;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case '*':
		{
			match('*');
			break;
		}
		case '/':
		{
			match('/');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IF;
		int _saveIndex;
		
		{
		match("if");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFIMIF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIMIF;
		int _saveIndex;
		
		{
		match("fimif");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FOR;
		int _saveIndex;
		
		{
		match("for");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFIMFOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FIMFOR;
		int _saveIndex;
		
		{
		match("fimfor");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMAIOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MAIOR;
		int _saveIndex;
		
		{
		match(">");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMENOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MENOR;
		int _saveIndex;
		
		{
		match("<");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIGUAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IGUAL;
		int _saveIndex;
		
		{
		match("==");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mATRIBUI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ATRIBUI;
		int _saveIndex;
		
		{
		match("=");
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mWS_(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS_;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case ' ':
		{
			match(' ');
			break;
		}
		case '\t':
		{
			match('\t');
			break;
		}
		case '\r':
		{
			match('\r');
			break;
		}
		case '\n':
		{
			match('\n');
			newline();
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_ttype = Token.SKIP;
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSL_COMMENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SL_COMMENT;
		int _saveIndex;
		
		match("//");
		{
		_loop43:
		do {
			if ((_tokenSet_2.member(LA(1)))) {
				matchNot('\n');
			}
			else {
				break _loop43;
			}
			
		} while (true);
		}
		match('\n');
		_ttype = Token.SKIP; newline ();
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTRING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING;
		int _saveIndex;
		
		match('"');
		{
		_loop46:
		do {
			switch ( LA(1)) {
			case '\\':
			{
				mESC(false);
				break;
			}
			case '\u0000':  case '\u0001':  case '\u0002':  case '\u0003':
			case '\u0004':  case '\u0005':  case '\u0006':  case '\u0007':
			case '\u0008':  case '\t':  case '\n':  case '\u000b':
			case '\u000c':  case '\r':  case '\u000e':  case '\u000f':
			case '\u0010':  case '\u0011':  case '\u0012':  case '\u0013':
			case '\u0014':  case '\u0015':  case '\u0016':  case '\u0017':
			case '\u0018':  case '\u0019':  case '\u001a':  case '\u001b':
			case '\u001c':  case '\u001d':  case '\u001e':  case '\u001f':
			case ' ':  case '!':  case '#':  case '$':
			case '%':  case '&':  case '\'':  case '(':
			case ')':  case '*':  case '+':  case ',':
			case '-':  case '.':  case '/':  case '0':
			case '1':  case '2':  case '3':  case '4':
			case '5':  case '6':  case '7':  case '8':
			case '9':  case ':':  case ';':  case '<':
			case '=':  case '>':  case '?':  case '@':
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':  case '[':  case ']':
			case '^':  case '_':  case '`':  case 'a':
			case 'b':  case 'c':  case 'd':  case 'e':
			case 'f':  case 'g':  case 'h':  case 'i':
			case 'j':  case 'k':  case 'l':  case 'm':
			case 'n':  case 'o':  case 'p':  case 'q':
			case 'r':  case 's':  case 't':  case 'u':
			case 'v':  case 'w':  case 'x':  case 'y':
			case 'z':  case '{':  case '|':  case '}':
			case '~':  case '\u007f':
			{
				matchNot('"');
				break;
			}
			default:
			{
				break _loop46;
			}
			}
		} while (true);
		}
		match('"');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mESC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ESC;
		int _saveIndex;
		
		match('\\');
		{
		switch ( LA(1)) {
		case 'n':
		{
			match('n');
			break;
		}
		case '"':
		{
			match('"');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCHAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHAR;
		int _saveIndex;
		
		match('\'');
		{
		switch ( LA(1)) {
		case '\\':
		{
			mESC(false);
			break;
		}
		case '\u0000':  case '\u0001':  case '\u0002':  case '\u0003':
		case '\u0004':  case '\u0005':  case '\u0006':  case '\u0007':
		case '\u0008':  case '\t':  case '\n':  case '\u000b':
		case '\u000c':  case '\r':  case '\u000e':  case '\u000f':
		case '\u0010':  case '\u0011':  case '\u0012':  case '\u0013':
		case '\u0014':  case '\u0015':  case '\u0016':  case '\u0017':
		case '\u0018':  case '\u0019':  case '\u001a':  case '\u001b':
		case '\u001c':  case '\u001d':  case '\u001e':  case '\u001f':
		case ' ':  case '!':  case '"':  case '#':
		case '$':  case '%':  case '&':  case '(':
		case ')':  case '*':  case '+':  case ',':
		case '-':  case '.':  case '/':  case '0':
		case '1':  case '2':  case '3':  case '4':
		case '5':  case '6':  case '7':  case '8':
		case '9':  case ':':  case ';':  case '<':
		case '=':  case '>':  case '?':  case '@':
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':  case '[':  case ']':
		case '^':  case '_':  case '`':  case 'a':
		case 'b':  case 'c':  case 'd':  case 'e':
		case 'f':  case 'g':  case 'h':  case 'i':
		case 'j':  case 'k':  case 'l':  case 'm':
		case 'n':  case 'o':  case 'p':  case 'q':
		case 'r':  case 's':  case 't':  case 'u':
		case 'v':  case 'w':  case 'x':  case 'y':
		case 'z':  case '{':  case '|':  case '}':
		case '~':  case '\u007f':
		{
			matchNot('\'');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		match('\'');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCHARLITERAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHARLITERAL;
		int _saveIndex;
		
		mCHAR(false);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { -549755813889L, -1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 0L, 576460743847706622L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { -1025L, -1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	
	}
