package ru.mirea.task6.priceable4;

public class RealEstate implements Priceable {
    private String address;
    private double pricePerSqM;
    private double area;

    public RealEstate(String address, double pricePerSqM, double area) {
        this.address = address;
        this.pricePerSqM = pricePerSqM;
        this.area = area;
    }

    @Override
    public double getPrice() {
        return pricePerSqM * area;
    }

    @Override
    public String toString() {
        return "RealEstate{" + address + ", " + area + " м²}";
    }
}