package classwork.todolist;

public class Engineer {
    protected String name;
    private Role role;

    public Engineer(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public Engineer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("Name: %s,Role: %s", name, role);
    }
}

