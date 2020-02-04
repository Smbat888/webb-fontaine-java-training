public class Engineer_4 {
    protected String name;
    private Role_5 role;
    public Engineer_4(String name, Role_5 role) {  //code generate constructor
        this.name = name;
        this.role = role;
    }
    public Engineer_4(){   //new engineer sarqelu hamar, chpartadri argument
    }
    //getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Role_5 getRole() {
        return role;
    }
    public void setRole(Role_5 role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return String.format("Name: %s,Role: %s", name, role);
    }
}
