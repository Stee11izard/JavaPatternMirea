package sl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanConfig {
@Bean
    public Politician a(){
        return new Trump();
    }
    @Bean
    public Politician b(){
        return new Biden();
    }
    @Bean
    public Politician c(){
        return new Merkel();
    }
}
