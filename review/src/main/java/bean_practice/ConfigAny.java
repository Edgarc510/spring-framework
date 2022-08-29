package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigAny {

//    @Primary// We have two string methods
    @Bean(name= "message1")
//    @Bean
    public String str() {
        return "Welcome to Java";
    }
    @Bean(name= "message1") //Customized bean
//    @Bean
    public String str2() {
        return "Spring Core Practice";
    }
}
