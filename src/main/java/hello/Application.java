package hello;

// import packages
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // annotation (metadata)
class Application {
    // entry point
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // launch app
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        // runs on startup. print out beans created/retrieved by app
        return args -> {
            System.out.println("=========");
           System.out.println("Let's inspect the Beans provided by Spring Boot");
           String[] beanNames = ctx.getBeanDefinitionNames();
           Arrays.sort(beanNames);
           for (String beanName : beanNames) {
               System.out.println(beanName);
           }
           System.out.println("=============");
        };
    }
}