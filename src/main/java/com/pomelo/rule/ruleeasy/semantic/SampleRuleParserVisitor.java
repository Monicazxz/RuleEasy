package com.pomelo.rule.ruleeasy.semantic;

import java.util.logging.Logger;

import org.antlr.v4.runtime.misc.NotNull;

import com.pomelo.rule.ruleeasy.grammar.RuleParser;
import com.pomelo.rule.ruleeasy.grammar.RuleParserBaseVisitor;

@SuppressWarnings("deprecation")
public class SampleRuleParserVisitor extends RuleParserBaseVisitor<Void> {

    Logger logger = Logger.getLogger(SampleRuleParserVisitor.class.getName());

    @Override
    public Void visitProcess(@NotNull RuleParser.ProcessContext ctx) {
        logger.info(ctx.getText());
        return super.visitProcess(ctx);

    }
}
