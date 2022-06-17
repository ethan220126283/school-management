package za.ac.cput.service;
/*
        AddressService.java
        Address Service
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */
import za.ac.cput.domain.Address;
import za.ac.cput.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

public class AddressService implements IAddressService {

    private final AddressRepository Repository;
    private static AddressService Service;

    private AddressService(){
        this.Repository = AddressRepository.addressRepository();
    }

    public static AddressService getService(){
        if(Service == null)
            Service = new AddressService();
        return Service;
    }
    @Override
    public Address save(Address address) {
        return this.Repository.save(address);
    }

    @Override
    public Optional<Address> read(String s) {
        return this.Repository.read(s);
    }

    @Override
    public void delete(Address address) {
        this.Repository.delete(address);
    }
    @Override
    public List<Address> findAll() {
        return this.Repository.findAll();
    }
}
