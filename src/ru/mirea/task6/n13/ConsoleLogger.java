package ru.mirea.task6.n13;

public class ConsoleLogger implements Observer {
    private String name;

    public ConsoleLogger(String name) {
        this.name = name;
    }

    @Override
    public void onUpdate(String newValue) {
        System.out.println("[" + name + "] Новое значение: \"" + newValue + "\"");
    }
}