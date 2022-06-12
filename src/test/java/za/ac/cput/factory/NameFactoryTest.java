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
}