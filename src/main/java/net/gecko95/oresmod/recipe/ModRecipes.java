package net.gecko95.oresmod.recipe;

import net.gecko95.oresmod.OresMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(OresMod.MOD_ID, CarvingRecipe.Serializer.ID),
                CarvingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(OresMod.MOD_ID, CarvingRecipe.Type.ID),
                CarvingRecipe.Type.INSTANCE);
    }
}
