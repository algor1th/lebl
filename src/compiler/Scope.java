package compiler;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private final Scope parent;
    private final Map<String, Label> labels = new HashMap<>();
    private final Map<String, Block> blocks = new HashMap<>();
    private final Map<Class<? extends Scopeable>, Map<String, ? extends Scopeable>> metaScope = Map.of(Label.class, labels, Block.class, blocks);

    public Scope(Scope parent) {
        this.parent = parent;
    }

    Scope() {
        parent = null;
    }

    private <T extends Scopeable> T lookup(Class<T> valueClass, String key) {
        Map<String, ? extends Scopeable> map = metaScope.get(valueClass);

        if (map.containsKey(key)) {
            return (T)map.get(key);
        } else if (parent != null) {
            return parent.lookup(valueClass, key);
        } else {
            throw new IllegalStateException(String.format("%s not in scope", key));
        }
    }

    public int lookupLabel(String label) {
        return lookup(Label.class, label);
    }

    public Block lookupBlock(String block) {
        return lookup(Block.class, block);
    }

    private <T> boolean contains(Map<String, T> map, String key) {
        if (map.containsKey(key)) {
            return true;
        } else if (parent != null) {
            return parent.contains(map, key);
        } else {
            return false;
        }
    }

    private <T> void set (Map<String, T> map, String key, T value) {
        if (contains(map, key)) {
            throw new IllegalStateException(String.format("%s already declared", value));
        }
        map.put(key, value);
    }

    public void setLabel(String label, int line) {
        set(labels, label, line);
    }

    public void setBlock(String blockName, Block block) {
        set(blocks, blockName, block);
    }

    public Scope getParent() {
        return parent;
    }
}
