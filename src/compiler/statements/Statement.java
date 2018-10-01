package compiler.statements;

import compiler.Scope;

public abstract class Statement {
    public int assignLine (Scope scope, int line) {
        return line + 1;
    }

    public void assignLabel(Scope scope) {}

    public void writeOut(StringBuilder ret) {}
}
