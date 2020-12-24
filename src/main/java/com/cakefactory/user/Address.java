package com.cakefactory.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    private final String email;
    private final String addressLine1;
    private final String addressLine2;
    private final String postCode;

}
