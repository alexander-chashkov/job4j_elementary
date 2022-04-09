package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 07/04/2022 - 21:45
 * @project job4j
 */
public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double duty;
        do  {
            year++;
            percent *= year;
            salary *= year;
            duty = amount + amount * percent / 100;
        } while (duty > salary);
        return year;
    }
}
