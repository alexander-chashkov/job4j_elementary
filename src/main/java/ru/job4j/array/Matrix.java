package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 27/04/2022 - 21:32
 * @project job4j
 */
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = (i + 1) * (j + 1);
            }
        }
        return res;
    }
}
