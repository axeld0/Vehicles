import Model.Classes.*;
import Model.Enum.VehiclesType;
import Model.JSON.JSONController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
        JSONController c = new JSONController();

        Client axel = new Client(36617165, "Axel Dominguez", true);
        VehiclesCollection col = new VehiclesCollection();
        BranchCollection bra = new BranchCollection();
        double price1 = 0;
        try{
            Rental newRental1 = new Rental(d.parse("01-12-2023"),  d.parse("12-12-2023"),col.getCar(2),axel, 10,bra.getBranch("Mar del Plata"),bra.getBranch("Necochea"));
            price1 = newRental1.GetPrice();
            c.JSON2File(col);

        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("price: $ "+ price1);

    }
}