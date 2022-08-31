package ru.job4j.pojo;

/**
 * @author alex_chashkov
 * @created 30/08/2022 - 21:14
 * @project job4j
 */
public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
