package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * @author alex_chashkov
 * @created 20/02/2022 - 21:34
 * @project job4j
 */
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return division(first, second) + difference(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second) + difference(first, second) + division(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperation(10, 20));
    }
}
