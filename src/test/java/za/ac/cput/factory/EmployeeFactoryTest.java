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
    Name name = NameFactory.createName(
            "Lana",
            "",
            "Africa"
    );

    @Test
    void buildWorking() {
        Employee employee = EmployeeFactory.build("1", "testmail@gmail.com", name);
        System.out.println(employee);
        assertNotNull(employee);
    }

    @Test
    void buildNotWorking() {
           IllegalArgumentException exception = Assertions
                   .assertThrows(IllegalArgumentException.class,
               () -> {Employee employee = EmployeeFactory.build(null, null, null);},
                    "IllegalArgumentException expected");
    }

    @Test
    void buildNullEmail(){
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> EmployeeFactory.build("20", null, name));
        String message = exception.getMessage();
        System.out.println(message);
    }
   }