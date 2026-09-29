package ru.mirea.task2.n10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String line = sc.nextLine();

        // Если строка пустая или состоит только из пробелов — 0 слов
        if (line.trim().isEmpty()) {
            System.out.println("Слов: 0");
            return;
        }

        // Разбиваем по пробельным символам
        String[] words = line.trim().split("\\s+");

        System.out.println("Слов: " + words.length);

        sc.close();
    }
}