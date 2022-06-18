package za.ac.cput.service;

import za.ac.cput.domain.City;

import java.util.List;

/**
 * Working on city service
 * Student Number - 206006330
 */

public interface ICityService extends IService<City, String>{
    List<City> findAll();
    void deleteById(String id);
}
