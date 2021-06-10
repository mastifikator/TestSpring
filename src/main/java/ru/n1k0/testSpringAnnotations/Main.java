package ru.n1k0.testSpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        SoloBattle soloBattle = context.getBean("soloBattle", SoloBattle.class);
        Battle battle = context.getBean("battle", Battle.class);

        battle.startBattle();

        context.close();
    }
}
