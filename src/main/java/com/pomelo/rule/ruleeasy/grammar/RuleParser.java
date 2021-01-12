// Generated from RuleParser.g4 by ANTLR 4.7.1
package com.pomelo.rule.ruleeasy.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=3, K_EXECUTE=1, CHINESE_CHAR=5, SPACES=6, PERIOD=4, K_THEN=2;
	public static final int
		RULE_steps = 0, RULE_step = 1, RULE_follow_step = 2, RULE_process = 3;
	public static final String[] ruleNames = {
		"steps", "step", "follow_step", "process"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u6267\u884C'", "'\u518D'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "K_EXECUTE", "K_THEN", "COMMA", "PERIOD", "CHINESE_CHAR", "SPACES"
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

	@Override
	public String getGrammarFileName() { return "RuleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StepsContext extends ParserRuleContext {
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(RuleParser.PERIOD, 0); }
		public TerminalNode EOF() { return getToken(RuleParser.EOF, 0); }
		public Follow_stepContext follow_step() {
			return getRuleContext(Follow_stepContext.class,0);
		}
		public StepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).enterSteps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).exitSteps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleParserVisitor ) return ((RuleParserVisitor<? extends T>)visitor).visitSteps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepsContext steps() throws RecognitionException {
		StepsContext _localctx = new StepsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			step();
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(9);
				follow_step();
				}
			}

			setState(12);
			match(PERIOD);
			setState(13);
			match(EOF);
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

	public static class StepContext extends ParserRuleContext {
		public TerminalNode K_EXECUTE() { return getToken(RuleParser.K_EXECUTE, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleParserVisitor ) return ((RuleParserVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(K_EXECUTE);
			setState(16);
			process();
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

	public static class Follow_stepContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(RuleParser.COMMA, 0); }
		public TerminalNode K_THEN() { return getToken(RuleParser.K_THEN, 0); }
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public Follow_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_follow_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).enterFollow_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).exitFollow_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleParserVisitor ) return ((RuleParserVisitor<? extends T>)visitor).visitFollow_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Follow_stepContext follow_step() throws RecognitionException {
		Follow_stepContext _localctx = new Follow_stepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_follow_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(COMMA);
			setState(19);
			match(K_THEN);
			setState(20);
			step();
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode CHINESE_CHAR() { return getToken(RuleParser.CHINESE_CHAR, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleParserVisitor ) return ((RuleParserVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(CHINESE_CHAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\27\2\n\3\2\2\2\4\21\3\2\2\2\6"+
		"\24\3\2\2\2\b\30\3\2\2\2\n\f\5\4\3\2\13\r\5\6\4\2\f\13\3\2\2\2\f\r\3\2"+
		"\2\2\r\16\3\2\2\2\16\17\7\6\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\7\3\2"+
		"\2\22\23\5\b\5\2\23\5\3\2\2\2\24\25\7\5\2\2\25\26\7\4\2\2\26\27\5\4\3"+
		"\2\27\7\3\2\2\2\30\31\7\7\2\2\31\t\3\2\2\2\3\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}