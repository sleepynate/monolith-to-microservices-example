package io.integral.refactorme.accounts;

import javax.persistence.Entity;

@Entity
public class Account {
    private int id;

    public Account(int id) {

        this.id = id;
    }
}
