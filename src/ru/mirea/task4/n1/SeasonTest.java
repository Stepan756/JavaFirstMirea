package ru.mirea.task4.n1;

public class SeasonTest {
    public static void main(String[] args) {
        // 1. Любимое время года
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favorite.getDescription());

        System.out.println();

        // 2. Метод со switch
        printSeasonMessage(Season.WINTER);
        printSeasonMessage(Season.SUMMER);

        System.out.println();

        // 6. Цикл по всем временам года
        System.out.println("Все времена года:");
        for (Season s : Season.values()) {
            System.out.printf("  %-8s | %6.1f°C | %s%n",
                    s, s.getAverageTemperature(), s.getDescription());
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}