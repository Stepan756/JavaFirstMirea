package ru.mirea.task6.n13;

public class ObserverTest {
    public static void main(String[] args) {
        ObservableStringBuilder msb = new ObservableStringBuilder();

        // Создаём наблюдателей
        Observer console = new ConsoleLogger("Console");
        Observer length = new LengthLogger();
        Observer file = new FileLogger();

        // Подписываем
        System.out.println("=== Подписываем двух наблюдателей ===");
        msb.subscribe(console);
        msb.subscribe(length);

        // Изменяем — оба получают уведомление
        System.out.println("\n=== append(\"Привет\") ===");
        msb.append("Привет");

        System.out.println("\n=== append(\", мир!\") ===");
        msb.append(", мир!");

        // Подписываем третьего
        System.out.println("\n=== Подписываем третьего ===");
        msb.subscribe(file);

        System.out.println("\n=== append(\"!!!\") — теперь три наблюдателя ===");
        msb.append("!!!");

        // Отписываем второго
        System.out.println("\n=== Отписываем LengthLogger ===");
        msb.unsubscribe(length);

        System.out.println("\n=== reverse() — теперь два наблюдателя ===");
        msb.reverse();

        System.out.println("\n=== Итоговая строка: " + msb);
    }
}