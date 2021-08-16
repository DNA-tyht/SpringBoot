package dna.mvcspingboot.config;

import dna.mvcspingboot.controller.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/16 21:40
 */
@Configuration
public class ServletConfig {

    //方法级别的注解，主要用在配置类中
    @Bean //相当于一个<beans></beans>
    public ServletRegistrationBean<MyServlet> myServletRegistrationBean() {
        return new ServletRegistrationBean<>(new MyServlet());
    }
}
