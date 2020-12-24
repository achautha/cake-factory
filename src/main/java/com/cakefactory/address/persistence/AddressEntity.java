package com.cakefactory.address.persistence;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "address")
@Getter
@Setter
public class AddressEntity {

    @Email
    @Id
    private String email;

    @NotBlank
    private String addressLine1;

    @NotBlank
    private String addressLine2;

    @NotBlank
    private String postcode;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AddressEntity that = (AddressEntity) o;
        return email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "AddressEntity{" + "email='" + email + '\'' + ", addressLine1='" + addressLine1 + '\''
                + ", addressLine2='" + addressLine2 + '\'' + ", postcode='" + postcode + '\'' + '}';
    }
}
