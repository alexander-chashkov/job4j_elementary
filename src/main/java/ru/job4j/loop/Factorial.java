package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 05/04/2022 - 21:32
 * @project job4j
 */

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}