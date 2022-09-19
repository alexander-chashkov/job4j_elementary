package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            int idx = indexOf(new String[] {"Test", "Super"}, "key");
        } catch (ElementNotFoundException e) {
            System.out.println("Ошибка. Нет элемента с таким ключом.");
        }
    }
}
