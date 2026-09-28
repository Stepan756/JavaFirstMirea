package ru.mirea.task2.n2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.5, 2.5);
        System.out.println(b1);

        b1.move(3, 4);
        System.out.println("После move(3, 4): " + b1);

        Ball b2 = new Ball();
        b2.setXY(10, 20);
        System.out.println("b2: " + b2);
    }
}