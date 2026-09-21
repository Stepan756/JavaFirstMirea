package ru.mirea.task1;

public class Task7Factorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        long fact = factorial(num);
        System.out.println(num + "! = " + fact);

        // Проверка на других числах
        System.out.println("3! = " + factorial(3));
        System.out.println("7! = " + factorial(7));
    }
}