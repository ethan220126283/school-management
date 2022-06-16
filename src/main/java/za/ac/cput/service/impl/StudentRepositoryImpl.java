package za.ac.cput.service.impl;

import za.ac.cput.domain.Student;
import za.ac.cput.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepositoryImpl implements StudentRepository {

    private final List<Student> studentList;
    private static StudentRepositoryImpl STUDENT_REPOSITORY;

    private StudentRepositoryImpl() { this.studentList = new ArrayList<>(); }

    private static StudentRepositoryImpl studentRepository() {
        if (STUDENT_REPOSITORY == null)
            STUDENT_REPOSITORY = new StudentRepositoryImpl();
        return STUDENT_REPOSITORY;
    }

    public Student save(Student student) {
        Optional<Student> read = read(student.getStudentId());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.studentList.add(student);
        return student;
    }

    public Optional<Student> read(String id) {
        return this.studentList.stream().filter(s -> s.getStudentId().equalsIgnoreCase(id))
                .findFirst();
    }

    public void delete(Student student) { this.studentList.remove(student); }

    public List<Student> findAll() { return this.studentList; }
}
