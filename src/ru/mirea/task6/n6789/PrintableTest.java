package ru.mirea.task6.n6789;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Евгений Онегин", "Пушкин"),
                new Shop("Пятёрочка", "ул. Ленина, 5"),
                new Book("Война и мир", "Толстой"),
                new Shop("Магнит", "пр. Мира, 12")
        };

        for (Printable p : items) {
            p.print();
        }
    }
}