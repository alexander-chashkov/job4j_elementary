package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 14/04/2022 - 21:27
 * @project job4j
 */
public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array = SwitchArray.swap(array, i, array.length - i - 1);
        }
        return array;
    }
}