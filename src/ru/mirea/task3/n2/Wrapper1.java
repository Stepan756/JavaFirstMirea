package ru.mirea.task3.n2;

public class Wrapper1 {
    public static void main(String[] args) {
        // 1. Объекты Double через valueOf
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.718");
        Double d3 = Double.valueOf(42);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // 2. String → double через parseDouble
        String str = "1.4142";
        double parsed = Double.parseDouble(str);
        System.out.println("parseDouble(\"" + str + "\") = " + parsed);

        // 3. Double → все примитивные типы
        Double obj = 65.987;

        byte b = obj.byteValue();
        short s = obj.shortValue();
        int i = obj.intValue();
        long l = obj.longValue();
        float f = obj.floatValue();
        double d = obj.doubleValue();

        System.out.println("\nПреобразование Double → примитивы:");
        System.out.println("byte:   " + b);   // 65 (дробная часть отброшена)
        System.out.println("short:  " + s);   // 65
        System.out.println("int:    " + i);   // 65
        System.out.println("long:   " + l);   // 65
        System.out.println("float:  " + f);   // 65.987
        System.out.println("double: " + d);   // 65.987

        // 4. Вывод объекта Double
        System.out.println("\nЗначение объекта: " + obj);

        // 5. Литерал → String
        String strFromLiteral = Double.toString(3.14);
        System.out.println("Double.toString(3.14) = " + strFromLiteral);

        // Дополнительно: String → Double (не double, а объект)
        Double fromStr = Double.valueOf("2.5");
        System.out.println("Double.valueOf(\"2.5\") = " + fromStr);
    }
}