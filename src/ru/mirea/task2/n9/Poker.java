package ru.mirea.task2.n9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Создаём колоду
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"};

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }

        // 2. Перетасовываем
        Collections.shuffle(deck);

        // 3. Спрашиваем количество игроков
        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        // 4. Проверяем, хватит ли карт
        if (n * 5 > deck.size()) {
            System.out.println("Недостаточно карт для " + n + " игроков.");
            return;
        }

        // 5. Раздаём карты
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                String card = deck.remove(0);
                System.out.print(card + " ");
            }
            System.out.println();
            System.out.println();
        }

        sc.close();
    }
}