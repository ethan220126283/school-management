package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.util.Helper;

public class AddressFactory {

    public static Address createAddress(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode, City city) {

        if (Helper.isNullorEmpty(streetName) || Helper.isNullorEmpty(streetNumber)){
            throw new IllegalArgumentException("streetName and streetNumber mandatory attributes.");
        }

        return new Address.Builder(streetNumber)
                .theirStreetName(streetName)
                .theirPostalCode(postalCode)
                .theirCity(city)
                .theirUnitNumber(unitNumber)
                .theirComplexName(complexName)
                .build();
    }
}
