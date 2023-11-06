package com.example.craft.mod.init;

import com.example.craft.mod.ExampleMod;
import com.ultreon.craft.block.Block;
import com.ultreon.craft.registry.Registries;
import com.ultreon.libs.registries.v0.DelayedRegister;
import com.ultreon.libs.registries.v0.RegistrySupplier;

public class ModBlocks {
    private static final DelayedRegister<Block> REGISTER = DelayedRegister.create(ExampleMod.MOD_ID, Registries.BLOCKS);

    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = REGISTER.register("example_block", Block::new);

    public static void register() {
        REGISTER.register();
    }
}
