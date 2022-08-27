package ru.job4j.encapsulation;

/**
 * @author alex_chashkov
 * @created 27/08/2022 - 12:35
 * @project job4j
 */
public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    public String search(String key) {
        return key;
    }
}