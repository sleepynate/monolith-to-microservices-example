package io.integral.refactorme.models;

import javax.persistence.Entity;

@Entity
public class License {

    private String number;

    public License(String number) {
        this.number = number;
    }
}
