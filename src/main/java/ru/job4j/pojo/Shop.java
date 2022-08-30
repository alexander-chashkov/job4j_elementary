package ru.job4j.pojo;

/**
 * @author alex_chashkov
 * @created 30/08/2022 - 21:05
 * @project job4j
 */
public class Shop {
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
