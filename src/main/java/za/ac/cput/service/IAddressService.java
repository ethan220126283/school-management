package za.ac.cput.service;
/*
        IAddressService.java
        IAddress Service
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */
import za.ac.cput.domain.Address;
import za.ac.cput.service.IService;

import java.util.List;

public interface IAddressService extends IService <Address, String>{

    List<Address> findAll();
}
