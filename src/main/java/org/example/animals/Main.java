package org.example.animals;

import org.example.animals.configs.MyConfig;
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
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        // ... new AnnotationConfigApplicationContext(MyConfig.class, MyAnotherConfig.class);
        // ... new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals.configs");
        // ... new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals.database.configs",
        //		"ru.javarush.info.fatfaggy.animals.root.configs",
        //		"ru.javarush.info.fatfaggy.animals.web.configs");
        // ... new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals");

        Cat cat = applicationContext.getBean(Cat.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        Parrot parrot = applicationContext.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
        System.out.println();


    }

}
