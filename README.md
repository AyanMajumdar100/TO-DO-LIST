# To-Do List Application

A simple console-based Java application for managing tasks. This project demonstrates basic Java programming concepts and provides a practical tool for organizing and tracking tasks with features such as task description, category, and time.

## Tech Stack

- **Java:** Core programming language used to build the application.

## Project Structure

The project consists of the following main files:

- **`Task.java`**: Defines the `Task` class with properties like description, completion status, category, and time.
- **`TaskManager.java`**: Manages a list of tasks, including methods for adding, completing, and viewing tasks.
- **`TaskController.java`**: Handles user input from the console and interacts with `TaskManager`.
- **`ToDoListApp.java`**: The main class that runs the application, providing a menu-driven interface for user interaction.

## Run Locally

To run the application locally, follow these steps:

1. Ensure you have Java installed on your system.
2. Clone the repository and navigate to the project directory.

    ```bash
    git clone <repository-url>
    cd <project-directory>
    ```

3. Compile and run the application:

    ```bash
    javac *.java
    java ToDoListApp
    ```

## Usage

Upon running the application, you will see a menu with options to:

- Add a new task
- Mark a task as completed
- View all tasks
- View tasks by category

Follow the prompts to interact with the application and manage your tasks.

## Future Scope

- **Graphical User Interface (GUI):** Implement a GUI using Java Swing or JavaFX for a more user-friendly experience.
- **Task Prioritization:** Add priority levels for tasks to better manage and sort them.
- **Due Dates and Reminders:** Incorporate due dates and reminders for tasks.
- **Data Persistence:** Implement data saving to retain tasks between application sessions.
- **Advanced Search and Filter:** Add more sophisticated search and filter options for tasks.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## References

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Effective Java by Joshua Bloch](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997)
- [Java: The Complete Reference by Herbert Schildt](https://www.amazon.com/Java-Complete-Reference-Eleven-Standards/dp/1260440230)

---

Feel free to customize the repository URL and any other specifics to fit your project.
