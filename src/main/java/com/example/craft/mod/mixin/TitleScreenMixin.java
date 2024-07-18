package com.example.craft.mod.mixin;

import com.example.craft.mod.ExampleMod;
import dev.ultreon.quantum.client.gui.GuiBuilder;
import dev.ultreon.quantum.client.gui.Screen;
import dev.ultreon.quantum.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen {
    public TitleScreenMixin(String title) {
        super(title);
    }

    @Inject(method = "build", at = @At("HEAD"))
    public void exampleMod$injectInit(GuiBuilder builder, CallbackInfo ci) {
        ExampleMod.LOGGER.info("Hello from TitleScreenMixin!");
    }
}
