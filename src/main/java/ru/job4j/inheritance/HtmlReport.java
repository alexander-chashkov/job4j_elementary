package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 27/07/2022 - 22:37
 * @project job4j
 */
public class HtmlReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}