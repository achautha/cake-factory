package com.cakefactory.account.persistence;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class AccountEntity {
    @Id
    @Email
    private String email;

    @NotBlank
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AccountEntity that = (AccountEntity) o;
        return email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "AccountEntity{" + "email='" + email + '\'' + '}';
    }

}
