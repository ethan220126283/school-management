package za.ac.cput.service;

import za.ac.cput.domain.Student;
import za.ac.cput.repository.StudentRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private EntityManager em;

    public StudentRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Student read(String id) {
        return em.find(Student.class, id);
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student create(Student s) {
        if (s.getStudentId() == null) {
            em.persist(s);
        } else {
            s = em.merge(s);
        }
        return s;
    }

    @Override
    public void delete(Student s) {
        if (em.contains(s)) {
            em.remove(s);
        } else {
            em.merge(s);
        }
    }
}
