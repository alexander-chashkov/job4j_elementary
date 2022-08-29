package ru.job4j.pojo;

/**
 * @author alex_chashkov
 * @created 29/08/2022 - 21:45
 * @project job4j
 */
public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book b = new Book();
        b.setName("Вечера на хуторе близ Диканьки");
        b.setCountPage(220);
        books[0] = b;
        b = new Book();
        b.setName("Водителе фрегатов");
        b.setCountPage(250);
        books[1] = b;
        b = new Book();
        b.setName("Идиот");
        b.setCountPage(765);
        books[2] = b;
        b = new Book();
        b.setName("Clean code");
        b.setCountPage(22);
        books[3] = b;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + "| страниц: " + books[i].getCountPage());
        }
        b = books[0];
        books[0] = books[3];
        books[3] = b;
        b = books[0];
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + "| страниц: " + books[i].getCountPage());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(b))
                System.out.println(books[i].getName() + "| страниц: " + books[i].getCountPage());
        }
    }
}
