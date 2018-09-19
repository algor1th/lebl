package compiler;

import java.util.HashMap;
import java.util.Map;

public class LabelScope {
    private LabelScope parent;
    private Map<String, Integer> labels = new HashMap<>();

    public LabelScope(LabelScope parent) {
        this.parent = parent;
    }

    LabelScope() {

    }

    int lookupLabel(String label) {
        if (labels.containsKey(label)) {
            return labels.get(label);
        } else if (parent != null) {
            return parent.lookupLabel(label);
        } else {
            throw new IllegalStateException("lookup for label " + label + " not in scope");
        }
    }

    void setLabel(String label, int line) {
        if (labels.containsKey(label))
            throw new IllegalStateException("label already declared");
        labels.put(label, line);
    }

    public LabelScope getParent() {
        return parent;
    }

    boolean contains(String label) {
        if (labels.containsKey(label)) {
            return true;
        } else if (parent != null) {
            return parent.contains(label);
        } else {
            return false;
        }
    }
}
