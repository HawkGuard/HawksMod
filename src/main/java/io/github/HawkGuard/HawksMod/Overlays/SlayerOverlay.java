package io.github.HawkGuard.HawksMod.Overlays;

import io.github.HawkGuard.HawksMod.Utils.SlayerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumChatFormatting;

import java.util.jar.Attributes;

public class SlayerOverlay extends Overlay{
    private String tier;
    public SlayerOverlay(){
        super();
        this.tier = "Tier not found";
    }

    @Override
    public void render() {
        switch (text){
            case "Revenant Horror" : {
                FontRenderer fRender = minecraft.fontRendererObj;

                GlStateManager.pushMatrix();
                GlStateManager.scale(1f, 1f, 0f);

                fRender.drawString(EnumChatFormatting.RED + text, 5, 5, 0);
                fRender.drawString(EnumChatFormatting.RED + tier, 5, 6, 0);
                GlStateManager.popMatrix();

                drawLootTable(fRender, SlayerUtils.getRevenantLoot());
            }
        }
    }

    private void drawLootTable(FontRenderer fRender, String lootTable){
        int index = 7;

        GlStateManager.pushMatrix();
        GlStateManager.scale(1f, 1f, 0f);

        for (String line : lootTable.split("\n")){
            fRender.drawString(EnumChatFormatting.RED + line, 5, index += fRender.FONT_HEIGHT, 0);
            index++;
        }

        GlStateManager.popMatrix();
    }

    public void setTier(String tier){
        this.tier = tier;
    }
}
