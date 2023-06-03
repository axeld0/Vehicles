package Model.JSON;

import Model.Classes.Vehicle;
import Model.Classes.VehiclesCollection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class JSONController  {

    public void JSON2File(VehiclesCollection vehiclesCollection) throws JSONException
    {
        JSONArray jsonArray = new JSONArray();
        for(Vehicle v : vehiclesCollection.getVehiclesCollection())
        {
            try {

                JSONObject jsonObject = new JSONObject();
                jsonObject.put("model", v.getModel());
                jsonObject.put("mileage", v.getMileage());
                jsonObject.put("Year", v.getYear());
                jsonObject.put("Code", v.getCode());
                jsonObject.put("fixed Rate", v.getFixedRate());

                jsonArray.put(jsonObject);
            }

            catch (JSONException e)
            {
                e.printStackTrace();
            }
            JSONUtils.save(jsonArray, "Vehicles.");
        }
    }
}
