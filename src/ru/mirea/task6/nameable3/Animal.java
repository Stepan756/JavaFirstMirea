package ru.mirea.task6.nameable3;

public class Animal implements Nameable {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + species + " по имени " + name + "}";
    }
}