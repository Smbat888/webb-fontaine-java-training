package getjsonfromtheinternet;


public class User {

    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;

    @Override
    public String toString() {
        return String.format("userID: %d , Id: %d , title: %s , completed: %s", userId, id, title, completed);
    }
}
