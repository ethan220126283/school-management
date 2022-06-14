package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.StudentAddress;
import za.ac.cput.domain.Address;

public class StudentAddressFactoryTest extends TestCase {

   // Address ad = new Address();

   // String.valueOf(address))


    @Test
    public void test() throws IllegalAccessException {
        StudentAddress studentAddress= StudentAddressFactory.createStudent("fs",null);
        assertNotNull(studentAddress);
    }

}