import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskController taskController = new TaskController();

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task Completed");
            System.out.println("3. View All Tasks");
            System.out.println("4. View Tasks by Category");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    taskController.addTask();
                    break;
                case 2:
                    taskController.markTaskCompleted();
                    break;
                case 3:
                    taskController.viewTasks();
                    break;
                case 4:
                    taskController.viewTasksByCategory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
