package Java.Week4.ToDoList;

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




    public Task(String name, String description, Priority priority, LocalDate startDate, LocalDate dueDate,
                Engineer assignee, String label, Status status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.label = label;
        this.status = status;
    }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Engineer getAssignee() {
        return assignee;
    }

    public void setAssignee(Engineer assignee) {
        this.assignee = assignee;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return String.format("name;%s, dec: $%s, priority: %s, startDate:%s, dueDate:%s, engineer:%s, label:%s, status:%s",
                name, description, priority, startDate.toString(), dueDate.toString(), assignee, label, status);
    }
}
