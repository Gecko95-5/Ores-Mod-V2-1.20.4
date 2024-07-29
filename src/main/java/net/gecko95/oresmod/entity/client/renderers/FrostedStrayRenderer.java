package net.gecko95.oresmod.entity.client.renderers;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.gecko95.oresmod.OresMod;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.StrayEntityRenderer;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.util.Identifier;
@Environment(value= EnvType.CLIENT)
public class FrostedStrayRenderer extends StrayEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/frosted_stray.png");

    public FrostedStrayRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    public Identifier getTexture(AbstractSkeletonEntity abstractSkeletonEntity){
        return TEXTURE;
    }
}
