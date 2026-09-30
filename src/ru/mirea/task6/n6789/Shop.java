package ru.mirea.task6.n6789;

public class Shop implements Printable {
    private String name;
    private String address;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("Магазин: \"" + name + "\" — " + address);
    }
}