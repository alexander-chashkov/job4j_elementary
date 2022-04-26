package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 26/04/2022 - 22:06
 * @project job4j
 */
public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 5}, {7, 8, 9}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
