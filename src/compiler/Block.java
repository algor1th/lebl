package compiler;

import compiler.statements.JumpInstructionStatement;
import compiler.statements.LabelStatement;
import compiler.statements.Statement;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Block {
    private final String name;
    private final List<Statement> statements;
    private List<Statement> compiledStatements;
    private final Collection<String> inlinedBlocks;
    private final Collection<String> linkedBlocks;
    private LabelScope blockScope;

    public Block(String name, List<Statement> statements, Collection<String> inlinedBlocks, Collection<String> linkedBlocks) {
        this.name = name;
        this.statements = statements;
        this.inlinedBlocks = inlinedBlocks;
        this.linkedBlocks = linkedBlocks;
    }

    /**
     * Throw exception if we have recursive inlines
     * @param blocks
     */
    public void checkRecursiveInlines(Map<String, Block> blocks) {

    }

    /**
     * Return a collection of blocks that is reachable from the current block
     * //todo for now returns all blocks, but they are in the wrong order
     * @param blocks
     * @return
     */
    public Collection<Block> checkReachableBlocks(Map<String, Block> blocks) {
        return blocks.values();
    }

    public void compile(Map<String, Block> blocks) {
        compile(blocks, false);
    }

    public void compile(Map<String, Block> blocks, boolean inline) {
        if (compiledStatements != null) {
            return;
        }

        compiledStatements = new ArrayList<>();

        if (!inline) {
            compiledStatements.add(new LabelStatement(name));
        }

        for (Statement statement : statements) {
            compiledStatements.addAll(statement.compile(blocks));
        }

        if (!inline) {
            compiledStatements.add(new JumpInstructionStatement("jump ", name));
        }
    }

    public void writeOut(StringBuilder ret) {
        for (Statement statement : compiledStatements) {
            statement.writeOut(ret);
        }
    }

    public int assignLine (LabelScope scope, int line) {
        blockScope = new LabelScope(scope);
        for (Statement statement : compiledStatements) {
            line = statement.assignLine(blockScope, line);
        }
        return line;
    }

    public void assignLabel() {
        for (Statement statement : compiledStatements) {
            statement.assignLabel(blockScope);
        }
    }

    public Collection<Statement> getCompiledStatements() {
        return compiledStatements;
    }
}
