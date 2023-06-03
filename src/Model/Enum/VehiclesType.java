package Model.Enum;

public enum VehiclesType {

    DEFAULT ("No Model selected") , SUV ("Suv"), THREEDOORS("A 3 door vehicle"), FIVEDOORS("A five door vehicle");

    private String description;

    private VehiclesType(String description)
    {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
