package za.ac.cput.factory;
/*
    Employee Address Factory Test
    Author: Lana Africa (216166640)
    Date: 11 June 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Country;
import za.ac.cput.domain.EmployeeAddress;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {
    Country country = CountryFactory.build("RSA","South Africa");
    City city = CityFactory.createCity("CPT", "Cape Town", country);
    Address address = AddressFactory.createAddress(
            "10",
            "Complex 1",
            "10",
            "Street Street",
            1000,
            city

    );

    @Test
    void buildWorking() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("1",address);
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }

    @Test
    void buildNotWorking() {
       Exception exception = assertThrows(IllegalArgumentException.class,
                () -> EmployeeAddressFactory.build(null, null));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }
}