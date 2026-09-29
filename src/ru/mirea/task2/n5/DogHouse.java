package ru.mirea.task2.n5;

public class DogHouse {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Рекс", 3);
        dogs[1] = new Dog("Бим", 5);
        dogs[2] = new Dog("Лайка", 2);

        System.out.println("Собаки в питомнике:");
        for (Dog d : dogs) {
            System.out.println("  " + d);
        }

        // Демонстрация сеттеров
        System.out.println();
        dogs[0].setName("Рекс Великий");
        dogs[0].setAge(4);
        System.out.println("После переименования: " + dogs[0]);

        // Демонстрация геттеров отдельно
        System.out.println();
        System.out.println("Кличка первой: " + dogs[0].getName());
        System.out.println("Возраст первой (собачьи года): " + dogs[0].getAge());
        System.out.println("Возраст первой (человеческие): " + dogs[0].getHumanAge());
    }
}