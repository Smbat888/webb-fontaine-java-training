package classwork.networking;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class User {

    public Integer userId;
    public Integer id;
    public String title;
    public Boolean completed;

    @Override
    public String toString() {
        return String.format("user: %d , id: %d , title: %s , completed: %s", userId, id, title, completed);
    }
}
