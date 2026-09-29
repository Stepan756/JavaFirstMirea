package ru.mirea.task4.n2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Надеваем юбку на женщину: " + this);
    }
}