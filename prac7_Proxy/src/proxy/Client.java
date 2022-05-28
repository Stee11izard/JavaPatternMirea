package proxy;

public class Client {
    public Client() {
        Proxy proxy = new Proxy(new Service());
        proxy.operation();
    }
}
