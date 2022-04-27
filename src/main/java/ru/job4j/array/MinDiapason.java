package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 26/04/2022 - 21:44
 * @project job4j
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
