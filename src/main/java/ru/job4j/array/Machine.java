package ru.job4j.array;

import java.util.Arrays;

/**
 * @author alex_chashkov
 * @created 27/04/2022 - 22:06
 * @project job4j
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        int idx = 0;
        while (money > 0) {
            if (money >= coins[idx]) {
                money = money - coins[idx];
                rsl[size] = coins[idx];
                size++;
            } else {
                idx++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
