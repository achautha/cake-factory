package com.cakefactory.user;

public interface AddressService {

    Address save(Address address);

    Address getByEmail(String email);
}
