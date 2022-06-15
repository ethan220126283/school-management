package za.ac.cput.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Country;
import za.ac.cput.repository.CountryInterfaceRepository;
import za.ac.cput.service.service.CountryService;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    public final CountryInterfaceRepository repository;

    @Autowired
    public CountryServiceImpl(CountryInterfaceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Country save(Country country) {
        return this.repository.save(country);
    }

    @Override
    public Optional<Country> read(Country.CountryIdentity countryIdentity) {
        return this.repository.findById(countryIdentity);
    }

    @Override
    public void delete(Country country) {
        this.repository.delete(country);
    }

    @Override
    public List<Country> findAll() {
        return this.repository.findAll();
    }


    @Override
    public List findByCountryId(String countryId) {
        return this.repository.findByCountryId(countryId);
    }
}
