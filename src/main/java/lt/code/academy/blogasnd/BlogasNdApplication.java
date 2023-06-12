package lt.code.academy.blogasnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class BlogasNdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogasNdApplication.class, args);
    }

}
