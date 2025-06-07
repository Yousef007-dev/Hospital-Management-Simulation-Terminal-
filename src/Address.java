public class Address {
    private String governorate;
    private String city;
    private String streetName;
    private int houseNumber;

    public Address(String governorate,String city,String streetName,int houseNumber){
        this.governorate=governorate;
        this.city=city;
        this.streetName=streetName;
        this.houseNumber=houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getGovernorate() {
        return governorate;
    }
}
