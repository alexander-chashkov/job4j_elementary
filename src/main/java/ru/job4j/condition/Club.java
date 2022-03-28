package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 28/03/2022 - 18:16
 * @project job4j
 */
public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
