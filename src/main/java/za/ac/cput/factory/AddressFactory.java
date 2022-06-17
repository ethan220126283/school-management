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

    //Factory method
    public static Address createAddress(String unitNumber, String complexName, String streetNumber, String streetName, Integer postalCode){

        if(Helper.isNullorEmpty(streetNumber) || Helper.isNullorEmpty(streetName) || Helper.isNullorEmpty(String.valueOf(postalCode ))){
            throw new IllegalArgumentException("streetNumber, streetName, postalCode and city mandatory attributes.");
        }

        return new Address.Builder(unitNumber)
                .UnitNumber(unitNumber)
                .ComplexName(complexName)
                .StreetNumber(streetNumber)
                .StreetName(streetName)
                .PostalCode(postalCode)
                .build();
    }
}

