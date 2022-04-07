package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author alex_chashkov
 * @created 07/04/2022 - 21:14
 * @project job4j
 */
public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}