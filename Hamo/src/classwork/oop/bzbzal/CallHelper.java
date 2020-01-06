package classwork.oop.bzbzal;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class CallHelper {

    private Call call;

    public void setCall(Call call) {
        this.call = call;
    }

    public void goThrough(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
            if (names[i] == null) {
                call.onNullItem(names[i]);
            } else if (names[i].isEmpty()) {
                call.onIsEmpty(i);
            }
        }
        call.onComplete();
    }
}
