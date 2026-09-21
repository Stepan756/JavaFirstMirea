package ru.mirea.task1;

public class Task3ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("sum of el: " + sum);
        System.out.println("average: " + average);
    }
}