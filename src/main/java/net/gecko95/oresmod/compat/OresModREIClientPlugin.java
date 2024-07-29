package net.gecko95.oresmod.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.gecko95.oresmod.recipe.CarvingRecipe;
import net.gecko95.oresmod.screen.CarvingScreen;

import static net.gecko95.oresmod.block.ModBlocks.CARVING_STATION;

public class OresModREIClientPlugin implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new CarvingCategory());

        registry.addWorkstations(CarvingCategory.CARVING, EntryStacks.of(CARVING_STATION));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(CarvingRecipe.class, CarvingRecipe.Type.INSTANCE,
                CarvingDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), CarvingScreen.class,
                CarvingCategory.CARVING);
    }
}
