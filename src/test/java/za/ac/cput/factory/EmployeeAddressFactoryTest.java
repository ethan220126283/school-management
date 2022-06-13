package za.ac.cput.factory;
/*
    Employee Address Factory Test
    Author: Lana Africa (216166640)
    Date: 11 June 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeAddress;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    void buildWorking() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("1",null);
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