// Generated from /Users/ruimarinho/OneDrive - Instituto Superior de Engenharia do Porto/ISEP_2020_2021/LAPR4/REPO/lei20_21_s4_2na_2/eapli.base (20210331)/eapli.base/base.grammars/src/main/java/gramaticaformulario/grammar/GramaticaFormulario.g4 by ANTLR 4.9.1
package gramaticaformulario.antl4Gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaFormularioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, NEWLINE=14, TIPOSTRING=15, TIPOBOOLEANO=16, 
		TIPONUMERICO=17, TIPODATA=18, Prologo=19, Epilogo=20, DATA=21, NUMERICO=22, 
		YEAR=23, MONTH=24, DAY=25, BOOLEANO=26, TRUE=27, FALSE=28, TEXTO=29, REGEX=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "WS", "NEWLINE", "TIPOSTRING", "TIPOBOOLEANO", 
			"TIPONUMERICO", "TIPODATA", "Prologo", "Epilogo", "DATA", "NUMERICO", 
			"YEAR", "MONTH", "DAY", "BOOLEANO", "TRUE", "FALSE", "TEXTO", "REGEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<formulario><nome>'", "'</nome><atributos>'", "'<atributo>'", 
			"'</atributo>'", "'<nome>'", "'</nome>'", "'<titulo>'", "'</titulo>'", 
			"'<descricao>'", "'</descricao>'", "'</validador><preenchimento>'", "'</preenchimento>'", 
			null, null, "'<tipoDados>String</tipoDados><validador>'", "'<tipoDados>Boolean</tipoDados><validador>'", 
			"'<tipoDados>Numerico</tipoDados><validador>'", "'<tipoDados>Data</tipoDados><validador>'", 
			"'<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "NEWLINE", "TIPOSTRING", "TIPOBOOLEANO", "TIPONUMERICO", 
			"TIPODATA", "Prologo", "Epilogo", "DATA", "NUMERICO", "YEAR", "MONTH", 
			"DAY", "BOOLEANO", "TRUE", "FALSE", "TEXTO", "REGEX"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GramaticaFormularioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaFormulario.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u02b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u00e6\n\16\r\16\16\16\u00e7"+
		"\3\16\3\16\3\17\6\17\u00ed\n\17\r\17\16\17\u00ee\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u021a"+
		"\n\25\f\25\16\25\u021d\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u023e\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\6\27\u0247\n\27\r\27\16\27\u0248\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u0252\n\30\3\31\3\31\3\31\3\31\5\31\u0258"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0260\n\32\3\33\3\33\5\33\u0264"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0272\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0283\n\35\3\36\6\36\u0286\n\36\r\36\16\36\u0287"+
		"\3\37\7\37\u028b\n\37\f\37\16\37\u028e\13\37\3\37\3\37\7\37\u0292\n\37"+
		"\f\37\16\37\u0295\13\37\3\37\7\37\u0298\n\37\f\37\16\37\u029b\13\37\3"+
		"\37\7\37\u029e\n\37\f\37\16\37\u02a1\13\37\3\37\3\37\7\37\u02a5\n\37\f"+
		"\37\16\37\u02a8\13\37\3\37\7\37\u02ab\n\37\f\37\16\37\u02ae\13\37\6\37"+
		"\u02b0\n\37\r\37\16\37\u02b1\3\u021b\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\n\5\2\13\f\17\17\"\"\5"+
		"\2\f\f\17\17\64\64\3\2\62;\3\2\65;\3\2\63;\3\2\63\64\7\2\"\"//\62;C\\"+
		"c|\4\2,-AA\2\u02c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5R\3\2\2\2\7e\3\2\2\2\tp"+
		"\3\2\2\2\13|\3\2\2\2\r\u0083\3\2\2\2\17\u008b\3\2\2\2\21\u0094\3\2\2\2"+
		"\23\u009e\3\2\2\2\25\u00aa\3\2\2\2\27\u00b7\3\2\2\2\31\u00d3\3\2\2\2\33"+
		"\u00e5\3\2\2\2\35\u00ec\3\2\2\2\37\u00f2\3\2\2\2!\u011b\3\2\2\2#\u0145"+
		"\3\2\2\2%\u0170\3\2\2\2\'\u0197\3\2\2\2)\u023d\3\2\2\2+\u023f\3\2\2\2"+
		"-\u0246\3\2\2\2/\u024a\3\2\2\2\61\u0257\3\2\2\2\63\u025f\3\2\2\2\65\u0263"+
		"\3\2\2\2\67\u0271\3\2\2\29\u0282\3\2\2\2;\u0285\3\2\2\2=\u02af\3\2\2\2"+
		"?@\7>\2\2@A\7h\2\2AB\7q\2\2BC\7t\2\2CD\7o\2\2DE\7w\2\2EF\7n\2\2FG\7c\2"+
		"\2GH\7t\2\2HI\7k\2\2IJ\7q\2\2JK\7@\2\2KL\7>\2\2LM\7p\2\2MN\7q\2\2NO\7"+
		"o\2\2OP\7g\2\2PQ\7@\2\2Q\4\3\2\2\2RS\7>\2\2ST\7\61\2\2TU\7p\2\2UV\7q\2"+
		"\2VW\7o\2\2WX\7g\2\2XY\7@\2\2YZ\7>\2\2Z[\7c\2\2[\\\7v\2\2\\]\7t\2\2]^"+
		"\7k\2\2^_\7d\2\2_`\7w\2\2`a\7v\2\2ab\7q\2\2bc\7u\2\2cd\7@\2\2d\6\3\2\2"+
		"\2ef\7>\2\2fg\7c\2\2gh\7v\2\2hi\7t\2\2ij\7k\2\2jk\7d\2\2kl\7w\2\2lm\7"+
		"v\2\2mn\7q\2\2no\7@\2\2o\b\3\2\2\2pq\7>\2\2qr\7\61\2\2rs\7c\2\2st\7v\2"+
		"\2tu\7t\2\2uv\7k\2\2vw\7d\2\2wx\7w\2\2xy\7v\2\2yz\7q\2\2z{\7@\2\2{\n\3"+
		"\2\2\2|}\7>\2\2}~\7p\2\2~\177\7q\2\2\177\u0080\7o\2\2\u0080\u0081\7g\2"+
		"\2\u0081\u0082\7@\2\2\u0082\f\3\2\2\2\u0083\u0084\7>\2\2\u0084\u0085\7"+
		"\61\2\2\u0085\u0086\7p\2\2\u0086\u0087\7q\2\2\u0087\u0088\7o\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7@\2\2\u008a\16\3\2\2\2\u008b\u008c\7>\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7v\2\2\u008f\u0090\7w\2\2"+
		"\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7@\2\2\u0093\20\3\2"+
		"\2\2\u0094\u0095\7>\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7k\2\2\u0098\u0099\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7q\2\2\u009c\u009d\7@\2\2\u009d\22\3\2\2\2\u009e\u009f\7"+
		">\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3"+
		"\7e\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7e\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7@\2\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ab\7>\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7g\2"+
		"\2\u00ae\u00af\7u\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9\7\61\2\2"+
		"\u00b9\u00ba\7x\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7f\2\2\u00c0"+
		"\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\7>\2\2"+
		"\u00c4\u00c5\7r\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7j\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2"+
		"\u00cf\u00d0\7v\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7@\2\2\u00d2\30\3\2"+
		"\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7r\2\2\u00d6"+
		"\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7p\2\2"+
		"\u00da\u00db\7e\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de"+
		"\7o\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7@\2\2\u00e3\32\3\2\2\2\u00e4\u00e6\t\2\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\16\2\2\u00ea\34\3\2\2\2\u00eb"+
		"\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\17\2\2\u00f1"+
		"\36\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7k\2\2\u00f5"+
		"\u00f6\7r\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7F\2\2\u00f8\u00f9\7c\2\2"+
		"\u00f9\u00fa\7f\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd"+
		"\7@\2\2\u00fd\u00fe\7U\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7t\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7i\2\2\u0103\u0104\7>\2\2"+
		"\u0104\u0105\7\61\2\2\u0105\u0106\7v\2\2\u0106\u0107\7k\2\2\u0107\u0108"+
		"\7r\2\2\u0108\u0109\7q\2\2\u0109\u010a\7F\2\2\u010a\u010b\7c\2\2\u010b"+
		"\u010c\7f\2\2\u010c\u010d\7q\2\2\u010d\u010e\7u\2\2\u010e\u010f\7@\2\2"+
		"\u010f\u0110\7>\2\2\u0110\u0111\7x\2\2\u0111\u0112\7c\2\2\u0112\u0113"+
		"\7n\2\2\u0113\u0114\7k\2\2\u0114\u0115\7f\2\2\u0115\u0116\7c\2\2\u0116"+
		"\u0117\7f\2\2\u0117\u0118\7q\2\2\u0118\u0119\7t\2\2\u0119\u011a\7@\2\2"+
		"\u011a \3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7v\2\2\u011d\u011e\7k\2"+
		"\2\u011e\u011f\7r\2\2\u011f\u0120\7q\2\2\u0120\u0121\7F\2\2\u0121\u0122"+
		"\7c\2\2\u0122\u0123\7f\2\2\u0123\u0124\7q\2\2\u0124\u0125\7u\2\2\u0125"+
		"\u0126\7@\2\2\u0126\u0127\7D\2\2\u0127\u0128\7q\2\2\u0128\u0129\7q\2\2"+
		"\u0129\u012a\7n\2\2\u012a\u012b\7g\2\2\u012b\u012c\7c\2\2\u012c\u012d"+
		"\7p\2\2\u012d\u012e\7>\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7v\2\2\u0130"+
		"\u0131\7k\2\2\u0131\u0132\7r\2\2\u0132\u0133\7q\2\2\u0133\u0134\7F\2\2"+
		"\u0134\u0135\7c\2\2\u0135\u0136\7f\2\2\u0136\u0137\7q\2\2\u0137\u0138"+
		"\7u\2\2\u0138\u0139\7@\2\2\u0139\u013a\7>\2\2\u013a\u013b\7x\2\2\u013b"+
		"\u013c\7c\2\2\u013c\u013d\7n\2\2\u013d\u013e\7k\2\2\u013e\u013f\7f\2\2"+
		"\u013f\u0140\7c\2\2\u0140\u0141\7f\2\2\u0141\u0142\7q\2\2\u0142\u0143"+
		"\7t\2\2\u0143\u0144\7@\2\2\u0144\"\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147"+
		"\7v\2\2\u0147\u0148\7k\2\2\u0148\u0149\7r\2\2\u0149\u014a\7q\2\2\u014a"+
		"\u014b\7F\2\2\u014b\u014c\7c\2\2\u014c\u014d\7f\2\2\u014d\u014e\7q\2\2"+
		"\u014e\u014f\7u\2\2\u014f\u0150\7@\2\2\u0150\u0151\7P\2\2\u0151\u0152"+
		"\7w\2\2\u0152\u0153\7o\2\2\u0153\u0154\7g\2\2\u0154\u0155\7t\2\2\u0155"+
		"\u0156\7k\2\2\u0156\u0157\7e\2\2\u0157\u0158\7q\2\2\u0158\u0159\7>\2\2"+
		"\u0159\u015a\7\61\2\2\u015a\u015b\7v\2\2\u015b\u015c\7k\2\2\u015c\u015d"+
		"\7r\2\2\u015d\u015e\7q\2\2\u015e\u015f\7F\2\2\u015f\u0160\7c\2\2\u0160"+
		"\u0161\7f\2\2\u0161\u0162\7q\2\2\u0162\u0163\7u\2\2\u0163\u0164\7@\2\2"+
		"\u0164\u0165\7>\2\2\u0165\u0166\7x\2\2\u0166\u0167\7c\2\2\u0167\u0168"+
		"\7n\2\2\u0168\u0169\7k\2\2\u0169\u016a\7f\2\2\u016a\u016b\7c\2\2\u016b"+
		"\u016c\7f\2\2\u016c\u016d\7q\2\2\u016d\u016e\7t\2\2\u016e\u016f\7@\2\2"+
		"\u016f$\3\2\2\2\u0170\u0171\7>\2\2\u0171\u0172\7v\2\2\u0172\u0173\7k\2"+
		"\2\u0173\u0174\7r\2\2\u0174\u0175\7q\2\2\u0175\u0176\7F\2\2\u0176\u0177"+
		"\7c\2\2\u0177\u0178\7f\2\2\u0178\u0179\7q\2\2\u0179\u017a\7u\2\2\u017a"+
		"\u017b\7@\2\2\u017b\u017c\7F\2\2\u017c\u017d\7c\2\2\u017d\u017e\7v\2\2"+
		"\u017e\u017f\7c\2\2\u017f\u0180\7>\2\2\u0180\u0181\7\61\2\2\u0181\u0182"+
		"\7v\2\2\u0182\u0183\7k\2\2\u0183\u0184\7r\2\2\u0184\u0185\7q\2\2\u0185"+
		"\u0186\7F\2\2\u0186\u0187\7c\2\2\u0187\u0188\7f\2\2\u0188\u0189\7q\2\2"+
		"\u0189\u018a\7u\2\2\u018a\u018b\7@\2\2\u018b\u018c\7>\2\2\u018c\u018d"+
		"\7x\2\2\u018d\u018e\7c\2\2\u018e\u018f\7n\2\2\u018f\u0190\7k\2\2\u0190"+
		"\u0191\7f\2\2\u0191\u0192\7c\2\2\u0192\u0193\7f\2\2\u0193\u0194\7q\2\2"+
		"\u0194\u0195\7t\2\2\u0195\u0196\7@\2\2\u0196&\3\2\2\2\u0197\u0198\7>\2"+
		"\2\u0198\u0199\7A\2\2\u0199\u019a\7z\2\2\u019a\u019b\7o\2\2\u019b\u019c"+
		"\7n\2\2\u019c\u019d\7\"\2\2\u019d\u019e\7x\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7t\2\2\u01a0\u01a1\7u\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7q\2\2"+
		"\u01a3\u01a4\7p\2\2\u01a4\u01a5\7?\2\2\u01a5\u01a6\7$\2\2\u01a6\u01a7"+
		"\7\63\2\2\u01a7\u01a8\7\60\2\2\u01a8\u01a9\7\62\2\2\u01a9\u01aa\7$\2\2"+
		"\u01aa\u01ab\7\"\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae"+
		"\7e\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7f\2\2\u01b0\u01b1\7k\2\2\u01b1"+
		"\u01b2\7p\2\2\u01b2\u01b3\7i\2\2\u01b3\u01b4\7?\2\2\u01b4\u01b5\7$\2\2"+
		"\u01b5\u01b6\7W\2\2\u01b6\u01b7\7V\2\2\u01b7\u01b8\7H\2\2\u01b8\u01b9"+
		"\7/\2\2\u01b9\u01ba\7:\2\2\u01ba\u01bb\7$\2\2\u01bb\u01bc\7\"\2\2\u01bc"+
		"\u01bd\7u\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7p\2\2"+
		"\u01c0\u01c1\7f\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4"+
		"\7q\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7?\2\2\u01c7"+
		"\u01c8\7$\2\2\u01c8\u01c9\7{\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7u\2\2"+
		"\u01cb\u01cc\7$\2\2\u01cc\u01cd\7A\2\2\u01cd\u01ce\7@\2\2\u01ce(\3\2\2"+
		"\2\u01cf\u01d0\7>\2\2\u01d0\u01d1\7\61\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3"+
		"\7v\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7d\2\2\u01d6"+
		"\u01d7\7w\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7q\2\2\u01d9\u01da\7u\2\2"+
		"\u01da\u01db\7@\2\2\u01db\u01dc\7>\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de"+
		"\7e\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7r\2\2\u01e1"+
		"\u01e2\7v\2\2\u01e2\u01e3\7x\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5\7n\2\2"+
		"\u01e5\u01e6\7k\2\2\u01e6\u01e7\7f\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9"+
		"\7e\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7\61\2\2\u01ec"+
		"\u01ed\7@\2\2\u01ed\u01ee\7>\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\7h\2"+
		"\2\u01f0\u01f1\7q\2\2\u01f1\u01f2\7t\2\2\u01f2\u01f3\7o\2\2\u01f3\u01f4"+
		"\7w\2\2\u01f4\u01f5\7n\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7t\2\2\u01f7"+
		"\u01f8\7k\2\2\u01f8\u01f9\7q\2\2\u01f9\u023e\7@\2\2\u01fa\u01fb\7>\2\2"+
		"\u01fb\u01fc\7\61\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff"+
		"\7t\2\2\u01ff\u0200\7k\2\2\u0200\u0201\7d\2\2\u0201\u0202\7w\2\2\u0202"+
		"\u0203\7v\2\2\u0203\u0204\7q\2\2\u0204\u0205\7u\2\2\u0205\u0206\7@\2\2"+
		"\u0206\u0207\7>\2\2\u0207\u0208\7u\2\2\u0208\u0209\7e\2\2\u0209\u020a"+
		"\7t\2\2\u020a\u020b\7k\2\2\u020b\u020c\7r\2\2\u020c\u020d\7v\2\2\u020d"+
		"\u020e\7x\2\2\u020e\u020f\7c\2\2\u020f\u0210\7n\2\2\u0210\u0211\7k\2\2"+
		"\u0211\u0212\7f\2\2\u0212\u0213\7c\2\2\u0213\u0214\7e\2\2\u0214\u0215"+
		"\7c\2\2\u0215\u0216\7q\2\2\u0216\u0217\7@\2\2\u0217\u021b\3\2\2\2\u0218"+
		"\u021a\13\2\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021c\3"+
		"\2\2\2\u021b\u0219\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u021f\7>\2\2\u021f\u0220\7\61\2\2\u0220\u0221\7u\2\2\u0221\u0222\7e\2"+
		"\2\u0222\u0223\7t\2\2\u0223\u0224\7k\2\2\u0224\u0225\7r\2\2\u0225\u0226"+
		"\7v\2\2\u0226\u0227\7x\2\2\u0227\u0228\7c\2\2\u0228\u0229\7n\2\2\u0229"+
		"\u022a\7k\2\2\u022a\u022b\7f\2\2\u022b\u022c\7c\2\2\u022c\u022d\7e\2\2"+
		"\u022d\u022e\7c\2\2\u022e\u022f\7q\2\2\u022f\u0230\7@\2\2\u0230\u0231"+
		"\7>\2\2\u0231\u0232\7\61\2\2\u0232\u0233\7h\2\2\u0233\u0234\7q\2\2\u0234"+
		"\u0235\7t\2\2\u0235\u0236\7o\2\2\u0236\u0237\7w\2\2\u0237\u0238\7n\2\2"+
		"\u0238\u0239\7c\2\2\u0239\u023a\7t\2\2\u023a\u023b\7k\2\2\u023b\u023c"+
		"\7q\2\2\u023c\u023e\7@\2\2\u023d\u01cf\3\2\2\2\u023d\u01fa\3\2\2\2\u023e"+
		"*\3\2\2\2\u023f\u0240\5/\30\2\u0240\u0241\7/\2\2\u0241\u0242\5\61\31\2"+
		"\u0242\u0243\7/\2\2\u0243\u0244\5\63\32\2\u0244,\3\2\2\2\u0245\u0247\t"+
		"\4\2\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249.\3\2\2\2\u024a\u024b\7\64\2\2\u024b\u024c\7\62\2"+
		"\2\u024c\u0251\3\2\2\2\u024d\u024e\t\4\2\2\u024e\u0252\t\4\2\2\u024f\u0250"+
		"\t\5\2\2\u0250\u0252\t\4\2\2\u0251\u024d\3\2\2\2\u0251\u024f\3\2\2\2\u0252"+
		"\60\3\2\2\2\u0253\u0254\7\62\2\2\u0254\u0258\t\6\2\2\u0255\u0256\7\63"+
		"\2\2\u0256\u0258\t\7\2\2\u0257\u0253\3\2\2\2\u0257\u0255\3\2\2\2\u0258"+
		"\62\3\2\2\2\u0259\u025a\7\62\2\2\u025a\u0260\t\6\2\2\u025b\u025c\t\7\2"+
		"\2\u025c\u0260\t\4\2\2\u025d\u025e\7\65\2\2\u025e\u0260\t\7\2\2\u025f"+
		"\u0259\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u025d\3\2\2\2\u0260\64\3\2\2"+
		"\2\u0261\u0264\5\67\34\2\u0262\u0264\59\35\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0262\3\2\2\2\u0264\66\3\2\2\2\u0265\u0266\7v\2\2\u0266\u0267\7t\2\2"+
		"\u0267\u0268\7w\2\2\u0268\u0272\7g\2\2\u0269\u026a\7V\2\2\u026a\u026b"+
		"\7T\2\2\u026b\u026c\7W\2\2\u026c\u0272\7G\2\2\u026d\u026e\7V\2\2\u026e"+
		"\u026f\7t\2\2\u026f\u0270\7w\2\2\u0270\u0272\7g\2\2\u0271\u0265\3\2\2"+
		"\2\u0271\u0269\3\2\2\2\u0271\u026d\3\2\2\2\u02728\3\2\2\2\u0273\u0274"+
		"\7h\2\2\u0274\u0275\7c\2\2\u0275\u0276\7n\2\2\u0276\u0277\7u\2\2\u0277"+
		"\u0283\7g\2\2\u0278\u0279\7H\2\2\u0279\u027a\7C\2\2\u027a\u027b\7N\2\2"+
		"\u027b\u027c\7U\2\2\u027c\u0283\7G\2\2\u027d\u027e\7H\2\2\u027e\u027f"+
		"\7c\2\2\u027f\u0280\7n\2\2\u0280\u0281\7u\2\2\u0281\u0283\7g\2\2\u0282"+
		"\u0273\3\2\2\2\u0282\u0278\3\2\2\2\u0282\u027d\3\2\2\2\u0283:\3\2\2\2"+
		"\u0284\u0286\t\b\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288<\3\2\2\2\u0289\u028b\7]\2\2\u028a\u0289"+
		"\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0293\5;\36\2\u0290\u0292\7_"+
		"\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0299\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7~"+
		"\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029f\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\t\t"+
		"\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02ac\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a6\7}"+
		"\2\2\u02a3\u02a5\t\4\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a9\u02ab\7\177\2\2\u02aa\u02a2\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2"+
		"\2\2\u02af\u028c\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2>\3\2\2\2\26\2\u00e7\u00ee\u021b\u023d\u0248\u0251"+
		"\u0257\u025f\u0263\u0271\u0282\u0287\u028c\u0293\u0299\u029f\u02a6\u02ac"+
		"\u02b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}