package io.github.HawkGuard.HawksMod.Listener;

import io.github.HawkGuard.HawksMod.HawksMod;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.util.ArrayList;

public class ChatListener {

    public ChatListener(){

    }

    // TEST
    @SubscribeEvent
    public void sendChat(PlayerEvent.PlayerLoggedInEvent event){
        event.player.addChatMessage(new ChatComponentText("» Slay 6,000 Combat XP worth of Zombies."));

        //Minecraft.getMinecraft().thePlayer.sendChatMessage("» Slay 6,000 Combat XP worth of Zombies.");
        //System.out.println("AWIHAGOGHW)GOH");
    }

    // TEST
    @SubscribeEvent
    public void test(PlayerEvent.ItemPickupEvent event){
        event.player.addChatMessage(new ChatComponentText("» Slay 6,000 Combat XP worth of Spiders."));
    }

    @SubscribeEvent
    public void getChat(ClientChatReceivedEvent event){
        final String MATCH_SLAY = "Slay";
        String message = String.valueOf(event.message.getFormattedText());
        if (message.contains(MATCH_SLAY)){
            getSlayerType(message);
        }
    }

    private void getSlayerType(String text){
        ArrayList<String> slayerType = new ArrayList<>();
        slayerType.add("Zombies.§r");
        slayerType.add("Spiders.§r");
        slayerType.add("Wolves.§r");
        slayerType.add("Enderman.§r");
        slayerType.add("Blazes.§r");

        String[] textTab = text.split(" ");

        int index;

        index = findType(textTab);

        if (index != -1){
            if (textTab[index].equals(slayerType.get(0))){
                HawksMod.slayerOverlay.setText("Zombie\nRevenant Viscera");
                Minecraft.getMinecraft().thePlayer.sendChatMessage("Zombie");
            } else if (textTab[index].equals(slayerType.get(1))) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("Spider");
            } else if (textTab[index].equals(slayerType.get(2))) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("Wolf");
            } else if (textTab[index].equals(slayerType.get(3))) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("Enderman");
            } else if (textTab[index].equals(slayerType.get(4))) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("Blazes");
            }else
                Minecraft.getMinecraft().thePlayer.sendChatMessage("Rien");
        }

    }

    private int findType(String[] tab){
        for (int i = 0; i < tab.length; i++){
            if (tab[i].equals("of")){
                return i + 1;
            }
        }
        return -1;
    }



}
