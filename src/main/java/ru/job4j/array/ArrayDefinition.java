package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 12/04/2022 - 21:25
 * @project job4j
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}
