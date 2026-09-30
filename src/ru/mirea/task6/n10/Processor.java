package ru.mirea.task6.n10;

public class Processor {
    private String model;
    private double frequencyGHz;

    public Processor(String model, double frequencyGHz) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
    }

    @Override
    public String toString() {
        return model + " (" + frequencyGHz + " GHz)";
    }
}