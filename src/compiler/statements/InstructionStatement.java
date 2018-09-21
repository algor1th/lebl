package compiler.statements;

public class InstructionStatement extends Statement {
    protected final String text;

    public InstructionStatement(String text) {
        this.text = text;
    }

    @Override
    public String writeOut() {
        return text;
    }
}
