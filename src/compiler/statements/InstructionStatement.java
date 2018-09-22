package compiler.statements;

public class InstructionStatement extends Statement {
    protected final String text;

    public InstructionStatement(String text) {
        this.text = text;
    }

    @Override
    public void writeOut(StringBuilder ret) {
        ret.append(text).append('\n');
    }
}
