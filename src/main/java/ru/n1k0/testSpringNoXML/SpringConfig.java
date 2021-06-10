package ru.n1k0.testSpringNoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("ru.n1k0.testSpringNoXML")
@PropertySource("battle.properties")
public class SpringConfig {

    @Bean
    public Orc orc(){
        return new Orc("Вася", 5, 5);
    }

    @Bean
    public Human human(){
        return new Human("Иван", 6, 4);
    }

    @Bean
    public Undead undead(){
        return new Undead("Мерзота", 7, 3);
    }
}
