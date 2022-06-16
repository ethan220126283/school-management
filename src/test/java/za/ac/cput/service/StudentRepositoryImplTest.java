package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.Name;
import za.ac.cput.factory.NameFactory;
import za.ac.cput.factory.StudentFactory;

import javax.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryImplTest {

    @Test
    void testRepo() {
        EntityManager em = null;
        StudentRepositoryImpl sr = new StudentRepositoryImpl(em);
        List<Student> students = new ArrayList<Student>();

        Name name = NameFactory.createName("James","Horatio","Smith");
        Student student = StudentFactory.createStudent("123","james@mail.com",name);

        System.out.println(students.toString());

        sr.create(student);
        students = sr.getAll();

        System.out.println(students.toString());
    }

}