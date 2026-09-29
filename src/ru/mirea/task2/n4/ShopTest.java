package ru.mirea.task2.n4;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        // 1. Заполнение магазина с клавиатуры
        System.out.print("Сколько компьютеров добавить? ");
        int n = sc.nextInt();
        sc.nextLine();   // ← важно: съесть остаток строки после nextInt

        for (int i = 0; i < n; i++) {
            System.out.println("Компьютер №" + (i + 1));
            System.out.print("  Название: ");
            String name = sc.nextLine();

            System.out.print("  Цена: ");
            double price = sc.nextDouble();
            sc.nextLine();   // ← снова съесть остаток

            shop.addComputer(new Computer(name, price));
        }

        // 2. Показать всё, что добавили
        System.out.println();
        shop.printAll();

        // 3. Поиск
        System.out.print("\nВведите название для поиска: ");
        String searchName = sc.nextLine();
        Computer found = shop.findComputer(searchName);
        if (found != null) {
            System.out.println("Найден: " + found);
        } else {
            System.out.println("Компьютер не найден.");
        }

        // 4. Удаление
        System.out.print("\nВведите название для удаления: ");
        String delName = sc.nextLine();
        boolean removed = shop.removeComputer(delName);
        System.out.println(removed ? "Удалено." : "Не найдено для удаления.");

        // 5. Показать, что осталось
        System.out.println();
        shop.printAll();

        sc.close();
    }
}