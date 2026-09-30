package ru.mirea.task6.n10;

public class Computer implements Sellable, Searchable {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private double price;

    public Computer(Brand brand, Processor processor, Memory memory,
                    Monitor monitor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    @Override
    public String getName() {
        return brand.name();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean matches(String query) {
        return brand.name().toLowerCase().contains(query.toLowerCase());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand=" + brand +
                ", processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", price=" + price +
                '}';
    }
}