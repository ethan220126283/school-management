package za.ac.cput.controller;
/*
        EmployeeControllerTest.java
        EmployeeController Test
        Lana Africa(216166640)
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.NameFactory;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @LocalServerPort
    private int port;
    private String baseUrl;
    private Employee employee;

    @Autowired
    private TestRestTemplate restTemp;
    @Autowired
    private EmployeeController controller;

    @BeforeEach
    void setUp() {
        Name name = NameFactory.createName("Lana", "A", "Africa");
        this.employee = EmployeeFactory.build("1234", "216166640@mycput.ac.za", name);
        this.baseUrl = "http://localhost:" + this.port + "/school-management/employee/";
    }

    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemp.postForEntity(url, this.employee, Employee.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody()));
    }

    @Test
    @Order(2)
    void read() {
        String url = baseUrl + "read/" + this.employee.getStaffId();
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemp.getForEntity(url, Employee.class);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }


    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.employee.getStaffId();
        this.restTemp.delete(url);
    }

    @Test
    void findAll() {
        String url = baseUrl + "findAll";
        System.out.println(url);
        ResponseEntity<Employee[]> response = this.restTemp.getForEntity(url, Employee[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0));
    }


}