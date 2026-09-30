package ru.mirea.task6.priceable4;

public class PriceableTest {
    public static void main(String[] args) {
        Priceable[] items = {
                new Product("Ноутбук", 85000),
                new Service("Ремонт", 1500, 8),
                new RealEstate("ул. Пушкина, 10", 120000, 65)
        };

        double total = 0;
        for (Priceable p : items) {
            System.out.printf("%-40s — %10.2f руб.%n", p, p.getPrice());
            total += p.getPrice();
        }
        System.out.printf("%-40s — %10.2f руб.%n", "ИТОГО", total);
    }
}