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
    public void test(){
        City city = CityFactory.createCity("7100", "Cape Town");
        System.out.println(city.toString());
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }


}