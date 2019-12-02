import java.time.LocalDate;

public class Task_1 {
    private String name;
    private String description;
    private Priority_2 priority;
    private LocalDate startDate;
    private LocalDate dueDate;
    private Engineer_4 assignee;
    private String label;
    private Status_3 status;
    public Task_1(String name, String description, Priority_2 priority,
                  LocalDate startDate, LocalDate dueDate,
                  Engineer_4 assignee, String label, Status_3 status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.label = label;
        this.status = status;
    }
    public Task_1(String name, String description, Priority_2 priority, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        //Default initialization
        this.status=Status_3.TODO;
        this.startDate=LocalDate.now();
        this.assignee=Unassigned_7.getInstance();
    }
    //getters and setters
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
    public Priority_2 getPriority() {
        return priority;
    }
    public void setPriority(Priority_2 priority) {
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
    public Engineer_4 getAssignee() {
        return assignee;
    }
    public void setAssignee(Engineer_4 assignee) {
        this.assignee = assignee;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public Status_3 getStatus() {
        return status;
    }
    public void setStatus(Status_3 status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return String.format("Name: %s,Description: %s,Priority: %s,startDate: %s,dueDate: %s,engineer: %s,label: %s,status: %s",
                name,description,priority,startDate.toString(),dueDate.toString(),assignee,label,status);
    }
}