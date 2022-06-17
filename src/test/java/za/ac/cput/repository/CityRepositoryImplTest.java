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
    }

    @AfterEach public void tearDown(){
        this.repository.delete(this.city);
    }

    @Test
    void Save() {
        City saved = this.repository.save(this.city);
        System.out.println(saved);
        assertNotNull(saved);
        assertSame(this.city,saved);
    }
    @Test
    void Read() {
        City saved = this.repository.save(this.city);
        Optional<City> read = this.repository.read(saved.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(saved, read.get())
        );
    }
    @Test
    void Delete() {
        City saved = this.repository.save(this.city);
        List<City> cityList = this.repository.findAll();
        assertEquals(1 , cityList.size());
        this.repository.delete(saved);
        cityList = this.repository.findAll();
        assertEquals(0 , cityList.size());
    }
    @Test
    void FindAll() {
        this.repository.save(this.city);
        List<City> cityList = this.repository.findAll();
        assertEquals(1 , cityList.size());
    }
}