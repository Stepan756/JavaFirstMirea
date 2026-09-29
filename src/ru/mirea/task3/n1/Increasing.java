package ru.mirea.task3.n1;

import java.util.Random;

public class Increasing {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];

        // Генерация: [10; 99]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(90) + 10;   // 0..89 + 10 = 10..99
        }

        System.out.print("Массив: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Проверка строго возрастания
        boolean increasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {   // не строго больше — не возрастает
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Массив строго возрастающий.");
        } else {
            System.out.println("Массив НЕ строго возрастающий.");
        }
    }
}