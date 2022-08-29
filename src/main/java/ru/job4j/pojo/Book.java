package ru.job4j.pojo;

import java.util.Objects;

/**
 * @author alex_chashkov
 * @created 29/08/2022 - 21:44
 * @project job4j
 */
public class Book {
    private String name;
    private int countPage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countPage == book.countPage && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countPage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }
}
