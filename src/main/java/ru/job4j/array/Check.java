package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 14/04/2022 - 21:33
 * @project job4j
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
