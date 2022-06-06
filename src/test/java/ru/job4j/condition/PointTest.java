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
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = Point.distance(p1, p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 5);
        double out = Point.distance(p1, p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus10to20then7dot81() {
        double expected = 7.81;
        Point p1 = new Point(-1, 0);
        Point p2 = new Point(5, 5);
        double out = Point.distance(p1, p2);
        Assert.assertEquals(expected, out, 0.01);
    }
}