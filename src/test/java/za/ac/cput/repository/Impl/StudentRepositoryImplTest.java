//220126283
/*package za.ac.cput.repository.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryImplTest {
    private Student student;
    private StudentRepository repository;

    @BeforeEach void setUp() {
        this.student = StudentFactory.createStudent("test-id","test@mail.com", NameFactory.createName("James","Stone","Smith"));
        this.repository = StudentRepositoryImpl.studentRepository();
    }

    @AfterEach void tearDown() {
        this.repository.delete(this.student);
    }

    @Test
    void save() {
        Student saved = this.repository.save(this.student);
        System.out.println(saved);
        assertNotNull(saved);
        assertSame(this.student, saved);
    }

    @Test
    void read() {
        Student saved = this.repository.save(this.student);
        Optional<Student> read = this.repository.read(saved.getStudentId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(saved, read.get())
        );
    }

    @Test
    void readFail() {
        Optional<Student> read = this.repository.read("dasdwe");
        assertFalse(read.isPresent());
    }

    @Test
    void delete() {
        Student saved = this.repository.save(this.student);
        List<Student> studentList = this.repository.findAll();
        assertEquals(1, studentList.size());
        this.repository.delete(saved);
        studentList = this.repository.findAll();
        assertEquals(0, studentList.size());
    }

    @Test
    void findAll() {
        Student saved = this.repository.save(this.student);
        List<Student> studentList = this.repository.findAll();
        assertEquals(1, studentList.size());
    }
}*/