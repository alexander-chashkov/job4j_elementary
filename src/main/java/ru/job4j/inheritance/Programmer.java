package ru.job4j.inheritance;

/**
 * @author alex_chashkov
 * @created 28/06/2022 - 21:14
 * @project job4j
 */
public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int experience, boolean degree) {
        super(experience, degree);
        this.programLang = programLang;
    }
}
