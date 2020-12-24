package com.cakefactory.account.persistence;

import com.cakefactory.account.Account;
import com.cakefactory.account.AccountService;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class JpaAccountService implements AccountService {

    private final AccountRepository accountRepo;
    private final PasswordEncoder passwordEncoder;

    public JpaAccountService(AccountRepository accountRepo, PasswordEncoder passwordEncoder) {
        this.accountRepo = accountRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void register(String email, String password) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setEmail(email);

        accountEntity.setPassword(this.passwordEncoder.encode(password));
        this.accountRepo.save(accountEntity);
    }

    @Override
    public Account find(String email) {
        AccountEntity accountEntity = this.accountRepo.findByEmail(email);
        return new Account(accountEntity.getEmail(), accountEntity.getPassword());
    }

    @Override
    public boolean exists(String email) {
        return this.accountRepo.findByEmail(email) != null;
    }

}
