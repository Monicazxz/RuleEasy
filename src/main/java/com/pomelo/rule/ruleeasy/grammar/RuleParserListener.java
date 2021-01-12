// Generated from RuleParser.g4 by ANTLR 4.7.1
package com.pomelo.rule.ruleeasy.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#steps}.
	 * @param ctx the parse tree
	 */
	void enterSteps(RuleParser.StepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#steps}.
	 * @param ctx the parse tree
	 */
	void exitSteps(RuleParser.StepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(RuleParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(RuleParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#follow_step}.
	 * @param ctx the parse tree
	 */
	void enterFollow_step(RuleParser.Follow_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#follow_step}.
	 * @param ctx the parse tree
	 */
	void exitFollow_step(RuleParser.Follow_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(RuleParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(RuleParser.ProcessContext ctx);
}