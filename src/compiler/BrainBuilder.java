package compiler;

import java.util.HashMap;
import java.util.Map;

public class BrainBuilder {
    private static String name;
    private Map<String, BlockBuilder> blocks = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        BrainBuilder.name = name;
    }

    void addBlock(BlockBuilder block) {
        this.blocks.put(block.getName(), block);
    }
}
