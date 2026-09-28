package ru.mirea.task2.n3;

public class Tester {
    private Circle[] circles;   // массив окружностей
    private int count;          // сколько уже добавлено

    public Tester(int size) {
        this.circles = new Circle[size];
        this.count = 0;
    }

    public void add(Circle c) {
        if (count < circles.length) {
            circles[count] = c;
            count++;
        } else {
            System.out.println("Массив заполнен, нельзя добавить ещё.");
        }
    }

    public int getCount() {
        return count;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        tester.add(new Circle(new Point(0, 0), 5));
        tester.add(new Circle(new Point(1, 1), 2.5));
        tester.add(new Circle(new Point(-3, 4), 1));

        System.out.println("Всего окружностей: " + tester.getCount());
        System.out.println("Список:");
        tester.printAll();

        System.out.println("Площадь первой: " + tester.getCircles()[0].getArea());
        System.out.println("Длина второй: " + tester.getCircles()[1].getLength());
    }
}