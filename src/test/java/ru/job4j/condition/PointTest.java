package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 23/02/2022 - 16:51
 * @project job4j
 */
public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus10to20then7dot() {
        double expected = 7.81;
        int x1 = -1;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}