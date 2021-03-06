package io.integral.refactorme.licenses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LicenseController {

    @Autowired
    LicenseRepository repo;

    @GetMapping("/licenses")
    public List<License> getAccounts() {
        return repo.findAll();
    }

}
