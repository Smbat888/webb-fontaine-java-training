package week6;


public class User {

    public Integer userId;
    public Integer id;
    public String title;
    public Boolean completed;

    public User() {
    }

    public User(Integer userId, Integer id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }


    @Override
    public String toString() {
        return String.format("user: %d , id: %d , title: %s , completed: %s", userId, id, title, completed);
    }
}
