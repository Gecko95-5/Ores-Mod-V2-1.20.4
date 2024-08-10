package net.gecko95.oresmod.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.custom.*;
import net.gecko95.oresmod.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block SALT_ORE = registerBlock("salt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block SALT_BLOCK = registerBlock("salt_block",
            new Block(FabricBlockSettings.create()
                    .strength(1.0f, 3.0f).sounds(BlockSoundGroup.PACKED_MUD)
                    .mapColor(MapColor.IRON_GRAY)));
    public static final Block FROSITE_ORE = registerBlock("frosite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block ICE_FROSITE_ORE = registerBlock("ice_frosite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.IRON_ORE)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME).slipperiness(0.98f)
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block FROSITE_BLOCK = registerBlock("frosite_block",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME)));
    public static final Block FROSITE_BRICKS = registerBlock("frosite_bricks",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME)));
    public static final Block CUT_FROSITE = registerBlock("cut_frosite",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .mapColor(MapColor.PALE_PURPLE).instrument(Instrument.CHIME)));

    public static final Block CHISELED_FROSITE = registerBlock("chiseled_frosite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK)));

    public static final Block FROSITE_BRICK_STAIRS = registerBlock("frosite_brick_stairs",
            new StairsBlock(ModBlocks.FROSITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS)));
    public static final Block FROSITE_BRICK_SLAB = registerBlock("frosite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS)));
    public static final Block FROSITE_BRICK_WALL = registerBlock("frosite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS)));

    public static final Block CUT_FROSITE_STAIRS = registerBlock("cut_frosite_stairs",
            new StairsBlock(ModBlocks.CUT_FROSITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.CUT_FROSITE)));
    public static final Block CUT_FROSITE_SLAB = registerBlock("cut_frosite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_FROSITE)));
    public static final Block CUT_FROSITE_WALL = registerBlock("cut_frosite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_FROSITE)));

    public static final Block FROSITE_PRESSURE_PLATE = registerBlock("frosite_pressure_plate",
            new PressurePlateBlock(BlockSetType.GOLD,
                    FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK)));
    public static final Block FROSITE_BUTTON = registerBlock("frosite_button",
            new ButtonBlock(BlockSetType.GOLD, 20, FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK)));

    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2.5f, 2.5f)));
    public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.0f, 2.5f)));
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.IRON_XYLOPHONE)
                    .requiresTool().strength(4.0f, 5.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool().strength(4.0f, 5.0f)));

    public static final Block ALUMINUM_DOOR = registerBlock("aluminum_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).
                    requiresTool().strength(4.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ALUMINUM_TRAPDOOR = registerBlock("aluminum_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY).requiresTool()
                    .strength(4.0f).nonOpaque().allowsSpawning(Blocks::never)));
    public static final Block ALUMINUM_BARS = registerBlock("aluminum_bars",
            new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 5.0f)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block ALUMINUM_PRESSURE_PLATE = registerBlock("aluminum_pressure_plate",
            new WeightedPressurePlateBlock(75, BlockSetType.IRON,
                    FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)));

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.STONE_GRAY).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));
    public static final Block NICKEL_PRESSURE_PLATE = registerBlock("nickel_pressure_plate",
            new WeightedPressurePlateBlock(7, BlockSetType.IRON,
                    FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool()
                    .strength(25.0f, 600.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));

    public static final Block SMOOTH_STEEL_BLOCK = registerBlock("smooth_steel_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK)));
    public static final Block SMOOTH_STEEL_SLAB = registerBlock("smooth_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_STEEL_BLOCK)));

    public static final Block CUT_STEEL = registerBlock("cut_steel",
            new Block(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK)));
    public static final Block CUT_STEEL_STAIRS = registerBlock("cut_steel_stairs",
            new StairsBlock(ModBlocks.CUT_STEEL.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.CUT_STEEL)));
    public static final Block CUT_STEEL_SLAB = registerBlock("cut_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_STEEL)));

    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).
                    requiresTool().strength(25.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).requiresTool()
                    .strength(25.0f).nonOpaque().allowsSpawning(Blocks::never)));
    public static final Block STEEL_BARS = registerBlock("steel_bars",
            new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(25.0f, 600.0f)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new WeightedPressurePlateBlock(300, BlockSetType.IRON,
                    FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)));

    public static final Block STEEL_LAMP = registerBlock("steel_lamp",
            new Block(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK).luminance(state -> 15).solidBlock(Blocks::never)));

    public static final Block STONEBARK_LOG = registerBlock("stonebark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STONEBARK_WOOD = registerBlock("stonebark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STRIPPED_STONEBARK_LOG = registerBlock("stripped_stonebark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STRIPPED_STONEBARK_WOOD = registerBlock("stripped_stonebark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STONEBARK_PLANKS = registerBlock("stonebark_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block STONEBARK_LEAVES = registerBlock("stonebark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.LIGHT_BLUE_GRAY)));

    public static final Block DEEPSLATE_LOG = registerBlock("deepslate_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_WOOD = registerBlock("deepslate_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STRIPPED_DEEPSLATE_LOG = registerBlock("stripped_deepslate_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STRIPPED_DEEPSLATE_WOOD = registerBlock("stripped_deepslate_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block DEEPSLATE_PLANKS = registerBlock("deepslate_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(Instrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DEEPSLATE_LEAVES = registerBlock("deepslate_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.DARK_RED)));

    public static final Block STONEBARK_STAIRS = registerBlock("stonebark_stairs",
            new StairsBlock(ModBlocks.STONEBARK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_SLAB = registerBlock("stonebark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_FENCE = registerBlock("stonebark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_FENCE_GATE = registerBlock("stonebark_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_BUTTON = registerBlock("stonebark_button",
            new ButtonBlock(BlockSetType.STONE, 10,FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_PRESSURE_PLATE = registerBlock("stonebark_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS)));
    public static final Block STONEBARK_DOOR = registerBlock("stonebark_door",
            new DoorBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS).requiresTool()
                    .nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STONEBARK_TRAPDOOR = registerBlock("stonebark_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(ModBlocks.STONEBARK_PLANKS).requiresTool()
                    .nonOpaque().allowsSpawning(Blocks::never)));

    public static Identifier STONEBARK_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/stonebark");
    public static Identifier STONEBARK_HANDING_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/hanging/stonebark");
    public static Identifier STONEBARK_HANDING_GUI_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "textures/gui/hanging_signs/stonebark");

    public static final Block STANDING_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_standing_sign"), new TerraformSignBlock(STONEBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(Blocks.CRIMSON_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));
    public static final Block WALL_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_wall_sign"), new TerraformWallSignBlock(STONEBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(ModBlocks.STANDING_STONEBARK_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));
    public static final Block HANGING_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_hanging_sign"), new TerraformHangingSignBlock(STONEBARK_HANDING_SIGN_TEXTURE,
            STONEBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_HANGING_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));
    public static final Block WALL_HANGING_STONEBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "stonebark_wall_hanging_sign"), new TerraformWallHangingSignBlock(STONEBARK_HANDING_SIGN_TEXTURE,
            STONEBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.HANGING_STONEBARK_SIGN).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final BlockFamily STONEBARK_FAMILY = BlockFamilies.register(ModBlocks.STONEBARK_PLANKS)
            .sign(ModBlocks.STANDING_STONEBARK_SIGN, ModBlocks.WALL_STONEBARK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block DEEPBARK_STAIRS = registerBlock("deepbark_stairs",
            new StairsBlock(ModBlocks.DEEPSLATE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_SLAB = registerBlock("deepbark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_FENCE = registerBlock("deepbark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_FENCE_GATE = registerBlock("deepbark_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_BUTTON = registerBlock("deepbark_button",
            new ButtonBlock(BlockSetType.STONE, 10,FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_PRESSURE_PLATE = registerBlock("deepbark_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS)));
    public static final Block DEEPBARK_DOOR = registerBlock("deepbark_door",
            new DoorBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS).requiresTool()
                    .nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DEEPBARK_TRAPDOOR = registerBlock("deepbark_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_PLANKS).requiresTool()
                    .nonOpaque().allowsSpawning(Blocks::never)));
    public static Identifier DEEPBARK_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/deepbark");
    public static Identifier DEEPBARK_HANDING_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/hanging/deepbark");
    public static Identifier DEEPBARK_HANDING_GUI_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "textures/gui/hanging_signs/deepbark");
    public static final Block STANDING_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "deepbark_standing_sign"), new TerraformSignBlock(DEEPBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(Blocks.CRIMSON_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block WALL_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
                "deepbark_wall_sign"), new TerraformWallSignBlock(DEEPBARK_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(ModBlocks.STANDING_DEEPBARK_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block HANGING_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
                    "deepbark_hanging_sign"), new TerraformHangingSignBlock(DEEPBARK_HANDING_SIGN_TEXTURE,
            DEEPBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_HANGING_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block WALL_HANGING_DEEPBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "deepbark_wall_hanging_sign"), new TerraformWallHangingSignBlock(DEEPBARK_HANDING_SIGN_TEXTURE,
            DEEPBARK_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.HANGING_DEEPBARK_SIGN).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));

    public static final BlockFamily DEEPBARK_FAMILY = BlockFamilies.register(ModBlocks.DEEPSLATE_PLANKS)
            .sign(ModBlocks.STANDING_DEEPBARK_SIGN, ModBlocks.WALL_DEEPBARK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block STONEBARK_SAPLING = registerBlock("stonebark_sapling",
            new StonebarkSaplingBlock(ModSaplingGenerators.STONEBARK, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_STONEBARK_SAPLING = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_stonebark_sapling"), new FlowerPotBlock(STONEBARK_SAPLING,
            FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));


    public static final Block DEEPBARK_SAPLING = registerBlock("deepbark_sapling",
            new DeepbarkSaplingBlock(ModSaplingGenerators.DEEPBARK, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_DEEPBARK_SAPLING = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_deepbark_sapling"), new FlowerPotBlock(DEEPBARK_SAPLING,
            FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));
    public static final Block NETHER_TUNGSTEN_ORE = registerBlock("nether_tungsten_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 1),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block TITANIUM_ALLOY_BLOCK = registerBlock("titanium_alloy_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block NETHER_COBALT_ORE = registerBlock("nether_cobalt_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 1),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BLUE).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(Instrument.SNARE)
                    .requiresTool().strength(4.0f, 5.0f).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));

    public static final Block FAKE_BEDROCK = registerBlock("fake_bedrock",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool()
                    .strength(75.0f, 600.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_BEDROCK = registerBlock("cracked_bedrock",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool()
                    .strength(50.0f, 600.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_BEDROCK = registerBlock("polished_bedrock",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FAKE_BEDROCK)));
    public static final Block POLISHED_BEDROCK_STAIRS = registerBlock("polished_bedrock_stairs",
            new StairsBlock(ModBlocks.POLISHED_BEDROCK.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK)));
    public static final Block POLISHED_BEDROCK_SLAB = registerBlock("polished_bedrock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK)));
    public static final Block POLISHED_BEDROCK_WALL = registerBlock("polished_bedrock_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK)));
    public static final Block POLISHED_BEDROCK_BRICKS = registerBlock("polished_bedrock_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FAKE_BEDROCK)));
    public static final Block POLISHED_BEDROCK_BRICKS_STAIRS = registerBlock("polished_bedrock_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_BEDROCK_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_BRICKS)));
    public static final Block POLISHED_BEDROCK_BRICKS_SLAB = registerBlock("polished_bedrock_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_BRICKS)));
    public static final Block POLISHED_BEDROCK_BRICKS_WALL = registerBlock("polished_bedrock_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_BRICKS)));
    public static final Block CHISELED_POLISHED_BEDROCK = registerBlock("chiseled_polished_bedrock",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FAKE_BEDROCK)));

    public static final Block SANDITE_BLOCK = registerBlock("sandite_block",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.STONE)
                    .mapColor(MapColor.YELLOW).instrument(Instrument.SNARE)));

    public static final Block SANDITE_ORE = registerBlock("sandite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block SANDSTONE_SANDITE_ORE = registerBlock("sandstone_sandite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block RED_SANDSTONE_SANDITE_ORE = registerBlock("red_sandstone_sandite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block SANDITE_BRICKS = registerBlock("sandite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.SANDITE_BLOCK)));
    public static final Block CUT_SANDITE = registerBlock("cut_sandite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.SANDITE_BLOCK)));
    public static final Block CHISELED_SANDITE = registerBlock("chiseled_sandite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.SANDITE_BLOCK)));

    public static final Block SANDITE_BRICK_STAIRS = registerBlock("sandite_brick_stairs",
            new StairsBlock(ModBlocks.SANDITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.SANDITE_BRICKS)));
    public static final Block SANDITE_BRICK_SLAB = registerBlock("sandite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SANDITE_BRICKS)));
    public static final Block SANDITE_BRICK_WALL = registerBlock("sandite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.SANDITE_BRICKS)));

    public static final Block CUT_SANDITE_STAIRS = registerBlock("cut_sandite_stairs",
            new StairsBlock(ModBlocks.CUT_SANDITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.CUT_SANDITE)));
    public static final Block CUT_SANDITE_SLAB = registerBlock("cut_sandite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_SANDITE)));
    public static final Block CUT_SANDITE_WALL = registerBlock("cut_sandite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_SANDITE)));

    public static final Block LEAFITE_BLOCK = registerBlock("leafite_block",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.AZALEA_LEAVES)
                    .mapColor(MapColor.ORANGE).instrument(Instrument.GUITAR)));

    public static final Block LEAFITE_BRICKS = registerBlock("leafite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BLOCK)));
    public static final Block CUT_LEAFITE = registerBlock("cut_leafite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BLOCK)));
    public static final Block CHISELED_LEAFITE = registerBlock("chiseled_leafite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BLOCK)));

    public static final Block LEAFITE_BRICK_STAIRS = registerBlock("leafite_brick_stairs",
            new StairsBlock(ModBlocks.LEAFITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BRICKS)));
    public static final Block LEAFITE_BRICK_SLAB = registerBlock("leafite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BRICKS)));
    public static final Block LEAFITE_BRICK_WALL = registerBlock("leafite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BRICKS)));

    public static final Block CUT_LEAFITE_STAIRS = registerBlock("cut_leafite_stairs",
            new StairsBlock(ModBlocks.CUT_LEAFITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.CUT_LEAFITE)));
    public static final Block CUT_LEAFITE_SLAB = registerBlock("cut_leafite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_LEAFITE)));
    public static final Block CUT_LEAFITE_WALL = registerBlock("cut_leafite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_LEAFITE)));
    public static final Block LEAFITE_LOG = registerBlock("leafite_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).mapColor(MapColor.ORANGE)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f)));
    public static final Block LEAFITE_WOOD = registerBlock("leafite_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).mapColor(MapColor.ORANGE)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f)));
    public static final Block STRIPPED_LEAFITE_LOG = registerBlock("stripped_leafite_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_LOG).mapColor(MapColor.PALE_GREEN)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f)));
    public static final Block STRIPPED_LEAFITE_WOOD = registerBlock("stripped_leafite_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_WOOD).mapColor(MapColor.PALE_GREEN)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f)));

    public static final Block LEAFITE_PLANKS = registerBlock("leafite_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.PALE_GREEN)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f)));
    public static final Block LEAFITE_LEAVES = registerBlock("leafite_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).mapColor(MapColor.GREEN)));
    public static final Block LEAFITE_LEAVES_ORE = registerBlock("leafite_leaves_ore",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).mapColor(MapColor.GREEN)));

    public static final Block LEAFITE_PLANKS_STAIRS = registerBlock("leafite_planks_stairs",
            new StairsBlock(ModBlocks.LEAFITE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)));
    public static final Block LEAFITE_PLANKS_SLAB = registerBlock("leafite_planks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)));
    public static final Block LEAFITE_PLANKS_FENCE = registerBlock("leafite_planks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)));
    public static final Block LEAFITE_PLANKS_FENCE_GATE = registerBlock("leafite_planks_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)));
    public static final Block LEAFITE_PLANKS_BUTTON = registerBlock("leafite_planks_button",
            new ButtonBlock(BlockSetType.JUNGLE, 10,FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)));
    public static final Block LEAFITE_PLANKS_PRESSURE_PLATE = registerBlock("leafite_planks_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)));
    public static final Block LEAFITE_DOOR = registerBlock("leafite_door",
            new DoorBlock(BlockSetType.JUNGLE, FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)
                    .nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LEAFITE_TRAPDOOR = registerBlock("leafite_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, FabricBlockSettings.copyOf(ModBlocks.LEAFITE_PLANKS)
                    .nonOpaque().allowsSpawning(Blocks::never)));

    public static Identifier LEAFITE_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/leafite");
    public static Identifier LEAFITE_HANDING_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "entity/signs/hanging/leafite");
    public static Identifier LEAFITE_HANDING_GUI_SIGN_TEXTURE = new Identifier(OresMod.MOD_ID, "textures/gui/hanging_signs/leafite");
    public static final Block STANDING_LEAFITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "leafite_standing_sign"), new TerraformSignBlock(LEAFITE_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(Blocks.JUNGLE_SIGN)));
    public static final Block WALL_LEAFITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "leafite_wall_sign"), new TerraformWallSignBlock(LEAFITE_SIGN_TEXTURE,
            FabricBlockSettings.copyOf(Blocks.JUNGLE_WALL_SIGN)));
    public static final Block HANGING_LEAFITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "leafite_hanging_sign"), new TerraformHangingSignBlock(LEAFITE_HANDING_SIGN_TEXTURE,
            LEAFITE_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.JUNGLE_HANGING_SIGN)));
    public static final Block WALL_HANGING_LEAFITE_SIGN = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "leafite_wall_hanging_sign"), new TerraformWallHangingSignBlock(LEAFITE_HANDING_SIGN_TEXTURE,
            LEAFITE_HANDING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.JUNGLE_WALL_HANGING_SIGN)));

    public static final BlockFamily LEAFITE_FAMILY = BlockFamilies.register(ModBlocks.LEAFITE_PLANKS)
            .sign(ModBlocks.STANDING_LEAFITE_SIGN, ModBlocks.WALL_LEAFITE_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block LEAFITE_SAPLING = registerBlock("leafite_sapling",
            new SaplingBlock(ModSaplingGenerators.LEAFITE, FabricBlockSettings.copyOf(Blocks.JUNGLE_SAPLING)));
    public static final Block POTTED_LEAFITE_SAPLING = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_leafite_sapling"), new FlowerPotBlock(LEAFITE_SAPLING,
            FabricBlockSettings.copyOf(Blocks.POTTED_JUNGLE_SAPLING).nonOpaque()));

    public static final Block WHITE_SAND = registerBlock("white_sand",
            new ColoredFallingBlock(new ColorCode(16777215),FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.WHITE)));
    public static final Block SUSPICIOUS_WHITE_SAND = registerBlock("suspicious_white_sand",
            new ColoredFallingBlock(new ColorCode(16777215),FabricBlockSettings.copyOf(ModBlocks.WHITE_SAND)));
    public static final Block WHITE_SANDSTONE = registerBlock("white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.WHITE)));
    public static final Block WHITE_SANDSTONE_STAIRS = registerBlock("white_sandstone_stairs",
            new StairsBlock(ModBlocks.WHITE_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block WHITE_SANDSTONE_SLAB = registerBlock("white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block WHITE_SANDSTONE_WALL = registerBlock("white_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block WHITE_SANDSTONE_TEXTURE = registerBlock("white_sandstone_texture",
            new Block(FabricBlockSettings.copyOf(ModBlocks.WHITE_SANDSTONE)));
    public static final Block CUT_WHITE_SANDSTONE = registerBlock("cut_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.WHITE)));
    public static final Block CUT_WHITE_SANDSTONE_SLAB = registerBlock("cut_white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_WHITE_SANDSTONE)));
    public static final Block SMOOTH_WHITE_SANDSTONE = registerBlock("smooth_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.WHITE)));
    public static final Block SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock("smooth_white_sandstone_stairs",
            new StairsBlock(ModBlocks.SMOOTH_WHITE_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.SMOOTH_WHITE_SANDSTONE)));
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock("smooth_white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_WHITE_SANDSTONE)));
    public static final Block CHISELED_WHITE_SANDSTONE = registerBlock("chiseled_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.WHITE)));

    public static final Block BLACK_SAND = registerBlock("black_sand",
            new ColoredFallingBlock(new ColorCode(0),FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.BLACK)));
    public static final Block BLACK_SANDSTONE = registerBlock("black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.BLACK)));
    public static final Block BLACK_SANDSTONE_STAIRS = registerBlock("black_sandstone_stairs",
            new StairsBlock(ModBlocks.BLACK_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block BLACK_SANDSTONE_SLAB = registerBlock("black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block BLACK_SANDSTONE_WALL = registerBlock("black_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block BLACK_SANDSTONE_TEXTURE = registerBlock("black_sandstone_texture",
            new Block(FabricBlockSettings.copyOf(ModBlocks.BLACK_SANDSTONE)));
    public static final Block CUT_BLACK_SANDSTONE = registerBlock("cut_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.BLACK)));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = registerBlock("cut_black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_BLACK_SANDSTONE)));
    public static final Block SMOOTH_BLACK_SANDSTONE = registerBlock("smooth_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.BLACK)));
    public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = registerBlock("smooth_black_sandstone_stairs",
            new StairsBlock(ModBlocks.SMOOTH_BLACK_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.SMOOTH_BLACK_SANDSTONE)));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = registerBlock("smooth_black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_BLACK_SANDSTONE)));
    public static final Block CHISELED_BLACK_SANDSTONE = registerBlock("chiseled_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.BLACK)));

    public static final Block TERRACOTTA_GOLD_ORE = registerBlock("terracotta_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE).mapColor(MapColor.ORANGE)
                    .instrument(Instrument.BASEDRUM).strength(1.25f, 4.2f)));
    public static final Block GRAVEL_COAL_ORE = registerBlock("gravel_coal_ore",
            new ColoredFallingBlock(new ColorCode(-8356741),FabricBlockSettings.copyOf(Blocks.COAL_ORE).mapColor(MapColor.STONE_GRAY)
                    .instrument(Instrument.SNARE).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block DRIPSTONE_COPPER_ORE = registerBlock("dripstone_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE).mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 1.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(Instrument.BASEDRUM).strength(1.5f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block SCULK_DIAMOND_ORE = registerBlock("sculk_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.SCULK).strength(0.2f).requiresTool()));
    public static final Block CLAY_LAPIS_ORE = registerBlock("clay_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.CLAY).strength(0.6f).requiresTool()));

    public static final Block LAVA_TANK = registerBlock("lava_tank",
            new LavaTankBlock(FabricBlockSettings.copyOf(ModBlocks.TUNGSTEN_BLOCK).luminance(state -> 15).solidBlock(Blocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block WATER_TANK = registerBlock("water_tank",
            new Block(FabricBlockSettings.copyOf(ModBlocks.TUNGSTEN_BLOCK).nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block MILK_TANK = registerBlock("milk_tank",
            new MilkTankBlock(FabricBlockSettings.copyOf(ModBlocks.TUNGSTEN_BLOCK).sounds(BlockSoundGroup.GLASS)));

    public static final Block AWKWARD_WATER_TANK = registerBlock("awkward_water_tank",
            new Block(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));

    public static final Block HEALING_POTION_TANK = registerBlock("healing_potion_tank",
            new HealingPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block FIRE_RESISTANCE_POTION_TANK = registerBlock("fire_resistance_potion_tank",
            new FireResPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block REGENERATION_POTION_TANK = registerBlock("regeneration_potion_tank",
            new RegenerationPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block STRENGTH_POTION_TANK = registerBlock("strength_potion_tank",
            new StrengthPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block SWIFTNESS_POTION_TANK = registerBlock("swiftness_potion_tank",
            new SwiftnessPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block NIGHT_VISION_POTION_TANK = registerBlock("night_vision_potion_tank",
            new NightVisionPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block INVISIBILITY_POTION_TANK = registerBlock("invisibility_potion_tank",
            new InvisibilityPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block WATER_BREATHING_POTION_TANK = registerBlock("water_breathing_potion_tank",
            new WaterBreathingPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block LEAPING_POTION_TANK = registerBlock("leaping_potion_tank",
            new LeapingPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block SLOW_FALLING_POTION_TANK = registerBlock("slow_falling_potion_tank",
            new SlowFallingPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));

    public static final Block POISON_POTION_TANK = registerBlock("poison_potion_tank",
            new PoisonPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block WEAKNESS_POTION_TANK = registerBlock("weakness_potion_tank",
            new WeaknessPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block HARMING_POTION_TANK = registerBlock("harming_potion_tank",
            new HarmingPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block SLOWNESS_POTION_TANK = registerBlock("slowness_potion_tank",
            new SlownessPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));

    public static final Block TURTLE_MASTER_POTION_TANK = registerBlock("turtle_master_potion_tank",
            new TurtleMasterPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));

    public static final Block FROSTBITE_POTION_TANK = registerBlock("frostbite_potion_tank",
            new FrostbitePotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block HEAT_STROKE_POTION_TANK = registerBlock("heat_stroke_potion_tank",
            new HeatStrokePotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block FATAL_POISON_POTION_TANK = registerBlock("fatal_poison_potion_tank",
            new FatalPoisonPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));
    public static final Block VOID_SICKNESS_POTION_TANK = registerBlock("void_sickness_potion_tank",
            new VoidSicknessPotionTankBlock(FabricBlockSettings.copyOf(ModBlocks.WATER_TANK)));

    public static final Block COBBLESTONE_COAL_ORE = registerBlock("cobblestone_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block COBBLESTONE_IRON_ORE = registerBlock("cobblestone_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block COBBLESTONE_COPPER_ORE = registerBlock("cobblestone_copper_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block COBBLESTONE_GOLD_ORE = registerBlock("cobblestone_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block COBBLESTONE_REDSTONE_ORE = registerBlock("cobblestone_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));
    public static final Block COBBLESTONE_LAPIS_ORE = registerBlock("cobblestone_lapis_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.LAPIS_ORE)));
    public static final Block COBBLESTONE_DIAMOND_ORE = registerBlock("cobblestone_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block COBBLESTONE_EMERALD_ORE = registerBlock("cobblestone_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
    public static final Block COBBLESTONE_ALUMINUM_ORE = registerBlock("cobblestone_aluminum_ore",
            new Block(FabricBlockSettings.copyOf(ModBlocks.ALUMINUM_ORE)));
    public static final Block COBBLESTONE_NICKEL_ORE = registerBlock("cobblestone_nickel_ore",
            new Block(FabricBlockSettings.copyOf(ModBlocks.NICKEL_ORE)));
    public static final Block COBBLESTONE_TITANIUM_ORE = registerBlock("cobblestone_titanium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block COBBLESTONE_FROSITE_ORE = registerBlock("cobblestone_frosite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block COBBLESTONE_QUARTZ_ORE = registerBlock("cobblestone_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.COAL_ORE)));

    public static final Block MARBLE = registerBlock("marble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new StairsBlock(ModBlocks.MARBLE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.MARBLE)));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE)));
    public static final Block MARBLE_WALL = registerBlock("marble_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE)));
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.MARBLE)));
    public static final Block MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            new StairsBlock(ModBlocks.MARBLE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));
    public static final Block MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));
    public static final Block MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));
    public static final Block CHISELED_MARBLE = registerBlock("chiseled_marble",
            new Block(FabricBlockSettings.copyOf(ModBlocks.MARBLE)));
    public static final Block GILDED_MARBLE = registerBlock("gilded_marble",
            new Block(FabricBlockSettings.copyOf(ModBlocks.MARBLE).instrument(Instrument.CHIME)));
    public static final Block GILDED_MARBLE_BRICKS = registerBlock("gilded_marble_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS).instrument(Instrument.CHIME)));
    public static final Block SMOOTH_MARBLE = registerBlock("smooth_marble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block SMOOTH_MARBLE_SLAB = registerBlock("smooth_marble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SMOOTH_MARBLE)));

    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_BRICKS)));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_BRICKS)));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_BRICKS)));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_DIORITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_BRICKS)));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_BRICKS)));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_BRICKS)));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRANITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_BRICKS)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_BRICKS)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_BRICKS)));

    public static final Block FLINT_SPIKES = registerBlock("flint_spikes",
            new FlintSpikeBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.BLACK).nonOpaque().strength(1.0f, 3.0f)));
    public static final Block IRON_SPIKES = registerBlock("iron_spikes",
            new IronSpikeBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().strength(1.0f, 3.0f)));
    public static final Block ALUMINUM_SPIKES = registerBlock("aluminum_spikes",
            new IronSpikeBlock(FabricBlockSettings.copyOf(ModBlocks.ALUMINUM_BLOCK).nonOpaque().strength(1.0f, 3.0f)));
    public static final Block STEEL_SPIKES = registerBlock("steel_spikes",
            new SteelSpikeBlock(FabricBlockSettings.copyOf(ModBlocks.STEEL_BLOCK).nonOpaque().strength(1.0f, 3.0f)));

    public static final Block SILVER_CROWN = registerBlock("silver_crown",
            new SilverCrownBlock(FabricBlockSettings.create()
                    .breakInstantly().sounds(BlockSoundGroup.COPPER)
                    .mapColor(MapColor.CLEAR).nonOpaque()));

    public static final Block SILVER_SCALES = registerBlock("silver_scales",
            new Block(FabricBlockSettings.create()
                    .sounds(BlockSoundGroup.COPPER)
                    .mapColor(MapColor.WHITE_GRAY).requiresTool().strength(1.5f, 6.0f)));
    public static final Block FOSSILIZED_SILVER_SCALES = registerBlock("fossilized_silver_scales",
            new Block(FabricBlockSettings.copyOf(ModBlocks.SILVER_SCALES)
                    .sounds(BlockSoundGroup.BONE)
                    .mapColor(MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f)));

    public static final Block SILVER_SCALE_CORE = registerBlock("silver_scale_core",
            new PillarBlock(FabricBlockSettings.create()
                    .sounds(BlockSoundGroup.COPPER)
                    .mapColor(MapColor.WHITE_GRAY).requiresTool().strength(1.5f, 6.0f)));
    public static final Block FOSSILIZED_SILVER_SCALE_CORE = registerBlock("fossilized_silver_scale_core",
            new PillarBlock(FabricBlockSettings.create()
                    .sounds(BlockSoundGroup.BONE)
                    .mapColor(MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f)));
    public static final Block SILVER_SCALE_FACE = registerBlock("silver_scale_face",
            new PillarBlock(FabricBlockSettings.create()
                    .sounds(BlockSoundGroup.COPPER)
                    .mapColor(MapColor.WHITE_GRAY).requiresTool().strength(1.5f, 6.0f)));
    public static final Block FOSSILIZED_SILVER_SCALE_FACE = registerBlock("fossilized_silver_scale_face",
            new PillarBlock(FabricBlockSettings.copyOf(ModBlocks.SILVER_SCALE_FACE)
                    .sounds(BlockSoundGroup.BONE)
                    .mapColor(MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f)));

    public static final Block ENDER_DRAGON_TROPHY = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "ender_dragon_trophy"),
            new TrophyBlock(FabricBlockSettings.create()
                    .breakInstantly().sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.CLEAR).nonOpaque()));
    public static final Block WITHER_TROPHY = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "wither_trophy"),
            new TrophyBlock(FabricBlockSettings.create()
                    .breakInstantly().sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.CLEAR).nonOpaque()));
    public static final Block ELDER_GUARDIAN_TROPHY  = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "elder_guardian_trophy"),
            new TrophyBlock(FabricBlockSettings.create()
                    .breakInstantly().sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.CLEAR).nonOpaque()));
    public static final Block WARDEN_TROPHY  = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "warden_trophy"),
            new TrophyBlock(FabricBlockSettings.create()
                    .breakInstantly().sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.CLEAR).nonOpaque()));
    public static final Block SILVERWYRM_TROPHY  = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "silverwyrm_trophy"),
            new TrophyBlock(FabricBlockSettings.create()
                    .breakInstantly().sounds(BlockSoundGroup.METAL)
                    .mapColor(MapColor.CLEAR).nonOpaque()));

    public static final Block LIGHTY_RUSTED_STEEL_BLOCK = registerBlock("lighty_rusted_steel_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool()
                    .strength(12.5f, 300.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block LIGHTY_RUSTED_STEEL_SLAB = registerBlock("lighty_rusted_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)));
    public static final Block LIGHTY_RUSTED_CUT_STEEL = registerBlock("lighty_rusted_cut_steel",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool()
                    .strength(12.5f, 300.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block LIGHTY_RUSTED_CUT_STEEL_STAIRS = registerBlock("lighty_rusted_cut_steel_stairs",
            new StairsBlock(ModBlocks.LIGHTY_RUSTED_CUT_STEEL.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHTY_RUSTED_CUT_STEEL)));
    public static final Block LIGHTY_RUSTED_CUT_STEEL_SLAB = registerBlock("lighty_rusted_cut_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHTY_RUSTED_CUT_STEEL)));


    public static final Block RUSTED_STEEL_BLOCK = registerBlock("rusted_steel_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool()
                    .strength(6.25f, 150.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block RUSTED_STEEL_SLAB = registerBlock("rusted_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.RUSTED_STEEL_BLOCK)));
    public static final Block RUSTED_CUT_STEEL = registerBlock("rusted_cut_steel",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool()
                    .strength(6.25f, 150.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block RUSTED_CUT_STEEL_STAIRS = registerBlock("rusted_cut_steel_stairs",
            new StairsBlock(ModBlocks.RUSTED_CUT_STEEL.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.RUSTED_CUT_STEEL)));
    public static final Block RUSTED_CUT_STEEL_SLAB = registerBlock("rusted_cut_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.RUSTED_CUT_STEEL)));

    public static final Block LIGHTY_RUSTED_STEEL_DOOR = registerBlock("lighty_rusted_steel_door",
            new DoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).
                    requiresTool().strength(12.5f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHTY_RUSTED_STEEL_TRAPDOOR = registerBlock("lighty_rusted_steel_trapdoor",
            new TrapdoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool()
                    .strength(12.5f).nonOpaque().allowsSpawning(Blocks::never)));

    public static final Block RUSTED_STEEL_DOOR = registerBlock("rusted_steel_door",
            new DoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).
                    requiresTool().strength(6.25f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RUSTED_STEEL_TRAPDOOR = registerBlock("rusted_steel_trapdoor",
            new TrapdoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_ORANGE).requiresTool()
                    .strength(6.25f).nonOpaque().allowsSpawning(Blocks::never)));

    public static final Block LIGHTY_RUSTED_STEEL_BARS = registerBlock("lighty_rusted_steel_bars",
            new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(12.5f, 300.0f)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block RUSTED_STEEL_BARS = registerBlock("rusted_steel_bars",
            new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(6.25f, 150.0f)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block LIGHTY_RUSTED_STEEL_LAMP = registerBlock("lighty_rusted_steel_lamp",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK).luminance(state -> 7).solidBlock(Blocks::never)));
    public static final Block RUSTED_STEEL_LAMP = registerBlock("rusted_steel_lamp",
            new Block(FabricBlockSettings.copyOf(ModBlocks.RUSTED_STEEL_BLOCK).luminance(state -> 3).solidBlock(Blocks::never)));

    public static final Block VOID_STONE = registerBlock("void_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).mapColor(MapColor.DEEPSLATE_GRAY)));

    public static final Block VOID_STONE_BRICKS = registerBlock("void_stone_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.MARBLE)));
    public static final Block VOID_STONE_BRICK_STAIRS = registerBlock("void_stone_brick_stairs",
            new StairsBlock(ModBlocks.MARBLE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));
    public static final Block VOID_STONE_BRICK_SLAB = registerBlock("void_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));
    public static final Block VOID_STONE_BRICK_WALL = registerBlock("void_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.XYLOPHONE)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block PLATINUM_CLUSTER_ORE = registerBlock("platinum_cluster_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool()));

    public static final Block END_ITE_ORE = registerBlock("end_ite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    FabricBlockSettings.copyOf(Blocks.IRON_ORE).mapColor(MapColor.PALE_YELLOW)));

    public static final Block END_ITE_BLOCK = registerBlock("end_ite_block",
            new Block(FabricBlockSettings.create()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .mapColor(MapColor.PURPLE).instrument(Instrument.CHIME)));

    public static final Block END_ITE_BRICKS = registerBlock("end_ite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BLOCK)));
    public static final Block CUT_END_ITE = registerBlock("cut_end_ite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BLOCK)));
    public static final Block CHISELED_END_ITE = registerBlock("chiseled_end_ite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BLOCK)));

    public static final Block END_ITE_BRICK_STAIRS = registerBlock("end_ite_brick_stairs",
            new StairsBlock(ModBlocks.END_ITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.END_ITE_BRICKS)));
    public static final Block END_ITE_BRICK_SLAB = registerBlock("end_ite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BRICKS)));
    public static final Block END_ITE_BRICK_WALL = registerBlock("end_ite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BRICKS)));

    public static final Block CUT_END_ITE_STAIRS = registerBlock("cut_end_ite_stairs",
            new StairsBlock(ModBlocks.CUT_END_ITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.CUT_END_ITE)));
    public static final Block CUT_END_ITE_SLAB = registerBlock("cut_end_ite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_END_ITE)));
    public static final Block CUT_END_ITE_WALL = registerBlock("cut_end_ite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.CUT_END_ITE)));

    public static final Block LIGHT_FROSITE_BLOCK = registerBlock("light_frosite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block DARK_FROSITE_BLOCK = registerBlock("dark_frosite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block LIGHT_SANDITE_BLOCK = registerBlock("light_sandite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK).mapColor(MapColor.PALE_YELLOW)));
    public static final Block DARK_SANDITE_BLOCK = registerBlock("dark_sandite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block LIGHT_LEAFITE_BLOCK = registerBlock("light_leafite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block DARK_LEAFITE_BLOCK = registerBlock("dark_leafite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BLOCK).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block LIGHT_END_ITE_BLOCK = registerBlock("light_end_ite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BLOCK).mapColor(MapColor.PALE_PURPLE)));
    public static final Block DARK_END_ITE_BLOCK = registerBlock("dark_end_ite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.END_ITE_BLOCK).mapColor(MapColor.TERRACOTTA_PURPLE)));

    public static final Block LIGHT_FROSITE_BRICKS = registerBlock("light_frosite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block DARK_FROSITE_BRICKS = registerBlock("dark_frosite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BRICKS).mapColor(MapColor.TERRACOTTA_BLUE)));

    public static final Block LIGHT_CUT_FROSITE = registerBlock("light_cut_frosite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.CUT_FROSITE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block DARK_CUT_FROSITE = registerBlock("dark_cut_frosite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.CUT_FROSITE).mapColor(MapColor.TERRACOTTA_BLUE)));

    public static final Block LIGHT_FROSITE_BRICK_STAIRS = registerBlock("light_frosite_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_FROSITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_FROSITE_BRICKS)));
    public static final Block LIGHT_FROSITE_BRICK_SLAB = registerBlock("light_frosite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_FROSITE_BRICKS)));
    public static final Block LIGHT_FROSITE_BRICK_WALL = registerBlock("light_frosite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_FROSITE_BRICKS)));
    public static final Block DARK_FROSITE_BRICK_STAIRS = registerBlock("dark_frosite_brick_stairs",
            new StairsBlock(ModBlocks.DARK_FROSITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_FROSITE_BRICKS)));
    public static final Block DARK_FROSITE_BRICK_SLAB = registerBlock("dark_frosite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_FROSITE_BRICKS)));
    public static final Block DARK_FROSITE_BRICK_WALL = registerBlock("dark_frosite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_FROSITE_BRICKS)));

    public static final Block LIGHT_CUT_FROSITE_STAIRS = registerBlock("light_cut_frosite_stairs",
            new StairsBlock(ModBlocks.LIGHT_CUT_FROSITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_FROSITE)));
    public static final Block LIGHT_CUT_FROSITE_SLAB = registerBlock("light_cut_frosite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_FROSITE)));
    public static final Block LIGHT_CUT_FROSITE_WALL = registerBlock("light_cut_frosite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_FROSITE)));
    public static final Block DARK_CUT_FROSITE_STAIRS = registerBlock("dark_cut_frosite_stairs",
            new StairsBlock(ModBlocks.DARK_CUT_FROSITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_FROSITE)));
    public static final Block DARK_CUT_FROSITE_SLAB = registerBlock("dark_cut_frosite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_FROSITE)));
    public static final Block DARK_CUT_FROSITE_WALL = registerBlock("dark_cut_frosite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_FROSITE)));

    public static final Block LIGHT_FROSITE_PRESSURE_PLATE = registerBlock("light_frosite_pressure_plate",
            new PressurePlateBlock(BlockSetType.GOLD, FabricBlockSettings.copyOf(ModBlocks.LIGHT_FROSITE_BLOCK)));
    public static final Block LIGHT_FROSITE_BUTTON = registerBlock("light_frosite_button",
            new ButtonBlock(BlockSetType.GOLD, 20,FabricBlockSettings.copyOf(ModBlocks.LIGHT_FROSITE_BLOCK)));
    public static final Block DARK_FROSITE_PRESSURE_PLATE = registerBlock("dark_frosite_pressure_plate",
            new PressurePlateBlock(BlockSetType.GOLD, FabricBlockSettings.copyOf(ModBlocks.DARK_FROSITE_BLOCK)));
    public static final Block DARK_FROSITE_BUTTON = registerBlock("dark_frosite_button",
            new ButtonBlock(BlockSetType.GOLD, 20,FabricBlockSettings.copyOf(ModBlocks.DARK_FROSITE_BLOCK)));

    public static final Block LIGHT_SANDITE_BRICKS = registerBlock("light_sandite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LIGHT_SANDITE_BLOCK)));
    public static final Block DARK_SANDITE_BRICKS = registerBlock("dark_sandite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.DARK_SANDITE_BLOCK)));

    public static final Block LIGHT_CUT_SANDITE = registerBlock("light_cut_sandite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LIGHT_SANDITE_BLOCK)));
    public static final Block DARK_CUT_SANDITE = registerBlock("dark_cut_sandite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.DARK_SANDITE_BLOCK)));

    public static final Block LIGHT_SANDITE_BRICK_STAIRS = registerBlock("light_sandite_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_SANDITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_SANDITE_BRICKS)));
    public static final Block LIGHT_SANDITE_BRICK_SLAB = registerBlock("light_sandite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_SANDITE_BRICKS)));
    public static final Block LIGHT_SANDITE_BRICK_WALL = registerBlock("light_sandite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_SANDITE_BRICKS)));
    public static final Block DARK_SANDITE_BRICK_STAIRS = registerBlock("dark_sandite_brick_stairs",
            new StairsBlock(ModBlocks.DARK_SANDITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_SANDITE_BRICKS)));
    public static final Block DARK_SANDITE_BRICK_SLAB = registerBlock("dark_sandite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_SANDITE_BRICKS)));
    public static final Block DARK_SANDITE_BRICK_WALL = registerBlock("dark_sandite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_SANDITE_BRICKS)));

    public static final Block LIGHT_CUT_SANDITE_STAIRS = registerBlock("light_cut_sandite_stairs",
            new StairsBlock(ModBlocks.LIGHT_CUT_SANDITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_SANDITE)));
    public static final Block LIGHT_CUT_SANDITE_SLAB = registerBlock("light_cut_sandite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_SANDITE)));
    public static final Block LIGHT_CUT_SANDITE_WALL = registerBlock("light_cut_sandite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_SANDITE)));
    public static final Block DARK_CUT_SANDITE_STAIRS = registerBlock("dark_cut_sandite_stairs",
            new StairsBlock(ModBlocks.DARK_CUT_SANDITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_SANDITE)));
    public static final Block DARK_CUT_SANDITE_SLAB = registerBlock("dark_cut_sandite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_SANDITE)));
    public static final Block DARK_CUT_SANDITE_WALL = registerBlock("dark_cut_sandite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_SANDITE)));

    public static final Block LIGHT_LEAFITE_BRICKS = registerBlock("light_leafite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BRICKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block DARK_LEAFITE_BRICKS = registerBlock("dark_leafite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LEAFITE_BRICKS).mapColor(MapColor.TERRACOTTA_BLUE)));

    public static final Block LIGHT_CUT_LEAFITE = registerBlock("light_cut_leafite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.CUT_LEAFITE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block DARK_CUT_LEAFITE = registerBlock("dark_cut_leafite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.CUT_LEAFITE).mapColor(MapColor.TERRACOTTA_BLUE)));

    public static final Block LIGHT_LEAFITE_BRICK_STAIRS = registerBlock("light_leafite_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_LEAFITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_LEAFITE_BRICKS)));
    public static final Block LIGHT_LEAFITE_BRICK_SLAB = registerBlock("light_leafite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_LEAFITE_BRICKS)));
    public static final Block LIGHT_LEAFITE_BRICK_WALL = registerBlock("light_leafite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_LEAFITE_BRICKS)));
    public static final Block DARK_LEAFITE_BRICK_STAIRS = registerBlock("dark_leafite_brick_stairs",
            new StairsBlock(ModBlocks.DARK_LEAFITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_LEAFITE_BRICKS)));
    public static final Block DARK_LEAFITE_BRICK_SLAB = registerBlock("dark_leafite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_LEAFITE_BRICKS)));
    public static final Block DARK_LEAFITE_BRICK_WALL = registerBlock("dark_leafite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_LEAFITE_BRICKS)));

    public static final Block LIGHT_CUT_LEAFITE_STAIRS = registerBlock("light_cut_leafite_stairs",
            new StairsBlock(ModBlocks.LIGHT_CUT_LEAFITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_LEAFITE)));
    public static final Block LIGHT_CUT_LEAFITE_SLAB = registerBlock("light_cut_leafite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_LEAFITE)));
    public static final Block LIGHT_CUT_LEAFITE_WALL = registerBlock("light_cut_leafite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_LEAFITE)));
    public static final Block DARK_CUT_LEAFITE_STAIRS = registerBlock("dark_cut_leafite_stairs",
            new StairsBlock(ModBlocks.DARK_CUT_LEAFITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_LEAFITE)));
    public static final Block DARK_CUT_LEAFITE_SLAB = registerBlock("dark_cut_leafite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_LEAFITE)));
    public static final Block DARK_CUT_LEAFITE_WALL = registerBlock("dark_cut_leafite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_LEAFITE)));

    public static final Block LIGHT_END_ITE_BRICKS = registerBlock("light_end_ite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LIGHT_END_ITE_BLOCK)));
    public static final Block DARK_END_ITE_BRICKS = registerBlock("dark_end_ite_bricks",
            new Block(FabricBlockSettings.copyOf(ModBlocks.DARK_END_ITE_BLOCK)));

    public static final Block LIGHT_CUT_END_ITE = registerBlock("light_cut_end_ite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LIGHT_END_ITE_BLOCK)));
    public static final Block DARK_CUT_END_ITE = registerBlock("dark_cut_end_ite",
            new Block(FabricBlockSettings.copyOf(ModBlocks.DARK_END_ITE_BLOCK)));

    public static final Block LIGHT_END_ITE_BRICK_STAIRS = registerBlock("light_end_ite_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_END_ITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_END_ITE_BRICKS)));
    public static final Block LIGHT_END_ITE_BRICK_SLAB = registerBlock("light_end_ite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_END_ITE_BRICKS)));
    public static final Block LIGHT_END_ITE_BRICK_WALL = registerBlock("light_end_ite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_END_ITE_BRICKS)));
    public static final Block DARK_END_ITE_BRICK_STAIRS = registerBlock("dark_end_ite_brick_stairs",
            new StairsBlock(ModBlocks.DARK_END_ITE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_END_ITE_BRICKS)));
    public static final Block DARK_END_ITE_BRICK_SLAB = registerBlock("dark_end_ite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_END_ITE_BRICKS)));
    public static final Block DARK_END_ITE_BRICK_WALL = registerBlock("dark_end_ite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_END_ITE_BRICKS)));

    public static final Block LIGHT_CUT_END_ITE_STAIRS = registerBlock("light_cut_end_ite_stairs",
            new StairsBlock(ModBlocks.LIGHT_CUT_END_ITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_END_ITE)));
    public static final Block LIGHT_CUT_END_ITE_SLAB = registerBlock("light_cut_end_ite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_END_ITE)));
    public static final Block LIGHT_CUT_END_ITE_WALL = registerBlock("light_cut_end_ite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.LIGHT_CUT_END_ITE)));
    public static final Block DARK_CUT_END_ITE_STAIRS = registerBlock("dark_cut_end_ite_stairs",
            new StairsBlock(ModBlocks.DARK_CUT_END_ITE.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_END_ITE)));
    public static final Block DARK_CUT_END_ITE_SLAB = registerBlock("dark_cut_end_ite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_END_ITE)));
    public static final Block DARK_CUT_END_ITE_WALL = registerBlock("dark_cut_end_ite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DARK_CUT_END_ITE)));

    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new StairsBlock(ModBlocks.ICE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.ICE_BRICKS)));
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.ICE_BRICKS)));
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.ICE_BRICKS)));
    public static final Block ICE_PILLAR = registerBlock("ice_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)));

    public static final Block ICY_CROCUS = registerBlock("icy_crocus",
            new FlowerBlock(StatusEffects.SLOWNESS,12, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_ICY_CROCUS = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_icy_crocus"), new FlowerPotBlock(ICY_CROCUS,
            FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block SILVER_ROSE = registerBlock("silver_rose",
            new SilverFlowerBlock(StatusEffects.STRENGTH,9, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_SILVER_ROSE = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_silver_rose"), new FlowerPotBlock(SILVER_ROSE,
            FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block SUBALPINE_DAISY = registerBlock("subalpine_daisy",
            new FlowerBlock(StatusEffects.REGENERATION,12, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_SUBALPINE_DAISY = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_subalpine_daisy"), new FlowerPotBlock(SUBALPINE_DAISY,
            FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block ALPINE_SPEEDWELL = registerBlock("alpine_speedwell",
            new FlowerBlock(StatusEffects.SPEED,9, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_ALPINE_SPEEDWELL = Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID,
            "potted_alpine_speedwell"), new FlowerPotBlock(ALPINE_SPEEDWELL,
            FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block SILVER_GRASS = registerBlock("silver_grass",
            new StonePlantBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block REINFORCED_FROSITE_BLOCK = registerBlock("reinforced_frosite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.FROSITE_BLOCK).strength(50.0f, 1200.0f)));
    public static final Block LIGHT_REINFORCED_FROSITE_BLOCK = registerBlock("light_reinforced_frosite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.LIGHT_FROSITE_BLOCK).strength(50.0f, 1200.0f)));
    public static final Block DARK_REINFORCED_FROSITE_BLOCK = registerBlock("dark_reinforced_frosite_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.DARK_FROSITE_BLOCK).strength(50.0f, 1200.0f)));

    public static final Block CARVING_STATION = registerBlock("carving_station",
            new CarvingStationBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block STONE_MASONRY_BRICKS = registerBlock("stone_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_MASONRY_BRICK_STAIRS = registerBlock("stone_masonry_brick_stairs",
            new StairsBlock(ModBlocks.STONE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.STONE_MASONRY_BRICKS)));
    public static final Block STONE_MASONRY_BRICK_SLAB = registerBlock("stone_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_MASONRY_BRICKS)));
    public static final Block STONE_MASONRY_BRICK_WALL = registerBlock("stone_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.STONE_MASONRY_BRICKS)));

    public static final Block NETHER_MASONRY_BRICKS = registerBlock("nether_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_MASONRY_BRICK_STAIRS = registerBlock("nether_masonry_brick_stairs",
            new StairsBlock(ModBlocks.NETHER_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.NETHER_MASONRY_BRICKS)));
    public static final Block NETHER_MASONRY_BRICK_SLAB = registerBlock("nether_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.NETHER_MASONRY_BRICKS)));
    public static final Block NETHER_MASONRY_BRICK_WALL = registerBlock("nether_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.NETHER_MASONRY_BRICKS)));

    public static final Block PRISMARINE_MASONRY_BRICKS = registerBlock("prismarine_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_MASONRY_BRICK_STAIRS = registerBlock("prismarine_masonry_brick_stairs",
            new StairsBlock(ModBlocks.PRISMARINE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.PRISMARINE_MASONRY_BRICKS)));
    public static final Block PRISMARINE_MASONRY_BRICK_SLAB = registerBlock("prismarine_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.PRISMARINE_MASONRY_BRICKS)));
    public static final Block PRISMARINE_MASONRY_BRICK_WALL = registerBlock("prismarine_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.PRISMARINE_MASONRY_BRICKS)));

    public static final Block END_STONE_MASONRY_BRICKS = registerBlock("end_stone_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_MASONRY_BRICK_STAIRS = registerBlock("end_stone_masonry_brick_stairs",
            new StairsBlock(ModBlocks.END_STONE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.END_STONE_MASONRY_BRICKS)));
    public static final Block END_STONE_MASONRY_BRICK_SLAB = registerBlock("end_stone_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.END_STONE_MASONRY_BRICKS)));
    public static final Block END_STONE_MASONRY_BRICK_WALL = registerBlock("end_stone_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.END_STONE_MASONRY_BRICKS)));

    public static final Block RED_NETHER_MASONRY_BRICKS = registerBlock("red_nether_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_MASONRY_BRICK_STAIRS = registerBlock("red_nether_masonry_brick_stairs",
            new StairsBlock(ModBlocks.RED_NETHER_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.RED_NETHER_MASONRY_BRICKS)));
    public static final Block RED_NETHER_MASONRY_BRICK_SLAB = registerBlock("red_nether_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.RED_NETHER_MASONRY_BRICKS)));
    public static final Block RED_NETHER_MASONRY_BRICK_WALL = registerBlock("red_nether_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.RED_NETHER_MASONRY_BRICKS)));

    public static final Block POLISHED_BLACKSTONE_MASONRY_BRICKS = registerBlock("polished_blackstone_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_MASONRY_BRICK_STAIRS = registerBlock("polished_blackstone_masonry_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_MASONRY_BRICK_SLAB = registerBlock("polished_blackstone_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_MASONRY_BRICK_WALL = registerBlock("polished_blackstone_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BLACKSTONE_MASONRY_BRICKS)));

    public static final Block QUARTZ_MASONRY_BRICKS = registerBlock("quartz_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_MASONRY_BRICK_STAIRS = registerBlock("quartz_masonry_brick_stairs",
            new StairsBlock(ModBlocks.QUARTZ_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.QUARTZ_MASONRY_BRICKS)));
    public static final Block QUARTZ_MASONRY_BRICK_SLAB = registerBlock("quartz_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.QUARTZ_MASONRY_BRICKS)));
    public static final Block QUARTZ_MASONRY_BRICK_WALL = registerBlock("quartz_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.QUARTZ_MASONRY_BRICKS)));

    public static final Block DEEPSLATE_MASONRY_BRICKS = registerBlock("deepslate_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_MASONRY_BRICK_STAIRS = registerBlock("deepslate_masonry_brick_stairs",
            new StairsBlock(ModBlocks.DEEPSLATE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_MASONRY_BRICKS)));
    public static final Block DEEPSLATE_MASONRY_BRICK_SLAB = registerBlock("deepslate_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_MASONRY_BRICKS)));
    public static final Block DEEPSLATE_MASONRY_BRICK_WALL = registerBlock("deepslate_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.DEEPSLATE_MASONRY_BRICKS)));

    public static final Block MUD_MASONRY_BRICKS = registerBlock("mud_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_MASONRY_BRICK_STAIRS = registerBlock("mud_masonry_brick_stairs",
            new StairsBlock(ModBlocks.MUD_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.MUD_MASONRY_BRICKS)));
    public static final Block MUD_MASONRY_BRICK_SLAB = registerBlock("mud_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.MUD_MASONRY_BRICKS)));
    public static final Block MUD_MASONRY_BRICK_WALL = registerBlock("mud_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.MUD_MASONRY_BRICKS)));

    public static final Block MARBLE_MASONRY_BRICKS = registerBlock("marble_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_BRICKS)));
    public static final Block MARBLE_MASONRY_BRICK_STAIRS = registerBlock("marble_masonry_brick_stairs",
            new StairsBlock(ModBlocks.MARBLE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.MARBLE_MASONRY_BRICKS)));
    public static final Block MARBLE_MASONRY_BRICK_SLAB = registerBlock("marble_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_MASONRY_BRICKS)));
    public static final Block MARBLE_MASONRY_BRICK_WALL = registerBlock("marble_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.MARBLE_MASONRY_BRICKS)));

    public static final Block POLISHED_ANDESITE_MASONRY_BRICKS = registerBlock("polished_andesite_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_BRICKS)));
    public static final Block POLISHED_ANDESITE_MASONRY_BRICK_STAIRS = registerBlock("polished_andesite_masonry_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICKS)));
    public static final Block POLISHED_ANDESITE_MASONRY_BRICK_SLAB = registerBlock("polished_andesite_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICKS)));
    public static final Block POLISHED_ANDESITE_MASONRY_BRICK_WALL = registerBlock("polished_andesite_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_ANDESITE_MASONRY_BRICKS)));

    public static final Block POLISHED_DIORITE_MASONRY_BRICKS = registerBlock("polished_diorite_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_BRICKS)));
    public static final Block POLISHED_DIORITE_MASONRY_BRICK_STAIRS = registerBlock("polished_diorite_masonry_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_DIORITE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_MASONRY_BRICKS)));
    public static final Block POLISHED_DIORITE_MASONRY_BRICK_SLAB = registerBlock("polished_diorite_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_MASONRY_BRICKS)));
    public static final Block POLISHED_DIORITE_MASONRY_BRICK_WALL = registerBlock("polished_diorite_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_DIORITE_MASONRY_BRICKS)));

    public static final Block POLISHED_GRANITE_MASONRY_BRICKS = registerBlock("polished_granite_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_BRICKS)));
    public static final Block POLISHED_GRANITE_MASONRY_BRICK_STAIRS = registerBlock("polished_granite_masonry_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRANITE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_MASONRY_BRICKS)));
    public static final Block POLISHED_GRANITE_MASONRY_BRICK_SLAB = registerBlock("polished_granite_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_MASONRY_BRICKS)));
    public static final Block POLISHED_GRANITE_MASONRY_BRICK_WALL = registerBlock("polished_granite_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_GRANITE_MASONRY_BRICKS)));

    public static final Block POLISHED_BEDROCK_MASONRY_BRICKS = registerBlock("polished_bedrock_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_BRICKS)));
    public static final Block POLISHED_BEDROCK_MASONRY_BRICK_STAIRS = registerBlock("polished_bedrock_masonry_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICKS)));
    public static final Block POLISHED_BEDROCK_MASONRY_BRICK_SLAB = registerBlock("polished_bedrock_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICKS)));
    public static final Block POLISHED_BEDROCK_MASONRY_BRICK_WALL = registerBlock("polished_bedrock_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_BEDROCK_MASONRY_BRICKS)));

    public static final Block VOID_STONE_MASONRY_BRICKS = registerBlock("void_stone_masonry_bricks",
            new MasonryBrickBlock(FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_BRICKS)));
    public static final Block VOID_STONE_MASONRY_BRICK_STAIRS = registerBlock("void_stone_masonry_brick_stairs",
            new StairsBlock(ModBlocks.VOID_STONE_MASONRY_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_MASONRY_BRICKS)));
    public static final Block VOID_STONE_MASONRY_BRICK_SLAB = registerBlock("void_stone_masonry_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_MASONRY_BRICKS)));
    public static final Block VOID_STONE_MASONRY_BRICK_WALL = registerBlock("void_stone_masonry_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_MASONRY_BRICKS)));

    public static final Block UNIFORM_BRICKS = registerBlock("uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block UNIFORM_BRICK_STAIRS = registerBlock("uniform_brick_stairs",
            new StairsBlock(ModBlocks.UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.UNIFORM_BRICKS)));
    public static final Block UNIFORM_BRICK_SLAB = registerBlock("uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.UNIFORM_BRICKS)));
    public static final Block UNIFORM_BRICK_WALL = registerBlock("uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.UNIFORM_BRICKS)));

    public static final Block NETHER_UNIFORM_BRICKS = registerBlock("nether_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_UNIFORM_BRICK_STAIRS = registerBlock("nether_uniform_brick_stairs",
            new StairsBlock(ModBlocks.NETHER_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.NETHER_UNIFORM_BRICKS)));
    public static final Block NETHER_UNIFORM_BRICK_SLAB = registerBlock("nether_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.NETHER_UNIFORM_BRICKS)));
    public static final Block NETHER_UNIFORM_BRICK_WALL = registerBlock("nether_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.NETHER_UNIFORM_BRICKS)));

    public static final Block PRISMARINE_UNIFORM_BRICKS = registerBlock("prismarine_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_UNIFORM_BRICK_STAIRS = registerBlock("prismarine_uniform_brick_stairs",
            new StairsBlock(ModBlocks.PRISMARINE_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.PRISMARINE_UNIFORM_BRICKS)));
    public static final Block PRISMARINE_UNIFORM_BRICK_SLAB = registerBlock("prismarine_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.PRISMARINE_UNIFORM_BRICKS)));
    public static final Block PRISMARINE_UNIFORM_BRICK_WALL = registerBlock("prismarine_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.PRISMARINE_UNIFORM_BRICKS)));

    public static final Block END_STONE_UNIFORM_BRICKS = registerBlock("end_stone_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_UNIFORM_BRICK_STAIRS = registerBlock("end_stone_uniform_brick_stairs",
            new StairsBlock(ModBlocks.END_STONE_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.END_STONE_UNIFORM_BRICKS)));
    public static final Block END_STONE_UNIFORM_BRICK_SLAB = registerBlock("end_stone_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.END_STONE_UNIFORM_BRICKS)));
    public static final Block END_STONE_UNIFORM_BRICK_WALL = registerBlock("end_stone_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.END_STONE_UNIFORM_BRICKS)));

    public static final Block RED_NETHER_UNIFORM_BRICKS = registerBlock("red_nether_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_UNIFORM_BRICK_STAIRS = registerBlock("red_nether_uniform_brick_stairs",
            new StairsBlock(ModBlocks.RED_NETHER_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.RED_NETHER_UNIFORM_BRICKS)));
    public static final Block RED_NETHER_UNIFORM_BRICK_SLAB = registerBlock("red_nether_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.RED_NETHER_UNIFORM_BRICKS)));
    public static final Block RED_NETHER_UNIFORM_BRICK_WALL = registerBlock("red_nether_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.RED_NETHER_UNIFORM_BRICKS)));

    public static final Block QUARTZ_UNIFORM_BRICKS = registerBlock("quartz_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_UNIFORM_BRICK_STAIRS = registerBlock("quartz_uniform_brick_stairs",
            new StairsBlock(ModBlocks.QUARTZ_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.QUARTZ_UNIFORM_BRICKS)));
    public static final Block QUARTZ_UNIFORM_BRICK_SLAB = registerBlock("quartz_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.QUARTZ_UNIFORM_BRICKS)));
    public static final Block QUARTZ_UNIFORM_BRICK_WALL = registerBlock("quartz_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.QUARTZ_UNIFORM_BRICKS)));

    public static final Block MUD_UNIFORM_BRICKS = registerBlock("mud_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_UNIFORM_BRICK_STAIRS = registerBlock("mud_uniform_brick_stairs",
            new StairsBlock(ModBlocks.MUD_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.MUD_UNIFORM_BRICKS)));
    public static final Block MUD_UNIFORM_BRICK_SLAB = registerBlock("mud_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.MUD_UNIFORM_BRICKS)));
    public static final Block MUD_UNIFORM_BRICK_WALL = registerBlock("mud_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.MUD_UNIFORM_BRICKS)));

    public static final Block VOID_STONE_UNIFORM_BRICKS = registerBlock("void_stone_uniform_bricks",
            new UniformBrickBlock(FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_BRICKS)));
    public static final Block VOID_STONE_UNIFORM_BRICK_STAIRS = registerBlock("void_stone_uniform_brick_stairs",
            new StairsBlock(ModBlocks.VOID_STONE_UNIFORM_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_UNIFORM_BRICKS)));
    public static final Block VOID_STONE_UNIFORM_BRICK_SLAB = registerBlock("void_stone_uniform_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_UNIFORM_BRICKS)));
    public static final Block VOID_STONE_UNIFORM_BRICK_WALL = registerBlock("void_stone_uniform_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.VOID_STONE_UNIFORM_BRICKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OresMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OresMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        OresMod.LOGGER.info("Registering ModBlocks for " + OresMod.MOD_ID);
    }
}
