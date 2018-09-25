package compiler.statements;

import compiler.Block;
import compiler.Scope;

public class InlineStatement extends Statement {
    private final String blockName;
    private Block block;

    public InlineStatement(String blockName) {
        this.blockName = blockName;
    }

    @Override
    public int assignLine(Scope scope, int line) {
        block = scope.lookupBlock(blockName).getCopy();
        line = block.assignLine(scope, line);
        return line;
    }

    @Override
    public void assignLabel(Scope scope) {
        block.assignLabel();
    }

    @Override
    public void writeOut(StringBuilder ret) {
        block.writeOut(ret);
    }
}
