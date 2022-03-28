package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 28/03/2022 - 18:32
 * @project job4j
 */
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
