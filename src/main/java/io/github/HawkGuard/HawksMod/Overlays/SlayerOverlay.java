package io.github.HawkGuard.HawksMod.Overlays;

import io.github.HawkGuard.HawksMod.Utils.SlayerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.EnumChatFormatting;

public class SlayerOverlay extends Overlay{

    public SlayerOverlay(){
        super();
    }

    @Override
    public void render() {
        switch (text){
            case "Revenant Horror" : {
                FontRenderer fRender = minecraft.fontRendererObj;
                fRender.drawString(EnumChatFormatting.RED + text, 5, 5, 0);
                drawLootTable(fRender, SlayerUtils.getRevenantLoot());
            }
        }
    }

    private void drawLootTable(FontRenderer fRender, String lootTable){
        int index = 6;
        for (String line : lootTable.split("\n")){
            fRender.drawString(EnumChatFormatting.RED + line, 5, index, 0);
            index++;
        }
    }
}
