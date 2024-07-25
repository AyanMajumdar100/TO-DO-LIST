import java.util.Scanner;

public class TaskController {
    private TaskManager taskManager;
    private Scanner scanner;

    public TaskController() {
        this.taskManager = new TaskManager();
        this.scanner = new Scanner(System.in);
    }
    public void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter task category: ");
        String category = scanner.nextLine();
        System.out.print("Enter task time (e.g., 14:00): ");
        String time = scanner.nextLine();
        taskManager.addTask(description, category, time);
    }
    public void markTaskCompleted() {
        System.out.print("Enter task index to mark completed: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        taskManager.markTaskCompleted(index);
    }
    public void viewTasks() {
        taskManager.viewTasks();
    }
    public void viewTasksByCategory() {
        System.out.print("Enter category to filter tasks: ");
        String category = scanner.nextLine();
        taskManager.viewTasksByCategory(category);
    }
}
