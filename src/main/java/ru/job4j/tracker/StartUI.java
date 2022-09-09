package ru.job4j.tracker;

/**
 * @author alex_chashkov
 * @created 07/09/2022 - 20:55
 * @project job4j
 * fix
 */

public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        UserAction[] actions = {
                new CreateAction(), new ShowAllAction(), new EditAction(), new DeleteAction(), new FindByIdAction(),
                new FindByNameAction(), new ExitAction()
        };
        new StartUI().init(new ConsoleInput(), new Tracker(), actions);
    }
}

