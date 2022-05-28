package proxy;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println( this.getClass().getSimpleName() + ": Welcome!");
    }
}
