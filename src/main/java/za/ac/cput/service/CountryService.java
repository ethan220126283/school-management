package za.ac.cput.service;
import za.ac.cput.domain.Country;
import java.util.List;
/*
        Student: Darryll Merkeur (220253595)
        Date: 18 June 2022
*/
public interface CountryService extends IService<Country, Country.CountryId> {
    List<Country> findAll();
    List<Country>findByCountryId(String countryId);
}