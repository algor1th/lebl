package compiler.statements;

import compiler.LabelScope;

public class LabelStatement extends Statement {
    private final String label;

    public LabelStatement(String label) {
        this.label = label;
    }

    @Override
    public int assignLine(LabelScope scope, int line) {
        scope.setLabel(label, line);
        return line;
    }
}
