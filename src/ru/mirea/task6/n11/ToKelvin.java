package ru.mirea.task6.n11;

public class ToKelvin implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}