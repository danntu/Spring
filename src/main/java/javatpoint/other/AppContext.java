package javatpoint.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public Student student(){
        Student student = new Student();

        return student;
    }
}
