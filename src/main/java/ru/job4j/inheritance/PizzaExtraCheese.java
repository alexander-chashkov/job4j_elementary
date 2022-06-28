package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 28/06/2022 - 21:52
 * @project job4j
 */
public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return super.name() + " with cheese";
    }
}
