package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 24/03/2022 - 22:42
 * @project job4j
 */
public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5to5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To3Then8() {
        int left = 8;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}