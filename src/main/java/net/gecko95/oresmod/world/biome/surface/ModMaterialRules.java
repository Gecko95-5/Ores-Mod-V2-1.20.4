package net.gecko95.oresmod.world.biome.surface;

import com.google.common.collect.ImmutableList;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final MaterialRules.MaterialRule AIR = makeStateRule(Blocks.AIR);
    private static final MaterialRules.MaterialRule WATER = makeStateRule(Blocks.WATER);
    private static final MaterialRules.MaterialRule ICE = makeStateRule(Blocks.ICE);
    private static final MaterialRules.MaterialRule PACKED_ICE = makeStateRule(Blocks.PACKED_ICE);
    private static final MaterialRules.MaterialRule SNOW_BLOCK = makeStateRule(Blocks.SNOW_BLOCK);
    private static final MaterialRules.MaterialRule POWDER_SNOW = makeStateRule(Blocks.POWDER_SNOW);
    private static final MaterialRules.MaterialRule MARBLE = makeStateRule(ModBlocks.MARBLE);
    private static final MaterialRules.MaterialRule WHITE_SAND = makeStateRule(ModBlocks.WHITE_SAND);
    private static final MaterialRules.MaterialRule WHITE_SANDSTONE = makeStateRule(ModBlocks.WHITE_SANDSTONE);
    private static final MaterialRules.MaterialRule BLACK_SAND = makeStateRule(ModBlocks.BLACK_SAND);
    private static final MaterialRules.MaterialRule BLACK_SANDSTONE = makeStateRule(ModBlocks.BLACK_SANDSTONE);
    private static final MaterialRules.MaterialRule DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final MaterialRules.MaterialRule BEDROCK = makeStateRule(Blocks.BEDROCK);
    public static MaterialRules.MaterialRule createModSurfaceRule() {
        return ModMaterialRules.makeRules(true, false, true);
    }
    public static MaterialRules.MaterialRule makeRules(boolean surface, boolean bedrockRoof, boolean bedrockFloor) {
        MaterialRules.MaterialRule whitesand = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, WHITE_SANDSTONE), WHITE_SAND);
        MaterialRules.MaterialRule blacksand = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, BLACK_SANDSTONE), BLACK_SAND);
        MaterialRules.MaterialCondition closetoWater = MaterialRules.water(-1, 0);
        MaterialRules.MaterialCondition mountainous = MaterialRules.water(0, 0);
        MaterialRules.MaterialRule powderSnow = MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.POWDER_SNOW, 0.35, 0.6), MaterialRules.condition(mountainous, POWDER_SNOW));
        MaterialRules.MaterialCondition hole = MaterialRules.hole();
        MaterialRules.MaterialCondition whitedunes = MaterialRules.biome(ModBiomes.WHITE_DUNES);
        MaterialRules.MaterialCondition blacksandbeach = MaterialRules.biome(ModBiomes.BLACK_SAND_BEACH);
        MaterialRules.MaterialRule biomeFloor = MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.QUARRY),
                MaterialRules.condition(ModMaterialRules.surfaceNoiseThreshold(0.5), COBBLESTONE)),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.SNOWY_QUARRY),
                MaterialRules.condition(ModMaterialRules.surfaceNoiseThreshold(1.0), COBBLESTONE)),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.WOODED_QUARRY),
                MaterialRules.condition(ModMaterialRules.surfaceNoiseThreshold(1.0), COBBLESTONE)),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.QUARRY_PEAKS),
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.CALCITE, -0.0125, 0.0125), MARBLE), COBBLESTONE)),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.FROZEN_QUARRY_PEAKS),
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.CALCITE, -0.0125, 0.0125), PACKED_ICE), COBBLESTONE)),
                MaterialRules.condition(blacksandbeach, blacksand),
                MaterialRules.condition(whitedunes, whitesand));
        MaterialRules.MaterialRule snowCoat = MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.SNOWY_QUARRY), MaterialRules.sequence(powderSnow, MaterialRules.condition(mountainous, SNOW_BLOCK))),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.FROZEN_QUARRY_PEAKS), MaterialRules.sequence(powderSnow, MaterialRules.condition(mountainous, SNOW_BLOCK))));
        MaterialRules.MaterialRule deepslateConnector = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR,
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, biomeFloor),
                        MaterialRules.condition(whitedunes, MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, WHITE_SANDSTONE)))),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.condition(closetoWater, MaterialRules.sequence(MaterialRules.condition(hole, MaterialRules.sequence(MaterialRules.condition(mountainous, AIR), MaterialRules.condition(MaterialRules.temperature(), ICE), WATER)),snowCoat))),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, biomeFloor),
                MaterialRules.condition(blacksandbeach, MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, BLACK_SANDSTONE)));

        ImmutableList.Builder builder = ImmutableList.builder();
        if (bedrockRoof) {
            builder.add(MaterialRules.condition(MaterialRules.not(MaterialRules.verticalGradient("bedrock_roof", YOffset.belowTop(5), YOffset.getTop())), BEDROCK));
        }
        if (bedrockFloor) {
            builder.add(MaterialRules.condition(MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)), BEDROCK));
        }
        MaterialRules.MaterialRule deepslate = MaterialRules.condition(MaterialRules.surface(), deepslateConnector);
        builder.add(surface ? deepslate : deepslateConnector);
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("deepslate", YOffset.fixed(0), YOffset.fixed(8)), DEEPSLATE));
        return MaterialRules.sequence((MaterialRules.MaterialRule[])builder.build().toArray(MaterialRules.MaterialRule[]::new));

    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
    private static MaterialRules.MaterialCondition surfaceNoiseThreshold(double min) {
        return MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, min / 8.25, Double.MAX_VALUE);
    }
}
