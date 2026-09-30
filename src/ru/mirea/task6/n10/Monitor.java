package ru.mirea.task6.n10;

public class Monitor {
    private double diagonalInch;
    private String resolution;

    public Monitor(double diagonalInch, String resolution) {
        this.diagonalInch = diagonalInch;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return diagonalInch + "\" " + resolution;
    }
}