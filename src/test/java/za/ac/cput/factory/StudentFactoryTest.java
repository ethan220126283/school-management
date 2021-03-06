package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;


public class StudentFactoryTest extends TestCase {


    @Test
    public void test() throws IllegalAccessException {
        Student student= StudentFactory.createStudent("ghdf","gdrg", NameFactory.createName("sfd","sdfd","sdf"));
        System.out.println(student);
        assertNotNull(student);
    }

}