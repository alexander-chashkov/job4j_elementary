package ru.job4j.tracker;

/**
 * @author alex_chashkov
 * @created 07/09/2022 - 20:55
 * @project job4j
 * fix
 */

import java.util.Scanner;

public class StartUI {
    private Scanner scanner;
    private Tracker tracker;

    public void init(Scanner scanner, Tracker tracker) {
        this.scanner = scanner;
        this.tracker = tracker;
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                addItem();
            } else if (select == 1) {
                showAllItems();
            } else if (select == 2) {
                editItem();
            } else if (select == 3) {
                deleteItem();
            } else if (select == 4) {
                findItemById();
            } else if (select == 5) {
                findItemByName();
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void addItem() {
        System.out.println("=== Create a new Item ===");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private void showAllItems() {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    private void editItem() {
        System.out.println("=== Edit item ===");
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    private void deleteItem() {
        System.out.println("=== Delete item ===");
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    private void findItemById() {
        System.out.println("=== Find item by id ===");
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    private void findItemByName() {
        System.out.println("=== Find items by name ===");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        new StartUI().init(new Scanner(System.in), new Tracker());
    }
}

