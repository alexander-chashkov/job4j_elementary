package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 1 :
                System.out.print("Да");
                break;
            case 2 :
                System.out.print("Нет");
                break;
            default :
                System.out.print("Может быть");

        }
    }
}
