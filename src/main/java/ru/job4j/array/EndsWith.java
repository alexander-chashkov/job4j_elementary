package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 20/04/2022 - 21:58
 * @project job4j
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[(word.length - post.length) + i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
