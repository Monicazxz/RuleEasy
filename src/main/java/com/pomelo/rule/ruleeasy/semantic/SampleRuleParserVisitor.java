package com.pomelo.rule.ruleeasy.semantic;

import java.util.logging.Logger;

import org.antlr.v4.runtime.misc.NotNull;

import com.pomelo.rule.ruleeasy.grammar.RuleParser;
import com.pomelo.rule.ruleeasy.grammar.RuleParserBaseVisitor;

@SuppressWarnings("deprecation")
public class SampleRuleParserVisitor extends RuleParserBaseVisitor<Boolean> {

    Logger logger = Logger.getLogger(SampleRuleParserVisitor.class.getName());

    @Override
    public Boolean visitSteps(RuleParser.StepsContext ctx) {
        Boolean result = visit(ctx.step());
        if (ctx.follow_step().is_continue() == null
                || result.booleanValue() && ctx.follow_step().is_continue().K_SUCCESS() != null
                || !result.booleanValue() && ctx.follow_step().is_continue().K_FAIL() != null) {
            return visit(ctx.follow_step().step());
        }
        return result;
    }

    @Override
    public Boolean visitProcess(@NotNull RuleParser.ProcessContext ctx) {
        logger.info(ctx.getText());
        return false;
    }
}
