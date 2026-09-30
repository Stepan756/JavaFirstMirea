package ru.mirea.task6.n13;

public class FileLogger implements Observer {
    @Override
    public void onUpdate(String newValue) {
        System.out.println("  [Записано в файл]: " + newValue);
    }
}