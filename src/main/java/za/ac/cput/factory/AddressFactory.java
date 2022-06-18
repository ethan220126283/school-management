package za.ac.cput.factory;
/*
        AddressFactory.java
        Address Factory
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 12 June 2022
 */
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.util.Helper;

public class AddressFactory {

    public static Address createAddress(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode, City city) {

        if(Helper.isNullorEmpty(streetNumber) || Helper.isNullorEmpty(streetName) || Helper.isNullorEmpty(String.valueOf(city))){
            throw new IllegalArgumentException("streetNumber, streetName and city is required.");
        }
        if(postalCode < 1000){
            throw new IllegalArgumentException("postalCode must be between 1000-9999");
        }else if(postalCode > 9000){
            throw new IllegalArgumentException("postalCode must be between 1000-9999");
        }

        return new Address.Builder(streetNumber)
                .setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setPostalCode(postalCode)
                .setCity(city)
                .build();
    }
}
