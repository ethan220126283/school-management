package za.ac.cput.service;
/*
    IEmployeeService.java
    IEmployeeService
    Lana Africa (216166640)
 */
import za.ac.cput.domain.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee, String> {
    List<Employee> findAll();
    void deleteById(String id);
}