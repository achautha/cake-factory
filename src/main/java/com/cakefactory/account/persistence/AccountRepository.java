package com.cakefactory.account.persistence;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, String> {
    AccountEntity findByEmail(String email);
}
