package Model.JSON;

import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class JSONUtils {


    public static void save (JSONArray jsonArray , String fileName)
    {
        try {
            FileWriter fw = new FileWriter(fileName + ".json");
            fw.write(jsonArray.toString());
            fw.flush();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
