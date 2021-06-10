package ru.n1k0.testSpringAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Undead extends Unit {
    public Undead(@Value("Мерзость") String name, @Value("7") double strength, @Value("3")double speed) {
        super(name, strength, speed);
    }

    @Override
    public void doBattleRoar() {
        System.out.println("За Нерзула!");
    }

    @Override
    public void doVictoryRoar() {
        System.out.println("Хозяин будет доволен!");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getStrength() {
        return super.getStrength();
    }

    @Override
    public void setStrength(double strength) {
        super.setStrength(strength);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
