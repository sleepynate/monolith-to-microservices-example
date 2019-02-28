package io.integral.refactorme.licenses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class License {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String number;

    public License(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
