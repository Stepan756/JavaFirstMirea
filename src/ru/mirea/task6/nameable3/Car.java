package ru.mirea.task6.nameable3;

public class Car implements Nameable {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" + name + ", " + year + "}";
    }
}