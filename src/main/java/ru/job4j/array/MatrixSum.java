package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 26/04/2022 - 22:39
 * @project job4j
 */
public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl += array[i][j];
            }
        }
        return rsl;
    }
}
