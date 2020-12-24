package com.cakefactory.user;

public interface AccountService {

    Account save(Account account);

    Account getByEmail(String email);

}