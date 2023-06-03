package Model.Classes;

import java.util.Objects;

public class Branch {

    private String city;
    private String address;

    private long phoneNumber;


    /**
     * constructors
     * @param city
     * @param address
     * @param phoneNumber
     */
    public Branch(String city, String address, long phoneNumber) {
        city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Branch() {
        city = "";
        address = "";
        phoneNumber = 0;
    }


    /**getters and setters
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**toString
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (phoneNumber != branch.phoneNumber) return false;
        if (!Objects.equals(city, branch.city)) return false;
        return Objects.equals(address, branch.address);
    }


    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
