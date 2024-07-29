package net.gecko95.oresmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class StonePlantBlock extends PlantBlock {
    public static final MapCodec<StonePlantBlock> CODEC = StonePlantBlock.createCodec(StonePlantBlock::new);
    public StonePlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(ModTags.Blocks.STONEBARK_PLACEABLE);
    }
}
