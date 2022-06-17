package za.ac.cput.factory;

import za.ac.cput.domain.City;
import za.ac.cput.util.Helper;

/**
 * Working on user Objects
 * Student Number - 206006330
 */

public class CityFactory {
    //Creating User Objects
    public static City createCity(String id, String name){

        if (Helper.isNullorEmpty(id) || Helper.isNullorEmpty(name))
            throw new IllegalArgumentException("id and or name");
            return new City.Builder()
                .setId(id)
                .setName(name)
                .build();
    }

    public static City build(String id, String name) {
        return null;
    }
}
