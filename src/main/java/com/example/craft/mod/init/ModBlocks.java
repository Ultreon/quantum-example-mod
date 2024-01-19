package com.example.craft.mod.init;

import com.example.craft.mod.ExampleMod;
import com.ultreon.craft.block.Block;
import com.ultreon.craft.client.model.block.BlockModelRegistry;
import com.ultreon.craft.registry.DelayedRegister;
import com.ultreon.craft.registry.Registries;
import com.ultreon.craft.registry.RegistrySupplier;

public class ModBlocks {
    private static final DelayedRegister<Block> REGISTER = DelayedRegister.create(ExampleMod.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = REGISTER.register("example_block", Block::new);

    public static void register() {
        REGISTER.register();
    }

    public static void registerModels() {
        BlockModelRegistry.registerDefault(EXAMPLE_BLOCK.get());
    }
}
