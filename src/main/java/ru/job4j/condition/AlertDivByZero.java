package ru.job4j.condition;

/**
 * @author alex_chashkov
 * @created 23/02/2022 - 17:31
 * @project job4j
 */
public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }
}
