// Generated from Language2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Language2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Let=16, Int=17, 
		Val=18, WHITE_SPACE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "LETTER", "INT", 
			"Let", "Int", "Val", "WHITE_SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'::'", "'as'", "'\n'", "'var'", "'int'", "'string'", 
			"'='", "'\"'", "'+'", "'*'", "'('", "')'", "'aa'", "'bb'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Let", "Int", "Val", "WHITE_SPACE"
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


	public Language2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\5\25e\n\25\3\26\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\22\'\23)\24+\25\3\2"+
		"\5\6\2&&C\\aac|\3\2\62;\4\2\17\17\"\"\2h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-"+
		"\3\2\2\2\5\61\3\2\2\2\7\64\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r=\3\2\2\2"+
		"\17A\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2"+
		"\2\33R\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!Z\3\2\2\2#\\\3\2\2\2%^\3\2\2\2"+
		"\'`\3\2\2\2)d\3\2\2\2+f\3\2\2\2-.\7w\2\2./\7u\2\2/\60\7g\2\2\60\4\3\2"+
		"\2\2\61\62\7<\2\2\62\63\7<\2\2\63\6\3\2\2\2\64\65\7c\2\2\65\66\7u\2\2"+
		"\66\b\3\2\2\2\678\7\f\2\28\n\3\2\2\29:\7x\2\2:;\7c\2\2;<\7t\2\2<\f\3\2"+
		"\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\16\3\2\2\2AB\7u\2\2BC\7v\2\2CD\7t\2\2"+
		"DE\7k\2\2EF\7p\2\2FG\7i\2\2G\20\3\2\2\2HI\7?\2\2I\22\3\2\2\2JK\7$\2\2"+
		"K\24\3\2\2\2LM\7-\2\2M\26\3\2\2\2NO\7,\2\2O\30\3\2\2\2PQ\7*\2\2Q\32\3"+
		"\2\2\2RS\7+\2\2S\34\3\2\2\2TU\7c\2\2UV\7c\2\2V\36\3\2\2\2WX\7d\2\2XY\7"+
		"d\2\2Y \3\2\2\2Z[\t\2\2\2[\"\3\2\2\2\\]\t\3\2\2]$\3\2\2\2^_\5!\21\2_&"+
		"\3\2\2\2`a\5#\22\2a(\3\2\2\2be\5!\21\2ce\5#\22\2db\3\2\2\2dc\3\2\2\2e"+
		"*\3\2\2\2fg\t\4\2\2gh\3\2\2\2hi\b\26\2\2i,\3\2\2\2\4\2d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}