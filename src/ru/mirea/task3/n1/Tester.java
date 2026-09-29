package ru.mirea.task3.n1;

import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        this.circles = new Circle[capacity];
        this.count = 0;
    }

    public void add(Circle c) {
        if (count < circles.length) {
            circles[count++] = c;
        }
    }

    public Circle getSmallest() {
        if (count == 0) return null;
        Circle smallest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle getLargest() {
        if (count == 0) return null;
        Circle largest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortByRadius() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("  " + circles[i]);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Tester tester = new Tester(5);

        // Радиус и координаты — случайные
        for (int i = 0; i < 5; i++) {
            double x = rand.nextDouble() * 10;
            double y = rand.nextDouble() * 10;
            double r = rand.nextDouble() * 5 + 1;   // [1; 6)
            tester.add(new Circle(new Point(x, y), r));
        }

        System.out.println("Все окружности:");
        tester.printAll();

        System.out.println("\nСамая маленькая: " + tester.getSmallest());
        System.out.println("Самая большая:   " + tester.getLargest());

        tester.sortByRadius();
        System.out.println("\nПосле сортировки по радиусу:");
        tester.printAll();
    }
}