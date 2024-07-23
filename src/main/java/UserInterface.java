import java.util.Scanner;

public class UserInterface {
    private final TodoList list;
    private final Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "stop":
                    return;
                case "add":
                    addTask();
                    break;
                case "list":
                    printTasks();
                    break;
                case "remove":
                    removeTask();
                    break;
                default:
                    System.out.print("Unknown command");
                    break;
            }
        }
    }

    private void addTask() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }

    private void printTasks() {
        list.print();
    }

    private void removeTask() {
        System.out.print("Which one is removed? ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            list.remove(index);
        } catch (NumberFormatException e) {
            System.out.print("Invalid number");
        }
    }
}
