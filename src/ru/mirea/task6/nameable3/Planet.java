package ru.mirea.task6.nameable3;

public class Planet implements Nameable {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" + name + ", масса=" + mass + "}";
    }
}