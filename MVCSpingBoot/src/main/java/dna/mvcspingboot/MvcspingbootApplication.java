package dna.mvcspingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "dna.mvcspingboot.controller")
public class MvcspingbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcspingbootApplication.class, args);
    }

}
