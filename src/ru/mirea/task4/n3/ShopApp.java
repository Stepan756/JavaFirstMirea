package ru.mirea.task4.n3;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === Аутентификация ===
        String correctLogin = "admin";
        String correctPassword = "1234";

        System.out.print("Логин: ");
        String login = sc.nextLine();
        System.out.print("Пароль: ");
        String password = sc.nextLine();

        if (!login.equals(correctLogin) || !password.equals(correctPassword)) {
            System.out.println("Неверный логин или пароль.");
            return;
        }

        System.out.println("Добро пожаловать, " + login + "!\n");

        // === Товары ===
        Shop shop = new Shop();
        shop.addProduct(new Product("Смартфон", 45000, Category.ELECTRONICS));
        shop.addProduct(new Product("Наушники", 8000, Category.ELECTRONICS));
        shop.addProduct(new Product("Футболка", 1500, Category.CLOTHING));
        shop.addProduct(new Product("Джинсы", 3500, Category.CLOTHING));
        shop.addProduct(new Product("Java. Полное руководство", 2500, Category.BOOKS));
        shop.addProduct(new Product("Хлеб", 50, Category.FOOD));

        // === Меню ===
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("  1. Показать каталоги");
            System.out.println("  2. Показать товары категории");
            System.out.println("  3. Добавить в корзину");
            System.out.println("  4. Купить");
            System.out.println("  0. Выход");
            System.out.print("Выбор: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    shop.showCategories();
                    break;
                case 2:
                    shop.showCategories();
                    System.out.print("Выберите номер категории: ");
                    int cat = sc.nextInt();
                    if (cat >= 1 && cat <= Category.values().length) {
                        shop.showProducts(Category.values()[cat - 1]);
                    } else {
                        System.out.println("Неверно.");
                    }
                    break;
                case 3:
                    System.out.print("Номер товара в списке всех товаров: ");
                    // для простоты пусть номер = индекс в массиве products
                    shop.addToCart(sc.nextInt());
                    break;
                case 4:
                    shop.checkout();
                    break;
                case 0:
                    System.out.println("Пока!");
                    sc.close();
                    return;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }
}