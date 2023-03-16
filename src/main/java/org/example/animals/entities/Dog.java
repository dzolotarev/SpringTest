package org.example.animals.entities;

import org.springframework.stereotype.Component;

/**
 * @author Denis Zolotarev
 */
@Component
public class Dog {
    private String name = "Бобик";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
