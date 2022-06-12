package za.ac.cput.factory;

import za.ac.cput.domain.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

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

    @org.junit.jupiter.api.Test
    void createNullName() {
        Name name = NameFactory.createName(null,null,null);
        System.out.println(name);
        assertNull(name);
    }

    @org.junit.jupiter.api.Test
    void createFirstName() {
        Name name = NameFactory.createName("James",null,null);
        System.out.println(name);
        assertNull(name);
    }

    @org.junit.jupiter.api.Test
    void createLastName() {
        Name name = NameFactory.createName(null,null,"Smith");
        System.out.println(name);
        assertNull(name);
    }

    @org.junit.jupiter.api.Test
    void createFirstAndLastName() {
        Name name = NameFactory.createName("James",null,"Smith");
        System.out.println(name);
        assertNotNull(name);
    }
}