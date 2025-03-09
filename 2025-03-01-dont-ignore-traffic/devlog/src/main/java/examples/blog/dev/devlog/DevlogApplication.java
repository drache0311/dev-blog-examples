package examples.blog.dev.devlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class DevlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevlogApplication.class, args);
    }

}
