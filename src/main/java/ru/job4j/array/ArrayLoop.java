package ru.job4j.array;

/**
 * @author alex_chashkov
 * @created 12/04/2022 - 21:42
 * @project job4j
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int numb : numbers) {
            System.out.println(numb);
        }
    }
}
