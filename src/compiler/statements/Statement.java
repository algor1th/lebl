package compiler.statements;

import compiler.Block;
import compiler.LabelScope;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class Statement {
    public Collection<Statement> compile(Map<String, Block> blocks) {
        return List.of(this);
    }

    public int assignLine (LabelScope scope, int line) {
        return line + 1;
    }

    public void assignLabel(LabelScope scope) {}

    public String writeOut() {
        return "";
    };
}
