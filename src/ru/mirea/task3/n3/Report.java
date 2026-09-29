package ru.mirea.task3.n3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("╔══════════════════════════╦══════════════════╗");
        System.out.println("║       Сотрудник          ║   Зарплата, руб. ║");
        System.out.println("╠══════════════════════════╬══════════════════╣");

        double total = 0;
        for (Employee e : employees) {
            // %-25s — строка, выровнена влево, ширина 25
            // %15.2f — число, выровнено вправо, ширина 15, 2 знака после запятой
            System.out.printf("║ %-25s ║ %15.2f ║%n",
                    e.getFullname(), e.getSalary());
            total += e.getSalary();
        }

        System.out.println("╠══════════════════════════╬══════════════════╣");
        System.out.printf("║ %-25s ║ %15.2f ║%n", "ИТОГО", total);
        System.out.println("╚══════════════════════════╩══════════════════╝");
    }
}