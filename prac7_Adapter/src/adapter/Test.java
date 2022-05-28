package adapter;

public class Test {
    public static void main(String[] args) {
        Converter concrete = new ConcreteConverter();
        Converter adapter = new Adapter();

        System.out.println(concrete.reverse("1234567890"));
        System.out.println(adapter.reverse("1234567890"));
    }
}
