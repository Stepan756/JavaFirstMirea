package ru.mirea.task3.n3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Товары (название, цена в рублях)
        String[] names = {"Клавиатура", "Мышь", "Монитор"};
        double[] prices = {3500, 1500, 25000};

        System.out.println("Доступные товары:");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("  %d. %s — %.2f руб.%n", i + 1, names[i], prices[i]);
        }

        System.out.print("\nВыберите номер товара: ");
        int choice = sc.nextInt() - 1;

        if (choice < 0 || choice >= names.length) {
            System.out.println("Неверный выбор.");
            return;
        }

        System.out.print("Сколько штук? ");
        int qty = sc.nextInt();

        double totalRub = prices[choice] * qty;

        // Выбор валюты
        System.out.println("\nВалюта оплаты:");
        System.out.println("  1. Рубли (RUB)");
        System.out.println("  2. Доллары (USD)");
        System.out.println("  3. Евро (EUR)");
        System.out.print("Ваш выбор: ");
        int currency = sc.nextInt();

        // Курсы
        double usdRate = 92.5;
        double eurRate = 100.3;

        NumberFormat fmt;
        double result;

        switch (currency) {
            case 1:
                fmt = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
                result = totalRub;
                break;
            case 2:
                fmt = NumberFormat.getCurrencyInstance(Locale.US);
                result = totalRub / usdRate;
                break;
            case 3:
                fmt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                result = totalRub / eurRate;
                break;
            default:
                System.out.println("Неверная валюта.");
                return;
        }

        System.out.printf("%nИтог: %s × %d = %s%n",
                names[choice], qty, fmt.format(result));

        sc.close();
    }
}