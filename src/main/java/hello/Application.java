package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Value( "${hello.message:Hello undefined}")
    private String helloMessage;

    @RequestMapping(value="/", produces = "text/html")
    public String home() {
        return helloMessage;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
