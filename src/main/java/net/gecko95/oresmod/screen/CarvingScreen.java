package net.gecko95.oresmod.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.gecko95.oresmod.OresMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CarvingScreen extends HandledScreen<CarvingScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID, "textures/gui/container/carving_station.png");
    public CarvingScreen(CarvingScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }



    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE,x,y,0,0,backgroundWidth,backgroundHeight);

        renderProgressArrow(context,x,y);
    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        if (handler.isCarving()){
            context.drawTexture(TEXTURE, x + 90, y + 35,176,0,handler.getScaledProgress(),16);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context,mouseX,mouseY,delta);
        super.render(context, mouseX, mouseY, delta);
    drawMouseoverTooltip(context,mouseX,mouseY);
    }
}
