package za.ac.cput.repository;
/*
    EmployeeRepository.java
    Employee Repository
    Author: Lana Africa (216166640)
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
