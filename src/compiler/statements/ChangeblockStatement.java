package compiler.statements;

import compiler.Block;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ChangeblockStatement extends JumpInstructionStatement {
    public ChangeblockStatement(String block) {
        super("jump ", block);
    }
}
