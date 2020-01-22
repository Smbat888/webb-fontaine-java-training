package week6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Hmayak Atayan on 20 January, 2020
 */
public class UsersArray {
    public List<User> users = new ArrayList<User>();

    public void setUsers(User user) {
        this.users.add(user);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
