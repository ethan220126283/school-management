package za.ac.cput.repository.Impl;
/*
        AddressRepositoryImpl.java
        Address Repository
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */
import za.ac.cput.domain.Address;
import za.ac.cput.repository.AddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressRepositoryImpl implements AddressRepository {

    private final List<Address> addressList;
    private static AddressRepositoryImpl ADDRESS_REPOSITORY;

    private AddressRepositoryImpl(){
        this.addressList = new ArrayList<>();
    }

    public static AddressRepositoryImpl addressRepository(){
        if(ADDRESS_REPOSITORY == null)
            ADDRESS_REPOSITORY = new AddressRepositoryImpl();
        return ADDRESS_REPOSITORY;
    }

    public Address save(Address address){
        Optional<Address> read = read(address.getUnitNumber());
        if(read.isPresent()){
            delete(read.get());
        }
        this.addressList.add(address);
        return address;
    }

    public Optional<Address> read(String streetNumber)
    {
        return this.addressList.stream().filter(a -> a.getStreetNumber().equalsIgnoreCase(streetNumber))
                .findFirst();

    }

    public void delete(Address address){

        this.addressList.remove(address);
    }

    public List<Address> findAll(){
        return this.addressList;
    }
}
