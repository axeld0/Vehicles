package Model.Classes;

import Model.Enum.VehiclesType;

public class VehiclesCollection {


    private Vehicle[] vehiclesCollection;

    public VehiclesCollection()
    {
        vehiclesCollection = new Vehicle[3];
        this.vehiclesCollection[0] = new Vehicle(VehiclesType.THREEDOORS, 1000, 2016, 123, 30);
        this.vehiclesCollection[1]= new Vehicle(VehiclesType.FIVEDOORS, 1230, 2020, 222, 50);
        this.vehiclesCollection[2] =new Vehicle(VehiclesType.SUV, 100, 2023, 1222 , 100);
    }

    public void setVehiclesCollection(Vehicle[] vehiclesCollection) {
        this.vehiclesCollection = vehiclesCollection;
    }

    public Vehicle[] getVehiclesCollection() {
        return vehiclesCollection;
    }

    public Vehicle getCar(int selectedCar) throws IllegalArgumentException
    {
        Vehicle selectedVehicle = new Vehicle();
        switch (selectedCar) {
            case 1:
                selectedVehicle = vehiclesCollection[0];
                break;
            case 2 :
                selectedVehicle = vehiclesCollection[1];
                break;
            case 3:
                selectedVehicle = vehiclesCollection[2];
                break;
            default:
                throw new IllegalArgumentException();
        }
        return selectedVehicle;
    }

}
