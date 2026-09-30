package ru.mirea.task6.movable12;

public class MovableRectangleTest {
    public static void main(String[] args) {
        MovableRectangle r = new MovableRectangle(0, 0, 100, 50, 5, 5);
        System.out.println("До: " + r);
        System.out.println("Скорости равны? " + r.isSpeedEqual());

        r.moveRight();
        r.moveDown();
        System.out.println("После движения: " + r);

        // Прямоугольник с разными скоростями
        MovableRectangle bad = new MovableRectangle(0, 0, 100, 50, 5, 10);
        System.out.println("\nСкорости равны? " + bad.isSpeedEqual());
        bad.moveRight();   // не сдвинется
        System.out.println("После попытки движения: " + bad);
    }
}