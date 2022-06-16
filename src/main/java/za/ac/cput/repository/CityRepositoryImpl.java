package za.ac.cput.repository;

import za.ac.cput.domain.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityRepositoryImpl implements CityRepository{

    //CRUD data store

    /*public City create(City city){
        //save data store and return if success
        return city;
    }

    public City update(City city){
        //check if city exist, update and return if success
        return city;
    }

    public City read(String id){
        //find the city that matches the id and return if success
        return city;
    }

    public void delete(City city){
        //find the city if needed and also delete
    }

    public List<City> findAll(){
        //return all in your store
        return null;
    }*/

    private final List<City> cityList;
    private static CityRepositoryImpl CITY_REPOSITORY;

    private CityRepositoryImpl(){this.cityList = new ArrayList<>();
    }

    public static CityRepositoryImpl cityRepository(){
        if (CITY_REPOSITORY == null)
            CITY_REPOSITORY = new CityRepositoryImpl();
            return CITY_REPOSITORY;
    }

    public City save(City city){
        Optional<City> read = read(city.getId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.cityList.add(city);
        return city;
    }

    public Optional<City> read(String id){
        return this.cityList.stream().filter(g-> g.getId().equalsIgnoreCase(id))
                .findFirst();
    }
    public void delete(City city){
        this.cityList.remove(city);
    }


    public List<City> findAll() {
        return null;
    }
}
