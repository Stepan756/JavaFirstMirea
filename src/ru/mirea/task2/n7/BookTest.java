package ru.mirea.task2.n7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);

        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));
        shelf.addBook(new Book("Гоголь", "Мёртвые души", 1842));

        System.out.println("Всего книг на полке: " + shelf.getCount());

        System.out.println("\nИзначальный порядок:");
        shelf.printAll();

        System.out.println("\nСамая поздняя книга:");
        System.out.println("  " + shelf.getLatest());

        System.out.println("\nСамая ранняя книга:");
        System.out.println("  " + shelf.getEarliest());

        shelf.sortByYear();
        System.out.println("\nПосле сортировки по году:");
        shelf.printAll();
    }
}