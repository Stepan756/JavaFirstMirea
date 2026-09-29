package ru.mirea.task4.n2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Надеваем штаны на мужчину: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Надеваем штаны на женщину: " + this);
    }
}