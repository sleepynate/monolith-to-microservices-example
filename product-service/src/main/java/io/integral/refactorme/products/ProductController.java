package io.integral.refactorme.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository repo;

    @GetMapping("/products")
    public List<Product> getAccounts() {
        return repo.findAll();
    }

}
