package com.example.craft.mod.init;

import com.example.craft.mod.ExampleMod;
import com.ultreon.craft.block.Block;
import com.ultreon.craft.item.BlockItem;
import com.ultreon.craft.item.Item;
import com.ultreon.craft.registry.DelayedRegister;
import com.ultreon.craft.registry.Registries;
import com.ultreon.craft.registry.RegistrySupplier;

public class ModItems {
    private static final DelayedRegister<Item> REGISTER = DelayedRegister.create(ExampleMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> EXAMPLE_BLOCK = REGISTER.register("example_block", () -> new BlockItem(new Item.Properties(), ModBlocks.EXAMPLE_BLOCK));

    public static void register() {
        REGISTER.register();
    }
}
