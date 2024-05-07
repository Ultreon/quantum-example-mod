package com.example.craft.mod;

import com.example.craft.mod.init.ModBlocks;
import dev.ultreon.quantum.ModInit;
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
    }
}
