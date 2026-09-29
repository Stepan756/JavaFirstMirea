package ru.mirea.task2.n6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(1, 1, 5);
        Circle c3 = new Circle(2, 2, 3);

        System.out.println(c1);
        System.out.println("Площадь: " + c1.getArea());
        System.out.println("Длина окружности: " + c1.getLength());

        System.out.println();

        System.out.println(c2);
        System.out.println("Площадь: " + c2.getArea());
        System.out.println("Длина окружности: " + c2.getLength());

        System.out.println();

        System.out.println(c3);
        System.out.println("Площадь: " + c3.getArea());
        System.out.println("Длина окружности: " + c3.getLength());

        System.out.println();

        System.out.println("c1 и c2 равны по радиусу? " + c1.compare(c2));
        System.out.println("c1 и c3 равны по радиусу? " + c1.compare(c3));
    }
}