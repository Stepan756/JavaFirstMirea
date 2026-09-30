package ru.mirea.task6.n10;

import java.util.List;
import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Сколько компьютеров добавить? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Компьютер №" + (i + 1));
            System.out.print("  Марка (ASUS/LENOVO/HP/DELL/APPLE/ACER): ");
            String brandStr = sc.nextLine().toUpperCase();

            Brand brand;
            try {
                brand = Brand.valueOf(brandStr);
            } catch (IllegalArgumentException e) {
                System.out.println("  Неизвестная марка, пропускаем.");
                i--;
                continue;
            }

            System.out.print("  Процессор: ");
            String procModel = sc.nextLine();
            System.out.print("  Частота (GHz): ");
            double freq = sc.nextDouble();
            sc.nextLine();

            System.out.print("  Память (GB): ");
            int memSize = sc.nextInt();
            sc.nextLine();
            System.out.print("  Тип памяти (DDR4/DDR5): ");
            String memType = sc.nextLine();

            System.out.print("  Диагональ монитора: ");
            double diag = sc.nextDouble();
            sc.nextLine();
            System.out.print("  Разрешение: ");
            String res = sc.nextLine();

            System.out.print("  Цена: ");
            double price = sc.nextDouble();
            sc.nextLine();

            shop.add(new Computer(brand,
                    new Processor(procModel, freq),
                    new Memory(memSize, memType),
                    new Monitor(diag, res),
                    price));
        }

        System.out.println("\nВсе компьютеры:");
        shop.printAll();

        System.out.print("\nПоиск по марке: ");
        String query = sc.nextLine();
        List<Computer> found = shop.find(query);
        if (found.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            System.out.println("Найдено:");
            for (Computer c : found) System.out.println("  " + c);
        }

        sc.close();
    }
}