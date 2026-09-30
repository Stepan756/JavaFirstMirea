package ru.mirea.task6.n11;

public class ToFahrenheit implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}