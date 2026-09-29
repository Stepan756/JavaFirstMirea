package ru.mirea.task2.n8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};

        System.out.println("До:");
        printArray(arr);

        // Меняем местами элементы с двух концов
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("После:");
        printArray(arr);
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}