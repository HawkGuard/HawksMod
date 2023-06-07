package io.github.HawkGuard.HawksMod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = HawksMod.MODID, version = HawksMod.VERSION, clientSideOnly = true)
public class HawksMod {
    public static final String MODID = "HawksMod";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());
    }
}
