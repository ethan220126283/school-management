package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.CityFactory;
import za.ac.cput.factory.EmployeeAddressFactory;
import za.ac.cput.service.ICityService;
import za.ac.cput.service.IEmployeeAddressService;
import za.ac.cput.service.IEmployeeService;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Working on service impl test
 * Student Number - 206006330
 */


@SpringBootTest

public class CityServiceImplTest {

    private final City city = CityFactory.createCity("71400","Cape Town",null);


    @Autowired
    private ICityService service;

    @Test
    void save() {
        City citySave = this.service.save(this.city);
        assertEquals(this.city, citySave);
    }
    @Test
    void read() {
        Optional<City> read = this.service.read(this.city.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.city, read.get())
        );
    }
    @Test
    void findAll() {
        List<City> cityList = this.service.findAll();
        assertEquals(0, cityList.size());
    }
    @Test
    void delete() {
        this.service.delete(this.city);
        List<City> listCity = this.service.findAll();
        assertEquals(0, listCity.size());
    }
}
