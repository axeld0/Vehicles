package Model.Classes;

import Model.Exceptions.HasNoLicenceException;

import java.util.Date;

public class Rental {

    private Date begining;
    private Date ending;
    private Vehicle vehicle;

    private Client client;
    private double kms;

    private Branch initialBranch;

    private Branch endingBranch;




    /**c
     * CONSTRUCTORS
     * @param begining
     * @param ending
     * @param vehicle
     */
    public Rental(Date begining , Date ending, Vehicle vehicle ,Client client, int kms, Branch initialBranch , Branch endingBranch) {
        this.begining = begining;
        this.ending = ending;
        this.vehicle = vehicle;
        this.client = client;
        this.kms = kms;
        this.initialBranch = initialBranch;
        this.endingBranch = endingBranch;

    }

    public Rental() {
        begining = new Date();
        ending = new Date();
        vehicle = new Vehicle();
        client = new Client();
        kms = 0;
        initialBranch = new Branch();
        endingBranch = new Branch();
    }


    /**
     * GETTERS AND SETTERS
     * @return
     */
    public Date getBegining() {
        return begining;
    }

    public void setBegining(Date begining) {
        this.begining = begining;
    }

    public Date getEnding() {
        return ending;
    }

    public void setEnding(Date ending) {
        this.ending = ending;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public Branch getInitialBranch() {
        return initialBranch;
    }

    public void setInitialBranch(Branch initialBranch) {
        this.initialBranch = initialBranch;
    }

    public Branch getEndingBranch() {
        return endingBranch;
    }

    public void setEndingBranch(Branch endingBranch) {
        this.endingBranch = endingBranch;
    }

    /**
     * Price
     */



    public Vehicle selectCar(int selectedCar)
    {
        VehiclesCollection fleet = new VehiclesCollection();
        Vehicle selectedVehicle = fleet.getCar(selectedCar);
        return vehicle;
    }

    public double GetPrice () throws HasNoLicenceException
    {
        if(client.isHasLicence() == false)
        {
            throw new HasNoLicenceException();
        }
        double totalPrice = 0;
        double km = 50 * kms + vehicle.getFixedRate();
        long totaldays = ending.getDate()-begining.getDate();

        System.out.println(totaldays);
        totalPrice = totaldays * km;
        return (double)totalPrice;
    }




}
