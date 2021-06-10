package ru.n1k0.testSpringNoXML;

public abstract class Unit {

    private String name;
    private double strength;
    private double speed;

    public Unit(String name, double strength, double speed) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
    }

    public abstract void doBattleRoar();
    public abstract void doVictoryRoar();

    public void doDeath(){
        System.out.println("Уничтожен: " + this.toString());
    }

    public void doBorn(){
        System.out.println("Создан: " + this.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                ", hash=" + this.hashCode() +
                '}';
    }
}
