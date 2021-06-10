package ru.n1k0.testSpringXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Battle battle1 = context.getBean("battle", Battle.class);
        Battle battle2 = context.getBean("battle", Battle.class);
        battle2.setName("Дуротар");

        battle1.startBattle();
        System.out.println();
        battle2.startBattle();

        context.close();
    }
}
