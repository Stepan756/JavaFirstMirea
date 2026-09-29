package ru.mirea.task3.n3;

public class ReportTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иван Петров", 85000),
                new Employee("Мария Сидорова", 120500.5),
                new Employee("Алексей Кузнецов", 72000),
                new Employee("Ольга Смирнова", 98750.75)
        };

        Report.generateReport(employees);
    }
}