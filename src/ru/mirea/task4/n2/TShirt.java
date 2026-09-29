package ru.mirea.task4.n2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Надеваем футболку на мужчину: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Надеваем футболку на женщину: " + this);
    }
}