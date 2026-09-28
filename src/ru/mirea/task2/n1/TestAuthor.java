package ru.mirea.task2.n1;

public class TestAuthor {
        public static void main(String[] args) {
            Author author = new Author("Иван Петров", "ivan@mail.ru", 'M');
            System.out.println(author);

            author.setEmail("newmail@mail.ru");
            System.out.println("После смены email:");
            System.out.println("Имя: " + author.getName());
            System.out.println("Email: " + author.getEmail());
            System.out.println("Пол: " + author.getGender());
        }
    }