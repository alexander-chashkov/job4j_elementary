package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 14/04/2022 - 22:14
 * @project job4j
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
