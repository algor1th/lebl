package compiler;

import java.util.Map;

public class Brain {
    private final String name;
    private final Map<String, Block> states;
    private final LabelScope scope;

    public Brain(String name, Map<String, Block> states, LabelScope scope) {
        this.name = name;
        this.states = states;
        this.scope = scope;
    }
}
