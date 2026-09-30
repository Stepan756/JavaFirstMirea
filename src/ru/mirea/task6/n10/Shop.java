package ru.mirea.task6.n10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void add(Computer c) {
        computers.add(c);
    }

    public boolean remove(String brand) {
        return computers.removeIf(c -> c.getName().equalsIgnoreCase(brand));
    }

    public List<Computer> find(String query) {
        List<Computer> found = new ArrayList<>();
        for (Computer c : computers) {
            if (c.matches(query)) found.add(c);
        }
        return found;
    }

    public void printAll() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        for (Computer c : computers) {
            System.out.println("  " + c);
        }
    }
}