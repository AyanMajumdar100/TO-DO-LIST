public class Task {
    private String description;
    private boolean isCompleted;
    private String category;
    private String time;

    public Task(String description, String category, String time) {
        this.description = description;
        this.isCompleted = false;
        this.category = category;
        this.time = time;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public String getCategory() {
        return category;
    }
    public String getTime() {
        return time;
    }
    public void markCompleted() {
        this.isCompleted = true;
    }
    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description + " (" + category + ") at " + time;
    }
}