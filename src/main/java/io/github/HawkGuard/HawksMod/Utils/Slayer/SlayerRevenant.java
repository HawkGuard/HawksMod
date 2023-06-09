package io.github.HawkGuard.HawksMod.Utils.Slayer;



import org.json.JSONObject;

import java.util.HashMap;

public class SlayerRevenant extends SlayerUtils{
    public SlayerRevenant(){
        super();
    }

    @Override
    public JSONObject getJSON() {
        return obj;
    }

    @Override
    public void setObj() {
        obj.put("Revenant Flesh", 0);
        obj.put("Foul Flesh", 0);
        obj.put("Pestilence Rune", 0);
        obj.put("Undead Catalyst", 0);
        obj.put("Smite VI", 0);
        obj.put("Beheaded Horror", 0);
        obj.put("Revenant Catalyst", 0);
        obj.put("Snake Rune", 0);
        obj.put("Revenant Viscera", 0);
        obj.put("Scythe Blade", 0);
        obj.put("Shard Of The Shredded", 0);
        obj.put("Warden Heart", 0);
    }

    @Override
    public void setLootTableMap() {
        lootTableMap.put("Revenant Flesh", 0);
        lootTableMap.put("Foul Flesh", 0);
        lootTableMap.put("Pestilence Rune", 0);
        lootTableMap.put("Undead Catalyst", 0);
        lootTableMap.put("Smite VI", 0);
        lootTableMap.put("Beheaded Horror", 0);
        lootTableMap.put("Revenant Catalyst", 0);
        lootTableMap.put("Snake Rune", 0);
        lootTableMap.put("Revenant Viscera", 0);
        lootTableMap.put("Scythe Blade", 0);
        lootTableMap.put("Shard Of The Shredded", 0);
        lootTableMap.put("Smite VII", 0);
        lootTableMap.put("Warden Heart", 0);
    }

    @Override
    public HashMap<String, Integer> getLootTableMap() {
        return lootTableMap;
    }

    @Override
    public void addDrop(String drop) {
        int lastDrop = lootTableMap.get(drop);
        int newDrop;
        newDrop = lastDrop++;
        lootTableMap.put(drop, newDrop);
        obj.put(drop, newDrop);
    }
}
