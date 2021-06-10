package ru.n1k0.testSpringNoXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        SoloBattle soloBattle = context.getBean("soloBattle", SoloBattle.class);
        Battle battle = context.getBean("battle", Battle.class);

        soloBattle.startBattle();
        System.out.println();
        battle.startBattle();

        context.close();
    }
}
