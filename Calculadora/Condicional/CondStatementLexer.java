// Generated from CondStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CondStatementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ADD=7, SUB=8, LOWER=9, 
		HIGHER=10, LEQ=11, HEQ=12, EQ=13, INT=14, VARNAME=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ADD", "SUB", "LOWER", 
			"HIGHER", "LEQ", "HEQ", "EQ", "INT", "VARNAME", "WS"
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


	public CondStatementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CondStatement.g4"; }

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
		"\u0004\u0000\u0010X\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rE\b\r\u000b\r\f\rF\u0001\u000e"+
		"\u0003\u000eJ\b\u000e\u0001\u000e\u0005\u000eM\b\u000e\n\u000e\f\u000e"+
		"P\t\u000e\u0001\u000f\u0004\u000fS\b\u000f\u000b\u000f\f\u000fT\u0001"+
		"\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000"+
		"\u0004\u0001\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n"+
		"\r\r  Z\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005&\u0001"+
		"\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000"+
		"\u0000\u000b-\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f"+
		"3\u0001\u0000\u0000\u0000\u00115\u0001\u0000\u0000\u0000\u00137\u0001"+
		"\u0000\u0000\u0000\u00159\u0001\u0000\u0000\u0000\u0017=\u0001\u0000\u0000"+
		"\u0000\u0019A\u0001\u0000\u0000\u0000\u001bD\u0001\u0000\u0000\u0000\u001d"+
		"I\u0001\u0000\u0000\u0000\u001fR\u0001\u0000\u0000\u0000!\"\u0005i\u0000"+
		"\u0000\"#\u0005f\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005(\u0000"+
		"\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005)\u0000\u0000\'\u0006\u0001"+
		"\u0000\u0000\u0000()\u0005+\u0000\u0000)\b\u0001\u0000\u0000\u0000*+\u0005"+
		"<\u0000\u0000+,\u0005=\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005"+
		">\u0000\u0000./\u0005=\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005"+
		"+\u0000\u000012\u0005 \u0000\u00002\u000e\u0001\u0000\u0000\u000034\u0005"+
		"-\u0000\u00004\u0010\u0001\u0000\u0000\u000056\u0005<\u0000\u00006\u0012"+
		"\u0001\u0000\u0000\u000078\u0005>\u0000\u00008\u0014\u0001\u0000\u0000"+
		"\u00009:\u0005 \u0000\u0000:;\u0005<\u0000\u0000;<\u0005=\u0000\u0000"+
		"<\u0016\u0001\u0000\u0000\u0000=>\u0005 \u0000\u0000>?\u0005>\u0000\u0000"+
		"?@\u0005=\u0000\u0000@\u0018\u0001\u0000\u0000\u0000AB\u0005=\u0000\u0000"+
		"B\u001a\u0001\u0000\u0000\u0000CE\u0007\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000G\u001c\u0001\u0000\u0000\u0000HJ\u0007\u0001\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JN\u0001\u0000\u0000\u0000KM\u0007\u0002"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u001e\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QS\u0007\u0003\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u000f\u0000\u0000"+
		"W \u0001\u0000\u0000\u0000\u0006\u0000FILNT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}