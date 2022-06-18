package za.ac.cput.repository;
/*
    EmployeeRepository.java
    Employee Repository
    Author: Lana Africa (216166640)
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
Optional<Employee> findEmployeeEmail(String email);
}
