package ru.job4j.loop;

/**
 * @author alex_chashkov
 * @created 05/04/2022 - 21:41
 * @project job4j
 */
public class Board {
    public static void paint(int width, int height) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
