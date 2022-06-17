package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.repository.StudentRepository;

@Controller
@RequestMapping(path = "/demo")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewStudent (@RequestParam String email
    , @RequestParam Name name) {

        Student s = StudentFactory.createStudent(email,name);
        studentRepository.save(s);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
