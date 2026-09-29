package ru.mirea.task3.n1;

import java.util.Random;
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Ввод n с проверкой
        while (true) {
            System.out.print("Введите n (натуральное, > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
            } else {
                sc.next();   // съесть некорректный ввод
            }
            System.out.println("Ошибка. Попробуйте снова.");
        }

        // Первый массив
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);   // [0; n]
        }

        System.out.print("Исходный массив: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Подсчёт чётных
        int evenCount = 0;
        for (int x : arr) {
            if (x % 2 == 0) evenCount++;
        }

        if (evenCount == 0) {
            System.out.println("Чётных элементов нет.");
            return;
        }

        // Второй массив
        int[] evens = new int[evenCount];
        int idx = 0;
        for (int x : arr) {
            if (x % 2 == 0) evens[idx++] = x;
        }

        System.out.print("Чётные элементы: ");
        for (int x : evens) System.out.print(x + " ");
        System.out.println();

        sc.close();
    }
}