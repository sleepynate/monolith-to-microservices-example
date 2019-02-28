package io.integral.refactorme.models;

import javax.persistence.Entity;

@Entity
public class Account {
    private int id;

    public Account(int id) {

        this.id = id;
    }
}
