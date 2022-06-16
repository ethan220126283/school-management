package za.ac.cput.factory;

/* Student#: 220126283
 *  Name: Ethan Christopher Swart
 *  Subject: ADP3
 * */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import za.ac.cput.domain.Name;

import javax.management.InvalidApplicationException;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    //Test for creating a name entity with all attributes
    @org.junit.jupiter.api.Test
    void createName() {
        Name name = NameFactory.createName(
                "James",
                "Jones",
                "Smith"
        );
        System.out.println(name);
        assertNotNull(name);
    }

    //Test for creating a name entity without middleName attribute
    @org.junit.jupiter.api.Test
    void createFirstAndLastName() {
        Name name = NameFactory.createName("James",null,"Smith");
        System.out.println(name);
        assertNotNull(name);
    }

    //Test for creating a name entity with no attributes
    @org.junit.jupiter.api.Test
    void createFailName() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Name name = NameFactory.createName(null,null,null);
                }, "IllegalArgumentException was expected");

        assertEquals("firstName and lastName mandatory attributes.",thrown.getMessage());
    }
}