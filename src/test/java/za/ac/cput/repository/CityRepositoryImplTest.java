package za.ac.cput.repository;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import za.ac.cput.domain.City;
import za.ac.cput.factory.CityFactory;

public class CityRepositoryImplTest extends TestCase {

    private City city;
    private CityRepository repository;

    @BeforeEach public void setUp(){
        this.city = CityFactory.build("test-id","test-name");
        this.repository = CityRepositoryImpl.cityRepository();
    }

    @AfterEach public void tearDown(){
        this.repository.delete(this.city);
    }

    @Test
    void Save() {
        City saved = this.repository.save(this.city);
        assertNotNull(saved);
        assertSame(this.city,saved);
    }

    public void testRead() {
    }

    public void testDelete() {
    }

    public void testFindAll() {
    }
}