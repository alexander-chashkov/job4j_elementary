package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 29/03/2022 - 21:06
 * @project job4j
 */
public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}