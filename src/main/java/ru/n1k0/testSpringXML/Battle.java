package ru.n1k0.testSpringXML;

import java.util.List;

public class Battle {
    private String name;
    private List<Unit> units;

    public Battle(List<Unit> units, String name) {
        this.units = units;
    }

    public void startBattle(){
        for(Unit unit : units ){
            System.out.println("На арену " + name + " вышел: " + unit.getName());
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
