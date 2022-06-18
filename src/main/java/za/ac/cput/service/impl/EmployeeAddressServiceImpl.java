package za.ac.cput.service.impl;
/*
    EmployeeAddressServiceImpl.java
    Employee Address Service Impl
    Lana Africa (216166640)
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.repository.EmployeeAddressRepository;
import za.ac.cput.service.IEmployeeAddressService;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeAddressServiceImpl implements IEmployeeAddressService {
    private final EmployeeAddressRepository repository;

    @Autowired
    public EmployeeAddressServiceImpl(EmployeeAddressRepository repository){
        this.repository = repository;
    }
    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {return this.repository.save(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> findAll() {return this.repository.findAll();
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public Optional<EmployeeAddress> read(String id){
        return this.repository.findById(id);
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
    }
}
