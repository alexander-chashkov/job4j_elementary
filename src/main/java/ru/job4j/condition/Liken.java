package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 23/02/2022 - 17:28
 * @project job4j
 */
public class Liken {

    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }
}
