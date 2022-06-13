package za.ac.cput.factory;
import org.junit.jupiter.api.Assertions;
/*
        Student: Darryll Merkeur (220253595)
        Date: 18 June 2022
*/
import za.ac.cput.domain.Country;
import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    @org.junit.jupiter.api.Test
    public void createCountry(){
        Country country = CountryFactory.createCountry("Kongo","KONG456");
        assertNotNull(country);
        System.out.println(country);
    }
    @org.junit.jupiter.api.Test
    void createId(){
        Country country = CountryFactory.createCountry("South Africa","STUD12365");
        assertNotNull(country);
        System.out.println(country);


    }


}
