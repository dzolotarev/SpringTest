package org.example.animals.entities;

import org.springframework.stereotype.Component;

/**
 * @author Denis Zolotarev
 */
@Component("parrot-kesha")
public class Parrot {
    private String name = "Кеша";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
