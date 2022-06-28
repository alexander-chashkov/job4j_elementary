package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 28/06/2022 - 21:21
 * @project job4j
 */
public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
