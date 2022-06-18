package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Country;
import java.util.List;
/*
        Student: Darryll Merkeur (220253595)
        Date: 18 June 2022
*/
@Repository
public interface CountryRepository extends JpaRepository<Country,Country.CountryId> {
    List<Country> findAll();
    List<Country> findByCountryId(String countryId);
}
