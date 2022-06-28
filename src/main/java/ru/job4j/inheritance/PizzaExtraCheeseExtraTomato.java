package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 28/06/2022 - 21:52
 * @project job4j
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + ", tomato";
    }
}
