package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 07/04/2022 - 21:09
 * @project job4j
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = ivan > nik ? 0 : 1;
        while (ivan * 3 < nik * 2) {
            ivan *= 3;
            month++;
        }
        return month;
    }
}