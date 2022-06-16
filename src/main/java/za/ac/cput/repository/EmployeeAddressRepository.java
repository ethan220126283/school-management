package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Employee;

public interface EmployeeAddressRepository extends JpaRepository<Employee, String> {
}
