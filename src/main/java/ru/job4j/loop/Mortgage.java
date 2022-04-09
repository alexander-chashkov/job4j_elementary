package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 07/04/2022 - 21:45
 * @project job4j
 */
public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (amount + amount * percent / 100 > salary) {
            year++;
            percent *= year;
            salary *= year;
        }
        return year;
    }
}