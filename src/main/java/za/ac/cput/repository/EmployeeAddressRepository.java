package za.ac.cput.repository;
/*
    EmployeeAddressRepository.java
    Employee Address Repository
    Author: Lana Africa (216166640)
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.EmployeeAddress;


@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {

}
