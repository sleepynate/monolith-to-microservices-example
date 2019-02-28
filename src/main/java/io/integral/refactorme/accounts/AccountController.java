package io.integral.refactorme.accounts;

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
