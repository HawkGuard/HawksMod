package io.github.HawkGuard.HawksMod.Overlays;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public abstract class Overlay {
    int height = Minecraft.getMinecraft().displayHeight;
    int width = Minecraft.getMinecraft().displayWidth;
    public String text;

    public Minecraft minecraft;
    public Overlay(){
        this.minecraft = Minecraft.getMinecraft();
        this.text = "vide";
    }
    @SubscribeEvent
    public void render(RenderGameOverlayEvent event){

        if (event.type == RenderGameOverlayEvent.ElementType.CHAT)
            render();

        if (event.isCancelable() || event.type != RenderGameOverlayEvent.ElementType.EXPERIENCE){
            return;
        }

        //FontRenderer fRender = Minecraft.getMinecraft().fontRendererObj;
        //fRender.drawString(EnumChatFormatting.RED + text, 5, 5, 0);
    }

    public abstract void render();

    public void setText(String text){
        this.text = text;

    }
}
