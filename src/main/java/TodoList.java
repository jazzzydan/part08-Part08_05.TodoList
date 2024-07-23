import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> tasks;
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        if (number > 0 && number <= tasks.size()) {
            tasks.remove(number - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
