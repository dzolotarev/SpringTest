package org.example.animals;

import org.example.animals.entities.Cat;
import org.example.animals.entities.Dog;
import org.example.animals.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Denis Zolotarev
 */
public class Main {
    public static void main(String[] args) {
        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example.animals.entities");
        Cat cat = applicationContext.getBean(Cat.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        Parrot parrot = applicationContext.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
        System.out.println();


    }

}
