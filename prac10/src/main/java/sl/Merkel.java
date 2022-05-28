package sl;
import org.springframework.stereotype.Component;
@Component
public class Merkel implements Politician {
    @Override
    public void doPolitic() {
        System.out.println("Merkel: The middle is to the right from the left.");
    }
}
