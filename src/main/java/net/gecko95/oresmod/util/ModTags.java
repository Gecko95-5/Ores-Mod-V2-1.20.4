package net.gecko95.oresmod.util;

import net.gecko95.oresmod.OresMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DRILL_MINEABLE =
                createTag("drill_mineable");
        public static final TagKey<Block> CHAINSAW_MINEABLE =
                createTag("chainsaw_mineable");
        public static final TagKey<Block> MULTI_TOOL_MINEABLE =
                createTag("multi_tool_mineable");

        public static final TagKey<Block> STONEBARK_PLACEABLE =
                createTag("stonebark_placeable");
        public static final TagKey<Block> DEEPBARK_PLACEABLE =
                createTag("deepbark_placeable");
        public static final TagKey<Block> SILVER_FLOWER_PLACEABLE =
                createTag("silver_flower_placeable");

        public static final TagKey<Block> POTION_TANKS =
                createTag("potion_tanks");

        public static final TagKey<Block> ITE_BLOCKS =
                createTag("ite_blocks");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OresMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TERRACOTTA_HELMETS =
                createTag("terracotta_helmets");
        public static final TagKey<Item> TERRACOTTA_CHESTPLATES =
                createTag("terracotta_chestplates");
        public static final TagKey<Item> TERRACOTTA_LEGGINGS =
                createTag("terracotta_leggings");
        public static final TagKey<Item> TERRACOTTA_BOOTS =
                createTag("terracotta_boots");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(OresMod.MOD_ID, name));
        }
    }
    public static class Biomes {
        public static final TagKey<Biome> HAS_FROSITE =
                createTag("has_frosite");
        public static final TagKey<Biome> HAS_ICY_FROSITE =
                createTag("has_icy_frosite");
        public static final TagKey<Biome> FROSITE_COLD =
                createTag("frosite_cold");
        public static final TagKey<Biome> IS_END_ISLANDS =
                createTag("is_end_islands");
        public static final TagKey<Biome> IS_QUARRY =
                createTag("is_quarry");
        public static final TagKey<Biome> IS_QUARRY_FLAT =
                createTag("is_quarry_flat");
        public static final TagKey<Biome> IS_QUARRY_MOUNTAIN =
                createTag("is_quarry_mountain");
        public static final TagKey<Biome> STONEBARK_SAFE =
                createTag("stonebark_safe");
        private static TagKey<Biome> createTag(String name) {
            return TagKey.of(RegistryKeys.BIOME, new Identifier(OresMod.MOD_ID, name));
        }
    }
}
