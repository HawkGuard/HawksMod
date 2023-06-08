package io.github.HawkGuard.HawksMod;

import io.github.HawkGuard.HawksMod.Listener.ChatListener;
import io.github.HawkGuard.HawksMod.Overlays.Overlay;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = HawksMod.MODID, version = HawksMod.VERSION, clientSideOnly = true)
public class HawksMod {
    public static final String MODID = "HawksMod";
    public static final String VERSION = "0.0.1";
    //public ChatListener chatListener;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ChatListener());
        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());
    }
}
