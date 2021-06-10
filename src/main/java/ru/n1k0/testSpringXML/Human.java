package ru.n1k0.testSpringXML;

public class Human extends Unit{
    public Human(String name, double strength, double speed) {
        super(name, strength, speed);
    }

    @Override
    public void doBattleRoar() {
        System.out.println("Во славу короля!");
    }

    @Override
    public void doVictoryRoar() {
        System.out.println("Во имя света!");
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
