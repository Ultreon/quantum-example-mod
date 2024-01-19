package com.example.craft.mod;

import com.example.craft.mod.init.ModBlocks;
import com.example.craft.mod.init.ModItems;
import com.example.craft.mod.init.ModRecipes;
import com.ultreon.craft.ModInit;
import com.ultreon.craft.client.events.ClientLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class ExampleMod implements ModInit {
    public static final String MOD_ID = "example_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.class);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello, world!");

        ModBlocks.register();
        ModItems.register();

        ClientLifecycleEvents.GAME_LOADED.listen(client -> ModRecipes.register());
        ClientLifecycleEvents.REGISTER_BLOCK_MODELS.listen(() -> {
            ModBlocks.registerModels();
        });
    }
}
