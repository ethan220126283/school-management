package za.ac.cput.service.impl;
/*
        AddressServiceImplTest.java
        Address Service Test
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 18 June 2022
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.*;
import za.ac.cput.factory.*;
import za.ac.cput.service.IAddressService;

import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class AddressServiceImplTest {

    private Country country;
    private City city;
    private Address address;
    private IAddressService service;

    @BeforeEach
    void setUp(){
        country = CountryFactory.build("2","South Africa");
        city = CityFactory.createCity("7", "Cape Town");
        address = AddressFactory.createAddress("H0307", "Struben Park", "123", "Main Street", 7755, city);

        this.service = AddressServiceImpl.getService();
    }

    @AfterEach
    void tearDown(){
        this.service.delete(this.address);

    }
    @Test
    public void save() {
        Address saveAddress = this.service.save(this.address);
        assertEquals(this.address, saveAddress);

    }

    @Test
    public void delete() {
        Address saveAddress = this.service.save(this.address);
        List<Address> addressList = this.service.findAll();
        assertEquals(1, addressList.size());
        this.service.delete(this.address);
        addressList = this.service.findAll();
        assertEquals(0, addressList.size());
    }

    @Test
    public void read() {
        Address saveAddress = this.service.save(this.address);
        Optional<Address> read = (this.service.read(saveAddress.getStreetNumber()));
        assertAll(

                () -> assertTrue(read.isPresent()),
                () -> assertEquals(saveAddress, read.get())
        );
    }

    @Test
    public void findAll(){
        this.service.save(this.address);
        List<Address> addressList = this.service.findAll();
        assertEquals(1, addressList.size());
    }

}

