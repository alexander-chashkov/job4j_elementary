package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 28/06/2022 - 21:14
 * @project job4j
 */
public class Engineer extends Profession {
    private int experience;

    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
