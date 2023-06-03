package Model.Classes;

import java.util.Objects;


public class Client{

    private int id;
    private String name;

    private boolean hasLicence;


    /**
     * constructors
     * @param id
     * @param name
     * @param hasLicence
     */
    public Client(int id, String name, boolean hasLicence) {
        this.id = id;
        this.name = name;
        this.hasLicence = hasLicence;
    }

    public Client() {
        id = 0;
        name = "no name introduced.";
        hasLicence = false;
    }


    /**
     * getters and setters
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasLicence() {
        return hasLicence;
    }

    public void setHasLicence(boolean hasLicence) {
        this.hasLicence = hasLicence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (hasLicence != client.hasLicence) return false;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (hasLicence ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hasLicence=" + hasLicence +
                '}';
    }


}
