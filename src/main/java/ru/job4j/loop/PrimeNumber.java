package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 07/04/2022 - 21:43
 * @project job4j
 */
public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
