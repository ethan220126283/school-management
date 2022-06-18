package za.ac.cput.domain;
/*
        Address.java
        Entity for Address
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date:  12 June 2022
 */
public class Address {

    private String unitNumber;
    private String complexName;
    private String streetNumber;
    private String streetName;
    private int postalCode;
    private City city;

    //Private Constructors
    private Address(Builder builder){
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;
    }

    private Address() {
    }

    //Getters
    public String getUnitNumber(){
        return unitNumber;
    }

    public String getComplexName(){
        return complexName;
    }

    public String getStreetNumber(){
        return streetNumber;
    }

    public String getStreetName(){
        return streetName;
    }

    public int getPostalCode(){
        return postalCode;
    }

    public City getCity() {
    return city;
    }

    //Setters
    public void setUnitNumber(String unitNumber){
        this.unitNumber = unitNumber;
    }

    public void setComplexName(String complexName){
        this.complexName = complexName;
    }

    public void setStreetNumber(String streetNumber){
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    public void setCity(City city) {
    this.city = city;
    }

    //Builder Class
    public static class Builder{

        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private int postalCode;
        private City city;


        public Builder(String streetNumber) {
        }

        public Address.Builder setUnitNumber(String unitNumber){
            this.unitNumber = unitNumber;
            return this;
        }

        public Address.Builder setComplexName(String complexName){
            this.complexName = complexName;
            return this;
        }

        public Address.Builder setStreetNumber(String streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }

        public Address.Builder setStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }

        public Address.Builder setPostalCode(int postalCode){
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCity (City city){
        this.city = city;
        return this;
        }

        public Builder copy(Address address){
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address " +
                " unitNumber= '" + unitNumber + '\'' +
                ", complexName= '" + complexName + '\'' +
                ", streetNumber= '" + streetNumber + '\'' +
                ", streetName= '" + streetName + '\'' +
                ", postalCode= '" + postalCode + '\'' +
                ", city= " + city + '\'' +
                '}';
    }
}
