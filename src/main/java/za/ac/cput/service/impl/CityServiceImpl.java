package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.City;
import za.ac.cput.repository.CityRepository;
import za.ac.cput.service.ICityService;

import java.util.List;
import java.util.Optional;

/**
 * Working on city service impl
 * Student Number - 206006330
 */
@Service
public class CityServiceImpl implements ICityService {
    private final CityRepository repository;

    @Autowired
    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public City save(City city) {
        return this.repository.save(city);
    }

    @Override
    public Optional<City> read(String s) {
        return this.repository.read(s);
    }

    @Override
    public void delete(City city) {
        this.repository.delete(city);
    }

    @Override
    public List<City> findAll() {
        return this.repository.findAll(); }

    @Override
    public void deleteById(String id) {
        Optional<City> city = read(id);
        if (city.isPresent()) delete(city.get());
    }
}
