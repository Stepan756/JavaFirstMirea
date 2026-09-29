package ru.mirea.task2.n4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer c) {
        computers.add(c);
        System.out.println("Добавлен: " + c.getName());
    }

    public boolean removeComputer(String name) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getName().equalsIgnoreCase(name)) {
                computers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Computer findComputer(String name) {
        for (Computer c : computers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public void printAll() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        System.out.println("Компьютеры в магазине:");
        for (Computer c : computers) {
            System.out.println("  " + c);
        }
    }
}