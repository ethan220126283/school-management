package za.ac.cput.factory;

import za.ac.cput.domain.City;
import za.ac.cput.util.Helper;

/**
 * Working on user Objects
 */

public class CityFactory {
    //Creating User Objects
    public static City createCity(String id, String name){

        if (Helper.isNullorEmpty(id) || Helper.isNullorEmpty(name)){
            return null;
        }
        return new City.Builder()
                .setId(id)
                .setName(name)
                .builder();
    }
}
