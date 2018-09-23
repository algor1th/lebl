package compiler;

import compiler.statements.JumpInstructionStatement;
import compiler.statements.LabelStatement;
import compiler.statements.Statement;

import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class Block implements Scopeable {
    private final String name;
    private final Deque<Statement> statements;
    private final Collection<String> inlinedBlocks;
    private final Collection<String> linkedBlocks;
    private Scope blockScope;

    public Block(String name, Deque<Statement> statements, Collection<String> inlinedBlocks, Collection<String> linkedBlocks) {
        this.name = name;
        this.statements = statements;
        this.inlinedBlocks = inlinedBlocks;
        this.linkedBlocks = linkedBlocks;
    }

    public void checkReachableBlock(Scope scope, Collection<Block> stateBlocks, Collection<Block> inlineBlocks, boolean inline) {
        if (inline) {
            if (stateBlocks.contains(this)) {
                throw new IllegalStateException("Inlined blocks cannot be explicitly changed to.");
            } else if (inlineBlocks.contains(this)) {
                throw new IllegalStateException(String.format("Found recursive inline blocks at: %s", inlineBlocks.toString()));
            }
            inlineBlocks.add(this);
        } else {
            if (inlineBlocks.contains(this)) {
                throw new IllegalStateException("Inlined blocks cannot be explicitly changed to.");
            }
            stateBlocks.add(this);
        }

        inlinedBlocks.forEach(blockString -> scope.lookupBlock(blockString).checkReachableBlock(scope, stateBlocks, inlineBlocks, true));
        linkedBlocks.forEach(blockString -> scope.lookupBlock(blockString).checkReachableBlock(scope, stateBlocks, inlineBlocks, false));
    }

    public void makeRepeating() {
        statements.addFirst(new LabelStatement(name));
        statements.addLast(new JumpInstructionStatement("jump ", name));
    }

    public void writeOut(StringBuilder ret) {
        for (Statement statement : statements) {
            statement.writeOut(ret);
        }
    }

    public int assignLine (Scope scope, int line) {
        blockScope = new Scope(scope);
        for (Statement statement : statements) {
            line = statement.assignLine(blockScope, line);
        }
        return line;
    }

    public void assignLabel() {
        for (Statement statement : statements) {
            statement.assignLabel(blockScope);
        }
    }

    public Block getCopy() {
        return new Block(name, statements, inlinedBlocks, linkedBlocks);
    }

    @Override
    public String toString() {
        return String.format("Block (%s)", name);
    }
}
