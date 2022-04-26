package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 26/04/2022 - 21:55
 * @project job4j
 */
public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {10, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 6, 10};
        Assert.assertArrayEquals(expected, result);
    }
}