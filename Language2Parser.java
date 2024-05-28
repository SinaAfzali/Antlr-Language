// Generated from Language2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Language2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Let=16, Int=17, 
		Val=18, WHITE_SPACE=19;
	public static final int
		RULE_start = 0, RULE_use = 1, RULE_var = 2, RULE_name = 3, RULE_value = 4, 
		RULE_string = 5, RULE_e = 6, RULE_t = 7, RULE_f = 8, RULE_i = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "use", "var", "name", "value", "string", "e", "t", "f", "i"
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

	@Override
	public String getGrammarFileName() { return "Language2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Language2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<UseContext> use() {
			return getRuleContexts(UseContext.class);
		}
		public UseContext use(int i) {
			return getRuleContext(UseContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				use();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(26);
				var();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(32);
				e(0);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			name();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(40);
				match(T__1);
				setState(41);
				name();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(44);
				match(T__2);
				setState(45);
				name();
				}
			}

			setState(48);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			name();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(55);
			match(T__7);
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				{
				setState(56);
				value();
				}
				break;
			case T__8:
				{
				setState(57);
				match(T__8);
				setState(58);
				string();
				setState(59);
				match(T__8);
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(63);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> Let() { return getTokens(Language2Parser.Let); }
		public TerminalNode Let(int i) {
			return getToken(Language2Parser.Let, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(Let);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Let );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> Int() { return getTokens(Language2Parser.Int); }
		public TerminalNode Int(int i) {
			return getToken(Language2Parser.Int, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				match(Int);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> Val() { return getTokens(Language2Parser.Val); }
		public TerminalNode Val(int i) {
			return getToken(Language2Parser.Val, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				match(Val);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Val );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_e);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					match(T__9);
					setState(85);
					t(0);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92);
			f();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_t);
					setState(94);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(95);
					match(T__10);
					setState(96);
					f();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_f);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__11);
				setState(103);
				e(0);
				setState(104);
				match(T__12);
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				i();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IContext extends ParserRuleContext {
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Language2Listener ) ((Language2Listener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_i);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return e_sempred((EContext)_localctx, predIndex);
		case 7:
			return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2$"+
		"\n\2\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\5\6"+
		"\5E\n\5\r\5\16\5F\3\6\6\6J\n\6\r\6\16\6K\3\7\6\7O\n\7\r\7\16\7P\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\td\n\t\f\t\16\tg\13\t\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\2\4"+
		"\16\20\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\b\t\3\2\20\21\2u\2\31\3\2\2\2"+
		"\4(\3\2\2\2\6\64\3\2\2\2\bD\3\2\2\2\nI\3\2\2\2\fN\3\2\2\2\16R\3\2\2\2"+
		"\20]\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36"+
		"\5\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2"+
		"!\37\3\2\2\2\"$\5\16\b\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3"+
		"\3\2\2\2\'%\3\2\2\2()\7\3\2\2),\5\b\5\2*+\7\4\2\2+-\5\b\5\2,*\3\2\2\2"+
		",-\3\2\2\2-\60\3\2\2\2./\7\5\2\2/\61\5\b\5\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\3\2\2\2\62\63\7\6\2\2\63\5\3\2\2\2\64\65\7\7\2\2\65\67\5\b\5\2"+
		"\668\t\2\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29?\7\n\2\2:@\5\n\6\2;"+
		"<\7\13\2\2<=\5\f\7\2=>\7\13\2\2>@\3\2\2\2?:\3\2\2\2?;\3\2\2\2?@\3\2\2"+
		"\2@A\3\2\2\2AB\7\6\2\2B\7\3\2\2\2CE\7\22\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2G\t\3\2\2\2HJ\7\23\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\13\3\2\2\2MO\7\24\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"Q\r\3\2\2\2RS\b\b\1\2ST\5\20\t\2TZ\3\2\2\2UV\f\4\2\2VW\7\f\2\2WY\5\20"+
		"\t\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\17\3\2\2\2\\Z\3\2\2\2]"+
		"^\b\t\1\2^_\5\22\n\2_e\3\2\2\2`a\f\4\2\2ab\7\r\2\2bd\5\22\n\2c`\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2\2ge\3\2\2\2hi\7\16\2\2ij\5"+
		"\16\b\2jk\7\17\2\2kn\3\2\2\2ln\5\24\13\2mh\3\2\2\2ml\3\2\2\2n\23\3\2\2"+
		"\2op\t\3\2\2p\25\3\2\2\2\17\31\37%,\60\67?FKPZem";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}