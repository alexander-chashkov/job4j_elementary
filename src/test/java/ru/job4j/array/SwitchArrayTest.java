package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 14/04/2022 - 21:21
 * @project job4j
 */
public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to7() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7};
        int source = 3;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 2, 7, 4, 5, 6, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }
}