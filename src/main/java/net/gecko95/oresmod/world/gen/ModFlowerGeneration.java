package net.gecko95.oresmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko95.oresmod.util.ModTags;
import net.gecko95.oresmod.world.ModPlacedFeatures;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlower(){
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.FROSITE_COLD),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ICY_CROCUS_FLOWER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.IS_QUARRY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FLOWER_QUARRY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.IS_QUARRY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PATCH_SILVER_GRASS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_HILL),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FLOWER_WINDSWEPT_PLACED_KEY);
    }
}
