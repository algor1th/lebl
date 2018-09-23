package compiler;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import compiler.statements.Statement;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;

public class Visitor extends GrammarBaseVisitor {

    StatementVisitor statementVisitor;

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
        final Scope scope = new Scope();
        statementVisitor = new StatementVisitor();

        var name = ctx.IDENTIFIER().getSymbol().getText();
        ctx.block().forEach(block -> scope.setBlock(block.IDENTIFIER().getText(), visitBlock(block)));

        Block main = scope.lookupBlock("main");
        Collection<Block> reachableBlocks = new ArrayList<>();
        main.checkReachableBlock(scope, reachableBlocks, new ArrayList<>(), false);

        for (Block reachableBlock : reachableBlocks) {
            reachableBlock.makeRepeating();
        }

        int line = 0;
        for (Block reachableBlock : reachableBlocks) {
            line = reachableBlock.assignLine(scope, line);
        }

        StringBuilder ret = new StringBuilder("brain \"" + name + "\" {\n");
        for (Block reachableBlock : reachableBlocks) {
            reachableBlock.assignLabel();
            reachableBlock.writeOut(ret);
        }

        ret.append("}");
        return ret.toString();
    }

    @Override
    public Block visitBlock(GrammarParser.BlockContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Deque<Statement> statements = new ArrayDeque<>();
        List<String> inlinedBlocks = new ArrayList<>();
        List<String> linkedBlocks = new ArrayList<>();

        for (GrammarParser.StatementContext statementContext : ctx.statement()) {
            Statement statement;
            if (statementContext.inline() != null) {
                inlinedBlocks.add(statementContext.inline().IDENTIFIER().getText());
            } else if (statementContext.changeblock() != null) {
                linkedBlocks.add(statementContext.changeblock().IDENTIFIER().getText());
            }
            statements.add(statementVisitor.visit(statementContext));
        }

        return new Block(name, statements, inlinedBlocks, linkedBlocks);
    }
}
