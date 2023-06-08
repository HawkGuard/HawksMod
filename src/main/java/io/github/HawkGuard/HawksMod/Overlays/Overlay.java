package io.github.HawkGuard.HawksMod.Overlays;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public abstract class Overlay {
    int height = Minecraft.getMinecraft().displayHeight;
    int width = Minecraft.getMinecraft().displayWidth;
    public Overlay(){

    }
}
