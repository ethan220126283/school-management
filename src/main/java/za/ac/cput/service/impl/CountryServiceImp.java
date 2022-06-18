package za.ac.cput.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Country;
import za.ac.cput.repository.CountryRepository;
import za.ac.cput.service.CountryService;
import java.util.List;
import java.util.Optional;

public class CountryServiceImp implements CountryService {
    public final CountryRepository repository;
    @Autowired
    public CountryServiceImp(CountryRepository repository) {
        this.repository = repository;
    }
    @Override
    public Country save(Country country) {
        return this.repository.save(country);
    }
    @Override
    public Optional<Country> read(Country.CountryId countryId) {
        return this.repository.findById(countryId);
    }
    @Override
    public void delete(Country country){
        this.repository.delete(country);
    }
    @Override
    public List findByCountryId(String countryId) {
        return this.repository.findByCountryId(countryId);}
    @Override
    public List<Country> findAll(){
        return this.repository.findAll();
    }
}

