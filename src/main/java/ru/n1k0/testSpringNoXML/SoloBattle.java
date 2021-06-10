package ru.n1k0.testSpringNoXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoloBattle {

    Unit unit;

    @Autowired
    public SoloBattle(@Qualifier("human") Unit unit) {
        this.unit = unit;
    }

    public void startBattle(){
            System.out.println("На арену вышел: " + unit.getName());
            unit.doBattleRoar();
    }

}
