package com.example.craft.mod;

import com.ultreon.craft.ModInit;
import com.ultreon.craft.entity.EntityType;
import com.ultreon.libs.commons.v0.Identifier;
import com.ultreon.libs.registries.v0.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class ExampleMod implements ModInit {
    public static final String MOD_ID = "example_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.class);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello, world!");
    }
}
