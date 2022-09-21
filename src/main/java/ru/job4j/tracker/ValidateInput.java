package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    private int lengthAction;

    public ValidateInput(int lengthAction) {
        this.lengthAction = lengthAction;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                if (value < 0 || value >= lengthAction) {
                    System.out.println("Wrong input, you can select: 0 .. " + (lengthAction - 1));
                } else {
                    invalid = false;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
