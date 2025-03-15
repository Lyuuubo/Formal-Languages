// Generated from CondStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CondStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ADD=7, SUB=8, LOWER=9, 
		HIGHER=10, LEQ=11, HEQ=12, EQ=13, INT=14, VARNAME=15, WS=16;
	public static final int
		RULE_init = 0, RULE_exp = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'('", "')'", "'+'", "'<='", "'>='", "'+ '", "'-'", "'<'", 
			"'>'", "' <='", "' >='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ADD", "SUB", "LOWER", "HIGHER", 
			"LEQ", "HEQ", "EQ", "INT", "VARNAME", "WS"
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
	public String getGrammarFileName() { return "CondStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CondStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(5);
			match(T__1);
			setState(6);
			exp(0);
			setState(7);
			match(T__2);
			setState(8);
			exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(CondStatementParser.EQ, 0); }
		public EqualExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HigherEqExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public HigherEqExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitHigherEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowerEqExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LowerEqExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitLowerEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUB() { return getToken(CondStatementParser.SUB, 0); }
		public SubExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarnameExprContext extends ExpContext {
		public TerminalNode VARNAME() { return getToken(CondStatementParser.VARNAME, 0); }
		public VarnameExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitVarnameExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprExprContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExprExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitExprExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpContext {
		public TerminalNode INT() { return getToken(CondStatementParser.INT, 0); }
		public IntExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowerExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LOWER() { return getToken(CondStatementParser.LOWER, 0); }
		public LowerExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitLowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiguerExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode HIGHER() { return getToken(CondStatementParser.HIGHER, 0); }
		public HiguerExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CondStatementVisitor ) return ((CondStatementVisitor<? extends T>)visitor).visitHiguerExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(11);
				match(INT);
				}
				break;
			case VARNAME:
				{
				_localctx = new VarnameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(VARNAME);
				}
				break;
			case T__1:
				{
				_localctx = new ExprExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(T__1);
				setState(14);
				exp(0);
				setState(15);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(19);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(20);
						match(T__3);
						setState(21);
						exp(11);
						}
						break;
					case 2:
						{
						_localctx = new SubExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(22);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(23);
						match(SUB);
						setState(24);
						exp(10);
						}
						break;
					case 3:
						{
						_localctx = new LowerExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(25);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(26);
						match(LOWER);
						setState(27);
						exp(9);
						}
						break;
					case 4:
						{
						_localctx = new HiguerExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(28);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(29);
						match(HIGHER);
						setState(30);
						exp(8);
						}
						break;
					case 5:
						{
						_localctx = new LowerEqExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(31);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(32);
						match(T__4);
						setState(33);
						exp(7);
						}
						break;
					case 6:
						{
						_localctx = new HigherEqExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(34);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(35);
						match(T__5);
						setState(36);
						exp(6);
						}
						break;
					case 7:
						{
						_localctx = new EqualExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(37);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(38);
						match(EQ);
						setState(39);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001\u0001\u0000\u0001\u0002"+
		"\u0002\u0000\u0002\u0000\u00004\u0000\u0004\u0001\u0000\u0000\u0000\u0002"+
		"\u0011\u0001\u0000\u0000\u0000\u0004\u0005\u0005\u0001\u0000\u0000\u0005"+
		"\u0006\u0005\u0002\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007"+
		"\b\u0005\u0003\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\u0001\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0006\u0001\uffff\uffff\u0000\u000b\u0012\u0005\u000e"+
		"\u0000\u0000\f\u0012\u0005\u000f\u0000\u0000\r\u000e\u0005\u0002\u0000"+
		"\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0003\u0000"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\n\u0001\u0000\u0000\u0000"+
		"\u0011\f\u0001\u0000\u0000\u0000\u0011\r\u0001\u0000\u0000\u0000\u0012"+
		"*\u0001\u0000\u0000\u0000\u0013\u0014\n\n\u0000\u0000\u0014\u0015\u0005"+
		"\u0004\u0000\u0000\u0015)\u0003\u0002\u0001\u000b\u0016\u0017\n\t\u0000"+
		"\u0000\u0017\u0018\u0005\b\u0000\u0000\u0018)\u0003\u0002\u0001\n\u0019"+
		"\u001a\n\b\u0000\u0000\u001a\u001b\u0005\t\u0000\u0000\u001b)\u0003\u0002"+
		"\u0001\t\u001c\u001d\n\u0007\u0000\u0000\u001d\u001e\u0005\n\u0000\u0000"+
		"\u001e)\u0003\u0002\u0001\b\u001f \n\u0006\u0000\u0000 !\u0005\u0005\u0000"+
		"\u0000!)\u0003\u0002\u0001\u0007\"#\n\u0005\u0000\u0000#$\u0005\u0006"+
		"\u0000\u0000$)\u0003\u0002\u0001\u0006%&\n\u0004\u0000\u0000&\'\u0005"+
		"\r\u0000\u0000\')\u0003\u0002\u0001\u0005(\u0013\u0001\u0000\u0000\u0000"+
		"(\u0016\u0001\u0000\u0000\u0000(\u0019\u0001\u0000\u0000\u0000(\u001c"+
		"\u0001\u0000\u0000\u0000(\u001f\u0001\u0000\u0000\u0000(\"\u0001\u0000"+
		"\u0000\u0000(%\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000\u0003\u0011(*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}