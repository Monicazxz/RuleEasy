// Generated from RuleParser.g4 by ANTLR 4.7.1
package com.pomelo.rule.ruleeasy.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleParser#steps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSteps(RuleParser.StepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(RuleParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#follow_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFollow_step(RuleParser.Follow_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(RuleParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#is_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_continue(RuleParser.Is_continueContext ctx);
}