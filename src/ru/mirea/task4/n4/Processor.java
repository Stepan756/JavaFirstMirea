package ru.mirea.task4.n4;

public class Processor {
    private String model;
    private double frequencyGHz;

    public Processor(String model, double frequencyGHz) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
    }

    @Override
    public String toString() {
        return "Processor{" + model + ", " + frequencyGHz + " GHz}";
    }
}