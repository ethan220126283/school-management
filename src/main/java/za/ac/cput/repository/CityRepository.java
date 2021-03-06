package za.ac.cput.repository;

import za.ac.cput.domain.City;

import java.util.List;

/**
 * Working on findAll city
 * Student Number - 206006330
 */

public interface CityRepository extends IRepository<City, String>{

    List<City> findAll();
}
