package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 24/03/2022 - 22:41
 * @project job4j
 */
public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
