package net.gecko95.oresmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CarvingBlockEntity> CARVING_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(OresMod.MOD_ID, "carving_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CarvingBlockEntity::new,
                            ModBlocks.CARVING_STATION).build());

    public static void registerBlockEntities(){
        OresMod.LOGGER.info("Registering Block Entities for " + OresMod.MOD_ID);
    }
}
