package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 20/02/2022 - 17:46
 * @project job4j
 */
public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 45, k = 1, s = 1, real = " + result1);
    }
}