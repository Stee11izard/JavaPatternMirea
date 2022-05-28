package strategy;

public class Student {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void runActivity() {
        this.activity.studentAction();
    }
}
