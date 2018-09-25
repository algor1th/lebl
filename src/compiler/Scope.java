package compiler;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private final Scope parent;
    private final Map<String, LabelLine> labels = new HashMap<>();
    private final Map<String, Block> blocks = new HashMap<>();

    public Scope(Scope parent) {
        this.parent = parent;
    }

    Scope() {
        parent = null;
    }

    private <T extends Scopeable> Map<String, T> getMap(Class<T> clazz) {
        if (clazz == Block.class) {
            return (Map<String, T>)blocks;
        } else if (clazz == LabelLine.class) {
            return (Map<String, T>)labels;
        } else {
            throw new IllegalArgumentException(String.format("Unknown Scopeable %s", clazz.toString()));
        }
    }

    private <T extends Scopeable> T lookup(Class<T> clazz, String key) {
        Map<String, T> map = getMap(clazz);

        if (map.containsKey(key)) {
            return map.get(key);
        } else if (parent != null) {
            return parent.lookup(clazz, key);
        } else {
            throw new IllegalStateException(String.format("%s not in scope", key));
        }
    }

    public int lookupLabel(String label) {
        return lookup(LabelLine.class, label).get();
    }

    public Block lookupBlock(String block) {
        return lookup(Block.class, block);
    }

    private <T extends Scopeable> boolean contains(Class<T> clazz, String key) {
        Map<String, T> map = getMap(clazz);

        if (map.containsKey(key)) {
            return true;
        } else if (parent != null) {
            return parent.contains(clazz, key);
        } else {
            return false;
        }
    }

    private <T extends Scopeable> void set (Class<T> clazz, String key, T value) {
        if (contains(clazz, key)) {
            throw new IllegalStateException(String.format("%s already declared", value));
        }
        Map<String, T> map = getMap(clazz);
        map.put(key, value);
    }

    public void setLabel(String label, int line) {
        set(LabelLine.class, label, new LabelLine(line));
    }

    public void setBlock(String blockName, Block block) {
        set(Block.class, blockName, block);
    }

    public Scope getParent() {
        return parent;
    }

    private static class LabelLine implements Scopeable {
        private final Integer line;

        public LabelLine(Integer line) {
            this.line = line;
        }

        public Integer get() {
            return line;
        }
    }
}
