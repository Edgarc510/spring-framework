package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee(); //returns this fulltime object
}
    @Bean
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }

}
