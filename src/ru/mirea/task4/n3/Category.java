package ru.mirea.task4.n3;

public enum Category {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    BOOKS("Книги"),
    FOOD("Продукты");

    private final String title;

    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}