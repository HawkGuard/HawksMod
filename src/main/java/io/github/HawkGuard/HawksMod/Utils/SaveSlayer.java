package io.github.HawkGuard.HawksMod.Utils;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class SaveSlayer {
    public SaveSlayer(){

    }

    public void writeSlayerData(JSONObject data){
        try {
            FileWriter fileWriter = new FileWriter("HawksMod/SlayerData.json");
            fileWriter.write(data.toJSONString());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("File couldn't be written");
        }
    }
}
