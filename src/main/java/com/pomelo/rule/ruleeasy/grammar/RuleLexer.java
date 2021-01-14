// Generated from RuleLexer.g4 by ANTLR 4.7.1
package com.pomelo.rule.ruleeasy.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_EXECUTE=1, K_THEN=2, K_SUCCESS=3, K_FAIL=4, COMMA=5, PERIOD=6, CHINESE_CHAR=7, 
		SPACES=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"K_EXECUTE", "K_THEN", "K_SUCCESS", "K_FAIL", "COMMA", "PERIOD", "CHINESE_CHAR", 
		"SPACES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u6267\u884C'", "'\u518D'", "'\u5982\u679C\u6210\u529F'", "'\u5982\u679C\u5931\u8D25'", 
		"','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "K_EXECUTE", "K_THEN", "K_SUCCESS", "K_FAIL", "COMMA", "PERIOD", 
		"CHINESE_CHAR", "SPACES"
	};
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


	public RuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n/\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b("+
		"\n\b\r\b\16\b)\3\t\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\3\2\4\t\2*+\62;C\\c|\u3003\u3003\u4e02\ua001\uff0a\uff0b\5\2\13\r\17"+
		"\17\"\"\2/\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\26\3\2\2\2\7\30"+
		"\3\2\2\2\t\35\3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17\'\3\2\2\2\21+\3\2\2\2"+
		"\23\24\7\u6269\2\2\24\25\7\u884e\2\2\25\4\3\2\2\2\26\27\7\u518f\2\2\27"+
		"\6\3\2\2\2\30\31\7\u5984\2\2\31\32\7\u679e\2\2\32\33\7\u6212\2\2\33\34"+
		"\7\u52a1\2\2\34\b\3\2\2\2\35\36\7\u5984\2\2\36\37\7\u679e\2\2\37 \7\u5933"+
		"\2\2 !\7\u8d27\2\2!\n\3\2\2\2\"#\7.\2\2#\f\3\2\2\2$%\7\60\2\2%\16\3\2"+
		"\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\20\3\2\2\2+"+
		",\t\3\2\2,-\3\2\2\2-.\b\t\2\2.\22\3\2\2\2\4\2)\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}