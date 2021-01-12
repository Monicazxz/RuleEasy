package com.pomelo.rule.ruleeasy;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import com.pomelo.rule.ruleeasy.grammar.RuleLexer;
import com.pomelo.rule.ruleeasy.grammar.RuleParser;
import com.pomelo.rule.ruleeasy.semantic.SampleRuleParserVisitor;

public class RuleService {

    public static void main(String[] args) {
        RuleService.exec("执行 P1流程,再 执行 P2流程.");
    }

    public static void exec(String rule) {
        SampleRuleParserVisitor sampleRuleParserVisitor = new SampleRuleParserVisitor();
        CharStream input = CharStreams.fromString(rule);
        RuleLexer lexer = new RuleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RuleParser parser = new RuleParser(tokens);
        ParseTree tree = parser.steps();
        sampleRuleParserVisitor.visit(tree);
    }
}
