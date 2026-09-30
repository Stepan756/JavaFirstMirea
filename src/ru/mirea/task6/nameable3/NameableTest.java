package ru.mirea.task6.nameable3;

public class NameableTest {
    public static void main(String[] args) {
        Nameable[] items = {
                new Planet("Земля", 5.97e24),
                new Car("Toyota Camry", 2020),
                new Animal("Рекс", "Собака")
        };

        for (Nameable n : items) {
            System.out.println(n.getClass().getSimpleName() +
                    " → имя: " + n.getName() + " (" + n + ")");
        }
    }
}