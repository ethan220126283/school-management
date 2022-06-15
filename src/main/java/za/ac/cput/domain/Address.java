package za.ac.cput.domain;

public class Address {

    private String unitNumber;
    private String complexName;
    private String streetNumber;
    private String streetName;
    private int postalCode;
    private City city;

    //Private constructors
    private Address(Builder builder) {
      this.unitNumber = builder.unitNumber;
      this.complexName = builder.complexName;
      this.streetNumber = builder.streetNumber;
      this.streetName = builder.streetName;
      this.postalCode = builder.postalCode;
      this.city = builder.city;
    }

    //Setters
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void setComplexName(String complexName) {
        this.complexName = complexName;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(City city) {
        this.city = city;
    }

    //Getters
    public String getUnitNumber() {
        return unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    //Builder Class
    public static class Builder {
        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private int postalCode;
        private City city;

        public Builder(String streetNumber){this.streetNumber = streetNumber;}

        public Builder theirStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder theirPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder theirCity(City city) {
            this.city = city;
            return this;
        }

        public Builder theirUnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder theirComplexName(String complexName) {
            this.complexName = complexName;
            return this;
        }

        public Builder copy(Address address) {
            this.complexName = address.complexName;
            this.unitNumber = address.unitNumber;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;
            return this;
        }

        public Address build(){return new Address(this);}
    }

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city=" + city +
                '}';
    }
}
