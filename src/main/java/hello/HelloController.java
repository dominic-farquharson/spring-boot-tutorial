package hello;

// import pckages
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("request received");
        return "Greetings from Spring Boot";
    }
}

