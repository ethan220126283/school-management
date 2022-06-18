package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.domain.Student;
import za.ac.cput.service.StudentService;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentServiceImplTest {

    private final Student student = StudentFactory.createStudent("test-id","test@mail.com",
            NameFactory.createName("James","John","Smith"));

    @Autowired private StudentService service;

    @Test
    @Order(1)
    void save() {
        Student saved = this.service.save(this.student);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.student, saved)
        );
    }

}