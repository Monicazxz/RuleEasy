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
		K_EXECUTE=1, K_THEN=2, K_SUCCESS=3, K_FAIL=4, COMMA=5, PERIOD=6, CHINESE_CHAR=7, 
		SPACES=8;
	public static final int
		RULE_steps = 0, RULE_step = 1, RULE_follow_step = 2, RULE_process = 3, 
		RULE_is_continue = 4;
	public static final String[] ruleNames = {
		"steps", "step", "follow_step", "process", "is_continue"
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
			setState(10);
			step();
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(11);
				follow_step();
				}
			}

			setState(14);
			match(PERIOD);
			setState(15);
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
			setState(17);
			match(K_EXECUTE);
			setState(18);
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
		public List<TerminalNode> COMMA() { return getTokens(RuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuleParser.COMMA, i);
		}
		public TerminalNode K_THEN() { return getToken(RuleParser.K_THEN, 0); }
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public Is_continueContext is_continue() {
			return getRuleContext(Is_continueContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(COMMA);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SUCCESS || _la==K_FAIL) {
				{
				setState(21);
				is_continue();
				setState(22);
				match(COMMA);
				}
			}

			setState(26);
			match(K_THEN);
			setState(27);
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
			setState(29);
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

	public static class Is_continueContext extends ParserRuleContext {
		public TerminalNode K_SUCCESS() { return getToken(RuleParser.K_SUCCESS, 0); }
		public TerminalNode K_FAIL() { return getToken(RuleParser.K_FAIL, 0); }
		public Is_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).enterIs_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleParserListener ) ((RuleParserListener)listener).exitIs_continue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleParserVisitor ) return ((RuleParserVisitor<? extends T>)visitor).visitIs_continue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_continueContext is_continue() throws RecognitionException {
		Is_continueContext _localctx = new Is_continueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_is_continue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==K_SUCCESS || _la==K_FAIL) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\3\3\2\5\6\2 \2\f\3\2\2\2\4\23\3\2\2\2\6\26\3\2\2\2\b\37\3\2\2"+
		"\2\n!\3\2\2\2\f\16\5\4\3\2\r\17\5\6\4\2\16\r\3\2\2\2\16\17\3\2\2\2\17"+
		"\20\3\2\2\2\20\21\7\b\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\3\2\2\24"+
		"\25\5\b\5\2\25\5\3\2\2\2\26\32\7\7\2\2\27\30\5\n\6\2\30\31\7\7\2\2\31"+
		"\33\3\2\2\2\32\27\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\4\2\2\35"+
		"\36\5\4\3\2\36\7\3\2\2\2\37 \7\t\2\2 \t\3\2\2\2!\"\t\2\2\2\"\13\3\2\2"+
		"\2\4\16\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}