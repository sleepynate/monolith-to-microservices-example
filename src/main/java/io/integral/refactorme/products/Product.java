package io.integral.refactorme.products;

import javax.persistence.Entity;

@Entity
public class Product {
    private int id;
    public Product(int id) {
        this.id = id;
    }
}
