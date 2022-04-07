package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 07/04/2022 - 21:33
 * @project job4j
 */
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}