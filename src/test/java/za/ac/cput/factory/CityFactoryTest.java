package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.City;

/**
 * Unit testing
 * Student Number - 206006330
 */

public class CityFactoryTest extends TestCase {
    @Test
    public void test() throws IllegalArgumentException{
        City city = CityFactory.createCity("7100", "Cape Town", null);
        System.out.println(city);
        assertNotNull(city);
    }
    //Trying something new

    /*@org.junit.jupiter.api.Test
    public void createCity(){
        City city = CityFactory.createCity("test_id","test_name");
        assertNotNull(city);
        System.out.println(city);
    }
    @org.junit.jupiter.api.Test
    void createId(){
        City city = CityFactory.createCity("test_id","test_name");
        assertNotNull(city);
        System.out.println(city);


    }*/


}