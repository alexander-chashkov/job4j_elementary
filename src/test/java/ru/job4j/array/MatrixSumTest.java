package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 26/04/2022 - 22:41
 * @project job4j
 */
public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}