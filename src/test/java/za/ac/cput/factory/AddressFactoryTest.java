package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Name;

import static org.junit.jupiter.api.Assertions.*;


class AddressFactoryTest  {

    @org.junit.jupiter.api.Test
    void createAddress() {
        Address address = AddressFactory.createAddress(
                "H0307",
                "Strubenpark",
                "123",
                "MainStreet",
                7755
        );
        System.out.println(address);
        assertNotNull(address);
    }

    @org.junit.jupiter.api.Test
    void createFailAddress() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Address address = AddressFactory.createAddress("H0307","Strubenpark","", "", 999);
                }, "IllegalArgumentException was expected");

        assertEquals("streetNumber, streetName, postalCode and city mandatory attributes.",thrown.getMessage());
    }

}
