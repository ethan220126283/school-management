package za.ac.cput.controller;
/*
    EmployeeAddressController.java
    Employee Address Controller
    Lana Africa (216166640)
*/
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.service.IEmployeeAddressService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("school-management/employeeAddress/")
@Slf4j
public class EmployeeAddressController {
    private final IEmployeeAddressService iEmployeeAddressService;

    @Autowired
    EmployeeAddressController(IEmployeeAddressService iEmployeeAddressService) {
        this.iEmployeeAddressService = iEmployeeAddressService;
    }

    @PostMapping("Save_EmployeeAddress")
    public ResponseEntity<EmployeeAddress> save(@Valid @RequestBody EmployeeAddress employeeAddress) {
        log.info("Save request: {}", employeeAddress);
        EmployeeAddress save = iEmployeeAddressService.save(employeeAddress);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<EmployeeAddress> read(@PathVariable String id) {
        log.info("Read request: {}", id);
        EmployeeAddress employeeAddress = this.iEmployeeAddressService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(employeeAddress);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<EmployeeAddress> delete(@PathVariable String id) {
        log.info("Read request: {}", id);
        this.iEmployeeAddressService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("FindAll")
    public ResponseEntity<List<EmployeeAddress>> findAll() {
        List<EmployeeAddress> employeesAddress = this.iEmployeeAddressService.findAll();
        return ResponseEntity.ok(employeesAddress);
    }
}