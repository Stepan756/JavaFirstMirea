package ru.mirea.task4.n3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();
    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showCategories() {
        System.out.println("Каталоги:");
        for (Category c : Category.values()) {
            System.out.println("  " + (c.ordinal() + 1) + ". " + c.getTitle());
        }
    }

    public void showProducts(Category category) {
        System.out.println("Товары в категории \"" + category.getTitle() + "\":");
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getCategory() == category) {
                System.out.println("  " + (i + 1) + ". " + p);
                found = true;
            }
        }
        if (!found) System.out.println("  (пусто)");
    }

    public void addToCart(int productIndex) {
        if (productIndex < 1 || productIndex > products.size()) {
            System.out.println("Неверный номер.");
            return;
        }
        cart.add(products.get(productIndex - 1));
        System.out.println("Добавлено: " + products.get(productIndex - 1));
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }
        double total = 0;
        System.out.println("Покупка:");
        for (Product p : cart) {
            System.out.println("  " + p);
            total += p.getPrice();
        }
        System.out.printf("Итого: %.2f руб.%n", total);
        cart.clear();
    }
}