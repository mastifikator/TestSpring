package ru.n1k0.testSpringNoXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Battle {
    private String name;
    private List<Unit> units;

    @Autowired
    public Battle(List<Unit> units, @Value("${battle.name}") String name) {
        this.name = name;
        this.units = units;
    }

    public void startBattle(){
        for(Unit unit : units ){
            System.out.println("На арену " + name + " вышел: " + unit.getName());
            System.out.println(unit);
            unit.doBattleRoar();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
