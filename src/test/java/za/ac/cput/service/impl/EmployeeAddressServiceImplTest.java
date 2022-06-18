package za.ac.cput.service.impl;
/*
    Employee Address Service Impl Test
    Lana Africa (216166640)
*/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.*;
import za.ac.cput.factory.*;
import za.ac.cput.service.IEmployeeAddressService;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

class EmployeeAddressServiceImplTest {

    private final Country country = CountryFactory.createCountry("South Africa","12");
    private final City city = CityFactory.createCity("1","Cape Town",null);
    private final Address address = AddressFactory.createAddress("1", "Complex 1", "5", "Street Street",  1000, city);
    private final EmployeeAddress employeeAddress = EmployeeAddressFactory.build("12", address);

    @Autowired
    private IEmployeeAddressService service;

    @Test
    void save() {
        EmployeeAddress saveEmpAddress = this.service.save(this.employeeAddress);
        assertEquals(this.employeeAddress, saveEmpAddress);
    }

    @Test
    void read() {
        Optional<EmployeeAddress> read = this.service.read(this.employeeAddress.getStaffId());
        assertAll(() -> assertTrue(read.isPresent()), () -> assertEquals(this.employeeAddress, read.get()));
    }

    @Test
    void findAll() {
        List<EmployeeAddress> listEmployeeAddress = this.service.findAll();
        assertEquals(0, listEmployeeAddress.size());
    }

    @Test
    void delete() {
        this.service.delete(this.employeeAddress);
        List<EmployeeAddress> listEmployeeAddress = this.service.findAll();
        assertEquals(0, listEmployeeAddress.size());
    }
}
// Unsure, couldn't run test to check results