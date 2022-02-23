package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 23/02/2022 - 16:41
 * @project job4j
 */
public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}