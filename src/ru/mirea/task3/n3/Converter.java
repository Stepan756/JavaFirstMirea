package ru.mirea.task3.n3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Курсы (условные)
        double usdToRub = 92.5;
        double eurToRub = 100.3;
        double cnyToRub = 12.8;

        System.out.print("Введите сумму в рублях: ");
        double rub = sc.nextDouble();

        System.out.println("\nСумма в разных валютах:");

        // Форматирование с валютой
        NumberFormat rubFmt = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
        NumberFormat usdFmt = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat eurFmt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat cnyFmt = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println("Рубли:  " + rubFmt.format(rub));
        System.out.println("Доллары: " + usdFmt.format(rub / usdToRub));
        System.out.println("Евро:    " + eurFmt.format(rub / eurToRub));
        System.out.println("Юани:    " + cnyFmt.format(rub / cnyToRub));

        sc.close();
    }
}