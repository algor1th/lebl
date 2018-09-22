package compiler.statements;

import compiler.LabelScope;

public class JumpInstructionStatement extends InstructionStatement {
    private final String jumpLabel;
    private int jumpAddress;

    public JumpInstructionStatement(String text, String jumpLabel) {
        super(text);
        this.jumpLabel = jumpLabel;
    }

    @Override
    public void assignLabel(LabelScope scope) {
        jumpAddress = scope.lookupLabel(jumpLabel);
    }

    @Override
    public void writeOut(StringBuilder ret) {
        ret.append(text).append(jumpAddress).append('\n');
    }
}
