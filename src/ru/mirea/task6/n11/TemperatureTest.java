package ru.mirea.task6.n11;

public class TemperatureTest {
    public static void main(String[] args) {
        double celsius = 25.0;

        Convertable[] converters = {
                new ToKelvin(),
                new ToFahrenheit()
        };

        System.out.printf("%.2f°C:%n", celsius);
        for (Convertable c : converters) {
            System.out.printf("  %-15s → %.2f%n",
                    c.getClass().getSimpleName(), c.convert(celsius));
        }
    }
}