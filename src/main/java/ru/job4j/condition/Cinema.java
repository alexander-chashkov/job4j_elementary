package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 21/03/2022 - 21:35
 * @project job4j
 */
public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);

    }
}