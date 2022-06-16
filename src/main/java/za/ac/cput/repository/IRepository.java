package za.ac.cput.repository;

import java.util.Optional;

/**
 * Working on Test CRUD
 * Student Number - 206006330
 * @param <T>
 * @param <ID>
 */

public interface IRepository <T, ID>{

    T save(T t);
    Optional<T> read(ID id);
    void delete(T t);
}
