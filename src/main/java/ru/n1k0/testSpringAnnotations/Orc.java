package ru.n1k0.testSpringAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Orc extends Unit {

    public Orc(@Value("Вася")String name, @Value("5")double strength, @Value("5")double speed) {
        super(name, strength, speed);
    }

    @Override
    public void doBattleRoar() {
        System.out.println("Лок тар огар!");
    }

    @Override
    public void doVictoryRoar() {
        System.out.println("За орду!");
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
