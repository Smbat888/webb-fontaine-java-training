package classworkpackage.todolist;

public class Engineer {
    protected String name;
    private Role role;


    public Engineer(){
    }

    public Engineer(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("name: %s, role: %s", name, role );
    }
}
