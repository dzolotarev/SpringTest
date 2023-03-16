package org.example.animals.configs;

import org.example.animals.entities.Cat;
import org.example.animals.entities.Dog;
import org.example.animals.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Denis Zolotarev
 */
@Configuration
public class MyConfig {
    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean
    public Cat getCat() {
        return new Cat();
    }

    @Bean("parrot-kesha")
    public Object weNeedMoreParrots() {
        return new Parrot();
    }

    // Тут спринг увидит, что перед тем, как создавать этот бин — ему понадобится сюда передать
    // уже созданный бин попугайчика. Поэтому он выстроит цепочку вызовов наших методов так, чтобы
    // сначала вызвался метод по созданию попугайчика, а потом уже передаст этого попугайчика в метод
    // по созданию кота. Тут сработала та штука, которая называется dependency injection: спринг сам
    // передал нужный бин попугайчика в наш метод.
    @Bean
    public Cat getCat(Parrot parrot) { //dependency injection:
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
}
