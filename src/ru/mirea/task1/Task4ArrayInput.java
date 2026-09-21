package ru.mirea.task1;

import java.util.Scanner;

public class Task4ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("write " + n + " elements ");
        int i = 0;
        do {
            arr[i] = sc.nextInt();
            i++;
        } while (i < n);

        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        int j = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (arr[j] < min) min = arr[j];
            if (arr[j] > max) max = arr[j];
            j++;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        sc.close();
    }
}
