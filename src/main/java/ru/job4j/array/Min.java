package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 26/04/2022 - 21:41
 * @project job4j
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
