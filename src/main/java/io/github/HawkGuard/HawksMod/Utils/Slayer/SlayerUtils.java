package io.github.HawkGuard.HawksMod.Utils.Slayer;



import org.json.JSONObject;


import java.util.HashMap;

public abstract class SlayerUtils {
    public String tier;
    public HashMap<String, Integer> lootTableMap;

    public JSONObject obj;
    public SlayerUtils(){
        this.tier = "Tier not found";
        this.lootTableMap = new HashMap<>();
        this.obj = new JSONObject();
    }

    /**
     * Get the revenant horror loot table
     * @return String lootable
     */
    public static String getRevenantLoot(){
        String lootTable;

        lootTable = "Revenant Flesh \n" +
                "Foul Flesh \n" +
                "Pestilence Rune \n" +
                "Undead Catalyst \n" +
                "Smite VI Book \n" +
                "Beheaded Horror \n" +
                "Revenant Catalyst \n" +
                "Snake Rune \n" +
                "Revenant Viscera \n" +
                "Scythe Blade \n" +
                "Shard Of The Shredded \n" +
                "Smite VII Book \n" +
                "Warden Heart \n";

        return lootTable;
    }

    public static String getSpiderLoot(){
        String lootTable;

        lootTable = "Tarantula Web" +
                "Toxic Arrow" +
                "Bite Rune" +
                "Spider Catalyst" +
                "Bane Of Arthropods VI" +
                "Fly Swatter" +
                "Tarantula Talisman" +
                "Digested Mosquito";

        return lootTable;
    }

    public static String getWolfLoot(){
        String lootTable;

        lootTable = "Wolf Tooth" +
                "Hamster Wheel" +
                "Spirit Rune" +
                "Critical VI" +
                "Furball" +
                "Red Claw Egg" +
                "Couture Rune" +
                "Grizzly Bait" +
                "Overflux Capacitor";

        return lootTable;
    }

    public static String getEndermanLoot(){
        String lootTable;

        lootTable = "Null Sphere" +
                "Twilight Arrow" +
                "Endersnake Rune" +
                "Summoning Eye" +
                "Mana Steal I" +
                "Transmission Tuner" +
                "Null Atom" +
                "Hazmat Enderman" +
                "Pocket Espresso Machine" +
                "Smarty Pants I" +
                "End Rune I" +
                "Handy Blood Chalice" +
                "Sinful Dice" +
                "Exceedingly Rare Ender Artifact Upgrader" +
                "Etherwarp Merger" +
                "Void Conqueror Enderman Skin" +
                "Judgement Core" +
                "Enchant Rune" +
                "Ender Slayer VII";

        return lootTable;
    }

    public static String getBlazeLoot(){
        String lootTable;

        lootTable = "Delerict Ashe" +
                "Lavatears Rune I" +
                "Wisp's Ice-Flavored" +
                "Bundle Of Magma Arrows" +
                "Mana Disintegrator" +
                "Scorched Books" +
                "Kelvin Inverter" +
                "Blaze Rod Distillate" +
                "Glowstone Distillate" +
                "Magma Cream Distillate" +
                "Nether Wart Distillate" +
                "Gabagool Distillate" +
                "Scorched Power Crystal" +
                "Archfiend Dice" +
                "Fire Aspect III" +
                "Fiery Burst Rune I" +
                "Flawed Opal Gemstone" +
                "Duplex I" +
                "High Class Archfiend Dice" +
                "Wilson's Engineering Plans" +
                "Subzero Inverter";

        return lootTable;
    }

    /**
     * Get the tier of the spawned boss
     * @param xpNeeded String of the xp said in chat
     * @return String with the tier, says Tier not found if the xpNeeded isn't found in the HashMap
     */
    public static String getRevenantTier(String xpNeeded){
        HashMap<String, String> revTier = new HashMap<>();
        revTier.put("150", "Tier: 1");
        revTier.put("1,440", "Tier: 2");
        revTier.put("2,400", "Tier: 3");
        revTier.put("4,800", "Tier: 4");
        revTier.put("6,000", "Tier: 5");

        return revTier.getOrDefault(xpNeeded, "Tier not found");
    }

    public abstract JSONObject getJSON();

    public abstract void setObj();

    public void getXpLeft(String xpLeft, String xpGet){
        int xp;
    }

    public abstract void setLootTableMap();

    public abstract HashMap<String, Integer> getLootTableMap();

    public abstract void addDrop(String drop);



}
