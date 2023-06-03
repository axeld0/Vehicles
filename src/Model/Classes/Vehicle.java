package Model.Classes;

import Model.Enum.VehiclesType;

public class Vehicle {
    private VehiclesType model;
    private double mileage;

    private int year;
    private int code;
    private int fixedRate;


    //constructors

    public Vehicle(VehiclesType model, double mileage, int year, int code, int fixedRate) {
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.code = code;
        this.fixedRate = fixedRate;
    }

    public Vehicle ()
    {
        this.model = VehiclesType.DEFAULT;
    }


    //getters and setters
    public VehiclesType getModel() {
        return model;
    }

    public void setModel(VehiclesType model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(int fixedRate) {
        this.fixedRate = fixedRate;
    }

    /**
    Equals and hashcode
     */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Double.compare(vehicle.mileage, mileage) != 0) return false;
        if (year != vehicle.year) return false;
        if (code != vehicle.code) return false;
        if (fixedRate != vehicle.fixedRate) return false;
        return model == vehicle.model;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        temp = Double.doubleToLongBits(mileage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + year;
        result = 31 * result + code;
        result = 31 * result + fixedRate;
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model=" + model +
                ", mileage=" + mileage +
                ", year=" + year +
                ", code=" + code +
                ", fixedRate=" + fixedRate +
                '}';
    }


}
