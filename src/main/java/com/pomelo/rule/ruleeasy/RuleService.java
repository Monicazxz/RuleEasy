package com.pomelo.rule.ruleeasy;

import java.util.logging.Logger;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import com.pomelo.rule.ruleeasy.grammar.RuleLexer;
import com.pomelo.rule.ruleeasy.grammar.RuleParser;
import com.pomelo.rule.ruleeasy.semantic.SampleRuleParserVisitor;

public class RuleService {

    static Logger logger = Logger.getLogger(RuleService.class.getName());

    public static void main(String[] args) {
        RuleService.exec("执行 P1流程,再 执行 P2流程.");
        RuleService.exec("执行 P1流程,如果成功,再 执行 P2流程.");
        RuleService.exec("执行 P1流程,如果失败,再 执行 P2流程.");
    }

    public static void exec(String rule) {
        logger.info(rule);
        SampleRuleParserVisitor sampleRuleParserVisitor = new SampleRuleParserVisitor();
        CharStream input = CharStreams.fromString(rule);
        RuleLexer lexer = new RuleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RuleParser parser = new RuleParser(tokens);
        ParseTree tree = parser.steps();
        sampleRuleParserVisitor.visit(tree);
    }
}
