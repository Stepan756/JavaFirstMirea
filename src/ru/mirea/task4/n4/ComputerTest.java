package ru.mirea.task4.n4;

public class ComputerTest {
    public static void main(String[] args) {
        Computer pc1 = new Computer(
                Brand.ASUS,
                new Processor("Intel Core i7-12700", 3.6),
                new Memory(16, "DDR4"),
                new Monitor(27, "2560x1440")
        );

        Computer pc2 = new Computer(
                Brand.APPLE,
                new Processor("Apple M2", 3.5),
                new Memory(8, "Unified"),
                new Monitor(13.3, "2560x1600")
        );

        System.out.println(pc1);
        System.out.println();
        System.out.println(pc2);
    }
}