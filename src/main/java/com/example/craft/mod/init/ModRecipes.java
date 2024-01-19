package com.example.craft.mod.init;

import com.ultreon.craft.item.ItemStack;
import com.ultreon.craft.item.Items;
import com.ultreon.craft.recipe.CraftingRecipe;
import com.ultreon.craft.recipe.RecipeManager;
import com.ultreon.craft.util.ElementID;

import java.util.List;

public class ModRecipes {
    public static void register() {
        RecipeManager.get().register(new ElementID("example_recipe"), new CraftingRecipe(
                List.of(new ItemStack(Items.ROCK, 4), new ItemStack(Items.PLANK, 2)),
                new ItemStack(ModItems.EXAMPLE_BLOCK.get(), 1)
        ));
    }
}
