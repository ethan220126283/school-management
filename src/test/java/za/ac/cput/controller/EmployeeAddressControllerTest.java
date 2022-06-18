package za.ac.cput.controller;
/*
    EmployeeAddressControllerTest.java
    Employee Address Controller test
    Lana Africa (216166640)
 */

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.CityFactory;
import za.ac.cput.factory.EmployeeAddressFactory;
import java.util.Arrays;
import java.util.Objects;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeAddressControllerTest {


    @LocalServerPort
    int port;
    @Autowired
    private TestRestTemplate restTemp;
    private EmployeeAddress employeeAddress;
    private String baseUrl;

    @BeforeEach
    void setUp(){
        City city = CityFactory.createCity("12", "Cape Town",null);
        Address address = AddressFactory.createAddress("1", "Complex 1", "5", "Street Street", 1000,city);
        this.employeeAddress = EmployeeAddressFactory.build("12", address);
        this.baseUrl = "Http://localhost:" + this.port + "/school-management/employeeAddress";
    }
    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<EmployeeAddress> response = this.restTemp.postForEntity(url, this.employeeAddress, EmployeeAddress.class);
        System.out.println(response);
        assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()), () -> assertNotNull(response.getBody()));
    }
    @Test
    void read() {
        String url = baseUrl + "read/" + this.employeeAddress.getStaffId();
        ResponseEntity<EmployeeAddress> response = this.restTemp.getForEntity(url, EmployeeAddress.class);
        assertAll(
                () -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody()));
    }
    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.employeeAddress.getStaffId();
        this.restTemp.delete(url);
    }
    @Test
    void findAll() {
        String url = baseUrl + "all";
        ResponseEntity<EmployeeAddress[]> response = this.restTemp.getForEntity(url, EmployeeAddress[].class);
        System.out.println(Arrays.asList(Objects.requireNonNull(response.getBody())));
        assertAll(
                () -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> Assertions.assertEquals(0, response.getBody().length));
    }
}

// Unsure, couldn't run test to check results