package za.ac.cput.repository;
/*
    EmployeeAddressRepository.java
    Employee Address Repository
    Author: Lana Africa (216166640)
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Employee;

public interface EmployeeAddressRepository extends JpaRepository<Employee, String> {
}
