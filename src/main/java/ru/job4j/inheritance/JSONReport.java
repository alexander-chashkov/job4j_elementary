package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 28/06/2022 - 21:21
 * @project job4j
 */
public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "\t\"name\" : \"" + name + "\"," + System.lineSeparator() + "\t\"body\" : \"" + body + "\"" + System.lineSeparator() + "}";
    }
}
