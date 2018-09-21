package compiler.statements;

import compiler.Block;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ChangeblockStatement extends Statement {
    private final String block;

    public ChangeblockStatement(String block) {
        this.block = block;
    }

    @Override
    public Collection<Statement> compile(Map<String, Block> blocks) {
        return List.of(new JumpInstructionStatement("jump ", block));
    }
}
