package ru.mirea.task6.n13;

public class LengthLogger implements Observer {
    @Override
    public void onUpdate(String newValue) {
        System.out.println("  Длина строки: " + newValue.length());
    }
}