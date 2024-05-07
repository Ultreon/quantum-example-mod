package com.example.craft.mod.init;

import com.example.craft.mod.ExampleMod;
import dev.ultreon.quantum.block.Block;
import dev.ultreon.quantum.registry.DeferredElement;
import dev.ultreon.quantum.registry.Registries;
import dev.ultreon.quantum.registry.DeferRegistry;

public class ModBlocks {
    private static final DeferRegistry<Block> REGISTER = DeferRegistry.of(ExampleMod.MOD_ID, Registries.BLOCK);

    public static final DeferredElement<Block> EXAMPLE_BLOCK = REGISTER.defer("example_block", Block::new);

    public static void register() {
        REGISTER.register();
    }
}
