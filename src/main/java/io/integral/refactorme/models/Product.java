package io.integral.refactorme.models;

import javax.persistence.Entity;

@Entity
public class Product {
    private int id;
    public Product(int id) {
        this.id = id;
    }
}
