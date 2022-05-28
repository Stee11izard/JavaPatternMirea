package sl;
import org.springframework.stereotype.Component;
@Component

public class Trump implements Politician {
    @Override
    public void doPolitic() {
        System.out.println("Trump: I am building a wall!");
    }
}
