package io.integral.refactorme.licenses;

import javax.persistence.Entity;

@Entity
public class License {

    private String number;

    public License(String number) {
        this.number = number;
    }
}
