package net.gecko95.oresmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UniformBrickBlock extends Block {
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.GRAY;
    private static final Text STYLE_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("blueprint.uniform.style"))).formatted(DESCRIPTION_FORMATTING);
    public UniformBrickBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(STYLE_TEXT);
        super.appendTooltip(stack, world, tooltip, options);
    }
}
