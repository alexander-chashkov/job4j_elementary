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

    public static int max(int one, int two, int three) {
        int result = max(one, max(two, three));
        return result;
    }

    public static int max(int one, int two, int three, int four) {
        int result = max(one, two, max(three, four));
        return result;
    }
}
