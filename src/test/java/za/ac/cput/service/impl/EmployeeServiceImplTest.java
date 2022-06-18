package za.ac.cput.service.impl;
/*
    Employee Service Impl Test
    Lana Africa (216166640)
 */
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.service.IEmployeeService;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


@SpringBootTest
class EmployeeServiceImplTest {

    private final Name name = NameFactory.createName("Lana", "A", "Africa");
    private final Employee employee = EmployeeFactory.build("1234", "216166640@mycput.ac.za", name);

    @Autowired
    private IEmployeeService iEmployeeService;

    @Test
    void save() {
        Employee employeeSave = this.iEmployeeService.save(this.employee);
        assertEquals(this.employee, employeeSave);
    }
    @Test
    void read() {
        Optional<Employee> read = this.iEmployeeService.read(this.employee.getStaffId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.employee, read.get())
        );
    }
    @Test
    void findAll() {
        List<Employee> employeeList = this.iEmployeeService.findAll();
        assertEquals(0, employeeList.size());
    }
    @Test
    void delete() {
        this.iEmployeeService.delete(this.employee);
        List<Employee> listEmployee = this.iEmployeeService.findAll();
        assertEquals(0, listEmployee.size());
    }
}
// Unsure, couldn't run test to check results