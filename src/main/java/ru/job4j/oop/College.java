package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student st = new Freshman("Alex");
        Object obj = st;
        System.out.println(obj);
    }
}
