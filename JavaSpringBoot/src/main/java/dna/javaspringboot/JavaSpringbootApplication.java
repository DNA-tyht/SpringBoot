package dna.javaspringboot;

import dna.javaspringboot.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaSpringbootApplication implements CommandLineRunner {

    private final StudentService studentService;
    public JavaSpringbootApplication(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        /*
          SpringBoot程序启动后，返回值是ConfigurableApplicationContext，它也是一个Spring容器对象
          它其它相当于原来Spring中启动容器ClassPathXmlApplicationContext
        */
        //获取SpringBoot容器
        ConfigurableApplicationContext context =  SpringApplication.run(JavaSpringbootApplication.class, args);
        //从容器中获取指定的bean对象
        StudentService studentService = (StudentService) context.getBean("StudentServiceImpl");
        //调用业务方法
        System.out.println(studentService.sayHello());
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(studentService.sayHello());
    }
}
