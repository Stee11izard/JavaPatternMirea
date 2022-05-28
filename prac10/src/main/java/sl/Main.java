package sl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Politician politician = context.getBean(Biden.class);
        politician.doPolitic();

        politician = context.getBean(Merkel.class);
        politician.doPolitic();

        politician = context.getBean(Trump.class);
        politician.doPolitic();
    }
}