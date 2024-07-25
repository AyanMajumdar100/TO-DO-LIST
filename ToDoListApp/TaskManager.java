import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, String category, String time) {
        tasks.add(new Task(description, category, time));
    }
    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
        } else {
            System.out.println("Invalid task index.");
        }
    }
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }
    public void viewTasksByCategory(String category) {
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getCategory().equalsIgnoreCase(category)) {
                System.out.println(i + ": " + task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found in this category.");
        }
    }
}
