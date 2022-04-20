package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 20/04/2022 - 21:39
 * @project job4j
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
