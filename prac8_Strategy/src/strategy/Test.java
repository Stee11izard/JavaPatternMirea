package strategy;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setActivity(new Eating());
        student.runActivity();

        student.setActivity(new Studying());
        student.runActivity();

        student.setActivity(new Sleeping());
        student.runActivity();
    }
}
