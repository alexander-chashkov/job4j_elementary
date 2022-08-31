package ru.job4j.pojo;

/**
 * @author alex_chashkov
 * @created 29/08/2022 - 21:45
 * @project job4j
 */
public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Вечера на хуторе близ Диканьки", 220);
        books[1] = new Book("Водители фрегатов", 250);
        books[2] = new Book("Идиот", 765);
        books[3] = new Book("Clean code", 22);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + "| страниц: " + books[i].getCountPage());
        }
        Book b = books[0];
        books[0] = books[3];
        books[3] = b;
        b = books[0];
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + "| страниц: " + books[i].getCountPage());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(b.getName())) {
                System.out.println(books[i].getName() + "| страниц: " + books[i].getCountPage());
            }
        }
    }
}
