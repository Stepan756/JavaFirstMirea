package ru.mirea.task3.n1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int n = 10;

        // === Подход 1: Math.random() ===
        double[] arr1 = new double[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Math.random() * 100;   // [0.0; 100.0)
        }
        System.out.println("Math.random() — до сортировки:");
        printArray(arr1);

        Arrays.sort(arr1);
        System.out.println("Math.random() — после сортировки:");
        printArray(arr1);

        System.out.println();

        // === Подход 2: класс Random ===
        Random rand = new Random();
        double[] arr2 = new double[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = rand.nextDouble() * 100;   // [0.0; 100.0)
        }
        System.out.println("Random — до сортировки:");
        printArray(arr2);

        Arrays.sort(arr2);
        System.out.println("Random — после сортировки:");
        printArray(arr2);
    }

    public static void printArray(double[] arr) {
        for (double x : arr) {
            System.out.printf("%.3f  ", x);
        }
        System.out.println();
    }
}