package ru.mirea.task4.n2;

public class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "белый"),
                new Pants(Size.L, 3500, "чёрный"),
                new Skirt(Size.S, 2800, "красный"),
                new Tie(Size.XS, 900, "синий"),
                new TShirt(Size.XXS, 800, "детский жёлтый")
        };

        Atelier.dressWomen(clothes);
        System.out.println();
        Atelier.dressMan(clothes);
    }
}