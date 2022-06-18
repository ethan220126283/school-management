package za.ac.cput.service.impl;
/*
        AddressServiceImpl.java
        Address Service
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 15 June 2022
 */
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.Address;
import za.ac.cput.repository.AddressRepository;
import za.ac.cput.repository.Impl.AddressRepositoryImpl;
import za.ac.cput.service.IAddressService;
import java.util.List;
import java.util.Optional;

public class AddressServiceImpl implements IAddressService {

    private final AddressRepository repository;
    private static IAddressService ADDRESS_SERVICE;

    private AddressServiceImpl(){
        this.repository = AddressRepositoryImpl.addressRepository();
    }

    public static IAddressService getService(){
        if(ADDRESS_SERVICE == null)
            ADDRESS_SERVICE = new AddressServiceImpl();
        return ADDRESS_SERVICE;
    }
    @Override
    public Address save(Address address) {
        return this.repository.save(address);
    }

    @Override
    public Optional<Address> read(String streetNumber) {
        return this.repository.read(streetNumber);
    }

    @Override
    public void delete(Address address) {
        this.repository.delete(address);
    }
    @Override
    public List<Address> findAll() {
        return this.repository.findAll();
    }
}
