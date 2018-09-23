package compiler.statements;

import compiler.Scope;

public class LabelStatement extends Statement {
    private final String label;

    public LabelStatement(String label) {
        this.label = label;
    }

    @Override
    public int assignLine(Scope scope, int line) {
        scope.getParent().setLabel(label, line);
        return line;
    }
}
