package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 24/03/2022 - 22:41
 * @project job4j
 */
public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return  max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, two, max(three, four));
    }
}
