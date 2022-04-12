package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 12/04/2022 - 22:49
 * @project job4j
 */
public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot12ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 12;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}