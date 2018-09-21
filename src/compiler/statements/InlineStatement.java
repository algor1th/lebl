package compiler.statements;

import compiler.Block;

import java.util.Collection;
import java.util.Map;

public class InlineStatement extends Statement {
    private final String block;

    public InlineStatement(String block) {
        this.block = block;
    }

    @Override
    public Collection<Statement> compile(Map<String, Block> blocks) {
        return blocks.get(block).compile(blocks, true);
    }
}
