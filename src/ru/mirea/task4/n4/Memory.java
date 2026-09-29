package ru.mirea.task4.n4;

public class Memory {
    private int sizeGB;
    private String type;   // DDR4, DDR5

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory{" + sizeGB + " GB " + type + "}";
    }
}