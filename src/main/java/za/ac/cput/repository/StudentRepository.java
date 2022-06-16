package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.List;

public interface StudentRepository extends IRepository<Student, String>{
    List<Student> findAll();
}
