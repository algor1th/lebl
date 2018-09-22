package compiler.statements;

import compiler.Block;
import compiler.LabelScope;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class InlineStatement extends Statement {
    private final String block;
    private Collection<Statement> inlinedBlock;
    private LabelScope inlinedScope;

    public InlineStatement(String block) {
        this.block = block;
    }

    @Override
    public int assignLine(LabelScope scope, int line) {
        inlinedScope = new LabelScope(scope);
        for (Statement inlinedStatement : inlinedBlock) {
            line = inlinedStatement.assignLine(inlinedScope, line);
        }

        return line;
    }

    @Override
    public void assignLabel(LabelScope scope) {
        for (Statement inlinedStatement : inlinedBlock) {
            inlinedStatement.assignLabel(inlinedScope);
        }
    }

    @Override
    public Collection<Statement> compile(Map<String, Block> blocks) {
        inlinedBlock = blocks.get(block).compile(blocks, true);
        return List.of(this);
    }

    @Override
    public void writeOut(StringBuilder ret) {
        for (Statement inlinedStatement : inlinedBlock) {
            inlinedStatement.writeOut(ret);
        }
    }
}
