package za.ac.cput.repository;
/*
        AddressRepository.java
        Address Repository
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */

import za.ac.cput.domain.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressRepository implements IAddressRepository{

    private final List<Address> addressList;
    private static AddressRepository ADDRESS_REPOSITORY;

    private AddressRepository(){
        this.addressList = new ArrayList<>();
    }

    public static AddressRepository addressRepository(){
        if(ADDRESS_REPOSITORY == null)
            ADDRESS_REPOSITORY = new AddressRepository();
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

    public Optional<Address> read(String unitNumber)
    {
        return this.addressList.stream().filter(u -> u.getUnitNumber().equalsIgnoreCase(unitNumber))
                .findFirst();

    }

    public void delete(Address address){

        this.addressList.remove(address);
    }

    public List<Address> findAll(){
        return this.addressList;
    }
}
