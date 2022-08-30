package ru.job4j.pojo;

/**
 * @author alex_chashkov
 * @created 30/08/2022 - 21:14
 * @project job4j
 */
public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index >= 0 && index < products.length) {
            Product[] productsNew = new Product[products.length];
            int idx = 0;
            for (int i = 0; i < products.length; i++) {
                if (i != index) {
                    productsNew[idx] = products[i];
                    idx++;
                }
            }
            productsNew[products.length - 1] = null;
            return productsNew;
        }
        return products;
    }
}
