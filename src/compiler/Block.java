package compiler;

import compiler.statements.JumpInstructionStatement;
import compiler.statements.LabelStatement;
import compiler.statements.Statement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Block {
    private final String name;
    private final List<Statement> statements;
    private final Collection<String> inlinedBlocks;
    private final Collection<String> linkedBlocks;

    public Block(String name, List<Statement> statements, Collection<String> inlinedBlocks, Collection<String> linkedBlocks) {
        this.name = name;
        this.statements = statements;
        this.inlinedBlocks = inlinedBlocks;
        this.linkedBlocks = linkedBlocks;
    }

    public void checkRecursiveInlines(Map<String, Block> blocks) {

    }

    public Collection<Block> checkReachableBlocks(Map<String, Block> blocks) {
        return blocks.values();
    }

    public Collection<Statement> compile(Map<String, Block> blocks) {
        return compile(blocks, false);
    }

    public Collection<Statement> compile(Map<String, Block> blocks, boolean inline) {
        List<Statement> compiledStatements = new ArrayList<>();

        if (!inline) {
            compiledStatements.add(new LabelStatement(name));
        }

        for (Statement statement : statements) {
            compiledStatements.addAll(statement.compile(blocks));
        }

        if (!inline) {
            compiledStatements.add(new JumpInstructionStatement("jump ", name));
        }

        return compiledStatements;
    }
}
