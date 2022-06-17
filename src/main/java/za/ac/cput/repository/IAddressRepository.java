package za.ac.cput.repository;
/*
        IAddressRepository.java
        IAddress Repository
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */
import za.ac.cput.domain.Address;

import java.util.List;


public interface IAddressRepository extends IRepository<Address, String>{
    List<Address> findAll();
}
