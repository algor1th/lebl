package compiler.statements;

import compiler.Block;
import compiler.LabelScope;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class InlineStatement extends Statement {
    private final String block;
    private Collection<Statement> inlinedStatements;

    public InlineStatement(String block) {
        this.block = block;
    }

    @Override
    public int assignLine(LabelScope scope, int line) {
        for (Statement inlinedStatement : inlinedStatements) {
            line = inlinedStatement.assignLine(scope, line);
        }

        return line;
    }

    @Override
    public void assignLabel(LabelScope scope) {
        for (Statement inlinedStatement : inlinedStatements) {
            inlinedStatement.assignLabel(scope);
        }
    }

    @Override
    public Collection<Statement> compile(Map<String, Block> blocks) {
        Block inlinedBlock = blocks.get(block);
        inlinedBlock.compile(blocks, true);
        inlinedStatements = inlinedBlock.getCompiledStatements();
        return inlinedStatements;
    }

    @Override
    public void writeOut(StringBuilder ret) {
        for (Statement inlinedStatement : inlinedStatements) {
            inlinedStatement.writeOut(ret);
        }
    }
}
