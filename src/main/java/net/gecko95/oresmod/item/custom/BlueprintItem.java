package net.gecko95.oresmod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlueprintItem extends Item {
    private final Text styleText;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.GRAY;
    private static final Text MASONRY_STYLE_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("blueprint.masonry.style"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text UNIFORM_STYLE_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("blueprint.uniform.style"))).formatted(DESCRIPTION_FORMATTING);
    public BlueprintItem(Text styleText) {
        super(new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON));
        this.styleText = styleText;
    }
    public static BlueprintItem createMasonryBlueprint() {
        return new BlueprintItem(MASONRY_STYLE_TEXT);
    }
    public static BlueprintItem createUniformBlueprint() {
        return new BlueprintItem(UNIFORM_STYLE_TEXT);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(this.styleText);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
