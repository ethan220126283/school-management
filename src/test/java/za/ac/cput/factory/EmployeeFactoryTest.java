package za.ac.cput.factory;
/*
    Employee Factory Test
    Author: Lana Africa (216166640)
    Date: 11 June 2022
*/
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void buildWorking() {
        Employee employee = EmployeeFactory.build("1", "testmail@gmail.com", null);
        System.out.println(employee);
        assertNotNull(employee);
    }

    @Test
    void buildNotWorking() {
           IllegalArgumentException exception = Assertions
                   .assertThrows(IllegalArgumentException.class,
               () -> {Employee employee = EmployeeFactory.build(null, null, null);},
                    "IllegalArgumentException expected");
        //assertEquals("StaffID and email", "",exception.getMessage());
    }
   }