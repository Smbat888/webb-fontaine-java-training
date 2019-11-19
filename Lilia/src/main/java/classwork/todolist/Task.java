package classwork.todolist;


import java.time.LocalDate;

public class Task {
    private String name;
    private String description;
    private Priority priority;
    private LocalDate startDate;
    private LocalDate dueDate;
    private Engineer assignee;
    private String label;
    private Status status;

    public Task(String name, String description, Priority priority, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        //default initialization
        this.status = Status.TODO;
        this.startDate = LocalDate.now();
        this.assignee = Unassigned.getInstance();
    }

    public Task(String name, String description, Priority priority, LocalDate startDate,
                LocalDate dueDate, Engineer assignee, String label, Status status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.label = label;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Engineer getAssignee() {
        return assignee;
    }

    public void setAssignee(Engineer assignee) {
        this.assignee = assignee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Name: %s,Description: %s,Priority: %s,startDate: %s,dueDate: %s,engineer: %s,label: %s,status: %s",
                name, description, priority, startDate.toString(), dueDate.toString(), assignee, label, status);
    }
}
