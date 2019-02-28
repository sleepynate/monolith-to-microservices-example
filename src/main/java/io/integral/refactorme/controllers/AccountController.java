package io.integral.refactorme.controllers;

import io.integral.refactorme.models.Account;
import io.integral.refactorme.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountRepository repo;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return repo.findAll();
    }
}
