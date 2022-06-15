package za.ac.cput.repository;

import za.ac.cput.domain.Student;
import java.util.List;

public interface StudentRepository {

    Student read(String id);

    List<Student> getAll();

    Student create(Student s);

    void delete(Student s);
}
