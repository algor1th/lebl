package compiler;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import compiler.statements.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitor extends GrammarBaseVisitor {

    private final Map<String, Block> blocks = new HashMap<>();
    private final String blockprefix = "block:";
    private LabelScope scope = new LabelScope();
    private StatementVisitor statementVisitor;

    /**
     * Alle blocks in map
     *  Alle blocks wissen mit welchen anderen Blocks sie durch inline und changeblock gelinkt sind
     * Bei main block startend schauen ob alle blocks erreichbar sind/keine rekursiven inlines stattfinden
     * Den main block und alle benutzten Blocks in eine Liste von Statements compilen (inlines werden zu mehreren Statements)
     * Durchgehen und labels Zeilennummern assignen
     * Durchgehen und labelReferenzen durch Zeilennummern ersetzen und in einen Stringbuilder schreiben
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitBrain(GrammarParser.BrainContext ctx) {
        statementVisitor = new StatementVisitor();
        var name = ctx.IDENTIFIER().getSymbol().getText();
        ctx.block().forEach(block -> blocks.put(block.IDENTIFIER().getText(), visitBlock(block)));

        var main = blocks.get("main");
        main.checkRecursiveInlines(blocks);
        var reachableBlocks = main.checkReachableBlocks(blocks);

        //todo instead of compiling to statements directly add all reachable blocks into a list
        //so that we can do block local scopes for labels defined in inlined blocks in these reachable blocks
        List<Statement> statements = new ArrayList<>();

        for (Block reachableBlock : reachableBlocks) {
            statements.addAll(reachableBlock.compile(blocks));
        }

        int line = 0;
        for (Statement statement : statements) {
            line = statement.assignLine(scope, line);
        }

        StringBuilder ret = new StringBuilder("brain \"" + name + "\" {\n");
        for (Statement statement : statements) {
            statement.assignLabel(scope);
            statement.writeOut(ret);
        }

        ret.append("}");
        return ret.toString();
    }

    @Override
    public Block visitBlock(GrammarParser.BlockContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<Statement> statements = new ArrayList<>();
        List<String> inlinedBlocks = new ArrayList<>();
        List<String> linkedBlocks = new ArrayList<>();

        for (GrammarParser.StatementContext statement : ctx.statement()) {
            if (statement.inline() != null) {
                inlinedBlocks.add(statement.inline().IDENTIFIER().getText());
            } else if (statement.changeblock() != null) {
                linkedBlocks.add(statement.changeblock().IDENTIFIER().getText());
            }
            statements.add(statementVisitor.visit(statement));
        }

        return new Block(name, statements, inlinedBlocks, linkedBlocks);
    }
}
