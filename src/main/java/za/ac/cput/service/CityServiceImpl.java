package za.ac.cput.service;

import za.ac.cput.domain.City;
import za.ac.cput.repository.CityRepository;
import za.ac.cput.repository.CityRepositoryImpl;

import java.util.Optional;

public class CityServiceImpl implements CityService{

    private final CityRepository repository;
    private static CityService SERVICE;

    public CityServiceImpl() {
        this.repository = CityRepositoryImpl.cityRepository();
    }

    public static CityService getSERVICE(){
        if (SERVICE == null)
            SERVICE = new CityServiceImpl();
        return SERVICE;
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
}
