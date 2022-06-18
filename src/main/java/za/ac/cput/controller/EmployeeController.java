package za.ac.cput.controller;
/*
    EmployeeController.java
    Employee Controller
    Lana Africa (216166640)
*/
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;
import za.ac.cput.service.IEmployeeService;
import za.ac.cput.util.Helper;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("school-management/employee/")
@Slf4j
public class EmployeeController {
    private final IEmployeeService iEmployeeService;

    @Autowired
    EmployeeController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    @PostMapping("Save_Employee")
    public ResponseEntity<Employee> save(@Valid @RequestBody Employee employee) {
        log.info("Save request: {}", employee);
        Employee save = iEmployeeService.save(employee);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Employee> read(@PathVariable String id) {
        log.info("Read request: {}", id);
        Employee employee = this.iEmployeeService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Employee> delete(@PathVariable String id) {
        log.info("Read request: {}", id);
        this.iEmployeeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("FindAll")
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> employee = this.iEmployeeService.findAll();
        return ResponseEntity.ok(employee);
    }

    @GetMapping("readByEmail/{employeeEmail}")
    public ResponseEntity<Name> findEmployeeEmail(@PathVariable String email) {
        log.info("Employee name given by an email request{}", email);
        try {
            Helper.emailValid(email);
        } catch (IllegalArgumentException e) {
            log.info("Names giving an email request error: {}", e.getStackTrace());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        Employee employee = this.iEmployeeService.findEmployeeEmail(email).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        return ResponseEntity.ok(employee.getName());
    }
}