package ru.mirea.task6.movable12;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(5, 5, 1, 1);
        System.out.println("До: " + p);
        p.moveRight();
        p.moveDown();
        System.out.println("После moveRight и moveDown: " + p);

        MovableCircle c = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println("\nДо: " + c);
        c.moveUp();
        c.moveLeft();
        System.out.println("После moveUp и moveLeft: " + c);
    }
}