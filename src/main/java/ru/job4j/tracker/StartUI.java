package ru.job4j.tracker;

/**
 * @author alex_chashkov
 * @created 07/09/2022 - 20:55
 * @project job4j
 * fix
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

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
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        UserAction[] actions = {
                new CreateAction(out), new ShowAllAction(out), new EditAction(out), new DeleteAction(out), new FindByIdAction(out),
                new FindByNameAction(out), new ExitAction(out)
        };
        new StartUI(out).init(new ValidateInput(actions.length), new Tracker(), actions);
    }
}

