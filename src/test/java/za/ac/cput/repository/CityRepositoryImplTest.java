package za.ac.cput.repository;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import za.ac.cput.domain.City;
import za.ac.cput.factory.CityFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Working on Test cases for City
 * Student Number - 206006330
 */

public class CityRepositoryImplTest extends TestCase {

    private City city;
    private CityRepository repository;

    @BeforeEach public void setUp(){
        this.city = CityFactory.build("test-id","test-name");
        this.repository = CityRepositoryImpl.cityRepository();
        City saved = this.repository.save(this.city);
        assertSame(this.city,saved);
    }

    @AfterEach public void tearDown(){
        this.repository.delete(this.city);
        List<City> cityList = this.repository.findAll();
        assertEquals(0 , cityList.size());
    }

    @Test
    void Read() {
        Optional<City> read = this.repository.read(this.city.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.city, read.get())
        );
    }
    @Test
    void FindAll() {
        List<City> cityList = this.repository.findAll();
        assertEquals(1 , cityList.size());
    }
}