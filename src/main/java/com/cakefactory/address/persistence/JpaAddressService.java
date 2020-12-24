package com.cakefactory.address.persistence;

import com.cakefactory.address.Address;
import com.cakefactory.address.AddressService;

import org.springframework.stereotype.Component;

@Component
public class JpaAddressService implements AddressService {

    private final AddressRepository addressRepo;
    private static final Address EMPTY_ADDRESS = new Address("", "", "");

    @Override
    public Address findOrEmpty(String email) {
        return this.addressRepo.findById(email)
                .map(entity -> new Address(entity.getAddressLine1(), entity.getAddressLine2(), entity.getPostcode()))
                .orElse(EMPTY_ADDRESS);
    }

    @Override
    public void update(String email, String addressLine1, String addressLine2, String postcode) {
        AddressEntity entity = new AddressEntity();
        entity.setEmail(email);
        entity.setAddressLine1(addressLine1);
        entity.setAddressLine2(addressLine2);
        entity.setPostcode(postcode);

        this.addressRepo.save(entity);

    }

    public JpaAddressService(AddressRepository addressRepo) {
        this.addressRepo = addressRepo;
    }

}
